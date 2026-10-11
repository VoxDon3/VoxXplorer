/*
 * Decompiled with CFR 0.152.
 */
package ax.wd;

import ax.Nd.f;
import ax.Nd.h;
import ax.wd.b;

public class g
extends b {
    static final int[] n = new int[]{1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int[] l = new int[64];
    private int m;

    public g() {
        this.a();
    }

    public g(g g8) {
        super(g8);
        this.v(g8);
    }

    private static int p(int n8, int n9, int n10) {
        return ~n8 & n10 ^ n9 & n8;
    }

    private static int q(int n8, int n9, int n10) {
        return (n8 ^ n9) & n10 | n8 & n9;
    }

    private static int r(int n8) {
        return (n8 << 10 | n8 >>> 22) ^ ((n8 >>> 2 | n8 << 30) ^ (n8 >>> 13 | n8 << 19));
    }

    private static int s(int n8) {
        return (n8 << 7 | n8 >>> 25) ^ ((n8 >>> 6 | n8 << 26) ^ (n8 >>> 11 | n8 << 21));
    }

    private static int t(int n8) {
        return n8 >>> 3 ^ ((n8 >>> 7 | n8 << 25) ^ (n8 >>> 18 | n8 << 14));
    }

    private static int u(int n8) {
        return n8 >>> 10 ^ ((n8 >>> 17 | n8 << 15) ^ (n8 >>> 19 | n8 << 13));
    }

    private void v(g g8) {
        super.k(g8);
        this.d = g8.d;
        this.e = g8.e;
        this.f = g8.f;
        this.g = g8.g;
        this.h = g8.h;
        this.i = g8.i;
        this.j = g8.j;
        this.k = g8.k;
        int[] nArray = g8.l;
        System.arraycopy(nArray, 0, this.l, 0, nArray.length);
        this.m = g8.m;
    }

    @Override
    public void a() {
        int[] nArray;
        super.a();
        this.d = 1779033703;
        this.e = -1150833019;
        this.f = 1013904242;
        this.g = -1521486534;
        this.h = 1359893119;
        this.i = -1694144372;
        this.j = 528734635;
        this.k = 1541459225;
        this.m = 0;
        for (int i8 = 0; i8 != (nArray = this.l).length; ++i8) {
            nArray[i8] = 0;
        }
    }

    @Override
    public int c(byte[] byArray, int n8) {
        this.l();
        ax.Nd.h.d(this.d, byArray, n8);
        ax.Nd.h.d(this.e, byArray, n8 + 4);
        ax.Nd.h.d(this.f, byArray, n8 + 8);
        ax.Nd.h.d(this.g, byArray, n8 + 12);
        ax.Nd.h.d(this.h, byArray, n8 + 16);
        ax.Nd.h.d(this.i, byArray, n8 + 20);
        ax.Nd.h.d(this.j, byArray, n8 + 24);
        ax.Nd.h.d(this.k, byArray, n8 + 28);
        this.a();
        return 32;
    }

    @Override
    public String f() {
        return "SHA-256";
    }

    @Override
    public f g() {
        return new g(this);
    }

    @Override
    public int i() {
        return 32;
    }

    @Override
    public void j(f f8) {
        this.v((g)f8);
    }

    @Override
    protected void m() {
        int[] nArray;
        int n8;
        int n9;
        for (n9 = 16; n9 <= 63; ++n9) {
            int[] nArray2 = this.l;
            n8 = ax.wd.g.u(nArray2[n9 - 2]);
            nArray = this.l;
            nArray2[n9] = n8 + nArray[n9 - 7] + ax.wd.g.t(nArray[n9 - 15]) + this.l[n9 - 16];
        }
        int n10 = this.d;
        int n11 = this.e;
        int n12 = this.f;
        int n13 = this.g;
        int n14 = this.h;
        int n15 = this.i;
        int n16 = this.j;
        int n17 = this.k;
        n9 = 0;
        for (n8 = 0; n8 < 8; ++n8) {
            int n18 = ax.wd.g.s(n14);
            int n19 = ax.wd.g.p(n14, n15, n16);
            nArray = n;
            n18 = n17 + (n18 + n19 + nArray[n9] + this.l[n9]);
            n17 = n13 + n18;
            n13 = n18 + (ax.wd.g.r(n10) + ax.wd.g.q(n10, n11, n12));
            n18 = n9 + 1;
            n12 += (n16 += ax.wd.g.s(n17) + ax.wd.g.p(n17, n14, n15) + nArray[n18] + this.l[n18]);
            n16 += ax.wd.g.r(n13) + ax.wd.g.q(n13, n10, n11);
            n18 = n9 + 2;
            n11 += (n15 += ax.wd.g.s(n12) + ax.wd.g.p(n12, n17, n14) + nArray[n18] + this.l[n18]);
            n15 += ax.wd.g.r(n16) + ax.wd.g.q(n16, n13, n10);
            n18 = n9 + 3;
            n10 += (n14 += ax.wd.g.s(n11) + ax.wd.g.p(n11, n12, n17) + nArray[n18] + this.l[n18]);
            n14 += ax.wd.g.r(n15) + ax.wd.g.q(n15, n16, n13);
            n18 = n9 + 4;
            n18 = n17 + (ax.wd.g.s(n10) + ax.wd.g.p(n10, n11, n12) + nArray[n18] + this.l[n18]);
            n17 = n13 + n18;
            n13 = n18 + (ax.wd.g.r(n14) + ax.wd.g.q(n14, n15, n16));
            n18 = n9 + 5;
            n16 += (n12 += ax.wd.g.s(n17) + ax.wd.g.p(n17, n10, n11) + nArray[n18] + this.l[n18]);
            n12 += ax.wd.g.r(n13) + ax.wd.g.q(n13, n14, n15);
            n18 = n9 + 6;
            n15 += (n11 += ax.wd.g.s(n16) + ax.wd.g.p(n16, n17, n10) + nArray[n18] + this.l[n18]);
            n11 += ax.wd.g.r(n12) + ax.wd.g.q(n12, n13, n14);
            n18 = n9 + 7;
            n14 += (n10 += ax.wd.g.s(n15) + ax.wd.g.p(n15, n16, n17) + nArray[n18] + this.l[n18]);
            n10 += ax.wd.g.r(n11) + ax.wd.g.q(n11, n12, n13);
            n9 += 8;
        }
        this.d += n10;
        this.e += n11;
        this.f += n12;
        this.g += n13;
        this.h += n14;
        this.i += n15;
        this.j += n16;
        this.k += n17;
        this.m = 0;
        for (n9 = 0; n9 < 16; ++n9) {
            this.l[n9] = 0;
        }
    }

    @Override
    protected void n(long l8) {
        if (this.m > 14) {
            this.m();
        }
        int[] nArray = this.l;
        nArray[14] = (int)(l8 >>> 32);
        nArray[15] = (int)l8;
    }

    @Override
    protected void o(byte[] objectArray, int n8) {
        byte by = objectArray[n8];
        byte by2 = objectArray[n8 + 1];
        byte by3 = objectArray[n8 + 2];
        n8 = objectArray[n8 + 3];
        objectArray = this.l;
        int n9 = this.m;
        objectArray[n9] = n8 & 0xFF | (by << 24 | (by2 & 0xFF) << 16 | (by3 & 0xFF) << 8);
        this.m = n8 = n9 + 1;
        if (n8 == 16) {
            this.m();
        }
    }
}

