package ax.b1;

import android.os.Handler;
import ax.S0.C0968a;
import ax.S0.d0;
import ax.b1.InterfaceC1471u;
import ax.i1.InterfaceC2209F;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ax.b1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1471u {

    /* renamed from: ax.b1.u$a */
    public static class a {
        public final int a;
        public final InterfaceC2209F.b b;
        private final CopyOnWriteArrayList<C0257a> c;

        /* renamed from: ax.b1.u$a$a, reason: collision with other inner class name */
        private static final class C0257a {
            public Handler a;
            public InterfaceC1471u b;

            public C0257a(Handler handler, InterfaceC1471u interfaceC1471u) {
                this.a = handler;
                this.b = interfaceC1471u;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void g(Handler handler, InterfaceC1471u interfaceC1471u) {
            C0968a.e(handler);
            C0968a.e(interfaceC1471u);
            this.c.add(new C0257a(handler, interfaceC1471u));
        }

        public void h() {
            Iterator<C0257a> it = this.c.iterator();
            while (it.hasNext()) {
                C0257a next = it.next();
                final InterfaceC1471u interfaceC1471u = next.b;
                d0.j1(next.a, new Runnable() { // from class: ax.b1.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC1471u.n0(r0.a, InterfaceC1471u.a.this.b);
                    }
                });
            }
        }

        public void i() {
            Iterator<C0257a> it = this.c.iterator();
            while (it.hasNext()) {
                C0257a next = it.next();
                final InterfaceC1471u interfaceC1471u = next.b;
                d0.j1(next.a, new Runnable() { // from class: ax.b1.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC1471u.M(r0.a, InterfaceC1471u.a.this.b);
                    }
                });
            }
        }

        public void j() {
            Iterator<C0257a> it = this.c.iterator();
            while (it.hasNext()) {
                C0257a next = it.next();
                final InterfaceC1471u interfaceC1471u = next.b;
                d0.j1(next.a, new Runnable() { // from class: ax.b1.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC1471u.G(r0.a, InterfaceC1471u.a.this.b);
                    }
                });
            }
        }

        public void k(final int i) {
            Iterator<C0257a> it = this.c.iterator();
            while (it.hasNext()) {
                C0257a next = it.next();
                final InterfaceC1471u interfaceC1471u = next.b;
                d0.j1(next.a, new Runnable() { // from class: ax.b1.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC1471u.g0(r0.a, InterfaceC1471u.a.this.b, i);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Iterator<C0257a> it = this.c.iterator();
            while (it.hasNext()) {
                C0257a next = it.next();
                final InterfaceC1471u interfaceC1471u = next.b;
                d0.j1(next.a, new Runnable() { // from class: ax.b1.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC1471u.l0(r0.a, InterfaceC1471u.a.this.b, exc);
                    }
                });
            }
        }

        public void m() {
            Iterator<C0257a> it = this.c.iterator();
            while (it.hasNext()) {
                C0257a next = it.next();
                final InterfaceC1471u interfaceC1471u = next.b;
                d0.j1(next.a, new Runnable() { // from class: ax.b1.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC1471u.V(r0.a, InterfaceC1471u.a.this.b);
                    }
                });
            }
        }

        public void n(InterfaceC1471u interfaceC1471u) {
            Iterator<C0257a> it = this.c.iterator();
            while (it.hasNext()) {
                C0257a next = it.next();
                if (next.b == interfaceC1471u) {
                    this.c.remove(next);
                }
            }
        }

        public a o(int i, InterfaceC2209F.b bVar) {
            return new a(this.c, i, bVar);
        }

        private a(CopyOnWriteArrayList<C0257a> copyOnWriteArrayList, int i, InterfaceC2209F.b bVar) {
            this.c = copyOnWriteArrayList;
            this.a = i;
            this.b = bVar;
        }
    }

    void G(int i, InterfaceC2209F.b bVar);

    void M(int i, InterfaceC2209F.b bVar);

    void V(int i, InterfaceC2209F.b bVar);

    void g0(int i, InterfaceC2209F.b bVar, int i2);

    void l0(int i, InterfaceC2209F.b bVar, Exception exc);

    void n0(int i, InterfaceC2209F.b bVar);
}
