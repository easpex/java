
/**
 * AuthenticationServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */
        package api.eyeblaster.com.Authentication;

        /**
        *  AuthenticationServiceMessageReceiverInOut message receiver
        */

        public class AuthenticationServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        AuthenticationServiceSkeleton skel = (AuthenticationServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJava(op.getName().getLocalPart())) != null)){

        

            if("ClientImpersonation".equals(methodName)){
                
                api.eyeblaster.com.Authentication.ClientImpersonationResponse clientImpersonationResponse1 = null;
	                        api.eyeblaster.com.Authentication.ClientImpersonation wrappedParam =
                                                             (api.eyeblaster.com.Authentication.ClientImpersonation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.Authentication.ClientImpersonation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               clientImpersonationResponse1 =
                                                   
                                                   
                                                         skel.ClientImpersonation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), clientImpersonationResponse1, false);
                                    } else 

            if("ClientLogin".equals(methodName)){
                
                api.eyeblaster.com.Authentication.ClientLoginResponse clientLoginResponse3 = null;
	                        api.eyeblaster.com.Authentication.ClientLogin wrappedParam =
                                                             (api.eyeblaster.com.Authentication.ClientLogin)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.Authentication.ClientLogin.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               clientLoginResponse3 =
                                                   
                                                   
                                                         skel.ClientLogin(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), clientLoginResponse3, false);
                                    } else 

            if("GetClientInfo".equals(methodName)){
                
                api.eyeblaster.com.message.Authentication.GetClientInfoResponse getClientInfoResponse6 = null;
	                        api.eyeblaster.com.message.Authentication.GetClientInfoRequest wrappedParam =
                                                             (api.eyeblaster.com.message.Authentication.GetClientInfoRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.message.Authentication.GetClientInfoRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getClientInfoResponse6 =
                                                   
                                                   
                                                         skel.GetClientInfo(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getClientInfoResponse6, false);
                                    } else 

            if("ClientLogout".equals(methodName)){
                
                api.eyeblaster.com.Authentication.ClientLogoutResponse clientLogoutResponse8 = null;
	                        api.eyeblaster.com.Authentication.ClientLogout wrappedParam =
                                                             (api.eyeblaster.com.Authentication.ClientLogout)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    api.eyeblaster.com.Authentication.ClientLogout.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               clientLogoutResponse8 =
                                                   
                                                   
                                                         skel.ClientLogout(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), clientLogoutResponse8, false);
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.Authentication.ClientImpersonation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.Authentication.ClientImpersonation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.Authentication.ClientImpersonationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.Authentication.ClientImpersonationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.Authentication.ClientLogin param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.Authentication.ClientLogin.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.Authentication.ClientLoginResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.Authentication.ClientLoginResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Authentication.GetClientInfoRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Authentication.GetClientInfoRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Authentication.GetClientInfoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Authentication.GetClientInfoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.message.Authentication.UserSecurityToken param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.message.Authentication.UserSecurityToken.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.Authentication.ClientLogout param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.Authentication.ClientLogout.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(api.eyeblaster.com.Authentication.ClientLogoutResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(api.eyeblaster.com.Authentication.ClientLogoutResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.Authentication.ClientImpersonationResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.Authentication.ClientImpersonationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.Authentication.ClientImpersonationResponse wrapClientImpersonation(){
                                api.eyeblaster.com.Authentication.ClientImpersonationResponse wrappedElement = new api.eyeblaster.com.Authentication.ClientImpersonationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.Authentication.ClientLoginResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.Authentication.ClientLoginResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.Authentication.ClientLoginResponse wrapClientLogin(){
                                api.eyeblaster.com.Authentication.ClientLoginResponse wrappedElement = new api.eyeblaster.com.Authentication.ClientLoginResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.message.Authentication.GetClientInfoResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.message.Authentication.GetClientInfoResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.message.Authentication.GetClientInfoResponse wrapGetClientInfo(){
                                api.eyeblaster.com.message.Authentication.GetClientInfoResponse wrappedElement = new api.eyeblaster.com.message.Authentication.GetClientInfoResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, api.eyeblaster.com.Authentication.ClientLogoutResponse param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(api.eyeblaster.com.Authentication.ClientLogoutResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private api.eyeblaster.com.Authentication.ClientLogoutResponse wrapClientLogout(){
                                api.eyeblaster.com.Authentication.ClientLogoutResponse wrappedElement = new api.eyeblaster.com.Authentication.ClientLogoutResponse();
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
        
                if (api.eyeblaster.com.Authentication.ClientImpersonation.class.equals(type)){
                
                           return api.eyeblaster.com.Authentication.ClientImpersonation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.Authentication.ClientImpersonationResponse.class.equals(type)){
                
                           return api.eyeblaster.com.Authentication.ClientImpersonationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.Authentication.ClientLogin.class.equals(type)){
                
                           return api.eyeblaster.com.Authentication.ClientLogin.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.Authentication.ClientLoginResponse.class.equals(type)){
                
                           return api.eyeblaster.com.Authentication.ClientLoginResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Authentication.GetClientInfoRequest.class.equals(type)){
                
                           return api.eyeblaster.com.message.Authentication.GetClientInfoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Authentication.GetClientInfoResponse.class.equals(type)){
                
                           return api.eyeblaster.com.message.Authentication.GetClientInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.message.Authentication.UserSecurityToken.class.equals(type)){
                
                           return api.eyeblaster.com.message.Authentication.UserSecurityToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.Authentication.ClientLogout.class.equals(type)){
                
                           return api.eyeblaster.com.Authentication.ClientLogout.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (api.eyeblaster.com.Authentication.ClientLogoutResponse.class.equals(type)){
                
                           return api.eyeblaster.com.Authentication.ClientLogoutResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    