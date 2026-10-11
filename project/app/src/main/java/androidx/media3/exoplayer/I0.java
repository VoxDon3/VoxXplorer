/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.A0;
import androidx.media3.exoplayer.B0;
import androidx.media3.exoplayer.C0;
import androidx.media3.exoplayer.D0;
import androidx.media3.exoplayer.E0;
import androidx.media3.exoplayer.F0;
import androidx.media3.exoplayer.G0;
import androidx.media3.exoplayer.H0;
import androidx.media3.exoplayer.L0;
import androidx.media3.exoplayer.u0;
import androidx.media3.exoplayer.v0;
import androidx.media3.exoplayer.w0;
import androidx.media3.exoplayer.x0;
import androidx.media3.exoplayer.y0;
import androidx.media3.exoplayer.z0;
import ax.P0.y;
import ax.S0.d0;
import ax.S0.q;
import ax.S0.u;
import ax.U0.z;
import ax.Z0.I1;
import ax.i1.A;
import ax.i1.B;
import ax.i1.C;
import ax.i1.F;
import ax.i1.N;
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

final class I0 {
    private final I1 a;
    private final List<c> b;
    private final IdentityHashMap<C, c> c;
    private final Map<Object, c> d;
    private final d e;
    private final HashMap<c, b> f;
    private final Set<c> g;
    private final ax.Z0.a h;
    private final q i;
    private g0 j;
    private boolean k;
    private z l;

    public I0(d d8, ax.Z0.a a8, q q8, I1 i12) {
        this.a = i12;
        this.e = d8;
        this.j = new g0.a(0);
        this.c = new IdentityHashMap();
        this.d = new HashMap<Object, c>();
        this.b = new ArrayList<c>();
        this.h = a8;
        this.i = q8;
        this.f = new HashMap();
        this.g = new HashSet<c>();
    }

    private void B(int n8, int n9) {
        --n9;
        while (n9 >= n8) {
            c c8 = this.b.remove(n9);
            this.d.remove(c8.b);
            this.g(n9, -c8.a.W().p());
            c8.e = true;
            if (this.k) {
                this.u(c8);
            }
            --n9;
        }
    }

    public static /* synthetic */ void a(I0 i02, F f8, ax.P0.N n8) {
        i02.e.e();
    }

    private void g(int n8, int n9) {
        while (n8 < this.b.size()) {
            c c8 = this.b.get(n8);
            c8.d += n9;
            ++n8;
        }
    }

    private void j(c object) {
        if ((object = this.f.get(object)) != null) {
            ((b)object).a.q(((b)object).b);
        }
    }

    private void k() {
        Iterator<c> iterator = this.g.iterator();
        while (iterator.hasNext()) {
            c c8 = iterator.next();
            if (!c8.c.isEmpty()) continue;
            this.j(c8);
            iterator.remove();
        }
    }

    private void l(c object) {
        this.g.add((c)object);
        object = this.f.get(object);
        if (object != null) {
            ((b)object).a.d(((b)object).b);
        }
    }

    private static Object m(Object object) {
        return ax.Y0.a.v(object);
    }

    private static F.b n(c c8, F.b b8) {
        for (int i8 = 0; i8 < c8.c.size(); ++i8) {
            if (c8.c.get((int)i8).d != b8.d) continue;
            return b8.a(I0.p(c8, b8.a));
        }
        return null;
    }

    private static Object o(Object object) {
        return ax.Y0.a.w(object);
    }

    private static Object p(c c8, Object object) {
        return ax.Y0.a.y(c8.b, object);
    }

    private static int s(c c8, int n8) {
        return n8 + c8.d;
    }

    private void u(c c8) {
        if (c8.e && c8.c.isEmpty()) {
            b b8 = ax.S0.a.e(this.f.remove(c8));
            b8.a.b(b8.b);
            b8.a.g(b8.c);
            b8.a.n(b8.c);
            this.g.remove(c8);
        }
    }

    private void x(c c8) {
        A a8 = c8.a;
        v0 v02 = new v0(this);
        a a9 = new a(this, c8);
        this.f.put(c8, new b(a8, v02, a9));
        a8.c(d0.C(), a9);
        a8.p(d0.C(), a9);
        a8.l(v02, this.l, this.a);
    }

    public ax.P0.N A(int n8, int n9, g0 g02) {
        boolean bl = n8 >= 0 && n8 <= n9 && n9 <= this.r();
        ax.S0.a.a(bl);
        this.j = g02;
        this.B(n8, n9);
        return this.i();
    }

    public ax.P0.N C(List<c> list, g0 g02) {
        this.B(0, this.b.size());
        return this.f(this.b.size(), list, g02);
    }

    public ax.P0.N D(g0 g02) {
        int n8 = this.r();
        g0 g03 = g02;
        if (g02.getLength() != n8) {
            g03 = g02.g().e(0, n8);
        }
        this.j = g03;
        return this.i();
    }

