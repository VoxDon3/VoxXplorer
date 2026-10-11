/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.platform;

import ax.Gb.g;
import ax.Gb.l;
import ax.tb.o;
import ax.xc.e;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Android10Platform;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.BouncyCastlePlatform;
import okhttp3.internal.platform.ConscryptPlatform;
import okhttp3.internal.platform.Jdk8WithJettyBootPlatform;
import okhttp3.internal.platform.Jdk9Platform;
import okhttp3.internal.platform.OpenJSSEPlatform;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

public class Platform {
    public static final Companion Companion;
    public static final int INFO = 4;
    public static final int WARN = 5;
    private static final Logger logger;
    private static volatile Platform platform;

    static {
        Companion companion;
        Companion = companion = new Companion(null);
        platform = companion.findPlatform();
        logger = Logger.getLogger(OkHttpClient.class.getName());
    }

    public static final Platform get() {
        return Companion.get();
    }

    public static /* synthetic */ void log$default(Platform platform, String string, int n8, Throwable throwable, int n9, Object object) {
        if (object == null) {
            if ((n9 & 2) != 0) {
                n8 = 4;
            }
            if ((n9 & 4) != 0) {
                throwable = null;
            }
            platform.log(string, n8, throwable);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
    }

    public void afterHandshake(SSLSocket sSLSocket) {
        l.f(sSLSocket, "sslSocket");
    }

    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
        l.f(x509TrustManager, "trustManager");
        return new BasicCertificateChainCleaner(this.buildTrustRootIndex(x509TrustManager));
    }

