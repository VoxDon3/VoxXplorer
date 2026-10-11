package ax.o1;

import android.os.Handler;
import android.os.SystemClock;
import ax.P0.C0912v;
import ax.P0.a0;
import ax.S0.C0968a;
import ax.S0.d0;
import ax.Y0.C1176b;
import ax.Y0.C1177c;
import ax.o1.P;

/* loaded from: classes.dex */
public interface P {

    public static final class a {
        private final Handler a;
        private final P b;

        public a(Handler handler, P p) {
            this.a = p != null ? (Handler) C0968a.e(handler) : null;
            this.b = p;
        }

        public static /* synthetic */ void d(a aVar, C1176b c1176b) {
            aVar.getClass();
            c1176b.c();
            ((P) d0.i(aVar.b)).m(c1176b);
        }

        public void k(final String str, final long j, final long j2) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ax.o1.F
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((P) d0.i(P.a.this.b)).k(str, j, j2);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ax.o1.J
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((P) d0.i(P.a.this.b)).i(str);
                    }
                });
            }
        }

        public void m(final C1176b c1176b) {
            c1176b.c();
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ax.o1.O
                    @Override // java.lang.Runnable
                    public final void run() {
                        P.a.d(P.a.this, c1176b);
                    }
                });
            }
        }

        public void n(final int i, final long j) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ax.o1.K
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((P) d0.i(P.a.this.b)).p(i, j);
                    }
                });
            }
        }

        public void o(final C1176b c1176b) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ax.o1.M
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((P) d0.i(P.a.this.b)).B(c1176b);
                    }
                });
            }
        }

        public void p(final C0912v c0912v, final C1177c c1177c) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ax.o1.N
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((P) d0.i(P.a.this.b)).h(c0912v, c1177c);
                    }
                });
            }
        }

        public void q(final Object obj) {
            if (this.a != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                this.a.post(new Runnable() { // from class: ax.o1.H
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((P) d0.i(P.a.this.b)).q(obj, elapsedRealtime);
                    }
                });
            }
        }

        public void r(final long j, final int i) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ax.o1.L
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((P) d0.i(P.a.this.b)).C(j, i);
                    }
                });
            }
        }

        public void s(final Exception exc) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ax.o1.I
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((P) d0.i(P.a.this.b)).z(exc);
                    }
                });
            }
        }

        public void t(final a0 a0Var) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ax.o1.G
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((P) d0.i(P.a.this.b)).a(a0Var);
                    }
                });
            }
        }
    }

    void B(C1176b c1176b);

    void C(long j, int i);

    void a(a0 a0Var);

    void h(C0912v c0912v, C1177c c1177c);

    void i(String str);

    void k(String str, long j, long j2);

    void m(C1176b c1176b);

    void p(int i, long j);

    void q(Object obj, long j);

    void z(Exception exc);
}
