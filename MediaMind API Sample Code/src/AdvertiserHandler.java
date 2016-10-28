import java.rmi.RemoteException;

import org.apache.axis2.databinding.types.UnsignedInt;

import api.eyeblaster.com.Advertiser.AdvertiserServiceStub;
import api.eyeblaster.com.V1.DataContracts.Advertiser.AdvertiserInfo;
import api.eyeblaster.com.V1.DataContracts.Advertiser.AdvertiserNameFilter;
import api.eyeblaster.com.V1.DataContracts.Advertiser.AdvertiserPageTypes;
import api.eyeblaster.com.V1.DataContracts.Advertiser.ArrayOfAdvertiserServiceFilter;
import api.eyeblaster.com.V1.DataContracts.Advertiser.BrandInfo;
import api.eyeblaster.com.V1.DataContracts.Advertiser.ConversionTagInfo;
import api.eyeblaster.com.V1.DataContracts.Advertiser.ConversionTagStatuses;
import api.eyeblaster.com.V1.DataContracts.Advertiser.ConversionTagTypes;
import api.eyeblaster.com.V1.DataContracts.Advertiser.CounterTypes;
import api.eyeblaster.com.V1.DataContracts.Advertiser.SalesConversionTagInfo;
import api.eyeblaster.com.V1.DataContracts.Advertiser.SendAlertTimeRanges;
import api.eyeblaster.com.V1.DataContracts.Advertiser.ServerProtocols;
import api.eyeblaster.com.V1.DataContracts.Advertiser.Verticals;
import api.eyeblaster.com.message.Advertiser.CreateAdvertiserRequest;
import api.eyeblaster.com.message.Advertiser.CreateAdvertiserResponse;
import api.eyeblaster.com.message.Advertiser.CreateBrandRequest;
import api.eyeblaster.com.message.Advertiser.CreateBrandResponse;
import api.eyeblaster.com.message.Advertiser.CreateConversionTagRequest;
import api.eyeblaster.com.message.Advertiser.CreateConversionTagResponse;
import api.eyeblaster.com.message.Advertiser.GetAdvertisersRequest;
import api.eyeblaster.com.message.Advertiser.GetAdvertisersResponse;
import api.eyeblaster.com.message.Advertiser.GetBrandsRequest;
import api.eyeblaster.com.message.Advertiser.GetBrandsResponse;
import api.eyeblaster.com.message.Advertiser.GetConversionTagsRequest;
import api.eyeblaster.com.message.Advertiser.GetConversionTagsResponse;
import api.eyeblaster.com.message.Advertiser.ListPaging;
import api.eyeblaster.com.message.Advertiser.UserSecurityToken;

public class AdvertiserHandler {

	/**
	 * @param args
	 */
	UserSecurityToken securityToken;
	AdvertiserServiceStub advertiserServiceStub;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public AdvertiserHandler(String tokenString) throws RemoteException
	{
		advertiserServiceStub = new AdvertiserServiceStub();
		securityToken = new UserSecurityToken();
		securityToken.setUserSecurityToken(tokenString);
	}
	
	public AdvertiserInfo GetAdvertiserByName(String Name) throws RemoteException
	{		
		GetAdvertisersRequest getAdvertisersRequest = new GetAdvertisersRequest();
		ArrayOfAdvertiserServiceFilter arrAdvertiserFilter = new ArrayOfAdvertiserServiceFilter();
		AdvertiserNameFilter advertiserNameFilter = new AdvertiserNameFilter();
		advertiserNameFilter.setAdvertiserName(Name);
		arrAdvertiserFilter.addAdvertiserServiceFilter(advertiserNameFilter);
		getAdvertisersRequest.setAdvertisersFilter(arrAdvertiserFilter);
		ListPaging paging = GetListPaging();
		getAdvertisersRequest.setPaging(paging);
		GetAdvertisersResponse getAdvertisersResponse = advertiserServiceStub.GetAdvertisers(getAdvertisersRequest, securityToken);
		return getAdvertisersResponse.getAdvertisers().getAdvertiserInfo()[0];		
	}
	
	public BrandInfo[] GetBrandsByAdvertiser(AdvertiserInfo advertiser) throws RemoteException
	{
		GetBrandsRequest getBrandsRequest = new GetBrandsRequest();
		getBrandsRequest.setAdvertiserID(advertiser.getID());
		GetBrandsResponse getBrandsResponse = advertiserServiceStub.GetBrands(getBrandsRequest, securityToken);
		return getBrandsResponse.getBrands().getBrandInfo();				
	}
	
