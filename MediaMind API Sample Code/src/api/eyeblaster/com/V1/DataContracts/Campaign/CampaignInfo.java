
/**
 * CampaignInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */
            
                package api.eyeblaster.com.V1.DataContracts.Campaign;
            

            /**
            *  CampaignInfo bean class
            */
        
        public  class CampaignInfo extends api.eyeblaster.com.V1.DataContracts.Campaign.BaseDC
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = CampaignInfo
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
                        * field for AccountManager
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Campaign.ContactInfo localAccountManager ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Campaign.ContactInfo
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Campaign.ContactInfo getAccountManager(){
                               return localAccountManager;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AccountManager
                               */
                               public void setAccountManager(api.eyeblaster.com.V1.DataContracts.Campaign.ContactInfo param){
                            
                                            this.localAccountManager=param;
                                    

                               }
                            

                        /**
                        * field for AdvertiserID
                        */

                        
                                    protected int localAdvertiserID ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getAdvertiserID(){
                               return localAdvertiserID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdvertiserID
                               */
                               public void setAdvertiserID(int param){
                            
                                            this.localAdvertiserID=param;
                                    

                               }
                            

                        /**
                        * field for AgencyBillingContacts
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo localAgencyBillingContacts ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAgencyBillingContactsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo getAgencyBillingContacts(){
                               return localAgencyBillingContacts;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AgencyBillingContacts
                               */
                               public void setAgencyBillingContacts(api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localAgencyBillingContactsTracker = true;
                                       } else {
                                          localAgencyBillingContactsTracker = true;
                                              
                                       }
                                   
                                            this.localAgencyBillingContacts=param;
                                    

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
                        * field for AgencyMediaPlannerContacts
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo localAgencyMediaPlannerContacts ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAgencyMediaPlannerContactsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo getAgencyMediaPlannerContacts(){
                               return localAgencyMediaPlannerContacts;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AgencyMediaPlannerContacts
                               */
                               public void setAgencyMediaPlannerContacts(api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localAgencyMediaPlannerContactsTracker = true;
                                       } else {
                                          localAgencyMediaPlannerContactsTracker = true;
                                              
                                       }
                                   
                                            this.localAgencyMediaPlannerContacts=param;
                                    

                               }
                            

                        /**
                        * field for AgencyMediaTraffickerContacts
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo localAgencyMediaTraffickerContacts ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAgencyMediaTraffickerContactsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo getAgencyMediaTraffickerContacts(){
                               return localAgencyMediaTraffickerContacts;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AgencyMediaTraffickerContacts
                               */
                               public void setAgencyMediaTraffickerContacts(api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localAgencyMediaTraffickerContactsTracker = true;
                                       } else {
                                          localAgencyMediaTraffickerContactsTracker = true;
                                              
                                       }
                                   
                                            this.localAgencyMediaTraffickerContacts=param;
                                    

                               }
                            

                        /**
                        * field for AgencySearchContacts
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo localAgencySearchContacts ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAgencySearchContactsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo getAgencySearchContacts(){
                               return localAgencySearchContacts;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AgencySearchContacts
                               */
                               public void setAgencySearchContacts(api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localAgencySearchContactsTracker = true;
                                       } else {
                                          localAgencySearchContactsTracker = true;
                                              
                                       }
                                   
                                            this.localAgencySearchContacts=param;
                                    

                               }
                            

                        /**
                        * field for AllowCreativeShopViewCampaignData
                        */

                        
                                    protected boolean localAllowCreativeShopViewCampaignData ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAllowCreativeShopViewCampaignData(){
                               return localAllowCreativeShopViewCampaignData;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AllowCreativeShopViewCampaignData
                               */
                               public void setAllowCreativeShopViewCampaignData(boolean param){
                            
                                            this.localAllowCreativeShopViewCampaignData=param;
                                    

                               }
                            

                        /**
                        * field for BookedImpressions
                        */

                        
                                    protected long localBookedImpressions ;
                                

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getBookedImpressions(){
                               return localBookedImpressions;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BookedImpressions
                               */
                               public void setBookedImpressions(long param){
                            
                                            this.localBookedImpressions=param;
                                    

                               }
                            

                        /**
                        * field for BrandID
                        */

                        
                                    protected int localBrandID ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getBrandID(){
                               return localBrandID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BrandID
                               */
                               public void setBrandID(int param){
                            
                                            this.localBrandID=param;
                                    

                               }
                            

                        /**
                        * field for CampaignExtendedInfo
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Campaign.CampaignExtendedInfo localCampaignExtendedInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCampaignExtendedInfoTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Campaign.CampaignExtendedInfo
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Campaign.CampaignExtendedInfo getCampaignExtendedInfo(){
                               return localCampaignExtendedInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CampaignExtendedInfo
                               */
                               public void setCampaignExtendedInfo(api.eyeblaster.com.V1.DataContracts.Campaign.CampaignExtendedInfo param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCampaignExtendedInfoTracker = true;
                                       } else {
                                          localCampaignExtendedInfoTracker = true;
                                              
                                       }
                                   
                                            this.localCampaignExtendedInfo=param;
                                    

                               }
                            

                        /**
                        * field for CampaignNotes
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfCampaignNoteInfo localCampaignNotes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCampaignNotesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfCampaignNoteInfo
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfCampaignNoteInfo getCampaignNotes(){
                               return localCampaignNotes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CampaignNotes
                               */
                               public void setCampaignNotes(api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfCampaignNoteInfo param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCampaignNotesTracker = true;
                                       } else {
                                          localCampaignNotesTracker = true;
                                              
                                       }
                                   
                                            this.localCampaignNotes=param;
                                    

                               }
                            

                        /**
                        * field for CampaignSegmentation
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Campaign.SegmentationTypes localCampaignSegmentation ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Campaign.SegmentationTypes
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Campaign.SegmentationTypes getCampaignSegmentation(){
                               return localCampaignSegmentation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CampaignSegmentation
                               */
                               public void setCampaignSegmentation(api.eyeblaster.com.V1.DataContracts.Campaign.SegmentationTypes param){
                            
                                            this.localCampaignSegmentation=param;
                                    

                               }
                            

                        /**
                        * field for CampaignStatus
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Campaign.CampaignStatus localCampaignStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCampaignStatusTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Campaign.CampaignStatus
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Campaign.CampaignStatus getCampaignStatus(){
                               return localCampaignStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CampaignStatus
                               */
                               public void setCampaignStatus(api.eyeblaster.com.V1.DataContracts.Campaign.CampaignStatus param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCampaignStatusTracker = true;
                                       } else {
                                          localCampaignStatusTracker = false;
                                              
                                       }
                                   
                                            this.localCampaignStatus=param;
                                    

                               }
                            

                        /**
                        * field for CreativeShops
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfCreativeShopInfo localCreativeShops ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreativeShopsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfCreativeShopInfo
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfCreativeShopInfo getCreativeShops(){
                               return localCreativeShops;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreativeShops
                               */
                               public void setCreativeShops(api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfCreativeShopInfo param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCreativeShopsTracker = true;
                                       } else {
                                          localCreativeShopsTracker = true;
                                              
                                       }
                                   
                                            this.localCreativeShops=param;
                                    

                               }
                            

                        /**
                        * field for DefaultTargetRegionID
                        */

                        
                                    protected int localDefaultTargetRegionID ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getDefaultTargetRegionID(){
                               return localDefaultTargetRegionID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DefaultTargetRegionID
                               */
                               public void setDefaultTargetRegionID(int param){
                            
                                            this.localDefaultTargetRegionID=param;
                                    

                               }
                            

                        /**
                        * field for GlobalCampaignID
                        */

                        
                                    protected int localGlobalCampaignID ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getGlobalCampaignID(){
                               return localGlobalCampaignID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GlobalCampaignID
                               */
                               public void setGlobalCampaignID(int param){
                            
                                            this.localGlobalCampaignID=param;
                                    

                               }
                            

                        /**
                        * field for Name
                        */

                        
                                    protected java.lang.String localName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNameTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getName(){
                               return localName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Name
                               */
                               public void setName(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localNameTracker = true;
                                       } else {
                                          localNameTracker = true;
                                              
                                       }
                                   
                                            this.localName=param;
                                    

                               }
                            

                        /**
                        * field for SalesPerson
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Campaign.ContactInfo localSalesPerson ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Campaign.ContactInfo
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Campaign.ContactInfo getSalesPerson(){
                               return localSalesPerson;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SalesPerson
                               */
                               public void setSalesPerson(api.eyeblaster.com.V1.DataContracts.Campaign.ContactInfo param){
                            
                                            this.localSalesPerson=param;
                                    

                               }
                            

                        /**
                        * field for SiteBillingContacts
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo localSiteBillingContacts ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSiteBillingContactsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo getSiteBillingContacts(){
                               return localSiteBillingContacts;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SiteBillingContacts
                               */
                               public void setSiteBillingContacts(api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSiteBillingContactsTracker = true;
                                       } else {
                                          localSiteBillingContactsTracker = true;
                                              
                                       }
                                   
                                            this.localSiteBillingContacts=param;
                                    

                               }
                            

                        /**
                        * field for SiteSalesContacts
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo localSiteSalesContacts ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSiteSalesContactsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo getSiteSalesContacts(){
                               return localSiteSalesContacts;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SiteSalesContacts
                               */
                               public void setSiteSalesContacts(api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSiteSalesContactsTracker = true;
                                       } else {
                                          localSiteSalesContactsTracker = true;
                                              
                                       }
                                   
                                            this.localSiteSalesContacts=param;
                                    

                               }
                            

                        /**
                        * field for SiteTraffickerAdOpContacts
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo localSiteTraffickerAdOpContacts ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSiteTraffickerAdOpContactsTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo getSiteTraffickerAdOpContacts(){
                               return localSiteTraffickerAdOpContacts;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SiteTraffickerAdOpContacts
                               */
                               public void setSiteTraffickerAdOpContacts(api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSiteTraffickerAdOpContactsTracker = true;
                                       } else {
                                          localSiteTraffickerAdOpContactsTracker = true;
                                              
                                       }
                                   
                                            this.localSiteTraffickerAdOpContacts=param;
                                    

                               }
                            

                        /**
                        * field for SpecialInstructions
                        */

                        
                                    protected java.lang.String localSpecialInstructions ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSpecialInstructions(){
                               return localSpecialInstructions;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SpecialInstructions
                               */
                               public void setSpecialInstructions(java.lang.String param){
                            
                                            this.localSpecialInstructions=param;
                                    

                               }
                            

                        /**
                        * field for StopServing
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.Campaign.StopServingTypes localStopServing ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.Campaign.StopServingTypes
                           */
                           public  api.eyeblaster.com.V1.DataContracts.Campaign.StopServingTypes getStopServing(){
                               return localStopServing;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StopServing
                               */
                               public void setStopServing(api.eyeblaster.com.V1.DataContracts.Campaign.StopServingTypes param){
                            
                                            this.localStopServing=param;
                                    

                               }
                            

                        /**
                        * field for TotalPlacments
                        */

                        
                                    protected int localTotalPlacments ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getTotalPlacments(){
                               return localTotalPlacments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalPlacments
                               */
                               public void setTotalPlacments(int param){
                            
                                            this.localTotalPlacments=param;
                                    

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
                       CampaignInfo.this.serialize(parentQName,factory,xmlWriter);
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
                           namespacePrefix+":CampaignInfo",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "CampaignInfo",
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
                             
                                    if (localAccountManager==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"AccountManager", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"AccountManager");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("AccountManager");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAccountManager.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AccountManager"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AdvertiserID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AdvertiserID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AdvertiserID");
                                    }
                                
                                               if (localAdvertiserID==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("AdvertiserID cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdvertiserID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localAgencyBillingContactsTracker){
                                    if (localAgencyBillingContacts==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"AgencyBillingContacts", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"AgencyBillingContacts");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("AgencyBillingContacts");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAgencyBillingContacts.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AgencyBillingContacts"),
                                        factory,xmlWriter);
                                    }
                                }
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
                              if (localAgencyMediaPlannerContactsTracker){
                                    if (localAgencyMediaPlannerContacts==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"AgencyMediaPlannerContacts", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"AgencyMediaPlannerContacts");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("AgencyMediaPlannerContacts");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAgencyMediaPlannerContacts.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AgencyMediaPlannerContacts"),
                                        factory,xmlWriter);
                                    }
                                } if (localAgencyMediaTraffickerContactsTracker){
                                    if (localAgencyMediaTraffickerContacts==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"AgencyMediaTraffickerContacts", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"AgencyMediaTraffickerContacts");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("AgencyMediaTraffickerContacts");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAgencyMediaTraffickerContacts.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AgencyMediaTraffickerContacts"),
                                        factory,xmlWriter);
                                    }
                                } if (localAgencySearchContactsTracker){
                                    if (localAgencySearchContacts==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"AgencySearchContacts", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"AgencySearchContacts");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("AgencySearchContacts");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAgencySearchContacts.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AgencySearchContacts"),
                                        factory,xmlWriter);
                                    }
                                }
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AllowCreativeShopViewCampaignData", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AllowCreativeShopViewCampaignData");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AllowCreativeShopViewCampaignData");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("AllowCreativeShopViewCampaignData cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAllowCreativeShopViewCampaignData));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"BookedImpressions", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"BookedImpressions");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("BookedImpressions");
                                    }
                                
                                               if (localBookedImpressions==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("BookedImpressions cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBookedImpressions));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"BrandID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"BrandID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("BrandID");
                                    }
                                
                                               if (localBrandID==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("BrandID cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBrandID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localCampaignExtendedInfoTracker){
                                    if (localCampaignExtendedInfo==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"CampaignExtendedInfo", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"CampaignExtendedInfo");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("CampaignExtendedInfo");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCampaignExtendedInfo.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","CampaignExtendedInfo"),
                                        factory,xmlWriter);
                                    }
                                } if (localCampaignNotesTracker){
                                    if (localCampaignNotes==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"CampaignNotes", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"CampaignNotes");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("CampaignNotes");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCampaignNotes.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","CampaignNotes"),
                                        factory,xmlWriter);
                                    }
                                }
                                    if (localCampaignSegmentation==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"CampaignSegmentation", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"CampaignSegmentation");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("CampaignSegmentation");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCampaignSegmentation.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","CampaignSegmentation"),
                                        factory,xmlWriter);
                                    }
                                 if (localCampaignStatusTracker){
                                            if (localCampaignStatus==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CampaignStatus cannot be null!!");
                                            }
                                           localCampaignStatus.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","CampaignStatus"),
                                               factory,xmlWriter);
                                        } if (localCreativeShopsTracker){
                                    if (localCreativeShops==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"CreativeShops", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"CreativeShops");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("CreativeShops");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCreativeShops.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","CreativeShops"),
                                        factory,xmlWriter);
                                    }
                                }
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"DefaultTargetRegionID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"DefaultTargetRegionID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("DefaultTargetRegionID");
                                    }
                                
                                               if (localDefaultTargetRegionID==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDefaultTargetRegionID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"GlobalCampaignID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"GlobalCampaignID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("GlobalCampaignID");
                                    }
                                
                                               if (localGlobalCampaignID==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGlobalCampaignID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localNameTracker){
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Name", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Name");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Name");
                                    }
                                

                                          if (localName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                    if (localSalesPerson==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"SalesPerson", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"SalesPerson");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("SalesPerson");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSalesPerson.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SalesPerson"),
                                        factory,xmlWriter);
                                    }
                                 if (localSiteBillingContactsTracker){
                                    if (localSiteBillingContacts==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"SiteBillingContacts", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"SiteBillingContacts");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("SiteBillingContacts");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSiteBillingContacts.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SiteBillingContacts"),
                                        factory,xmlWriter);
                                    }
                                } if (localSiteSalesContactsTracker){
                                    if (localSiteSalesContacts==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"SiteSalesContacts", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"SiteSalesContacts");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("SiteSalesContacts");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSiteSalesContacts.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SiteSalesContacts"),
                                        factory,xmlWriter);
                                    }
                                } if (localSiteTraffickerAdOpContactsTracker){
                                    if (localSiteTraffickerAdOpContacts==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"SiteTraffickerAdOpContacts", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"SiteTraffickerAdOpContacts");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("SiteTraffickerAdOpContacts");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSiteTraffickerAdOpContacts.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SiteTraffickerAdOpContacts"),
                                        factory,xmlWriter);
                                    }
                                }
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"SpecialInstructions", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SpecialInstructions");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SpecialInstructions");
                                    }
                                

                                          if (localSpecialInstructions==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSpecialInstructions);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localStopServing==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"StopServing", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"StopServing");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("StopServing");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localStopServing.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","StopServing"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"TotalPlacments", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"TotalPlacments");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("TotalPlacments");
                                    }
                                
                                               if (localTotalPlacments==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("TotalPlacments cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalPlacments));
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

                
                    attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance","type"));
                    attribList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","CampaignInfo"));
                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localID));
                            
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AccountManager"));
                            
                            
                                    elementList.add(localAccountManager==null?null:
                                    localAccountManager);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AdvertiserID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdvertiserID));
                             if (localAgencyBillingContactsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AgencyBillingContacts"));
                            
                            
                                    elementList.add(localAgencyBillingContacts==null?null:
                                    localAgencyBillingContacts);
                                }
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AgencyID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAgencyID));
                             if (localAgencyMediaPlannerContactsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AgencyMediaPlannerContacts"));
                            
                            
                                    elementList.add(localAgencyMediaPlannerContacts==null?null:
                                    localAgencyMediaPlannerContacts);
                                } if (localAgencyMediaTraffickerContactsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AgencyMediaTraffickerContacts"));
                            
                            
                                    elementList.add(localAgencyMediaTraffickerContacts==null?null:
                                    localAgencyMediaTraffickerContacts);
                                } if (localAgencySearchContactsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AgencySearchContacts"));
                            
                            
                                    elementList.add(localAgencySearchContacts==null?null:
                                    localAgencySearchContacts);
                                }
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "AllowCreativeShopViewCampaignData"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAllowCreativeShopViewCampaignData));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "BookedImpressions"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBookedImpressions));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "BrandID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBrandID));
                             if (localCampaignExtendedInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "CampaignExtendedInfo"));
                            
                            
                                    elementList.add(localCampaignExtendedInfo==null?null:
                                    localCampaignExtendedInfo);
                                } if (localCampaignNotesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "CampaignNotes"));
                            
                            
                                    elementList.add(localCampaignNotes==null?null:
                                    localCampaignNotes);
                                }
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "CampaignSegmentation"));
                            
                            
                                    elementList.add(localCampaignSegmentation==null?null:
                                    localCampaignSegmentation);
                                 if (localCampaignStatusTracker){
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "CampaignStatus"));
                            
                            
                                    if (localCampaignStatus==null){
                                         throw new org.apache.axis2.databinding.ADBException("CampaignStatus cannot be null!!");
                                    }
                                    elementList.add(localCampaignStatus);
                                } if (localCreativeShopsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "CreativeShops"));
                            
                            
                                    elementList.add(localCreativeShops==null?null:
                                    localCreativeShops);
                                }
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "DefaultTargetRegionID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDefaultTargetRegionID));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "GlobalCampaignID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGlobalCampaignID));
                             if (localNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "Name"));
                                 
                                         elementList.add(localName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
                                    }
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "SalesPerson"));
                            
                            
                                    elementList.add(localSalesPerson==null?null:
                                    localSalesPerson);
                                 if (localSiteBillingContactsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "SiteBillingContacts"));
                            
                            
                                    elementList.add(localSiteBillingContacts==null?null:
                                    localSiteBillingContacts);
                                } if (localSiteSalesContactsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "SiteSalesContacts"));
                            
                            
                                    elementList.add(localSiteSalesContacts==null?null:
                                    localSiteSalesContacts);
                                } if (localSiteTraffickerAdOpContactsTracker){
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "SiteTraffickerAdOpContacts"));
                            
                            
                                    elementList.add(localSiteTraffickerAdOpContacts==null?null:
                                    localSiteTraffickerAdOpContacts);
                                }
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "SpecialInstructions"));
                                 
                                         elementList.add(localSpecialInstructions==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpecialInstructions));
                                    
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "StopServing"));
                            
                            
                                    elementList.add(localStopServing==null?null:
                                    localStopServing);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "TotalPlacments"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalPlacments));
                            

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
        public static CampaignInfo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CampaignInfo object =
                new CampaignInfo();

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
                    
                            if (!"CampaignInfo".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CampaignInfo)api.eyeblaster.com.message.Campaign.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AccountManager").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAccountManager(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAccountManager(api.eyeblaster.com.V1.DataContracts.Campaign.ContactInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AdvertiserID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAdvertiserID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AgencyBillingContacts").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAgencyBillingContacts(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAgencyBillingContacts(api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AgencyMediaPlannerContacts").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAgencyMediaPlannerContacts(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAgencyMediaPlannerContacts(api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AgencyMediaTraffickerContacts").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAgencyMediaTraffickerContacts(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAgencyMediaTraffickerContacts(api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AgencySearchContacts").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAgencySearchContacts(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAgencySearchContacts(api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","AllowCreativeShopViewCampaignData").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAllowCreativeShopViewCampaignData(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","BookedImpressions").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBookedImpressions(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","BrandID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBrandID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","CampaignExtendedInfo").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCampaignExtendedInfo(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCampaignExtendedInfo(api.eyeblaster.com.V1.DataContracts.Campaign.CampaignExtendedInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","CampaignNotes").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCampaignNotes(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCampaignNotes(api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfCampaignNoteInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","CampaignSegmentation").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCampaignSegmentation(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCampaignSegmentation(api.eyeblaster.com.V1.DataContracts.Campaign.SegmentationTypes.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","CampaignStatus").equals(reader.getName())){
                                
                                                object.setCampaignStatus(api.eyeblaster.com.V1.DataContracts.Campaign.CampaignStatus.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","CreativeShops").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCreativeShops(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCreativeShops(api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfCreativeShopInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","DefaultTargetRegionID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDefaultTargetRegionID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setDefaultTargetRegionID(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","GlobalCampaignID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setGlobalCampaignID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setGlobalCampaignID(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","Name").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SalesPerson").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSalesPerson(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSalesPerson(api.eyeblaster.com.V1.DataContracts.Campaign.ContactInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SiteBillingContacts").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSiteBillingContacts(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSiteBillingContacts(api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SiteSalesContacts").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSiteSalesContacts(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSiteSalesContacts(api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SiteTraffickerAdOpContacts").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSiteTraffickerAdOpContacts(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSiteTraffickerAdOpContacts(api.eyeblaster.com.V1.DataContracts.Campaign.ArrayOfContactInfo.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SpecialInstructions").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSpecialInstructions(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","StopServing").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setStopServing(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setStopServing(api.eyeblaster.com.V1.DataContracts.Campaign.StopServingTypes.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","TotalPlacments").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTotalPlacments(
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
           
          