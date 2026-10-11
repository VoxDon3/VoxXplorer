package ax.i1;

import android.os.Handler;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.InterfaceC0979l;
import ax.i1.InterfaceC2209F;
import ax.i1.N;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface N {

    public static class a {
        public final int a;
        public final InterfaceC2209F.b b;
        private final CopyOnWriteArrayList<C0331a> c;

        /* renamed from: ax.i1.N$a$a, reason: collision with other inner class name */
        private static final class C0331a {
            public Handler a;
            public N b;

            public C0331a(Handler handler, N n) {
                this.a = handler;
                this.b = n;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public a A(int i, InterfaceC2209F.b bVar) {
            return new a(this.c, i, bVar);
        }

        public void h(Handler handler, N n) {
            C0968a.e(handler);
            C0968a.e(n);
            this.c.add(new C0331a(handler, n));
        }

        public void i(final InterfaceC0979l<N> interfaceC0979l) {
            Iterator<C0331a> it = this.c.iterator();
            while (it.hasNext()) {
                C0331a next = it.next();
                final N n = next.b;
                ax.S0.d0.j1(next.a, new Runnable() { // from class: ax.i1.M
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC0979l.this.accept(n);
                    }
                });
            }
        }

        public void j(int i, C0912v c0912v, int i2, Object obj, long j) {
            k(new C2205B(1, i, c0912v, i2, obj, ax.S0.d0.E1(j), -9223372036854775807L));
        }

        public void k(final C2205B c2205b) {
            i(new InterfaceC0979l() { // from class: ax.i1.L
                @Override // ax.S0.InterfaceC0979l
                public final void accept(Object obj) {
                    N n = (N) obj;
                    n.X(r0.a, N.a.this.b, c2205b);
                }
            });
        }

        public void l(C2234y c2234y, int i) {
            m(c2234y, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void m(C2234y c2234y, int i, int i2, C0912v c0912v, int i3, Object obj, long j, long j2) {
            n(c2234y, new C2205B(i, i2, c0912v, i3, obj, ax.S0.d0.E1(j), ax.S0.d0.E1(j2)));
        }

        public void n(final C2234y c2234y, final C2205B c2205b) {
            i(new InterfaceC0979l() { // from class: ax.i1.J
                @Override // ax.S0.InterfaceC0979l
                public final void accept(Object obj) {
                    N n = (N) obj;
                    n.e0(r0.a, N.a.this.b, c2234y, c2205b);
                }
            });
        }

        public void o(C2234y c2234y, int i) {
            p(c2234y, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void p(C2234y c2234y, int i, int i2, C0912v c0912v, int i3, Object obj, long j, long j2) {
            q(c2234y, new C2205B(i, i2, c0912v, i3, obj, ax.S0.d0.E1(j), ax.S0.d0.E1(j2)));
        }

        public void q(final C2234y c2234y, final C2205B c2205b) {
            i(new InterfaceC0979l() { // from class: ax.i1.H
                @Override // ax.S0.InterfaceC0979l
                public final void accept(Object obj) {
                    N n = (N) obj;
                    n.K(r0.a, N.a.this.b, c2234y, c2205b);
                }
            });
        }

        public void r(C2234y c2234y, int i, int i2, C0912v c0912v, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
            t(c2234y, new C2205B(i, i2, c0912v, i3, obj, ax.S0.d0.E1(j), ax.S0.d0.E1(j2)), iOException, z);
        }

        public void s(C2234y c2234y, int i, IOException iOException, boolean z) {
            r(c2234y, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        }

        public void t(final C2234y c2234y, final C2205B c2205b, final IOException iOException, final boolean z) {
            i(new InterfaceC0979l() { // from class: ax.i1.I
                @Override // ax.S0.InterfaceC0979l
                public final void accept(Object obj) {
                    N n = (N) obj;
                    n.h0(r0.a, N.a.this.b, c2234y, c2205b, iOException, z);
                }
            });
        }

        public void u(C2234y c2234y, int i, int i2) {
            v(c2234y, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i2);
        }

        public void v(C2234y c2234y, int i, int i2, C0912v c0912v, int i3, Object obj, long j, long j2, int i4) {
            w(c2234y, new C2205B(i, i2, c0912v, i3, obj, ax.S0.d0.E1(j), ax.S0.d0.E1(j2)), i4);
        }

        public void w(final C2234y c2234y, final C2205B c2205b, final int i) {
            i(new InterfaceC0979l() { // from class: ax.i1.G
                @Override // ax.S0.InterfaceC0979l
                public final void accept(Object obj) {
                    N n = (N) obj;
                    n.s0(r0.a, N.a.this.b, c2234y, c2205b, i);
                }
            });
        }

        public void x(N n) {
            Iterator<C0331a> it = this.c.iterator();
            while (it.hasNext()) {
                C0331a next = it.next();
                if (next.b == n) {
                    this.c.remove(next);
                }
            }
        }

        public void y(int i, long j, long j2) {
            z(new C2205B(1, i, null, 3, null, ax.S0.d0.E1(j), ax.S0.d0.E1(j2)));
        }

        public void z(final C2205B c2205b) {
            final InterfaceC2209F.b bVar = (InterfaceC2209F.b) C0968a.e(this.b);
            i(new InterfaceC0979l() { // from class: ax.i1.K
                @Override // ax.S0.InterfaceC0979l
                public final void accept(Object obj) {
                    N n = (N) obj;
                    n.q0(N.a.this.a, bVar, c2205b);
                }
            });
        }

        private a(CopyOnWriteArrayList<C0331a> copyOnWriteArrayList, int i, InterfaceC2209F.b bVar) {
            this.c = copyOnWriteArrayList;
            this.a = i;
            this.b = bVar;
        }
    }

    void K(int i, InterfaceC2209F.b bVar, C2234y c2234y, C2205B c2205b);

    void X(int i, InterfaceC2209F.b bVar, C2205B c2205b);

    void e0(int i, InterfaceC2209F.b bVar, C2234y c2234y, C2205B c2205b);

    void h0(int i, InterfaceC2209F.b bVar, C2234y c2234y, C2205B c2205b, IOException iOException, boolean z);

    void q0(int i, InterfaceC2209F.b bVar, C2205B c2205b);

    void s0(int i, InterfaceC2209F.b bVar, C2234y c2234y, C2205B c2205b, int i2);
}
