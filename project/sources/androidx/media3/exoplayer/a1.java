package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;
import ax.S0.C0987u;
import ax.S0.InterfaceC0975h;
import ax.S0.InterfaceC0984q;

/* loaded from: classes.dex */
final class a1 {
    private final a a;
    private final InterfaceC0984q b;
    private boolean c;
    private boolean d;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {
        private final Context a;
        private PowerManager.WakeLock b;

        public a(Context context) {
            this.a = context;
        }

        @SuppressLint({"WakelockTimeout"})
        public void a(boolean z, boolean z2) {
            if (z && this.b == null) {
                PowerManager powerManager = (PowerManager) this.a.getSystemService("power");
                if (powerManager == null) {
                    C0987u.h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.b = newWakeLock;
                    newWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = this.b;
            if (wakeLock == null) {
                return;
            }
            if (z && z2) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public a1(Context context, Looper looper, InterfaceC0975h interfaceC0975h) {
        this.a = new a(context.getApplicationContext());
        this.b = interfaceC0975h.d(looper, null);
    }

    public void c(final boolean z) {
        if (this.c == z) {
            return;
        }
        this.c = z;
        final boolean z2 = this.d;
        this.b.c(new Runnable() { // from class: androidx.media3.exoplayer.Z0
            @Override // java.lang.Runnable
            public final void run() {
                a1.this.a.a(z, z2);
            }
        });
    }

    public void d(final boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        if (this.c) {
            this.b.c(new Runnable() { // from class: androidx.media3.exoplayer.Y0
                @Override // java.lang.Runnable
                public final void run() {
                    a1.this.a.a(true, z);
                }
            });
        }
    }
}
