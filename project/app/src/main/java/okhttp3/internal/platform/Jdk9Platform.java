/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.platform;

import ax.Gb.g;
import ax.Gb.l;
import ax.Ob.h;
import ax.vc.b;
import ax.vc.c;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.Platform;

public class Jdk9Platform
extends Platform {
    public static final Companion Companion;
    private static final boolean isAvailable;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        boolean bl;
        block2: {
            block4: {
                block3: {
                    Companion = new Companion(null);
                    Object object = System.getProperty("java.specification.version");
                    object = object != null ? h.m((String)object) : null;
                    bl = false;
                    if (object == null) break block3;
                    if ((Integer)object < 9) break block2;
                    break block4;
                }
                try {
                    SSLSocket.class.getMethod("getApplicationProtocol", null);
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    break block2;
                }
            }
            bl = true;
        }
        isAvailable = bl;
    }

    @Override
    @SuppressSignatureCheck
    public void configureTlsExtensions(SSLSocket sSLSocket, String object, List<Protocol> list) {
        l.f(sSLSocket, "sslSocket");
        l.f(list, "protocols");
        object = sSLSocket.getSSLParameters();
        b.a((SSLParameters)object, ((Collection)Platform.Companion.alpnProtocolNames(list)).toArray(new String[0]));
        sSLSocket.setSSLParameters((SSLParameters)object);
    }

    @Override
    @SuppressSignatureCheck
    public String getSelectedProtocol(SSLSocket object) {
        boolean bl;
        block5: {
            block4: {
                l.f(object, "sslSocket");
                try {
                    object = c.a((SSLSocket)object);
                    if (object != null) break block4;
                    bl = true;
                    break block5;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    return null;
                }
            }
            bl = l.a(object, "");
        }
        if (bl) {
            return null;
        }
        return object;
    }

    @Override
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        l.f(sSLSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public final Jdk9Platform buildIfSupported() {
            if (this.isAvailable()) {
                return new Jdk9Platform();
            }
            return null;
        }

        public final boolean isAvailable() {
            return isAvailable;
        }
    }
}

