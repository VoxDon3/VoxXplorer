package ax.he;

import ax.be.C1735c;
import ax.he.a;
import java.io.IOException;
import java.lang.reflect.Array;

/* loaded from: classes3.dex */
public abstract class c extends ax.he.a {
    private int A;
    private final ax.ie.e m;
    final ax.ge.f n;
    final C0329c o;
    final b p;
    final b q;
    final int r;
    private int s;
    private int t;
    private final int u;
    private final int[][] v;
    private final int[][] w;
    private final int[] x;
    int y;
    int z;

    class b extends a.AbstractC0326a {
        private final int[] f;
        private final int[][] g;

        b(int i, int i2) {
            super();
            int i3 = 1 << i;
            this.f = new int[i3];
            this.g = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i3, Math.max(i2 - 1, 16));
        }

        private void e(int i) {
            int g = ax.ie.e.g(this.a[0], 0);
            int i2 = 0;
            while (i2 < 8) {
                this.g[i][i2] = ax.ie.e.h(this.b[i], i2) + g;
                i2++;
            }
            int g2 = ax.ie.e.g(this.a[0], 1);
            int g3 = ax.ie.e.g(this.a[1], 0);
            while (i2 < 16) {
                this.g[i][i2] = g2 + g3 + ax.ie.e.h(this.c[i], i2 - 8);
                i2++;
            }
            int g4 = ax.ie.e.g(this.a[1], 1);
            while (true) {
                int[] iArr = this.g[i];
                if (i2 >= iArr.length) {
                    return;
                }
                iArr[i2] = g2 + g4 + ax.ie.e.h(this.d, i2 - 16);
                i2++;
            }
        }

        @Override // ax.he.a.AbstractC0326a
        void a() {
            super.a();
            int i = 0;
            while (true) {
                int[] iArr = this.f;
                if (i >= iArr.length) {
                    return;
                }
                iArr[i] = 0;
                i++;
            }
        }

        void b(int i, int i2) throws IOException {
            int i3 = i - 2;
            if (i3 < 8) {
                c.this.m.b(this.a, 0, 0);
                c.this.m.c(this.b[i2], i3);
            } else {
                c.this.m.b(this.a, 0, 1);
                int i4 = i - 10;
                if (i4 < 8) {
                    c.this.m.b(this.a, 1, 0);
                    c.this.m.c(this.c[i2], i4);
                } else {
                    c.this.m.b(this.a, 1, 1);
                    c.this.m.c(this.d, i - 18);
                }
            }
            int[] iArr = this.f;
            iArr[i2] = iArr[i2] - 1;
        }

        int c(int i, int i2) {
            return this.g[i2][i - 2];
        }

