/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.platform.android;

import ax.Gb.g;
import ax.Gb.l;
import ax.Ob.d;
import ax.Ob.h;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;

public class AndroidSocketAdapter
implements SocketAdapter {
    public static final Companion Companion;
    private static final DeferredSocketAdapter.Factory playProviderFactory;
    private final Method getAlpnSelectedProtocol;
    private final Method setAlpnProtocols;
    private final Method setHostname;
    private final Method setUseSessionTickets;
    private final Class<? super SSLSocket> sslSocketClass;

    static {
        Companion companion;
        Companion = companion = new Companion(null);
        playProviderFactory = companion.factory("com.google.android.gms.org.conscrypt");
    }

    public AndroidSocketAdapter(Class<? super SSLSocket> clazz) {
        l.f(clazz, "sslSocketClass");
        this.sslSocketClass = clazz;
        Method method = clazz.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        l.e(method, "sslSocketClass.getDeclar\u2026:class.javaPrimitiveType)");
        this.setUseSessionTickets = method;
        this.setHostname = clazz.getMethod("setHostname", String.class);
        this.getAlpnSelectedProtocol = clazz.getMethod("getAlpnSelectedProtocol", null);
        this.setAlpnProtocols = clazz.getMethod("setAlpnProtocols", byte[].class);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void configureTlsExtensions(SSLSocket sSLSocket, String string, List<? extends Protocol> list) {
        l.f(sSLSocket, "sslSocket");
        l.f(list, "protocols");
        if (!this.matchesSocket(sSLSocket)) return;
        try {
            this.setUseSessionTickets.invoke(sSLSocket, Boolean.TRUE);
            if (string != null) {
                this.setHostname.invoke(sSLSocket, string);
            }
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new AssertionError((Object)invocationTargetException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError((Object)illegalAccessException);
        }
        this.setAlpnProtocols.invoke(sSLSocket, new Object[]{Platform.Companion.concatLengthPrefixed(list)});
    }

    @Override
    public String getSelectedProtocol(SSLSocket object) {
        IllegalAccessException illegalAccessException2;
        block8: {
            InvocationTargetException invocationTargetException2;
            block7: {
                block6: {
                    l.f(object, "sslSocket");
                    if (!this.matchesSocket((SSLSocket)object)) {
                        return null;
                    }
                    object = (byte[])this.getAlpnSelectedProtocol.invoke(object, null);
                    if (object == null) break block6;
                    try {
                        object = new String((byte[])object, d.b);
                        return object;
                    }
                    catch (InvocationTargetException invocationTargetException2) {
                        break block7;
                    }
                    catch (IllegalAccessException illegalAccessException2) {
                        break block8;
                    }
                }
                return null;
            }
            object = invocationTargetException2.getCause();
            if (object instanceof NullPointerException && l.a(((Throwable)((NullPointerException)object)).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError((Object)invocationTargetException2);
        }
        throw new AssertionError((Object)illegalAccessException2);
    }

    @Override
    public boolean isSupported() {
        return AndroidPlatform.Companion.isSupported();
    }

    @Override
    public boolean matchesSocket(SSLSocket sSLSocket) {
        l.f(sSLSocket, "sslSocket");
        return this.sslSocketClass.isInstance(sSLSocket);
    }

    @Override
    public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.matchesSocketFactory(this, sSLSocketFactory);
    }

    @Override
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.trustManager(this, sSLSocketFactory);
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public static final /* synthetic */ AndroidSocketAdapter access$build(Companion companion, Class clazz) {
            return companion.build(clazz);
        }

        private final AndroidSocketAdapter build(Class<? super SSLSocket> clazz) {
            Serializable serializable = clazz;
            while (serializable != null && !l.a(((Class)serializable).getSimpleName(), "OpenSSLSocketImpl")) {
                if ((serializable = ((Class)serializable).getSuperclass()) != null) continue;
                serializable = new StringBuilder();
                ((StringBuilder)serializable).append("No OpenSSLSocketImpl superclass of socket of type ");
                ((StringBuilder)serializable).append(clazz);
                throw new AssertionError((Object)((StringBuilder)serializable).toString());
            }
            l.c(serializable);
            return new AndroidSocketAdapter((Class<? super SSLSocket>)serializable);
        }

        public final DeferredSocketAdapter.Factory factory(String string) {
            l.f(string, "packageName");
            return new DeferredSocketAdapter.Factory(string){
                final String $packageName;
                {
                    this.$packageName = string;
                }

                public SocketAdapter create(SSLSocket sSLSocket) {
                    l.f(sSLSocket, "sslSocket");
                    return okhttp3.internal.platform.android.AndroidSocketAdapter$Companion.access$build(AndroidSocketAdapter.Companion, sSLSocket.getClass());
                }

                public boolean matchesSocket(SSLSocket object) {
                    l.f(object, "sslSocket");
                    String string = object.getClass().getName();
                    l.e(string, "sslSocket.javaClass.name");
                    object = new StringBuilder();
                    ((StringBuilder)object).append(this.$packageName);
                    ((StringBuilder)object).append('.');
                    return h.H(string, ((StringBuilder)object).toString(), false, 2, null);
                }
            };
        }

        public final DeferredSocketAdapter.Factory getPlayProviderFactory() {
            return playProviderFactory;
        }
    }
}

