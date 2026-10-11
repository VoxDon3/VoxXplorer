/*
 * Decompiled with CFR 0.152.
 */
package ax.yd;

import ax.Nd.e;
import ax.Nd.h;
import ax.vd.i;

public class a {
    private static final byte[] e = new byte[4];
    private ax.Dd.b a;
    private b[] b;
    private int c;
    private int d;

    private static void A(b object, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19, int n20, int n21, int n22, int n23) {
        object = ((b)object).a;
        ax.yd.a.a((long[])object, n8, n12, n16, n20);
        ax.yd.a.a((long[])object, n9, n13, n17, n21);
        ax.yd.a.a((long[])object, n10, n14, n18, n22);
        ax.yd.a.a((long[])object, n11, n15, n19, n23);
        ax.yd.a.a((long[])object, n8, n13, n18, n23);
        ax.yd.a.a((long[])object, n9, n14, n19, n20);
        ax.yd.a.a((long[])object, n10, n15, n16, n21);
        ax.yd.a.a((long[])object, n11, n12, n17, n22);
    }

    private static void a(long[] lArray, int n8, int n9, int n10, int n11) {
        ax.yd.a.y(lArray, n8, n9, n11, 32);
        ax.yd.a.y(lArray, n10, n11, n9, 24);
        ax.yd.a.y(lArray, n8, n9, n11, 16);
        ax.yd.a.y(lArray, n10, n11, n9, 63);
    }

    private static void c(byte[] byArray, i i8, byte[] byArray2) {
        if (byArray2 == null) {
            i8.b(e, 0, 4);
            return;
        }
        h.f(byArray2.length, byArray, 0);
        i8.b(byArray, 0, 4);
        i8.b(byArray2, 0, byArray2.length);
    }

    private void d(byte[] byArray, byte[] byArray2, int n8, int n9) {
        b b8 = this.b[this.d - 1];
        for (int i8 = 1; i8 < this.a.c(); ++i8) {
            int n10 = this.d;
            b8.k(this.b[i8 * n10 + (n10 - 1)]);
        }
        b8.i(byArray);
        this.p(byArray, byArray2, n8, n9);
    }

    private void e(ax.Dd.b b8) {
        int n8;
        int n9 = n8 = b8.d();
        if (n8 < b8.c() * 8) {
            n9 = b8.c() * 8;
        }
        this.c = n9 /= b8.c() * 4;
        this.d = n9 * 4;
        this.s(n9 * (b8.c() * 4));
    }

    private void f(byte[] byArray, byte[] byArray2) {
        byte[] byArray3 = new byte[72];
        System.arraycopy(byArray2, 0, byArray3, 0, 64);
        byArray3[64] = 1;
        for (int i8 = 0; i8 < this.a.c(); ++i8) {
            h.f(i8, byArray2, 68);
            h.f(i8, byArray3, 68);
            this.p(byArray2, byArray, 0, 1024);
            this.b[this.d * i8].h(byArray);
            this.p(byArray3, byArray, 0, 1024);
            this.b[this.d * i8 + 1].h(byArray);
        }
    }

    private void g() {
        c c8 = new c();
        d d8 = new d();
        for (int i8 = 0; i8 < this.a.b(); ++i8) {
            d8.a = i8;
            for (int i9 = 0; i9 < 4; ++i9) {
                d8.c = i9;
                int n8 = 0;
                while (n8 < this.a.c()) {
                    d8.b = n8++;
                    this.h(c8, d8);
                }
            }
        }
    }

    private void h(c object, d d8) {
        b b8;
        c c8 = object;
        boolean bl = this.v(d8);
        int n8 = ax.yd.a.o(d8);
        int n9 = d8.b * this.d + d8.c * this.c + n8;
        int n10 = this.k(n9);
        if (bl) {
            object = c8.c.f();
            b8 = c8.d.f();
            this.r(c8, d8, b8, (b)object);
        } else {
            object = null;
            b8 = null;
        }
        boolean bl2 = this.w(d8);
        while (n8 < this.c) {
            long l8 = this.l(c8, n8, (b)object, b8, n10, bl);
            int n11 = this.n(d8, l8);
            boolean bl3 = n11 == d8.b;
            int n12 = this.m(d8, n8, l8, bl3);
            Object object2 = this.b;
            b b9 = object2[n10];
            b b10 = object2[this.d * n11 + n12];
            object2 = object2[n9];
            if (bl2) {
                c8.g(b9, b10, (b)object2);
            } else {
                c8.f(b9, b10, (b)object2);
            }
            n11 = n9 + 1;
            ++n8;
            n10 = n9;
            n9 = n11;
        }
    }

    private int k(int n8) {
        int n9 = this.d;
        if (n8 % n9 == 0) {
            return n8 + n9 - 1;
        }
        return n8 - 1;
    }

    private long l(c c8, int n8, b b8, b b9, int n9, boolean bl) {
        if (bl) {
            if ((n8 %= 128) == 0) {
                this.x(c8, b9, b8);
            }
            return b8.a[n8];
        }
        return this.b[n9].a[0];
    }