    public ax.P0.N E(int n8, int n9, List<y> list) {
        boolean bl = false;
        boolean bl2 = n8 >= 0 && n8 <= n9 && n9 <= this.r();
        ax.S0.a.a(bl2);
        bl2 = bl;
        if (list.size() == n9 - n8) {
            bl2 = true;
        }
        ax.S0.a.a(bl2);
        for (int i8 = n8; i8 < n9; ++i8) {
            this.b.get((int)i8).a.a(list.get(i8 - n8));
        }
        return this.i();
    }

    public ax.P0.N f(int n8, List<c> list, g0 object) {
        if (!list.isEmpty()) {
            this.j = object;
            for (int i8 = n8; i8 < list.size() + n8; ++i8) {
                object = list.get(i8 - n8);
                if (i8 > 0) {
                    c c8 = this.b.get(i8 - 1);
                    ax.P0.N n9 = c8.a.W();
                    ((c)object).a(c8.d + n9.p());
                } else {
                    ((c)object).a(0);
                }
                this.g(i8, ((c)object).a.W().p());
                this.b.add(i8, (c)object);
                this.d.put(((c)object).b, (c)object);
                if (!this.k) continue;
                this.x((c)object);
                if (this.c.isEmpty()) {
                    this.g.add((c)object);
                    continue;
                }
                this.j((c)object);
            }
        }
        return this.i();
    }

    public C h(F.b object, ax.m1.b b8, long l8) {
        Object object2 = I0.o(((F.b)object).a);
        object = ((F.b)object).a(I0.m(((F.b)object).a));
        object2 = ax.S0.a.e(this.d.get(object2));
        this.l((c)object2);
        ((c)object2).c.add((F.b)object);
        object = ((c)object2).a.T((F.b)object, b8, l8);
        this.c.put((C)object, (c)object2);
        this.k();
        return object;
    }

    public ax.P0.N i() {
        if (this.b.isEmpty()) {
            return ax.P0.N.a;
        }
        int n8 = 0;
        for (int i8 = 0; i8 < this.b.size(); ++i8) {
            c c8 = this.b.get(i8);
            c8.d = n8;
            n8 += c8.a.W().p();
        }
        return new L0(this.b, this.j);
    }

    public g0 q() {
        return this.j;
    }

    public int r() {
        return this.b.size();
    }

    public boolean t() {
        return this.k;
    }

    public ax.P0.N v(int n8, int n9, int n10, g0 object) {
        boolean bl = n8 >= 0 && n8 <= n9 && n9 <= this.r() && n10 >= 0;
        ax.S0.a.a(bl);
        this.j = object;
        if (n8 != n9 && n8 != n10) {
            int n11 = Math.min(n8, n10);
            int n12 = Math.max(n9 - n8 + n10 - 1, n9 - 1);
            int n13 = this.b.get((int)n11).d;
            d0.Z0(this.b, n8, n9, n10);
            n9 = n13;
            for (n8 = n11; n8 <= n12; ++n8) {
                object = this.b.get(n8);
                ((c)object).d = n9;
                n9 += ((c)object).a.W().p();
            }
            return this.i();
        }
        return this.i();
    }

    public void w(z object) {
        ax.S0.a.g(this.k ^ true);
        this.l = object;
        for (int i8 = 0; i8 < this.b.size(); ++i8) {
            object = this.b.get(i8);
            this.x((c)object);
            this.g.add((c)object);
        }
        this.k = true;
    }

    public void y() {
        for (b b8 : this.f.values()) {
            try {
                b8.a.b(b8.b);
            }
            catch (RuntimeException runtimeException) {
                u.d("MediaSourceList", "Failed to release child source.", runtimeException);
            }
            b8.a.g(b8.c);
            b8.a.n(b8.c);
        }
        this.f.clear();
        this.g.clear();
        this.k = false;
    }

    public void z(C c8) {
        c c9 = ax.S0.a.e(this.c.remove(c8));
        c9.a.e(c8);
        c9.c.remove(((ax.i1.z)c8).q);
        if (!this.c.isEmpty()) {
            this.k();
        }
        this.u(c9);
    }

