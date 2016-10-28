
/**
 * CreativeAssetServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */
        package api.eyeblaster.com.CreativeAsset;

        /**
        *  CreativeAssetServiceMessageReceiverInOut message receiver
        */

        public class CreativeAssetServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        CreativeAssetServiceSkeleton skel = (CreativeAssetServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJava(op.getName().getLocalPart())) != null)){

        

            if("DeleteCreativeAssets".equals(methodName)){
                
                api.eyeblaster.com.message.CreativeAsset.DeleteCreativeAssetsResponse deleteCreativeAssetsResponse21 = null;
	                        api.eyeblaster.com.message.CreativeAsset.DeleteCreativeAssetsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.CreativeAsset.DeleteCreativeAssetsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.CreativeAsset.DeleteCreativeAssetsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               deleteCreativeAssetsResponse21 =
                                                   
                                                   
                                                         skel.DeleteCreativeAssets(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), deleteCreativeAssetsResponse21, false);
                                    } else 

            if("DeleteFolder".equals(methodName)){
                
                api.eyeblaster.com.message.CreativeAsset.DeleteFolderRequest wrappedParam =
                                                             (api.eyeblaster.com.message.CreativeAsset.DeleteFolderRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.CreativeAsset.DeleteFolderRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               
                                                         skel.DeleteFolder(wrappedParam)
                                                    ;
                                            
                                        envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                                    } else 

            if("GetRootFolder".equals(methodName)){
                
                api.eyeblaster.com.message.CreativeAsset.GetFolderResponse getFolderResponse27 = null;
	                        api.eyeblaster.com.message.CreativeAsset.RequestBase wrappedParam =
                                                             (api.eyeblaster.com.message.CreativeAsset.RequestBase)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.CreativeAsset.RequestBase.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getFolderResponse27 =
                                                   
                                                   
                                                         skel.GetRootFolder(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getFolderResponse27, false);
                                    } else 

            if("UpdateFolder".equals(methodName)){
                
                api.eyeblaster.com.message.CreativeAsset.UpdateFolderResponse updateFolderResponse30 = null;
	                        api.eyeblaster.com.message.CreativeAsset.UpdateFolderRequest wrappedParam =
                                                             (api.eyeblaster.com.message.CreativeAsset.UpdateFolderRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.CreativeAsset.UpdateFolderRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateFolderResponse30 =
                                                   
                                                   
                                                         skel.UpdateFolder(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateFolderResponse30, false);
                                    } else 

            if("CreateFolder".equals(methodName)){
                
                api.eyeblaster.com.message.CreativeAsset.CreateFolderResponse createFolderResponse33 = null;
	                        api.eyeblaster.com.message.CreativeAsset.CreateFolderRequest wrappedParam =
                                                             (api.eyeblaster.com.message.CreativeAsset.CreateFolderRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.CreativeAsset.CreateFolderRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createFolderResponse33 =
                                                   
                                                   
                                                         skel.CreateFolder(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createFolderResponse33, false);
                                    } else 

            if("GetCreativeAssets".equals(methodName)){
                
                api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetsResponse getCreativeAssetsResponse36 = null;
	                        api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCreativeAssetsResponse36 =
                                                   
                                                   
                                                         skel.GetCreativeAssets(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCreativeAssetsResponse36, false);
                                    } else 

            if("UpdateCreativeAsset".equals(methodName)){
                
                api.eyeblaster.com.message.CreativeAsset.UpdateCreativeAssetResponse updateCreativeAssetResponse39 = null;
	                        api.eyeblaster.com.message.CreativeAsset.UpdateCreativeAssetRequest wrappedParam =
                                                             (api.eyeblaster.com.message.CreativeAsset.UpdateCreativeAssetRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.CreativeAsset.UpdateCreativeAssetRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateCreativeAssetResponse39 =
                                                   
                                                   
                                                         skel.UpdateCreativeAsset(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateCreativeAssetResponse39, false);
                                    } else 

            if("GetRootFolderID".equals(methodName)){
                
                api.eyeblaster.com.message.CreativeAsset.GetFolderIDResponse getFolderIDResponse42 = null;
	                        api.eyeblaster.com.message.CreativeAsset.RequestBase wrappedParam =
                                                             (api.eyeblaster.com.message.CreativeAsset.RequestBase)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.CreativeAsset.RequestBase.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getFolderIDResponse42 =
                                                   
                                                   
                                                         skel.GetRootFolderID(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getFolderIDResponse42, false);
                                    } else 

            if("GetFoldersByName".equals(methodName)){
                
                api.eyeblaster.com.message.CreativeAsset.GetFoldersResponse getFoldersResponse45 = null;
	                        api.eyeblaster.com.message.CreativeAsset.GetFolderNameRequest wrappedParam =
                                                             (api.eyeblaster.com.message.CreativeAsset.GetFolderNameRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.CreativeAsset.GetFolderNameRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getFoldersResponse45 =
                                                   
                                                   
                                                         skel.GetFoldersByName(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getFoldersResponse45, false);
                                    } else 

            if("GetCreativeAssetHistoryActions".equals(methodName)){
                
                api.eyeblaster.com.message.CreativeAsset.GetHistoryActionsResponse getHistoryActionsResponse48 = null;
	                        api.eyeblaster.com.message.CreativeAsset.GetHistoryActionsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.CreativeAsset.GetHistoryActionsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.CreativeAsset.GetHistoryActionsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryActionsResponse48 =
                                                   
                                                   
                                                         skel.GetCreativeAssetHistoryActions(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryActionsResponse48, false);
                                    } else 

            if("GetCreativeAssetHistoryObjects".equals(methodName)){
                
                api.eyeblaster.com.message.CreativeAsset.GetHistoryObjectsResponse getHistoryObjectsResponse51 = null;
	                        api.eyeblaster.com.message.CreativeAsset.GetHistoryObjectsRequest wrappedParam =
                                                             (api.eyeblaster.com.message.CreativeAsset.GetHistoryObjectsRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.CreativeAsset.GetHistoryObjectsRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryObjectsResponse51 =
                                                   
                                                   
                                                         skel.GetCreativeAssetHistoryObjects(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryObjectsResponse51, false);
                                    } else 

            if("CreateCreativeAsset".equals(methodName)){
                
                api.eyeblaster.com.message.CreativeAsset.CreateCreativeAssetResponse createCreativeAssetResponse54 = null;
	                        api.eyeblaster.com.message.CreativeAsset.CreateCreativeAssetRequest wrappedParam =
                                                             (api.eyeblaster.com.message.CreativeAsset.CreateCreativeAssetRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.CreativeAsset.CreateCreativeAssetRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               createCreativeAssetResponse54 =
                                                   
                                                   
                                                         skel.CreateCreativeAsset(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), createCreativeAssetResponse54, false);
                                    } else 

            if("GetCreativeAssetHistory".equals(methodName)){
                
                api.eyeblaster.com.message.CreativeAsset.GetHistoryResponse getHistoryResponse57 = null;
	                        api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetHistoryRequest wrappedParam =
                                                             (api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetHistoryRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetHistoryRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getHistoryResponse57 =
                                                   
                                                   
                                                         skel.GetCreativeAssetHistory(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getHistoryResponse57, false);
                                    } else 

            if("GetFolder".equals(methodName)){
                
                api.eyeblaster.com.message.CreativeAsset.GetFolderResponse getFolderResponse60 = null;
	                        api.eyeblaster.com.message.CreativeAsset.GetFolderRequest wrappedParam =
                                                             (api.eyeblaster.com.message.CreativeAsset.GetFolderRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.CreativeAsset.GetFolderRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getFolderResponse60 =
                                                   
                                                   
                                                         skel.GetFolder(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getFolderResponse60, false);
                                    } else 

            if("GetCreativeAssetAvailableType".equals(methodName)){
                
                api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetTypeResponse getCreativeAssetTypeResponse63 = null;
	                        api.eyeblaster.com.message.CreativeAsset.RequestBase wrappedParam =
                                                             (api.eyeblaster.com.message.CreativeAsset.RequestBase)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.CreativeAsset.RequestBase.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCreativeAssetTypeResponse63 =
                                                   
                                                   
                                                         skel.GetCreativeAssetAvailableType(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCreativeAssetTypeResponse63, false);
                                    } else 

            if("GetCreativeAsset".equals(methodName)){
                
                api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetResponse getCreativeAssetResponse66 = null;
	                        api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetRequest wrappedParam =
                                                             (api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getCreativeAssetResponse66 =
                                                   
                                                   
                                                         skel.GetCreativeAsset(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getCreativeAssetResponse66, false);
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.DeleteCreativeAssetsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.DeleteCreativeAssetsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.DeleteCreativeAssetsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.DeleteCreativeAssetsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.UserSecurityToken param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.DeleteFolderRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.DeleteFolderRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.RequestBase param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.RequestBase.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.GetFolderResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.GetFolderResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.UpdateFolderRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.UpdateFolderRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.UpdateFolderResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.UpdateFolderResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.CreateFolderRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.CreateFolderRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.CreateFolderResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.CreateFolderResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.UpdateCreativeAssetRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.UpdateCreativeAssetRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.UpdateCreativeAssetResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.UpdateCreativeAssetResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.GetFolderIDResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.GetFolderIDResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.GetFolderNameRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.GetFolderNameRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.GetFoldersResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.GetFoldersResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.GetHistoryActionsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.GetHistoryActionsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.GetHistoryActionsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.GetHistoryActionsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.GetHistoryObjectsRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.GetHistoryObjectsRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.GetHistoryObjectsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.GetHistoryObjectsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.CreateCreativeAssetRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.CreateCreativeAssetRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.CreateCreativeAssetResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.CreateCreativeAssetResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetHistoryRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetHistoryRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.GetHistoryResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.GetHistoryResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.GetFolderRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.GetFolderRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetTypeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetTypeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.CreativeAsset.DeleteCreativeAssetsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.CreativeAsset.DeleteCreativeAssetsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.CreativeAsset.DeleteCreativeAssetsResponse wrapDeleteCreativeAssets(){
                                api.eyeblaster.com.message.CreativeAsset.DeleteCreativeAssetsResponse wrappedElement = new api.eyeblaster.com.message.CreativeAsset.DeleteCreativeAssetsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.CreativeAsset.GetFolderResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.CreativeAsset.GetFolderResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.CreativeAsset.GetFolderResponse wrapGetRootFolder(){
                                api.eyeblaster.com.message.CreativeAsset.GetFolderResponse wrappedElement = new api.eyeblaster.com.message.CreativeAsset.GetFolderResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.CreativeAsset.UpdateFolderResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.CreativeAsset.UpdateFolderResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.CreativeAsset.UpdateFolderResponse wrapUpdateFolder(){
                                api.eyeblaster.com.message.CreativeAsset.UpdateFolderResponse wrappedElement = new api.eyeblaster.com.message.CreativeAsset.UpdateFolderResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.CreativeAsset.CreateFolderResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.CreativeAsset.CreateFolderResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.CreativeAsset.CreateFolderResponse wrapCreateFolder(){
                                api.eyeblaster.com.message.CreativeAsset.CreateFolderResponse wrappedElement = new api.eyeblaster.com.message.CreativeAsset.CreateFolderResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetsResponse wrapGetCreativeAssets(){
                                api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetsResponse wrappedElement = new api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.CreativeAsset.UpdateCreativeAssetResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.CreativeAsset.UpdateCreativeAssetResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.CreativeAsset.UpdateCreativeAssetResponse wrapUpdateCreativeAsset(){
                                api.eyeblaster.com.message.CreativeAsset.UpdateCreativeAssetResponse wrappedElement = new api.eyeblaster.com.message.CreativeAsset.UpdateCreativeAssetResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.CreativeAsset.GetFolderIDResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.CreativeAsset.GetFolderIDResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.CreativeAsset.GetFolderIDResponse wrapGetRootFolderID(){
                                api.eyeblaster.com.message.CreativeAsset.GetFolderIDResponse wrappedElement = new api.eyeblaster.com.message.CreativeAsset.GetFolderIDResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.CreativeAsset.GetFoldersResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.CreativeAsset.GetFoldersResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.CreativeAsset.GetFoldersResponse wrapGetFoldersByName(){
                                api.eyeblaster.com.message.CreativeAsset.GetFoldersResponse wrappedElement = new api.eyeblaster.com.message.CreativeAsset.GetFoldersResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.CreativeAsset.GetHistoryActionsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.CreativeAsset.GetHistoryActionsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.CreativeAsset.GetHistoryActionsResponse wrapGetCreativeAssetHistoryActions(){
                                api.eyeblaster.com.message.CreativeAsset.GetHistoryActionsResponse wrappedElement = new api.eyeblaster.com.message.CreativeAsset.GetHistoryActionsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.CreativeAsset.GetHistoryObjectsResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.CreativeAsset.GetHistoryObjectsResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.CreativeAsset.GetHistoryObjectsResponse wrapGetCreativeAssetHistoryObjects(){
                                api.eyeblaster.com.message.CreativeAsset.GetHistoryObjectsResponse wrappedElement = new api.eyeblaster.com.message.CreativeAsset.GetHistoryObjectsResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.CreativeAsset.CreateCreativeAssetResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.CreativeAsset.CreateCreativeAssetResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.CreativeAsset.CreateCreativeAssetResponse wrapCreateCreativeAsset(){
                                api.eyeblaster.com.message.CreativeAsset.CreateCreativeAssetResponse wrappedElement = new api.eyeblaster.com.message.CreativeAsset.CreateCreativeAssetResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.CreativeAsset.GetHistoryResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.CreativeAsset.GetHistoryResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.CreativeAsset.GetHistoryResponse wrapGetCreativeAssetHistory(){
                                api.eyeblaster.com.message.CreativeAsset.GetHistoryResponse wrappedElement = new api.eyeblaster.com.message.CreativeAsset.GetHistoryResponse();
                                return wrappedElement;
                         }
                    
                         private api.eyeblaster.com.message.CreativeAsset.GetFolderResponse wrapGetFolder(){
                                api.eyeblaster.com.message.CreativeAsset.GetFolderResponse wrappedElement = new api.eyeblaster.com.message.CreativeAsset.GetFolderResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetTypeResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetTypeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetTypeResponse wrapGetCreativeAssetAvailableType(){
                                api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetTypeResponse wrappedElement = new api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetTypeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetResponse wrapGetCreativeAsset(){
                                api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetResponse wrappedElement = new api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetResponse();
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
        
                if (api.eyeblaster.com.message.CreativeAsset.DeleteCreativeAssetsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.DeleteCreativeAssetsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.DeleteCreativeAssetsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.DeleteCreativeAssetsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.DeleteFolderRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.DeleteFolderRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.RequestBase.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.RequestBase.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.GetFolderResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.GetFolderResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.UpdateFolderRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.UpdateFolderRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.UpdateFolderResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.UpdateFolderResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.CreateFolderRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.CreateFolderRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.CreateFolderResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.CreateFolderResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.UpdateCreativeAssetRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.UpdateCreativeAssetRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.UpdateCreativeAssetResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.UpdateCreativeAssetResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.RequestBase.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.RequestBase.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.GetFolderIDResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.GetFolderIDResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.GetFolderNameRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.GetFolderNameRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.GetFoldersResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.GetFoldersResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.GetHistoryActionsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.GetHistoryActionsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.GetHistoryActionsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.GetHistoryActionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.GetHistoryObjectsRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.GetHistoryObjectsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.GetHistoryObjectsResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.GetHistoryObjectsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.CreateCreativeAssetRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.CreateCreativeAssetRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.CreateCreativeAssetResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.CreateCreativeAssetResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetHistoryRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetHistoryRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.GetHistoryResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.GetHistoryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.GetFolderRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.GetFolderRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.GetFolderResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.GetFolderResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.RequestBase.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.RequestBase.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetTypeResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetTypeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.GetCreativeAssetResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.CreativeAsset.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    