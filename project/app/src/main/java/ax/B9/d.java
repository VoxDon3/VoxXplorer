/*
 * Decompiled with CFR 0.152.
 */
package ax.B9;

import ax.B9.a;
import ax.D9.b;

public class d
extends a {
    private short[] i;

    public d(int n8, int n9) {
        this.e(n8, n9);
    }

    public d(short[] sArray) {
        this(sArray.length, 1);
        this.g(sArray);
    }

    @Override
    public double a(int n8) {
        return b.o(this.i[n8]);
    }

    public void e(int n8, int n9) {
        this.i = new short[n8 * n9];
        this.f = n8;
        this.g = n9;
    }

    public void f(int n8, short[] sArray, int n9, int n10) {
        int n11 = this.g;
        System.arraycopy(sArray, n9, this.i, n8 * n11, n10 * n11);
    }

    public void g(short[] sArray) {
        this.f(0, sArray, 0, sArray.length);
    }
}

