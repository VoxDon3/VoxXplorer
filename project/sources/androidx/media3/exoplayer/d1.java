package androidx.media3.exoplayer;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;
import ax.S0.C0987u;
import ax.S0.InterfaceC0975h;
import ax.S0.InterfaceC0984q;

/* loaded from: classes.dex */
final class d1 {
    private final a a;
    private final InterfaceC0984q b;
    private boolean c;
    private boolean d;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {
        private final Context a;
        private WifiManager.WifiLock b;

        public a(Context context) {
            this.a = context;
        }

        public void a(boolean z, boolean z2) {
            if (z && this.b == null) {
                WifiManager wifiManager = (WifiManager) this.a.getApplicationContext().getSystemService("wifi");
                if (wifiManager == null) {
                    C0987u.h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                    this.b = createWifiLock;
                    createWifiLock.setReferenceCounted(false);
                }
            }
            WifiManager.WifiLock wifiLock = this.b;
            if (wifiLock == null) {
                return;
            }
            if (z && z2) {
                wifiLock.acquire();
            } else {
                wifiLock.release();
            }
        }
    }

    public d1(Context context, Looper looper, InterfaceC0975h interfaceC0975h) {
        this.a = new a(context.getApplicationContext());
        this.b = interfaceC0975h.d(looper, null);
    }

    public void c(final boolean z) {
        if (this.c == z) {
            return;
        }
        this.c = z;
        final boolean z2 = this.d;
        this.b.c(new Runnable() { // from class: androidx.media3.exoplayer.b1
            @Override // java.lang.Runnable
            public final void run() {
                d1.this.a.a(z, z2);
            }
        });
    }

    public void d(final boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        if (this.c) {
            this.b.c(new Runnable() { // from class: androidx.media3.exoplayer.c1
                @Override // java.lang.Runnable
                public final void run() {
                    d1.this.a.a(true, z);
                }
            });
        }
    }
}
