/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.connection;

import ax.Gb.l;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import okhttp3.ConnectionSpec;

public final class ConnectionSpecSelector {
    private final List<ConnectionSpec> connectionSpecs;
    private boolean isFallback;
    private boolean isFallbackPossible;
    private int nextModeIndex;

    public ConnectionSpecSelector(List<ConnectionSpec> list) {
        l.f(list, "connectionSpecs");
        this.connectionSpecs = list;
    }

    private final boolean isFallbackPossible(SSLSocket sSLSocket) {
        int n8 = this.connectionSpecs.size();
        for (int i8 = this.nextModeIndex; i8 < n8; ++i8) {
            if (!this.connectionSpecs.get(i8).isCompatible(sSLSocket)) continue;
            return true;
        }
        return false;
    }

    public final ConnectionSpec configureSecureSocket(SSLSocket object) throws IOException {
        Object object2;
        block2: {
            l.f(object, "sslSocket");
            int n8 = this.connectionSpecs.size();
            for (int i8 = this.nextModeIndex; i8 < n8; ++i8) {
                object2 = this.connectionSpecs.get(i8);
                if (!((ConnectionSpec)object2).isCompatible((SSLSocket)object)) continue;
                this.nextModeIndex = i8 + 1;
                break block2;
            }
            object2 = null;
        }
        if (object2 != null) {
            this.isFallbackPossible = this.isFallbackPossible((SSLSocket)object);
            ((ConnectionSpec)object2).apply$okhttp((SSLSocket)object, this.isFallback);
            return object2;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Unable to find acceptable protocols. isFallback=");
        ((StringBuilder)object2).append(this.isFallback);
        ((StringBuilder)object2).append(", modes=");
        ((StringBuilder)object2).append(this.connectionSpecs);
        ((StringBuilder)object2).append(", supported protocols=");
        object = object.getEnabledProtocols();
        l.c(object);
        object = Arrays.toString(object);
        l.e(object, "toString(this)");
        ((StringBuilder)object2).append((String)object);
        throw new UnknownServiceException(((StringBuilder)object2).toString());
    }

    public final boolean connectionFailed(IOException iOException) {
        l.f(iOException, "e");
        this.isFallback = true;
        if (!this.isFallbackPossible) {
            return false;
        }
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            return false;
        }
        if (iOException instanceof SSLHandshakeException && iOException.getCause() instanceof CertificateException) {
            return false;
        }
        if (iOException instanceof SSLPeerUnverifiedException) {
            return false;
        }
        return iOException instanceof SSLException;
    }
}

