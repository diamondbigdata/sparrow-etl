//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vBeta
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2008.02.27 at 12:11:07 SGT
//

package sparrow.elt.jaxb.impl;

public class QUERYTypeImpl
    implements sparrow.elt.jaxb.QUERYType,
    com.sun.xml.bind.unmarshaller.UnmarshallableObject,
    com.sun.xml.bind.serializer.XMLSerializable,
    com.sun.xml.bind.validator.ValidatableObject {

  private final static Class PRIMARY_INTERFACE_CLASS = sparrow.elt.jaxb.
      QUERYType.class;
  protected boolean has_FETCHSIZE;
  protected int _FETCHSIZE;
  protected String _RESULTWRAP;
  protected String _DBSOURCE;
  private final static com.sun.msv.grammar.Grammar schemaFragment = com.sun.xml.
      bind.validator.SchemaDeserializer.deserialize("\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0091Ue\u00f1\u0017p\u00f3\u00ad\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp\u009f\u008d\u000fi<\u00c1_\u00b7\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/grammar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\u0003\u00df\u00ef\u0000ppsq\u0000~\u0000\u0000\u0002,e\u008eppsr\u0000 com.sun.msv.grammar.AttributeExp0\rR\n\u00c7L\n\u0099\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xq\u0000~\u0000\u0003\u00009(\u00a8ppsr\u0000\u001bcom.sun.msv.grammar.DataExp8\u00f5\u00f5>{j!\u00cb\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003\u0000\u000bw\nppsr\u0000#com.sun.msv.datatype.xsd.StringType\u00c0\t\u00a9y\u00f6\u0011\u009b\u00e6\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0002\u00ff10\u00a8bR\u00ca\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType7\u00adsa|\u00d7Z\u001d\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl4\u00e9\u0099H.\u00872z\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012Ljava/lang/String;L\u0000\btypeNameq\u0000~\u0000\u0012L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0006stringsr\u0000.com.sun.msv.datatype.xsd.WhiteSpaceProcessor$1\u0013JMoI\u00db\u00a4G\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessorip\u00ff0C\u00ce\u000eN\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetExpression s\u0080\u0089\u0096\u00cf\u009a@\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\nsr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0012L\u0000\fnamespaceURIq\u0000~\u0000\u0012xpq\u0000~\u0000\u0016q\u0000~\u0000\u0015sr\u0000#com.sun.msv.grammar.SimpleNameClass\u0091\u00e9\u00f7\u008d\u00ab\u0010\u00aa\u00f5\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0012L\u0000\fnamespaceURIq\u0000~\u0000\u0012xr\u0000\u001dcom.sun.msv.grammar.NameClass\u009c}\u00d4kB\u00c7\tk\u0002\u0000\u0000xpt\u0000\tDB-SOURCEt\u0000\u0000sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u00c6|\u00ec3\u0087\u00b8\u00f9\u00f4\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0001\u00f3<\u00e1ppsq\u0000~\u0000\u0007\u0001\u00f3<\u00d6q\u0000~\u0000\u001dpq\u0000~\u0000\rsq\u0000~\u0000 t\u0000\u000bRESULT-WRAPq\u0000~\u0000$sr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0098v\u00e3\u0003Z\u00fex\u00ee\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tsq\u0000~\u0000\u001c\u0001psq\u0000~\u0000%\u0001\u00b3\u0089mppsq\u0000~\u0000\u0007\u0001\u00b3\u0089bq\u0000~\u0000\u001dpsq\u0000~\u0000\n\u0000H\u00ed\u00c5ppsr\u0000 com.sun.msv.datatype.xsd.IntType\u00bel\u00b6\u0018\u00b0\u0014\u00e4\u0014\u0002\u0000\u0000xr\u0000+com.sun.msv.datatype.xsd.IntegerDerivedType\u0099\u00f1]\u0090&6k\u00be\u0002\u0000\u0000xq\u0000~\u0000\u000fq\u0000~\u0000\u0015t\u0000\u0003intsr\u0000.com.sun.msv.datatype.xsd.WhiteSpaceProcessor$2\u0087z9\u00ee\u00f8,N\u0005\u0002\u0000\u0000xq\u0000~\u0000\u0018q\u0000~\u0000\u001bsq\u0000~\u0000\u001eq\u0000~\u00003q\u0000~\u0000\u0015sq\u0000~\u0000 t\u0000\nFETCH-SIZEq\u0000~\u0000$q\u0000~\u0000+sr\u0000\"com.sun.msv.grammar.ExpressionPool\u00e5\u00f3J;\u00cd]^\u00f8\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000:[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\u0004\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfpppppppppppppq\u0000~\u0000\u0006ppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppq\u0000~\u0000-pppppppppppppppppq\u0000~\u0000\u0005ppq\u0000~\u0000&ppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"

      );
  public int getFETCHSIZE() {
    if (!has_FETCHSIZE) {
      return com.sun.msv.datatype.xsd.IntType.load(com.sun.xml.bind.
          WhiteSpaceProcessor.collapse("0")).intValue();
    }
    else {
      return _FETCHSIZE;
    }
  }

  public void setFETCHSIZE(int value) {
    _FETCHSIZE = value;
    has_FETCHSIZE = true;
  }

  public String getRESULTWRAP() {
    if (_RESULTWRAP == null) {
      return "disconnected";
    }
    else {
      return _RESULTWRAP;
    }
  }

  public void setRESULTWRAP(String value) {
    _RESULTWRAP = value;
  }

  public String getDBSOURCE() {
    return _DBSOURCE;
  }

  public void setDBSOURCE(String value) {
    _DBSOURCE = value;
  }

  public com.sun.xml.bind.unmarshaller.ContentHandlerEx getUnmarshaller(com.sun.
      xml.bind.unmarshaller.UnmarshallingContext context) {
    return new sparrow.elt.jaxb.impl.QUERYTypeImpl.Unmarshaller(context);
  }

  public Class getPrimaryInterfaceClass() {
    return PRIMARY_INTERFACE_CLASS;
  }

  public void serializeElements(com.sun.xml.bind.serializer.XMLSerializer
                                context) throws org.xml.sax.SAXException {
  }

  public void serializeAttributes(com.sun.xml.bind.serializer.XMLSerializer
                                  context) throws org.xml.sax.SAXException {
    context.startAttribute("", "DB-SOURCE");
    context.text( ( (String) _DBSOURCE));
    context.endAttribute();
    if (_RESULTWRAP != null) {
      context.startAttribute("", "RESULT-WRAP");
      context.text( ( (String) _RESULTWRAP));
      context.endAttribute();
    }
    if (has_FETCHSIZE) {
      context.startAttribute("", "FETCH-SIZE");
      context.text(com.sun.msv.datatype.xsd.IntType.save( ( (Integer)new java.
          lang.Integer(_FETCHSIZE))));
      context.endAttribute();
    }
  }

  public void serializeAttributeBodies(com.sun.xml.bind.serializer.
                                       XMLSerializer context) throws org.xml.
      sax.SAXException {
  }

  public Class getPrimaryInterface() {
    return (sparrow.elt.jaxb.QUERYType.class);
  }

  public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
    return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
  }

  public class Unmarshaller
      extends com.sun.xml.bind.unmarshaller.ContentHandlerEx {

    public Unmarshaller(com.sun.xml.bind.unmarshaller.UnmarshallingContext
                        context) {
      super(context, "-------");
    }

    protected com.sun.xml.bind.unmarshaller.UnmarshallableObject owner() {
      return sparrow.elt.jaxb.impl.QUERYTypeImpl.this;
    }

    public void enterElement(String ___uri, String ___local,
                             org.xml.sax.Attributes __atts) throws com.sun.xml.
        bind.unmarshaller.UnreportedException {
      switch (state) {
        case 0:
          revertToParentFromEnterElement(___uri, ___local, __atts);
          return;
      }
      super.enterElement(___uri, ___local, __atts);
    }

    public void leaveElement(String ___uri, String ___local) throws com.sun.xml.
        bind.unmarshaller.UnreportedException {
      switch (state) {
        case 0:
          revertToParentFromLeaveElement(___uri, ___local);
          return;
      }
      super.leaveElement(___uri, ___local);
    }

    public void enterAttribute(String ___uri, String ___local) throws com.sun.
        xml.bind.unmarshaller.UnreportedException {
      switch (state) {
        case 0:
          if ("".equals(___uri) && "DB-SOURCE".equals(___local)) {
            state = 3;
            return;
          }
          if ("".equals(___uri) && "FETCH-SIZE".equals(___local)) {
            state = 1;
            return;
          }
          if ("".equals(___uri) && "RESULT-WRAP".equals(___local)) {
            state = 5;
            return;
          }
          revertToParentFromEnterAttribute(___uri, ___local);
          return;
      }
      super.enterAttribute(___uri, ___local);
    }

    public void leaveAttribute(String ___uri, String ___local) throws com.sun.
        xml.bind.unmarshaller.UnreportedException {
      switch (state) {
        case 6:
          if ("".equals(___uri) && "RESULT-WRAP".equals(___local)) {
            goto0();
            return;
          }
          break;
        case 4:
          if ("".equals(___uri) && "DB-SOURCE".equals(___local)) {
            goto0();
            return;
          }
          break;
        case 2:
          if ("".equals(___uri) && "FETCH-SIZE".equals(___local)) {
            goto0();
            return;
          }
          break;
        case 0:
          revertToParentFromLeaveAttribute(___uri, ___local);
          return;
      }
      super.leaveAttribute(___uri, ___local);
    }

    public void text(String value) throws com.sun.xml.bind.unmarshaller.
        UnreportedException {
      try {
        switch (state) {
          case 5:
            _RESULTWRAP = value;
            state = 6;
            return;
          case 1:
            _FETCHSIZE = com.sun.msv.datatype.xsd.IntType.load(com.sun.xml.bind.
                WhiteSpaceProcessor.collapse(value)).intValue();
            has_FETCHSIZE = true;
            state = 2;
            return;
          case 3:
            _DBSOURCE = value;
            state = 4;
            return;
          case 0:
            revertToParentFromText(value);
            return;
        }
      }
      catch (RuntimeException e) {
        handleUnexpectedTextException(value, e);
      }
    }

    private void goto0() throws com.sun.xml.bind.unmarshaller.
        UnreportedException {
      int idx;
      state = 0;
      idx = context.getAttribute("", "DB-SOURCE");
      if (idx >= 0) {
        context.consumeAttribute(idx);
        return;
      }
      idx = context.getAttribute("", "RESULT-WRAP");
      if (idx >= 0) {
        context.consumeAttribute(idx);
        return;
      }
      idx = context.getAttribute("", "FETCH-SIZE");
      if (idx >= 0) {
        context.consumeAttribute(idx);
        return;
      }
    }

  }

}
