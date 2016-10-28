
/**
 * DeliveryGroupServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */
        package api.eyeblaster.com.DeliveryGroup;

        /**
        *  DeliveryGroupServiceMessageReceiverInOut message receiver
        */

        public class DeliveryGroupServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        DeliveryGroupServiceSkeleton skel = (DeliveryGroupServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJava(op.getName().getLocalPart())) != null)){

        

            if("GetCitiesByRegion".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.GetCitiesByCountryResponse getCitiesByCountryResponse38 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.GetCitiesByRegionRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.GetCitiesByRegionRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.GetCitiesByRegionRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCitiesByCountryResponse38 =
                                                   
                                                   
                                                         skel.GetCitiesByRegion(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCitiesByCountryResponse38, false);
                                    } else 

            if("CreateDeliveryGroup".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.CreateDeliveryGroupResponse createDeliveryGroupResponse41 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.CreateDeliveryGroupRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.CreateDeliveryGroupRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.CreateDeliveryGroupRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createDeliveryGroupResponse41 =
                                                   
                                                   
                                                         skel.CreateDeliveryGroup(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createDeliveryGroupResponse41, false);
                                    } else 

            if("GetBehavioralTargetingsBySiteID".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.GetBehavioralTargetingsBySiteIDResponse getBehavioralTargetingsBySiteIDResponse44 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.GetBehavioralTargetingsBySiteIDRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.GetBehavioralTargetingsBySiteIDRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.GetBehavioralTargetingsBySiteIDRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getBehavioralTargetingsBySiteIDResponse44 =
                                                   
                                                   
                                                         skel.GetBehavioralTargetingsBySiteID(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getBehavioralTargetingsBySiteIDResponse44, false);
                                    } else 

            if("GetDeliverySubGroupMasterAds".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupMasterAdsResponse getDeliverySubGroupMasterAdsResponse47 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupMasterAdsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupMasterAdsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupMasterAdsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDeliverySubGroupMasterAdsResponse47 =
                                                   
                                                   
                                                         skel.GetDeliverySubGroupMasterAds(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDeliverySubGroupMasterAdsResponse47, false);
                                    } else 

            if("GetDeliveryGroup".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupResponse getDeliveryGroupResponse50 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDeliveryGroupResponse50 =
                                                   
                                                   
                                                         skel.GetDeliveryGroup(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDeliveryGroupResponse50, false);
                                    } else 

            if("UpdateDeliveryGroup".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.UpdateDeliveryGroupResponse updateDeliveryGroupResponse53 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.UpdateDeliveryGroupRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.UpdateDeliveryGroupRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.UpdateDeliveryGroupRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateDeliveryGroupResponse53 =
                                                   
                                                   
                                                         skel.UpdateDeliveryGroup(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateDeliveryGroupResponse53, false);
                                    } else 

            if("GetMasterAdByCampaign".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByCampaignResponse getMasterAdByCampaignResponse56 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByCampaignRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByCampaignRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByCampaignRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMasterAdByCampaignResponse56 =
                                                   
                                                   
                                                         skel.GetMasterAdByCampaign(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMasterAdByCampaignResponse56, false);
                                    } else 

            if("GetDeliverySubGroups".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupsResponse getDeliverySubGroupsResponse59 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDeliverySubGroupsResponse59 =
                                                   
                                                   
                                                         skel.GetDeliverySubGroups(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDeliverySubGroupsResponse59, false);
                                    } else 

            if("CreateMsnAgerValues".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.CreateMsnAgerValuesResponse createMsnAgerValuesResponse62 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.CreateMsnAgerValuesRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.CreateMsnAgerValuesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.CreateMsnAgerValuesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createMsnAgerValuesResponse62 =
                                                   
                                                   
                                                         skel.CreateMsnAgerValues(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createMsnAgerValuesResponse62, false);
                                    } else 

            if("CreateTargetAudience".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.CreateTargetAudienceResponse createTargetAudienceResponse65 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.CreateTargetAudienceRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.CreateTargetAudienceRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.CreateTargetAudienceRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createTargetAudienceResponse65 =
                                                   
                                                   
                                                         skel.CreateTargetAudience(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createTargetAudienceResponse65, false);
                                    } else 

            if("GetMasterAdByDeliveryGroup".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByDeliveryGroupResponse getMasterAdByDeliveryGroupResponse68 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByDeliveryGroupRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByDeliveryGroupRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByDeliveryGroupRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMasterAdByDeliveryGroupResponse68 =
                                                   
                                                   
                                                         skel.GetMasterAdByDeliveryGroup(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMasterAdByDeliveryGroupResponse68, false);
                                    } else 

            if("GetAdvertisersRetargetingTags".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.GetAdvertisersRetargetingTagsResponse getAdvertisersRetargetingTagsResponse71 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.GetAdvertisersRetargetingTagsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.GetAdvertisersRetargetingTagsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.GetAdvertisersRetargetingTagsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdvertisersRetargetingTagsResponse71 =
                                                   
                                                   
                                                         skel.GetAdvertisersRetargetingTags(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdvertisersRetargetingTagsResponse71, false);
                                    } else 

            if("ChangeStateMasterAdOnDeliveryGroup".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.ChangeStateMasterAdOnDeliveryGroupResponse changeStateMasterAdOnDeliveryGroupResponse74 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.ChangeStateMasterAdOnDeliveryGroupRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.ChangeStateMasterAdOnDeliveryGroupRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.ChangeStateMasterAdOnDeliveryGroupRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               changeStateMasterAdOnDeliveryGroupResponse74 =
                                                   
                                                   
                                                         skel.ChangeStateMasterAdOnDeliveryGroup(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), changeStateMasterAdOnDeliveryGroupResponse74, false);
                                    } else 

            if("GetAreaCodesByCountry".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByCountryResponse getAreaCodesByCountryResponse77 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByCountryRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByCountryRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByCountryRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAreaCodesByCountryResponse77 =
                                                   
                                                   
                                                         skel.GetAreaCodesByCountry(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAreaCodesByCountryResponse77, false);
                                    } else 

            if("DeleteDeliveryGroup".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.DeleteDeliveryGroupResponse deleteDeliveryGroupResponse80 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.DeleteDeliveryGroupRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.DeleteDeliveryGroupRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.DeleteDeliveryGroupRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteDeliveryGroupResponse80 =
                                                   
                                                   
                                                         skel.DeleteDeliveryGroup(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteDeliveryGroupResponse80, false);
                                    } else 

            if("GetDeliveryGroupFrequencyCapping".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupFrequencyCappingResponse getDeliveryGroupFrequencyCappingResponse83 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupFrequencyCappingRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupFrequencyCappingRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupFrequencyCappingRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDeliveryGroupFrequencyCappingResponse83 =
                                                   
                                                   
                                                         skel.GetDeliveryGroupFrequencyCapping(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDeliveryGroupFrequencyCappingResponse83, false);
                                    } else 

            if("GetMsnAgeValues".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.GetMsnAgeValuesResponse getMsnAgeValuesResponse86 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.GetMsnAgeValuesRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.GetMsnAgeValuesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.GetMsnAgeValuesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMsnAgeValuesResponse86 =
                                                   
                                                   
                                                         skel.GetMsnAgeValues(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMsnAgeValuesResponse86, false);
                                    } else 

            if("GetDeliverySubGroup".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupResponse getDeliverySubGroupResponse89 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDeliverySubGroupResponse89 =
                                                   
                                                   
                                                         skel.GetDeliverySubGroup(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDeliverySubGroupResponse89, false);
                                    } else 

            if("GetPublisherSegmentationSites".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitesResponse getPublisherSegmentationSitesResponse92 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitesRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPublisherSegmentationSitesResponse92 =
                                                   
                                                   
                                                         skel.GetPublisherSegmentationSites(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPublisherSegmentationSitesResponse92, false);
                                    } else 

            if("GetDMAByCountry".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.GetDMAByCountryResponse getDMAByCountryResponse95 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.GetDMAByCountryRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.GetDMAByCountryRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.GetDMAByCountryRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDMAByCountryResponse95 =
                                                   
                                                   
                                                         skel.GetDMAByCountry(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDMAByCountryResponse95, false);
                                    } else 

            if("GetMasterAdsByPlacement".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.GetMasterAdsByPlacementResponse getMasterAdsByPlacementResponse98 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.GetMasterAdsByPlacementRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.GetMasterAdsByPlacementRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.GetMasterAdsByPlacementRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMasterAdsByPlacementResponse98 =
                                                   
                                                   
                                                         skel.GetMasterAdsByPlacement(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMasterAdsByPlacementResponse98, false);
                                    } else 

            if("GetPublisherSegmentationSiteProperties".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitePropertiesResponse getPublisherSegmentationSitePropertiesResponse101 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitePropertiesRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitePropertiesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitePropertiesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPublisherSegmentationSitePropertiesResponse101 =
                                                   
                                                   
                                                         skel.GetPublisherSegmentationSiteProperties(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPublisherSegmentationSitePropertiesResponse101, false);
                                    } else 

            if("GetDMAByRegions".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.GetDMAsByRegionResponse getDMAsByRegionResponse104 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.GetDMAsByRegionRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.GetDMAsByRegionRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.GetDMAsByRegionRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDMAsByRegionResponse104 =
                                                   
                                                   
                                                         skel.GetDMAByRegions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDMAsByRegionResponse104, false);
                                    } else 

            if("GetAreaCodesByRegion".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByRegionResponse getAreaCodesByRegionResponse107 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByRegionRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByRegionRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByRegionRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAreaCodesByRegionResponse107 =
                                                   
                                                   
                                                         skel.GetAreaCodesByRegion(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAreaCodesByRegionResponse107, false);
                                    } else 

            if("GetDeliveryGroupsByPlacementID".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsByPlacementIDResponse getDeliveryGroupsByPlacementIDResponse110 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsByPlacementIDRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsByPlacementIDRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsByPlacementIDRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDeliveryGroupsByPlacementIDResponse110 =
                                                   
                                                   
                                                         skel.GetDeliveryGroupsByPlacementID(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDeliveryGroupsByPlacementIDResponse110, false);
                                    } else 

            if("GetCountries".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.GetCountriesResponse getCountriesResponse113 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.GetCountriesRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.GetCountriesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.GetCountriesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCountriesResponse113 =
                                                   
                                                   
                                                         skel.GetCountries(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCountriesResponse113, false);
                                    } else 

            if("AttachDeliveryGroupToPlacement".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.AttachDeliveryGroupToPlacementResponse attachDeliveryGroupToPlacementResponse116 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.AttachDeliveryGroupToPlacementRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.AttachDeliveryGroupToPlacementRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.AttachDeliveryGroupToPlacementRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               attachDeliveryGroupToPlacementResponse116 =
                                                   
                                                   
                                                         skel.AttachDeliveryGroupToPlacement(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), attachDeliveryGroupToPlacementResponse116, false);
                                    } else 

            if("AttachMasterAdToPlacement".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.AttachMasterAdToPlacementResponse attachMasterAdToPlacementResponse119 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.AttachMasterAdToPlacementRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.AttachMasterAdToPlacementRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.AttachMasterAdToPlacementRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               attachMasterAdToPlacementResponse119 =
                                                   
                                                   
                                                         skel.AttachMasterAdToPlacement(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), attachMasterAdToPlacementResponse119, false);
                                    } else 

            if("SetDeliveryGroupFrequencyCapping".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.SetDeliveryGroupFrequencyCappingResponse setDeliveryGroupFrequencyCappingResponse122 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.SetDeliveryGroupFrequencyCappingRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.SetDeliveryGroupFrequencyCappingRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.SetDeliveryGroupFrequencyCappingRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               setDeliveryGroupFrequencyCappingResponse122 =
                                                   
                                                   
                                                         skel.SetDeliveryGroupFrequencyCapping(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), setDeliveryGroupFrequencyCappingResponse122, false);
                                    } else 

            if("GetRegionsByCountry".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.GetRegionsByCountryResponse getRegionsByCountryResponse125 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.GetRegionsByCountryRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.GetRegionsByCountryRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.GetRegionsByCountryRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getRegionsByCountryResponse125 =
                                                   
                                                   
                                                         skel.GetRegionsByCountry(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getRegionsByCountryResponse125, false);
                                    } else 

            if("GetTargetAudiences".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.GetTargetAudiencesResponse getTargetAudiencesResponse128 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.GetTargetAudiencesRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.GetTargetAudiencesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.GetTargetAudiencesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTargetAudiencesResponse128 =
                                                   
                                                   
                                                         skel.GetTargetAudiences(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTargetAudiencesResponse128, false);
                                    } else 

            if("GetCitiesByCountry".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.GetCitiesByCountryResponse getCitiesByCountryResponse131 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.GetCitiesByCountryRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.GetCitiesByCountryRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.GetCitiesByCountryRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCitiesByCountryResponse131 =
                                                   
                                                   
                                                         skel.GetCitiesByCountry(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCitiesByCountryResponse131, false);
                                    } else 

            if("GetDeliveryGroups".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsResponse getDeliveryGroupsResponse134 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getDeliveryGroupsResponse134 =
                                                   
                                                   
                                                         skel.GetDeliveryGroups(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getDeliveryGroupsResponse134, false);
                                    } else 

            if("DeleteTargetAudience".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.DeleteTargetAudienceResponse deleteTargetAudienceResponse137 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.DeleteTargetAudienceRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.DeleteTargetAudienceRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.DeleteTargetAudienceRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteTargetAudienceResponse137 =
                                                   
                                                   
                                                         skel.DeleteTargetAudience(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteTargetAudienceResponse137, false);
                                    } else 

            if("CheckJobStatus".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.GetAttachJobStatusResponse getAttachJobStatusResponse140 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.GetAttachJobStatusRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.GetAttachJobStatusRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.GetAttachJobStatusRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAttachJobStatusResponse140 =
                                                   
                                                   
                                                         skel.CheckJobStatus(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAttachJobStatusResponse140, false);
                                    } else 

            if("UpdateTargetAudience".equals(methodName)){
                
                api.eyeblaster.com.message.DeliveryGroup.UpdateTargetAudienceResponse updateTargetAudienceResponse143 = null;
	                        api.eyeblaster.com.message.DeliveryGroup.UpdateTargetAudienceRequest wrappedParam =
                                                             (api.eyeblaster.com.message.DeliveryGroup.UpdateTargetAudienceRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.DeliveryGroup.UpdateTargetAudienceRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateTargetAudienceResponse143 =
                                                   
                                                   
                                                         skel.UpdateTargetAudience(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateTargetAudienceResponse143, false);
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetCitiesByRegionRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetCitiesByRegionRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetCitiesByCountryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetCitiesByCountryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.CreateDeliveryGroupRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.CreateDeliveryGroupRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.CreateDeliveryGroupResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.CreateDeliveryGroupResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetBehavioralTargetingsBySiteIDRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetBehavioralTargetingsBySiteIDRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetBehavioralTargetingsBySiteIDResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetBehavioralTargetingsBySiteIDResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupMasterAdsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupMasterAdsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupMasterAdsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupMasterAdsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.UpdateDeliveryGroupRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.UpdateDeliveryGroupRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.UpdateDeliveryGroupResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.UpdateDeliveryGroupResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByCampaignRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByCampaignRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByCampaignResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByCampaignResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.CreateMsnAgerValuesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.CreateMsnAgerValuesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.CreateMsnAgerValuesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.CreateMsnAgerValuesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.CreateTargetAudienceRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.CreateTargetAudienceRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.CreateTargetAudienceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.CreateTargetAudienceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByDeliveryGroupRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByDeliveryGroupRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByDeliveryGroupResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByDeliveryGroupResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetAdvertisersRetargetingTagsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetAdvertisersRetargetingTagsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetAdvertisersRetargetingTagsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetAdvertisersRetargetingTagsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.ChangeStateMasterAdOnDeliveryGroupRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.ChangeStateMasterAdOnDeliveryGroupRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.ChangeStateMasterAdOnDeliveryGroupResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.ChangeStateMasterAdOnDeliveryGroupResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByCountryRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByCountryRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByCountryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByCountryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.DeleteDeliveryGroupRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.DeleteDeliveryGroupRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.DeleteDeliveryGroupResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.DeleteDeliveryGroupResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupFrequencyCappingRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupFrequencyCappingRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupFrequencyCappingResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupFrequencyCappingResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetMsnAgeValuesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetMsnAgeValuesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetMsnAgeValuesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetMsnAgeValuesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetDMAByCountryRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDMAByCountryRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetDMAByCountryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDMAByCountryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetMasterAdsByPlacementRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetMasterAdsByPlacementRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetMasterAdsByPlacementResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetMasterAdsByPlacementResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitePropertiesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitePropertiesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitePropertiesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitePropertiesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetDMAsByRegionRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDMAsByRegionRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetDMAsByRegionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDMAsByRegionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByRegionRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByRegionRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByRegionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByRegionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsByPlacementIDRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsByPlacementIDRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsByPlacementIDResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsByPlacementIDResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetCountriesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetCountriesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetCountriesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetCountriesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.AttachDeliveryGroupToPlacementRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.AttachDeliveryGroupToPlacementRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.AttachDeliveryGroupToPlacementResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.AttachDeliveryGroupToPlacementResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.AttachMasterAdToPlacementRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.AttachMasterAdToPlacementRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.AttachMasterAdToPlacementResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.AttachMasterAdToPlacementResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.SetDeliveryGroupFrequencyCappingRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.SetDeliveryGroupFrequencyCappingRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.SetDeliveryGroupFrequencyCappingResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.SetDeliveryGroupFrequencyCappingResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetRegionsByCountryRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetRegionsByCountryRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetRegionsByCountryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetRegionsByCountryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetTargetAudiencesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetTargetAudiencesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetTargetAudiencesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetTargetAudiencesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetCitiesByCountryRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetCitiesByCountryRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.DeleteTargetAudienceRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.DeleteTargetAudienceRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.DeleteTargetAudienceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.DeleteTargetAudienceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetAttachJobStatusRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetAttachJobStatusRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.GetAttachJobStatusResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetAttachJobStatusResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.UpdateTargetAudienceRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.UpdateTargetAudienceRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.DeliveryGroup.UpdateTargetAudienceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.UpdateTargetAudienceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.GetCitiesByCountryResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetCitiesByCountryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.GetCitiesByCountryResponse wrapGetCitiesByRegion(){
                                api.eyeblaster.com.message.DeliveryGroup.GetCitiesByCountryResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.GetCitiesByCountryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.CreateDeliveryGroupResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.CreateDeliveryGroupResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.CreateDeliveryGroupResponse wrapCreateDeliveryGroup(){
                                api.eyeblaster.com.message.DeliveryGroup.CreateDeliveryGroupResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.CreateDeliveryGroupResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.GetBehavioralTargetingsBySiteIDResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetBehavioralTargetingsBySiteIDResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.GetBehavioralTargetingsBySiteIDResponse wrapGetBehavioralTargetingsBySiteID(){
                                api.eyeblaster.com.message.DeliveryGroup.GetBehavioralTargetingsBySiteIDResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.GetBehavioralTargetingsBySiteIDResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupMasterAdsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupMasterAdsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupMasterAdsResponse wrapGetDeliverySubGroupMasterAds(){
                                api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupMasterAdsResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupMasterAdsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupResponse wrapGetDeliveryGroup(){
                                api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.UpdateDeliveryGroupResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.UpdateDeliveryGroupResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.UpdateDeliveryGroupResponse wrapUpdateDeliveryGroup(){
                                api.eyeblaster.com.message.DeliveryGroup.UpdateDeliveryGroupResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.UpdateDeliveryGroupResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByCampaignResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByCampaignResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByCampaignResponse wrapGetMasterAdByCampaign(){
                                api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByCampaignResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByCampaignResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupsResponse wrapGetDeliverySubGroups(){
                                api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupsResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.CreateMsnAgerValuesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.CreateMsnAgerValuesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.CreateMsnAgerValuesResponse wrapCreateMsnAgerValues(){
                                api.eyeblaster.com.message.DeliveryGroup.CreateMsnAgerValuesResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.CreateMsnAgerValuesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.CreateTargetAudienceResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.CreateTargetAudienceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.CreateTargetAudienceResponse wrapCreateTargetAudience(){
                                api.eyeblaster.com.message.DeliveryGroup.CreateTargetAudienceResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.CreateTargetAudienceResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByDeliveryGroupResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByDeliveryGroupResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByDeliveryGroupResponse wrapGetMasterAdByDeliveryGroup(){
                                api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByDeliveryGroupResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByDeliveryGroupResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.GetAdvertisersRetargetingTagsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetAdvertisersRetargetingTagsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.GetAdvertisersRetargetingTagsResponse wrapGetAdvertisersRetargetingTags(){
                                api.eyeblaster.com.message.DeliveryGroup.GetAdvertisersRetargetingTagsResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.GetAdvertisersRetargetingTagsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.ChangeStateMasterAdOnDeliveryGroupResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.ChangeStateMasterAdOnDeliveryGroupResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.ChangeStateMasterAdOnDeliveryGroupResponse wrapChangeStateMasterAdOnDeliveryGroup(){
                                api.eyeblaster.com.message.DeliveryGroup.ChangeStateMasterAdOnDeliveryGroupResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.ChangeStateMasterAdOnDeliveryGroupResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByCountryResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByCountryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByCountryResponse wrapGetAreaCodesByCountry(){
                                api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByCountryResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByCountryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.DeleteDeliveryGroupResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.DeleteDeliveryGroupResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.DeleteDeliveryGroupResponse wrapDeleteDeliveryGroup(){
                                api.eyeblaster.com.message.DeliveryGroup.DeleteDeliveryGroupResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.DeleteDeliveryGroupResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupFrequencyCappingResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupFrequencyCappingResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupFrequencyCappingResponse wrapGetDeliveryGroupFrequencyCapping(){
                                api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupFrequencyCappingResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupFrequencyCappingResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.GetMsnAgeValuesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetMsnAgeValuesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.GetMsnAgeValuesResponse wrapGetMsnAgeValues(){
                                api.eyeblaster.com.message.DeliveryGroup.GetMsnAgeValuesResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.GetMsnAgeValuesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupResponse wrapGetDeliverySubGroup(){
                                api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitesResponse wrapGetPublisherSegmentationSites(){
                                api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitesResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.GetDMAByCountryResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDMAByCountryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.GetDMAByCountryResponse wrapGetDMAByCountry(){
                                api.eyeblaster.com.message.DeliveryGroup.GetDMAByCountryResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.GetDMAByCountryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.GetMasterAdsByPlacementResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetMasterAdsByPlacementResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.GetMasterAdsByPlacementResponse wrapGetMasterAdsByPlacement(){
                                api.eyeblaster.com.message.DeliveryGroup.GetMasterAdsByPlacementResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.GetMasterAdsByPlacementResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitePropertiesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitePropertiesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitePropertiesResponse wrapGetPublisherSegmentationSiteProperties(){
                                api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitePropertiesResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitePropertiesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.GetDMAsByRegionResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDMAsByRegionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.GetDMAsByRegionResponse wrapGetDMAByRegions(){
                                api.eyeblaster.com.message.DeliveryGroup.GetDMAsByRegionResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.GetDMAsByRegionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByRegionResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByRegionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByRegionResponse wrapGetAreaCodesByRegion(){
                                api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByRegionResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByRegionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsByPlacementIDResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsByPlacementIDResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsByPlacementIDResponse wrapGetDeliveryGroupsByPlacementID(){
                                api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsByPlacementIDResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsByPlacementIDResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.GetCountriesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetCountriesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.GetCountriesResponse wrapGetCountries(){
                                api.eyeblaster.com.message.DeliveryGroup.GetCountriesResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.GetCountriesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.AttachDeliveryGroupToPlacementResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.AttachDeliveryGroupToPlacementResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.AttachDeliveryGroupToPlacementResponse wrapAttachDeliveryGroupToPlacement(){
                                api.eyeblaster.com.message.DeliveryGroup.AttachDeliveryGroupToPlacementResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.AttachDeliveryGroupToPlacementResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.AttachMasterAdToPlacementResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.AttachMasterAdToPlacementResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.AttachMasterAdToPlacementResponse wrapAttachMasterAdToPlacement(){
                                api.eyeblaster.com.message.DeliveryGroup.AttachMasterAdToPlacementResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.AttachMasterAdToPlacementResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.SetDeliveryGroupFrequencyCappingResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.SetDeliveryGroupFrequencyCappingResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.SetDeliveryGroupFrequencyCappingResponse wrapSetDeliveryGroupFrequencyCapping(){
                                api.eyeblaster.com.message.DeliveryGroup.SetDeliveryGroupFrequencyCappingResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.SetDeliveryGroupFrequencyCappingResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.GetRegionsByCountryResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetRegionsByCountryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.GetRegionsByCountryResponse wrapGetRegionsByCountry(){
                                api.eyeblaster.com.message.DeliveryGroup.GetRegionsByCountryResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.GetRegionsByCountryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.GetTargetAudiencesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetTargetAudiencesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.GetTargetAudiencesResponse wrapGetTargetAudiences(){
                                api.eyeblaster.com.message.DeliveryGroup.GetTargetAudiencesResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.GetTargetAudiencesResponse();
                                return wrappedElement;
                         }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.GetCitiesByCountryResponse wrapGetCitiesByCountry(){
                                api.eyeblaster.com.message.DeliveryGroup.GetCitiesByCountryResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.GetCitiesByCountryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsResponse wrapGetDeliveryGroups(){
                                api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.DeleteTargetAudienceResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.DeleteTargetAudienceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.DeleteTargetAudienceResponse wrapDeleteTargetAudience(){
                                api.eyeblaster.com.message.DeliveryGroup.DeleteTargetAudienceResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.DeleteTargetAudienceResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.GetAttachJobStatusResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.GetAttachJobStatusResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.GetAttachJobStatusResponse wrapCheckJobStatus(){
                                api.eyeblaster.com.message.DeliveryGroup.GetAttachJobStatusResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.GetAttachJobStatusResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.DeliveryGroup.UpdateTargetAudienceResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.DeliveryGroup.UpdateTargetAudienceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.DeliveryGroup.UpdateTargetAudienceResponse wrapUpdateTargetAudience(){
                                api.eyeblaster.com.message.DeliveryGroup.UpdateTargetAudienceResponse wrappedElement = new api.eyeblaster.com.message.DeliveryGroup.UpdateTargetAudienceResponse();
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
        
                if (api.eyeblaster.com.message.DeliveryGroup.GetCitiesByRegionRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetCitiesByRegionRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetCitiesByCountryResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetCitiesByCountryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.CreateDeliveryGroupRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.CreateDeliveryGroupRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.CreateDeliveryGroupResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.CreateDeliveryGroupResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetBehavioralTargetingsBySiteIDRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetBehavioralTargetingsBySiteIDRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetBehavioralTargetingsBySiteIDResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetBehavioralTargetingsBySiteIDResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupMasterAdsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupMasterAdsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupMasterAdsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupMasterAdsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UpdateDeliveryGroupRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UpdateDeliveryGroupRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UpdateDeliveryGroupResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UpdateDeliveryGroupResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByCampaignRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByCampaignRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByCampaignResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByCampaignResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.CreateMsnAgerValuesRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.CreateMsnAgerValuesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.CreateMsnAgerValuesResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.CreateMsnAgerValuesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.CreateTargetAudienceRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.CreateTargetAudienceRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.CreateTargetAudienceResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.CreateTargetAudienceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByDeliveryGroupRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByDeliveryGroupRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByDeliveryGroupResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetMasterAdByDeliveryGroupResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetAdvertisersRetargetingTagsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetAdvertisersRetargetingTagsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetAdvertisersRetargetingTagsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetAdvertisersRetargetingTagsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.ChangeStateMasterAdOnDeliveryGroupRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.ChangeStateMasterAdOnDeliveryGroupRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.ChangeStateMasterAdOnDeliveryGroupResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.ChangeStateMasterAdOnDeliveryGroupResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByCountryRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByCountryRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByCountryResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByCountryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.DeleteDeliveryGroupRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.DeleteDeliveryGroupRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.DeleteDeliveryGroupResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.DeleteDeliveryGroupResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupFrequencyCappingRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupFrequencyCappingRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupFrequencyCappingResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupFrequencyCappingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetMsnAgeValuesRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetMsnAgeValuesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetMsnAgeValuesResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetMsnAgeValuesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetDeliverySubGroupResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitesRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitesResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetDMAByCountryRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetDMAByCountryRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetDMAByCountryResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetDMAByCountryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetMasterAdsByPlacementRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetMasterAdsByPlacementRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetMasterAdsByPlacementResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetMasterAdsByPlacementResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitePropertiesRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitePropertiesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitePropertiesResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetPublisherSegmentationSitePropertiesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetDMAsByRegionRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetDMAsByRegionRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetDMAsByRegionResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetDMAsByRegionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByRegionRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByRegionRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByRegionResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetAreaCodesByRegionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsByPlacementIDRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsByPlacementIDRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsByPlacementIDResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsByPlacementIDResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetCountriesRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetCountriesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetCountriesResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetCountriesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.AttachDeliveryGroupToPlacementRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.AttachDeliveryGroupToPlacementRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.AttachDeliveryGroupToPlacementResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.AttachDeliveryGroupToPlacementResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.AttachMasterAdToPlacementRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.AttachMasterAdToPlacementRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.AttachMasterAdToPlacementResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.AttachMasterAdToPlacementResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.SetDeliveryGroupFrequencyCappingRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.SetDeliveryGroupFrequencyCappingRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.SetDeliveryGroupFrequencyCappingResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.SetDeliveryGroupFrequencyCappingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetRegionsByCountryRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetRegionsByCountryRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetRegionsByCountryResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetRegionsByCountryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetTargetAudiencesRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetTargetAudiencesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetTargetAudiencesResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetTargetAudiencesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetCitiesByCountryRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetCitiesByCountryRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetCitiesByCountryResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetCitiesByCountryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetDeliveryGroupsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.DeleteTargetAudienceRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.DeleteTargetAudienceRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.DeleteTargetAudienceResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.DeleteTargetAudienceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetAttachJobStatusRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetAttachJobStatusRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.GetAttachJobStatusResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.GetAttachJobStatusResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UpdateTargetAudienceRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UpdateTargetAudienceRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UpdateTargetAudienceResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UpdateTargetAudienceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.DeliveryGroup.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    