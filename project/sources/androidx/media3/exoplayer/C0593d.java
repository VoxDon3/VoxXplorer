package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import androidx.media3.exoplayer.C0593d;
import ax.S0.InterfaceC0975h;
import ax.S0.InterfaceC0984q;

/* renamed from: androidx.media3.exoplayer.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0593d {
    private final Context a;
    private final a b;
    private final InterfaceC0984q c;
    private boolean d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.media3.exoplayer.d$a */
    final class a extends BroadcastReceiver {
        private final b a;
        private final InterfaceC0984q b;

        public a(InterfaceC0984q interfaceC0984q, b bVar) {
            this.b = interfaceC0984q;
            this.a = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            if (C0593d.this.d) {
                this.a.j();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.b.c(new Runnable() { // from class: androidx.media3.exoplayer.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0593d.a.this.b();
                    }
                });
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.d$b */
    public interface b {
        void j();
    }

    public C0593d(Context context, Looper looper, Looper looper2, b bVar, InterfaceC0975h interfaceC0975h) {
        this.a = context.getApplicationContext();
        this.c = interfaceC0975h.d(looper, null);
        this.b = new a(interfaceC0975h.d(looper2, null), bVar);
    }

    @SuppressLint({"UnprotectedReceiver"})
    public void d(boolean z) {
        if (z == this.d) {
            return;
        }
        if (z) {
            this.c.c(new Runnable() { // from class: androidx.media3.exoplayer.a
                @Override // java.lang.Runnable
                public final void run() {
                    r0.a.registerReceiver(C0593d.this.b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                }
            });
            this.d = true;
        } else {
            this.c.c(new Runnable() { // from class: androidx.media3.exoplayer.b
                @Override // java.lang.Runnable
                public final void run() {
                    r0.a.unregisterReceiver(C0593d.this.b);
                }
            });
            this.d = false;
        }
    }
}
