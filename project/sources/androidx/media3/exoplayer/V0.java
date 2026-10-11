package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;
import androidx.media3.exoplayer.V0;
import ax.S0.C0968a;
import ax.S0.C0973f;
import ax.S0.C0987u;
import ax.S0.InterfaceC0975h;
import ax.q7.InterfaceC2879f;

/* loaded from: classes.dex */
final class V0 {
    private final Context a;
    private final b b;
    private final C0973f<c> c;
    private AudioManager d;
    private d e;
    private int f;

    public interface b {
        void F(int i, boolean z);

        void d(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {
        public final int a;
        public final int b;
        public final boolean c;
        public final int d;
        public final int e;

        public c(int i, int i2, boolean z, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = i3;
            this.e = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class d extends BroadcastReceiver {
        private d() {
        }

        public static /* synthetic */ void a(d dVar) {
            if (V0.this.e == null) {
                return;
            }
            V0.this.c.g(V0.this.j(((c) V0.this.c.d()).a));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            V0.this.c.e(new Runnable() { // from class: androidx.media3.exoplayer.W0
                @Override // java.lang.Runnable
                public final void run() {
                    V0.d.a(V0.d.this);
                }
            });
        }
    }

    public V0(Context context, b bVar, final int i, Looper looper, Looper looper2, InterfaceC0975h interfaceC0975h) {
        this.a = context.getApplicationContext();
        this.b = bVar;
        C0973f<c> c0973f = new C0973f<>(new c(i, 0, false, 0, 0), looper, looper2, interfaceC0975h, new C0973f.a() { // from class: androidx.media3.exoplayer.P0
            @Override // ax.S0.C0973f.a
            public final void a(Object obj, Object obj2) {
                V0.this.m((V0.c) obj, (V0.c) obj2);
            }
        });
        this.c = c0973f;
        c0973f.e(new Runnable() { // from class: androidx.media3.exoplayer.Q0
            @Override // java.lang.Runnable
            public final void run() {
                V0.f(V0.this, i);
            }
        });
    }

    public static /* synthetic */ c a(int i, c cVar) {
        return new c(i, cVar.b, cVar.c, cVar.d, cVar.e);
    }

    public static /* synthetic */ c b(c cVar) {
        return cVar;
    }

    public static /* synthetic */ c c(V0 v0, int i, c cVar) {
        v0.getClass();
        return cVar.a == i ? cVar : v0.j(i);
    }

    public static /* synthetic */ c d(V0 v0, c cVar) {
        d dVar = v0.e;
        if (dVar != null) {
            try {
                v0.a.unregisterReceiver(dVar);
            } catch (RuntimeException e) {
                C0987u.i("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            v0.e = null;
        }
        return cVar;
    }

    public static /* synthetic */ void f(V0 v0, int i) {
        v0.d = (AudioManager) C0968a.i((AudioManager) v0.a.getSystemService("audio"));
        d dVar = new d();
        try {
            v0.a.registerReceiver(dVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            v0.e = dVar;
        } catch (RuntimeException e) {
            C0987u.i("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
        v0.c.g(v0.j(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c j(int i) {
        C0968a.e(this.d);
        return new c(i, ax.Q0.m.f(this.d, i), ax.Q0.m.g(this.d, i), ax.Q0.m.e(this.d, i), ax.Q0.m.d(this.d, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(c cVar, c cVar2) {
        boolean z = cVar.c;
        if (!z && cVar2.c) {
            this.f = cVar.b;
        }
        int i = cVar.b;
        int i2 = cVar2.b;
        if (i != i2 || z != cVar2.c) {
            this.b.F(i2, cVar2.c);
        }
        int i3 = cVar.a;
        int i4 = cVar2.a;
        if (i3 == i4 && cVar.d == cVar2.d && cVar.e == cVar2.e) {
            return;
        }
        this.b.d(i4);
    }

    public int k() {
        return this.c.d().e;
    }

    public int l() {
        return this.c.d().d;
    }

    public void n() {
        this.c.h(new InterfaceC2879f() { // from class: androidx.media3.exoplayer.R0
            @Override // ax.q7.InterfaceC2879f
            public final Object apply(Object obj) {
                return V0.b((V0.c) obj);
            }
        }, new InterfaceC2879f() { // from class: androidx.media3.exoplayer.S0
            @Override // ax.q7.InterfaceC2879f
            public final Object apply(Object obj) {
                return V0.d(V0.this, (V0.c) obj);
            }
        });
    }

    public void o(final int i) {
        this.c.h(new InterfaceC2879f() { // from class: androidx.media3.exoplayer.T0
            @Override // ax.q7.InterfaceC2879f
            public final Object apply(Object obj) {
                return V0.a(i, (V0.c) obj);
            }
        }, new InterfaceC2879f() { // from class: androidx.media3.exoplayer.U0
            @Override // ax.q7.InterfaceC2879f
            public final Object apply(Object obj) {
                return V0.c(V0.this, i, (V0.c) obj);
            }
        });
    }
}
