import java.rmi.RemoteException;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import api.eyeblaster.com.DeliveryGroup.DeliveryGroupServiceStub;
import api.eyeblaster.com.V1.DataContracts.DeliveryGroup.ArrayOfBaseDC;
import api.eyeblaster.com.V1.DataContracts.DeliveryGroup.ArrayOfDeliveryGroupsServiceFilter;
import api.eyeblaster.com.V1.DataContracts.DeliveryGroup.DeliveryGroupInfo;
import api.eyeblaster.com.V1.DataContracts.DeliveryGroup.DeliverySubGroupInfo;
import api.eyeblaster.com.V1.DataContracts.DeliveryGroup.EvenRotationInfo;
import api.eyeblaster.com.V1.DataContracts.DeliveryGroup.SubGroupEvenRotationInfo;
import api.eyeblaster.com.message.DeliveryGroup.AttachDeliveryGroupToPlacementRequest;
import api.eyeblaster.com.message.DeliveryGroup.ListPaging;
import api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsRequest;
import api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsResponse;
import api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken;
import api.eyeblaster.com.message.DeliveryGroup.CreateDeliveryGroupRequest;
import api.eyeblaster.com.message.DeliveryGroup.CreateDeliveryGroupResponse;



public class DeliveryGroupHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * @param args
	 */
	UserSecurityToken securityToken;
	DeliveryGroupServiceStub deliveryGroupServiceStub;
	
	public DeliveryGroupHandler(String tokenString) throws RemoteException
	{
		deliveryGroupServiceStub = new DeliveryGroupServiceStub();		
		securityToken = new UserSecurityToken();
		securityToken.setUserSecurityToken(tokenString);
	}
	
	public DeliveryGroupInfo CreateDeliveryGroupTwoAds(int firstAdID, int secondAdID, int campaignID) throws RemoteException
    {
		CreateDeliveryGroupRequest deliveryGroupRequest = new CreateDeliveryGroupRequest();
		DeliveryGroupInfo deliveryGroupInfo = new DeliveryGroupInfo();
		SetCommonProperties(deliveryGroupInfo,campaignID,firstAdID,secondAdID);		
		deliveryGroupRequest.setDeliveryGroup(deliveryGroupInfo);
		CreateDeliveryGroupResponse createDeliveryGroupResponse = deliveryGroupServiceStub.CreateDeliveryGroup(deliveryGroupRequest, securityToken);		
		return createDeliveryGroupResponse.getDeliveryGroup();
    }
	
	public DeliveryGroupInfo GetDeliveryGroupByName(int campaignID, String Name) throws RemoteException
    {		
		GetDeliveryGroupsRequest getDeliveryGroupsRequest = new GetDeliveryGroupsRequest();	
		ArrayOfDeliveryGroupsServiceFilter arrayOfDeliveryGroupsServiceFilter = new ArrayOfDeliveryGroupsServiceFilter();		
		getDeliveryGroupsRequest.setPaging(GetListPaging());		
		getDeliveryGroupsRequest.setDeliveryGroupsFilter(arrayOfDeliveryGroupsServiceFilter);		
		getDeliveryGroupsRequest.setCampaignID(campaignID);
		GetDeliveryGroupsResponse getDeliveryGroupsResponse = deliveryGroupServiceStub.GetDeliveryGroups(getDeliveryGroupsRequest, securityToken);				
		
		DeliveryGroupInfo[] deliveryGroups = getDeliveryGroupsResponse.getDeliveryGroups().getDeliveryGroupInfo();
		for(int i=0 ; i<deliveryGroups.length ; i++)
		{
			if(deliveryGroups[i].getName().equals(Name))
			{
				return deliveryGroups[i];
			}
		}		
		return null;
    }
	
	private void SetCommonProperties(DeliveryGroupInfo deliveryGroupInfo, int campaignId,int firstAdID, int secondAdID)
	{
		deliveryGroupInfo.setName(Helper.CreateUniqueName("DeliveryGroup"));
		deliveryGroupInfo.setCampaignID(campaignId);		
		
		EvenRotationInfo evenRotationInfo = new EvenRotationInfo();
		
		// create sub groups place
		DeliverySubGroupInfo[] dsgInfo = new DeliverySubGroupInfo[2];
		dsgInfo[0] = new DeliverySubGroupInfo();
		dsgInfo[1] = new DeliverySubGroupInfo();
		
		// create rotation to sub group
		SubGroupEvenRotationInfo subGroupEvenRotationInfo  = new SubGroupEvenRotationInfo();
		
		//prepare ads to sub groups
		ArrayOfint ads = new ArrayOfint();
		int [] adsArray = new int[2];
		adsArray[0] = firstAdID;
		adsArray[1] = secondAdID;
		ads.set_int(adsArray);
		
		//set ads on sub group 
		subGroupEvenRotationInfo.setAds(ads);
		
		dsgInfo[0].setRotationType(subGroupEvenRotationInfo);
		dsgInfo[1].setRotationType(subGroupEvenRotationInfo);
		
		//set sub group on delivery group
		ArrayOfBaseDC arrayOfBaseDC = new ArrayOfBaseDC();
		arrayOfBaseDC.setBaseDC(dsgInfo);
		evenRotationInfo.setDC(arrayOfBaseDC);
		
		//set DG rotation
		deliveryGroupInfo.setRotationType(evenRotationInfo);		
	}

	public int AttachDeliveryGroupToPlacement(int deliveryGroupID,int placementID,boolean shouldCopyClickthroughURLs,boolean shouldCopyCustomJSURLs,boolean shouldCopyOnPlayAndOnDownloadURLs)throws RemoteException
	{
		AttachDeliveryGroupToPlacementRequest attachDeliveryGroupToPlacementRequest = new AttachDeliveryGroupToPlacementRequest();
		attachDeliveryGroupToPlacementRequest.setDeliveryGroupID(deliveryGroupID);
		attachDeliveryGroupToPlacementRequest.setPlacementID(placementID);
		attachDeliveryGroupToPlacementRequest.setShouldCopyClickthroughURLs(shouldCopyClickthroughURLs);
		attachDeliveryGroupToPlacementRequest.setShouldCopyCustomJSURLs(shouldCopyCustomJSURLs);
		attachDeliveryGroupToPlacementRequest.setShouldCopyOnPlayAndOnDownloadURLs(shouldCopyOnPlayAndOnDownloadURLs);		
		return 	deliveryGroupServiceStub.AttachDeliveryGroupToPlacement(attachDeliveryGroupToPlacementRequest, securityToken).getJobID();
	}
	
	private ListPaging GetListPaging()
	{
		ListPaging paging = new ListPaging();
		paging.setPageIndex(0);
		paging.setPageSize(50);

		return paging;
	}
}
