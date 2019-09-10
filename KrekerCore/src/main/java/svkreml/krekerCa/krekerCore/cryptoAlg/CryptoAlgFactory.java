package svkreml.krekerCa.krekerCore.cryptoAlg;


import svkreml.krekerCa.krekerCore.cryptoAlg.impl.CryptoAlgGost2001;
import svkreml.krekerCa.krekerCore.cryptoAlg.impl.CryptoAlgGost2012_256;
import svkreml.krekerCa.krekerCore.cryptoAlg.impl.CryptoRSA;

public class CryptoAlgFactory {
    public static CryptoAlg getInstance(String alg) {
        switch (alg) {
            case "ECGOST3410":
            case "1.2.643.2.2.3":
                return CryptoAlgGost2001.getCryptoAlg();
            case "ECGOST3410-2012":
            case "1.2.643.7.1.1.3.2":
                return CryptoAlgGost2012_256.getCryptoAlg();
            case "RSA":
            case "???"://fixme rsa =2012_512
                return CryptoRSA.getCryptoAlg(2048);
            default:
                System.out.println(alg);
                return null;
        }

    }
}
