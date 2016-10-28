
/**
 * AdServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */
        package api.eyeblaster.com.Ad;

        /**
        *  AdServiceMessageReceiverInOut message receiver
        */

        public class AdServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        AdServiceSkeleton skel = (AdServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJava(op.getName().getLocalPart())) != null)){

        

            if("GetAdFilters".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.GetAdSpecificFiltersResponse getAdSpecificFiltersResponse59 = null;
	                        api.eyeblaster.com.message.Ad.GetAdSpecificFiltersRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.GetAdSpecificFiltersRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.GetAdSpecificFiltersRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdSpecificFiltersResponse59 =
                                                   
                                                   
                                                         skel.GetAdFilters(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdSpecificFiltersResponse59, false);
                                    } else 

            if("GetPlacementsOfAd".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.GetPlacementsOfAdResponse getPlacementsOfAdResponse62 = null;
	                        api.eyeblaster.com.message.Ad.GetPlacementsOfAdRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.GetPlacementsOfAdRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.GetPlacementsOfAdRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPlacementsOfAdResponse62 =
                                                   
                                                   
                                                         skel.GetPlacementsOfAd(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPlacementsOfAdResponse62, false);
                                    } else 

            if("CreateAdClassification".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.CreateAdClassificationResponse createAdClassificationResponse65 = null;
	                        api.eyeblaster.com.message.Ad.CreateAdClassificationRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.CreateAdClassificationRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.CreateAdClassificationRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createAdClassificationResponse65 =
                                                   
                                                   
                                                         skel.CreateAdClassification(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createAdClassificationResponse65, false);
                                    } else 

            if("GetAd".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.GetAdResponse getAdResponse68 = null;
	                        api.eyeblaster.com.message.Ad.GetAdRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.GetAdRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.GetAdRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdResponse68 =
                                                   
                                                   
                                                         skel.GetAd(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdResponse68, false);
                                    } else 

            if("DeleteInStreamVastAssets".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.DeleteInStreamVastElementResponse deleteInStreamVastElementResponse71 = null;
	                        api.eyeblaster.com.message.Ad.DeleteInStreamVastAssetsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.DeleteInStreamVastAssetsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.DeleteInStreamVastAssetsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteInStreamVastElementResponse71 =
                                                   
                                                   
                                                         skel.DeleteInStreamVastAssets(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteInStreamVastElementResponse71, false);
                                    } else 

            if("GetAd3PartyTrackingURLById".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLResponse getAd3RdPartyTrackingURLResponse74 = null;
	                        api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAd3RdPartyTrackingURLResponse74 =
                                                   
                                                   
                                                         skel.GetAd3PartyTrackingURLById(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAd3RdPartyTrackingURLResponse74, false);
                                    } else 

            if("UpdateAd".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.UpdateAdResponse updateAdResponse77 = null;
	                        api.eyeblaster.com.message.Ad.UpdateAdRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.UpdateAdRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.UpdateAdRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateAdResponse77 =
                                                   
                                                   
                                                         skel.UpdateAd(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateAdResponse77, false);
                                    } else 

            if("UpdateAdInteractions".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.UpdateAdInteractionsResponse updateAdInteractionsResponse80 = null;
	                        api.eyeblaster.com.message.Ad.UpdateAdInteractionsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.UpdateAdInteractionsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.UpdateAdInteractionsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateAdInteractionsResponse80 =
                                                   
                                                   
                                                         skel.UpdateAdInteractions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateAdInteractionsResponse80, false);
                                    } else 

            if("UpdateAdAdditionalAsset".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.UpdateAdAdditionalAssetResponse updateAdAdditionalAssetResponse83 = null;
	                        api.eyeblaster.com.message.Ad.UpdateAdAdditionalAssetRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.UpdateAdAdditionalAssetRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.UpdateAdAdditionalAssetRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateAdAdditionalAssetResponse83 =
                                                   
                                                   
                                                         skel.UpdateAdAdditionalAsset(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateAdAdditionalAssetResponse83, false);
                                    } else 

            if("GetAdsBasicInfo".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.GetAdsBasicInfoResponse getAdsBasicInfoResponse86 = null;
	                        api.eyeblaster.com.message.Ad.GetAdsBasicInfoRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.GetAdsBasicInfoRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.GetAdsBasicInfoRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdsBasicInfoResponse86 =
                                                   
                                                   
                                                         skel.GetAdsBasicInfo(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdsBasicInfoResponse86, false);
                                    } else 

            if("GetAdHistoryObjects".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.GetHistoryObjectsResponse getHistoryObjectsResponse89 = null;
	                        api.eyeblaster.com.message.Ad.GetHistoryObjectsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.GetHistoryObjectsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.GetHistoryObjectsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryObjectsResponse89 =
                                                   
                                                   
                                                         skel.GetAdHistoryObjects(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryObjectsResponse89, false);
                                    } else 

            if("GetPreviewLinks".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.GetPreviewLinksResponse getPreviewLinksResponse92 = null;
	                        api.eyeblaster.com.message.Ad.GetPreviewLinksRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.GetPreviewLinksRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.GetPreviewLinksRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPreviewLinksResponse92 =
                                                   
                                                   
                                                         skel.GetPreviewLinks(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPreviewLinksResponse92, false);
                                    } else 

            if("DeleteAdAdditionalAsset".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.DeleteAdAdditionalAssetRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.DeleteAdAdditionalAssetRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.DeleteAdAdditionalAssetRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.DeleteAdAdditionalAsset(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("UpdateAdPanel".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.UpdateAdPanelResponse updateAdPanelResponse98 = null;
	                        api.eyeblaster.com.message.Ad.UpdateAdPanelRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.UpdateAdPanelRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.UpdateAdPanelRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateAdPanelResponse98 =
                                                   
                                                   
                                                         skel.UpdateAdPanel(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateAdPanelResponse98, false);
                                    } else 

            if("DuplicateAd".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.DuplicateAdReponse duplicateAdReponse101 = null;
	                        api.eyeblaster.com.message.Ad.DuplicateAdRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.DuplicateAdRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.DuplicateAdRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               duplicateAdReponse101 =
                                                   
                                                   
                                                         skel.DuplicateAd(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), duplicateAdReponse101, false);
                                    } else 

            if("DeleteAd3PartyTrackingURLById".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLResponse deleteAd3RdPartyTrackingURLResponse104 = null;
	                        api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteAd3RdPartyTrackingURLResponse104 =
                                                   
                                                   
                                                         skel.DeleteAd3PartyTrackingURLById(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteAd3RdPartyTrackingURLResponse104, false);
                                    } else 

            if("DeleteNotes".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.DeleteAdApprovalRemarkResponse deleteAdApprovalRemarkResponse107 = null;
	                        api.eyeblaster.com.message.Ad.DeleteAdApprovalRemarkRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.DeleteAdApprovalRemarkRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.DeleteAdApprovalRemarkRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteAdApprovalRemarkResponse107 =
                                                   
                                                   
                                                         skel.DeleteNotes(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteAdApprovalRemarkResponse107, false);
                                    } else 

            if("RejectAds".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.RejectAdsResponse rejectAdsResponse110 = null;
	                        api.eyeblaster.com.message.Ad.RejectAdsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.RejectAdsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.RejectAdsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               rejectAdsResponse110 =
                                                   
                                                   
                                                         skel.RejectAds(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), rejectAdsResponse110, false);
                                    } else 

            if("CreateAdAdditionalAsset".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.CreateAdAdditionalAssetResponse createAdAdditionalAssetResponse113 = null;
	                        api.eyeblaster.com.message.Ad.CreateAdAdditionalAssetRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.CreateAdAdditionalAssetRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.CreateAdAdditionalAssetRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createAdAdditionalAssetResponse113 =
                                                   
                                                   
                                                         skel.CreateAdAdditionalAsset(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createAdAdditionalAssetResponse113, false);
                                    } else 

            if("GetAllCategories".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.GetCategoriesResponse getCategoriesResponse116 = null;
	                        api.eyeblaster.com.message.Ad.GetCategoriesRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.GetCategoriesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.GetCategoriesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCategoriesResponse116 =
                                                   
                                                   
                                                         skel.GetAllCategories(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCategoriesResponse116, false);
                                    } else 

            if("DeleteInStreamVastCompanionAds".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.DeleteInStreamVastElementResponse deleteInStreamVastElementResponse119 = null;
	                        api.eyeblaster.com.message.Ad.DeleteInStreamVastCompanionAdsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.DeleteInStreamVastCompanionAdsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.DeleteInStreamVastCompanionAdsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteInStreamVastElementResponse119 =
                                                   
                                                   
                                                         skel.DeleteInStreamVastCompanionAds(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteInStreamVastElementResponse119, false);
                                    } else 

            if("AttachAds".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.AttachAdsResponse attachAdsResponse122 = null;
	                        api.eyeblaster.com.message.Ad.AttachAdsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.AttachAdsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.AttachAdsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               attachAdsResponse122 =
                                                   
                                                   
                                                         skel.AttachAds(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), attachAdsResponse122, false);
                                    } else 

            if("GetAdPanels".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.GetAdPanelsResponse getAdPanelsResponse125 = null;
	                        api.eyeblaster.com.message.Ad.GetAdPanelsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.GetAdPanelsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.GetAdPanelsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdPanelsResponse125 =
                                                   
                                                   
                                                         skel.GetAdPanels(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdPanelsResponse125, false);
                                    } else 

            if("UpdateAd3PartyTrackingURL".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.UpdateAd3RdPartyTrackingURLResponse updateAd3RdPartyTrackingURLResponse128 = null;
	                        api.eyeblaster.com.message.Ad.UpdateAd3RdPartyTrackingURLRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.UpdateAd3RdPartyTrackingURLRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.UpdateAd3RdPartyTrackingURLRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateAd3RdPartyTrackingURLResponse128 =
                                                   
                                                   
                                                         skel.UpdateAd3PartyTrackingURL(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateAd3RdPartyTrackingURLResponse128, false);
                                    } else 

            if("GetAgenciesOfAd".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.GetAgenciesOfAdResponse getAgenciesOfAdResponse131 = null;
	                        api.eyeblaster.com.message.Ad.GetAgenciesOfAdRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.GetAgenciesOfAdRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.GetAgenciesOfAdRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAgenciesOfAdResponse131 =
                                                   
                                                   
                                                         skel.GetAgenciesOfAd(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAgenciesOfAdResponse131, false);
                                    } else 

            if("DeleteAdPanel".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.DeleteAdPanelRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.DeleteAdPanelRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.DeleteAdPanelRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.DeleteAdPanel(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("CreateAdCustomLog".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.CreateAdCustomLogRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.CreateAdCustomLogRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.CreateAdCustomLogRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.CreateAdCustomLog(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("GetAdAdditionalAssets".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.GetAdAdditionalAssetsResponse getAdAdditionalAssetsResponse140 = null;
	                        api.eyeblaster.com.message.Ad.GetAdAdditionalAssetsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.GetAdAdditionalAssetsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.GetAdAdditionalAssetsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdAdditionalAssetsResponse140 =
                                                   
                                                   
                                                         skel.GetAdAdditionalAssets(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdAdditionalAssetsResponse140, false);
                                    } else 

            if("CreateAd".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.CreateAdResponse createAdResponse143 = null;
	                        api.eyeblaster.com.message.Ad.CreateAdRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.CreateAdRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.CreateAdRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createAdResponse143 =
                                                   
                                                   
                                                         skel.CreateAd(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createAdResponse143, false);
                                    } else 

            if("CreateNote".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.CreateAdApprovalRemarkResponse createAdApprovalRemarkResponse146 = null;
	                        api.eyeblaster.com.message.Ad.CreateAdApprovalRemarkRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.CreateAdApprovalRemarkRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.CreateAdApprovalRemarkRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createAdApprovalRemarkResponse146 =
                                                   
                                                   
                                                         skel.CreateNote(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createAdApprovalRemarkResponse146, false);
                                    } else 

            if("DeleteAds".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.DeleteAdsResponse deleteAdsResponse149 = null;
	                        api.eyeblaster.com.message.Ad.DeleteAdsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.DeleteAdsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.DeleteAdsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteAdsResponse149 =
                                                   
                                                   
                                                         skel.DeleteAds(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteAdsResponse149, false);
                                    } else 

            if("UpdateAdClassification".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.UpdateAdClassificationResponse updateAdClassificationResponse152 = null;
	                        api.eyeblaster.com.message.Ad.UpdateAdClassificationRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.UpdateAdClassificationRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.UpdateAdClassificationRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateAdClassificationResponse152 =
                                                   
                                                   
                                                         skel.UpdateAdClassification(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateAdClassificationResponse152, false);
                                    } else 

            if("GetAdHistoryActions".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.GetHistoryActionsResponse getHistoryActionsResponse155 = null;
	                        api.eyeblaster.com.message.Ad.GetHistoryActionsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.GetHistoryActionsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.GetHistoryActionsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryActionsResponse155 =
                                                   
                                                   
                                                         skel.GetAdHistoryActions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryActionsResponse155, false);
                                    } else 

            if("UpdateAds".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.UpdateAdsResponse updateAdsResponse158 = null;
	                        api.eyeblaster.com.message.Ad.UpdateAdsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.UpdateAdsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.UpdateAdsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateAdsResponse158 =
                                                   
                                                   
                                                         skel.UpdateAds(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateAdsResponse158, false);
                                    } else 

            if("GetAd3PartyTrackingURLsByAdId".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLsResponse getAd3RdPartyTrackingURLsResponse161 = null;
	                        api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAd3RdPartyTrackingURLsResponse161 =
                                                   
                                                   
                                                         skel.GetAd3PartyTrackingURLsByAdId(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAd3RdPartyTrackingURLsResponse161, false);
                                    } else 

            if("GetAdClassification".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.GetAdClassificationResponse getAdClassificationResponse164 = null;
	                        api.eyeblaster.com.message.Ad.GetAdClassificationRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.GetAdClassificationRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.GetAdClassificationRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdClassificationResponse164 =
                                                   
                                                   
                                                         skel.GetAdClassification(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdClassificationResponse164, false);
                                    } else 

            if("GetAdHistory".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.GetHistoryResponse getHistoryResponse167 = null;
	                        api.eyeblaster.com.message.Ad.GetAdHistoryRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.GetAdHistoryRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.GetAdHistoryRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryResponse167 =
                                                   
                                                   
                                                         skel.GetAdHistory(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryResponse167, false);
                                    } else 

            if("GetCampaignsOfAd".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.GetCampaignsOfAdResponse getCampaignsOfAdResponse170 = null;
	                        api.eyeblaster.com.message.Ad.GetCampaignsOfAdRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.GetCampaignsOfAdRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.GetCampaignsOfAdRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCampaignsOfAdResponse170 =
                                                   
                                                   
                                                         skel.GetCampaignsOfAd(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCampaignsOfAdResponse170, false);
                                    } else 

            if("GetAdPanel".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.GetAdPanelResponse getAdPanelResponse173 = null;
	                        api.eyeblaster.com.message.Ad.GetAdPanelRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.GetAdPanelRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.GetAdPanelRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdPanelResponse173 =
                                                   
                                                   
                                                         skel.GetAdPanel(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdPanelResponse173, false);
                                    } else 

            if("PublishAds".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.PublishAdsResponse publishAdsResponse176 = null;
	                        api.eyeblaster.com.message.Ad.PublishAdsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.PublishAdsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.PublishAdsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               publishAdsResponse176 =
                                                   
                                                   
                                                         skel.PublishAds(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), publishAdsResponse176, false);
                                    } else 

            if("GetAds".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.GetAdsResponse getAdsResponse179 = null;
	                        api.eyeblaster.com.message.Ad.GetAdsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.GetAdsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.GetAdsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdsResponse179 =
                                                   
                                                   
                                                         skel.GetAds(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdsResponse179, false);
                                    } else 

            if("GetAvailableFilters".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.GetAdFiltersResponse getAdFiltersResponse182 = null;
	                        api.eyeblaster.com.message.Ad.GetAdFiltersRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.GetAdFiltersRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.GetAdFiltersRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdFiltersResponse182 =
                                                   
                                                   
                                                         skel.GetAvailableFilters(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdFiltersResponse182, false);
                                    } else 

            if("GetAdInteractions".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.GetAdInteractionsResponse getAdInteractionsResponse185 = null;
	                        api.eyeblaster.com.message.Ad.GetAdInteractionsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.GetAdInteractionsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.GetAdInteractionsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdInteractionsResponse185 =
                                                   
                                                   
                                                         skel.GetAdInteractions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdInteractionsResponse185, false);
                                    } else 

            if("GetAdAdditionalAsset".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.GetAdAdditionalAssetResponse getAdAdditionalAssetResponse188 = null;
	                        api.eyeblaster.com.message.Ad.GetAdAdditionalAssetRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.GetAdAdditionalAssetRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.GetAdAdditionalAssetRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdAdditionalAssetResponse188 =
                                                   
                                                   
                                                         skel.GetAdAdditionalAsset(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdAdditionalAssetResponse188, false);
                                    } else 

            if("SetDefaultPanel".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.SetDefaultPanelResponse setDefaultPanelResponse191 = null;
	                        api.eyeblaster.com.message.Ad.SetDefaultPanelRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.SetDefaultPanelRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.SetDefaultPanelRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               setDefaultPanelResponse191 =
                                                   
                                                   
                                                         skel.SetDefaultPanel(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), setDefaultPanelResponse191, false);
                                    } else 

            if("GetCategory".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.GetAdCategoryResponse getAdCategoryResponse194 = null;
	                        api.eyeblaster.com.message.Ad.GetCategoryRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.GetCategoryRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.GetCategoryRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdCategoryResponse194 =
                                                   
                                                   
                                                         skel.GetCategory(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdCategoryResponse194, false);
                                    } else 

            if("SetAdFilters".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.GetAdSpecificFiltersResponse getAdSpecificFiltersResponse197 = null;
	                        api.eyeblaster.com.message.Ad.SetAdFiltersRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.SetAdFiltersRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.SetAdFiltersRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdSpecificFiltersResponse197 =
                                                   
                                                   
                                                         skel.SetAdFilters(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdSpecificFiltersResponse197, false);
                                    } else 

            if("CreateAdPanel".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.CreateAdPanelResponse createAdPanelResponse200 = null;
	                        api.eyeblaster.com.message.Ad.CreateAdPanelRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.CreateAdPanelRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.CreateAdPanelRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createAdPanelResponse200 =
                                                   
                                                   
                                                         skel.CreateAdPanel(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createAdPanelResponse200, false);
                                    } else 

            if("UpdateNote".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.UpdateAdApprovalRemarkResponse updateAdApprovalRemarkResponse203 = null;
	                        api.eyeblaster.com.message.Ad.UpdateAdApprovalRemarkRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.UpdateAdApprovalRemarkRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.UpdateAdApprovalRemarkRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateAdApprovalRemarkResponse203 =
                                                   
                                                   
                                                         skel.UpdateNote(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateAdApprovalRemarkResponse203, false);
                                    } else 

            if("CreateAd3PartyTrackingURL".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.CreateAd3RdPartyTrackingURLResponse createAd3RdPartyTrackingURLResponse206 = null;
	                        api.eyeblaster.com.message.Ad.CreateAd3RdPartyTrackingURLRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.CreateAd3RdPartyTrackingURLRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.CreateAd3RdPartyTrackingURLRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createAd3RdPartyTrackingURLResponse206 =
                                                   
                                                   
                                                         skel.CreateAd3PartyTrackingURL(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createAd3RdPartyTrackingURLResponse206, false);
                                    } else 

            if("DeleteAd3PartyTrackingURLsByAdId".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLResponse deleteAd3RdPartyTrackingURLResponse209 = null;
	                        api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteAd3RdPartyTrackingURLResponse209 =
                                                   
                                                   
                                                         skel.DeleteAd3PartyTrackingURLsByAdId(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteAd3RdPartyTrackingURLResponse209, false);
                                    } else 

            if("GetNotes".equals(methodName)){
                
                api.eyeblaster.com.message.Ad.GetAdApprovalRemarksResponse getAdApprovalRemarksResponse212 = null;
	                        api.eyeblaster.com.message.Ad.GetAdApprovalRemarksRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Ad.GetAdApprovalRemarksRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Ad.GetAdApprovalRemarksRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdApprovalRemarksResponse212 =
                                                   
                                                   
                                                         skel.GetNotes(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdApprovalRemarksResponse212, false);
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdSpecificFiltersRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdSpecificFiltersRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdSpecificFiltersResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdSpecificFiltersResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.UserSecurityToken param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.UserSecurityToken.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetPlacementsOfAdRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetPlacementsOfAdRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetPlacementsOfAdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetPlacementsOfAdResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.CreateAdClassificationRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.CreateAdClassificationRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.CreateAdClassificationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.CreateAdClassificationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.DeleteInStreamVastAssetsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.DeleteInStreamVastAssetsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.DeleteInStreamVastElementResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.DeleteInStreamVastElementResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.UpdateAdRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.UpdateAdRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.UpdateAdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.UpdateAdResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.UpdateAdInteractionsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.UpdateAdInteractionsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.UpdateAdInteractionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.UpdateAdInteractionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.UpdateAdAdditionalAssetRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.UpdateAdAdditionalAssetRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.UpdateAdAdditionalAssetResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.UpdateAdAdditionalAssetResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdsBasicInfoRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdsBasicInfoRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdsBasicInfoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdsBasicInfoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetHistoryObjectsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetHistoryObjectsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetHistoryObjectsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetHistoryObjectsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetPreviewLinksRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetPreviewLinksRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetPreviewLinksResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetPreviewLinksResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.DeleteAdAdditionalAssetRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.DeleteAdAdditionalAssetRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.UpdateAdPanelRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.UpdateAdPanelRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.UpdateAdPanelResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.UpdateAdPanelResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.DuplicateAdRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.DuplicateAdRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.DuplicateAdReponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.DuplicateAdReponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.DeleteAdApprovalRemarkRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.DeleteAdApprovalRemarkRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.DeleteAdApprovalRemarkResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.DeleteAdApprovalRemarkResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.RejectAdsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.RejectAdsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.RejectAdsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.RejectAdsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.CreateAdAdditionalAssetRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.CreateAdAdditionalAssetRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.CreateAdAdditionalAssetResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.CreateAdAdditionalAssetResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetCategoriesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetCategoriesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetCategoriesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetCategoriesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.DeleteInStreamVastCompanionAdsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.DeleteInStreamVastCompanionAdsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.AttachAdsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.AttachAdsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.AttachAdsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.AttachAdsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdPanelsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdPanelsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdPanelsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdPanelsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.UpdateAd3RdPartyTrackingURLRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.UpdateAd3RdPartyTrackingURLRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.UpdateAd3RdPartyTrackingURLResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.UpdateAd3RdPartyTrackingURLResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAgenciesOfAdRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAgenciesOfAdRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAgenciesOfAdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAgenciesOfAdResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.DeleteAdPanelRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.DeleteAdPanelRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.CreateAdCustomLogRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.CreateAdCustomLogRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdAdditionalAssetsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdAdditionalAssetsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdAdditionalAssetsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdAdditionalAssetsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.CreateAdRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.CreateAdRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.CreateAdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.CreateAdResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.CreateAdApprovalRemarkRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.CreateAdApprovalRemarkRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.CreateAdApprovalRemarkResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.CreateAdApprovalRemarkResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.DeleteAdsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.DeleteAdsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.DeleteAdsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.DeleteAdsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.UpdateAdClassificationRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.UpdateAdClassificationRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.UpdateAdClassificationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.UpdateAdClassificationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetHistoryActionsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetHistoryActionsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetHistoryActionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetHistoryActionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.UpdateAdsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.UpdateAdsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.UpdateAdsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.UpdateAdsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdClassificationRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdClassificationRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdClassificationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdClassificationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdHistoryRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdHistoryRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetHistoryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetHistoryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetCampaignsOfAdRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetCampaignsOfAdRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetCampaignsOfAdResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetCampaignsOfAdResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdPanelRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdPanelRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdPanelResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdPanelResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.PublishAdsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.PublishAdsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.PublishAdsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.PublishAdsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdFiltersRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdFiltersRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdFiltersResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdFiltersResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdInteractionsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdInteractionsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdInteractionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdInteractionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdAdditionalAssetRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdAdditionalAssetRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdAdditionalAssetResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdAdditionalAssetResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.SetDefaultPanelRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.SetDefaultPanelRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.SetDefaultPanelResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.SetDefaultPanelResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetCategoryRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetCategoryRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdCategoryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdCategoryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.SetAdFiltersRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.SetAdFiltersRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.CreateAdPanelRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.CreateAdPanelRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.CreateAdPanelResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.CreateAdPanelResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.UpdateAdApprovalRemarkRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.UpdateAdApprovalRemarkRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.UpdateAdApprovalRemarkResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.UpdateAdApprovalRemarkResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.CreateAd3RdPartyTrackingURLRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.CreateAd3RdPartyTrackingURLRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.CreateAd3RdPartyTrackingURLResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.CreateAd3RdPartyTrackingURLResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdApprovalRemarksRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdApprovalRemarksRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Ad.GetAdApprovalRemarksResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Ad.GetAdApprovalRemarksResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.GetAdSpecificFiltersResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.GetAdSpecificFiltersResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.GetAdSpecificFiltersResponse wrapGetAdFilters(){
                                api.eyeblaster.com.message.Ad.GetAdSpecificFiltersResponse wrappedElement = new api.eyeblaster.com.message.Ad.GetAdSpecificFiltersResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.GetPlacementsOfAdResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.GetPlacementsOfAdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.GetPlacementsOfAdResponse wrapGetPlacementsOfAd(){
                                api.eyeblaster.com.message.Ad.GetPlacementsOfAdResponse wrappedElement = new api.eyeblaster.com.message.Ad.GetPlacementsOfAdResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.CreateAdClassificationResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.CreateAdClassificationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.CreateAdClassificationResponse wrapCreateAdClassification(){
                                api.eyeblaster.com.message.Ad.CreateAdClassificationResponse wrappedElement = new api.eyeblaster.com.message.Ad.CreateAdClassificationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.GetAdResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.GetAdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.GetAdResponse wrapGetAd(){
                                api.eyeblaster.com.message.Ad.GetAdResponse wrappedElement = new api.eyeblaster.com.message.Ad.GetAdResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.DeleteInStreamVastElementResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.DeleteInStreamVastElementResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.DeleteInStreamVastElementResponse wrapDeleteInStreamVastAssets(){
                                api.eyeblaster.com.message.Ad.DeleteInStreamVastElementResponse wrappedElement = new api.eyeblaster.com.message.Ad.DeleteInStreamVastElementResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLResponse wrapGetAd3PartyTrackingURLById(){
                                api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLResponse wrappedElement = new api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.UpdateAdResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.UpdateAdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.UpdateAdResponse wrapUpdateAd(){
                                api.eyeblaster.com.message.Ad.UpdateAdResponse wrappedElement = new api.eyeblaster.com.message.Ad.UpdateAdResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.UpdateAdInteractionsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.UpdateAdInteractionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.UpdateAdInteractionsResponse wrapUpdateAdInteractions(){
                                api.eyeblaster.com.message.Ad.UpdateAdInteractionsResponse wrappedElement = new api.eyeblaster.com.message.Ad.UpdateAdInteractionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.UpdateAdAdditionalAssetResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.UpdateAdAdditionalAssetResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.UpdateAdAdditionalAssetResponse wrapUpdateAdAdditionalAsset(){
                                api.eyeblaster.com.message.Ad.UpdateAdAdditionalAssetResponse wrappedElement = new api.eyeblaster.com.message.Ad.UpdateAdAdditionalAssetResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.GetAdsBasicInfoResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.GetAdsBasicInfoResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.GetAdsBasicInfoResponse wrapGetAdsBasicInfo(){
                                api.eyeblaster.com.message.Ad.GetAdsBasicInfoResponse wrappedElement = new api.eyeblaster.com.message.Ad.GetAdsBasicInfoResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.GetHistoryObjectsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.GetHistoryObjectsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.GetHistoryObjectsResponse wrapGetAdHistoryObjects(){
                                api.eyeblaster.com.message.Ad.GetHistoryObjectsResponse wrappedElement = new api.eyeblaster.com.message.Ad.GetHistoryObjectsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.GetPreviewLinksResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.GetPreviewLinksResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.GetPreviewLinksResponse wrapGetPreviewLinks(){
                                api.eyeblaster.com.message.Ad.GetPreviewLinksResponse wrappedElement = new api.eyeblaster.com.message.Ad.GetPreviewLinksResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.UpdateAdPanelResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.UpdateAdPanelResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.UpdateAdPanelResponse wrapUpdateAdPanel(){
                                api.eyeblaster.com.message.Ad.UpdateAdPanelResponse wrappedElement = new api.eyeblaster.com.message.Ad.UpdateAdPanelResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.DuplicateAdReponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.DuplicateAdReponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.DuplicateAdReponse wrapDuplicateAd(){
                                api.eyeblaster.com.message.Ad.DuplicateAdReponse wrappedElement = new api.eyeblaster.com.message.Ad.DuplicateAdReponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLResponse wrapDeleteAd3PartyTrackingURLById(){
                                api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLResponse wrappedElement = new api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.DeleteAdApprovalRemarkResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.DeleteAdApprovalRemarkResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.DeleteAdApprovalRemarkResponse wrapDeleteNotes(){
                                api.eyeblaster.com.message.Ad.DeleteAdApprovalRemarkResponse wrappedElement = new api.eyeblaster.com.message.Ad.DeleteAdApprovalRemarkResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.RejectAdsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.RejectAdsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.RejectAdsResponse wrapRejectAds(){
                                api.eyeblaster.com.message.Ad.RejectAdsResponse wrappedElement = new api.eyeblaster.com.message.Ad.RejectAdsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.CreateAdAdditionalAssetResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.CreateAdAdditionalAssetResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.CreateAdAdditionalAssetResponse wrapCreateAdAdditionalAsset(){
                                api.eyeblaster.com.message.Ad.CreateAdAdditionalAssetResponse wrappedElement = new api.eyeblaster.com.message.Ad.CreateAdAdditionalAssetResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.GetCategoriesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.GetCategoriesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.GetCategoriesResponse wrapGetAllCategories(){
                                api.eyeblaster.com.message.Ad.GetCategoriesResponse wrappedElement = new api.eyeblaster.com.message.Ad.GetCategoriesResponse();
                                return wrappedElement;
                         }
                    
                         private api.eyeblaster.com.message.Ad.DeleteInStreamVastElementResponse wrapDeleteInStreamVastCompanionAds(){
                                api.eyeblaster.com.message.Ad.DeleteInStreamVastElementResponse wrappedElement = new api.eyeblaster.com.message.Ad.DeleteInStreamVastElementResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.AttachAdsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.AttachAdsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.AttachAdsResponse wrapAttachAds(){
                                api.eyeblaster.com.message.Ad.AttachAdsResponse wrappedElement = new api.eyeblaster.com.message.Ad.AttachAdsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.GetAdPanelsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.GetAdPanelsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.GetAdPanelsResponse wrapGetAdPanels(){
                                api.eyeblaster.com.message.Ad.GetAdPanelsResponse wrappedElement = new api.eyeblaster.com.message.Ad.GetAdPanelsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.UpdateAd3RdPartyTrackingURLResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.UpdateAd3RdPartyTrackingURLResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.UpdateAd3RdPartyTrackingURLResponse wrapUpdateAd3PartyTrackingURL(){
                                api.eyeblaster.com.message.Ad.UpdateAd3RdPartyTrackingURLResponse wrappedElement = new api.eyeblaster.com.message.Ad.UpdateAd3RdPartyTrackingURLResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.GetAgenciesOfAdResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.GetAgenciesOfAdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.GetAgenciesOfAdResponse wrapGetAgenciesOfAd(){
                                api.eyeblaster.com.message.Ad.GetAgenciesOfAdResponse wrappedElement = new api.eyeblaster.com.message.Ad.GetAgenciesOfAdResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.GetAdAdditionalAssetsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.GetAdAdditionalAssetsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.GetAdAdditionalAssetsResponse wrapGetAdAdditionalAssets(){
                                api.eyeblaster.com.message.Ad.GetAdAdditionalAssetsResponse wrappedElement = new api.eyeblaster.com.message.Ad.GetAdAdditionalAssetsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.CreateAdResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.CreateAdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.CreateAdResponse wrapCreateAd(){
                                api.eyeblaster.com.message.Ad.CreateAdResponse wrappedElement = new api.eyeblaster.com.message.Ad.CreateAdResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.CreateAdApprovalRemarkResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.CreateAdApprovalRemarkResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.CreateAdApprovalRemarkResponse wrapCreateNote(){
                                api.eyeblaster.com.message.Ad.CreateAdApprovalRemarkResponse wrappedElement = new api.eyeblaster.com.message.Ad.CreateAdApprovalRemarkResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.DeleteAdsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.DeleteAdsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.DeleteAdsResponse wrapDeleteAds(){
                                api.eyeblaster.com.message.Ad.DeleteAdsResponse wrappedElement = new api.eyeblaster.com.message.Ad.DeleteAdsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.UpdateAdClassificationResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.UpdateAdClassificationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.UpdateAdClassificationResponse wrapUpdateAdClassification(){
                                api.eyeblaster.com.message.Ad.UpdateAdClassificationResponse wrappedElement = new api.eyeblaster.com.message.Ad.UpdateAdClassificationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.GetHistoryActionsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.GetHistoryActionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.GetHistoryActionsResponse wrapGetAdHistoryActions(){
                                api.eyeblaster.com.message.Ad.GetHistoryActionsResponse wrappedElement = new api.eyeblaster.com.message.Ad.GetHistoryActionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.UpdateAdsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.UpdateAdsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.UpdateAdsResponse wrapUpdateAds(){
                                api.eyeblaster.com.message.Ad.UpdateAdsResponse wrappedElement = new api.eyeblaster.com.message.Ad.UpdateAdsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLsResponse wrapGetAd3PartyTrackingURLsByAdId(){
                                api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLsResponse wrappedElement = new api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.GetAdClassificationResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.GetAdClassificationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.GetAdClassificationResponse wrapGetAdClassification(){
                                api.eyeblaster.com.message.Ad.GetAdClassificationResponse wrappedElement = new api.eyeblaster.com.message.Ad.GetAdClassificationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.GetHistoryResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.GetHistoryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.GetHistoryResponse wrapGetAdHistory(){
                                api.eyeblaster.com.message.Ad.GetHistoryResponse wrappedElement = new api.eyeblaster.com.message.Ad.GetHistoryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.GetCampaignsOfAdResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.GetCampaignsOfAdResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.GetCampaignsOfAdResponse wrapGetCampaignsOfAd(){
                                api.eyeblaster.com.message.Ad.GetCampaignsOfAdResponse wrappedElement = new api.eyeblaster.com.message.Ad.GetCampaignsOfAdResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.GetAdPanelResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.GetAdPanelResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.GetAdPanelResponse wrapGetAdPanel(){
                                api.eyeblaster.com.message.Ad.GetAdPanelResponse wrappedElement = new api.eyeblaster.com.message.Ad.GetAdPanelResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.PublishAdsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.PublishAdsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.PublishAdsResponse wrapPublishAds(){
                                api.eyeblaster.com.message.Ad.PublishAdsResponse wrappedElement = new api.eyeblaster.com.message.Ad.PublishAdsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.GetAdsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.GetAdsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.GetAdsResponse wrapGetAds(){
                                api.eyeblaster.com.message.Ad.GetAdsResponse wrappedElement = new api.eyeblaster.com.message.Ad.GetAdsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.GetAdFiltersResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.GetAdFiltersResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.GetAdFiltersResponse wrapGetAvailableFilters(){
                                api.eyeblaster.com.message.Ad.GetAdFiltersResponse wrappedElement = new api.eyeblaster.com.message.Ad.GetAdFiltersResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.GetAdInteractionsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.GetAdInteractionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.GetAdInteractionsResponse wrapGetAdInteractions(){
                                api.eyeblaster.com.message.Ad.GetAdInteractionsResponse wrappedElement = new api.eyeblaster.com.message.Ad.GetAdInteractionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.GetAdAdditionalAssetResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.GetAdAdditionalAssetResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.GetAdAdditionalAssetResponse wrapGetAdAdditionalAsset(){
                                api.eyeblaster.com.message.Ad.GetAdAdditionalAssetResponse wrappedElement = new api.eyeblaster.com.message.Ad.GetAdAdditionalAssetResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.SetDefaultPanelResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.SetDefaultPanelResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.SetDefaultPanelResponse wrapSetDefaultPanel(){
                                api.eyeblaster.com.message.Ad.SetDefaultPanelResponse wrappedElement = new api.eyeblaster.com.message.Ad.SetDefaultPanelResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.GetAdCategoryResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.GetAdCategoryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.GetAdCategoryResponse wrapGetCategory(){
                                api.eyeblaster.com.message.Ad.GetAdCategoryResponse wrappedElement = new api.eyeblaster.com.message.Ad.GetAdCategoryResponse();
                                return wrappedElement;
                         }
                    
                         private api.eyeblaster.com.message.Ad.GetAdSpecificFiltersResponse wrapSetAdFilters(){
                                api.eyeblaster.com.message.Ad.GetAdSpecificFiltersResponse wrappedElement = new api.eyeblaster.com.message.Ad.GetAdSpecificFiltersResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.CreateAdPanelResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.CreateAdPanelResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.CreateAdPanelResponse wrapCreateAdPanel(){
                                api.eyeblaster.com.message.Ad.CreateAdPanelResponse wrappedElement = new api.eyeblaster.com.message.Ad.CreateAdPanelResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.UpdateAdApprovalRemarkResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.UpdateAdApprovalRemarkResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.UpdateAdApprovalRemarkResponse wrapUpdateNote(){
                                api.eyeblaster.com.message.Ad.UpdateAdApprovalRemarkResponse wrappedElement = new api.eyeblaster.com.message.Ad.UpdateAdApprovalRemarkResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.CreateAd3RdPartyTrackingURLResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.CreateAd3RdPartyTrackingURLResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.CreateAd3RdPartyTrackingURLResponse wrapCreateAd3PartyTrackingURL(){
                                api.eyeblaster.com.message.Ad.CreateAd3RdPartyTrackingURLResponse wrappedElement = new api.eyeblaster.com.message.Ad.CreateAd3RdPartyTrackingURLResponse();
                                return wrappedElement;
                         }
                    
                         private api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLResponse wrapDeleteAd3PartyTrackingURLsByAdId(){
                                api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLResponse wrappedElement = new api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Ad.GetAdApprovalRemarksResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Ad.GetAdApprovalRemarksResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Ad.GetAdApprovalRemarksResponse wrapGetNotes(){
                                api.eyeblaster.com.message.Ad.GetAdApprovalRemarksResponse wrappedElement = new api.eyeblaster.com.message.Ad.GetAdApprovalRemarksResponse();
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
        
                if (api.eyeblaster.com.message.Ad.GetAdSpecificFiltersRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdSpecificFiltersRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdSpecificFiltersResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdSpecificFiltersResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetPlacementsOfAdRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetPlacementsOfAdRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetPlacementsOfAdResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetPlacementsOfAdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.CreateAdClassificationRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.CreateAdClassificationRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.CreateAdClassificationResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.CreateAdClassificationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.DeleteInStreamVastAssetsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.DeleteInStreamVastAssetsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.DeleteInStreamVastElementResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.DeleteInStreamVastElementResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UpdateAdRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UpdateAdRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UpdateAdResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UpdateAdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UpdateAdInteractionsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UpdateAdInteractionsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UpdateAdInteractionsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UpdateAdInteractionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UpdateAdAdditionalAssetRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UpdateAdAdditionalAssetRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UpdateAdAdditionalAssetResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UpdateAdAdditionalAssetResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdsBasicInfoRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdsBasicInfoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdsBasicInfoResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdsBasicInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetHistoryObjectsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetHistoryObjectsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetHistoryObjectsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetHistoryObjectsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetPreviewLinksRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetPreviewLinksRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetPreviewLinksResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetPreviewLinksResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.DeleteAdAdditionalAssetRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.DeleteAdAdditionalAssetRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UpdateAdPanelRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UpdateAdPanelRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UpdateAdPanelResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UpdateAdPanelResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.DuplicateAdRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.DuplicateAdRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.DuplicateAdReponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.DuplicateAdReponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.DeleteAdApprovalRemarkRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.DeleteAdApprovalRemarkRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.DeleteAdApprovalRemarkResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.DeleteAdApprovalRemarkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.RejectAdsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.RejectAdsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.RejectAdsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.RejectAdsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.CreateAdAdditionalAssetRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.CreateAdAdditionalAssetRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.CreateAdAdditionalAssetResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.CreateAdAdditionalAssetResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetCategoriesRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetCategoriesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetCategoriesResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetCategoriesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.DeleteInStreamVastCompanionAdsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.DeleteInStreamVastCompanionAdsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.DeleteInStreamVastElementResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.DeleteInStreamVastElementResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.AttachAdsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.AttachAdsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.AttachAdsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.AttachAdsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdPanelsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdPanelsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdPanelsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdPanelsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UpdateAd3RdPartyTrackingURLRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UpdateAd3RdPartyTrackingURLRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UpdateAd3RdPartyTrackingURLResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UpdateAd3RdPartyTrackingURLResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAgenciesOfAdRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAgenciesOfAdRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAgenciesOfAdResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAgenciesOfAdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.DeleteAdPanelRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.DeleteAdPanelRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.CreateAdCustomLogRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.CreateAdCustomLogRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdAdditionalAssetsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdAdditionalAssetsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdAdditionalAssetsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdAdditionalAssetsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.CreateAdRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.CreateAdRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.CreateAdResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.CreateAdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.CreateAdApprovalRemarkRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.CreateAdApprovalRemarkRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.CreateAdApprovalRemarkResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.CreateAdApprovalRemarkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.DeleteAdsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.DeleteAdsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.DeleteAdsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.DeleteAdsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UpdateAdClassificationRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UpdateAdClassificationRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UpdateAdClassificationResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UpdateAdClassificationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetHistoryActionsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetHistoryActionsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetHistoryActionsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetHistoryActionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UpdateAdsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UpdateAdsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UpdateAdsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UpdateAdsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAd3RdPartyTrackingURLsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdClassificationRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdClassificationRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdClassificationResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdClassificationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdHistoryRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdHistoryRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetHistoryResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetHistoryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetCampaignsOfAdRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetCampaignsOfAdRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetCampaignsOfAdResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetCampaignsOfAdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdPanelRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdPanelRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdPanelResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdPanelResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.PublishAdsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.PublishAdsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.PublishAdsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.PublishAdsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdFiltersRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdFiltersRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdFiltersResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdFiltersResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdInteractionsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdInteractionsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdInteractionsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdInteractionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdAdditionalAssetRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdAdditionalAssetRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdAdditionalAssetResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdAdditionalAssetResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.SetDefaultPanelRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.SetDefaultPanelRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.SetDefaultPanelResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.SetDefaultPanelResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetCategoryRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetCategoryRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdCategoryResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdCategoryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.SetAdFiltersRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.SetAdFiltersRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdSpecificFiltersResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdSpecificFiltersResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.CreateAdPanelRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.CreateAdPanelRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.CreateAdPanelResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.CreateAdPanelResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UpdateAdApprovalRemarkRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UpdateAdApprovalRemarkRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UpdateAdApprovalRemarkResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UpdateAdApprovalRemarkResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.CreateAd3RdPartyTrackingURLRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.CreateAd3RdPartyTrackingURLRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.CreateAd3RdPartyTrackingURLResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.CreateAd3RdPartyTrackingURLResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.DeleteAd3RdPartyTrackingURLResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdApprovalRemarksRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdApprovalRemarksRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.GetAdApprovalRemarksResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.GetAdApprovalRemarksResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Ad.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Ad.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    