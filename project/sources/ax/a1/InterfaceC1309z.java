package ax.a1;

import android.os.Handler;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.Y0.C1176b;
import ax.Y0.C1177c;
import ax.a1.InterfaceC1276B;
import ax.a1.InterfaceC1309z;

/* renamed from: ax.a1.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1309z {

    /* renamed from: ax.a1.z$a */
    public static final class a {
        private final Handler a;
        private final InterfaceC1309z b;

        public a(Handler handler, InterfaceC1309z interfaceC1309z) {
            this.a = interfaceC1309z != null ? (Handler) C0968a.e(handler) : null;
            this.b = interfaceC1309z;
        }

        public static /* synthetic */ void d(a aVar, C1176b c1176b) {
            aVar.getClass();
            c1176b.c();
            ((InterfaceC1309z) ax.S0.d0.i(aVar.b)).u(c1176b);
        }

        public void n(final Exception exc) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ax.a1.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1309z) ax.S0.d0.i(InterfaceC1309z.a.this.b)).y(exc);
                    }
                });
            }
        }

        public void o(final int i) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ax.a1.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1309z) ax.S0.d0.i(InterfaceC1309z.a.this.b)).c(i);
                    }
                });
            }
        }

        public void p(final Exception exc) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ax.a1.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1309z) ax.S0.d0.i(InterfaceC1309z.a.this.b)).f(exc);
                    }
                });
            }
        }

        public void q(final InterfaceC1276B.a aVar) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ax.a1.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1309z) ax.S0.d0.i(InterfaceC1309z.a.this.b)).g(aVar);
                    }
                });
            }
        }

        public void r(final InterfaceC1276B.a aVar) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ax.a1.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1309z) ax.S0.d0.i(InterfaceC1309z.a.this.b)).b(aVar);
                    }
                });
            }
        }

        public void s(final String str, final long j, final long j2) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ax.a1.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1309z) ax.S0.d0.i(InterfaceC1309z.a.this.b)).o(str, j, j2);
                    }
                });
            }
        }

        public void t(final String str) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ax.a1.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1309z) ax.S0.d0.i(InterfaceC1309z.a.this.b)).n(str);
                    }
                });
            }
        }

        public void u(final C1176b c1176b) {
            c1176b.c();
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ax.a1.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1309z.a.d(InterfaceC1309z.a.this, c1176b);
                    }
                });
            }
        }

        public void v(final C1176b c1176b) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ax.a1.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1309z) ax.S0.d0.i(InterfaceC1309z.a.this.b)).w(c1176b);
                    }
                });
            }
        }

        public void w(final C0912v c0912v, final C1177c c1177c) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ax.a1.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1309z) ax.S0.d0.i(InterfaceC1309z.a.this.b)).l(c0912v, c1177c);
                    }
                });
            }
        }

        public void x(final long j) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ax.a1.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1309z) ax.S0.d0.i(InterfaceC1309z.a.this.b)).x(j);
                    }
                });
            }
        }

        public void y(final boolean z) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ax.a1.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1309z) ax.S0.d0.i(InterfaceC1309z.a.this.b)).e(z);
                    }
                });
            }
        }

        public void z(final int i, final long j, final long j2) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ax.a1.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC1309z) ax.S0.d0.i(InterfaceC1309z.a.this.b)).A(i, j, j2);
                    }
                });
            }
        }
    }

    void A(int i, long j, long j2);

    void b(InterfaceC1276B.a aVar);

    void c(int i);

    void e(boolean z);

    void f(Exception exc);

    void g(InterfaceC1276B.a aVar);

    void l(C0912v c0912v, C1177c c1177c);

    void n(String str);

    void o(String str, long j, long j2);

    void u(C1176b c1176b);

    void w(C1176b c1176b);

    void x(long j);

    void y(Exception exc);
}
