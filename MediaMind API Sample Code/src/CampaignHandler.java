import java.rmi.RemoteException;
import api.eyeblaster.com.Campaign.CampaignServiceStub;
import api.eyeblaster.com.V1.DataContracts.Advertiser.AdvertiserInfo;
import api.eyeblaster.com.V1.DataContracts.Advertiser.BrandInfo;
import api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfCampaignServiceFilter;
import api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo;
import api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfCreativeShopInfo;
import api.eyeblaster.com.V1.DataContracts.Campaign.CampaignInfo;
import api.eyeblaster.com.V1.DataContracts.Campaign.CampaignNameFilter;
import api.eyeblaster.com.V1.DataContracts.Campaign.ContactInfo;
import api.eyeblaster.com.V1.DataContracts.Campaign.CreativeShopInfo;
import api.eyeblaster.com.message.Campaign.CreateCampaignRequest;
import api.eyeblaster.com.message.Campaign.CreateCampaignResponse;
import api.eyeblaster.com.message.Campaign.GetAgencyContactsRequest;
import api.eyeblaster.com.message.Campaign.GetAgencyContactsResponse;
import api.eyeblaster.com.message.Campaign.GetCampaignsRequest;
import api.eyeblaster.com.message.Campaign.GetCampaignsResponse;
import api.eyeblaster.com.message.Campaign.GetCreativeShopsRequest;
import api.eyeblaster.com.message.Campaign.GetCreativeShopsResponse;
import api.eyeblaster.com.message.Campaign.GetSiteContactsRequest;
import api.eyeblaster.com.message.Campaign.GetSiteContactsResponse;
import api.eyeblaster.com.message.Campaign.ListPaging;
import api.eyeblaster.com.message.Campaign.UpdateCampaignRequest;
import api.eyeblaster.com.message.Campaign.UserSecurityToken;




public class CampaignHandler {

	/**
	 * @param args
	 */
	UserSecurityToken securityToken;
	CampaignServiceStub campaignServiceStub;
	AdvertiserHandler advertiserHandler;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public CampaignHandler(String tokenString) throws RemoteException
	{
		campaignServiceStub = new CampaignServiceStub();
		advertiserHandler = new AdvertiserHandler(tokenString);
		securityToken = new UserSecurityToken();
		securityToken.setUserSecurityToken(tokenString);
	}
	
	public CampaignInfo CreateCampaign(AdvertiserInfo advertiser) throws RemoteException
	{
		CreateCampaignRequest createCampaignRequest = new CreateCampaignRequest();
		
		// create campaign
		CampaignInfo campaignInfo = new CampaignInfo();
		
		// set campaign properties
		campaignInfo.setName(Helper.CreateUniqueName("Campaign"));
		campaignInfo.setAgencyID(Helper.agencyID);
		campaignInfo.setAdvertiserID(advertiser.getID());

		// get brands
		BrandInfo[] brands = advertiserHandler.GetBrandsByAdvertiser(advertiser);
		
		campaignInfo.setBrandID(brands[0].getID());

		// get campaign contact
		GetAgencyContactsRequest getAgencyContactsRequest = new GetAgencyContactsRequest();
		getAgencyContactsRequest.setAgencyID(Helper.agencyID);
		GetAgencyContactsResponse getAgencyContactsResponse = campaignServiceStub.GetAgencyContacts(getAgencyContactsRequest, securityToken);

		// declare a contact info array
		ContactInfo[] contacts = getAgencyContactsResponse.getContacts().getContactInfo();
		// set the contact as the campaign agency contacts
		
		ArrayOfContactInfo arrayOfContactInfo = new ArrayOfContactInfo();
		arrayOfContactInfo.addContactInfo(contacts[0]);

		campaignInfo.setAgencyMediaPlannerContacts(arrayOfContactInfo);
		campaignInfo.setAgencyMediaTraffickerContacts(arrayOfContactInfo);
		campaignInfo.setAgencySearchContacts(arrayOfContactInfo);
	
		// get creative shops
		GetCreativeShopsRequest getCreativeShopsRequest = new GetCreativeShopsRequest();		
		ListPaging paging = GetListPaging();
		getCreativeShopsRequest.setPaging(paging );
		GetCreativeShopsResponse getCreativeShopsResponse = campaignServiceStub.GetCreativeShops(getCreativeShopsRequest, securityToken);
		api.eyeblaster.com.V1.DataContracts.Campaign.BasicInfo basicInfo = getCreativeShopsResponse.getCreativeShops().getBasicInfo()[0];

		// create a creativeshop
		CreativeShopInfo creativeShopInfo = new CreativeShopInfo();
		creativeShopInfo.setCreativeShopID(basicInfo.getID());

		// create a creativeshops array
		ArrayOfCreativeShopInfo arrayOfCreativeShopInfo = new ArrayOfCreativeShopInfo();
		arrayOfCreativeShopInfo.addCreativeShopInfo(creativeShopInfo);

		// set the campaign creative shop
		campaignInfo.setCreativeShops(arrayOfCreativeShopInfo);

		createCampaignRequest.setCampaign(campaignInfo);
		CreateCampaignResponse createCampaignResponse = campaignServiceStub.CreateCampaign(createCampaignRequest, securityToken);

		return createCampaignResponse.getCampaign();
	}
	
