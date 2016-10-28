import java.rmi.RemoteException;
import api.eyeblaster.com.Placement.PlacementServiceStub;
import api.eyeblaster.com.V1.DataContracts.Placement.APIDateTime;
import api.eyeblaster.com.V1.DataContracts.Placement.ArrayOfPlacementServiceFilter;
import api.eyeblaster.com.V1.DataContracts.Placement.ArrayOfServingPeriodInfo;
import api.eyeblaster.com.V1.DataContracts.Placement.BannerSizeInfo;
import api.eyeblaster.com.V1.DataContracts.Placement.BookedImpressionsTypes;
import api.eyeblaster.com.V1.DataContracts.Placement.InBannerPlacementInfo;
import api.eyeblaster.com.V1.DataContracts.Placement.OutOfBannerPlacementInfo;
import api.eyeblaster.com.V1.DataContracts.Placement.PlacementInfo;
import api.eyeblaster.com.V1.DataContracts.Placement.PlacementNameFilter;
import api.eyeblaster.com.V1.DataContracts.Placement.PlacementStatus;
import api.eyeblaster.com.V1.DataContracts.Placement.ServingPeriodInfo;
import api.eyeblaster.com.V1.DataContracts.Placement.SiteSectionInfo;
import api.eyeblaster.com.V1.DataContracts.Placement.StopServingTypes;
import api.eyeblaster.com.V1.DataContracts.Placement.TimeZone;
import api.eyeblaster.com.V1.DataContracts.Placement.TrackingOnlyPlacementInfo;
import api.eyeblaster.com.V1.DataContracts.Placement.TrackingTypes;
import api.eyeblaster.com.message.Placement.CreatePlacementRequest;
import api.eyeblaster.com.message.Placement.CreatePlacementResponse;
import api.eyeblaster.com.message.Placement.GetBannerSizesRequest;
import api.eyeblaster.com.message.Placement.GetBannerSizesResponse;
import api.eyeblaster.com.message.Placement.GetPlacementsRequest;
import api.eyeblaster.com.message.Placement.GetPlacementsResponse;
import api.eyeblaster.com.message.Placement.GetSiteSectionsRequest;
import api.eyeblaster.com.message.Placement.GetSiteSectionsResponse;
import api.eyeblaster.com.message.Placement.UserSecurityToken;
import api.eyeblaster.com.message.Placement.ListPaging;

public class PlacementHandler {

	/**
	 * @param args
	 */
	UserSecurityToken securityToken;
	PlacementServiceStub placementServiceStub;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public PlacementHandler(String tokenString) throws RemoteException
	{
		placementServiceStub = new PlacementServiceStub();
		securityToken = new UserSecurityToken();
		securityToken.setUserSecurityToken(tokenString);
	}
	
	public InBannerPlacementInfo CreateInBannerPlacement(int campaignId) throws RemoteException
	{
		CreatePlacementRequest createPlacementRequest = new CreatePlacementRequest();
		
		// create placement
		PlacementInfo placementInfo = new InBannerPlacementInfo();

		// Get common placement properties
		SetCommonProperties(placementInfo, campaignId); 
		placementInfo.setPlacementName(Helper.CreateUniqueName("InBannerPlacement"));
				
		// get banner sizes
		GetBannerSizesRequest getBannerSizesRequest = new GetBannerSizesRequest();
		getBannerSizesRequest.setPaging(GetListPaging());		
		GetBannerSizesResponse getBannerSizesResponse = placementServiceStub.GetBannerSizes(getBannerSizesRequest, securityToken);
		BannerSizeInfo bannerSizeInfo = getBannerSizesResponse.getBannerSizes().getBannerSizeInfo()[0];
		
		((InBannerPlacementInfo) placementInfo).setBannerSize(bannerSizeInfo.getID());
		
		createPlacementRequest.setPlacement(placementInfo);
		CreatePlacementResponse createPlacementResponse = placementServiceStub.CreatePlacement(createPlacementRequest, securityToken);

		return (InBannerPlacementInfo) createPlacementResponse.getPlacement();
	}
	
	public OutOfBannerPlacementInfo CreateOutOfBannerPlacement(int campaignId) throws RemoteException
	{
		CreatePlacementRequest createPlacementRequest = new CreatePlacementRequest();
		
		// create placement
		PlacementInfo placementInfo = new OutOfBannerPlacementInfo();
		placementInfo.setPlacementName(Helper.CreateUniqueName("OutOfBannerPlacement"));		
		
		// Get common placement properties
		SetCommonProperties(placementInfo, campaignId); 

		createPlacementRequest.setPlacement(placementInfo);
		CreatePlacementResponse createPlacementResponse = placementServiceStub.CreatePlacement(createPlacementRequest, securityToken);

		return (OutOfBannerPlacementInfo) createPlacementResponse.getPlacement();
	}
	
