/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import androidx.media3.exoplayer.c;
import ax.S0.h;
import ax.S0.q;

final class d {
    private final Context a;
    private final a b;
    private final q c;
    private boolean d;

    public d(Context context, Looper looper, Looper looper2, b b8, h h8) {
        this.a = context.getApplicationContext();
        this.c = h8.d(looper, null);
        this.b = new a(this, h8.d(looper2, null), b8);
    }

    public static /* synthetic */ void a(d d8) {
        d8.a.registerReceiver((BroadcastReceiver)d8.b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    public static /* synthetic */ void b(d d8) {
        d8.a.unregisterReceiver((BroadcastReceiver)d8.b);
    }

    @SuppressLint(value={"UnprotectedReceiver"})
    public void d(boolean bl) {
        if (bl == this.d) {
            return;
        }
        if (bl) {
            this.c.c(new androidx.media3.exoplayer.a(this));
            this.d = true;
            return;
        }
        this.c.c(new androidx.media3.exoplayer.b(this));
        this.d = false;
    }

    private final class a
    extends BroadcastReceiver {
        private final b a;
        private final q b;
        final d c;

        public a(d d8, q q8, b b8) {
            this.c = d8;
            this.b = q8;
            this.a = b8;
        }

        public static /* synthetic */ void a(a a8) {
            a8.b();
        }

        private void b() {
            if (this.c.d) {
                this.a.j();
            }
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.b.c(new c(this));
            }
        }
    }

    public static interface b {
        public void j();
    }
}

