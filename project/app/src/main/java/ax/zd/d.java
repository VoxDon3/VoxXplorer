/*
 * Decompiled with CFR 0.152.
 */
package ax.zd;

import ax.Dd.k;
import ax.Nd.h;
import ax.vd.a;
import ax.vd.f;
import ax.vd.l;
import ax.vd.n;

public class d
implements l {
    private final a a = null;
    private final byte[] b = new byte[1];
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private final byte[] p = new byte[16];
    private int q = 0;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;

    private static final long f(int n8, int n9) {
        return ((long)n8 & 0xFFFFFFFFL) * (long)n9;
    }

    private void g() {
        int n8;
        int n9 = this.q;
        if (n9 < 16) {
            this.p[n9] = 1;
            ++n9;
            while (n9 < 16) {
                this.p[n9] = 0;
                ++n9;
            }
        }
        long l8 = ax.Nd.h.h(this.p, 0);
        long l9 = (long)ax.Nd.h.h(this.p, 4) & 0xFFFFFFFFL;
        long l10 = (long)ax.Nd.h.h(this.p, 8) & 0xFFFFFFFFL;
        long l11 = 0xFFFFFFFFL & (long)ax.Nd.h.h(this.p, 12);
        this.r = n8 = (int)((long)this.r + (l8 & 0x3FFFFFFL));
        this.s = (int)((long)this.s + ((l9 << 32 | l8 & 0xFFFFFFFFL) >>> 26 & 0x3FFFFFFL));
        this.t = (int)((long)this.t + ((l9 | l10 << 32) >>> 20 & 0x3FFFFFFL));
        this.u = (int)((long)this.u + ((l11 << 32 | l10) >>> 14 & 0x3FFFFFFL));
        this.v = n9 = (int)((long)this.v + (l11 >>> 8));
        if (this.q == 16) {
            this.v = n9 + 0x1000000;
        }
        long l12 = ax.zd.d.f(n8, this.c) + ax.zd.d.f(this.s, this.k) + ax.zd.d.f(this.t, this.j) + ax.zd.d.f(this.u, this.i) + ax.zd.d.f(this.v, this.h);
        long l13 = ax.zd.d.f(this.r, this.d);
        long l14 = ax.zd.d.f(this.s, this.c);
        long l15 = ax.zd.d.f(this.t, this.k);
        long l16 = ax.zd.d.f(this.u, this.j);
        long l17 = ax.zd.d.f(this.v, this.i);
        long l18 = ax.zd.d.f(this.r, this.e);
        long l19 = ax.zd.d.f(this.s, this.d);
        long l20 = ax.zd.d.f(this.t, this.c);
        long l21 = ax.zd.d.f(this.u, this.k);
        long l22 = ax.zd.d.f(this.v, this.j);
        long l23 = ax.zd.d.f(this.r, this.f);
        long l24 = ax.zd.d.f(this.s, this.e);
        long l25 = ax.zd.d.f(this.t, this.d);
        long l26 = ax.zd.d.f(this.u, this.c);
        long l27 = ax.zd.d.f(this.v, this.k);
        l9 = ax.zd.d.f(this.r, this.g);
        l11 = ax.zd.d.f(this.s, this.f);
        long l28 = ax.zd.d.f(this.t, this.e);
        l8 = ax.zd.d.f(this.u, this.d);
        l10 = ax.zd.d.f(this.v, this.c);
        n8 = (int)l12;
        l15 = l13 + l14 + l15 + l16 + l17 + (l12 >>> 26);
        n9 = (int)l15;
        l20 = l18 + l19 + l20 + l21 + l22 + (l15 >>> 26);
        this.t = (int)l20 & 0x3FFFFFF;
        l24 = l23 + l24 + l25 + l26 + l27 + (l20 >>> 26);
        this.u = (int)l24 & 0x3FFFFFF;
        l10 = l9 + l11 + l28 + l8 + l10 + (l24 >>> 26);
        this.v = (int)l10 & 0x3FFFFFF;
        n8 = (n8 & 0x3FFFFFF) + (int)(l10 >>> 26) * 5;
        this.s = (n9 & 0x3FFFFFF) + (n8 >>> 26);
        this.r = n8 & 0x3FFFFFF;
    }

    private void i(byte[] object, byte[] byArray) {
        if (((byte[])object).length == 32) {
            Object object2 = this.a;
            int n8 = 16;
            if (object2 != null && (byArray == null || byArray.length != 16)) {
                throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
            }
            int n9 = ax.Nd.h.h(object, 0);
            int n10 = ax.Nd.h.h(object, 4);
            int n11 = ax.Nd.h.h(object, 8);
            int n12 = ax.Nd.h.h(object, 12);
            this.c = 0x3FFFFFF & n9;
            this.d = n9 = (n9 >>> 26 | n10 << 6) & 0x3FFFF03;
            this.e = n10 = (n10 >>> 20 | n11 << 12) & 0x3FFC0FF;
            this.f = n11 = (n11 >>> 14 | n12 << 18) & 0x3F03FFF;
            this.g = n12 = n12 >>> 8 & 0xFFFFF;
            this.h = n9 * 5;
            this.i = n10 * 5;
            this.j = n11 * 5;
            this.k = n12 * 5;
            a a8 = this.a;
            if (a8 != null) {
                object2 = new byte[16];
                a8.e(true, new k((byte[])object, 16, 16));
                this.a.h(byArray, 0, (byte[])object2, 0);
                object = object2;
                n8 = 0;
            }
            this.l = ax.Nd.h.h(object, n8);
            this.m = ax.Nd.h.h(object, n8 + 4);
            this.n = ax.Nd.h.h(object, n8 + 8);
            this.o = ax.Nd.h.h(object, n8 + 12);
            return;
        }
        throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
    }

    @Override
    public int a() {
        return 16;
    }

    @Override
    public void b(byte[] byArray, int n8, int n9) throws f, IllegalStateException {
        int n10 = 0;
        while (n9 > n10) {
            if (this.q == 16) {
                this.g();
                this.q = 0;
            }
            int n11 = Math.min(n9 - n10, 16 - this.q);
            System.arraycopy(byArray, n10 + n8, this.p, this.q, n11);
            n10 += n11;
            this.q += n11;
        }
    }

    @Override
    public int c(byte[] byArray, int n8) throws f, IllegalStateException {
        if (n8 + 16 <= byArray.length) {
            if (this.q > 0) {
                this.g();
            }
            int n9 = this.s;
            int n10 = this.r;
            int n11 = n9 + (n10 >>> 26);
            int n12 = this.t + (n11 >>> 26);
            n9 = this.u + (n12 >>> 26);
            n12 &= 0x3FFFFFF;
            int n13 = this.v + (n9 >>> 26);
            n9 &= 0x3FFFFFF;
            int n14 = (n10 & 0x3FFFFFF) + (n13 >>> 26) * 5;
            n10 = n13 & 0x3FFFFFF;
            int n15 = (n11 & 0x3FFFFFF) + (n14 >>> 26);
            int n16 = n14 & 0x3FFFFFF;
            int n17 = n16 + 5;
            int n18 = (n17 >>> 26) + n15;
            int n19 = (n18 >>> 26) + n12;
            int n20 = (n19 >>> 26) + n9;
            n11 = (n20 >>> 26) + n10 - 0x4000000;
            n13 = (n11 >>> 31) - 1;
            n14 = ~n13;
            this.r = n16 = n16 & n14 | n17 & 0x3FFFFFF & n13;
            this.s = n15 = n15 & n14 | n18 & 0x3FFFFFF & n13;
            this.t = n12 = n12 & n14 | n19 & 0x3FFFFFF & n13;
            this.u = n9 = 0x3FFFFFF & n20 & n13 | n9 & n14;
            this.v = n10 = n10 & n14 | n11 & n13;
            long l8 = ((long)(n16 | n15 << 26) & 0xFFFFFFFFL) + ((long)this.l & 0xFFFFFFFFL);
            long l9 = n15 >>> 6 | n12 << 20;
            long l10 = this.m;
            long l11 = n12 >>> 12 | n9 << 14;
            long l12 = this.n;
            long l13 = n9 >>> 18 | n10 << 8;
            long l14 = this.o;
            ax.Nd.h.f((int)l8, byArray, n8);
            l10 = (l9 & 0xFFFFFFFFL) + (l10 & 0xFFFFFFFFL) + (l8 >>> 32);
            ax.Nd.h.f((int)l10, byArray, n8 + 4);
            l12 = (l11 & 0xFFFFFFFFL) + (l12 & 0xFFFFFFFFL) + (l10 >>> 32);
            ax.Nd.h.f((int)l12, byArray, n8 + 8);
            ax.Nd.h.f((int)((l13 & 0xFFFFFFFFL) + (0xFFFFFFFFL & l14) + (l12 >>> 32)), byArray, n8 + 12);
            this.h();
            return 16;
        }
        throw new n("Output buffer is too short.");
    }

    @Override
    public void d(byte by) throws IllegalStateException {
        byte[] byArray = this.b;
        byArray[0] = by;
        this.b(byArray, 0, 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void e(ax.vd.d object) throws IllegalArgumentException {
        Object object2;
        if (this.a != null) {
            if (!(object instanceof ax.Dd.l)) throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
            object2 = (ax.Dd.l)object;
            object = ((ax.Dd.l)object2).a();
            object2 = ((ax.Dd.l)object2).b();
        } else {
            Object var3_3 = null;
            object2 = object;
            object = var3_3;
        }
        if (!(object2 instanceof k)) throw new IllegalArgumentException("Poly1305 requires a key.");
        this.i(((k)object2).a(), (byte[])object);
        this.h();
    }

    public void h() {
        this.q = 0;
        this.v = 0;
        this.u = 0;
        this.t = 0;
        this.s = 0;
        this.r = 0;
    }
}

