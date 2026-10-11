/*
 * Decompiled with CFR 0.152.
 */
package ax.o9;

import ax.o9.c;

public class a
extends c {
    private final byte[] e0;
    private int f0;
    private int g0;

    public a(byte[] byArray, int n8, int n9, long l8) {
        this.e0 = byArray;
        this.q = l8;
        this.f0 = n8;
        this.g0 = n9;
    }

    @Override
    public int a() {
        return this.g0;
    }

    @Override
    protected int b(byte[] byArray) {
        int n8 = byArray.length;
        int n9 = this.g0;
        int n10 = n8;
        if (n8 > n9) {
            n10 = n9;
        }
        System.arraycopy(this.e0, this.f0, byArray, 0, n10);
        this.f0 += n10;
        this.g0 -= n10;
        return n10;
    }

    @Override
    public boolean e() {
        return this.g0 > 0;
    }

    @Override
    public void f(int n8) {
    }
}

