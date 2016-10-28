
/**
 * TimeBasedRotationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */
            
                package api.eyeblaster.com.V1.DataContracts.DeliveryGroup;
            

            /**
            *  TimeBasedRotationInfo bean class
            */
        
        public  class TimeBasedRotationInfo extends api.eyeblaster.com.V1.DataContracts.DeliveryGroup.BaseDC
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = TimeBasedRotationInfo
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
                        * field for Enabled
                        */

                        
                                    protected boolean localEnabled ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getEnabled(){
                               return localEnabled;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Enabled
                               */
                               public void setEnabled(boolean param){
                            
                                            this.localEnabled=param;
                                    

                               }
                            

                        /**
                        * field for EndDate
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime localEndDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime getEndDate(){
                               return localEndDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EndDate
                               */
                               public void setEndDate(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime param){
                            
                                            this.localEndDate=param;
                                    

                               }
                            

                        /**
                        * field for HoursEndDate
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime localHoursEndDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime getHoursEndDate(){
                               return localHoursEndDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HoursEndDate
                               */
                               public void setHoursEndDate(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime param){
                            
                                            this.localHoursEndDate=param;
                                    

                               }
                            

                        /**
                        * field for HoursStartDate
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime localHoursStartDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime getHoursStartDate(){
                               return localHoursStartDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HoursStartDate
                               */
                               public void setHoursStartDate(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime param){
                            
                                            this.localHoursStartDate=param;
                                    

                               }
                            

                        /**
                        * field for IsUsingEndUserTimeZone
                        */

                        
                                    protected boolean localIsUsingEndUserTimeZone ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIsUsingEndUserTimeZone(){
                               return localIsUsingEndUserTimeZone;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsUsingEndUserTimeZone
                               */
                               public void setIsUsingEndUserTimeZone(boolean param){
                            
                                            this.localIsUsingEndUserTimeZone=param;
                                    

                               }
                            

                        /**
                        * field for ServeOnDateRange
                        */

                        
                                    protected boolean localServeOnDateRange ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getServeOnDateRange(){
                               return localServeOnDateRange;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServeOnDateRange
                               */
                               public void setServeOnDateRange(boolean param){
                            
                                            this.localServeOnDateRange=param;
                                    

                               }
                            

                        /**
                        * field for ServeOnDays
                        */

                        
                                    protected boolean localServeOnDays ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getServeOnDays(){
                               return localServeOnDays;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServeOnDays
                               */
                               public void setServeOnDays(boolean param){
                            
                                            this.localServeOnDays=param;
                                    

                               }
                            

                        /**
                        * field for ServeOnFriday
                        */

                        
                                    protected boolean localServeOnFriday ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getServeOnFriday(){
                               return localServeOnFriday;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServeOnFriday
                               */
                               public void setServeOnFriday(boolean param){
                            
                                            this.localServeOnFriday=param;
                                    

                               }
                            

                        /**
                        * field for ServeOnFridayEnd
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime localServeOnFridayEnd ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime getServeOnFridayEnd(){
                               return localServeOnFridayEnd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServeOnFridayEnd
                               */
                               public void setServeOnFridayEnd(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime param){
                            
                                            this.localServeOnFridayEnd=param;
                                    

                               }
                            

                        /**
                        * field for ServeOnFridayStart
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime localServeOnFridayStart ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime getServeOnFridayStart(){
                               return localServeOnFridayStart;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServeOnFridayStart
                               */
                               public void setServeOnFridayStart(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime param){
                            
                                            this.localServeOnFridayStart=param;
                                    

                               }
                            

                        /**
                        * field for ServeOnHoursRange
                        */

                        
                                    protected boolean localServeOnHoursRange ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getServeOnHoursRange(){
                               return localServeOnHoursRange;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServeOnHoursRange
                               */
                               public void setServeOnHoursRange(boolean param){
                            
                                            this.localServeOnHoursRange=param;
                                    

                               }
                            

                        /**
                        * field for ServeOnMonday
                        */

                        
                                    protected boolean localServeOnMonday ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getServeOnMonday(){
                               return localServeOnMonday;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServeOnMonday
                               */
                               public void setServeOnMonday(boolean param){
                            
                                            this.localServeOnMonday=param;
                                    

                               }
                            

                        /**
                        * field for ServeOnMondayEnd
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime localServeOnMondayEnd ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime getServeOnMondayEnd(){
                               return localServeOnMondayEnd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServeOnMondayEnd
                               */
                               public void setServeOnMondayEnd(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime param){
                            
                                            this.localServeOnMondayEnd=param;
                                    

                               }
                            

                        /**
                        * field for ServeOnMondayStart
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime localServeOnMondayStart ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime getServeOnMondayStart(){
                               return localServeOnMondayStart;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServeOnMondayStart
                               */
                               public void setServeOnMondayStart(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime param){
                            
                                            this.localServeOnMondayStart=param;
                                    

                               }
                            

                        /**
                        * field for ServeOnSaturday
                        */

                        
                                    protected boolean localServeOnSaturday ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getServeOnSaturday(){
                               return localServeOnSaturday;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServeOnSaturday
                               */
                               public void setServeOnSaturday(boolean param){
                            
                                            this.localServeOnSaturday=param;
                                    

                               }
                            

                        /**
                        * field for ServeOnSaturdayEnd
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime localServeOnSaturdayEnd ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime getServeOnSaturdayEnd(){
                               return localServeOnSaturdayEnd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServeOnSaturdayEnd
                               */
                               public void setServeOnSaturdayEnd(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime param){
                            
                                            this.localServeOnSaturdayEnd=param;
                                    

                               }
                            

                        /**
                        * field for ServeOnSaturdayStart
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime localServeOnSaturdayStart ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime getServeOnSaturdayStart(){
                               return localServeOnSaturdayStart;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServeOnSaturdayStart
                               */
                               public void setServeOnSaturdayStart(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime param){
                            
                                            this.localServeOnSaturdayStart=param;
                                    

                               }
                            

                        /**
                        * field for ServeOnSunday
                        */

                        
                                    protected boolean localServeOnSunday ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getServeOnSunday(){
                               return localServeOnSunday;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServeOnSunday
                               */
                               public void setServeOnSunday(boolean param){
                            
                                            this.localServeOnSunday=param;
                                    

                               }
                            

                        /**
                        * field for ServeOnSundayEnd
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime localServeOnSundayEnd ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime getServeOnSundayEnd(){
                               return localServeOnSundayEnd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServeOnSundayEnd
                               */
                               public void setServeOnSundayEnd(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime param){
                            
                                            this.localServeOnSundayEnd=param;
                                    

                               }
                            

                        /**
                        * field for ServeOnSundayStart
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime localServeOnSundayStart ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime getServeOnSundayStart(){
                               return localServeOnSundayStart;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServeOnSundayStart
                               */
                               public void setServeOnSundayStart(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime param){
                            
                                            this.localServeOnSundayStart=param;
                                    

                               }
                            

                        /**
                        * field for ServeOnThursday
                        */

                        
                                    protected boolean localServeOnThursday ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getServeOnThursday(){
                               return localServeOnThursday;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServeOnThursday
                               */
                               public void setServeOnThursday(boolean param){
                            
                                            this.localServeOnThursday=param;
                                    

                               }
                            

                        /**
                        * field for ServeOnThursdayEnd
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime localServeOnThursdayEnd ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime getServeOnThursdayEnd(){
                               return localServeOnThursdayEnd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServeOnThursdayEnd
                               */
                               public void setServeOnThursdayEnd(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime param){
                            
                                            this.localServeOnThursdayEnd=param;
                                    

                               }
                            

                        /**
                        * field for ServeOnThursdayStart
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime localServeOnThursdayStart ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime getServeOnThursdayStart(){
                               return localServeOnThursdayStart;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServeOnThursdayStart
                               */
                               public void setServeOnThursdayStart(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime param){
                            
                                            this.localServeOnThursdayStart=param;
                                    

                               }
                            

                        /**
                        * field for ServeOnTuesday
                        */

                        
                                    protected boolean localServeOnTuesday ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getServeOnTuesday(){
                               return localServeOnTuesday;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServeOnTuesday
                               */
                               public void setServeOnTuesday(boolean param){
                            
                                            this.localServeOnTuesday=param;
                                    

                               }
                            

                        /**
                        * field for ServeOnTuesdayEnd
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime localServeOnTuesdayEnd ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime getServeOnTuesdayEnd(){
                               return localServeOnTuesdayEnd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServeOnTuesdayEnd
                               */
                               public void setServeOnTuesdayEnd(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime param){
                            
                                            this.localServeOnTuesdayEnd=param;
                                    

                               }
                            

                        /**
                        * field for ServeOnTuesdayStart
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime localServeOnTuesdayStart ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime getServeOnTuesdayStart(){
                               return localServeOnTuesdayStart;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServeOnTuesdayStart
                               */
                               public void setServeOnTuesdayStart(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime param){
                            
                                            this.localServeOnTuesdayStart=param;
                                    

                               }
                            

                        /**
                        * field for ServeOnWednesday
                        */

                        
                                    protected boolean localServeOnWednesday ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getServeOnWednesday(){
                               return localServeOnWednesday;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServeOnWednesday
                               */
                               public void setServeOnWednesday(boolean param){
                            
                                            this.localServeOnWednesday=param;
                                    

                               }
                            

                        /**
                        * field for ServeOnWednesdayEnd
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime localServeOnWednesdayEnd ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime getServeOnWednesdayEnd(){
                               return localServeOnWednesdayEnd;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServeOnWednesdayEnd
                               */
                               public void setServeOnWednesdayEnd(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime param){
                            
                                            this.localServeOnWednesdayEnd=param;
                                    

                               }
                            

                        /**
                        * field for ServeOnWednesdayStart
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime localServeOnWednesdayStart ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime getServeOnWednesdayStart(){
                               return localServeOnWednesdayStart;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServeOnWednesdayStart
                               */
                               public void setServeOnWednesdayStart(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime param){
                            
                                            this.localServeOnWednesdayStart=param;
                                    

                               }
                            

                        /**
                        * field for SpecificTimeZone
                        */

                        
                                    protected int localSpecificTimeZone ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getSpecificTimeZone(){
                               return localSpecificTimeZone;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SpecificTimeZone
                               */
                               public void setSpecificTimeZone(int param){
                            
                                            this.localSpecificTimeZone=param;
                                    

                               }
                            

                        /**
                        * field for StartDate
                        */

                        
                                    protected api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime localStartDate ;
                                

                           /**
                           * Auto generated getter method
                           * @return api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime
                           */
                           public  api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime getStartDate(){
                               return localStartDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StartDate
                               */
                               public void setStartDate(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime param){
                            
                                            this.localStartDate=param;
                                    

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
                       TimeBasedRotationInfo.this.serialize(parentQName,factory,xmlWriter);
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
                           namespacePrefix+":TimeBasedRotationInfo",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "TimeBasedRotationInfo",
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
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Enabled", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Enabled");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Enabled");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("Enabled cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnabled));
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
                                
                                    if (localHoursEndDate==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"HoursEndDate", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"HoursEndDate");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("HoursEndDate");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localHoursEndDate.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","HoursEndDate"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localHoursStartDate==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"HoursStartDate", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"HoursStartDate");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("HoursStartDate");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localHoursStartDate.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","HoursStartDate"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"IsUsingEndUserTimeZone", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"IsUsingEndUserTimeZone");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("IsUsingEndUserTimeZone");
                                    }
                                
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsUsingEndUserTimeZone));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ServeOnDateRange", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ServeOnDateRange");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ServeOnDateRange");
                                    }
                                
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServeOnDateRange));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ServeOnDays", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ServeOnDays");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ServeOnDays");
                                    }
                                
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServeOnDays));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ServeOnFriday", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ServeOnFriday");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ServeOnFriday");
                                    }
                                
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServeOnFriday));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localServeOnFridayEnd==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ServeOnFridayEnd", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ServeOnFridayEnd");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ServeOnFridayEnd");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServeOnFridayEnd.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnFridayEnd"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localServeOnFridayStart==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ServeOnFridayStart", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ServeOnFridayStart");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ServeOnFridayStart");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServeOnFridayStart.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnFridayStart"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ServeOnHoursRange", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ServeOnHoursRange");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ServeOnHoursRange");
                                    }
                                
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServeOnHoursRange));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ServeOnMonday", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ServeOnMonday");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ServeOnMonday");
                                    }
                                
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServeOnMonday));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localServeOnMondayEnd==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ServeOnMondayEnd", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ServeOnMondayEnd");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ServeOnMondayEnd");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServeOnMondayEnd.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnMondayEnd"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localServeOnMondayStart==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ServeOnMondayStart", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ServeOnMondayStart");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ServeOnMondayStart");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServeOnMondayStart.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnMondayStart"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ServeOnSaturday", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ServeOnSaturday");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ServeOnSaturday");
                                    }
                                
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServeOnSaturday));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localServeOnSaturdayEnd==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ServeOnSaturdayEnd", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ServeOnSaturdayEnd");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ServeOnSaturdayEnd");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServeOnSaturdayEnd.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnSaturdayEnd"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localServeOnSaturdayStart==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ServeOnSaturdayStart", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ServeOnSaturdayStart");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ServeOnSaturdayStart");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServeOnSaturdayStart.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnSaturdayStart"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ServeOnSunday", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ServeOnSunday");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ServeOnSunday");
                                    }
                                
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServeOnSunday));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localServeOnSundayEnd==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ServeOnSundayEnd", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ServeOnSundayEnd");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ServeOnSundayEnd");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServeOnSundayEnd.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnSundayEnd"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localServeOnSundayStart==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ServeOnSundayStart", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ServeOnSundayStart");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ServeOnSundayStart");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServeOnSundayStart.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnSundayStart"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ServeOnThursday", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ServeOnThursday");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ServeOnThursday");
                                    }
                                
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServeOnThursday));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localServeOnThursdayEnd==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ServeOnThursdayEnd", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ServeOnThursdayEnd");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ServeOnThursdayEnd");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServeOnThursdayEnd.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnThursdayEnd"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localServeOnThursdayStart==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ServeOnThursdayStart", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ServeOnThursdayStart");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ServeOnThursdayStart");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServeOnThursdayStart.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnThursdayStart"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ServeOnTuesday", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ServeOnTuesday");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ServeOnTuesday");
                                    }
                                
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServeOnTuesday));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localServeOnTuesdayEnd==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ServeOnTuesdayEnd", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ServeOnTuesdayEnd");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ServeOnTuesdayEnd");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServeOnTuesdayEnd.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnTuesdayEnd"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localServeOnTuesdayStart==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ServeOnTuesdayStart", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ServeOnTuesdayStart");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ServeOnTuesdayStart");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServeOnTuesdayStart.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnTuesdayStart"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ServeOnWednesday", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ServeOnWednesday");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ServeOnWednesday");
                                    }
                                
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServeOnWednesday));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localServeOnWednesdayEnd==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ServeOnWednesdayEnd", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ServeOnWednesdayEnd");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ServeOnWednesdayEnd");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServeOnWednesdayEnd.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnWednesdayEnd"),
                                        factory,xmlWriter);
                                    }
                                
                                    if (localServeOnWednesdayStart==null){

                                            java.lang.String namespace2 = "http://api.eyeblaster.com/V1/DataContracts";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"ServeOnWednesdayStart", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"ServeOnWednesdayStart");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("ServeOnWednesdayStart");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localServeOnWednesdayStart.serialize(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnWednesdayStart"),
                                        factory,xmlWriter);
                                    }
                                
                                    namespace = "http://api.eyeblaster.com/V1/DataContracts";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"SpecificTimeZone", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"SpecificTimeZone");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("SpecificTimeZone");
                                    }
                                
                                               if (localSpecificTimeZone==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpecificTimeZone));
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
                    attribList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","TimeBasedRotationInfo"));
                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localID));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "Enabled"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnabled));
                            
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "EndDate"));
                            
                            
                                    elementList.add(localEndDate==null?null:
                                    localEndDate);
                                
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "HoursEndDate"));
                            
                            
                                    elementList.add(localHoursEndDate==null?null:
                                    localHoursEndDate);
                                
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "HoursStartDate"));
                            
                            
                                    elementList.add(localHoursStartDate==null?null:
                                    localHoursStartDate);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "IsUsingEndUserTimeZone"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsUsingEndUserTimeZone));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServeOnDateRange"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServeOnDateRange));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServeOnDays"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServeOnDays));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServeOnFriday"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServeOnFriday));
                            
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServeOnFridayEnd"));
                            
                            
                                    elementList.add(localServeOnFridayEnd==null?null:
                                    localServeOnFridayEnd);
                                
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServeOnFridayStart"));
                            
                            
                                    elementList.add(localServeOnFridayStart==null?null:
                                    localServeOnFridayStart);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServeOnHoursRange"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServeOnHoursRange));
                            
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServeOnMonday"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServeOnMonday));
                            
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServeOnMondayEnd"));
                            
                            
                                    elementList.add(localServeOnMondayEnd==null?null:
                                    localServeOnMondayEnd);
                                
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServeOnMondayStart"));
                            
                            
                                    elementList.add(localServeOnMondayStart==null?null:
                                    localServeOnMondayStart);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServeOnSaturday"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServeOnSaturday));
                            
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServeOnSaturdayEnd"));
                            
                            
                                    elementList.add(localServeOnSaturdayEnd==null?null:
                                    localServeOnSaturdayEnd);
                                
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServeOnSaturdayStart"));
                            
                            
                                    elementList.add(localServeOnSaturdayStart==null?null:
                                    localServeOnSaturdayStart);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServeOnSunday"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServeOnSunday));
                            
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServeOnSundayEnd"));
                            
                            
                                    elementList.add(localServeOnSundayEnd==null?null:
                                    localServeOnSundayEnd);
                                
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServeOnSundayStart"));
                            
                            
                                    elementList.add(localServeOnSundayStart==null?null:
                                    localServeOnSundayStart);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServeOnThursday"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServeOnThursday));
                            
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServeOnThursdayEnd"));
                            
                            
                                    elementList.add(localServeOnThursdayEnd==null?null:
                                    localServeOnThursdayEnd);
                                
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServeOnThursdayStart"));
                            
                            
                                    elementList.add(localServeOnThursdayStart==null?null:
                                    localServeOnThursdayStart);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServeOnTuesday"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServeOnTuesday));
                            
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServeOnTuesdayEnd"));
                            
                            
                                    elementList.add(localServeOnTuesdayEnd==null?null:
                                    localServeOnTuesdayEnd);
                                
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServeOnTuesdayStart"));
                            
                            
                                    elementList.add(localServeOnTuesdayStart==null?null:
                                    localServeOnTuesdayStart);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServeOnWednesday"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServeOnWednesday));
                            
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServeOnWednesdayEnd"));
                            
                            
                                    elementList.add(localServeOnWednesdayEnd==null?null:
                                    localServeOnWednesdayEnd);
                                
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "ServeOnWednesdayStart"));
                            
                            
                                    elementList.add(localServeOnWednesdayStart==null?null:
                                    localServeOnWednesdayStart);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "SpecificTimeZone"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpecificTimeZone));
                            
                            elementList.add(new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts",
                                                                      "StartDate"));
                            
                            
                                    elementList.add(localStartDate==null?null:
                                    localStartDate);
                                

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
        public static TimeBasedRotationInfo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            TimeBasedRotationInfo object =
                new TimeBasedRotationInfo();

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
                    
                            if (!"TimeBasedRotationInfo".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (TimeBasedRotationInfo)api.eyeblaster.com.message.DeliveryGroup.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","Enabled").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEnabled(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
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
                                    
                                                object.setEndDate(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","HoursEndDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setHoursEndDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setHoursEndDate(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","HoursStartDate").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setHoursStartDate(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setHoursStartDate(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","IsUsingEndUserTimeZone").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIsUsingEndUserTimeZone(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnDateRange").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServeOnDateRange(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnDays").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServeOnDays(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnFriday").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServeOnFriday(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnFridayEnd").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServeOnFridayEnd(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServeOnFridayEnd(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnFridayStart").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServeOnFridayStart(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServeOnFridayStart(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnHoursRange").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServeOnHoursRange(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnMonday").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServeOnMonday(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnMondayEnd").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServeOnMondayEnd(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServeOnMondayEnd(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnMondayStart").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServeOnMondayStart(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServeOnMondayStart(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnSaturday").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServeOnSaturday(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnSaturdayEnd").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServeOnSaturdayEnd(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServeOnSaturdayEnd(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnSaturdayStart").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServeOnSaturdayStart(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServeOnSaturdayStart(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnSunday").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServeOnSunday(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnSundayEnd").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServeOnSundayEnd(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServeOnSundayEnd(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnSundayStart").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServeOnSundayStart(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServeOnSundayStart(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnThursday").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServeOnThursday(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnThursdayEnd").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServeOnThursdayEnd(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServeOnThursdayEnd(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnThursdayStart").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServeOnThursdayStart(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServeOnThursdayStart(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnTuesday").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServeOnTuesday(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnTuesdayEnd").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServeOnTuesdayEnd(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServeOnTuesdayEnd(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnTuesdayStart").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServeOnTuesdayStart(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServeOnTuesdayStart(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnWednesday").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServeOnWednesday(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnWednesdayEnd").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServeOnWednesdayEnd(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServeOnWednesdayEnd(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","ServeOnWednesdayStart").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setServeOnWednesdayStart(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setServeOnWednesdayStart(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://api.eyeblaster.com/V1/DataContracts","SpecificTimeZone").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSpecificTimeZone(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setSpecificTimeZone(java.lang.Integer.MIN_VALUE);
                                               
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
                                    
                                                object.setStartDate(api.eyeblaster.com.V1.DataContracts.DeliveryGroup.APIDateTime.Factory.parse(reader));
                                              
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
           
          