    /*
     * Enabled aggressive block sorting
     */
    private int m(d d8, int n8, long l8, boolean bl) {
        int n9 = d8.a;
        int n10 = -1;
        int n11 = 0;
        int n12 = d8.c;
        if (n9 == 0) {
            if (bl) {
                n8 = n12 * this.c + n8 - 1;
                n10 = n11;
            } else {
                n9 = this.c;
                if (n8 != 0) {
                    n10 = 0;
                }
                n8 = n12 * n9 + n10;
                n10 = n11;
            }
        } else {
            n11 = this.c;
            n9 = this.d;
            int n13 = n9 - n11;
            if (bl) {
                n8 = n13 + n8 - 1;
            } else {
                if (n8 != 0) {
                    n10 = 0;
                }
                n8 = n13 + n10;
            }
            n10 = (n12 + 1) * n11 % n9;
        }
        long l9 = l8 & 0xFFFFFFFFL;
        long l10 = n8 - 1;
        l8 = n8;
        return (int)((long)n10 + (l10 - (l8 * (l9 * l9 >>> 32) >>> 32))) % this.d;
    }

    private int n(d d8, long l8) {
        int n8 = (int)((l8 >>> 32) % (long)this.a.c());
        if (d8.a == 0 && d8.c == 0) {
            return d8.b;
        }
        return n8;
    }

    private static int o(d d8) {
        if (d8.a == 0 && d8.c == 0) {
            return 2;
        }
        return 0;
    }

    private void p(byte[] object, byte[] byArray, int n8, int n9) {
        byte[] byArray2 = new byte[4];
        h.f(n9, byArray2, 0);
        if (n9 <= 64) {
            ax.wd.a a8 = new ax.wd.a(n9 * 8);
            a8.b(byArray2, 0, 4);
            a8.b((byte[])object, 0, ((byte[])object).length);
            a8.c(byArray, n8);
            return;
        }
        ax.wd.a a9 = new ax.wd.a(512);
        byte[] byArray3 = new byte[64];
        a9.b(byArray2, 0, 4);
        a9.b((byte[])object, 0, ((byte[])object).length);
        a9.c(byArray3, 0);
        System.arraycopy(byArray3, 0, byArray, n8, 32);
        n8 += 32;
        int n10 = (n9 + 31) / 32;
        int n11 = 2;
        n10 -= 2;
        while (n11 <= n10) {
            a9.b(byArray3, 0, 64);
            a9.c(byArray3, 0);
            System.arraycopy(byArray3, 0, byArray, n8, 32);
            ++n11;
            n8 += 32;
        }
        object = new ax.wd.a((n9 - n10 * 32) * 8);
        ((ax.wd.a)object).b(byArray3, 0, 64);
        ((ax.wd.a)object).c(byArray, n8);
    }

    private void r(c c8, d d8, b b8, b b9) {
        ((b)b8).a[0] = this.u(d8.a);
        ((b)b8).a[1] = this.u(d8.b);
        ((b)b8).a[2] = this.u(d8.c);
        ((b)b8).a[3] = this.u(this.b.length);
        ((b)b8).a[4] = this.u(this.a.b());
        ((b)b8).a[5] = this.u(this.a.g());
        if (d8.a == 0 && d8.c == 0) {
            this.x(c8, b8, b9);
        }
    }

    private void s(int n8) {
        b[] bArray;
        this.b = new b[n8];
        for (n8 = 0; n8 < (bArray = this.b).length; ++n8) {
            bArray[n8] = new b();
        }
    }

    private void t(byte[] byArray, byte[] byArray2, int n8) {
        ax.wd.a a8 = new ax.wd.a(512);
        h.g(new int[]{this.a.c(), n8, this.a.d(), this.a.b(), this.a.h(), this.a.g()}, byArray, 0);
        a8.b(byArray, 0, 24);
        ax.yd.a.c(byArray, a8, byArray2);
        ax.yd.a.c(byArray, a8, this.a.e());
        ax.yd.a.c(byArray, a8, this.a.f());
        ax.yd.a.c(byArray, a8, this.a.a());
        byArray2 = new byte[72];
        a8.c(byArray2, 0);
        this.f(byArray, byArray2);
    }

    private long u(int n8) {
        return (long)n8 & 0xFFFFFFFFL;
    }

    private boolean v(d d8) {
        return this.a.g() == 1 || this.a.g() == 2 && d8.a == 0 && d8.c < 2;
        {
        }
    }

    private boolean w(d d8) {
        return d8.a != 0 && this.a.h() != 16;
    }

    private void x(c c8, b b8, b b9) {
        long[] lArray = b8.a;
        lArray[6] = lArray[6] + 1L;
        c8.e(b8, b9);
        c8.e(b9, b9);
    }

