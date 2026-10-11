/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.platform.android;

import ax.Gb.l;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;

public interface SocketAdapter {
    public void configureTlsExtensions(SSLSocket var1, String var2, List<? extends Protocol> var3);

    public String getSelectedProtocol(SSLSocket var1);

    public boolean isSupported();

    public boolean matchesSocket(SSLSocket var1);

    public boolean matchesSocketFactory(SSLSocketFactory var1);

    public X509TrustManager trustManager(SSLSocketFactory var1);

    public static final class DefaultImpls {
        public static boolean matchesSocketFactory(SocketAdapter socketAdapter, SSLSocketFactory sSLSocketFactory) {
            l.f(sSLSocketFactory, "sslSocketFactory");
            return false;
        }

        public static X509TrustManager trustManager(SocketAdapter socketAdapter, SSLSocketFactory sSLSocketFactory) {
            l.f(sSLSocketFactory, "sslSocketFactory");
            return null;
        }
    }
}

