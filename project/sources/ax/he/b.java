package ax.he;

import ax.he.a;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class b extends ax.he.a {
    private final ax.ge.e m;
    private final ax.ie.b n;
    private final c o;
    private final C0328b p;
    private final C0328b q;

    /* renamed from: ax.he.b$b, reason: collision with other inner class name */
    private class C0328b extends a.AbstractC0326a {
        private C0328b() {
            super();
        }

        int b(int i) throws IOException {
            return b.this.n.b(this.a, 0) == 0 ? b.this.n.c(this.b[i]) + 2 : b.this.n.b(this.a, 1) == 0 ? b.this.n.c(this.c[i]) + 10 : b.this.n.c(this.d) + 18;
        }
    }

    private class c extends a.b {
        private final a[] d;

        private class a extends a.b.AbstractC0327a {
            private a() {
                super();
            }

            void b() throws IOException {
                int i = 1;
                if (b.this.c.b()) {
                    do {
                        i = b.this.n.b(this.a, i) | (i << 1);
                    } while (i < 256);
                } else {
                    int c = b.this.m.c(b.this.b[0]);
                    int i2 = 256;
                    int i3 = 1;
                    do {
                        c <<= 1;
                        int i4 = c & i2;
                        int b = b.this.n.b(this.a, i2 + i4 + i3);
                        i3 = (i3 << 1) | b;
                        i2 &= (~i4) ^ (0 - b);
                    } while (i3 < 256);
                    i = i3;
                }
                b.this.m.h((byte) i);
                b.this.c.e();
            }
        }

        c(int i, int i2) {
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
            this.d[a(b.this.m.c(0), b.this.m.d())].b();
        }

        void c() {
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

    public b(ax.ge.e eVar, ax.ie.b bVar, int i, int i2, int i3) {
        super(i3);
        this.p = new C0328b();
        this.q = new C0328b();
        this.m = eVar;
        this.n = bVar;
        this.o = new c(i, i2);
        b();
    }

    private int f(int i) throws IOException {
        this.c.g();
        int[] iArr = this.b;
        iArr[3] = iArr[2];
        iArr[2] = iArr[1];
        iArr[1] = iArr[0];
        int b = this.p.b(i);
        int c2 = this.n.c(this.j[ax.he.a.a(b)]);
        if (c2 < 4) {
            this.b[0] = c2;
            return b;
        }
        int i2 = c2 >> 1;
        int[] iArr2 = this.b;
        int i3 = (2 | (c2 & 1)) << (i2 - 1);
        iArr2[0] = i3;
        if (c2 < 14) {
            iArr2[0] = this.n.e(this.k[c2 - 4]) | i3;
            return b;
        }
        iArr2[0] = (this.n.d(i2 - 5) << 4) | i3;
        int[] iArr3 = this.b;
        iArr3[0] = iArr3[0] | this.n.e(this.l);
        return b;
    }

    private int g(int i) throws IOException {
        int i2;
        if (this.n.b(this.f, this.c.a()) != 0) {
            if (this.n.b(this.g, this.c.a()) == 0) {
                i2 = this.b[1];
            } else {
                if (this.n.b(this.h, this.c.a()) == 0) {
                    i2 = this.b[2];
                } else {
                    int[] iArr = this.b;
                    int i3 = iArr[3];
                    iArr[3] = iArr[2];
                    i2 = i3;
                }
                int[] iArr2 = this.b;
                iArr2[2] = iArr2[1];
            }
            int[] iArr3 = this.b;
            iArr3[1] = iArr3[0];
            iArr3[0] = i2;
        } else if (this.n.b(this.i[this.c.a()], i) == 0) {
            this.c.h();
            return 1;
        }
        this.c.f();
        return this.q.b(i);
    }

    @Override // ax.he.a
    public void b() {
        super.b();
        this.o.c();
        this.p.a();
        this.q.a();
    }

    public void e() throws IOException {
        this.m.j();
        while (this.m.f()) {
            int d = this.m.d() & this.a;
            if (this.n.b(this.d[this.c.a()], d) == 0) {
                this.o.b();
            } else {
                this.m.i(this.b[0], this.n.b(this.e, this.c.a()) == 0 ? f(d) : g(d));
            }
        }
        this.n.f();
    }

    public boolean h() {
        return this.b[0] == -1;
    }
}
