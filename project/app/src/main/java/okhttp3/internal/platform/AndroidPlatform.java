/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.platform;

import android.os.Build;
import ax.Gb.g;
import ax.Gb.l;
import ax.S0.P;
import ax.S0.S;
import ax.tb.o;
import ax.vc.a;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.CloseGuard;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.platform.android.StandardAndroidSocketAdapter;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

@SuppressSignatureCheck
public final class AndroidPlatform
extends Platform {
    public static final Companion Companion = new Companion(null);
    private static final boolean isSupported;
    private final CloseGuard closeGuard;
    private final List<SocketAdapter> socketAdapters;

    static {
        boolean bl = Platform.Companion.isAndroid();
        boolean bl2 = false;
        if (bl && Build.VERSION.SDK_INT < 30) {
            bl2 = true;
        }
        isSupported = bl2;
    }

    public AndroidPlatform() {
        Object object = o.m(StandardAndroidSocketAdapter.Companion.buildIfSupported$default(StandardAndroidSocketAdapter.Companion, null, 1, null), new DeferredSocketAdapter(AndroidSocketAdapter.Companion.getPlayProviderFactory()), new DeferredSocketAdapter(ConscryptSocketAdapter.Companion.getFactory()), new DeferredSocketAdapter(BouncyCastleSocketAdapter.Companion.getFactory()));
        ArrayList<SocketAdapter> arrayList = new ArrayList<SocketAdapter>();
        object = object.iterator();
        while (object.hasNext()) {
            Object e8 = object.next();
            if (!((SocketAdapter)e8).isSupported()) continue;
            arrayList.add((SocketAdapter)e8);
        }
        this.socketAdapters = arrayList;
        this.closeGuard = CloseGuard.Companion.get();
    }

    @Override
    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
        l.f(x509TrustManager, "trustManager");
        AndroidCertificateChainCleaner androidCertificateChainCleaner = AndroidCertificateChainCleaner.Companion.buildIfSupported(x509TrustManager);
        if (androidCertificateChainCleaner != null) {
            return androidCertificateChainCleaner;
        }
        return super.buildCertificateChainCleaner(x509TrustManager);
    }

    @Override
    public TrustRootIndex buildTrustRootIndex(X509TrustManager x509TrustManager) {
        l.f(x509TrustManager, "trustManager");
        try {
            Object object = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            ((AccessibleObject)object).setAccessible(true);
            l.e(object, "method");
            object = new CustomTrustRootIndex(x509TrustManager, (Method)object);
            return object;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return super.buildTrustRootIndex(x509TrustManager);
        }
    }

    @Override
    public void configureTlsExtensions(SSLSocket sSLSocket, String string, List<Protocol> list) {
        SocketAdapter socketAdapter2;
        block2: {
            l.f(sSLSocket, "sslSocket");
            l.f(list, "protocols");
            for (SocketAdapter socketAdapter2 : (Iterable)this.socketAdapters) {
                if (!((SocketAdapter)socketAdapter2).matchesSocket(sSLSocket)) continue;
                break block2;
            }
            socketAdapter2 = null;
        }
        socketAdapter2 = socketAdapter2;
        if (socketAdapter2 != null) {
            socketAdapter2.configureTlsExtensions(sSLSocket, string, list);
        }
    }

    @Override
    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int n8) throws IOException {
        l.f(socket, "socket");
        l.f(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, n8);
            return;
        }
        catch (ClassCastException classCastException) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", classCastException);
            }
            throw classCastException;
        }
    }

    @Override
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        SocketAdapter socketAdapter2;
        block2: {
            l.f(sSLSocket, "sslSocket");
            for (SocketAdapter socketAdapter2 : (Iterable)this.socketAdapters) {
                if (!((SocketAdapter)socketAdapter2).matchesSocket(sSLSocket)) continue;
                break block2;
            }
            socketAdapter2 = null;
        }
        socketAdapter2 = socketAdapter2;
        if (socketAdapter2 != null) {
            return socketAdapter2.getSelectedProtocol(sSLSocket);
        }
        return null;
    }

    @Override
    public Object getStackTraceForCloseable(String string) {
        l.f(string, "closer");
        return this.closeGuard.createAndOpen(string);
    }

    @Override
    public boolean isCleartextTrafficPermitted(String string) {
        l.f(string, "hostname");
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 24) {
            return S.a(P.a(), string);
        }
        if (n8 >= 23) {
            return a.a(P.a());
        }
        return true;
    }

    @Override
    public void logCloseableLeak(String string, Object object) {
        l.f(string, "message");
        if (!this.closeGuard.warnIfOpen(object)) {
            Platform.log$default(this, string, 5, null, 4, null);
        }
    }

    @Override
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        SocketAdapter socketAdapter2;
        block2: {
            l.f(sSLSocketFactory, "sslSocketFactory");
            for (SocketAdapter socketAdapter2 : (Iterable)this.socketAdapters) {
                if (!((SocketAdapter)socketAdapter2).matchesSocketFactory(sSLSocketFactory)) continue;
                break block2;
            }
            socketAdapter2 = null;
        }
        socketAdapter2 = socketAdapter2;
        if (socketAdapter2 != null) {
            return socketAdapter2.trustManager(sSLSocketFactory);
        }
        return null;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public final Platform buildIfSupported() {
            if (this.isSupported()) {
                return new AndroidPlatform();
            }
            return null;
        }

        public final boolean isSupported() {
            return isSupported;
        }
    }

    public static final class CustomTrustRootIndex
    implements TrustRootIndex {
        private final Method findByIssuerAndSignatureMethod;
        private final X509TrustManager trustManager;

        public CustomTrustRootIndex(X509TrustManager x509TrustManager, Method method) {
            l.f(x509TrustManager, "trustManager");
            l.f(method, "findByIssuerAndSignatureMethod");
            this.trustManager = x509TrustManager;
            this.findByIssuerAndSignatureMethod = method;
        }

        private final X509TrustManager component1() {
            return this.trustManager;
        }

        private final Method component2() {
            return this.findByIssuerAndSignatureMethod;
        }

        public static /* synthetic */ CustomTrustRootIndex copy$default(CustomTrustRootIndex customTrustRootIndex, X509TrustManager x509TrustManager, Method method, int n8, Object object) {
            if ((n8 & 1) != 0) {
                x509TrustManager = customTrustRootIndex.trustManager;
            }
            if ((n8 & 2) != 0) {
                method = customTrustRootIndex.findByIssuerAndSignatureMethod;
            }
            return customTrustRootIndex.copy(x509TrustManager, method);
        }

        public final CustomTrustRootIndex copy(X509TrustManager x509TrustManager, Method method) {
            l.f(x509TrustManager, "trustManager");
            l.f(method, "findByIssuerAndSignatureMethod");
            return new CustomTrustRootIndex(x509TrustManager, method);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof CustomTrustRootIndex)) {
                return false;
            }
            object = (CustomTrustRootIndex)object;
            if (!l.a(this.trustManager, ((CustomTrustRootIndex)object).trustManager)) {
                return false;
            }
            return l.a(this.findByIssuerAndSignatureMethod, ((CustomTrustRootIndex)object).findByIssuerAndSignatureMethod);
        }

        @Override
        public X509Certificate findByIssuerAndSignature(X509Certificate object) {
            l.f(object, "cert");
            try {
                object = this.findByIssuerAndSignatureMethod.invoke(this.trustManager, object);
                l.d(object, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                object = ((TrustAnchor)object).getTrustedCert();
                return object;
            }
            catch (IllegalAccessException illegalAccessException) {
            }
            catch (InvocationTargetException invocationTargetException) {
                return null;
            }
            throw new AssertionError("unable to get issues and signature", illegalAccessException);
        }

        public int hashCode() {
            return this.trustManager.hashCode() * 31 + this.findByIssuerAndSignatureMethod.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CustomTrustRootIndex(trustManager=");
            stringBuilder.append(this.trustManager);
            stringBuilder.append(", findByIssuerAndSignatureMethod=");
            stringBuilder.append(this.findByIssuerAndSignatureMethod);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }
}

