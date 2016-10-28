
/**
 * PlacementTargetingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */
            
                package api.eyeblaster.com.V1.DataContracts.Placement;
            

            /**
            *  PlacementTargetingInfo bean class
            */
        
        public  class PlacementTargetingInfo
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = PlacementTargetingInfo
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
                        * field for AdsRotationMethod
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Placement.AdsRotationMethod localAdsRotationMethod ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Placement.AdsRotationMethod
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Placement.AdsRotationMethod getAdsRotationMethod(){
                               return localAdsRotationMethod;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdsRotationMethod
                               */
                               public void setAdsRotationMethod(api.eyeblaster.com.V1.DataContracts.Placement.AdsRotationMethod param){
                            
                                            this.localAdsRotationMethod=param;
                                    

                               }
                            

                        /**
                        * field for AutomaticOptimization_Conversion
                        */

                        
                                    protected int localAutomaticOptimization_Conversion ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getAutomaticOptimization_Conversion(){
                               return localAutomaticOptimization_Conversion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AutomaticOptimization_Conversion
                               */
                               public void setAutomaticOptimization_Conversion(int param){
                            
                                            this.localAutomaticOptimization_Conversion=param;
                                    

                               }
                            

                        /**
                        * field for AutomaticOptimization_Interaction
                        */

                        
                                    protected java.lang.String localAutomaticOptimization_Interaction ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAutomaticOptimization_Interaction(){
                               return localAutomaticOptimization_Interaction;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AutomaticOptimization_Interaction
                               */
                               public void setAutomaticOptimization_Interaction(java.lang.String param){
                            
                                            this.localAutomaticOptimization_Interaction=param;
                                    

                               }
                            

                        /**
                        * field for AutomaticOptimization_Method
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Placement.OptimizationMethod localAutomaticOptimization_Method ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Placement.OptimizationMethod
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Placement.OptimizationMethod getAutomaticOptimization_Method(){
                               return localAutomaticOptimization_Method;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AutomaticOptimization_Method
                               */
                               public void setAutomaticOptimization_Method(api.eyeblaster.com.V1.DataContracts.Placement.OptimizationMethod param){
                            
                                            this.localAutomaticOptimization_Method=param;
                                    

                               }
                            

                        /**
                        * field for AutomaticOptimization_Metric
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Placement.MetricTypes localAutomaticOptimization_Metric ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Placement.MetricTypes
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Placement.MetricTypes getAutomaticOptimization_Metric(){
                               return localAutomaticOptimization_Metric;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AutomaticOptimization_Metric
                               */
                               public void setAutomaticOptimization_Metric(api.eyeblaster.com.V1.DataContracts.Placement.MetricTypes param){
                            
                                            this.localAutomaticOptimization_Metric=param;
                                    

                               }
                            

                        /**
                        * field for ControlOverDelivery
                        */

                        
                                    protected boolean localControlOverDelivery ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getControlOverDelivery(){
                               return localControlOverDelivery;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ControlOverDelivery
                               */
                               public void setControlOverDelivery(boolean param){
                            
                                            this.localControlOverDelivery=param;
                                    

                               }
                            

                        /**
                        * field for DefaultAds
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Placement.ArrayOfPlacementTargetingAdInfo localDefaultAds ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Placement.ArrayOfPlacementTargetingAdInfo
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Placement.ArrayOfPlacementTargetingAdInfo getDefaultAds(){
                               return localDefaultAds;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DefaultAds
                               */
                               public void setDefaultAds(api.eyeblaster.com.V1.DataContracts.Placement.ArrayOfPlacementTargetingAdInfo param){
                            
                                            this.localDefaultAds=param;
                                    

                               }
                            

                        /**
                        * field for ImpressionsForWholePlacement
                        */

                        
                                    protected int localImpressionsForWholePlacement ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getImpressionsForWholePlacement(){
                               return localImpressionsForWholePlacement;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ImpressionsForWholePlacement
                               */
                               public void setImpressionsForWholePlacement(int param){
                            
                                            this.localImpressionsForWholePlacement=param;
                                    

                               }
                            

                        /**
                        * field for ImpressionsOverWholePlacementPerUser
                        */

                        
                                    protected int localImpressionsOverWholePlacementPerUser ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getImpressionsOverWholePlacementPerUser(){
                               return localImpressionsOverWholePlacementPerUser;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ImpressionsOverWholePlacementPerUser
                               */
                               public void setImpressionsOverWholePlacementPerUser(int param){
                            
                                            this.localImpressionsOverWholePlacementPerUser=param;
                                    

                               }
                            

                        /**
                        * field for ImpressionsPerDay
                        */

                        
                                    protected int localImpressionsPerDay ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getImpressionsPerDay(){
                               return localImpressionsPerDay;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ImpressionsPerDay
                               */
                               public void setImpressionsPerDay(int param){
                            
                                            this.localImpressionsPerDay=param;
                                    

                               }
                            

                        /**
                        * field for MinimumTimeBetweenAds
                        */

                        
                                    protected int localMinimumTimeBetweenAds ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getMinimumTimeBetweenAds(){
                               return localMinimumTimeBetweenAds;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MinimumTimeBetweenAds
                               */
                               public void setMinimumTimeBetweenAds(int param){
                            
                                            this.localMinimumTimeBetweenAds=param;
                                    

                               }
                            

                        /**
                        * field for PlacementID
                        */

                        
                                    protected int localPlacementID ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getPlacementID(){
                               return localPlacementID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PlacementID
                               */
                               public void setPlacementID(int param){
                            
                                            this.localPlacementID=param;
                                    

                               }
                            

                        /**
                        * field for RotationGroups
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Placement.ArrayOfPlacementRotationGroupInfo localRotationGroups ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Placement.ArrayOfPlacementRotationGroupInfo
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Placement.ArrayOfPlacementRotationGroupInfo getRotationGroups(){
                               return localRotationGroups;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RotationGroups
                               */
                               public void setRotationGroups(api.eyeblaster.com.V1.DataContracts.Placement.ArrayOfPlacementRotationGroupInfo param){
                            
                                            this.localRotationGroups=param;
                                    

                               }
                            

                        /**
                        * field for ServeDefaultAds
                        */

                        
                                    protected boolean localServeDefaultAds ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getServeDefaultAds(){
                               return localServeDefaultAds;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServeDefaultAds
                               */
                               public void setServeDefaultAds(boolean param){
                            
                                            this.localServeDefaultAds=param;
                                    

                               }
                            

                        /**
                        * field for ServingOrder
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Placement.ServingOrder localServingOrder ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Placement.ServingOrder
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Placement.ServingOrder getServingOrder(){
                               return localServingOrder;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServingOrder
                               */
                               public void setServingOrder(api.eyeblaster.com.V1.DataContracts.Placement.ServingOrder param){
                            
                                            this.localServingOrder=param;
                                    

                               }
                            

                        /**
                        * field for TimeOfDayFrom
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Placement.TimeOfDay localTimeOfDayFrom ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Placement.TimeOfDay
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Placement.TimeOfDay getTimeOfDayFrom(){
                               return localTimeOfDayFrom;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TimeOfDayFrom
                               */
                               public void setTimeOfDayFrom(api.eyeblaster.com.V1.DataContracts.Placement.TimeOfDay param){
                            
                                            this.localTimeOfDayFrom=param;
                                    

                               }
                            

                        /**
                        * field for TimeOfDayTo
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Placement.TimeOfDay localTimeOfDayTo ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Placement.TimeOfDay
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Placement.TimeOfDay getTimeOfDayTo(){
                               return localTimeOfDayTo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TimeOfDayTo
                               */
                               public void setTimeOfDayTo(api.eyeblaster.com.V1.DataContracts.Placement.TimeOfDay param){
                            
                                            this.localTimeOfDayTo=param;
                                    

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
                       PlacementTargetingInfo.this.serialize(parentQName,factory,xmlWriter);
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
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://api.eyeblaster.com/V1/DataContracts");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":PlacementTargetingInfo",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "PlacementTargetingInfo",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localAdsRotationMethod==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AdsRotationMethod cannot be null!!");
                                            }
                                           localAdsRotationMethod.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AdsRotationMethod"),
                                               factory,xmlWriter);
                                        
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AutomaticOptimization_Conversion", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AutomaticOptimization_Conversion");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AutomaticOptimization_Conversion");
                                    }
                                
                                               if (localAutomaticOptimization_Conversion==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAutomaticOptimization_Conversion));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AutomaticOptimization_Interaction", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AutomaticOptimization_Interaction");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AutomaticOptimization_Interaction");
                                    }
                                

                                          if (localAutomaticOptimization_Interaction==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAutomaticOptimization_Interaction);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localAutomaticOptimization_Method==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AutomaticOptimization_Method cannot be null!!");
                                            }
                                           localAutomaticOptimization_Method.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AutomaticOptimization_Method"),
                                               factory,xmlWriter);
                                        
                                            if (localAutomaticOptimization_Metric==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AutomaticOptimization_Metric cannot be null!!");
                                            }
                                           localAutomaticOptimization_Metric.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AutomaticOptimization_Metric"),
                                               factory,xmlWriter);
                                        
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ControlOverDelivery", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ControlOverDelivery");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ControlOverDelivery");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("ControlOverDelivery cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localControlOverDelivery));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localDefaultAds==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"DefaultAds", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"DefaultAds");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("DefaultAds");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDefaultAds.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","DefaultAds"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ImpressionsForWholePlacement", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ImpressionsForWholePlacement");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ImpressionsForWholePlacement");
                                    }
                                
                                               if (localImpressionsForWholePlacement==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("ImpressionsForWholePlacement cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localImpressionsForWholePlacement));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ImpressionsOverWholePlacementPerUser", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ImpressionsOverWholePlacementPerUser");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ImpressionsOverWholePlacementPerUser");
                                    }
                                
                                               if (localImpressionsOverWholePlacementPerUser==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("ImpressionsOverWholePlacementPerUser cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localImpressionsOverWholePlacementPerUser));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ImpressionsPerDay", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ImpressionsPerDay");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ImpressionsPerDay");
                                    }
                                
                                               if (localImpressionsPerDay==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("ImpressionsPerDay cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localImpressionsPerDay));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"MinimumTimeBetweenAds", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"MinimumTimeBetweenAds");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("MinimumTimeBetweenAds");
                                    }
                                
                                               if (localMinimumTimeBetweenAds==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("MinimumTimeBetweenAds cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinimumTimeBetweenAds));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PlacementID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PlacementID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PlacementID");
                                    }
                                
                                               if (localPlacementID==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("PlacementID cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPlacementID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localRotationGroups==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"RotationGroups", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"RotationGroups");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("RotationGroups");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRotationGroups.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","RotationGroups"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ServeDefaultAds", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ServeDefaultAds");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ServeDefaultAds");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("ServeDefaultAds cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServeDefaultAds));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                            if (localServingOrder==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ServingOrder cannot be null!!");
                                            }
                                           localServingOrder.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServingOrder"),
                                               factory,xmlWriter);
                                        
                                            if (localTimeOfDayFrom==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TimeOfDayFrom cannot be null!!");
                                            }
                                           localTimeOfDayFrom.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","TimeOfDayFrom"),
                                               factory,xmlWriter);
                                        
                                            if (localTimeOfDayTo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TimeOfDayTo cannot be null!!");
                                            }
                                           localTimeOfDayTo.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","TimeOfDayTo"),
                                               factory,xmlWriter);
                                        
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

                
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AdsRotationMethod"));
                            
                            
                                    if (localAdsRotationMethod==null){
                                         throw new org.apache.axis2.databinding.ADBException("AdsRotationMethod cannot be null!!");
                                    }
                                    elementList.add(localAdsRotationMethod);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AutomaticOptimization_Conversion"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAutomaticOptimization_Conversion));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AutomaticOptimization_Interaction"));
                                 
                                         elementList.add(localAutomaticOptimization_Interaction==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAutomaticOptimization_Interaction));
                                    
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AutomaticOptimization_Method"));
                            
                            
                                    if (localAutomaticOptimization_Method==null){
                                         throw new org.apache.axis2.databinding.ADBException("AutomaticOptimization_Method cannot be null!!");
                                    }
                                    elementList.add(localAutomaticOptimization_Method);
                                
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AutomaticOptimization_Metric"));
                            
                            
                                    if (localAutomaticOptimization_Metric==null){
                                         throw new org.apache.axis2.databinding.ADBException("AutomaticOptimization_Metric cannot be null!!");
                                    }
                                    elementList.add(localAutomaticOptimization_Metric);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ControlOverDelivery"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localControlOverDelivery));
                            
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "DefaultAds"));
                            
                            
                                    elementList.add(localDefaultAds==null?null:
                                    localDefaultAds);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ImpressionsForWholePlacement"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localImpressionsForWholePlacement));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ImpressionsOverWholePlacementPerUser"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localImpressionsOverWholePlacementPerUser));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ImpressionsPerDay"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localImpressionsPerDay));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "MinimumTimeBetweenAds"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinimumTimeBetweenAds));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "PlacementID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPlacementID));
                            
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "RotationGroups"));
                            
                            
                                    elementList.add(localRotationGroups==null?null:
                                    localRotationGroups);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServeDefaultAds"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServeDefaultAds));
                            
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServingOrder"));
                            
                            
                                    if (localServingOrder==null){
                                         throw new org.apache.axis2.databinding.ADBException("ServingOrder cannot be null!!");
                                    }
                                    elementList.add(localServingOrder);
                                
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "TimeOfDayFrom"));
                            
                            
                                    if (localTimeOfDayFrom==null){
                                         throw new org.apache.axis2.databinding.ADBException("TimeOfDayFrom cannot be null!!");
                                    }
                                    elementList.add(localTimeOfDayFrom);
                                
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "TimeOfDayTo"));
                            
                            
                                    if (localTimeOfDayTo==null){
                                         throw new org.apache.axis2.databinding.ADBException("TimeOfDayTo cannot be null!!");
                                    }
                                    elementList.add(localTimeOfDayTo);
                                

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
        public static PlacementTargetingInfo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            PlacementTargetingInfo object =
                new PlacementTargetingInfo();

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
                    
                            if (!"PlacementTargetingInfo".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (PlacementTargetingInfo)api.eyeblaster.com.message.Placement.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AdsRotationMethod").equals(reader.getName())){
                                
                                                object.setAdsRotationMethod(api.eyeblaster.com.V1.DataContracts.Placement.AdsRotationMethod.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AutomaticOptimization_Conversion").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAutomaticOptimization_Conversion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setAutomaticOptimization_Conversion(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AutomaticOptimization_Interaction").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAutomaticOptimization_Interaction(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AutomaticOptimization_Method").equals(reader.getName())){
                                
                                                object.setAutomaticOptimization_Method(api.eyeblaster.com.V1.DataContracts.Placement.OptimizationMethod.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AutomaticOptimization_Metric").equals(reader.getName())){
                                
                                                object.setAutomaticOptimization_Metric(api.eyeblaster.com.V1.DataContracts.Placement.MetricTypes.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ControlOverDelivery").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setControlOverDelivery(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","DefaultAds").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDefaultAds(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDefaultAds(api.eyeblaster.com.V1.DataContracts.Placement.ArrayOfPlacementTargetingAdInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ImpressionsForWholePlacement").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setImpressionsForWholePlacement(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ImpressionsOverWholePlacementPerUser").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setImpressionsOverWholePlacementPerUser(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ImpressionsPerDay").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setImpressionsPerDay(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","MinimumTimeBetweenAds").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMinimumTimeBetweenAds(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","PlacementID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPlacementID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","RotationGroups").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRotationGroups(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRotationGroups(api.eyeblaster.com.V1.DataContracts.Placement.ArrayOfPlacementRotationGroupInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeDefaultAds").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServeDefaultAds(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServingOrder").equals(reader.getName())){
                                
                                                object.setServingOrder(api.eyeblaster.com.V1.DataContracts.Placement.ServingOrder.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","TimeOfDayFrom").equals(reader.getName())){
                                
                                                object.setTimeOfDayFrom(api.eyeblaster.com.V1.DataContracts.Placement.TimeOfDay.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","TimeOfDayTo").equals(reader.getName())){
                                
                                                object.setTimeOfDayTo(api.eyeblaster.com.V1.DataContracts.Placement.TimeOfDay.Factory.parse(reader));
                                              
                                        reader.next();
                                    
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
           
          