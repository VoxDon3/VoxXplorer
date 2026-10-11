package ax.Vc;

import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
public class f {
    public static boolean a(SSLSocket sSLSocket) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (sSLParameters == null) {
            return false;
        }
        sSLParameters.setEndpointIdentificationAlgorithm("HTTPS");
        sSLSocket.setSSLParameters(sSLParameters);
        return true;
    }
}
