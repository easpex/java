
/**
 * PlacementServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */
        package api.eyeblaster.com.Placement;

        /**
        *  PlacementServiceMessageReceiverInOut message receiver
        */

        public class PlacementServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        PlacementServiceSkeleton skel = (PlacementServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJava(op.getName().getLocalPart())) != null)){

        

            if("GetMarkets".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetMarketsResponse getMarketsResponse55 = null;
	                        api.eyeblaster.com.message.Placement.GetMarketsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetMarketsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetMarketsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMarketsResponse55 =
                                                   
                                                   
                                                         skel.GetMarkets(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMarketsResponse55, false);
                                    } else 

            if("GetSiteSection".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetSiteSectionResponse getSiteSectionResponse58 = null;
	                        api.eyeblaster.com.message.Placement.GetSiteSectionRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetSiteSectionRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetSiteSectionRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSiteSectionResponse58 =
                                                   
                                                   
                                                         skel.GetSiteSection(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSiteSectionResponse58, false);
                                    } else 

            if("GetPlacementsBasicInfo".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetPlacementsBasicInfoResponse getPlacementsBasicInfoResponse61 = null;
	                        api.eyeblaster.com.message.Placement.GetPlacementsBasicInfoRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetPlacementsBasicInfoRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetPlacementsBasicInfoRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPlacementsBasicInfoResponse61 =
                                                   
                                                   
                                                         skel.GetPlacementsBasicInfo(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPlacementsBasicInfoResponse61, false);
                                    } else 

            if("CreatePlacementCustomLog".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.CreatePlacementCustomLogRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.CreatePlacementCustomLogRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.CreatePlacementCustomLogRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.CreatePlacementCustomLog(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("DeletePlacement".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.DeletePlacementRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.DeletePlacementRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.DeletePlacementRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.DeletePlacement(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("SavePlacementTargeting".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.SavePlacementTargetingResponse savePlacementTargetingResponse70 = null;
	                        api.eyeblaster.com.message.Placement.SavePlacementTargetingRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.SavePlacementTargetingRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.SavePlacementTargetingRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               savePlacementTargetingResponse70 =
                                                   
                                                   
                                                         skel.SavePlacementTargeting(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), savePlacementTargetingResponse70, false);
                                    } else 

            if("GetPlacementTagSettings".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetPlacementTagSettingsResponse getPlacementTagSettingsResponse73 = null;
	                        api.eyeblaster.com.message.Placement.GetPlacementTagSettingsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetPlacementTagSettingsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetPlacementTagSettingsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPlacementTagSettingsResponse73 =
                                                   
                                                   
                                                         skel.GetPlacementTagSettings(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPlacementTagSettingsResponse73, false);
                                    } else 

            if("GetOffices".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetOfficesResponse getOfficesResponse76 = null;
	                        api.eyeblaster.com.message.Placement.GetOfficesRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetOfficesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetOfficesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getOfficesResponse76 =
                                                   
                                                   
                                                         skel.GetOffices(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getOfficesResponse76, false);
                                    } else 

            if("GetBannerSizeByID".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetBannerSizeByIDResponse getBannerSizeByIDResponse79 = null;
	                        api.eyeblaster.com.message.Placement.GetBannerSizeByIDRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetBannerSizeByIDRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetBannerSizeByIDRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getBannerSizeByIDResponse79 =
                                                   
                                                   
                                                         skel.GetBannerSizeByID(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getBannerSizeByIDResponse79, false);
                                    } else 

            if("UpdatePlacements".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.UpdatePlacementsResponse updatePlacementsResponse82 = null;
	                        api.eyeblaster.com.message.Placement.UpdatePlacementsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.UpdatePlacementsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.UpdatePlacementsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updatePlacementsResponse82 =
                                                   
                                                   
                                                         skel.UpdatePlacements(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updatePlacementsResponse82, false);
                                    } else 

            if("GetPlacementHistoryActions".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetHistoryActionsResponse getHistoryActionsResponse85 = null;
	                        api.eyeblaster.com.message.Placement.GetHistoryActionsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetHistoryActionsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetHistoryActionsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryActionsResponse85 =
                                                   
                                                   
                                                         skel.GetPlacementHistoryActions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryActionsResponse85, false);
                                    } else 

            if("CreatePlacementPackage".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.CreatePlacementPackageResponse createPlacementPackageResponse88 = null;
	                        api.eyeblaster.com.message.Placement.CreatePlacementPackageRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.CreatePlacementPackageRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.CreatePlacementPackageRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createPlacementPackageResponse88 =
                                                   
                                                   
                                                         skel.CreatePlacementPackage(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createPlacementPackageResponse88, false);
                                    } else 

            if("GetCreativeShops".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetCreativeShopsResponse getCreativeShopsResponse91 = null;
	                        api.eyeblaster.com.message.Placement.GetCreativeShopsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetCreativeShopsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetCreativeShopsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCreativeShopsResponse91 =
                                                   
                                                   
                                                         skel.GetCreativeShops(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCreativeShopsResponse91, false);
                                    } else 

            if("GetPlacementTestTagSettings".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetPlacementTestTagSettingsResponse getPlacementTestTagSettingsResponse94 = null;
	                        api.eyeblaster.com.message.Placement.GetPlacementTestTagSettingsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetPlacementTestTagSettingsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetPlacementTestTagSettingsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPlacementTestTagSettingsResponse94 =
                                                   
                                                   
                                                         skel.GetPlacementTestTagSettings(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPlacementTestTagSettingsResponse94, false);
                                    } else 

            if("GetMediaMindMatchingSite".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetMediaMindMatchingSitesResponse getMediaMindMatchingSitesResponse97 = null;
	                        api.eyeblaster.com.message.Placement.GetMediaMindMatchingSiteRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetMediaMindMatchingSiteRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetMediaMindMatchingSiteRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMediaMindMatchingSitesResponse97 =
                                                   
                                                   
                                                         skel.GetMediaMindMatchingSite(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMediaMindMatchingSitesResponse97, false);
                                    } else 

            if("GetPlacementPackage".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetPlacementPackageResponse getPlacementPackageResponse100 = null;
	                        api.eyeblaster.com.message.Placement.GetPlacementPackageRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetPlacementPackageRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetPlacementPackageRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPlacementPackageResponse100 =
                                                   
                                                   
                                                         skel.GetPlacementPackage(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPlacementPackageResponse100, false);
                                    } else 

            if("GetCampaignTagSettings".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetCampaignTagSettingsResponse getCampaignTagSettingsResponse103 = null;
	                        api.eyeblaster.com.message.Placement.GetCampaignTagSettingsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetCampaignTagSettingsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetCampaignTagSettingsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCampaignTagSettingsResponse103 =
                                                   
                                                   
                                                         skel.GetCampaignTagSettings(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCampaignTagSettingsResponse103, false);
                                    } else 

            if("CreatePlacement".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.CreatePlacementResponse createPlacementResponse106 = null;
	                        api.eyeblaster.com.message.Placement.CreatePlacementRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.CreatePlacementRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.CreatePlacementRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createPlacementResponse106 =
                                                   
                                                   
                                                         skel.CreatePlacement(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createPlacementResponse106, false);
                                    } else 

            if("GetCampaignTags".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetCampaignTagsResponse getCampaignTagsResponse109 = null;
	                        api.eyeblaster.com.message.Placement.GetCampaignTagsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetCampaignTagsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetCampaignTagsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCampaignTagsResponse109 =
                                                   
                                                   
                                                         skel.GetCampaignTags(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCampaignTagsResponse109, false);
                                    } else 

            if("GetPlacementPackageByCampaignAndSite".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetPlacementPackageByCampaignAndSiteResponse getPlacementPackageByCampaignAndSiteResponse112 = null;
	                        api.eyeblaster.com.message.Placement.GetPlacementPackageByCampaignAndSiteRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetPlacementPackageByCampaignAndSiteRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetPlacementPackageByCampaignAndSiteRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPlacementPackageByCampaignAndSiteResponse112 =
                                                   
                                                   
                                                         skel.GetPlacementPackageByCampaignAndSite(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPlacementPackageByCampaignAndSiteResponse112, false);
                                    } else 

            if("SetMediaMindMatchingSection".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.SetMediaMindMatchingSiteSectionRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.SetMediaMindMatchingSiteSectionRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.SetMediaMindMatchingSiteSectionRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.SetMediaMindMatchingSection(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("GetPlacementHistoryObjects".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetHistoryObjectsResponse getHistoryObjectsResponse118 = null;
	                        api.eyeblaster.com.message.Placement.GetHistoryObjectsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetHistoryObjectsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetHistoryObjectsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryObjectsResponse118 =
                                                   
                                                   
                                                         skel.GetPlacementHistoryObjects(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryObjectsResponse118, false);
                                    } else 

            if("GetBannerSizeByWidthAndHeight".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetBannerSizeByWidthAndHeightResponse getBannerSizeByWidthAndHeightResponse121 = null;
	                        api.eyeblaster.com.message.Placement.GetBannerSizeByWidthAndHeightRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetBannerSizeByWidthAndHeightRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetBannerSizeByWidthAndHeightRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getBannerSizeByWidthAndHeightResponse121 =
                                                   
                                                   
                                                         skel.GetBannerSizeByWidthAndHeight(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getBannerSizeByWidthAndHeightResponse121, false);
                                    } else 

            if("GetPlacementTargeting".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetPlacementTargetingResponse getPlacementTargetingResponse124 = null;
	                        api.eyeblaster.com.message.Placement.GetPlacementTargetingRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetPlacementTargetingRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetPlacementTargetingRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPlacementTargetingResponse124 =
                                                   
                                                   
                                                         skel.GetPlacementTargeting(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPlacementTargetingResponse124, false);
                                    } else 

            if("UpdatePlacementPackage".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.UpdatePlacementPackageResponse updatePlacementPackageResponse127 = null;
	                        api.eyeblaster.com.message.Placement.UpdatePlacementPackageRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.UpdatePlacementPackageRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.UpdatePlacementPackageRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updatePlacementPackageResponse127 =
                                                   
                                                   
                                                         skel.UpdatePlacementPackage(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updatePlacementPackageResponse127, false);
                                    } else 

            if("GetPlacementTestTag".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetPlacementTestTagResponse getPlacementTestTagResponse130 = null;
	                        api.eyeblaster.com.message.Placement.GetPlacementTestTagRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetPlacementTestTagRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetPlacementTestTagRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPlacementTestTagResponse130 =
                                                   
                                                   
                                                         skel.GetPlacementTestTag(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPlacementTestTagResponse130, false);
                                    } else 

            if("GetPlacementTargetingStates".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetPlacementTargetingStatesResponse getPlacementTargetingStatesResponse133 = null;
	                        api.eyeblaster.com.message.Placement.GetPlacementTargetingStatesRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetPlacementTargetingStatesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetPlacementTargetingStatesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPlacementTargetingStatesResponse133 =
                                                   
                                                   
                                                         skel.GetPlacementTargetingStates(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPlacementTargetingStatesResponse133, false);
                                    } else 

            if("GetMediaMindMatchingSiteSections".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetMediaMindMatchingSiteSectionsResponse getMediaMindMatchingSiteSectionsResponse136 = null;
	                        api.eyeblaster.com.message.Placement.GetMediaMindMatchingSiteSectionsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetMediaMindMatchingSiteSectionsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetMediaMindMatchingSiteSectionsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMediaMindMatchingSiteSectionsResponse136 =
                                                   
                                                   
                                                         skel.GetMediaMindMatchingSiteSections(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMediaMindMatchingSiteSectionsResponse136, false);
                                    } else 

            if("ResetPlacementTagSettings".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.ResetPlacementTagSettingsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.ResetPlacementTagSettingsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.ResetPlacementTagSettingsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.ResetPlacementTagSettings(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("GetServingSystemList".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetServingSystemListResponse getServingSystemListResponse142 = null;
	                        api.eyeblaster.com.message.Placement.GetServingSystemListRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetServingSystemListRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetServingSystemListRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getServingSystemListResponse142 =
                                                   
                                                   
                                                         skel.GetServingSystemList(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getServingSystemListResponse142, false);
                                    } else 

            if("GetMobileSites".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetMobileSitesResponse getMobileSitesResponse145 = null;
	                        api.eyeblaster.com.message.Placement.GetMobileSitesRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetMobileSitesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetMobileSitesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMobileSitesResponse145 =
                                                   
                                                   
                                                         skel.GetMobileSites(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMobileSitesResponse145, false);
                                    } else 

            if("GetPlacementHistory".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetHistoryResponse getHistoryResponse148 = null;
	                        api.eyeblaster.com.message.Placement.GetPlacementHistoryRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetPlacementHistoryRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetPlacementHistoryRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryResponse148 =
                                                   
                                                   
                                                         skel.GetPlacementHistory(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryResponse148, false);
                                    } else 

            if("GetAgencies".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetAgenciesResponse getAgenciesResponse151 = null;
	                        api.eyeblaster.com.message.Placement.GetAgenciesRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetAgenciesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetAgenciesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAgenciesResponse151 =
                                                   
                                                   
                                                         skel.GetAgencies(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAgenciesResponse151, false);
                                    } else 

            if("SetMediaMindMatchingSite".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.SetMediaMindMatchingSiteRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.SetMediaMindMatchingSiteRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.SetMediaMindMatchingSiteRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.SetMediaMindMatchingSite(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("CreateSiteSection".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.CreateSiteSectionResponse createSiteSectionResponse157 = null;
	                        api.eyeblaster.com.message.Placement.CreateSiteSectionRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.CreateSiteSectionRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.CreateSiteSectionRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createSiteSectionResponse157 =
                                                   
                                                   
                                                         skel.CreateSiteSection(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createSiteSectionResponse157, false);
                                    } else 

            if("DeletePlacements".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.DeletePlacementsResponse deletePlacementsResponse160 = null;
	                        api.eyeblaster.com.message.Placement.DeletePlacementsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.DeletePlacementsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.DeletePlacementsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deletePlacementsResponse160 =
                                                   
                                                   
                                                         skel.DeletePlacements(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deletePlacementsResponse160, false);
                                    } else 

            if("CreateBannerSize".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.CreateBannerSizeResponse createBannerSizeResponse163 = null;
	                        api.eyeblaster.com.message.Placement.CreateBannerSizeRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.CreateBannerSizeRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.CreateBannerSizeRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createBannerSizeResponse163 =
                                                   
                                                   
                                                         skel.CreateBannerSize(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createBannerSizeResponse163, false);
                                    } else 

            if("GetMobileAdServerList".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetMobileAdServerListResponse getMobileAdServerListResponse166 = null;
	                        api.eyeblaster.com.message.Placement.GetMobileAdServerListRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetMobileAdServerListRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetMobileAdServerListRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMobileAdServerListResponse166 =
                                                   
                                                   
                                                         skel.GetMobileAdServerList(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMobileAdServerListResponse166, false);
                                    } else 

            if("GetBannerSizes".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetBannerSizesResponse getBannerSizesResponse169 = null;
	                        api.eyeblaster.com.message.Placement.GetBannerSizesRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetBannerSizesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetBannerSizesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getBannerSizesResponse169 =
                                                   
                                                   
                                                         skel.GetBannerSizes(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getBannerSizesResponse169, false);
                                    } else 

            if("GetPlacement".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetPlacementResponse getPlacementResponse172 = null;
	                        api.eyeblaster.com.message.Placement.GetPlacementRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetPlacementRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetPlacementRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPlacementResponse172 =
                                                   
                                                   
                                                         skel.GetPlacement(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPlacementResponse172, false);
                                    } else 

            if("GetPlacementTag".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetPlacementTagResponse getPlacementTagResponse175 = null;
	                        api.eyeblaster.com.message.Placement.GetPlacementTagRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetPlacementTagRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetPlacementTagRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPlacementTagResponse175 =
                                                   
                                                   
                                                         skel.GetPlacementTag(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPlacementTagResponse175, false);
                                    } else 

            if("UpdatePlacement".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.UpdatePlacementResponse updatePlacementResponse178 = null;
	                        api.eyeblaster.com.message.Placement.UpdatePlacementRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.UpdatePlacementRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.UpdatePlacementRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updatePlacementResponse178 =
                                                   
                                                   
                                                         skel.UpdatePlacement(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updatePlacementResponse178, false);
                                    } else 

            if("CreatePlacements".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.CreatePlacementsResponse createPlacementsResponse181 = null;
	                        api.eyeblaster.com.message.Placement.CreatePlacementsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.CreatePlacementsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.CreatePlacementsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createPlacementsResponse181 =
                                                   
                                                   
                                                         skel.CreatePlacements(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createPlacementsResponse181, false);
                                    } else 

            if("GetSiteSections".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetSiteSectionsResponse getSiteSectionsResponse184 = null;
	                        api.eyeblaster.com.message.Placement.GetSiteSectionsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetSiteSectionsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetSiteSectionsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSiteSectionsResponse184 =
                                                   
                                                   
                                                         skel.GetSiteSections(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSiteSectionsResponse184, false);
                                    } else 

            if("CopyPlacements".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.CopyPlacementsResponse copyPlacementsResponse187 = null;
	                        api.eyeblaster.com.message.Placement.CopyPlacementsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.CopyPlacementsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.CopyPlacementsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               copyPlacementsResponse187 =
                                                   
                                                   
                                                         skel.CopyPlacements(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), copyPlacementsResponse187, false);
                                    } else 

            if("PreviewPlacement".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.PreviewPlacementResponse previewPlacementResponse190 = null;
	                        api.eyeblaster.com.message.Placement.PreviewPlacementRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.PreviewPlacementRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.PreviewPlacementRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               previewPlacementResponse190 =
                                                   
                                                   
                                                         skel.PreviewPlacement(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), previewPlacementResponse190, false);
                                    } else 

            if("CopyPlacement".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.CopyPlacementResponse copyPlacementResponse193 = null;
	                        api.eyeblaster.com.message.Placement.CopyPlacementRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.CopyPlacementRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.CopyPlacementRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               copyPlacementResponse193 =
                                                   
                                                   
                                                         skel.CopyPlacement(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), copyPlacementResponse193, false);
                                    } else 

            if("GetSites".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetSitesResponse getSitesResponse196 = null;
	                        api.eyeblaster.com.message.Placement.GetSitesRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetSitesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetSitesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSitesResponse196 =
                                                   
                                                   
                                                         skel.GetSites(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSitesResponse196, false);
                                    } else 

            if("GetPlacements".equals(methodName)){
                
                api.eyeblaster.com.message.Placement.GetPlacementsResponse getPlacementsResponse199 = null;
	                        api.eyeblaster.com.message.Placement.GetPlacementsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Placement.GetPlacementsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Placement.GetPlacementsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPlacementsResponse199 =
                                                   
                                                   
                                                         skel.GetPlacements(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPlacementsResponse199, false);
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetMarketsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetMarketsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetMarketsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetMarketsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.UserSecurityToken param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.UserSecurityToken.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetSiteSectionRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetSiteSectionRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetSiteSectionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetSiteSectionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetPlacementsBasicInfoRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementsBasicInfoRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetPlacementsBasicInfoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementsBasicInfoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.CreatePlacementCustomLogRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.CreatePlacementCustomLogRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.DeletePlacementRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.DeletePlacementRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.SavePlacementTargetingRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.SavePlacementTargetingRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.SavePlacementTargetingResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.SavePlacementTargetingResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetPlacementTagSettingsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementTagSettingsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetPlacementTagSettingsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementTagSettingsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetOfficesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetOfficesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetOfficesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetOfficesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetBannerSizeByIDRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetBannerSizeByIDRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetBannerSizeByIDResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetBannerSizeByIDResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.UpdatePlacementsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.UpdatePlacementsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.UpdatePlacementsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.UpdatePlacementsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetHistoryActionsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetHistoryActionsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetHistoryActionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetHistoryActionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.CreatePlacementPackageRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.CreatePlacementPackageRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.CreatePlacementPackageResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.CreatePlacementPackageResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetCreativeShopsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetCreativeShopsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetCreativeShopsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetCreativeShopsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetPlacementTestTagSettingsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementTestTagSettingsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetPlacementTestTagSettingsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementTestTagSettingsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetMediaMindMatchingSiteRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetMediaMindMatchingSiteRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetMediaMindMatchingSitesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetMediaMindMatchingSitesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetPlacementPackageRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementPackageRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetPlacementPackageResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementPackageResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetCampaignTagSettingsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetCampaignTagSettingsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetCampaignTagSettingsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetCampaignTagSettingsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.CreatePlacementRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.CreatePlacementRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.CreatePlacementResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.CreatePlacementResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetCampaignTagsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetCampaignTagsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetCampaignTagsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetCampaignTagsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetPlacementPackageByCampaignAndSiteRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementPackageByCampaignAndSiteRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetPlacementPackageByCampaignAndSiteResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementPackageByCampaignAndSiteResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.SetMediaMindMatchingSiteSectionRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.SetMediaMindMatchingSiteSectionRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetHistoryObjectsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetHistoryObjectsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetHistoryObjectsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetHistoryObjectsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetBannerSizeByWidthAndHeightRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetBannerSizeByWidthAndHeightRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetBannerSizeByWidthAndHeightResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetBannerSizeByWidthAndHeightResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetPlacementTargetingRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementTargetingRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetPlacementTargetingResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementTargetingResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.UpdatePlacementPackageRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.UpdatePlacementPackageRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.UpdatePlacementPackageResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.UpdatePlacementPackageResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetPlacementTestTagRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementTestTagRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetPlacementTestTagResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementTestTagResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetPlacementTargetingStatesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementTargetingStatesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetPlacementTargetingStatesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementTargetingStatesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetMediaMindMatchingSiteSectionsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetMediaMindMatchingSiteSectionsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetMediaMindMatchingSiteSectionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetMediaMindMatchingSiteSectionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.ResetPlacementTagSettingsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.ResetPlacementTagSettingsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetServingSystemListRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetServingSystemListRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetServingSystemListResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetServingSystemListResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetMobileSitesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetMobileSitesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetMobileSitesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetMobileSitesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetPlacementHistoryRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementHistoryRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetHistoryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetHistoryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetAgenciesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetAgenciesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetAgenciesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetAgenciesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.SetMediaMindMatchingSiteRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.SetMediaMindMatchingSiteRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.CreateSiteSectionRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.CreateSiteSectionRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.CreateSiteSectionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.CreateSiteSectionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.DeletePlacementsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.DeletePlacementsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.DeletePlacementsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.DeletePlacementsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.CreateBannerSizeRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.CreateBannerSizeRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.CreateBannerSizeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.CreateBannerSizeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetMobileAdServerListRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetMobileAdServerListRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetMobileAdServerListResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetMobileAdServerListResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetBannerSizesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetBannerSizesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetBannerSizesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetBannerSizesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetPlacementRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetPlacementResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetPlacementTagRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementTagRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetPlacementTagResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementTagResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.UpdatePlacementRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.UpdatePlacementRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.UpdatePlacementResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.UpdatePlacementResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.CreatePlacementsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.CreatePlacementsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.CreatePlacementsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.CreatePlacementsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetSiteSectionsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetSiteSectionsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetSiteSectionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetSiteSectionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.CopyPlacementsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.CopyPlacementsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.CopyPlacementsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.CopyPlacementsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.PreviewPlacementRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.PreviewPlacementRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.PreviewPlacementResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.PreviewPlacementResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.CopyPlacementRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.CopyPlacementRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.CopyPlacementResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.CopyPlacementResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetSitesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetSitesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetSitesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetSitesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetPlacementsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Placement.GetPlacementsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetMarketsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetMarketsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetMarketsResponse wrapGetMarkets(){
                                api.eyeblaster.com.message.Placement.GetMarketsResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetMarketsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetSiteSectionResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetSiteSectionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetSiteSectionResponse wrapGetSiteSection(){
                                api.eyeblaster.com.message.Placement.GetSiteSectionResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetSiteSectionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetPlacementsBasicInfoResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementsBasicInfoResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetPlacementsBasicInfoResponse wrapGetPlacementsBasicInfo(){
                                api.eyeblaster.com.message.Placement.GetPlacementsBasicInfoResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetPlacementsBasicInfoResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.SavePlacementTargetingResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.SavePlacementTargetingResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.SavePlacementTargetingResponse wrapSavePlacementTargeting(){
                                api.eyeblaster.com.message.Placement.SavePlacementTargetingResponse wrappedElement = new api.eyeblaster.com.message.Placement.SavePlacementTargetingResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetPlacementTagSettingsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementTagSettingsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetPlacementTagSettingsResponse wrapGetPlacementTagSettings(){
                                api.eyeblaster.com.message.Placement.GetPlacementTagSettingsResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetPlacementTagSettingsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetOfficesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetOfficesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetOfficesResponse wrapGetOffices(){
                                api.eyeblaster.com.message.Placement.GetOfficesResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetOfficesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetBannerSizeByIDResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetBannerSizeByIDResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetBannerSizeByIDResponse wrapGetBannerSizeByID(){
                                api.eyeblaster.com.message.Placement.GetBannerSizeByIDResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetBannerSizeByIDResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.UpdatePlacementsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.UpdatePlacementsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.UpdatePlacementsResponse wrapUpdatePlacements(){
                                api.eyeblaster.com.message.Placement.UpdatePlacementsResponse wrappedElement = new api.eyeblaster.com.message.Placement.UpdatePlacementsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetHistoryActionsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetHistoryActionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetHistoryActionsResponse wrapGetPlacementHistoryActions(){
                                api.eyeblaster.com.message.Placement.GetHistoryActionsResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetHistoryActionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.CreatePlacementPackageResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.CreatePlacementPackageResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.CreatePlacementPackageResponse wrapCreatePlacementPackage(){
                                api.eyeblaster.com.message.Placement.CreatePlacementPackageResponse wrappedElement = new api.eyeblaster.com.message.Placement.CreatePlacementPackageResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetCreativeShopsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetCreativeShopsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetCreativeShopsResponse wrapGetCreativeShops(){
                                api.eyeblaster.com.message.Placement.GetCreativeShopsResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetCreativeShopsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetPlacementTestTagSettingsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementTestTagSettingsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetPlacementTestTagSettingsResponse wrapGetPlacementTestTagSettings(){
                                api.eyeblaster.com.message.Placement.GetPlacementTestTagSettingsResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetPlacementTestTagSettingsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetMediaMindMatchingSitesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetMediaMindMatchingSitesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetMediaMindMatchingSitesResponse wrapGetMediaMindMatchingSite(){
                                api.eyeblaster.com.message.Placement.GetMediaMindMatchingSitesResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetMediaMindMatchingSitesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetPlacementPackageResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementPackageResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetPlacementPackageResponse wrapGetPlacementPackage(){
                                api.eyeblaster.com.message.Placement.GetPlacementPackageResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetPlacementPackageResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetCampaignTagSettingsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetCampaignTagSettingsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetCampaignTagSettingsResponse wrapGetCampaignTagSettings(){
                                api.eyeblaster.com.message.Placement.GetCampaignTagSettingsResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetCampaignTagSettingsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.CreatePlacementResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.CreatePlacementResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.CreatePlacementResponse wrapCreatePlacement(){
                                api.eyeblaster.com.message.Placement.CreatePlacementResponse wrappedElement = new api.eyeblaster.com.message.Placement.CreatePlacementResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetCampaignTagsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetCampaignTagsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetCampaignTagsResponse wrapGetCampaignTags(){
                                api.eyeblaster.com.message.Placement.GetCampaignTagsResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetCampaignTagsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetPlacementPackageByCampaignAndSiteResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementPackageByCampaignAndSiteResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetPlacementPackageByCampaignAndSiteResponse wrapGetPlacementPackageByCampaignAndSite(){
                                api.eyeblaster.com.message.Placement.GetPlacementPackageByCampaignAndSiteResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetPlacementPackageByCampaignAndSiteResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetHistoryObjectsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetHistoryObjectsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetHistoryObjectsResponse wrapGetPlacementHistoryObjects(){
                                api.eyeblaster.com.message.Placement.GetHistoryObjectsResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetHistoryObjectsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetBannerSizeByWidthAndHeightResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetBannerSizeByWidthAndHeightResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetBannerSizeByWidthAndHeightResponse wrapGetBannerSizeByWidthAndHeight(){
                                api.eyeblaster.com.message.Placement.GetBannerSizeByWidthAndHeightResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetBannerSizeByWidthAndHeightResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetPlacementTargetingResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementTargetingResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetPlacementTargetingResponse wrapGetPlacementTargeting(){
                                api.eyeblaster.com.message.Placement.GetPlacementTargetingResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetPlacementTargetingResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.UpdatePlacementPackageResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.UpdatePlacementPackageResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.UpdatePlacementPackageResponse wrapUpdatePlacementPackage(){
                                api.eyeblaster.com.message.Placement.UpdatePlacementPackageResponse wrappedElement = new api.eyeblaster.com.message.Placement.UpdatePlacementPackageResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetPlacementTestTagResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementTestTagResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetPlacementTestTagResponse wrapGetPlacementTestTag(){
                                api.eyeblaster.com.message.Placement.GetPlacementTestTagResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetPlacementTestTagResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetPlacementTargetingStatesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementTargetingStatesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetPlacementTargetingStatesResponse wrapGetPlacementTargetingStates(){
                                api.eyeblaster.com.message.Placement.GetPlacementTargetingStatesResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetPlacementTargetingStatesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetMediaMindMatchingSiteSectionsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetMediaMindMatchingSiteSectionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetMediaMindMatchingSiteSectionsResponse wrapGetMediaMindMatchingSiteSections(){
                                api.eyeblaster.com.message.Placement.GetMediaMindMatchingSiteSectionsResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetMediaMindMatchingSiteSectionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetServingSystemListResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetServingSystemListResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetServingSystemListResponse wrapGetServingSystemList(){
                                api.eyeblaster.com.message.Placement.GetServingSystemListResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetServingSystemListResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetMobileSitesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetMobileSitesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetMobileSitesResponse wrapGetMobileSites(){
                                api.eyeblaster.com.message.Placement.GetMobileSitesResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetMobileSitesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetHistoryResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetHistoryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetHistoryResponse wrapGetPlacementHistory(){
                                api.eyeblaster.com.message.Placement.GetHistoryResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetHistoryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetAgenciesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetAgenciesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetAgenciesResponse wrapGetAgencies(){
                                api.eyeblaster.com.message.Placement.GetAgenciesResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetAgenciesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.CreateSiteSectionResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.CreateSiteSectionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.CreateSiteSectionResponse wrapCreateSiteSection(){
                                api.eyeblaster.com.message.Placement.CreateSiteSectionResponse wrappedElement = new api.eyeblaster.com.message.Placement.CreateSiteSectionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.DeletePlacementsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.DeletePlacementsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.DeletePlacementsResponse wrapDeletePlacements(){
                                api.eyeblaster.com.message.Placement.DeletePlacementsResponse wrappedElement = new api.eyeblaster.com.message.Placement.DeletePlacementsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.CreateBannerSizeResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.CreateBannerSizeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.CreateBannerSizeResponse wrapCreateBannerSize(){
                                api.eyeblaster.com.message.Placement.CreateBannerSizeResponse wrappedElement = new api.eyeblaster.com.message.Placement.CreateBannerSizeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetMobileAdServerListResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetMobileAdServerListResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetMobileAdServerListResponse wrapGetMobileAdServerList(){
                                api.eyeblaster.com.message.Placement.GetMobileAdServerListResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetMobileAdServerListResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetBannerSizesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetBannerSizesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetBannerSizesResponse wrapGetBannerSizes(){
                                api.eyeblaster.com.message.Placement.GetBannerSizesResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetBannerSizesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetPlacementResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetPlacementResponse wrapGetPlacement(){
                                api.eyeblaster.com.message.Placement.GetPlacementResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetPlacementResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetPlacementTagResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementTagResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetPlacementTagResponse wrapGetPlacementTag(){
                                api.eyeblaster.com.message.Placement.GetPlacementTagResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetPlacementTagResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.UpdatePlacementResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.UpdatePlacementResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.UpdatePlacementResponse wrapUpdatePlacement(){
                                api.eyeblaster.com.message.Placement.UpdatePlacementResponse wrappedElement = new api.eyeblaster.com.message.Placement.UpdatePlacementResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.CreatePlacementsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.CreatePlacementsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.CreatePlacementsResponse wrapCreatePlacements(){
                                api.eyeblaster.com.message.Placement.CreatePlacementsResponse wrappedElement = new api.eyeblaster.com.message.Placement.CreatePlacementsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetSiteSectionsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetSiteSectionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetSiteSectionsResponse wrapGetSiteSections(){
                                api.eyeblaster.com.message.Placement.GetSiteSectionsResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetSiteSectionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.CopyPlacementsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.CopyPlacementsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.CopyPlacementsResponse wrapCopyPlacements(){
                                api.eyeblaster.com.message.Placement.CopyPlacementsResponse wrappedElement = new api.eyeblaster.com.message.Placement.CopyPlacementsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.PreviewPlacementResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.PreviewPlacementResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.PreviewPlacementResponse wrapPreviewPlacement(){
                                api.eyeblaster.com.message.Placement.PreviewPlacementResponse wrappedElement = new api.eyeblaster.com.message.Placement.PreviewPlacementResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.CopyPlacementResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.CopyPlacementResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.CopyPlacementResponse wrapCopyPlacement(){
                                api.eyeblaster.com.message.Placement.CopyPlacementResponse wrappedElement = new api.eyeblaster.com.message.Placement.CopyPlacementResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetSitesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetSitesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetSitesResponse wrapGetSites(){
                                api.eyeblaster.com.message.Placement.GetSitesResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetSitesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Placement.GetPlacementsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Placement.GetPlacementsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Placement.GetPlacementsResponse wrapGetPlacements(){
                                api.eyeblaster.com.message.Placement.GetPlacementsResponse wrappedElement = new api.eyeblaster.com.message.Placement.GetPlacementsResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (api.eyeblaster.com.message.Placement.GetMarketsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetMarketsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetMarketsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetMarketsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetSiteSectionRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetSiteSectionRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetSiteSectionResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetSiteSectionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetPlacementsBasicInfoRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetPlacementsBasicInfoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetPlacementsBasicInfoResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetPlacementsBasicInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.CreatePlacementCustomLogRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.CreatePlacementCustomLogRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.DeletePlacementRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.DeletePlacementRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.SavePlacementTargetingRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.SavePlacementTargetingRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.SavePlacementTargetingResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.SavePlacementTargetingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetPlacementTagSettingsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetPlacementTagSettingsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetPlacementTagSettingsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetPlacementTagSettingsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetOfficesRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetOfficesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetOfficesResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetOfficesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetBannerSizeByIDRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetBannerSizeByIDRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetBannerSizeByIDResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetBannerSizeByIDResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UpdatePlacementsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UpdatePlacementsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UpdatePlacementsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UpdatePlacementsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetHistoryActionsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetHistoryActionsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetHistoryActionsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetHistoryActionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.CreatePlacementPackageRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.CreatePlacementPackageRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.CreatePlacementPackageResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.CreatePlacementPackageResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetCreativeShopsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetCreativeShopsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetCreativeShopsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetCreativeShopsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetPlacementTestTagSettingsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetPlacementTestTagSettingsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetPlacementTestTagSettingsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetPlacementTestTagSettingsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetMediaMindMatchingSiteRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetMediaMindMatchingSiteRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetMediaMindMatchingSitesResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetMediaMindMatchingSitesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetPlacementPackageRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetPlacementPackageRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetPlacementPackageResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetPlacementPackageResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetCampaignTagSettingsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetCampaignTagSettingsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetCampaignTagSettingsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetCampaignTagSettingsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.CreatePlacementRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.CreatePlacementRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.CreatePlacementResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.CreatePlacementResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetCampaignTagsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetCampaignTagsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetCampaignTagsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetCampaignTagsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetPlacementPackageByCampaignAndSiteRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetPlacementPackageByCampaignAndSiteRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetPlacementPackageByCampaignAndSiteResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetPlacementPackageByCampaignAndSiteResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.SetMediaMindMatchingSiteSectionRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.SetMediaMindMatchingSiteSectionRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetHistoryObjectsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetHistoryObjectsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetHistoryObjectsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetHistoryObjectsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetBannerSizeByWidthAndHeightRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetBannerSizeByWidthAndHeightRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetBannerSizeByWidthAndHeightResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetBannerSizeByWidthAndHeightResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetPlacementTargetingRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetPlacementTargetingRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetPlacementTargetingResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetPlacementTargetingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UpdatePlacementPackageRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UpdatePlacementPackageRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UpdatePlacementPackageResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UpdatePlacementPackageResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetPlacementTestTagRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetPlacementTestTagRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetPlacementTestTagResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetPlacementTestTagResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetPlacementTargetingStatesRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetPlacementTargetingStatesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetPlacementTargetingStatesResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetPlacementTargetingStatesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetMediaMindMatchingSiteSectionsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetMediaMindMatchingSiteSectionsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetMediaMindMatchingSiteSectionsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetMediaMindMatchingSiteSectionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.ResetPlacementTagSettingsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.ResetPlacementTagSettingsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetServingSystemListRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetServingSystemListRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetServingSystemListResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetServingSystemListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetMobileSitesRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetMobileSitesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetMobileSitesResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetMobileSitesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetPlacementHistoryRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetPlacementHistoryRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetHistoryResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetHistoryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetAgenciesRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetAgenciesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetAgenciesResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetAgenciesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.SetMediaMindMatchingSiteRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.SetMediaMindMatchingSiteRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.CreateSiteSectionRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.CreateSiteSectionRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.CreateSiteSectionResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.CreateSiteSectionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.DeletePlacementsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.DeletePlacementsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.DeletePlacementsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.DeletePlacementsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.CreateBannerSizeRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.CreateBannerSizeRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.CreateBannerSizeResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.CreateBannerSizeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetMobileAdServerListRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetMobileAdServerListRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetMobileAdServerListResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetMobileAdServerListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetBannerSizesRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetBannerSizesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetBannerSizesResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetBannerSizesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetPlacementRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetPlacementRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetPlacementResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetPlacementResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetPlacementTagRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetPlacementTagRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetPlacementTagResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetPlacementTagResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UpdatePlacementRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UpdatePlacementRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UpdatePlacementResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UpdatePlacementResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.CreatePlacementsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.CreatePlacementsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.CreatePlacementsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.CreatePlacementsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetSiteSectionsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetSiteSectionsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetSiteSectionsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetSiteSectionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.CopyPlacementsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.CopyPlacementsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.CopyPlacementsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.CopyPlacementsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.PreviewPlacementRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.PreviewPlacementRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.PreviewPlacementResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.PreviewPlacementResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.CopyPlacementRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.CopyPlacementRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.CopyPlacementResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.CopyPlacementResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetSitesRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetSitesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetSitesResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetSitesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetPlacementsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetPlacementsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.GetPlacementsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.GetPlacementsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Placement.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Placement.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    