	public AdvertiserInfo CreateAdvertiser() throws RemoteException
	{
		CreateAdvertiserRequest createAdvertiserRequest = new CreateAdvertiserRequest();
		
		// Create advertiser
		AdvertiserInfo advertiserInfo = new AdvertiserInfo();
		
		// Set advertiser name
		advertiserInfo.setAdvertiserName(Helper.CreateUniqueName("Advertiser"));
		
		// Set verticals
		advertiserInfo.setVertical(Verticals.B2B);

		createAdvertiserRequest.setAdvertiser(advertiserInfo);
		CreateAdvertiserResponse createAdvertiserResponse = advertiserServiceStub.CreateAdvertiser(createAdvertiserRequest, securityToken);
		return createAdvertiserResponse.getAdvertiser();
	}
	
	public BrandInfo CreateBrand(int advertiserId) throws RemoteException
	{
		CreateBrandRequest createBrandRequest = new CreateBrandRequest();
	
		// Create brand
		BrandInfo brandInfo = new BrandInfo();
		
		// Set the advertiser of the brand
		brandInfo.setAdvertiserID(advertiserId);
		
		// Set brand name
		brandInfo.setBrandName(Helper.CreateUniqueName("Brand"));

		// Set vertical
		brandInfo.setVertical(Verticals.Electronics);

		createBrandRequest.setBrand(brandInfo);
		CreateBrandResponse createBrandResponse = advertiserServiceStub.CreateBrand(createBrandRequest, securityToken);

		return createBrandResponse.getBrand();
	}
	
	public ConversionTagInfo CreateConversionTag(int advertiserId) throws RemoteException
	{
		CreateConversionTagRequest createConversionTagRequest = new CreateConversionTagRequest();
		
		SalesConversionTagInfo conversionTagInfo = new SalesConversionTagInfo();
		
		conversionTagInfo.setAdvertiserID(advertiserId);
		conversionTagInfo.setAdvertiserPageType(AdvertiserPageTypes.value1);
		conversionTagInfo.setSendAlertTimeRange(SendAlertTimeRanges.Day);
		conversionTagInfo.setServerProtocol(ServerProtocols.Http);
		conversionTagInfo.setConversionTagStatus(ConversionTagStatuses.Active);
		conversionTagInfo.setType(ConversionTagTypes.Counter);
		//conversionTagInfo.setCountConversions(CountConversions.Always);
		conversionTagInfo.setReportingName(Helper.CreateUniqueName("ReportingName"));
		conversionTagInfo.setCounterType(CounterTypes.NumberOfItemsInShoppingCart);
		conversionTagInfo.setCurrencyID(1);
		
		UnsignedInt unsignedInt = new UnsignedInt();
		unsignedInt.setValue(2345);
		conversionTagInfo.setSendAlertForConversionsAmount(unsignedInt);

		createConversionTagRequest.setConversionTag(conversionTagInfo);
		
		CreateConversionTagResponse createConversionTagResponse = advertiserServiceStub.CreateConversionTag(createConversionTagRequest, securityToken);
		
		return createConversionTagResponse.getConversionTag();
	}

	public BrandInfo GetBrandByName(int advertiserId, String Name) throws RemoteException
	{
		GetBrandsRequest getBrandsRequest = new GetBrandsRequest();
		getBrandsRequest.setAdvertiserID(advertiserId);
		GetBrandsResponse getBrandsResponse = advertiserServiceStub.GetBrands(getBrandsRequest, securityToken);
		BrandInfo[] brands = getBrandsResponse.getBrands().getBrandInfo();
		
		for(int i=0 ; i<brands.length ; i++)
		{
			if(brands[i].getBrandName().equals(Name))
			{
				return brands[i];
			}
		}
		return null;
	}
	
	public ConversionTagInfo GetConversionTagByName(int advertiserId, String Name) throws RemoteException
	{
		GetConversionTagsRequest getConversionTagsRequest = new GetConversionTagsRequest();
		getConversionTagsRequest.setAdvertiserID(new UnsignedInt(advertiserId));
		ListPaging paging = GetListPaging();
		getConversionTagsRequest.setPaging(paging);
		GetConversionTagsResponse getConversionTagsResponse = advertiserServiceStub.GetConversionTags(getConversionTagsRequest , securityToken);
		ConversionTagInfo[] conversionTags = getConversionTagsResponse.getConversionTags().getConversionTagInfo();
		
		
		for(int i=0 ; i<conversionTags.length ; i++)
		{
			if(conversionTags[i].getAdvertiserName().equals(Name))
			{
				return conversionTags[i];
			}
		}
		return null;
	}
		
	private ListPaging GetListPaging()
	{
		ListPaging paging = new ListPaging();
		paging.setPageIndex(0);
		paging.setPageSize(50);
		
		return paging;
	}
}