    private static void y(long[] lArray, int n8, int n9, int n10, int n11) {
        long l8 = lArray[n8];
        long l9 = lArray[n9];
        long l10 = lArray[n10];
        l9 = l8 + (l9 + (l8 & 0xFFFFFFFFL) * 2L * (0xFFFFFFFFL & l9));
        l10 = ax.Nd.e.b(l10 ^ l9, n11);
        lArray[n8] = l9;
        lArray[n10] = l10;
    }

    private void z() {
        if (this.b != null) {
            Object object;
            for (int i8 = 0; i8 < ((b[])(object = this.b)).length; ++i8) {
                if ((object = object[i8]) == null) continue;
                ((b)object).f();
            }
        }
    }

    public int i(byte[] byArray, byte[] byArray2) {
        return this.j(byArray, byArray2, 0, byArray2.length);
    }

    public int j(byte[] byArray, byte[] byArray2, int n8, int n9) {
        if (n9 >= 4) {
            byte[] byArray3 = new byte[1024];
            this.t(byArray3, byArray, n9);
            this.g();
            this.d(byArray3, byArray2, n8, n9);
            this.z();
            return n9;
        }
        throw new IllegalStateException("output length less than 4");
    }

    public void q(ax.Dd.b b8) {
        this.a = b8;
        if (b8.c() >= 1) {
            if (b8.c() <= 0x1000000) {
                if (b8.d() >= b8.c() * 2) {
                    if (b8.b() >= 1) {
                        this.e(b8);
                        return;
                    }
                    throw new IllegalStateException("iterations is less than: 1");
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("memory is less than: ");
                stringBuilder.append(b8.c() * 2);
                stringBuilder.append(" expected ");
                stringBuilder.append(b8.c() * 2);
                throw new IllegalStateException(stringBuilder.toString());
            }
            throw new IllegalStateException("lanes must be less than 16777216");
        }
        throw new IllegalStateException("lanes must be greater than 1");
    }

    private static class b {
        private final long[] a = new long[128];

        private b() {
        }

        private void g(b b8) {
            System.arraycopy(b8.a, 0, this.a, 0, 128);
        }

        private void j(b object, b object2) {
            long[] lArray = this.a;
            object = ((b)object).a;
            object2 = ((b)object2).a;
            for (int i8 = 0; i8 < 128; ++i8) {
                lArray[i8] = (long)(object[i8] ^ object2[i8]);
            }
        }

        private void k(b object) {
            long[] lArray = this.a;
            object = ((b)object).a;
            for (int i8 = 0; i8 < 128; ++i8) {
                lArray[i8] = lArray[i8] ^ object[i8];
            }
        }

        private void l(b object, b object2) {
            long[] lArray = this.a;
            object = ((b)object).a;
            object2 = ((b)object2).a;
            for (int i8 = 0; i8 < 128; ++i8) {
                lArray[i8] = lArray[i8] ^ (object[i8] ^ object2[i8]);
            }
        }

        public b f() {
            ax.Nd.a.j(this.a, 0L);
            return this;
        }

        void h(byte[] byArray) {
            if (byArray.length >= 1024) {
                h.m(byArray, 0, this.a);
                return;
            }
            throw new IllegalArgumentException("input shorter than blocksize");
        }

        void i(byte[] byArray) {
            if (byArray.length >= 1024) {
                h.r(this.a, byArray, 0);
                return;
            }
            throw new IllegalArgumentException("output shorter than blocksize");
        }
    }

    private static class c {
        b a = new b();
        b b = new b();
        b c = new b();
        b d = new b();

        private c() {
        }

        private void d() {
            int n8;
            int n9 = 0;
            int n10 = 0;
            while (true) {
                if (n10 >= 8) break;
                n8 = n10 * 16;
                ax.yd.a.A(this.b, n8, n8 + 1, n8 + 2, n8 + 3, n8 + 4, n8 + 5, n8 + 6, n8 + 7, n8 + 8, n8 + 9, n8 + 10, n8 + 11, n8 + 12, n8 + 13, n8 + 14, n8 + 15);
                ++n10;
            }
            for (n8 = n9; n8 < 8; ++n8) {
                n10 = n8 * 2;
                ax.yd.a.A(this.b, n10, n10 + 1, n10 + 16, n10 + 17, n10 + 32, n10 + 33, n10 + 48, n10 + 49, n10 + 64, n10 + 65, n10 + 80, n10 + 81, n10 + 96, n10 + 97, n10 + 112, n10 + 113);
            }
        }

        private void e(b b8, b b9) {
            this.b.g(b8);
            this.d();
            b9.j(b8, this.b);
        }

        private void f(b b8, b b9, b b10) {
            this.a.j(b8, b9);
            this.b.g(this.a);
            this.d();
            b10.j(this.a, this.b);
        }

        private void g(b b8, b b9, b b10) {
            this.a.j(b8, b9);
            this.b.g(this.a);
            this.d();
            b10.l(this.a, this.b);
        }
    }

    private static class d {
        int a;
        int b;
        int c;

        d() {
        }
    }
}

