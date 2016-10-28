
/**
 * TimeZone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */
            
                package api.eyeblaster.com.V1.DataContracts.Ad;
            

            /**
            *  TimeZone bean class
            */
        
        public  class TimeZone
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://api.eyeblaster.com/V1/DataContracts",
                "TimeZone",
                "ns2");

            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://api.eyeblaster.com/V1/DataContracts")){
                return "ns2";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for TimeZone
                        */

                        
                                    protected java.lang.String localTimeZone ;
                                
                            private static java.util.HashMap _table_ = new java.util.HashMap();

                            // Constructor
                            
                                protected TimeZone(java.lang.String value, boolean isRegisterValue) {
                                    localTimeZone = value;
                                    if (isRegisterValue){
                                        
                                               _table_.put(localTimeZone, this);
                                           
                                    }

                                }
                            
                                    public static final java.lang.String _GMT_Minus_12 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMT_Minus_12");
                                
                                    public static final java.lang.String _GMT_Minus_11 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMT_Minus_11");
                                
                                    public static final java.lang.String _GMT_Minus_10 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMT_Minus_10");
                                
                                    public static final java.lang.String _GMT_Minus_9 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMT_Minus_9");
                                
                                    public static final java.lang.String _GMT_Minus_8 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMT_Minus_8");
                                
                                    public static final java.lang.String _GMT_Minus_7 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMT_Minus_7");
                                
                                    public static final java.lang.String _GMT_Minus_6 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMT_Minus_6");
                                
                                    public static final java.lang.String _GMT_Minus_5 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMT_Minus_5");
                                
                                    public static final java.lang.String _GMT_Minus_4 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMT_Minus_4");
                                
                                    public static final java.lang.String _GMT_Minus_3 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMT_Minus_3");
                                
                                    public static final java.lang.String _GMT_Minus_2 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMT_Minus_2");
                                
                                    public static final java.lang.String _GMT_Minus_1 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMT_Minus_1");
                                
                                    public static final java.lang.String _GMT =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMT");
                                
                                    public static final java.lang.String _GMT_Plus_1 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMT_Plus_1");
                                
                                    public static final java.lang.String _GMT_Plus_2 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMT_Plus_2");
                                
                                    public static final java.lang.String _GMT_Plus_3 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMT_Plus_3");
                                
                                    public static final java.lang.String _GMT_Plus_4 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMT_Plus_4");
                                
                                    public static final java.lang.String _GMT_Plus_5 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMT_Plus_5");
                                
                                    public static final java.lang.String _GMT_Plus_6 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMT_Plus_6");
                                
                                    public static final java.lang.String _GMT_Plus_7 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMT_Plus_7");
                                
                                    public static final java.lang.String _GMT_Plus_8 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMT_Plus_8");
                                
                                    public static final java.lang.String _GMT_Plus_9 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMT_Plus_9");
                                
                                    public static final java.lang.String _GMT_Plus_10 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMT_Plus_10");
                                
                                    public static final java.lang.String _GMT_Plus_11 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMT_Plus_11");
                                
                                    public static final java.lang.String _GMT_Plus_12 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMT_Plus_12");
                                
                                public static final TimeZone GMT_Minus_12 =
                                    new TimeZone(_GMT_Minus_12,true);
                            
                                public static final TimeZone GMT_Minus_11 =
                                    new TimeZone(_GMT_Minus_11,true);
                            
                                public static final TimeZone GMT_Minus_10 =
                                    new TimeZone(_GMT_Minus_10,true);
                            
                                public static final TimeZone GMT_Minus_9 =
                                    new TimeZone(_GMT_Minus_9,true);
                            
                                public static final TimeZone GMT_Minus_8 =
                                    new TimeZone(_GMT_Minus_8,true);
                            
                                public static final TimeZone GMT_Minus_7 =
                                    new TimeZone(_GMT_Minus_7,true);
                            
                                public static final TimeZone GMT_Minus_6 =
                                    new TimeZone(_GMT_Minus_6,true);
                            
                                public static final TimeZone GMT_Minus_5 =
                                    new TimeZone(_GMT_Minus_5,true);
                            
                                public static final TimeZone GMT_Minus_4 =
                                    new TimeZone(_GMT_Minus_4,true);
                            
                                public static final TimeZone GMT_Minus_3 =
                                    new TimeZone(_GMT_Minus_3,true);
                            
                                public static final TimeZone GMT_Minus_2 =
                                    new TimeZone(_GMT_Minus_2,true);
                            
                                public static final TimeZone GMT_Minus_1 =
                                    new TimeZone(_GMT_Minus_1,true);
                            
                                public static final TimeZone GMT =
                                    new TimeZone(_GMT,true);
                            
                                public static final TimeZone GMT_Plus_1 =
                                    new TimeZone(_GMT_Plus_1,true);
                            
                                public static final TimeZone GMT_Plus_2 =
                                    new TimeZone(_GMT_Plus_2,true);
                            
                                public static final TimeZone GMT_Plus_3 =
                                    new TimeZone(_GMT_Plus_3,true);
                            
                                public static final TimeZone GMT_Plus_4 =
                                    new TimeZone(_GMT_Plus_4,true);
                            
                                public static final TimeZone GMT_Plus_5 =
                                    new TimeZone(_GMT_Plus_5,true);
                            
                                public static final TimeZone GMT_Plus_6 =
                                    new TimeZone(_GMT_Plus_6,true);
                            
                                public static final TimeZone GMT_Plus_7 =
                                    new TimeZone(_GMT_Plus_7,true);
                            
                                public static final TimeZone GMT_Plus_8 =
                                    new TimeZone(_GMT_Plus_8,true);
                            
                                public static final TimeZone GMT_Plus_9 =
                                    new TimeZone(_GMT_Plus_9,true);
                            
                                public static final TimeZone GMT_Plus_10 =
                                    new TimeZone(_GMT_Plus_10,true);
                            
                                public static final TimeZone GMT_Plus_11 =
                                    new TimeZone(_GMT_Plus_11,true);
                            
                                public static final TimeZone GMT_Plus_12 =
                                    new TimeZone(_GMT_Plus_12,true);
                            

                                public java.lang.String getValue() { return localTimeZone;}

                                public boolean equals(java.lang.Object obj) {return (obj == this);}
                                public int hashCode() { return toString().hashCode();}
                                public java.lang.String toString() {
                                
                                        return localTimeZone.toString();
                                    

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
                       TimeZone.this.serialize(MY_QNAME,factory,xmlWriter);
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
                                           namespacePrefix+":TimeZone",
                                           xmlWriter);
                                   } else {
                                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                                           "TimeZone",
                                           xmlWriter);
                                   }
                               }
                            
                                          if (localTimeZone==null){
                                            
                                                     throw new org.apache.axis2.databinding.ADBException("Value cannot be null !!");
                                                
                                         }else{
                                        
                                                       xmlWriter.writeCharacters(localTimeZone);
                                            
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
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeZone)
                            },
                            null);

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        
                public static TimeZone fromValue(java.lang.String value)
                      throws java.lang.IllegalArgumentException {
                    TimeZone enumeration = (TimeZone)
                       
                               _table_.get(value);
                           

                    if (enumeration==null) throw new java.lang.IllegalArgumentException();
                    return enumeration;
                }
                public static TimeZone fromString(java.lang.String value,java.lang.String namespaceURI)
                      throws java.lang.IllegalArgumentException {
                    try {
                       
                                       return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));
                                   

                    } catch (java.lang.Exception e) {
                        throw new java.lang.IllegalArgumentException();
                    }
                }

                public static TimeZone fromString(javax.xml.stream.XMLStreamReader xmlStreamReader,
                                                                    java.lang.String content) {
                    if (content.indexOf(":") > -1){
                        java.lang.String prefix = content.substring(0,content.indexOf(":"));
                        java.lang.String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);
                        return TimeZone.Factory.fromString(content,namespaceUri);
                    } else {
                       return TimeZone.Factory.fromString(content,"");
                    }
                }
            

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static TimeZone parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            TimeZone object = null;
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
                                            object = TimeZone.Factory.fromString(content,namespaceuri);
                                        } else {
                                            // this seems to be not a qname send and empty namespace incase of it is
                                            // check is done in fromString method
                                            object = TimeZone.Factory.fromString(content,"");
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
           
          