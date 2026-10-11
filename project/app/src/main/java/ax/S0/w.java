/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import ax.S0.a;
import java.util.NoSuchElementException;

public final class w {
    private int a;
    private int b;
    private int c;
    private long[] d;
    private int e;

    public w() {
        this(16);
    }

    public w(int n8) {
        boolean bl = n8 >= 0 && n8 <= 0x40000000;
        ax.S0.a.a(bl);
        int n9 = n8;
        if (n8 == 0) {
            n9 = 1;
        }
        n8 = n9;
        if (Integer.bitCount(n9) != 1) {
            n8 = Integer.highestOneBit(n9 - 1) << 1;
        }
        this.a = 0;
        this.b = -1;
        this.c = 0;
        long[] lArray = new long[n8];
        this.d = lArray;
        this.e = lArray.length - 1;
    }

    private void c() {
        long[] lArray = this.d;
        int n8 = lArray.length << 1;
        if (n8 >= 0) {
            long[] lArray2 = new long[n8];
            int n9 = lArray.length;
            n8 = this.a;
            System.arraycopy(lArray, n8, lArray2, 0, n9 -= n8);
            System.arraycopy(this.d, 0, lArray2, n9, n8);
            this.a = 0;
            this.b = this.c - 1;
            this.d = lArray2;
            this.e = lArray2.length - 1;
            return;
        }
        throw new IllegalStateException();
    }

    public void a(long l8) {
        int n8;
        if (this.c == this.d.length) {
            this.c();
        }
        this.b = n8 = this.b + 1 & this.e;
        this.d[n8] = l8;
        ++this.c;
    }

    public void b() {
        this.a = 0;
        this.b = -1;
        this.c = 0;
    }

    public long d() {
        if (this.c != 0) {
            return this.d[this.a];
        }
        throw new NoSuchElementException();
    }

    public boolean e() {
        return this.c == 0;
    }

    public long f() {
        int n8 = this.c;
        if (n8 != 0) {
            long[] lArray = this.d;
            int n9 = this.a;
            long l8 = lArray[n9];
            this.a = this.e & n9 + 1;
            this.c = n8 - 1;
            return l8;
        }
        throw new NoSuchElementException();
    }
}

