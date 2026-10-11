/*
 * Decompiled with CFR 0.152.
 */
package ax.wc;

import android.net.ssl.SSLSockets;
import javax.net.ssl.SSLSocket;

public final class a {
    public static /* bridge */ /* synthetic */ void a(SSLSocket sSLSocket, boolean bl) {
        SSLSockets.setUseSessionTickets((SSLSocket)sSLSocket, (boolean)bl);
    }
}

