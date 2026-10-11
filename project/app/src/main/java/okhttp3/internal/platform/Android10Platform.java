/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.platform;

import android.annotation.SuppressLint;
import android.os.Build;
import ax.Gb.g;
import ax.Gb.l;
import ax.S0.P;
import ax.S0.S;
import ax.tb.o;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.Android10SocketAdapter;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.tls.CertificateChainCleaner;

@SuppressSignatureCheck
public final class Android10Platform
extends Platform {
    public static final Companion Companion = new Companion(null);
    private static final boolean isSupported;
    private final List<SocketAdapter> socketAdapters;

    static {
        boolean bl = Platform.Companion.isAndroid() && Build.VERSION.SDK_INT >= 29;
        isSupported = bl;
    }

    public Android10Platform() {
        Iterable iterable2 = o.m(Android10SocketAdapter.Companion.buildIfSupported(), new DeferredSocketAdapter(AndroidSocketAdapter.Companion.getPlayProviderFactory()), new DeferredSocketAdapter(ConscryptSocketAdapter.Companion.getFactory()), new DeferredSocketAdapter(BouncyCastleSocketAdapter.Companion.getFactory()));
        ArrayList<SocketAdapter> arrayList = new ArrayList<SocketAdapter>();
        for (Iterable iterable2 : iterable2) {
            if (!((SocketAdapter)((Object)iterable2)).isSupported()) continue;
            arrayList.add((SocketAdapter)((Object)iterable2));
        }
        this.socketAdapters = arrayList;
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

    public void configureTlsExtensions(SSLSocket sSLSocket, String string, List<? extends Protocol> list) {
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
    @SuppressLint(value={"NewApi"})
    public boolean isCleartextTrafficPermitted(String string) {
        l.f(string, "hostname");
        return S.a(P.a(), string);
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
                return new Android10Platform();
            }
            return null;
        }

        public final boolean isSupported() {
            return isSupported;
        }
    }
}

