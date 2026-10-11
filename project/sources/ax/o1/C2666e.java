package ax.o1;

import android.media.MediaFormat;
import android.view.Surface;
import androidx.media3.exoplayer.C0622s;
import ax.P0.C0912v;
import ax.P0.a0;
import ax.S0.C0968a;
import ax.S0.InterfaceC0975h;
import ax.o1.C2660E;
import ax.o1.S;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: ax.o1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2666e implements S {
    private final C2656A a;
    private final C2660E b;
    private final Queue<S.b> c;
    private Surface d;
    private C0912v e;
    private long f;
    private S.a g;
    private Executor h;
    private z i;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ax.o1.e$b */
    final class b implements C2660E.a {
        private C0912v a;

        private b() {
        }

        @Override // ax.o1.C2660E.a
        public void a(final a0 a0Var) {
            this.a = new C0912v.b().F0(a0Var.a).h0(a0Var.b).y0("video/raw").P();
            C2666e.this.h.execute(new Runnable() { // from class: ax.o1.h
                @Override // java.lang.Runnable
                public final void run() {
                    C2666e.this.g.a(a0Var);
                }
            });
        }

        @Override // ax.o1.C2660E.a
        public void b() {
            C2666e.this.h.execute(new Runnable() { // from class: ax.o1.g
                @Override // java.lang.Runnable
                public final void run() {
                    C2666e.this.g.f();
                }
            });
            ((S.b) C2666e.this.c.remove()).b();
        }

        @Override // ax.o1.C2660E.a
        public void c(long j, long j2, boolean z) {
            if (z && C2666e.this.d != null) {
                C2666e.this.h.execute(new Runnable() { // from class: ax.o1.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2666e.this.g.e();
                    }
                });
            }
            C0912v c0912v = this.a;
            if (c0912v == null) {
                c0912v = new C0912v.b().P();
            }
            C2666e.this.i.g(j2, j, c0912v, null);
            ((S.b) C2666e.this.c.remove()).a(j);
        }
    }

    public C2666e(C2656A c2656a, InterfaceC0975h interfaceC0975h) {
        this.a = c2656a;
        c2656a.m(interfaceC0975h);
        this.b = new C2660E(new b(), c2656a);
        this.c = new ArrayDeque();
        this.e = new C0912v.b().P();
        this.f = -9223372036854775807L;
        this.g = S.a.a;
        this.h = new Executor() { // from class: ax.o1.b
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                C2666e.a(runnable);
            }
        };
        this.i = new z() { // from class: ax.o1.c
            @Override // ax.o1.z
            public final void g(long j, long j2, C0912v c0912v, MediaFormat mediaFormat) {
                C2666e.f(j, j2, c0912v, mediaFormat);
            }
        };
    }

    public static /* synthetic */ void a(Runnable runnable) {
    }

    public static /* synthetic */ void f(long j, long j2, C0912v c0912v, MediaFormat mediaFormat) {
    }

    @Override // ax.o1.S
    public void A() {
        this.a.a();
    }

    @Override // ax.o1.S
    public boolean b() {
        return true;
    }

    @Override // ax.o1.S
    public boolean c() {
        return this.b.d();
    }

    @Override // ax.o1.S
    public void g(float f) {
        this.a.p(f);
    }

    @Override // ax.o1.S
    public void h() {
        throw new UnsupportedOperationException();
    }

    @Override // ax.o1.S
    public void i(long j, long j2) throws S.c {
        try {
            this.b.j(j, j2);
        } catch (C0622s e) {
            throw new S.c(e, this.e);
        }
    }

    @Override // ax.o1.S
    public Surface j() {
        return (Surface) C0968a.i(this.d);
    }

    @Override // ax.o1.S
    public boolean k(long j, S.b bVar) {
        this.c.add(bVar);
        this.b.g(j);
        this.h.execute(new Runnable() { // from class: ax.o1.d
            @Override // java.lang.Runnable
            public final void run() {
                C2666e.this.g.b();
            }
        });
        return true;
    }

    @Override // ax.o1.S
    public void l() {
        this.a.i();
    }

    @Override // ax.o1.S
    public void m(S.a aVar, Executor executor) {
        this.g = aVar;
        this.h = executor;
    }

    @Override // ax.o1.S
    public void n() {
        this.a.h();
    }

    @Override // ax.o1.S
    public void o(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // ax.o1.S
    public void p(z zVar) {
        this.i = zVar;
    }

    @Override // ax.o1.S
    public void q() {
        this.b.l();
    }

    @Override // ax.o1.S
    public void r(int i, C0912v c0912v, long j, int i2, List<Object> list) {
        C0968a.g(list.isEmpty());
        int i3 = c0912v.v;
        C0912v c0912v2 = this.e;
        if (i3 != c0912v2.v || c0912v.w != c0912v2.w) {
            this.b.i(i3, c0912v.w);
        }
        float f = c0912v.z;
        if (f != this.e.z) {
            this.a.n(f);
        }
        this.e = c0912v;
        if (j != this.f) {
            this.b.h(i2, j);
            this.f = j;
        }
    }

    @Override // ax.o1.S
    public void s(int i) {
        this.a.l(i);
    }

    @Override // ax.o1.S
    public void t(Surface surface, ax.S0.I i) {
        this.d = surface;
        this.a.o(surface);
    }

    @Override // ax.o1.S
    public void u() {
        this.d = null;
        this.a.o(null);
    }

    @Override // ax.o1.S
    public void v(boolean z) {
        if (z) {
            this.a.k();
        }
        this.b.b();
        this.c.clear();
    }

    @Override // ax.o1.S
    public void w(List<Object> list) {
        throw new UnsupportedOperationException();
    }

    @Override // ax.o1.S
    public void x(boolean z) {
        this.a.e(z);
    }

    @Override // ax.o1.S
    public boolean y(boolean z) {
        return this.a.d(z);
    }

    @Override // ax.o1.S
    public boolean z(C0912v c0912v) {
        return true;
    }

    @Override // ax.o1.S
    public void d() {
    }
}
