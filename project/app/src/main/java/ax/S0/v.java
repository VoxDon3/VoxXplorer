/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import java.util.Arrays;

public final class v {
    private int a;
    private long[] b;

    public v() {
        this(32);
    }

    public v(int n8) {
        this.b = new long[n8];
    }

    public void a(long l8) {
        int n8 = this.a;
        long[] lArray = this.b;
        if (n8 == lArray.length) {
            this.b = Arrays.copyOf(lArray, n8 * 2);
        }
        lArray = this.b;
        n8 = this.a;
        this.a = n8 + 1;
        lArray[n8] = l8;
    }

    public void b(long[] lArray) {
        int n8 = this.a + lArray.length;
        long[] lArray2 = this.b;
        if (n8 > lArray2.length) {
            this.b = Arrays.copyOf(lArray2, Math.max(lArray2.length * 2, n8));
        }
        System.arraycopy(lArray, 0, this.b, this.a, lArray.length);
        this.a = n8;
    }

    public long c(int n8) {
        if (n8 >= 0 && n8 < this.a) {
            return this.b[n8];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid index ");
        stringBuilder.append(n8);
        stringBuilder.append(", size is ");
        stringBuilder.append(this.a);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public int d() {
        return this.a;
    }
}