	public CampaignInfo GetCampaignByName(String Name) throws RemoteException
	{
		GetCampaignsRequest getCampaignsRequest = new GetCampaignsRequest();
		ArrayOfCampaignServiceFilter arrCampaignFilter = new ArrayOfCampaignServiceFilter();
		CampaignNameFilter campaignNameFilter = new CampaignNameFilter();
		campaignNameFilter.setCampaignName(Name);
		arrCampaignFilter.addCampaignServiceFilter(campaignNameFilter);
		getCampaignsRequest.setPaging(GetListPaging());
		getCampaignsRequest.setCampaignsFilter(arrCampaignFilter);
		
		GetCampaignsResponse getCampaignsResponse = campaignServiceStub.GetCampaigns(getCampaignsRequest, securityToken);
		return getCampaignsResponse.getCampaigns().getCampaignInfo()[0];
	}
	
	public void UpdateCampaignContacts(CampaignInfo campaign) throws RemoteException
	{
		// get the site contacts
		GetSiteContactsRequest getSiteContactsRequest = new GetSiteContactsRequest();
		getSiteContactsRequest.setSiteID(2);
		GetSiteContactsResponse getSiteContactsResponse = campaignServiceStub.GetSiteContacts(getSiteContactsRequest , securityToken);
		ContactInfo[] contacts = getSiteContactsResponse.getContacts().getContactInfo();

		// declare a contact info array
		ArrayOfContactInfo arrayOfContactInfo = new ArrayOfContactInfo();
		arrayOfContactInfo.addContactInfo(contacts[0]);

		// set as the campaign contacts
		campaign.setSiteBillingContacts(arrayOfContactInfo);
		campaign.setSiteSalesContacts(arrayOfContactInfo);
		campaign.setSiteTraffickerAdOpContacts(arrayOfContactInfo);
		
		// update the campaign
		UpdateCampaignRequest updateCampaignRequest = new UpdateCampaignRequest();
		updateCampaignRequest.setCampaign(campaign);
		campaignServiceStub.UpdateCampaign(updateCampaignRequest, securityToken);
	}
	
	public int GetContactUserID(CampaignInfo campaign) throws RemoteException
	{
		GetSiteContactsRequest getSiteContactsRequest = new GetSiteContactsRequest();
		getSiteContactsRequest.setSiteID(2);
		
		GetSiteContactsResponse getSiteContactsResponse = campaignServiceStub.GetSiteContacts(getSiteContactsRequest , securityToken);
		return getSiteContactsResponse.getContacts().getContactInfo()[0].getContactID();
	}

	private ListPaging GetListPaging()
	{
		ListPaging paging = new ListPaging();
		paging.setPageIndex(0);
		paging.setPageSize(50);

		return paging;
	}
}
