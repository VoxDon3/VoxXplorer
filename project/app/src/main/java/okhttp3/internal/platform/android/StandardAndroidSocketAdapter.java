/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.platform.android;

import ax.Gb.g;
import ax.Gb.l;
import java.io.Serializable;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;

public final class StandardAndroidSocketAdapter
extends AndroidSocketAdapter {
    public static final Companion Companion = new Companion(null);
    private final Class<?> paramClass;
    private final Class<? super SSLSocketFactory> sslSocketFactoryClass;

    public StandardAndroidSocketAdapter(Class<? super SSLSocket> clazz, Class<? super SSLSocketFactory> clazz2, Class<?> clazz3) {
        l.f(clazz, "sslSocketClass");
        l.f(clazz2, "sslSocketFactoryClass");
        l.f(clazz3, "paramClass");
        super(clazz);
        this.sslSocketFactoryClass = clazz2;
        this.paramClass = clazz3;
    }

    @Override
    public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        l.f(sSLSocketFactory, "sslSocketFactory");
        return this.sslSocketFactoryClass.isInstance(sSLSocketFactory);
    }

    @Override
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        l.f(sSLSocketFactory, "sslSocketFactory");
        sSLSocketFactory = Util.readFieldOrNull(sSLSocketFactory, this.paramClass, "sslParameters");
        l.c(sSLSocketFactory);
        X509TrustManager x509TrustManager = Util.readFieldOrNull(sSLSocketFactory, X509TrustManager.class, "x509TrustManager");
        if (x509TrustManager == null) {
            return Util.readFieldOrNull(sSLSocketFactory, X509TrustManager.class, "trustManager");
        }
        return x509TrustManager;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public static /* synthetic */ SocketAdapter buildIfSupported$default(Companion companion, String string, int n8, Object object) {
            if ((n8 & 1) != 0) {
                string = "com.android.org.conscrypt";
            }
            return companion.buildIfSupported(string);
        }

        public final SocketAdapter buildIfSupported(String object) {
            l.f(object, "packageName");
            try {
                Serializable serializable = new StringBuilder();
                serializable.append((String)object);
                serializable.append(".OpenSSLSocketImpl");
                serializable = Class.forName(serializable.toString());
                l.d(serializable, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Serializable serializable2 = new StringBuilder();
                serializable2.append((String)object);
                serializable2.append(".OpenSSLSocketFactoryImpl");
                serializable2 = Class.forName(serializable2.toString());
                l.d(serializable2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)object);
                stringBuilder.append(".SSLParametersImpl");
                object = Class.forName(stringBuilder.toString());
                l.e(object, "paramsClass");
                object = new StandardAndroidSocketAdapter((Class<? super SSLSocket>)serializable, (Class<? super SSLSocketFactory>)serializable2, (Class<?>)object);
                return object;
            }
            catch (Exception exception) {
                Platform.Companion.get().log("unable to load android socket classes", 5, exception);
                return null;
            }
        }
    }
}

