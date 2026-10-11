/*
 * Decompiled with CFR 0.152.
 */
package ax.ge;

import ax.be.c;
import ax.ge.b;
import ax.ge.f;

final class d
extends b {
    private final int b;
    private final int[] c;
    private final int[] d;
    private final int[] e;
    private final int f;
    private int g = 0;
    private int h = 0;
    private int i = 0;

    d(int n8, c c8) {
        this.c = c8.c(1024, true);
        this.d = c8.c(65536, true);
        this.f = n8 = ax.ge.d.e(n8);
        this.e = c8.c(n8, true);
        this.b = n8 - 1;
    }

    static int e(int n8) {
        int n9;
        --n8;
        n8 |= n8 >>> 1;
        n8 |= n8 >>> 2;
        n8 |= n8 >>> 4;
        n8 = n9 = (n8 | n8 >>> 8) >>> 1 | 0xFFFF;
        if (n9 > 0x1000000) {
            n8 = n9 >>> 1;
        }
        return n8 + 1;
    }

    void a(byte[] byArray, int n8) {
        int[] nArray = ax.ge.b.a;
        int n9 = nArray[byArray[n8] & 0xFF] ^ byArray[n8 + 1] & 0xFF;
        this.g = n9 & 0x3FF;
        this.h = 0xFFFF & (n9 ^= (byArray[n8 + 2] & 0xFF) << 8);
        this.i = (nArray[byArray[n8 + 3] & 0xFF] << 5 ^ n9) & this.b;
    }

    int b() {
        return this.c[this.g];
    }

    int c() {
        return this.d[this.h];
    }

    int d() {
        return this.e[this.i];
    }

    void f(int n8) {
        ax.ge.f.p(this.c, 1024, n8);
        ax.ge.f.p(this.d, 65536, n8);
        ax.ge.f.p(this.e, this.f, n8);
    }

    void g(c c8) {
        c8.e(this.e);
        c8.e(this.d);
        c8.e(this.c);
    }

    void h(int n8) {
        this.c[this.g] = n8;
        this.d[this.h] = n8;
        this.e[this.i] = n8;
    }
}