    public TrustRootIndex buildTrustRootIndex(X509TrustManager x509CertificateArray) {
        l.f(x509CertificateArray, "trustManager");
        x509CertificateArray = x509CertificateArray.getAcceptedIssuers();
        l.e(x509CertificateArray, "trustManager.acceptedIssuers");
        return new BasicTrustRootIndex(Arrays.copyOf(x509CertificateArray, x509CertificateArray.length));
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String string, List<Protocol> list) {
        l.f(sSLSocket, "sslSocket");
        l.f(list, "protocols");
    }

    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int n8) throws IOException {
        l.f(socket, "socket");
        l.f(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, n8);
    }

    public final String getPrefix() {
        return "OkHttp";
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        l.f(sSLSocket, "sslSocket");
        return null;
    }

    public Object getStackTraceForCloseable(String string) {
        l.f(string, "closer");
        if (logger.isLoggable(Level.FINE)) {
            return new Throwable(string);
        }
        return null;
    }

    public boolean isCleartextTrafficPermitted(String string) {
        l.f(string, "hostname");
        return true;
    }

    public void log(String string, int n8, Throwable throwable) {
        l.f(string, "message");
        Level level = n8 == 5 ? Level.WARNING : Level.INFO;
        logger.log(level, string, throwable);
    }

    public void logCloseableLeak(String string, Object object) {
        l.f(string, "message");
        CharSequence charSequence = string;
        if (object == null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            charSequence = ((StringBuilder)charSequence).toString();
        }
        this.log((String)charSequence, 5, (Throwable)object);
    }

    public SSLContext newSSLContext() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        l.e(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory newSslSocketFactory(X509TrustManager object) {
        l.f(object, "trustManager");
        try {
            SSLContext sSLContext = this.newSSLContext();
            sSLContext.init(null, new TrustManager[]{object}, null);
            object = sSLContext.getSocketFactory();
            l.e(object, "newSSLContext().apply {\n\u2026ll)\n      }.socketFactory");
            return object;
        }
        catch (GeneralSecurityException generalSecurityException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No System TLS: ");
            stringBuilder.append(generalSecurityException);
            throw new AssertionError(stringBuilder.toString(), generalSecurityException);
        }
    }

    public X509TrustManager platformTrustManager() {
        Object object = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        ((TrustManagerFactory)object).init((KeyStore)null);
        Object object2 = ((TrustManagerFactory)object).getTrustManagers();
        l.c(object2);
        if (((TrustManager[])object2).length == 1 && (object = object2[0]) instanceof X509TrustManager) {
            l.d(object, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager)object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Unexpected default trust managers: ");
        object2 = Arrays.toString(object2);
        l.e(object2, "toString(this)");
        ((StringBuilder)object).append((String)object2);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }

    public String toString() {
        String string = this.getClass().getSimpleName();
        l.e(string, "javaClass.simpleName");
        return string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public X509TrustManager trustManager(SSLSocketFactory object) {
        block5: {
            l.f(object, "sslSocketFactory");
            Class<?> clazz = Class.forName("sun.security.ssl.SSLContextImpl");
            l.e(clazz, "sslContextClass");
            object = Util.readFieldOrNull(object, clazz, "context");
            if (object != null) break block5;
            return null;
        }
        try {
            return Util.readFieldOrNull(object, X509TrustManager.class, "trustManager");
        }
        catch (RuntimeException runtimeException) {
            if (!l.a(runtimeException.getClass().getName(), "java.lang.reflect.InaccessibleObjectException")) throw runtimeException;
            return null;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        private final Platform findAndroidPlatform() {
            Platform platform;
            AndroidLog.INSTANCE.enable();
            Platform platform2 = platform = Android10Platform.Companion.buildIfSupported();
            if (platform == null) {
                platform2 = AndroidPlatform.Companion.buildIfSupported();
                l.c(platform2);
            }
            return platform2;
        }

        private final Platform findJvmPlatform() {
            Platform platform;
            if (this.isConscryptPreferred() && (platform = ConscryptPlatform.Companion.buildIfSupported()) != null) {
                return platform;
            }
            if (this.isBouncyCastlePreferred() && (platform = BouncyCastlePlatform.Companion.buildIfSupported()) != null) {
                return platform;
            }
            if (this.isOpenJSSEPreferred() && (platform = OpenJSSEPlatform.Companion.buildIfSupported()) != null) {
                return platform;
            }
            platform = Jdk9Platform.Companion.buildIfSupported();
            if (platform != null) {
                return platform;
            }
            platform = Jdk8WithJettyBootPlatform.Companion.buildIfSupported();
            if (platform != null) {
                return platform;
            }
            return new Platform();
        }

        private final Platform findPlatform() {
            if (this.isAndroid()) {
                return this.findAndroidPlatform();
            }
            return this.findJvmPlatform();
        }

        private final boolean isBouncyCastlePreferred() {
            return l.a("BC", Security.getProviders()[0].getName());
        }

        private final boolean isConscryptPreferred() {
            return l.a("Conscrypt", Security.getProviders()[0].getName());
        }

        private final boolean isOpenJSSEPreferred() {
            return l.a("OpenJSSE", Security.getProviders()[0].getName());
        }

        public static /* synthetic */ void resetForTests$default(Companion companion, Platform platform, int n8, Object object) {
            if ((n8 & 1) != 0) {
                platform = companion.findPlatform();
            }
            companion.resetForTests(platform);
        }

        public final List<String> alpnProtocolNames(List<? extends Protocol> list) {
            l.f(list, "protocols");
            ArrayList<String> arrayList = list;
            list = new ArrayList<Protocol>();
            for (Object e8 : arrayList) {
                if ((Protocol)((Object)e8) == Protocol.HTTP_1_0) continue;
                list.add((Protocol)((Object)e8));
            }
            arrayList = new ArrayList<String>(o.s(list, 10));
            int n8 = ((ArrayList)list).size();
            for (int i8 = 0; i8 < n8; ++i8) {
                Object e8 = ((ArrayList)list).get(i8);
                arrayList.add(((Protocol)((Object)e8)).toString());
            }
            return arrayList;
        }

        public final byte[] concatLengthPrefixed(List<? extends Protocol> object2) {
            l.f(object2, "protocols");
            e e8 = new e();
            for (String string : this.alpnProtocolNames((List<? extends Protocol>)object2)) {
                e8.j1(string.length());
                e8.r1(string);
            }
            return e8.O();
        }

        public final Platform get() {
            return platform;
        }

        public final boolean isAndroid() {
            return l.a("Dalvik", System.getProperty("java.vm.name"));
        }

        public final void resetForTests(Platform platform) {
            l.f(platform, "platform");
            Platform.platform = platform;
        }
    }
}

