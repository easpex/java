import java.rmi.RemoteException;

import api.eyeblaster.com.Authentication.AuthenticationServiceStub;
import api.eyeblaster.com.Authentication.ClientLogin;
import api.eyeblaster.com.Authentication.ClientLoginResponse;
import api.eyeblaster.com.V1.DataContracts.Ad.FloatingAdInfo;
import api.eyeblaster.com.V1.DataContracts.Ad.StandardBannerAdInfo;
import api.eyeblaster.com.V1.DataContracts.Ad.WallpaperAdInfo;
import api.eyeblaster.com.V1.DataContracts.Advertiser.AdvertiserInfo;
import api.eyeblaster.com.V1.DataContracts.Advertiser.BrandInfo;
import api.eyeblaster.com.V1.DataContracts.Advertiser.ConversionTagInfo;
import api.eyeblaster.com.V1.DataContracts.Campaign.CampaignInfo;
import api.eyeblaster.com.V1.DataContracts.DeliveryGroup.DeliveryGroupInfo;
import api.eyeblaster.com.V1.DataContracts.Placement.InBannerPlacementInfo;
import api.eyeblaster.com.V1.DataContracts.Placement.OutOfBannerPlacementInfo;
import api.eyeblaster.com.V1.DataContracts.Placement.TrackingOnlyPlacementInfo;

public class Tester {

	/**
	 * @param args
	 * @throws RemoteException 
	 */
	private String securityToken;
	private int placementId;
	private int adId;
	
	public static void main(String[] args) throws RemoteException {

		long l = new java.util.Date().getTime();
		Helper.SetRand(l);
		Tester tester = new Tester();
	}
	
