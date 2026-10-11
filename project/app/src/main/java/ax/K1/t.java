/*
 * Decompiled with CFR 0.152.
 */
package ax.K1;

import ax.K1.u;
import ax.P0.v;

public final class t {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final v g;
    public final int h;
    public final long[] i;
    public final long[] j;
    public final int k;
    private final u[] l;

    public t(int n8, int n9, long l8, long l9, long l10, long l11, v v8, int n10, u[] uArray, int n11, long[] lArray, long[] lArray2) {
        this.a = n8;
        this.b = n9;
        this.c = l8;
        this.d = l9;
        this.e = l10;
        this.f = l11;
        this.g = v8;
        this.h = n10;
        this.l = uArray;
        this.k = n11;
        this.i = lArray;
        this.j = lArray2;
    }

    public t a(v v8) {
        return new t(this.a, this.b, this.c, this.d, this.e, this.f, v8, this.h, this.l, this.k, this.i, this.j);
    }

    public u b(int n8) {
        u[] uArray = this.l;
        if (uArray == null) {
            return null;
        }
        return uArray[n8];
    }
}

