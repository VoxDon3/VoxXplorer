/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.platform.android;

import android.annotation.SuppressLint;
import android.os.Build;
import ax.Gb.g;
import ax.Gb.l;
import ax.vc.b;
import ax.vc.c;
import ax.wc.a;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.SocketAdapter;

@SuppressLint(value={"NewApi"})
@SuppressSignatureCheck
public final class Android10SocketAdapter
implements SocketAdapter {
    public static final Companion Companion = new Companion(null);

    @Override
    @SuppressLint(value={"NewApi"})
    public void configureTlsExtensions(SSLSocket sSLSocket, String object, List<? extends Protocol> list) {
        l.f(sSLSocket, "sslSocket");
        l.f(list, "protocols");
        try {
            a.a(sSLSocket, true);
            object = sSLSocket.getSSLParameters();
            b.a((SSLParameters)object, ((Collection)Platform.Companion.alpnProtocolNames(list)).toArray(new String[0]));
            sSLSocket.setSSLParameters((SSLParameters)object);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IOException("Android internal error", illegalArgumentException);
        }
    }

    @Override
    @SuppressLint(value={"NewApi"})
    public String getSelectedProtocol(SSLSocket object) {
        l.f(object, "sslSocket");
        object = c.a((SSLSocket)object);
        boolean bl = object == null ? true : l.a(object, "");
        if (bl) {
            object = null;
        }
        return object;
    }

    @Override
    public boolean isSupported() {
        return Companion.isSupported();
    }

    @Override
    public boolean matchesSocket(SSLSocket sSLSocket) {
        l.f(sSLSocket, "sslSocket");
        return ax.wc.b.a(sSLSocket);
    }

    @Override
    public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.matchesSocketFactory(this, sSLSocketFactory);
    }

    @Override
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.trustManager(this, sSLSocketFactory);
    }

    @SuppressSignatureCheck
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public final SocketAdapter buildIfSupported() {
            if (this.isSupported()) {
                return new Android10SocketAdapter();
            }
            return null;
        }

        public final boolean isSupported() {
            return Platform.Companion.isAndroid() && Build.VERSION.SDK_INT >= 29;
        }
    }
}

