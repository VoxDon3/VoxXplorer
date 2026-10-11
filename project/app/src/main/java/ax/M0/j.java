/*
 * Decompiled with CFR 0.152.
 */
package ax.M0;

import android.media.session.MediaSessionManager;
import ax.M0.f;
import ax.M0.g;
import ax.M0.h;
import ax.M0.i;
import ax.M0.k;

final class j
extends k {
    final MediaSessionManager.RemoteUserInfo d;

    j(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(g.a(remoteUserInfo), h.a(remoteUserInfo), i.a(remoteUserInfo));
        this.d = remoteUserInfo;
    }

    j(String string, int n8, int n9) {
        super(string, n8, n9);
        this.d = f.a(string, n8, n9);
    }

    static String a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        return g.a(remoteUserInfo);
    }
}

