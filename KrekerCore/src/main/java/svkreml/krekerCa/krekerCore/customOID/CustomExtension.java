package svkreml.krekerCa.krekerCore.customOID;

import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.Extension;

/*
Средства электронной подписи и УЦ издателя
issuerSignTool
	1.2.643.100.112

Средства электронной подписи владельца
subjectSignTool
	1.2.643.100.111
* */
public class CustomExtension extends Extension {

    public static final ASN1ObjectIdentifier issuerSignTool = new ASN1ObjectIdentifier("1.2.643.100.112").intern();
    public static final ASN1ObjectIdentifier subjectSignTool = new ASN1ObjectIdentifier("1.2.643.100.111").intern();
    public CustomExtension(ASN1ObjectIdentifier asn1ObjectIdentifier, ASN1Boolean asn1Boolean, ASN1OctetString asn1OctetString) {
        super(asn1ObjectIdentifier, asn1Boolean, asn1OctetString);
    }

    public CustomExtension(ASN1ObjectIdentifier asn1ObjectIdentifier, boolean b, byte[] bytes) {
        super(asn1ObjectIdentifier, b, bytes);
    }

    public CustomExtension(ASN1ObjectIdentifier asn1ObjectIdentifier, boolean b, ASN1OctetString asn1OctetString) {
        super(asn1ObjectIdentifier, b, asn1OctetString);
    }
}
