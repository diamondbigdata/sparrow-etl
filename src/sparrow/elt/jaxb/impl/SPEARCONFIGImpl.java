//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vBeta 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.12.18 at 05:29:09 SGT 
//


package sparrow.elt.jaxb.impl;

public class SPEARCONFIGImpl
    extends sparrow.elt.jaxb.impl.SPEARCONFIGTypeImpl
    implements sparrow.elt.jaxb.SPEARCONFIG, com.sun.xml.bind.RIElement, com.sun.xml.bind.unmarshaller.UnmarshallableObject, com.sun.xml.bind.serializer.XMLSerializable, com.sun.xml.bind.validator.ValidatableObject
{

    private final static Class PRIMARY_INTERFACE_CLASS = sparrow.elt.jaxb.SPEARCONFIG.class;
    private final static com.sun.msv.grammar.Grammar schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize("\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u008b\u0010\u001fsu\u008b\u0091\u00c2\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u00d3\u00c6b\u0095\u0015\rC\u0092\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun.msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xp\u0000\u00cdx\u0085pp\u0000sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0091Ue\u00f1\u0017p\u00f3\u00ad\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp\u009f\u008d\u000fi<\u00c1_\u00b7\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0000\u00cdxzppsq\u0000~\u0000\u0007\u0000\u00b8\u00ecjppsq\u0000~\u0000\u0007\u0000\u00a4`Zppsq\u0000~\u0000\u0007\u0000\u008f\u00d4Jppsq\u0000~\u0000\u0007\u0000{H:ppsq\u0000~\u0000\u0007\u0000f\u00bc*ppsq\u0000~\u0000\u0007\u0000R0\u001appsq\u0000~\u0000\u0007\u0000=\u00a4\u0015ppsq\u0000~\u0000\u0007\u0000)\u0018\u0005ppsq\u0000~\u0000\u0000\u0000\u0014\u008c\u0000pp\u0000sq\u0000~\u0000\u0000\u0000\u0014\u008b\u00f5pp\u0000sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u00c6|\u00ec3\u0087\u00b8\u00f9\u00f4\u0002\u0000\u0000xq\u0000~\u0000\b\u0000\u0014\u008b\u00eappsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u00cc;^\u00bb\u0004E\u00cc\u00db\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\'\u00bbhe^\u001f_5\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004\u0000\u0014\u008b\u00dfsr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.grammar.AttributeExp0\rR\n\u00c7L\n\u0099\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004\u0000\u0014\u008b\u00dcq\u0000~\u0000\u001apsr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u00cb\u00b2\u00f3\u00c9\u0081\u0000\u000f\u00bc\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\bsq\u0000~\u0000\u0019\u0001psr\u0000 com.sun.msv.grammar.AnyNameClass\u00c3p\u00af\u0013\u00eft\u0094\u00bd\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u009c}\u00d4kB\u00c7\tk\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0098v\u00e3\u0003Z\u00fex\u00ee\u0002\u0000\u0000xq\u0000~\u0000\u0004\u0000\u0000\u0000\tq\u0000~\u0000\u001fpsr\u0000#com.sun.msv.grammar.SimpleNameClass\u0091\u00e9\u00f7\u008d\u00ab\u0010\u00aa\u00f5\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000&xq\u0000~\u0000!t\u0000\u001fcom.cs.sg.spear.jaxb.MODULETypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000%t\u0000\u0006MODULEt\u0000\u0000sq\u0000~\u0000\u0000\u0000\u0014\u008c\u0000pp\u0000sq\u0000~\u0000\u0000\u0000\u0014\u008b\u00f5pp\u0000sq\u0000~\u0000\u0014\u0000\u0014\u008b\u00eappsq\u0000~\u0000\u0016\u0000\u0014\u008b\u00dfq\u0000~\u0000\u001apsq\u0000~\u0000\u001b\u0000\u0014\u008b\u00dcq\u0000~\u0000\u001apq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u0000&sparrow.elt.jaxb.DATAEXTRACTORTypeq\u0000~\u0000)sq\u0000~\u0000%t\u0000\u000eDATA-EXTRACTORq\u0000~\u0000,sq\u0000~\u0000\u0014\u0000\u0014\u008c\u000bppsq\u0000~\u0000\u0000\u0000\u0014\u008c\u0000q\u0000~\u0000\u001ap\u0000sq\u0000~\u0000\u0000\u0000\u0014\u008b\u00f5pp\u0000sq\u0000~\u0000\u0014\u0000\u0014\u008b\u00eappsq\u0000~\u0000\u0016\u0000\u0014\u008b\u00dfq\u0000~\u0000\u001apsq\u0000~\u0000\u001b\u0000\u0014\u008b\u00dcq\u0000~\u0000\u001apq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u0000(sparrow.elt.jaxb.DATATRANSFORMERTypeq\u0000~\u0000)sq\u0000~\u0000%t\u0000\u0010DATA-TRANSFORMERq\u0000~\u0000,q\u0000~\u0000$sq\u0000~\u0000\u0000\u0000\u0014\u008c\u0000pp\u0000sq\u0000~\u0000\u0000\u0000\u0014\u008b\u00f5pp\u0000sq\u0000~\u0000\u0014\u0000\u0014\u008b\u00eappsq\u0000~\u0000\u0016\u0000\u0014\u008b\u00dfq\u0000~\u0000\u001apsq\u0000~\u0000\u001b\u0000\u0014\u008b\u00dcq\u0000~\u0000\u001apq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u0000$sparrow.elt.jaxb.DATAWRITERSTypeq\u0000~\u0000)sq\u0000~\u0000%t\u0000\fDATA-WRITERSq\u0000~\u0000,sq\u0000~\u0000\u0014\u0000\u0014\u008c\u000bppsq\u0000~\u0000\u0000\u0000\u0014\u008c\u0000q\u0000~\u0000\u001ap\u0000sq\u0000~\u0000\u0000\u0000\u0014\u008b\u00f5pp\u0000sq\u0000~\u0000\u0014\u0000\u0014\u008b\u00eappsq\u0000~\u0000\u0016\u0000\u0014\u008b\u00dfq\u0000~\u0000\u001apsq\u0000~\u0000\u001b\u0000\u0014\u008b\u00dcq\u0000~\u0000\u001apq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u0000\"sparrow.elt.jaxb.RESOURCESTypeq\u0000~\u0000)sq\u0000~\u0000%t\u0000\tRESOURCESq\u0000~\u0000,q\u0000~\u0000$sq\u0000~\u0000\u0014\u0000\u0014\u008c\u000bppsq\u0000~\u0000\u0000\u0000\u0014\u008c\u0000q\u0000~\u0000\u001ap\u0000sq\u0000~\u0000\u0000\u0000\u0014\u008b\u00f5pp\u0000sq\u0000~\u0000\u0014\u0000\u0014\u008b\u00eappsq\u0000~\u0000\u0016\u0000\u0014\u008b\u00dfq\u0000~\u0000\u001apsq\u0000~\u0000\u001b\u0000\u0014\u008b\u00dcq\u0000~\u0000\u001apq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u0000!sparrow.elt.jaxb.SERVICESTypeq\u0000~\u0000)sq\u0000~\u0000%t\u0000\bSERVICESq\u0000~\u0000,q\u0000~\u0000$sq\u0000~\u0000\u0014\u0000\u0014\u008c\u000bppsq\u0000~\u0000\u0000\u0000\u0014\u008c\u0000q\u0000~\u0000\u001ap\u0000sq\u0000~\u0000\u0000\u0000\u0014\u008b\u00f5pp\u0000sq\u0000~\u0000\u0014\u0000\u0014\u008b\u00eappsq\u0000~\u0000\u0016\u0000\u0014\u008b\u00dfq\u0000~\u0000\u001apsq\u0000~\u0000\u001b\u0000\u0014\u008b\u00dcq\u0000~\u0000\u001apq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u0000&sparrow.elt.jaxb.DATAPROVIDERSTypeq\u0000~\u0000)sq\u0000~\u0000%t\u0000\u000eDATA-PROVIDERSq\u0000~\u0000,q\u0000~\u0000$sq\u0000~\u0000\u0014\u0000\u0014\u008c\u000bppsq\u0000~\u0000\u0000\u0000\u0014\u008c\u0000q\u0000~\u0000\u001ap\u0000sq\u0000~\u0000\u0000\u0000\u0014\u008b\u00f5pp\u0000sq\u0000~\u0000\u0014\u0000\u0014\u008b\u00eappsq\u0000~\u0000\u0016\u0000\u0014\u008b\u00dfq\u0000~\u0000\u001apsq\u0000~\u0000\u001b\u0000\u0014\u008b\u00dcq\u0000~\u0000\u001apq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u0000#com.cs.sg.spear.jaxb.DATALOOKUPTypeq\u0000~\u0000)sq\u0000~\u0000%t\u0000\u000bDATA-LOOKUPq\u0000~\u0000,q\u0000~\u0000$sq\u0000~\u0000\u0014\u0000\u0014\u008c\u000bppsq\u0000~\u0000\u0000\u0000\u0014\u008c\u0000q\u0000~\u0000\u001ap\u0000sq\u0000~\u0000\u0000\u0000\u0014\u008b\u00f5pp\u0000sq\u0000~\u0000\u0014\u0000\u0014\u008b\u00eappsq\u0000~\u0000\u0016\u0000\u0014\u008b\u00dfq\u0000~\u0000\u001apsq\u0000~\u0000\u001b\u0000\u0014\u008b\u00dcq\u0000~\u0000\u001apq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u0000)sparrow.elt.jaxb.EXCEPTIONHANDLERTypeq\u0000~\u0000)sq\u0000~\u0000%t\u0000\u0011EXCEPTION-HANDLERq\u0000~\u0000,q\u0000~\u0000$sq\u0000~\u0000\u0014\u0000\u0014\u008c\u000bppsq\u0000~\u0000\u0000\u0000\u0014\u008c\u0000q\u0000~\u0000\u001ap\u0000sq\u0000~\u0000\u0000\u0000\u0014\u008b\u00f5pp\u0000sq\u0000~\u0000\u0014\u0000\u0014\u008b\u00eappsq\u0000~\u0000\u0016\u0000\u0014\u008b\u00dfq\u0000~\u0000\u001apsq\u0000~\u0000\u001b\u0000\u0014\u008b\u00dcq\u0000~\u0000\u001apq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u0000\"sparrow.elt.jaxb.NOTIFIERSTypeq\u0000~\u0000)sq\u0000~\u0000%t\u0000\tNOTIFIERSq\u0000~\u0000,q\u0000~\u0000$sq\u0000~\u0000%t\u0000\fSPEAR-CONFIGq\u0000~\u0000,sr\u0000\"com.sun.msv.grammar.ExpressionPool\u00e5\u00f3J;\u00cd]^\u00f8\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000\u0088[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000$\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfpppppq\u0000~\u0000\npppppppppppppppq\u0000~\u00006q\u0000~\u0000Iq\u0000~\u0000Sq\u0000~\u0000]q\u0000~\u0000\u0011q\u0000~\u0000gq\u0000~\u0000qq\u0000~\u0000{ppq\u0000~\u0000\tpppppppppppppppppppq\u0000~\u0000\u0010ppppppppppppppq\u0000~\u0000\u000fpppppppppppppppppppppppppq\u0000~\u0000\u000epppppppppppppppppppppppppq\u0000~\u0000\rpppppppppppppppppppppppppq\u0000~\u0000\fpppppppppppppppppppppppq\u0000~\u0000\u0018q\u0000~\u00000q\u0000~\u0000:q\u0000~\u0000Cq\u0000~\u0000Mq\u0000~\u0000Wq\u0000~\u0000aq\u0000~\u0000kq\u0000~\u0000\u000bq\u0000~\u0000uq\u0000~\u0000\u007fq\u0000~\u0000\u0015q\u0000~\u0000/q\u0000~\u00009q\u0000~\u0000Bq\u0000~\u0000Lq\u0000~\u0000Vq\u0000~\u0000`q\u0000~\u0000jq\u0000~\u0000tq\u0000~\u0000~pp");

    public String ____jaxb_ri____getNamespaceURI() {
        return "";
    }

    public String ____jaxb_ri____getLocalName() {
        return "SPEAR-CONFIG";
    }

    public com.sun.xml.bind.unmarshaller.ContentHandlerEx getUnmarshaller(com.sun.xml.bind.unmarshaller.UnmarshallingContext context) {
        return new sparrow.elt.jaxb.impl.SPEARCONFIGImpl.Unmarshaller(context);
    }

    public Class getPrimaryInterfaceClass() {
        return PRIMARY_INTERFACE_CLASS;
    }

    public void serializeElements(com.sun.xml.bind.serializer.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("", "SPEAR-CONFIG");
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeElements(context);
        context.endElement();
    }

    public void serializeAttributes(com.sun.xml.bind.serializer.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeAttributeBodies(com.sun.xml.bind.serializer.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public Class getPrimaryInterface() {
        return (sparrow.elt.jaxb.SPEARCONFIG.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.xml.bind.unmarshaller.ContentHandlerEx
    {


        public Unmarshaller(com.sun.xml.bind.unmarshaller.UnmarshallingContext context) {
            super(context, "----");
        }

        protected com.sun.xml.bind.unmarshaller.UnmarshallableObject owner() {
            return sparrow.elt.jaxb.impl.SPEARCONFIGImpl.this;
        }

        public void enterElement(String ___uri, String ___local, org.xml.sax.Attributes __atts)
            throws com.sun.xml.bind.unmarshaller.UnreportedException
        {
            switch (state) {
                case  3 :
                    revertToParentFromEnterElement(___uri, ___local, __atts);
                    return ;
                case  0 :
                    if ("".equals(___uri)&&"SPEAR-CONFIG".equals(___local)) {
                        context.pushAttributes(__atts);
                        state = 1;
                        return ;
                    }
                    break;
                case  1 :
                    if ("".equals(___uri)&&"MODULE".equals(___local)) {
                        spawnSuperClassFromEnterElement((new sparrow.elt.jaxb.impl.SPEARCONFIGTypeImpl.Unmarshaller(context)), 2, ___uri, ___local, __atts);
                        return ;
                    }
                    break;
            }
            super.enterElement(___uri, ___local, __atts);
        }

        public void leaveElement(String ___uri, String ___local)
            throws com.sun.xml.bind.unmarshaller.UnreportedException
        {
            switch (state) {
                case  3 :
                    revertToParentFromLeaveElement(___uri, ___local);
                    return ;
                case  2 :
                    if ("".equals(___uri)&&"SPEAR-CONFIG".equals(___local)) {
                        context.popAttributes();
                        state = 3;
                        return ;
                    }
                    break;
            }
            super.leaveElement(___uri, ___local);
        }

        public void enterAttribute(String ___uri, String ___local)
            throws com.sun.xml.bind.unmarshaller.UnreportedException
        {
            switch (state) {
                case  3 :
                    revertToParentFromEnterAttribute(___uri, ___local);
                    return ;
            }
            super.enterAttribute(___uri, ___local);
        }

        public void leaveAttribute(String ___uri, String ___local)
            throws com.sun.xml.bind.unmarshaller.UnreportedException
        {
            switch (state) {
                case  3 :
                    revertToParentFromLeaveAttribute(___uri, ___local);
                    return ;
            }
            super.leaveAttribute(___uri, ___local);
        }

        public void text(String value)
            throws com.sun.xml.bind.unmarshaller.UnreportedException
        {
            try {
                switch (state) {
                    case  3 :
                        revertToParentFromText(value);
                        return ;
                }
            } catch (RuntimeException e) {
                handleUnexpectedTextException(value, e);
            }
        }

        public void leaveChild(int nextState)
            throws com.sun.xml.bind.unmarshaller.UnreportedException
        {
            switch (nextState) {
                case  2 :
                    state = 2;
                    return ;
            }
            super.leaveChild(nextState);
        }

    }

}
