/*
 * Decompiled with CFR 0.152.
 */
package ax.wd;

import ax.wd.b;

public class f
extends b {
    private int d;
    private int e;
    private int f;
    private int g;
    private int[] h = new int[16];
    private int i;

    public f() {
        this.a();
    }

    public f(f f8) {
        super(f8);
        this.t(f8);
    }

    private int p(int n8, int n9, int n10) {
        return ~n8 & n10 | n9 & n8;
    }

    private int q(int n8, int n9, int n10) {
        return n8 & n10 | n9 & ~n10;
    }

    private int r(int n8, int n9, int n10) {
        return n8 ^ n9 ^ n10;
    }

    private int s(int n8, int n9, int n10) {
        return (n8 | ~n10) ^ n9;
    }

    private void t(f f8) {
        super.k(f8);
        this.d = f8.d;
        this.e = f8.e;
        this.f = f8.f;
        this.g = f8.g;
        int[] nArray = f8.h;
        System.arraycopy(nArray, 0, this.h, 0, nArray.length);
        this.i = f8.i;
    }

    private int u(int n8, int n9) {
        return n8 >>> 32 - n9 | n8 << n9;
    }

    private void v(int n8, byte[] byArray, int n9) {
        byArray[n9] = (byte)n8;
        byArray[n9 + 1] = (byte)(n8 >>> 8);
        byArray[n9 + 2] = (byte)(n8 >>> 16);
        byArray[n9 + 3] = (byte)(n8 >>> 24);
    }

    @Override
    public void a() {
        int[] nArray;
        super.a();
        this.d = 1732584193;
        this.e = -271733879;
        this.f = -1732584194;
        this.g = 271733878;
        this.i = 0;
        for (int i8 = 0; i8 != (nArray = this.h).length; ++i8) {
            nArray[i8] = 0;
        }
    }

    @Override
    public int c(byte[] byArray, int n8) {
        this.l();
        this.v(this.d, byArray, n8);
        this.v(this.e, byArray, n8 + 4);
        this.v(this.f, byArray, n8 + 8);
        this.v(this.g, byArray, n8 + 12);
        this.a();
        return 16;
    }

    @Override
    public String f() {
        return "MD5";
    }

    @Override
    public ax.Nd.f g() {
        return new f(this);
    }

    @Override
    public int i() {
        return 16;
    }

    @Override
    public void j(ax.Nd.f f8) {
        this.t((f)f8);
    }

    @Override
    protected void m() {
        int[] nArray;
        int n8 = this.d;
        int n9 = this.e;
        int n10 = this.f;
        int n11 = this.g;
        n8 = this.u(n8 + this.p(n9, n10, n11) + this.h[0] - 680876936, 7) + n9;
        n11 = this.u(n11 + this.p(n8, n9, n10) + this.h[1] - 389564586, 12) + n8;
        n10 = this.u(n10 + this.p(n11, n8, n9) + this.h[2] + 606105819, 17) + n11;
        int n12 = this.u(n9 + this.p(n10, n11, n8) + this.h[3] - 1044525330, 22) + n10;
        n8 = this.u(n8 + this.p(n12, n10, n11) + this.h[4] - 176418897, 7) + n12;
        n9 = this.u(n11 + this.p(n8, n12, n10) + this.h[5] + 1200080426, 12) + n8;
        n11 = this.u(n10 + this.p(n9, n8, n12) + this.h[6] - 1473231341, 17) + n9;
        n10 = this.u(n12 + this.p(n11, n9, n8) + this.h[7] - 45705983, 22) + n11;
        n8 = this.u(n8 + this.p(n10, n11, n9) + this.h[8] + 1770035416, 7) + n10;
        n9 = this.u(n9 + this.p(n8, n10, n11) + this.h[9] - 1958414417, 12) + n8;
        n12 = this.u(n11 + this.p(n9, n8, n10) + this.h[10] - 42063, 17) + n9;
        n10 = this.u(n10 + this.p(n12, n9, n8) + this.h[11] - 1990404162, 22) + n12;
        n8 = this.u(n8 + this.p(n10, n12, n9) + this.h[12] + 1804603682, 7) + n10;
        n11 = this.u(n9 + this.p(n8, n10, n12) + this.h[13] - 40341101, 12) + n8;
        n12 = this.u(n12 + this.p(n11, n8, n10) + this.h[14] - 1502002290, 17) + n11;
        n9 = this.u(n10 + this.p(n12, n11, n8) + this.h[15] + 1236535329, 22) + n12;
        n8 = this.u(n8 + this.q(n9, n12, n11) + this.h[1] - 165796510, 5) + n9;
        n11 = this.u(n11 + this.q(n8, n9, n12) + this.h[6] - 1069501632, 9) + n8;
        int n13 = this.u(n12 + this.q(n11, n8, n9) + this.h[11] + 643717713, 14) + n11;
        n10 = this.u(n9 + this.q(n13, n11, n8) + this.h[0] - 373897302, 20) + n13;
        n8 = this.u(n8 + this.q(n10, n13, n11) + this.h[5] - 701558691, 5) + n10;
        n12 = this.u(n11 + this.q(n8, n10, n13) + this.h[10] + 38016083, 9) + n8;
        n9 = this.u(n13 + this.q(n12, n8, n10) + this.h[15] - 660478335, 14) + n12;
        n11 = this.u(n10 + this.q(n9, n12, n8) + this.h[4] - 405537848, 20) + n9;
        n8 = this.u(n8 + this.q(n11, n9, n12) + this.h[9] + 568446438, 5) + n11;
        n10 = this.u(n12 + this.q(n8, n11, n9) + this.h[14] - 1019803690, 9) + n8;
        n9 = this.u(n9 + this.q(n10, n8, n11) + this.h[3] - 187363961, 14) + n10;
        n11 = this.u(n11 + this.q(n9, n10, n8) + this.h[8] + 1163531501, 20) + n9;
        n8 = this.u(n8 + this.q(n11, n9, n10) + this.h[13] - 1444681467, 5) + n11;
        n10 = this.u(n10 + this.q(n8, n11, n9) + this.h[2] - 51403784, 9) + n8;
        n9 = this.u(n9 + this.q(n10, n8, n11) + this.h[7] + 1735328473, 14) + n10;
        n11 = this.u(n11 + this.q(n9, n10, n8) + this.h[12] - 1926607734, 20) + n9;
        n8 = this.u(n8 + this.r(n11, n9, n10) + this.h[5] - 378558, 4) + n11;
        n10 = this.u(n10 + this.r(n8, n11, n9) + this.h[8] - 2022574463, 11) + n8;
        n9 = this.u(n9 + this.r(n10, n8, n11) + this.h[11] + 1839030562, 16) + n10;
        n11 = this.u(n11 + this.r(n9, n10, n8) + this.h[14] - 35309556, 23) + n9;
        n8 = this.u(n8 + this.r(n11, n9, n10) + this.h[1] - 1530992060, 4) + n11;
        n10 = this.u(n10 + this.r(n8, n11, n9) + this.h[4] + 1272893353, 11) + n8;
        n9 = this.u(n9 + this.r(n10, n8, n11) + this.h[7] - 155497632, 16) + n10;
        n12 = this.u(n11 + this.r(n9, n10, n8) + this.h[10] - 1094730640, 23) + n9;
        n8 = this.u(n8 + this.r(n12, n9, n10) + this.h[13] + 681279174, 4) + n12;
        n10 = this.u(n10 + this.r(n8, n12, n9) + this.h[0] - 358537222, 11) + n8;
        n11 = this.u(n9 + this.r(n10, n8, n12) + this.h[3] - 722521979, 16) + n10;
        n13 = this.u(n12 + this.r(n11, n10, n8) + this.h[6] + 76029189, 23) + n11;
        n9 = this.u(n8 + this.r(n13, n11, n10) + this.h[9] - 640364487, 4) + n13;
        n10 = this.u(n10 + this.r(n9, n13, n11) + this.h[12] - 421815835, 11) + n9;
        n12 = this.u(n11 + this.r(n10, n9, n13) + this.h[15] + 530742520, 16) + n10;
        n8 = this.u(n13 + this.r(n12, n10, n9) + this.h[2] - 995338651, 23) + n12;
        n11 = this.u(n9 + this.s(n8, n12, n10) + this.h[0] - 198630844, 6) + n8;
        n9 = this.u(n10 + this.s(n11, n8, n12) + this.h[7] + 1126891415, 10) + n11;
        n10 = this.u(n12 + this.s(n9, n11, n8) + this.h[14] - 1416354905, 15) + n9;
        int n14 = this.u(n8 + this.s(n10, n9, n11) + this.h[5] - 57434055, 21) + n10;
        n12 = this.u(n11 + this.s(n14, n10, n9) + this.h[12] + 1700485571, 6) + n14;
        n8 = this.u(n9 + this.s(n12, n14, n10) + this.h[3] - 1894986606, 10) + n12;
        n13 = this.u(n10 + this.s(n8, n12, n14) + this.h[10] - 1051523, 15) + n8;
        n11 = this.u(n14 + this.s(n13, n8, n12) + this.h[1] - 2054922799, 21) + n13;
        n9 = this.u(n12 + this.s(n11, n13, n8) + this.h[8] + 1873313359, 6) + n11;
        n10 = this.u(n8 + this.s(n9, n11, n13) + this.h[15] - 30611744, 10) + n9;
        n12 = this.u(n13 + this.s(n10, n9, n11) + this.h[6] - 1560198380, 15) + n10;
        n8 = this.u(n11 + this.s(n12, n10, n9) + this.h[13] + 1309151649, 21) + n12;
        n9 = this.u(n9 + this.s(n8, n12, n10) + this.h[4] - 145523070, 6) + n8;
        n10 = this.u(n10 + this.s(n9, n8, n12) + this.h[11] - 1120210379, 10) + n9;
        n11 = this.u(n12 + this.s(n10, n9, n8) + this.h[2] + 718787259, 15) + n10;
        n8 = this.u(n8 + this.s(n11, n10, n9) + this.h[9] - 343485551, 21);
        this.d += n9;
        this.e += n8 + n11;
        this.f += n11;
        this.g += n10;
        this.i = 0;
        for (n9 = 0; n9 != (nArray = this.h).length; ++n9) {
            nArray[n9] = 0;
        }
    }

    @Override
    protected void n(long l8) {
        if (this.i > 14) {
            this.m();
        }
        int[] nArray = this.h;
        nArray[14] = (int)l8;
        nArray[15] = (int)(l8 >>> 32);
    }

    @Override
    protected void o(byte[] byArray, int n8) {
        int n9;
        int[] nArray = this.h;
        int n10 = this.i;
        this.i = n9 = n10 + 1;
        byte by = byArray[n8];
        byte by2 = byArray[n8 + 1];
        byte by3 = byArray[n8 + 2];
        nArray[n10] = (byArray[n8 + 3] & 0xFF) << 24 | (by & 0xFF | (by2 & 0xFF) << 8 | (by3 & 0xFF) << 16);
        if (n9 == 16) {
            this.m();
        }
    }
}

