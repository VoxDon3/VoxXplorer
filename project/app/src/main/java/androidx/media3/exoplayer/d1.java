/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;
import androidx.media3.exoplayer.b1;
import androidx.media3.exoplayer.c1;
import ax.S0.h;
import ax.S0.q;
import ax.S0.u;

final class d1 {
    private final a a;
    private final q b;
    private boolean c;
    private boolean d;

    public d1(Context context, Looper looper, h h8) {
        this.a = new a(context.getApplicationContext());
        this.b = h8.d(looper, null);
    }

    public static /* synthetic */ void a(d1 d12, boolean bl, boolean bl2) {
        d12.a.a(bl, bl2);
    }

    public static /* synthetic */ void b(d1 d12, boolean bl) {
        d12.a.a(true, bl);
    }

    public void c(boolean bl) {
        if (this.c == bl) {
            return;
        }
        this.c = bl;
        boolean bl2 = this.d;
        this.b.c(new b1(this, bl, bl2));
    }

    public void d(boolean bl) {
        if (this.d != bl) {
            this.d = bl;
            if (this.c) {
                this.b.c(new c1(this, bl));
            }
        }
    }

    private static final class a {
        private final Context a;
        private WifiManager.WifiLock b;

        public a(Context context) {
            this.a = context;
        }

        public void a(boolean bl, boolean bl2) {
            WifiManager.WifiLock wifiLock;
            if (bl && this.b == null) {
                wifiLock = (WifiManager)this.a.getApplicationContext().getSystemService("wifi");
                if (wifiLock == null) {
                    u.h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                }
                this.b = wifiLock = wifiLock.createWifiLock(3, "ExoPlayer:WifiLockManager");
                wifiLock.setReferenceCounted(false);
            }
            if ((wifiLock = this.b) == null) {
                return;
            }
            if (bl && bl2) {
                wifiLock.acquire();
                return;
            }
            wifiLock.release();
        }
    }
}

