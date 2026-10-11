/*
 * Decompiled with CFR 0.152.
 */
package ax.Vc;

import ax.Vc.e;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

public class f {
    public static boolean a(SSLSocket sSLSocket) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (sSLParameters != null) {
            e.a(sSLParameters, "HTTPS");
            sSLSocket.setSSLParameters(sSLParameters);
            return true;
        }
        return false;
    }
}

