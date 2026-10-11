/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.S0.d0;
import ax.q1.N;
import ax.q1.O;
import java.util.Arrays;

public final class h
implements N {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    public h(int[] nArray, long[] lArray, long[] lArray2, long[] lArray3) {
        int n8;
        this.b = nArray;
        this.c = lArray;
        this.d = lArray2;
        this.e = lArray3;
        this.a = n8 = nArray.length;
        if (n8 > 0) {
            this.f = lArray2[n8 - 1] + lArray3[n8 - 1];
            return;
        }
        this.f = 0L;
    }

    public int a(long l8) {
        return d0.h(this.e, l8, true, true);
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public N.a l(long l8) {
        int n8 = this.a(l8);
        O o8 = new O(this.e[n8], this.c[n8]);
        if (o8.a < l8 && n8 != this.a - 1) {
            long[] lArray = this.e;
            return new N.a(o8, new O(lArray[++n8], this.c[n8]));
        }
        return new N.a(o8);
    }

    @Override
    public long n() {
        return this.f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ChunkIndex(length=");
        stringBuilder.append(this.a);
        stringBuilder.append(", sizes=");
        stringBuilder.append(Arrays.toString(this.b));
        stringBuilder.append(", offsets=");
        stringBuilder.append(Arrays.toString(this.c));
        stringBuilder.append(", timeUs=");
        stringBuilder.append(Arrays.toString(this.e));
        stringBuilder.append(", durationsUs=");
        stringBuilder.append(Arrays.toString(this.d));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

