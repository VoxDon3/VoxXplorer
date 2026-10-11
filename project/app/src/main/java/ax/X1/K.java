/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import ax.N1.t;
import ax.N1.u;
import ax.S0.F;
import ax.S0.G;
import ax.S0.d0;
import ax.X1.D;
import ax.X1.E;
import ax.X1.H;
import ax.X1.I;
import ax.X1.J;
import ax.X1.L;
import ax.X1.M;
import ax.X1.j;
import ax.X1.y;
import ax.q1.N;
import ax.q1.e;
import ax.q1.q;
import ax.q1.r;
import ax.q1.s;
import ax.q1.t;
import ax.q1.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class K
implements r {
    @Deprecated
    public static final x v = new J();
    private final int a;
    private final int b;
    private final int c;
    private final List<ax.S0.M> d;
    private final G e;
    private final SparseIntArray f;
    private final L.c g;
    private final t.a h;
    private final SparseArray<L> i;
    private final SparseBooleanArray j;
    private final SparseBooleanArray k;
    private final I l;
    private H m;
    private t n;
    private int o;
    private boolean p;
    private boolean q;
    private boolean r;
    private L s;
    private int t;
    private int u;

    public K(int n8, int n9, t.a object, ax.S0.M m8, L.c c8, int n10) {
        this.g = ax.S0.a.e(c8);
        this.c = n10;
        this.a = n8;
        this.b = n9;
        this.h = object;
        if (n8 != 1 && n8 != 2) {
            this.d = object = new ArrayList();
            object.add(m8);
        } else {
            this.d = Collections.singletonList(m8);
        }
        this.e = new G(new byte[9400], 0);
        this.j = new SparseBooleanArray();
        this.k = new SparseBooleanArray();
        this.i = new SparseArray();
        this.f = new SparseIntArray();
        this.l = new I(n10);
        this.n = ax.q1.t.a0;
        this.u = -1;
        this.A();
    }

    public K(int n8, t.a a8) {
        this(1, n8, a8, new ax.S0.M(0L), new j(0), 112800);
    }

    private void A() {
        this.j.clear();
        this.i.clear();
        SparseArray<L> sparseArray = this.g.a();
        int n8 = sparseArray.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            this.i.put(sparseArray.keyAt(i8), (Object)((L)sparseArray.valueAt(i8)));
        }
        this.i.put(0, (Object)new E(new a(this)));
        this.s = null;
    }

    private boolean B(int n8) {
        return this.a == 2 || this.p || !this.k.get(n8, false);
        {
        }
    }

    public static /* synthetic */ r[] g() {
        return new r[]{new K(1, t.a.a)};
    }

    static /* synthetic */ boolean l(K k8, boolean bl) {
        k8.p = bl;
        return bl;
    }

    static /* synthetic */ int m(K k8, int n8) {
        k8.o = n8;
        return n8;
    }

    static /* synthetic */ int n(K k8) {
        int n8 = k8.o;
        k8.o = n8 + 1;
        return n8;
    }

    static /* synthetic */ int q(K k8, int n8) {
        k8.u = n8;
        return n8;
    }

    static /* synthetic */ L s(K k8, L l8) {
        k8.s = l8;
        return l8;
    }

    private boolean x(s s8) throws IOException {
        int n8;
        byte[] byArray = this.e.f();
        if (9400 - this.e.g() < 188) {
            n8 = this.e.a();
            if (n8 > 0) {
                System.arraycopy(byArray, this.e.g(), byArray, 0, n8);
            }
            this.e.Z(byArray, n8);
        }
        while (this.e.a() < 188) {
            n8 = this.e.j();
            int n9 = s8.c(byArray, n8, 9400 - n8);
            if (n9 == -1) {
                return false;
            }
            this.e.a0(n8 + n9);
        }
        return true;
    }

    private int y() throws ax.P0.E {
        int n8 = this.e.g();
        int n9 = this.e.j();
        int n10 = M.a(this.e.f(), n8, n9);
        this.e.b0(n10);
        int n11 = n10 + 188;
        if (n11 > n9) {
            this.t = n10 = this.t + (n10 - n8);
            if (this.a == 2 && n10 > 376) {
                throw ax.P0.E.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
            return n11;
        }
        this.t = 0;
        return n11;
    }

    private void z(long l8) {
        if (!this.q) {
            this.q = true;
            if (this.l.b() != -9223372036854775807L) {
                H h8;
                this.m = h8 = new H(this.l.c(), this.l.b(), l8, this.u, this.c);
                this.n.h(h8.b());
                return;
            }
            this.n.h(new N.b(this.l.b()));
        }
    }

    @Override
    public void a(t t8) {
        t t9 = t8;
        if ((this.b & 1) == 0) {
            t9 = new u(t8, this.h);
        }
        this.n = t9;
    }

    @Override
    public void b(long l8, long l9) {
        int n8;
        Object object;
        boolean bl = this.a != 2;
        ax.S0.a.g(bl);
        int n9 = this.d.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            object = this.d.get(i8);
            n8 = ((ax.S0.M)object).f() == -9223372036854775807L ? 1 : 0;
            int n10 = n8;
            if (n8 == 0) {
                l8 = ((ax.S0.M)object).d();
                n10 = l8 != -9223372036854775807L && l8 != 0L && l8 != l9 ? 1 : 0;
            }
            if (n10 == 0) continue;
            ((ax.S0.M)object).i(l9);
        }
        if (l9 != 0L && (object = this.m) != null) {
            ((e)object).h(l9);
        }
        this.e.X(0);
        this.f.clear();
        for (n8 = 0; n8 < this.i.size(); ++n8) {
            ((L)this.i.valueAt(n8)).b();
        }
        this.t = 0;
    }

    @Override
    public boolean c(s s8) throws IOException {
        byte[] byArray = this.e.f();
        s8.p(byArray, 0, 940);
        block0: for (int i8 = 0; i8 < 188; ++i8) {
            for (int i9 = 0; i9 < 5; ++i9) {
                if (byArray[i9 * 188 + i8] == 71) continue;
                continue block0;
            }
            s8.n(i8);
            return true;
        }
        return false;
    }

    @Override
    public void d() {
    }

    @Override
    public /* synthetic */ r e() {
        return ax.q1.q.b(this);
    }

    @Override
    public int f(s object, ax.q1.M m8) throws IOException {
        int n8;
        int n9;
        long l8 = object.getLength();
        int n10 = this.a;
        int n11 = 0;
        boolean bl = n10 == 2;
        if (this.p) {
            H h8;
            if (l8 != -1L && !bl && !this.l.d()) {
                return this.l.e((s)object, m8, this.u);
            }
            this.z(l8);
            if (this.r) {
                this.r = false;
                this.b(0L, 0L);
                if (object.getPosition() != 0L) {
                    m8.a = 0L;
                    return 1;
                }
            }
            if ((h8 = this.m) != null && h8.d()) {
                return this.m.c((s)object, m8);
            }
        }
        if (!this.x((s)object)) {
            while (n11 < this.i.size()) {
                object = (L)this.i.valueAt(n11);
                if (object instanceof y && ((y)(object = (y)object)).d(bl)) {
                    ((y)object).c(new G(), 1);
                }
                ++n11;
            }
            return -1;
        }
        int n12 = this.y();
        if (n12 > (n9 = this.e.j())) {
            return 0;
        }
        int n13 = this.e.v();
        if ((0x800000 & n13) != 0) {
            this.e.b0(n12);
            return 0;
        }
        n11 = (0x400000 & n13) != 0 ? 1 : 0;
        int n14 = (0x1FFF00 & n13) >> 8;
        n10 = (n13 & 0x20) != 0 ? 1 : 0;
        object = (n13 & 0x10) != 0 ? (L)this.i.get(n14) : null;
        if (object == null) {
            this.e.b0(n12);
            return 0;
        }
        if (this.a != 2) {
            n8 = this.f.get(n14, (n13 &= 0xF) - 1);
            this.f.put(n14, n13);
            if (n8 == n13) {
                this.e.b0(n12);
                return 0;
            }
            if (n13 != (n8 + 1 & 0xF)) {
                object.b();
            }
        }
        n13 = n11;
        if (n10 != 0) {
            n8 = this.e.M();
            n10 = (this.e.M() & 0x40) != 0 ? 2 : 0;
            n13 = n11 | n10;
            this.e.c0(n8 - 1);
        }
        bl = this.p;
        if (this.B(n14)) {
            this.e.a0(n12);
            object.c(this.e, n13);
            this.e.a0(n9);
        }
        if (this.a != 2 && !bl && this.p && l8 != -1L) {
            this.r = true;
        }
        this.e.b0(n12);
        return 0;
    }

    public /* synthetic */ List k() {
        return ax.q1.q.a(this);
    }

    private class a
    implements D {
        private final F a;
        final K b;

        public a(K k8) {
            this.b = k8;
            this.a = new F(new byte[4]);
        }

        @Override
        public void a(ax.S0.M m8, t t8, L.d d8) {
        }

        @Override
        public void c(G g8) {
            if (g8.M() == 0 && (g8.M() & 0x80) != 0) {
                g8.c0(6);
                int n8 = g8.a() / 4;
                for (int i8 = 0; i8 < n8; ++i8) {
                    g8.p(this.a, 4);
                    int n9 = this.a.h(16);
                    this.a.r(3);
                    if (n9 == 0) {
                        this.a.r(13);
                        continue;
                    }
                    n9 = this.a.h(13);
                    if (this.b.i.get(n9) != null) continue;
                    this.b.i.put(n9, (Object)new E(new b(this.b, n9)));
                    K.n(this.b);
                }
                if (this.b.a != 2) {
                    this.b.i.remove(0);
                }
            }
        }
    }

    private class b
    implements D {
        private final F a;
        private final SparseArray<L> b;
        private final SparseIntArray c;
        private final int d;
        final K e;

        public b(K k8, int n8) {
            this.e = k8;
            this.a = new F(new byte[5]);
            this.b = new SparseArray();
            this.c = new SparseIntArray();
            this.d = n8;
        }

        /*
         * Enabled aggressive block sorting
         */
        private L.b b(G g8, int n8) {
            int n9 = g8.g();
            int n10 = n9 + n8;
            String string = null;
            Object object = null;
            n8 = -1;
            int n11 = 0;
            while (g8.g() < n10) {
                ArrayList<L.a> arrayList;
                String string2;
                int n12;
                int n13;
                block17: {
                    int n14;
                    block20: {
                        block21: {
                            block16: {
                                block19: {
                                    block15: {
                                        block18: {
                                            block14: {
                                                block13: {
                                                    n14 = g8.M();
                                                    n13 = g8.M();
                                                    n12 = g8.g() + n13;
                                                    if (n12 > n10) break;
                                                    if (n14 != 5) break block13;
                                                    long l8 = g8.O();
                                                    if (l8 == 1094921523L) break block14;
                                                    if (l8 == 1161904947L) break block15;
                                                    if (l8 == 1094921524L) break block16;
                                                    string2 = string;
                                                    n13 = n11;
                                                    arrayList = object;
                                                    if (l8 == 1212503619L) {
                                                        n8 = 36;
                                                        string2 = string;
                                                        n13 = n11;
                                                        arrayList = object;
                                                    }
                                                    break block17;
                                                }
                                                if (n14 != 106) break block18;
                                            }
                                            n8 = 129;
                                            string2 = string;
                                            n13 = n11;
                                            arrayList = object;
                                            break block17;
                                        }
                                        if (n14 != 122) break block19;
                                    }
                                    n8 = 135;
                                    string2 = string;
                                    n13 = n11;
                                    arrayList = object;
                                    break block17;
                                }
                                if (n14 != 127) break block20;
                                n14 = g8.M();
                                if (n14 != 21) break block21;
                            }
                            n8 = 172;
                            string2 = string;
                            n13 = n11;
                            arrayList = object;
                            break block17;
                        }
                        if (n14 == 14) {
                            n8 = 136;
                            string2 = string;
                            n13 = n11;
                            arrayList = object;
                            break block17;
                        } else {
                            string2 = string;
                            n13 = n11;
                            arrayList = object;
                            if (n14 == 33) {
                                n8 = 139;
                                string2 = string;
                                n13 = n11;
                                arrayList = object;
                            }
                        }
                        break block17;
                    }
                    if (n14 == 123) {
                        n8 = 138;
                        string2 = string;
                        n13 = n11;
                        arrayList = object;
                    } else if (n14 == 10) {
                        string2 = g8.J(3).trim();
                        n13 = g8.M();
                        arrayList = object;
                    } else if (n14 == 89) {
                        arrayList = new ArrayList<L.a>();
                        while (g8.g() < n12) {
                            string2 = g8.J(3).trim();
                            n8 = g8.M();
                            object = new byte[4];
                            g8.q((byte[])object, 0, 4);
                            arrayList.add(new L.a(string2, n8, (byte[])object));
                        }
                        n8 = 89;
                        string2 = string;
                        n13 = n11;
                    } else {
                        string2 = string;
                        n13 = n11;
                        arrayList = object;
                        if (n14 == 111) {
                            n8 = 257;
                            arrayList = object;
                            n13 = n11;
                            string2 = string;
                        }
                    }
                }
                g8.c0(n12 - g8.g());
                string = string2;
                n11 = n13;
                object = arrayList;
            }
            g8.b0(n10);
            return new L.b(n8, string, n11, (List<L.a>)object, Arrays.copyOfRange(g8.f(), n9, n10));
        }

        @Override
        public void a(ax.S0.M m8, t t8, L.d d8) {
        }

        @Override
        public void c(G object) {
            block17: {
                int n8;
                int n9;
                int n10;
                Object object2;
                ax.S0.M m8;
                if (((G)object).M() != 2) break block17;
                if (this.e.a != 1 && this.e.a != 2 && this.e.o != 1) {
                    m8 = new ax.S0.M(((ax.S0.M)this.e.d.get(0)).d());
                    this.e.d.add(m8);
                } else {
                    m8 = (ax.S0.M)this.e.d.get(0);
                }
                if ((((G)object).M() & 0x80) == 0) break block17;
                ((G)object).c0(1);
                int n11 = ((G)object).U();
                ((G)object).c0(3);
                ((G)object).p(this.a, 2);
                this.a.r(3);
                K.q(this.e, this.a.h(13));
                ((G)object).p(this.a, 2);
                this.a.r(4);
                ((G)object).c0(this.a.h(12));
                if (this.e.a == 2 && this.e.s == null) {
                    object2 = new L.b(21, null, 0, null, d0.f);
                    K k8 = this.e;
                    K.s(k8, k8.g.b(21, (L.b)object2));
                    if (this.e.s != null) {
                        this.e.s.a(m8, this.e.n, new L.d(n11, 21, 8192));
                    }
                }
                this.b.clear();
                this.c.clear();
                int n12 = ((G)object).a();
                while (n12 > 0) {
                    int n13;
                    block19: {
                        block18: {
                            ((G)object).p(this.a, 5);
                            n10 = this.a.h(8);
                            this.a.r(3);
                            n9 = this.a.h(13);
                            this.a.r(4);
                            n13 = this.a.h(12);
                            object2 = this.b((G)object, n13);
                            if (n10 == 6) break block18;
                            n8 = n10;
                            if (n10 != 5) break block19;
                        }
                        n8 = ((L.b)object2).a;
                    }
                    n10 = n12 - (n13 + 5);
                    n12 = this.e.a == 2 ? n8 : n9;
                    if (!this.e.j.get(n12)) {
                        object2 = this.e.a == 2 && n8 == 21 ? this.e.s : this.e.g.b(n8, (L.b)object2);
                        if (this.e.a != 2 || n9 < this.c.get(n12, 8192)) {
                            this.c.put(n12, n9);
                            this.b.put(n12, object2);
                        }
                    }
                    n12 = n10;
                }
                n12 = this.c.size();
                for (n8 = 0; n8 < n12; ++n8) {
                    n10 = this.c.keyAt(n8);
                    n9 = this.c.valueAt(n8);
                    this.e.j.put(n10, true);
                    this.e.k.put(n9, true);
                    object = (L)this.b.valueAt(n8);
                    if (object == null) continue;
                    if (object != this.e.s) {
                        object.a(m8, this.e.n, new L.d(n11, n10, 8192));
                    }
                    this.e.i.put(n9, object);
                }
                if (this.e.a == 2) {
                    if (!this.e.p) {
                        this.e.n.o();
                        K.m(this.e, 0);
                        K.l(this.e, true);
                        return;
                    }
                } else {
                    this.e.i.remove(this.d);
                    object = this.e;
                    n8 = ((K)object).a == 1 ? 0 : this.e.o - 1;
                    K.m((K)object, n8);
                    if (this.e.o == 0) {
                        this.e.n.o();
                        K.l(this.e, true);
                    }
                }
            }
        }
    }
}

