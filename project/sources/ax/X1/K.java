package ax.X1;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import ax.N1.t;
import ax.S0.C0968a;
import ax.S0.d0;
import ax.X1.L;
import ax.q1.C2857q;
import ax.q1.C2862w;
import ax.q1.InterfaceC2858s;
import ax.q1.InterfaceC2859t;
import ax.q1.InterfaceC2863x;
import ax.q1.N;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class K implements ax.q1.r {

    @Deprecated
    public static final InterfaceC2863x v = new InterfaceC2863x() { // from class: ax.X1.J
        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x a(t.a aVar) {
            return C2862w.d(this, aVar);
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x b(int i) {
            return C2862w.b(this, i);
        }

        @Override // ax.q1.InterfaceC2863x
        public final ax.q1.r[] c() {
            return K.g();
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x d(boolean z) {
            return C2862w.c(this, z);
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ ax.q1.r[] e(Uri uri, Map map) {
            return C2862w.a(this, uri, map);
        }
    };
    private final int a;
    private final int b;
    private final int c;
    private final List<ax.S0.M> d;
    private final ax.S0.G e;
    private final SparseIntArray f;
    private final L.c g;
    private final t.a h;
    private final SparseArray<L> i;
    private final SparseBooleanArray j;
    private final SparseBooleanArray k;
    private final I l;
    private H m;
    private InterfaceC2859t n;
    private int o;
    private boolean p;
    private boolean q;
    private boolean r;
    private L s;
    private int t;
    private int u;

    public K(int i, t.a aVar) {
        this(1, i, aVar, new ax.S0.M(0L), new C1149j(0), 112800);
    }

    private void A() {
        this.j.clear();
        this.i.clear();
        SparseArray<L> a2 = this.g.a();
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            this.i.put(a2.keyAt(i), a2.valueAt(i));
        }
        this.i.put(0, new E(new a()));
        this.s = null;
    }

    private boolean B(int i) {
        return this.a == 2 || this.p || !this.k.get(i, false);
    }

    public static /* synthetic */ ax.q1.r[] g() {
        return new ax.q1.r[]{new K(1, t.a.a)};
    }

    static /* synthetic */ int n(K k) {
        int i = k.o;
        k.o = i + 1;
        return i;
    }

    private boolean x(InterfaceC2858s interfaceC2858s) throws IOException {
        byte[] f = this.e.f();
        if (9400 - this.e.g() < 188) {
            int a2 = this.e.a();
            if (a2 > 0) {
                System.arraycopy(f, this.e.g(), f, 0, a2);
            }
            this.e.Z(f, a2);
        }
        while (this.e.a() < 188) {
            int j = this.e.j();
            int c = interfaceC2858s.c(f, j, 9400 - j);
            if (c == -1) {
                return false;
            }
            this.e.a0(j + c);
        }
        return true;
    }

    private int y() throws ax.P0.E {
        int g = this.e.g();
        int j = this.e.j();
        int a2 = M.a(this.e.f(), g, j);
        this.e.b0(a2);
        int i = a2 + 188;
        if (i <= j) {
            this.t = 0;
            return i;
        }
        int i2 = this.t + (a2 - g);
        this.t = i2;
        if (this.a != 2 || i2 <= 376) {
            return i;
        }
        throw ax.P0.E.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
    }

    private void z(long j) {
        if (this.q) {
            return;
        }
        this.q = true;
        if (this.l.b() == -9223372036854775807L) {
            this.n.h(new N.b(this.l.b()));
            return;
        }
        H h = new H(this.l.c(), this.l.b(), j, this.u, this.c);
        this.m = h;
        this.n.h(h.b());
    }

    @Override // ax.q1.r
    public void a(InterfaceC2859t interfaceC2859t) {
        if ((this.b & 1) == 0) {
            interfaceC2859t = new ax.N1.u(interfaceC2859t, this.h);
        }
        this.n = interfaceC2859t;
    }

    @Override // ax.q1.r
    public void b(long j, long j2) {
        H h;
        C0968a.g(this.a != 2);
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            ax.S0.M m = this.d.get(i);
            boolean z = m.f() == -9223372036854775807L;
            if (!z) {
                long d = m.d();
                z = (d == -9223372036854775807L || d == 0 || d == j2) ? false : true;
            }
            if (z) {
                m.i(j2);
            }
        }
        if (j2 != 0 && (h = this.m) != null) {
            h.h(j2);
        }
        this.e.X(0);
        this.f.clear();
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            this.i.valueAt(i2).b();
        }
        this.t = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // ax.q1.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(ax.q1.InterfaceC2858s r7) throws java.io.IOException {
        /*
            r6 = this;
            ax.S0.G r0 = r6.e
            byte[] r0 = r0.f()
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.p(r0, r2, r1)
            r1 = 0
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L29
            r3 = 0
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.n(r1)
            r7 = 1
            return r7
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.X1.K.c(ax.q1.s):boolean");
    }

    @Override // ax.q1.r
    public /* synthetic */ ax.q1.r e() {
        return C2857q.b(this);
    }

    @Override // ax.q1.r
    public int f(InterfaceC2858s interfaceC2858s, ax.q1.M m) throws IOException {
        int i;
        long length = interfaceC2858s.getLength();
        boolean z = this.a == 2;
        if (this.p) {
            if (length != -1 && !z && !this.l.d()) {
                return this.l.e(interfaceC2858s, m, this.u);
            }
            z(length);
            if (this.r) {
                this.r = false;
                b(0L, 0L);
                if (interfaceC2858s.getPosition() != 0) {
                    m.a = 0L;
                    return 1;
                }
            }
            H h = this.m;
            if (h != null && h.d()) {
                return this.m.c(interfaceC2858s, m);
            }
        }
        if (!x(interfaceC2858s)) {
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                L valueAt = this.i.valueAt(i2);
                if (valueAt instanceof y) {
                    y yVar = (y) valueAt;
                    if (yVar.d(z)) {
                        yVar.c(new ax.S0.G(), 1);
                    }
                }
            }
            return -1;
        }
        int y = y();
        int j = this.e.j();
        if (y > j) {
            return 0;
        }
        int v2 = this.e.v();
        if ((8388608 & v2) != 0) {
            this.e.b0(y);
            return 0;
        }
        int i3 = (4194304 & v2) != 0 ? 1 : 0;
        int i4 = (2096896 & v2) >> 8;
        boolean z2 = (v2 & 32) != 0;
        L l = (v2 & 16) != 0 ? this.i.get(i4) : null;
        if (l == null) {
            this.e.b0(y);
            return 0;
        }
        if (this.a != 2) {
            int i5 = v2 & 15;
            i = 0;
            int i6 = this.f.get(i4, i5 - 1);
            this.f.put(i4, i5);
            if (i6 == i5) {
                this.e.b0(y);
                return 0;
            }
            if (i5 != ((i6 + 1) & 15)) {
                l.b();
            }
        } else {
            i = 0;
        }
        if (z2) {
            int M = this.e.M();
            i3 |= (this.e.M() & 64) != 0 ? 2 : 0;
            this.e.c0(M - 1);
        }
        boolean z3 = this.p;
        if (B(i4)) {
            this.e.a0(y);
            l.c(this.e, i3);
            this.e.a0(j);
        }
        if (this.a != 2 && !z3 && this.p && length != -1) {
            this.r = true;
        }
        this.e.b0(y);
        return i;
    }

    @Override // ax.q1.r
    public /* synthetic */ List k() {
        return C2857q.a(this);
    }

    public K(int i, int i2, t.a aVar, ax.S0.M m, L.c cVar, int i3) {
        this.g = (L.c) C0968a.e(cVar);
        this.c = i3;
        this.a = i;
        this.b = i2;
        this.h = aVar;
        if (i == 1 || i == 2) {
            this.d = Collections.singletonList(m);
        } else {
            ArrayList arrayList = new ArrayList();
            this.d = arrayList;
            arrayList.add(m);
        }
        this.e = new ax.S0.G(new byte[9400], 0);
        this.j = new SparseBooleanArray();
        this.k = new SparseBooleanArray();
        this.i = new SparseArray<>();
        this.f = new SparseIntArray();
        this.l = new I(i3);
        this.n = InterfaceC2859t.a0;
        this.u = -1;
        A();
    }

    @Override // ax.q1.r
    public void d() {
    }

    private class a implements D {
        private final ax.S0.F a = new ax.S0.F(new byte[4]);

        public a() {
        }

        @Override // ax.X1.D
        public void c(ax.S0.G g) {
            if (g.M() == 0 && (g.M() & 128) != 0) {
                g.c0(6);
                int a = g.a() / 4;
                for (int i = 0; i < a; i++) {
                    g.p(this.a, 4);
                    int h = this.a.h(16);
                    this.a.r(3);
                    if (h == 0) {
                        this.a.r(13);
                    } else {
                        int h2 = this.a.h(13);
                        if (K.this.i.get(h2) == null) {
                            K.this.i.put(h2, new E(K.this.new b(h2)));
                            K.n(K.this);
                        }
                    }
                }
                if (K.this.a != 2) {
                    K.this.i.remove(0);
                }
            }
        }

        @Override // ax.X1.D
        public void a(ax.S0.M m, InterfaceC2859t interfaceC2859t, L.d dVar) {
        }
    }

    private class b implements D {
        private final ax.S0.F a = new ax.S0.F(new byte[5]);
        private final SparseArray<L> b = new SparseArray<>();
        private final SparseIntArray c = new SparseIntArray();
        private final int d;

        public b(int i) {
            this.d = i;
        }

        private L.b b(ax.S0.G g, int i) {
            int g2 = g.g();
            int i2 = g2 + i;
            String str = null;
            ArrayList arrayList = null;
            int i3 = -1;
            int i4 = 0;
            while (g.g() < i2) {
                int M = g.M();
                int g3 = g.g() + g.M();
                if (g3 > i2) {
                    break;
                }
                if (M == 5) {
                    long O = g.O();
                    if (O != 1094921523) {
                        if (O != 1161904947) {
                            if (O != 1094921524) {
                                if (O == 1212503619) {
                                    i3 = 36;
                                }
                            }
                            i3 = 172;
                        }
                        i3 = 135;
                    }
                    i3 = 129;
                } else {
                    if (M != 106) {
                        if (M != 122) {
                            if (M == 127) {
                                int M2 = g.M();
                                if (M2 != 21) {
                                    if (M2 == 14) {
                                        i3 = 136;
                                    } else if (M2 == 33) {
                                        i3 = 139;
                                    }
                                }
                                i3 = 172;
                            } else if (M == 123) {
                                i3 = 138;
                            } else if (M == 10) {
                                String trim = g.J(3).trim();
                                i4 = g.M();
                                str = trim;
                            } else if (M == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (g.g() < g3) {
                                    String trim2 = g.J(3).trim();
                                    int M3 = g.M();
                                    byte[] bArr = new byte[4];
                                    g.q(bArr, 0, 4);
                                    arrayList2.add(new L.a(trim2, M3, bArr));
                                }
                                arrayList = arrayList2;
                                i3 = 89;
                            } else if (M == 111) {
                                i3 = 257;
                            }
                        }
                        i3 = 135;
                    }
                    i3 = 129;
                }
                g.c0(g3 - g.g());
            }
            g.b0(i2);
            return new L.b(i3, str, i4, arrayList, Arrays.copyOfRange(g.f(), g2, i2));
        }

        @Override // ax.X1.D
        public void c(ax.S0.G g) {
            ax.S0.M m;
            if (g.M() != 2) {
                return;
            }
            if (K.this.a == 1 || K.this.a == 2 || K.this.o == 1) {
                m = (ax.S0.M) K.this.d.get(0);
            } else {
                m = new ax.S0.M(((ax.S0.M) K.this.d.get(0)).d());
                K.this.d.add(m);
            }
            if ((g.M() & 128) == 0) {
                return;
            }
            g.c0(1);
            int U = g.U();
            int i = 3;
            g.c0(3);
            g.p(this.a, 2);
            this.a.r(3);
            int i2 = 13;
            K.this.u = this.a.h(13);
            g.p(this.a, 2);
            int i3 = 4;
            this.a.r(4);
            g.c0(this.a.h(12));
            if (K.this.a == 2 && K.this.s == null) {
                L.b bVar = new L.b(21, null, 0, null, d0.f);
                K k = K.this;
                k.s = k.g.b(21, bVar);
                if (K.this.s != null) {
                    K.this.s.a(m, K.this.n, new L.d(U, 21, 8192));
                }
            }
            this.b.clear();
            this.c.clear();
            int a = g.a();
            while (a > 0) {
                g.p(this.a, 5);
                int h = this.a.h(8);
                this.a.r(i);
                int h2 = this.a.h(i2);
                this.a.r(i3);
                int h3 = this.a.h(12);
                L.b b = b(g, h3);
                if (h == 6 || h == 5) {
                    h = b.a;
                }
                a -= h3 + 5;
                int i4 = K.this.a == 2 ? h : h2;
                if (!K.this.j.get(i4)) {
                    L b2 = (K.this.a == 2 && h == 21) ? K.this.s : K.this.g.b(h, b);
                    if (K.this.a != 2 || h2 < this.c.get(i4, 8192)) {
                        this.c.put(i4, h2);
                        this.b.put(i4, b2);
                    }
                }
                i = 3;
                i3 = 4;
                i2 = 13;
            }
            int size = this.c.size();
            for (int i5 = 0; i5 < size; i5++) {
                int keyAt = this.c.keyAt(i5);
                int valueAt = this.c.valueAt(i5);
                K.this.j.put(keyAt, true);
                K.this.k.put(valueAt, true);
                L valueAt2 = this.b.valueAt(i5);
                if (valueAt2 != null) {
                    if (valueAt2 != K.this.s) {
                        valueAt2.a(m, K.this.n, new L.d(U, keyAt, 8192));
                    }
                    K.this.i.put(valueAt, valueAt2);
                }
            }
            if (K.this.a == 2) {
                if (K.this.p) {
                    return;
                }
                K.this.n.o();
                K.this.o = 0;
                K.this.p = true;
                return;
            }
            K.this.i.remove(this.d);
            K k2 = K.this;
            k2.o = k2.a == 1 ? 0 : K.this.o - 1;
            if (K.this.o == 0) {
                K.this.n.o();
                K.this.p = true;
            }
        }

        @Override // ax.X1.D
        public void a(ax.S0.M m, InterfaceC2859t interfaceC2859t, L.d dVar) {
        }
    }
}
