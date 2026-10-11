/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;
import androidx.media3.exoplayer.P0;
import androidx.media3.exoplayer.Q0;
import androidx.media3.exoplayer.R0;
import androidx.media3.exoplayer.S0;
import androidx.media3.exoplayer.T0;
import androidx.media3.exoplayer.U0;
import androidx.media3.exoplayer.W0;
import ax.Q0.m;
import ax.S0.a;
import ax.S0.f;
import ax.S0.h;
import ax.S0.u;

final class V0 {
    private final Context a;
    private final b b;
    private final f<c> c;
    private AudioManager d;
    private d e;
    private int f;

    public V0(Context object, b b8, int n8, Looper looper, Looper looper2, h h8) {
        this.a = object.getApplicationContext();
        this.b = b8;
        this.c = object = new f<c>(new c(n8, 0, false, 0, 0), looper, looper2, h8, new P0(this));
        ((f)object).e(new Q0(this, n8));
    }

    public static /* synthetic */ c a(int n8, c c8) {
        return new c(n8, c8.b, c8.c, c8.d, c8.e);
    }

    public static /* synthetic */ c b(c c8) {
        return c8;
    }

    public static /* synthetic */ c c(V0 v02, int n8, c c8) {
        v02.getClass();
        if (c8.a == n8) {
            return c8;
        }
        return v02.j(n8);
    }

    public static /* synthetic */ c d(V0 v02, c c8) {
        d d8 = v02.e;
        if (d8 != null) {
            try {
                v02.a.unregisterReceiver((BroadcastReceiver)d8);
            }
            catch (RuntimeException runtimeException) {
                u.i("StreamVolumeManager", "Error unregistering stream volume receiver", runtimeException);
            }
            v02.e = null;
        }
        return c8;
    }

    public static /* synthetic */ void e(V0 v02, c c8, c c9) {
        v02.m(c8, c9);
    }

    public static /* synthetic */ void f(V0 v02, int n8) {
        v02.d = ax.S0.a.i((AudioManager)v02.a.getSystemService("audio"));
        d d8 = new d(v02);
        IntentFilter intentFilter = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
        try {
            v02.a.registerReceiver((BroadcastReceiver)d8, intentFilter);
            v02.e = d8;
        }
        catch (RuntimeException runtimeException) {
            u.i("StreamVolumeManager", "Error registering stream volume receiver", runtimeException);
        }
        v02.c.g(v02.j(n8));
    }

    private c j(int n8) {
        ax.S0.a.e(this.d);
        return new c(n8, m.f(this.d, n8), m.g(this.d, n8), m.e(this.d, n8), m.d(this.d, n8));
    }

    private void m(c c8, c c9) {
        int n8;
        int n9;
        boolean bl = c8.c;
        if (!bl && c9.c) {
            this.f = c8.b;
        }
        if ((n9 = c8.b) != (n8 = c9.b) || bl != c9.c) {
            this.b.F(n8, c9.c);
        }
        if ((n9 = c8.a) == (n8 = c9.a) && c8.d == c9.d && c8.e == c9.e) {
            return;
        }
        this.b.d(n8);
    }

    public int k() {
        return this.c.d().e;
    }

    public int l() {
        return this.c.d().d;
    }

    public void n() {
        this.c.h(new R0(), new S0(this));
    }

    public void o(int n8) {
        this.c.h(new T0(n8), new U0(this, n8));
    }

    public static interface b {
        public void F(int var1, boolean var2);

        public void d(int var1);
    }

    private static final class c {
        public final int a;
        public final int b;
        public final boolean c;
        public final int d;
        public final int e;

        public c(int n8, int n9, boolean bl, int n10, int n11) {
            this.a = n8;
            this.b = n9;
            this.c = bl;
            this.d = n10;
            this.e = n11;
        }
    }

    private final class d
    extends BroadcastReceiver {
        final V0 a;

        private d(V0 v02) {
            this.a = v02;
        }

        public static /* synthetic */ void a(d d8) {
            if (d8.a.e == null) {
                return;
            }
            int n8 = ((c)((V0)d8.a).c.d()).a;
            d8.a.c.g(d8.a.j(n8));
        }

        public void onReceive(Context context, Intent intent) {
            this.a.c.e(new W0(this));
        }
    }
}

