/*
 * Decompiled with CFR 0.152.
 */
package ax.wd;

import ax.Nd.f;
import ax.wd.b;

public class e
extends b {
    private int d;
    private int e;
    private int f;
    private int g;
    private int[] h = new int[16];
    private int i;

    public e() {
        this.a();
    }

    public e(e e8) {
        super(e8);
        this.s(e8);
    }

    private int p(int n8, int n9, int n10) {
        return ~n8 & n10 | n9 & n8;
    }

    private int q(int n8, int n9, int n10) {
        return n8 & (n9 | n10) | n9 & n10;
    }

    private int r(int n8, int n9, int n10) {
        return n8 ^ n9 ^ n10;
    }

    private void s(e e8) {
        super.k(e8);
        this.d = e8.d;
        this.e = e8.e;
        this.f = e8.f;
        this.g = e8.g;
        int[] nArray = e8.h;
        System.arraycopy(nArray, 0, this.h, 0, nArray.length);
        this.i = e8.i;
    }

    private int t(int n8, int n9) {
        return n8 >>> 32 - n9 | n8 << n9;
    }

    private void u(int n8, byte[] byArray, int n9) {
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
        this.u(this.d, byArray, n8);
        this.u(this.e, byArray, n8 + 4);
        this.u(this.f, byArray, n8 + 8);
        this.u(this.g, byArray, n8 + 12);
        this.a();
        return 16;
    }

    @Override
    public String f() {
        return "MD4";
    }

    @Override
    public f g() {
        return new e(this);
    }

    @Override
    public int i() {
        return 16;
    }

    @Override
    public void j(f f8) {
        this.s((e)f8);
    }

    @Override
    protected void m() {
        int[] nArray;
        int n8 = this.d;
        int n9 = this.e;
        int n10 = this.f;
        int n11 = this.g;
        n8 = this.t(n8 + this.p(n9, n10, n11) + this.h[0], 3);
        n11 = this.t(n11 + this.p(n8, n9, n10) + this.h[1], 7);
        n10 = this.t(n10 + this.p(n11, n8, n9) + this.h[2], 11);
        n9 = this.t(n9 + this.p(n10, n11, n8) + this.h[3], 19);
        int n12 = this.t(n8 + this.p(n9, n10, n11) + this.h[4], 3);
        n11 = this.t(n11 + this.p(n12, n9, n10) + this.h[5], 7);
        n8 = this.t(n10 + this.p(n11, n12, n9) + this.h[6], 11);
        n10 = this.t(n9 + this.p(n8, n11, n12) + this.h[7], 19);
        n12 = this.t(n12 + this.p(n10, n8, n11) + this.h[8], 3);
        n9 = this.t(n11 + this.p(n12, n10, n8) + this.h[9], 7);
        n8 = this.t(n8 + this.p(n9, n12, n10) + this.h[10], 11);
        int n13 = this.t(n10 + this.p(n8, n9, n12) + this.h[11], 19);
        n11 = this.t(n12 + this.p(n13, n8, n9) + this.h[12], 3);
        n10 = this.t(n9 + this.p(n11, n13, n8) + this.h[13], 7);
        n9 = this.t(n8 + this.p(n10, n11, n13) + this.h[14], 11);
        n12 = this.t(n13 + this.p(n9, n10, n11) + this.h[15], 19);
        n11 = this.t(n11 + this.q(n12, n9, n10) + this.h[0] + 1518500249, 3);
        n8 = this.t(n10 + this.q(n11, n12, n9) + this.h[4] + 1518500249, 5);
        n10 = this.t(n9 + this.q(n8, n11, n12) + this.h[8] + 1518500249, 9);
        n9 = this.t(n12 + this.q(n10, n8, n11) + this.h[12] + 1518500249, 13);
        n11 = this.t(n11 + this.q(n9, n10, n8) + this.h[1] + 1518500249, 3);
        n12 = this.t(n8 + this.q(n11, n9, n10) + this.h[5] + 1518500249, 5);
        n8 = this.t(n10 + this.q(n12, n11, n9) + this.h[9] + 1518500249, 9);
        n13 = this.t(n9 + this.q(n8, n12, n11) + this.h[13] + 1518500249, 13);
        n11 = this.t(n11 + this.q(n13, n8, n12) + this.h[2] + 1518500249, 3);
        n10 = this.t(n12 + this.q(n11, n13, n8) + this.h[6] + 1518500249, 5);
        n9 = this.t(n8 + this.q(n10, n11, n13) + this.h[10] + 1518500249, 9);
        n8 = this.t(n13 + this.q(n9, n10, n11) + this.h[14] + 1518500249, 13);
        n11 = this.t(n11 + this.q(n8, n9, n10) + this.h[3] + 1518500249, 3);
        n10 = this.t(n10 + this.q(n11, n8, n9) + this.h[7] + 1518500249, 5);
        n9 = this.t(n9 + this.q(n10, n11, n8) + this.h[11] + 1518500249, 9);
        n8 = this.t(n8 + this.q(n9, n10, n11) + this.h[15] + 1518500249, 13);
        n11 = this.t(n11 + this.r(n8, n9, n10) + this.h[0] + 1859775393, 3);
        n10 = this.t(n10 + this.r(n11, n8, n9) + this.h[8] + 1859775393, 9);
        n9 = this.t(n9 + this.r(n10, n11, n8) + this.h[4] + 1859775393, 11);
        n8 = this.t(n8 + this.r(n9, n10, n11) + this.h[12] + 1859775393, 15);
        n11 = this.t(n11 + this.r(n8, n9, n10) + this.h[2] + 1859775393, 3);
        n10 = this.t(n10 + this.r(n11, n8, n9) + this.h[10] + 1859775393, 9);
        n9 = this.t(n9 + this.r(n10, n11, n8) + this.h[6] + 1859775393, 11);
        n8 = this.t(n8 + this.r(n9, n10, n11) + this.h[14] + 1859775393, 15);
        n11 = this.t(n11 + this.r(n8, n9, n10) + this.h[1] + 1859775393, 3);
        n12 = this.t(n10 + this.r(n11, n8, n9) + this.h[9] + 1859775393, 9);
        n10 = this.t(n9 + this.r(n12, n11, n8) + this.h[5] + 1859775393, 11);
        n9 = this.t(n8 + this.r(n10, n12, n11) + this.h[13] + 1859775393, 15);
        n11 = this.t(n11 + this.r(n9, n10, n12) + this.h[3] + 1859775393, 3);
        n8 = this.t(n12 + this.r(n11, n9, n10) + this.h[11] + 1859775393, 9);
        n10 = this.t(n10 + this.r(n8, n11, n9) + this.h[7] + 1859775393, 11);
        n9 = this.t(n9 + this.r(n10, n8, n11) + this.h[15] + 1859775393, 15);
        this.d += n11;
        this.e += n9;
        this.f += n10;
        this.g += n8;
        this.i = 0;
        for (n10 = 0; n10 != (nArray = this.h).length; ++n10) {
            nArray[n10] = 0;
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

