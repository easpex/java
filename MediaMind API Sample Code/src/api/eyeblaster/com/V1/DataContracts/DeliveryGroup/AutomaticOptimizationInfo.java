
/**
 * AutomaticOptimizationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */
            
                package api.eyeblaster.com.V1.DataContracts.DeliveryGroup;
            

            /**
            *  AutomaticOptimizationInfo bean class
            */
        
        public  class AutomaticOptimizationInfo extends api.eyeblaster.com.V1.DataContracts.DeliveryGroup.BaseDC
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = AutomaticOptimizationInfo
                Namespace URI = http://api.eyeblaster.com/V1/DataContracts
                Namespace Prefix = ns2
                */
            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://api.eyeblaster.com/V1/DataContracts")){
                return "ns2";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for ConversionsMetrics
                        */

                        
                                    protected com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint localConversionsMetrics ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localConversionsMetricsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint
                           */
                           public  com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint getConversionsMetrics(){
                               return localConversionsMetrics;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ConversionsMetrics
                               */
                               public void setConversionsMetrics(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localConversionsMetricsTracker = true;
                                       } else {
                                          localConversionsMetricsTracker = true;
                                              
                                       }
                                   
                                            this.localConversionsMetrics=param;
                                    

                               }
                            

                        /**
                        * field for FirstMetricType
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.AutomaticOptimizationMetricTypes localFirstMetricType ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.AutomaticOptimizationMetricTypes
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.AutomaticOptimizationMetricTypes getFirstMetricType(){
                               return localFirstMetricType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FirstMetricType
                               */
                               public void setFirstMetricType(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.AutomaticOptimizationMetricTypes param){
                            
                                            this.localFirstMetricType=param;
                                    

                               }
                            

                        /**
                        * field for FirstMetricWeight
                        */

                        
                                    protected int localFirstMetricWeight ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getFirstMetricWeight(){
                               return localFirstMetricWeight;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FirstMetricWeight
                               */
                               public void setFirstMetricWeight(int param){
                            
                                            this.localFirstMetricWeight=param;
                                    

                               }
                            

                        /**
                        * field for GeoTargetingCountryID
                        */

                        
                                    protected int localGeoTargetingCountryID ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getGeoTargetingCountryID(){
                               return localGeoTargetingCountryID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeoTargetingCountryID
                               */
                               public void setGeoTargetingCountryID(int param){
                            
                                            this.localGeoTargetingCountryID=param;
                                    

                               }
                            

                        /**
                        * field for GeoTargetingKeywords
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.ArrayOfAutomaticOptimizationKeywordInfo localGeoTargetingKeywords ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeoTargetingKeywordsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.ArrayOfAutomaticOptimizationKeywordInfo
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.ArrayOfAutomaticOptimizationKeywordInfo getGeoTargetingKeywords(){
                               return localGeoTargetingKeywords;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeoTargetingKeywords
                               */
                               public void setGeoTargetingKeywords(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.ArrayOfAutomaticOptimizationKeywordInfo param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localGeoTargetingKeywordsTracker = true;
                                       } else {
                                          localGeoTargetingKeywordsTracker = true;
                                              
                                       }
                                   
                                            this.localGeoTargetingKeywords=param;
                                    

                               }
                            

                        /**
                        * field for GeoTargetingStateID
                        */

                        
                                    protected int localGeoTargetingStateID ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getGeoTargetingStateID(){
                               return localGeoTargetingStateID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeoTargetingStateID
                               */
                               public void setGeoTargetingStateID(int param){
                            
                                            this.localGeoTargetingStateID=param;
                                    

                               }
                            

                        /**
                        * field for GeoTargetingType
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.TargetingGeoLevelTypes localGeoTargetingType ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.TargetingGeoLevelTypes
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.TargetingGeoLevelTypes getGeoTargetingType(){
                               return localGeoTargetingType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeoTargetingType
                               */
                               public void setGeoTargetingType(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.TargetingGeoLevelTypes param){
                            
                                            this.localGeoTargetingType=param;
                                    

                               }
                            

                        /**
                        * field for GeoTargetingZipCodes
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.ArrayOfAutomaticOptimizationZipCodeInfo localGeoTargetingZipCodes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGeoTargetingZipCodesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.ArrayOfAutomaticOptimizationZipCodeInfo
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.ArrayOfAutomaticOptimizationZipCodeInfo getGeoTargetingZipCodes(){
                               return localGeoTargetingZipCodes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GeoTargetingZipCodes
                               */
                               public void setGeoTargetingZipCodes(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.ArrayOfAutomaticOptimizationZipCodeInfo param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localGeoTargetingZipCodesTracker = true;
                                       } else {
                                          localGeoTargetingZipCodesTracker = true;
                                              
                                       }
                                   
                                            this.localGeoTargetingZipCodes=param;
                                    

                               }
                            

                        /**
                        * field for InteractionsMetrics
                        */

                        
                                    protected com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring localInteractionsMetrics ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInteractionsMetricsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring
                           */
                           public  com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getInteractionsMetrics(){
                               return localInteractionsMetrics;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InteractionsMetrics
                               */
                               public void setInteractionsMetrics(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localInteractionsMetricsTracker = true;
                                       } else {
                                          localInteractionsMetricsTracker = true;
                                              
                                       }
                                   
                                            this.localInteractionsMetrics=param;
                                    

                               }
                            

                        /**
                        * field for LevelType
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.AutomaticOptimizationLevelTypes localLevelType ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.AutomaticOptimizationLevelTypes
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.AutomaticOptimizationLevelTypes getLevelType(){
                               return localLevelType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LevelType
                               */
                               public void setLevelType(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.AutomaticOptimizationLevelTypes param){
                            
                                            this.localLevelType=param;
                                    

                               }
                            

                        /**
                        * field for MethodType
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.AutomaticOptimizationMethodTypes localMethodType ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.AutomaticOptimizationMethodTypes
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.AutomaticOptimizationMethodTypes getMethodType(){
                               return localMethodType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MethodType
                               */
                               public void setMethodType(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.AutomaticOptimizationMethodTypes param){
                            
                                            this.localMethodType=param;
                                    

                               }
                            

                        /**
                        * field for SecondConversionsMetrics
                        */

                        
                                    protected com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint localSecondConversionsMetrics ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSecondConversionsMetricsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint
                           */
                           public  com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint getSecondConversionsMetrics(){
                               return localSecondConversionsMetrics;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SecondConversionsMetrics
                               */
                               public void setSecondConversionsMetrics(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSecondConversionsMetricsTracker = true;
                                       } else {
                                          localSecondConversionsMetricsTracker = true;
                                              
                                       }
                                   
                                            this.localSecondConversionsMetrics=param;
                                    

                               }
                            

                        /**
                        * field for SecondInteractionsMetrics
                        */

                        
                                    protected com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring localSecondInteractionsMetrics ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSecondInteractionsMetricsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring
                           */
                           public  com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring getSecondInteractionsMetrics(){
                               return localSecondInteractionsMetrics;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SecondInteractionsMetrics
                               */
                               public void setSecondInteractionsMetrics(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSecondInteractionsMetricsTracker = true;
                                       } else {
                                          localSecondInteractionsMetricsTracker = true;
                                              
                                       }
                                   
                                            this.localSecondInteractionsMetrics=param;
                                    

                               }
                            

                        /**
                        * field for SecondMetricType
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.AutomaticOptimizationMetricTypes localSecondMetricType ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.AutomaticOptimizationMetricTypes
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.AutomaticOptimizationMetricTypes getSecondMetricType(){
                               return localSecondMetricType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SecondMetricType
                               */
                               public void setSecondMetricType(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.AutomaticOptimizationMetricTypes param){
                            
                                            this.localSecondMetricType=param;
                                    

                               }
                            

                        /**
                        * field for SecondMetricWeight
                        */

                        
                                    protected int localSecondMetricWeight ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getSecondMetricWeight(){
                               return localSecondMetricWeight;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SecondMetricWeight
                               */
                               public void setSecondMetricWeight(int param){
                            
                                            this.localSecondMetricWeight=param;
                                    

                               }
                            

                        /**
                        * field for TargetingType
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.TargetingTypes localTargetingType ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.TargetingTypes
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.TargetingTypes getTargetingType(){
                               return localTargetingType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TargetingType
                               */
                               public void setTargetingType(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.TargetingTypes param){
                            
                                            this.localTargetingType=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

                 public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       AutomaticOptimizationInfo.this.serialize(parentQName,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               parentQName,factory,dataSource);
            
       }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       final org.apache.axiom.om.OMFactory factory,
                                       org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,factory,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();

                    if ((namespace != null) && (namespace.trim().length() > 0)) {
                        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                        if (writerPrefix != null) {
                            xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                        } else {
                            if (prefix == null) {
                                prefix = generatePrefix(namespace);
                            }

                            xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                            xmlWriter.writeNamespace(prefix, namespace);
                            xmlWriter.setPrefix(prefix, namespace);
                        }
                    } else {
                        xmlWriter.writeStartElement(parentQName.getLocalPart());
                    }
                

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://api.eyeblaster.com/V1/DataContracts");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":AutomaticOptimizationInfo",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "AutomaticOptimizationInfo",
                           xmlWriter);
                   }

               
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ID");
                                    }
                                
                                               if (localID==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("ID cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localConversionsMetricsTracker){
                                    if (localConversionsMetrics==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ConversionsMetrics", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ConversionsMetrics");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ConversionsMetrics");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localConversionsMetrics.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ConversionsMetrics"),
                                        factory,xmlWriter);
                                    }
                                }
                                    if (localFirstMetricType==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"FirstMetricType", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"FirstMetricType");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("FirstMetricType");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localFirstMetricType.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","FirstMetricType"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"FirstMetricWeight", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"FirstMetricWeight");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("FirstMetricWeight");
                                    }
                                
                                               if (localFirstMetricWeight==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFirstMetricWeight));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"GeoTargetingCountryID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"GeoTargetingCountryID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("GeoTargetingCountryID");
                                    }
                                
                                               if (localGeoTargetingCountryID==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("GeoTargetingCountryID cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeoTargetingCountryID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localGeoTargetingKeywordsTracker){
                                    if (localGeoTargetingKeywords==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"GeoTargetingKeywords", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"GeoTargetingKeywords");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("GeoTargetingKeywords");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localGeoTargetingKeywords.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","GeoTargetingKeywords"),
                                        factory,xmlWriter);
                                    }
                                }
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"GeoTargetingStateID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"GeoTargetingStateID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("GeoTargetingStateID");
                                    }
                                
                                               if (localGeoTargetingStateID==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("GeoTargetingStateID cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeoTargetingStateID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localGeoTargetingType==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"GeoTargetingType", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"GeoTargetingType");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("GeoTargetingType");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localGeoTargetingType.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","GeoTargetingType"),
                                        factory,xmlWriter);
                                    }
                                 if (localGeoTargetingZipCodesTracker){
                                    if (localGeoTargetingZipCodes==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"GeoTargetingZipCodes", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"GeoTargetingZipCodes");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("GeoTargetingZipCodes");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localGeoTargetingZipCodes.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","GeoTargetingZipCodes"),
                                        factory,xmlWriter);
                                    }
                                } if (localInteractionsMetricsTracker){
                                    if (localInteractionsMetrics==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"InteractionsMetrics", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"InteractionsMetrics");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("InteractionsMetrics");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localInteractionsMetrics.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","InteractionsMetrics"),
                                        factory,xmlWriter);
                                    }
                                }
                                    if (localLevelType==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"LevelType", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"LevelType");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("LevelType");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLevelType.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","LevelType"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localMethodType==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"MethodType", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"MethodType");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("MethodType");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localMethodType.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","MethodType"),
                                        factory,xmlWriter);
                                    }
                                 if (localSecondConversionsMetricsTracker){
                                    if (localSecondConversionsMetrics==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"SecondConversionsMetrics", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"SecondConversionsMetrics");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("SecondConversionsMetrics");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSecondConversionsMetrics.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SecondConversionsMetrics"),
                                        factory,xmlWriter);
                                    }
                                } if (localSecondInteractionsMetricsTracker){
                                    if (localSecondInteractionsMetrics==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"SecondInteractionsMetrics", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"SecondInteractionsMetrics");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("SecondInteractionsMetrics");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSecondInteractionsMetrics.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SecondInteractionsMetrics"),
                                        factory,xmlWriter);
                                    }
                                }
                                    if (localSecondMetricType==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"SecondMetricType", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"SecondMetricType");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("SecondMetricType");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSecondMetricType.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SecondMetricType"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"SecondMetricWeight", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SecondMetricWeight");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SecondMetricWeight");
                                    }
                                
                                               if (localSecondMetricWeight==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSecondMetricWeight));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localTargetingType==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"TargetingType", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"TargetingType");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("TargetingType");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTargetingType.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","TargetingType"),
                                        factory,xmlWriter);
                                    }
                                
                    xmlWriter.writeEndElement();
               

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

        /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
                if (namespace.equals(""))
              {
                  xmlWriter.writeAttribute(attName,attValue);
              }
              else
              {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                    attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance","type"));
                    attribList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AutomaticOptimizationInfo"));
                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localID));
                             if (localConversionsMetricsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ConversionsMetrics"));
                            
                            
                                    elementList.add(localConversionsMetrics==null?null:
                                    localConversionsMetrics);
                                }
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "FirstMetricType"));
                            
                            
                                    elementList.add(localFirstMetricType==null?null:
                                    localFirstMetricType);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "FirstMetricWeight"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFirstMetricWeight));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "GeoTargetingCountryID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeoTargetingCountryID));
                             if (localGeoTargetingKeywordsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "GeoTargetingKeywords"));
                            
                            
                                    elementList.add(localGeoTargetingKeywords==null?null:
                                    localGeoTargetingKeywords);
                                }
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "GeoTargetingStateID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGeoTargetingStateID));
                            
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "GeoTargetingType"));
                            
                            
                                    elementList.add(localGeoTargetingType==null?null:
                                    localGeoTargetingType);
                                 if (localGeoTargetingZipCodesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "GeoTargetingZipCodes"));
                            
                            
                                    elementList.add(localGeoTargetingZipCodes==null?null:
                                    localGeoTargetingZipCodes);
                                } if (localInteractionsMetricsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "InteractionsMetrics"));
                            
                            
                                    elementList.add(localInteractionsMetrics==null?null:
                                    localInteractionsMetrics);
                                }
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "LevelType"));
                            
                            
                                    elementList.add(localLevelType==null?null:
                                    localLevelType);
                                
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "MethodType"));
                            
                            
                                    elementList.add(localMethodType==null?null:
                                    localMethodType);
                                 if (localSecondConversionsMetricsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "SecondConversionsMetrics"));
                            
                            
                                    elementList.add(localSecondConversionsMetrics==null?null:
                                    localSecondConversionsMetrics);
                                } if (localSecondInteractionsMetricsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "SecondInteractionsMetrics"));
                            
                            
                                    elementList.add(localSecondInteractionsMetrics==null?null:
                                    localSecondInteractionsMetrics);
                                }
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "SecondMetricType"));
                            
                            
                                    elementList.add(localSecondMetricType==null?null:
                                    localSecondMetricType);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "SecondMetricWeight"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSecondMetricWeight));
                            
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "TargetingType"));
                            
                            
                                    elementList.add(localTargetingType==null?null:
                                    localTargetingType);
                                

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static AutomaticOptimizationInfo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            AutomaticOptimizationInfo object =
                new AutomaticOptimizationInfo();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"AutomaticOptimizationInfo".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AutomaticOptimizationInfo)api.eyeblaster.com.message.DeliveryGroup.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ConversionsMetrics").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setConversionsMetrics(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setConversionsMetrics(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","FirstMetricType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setFirstMetricType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setFirstMetricType(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.AutomaticOptimizationMetricTypes.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","FirstMetricWeight").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFirstMetricWeight(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setFirstMetricWeight(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","GeoTargetingCountryID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGeoTargetingCountryID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","GeoTargetingKeywords").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setGeoTargetingKeywords(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setGeoTargetingKeywords(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.ArrayOfAutomaticOptimizationKeywordInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","GeoTargetingStateID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGeoTargetingStateID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","GeoTargetingType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setGeoTargetingType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setGeoTargetingType(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.TargetingGeoLevelTypes.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","GeoTargetingZipCodes").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setGeoTargetingZipCodes(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setGeoTargetingZipCodes(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.ArrayOfAutomaticOptimizationZipCodeInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","InteractionsMetrics").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setInteractionsMetrics(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setInteractionsMetrics(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","LevelType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLevelType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLevelType(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.AutomaticOptimizationLevelTypes.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","MethodType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setMethodType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setMethodType(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.AutomaticOptimizationMethodTypes.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SecondConversionsMetrics").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSecondConversionsMetrics(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSecondConversionsMetrics(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SecondInteractionsMetrics").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSecondInteractionsMetrics(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSecondInteractionsMetrics(com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SecondMetricType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSecondMetricType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSecondMetricType(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.AutomaticOptimizationMetricTypes.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SecondMetricWeight").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSecondMetricWeight(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setSecondMetricWeight(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","TargetingType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTargetingType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTargetingType(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.TargetingTypes.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                              
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          