        void d() {
            int i = 0;
            while (true) {
                int[] iArr = this.f;
                if (i >= iArr.length) {
                    return;
                }
                if (iArr[i] <= 0) {
                    iArr[i] = 32;
                    e(i);
                }
                i++;
            }
        }
    }

    /* renamed from: ax.he.c$c, reason: collision with other inner class name */
    class C0329c extends a.b {
        private final a[] d;

        /* renamed from: ax.he.c$c$a */
        private class a extends a.b.AbstractC0327a {
            private a() {
                super();
            }

            void b() throws IOException {
                c cVar = c.this;
                int i = 256;
                int e = cVar.n.e(cVar.z) | 256;
                if (c.this.c.b()) {
                    do {
                        c.this.m.b(this.a, e >>> 8, (e >>> 7) & 1);
                        e <<= 1;
                    } while (e < 65536);
                } else {
                    c cVar2 = c.this;
                    int e2 = cVar2.n.e(cVar2.b[0] + 1 + cVar2.z);
                    do {
                        e2 <<= 1;
                        c.this.m.b(this.a, (e2 & i) + i + (e >>> 8), (e >>> 7) & 1);
                        e <<= 1;
                        i &= ~(e2 ^ e);
                    } while (e < 65536);
                }
                c.this.c.e();
            }

            int c(int i, int i2) {
                int i3 = 256;
                int i4 = i | 256;
                int i5 = 0;
                do {
                    i2 <<= 1;
                    i5 += ax.ie.e.g(this.a[(i2 & i3) + i3 + (i4 >>> 8)], (i4 >>> 7) & 1);
                    i4 <<= 1;
                    i3 &= ~(i2 ^ i4);
                } while (i4 < 65536);
                return i5;
            }

            int d(int i) {
                int i2 = i | 256;
                int i3 = 0;
                do {
                    i3 += ax.ie.e.g(this.a[i2 >>> 8], (i2 >>> 7) & 1);
                    i2 <<= 1;
                } while (i2 < 65536);
                return i3;
            }
        }

        C0329c(int i, int i2) {
            super(i, i2);
            this.d = new a[1 << (i + i2)];
            int i3 = 0;
            while (true) {
                a[] aVarArr = this.d;
                if (i3 >= aVarArr.length) {
                    return;
                }
                aVarArr[i3] = new a();
                i3++;
            }
        }

        void b() throws IOException {
            c cVar = c.this;
            this.d[a(cVar.n.e(cVar.z + 1), c.this.n.k() - c.this.z)].b();
        }

        void c() throws IOException {
            this.d[0].b();
        }

        int d(int i, int i2, int i3, int i4, g gVar) {
            int g = ax.ie.e.g(c.this.d[gVar.a()][c.this.a & i4], 0);
            int a2 = a(i3, i4);
            return g + (gVar.b() ? this.d[a2].d(i) : this.d[a2].c(i, i2));
        }

        void e() {
            int i = 0;
            while (true) {
                a[] aVarArr = this.d;
                if (i >= aVarArr.length) {
                    return;
                }
                aVarArr[i].a();
                i++;
            }
        }
    }

    c(ax.ie.e eVar, ax.ge.f fVar, int i, int i2, int i3, int i4, int i5) {
        super(i3);
        this.s = 0;
        this.t = 0;
        Class cls = Integer.TYPE;
        this.w = (int[][]) Array.newInstance((Class<?>) cls, 4, 128);
        this.x = new int[16];
        this.y = 0;
        this.z = -1;
        this.A = 0;
        this.m = eVar;
        this.n = fVar;
        this.r = i5;
        this.o = new C0329c(i, i2);
        this.p = new b(i3, i5);
        this.q = new b(i3, i5);
        int m = m(i4 - 1) + 1;
        this.u = m;
        this.v = (int[][]) Array.newInstance((Class<?>) cls, 4, m);
        b();
    }

    private void A() {
        this.t = 16;
        for (int i = 0; i < 16; i++) {
            this.x[i] = ax.ie.e.k(this.l, i);
        }
    }

    private void B() {
        this.s = 128;
        int i = 0;
        while (true) {
            if (i >= 4) {
                break;
            }
            for (int i2 = 0; i2 < this.u; i2++) {
                this.v[i][i2] = ax.ie.e.h(this.j[i], i2);
            }
            for (int i3 = 14; i3 < this.u; i3++) {
                int[] iArr = this.v[i];
                iArr[i3] = iArr[i3] + ax.ie.e.i((i3 >>> 1) - 5);
            }
            for (int i4 = 0; i4 < 4; i4++) {
                this.w[i][i4] = this.v[i][i4];
            }
            i++;
        }
        int i5 = 4;
        for (int i6 = 4; i6 < 14; i6++) {
            int i7 = ((i6 & 1) | 2) << ((i6 >>> 1) - 1);
            int i8 = i6 - 4;
            int length = this.k[i8].length;
            for (int i9 = 0; i9 < length; i9++) {
                int k = ax.ie.e.k(this.k[i8], i5 - i7);
                for (int i10 = 0; i10 < 4; i10++) {
                    this.w[i10][i5] = this.v[i10][i6] + k;
                }
                i5++;
            }
        }
    }

    private boolean f() throws IOException {
        if (!this.n.l(0)) {
            return false;
        }
        z(1);
        this.m.b(this.d[this.c.a()], 0, 0);
        this.o.c();
        this.z--;
        this.A++;
        return true;
    }

    private void h(int i, int i2, int i3) throws IOException {
        this.c.g();
        this.p.b(i2, i3);
        int m = m(i);
        this.m.c(this.j[ax.he.a.a(i2)], m);
        if (m >= 4) {
            int i4 = m >>> 1;
            int i5 = i - (((m & 1) | 2) << (i4 - 1));
            if (m < 14) {
                this.m.e(this.k[m - 4], i5);
            } else {
                this.m.d(i5 >>> 4, i4 - 5);
                this.m.e(this.l, i5 & 15);
                this.t--;
            }
        }
        int[] iArr = this.b;
        iArr[3] = iArr[2];
        iArr[2] = iArr[1];
        iArr[1] = iArr[0];
        iArr[0] = i;
        this.s--;
    }

    private void i(int i, int i2, int i3) throws IOException {
        if (i == 0) {
            this.m.b(this.f, this.c.a(), 0);
            this.m.b(this.i[this.c.a()], i3, i2 != 1 ? 1 : 0);
        } else {
            int i4 = this.b[i];
            this.m.b(this.f, this.c.a(), 1);
            if (i == 1) {
                this.m.b(this.g, this.c.a(), 0);
            } else {
                this.m.b(this.g, this.c.a(), 1);
                this.m.b(this.h, this.c.a(), i - 2);
                if (i == 3) {
                    int[] iArr = this.b;
                    iArr[3] = iArr[2];
                }
                int[] iArr2 = this.b;
                iArr2[2] = iArr2[1];
            }
            int[] iArr3 = this.b;
            iArr3[1] = iArr3[0];
            iArr3[0] = i4;
        }
        if (i2 == 1) {
            this.c.h();
        } else {
            this.q.b(i2, i3);
            this.c.f();
        }
    }

    private boolean j() throws IOException {
        if (!this.n.l(this.z + 1)) {
            return false;
        }
        int t = t();
        int k = (this.n.k() - this.z) & this.a;
        if (this.y == -1) {
            this.m.b(this.d[this.c.a()], k, 0);
            this.o.b();
        } else {
            this.m.b(this.d[this.c.a()], k, 1);
            if (this.y < 4) {
                this.m.b(this.e, this.c.a(), 1);
                i(this.y, t, k);
            } else {
                this.m.b(this.e, this.c.a(), 0);
                h(this.y - 4, t, k);
            }
        }
        this.z -= t;
        this.A += t;
        return true;
    }

    public static int m(int i) {
        int i2;
        int i3;
        if (i <= 4 && i >= 0) {
            return i;
        }
        if (((-65536) & i) == 0) {
            i3 = i << 16;
            i2 = 15;
        } else {
            i2 = 31;
            i3 = i;
        }
        if (((-16777216) & i3) == 0) {
            i3 <<= 8;
            i2 -= 8;
        }
        if (((-268435456) & i3) == 0) {
            i3 <<= 4;
            i2 -= 4;
        }
        if (((-1073741824) & i3) == 0) {
            i3 <<= 2;
            i2 -= 2;
        }
        if ((i3 & Integer.MIN_VALUE) == 0) {
            i2--;
        }
        return (i2 << 1) + ((i >>> (i2 - 1)) & 1);
    }

    public static c n(ax.ie.e eVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, C1735c c1735c) {
        if (i4 == 1) {
            return new d(eVar, i, i2, i3, i5, i6, i7, i8, i9, c1735c);
        }
        if (i4 == 2) {
            return new e(eVar, i, i2, i3, i5, i6, i7, i8, i9, c1735c);
        }
        throw new IllegalArgumentException();
    }

    void C() {
        if (this.s <= 0) {
            B();
        }
        if (this.t <= 0) {
            A();
        }
        this.p.d();
        this.q.d();
    }

    @Override // ax.he.a
    public void b() {
        super.b();
        this.o.e();
        this.p.a();
        this.q.a();
        this.s = 0;
        this.t = 0;
        this.A += this.z + 1;
        this.z = -1;
    }

    public void d() throws IOException {
        if (this.n.m() || f()) {
            while (j()) {
            }
        }
    }

    public boolean e() {
        try {
            if (!this.n.m() && !f()) {
                return false;
            }
            while (this.A <= 2096879 && this.m.j() <= 65510) {
                if (!j()) {
                    return false;
                }
            }
            return true;
        } catch (IOException unused) {
            throw new Error();
        }
    }

    public void g() throws IOException {
        int k = (this.n.k() - this.z) & this.a;
        this.m.b(this.d[this.c.a()], k, 1);
        this.m.b(this.e, this.c.a(), 0);
        h(-1, 2, k);
    }

    int k(g gVar, int i) {
        return ax.ie.e.g(this.d[gVar.a()][i], 1);
    }

    int l(int i, g gVar) {
        return i + ax.ie.e.g(this.e[gVar.a()], 1);
    }

    public ax.ge.f o() {
        return this.n;
    }

    int p(int i, int i2, g gVar, int i3) {
        return q(l(k(gVar, i3), gVar), i, gVar, i3) + this.q.c(i2, i3);
    }

    int q(int i, int i2, g gVar, int i3) {
        if (i2 == 0) {
            return i + ax.ie.e.g(this.f[gVar.a()], 0) + ax.ie.e.g(this.i[gVar.a()][i3], 1);
        }
        int g = i + ax.ie.e.g(this.f[gVar.a()], 1);
        return i2 == 1 ? g + ax.ie.e.g(this.g[gVar.a()], 0) : g + ax.ie.e.g(this.g[gVar.a()], 1) + ax.ie.e.g(this.h[gVar.a()], i2 - 2);
    }

    int r(int i, int i2, int i3, int i4) {
        int c = i + this.p.c(i3, i4);
        int a2 = ax.he.a.a(i3);
        if (i2 < 128) {
            return c + this.w[a2][i2];
        }
        return c + this.v[a2][m(i2)] + this.x[i2 & 15];
    }

    ax.ge.g s() {
        this.z++;
        return this.n.j();
    }

    abstract int t();

    int u(int i, g gVar) {
        return i + ax.ie.e.g(this.e[gVar.a()], 0);
    }

    int v(int i, g gVar, int i2) {
        return i + ax.ie.e.g(this.f[gVar.a()], 0) + ax.ie.e.g(this.i[gVar.a()][i2], 0);
    }

    public int w() {
        return this.A;
    }

    public void x(C1735c c1735c) {
        this.n.r(c1735c);
    }

    public void y() {
        this.A = 0;
    }

    void z(int i) {
        this.z += i;
        this.n.v(i);
    }
}
