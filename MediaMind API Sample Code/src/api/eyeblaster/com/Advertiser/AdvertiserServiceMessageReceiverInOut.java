
/**
 * AdvertiserServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */
        package api.eyeblaster.com.Advertiser;

        /**
        *  AdvertiserServiceMessageReceiverInOut message receiver
        */

        public class AdvertiserServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        AdvertiserServiceSkeleton skel = (AdvertiserServiceSkeleton)obj;
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
                
                api.eyeblaster.com.message.Advertiser.GetMarketsResponse getMarketsResponse29 = null;
	                        api.eyeblaster.com.message.Advertiser.GetMarketsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.GetMarketsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.GetMarketsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getMarketsResponse29 =
                                                   
                                                   
                                                         skel.GetMarkets(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getMarketsResponse29, false);
                                    } else 

            if("UpdateConversionTagType".equals(methodName)){
                
                api.eyeblaster.com.message.Advertiser.UpdateConversionTagTypeResponse updateConversionTagTypeResponse32 = null;
	                        api.eyeblaster.com.message.Advertiser.UpdateConversionTagTypeRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.UpdateConversionTagTypeRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.UpdateConversionTagTypeRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateConversionTagTypeResponse32 =
                                                   
                                                   
                                                         skel.UpdateConversionTagType(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateConversionTagTypeResponse32, false);
                                    } else 

            if("DeleteBrand".equals(methodName)){
                
                api.eyeblaster.com.message.Advertiser.DeleteBrandRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.DeleteBrandRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.DeleteBrandRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.DeleteBrand(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("CreateConversionTags".equals(methodName)){
                
                api.eyeblaster.com.message.Advertiser.CreateConversionTagsResponse createConversionTagsResponse38 = null;
	                        api.eyeblaster.com.message.Advertiser.CreateConversionTagsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.CreateConversionTagsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.CreateConversionTagsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createConversionTagsResponse38 =
                                                   
                                                   
                                                         skel.CreateConversionTags(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createConversionTagsResponse38, false);
                                    } else 

            if("CreateBrand".equals(methodName)){
                
                api.eyeblaster.com.message.Advertiser.CreateBrandResponse createBrandResponse41 = null;
	                        api.eyeblaster.com.message.Advertiser.CreateBrandRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.CreateBrandRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.CreateBrandRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createBrandResponse41 =
                                                   
                                                   
                                                         skel.CreateBrand(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createBrandResponse41, false);
                                    } else 

            if("GetConversionTagsThirdParty".equals(methodName)){
                
                api.eyeblaster.com.message.Advertiser.GetConversionTagsThirdPartyResponse getConversionTagsThirdPartyResponse44 = null;
	                        api.eyeblaster.com.message.Advertiser.GetConversionTagThirdPartyRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.GetConversionTagThirdPartyRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.GetConversionTagThirdPartyRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getConversionTagsThirdPartyResponse44 =
                                                   
                                                   
                                                         skel.GetConversionTagsThirdParty(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getConversionTagsThirdPartyResponse44, false);
                                    } else 

            if("DeleteAdvertiser".equals(methodName)){
                
                api.eyeblaster.com.message.Advertiser.DeleteAdvertiserResponse deleteAdvertiserResponse47 = null;
	                        api.eyeblaster.com.message.Advertiser.DeleteAdvertiserRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.DeleteAdvertiserRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.DeleteAdvertiserRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteAdvertiserResponse47 =
                                                   
                                                   
                                                         skel.DeleteAdvertiser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteAdvertiserResponse47, false);
                                    } else 

            if("UpdateBrand".equals(methodName)){
                
                api.eyeblaster.com.message.Advertiser.UpdateBrandResponse updateBrandResponse50 = null;
	                        api.eyeblaster.com.message.Advertiser.UpdateBrandRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.UpdateBrandRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.UpdateBrandRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateBrandResponse50 =
                                                   
                                                   
                                                         skel.UpdateBrand(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateBrandResponse50, false);
                                    } else 

            if("GetOffices".equals(methodName)){
                
                api.eyeblaster.com.message.Advertiser.GetOfficesResponse getOfficesResponse53 = null;
	                        api.eyeblaster.com.message.Advertiser.GetOfficesRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.GetOfficesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.GetOfficesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getOfficesResponse53 =
                                                   
                                                   
                                                         skel.GetOffices(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getOfficesResponse53, false);
                                    } else 

            if("GetAdvertiserHistoryActions".equals(methodName)){
                
                api.eyeblaster.com.message.Advertiser.GetHistoryActionsResponse getHistoryActionsResponse56 = null;
	                        api.eyeblaster.com.message.Advertiser.GetHistoryActionsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.GetHistoryActionsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.GetHistoryActionsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryActionsResponse56 =
                                                   
                                                   
                                                         skel.GetAdvertiserHistoryActions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryActionsResponse56, false);
                                    } else 

            if("CreateConversionTag".equals(methodName)){
                
                api.eyeblaster.com.message.Advertiser.CreateConversionTagResponse createConversionTagResponse59 = null;
	                        api.eyeblaster.com.message.Advertiser.CreateConversionTagRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.CreateConversionTagRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.CreateConversionTagRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createConversionTagResponse59 =
                                                   
                                                   
                                                         skel.CreateConversionTag(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createConversionTagResponse59, false);
                                    } else 

            if("UpdateAdvertiser".equals(methodName)){
                
                api.eyeblaster.com.message.Advertiser.UpdateAdvertiserResponse updateAdvertiserResponse62 = null;
	                        api.eyeblaster.com.message.Advertiser.UpdateAdvertiserRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.UpdateAdvertiserRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.UpdateAdvertiserRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateAdvertiserResponse62 =
                                                   
                                                   
                                                         skel.UpdateAdvertiser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateAdvertiserResponse62, false);
                                    } else 

            if("DeleteConversionTagThirdParty".equals(methodName)){
                
                api.eyeblaster.com.message.Advertiser.DeleteConversionTagThirdPartyRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.DeleteConversionTagThirdPartyRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.DeleteConversionTagThirdPartyRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.DeleteConversionTagThirdParty(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("GetAdvertiserHistoryObjects".equals(methodName)){
                
                api.eyeblaster.com.message.Advertiser.GetHistoryObjectsResponse getHistoryObjectsResponse68 = null;
	                        api.eyeblaster.com.message.Advertiser.GetHistoryObjectsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.GetHistoryObjectsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.GetHistoryObjectsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryObjectsResponse68 =
                                                   
                                                   
                                                         skel.GetAdvertiserHistoryObjects(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryObjectsResponse68, false);
                                    } else 

            if("GetCurrencies".equals(methodName)){
                
                api.eyeblaster.com.message.Advertiser.GetCurrenciesResponse getCurrenciesResponse71 = null;
	                        api.eyeblaster.com.message.Advertiser.GetCurrenciesRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.GetCurrenciesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.GetCurrenciesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCurrenciesResponse71 =
                                                   
                                                   
                                                         skel.GetCurrencies(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCurrenciesResponse71, false);
                                    } else 

            if("CreateAdvertiser".equals(methodName)){
                
                api.eyeblaster.com.message.Advertiser.CreateAdvertiserResponse createAdvertiserResponse74 = null;
	                        api.eyeblaster.com.message.Advertiser.CreateAdvertiserRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.CreateAdvertiserRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.CreateAdvertiserRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createAdvertiserResponse74 =
                                                   
                                                   
                                                         skel.CreateAdvertiser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createAdvertiserResponse74, false);
                                    } else 

            if("GetBrands".equals(methodName)){
                
                api.eyeblaster.com.message.Advertiser.GetBrandsResponse getBrandsResponse77 = null;
	                        api.eyeblaster.com.message.Advertiser.GetBrandsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.GetBrandsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.GetBrandsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getBrandsResponse77 =
                                                   
                                                   
                                                         skel.GetBrands(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getBrandsResponse77, false);
                                    } else 

            if("DeleteConversionTags".equals(methodName)){
                
                api.eyeblaster.com.message.Advertiser.DeleteConversionTagsResponse deleteConversionTagsResponse80 = null;
	                        api.eyeblaster.com.message.Advertiser.DeleteConversionTagsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.DeleteConversionTagsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.DeleteConversionTagsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteConversionTagsResponse80 =
                                                   
                                                   
                                                         skel.DeleteConversionTags(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteConversionTagsResponse80, false);
                                    } else 

            if("UpdateConversionTag".equals(methodName)){
                
                api.eyeblaster.com.message.Advertiser.UpdateConversionTagResponse updateConversionTagResponse83 = null;
	                        api.eyeblaster.com.message.Advertiser.UpdateConversionTagRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.UpdateConversionTagRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.UpdateConversionTagRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateConversionTagResponse83 =
                                                   
                                                   
                                                         skel.UpdateConversionTag(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateConversionTagResponse83, false);
                                    } else 

            if("GetConversionTagCode".equals(methodName)){
                
                api.eyeblaster.com.message.Advertiser.ConversionTagCodeResponse conversionTagCodeResponse86 = null;
	                        api.eyeblaster.com.message.Advertiser.ConversionTagCodeRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.ConversionTagCodeRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.ConversionTagCodeRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               conversionTagCodeResponse86 =
                                                   
                                                   
                                                         skel.GetConversionTagCode(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), conversionTagCodeResponse86, false);
                                    } else 

            if("CreateConversionTagThirdParty".equals(methodName)){
                
                api.eyeblaster.com.message.Advertiser.CreateConversionTagThirdPartyResponse createConversionTagThirdPartyResponse89 = null;
	                        api.eyeblaster.com.message.Advertiser.CreateConversionTagThirdPartyRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.CreateConversionTagThirdPartyRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.CreateConversionTagThirdPartyRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createConversionTagThirdPartyResponse89 =
                                                   
                                                   
                                                         skel.CreateConversionTagThirdParty(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createConversionTagThirdPartyResponse89, false);
                                    } else 

            if("GetConversionTags".equals(methodName)){
                
                api.eyeblaster.com.message.Advertiser.GetConversionTagsResponse getConversionTagsResponse92 = null;
	                        api.eyeblaster.com.message.Advertiser.GetConversionTagsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.GetConversionTagsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.GetConversionTagsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getConversionTagsResponse92 =
                                                   
                                                   
                                                         skel.GetConversionTags(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getConversionTagsResponse92, false);
                                    } else 

            if("GetAdvertisers".equals(methodName)){
                
                api.eyeblaster.com.message.Advertiser.GetAdvertisersResponse getAdvertisersResponse95 = null;
	                        api.eyeblaster.com.message.Advertiser.GetAdvertisersRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.GetAdvertisersRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.GetAdvertisersRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAdvertisersResponse95 =
                                                   
                                                   
                                                         skel.GetAdvertisers(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAdvertisersResponse95, false);
                                    } else 

            if("GetAdvertiserHistory".equals(methodName)){
                
                api.eyeblaster.com.message.Advertiser.GetHistoryResponse getHistoryResponse98 = null;
	                        api.eyeblaster.com.message.Advertiser.GetAdvertiserHistoryRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.GetAdvertiserHistoryRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.GetAdvertiserHistoryRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryResponse98 =
                                                   
                                                   
                                                         skel.GetAdvertiserHistory(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryResponse98, false);
                                    } else 

            if("UpdateConversionTagThirdParty".equals(methodName)){
                
                api.eyeblaster.com.message.Advertiser.UpdateConversionTagThirdPartyResponse updateConversionTagThirdPartyResponse101 = null;
	                        api.eyeblaster.com.message.Advertiser.UpdateConversionTagThirdPartyRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.UpdateConversionTagThirdPartyRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.UpdateConversionTagThirdPartyRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateConversionTagThirdPartyResponse101 =
                                                   
                                                   
                                                         skel.UpdateConversionTagThirdParty(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateConversionTagThirdPartyResponse101, false);
                                    } else 

            if("GetSites".equals(methodName)){
                
                api.eyeblaster.com.message.Advertiser.GetSitesResponse getSitesResponse104 = null;
	                        api.eyeblaster.com.message.Advertiser.GetSitesRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Advertiser.GetSitesRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Advertiser.GetSitesRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getSitesResponse104 =
                                                   
                                                   
                                                         skel.GetSites(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getSitesResponse104, false);
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.GetMarketsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.GetMarketsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.GetMarketsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.GetMarketsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.UserSecurityToken param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.UserSecurityToken.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.UpdateConversionTagTypeRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.UpdateConversionTagTypeRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.UpdateConversionTagTypeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.UpdateConversionTagTypeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.DeleteBrandRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.DeleteBrandRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.CreateConversionTagsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.CreateConversionTagsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.CreateConversionTagsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.CreateConversionTagsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.CreateBrandRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.CreateBrandRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.CreateBrandResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.CreateBrandResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.GetConversionTagThirdPartyRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.GetConversionTagThirdPartyRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.GetConversionTagsThirdPartyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.GetConversionTagsThirdPartyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.DeleteAdvertiserRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.DeleteAdvertiserRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.DeleteAdvertiserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.DeleteAdvertiserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.UpdateBrandRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.UpdateBrandRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.UpdateBrandResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.UpdateBrandResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.GetOfficesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.GetOfficesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.GetOfficesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.GetOfficesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.GetHistoryActionsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.GetHistoryActionsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.GetHistoryActionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.GetHistoryActionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.CreateConversionTagRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.CreateConversionTagRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.CreateConversionTagResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.CreateConversionTagResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.UpdateAdvertiserRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.UpdateAdvertiserRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.UpdateAdvertiserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.UpdateAdvertiserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.DeleteConversionTagThirdPartyRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.DeleteConversionTagThirdPartyRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.GetHistoryObjectsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.GetHistoryObjectsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.GetHistoryObjectsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.GetHistoryObjectsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.GetCurrenciesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.GetCurrenciesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.GetCurrenciesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.GetCurrenciesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.CreateAdvertiserRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.CreateAdvertiserRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.CreateAdvertiserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.CreateAdvertiserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.GetBrandsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.GetBrandsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.GetBrandsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.GetBrandsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.DeleteConversionTagsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.DeleteConversionTagsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.DeleteConversionTagsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.DeleteConversionTagsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.UpdateConversionTagRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.UpdateConversionTagRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.UpdateConversionTagResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.UpdateConversionTagResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.ConversionTagCodeRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.ConversionTagCodeRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.ConversionTagCodeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.ConversionTagCodeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.CreateConversionTagThirdPartyRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.CreateConversionTagThirdPartyRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.CreateConversionTagThirdPartyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.CreateConversionTagThirdPartyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.GetConversionTagsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.GetConversionTagsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.GetConversionTagsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.GetConversionTagsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.GetAdvertisersRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.GetAdvertisersRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.GetAdvertisersResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.GetAdvertisersResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.GetAdvertiserHistoryRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.GetAdvertiserHistoryRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.GetHistoryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.GetHistoryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.UpdateConversionTagThirdPartyRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.UpdateConversionTagThirdPartyRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.UpdateConversionTagThirdPartyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.UpdateConversionTagThirdPartyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.GetSitesRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.GetSitesRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Advertiser.GetSitesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Advertiser.GetSitesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Advertiser.GetMarketsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Advertiser.GetMarketsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Advertiser.GetMarketsResponse wrapGetMarkets(){
                                api.eyeblaster.com.message.Advertiser.GetMarketsResponse wrappedElement = new api.eyeblaster.com.message.Advertiser.GetMarketsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Advertiser.UpdateConversionTagTypeResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Advertiser.UpdateConversionTagTypeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Advertiser.UpdateConversionTagTypeResponse wrapUpdateConversionTagType(){
                                api.eyeblaster.com.message.Advertiser.UpdateConversionTagTypeResponse wrappedElement = new api.eyeblaster.com.message.Advertiser.UpdateConversionTagTypeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Advertiser.CreateConversionTagsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Advertiser.CreateConversionTagsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Advertiser.CreateConversionTagsResponse wrapCreateConversionTags(){
                                api.eyeblaster.com.message.Advertiser.CreateConversionTagsResponse wrappedElement = new api.eyeblaster.com.message.Advertiser.CreateConversionTagsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Advertiser.CreateBrandResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Advertiser.CreateBrandResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Advertiser.CreateBrandResponse wrapCreateBrand(){
                                api.eyeblaster.com.message.Advertiser.CreateBrandResponse wrappedElement = new api.eyeblaster.com.message.Advertiser.CreateBrandResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Advertiser.GetConversionTagsThirdPartyResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Advertiser.GetConversionTagsThirdPartyResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Advertiser.GetConversionTagsThirdPartyResponse wrapGetConversionTagsThirdParty(){
                                api.eyeblaster.com.message.Advertiser.GetConversionTagsThirdPartyResponse wrappedElement = new api.eyeblaster.com.message.Advertiser.GetConversionTagsThirdPartyResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Advertiser.DeleteAdvertiserResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Advertiser.DeleteAdvertiserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Advertiser.DeleteAdvertiserResponse wrapDeleteAdvertiser(){
                                api.eyeblaster.com.message.Advertiser.DeleteAdvertiserResponse wrappedElement = new api.eyeblaster.com.message.Advertiser.DeleteAdvertiserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Advertiser.UpdateBrandResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Advertiser.UpdateBrandResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Advertiser.UpdateBrandResponse wrapUpdateBrand(){
                                api.eyeblaster.com.message.Advertiser.UpdateBrandResponse wrappedElement = new api.eyeblaster.com.message.Advertiser.UpdateBrandResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Advertiser.GetOfficesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Advertiser.GetOfficesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Advertiser.GetOfficesResponse wrapGetOffices(){
                                api.eyeblaster.com.message.Advertiser.GetOfficesResponse wrappedElement = new api.eyeblaster.com.message.Advertiser.GetOfficesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Advertiser.GetHistoryActionsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Advertiser.GetHistoryActionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Advertiser.GetHistoryActionsResponse wrapGetAdvertiserHistoryActions(){
                                api.eyeblaster.com.message.Advertiser.GetHistoryActionsResponse wrappedElement = new api.eyeblaster.com.message.Advertiser.GetHistoryActionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Advertiser.CreateConversionTagResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Advertiser.CreateConversionTagResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Advertiser.CreateConversionTagResponse wrapCreateConversionTag(){
                                api.eyeblaster.com.message.Advertiser.CreateConversionTagResponse wrappedElement = new api.eyeblaster.com.message.Advertiser.CreateConversionTagResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Advertiser.UpdateAdvertiserResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Advertiser.UpdateAdvertiserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Advertiser.UpdateAdvertiserResponse wrapUpdateAdvertiser(){
                                api.eyeblaster.com.message.Advertiser.UpdateAdvertiserResponse wrappedElement = new api.eyeblaster.com.message.Advertiser.UpdateAdvertiserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Advertiser.GetHistoryObjectsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Advertiser.GetHistoryObjectsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Advertiser.GetHistoryObjectsResponse wrapGetAdvertiserHistoryObjects(){
                                api.eyeblaster.com.message.Advertiser.GetHistoryObjectsResponse wrappedElement = new api.eyeblaster.com.message.Advertiser.GetHistoryObjectsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Advertiser.GetCurrenciesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Advertiser.GetCurrenciesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Advertiser.GetCurrenciesResponse wrapGetCurrencies(){
                                api.eyeblaster.com.message.Advertiser.GetCurrenciesResponse wrappedElement = new api.eyeblaster.com.message.Advertiser.GetCurrenciesResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Advertiser.CreateAdvertiserResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Advertiser.CreateAdvertiserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Advertiser.CreateAdvertiserResponse wrapCreateAdvertiser(){
                                api.eyeblaster.com.message.Advertiser.CreateAdvertiserResponse wrappedElement = new api.eyeblaster.com.message.Advertiser.CreateAdvertiserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Advertiser.GetBrandsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Advertiser.GetBrandsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Advertiser.GetBrandsResponse wrapGetBrands(){
                                api.eyeblaster.com.message.Advertiser.GetBrandsResponse wrappedElement = new api.eyeblaster.com.message.Advertiser.GetBrandsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Advertiser.DeleteConversionTagsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Advertiser.DeleteConversionTagsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Advertiser.DeleteConversionTagsResponse wrapDeleteConversionTags(){
                                api.eyeblaster.com.message.Advertiser.DeleteConversionTagsResponse wrappedElement = new api.eyeblaster.com.message.Advertiser.DeleteConversionTagsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Advertiser.UpdateConversionTagResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Advertiser.UpdateConversionTagResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Advertiser.UpdateConversionTagResponse wrapUpdateConversionTag(){
                                api.eyeblaster.com.message.Advertiser.UpdateConversionTagResponse wrappedElement = new api.eyeblaster.com.message.Advertiser.UpdateConversionTagResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Advertiser.ConversionTagCodeResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Advertiser.ConversionTagCodeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Advertiser.ConversionTagCodeResponse wrapGetConversionTagCode(){
                                api.eyeblaster.com.message.Advertiser.ConversionTagCodeResponse wrappedElement = new api.eyeblaster.com.message.Advertiser.ConversionTagCodeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Advertiser.CreateConversionTagThirdPartyResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Advertiser.CreateConversionTagThirdPartyResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Advertiser.CreateConversionTagThirdPartyResponse wrapCreateConversionTagThirdParty(){
                                api.eyeblaster.com.message.Advertiser.CreateConversionTagThirdPartyResponse wrappedElement = new api.eyeblaster.com.message.Advertiser.CreateConversionTagThirdPartyResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Advertiser.GetConversionTagsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Advertiser.GetConversionTagsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Advertiser.GetConversionTagsResponse wrapGetConversionTags(){
                                api.eyeblaster.com.message.Advertiser.GetConversionTagsResponse wrappedElement = new api.eyeblaster.com.message.Advertiser.GetConversionTagsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Advertiser.GetAdvertisersResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Advertiser.GetAdvertisersResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Advertiser.GetAdvertisersResponse wrapGetAdvertisers(){
                                api.eyeblaster.com.message.Advertiser.GetAdvertisersResponse wrappedElement = new api.eyeblaster.com.message.Advertiser.GetAdvertisersResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Advertiser.GetHistoryResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Advertiser.GetHistoryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Advertiser.GetHistoryResponse wrapGetAdvertiserHistory(){
                                api.eyeblaster.com.message.Advertiser.GetHistoryResponse wrappedElement = new api.eyeblaster.com.message.Advertiser.GetHistoryResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Advertiser.UpdateConversionTagThirdPartyResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Advertiser.UpdateConversionTagThirdPartyResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Advertiser.UpdateConversionTagThirdPartyResponse wrapUpdateConversionTagThirdParty(){
                                api.eyeblaster.com.message.Advertiser.UpdateConversionTagThirdPartyResponse wrappedElement = new api.eyeblaster.com.message.Advertiser.UpdateConversionTagThirdPartyResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Advertiser.GetSitesResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Advertiser.GetSitesResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Advertiser.GetSitesResponse wrapGetSites(){
                                api.eyeblaster.com.message.Advertiser.GetSitesResponse wrappedElement = new api.eyeblaster.com.message.Advertiser.GetSitesResponse();
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
        
                if (api.eyeblaster.com.message.Advertiser.GetMarketsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.GetMarketsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.GetMarketsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.GetMarketsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UpdateConversionTagTypeRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UpdateConversionTagTypeRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UpdateConversionTagTypeResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UpdateConversionTagTypeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.DeleteBrandRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.DeleteBrandRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.CreateConversionTagsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.CreateConversionTagsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.CreateConversionTagsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.CreateConversionTagsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.CreateBrandRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.CreateBrandRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.CreateBrandResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.CreateBrandResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.GetConversionTagThirdPartyRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.GetConversionTagThirdPartyRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.GetConversionTagsThirdPartyResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.GetConversionTagsThirdPartyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.DeleteAdvertiserRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.DeleteAdvertiserRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.DeleteAdvertiserResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.DeleteAdvertiserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UpdateBrandRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UpdateBrandRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UpdateBrandResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UpdateBrandResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.GetOfficesRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.GetOfficesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.GetOfficesResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.GetOfficesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.GetHistoryActionsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.GetHistoryActionsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.GetHistoryActionsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.GetHistoryActionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.CreateConversionTagRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.CreateConversionTagRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.CreateConversionTagResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.CreateConversionTagResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UpdateAdvertiserRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UpdateAdvertiserRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UpdateAdvertiserResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UpdateAdvertiserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.DeleteConversionTagThirdPartyRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.DeleteConversionTagThirdPartyRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.GetHistoryObjectsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.GetHistoryObjectsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.GetHistoryObjectsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.GetHistoryObjectsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.GetCurrenciesRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.GetCurrenciesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.GetCurrenciesResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.GetCurrenciesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.CreateAdvertiserRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.CreateAdvertiserRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.CreateAdvertiserResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.CreateAdvertiserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.GetBrandsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.GetBrandsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.GetBrandsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.GetBrandsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.DeleteConversionTagsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.DeleteConversionTagsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.DeleteConversionTagsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.DeleteConversionTagsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UpdateConversionTagRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UpdateConversionTagRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UpdateConversionTagResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UpdateConversionTagResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.ConversionTagCodeRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.ConversionTagCodeRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.ConversionTagCodeResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.ConversionTagCodeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.CreateConversionTagThirdPartyRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.CreateConversionTagThirdPartyRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.CreateConversionTagThirdPartyResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.CreateConversionTagThirdPartyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.GetConversionTagsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.GetConversionTagsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.GetConversionTagsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.GetConversionTagsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.GetAdvertisersRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.GetAdvertisersRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.GetAdvertisersResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.GetAdvertisersResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.GetAdvertiserHistoryRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.GetAdvertiserHistoryRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.GetHistoryResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.GetHistoryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UpdateConversionTagThirdPartyRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UpdateConversionTagThirdPartyRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UpdateConversionTagThirdPartyResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UpdateConversionTagThirdPartyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.GetSitesRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.GetSitesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.GetSitesResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.GetSitesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Advertiser.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Advertiser.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    