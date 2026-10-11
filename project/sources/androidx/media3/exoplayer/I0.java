package androidx.media3.exoplayer;

import android.util.Pair;
import ax.P0.C0915y;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.S0.InterfaceC0984q;
import ax.Y0.AbstractC1175a;
import ax.Z0.I1;
import ax.Z0.InterfaceC1200a;
import ax.b1.InterfaceC1471u;
import ax.i1.C2204A;
import ax.i1.C2205B;
import ax.i1.C2234y;
import ax.i1.C2235z;
import ax.i1.InterfaceC2206C;
import ax.i1.InterfaceC2209F;
import ax.i1.g0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class I0 {
    private final I1 a;
    private final d e;
    private final InterfaceC1200a h;
    private final InterfaceC0984q i;
    private boolean k;
    private ax.U0.z l;
    private ax.i1.g0 j = new g0.a(0);
    private final IdentityHashMap<InterfaceC2206C, c> c = new IdentityHashMap<>();
    private final Map<Object, c> d = new HashMap();
    private final List<c> b = new ArrayList();
    private final HashMap<c, b> f = new HashMap<>();
    private final Set<c> g = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements ax.i1.N, InterfaceC1471u {
        private final c a;

        public a(c cVar) {
            this.a = cVar;
        }

        private Pair<Integer, InterfaceC2209F.b> I(int i, InterfaceC2209F.b bVar) {
            InterfaceC2209F.b bVar2 = null;
            if (bVar != null) {
                InterfaceC2209F.b n = I0.n(this.a, bVar);
                if (n == null) {
                    return null;
                }
                bVar2 = n;
            }
            return Pair.create(Integer.valueOf(I0.s(this.a, i)), bVar2);
        }

        @Override // ax.b1.InterfaceC1471u
        public void G(int i, InterfaceC2209F.b bVar) {
            final Pair<Integer, InterfaceC2209F.b> I = I(i, bVar);
            if (I != null) {
                I0.this.i.c(new Runnable() { // from class: androidx.media3.exoplayer.D0
                    @Override // java.lang.Runnable
                    public final void run() {
                        I0.this.h.G(((Integer) r1.first).intValue(), (InterfaceC2209F.b) I.second);
                    }
                });
            }
        }

        @Override // ax.i1.N
        public void K(int i, InterfaceC2209F.b bVar, final C2234y c2234y, final C2205B c2205b) {
            final Pair<Integer, InterfaceC2209F.b> I = I(i, bVar);
            if (I != null) {
                I0.this.i.c(new Runnable() { // from class: androidx.media3.exoplayer.F0
                    @Override // java.lang.Runnable
                    public final void run() {
                        I0.this.h.K(((Integer) r1.first).intValue(), (InterfaceC2209F.b) I.second, c2234y, c2205b);
                    }
                });
            }
        }

        @Override // ax.b1.InterfaceC1471u
        public void M(int i, InterfaceC2209F.b bVar) {
            final Pair<Integer, InterfaceC2209F.b> I = I(i, bVar);
            if (I != null) {
                I0.this.i.c(new Runnable() { // from class: androidx.media3.exoplayer.A0
                    @Override // java.lang.Runnable
                    public final void run() {
                        I0.this.h.M(((Integer) r1.first).intValue(), (InterfaceC2209F.b) I.second);
                    }
                });
            }
        }

        @Override // ax.b1.InterfaceC1471u
        public void V(int i, InterfaceC2209F.b bVar) {
            final Pair<Integer, InterfaceC2209F.b> I = I(i, bVar);
            if (I != null) {
                I0.this.i.c(new Runnable() { // from class: androidx.media3.exoplayer.E0
                    @Override // java.lang.Runnable
                    public final void run() {
                        I0.this.h.V(((Integer) r1.first).intValue(), (InterfaceC2209F.b) I.second);
                    }
                });
            }
        }

        @Override // ax.i1.N
        public void X(int i, InterfaceC2209F.b bVar, final C2205B c2205b) {
            final Pair<Integer, InterfaceC2209F.b> I = I(i, bVar);
            if (I != null) {
                I0.this.i.c(new Runnable() { // from class: androidx.media3.exoplayer.C0
                    @Override // java.lang.Runnable
                    public final void run() {
                        I0.this.h.X(((Integer) r1.first).intValue(), (InterfaceC2209F.b) I.second, c2205b);
                    }
                });
            }
        }

        @Override // ax.i1.N
        public void e0(int i, InterfaceC2209F.b bVar, final C2234y c2234y, final C2205B c2205b) {
            final Pair<Integer, InterfaceC2209F.b> I = I(i, bVar);
            if (I != null) {
                I0.this.i.c(new Runnable() { // from class: androidx.media3.exoplayer.z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        I0.this.h.e0(((Integer) r1.first).intValue(), (InterfaceC2209F.b) I.second, c2234y, c2205b);
                    }
                });
            }
        }

        @Override // ax.b1.InterfaceC1471u
        public void g0(int i, InterfaceC2209F.b bVar, final int i2) {
            final Pair<Integer, InterfaceC2209F.b> I = I(i, bVar);
            if (I != null) {
                I0.this.i.c(new Runnable() { // from class: androidx.media3.exoplayer.G0
                    @Override // java.lang.Runnable
                    public final void run() {
                        I0.this.h.g0(((Integer) r1.first).intValue(), (InterfaceC2209F.b) I.second, i2);
                    }
                });
            }
        }

        @Override // ax.i1.N
        public void h0(int i, InterfaceC2209F.b bVar, final C2234y c2234y, final C2205B c2205b, final IOException iOException, final boolean z) {
            final Pair<Integer, InterfaceC2209F.b> I = I(i, bVar);
            if (I != null) {
                I0.this.i.c(new Runnable() { // from class: androidx.media3.exoplayer.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        I0.this.h.h0(((Integer) r1.first).intValue(), (InterfaceC2209F.b) I.second, c2234y, c2205b, iOException, z);
                    }
                });
            }
        }

        @Override // ax.b1.InterfaceC1471u
        public void l0(int i, InterfaceC2209F.b bVar, final Exception exc) {
            final Pair<Integer, InterfaceC2209F.b> I = I(i, bVar);
            if (I != null) {
                I0.this.i.c(new Runnable() { // from class: androidx.media3.exoplayer.B0
                    @Override // java.lang.Runnable
                    public final void run() {
                        I0.this.h.l0(((Integer) r1.first).intValue(), (InterfaceC2209F.b) I.second, exc);
                    }
                });
            }
        }

        @Override // ax.b1.InterfaceC1471u
        public void n0(int i, InterfaceC2209F.b bVar) {
            final Pair<Integer, InterfaceC2209F.b> I = I(i, bVar);
            if (I != null) {
                I0.this.i.c(new Runnable() { // from class: androidx.media3.exoplayer.H0
                    @Override // java.lang.Runnable
                    public final void run() {
                        I0.this.h.n0(((Integer) r1.first).intValue(), (InterfaceC2209F.b) I.second);
                    }
                });
            }
        }

        @Override // ax.i1.N
        public void q0(int i, InterfaceC2209F.b bVar, final C2205B c2205b) {
            final Pair<Integer, InterfaceC2209F.b> I = I(i, bVar);
            if (I != null) {
                I0.this.i.c(new Runnable() { // from class: androidx.media3.exoplayer.w0
                    @Override // java.lang.Runnable
                    public final void run() {
                        I0.this.h.q0(((Integer) r1.first).intValue(), (InterfaceC2209F.b) C0968a.e((InterfaceC2209F.b) I.second), c2205b);
                    }
                });
            }
        }

        @Override // ax.i1.N
        public void s0(int i, InterfaceC2209F.b bVar, final C2234y c2234y, final C2205B c2205b, final int i2) {
            final Pair<Integer, InterfaceC2209F.b> I = I(i, bVar);
            if (I != null) {
                I0.this.i.c(new Runnable() { // from class: androidx.media3.exoplayer.x0
                    @Override // java.lang.Runnable
                    public final void run() {
                        I0.this.h.s0(((Integer) r1.first).intValue(), (InterfaceC2209F.b) I.second, c2234y, c2205b, i2);
                    }
                });
            }
        }
    }

    private static final class b {
        public final InterfaceC2209F a;
        public final InterfaceC2209F.c b;
        public final a c;

        public b(InterfaceC2209F interfaceC2209F, InterfaceC2209F.c cVar, a aVar) {
            this.a = interfaceC2209F;
            this.b = cVar;
            this.c = aVar;
        }
    }

    static final class c implements InterfaceC0627u0 {
        public final C2204A a;
        public int d;
        public boolean e;
        public final List<InterfaceC2209F.b> c = new ArrayList();
        public final Object b = new Object();

        public c(InterfaceC2209F interfaceC2209F, boolean z) {
            this.a = new C2204A(interfaceC2209F, z);
        }

        public void a(int i) {
            this.d = i;
            this.e = false;
            this.c.clear();
        }

        @Override // androidx.media3.exoplayer.InterfaceC0627u0
        public Object q() {
            return this.b;
        }

        @Override // androidx.media3.exoplayer.InterfaceC0627u0
        public ax.P0.N r() {
            return this.a.W();
        }
    }

    public interface d {
        void e();
    }

    public I0(d dVar, InterfaceC1200a interfaceC1200a, InterfaceC0984q interfaceC0984q, I1 i1) {
        this.a = i1;
        this.e = dVar;
        this.h = interfaceC1200a;
        this.i = interfaceC0984q;
    }

    private void B(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            c remove = this.b.remove(i3);
            this.d.remove(remove.b);
            g(i3, -remove.a.W().p());
            remove.e = true;
            if (this.k) {
                u(remove);
            }
        }
    }

    private void g(int i, int i2) {
        while (i < this.b.size()) {
            this.b.get(i).d += i2;
            i++;
        }
    }

    private void j(c cVar) {
        b bVar = this.f.get(cVar);
        if (bVar != null) {
            bVar.a.q(bVar.b);
        }
    }

    private void k() {
        Iterator<c> it = this.g.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.c.isEmpty()) {
                j(next);
                it.remove();
            }
        }
    }

    private void l(c cVar) {
        this.g.add(cVar);
        b bVar = this.f.get(cVar);
        if (bVar != null) {
            bVar.a.d(bVar.b);
        }
    }

    private static Object m(Object obj) {
        return AbstractC1175a.v(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC2209F.b n(c cVar, InterfaceC2209F.b bVar) {
        for (int i = 0; i < cVar.c.size(); i++) {
            if (cVar.c.get(i).d == bVar.d) {
                return bVar.a(p(cVar, bVar.a));
            }
        }
        return null;
    }

    private static Object o(Object obj) {
        return AbstractC1175a.w(obj);
    }

    private static Object p(c cVar, Object obj) {
        return AbstractC1175a.y(cVar.b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s(c cVar, int i) {
        return i + cVar.d;
    }

    private void u(c cVar) {
        if (cVar.e && cVar.c.isEmpty()) {
            b bVar = (b) C0968a.e(this.f.remove(cVar));
            bVar.a.b(bVar.b);
            bVar.a.g(bVar.c);
            bVar.a.n(bVar.c);
            this.g.remove(cVar);
        }
    }

    private void x(c cVar) {
        C2204A c2204a = cVar.a;
        InterfaceC2209F.c cVar2 = new InterfaceC2209F.c() { // from class: androidx.media3.exoplayer.v0
            @Override // ax.i1.InterfaceC2209F.c
            public final void a(InterfaceC2209F interfaceC2209F, ax.P0.N n) {
                I0.this.e.e();
            }
        };
        a aVar = new a(cVar);
        this.f.put(cVar, new b(c2204a, cVar2, aVar));
        c2204a.c(ax.S0.d0.C(), aVar);
        c2204a.p(ax.S0.d0.C(), aVar);
        c2204a.l(cVar2, this.l, this.a);
    }

    public ax.P0.N A(int i, int i2, ax.i1.g0 g0Var) {
        C0968a.a(i >= 0 && i <= i2 && i2 <= r());
        this.j = g0Var;
        B(i, i2);
        return i();
    }

    public ax.P0.N C(List<c> list, ax.i1.g0 g0Var) {
        B(0, this.b.size());
        return f(this.b.size(), list, g0Var);
    }

    public ax.P0.N D(ax.i1.g0 g0Var) {
        int r = r();
        if (g0Var.getLength() != r) {
            g0Var = g0Var.g().e(0, r);
        }
        this.j = g0Var;
        return i();
    }

    public ax.P0.N E(int i, int i2, List<C0915y> list) {
        C0968a.a(i >= 0 && i <= i2 && i2 <= r());
        C0968a.a(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            this.b.get(i3).a.a(list.get(i3 - i));
        }
        return i();
    }

    public ax.P0.N f(int i, List<c> list, ax.i1.g0 g0Var) {
        if (!list.isEmpty()) {
            this.j = g0Var;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                c cVar = list.get(i2 - i);
                if (i2 > 0) {
                    c cVar2 = this.b.get(i2 - 1);
                    cVar.a(cVar2.d + cVar2.a.W().p());
                } else {
                    cVar.a(0);
                }
                g(i2, cVar.a.W().p());
                this.b.add(i2, cVar);
                this.d.put(cVar.b, cVar);
                if (this.k) {
                    x(cVar);
                    if (this.c.isEmpty()) {
                        this.g.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public InterfaceC2206C h(InterfaceC2209F.b bVar, ax.m1.b bVar2, long j) {
        Object o = o(bVar.a);
        InterfaceC2209F.b a2 = bVar.a(m(bVar.a));
        c cVar = (c) C0968a.e(this.d.get(o));
        l(cVar);
        cVar.c.add(a2);
        C2235z i = cVar.a.i(a2, bVar2, j);
        this.c.put(i, cVar);
        k();
        return i;
    }

    public ax.P0.N i() {
        if (this.b.isEmpty()) {
            return ax.P0.N.a;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            c cVar = this.b.get(i2);
            cVar.d = i;
            i += cVar.a.W().p();
        }
        return new L0(this.b, this.j);
    }

    public ax.i1.g0 q() {
        return this.j;
    }

    public int r() {
        return this.b.size();
    }

    public boolean t() {
        return this.k;
    }

    public ax.P0.N v(int i, int i2, int i3, ax.i1.g0 g0Var) {
        C0968a.a(i >= 0 && i <= i2 && i2 <= r() && i3 >= 0);
        this.j = g0Var;
        if (i == i2 || i == i3) {
            return i();
        }
        int min = Math.min(i, i3);
        int max = Math.max(((i2 - i) + i3) - 1, i2 - 1);
        int i4 = this.b.get(min).d;
        ax.S0.d0.Z0(this.b, i, i2, i3);
        while (min <= max) {
            c cVar = this.b.get(min);
            cVar.d = i4;
            i4 += cVar.a.W().p();
            min++;
        }
        return i();
    }

    public void w(ax.U0.z zVar) {
        C0968a.g(!this.k);
        this.l = zVar;
        for (int i = 0; i < this.b.size(); i++) {
            c cVar = this.b.get(i);
            x(cVar);
            this.g.add(cVar);
        }
        this.k = true;
    }

    public void y() {
        for (b bVar : this.f.values()) {
            try {
                bVar.a.b(bVar.b);
            } catch (RuntimeException e) {
                C0987u.d("MediaSourceList", "Failed to release child source.", e);
            }
            bVar.a.g(bVar.c);
            bVar.a.n(bVar.c);
        }
        this.f.clear();
        this.g.clear();
        this.k = false;
    }

    public void z(InterfaceC2206C interfaceC2206C) {
        c cVar = (c) C0968a.e(this.c.remove(interfaceC2206C));
        cVar.a.e(interfaceC2206C);
        cVar.c.remove(((C2235z) interfaceC2206C).q);
        if (!this.c.isEmpty()) {
            k();
        }
        u(cVar);
    }
}
