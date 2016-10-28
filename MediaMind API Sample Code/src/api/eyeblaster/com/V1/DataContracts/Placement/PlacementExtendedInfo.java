
/**
 * PlacementExtendedInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */
            
                package api.eyeblaster.com.V1.DataContracts.Placement;
            

            /**
            *  PlacementExtendedInfo bean class
            */
        
        public  class PlacementExtendedInfo
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = PlacementExtendedInfo
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
                        * field for ActualStartDate
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Placement.APIDateTime localActualStartDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Placement.APIDateTime
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Placement.APIDateTime getActualStartDate(){
                               return localActualStartDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ActualStartDate
                               */
                               public void setActualStartDate(api.eyeblaster.com.V1.DataContracts.Placement.APIDateTime param){
                            
                                            this.localActualStartDate=param;
                                    

                               }
                            

                        /**
                        * field for AdsRotationMethodID
                        */

                        
                                    protected int localAdsRotationMethodID ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getAdsRotationMethodID(){
                               return localAdsRotationMethodID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdsRotationMethodID
                               */
                               public void setAdsRotationMethodID(int param){
                            
                                            this.localAdsRotationMethodID=param;
                                    

                               }
                            

                        /**
                        * field for AdsRotationMethodName
                        */

                        
                                    protected java.lang.String localAdsRotationMethodName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAdsRotationMethodName(){
                               return localAdsRotationMethodName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdsRotationMethodName
                               */
                               public void setAdsRotationMethodName(java.lang.String param){
                            
                                            this.localAdsRotationMethodName=param;
                                    

                               }
                            

                        /**
                        * field for AdvertiserName
                        */

                        
                                    protected java.lang.String localAdvertiserName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAdvertiserName(){
                               return localAdvertiserName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdvertiserName
                               */
                               public void setAdvertiserName(java.lang.String param){
                            
                                            this.localAdvertiserName=param;
                                    

                               }
                            

                        /**
                        * field for AgencyID
                        */

                        
                                    protected int localAgencyID ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getAgencyID(){
                               return localAgencyID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AgencyID
                               */
                               public void setAgencyID(int param){
                            
                                            this.localAgencyID=param;
                                    

                               }
                            

                        /**
                        * field for AgencyName
                        */

                        
                                    protected java.lang.String localAgencyName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAgencyName(){
                               return localAgencyName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AgencyName
                               */
                               public void setAgencyName(java.lang.String param){
                            
                                            this.localAgencyName=param;
                                    

                               }
                            

                        /**
                        * field for BannerSizeName
                        */

                        
                                    protected java.lang.String localBannerSizeName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBannerSizeName(){
                               return localBannerSizeName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BannerSizeName
                               */
                               public void setBannerSizeName(java.lang.String param){
                            
                                            this.localBannerSizeName=param;
                                    

                               }
                            

                        /**
                        * field for CampaignName
                        */

                        
                                    protected java.lang.String localCampaignName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCampaignName(){
                               return localCampaignName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CampaignName
                               */
                               public void setCampaignName(java.lang.String param){
                            
                                            this.localCampaignName=param;
                                    

                               }
                            

                        /**
                        * field for EndDate
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Placement.APIDateTime localEndDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Placement.APIDateTime
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Placement.APIDateTime getEndDate(){
                               return localEndDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EndDate
                               */
                               public void setEndDate(api.eyeblaster.com.V1.DataContracts.Placement.APIDateTime param){
                            
                                            this.localEndDate=param;
                                    

                               }
                            

                        /**
                        * field for HasMultiplePeriods
                        */

                        
                                    protected boolean localHasMultiplePeriods ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getHasMultiplePeriods(){
                               return localHasMultiplePeriods;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HasMultiplePeriods
                               */
                               public void setHasMultiplePeriods(boolean param){
                            
                                            this.localHasMultiplePeriods=param;
                                    

                               }
                            

                        /**
                        * field for PlacementPackageName
                        */

                        
                                    protected java.lang.String localPlacementPackageName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPlacementPackageName(){
                               return localPlacementPackageName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PlacementPackageName
                               */
                               public void setPlacementPackageName(java.lang.String param){
                            
                                            this.localPlacementPackageName=param;
                                    

                               }
                            

                        /**
                        * field for SiteName
                        */

                        
                                    protected java.lang.String localSiteName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSiteName(){
                               return localSiteName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SiteName
                               */
                               public void setSiteName(java.lang.String param){
                            
                                            this.localSiteName=param;
                                    

                               }
                            

                        /**
                        * field for SiteSectionName
                        */

                        
                                    protected java.lang.String localSiteSectionName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSiteSectionName(){
                               return localSiteSectionName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SiteSectionName
                               */
                               public void setSiteSectionName(java.lang.String param){
                            
                                            this.localSiteSectionName=param;
                                    

                               }
                            

                        /**
                        * field for StartDate
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Placement.APIDateTime localStartDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Placement.APIDateTime
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Placement.APIDateTime getStartDate(){
                               return localStartDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StartDate
                               */
                               public void setStartDate(api.eyeblaster.com.V1.DataContracts.Placement.APIDateTime param){
                            
                                            this.localStartDate=param;
                                    

                               }
                            

                        /**
                        * field for TotalAds
                        */

                        
                                    protected int localTotalAds ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getTotalAds(){
                               return localTotalAds;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalAds
                               */
                               public void setTotalAds(int param){
                            
                                            this.localTotalAds=param;
                                    

                               }
                            

                        /**
                        * field for TotalAdsInApproved
                        */

                        
                                    protected int localTotalAdsInApproved ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getTotalAdsInApproved(){
                               return localTotalAdsInApproved;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalAdsInApproved
                               */
                               public void setTotalAdsInApproved(int param){
                            
                                            this.localTotalAdsInApproved=param;
                                    

                               }
                            

                        /**
                        * field for TotalAdsInDesign
                        */

                        
                                    protected int localTotalAdsInDesign ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getTotalAdsInDesign(){
                               return localTotalAdsInDesign;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalAdsInDesign
                               */
                               public void setTotalAdsInDesign(int param){
                            
                                            this.localTotalAdsInDesign=param;
                                    

                               }
                            

                        /**
                        * field for TotalAdsInPending
                        */

                        
                                    protected int localTotalAdsInPending ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getTotalAdsInPending(){
                               return localTotalAdsInPending;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalAdsInPending
                               */
                               public void setTotalAdsInPending(int param){
                            
                                            this.localTotalAdsInPending=param;
                                    

                               }
                            

                        /**
                        * field for TotalAdsInRejected
                        */

                        
                                    protected int localTotalAdsInRejected ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getTotalAdsInRejected(){
                               return localTotalAdsInRejected;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalAdsInRejected
                               */
                               public void setTotalAdsInRejected(int param){
                            
                                            this.localTotalAdsInRejected=param;
                                    

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
                       PlacementExtendedInfo.this.serialize(parentQName,factory,xmlWriter);
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
                           namespacePrefix+":PlacementExtendedInfo",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "PlacementExtendedInfo",
                           xmlWriter);
                   }

               
                   }
               
                                    if (localActualStartDate==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ActualStartDate", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ActualStartDate");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ActualStartDate");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localActualStartDate.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ActualStartDate"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AdsRotationMethodID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AdsRotationMethodID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AdsRotationMethodID");
                                    }
                                
                                               if (localAdsRotationMethodID==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("AdsRotationMethodID cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdsRotationMethodID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AdsRotationMethodName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AdsRotationMethodName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AdsRotationMethodName");
                                    }
                                

                                          if (localAdsRotationMethodName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAdsRotationMethodName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AdvertiserName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AdvertiserName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AdvertiserName");
                                    }
                                

                                          if (localAdvertiserName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAdvertiserName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AgencyID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AgencyID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AgencyID");
                                    }
                                
                                               if (localAgencyID==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("AgencyID cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAgencyID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AgencyName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AgencyName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AgencyName");
                                    }
                                

                                          if (localAgencyName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAgencyName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"BannerSizeName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"BannerSizeName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("BannerSizeName");
                                    }
                                

                                          if (localBannerSizeName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBannerSizeName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CampaignName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CampaignName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CampaignName");
                                    }
                                

                                          if (localCampaignName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCampaignName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localEndDate==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"EndDate", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"EndDate");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("EndDate");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localEndDate.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","EndDate"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"HasMultiplePeriods", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"HasMultiplePeriods");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("HasMultiplePeriods");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("HasMultiplePeriods cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHasMultiplePeriods));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"PlacementPackageName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"PlacementPackageName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("PlacementPackageName");
                                    }
                                

                                          if (localPlacementPackageName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPlacementPackageName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"SiteName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SiteName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SiteName");
                                    }
                                

                                          if (localSiteName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSiteName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"SiteSectionName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SiteSectionName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SiteSectionName");
                                    }
                                

                                          if (localSiteSectionName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSiteSectionName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localStartDate==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"StartDate", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"StartDate");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("StartDate");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localStartDate.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","StartDate"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"TotalAds", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"TotalAds");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("TotalAds");
                                    }
                                
                                               if (localTotalAds==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("TotalAds cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalAds));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"TotalAdsInApproved", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"TotalAdsInApproved");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("TotalAdsInApproved");
                                    }
                                
                                               if (localTotalAdsInApproved==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("TotalAdsInApproved cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalAdsInApproved));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"TotalAdsInDesign", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"TotalAdsInDesign");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("TotalAdsInDesign");
                                    }
                                
                                               if (localTotalAdsInDesign==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("TotalAdsInDesign cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalAdsInDesign));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"TotalAdsInPending", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"TotalAdsInPending");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("TotalAdsInPending");
                                    }
                                
                                               if (localTotalAdsInPending==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("TotalAdsInPending cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalAdsInPending));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"TotalAdsInRejected", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"TotalAdsInRejected");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("TotalAdsInRejected");
                                    }
                                
                                               if (localTotalAdsInRejected==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("TotalAdsInRejected cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalAdsInRejected));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
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
                                                                      "ActualStartDate"));
                            
                            
                                    elementList.add(localActualStartDate==null?null:
                                    localActualStartDate);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AdsRotationMethodID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdsRotationMethodID));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AdsRotationMethodName"));
                                 
                                         elementList.add(localAdsRotationMethodName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdsRotationMethodName));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AdvertiserName"));
                                 
                                         elementList.add(localAdvertiserName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdvertiserName));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AgencyID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAgencyID));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AgencyName"));
                                 
                                         elementList.add(localAgencyName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAgencyName));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "BannerSizeName"));
                                 
                                         elementList.add(localBannerSizeName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBannerSizeName));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "CampaignName"));
                                 
                                         elementList.add(localCampaignName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCampaignName));
                                    
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "EndDate"));
                            
                            
                                    elementList.add(localEndDate==null?null:
                                    localEndDate);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "HasMultiplePeriods"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHasMultiplePeriods));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "PlacementPackageName"));
                                 
                                         elementList.add(localPlacementPackageName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPlacementPackageName));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "SiteName"));
                                 
                                         elementList.add(localSiteName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSiteName));
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "SiteSectionName"));
                                 
                                         elementList.add(localSiteSectionName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSiteSectionName));
                                    
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "StartDate"));
                            
                            
                                    elementList.add(localStartDate==null?null:
                                    localStartDate);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "TotalAds"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalAds));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "TotalAdsInApproved"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalAdsInApproved));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "TotalAdsInDesign"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalAdsInDesign));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "TotalAdsInPending"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalAdsInPending));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "TotalAdsInRejected"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalAdsInRejected));
                            

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
        public static PlacementExtendedInfo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            PlacementExtendedInfo object =
                new PlacementExtendedInfo();

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
                    
                            if (!"PlacementExtendedInfo".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (PlacementExtendedInfo)api.eyeblaster.com.message.Placement.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ActualStartDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setActualStartDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setActualStartDate(api.eyeblaster.com.V1.DataContracts.Placement.APIDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AdsRotationMethodID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAdsRotationMethodID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AdsRotationMethodName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAdsRotationMethodName(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AdvertiserName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAdvertiserName(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AgencyID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAgencyID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AgencyName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAgencyName(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","BannerSizeName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBannerSizeName(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","CampaignName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCampaignName(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","EndDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setEndDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setEndDate(api.eyeblaster.com.V1.DataContracts.Placement.APIDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","HasMultiplePeriods").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setHasMultiplePeriods(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","PlacementPackageName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPlacementPackageName(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SiteName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSiteName(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SiteSectionName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSiteSectionName(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","StartDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setStartDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setStartDate(api.eyeblaster.com.V1.DataContracts.Placement.APIDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","TotalAds").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTotalAds(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","TotalAdsInApproved").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTotalAdsInApproved(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","TotalAdsInDesign").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTotalAdsInDesign(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","TotalAdsInPending").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTotalAdsInPending(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","TotalAdsInRejected").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTotalAdsInRejected(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
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
           
          