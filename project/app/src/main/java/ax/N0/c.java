/*
 * Decompiled with CFR 0.152.
 */
package ax.N0;

import android.app.PendingIntent;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import ax.N0.a;
import ax.N0.b;
import ax.P.k;
import ax.P.l;

public class c
extends l.f {
    int[] e = null;
    MediaSessionCompat.Token f;
    PendingIntent g;
    CharSequence h;
    int i;
    PendingIntent j;
    boolean k = false;

    @Override
    public void b(k k8) {
        if (Build.VERSION.SDK_INT >= 34) {
            ax.N0.a.d(k8.a(), ax.N0.a.b(b.a(ax.N0.a.a(), this.h, this.i, this.j, this.k), this.e, this.f));
            return;
        }
        ax.N0.a.d(k8.a(), ax.N0.a.b(ax.N0.a.a(), this.e, this.f));
    }

    @Override
    public RemoteViews d(k k8) {
        return null;
    }

    @Override
    public RemoteViews e(k k8) {
        return null;
    }

    public c h(PendingIntent pendingIntent) {
        this.g = pendingIntent;
        return this;
    }

    public c i(MediaSessionCompat.Token token) {
        this.f = token;
        return this;
    }

    public c j(int ... nArray) {
        this.e = nArray;
        return this;
    }

    public c k(boolean bl) {
        return this;
    }
}