    private final class a
    implements N,
    ax.b1.u {
        private final c a;
        final I0 b;

        public a(I0 i02, c c8) {
            this.b = i02;
            this.a = c8;
        }

        public static /* synthetic */ void D(a a8, Pair pair) {
            a8.b.h.n0((Integer)pair.first, (F.b)pair.second);
        }

        public static /* synthetic */ void E(a a8, Pair pair, Exception exception) {
            a8.b.h.l0((Integer)pair.first, (F.b)pair.second, exception);
        }

        public static /* synthetic */ void F(a a8, Pair pair, B b8) {
            a8.b.h.X((Integer)pair.first, (F.b)pair.second, b8);
        }

        public static /* synthetic */ void H(a a8, Pair pair, ax.i1.y y8, B b8, int n8) {
            a8.b.h.s0((Integer)pair.first, (F.b)pair.second, y8, b8, n8);
        }

        private Pair<Integer, F.b> I(int n8, F.b b8) {
            F.b b9 = null;
            if (b8 != null && (b9 = I0.n(this.a, b8)) == null) {
                return null;
            }
            return Pair.create((Object)I0.s(this.a, n8), (Object)b9);
        }

        public static /* synthetic */ void a(a a8, Pair pair, int n8) {
            a8.b.h.g0((Integer)pair.first, (F.b)pair.second, n8);
        }

        public static /* synthetic */ void c(a a8, Pair pair) {
            a8.b.h.M((Integer)pair.first, (F.b)pair.second);
        }

        public static /* synthetic */ void e(a a8, Pair pair, ax.i1.y y8, B b8) {
            a8.b.h.e0((Integer)pair.first, (F.b)pair.second, y8, b8);
        }

        public static /* synthetic */ void j(a a8, Pair pair) {
            a8.b.h.V((Integer)pair.first, (F.b)pair.second);
        }

        public static /* synthetic */ void r(a a8, Pair pair, B b8) {
            a8.b.h.q0((Integer)pair.first, ax.S0.a.e((F.b)pair.second), b8);
        }

        public static /* synthetic */ void s(a a8, Pair pair, ax.i1.y y8, B b8) {
            a8.b.h.K((Integer)pair.first, (F.b)pair.second, y8, b8);
        }

        public static /* synthetic */ void t(a a8, Pair pair, ax.i1.y y8, B b8, IOException iOException, boolean bl) {
            a8.b.h.h0((Integer)pair.first, (F.b)pair.second, y8, b8, iOException, bl);
        }

        public static /* synthetic */ void v(a a8, Pair pair) {
            a8.b.h.G((Integer)pair.first, (F.b)pair.second);
        }

        @Override
        public void G(int n8, F.b pair) {
            if ((pair = this.I(n8, (F.b)pair)) != null) {
                this.b.i.c(new D0(this, pair));
            }
        }

        @Override
        public void K(int n8, F.b pair, ax.i1.y y8, B b8) {
            if ((pair = this.I(n8, (F.b)pair)) != null) {
                this.b.i.c(new F0(this, pair, y8, b8));
            }
        }

        @Override
        public void M(int n8, F.b pair) {
            if ((pair = this.I(n8, (F.b)pair)) != null) {
                this.b.i.c(new A0(this, pair));
            }
        }

        @Override
        public void V(int n8, F.b pair) {
            if ((pair = this.I(n8, (F.b)pair)) != null) {
                this.b.i.c(new E0(this, pair));
            }
        }

        @Override
        public void X(int n8, F.b pair, B b8) {
            if ((pair = this.I(n8, (F.b)pair)) != null) {
                this.b.i.c(new C0(this, pair, b8));
            }
        }

        @Override
        public void e0(int n8, F.b pair, ax.i1.y y8, B b8) {
            if ((pair = this.I(n8, (F.b)pair)) != null) {
                this.b.i.c(new z0(this, pair, y8, b8));
            }
        }

        @Override
        public void g0(int n8, F.b pair, int n9) {
            if ((pair = this.I(n8, (F.b)pair)) != null) {
                this.b.i.c(new G0(this, pair, n9));
            }
        }

        @Override
        public void h0(int n8, F.b pair, ax.i1.y y8, B b8, IOException iOException, boolean bl) {
            if ((pair = this.I(n8, (F.b)pair)) != null) {
                this.b.i.c(new y0(this, pair, y8, b8, iOException, bl));
            }
        }

        @Override
        public void l0(int n8, F.b pair, Exception exception) {
            if ((pair = this.I(n8, (F.b)pair)) != null) {
                this.b.i.c(new B0(this, pair, exception));
            }
        }

        @Override
        public void n0(int n8, F.b pair) {
            if ((pair = this.I(n8, (F.b)pair)) != null) {
                this.b.i.c(new H0(this, pair));
            }
        }

        @Override
        public void q0(int n8, F.b pair, B b8) {
            if ((pair = this.I(n8, (F.b)pair)) != null) {
                this.b.i.c(new w0(this, pair, b8));
            }
        }

        @Override
        public void s0(int n8, F.b pair, ax.i1.y y8, B b8, int n9) {
            if ((pair = this.I(n8, (F.b)pair)) != null) {
                this.b.i.c(new x0(this, pair, y8, b8, n9));
            }
        }
    }

    private static final class b {
        public final F a;
        public final F.c b;
        public final a c;

        public b(F f8, F.c c8, a a8) {
            this.a = f8;
            this.b = c8;
            this.c = a8;
        }
    }

    static final class c
    implements u0 {
        public final A a;
        public final Object b;
        public final List<F.b> c;
        public int d;
        public boolean e;

        public c(F f8, boolean bl) {
            this.a = new A(f8, bl);
            this.c = new ArrayList<F.b>();
            this.b = new Object();
        }

        public void a(int n8) {
            this.d = n8;
            this.e = false;
            this.c.clear();
        }

        @Override
        public Object q() {
            return this.b;
        }

        @Override
        public ax.P0.N r() {
            return this.a.W();
        }
    }

    public static interface d {
        public void e();
    }
}

