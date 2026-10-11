/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;
import androidx.media3.exoplayer.Y0;
import androidx.media3.exoplayer.Z0;
import ax.S0.h;
import ax.S0.q;
import ax.S0.u;

final class a1 {
    private final a a;
    private final q b;
    private boolean c;
    private boolean d;

    public a1(Context context, Looper looper, h h8) {
        this.a = new a(context.getApplicationContext());
        this.b = h8.d(looper, null);
    }

    public static /* synthetic */ void a(a1 a12, boolean bl, boolean bl2) {
        a12.a.a(bl, bl2);
    }

    public static /* synthetic */ void b(a1 a12, boolean bl) {
        a12.a.a(true, bl);
    }

    public void c(boolean bl) {
        if (this.c == bl) {
            return;
        }
        this.c = bl;
        boolean bl2 = this.d;
        this.b.c(new Z0(this, bl, bl2));
    }

    public void d(boolean bl) {
        if (this.d != bl) {
            this.d = bl;
            if (this.c) {
                this.b.c(new Y0(this, bl));
            }
        }
    }

    private static final class a {
        private final Context a;
        private PowerManager.WakeLock b;

        public a(Context context) {
            this.a = context;
        }

        @SuppressLint(value={"WakelockTimeout"})
        public void a(boolean bl, boolean bl2) {
            PowerManager.WakeLock wakeLock;
            if (bl && this.b == null) {
                wakeLock = (PowerManager)this.a.getSystemService("power");
                if (wakeLock == null) {
                    u.h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                }
                this.b = wakeLock = wakeLock.newWakeLock(1, "ExoPlayer:WakeLockManager");
                wakeLock.setReferenceCounted(false);
            }
            if ((wakeLock = this.b) == null) {
                return;
            }
            if (bl && bl2) {
                wakeLock.acquire();
                return;
            }
            wakeLock.release();
        }
    }
}

