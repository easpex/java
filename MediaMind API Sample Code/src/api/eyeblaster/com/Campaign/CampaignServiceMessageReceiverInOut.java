
/**
 * CampaignServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */
        package api.eyeblaster.com.Campaign;

        /**
        *  CampaignServiceMessageReceiverInOut message receiver
        */

        public class CampaignServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        CampaignServiceSkeleton skel = (CampaignServiceSkeleton)obj;
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
                
                api.eyeblaster.com.message.Campaign.GetMarketsResponse getMarketsResponse34 = null;
	                        api.eyeblaster.com.message.Campaign.GetMarketsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.GetMarketsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.GetMarketsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMarketsResponse34 =
                                                   
                                                   
                                                         skel.GetMarkets(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMarketsResponse34, false);
                                    } else 

            if("GetContact".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.GetContactResponse getContactResponse37 = null;
	                        api.eyeblaster.com.message.Campaign.GetContactRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.GetContactRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.GetContactRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getContactResponse37 =
                                                   
                                                   
                                                         skel.GetContact(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getContactResponse37, false);
                                    } else 

            if("GetMonitorDelivery".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.GetMonitorDeliveryResponse getMonitorDeliveryResponse40 = null;
	                        api.eyeblaster.com.message.Campaign.GetMonitorDeliveryRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.GetMonitorDeliveryRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.GetMonitorDeliveryRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMonitorDeliveryResponse40 =
                                                   
                                                   
                                                         skel.GetMonitorDelivery(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMonitorDeliveryResponse40, false);
                                    } else 

            if("CreateCampaignCustomLog".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.CreateCampaignCustomLogRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.CreateCampaignCustomLogRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.CreateCampaignCustomLogRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.CreateCampaignCustomLog(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("GetOffices".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.GetOfficesResponse getOfficesResponse46 = null;
	                        api.eyeblaster.com.message.Campaign.GetOfficesRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.GetOfficesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.GetOfficesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getOfficesResponse46 =
                                                   
                                                   
                                                         skel.GetOffices(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getOfficesResponse46, false);
                                    } else 

            if("GetAgencyContacts".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.GetAgencyContactsResponse getAgencyContactsResponse49 = null;
	                        api.eyeblaster.com.message.Campaign.GetAgencyContactsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.GetAgencyContactsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.GetAgencyContactsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAgencyContactsResponse49 =
                                                   
                                                   
                                                         skel.GetAgencyContacts(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAgencyContactsResponse49, false);
                                    } else 

            if("DeleteCampaign".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.DeleteCampaignsResponse deleteCampaignsResponse52 = null;
	                        api.eyeblaster.com.message.Campaign.DeleteCampaignRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.DeleteCampaignRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.DeleteCampaignRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteCampaignsResponse52 =
                                                   
                                                   
                                                         skel.DeleteCampaign(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteCampaignsResponse52, false);
                                    } else 

            if("PublishCampaign".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.PublishCampaignResponse publishCampaignResponse55 = null;
	                        api.eyeblaster.com.message.Campaign.PublishCampaignRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.PublishCampaignRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.PublishCampaignRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               publishCampaignResponse55 =
                                                   
                                                   
                                                         skel.PublishCampaign(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), publishCampaignResponse55, false);
                                    } else 

            if("GetCampaignHistory".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.GetHistoryResponse getHistoryResponse58 = null;
	                        api.eyeblaster.com.message.Campaign.GetCampaignHistoryRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.GetCampaignHistoryRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.GetCampaignHistoryRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryResponse58 =
                                                   
                                                   
                                                         skel.GetCampaignHistory(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryResponse58, false);
                                    } else 

            if("GetCreativeShops".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.GetCreativeShopsResponse getCreativeShopsResponse61 = null;
	                        api.eyeblaster.com.message.Campaign.GetCreativeShopsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.GetCreativeShopsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.GetCreativeShopsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCreativeShopsResponse61 =
                                                   
                                                   
                                                         skel.GetCreativeShops(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCreativeShopsResponse61, false);
                                    } else 

            if("EnableAutomaticOptimizationOnCampaign".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.EnableAutomaticOptimizationResponse enableAutomaticOptimizationResponse64 = null;
	                        api.eyeblaster.com.message.Campaign.EnableAutomaticOptimizationRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.EnableAutomaticOptimizationRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.EnableAutomaticOptimizationRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               enableAutomaticOptimizationResponse64 =
                                                   
                                                   
                                                         skel.EnableAutomaticOptimizationOnCampaign(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), enableAutomaticOptimizationResponse64, false);
                                    } else 

            if("GetTargetRegionTree".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.GetTargetRegionResponse getTargetRegionResponse67 = null;
	                        api.eyeblaster.com.message.Campaign.GetTargetRegionRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.GetTargetRegionRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.GetTargetRegionRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTargetRegionResponse67 =
                                                   
                                                   
                                                         skel.GetTargetRegionTree(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTargetRegionResponse67, false);
                                    } else 

            if("CreateContact".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.CreateContactResponse createContactResponse70 = null;
	                        api.eyeblaster.com.message.Campaign.CreateContactRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.CreateContactRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.CreateContactRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createContactResponse70 =
                                                   
                                                   
                                                         skel.CreateContact(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createContactResponse70, false);
                                    } else 

            if("GetSiteContacts".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.GetSiteContactsResponse getSiteContactsResponse73 = null;
	                        api.eyeblaster.com.message.Campaign.GetSiteContactsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.GetSiteContactsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.GetSiteContactsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSiteContactsResponse73 =
                                                   
                                                   
                                                         skel.GetSiteContacts(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSiteContactsResponse73, false);
                                    } else 

            if("GetCampaignHistoryActions".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.GetHistoryActionsResponse getHistoryActionsResponse76 = null;
	                        api.eyeblaster.com.message.Campaign.GetHistoryActionsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.GetHistoryActionsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.GetHistoryActionsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryActionsResponse76 =
                                                   
                                                   
                                                         skel.GetCampaignHistoryActions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryActionsResponse76, false);
                                    } else 

            if("GetCampaignsBasicInfo".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.GetCampaignsBasicInfoResponse getCampaignsBasicInfoResponse79 = null;
	                        api.eyeblaster.com.message.Campaign.GetCampaignsBasicInfoRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.GetCampaignsBasicInfoRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.GetCampaignsBasicInfoRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCampaignsBasicInfoResponse79 =
                                                   
                                                   
                                                         skel.GetCampaignsBasicInfo(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCampaignsBasicInfoResponse79, false);
                                    } else 

            if("GetAgencies".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.GetAgenciesResponse getAgenciesResponse82 = null;
	                        api.eyeblaster.com.message.Campaign.GetAgenciesRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.GetAgenciesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.GetAgenciesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAgenciesResponse82 =
                                                   
                                                   
                                                         skel.GetAgencies(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAgenciesResponse82, false);
                                    } else 

            if("GenerateIOForCampaign".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.GenerateIOForCampaignResponse generateIOForCampaignResponse85 = null;
	                        api.eyeblaster.com.message.Campaign.GenerateIOForCampaignRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.GenerateIOForCampaignRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.GenerateIOForCampaignRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               generateIOForCampaignResponse85 =
                                                   
                                                   
                                                         skel.GenerateIOForCampaign(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), generateIOForCampaignResponse85, false);
                                    } else 

            if("GetCreativeShopContacts".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.GetCreativeShopResponse getCreativeShopResponse88 = null;
	                        api.eyeblaster.com.message.Campaign.GetCreativeShopRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.GetCreativeShopRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.GetCreativeShopRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCreativeShopResponse88 =
                                                   
                                                   
                                                         skel.GetCreativeShopContacts(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCreativeShopResponse88, false);
                                    } else 

            if("UpdateCampaignInteractions".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.UpdateCampaignInteractionsResponse updateCampaignInteractionsResponse91 = null;
	                        api.eyeblaster.com.message.Campaign.UpdateCampaignInteractionsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.UpdateCampaignInteractionsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.UpdateCampaignInteractionsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateCampaignInteractionsResponse91 =
                                                   
                                                   
                                                         skel.UpdateCampaignInteractions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateCampaignInteractionsResponse91, false);
                                    } else 

            if("GetCampaignSites".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.GetCampaignSitesResponse getCampaignSitesResponse94 = null;
	                        api.eyeblaster.com.message.Campaign.GetCampaignSitesRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.GetCampaignSitesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.GetCampaignSitesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCampaignSitesResponse94 =
                                                   
                                                   
                                                         skel.GetCampaignSites(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCampaignSitesResponse94, false);
                                    } else 

            if("GetAllSiteContacts".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.GetSiteContactsResponse getSiteContactsResponse97 = null;
	                        api.eyeblaster.com.message.Campaign.GetCampaignSiteContactsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.GetCampaignSiteContactsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.GetCampaignSiteContactsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSiteContactsResponse97 =
                                                   
                                                   
                                                         skel.GetAllSiteContacts(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSiteContactsResponse97, false);
                                    } else 

            if("GetAdSnaps".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.GetAdSnapResponse getAdSnapResponse100 = null;
	                        api.eyeblaster.com.message.Campaign.GetAdSnapRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.GetAdSnapRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.GetAdSnapRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdSnapResponse100 =
                                                   
                                                   
                                                         skel.GetAdSnaps(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdSnapResponse100, false);
                                    } else 

            if("CreateCampaign".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.CreateCampaignResponse createCampaignResponse103 = null;
	                        api.eyeblaster.com.message.Campaign.CreateCampaignRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.CreateCampaignRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.CreateCampaignRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createCampaignResponse103 =
                                                   
                                                   
                                                         skel.CreateCampaign(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createCampaignResponse103, false);
                                    } else 

            if("GetCampaignInteractions".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.GetCampaignInteractionsResponse getCampaignInteractionsResponse106 = null;
	                        api.eyeblaster.com.message.Campaign.GetCampaignInteractionsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.GetCampaignInteractionsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.GetCampaignInteractionsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCampaignInteractionsResponse106 =
                                                   
                                                   
                                                         skel.GetCampaignInteractions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCampaignInteractionsResponse106, false);
                                    } else 

            if("UpdateCampaign".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.UpdateCampaignResponse updateCampaignResponse109 = null;
	                        api.eyeblaster.com.message.Campaign.UpdateCampaignRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.UpdateCampaignRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.UpdateCampaignRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateCampaignResponse109 =
                                                   
                                                   
                                                         skel.UpdateCampaign(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateCampaignResponse109, false);
                                    } else 

            if("GetInteractionRelatedAds".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.GetInteractionRelatedAdsResponse getInteractionRelatedAdsResponse112 = null;
	                        api.eyeblaster.com.message.Campaign.GetInteractionRelatedAdsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.GetInteractionRelatedAdsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.GetInteractionRelatedAdsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getInteractionRelatedAdsResponse112 =
                                                   
                                                   
                                                         skel.GetInteractionRelatedAds(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getInteractionRelatedAdsResponse112, false);
                                    } else 

            if("GetCampaignHistoryObjects".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.GetHistoryObjectsResponse getHistoryObjectsResponse115 = null;
	                        api.eyeblaster.com.message.Campaign.GetHistoryObjectsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.GetHistoryObjectsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.GetHistoryObjectsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryObjectsResponse115 =
                                                   
                                                   
                                                         skel.GetCampaignHistoryObjects(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryObjectsResponse115, false);
                                    } else 

            if("GetCampaigns".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.GetCampaignsResponse getCampaignsResponse118 = null;
	                        api.eyeblaster.com.message.Campaign.GetCampaignsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.GetCampaignsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.GetCampaignsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCampaignsResponse118 =
                                                   
                                                   
                                                         skel.GetCampaigns(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCampaignsResponse118, false);
                                    } else 

            if("GetCampaignEffectiveSettings".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.GetCampaignEffectiveSettingsResponse getCampaignEffectiveSettingsResponse121 = null;
	                        api.eyeblaster.com.message.Campaign.GetCampaignEffectiveSettingsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.GetCampaignEffectiveSettingsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.GetCampaignEffectiveSettingsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCampaignEffectiveSettingsResponse121 =
                                                   
                                                   
                                                         skel.GetCampaignEffectiveSettings(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCampaignEffectiveSettingsResponse121, false);
                                    } else 

            if("GetSites".equals(methodName)){
                
                api.eyeblaster.com.message.Campaign.GetSitesResponse getSitesResponse124 = null;
	                        api.eyeblaster.com.message.Campaign.GetSitesRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Campaign.GetSitesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Campaign.GetSitesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSitesResponse124 =
                                                   
                                                   
                                                         skel.GetSites(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSitesResponse124, false);
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetMarketsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetMarketsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetMarketsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetMarketsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.UserSecurityToken param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.UserSecurityToken.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetContactRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetContactRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetContactResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetContactResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetMonitorDeliveryRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetMonitorDeliveryRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetMonitorDeliveryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetMonitorDeliveryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.CreateCampaignCustomLogRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.CreateCampaignCustomLogRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetOfficesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetOfficesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetOfficesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetOfficesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetAgencyContactsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetAgencyContactsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetAgencyContactsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetAgencyContactsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.DeleteCampaignRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.DeleteCampaignRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.DeleteCampaignsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.DeleteCampaignsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.PublishCampaignRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.PublishCampaignRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.PublishCampaignResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.PublishCampaignResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetCampaignHistoryRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetCampaignHistoryRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetHistoryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetHistoryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetCreativeShopsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetCreativeShopsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetCreativeShopsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetCreativeShopsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.EnableAutomaticOptimizationRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.EnableAutomaticOptimizationRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.EnableAutomaticOptimizationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.EnableAutomaticOptimizationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetTargetRegionRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetTargetRegionRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetTargetRegionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetTargetRegionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.CreateContactRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.CreateContactRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.CreateContactResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.CreateContactResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetSiteContactsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetSiteContactsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetSiteContactsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetSiteContactsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetHistoryActionsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetHistoryActionsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetHistoryActionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetHistoryActionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetCampaignsBasicInfoRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetCampaignsBasicInfoRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetCampaignsBasicInfoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetCampaignsBasicInfoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetAgenciesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetAgenciesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetAgenciesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetAgenciesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GenerateIOForCampaignRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GenerateIOForCampaignRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GenerateIOForCampaignResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GenerateIOForCampaignResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetCreativeShopRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetCreativeShopRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetCreativeShopResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetCreativeShopResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.UpdateCampaignInteractionsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.UpdateCampaignInteractionsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.UpdateCampaignInteractionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.UpdateCampaignInteractionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetCampaignSitesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetCampaignSitesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetCampaignSitesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetCampaignSitesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetCampaignSiteContactsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetCampaignSiteContactsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetAdSnapRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetAdSnapRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetAdSnapResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetAdSnapResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.CreateCampaignRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.CreateCampaignRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.CreateCampaignResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.CreateCampaignResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetCampaignInteractionsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetCampaignInteractionsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetCampaignInteractionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetCampaignInteractionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.UpdateCampaignRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.UpdateCampaignRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.UpdateCampaignResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.UpdateCampaignResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetInteractionRelatedAdsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetInteractionRelatedAdsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetInteractionRelatedAdsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetInteractionRelatedAdsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetHistoryObjectsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetHistoryObjectsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetHistoryObjectsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetHistoryObjectsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetCampaignsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetCampaignsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetCampaignsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetCampaignsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetCampaignEffectiveSettingsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetCampaignEffectiveSettingsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetCampaignEffectiveSettingsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetCampaignEffectiveSettingsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetSitesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetSitesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Campaign.GetSitesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Campaign.GetSitesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.GetMarketsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.GetMarketsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.GetMarketsResponse wrapGetMarkets(){
                                api.eyeblaster.com.message.Campaign.GetMarketsResponse wrappedElement = new api.eyeblaster.com.message.Campaign.GetMarketsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.GetContactResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.GetContactResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.GetContactResponse wrapGetContact(){
                                api.eyeblaster.com.message.Campaign.GetContactResponse wrappedElement = new api.eyeblaster.com.message.Campaign.GetContactResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.GetMonitorDeliveryResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.GetMonitorDeliveryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.GetMonitorDeliveryResponse wrapGetMonitorDelivery(){
                                api.eyeblaster.com.message.Campaign.GetMonitorDeliveryResponse wrappedElement = new api.eyeblaster.com.message.Campaign.GetMonitorDeliveryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.GetOfficesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.GetOfficesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.GetOfficesResponse wrapGetOffices(){
                                api.eyeblaster.com.message.Campaign.GetOfficesResponse wrappedElement = new api.eyeblaster.com.message.Campaign.GetOfficesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.GetAgencyContactsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.GetAgencyContactsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.GetAgencyContactsResponse wrapGetAgencyContacts(){
                                api.eyeblaster.com.message.Campaign.GetAgencyContactsResponse wrappedElement = new api.eyeblaster.com.message.Campaign.GetAgencyContactsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.DeleteCampaignsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.DeleteCampaignsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.DeleteCampaignsResponse wrapDeleteCampaign(){
                                api.eyeblaster.com.message.Campaign.DeleteCampaignsResponse wrappedElement = new api.eyeblaster.com.message.Campaign.DeleteCampaignsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.PublishCampaignResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.PublishCampaignResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.PublishCampaignResponse wrapPublishCampaign(){
                                api.eyeblaster.com.message.Campaign.PublishCampaignResponse wrappedElement = new api.eyeblaster.com.message.Campaign.PublishCampaignResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.GetHistoryResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.GetHistoryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.GetHistoryResponse wrapGetCampaignHistory(){
                                api.eyeblaster.com.message.Campaign.GetHistoryResponse wrappedElement = new api.eyeblaster.com.message.Campaign.GetHistoryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.GetCreativeShopsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.GetCreativeShopsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.GetCreativeShopsResponse wrapGetCreativeShops(){
                                api.eyeblaster.com.message.Campaign.GetCreativeShopsResponse wrappedElement = new api.eyeblaster.com.message.Campaign.GetCreativeShopsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.EnableAutomaticOptimizationResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.EnableAutomaticOptimizationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.EnableAutomaticOptimizationResponse wrapEnableAutomaticOptimizationOnCampaign(){
                                api.eyeblaster.com.message.Campaign.EnableAutomaticOptimizationResponse wrappedElement = new api.eyeblaster.com.message.Campaign.EnableAutomaticOptimizationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.GetTargetRegionResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.GetTargetRegionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.GetTargetRegionResponse wrapGetTargetRegionTree(){
                                api.eyeblaster.com.message.Campaign.GetTargetRegionResponse wrappedElement = new api.eyeblaster.com.message.Campaign.GetTargetRegionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.CreateContactResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.CreateContactResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.CreateContactResponse wrapCreateContact(){
                                api.eyeblaster.com.message.Campaign.CreateContactResponse wrappedElement = new api.eyeblaster.com.message.Campaign.CreateContactResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.GetSiteContactsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.GetSiteContactsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.GetSiteContactsResponse wrapGetSiteContacts(){
                                api.eyeblaster.com.message.Campaign.GetSiteContactsResponse wrappedElement = new api.eyeblaster.com.message.Campaign.GetSiteContactsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.GetHistoryActionsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.GetHistoryActionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.GetHistoryActionsResponse wrapGetCampaignHistoryActions(){
                                api.eyeblaster.com.message.Campaign.GetHistoryActionsResponse wrappedElement = new api.eyeblaster.com.message.Campaign.GetHistoryActionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.GetCampaignsBasicInfoResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.GetCampaignsBasicInfoResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.GetCampaignsBasicInfoResponse wrapGetCampaignsBasicInfo(){
                                api.eyeblaster.com.message.Campaign.GetCampaignsBasicInfoResponse wrappedElement = new api.eyeblaster.com.message.Campaign.GetCampaignsBasicInfoResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.GetAgenciesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.GetAgenciesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.GetAgenciesResponse wrapGetAgencies(){
                                api.eyeblaster.com.message.Campaign.GetAgenciesResponse wrappedElement = new api.eyeblaster.com.message.Campaign.GetAgenciesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.GenerateIOForCampaignResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.GenerateIOForCampaignResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.GenerateIOForCampaignResponse wrapGenerateIOForCampaign(){
                                api.eyeblaster.com.message.Campaign.GenerateIOForCampaignResponse wrappedElement = new api.eyeblaster.com.message.Campaign.GenerateIOForCampaignResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.GetCreativeShopResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.GetCreativeShopResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.GetCreativeShopResponse wrapGetCreativeShopContacts(){
                                api.eyeblaster.com.message.Campaign.GetCreativeShopResponse wrappedElement = new api.eyeblaster.com.message.Campaign.GetCreativeShopResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.UpdateCampaignInteractionsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.UpdateCampaignInteractionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.UpdateCampaignInteractionsResponse wrapUpdateCampaignInteractions(){
                                api.eyeblaster.com.message.Campaign.UpdateCampaignInteractionsResponse wrappedElement = new api.eyeblaster.com.message.Campaign.UpdateCampaignInteractionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.GetCampaignSitesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.GetCampaignSitesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.GetCampaignSitesResponse wrapGetCampaignSites(){
                                api.eyeblaster.com.message.Campaign.GetCampaignSitesResponse wrappedElement = new api.eyeblaster.com.message.Campaign.GetCampaignSitesResponse();
                                return wrappedElement;
                         }
                    
                         private api.eyeblaster.com.message.Campaign.GetSiteContactsResponse wrapGetAllSiteContacts(){
                                api.eyeblaster.com.message.Campaign.GetSiteContactsResponse wrappedElement = new api.eyeblaster.com.message.Campaign.GetSiteContactsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.GetAdSnapResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.GetAdSnapResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.GetAdSnapResponse wrapGetAdSnaps(){
                                api.eyeblaster.com.message.Campaign.GetAdSnapResponse wrappedElement = new api.eyeblaster.com.message.Campaign.GetAdSnapResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.CreateCampaignResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.CreateCampaignResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.CreateCampaignResponse wrapCreateCampaign(){
                                api.eyeblaster.com.message.Campaign.CreateCampaignResponse wrappedElement = new api.eyeblaster.com.message.Campaign.CreateCampaignResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.GetCampaignInteractionsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.GetCampaignInteractionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.GetCampaignInteractionsResponse wrapGetCampaignInteractions(){
                                api.eyeblaster.com.message.Campaign.GetCampaignInteractionsResponse wrappedElement = new api.eyeblaster.com.message.Campaign.GetCampaignInteractionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.UpdateCampaignResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.UpdateCampaignResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.UpdateCampaignResponse wrapUpdateCampaign(){
                                api.eyeblaster.com.message.Campaign.UpdateCampaignResponse wrappedElement = new api.eyeblaster.com.message.Campaign.UpdateCampaignResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.GetInteractionRelatedAdsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.GetInteractionRelatedAdsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.GetInteractionRelatedAdsResponse wrapGetInteractionRelatedAds(){
                                api.eyeblaster.com.message.Campaign.GetInteractionRelatedAdsResponse wrappedElement = new api.eyeblaster.com.message.Campaign.GetInteractionRelatedAdsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.GetHistoryObjectsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.GetHistoryObjectsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.GetHistoryObjectsResponse wrapGetCampaignHistoryObjects(){
                                api.eyeblaster.com.message.Campaign.GetHistoryObjectsResponse wrappedElement = new api.eyeblaster.com.message.Campaign.GetHistoryObjectsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.GetCampaignsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.GetCampaignsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.GetCampaignsResponse wrapGetCampaigns(){
                                api.eyeblaster.com.message.Campaign.GetCampaignsResponse wrappedElement = new api.eyeblaster.com.message.Campaign.GetCampaignsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.GetCampaignEffectiveSettingsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.GetCampaignEffectiveSettingsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.GetCampaignEffectiveSettingsResponse wrapGetCampaignEffectiveSettings(){
                                api.eyeblaster.com.message.Campaign.GetCampaignEffectiveSettingsResponse wrappedElement = new api.eyeblaster.com.message.Campaign.GetCampaignEffectiveSettingsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Campaign.GetSitesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Campaign.GetSitesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Campaign.GetSitesResponse wrapGetSites(){
                                api.eyeblaster.com.message.Campaign.GetSitesResponse wrappedElement = new api.eyeblaster.com.message.Campaign.GetSitesResponse();
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
        
                if (api.eyeblaster.com.message.Campaign.GetMarketsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetMarketsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetMarketsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetMarketsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetContactRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetContactRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetContactResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetContactResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetMonitorDeliveryRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetMonitorDeliveryRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetMonitorDeliveryResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetMonitorDeliveryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.CreateCampaignCustomLogRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.CreateCampaignCustomLogRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetOfficesRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetOfficesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetOfficesResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetOfficesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetAgencyContactsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetAgencyContactsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetAgencyContactsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetAgencyContactsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.DeleteCampaignRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.DeleteCampaignRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.DeleteCampaignsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.DeleteCampaignsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.PublishCampaignRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.PublishCampaignRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.PublishCampaignResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.PublishCampaignResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetCampaignHistoryRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetCampaignHistoryRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetHistoryResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetHistoryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetCreativeShopsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetCreativeShopsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetCreativeShopsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetCreativeShopsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.EnableAutomaticOptimizationRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.EnableAutomaticOptimizationRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.EnableAutomaticOptimizationResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.EnableAutomaticOptimizationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetTargetRegionRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetTargetRegionRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetTargetRegionResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetTargetRegionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.CreateContactRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.CreateContactRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.CreateContactResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.CreateContactResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetSiteContactsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetSiteContactsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetSiteContactsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetSiteContactsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetHistoryActionsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetHistoryActionsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetHistoryActionsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetHistoryActionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetCampaignsBasicInfoRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetCampaignsBasicInfoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetCampaignsBasicInfoResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetCampaignsBasicInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetAgenciesRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetAgenciesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetAgenciesResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetAgenciesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GenerateIOForCampaignRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GenerateIOForCampaignRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GenerateIOForCampaignResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GenerateIOForCampaignResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetCreativeShopRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetCreativeShopRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetCreativeShopResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetCreativeShopResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UpdateCampaignInteractionsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UpdateCampaignInteractionsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UpdateCampaignInteractionsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UpdateCampaignInteractionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetCampaignSitesRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetCampaignSitesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetCampaignSitesResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetCampaignSitesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetCampaignSiteContactsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetCampaignSiteContactsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetSiteContactsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetSiteContactsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetAdSnapRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetAdSnapRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetAdSnapResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetAdSnapResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.CreateCampaignRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.CreateCampaignRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.CreateCampaignResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.CreateCampaignResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetCampaignInteractionsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetCampaignInteractionsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetCampaignInteractionsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetCampaignInteractionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UpdateCampaignRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UpdateCampaignRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UpdateCampaignResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UpdateCampaignResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetInteractionRelatedAdsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetInteractionRelatedAdsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetInteractionRelatedAdsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetInteractionRelatedAdsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetHistoryObjectsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetHistoryObjectsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetHistoryObjectsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetHistoryObjectsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetCampaignsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetCampaignsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetCampaignsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetCampaignsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetCampaignEffectiveSettingsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetCampaignEffectiveSettingsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetCampaignEffectiveSettingsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetCampaignEffectiveSettingsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetSitesRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetSitesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.GetSitesResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.GetSitesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Campaign.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Campaign.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    