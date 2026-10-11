package ax.i1;

import android.os.Handler;
import ax.S0.C0968a;
import ax.b1.InterfaceC1471u;
import ax.i1.InterfaceC2209F;
import ax.i1.N;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: ax.i1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2218h<T> extends AbstractC2211a {
    private final HashMap<T, b<T>> h = new HashMap<>();
    private Handler i;
    private ax.U0.z j;

    /* renamed from: ax.i1.h$a */
    private final class a implements N, InterfaceC1471u {
        private final T a;
        private N.a b;
        private InterfaceC1471u.a c;

        public a(T t) {
            this.b = AbstractC2218h.this.u(null);
            this.c = AbstractC2218h.this.s(null);
            this.a = t;
        }

        private boolean a(int i, InterfaceC2209F.b bVar) {
            InterfaceC2209F.b bVar2;
            if (bVar != null) {
                bVar2 = AbstractC2218h.this.E(this.a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int G = AbstractC2218h.this.G(this.a, i);
            N.a aVar = this.b;
            if (aVar.a != G || !Objects.equals(aVar.b, bVar2)) {
                this.b = AbstractC2218h.this.t(G, bVar2);
            }
            InterfaceC1471u.a aVar2 = this.c;
            if (aVar2.a == G && Objects.equals(aVar2.b, bVar2)) {
                return true;
            }
            this.c = AbstractC2218h.this.r(G, bVar2);
            return true;
        }

        private C2205B c(C2205B c2205b, InterfaceC2209F.b bVar) {
            long F = AbstractC2218h.this.F(this.a, c2205b.f, bVar);
            long F2 = AbstractC2218h.this.F(this.a, c2205b.g, bVar);
            return (F == c2205b.f && F2 == c2205b.g) ? c2205b : new C2205B(c2205b.a, c2205b.b, c2205b.c, c2205b.d, c2205b.e, F, F2);
        }

        @Override // ax.b1.InterfaceC1471u
        public void G(int i, InterfaceC2209F.b bVar) {
            if (a(i, bVar)) {
                this.c.j();
            }
        }

        @Override // ax.i1.N
        public void K(int i, InterfaceC2209F.b bVar, C2234y c2234y, C2205B c2205b) {
            if (a(i, bVar)) {
                this.b.q(c2234y, c(c2205b, bVar));
            }
        }

        @Override // ax.b1.InterfaceC1471u
        public void M(int i, InterfaceC2209F.b bVar) {
            if (a(i, bVar)) {
                this.c.i();
            }
        }

        @Override // ax.b1.InterfaceC1471u
        public void V(int i, InterfaceC2209F.b bVar) {
            if (a(i, bVar)) {
                this.c.m();
            }
        }

        @Override // ax.i1.N
        public void X(int i, InterfaceC2209F.b bVar, C2205B c2205b) {
            if (a(i, bVar)) {
                this.b.k(c(c2205b, bVar));
            }
        }

        @Override // ax.i1.N
        public void e0(int i, InterfaceC2209F.b bVar, C2234y c2234y, C2205B c2205b) {
            if (a(i, bVar)) {
                this.b.n(c2234y, c(c2205b, bVar));
            }
        }

        @Override // ax.b1.InterfaceC1471u
        public void g0(int i, InterfaceC2209F.b bVar, int i2) {
            if (a(i, bVar)) {
                this.c.k(i2);
            }
        }

        @Override // ax.i1.N
        public void h0(int i, InterfaceC2209F.b bVar, C2234y c2234y, C2205B c2205b, IOException iOException, boolean z) {
            if (a(i, bVar)) {
                this.b.t(c2234y, c(c2205b, bVar), iOException, z);
            }
        }

        @Override // ax.b1.InterfaceC1471u
        public void l0(int i, InterfaceC2209F.b bVar, Exception exc) {
            if (a(i, bVar)) {
                this.c.l(exc);
            }
        }

        @Override // ax.b1.InterfaceC1471u
        public void n0(int i, InterfaceC2209F.b bVar) {
            if (a(i, bVar)) {
                this.c.h();
            }
        }

        @Override // ax.i1.N
        public void q0(int i, InterfaceC2209F.b bVar, C2205B c2205b) {
            if (a(i, bVar)) {
                this.b.z(c(c2205b, bVar));
            }
        }

        @Override // ax.i1.N
        public void s0(int i, InterfaceC2209F.b bVar, C2234y c2234y, C2205B c2205b, int i2) {
            if (a(i, bVar)) {
                this.b.w(c2234y, c(c2205b, bVar), i2);
            }
        }
    }

    /* renamed from: ax.i1.h$b */
    private static final class b<T> {
        public final InterfaceC2209F a;
        public final InterfaceC2209F.c b;
        public final AbstractC2218h<T>.a c;

        public b(InterfaceC2209F interfaceC2209F, InterfaceC2209F.c cVar, AbstractC2218h<T>.a aVar) {
            this.a = interfaceC2209F;
            this.b = cVar;
            this.c = aVar;
        }
    }

    protected AbstractC2218h() {
    }

    @Override // ax.i1.AbstractC2211a
    protected void A(ax.U0.z zVar) {
        this.j = zVar;
        this.i = ax.S0.d0.A();
    }

    @Override // ax.i1.AbstractC2211a
    protected void C() {
        for (b<T> bVar : this.h.values()) {
            bVar.a.b(bVar.b);
            bVar.a.g(bVar.c);
            bVar.a.n(bVar.c);
        }
        this.h.clear();
    }

    protected abstract InterfaceC2209F.b E(T t, InterfaceC2209F.b bVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void H(T t, InterfaceC2209F interfaceC2209F, ax.P0.N n);

    protected final void I(final T t, InterfaceC2209F interfaceC2209F) {
        C0968a.a(!this.h.containsKey(t));
        InterfaceC2209F.c cVar = new InterfaceC2209F.c() { // from class: ax.i1.g
            @Override // ax.i1.InterfaceC2209F.c
            public final void a(InterfaceC2209F interfaceC2209F2, ax.P0.N n) {
                AbstractC2218h.this.H(t, interfaceC2209F2, n);
            }
        };
        a aVar = new a(t);
        this.h.put(t, new b<>(interfaceC2209F, cVar, aVar));
        interfaceC2209F.c((Handler) C0968a.e(this.i), aVar);
        interfaceC2209F.p((Handler) C0968a.e(this.i), aVar);
        interfaceC2209F.l(cVar, this.j, x());
        if (y()) {
            return;
        }
        interfaceC2209F.q(cVar);
    }

    @Override // ax.i1.InterfaceC2209F
    public void k() throws IOException {
        Iterator<b<T>> it = this.h.values().iterator();
        while (it.hasNext()) {
            it.next().a.k();
        }
    }

    @Override // ax.i1.AbstractC2211a
    protected void v() {
        for (b<T> bVar : this.h.values()) {
            bVar.a.q(bVar.b);
        }
    }

    @Override // ax.i1.AbstractC2211a
    protected void w() {
        for (b<T> bVar : this.h.values()) {
            bVar.a.d(bVar.b);
        }
    }

    protected int G(T t, int i) {
        return i;
    }

    protected long F(T t, long j, InterfaceC2209F.b bVar) {
        return j;
    }
}