	public Tester() throws RemoteException
	{		
		// Generate the security token
		securityToken = CreateAuthenticationToken();
		Helper.writer("Authentication Token", securityToken);
		Helper.writer("Random identifier for this run", Helper.GetRand());
		
		// Create handlers
		AdvertiserHandler advertiserHandler = new AdvertiserHandler(securityToken);
		CampaignHandler campaignHandler = new CampaignHandler(securityToken);
		PlacementHandler placementHandler = new PlacementHandler(securityToken);
		AdHandler adHandler = new AdHandler(securityToken);
		DeliveryGroupHandler deliveryGroupHandler = new DeliveryGroupHandler(securityToken);

		// Create advertiser
		AdvertiserInfo advertiser = advertiserHandler.CreateAdvertiser();
		
		// Get the advertiser object from the server
		advertiser = advertiserHandler.GetAdvertiserByName(advertiser.getAdvertiserName());
		Helper.writer("Created advertiser ID", Integer.toString(advertiser.getID()));
			
		// Create brand
		BrandInfo brand = advertiserHandler.CreateBrand(advertiser.getID());
		
		// Get the brand object from the server
		brand = advertiserHandler.GetBrandByName(advertiser.getID(), brand.getBrandName());
		String brandId;
		if(brand != null)
		{
			brandId = Integer.toString(brand.getID());
		}
		else
		{
			brandId = "Not Found!";
		}
		Helper.writer("Created brand ID", brandId);
		
		// Create conversion tag
		ConversionTagInfo conversionTag = advertiserHandler.CreateConversionTag(advertiser.getID());
		conversionTag = advertiserHandler.GetConversionTagByName(advertiser.getID(), conversionTag.getAdvertiserName());
		String conversionTagId;
		if(conversionTag != null)
		{
			conversionTagId = Integer.toString(conversionTag.getID());
		}
		else
		{
			conversionTagId = "Not Found!";
		}
		Helper.writer("Created conversion tag ID", conversionTagId);
		
		// Create campaign
		CampaignInfo campaign = campaignHandler.CreateCampaign(advertiser);
		campaign = campaignHandler.GetCampaignByName(campaign.getName());
		int campaignId = campaign.getID();
		Helper.writer("Created campaign ID", Integer.toString(campaignId));

		// Create banner placement
		InBannerPlacementInfo inbannerPlacement = placementHandler.CreateInBannerPlacement(campaignId);
		inbannerPlacement = (InBannerPlacementInfo) placementHandler.GetPlacementByName(inbannerPlacement.getPlacementName());
		placementId = inbannerPlacement.getID();
		Helper.writer("Created standard banner placement ID", Integer.toString(placementId));

		// Create banner ad
		StandardBannerAdInfo standardBannerAd = adHandler.CreateStandardBannerAd(campaignId);
		standardBannerAd = (StandardBannerAdInfo) adHandler.GetAdByName(standardBannerAd.getAdName());
		adId = standardBannerAd.getID();
		Helper.writer("Created standard banner ad ID", Integer.toString(adId));		
		
		// Create delivery group
		DeliveryGroupInfo deliveryGroupInfo = deliveryGroupHandler.CreateDeliveryGroupTwoAds(adId, adId, campaignId);
		deliveryGroupInfo =	deliveryGroupHandler.GetDeliveryGroupByName(campaignId,deliveryGroupInfo.getName());
		int deliveryGroupID  = deliveryGroupInfo.getID();
		Helper.writer("Created delivery group ID", Integer.toString(deliveryGroupID));
		
		// Attach delivery group to placement
		int jobID = deliveryGroupHandler.AttachDeliveryGroupToPlacement(deliveryGroupID,placementId,false,false,false);
		Helper.writer("Attach delivery group to placement, JobID", Integer.toString(jobID));

		// Create out of banner placement for floating ad
		OutOfBannerPlacementInfo outOfBannerPlacement = placementHandler.CreateOutOfBannerPlacement(campaignId);
		outOfBannerPlacement = (OutOfBannerPlacementInfo) placementHandler.GetPlacementByName(outOfBannerPlacement.getPlacementName());
		placementId = outOfBannerPlacement.getID();
		Helper.writer("Created out of banner placement ID", Integer.toString(placementId));

		// Create floating ad
		FloatingAdInfo floatingAd = adHandler.CreateFloatingAd(campaignId);
		floatingAd = (FloatingAdInfo) adHandler.GetAdByName(floatingAd.getAdName());
		adId = floatingAd.getID();
		Helper.writer("Created floating ad ID", Integer.toString(adId));

		// Create out of banner placement for wallpaper ad 
		outOfBannerPlacement = placementHandler.CreateOutOfBannerPlacement(campaignId);
		outOfBannerPlacement = (OutOfBannerPlacementInfo) placementHandler.GetPlacementByName(outOfBannerPlacement.getPlacementName());
		placementId = outOfBannerPlacement.getID();
		Helper.writer("Created out of banner placement ID", Integer.toString(placementId));

		// Create wallpaper ad
		WallpaperAdInfo wallpaperAd = adHandler.CreateWallpaperAd(placementId);
		wallpaperAd = (WallpaperAdInfo) adHandler.GetAdByName(wallpaperAd.getAdName());
		adId = wallpaperAd.getID();
		Helper.writer("Created wallpaper ad ID", Integer.toString(adId));
		
		// Create banner placement
		TrackingOnlyPlacementInfo trackingOnlyPlacement = placementHandler.CreateTrackingOnlyPlacement(campaignId);
		trackingOnlyPlacement = (TrackingOnlyPlacementInfo) placementHandler.GetPlacementByName(trackingOnlyPlacement.getPlacementName());
		placementId = trackingOnlyPlacement.getID();
		Helper.writer("Created tracking placement ID", Integer.toString(placementId));

		// Update campaign site contacts
		campaignHandler.UpdateCampaignContacts(campaign);
		Helper.writer("Campaign contacts were updated.");

		Helper.writer("Done.");
	}
	
	private String CreateAuthenticationToken() throws RemoteException
	{
		AuthenticationServiceStub authenticationServiceStub = new AuthenticationServiceStub();
		
		ClientLogin clientLogin = new ClientLogin();
		clientLogin.setUsername("<YourUserName>");
		clientLogin.setPassword("<YourPassword>");
		clientLogin.setApplicationKey("<YourApplicationKey>");		
		
		ClientLoginResponse clientLoginResponse = authenticationServiceStub.ClientLogin(clientLogin);
		
		return clientLoginResponse.getClientLoginResult();
	}
}