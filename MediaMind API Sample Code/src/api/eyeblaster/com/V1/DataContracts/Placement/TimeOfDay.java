
/**
 * TimeOfDay.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */
            
                package api.eyeblaster.com.V1.DataContracts.Placement;
            

            /**
            *  TimeOfDay bean class
            */
        
        public  class TimeOfDay
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://api.eyeblaster.com/V1/DataContracts",
                "TimeOfDay",
                "ns2");

            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://api.eyeblaster.com/V1/DataContracts")){
                return "ns2";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for TimeOfDay
                        */

                        
                                    protected java.lang.String localTimeOfDay ;
                                
                            private static java.util.HashMap _table_ = new java.util.HashMap();

                            // Constructor
                            
                                protected TimeOfDay(java.lang.String value, boolean isRegisterValue) {
                                    localTimeOfDay = value;
                                    if (isRegisterValue){
                                        
                                               _table_.put(localTimeOfDay, this);
                                           
                                    }

                                }
                            
                                    public static final java.lang.String _AM_12 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AM_12");
                                
                                    public static final java.lang.String _AM_01 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AM_01");
                                
                                    public static final java.lang.String _AM_02 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AM_02");
                                
                                    public static final java.lang.String _AM_03 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AM_03");
                                
                                    public static final java.lang.String _AM_04 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AM_04");
                                
                                    public static final java.lang.String _AM_05 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AM_05");
                                
                                    public static final java.lang.String _AM_06 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AM_06");
                                
                                    public static final java.lang.String _AM_07 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AM_07");
                                
                                    public static final java.lang.String _AM_08 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AM_08");
                                
                                    public static final java.lang.String _AM_09 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AM_09");
                                
                                    public static final java.lang.String _AM_10 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AM_10");
                                
                                    public static final java.lang.String _AM_11 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AM_11");
                                
                                    public static final java.lang.String _PM_12 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PM_12");
                                
                                    public static final java.lang.String _PM_01 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PM_01");
                                
                                    public static final java.lang.String _PM_02 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PM_02");
                                
                                    public static final java.lang.String _PM_03 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PM_03");
                                
                                    public static final java.lang.String _PM_04 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PM_04");
                                
                                    public static final java.lang.String _PM_05 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PM_05");
                                
                                    public static final java.lang.String _PM_06 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PM_06");
                                
                                    public static final java.lang.String _PM_07 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PM_07");
                                
                                    public static final java.lang.String _PM_08 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PM_08");
                                
                                    public static final java.lang.String _PM_09 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PM_09");
                                
                                    public static final java.lang.String _PM_10 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PM_10");
                                
                                    public static final java.lang.String _PM_11 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PM_11");
                                
                                public static final TimeOfDay AM_12 =
                                    new TimeOfDay(_AM_12,true);
                            
                                public static final TimeOfDay AM_01 =
                                    new TimeOfDay(_AM_01,true);
                            
                                public static final TimeOfDay AM_02 =
                                    new TimeOfDay(_AM_02,true);
                            
                                public static final TimeOfDay AM_03 =
                                    new TimeOfDay(_AM_03,true);
                            
                                public static final TimeOfDay AM_04 =
                                    new TimeOfDay(_AM_04,true);
                            
                                public static final TimeOfDay AM_05 =
                                    new TimeOfDay(_AM_05,true);
                            
                                public static final TimeOfDay AM_06 =
                                    new TimeOfDay(_AM_06,true);
                            
                                public static final TimeOfDay AM_07 =
                                    new TimeOfDay(_AM_07,true);
                            
                                public static final TimeOfDay AM_08 =
                                    new TimeOfDay(_AM_08,true);
                            
                                public static final TimeOfDay AM_09 =
                                    new TimeOfDay(_AM_09,true);
                            
                                public static final TimeOfDay AM_10 =
                                    new TimeOfDay(_AM_10,true);
                            
                                public static final TimeOfDay AM_11 =
                                    new TimeOfDay(_AM_11,true);
                            
                                public static final TimeOfDay PM_12 =
                                    new TimeOfDay(_PM_12,true);
                            
                                public static final TimeOfDay PM_01 =
                                    new TimeOfDay(_PM_01,true);
                            
                                public static final TimeOfDay PM_02 =
                                    new TimeOfDay(_PM_02,true);
                            
                                public static final TimeOfDay PM_03 =
                                    new TimeOfDay(_PM_03,true);
                            
                                public static final TimeOfDay PM_04 =
                                    new TimeOfDay(_PM_04,true);
                            
                                public static final TimeOfDay PM_05 =
                                    new TimeOfDay(_PM_05,true);
                            
                                public static final TimeOfDay PM_06 =
                                    new TimeOfDay(_PM_06,true);
                            
                                public static final TimeOfDay PM_07 =
                                    new TimeOfDay(_PM_07,true);
                            
                                public static final TimeOfDay PM_08 =
                                    new TimeOfDay(_PM_08,true);
                            
                                public static final TimeOfDay PM_09 =
                                    new TimeOfDay(_PM_09,true);
                            
                                public static final TimeOfDay PM_10 =
                                    new TimeOfDay(_PM_10,true);
                            
                                public static final TimeOfDay PM_11 =
                                    new TimeOfDay(_PM_11,true);
                            

                                public java.lang.String getValue() { return localTimeOfDay;}

                                public boolean equals(java.lang.Object obj) {return (obj == this);}
                                public int hashCode() { return toString().hashCode();}
                                public java.lang.String toString() {
                                
                                        return localTimeOfDay.toString();
                                    

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
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

                 public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       TimeOfDay.this.serialize(MY_QNAME,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               MY_QNAME,factory,dataSource);
            
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
            
                
                //We can safely assume an element has only one type associated with it
                
                            java.lang.String namespace = parentQName.getNamespaceURI();
                            java.lang.String localName = parentQName.getLocalPart();
                        
                            if (! namespace.equals("")) {
                                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                                if (prefix == null) {
                                    prefix = generatePrefix(namespace);

                                    xmlWriter.writeStartElement(prefix, localName, namespace);
                                    xmlWriter.writeNamespace(prefix, namespace);
                                    xmlWriter.setPrefix(prefix, namespace);

                                } else {
                                    xmlWriter.writeStartElement(namespace, localName);
                                }

                            } else {
                                xmlWriter.writeStartElement(localName);
                            }

                            // add the type details if this is used in a simple type
                               if (serializeType){
                                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://api.eyeblaster.com/V1/DataContracts");
                                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                                           namespacePrefix+":TimeOfDay",
                                           xmlWriter);
                                   } else {
                                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                                           "TimeOfDay",
                                           xmlWriter);
                                   }
                               }
                            
                                          if (localTimeOfDay==null){
                                            
                                                     throw new org.apache.axis2.databinding.ADBException("Value cannot be null !!");
                                                
                                         }else{
                                        
                                                       xmlWriter.writeCharacters(localTimeOfDay);
                                            
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


        
                
                //We can safely assume an element has only one type associated with it
                 return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME,
                            new java.lang.Object[]{
                            org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeOfDay)
                            },
                            null);

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        
                public static TimeOfDay fromValue(java.lang.String value)
                      throws java.lang.IllegalArgumentException {
                    TimeOfDay enumeration = (TimeOfDay)
                       
                               _table_.get(value);
                           

                    if (enumeration==null) throw new java.lang.IllegalArgumentException();
                    return enumeration;
                }
                public static TimeOfDay fromString(java.lang.String value,java.lang.String namespaceURI)
                      throws java.lang.IllegalArgumentException {
                    try {
                       
                                       return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));
                                   

                    } catch (java.lang.Exception e) {
                        throw new java.lang.IllegalArgumentException();
                    }
                }

                public static TimeOfDay fromString(javax.xml.stream.XMLStreamReader xmlStreamReader,
                                                                    java.lang.String content) {
                    if (content.indexOf(":") > -1){
                        java.lang.String prefix = content.substring(0,content.indexOf(":"));
                        java.lang.String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);
                        return TimeOfDay.Factory.fromString(content,namespaceUri);
                    } else {
                       return TimeOfDay.Factory.fromString(content,"");
                    }
                }
            

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static TimeOfDay parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            TimeOfDay object = null;
                // initialize a hash map to keep values
                java.util.Map attributeMap = new java.util.HashMap();
                java.util.List extraAttributeList = new java.util.ArrayList();
            

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                    
                while(!reader.isEndElement()) {
                    if (reader.isStartElement()  || reader.hasText()){
                
                                    java.lang.String content = reader.getElementText();
                                    
                                        if (content.indexOf(":") > 0) {
                                            // this seems to be a Qname so find the namespace and send
                                            prefix = content.substring(0, content.indexOf(":"));
                                            namespaceuri = reader.getNamespaceURI(prefix);
                                            object = TimeOfDay.Factory.fromString(content,namespaceuri);
                                        } else {
                                            // this seems to be not a qname send and empty namespace incase of it is
                                            // check is done in fromString method
                                            object = TimeOfDay.Factory.fromString(content,"");
                                        }
                                        
                                        
                             } else {
                                reader.next();
                             }  
                           }  // end of while loop
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          