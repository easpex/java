import java.rmi.RemoteException;
import api.eyeblaster.com.Ad.AdServiceStub;
import api.eyeblaster.com.V1.DataContracts.Ad.AdInfo;
import api.eyeblaster.com.V1.DataContracts.Ad.AdNameFilter;
import api.eyeblaster.com.V1.DataContracts.Ad.AdPositioningType;
import api.eyeblaster.com.V1.DataContracts.Ad.ArrayOfAdsServiceFilter;
import api.eyeblaster.com.V1.DataContracts.Ad.BackgroundRepeatOptions;
import api.eyeblaster.com.V1.DataContracts.Ad.DisplayPeriodTypes;
import api.eyeblaster.com.V1.DataContracts.Ad.DownloadMode;
import api.eyeblaster.com.V1.DataContracts.Ad.FloatingAdInfo;
import api.eyeblaster.com.V1.DataContracts.Ad.HorizontalPositionSettings;
import api.eyeblaster.com.V1.DataContracts.Ad.MovementTypeSettings;
import api.eyeblaster.com.V1.DataContracts.Ad.ResizeSettings;
import api.eyeblaster.com.V1.DataContracts.Ad.StandardBannerAdInfo;
import api.eyeblaster.com.V1.DataContracts.Ad.VerticalPositionSettings;
import api.eyeblaster.com.V1.DataContracts.Ad.WallpaperAdInfo;
import api.eyeblaster.com.message.Ad.CreateAdRequest;
import api.eyeblaster.com.message.Ad.CreateAdResponse;
import api.eyeblaster.com.message.Ad.GetAdsRequest;
import api.eyeblaster.com.message.Ad.GetAdsResponse;
import api.eyeblaster.com.message.Ad.UserSecurityToken;
import api.eyeblaster.com.message.Ad.ListPaging;

public class AdHandler {

	/**
	 * @param args
	 */
	UserSecurityToken securityToken;
	AdServiceStub adServiceStub;
	CreativeAssetHandler creativeAssetHandler;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public AdHandler(String tokenString) throws RemoteException
	{
		adServiceStub = new AdServiceStub();
		creativeAssetHandler = new CreativeAssetHandler(tokenString);
		securityToken = new UserSecurityToken();
		securityToken.setUserSecurityToken(tokenString);
	}

	public StandardBannerAdInfo CreateStandardBannerAd(int campaignId) throws RemoteException
	{
		CreateAdRequest createAdRequest = new CreateAdRequest();
		
		StandardBannerAdInfo standardBannerAdInfo = new StandardBannerAdInfo();
		standardBannerAdInfo.setAdName(Helper.CreateUniqueName("StandardBannerAd"));
		standardBannerAdInfo.setCampaignID(campaignId);
		standardBannerAdInfo.setAdIsEnabled(true);
		
		int defualtImageId = creativeAssetHandler.GetAssetByType(AssetType.Image).getID();
		standardBannerAdInfo.setDefaultImageID(defualtImageId);
		
		createAdRequest.setAd(standardBannerAdInfo);		
		CreateAdResponse createAdResponse = adServiceStub.CreateAd(createAdRequest , securityToken);
		return (StandardBannerAdInfo) createAdResponse.getAd();
	}
	
	public FloatingAdInfo CreateFloatingAd(int campaignId) throws RemoteException
	{
		CreateAdRequest createAdRequest = new CreateAdRequest();
		
		FloatingAdInfo floatingAdInfo = new FloatingAdInfo();
		floatingAdInfo.setAdName(Helper.CreateUniqueName("FloatingAd"));
		floatingAdInfo.setCampaignID(campaignId);		
		int defaultFlashId = creativeAssetHandler.GetAssetByType(AssetType.Flash).getID();
		floatingAdInfo.setFloatingElementID(defaultFlashId);		
		floatingAdInfo.setAdIsEnabled(true);
		floatingAdInfo.setDownloadMode(DownloadMode.Polite);
		floatingAdInfo.setMovementType(MovementTypeSettings.MoveOnly);
		floatingAdInfo.setPositionUnits(AdPositioningType.Pixels);
		floatingAdInfo.setResizeSettingsType(ResizeSettings.KeepOriginalSize);
		floatingAdInfo.setMovementPeriod(30);
		
		createAdRequest.setAd(floatingAdInfo);
		
		CreateAdResponse createAdResponse = adServiceStub.CreateAd(createAdRequest , securityToken);
		return (FloatingAdInfo) createAdResponse.getAd();
	}
	
	public WallpaperAdInfo CreateWallpaperAd(int campaignId) throws RemoteException
	{
		CreateAdRequest createAdRequest = new CreateAdRequest();
		
		WallpaperAdInfo wallpaperAdInfo = new WallpaperAdInfo();
		wallpaperAdInfo.setAdName(Helper.CreateUniqueName("WallpaperAd"));
		wallpaperAdInfo.setCampaignID(campaignId);
		
		int wallpaperId = creativeAssetHandler.GetAssetByType(AssetType.Image).getID();
		wallpaperAdInfo.setWallpaper(wallpaperId);		
		wallpaperAdInfo.setAdIsEnabled(true);
		wallpaperAdInfo.setWallpaperVerticalAlignment(VerticalPositionSettings.Top);
		wallpaperAdInfo.setWallpaperHorizontalAlignment(HorizontalPositionSettings.Left);
		wallpaperAdInfo.setWallpaperTiling(BackgroundRepeatOptions.Tiling);
		wallpaperAdInfo.setWallpaperDisplayPeriodType(DisplayPeriodTypes.Unlimited);
		wallpaperAdInfo.setWallpaperIgnoreScrolling(false);
		wallpaperAdInfo.setDownloadMode(DownloadMode.Instant);

		createAdRequest.setAd(wallpaperAdInfo);

		CreateAdResponse createAdResponse = adServiceStub.CreateAd(createAdRequest , securityToken);
		return (WallpaperAdInfo) createAdResponse.getAd();
	}

	public AdInfo GetAdByName(String adName) throws RemoteException
	{
		GetAdsRequest getAdsRequest = new GetAdsRequest();
		
		ArrayOfAdsServiceFilter arrayOfAdsServiceFilter = new ArrayOfAdsServiceFilter();
		AdNameFilter adNameFilter = new AdNameFilter();
		adNameFilter.setAdName(adName);
		arrayOfAdsServiceFilter.addAdsServiceFilter(adNameFilter);
		getAdsRequest.setPaging(GetListPaging());
		getAdsRequest.setAdsFilter(arrayOfAdsServiceFilter);
		GetAdsResponse getAdsResponse = adServiceStub.GetAds(getAdsRequest, securityToken);

		return getAdsResponse.getAds().getAdInfo()[0];
	}

	private ListPaging GetListPaging()
	{
		ListPaging paging = new ListPaging();
		paging.setPageIndex(0);
		paging.setPageSize(50);

		return paging;
	}

}