	public TrackingOnlyPlacementInfo CreateTrackingOnlyPlacement(int campaignId) throws RemoteException
	{
		CreatePlacementRequest createPlacementRequest = new CreatePlacementRequest();
		
		// create placement
		PlacementInfo placementInfo = new TrackingOnlyPlacementInfo();
		placementInfo.setPlacementName(Helper.CreateUniqueName("TrackingOnlyPlacement"));		
		
		// Get common placement properties
		SetCommonProperties(placementInfo, campaignId);
		
		// Set tracking type
		((TrackingOnlyPlacementInfo)placementInfo).setTrackingType(TrackingTypes.ClicksOnly);
		
		createPlacementRequest.setPlacement(placementInfo);
		CreatePlacementResponse createPlacementResponse = placementServiceStub.CreatePlacement(createPlacementRequest, securityToken);

		return (TrackingOnlyPlacementInfo) createPlacementResponse.getPlacement();
	}

	private void SetCommonProperties(PlacementInfo placementInfo, int campaignId) throws RemoteException
	{
		placementInfo.setCampaignID(campaignId);
		placementInfo.setBookedImpressionsType(BookedImpressionsTypes.BookedImpressionsTBD);
		placementInfo.setStatus(PlacementStatus.InPlanning);
		placementInfo.setStopServing(StopServingTypes.ImpressionsOrEndDate);
		placementInfo.setSiteID(2);
		placementInfo.setSiteSectionID(GetSectionBySite(2).getID());
		
		ArrayOfServingPeriodInfo arrDates = new ArrayOfServingPeriodInfo();
		
		ServingPeriodInfo servingPeriodInfo = new ServingPeriodInfo();
		
		APIDateTime start = new APIDateTime();
		start.setYear(2030);
		start.setMonth(12);
		start.setDay(20);
		start.setHour(0);
		start.setMinute(0);		
		start.setSecond(0);    		
		start.setTimeZoneID(TimeZone.GMT_Plus_2);
				
		APIDateTime end = new APIDateTime();
		end.setYear(2030);
		end.setMonth(12);
		end.setDay(27);
		end.setHour(23);
		end.setMinute(59);		
		end.setSecond(0);    		
		end.setTimeZoneID(TimeZone.GMT_Plus_2);
		
		servingPeriodInfo.setStartDate(start);
		servingPeriodInfo.setEndDate(end);
		
		arrDates.addServingPeriodInfo(servingPeriodInfo);
		
		placementInfo.setDates(arrDates);
	}

	private SiteSectionInfo GetSectionBySite(int SiteID) throws RemoteException
	{
		GetSiteSectionsRequest getSiteSectionsRequest = new GetSiteSectionsRequest();
		getSiteSectionsRequest.setSiteID(SiteID);
		getSiteSectionsRequest.setPaging(GetListPaging());	
		GetSiteSectionsResponse getSiteSectionsResponse = placementServiceStub.GetSiteSections(getSiteSectionsRequest , securityToken);
		
		SiteSectionInfo[] sections = getSiteSectionsResponse.getSiteSections().getSiteSectionInfo();
		
		return sections[0];
	}

	public PlacementInfo GetPlacementByName(String placementName) throws RemoteException
	{
		GetPlacementsRequest getPlacementsRequest = new GetPlacementsRequest();
		
		ArrayOfPlacementServiceFilter arrayOfPlacementServiceFilter = new ArrayOfPlacementServiceFilter();
		PlacementNameFilter placementNameFilter = new PlacementNameFilter();
		placementNameFilter.setPlacementName(placementName);
		arrayOfPlacementServiceFilter.addPlacementServiceFilter(placementNameFilter);
		getPlacementsRequest.setPaging(GetListPaging());	
		getPlacementsRequest.setPlacementsFilter(arrayOfPlacementServiceFilter);
		
		GetPlacementsResponse getPlacementsResponse = placementServiceStub.GetPlacements(getPlacementsRequest, securityToken);
		return getPlacementsResponse.getPlacements().getPlacementInfo()[0];
	}
		
	private ListPaging GetListPaging()
	{
		ListPaging paging = new ListPaging();
		paging.setPageIndex(0);
		paging.setPageSize(50);
				
		return paging;
	}

}
