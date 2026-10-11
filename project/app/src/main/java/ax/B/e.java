/*
 * Decompiled with CFR 0.152.
 */
package ax.B;

import ax.B.f;
import ax.Gb.g;
import ax.tb.i;

public final class e {
    private int[] a;
    private int b;
    private int c;
    private int d;

    public e() {
        this(0, 1, null);
    }

    public e(int n8) {
        if (n8 >= 1) {
            if (n8 <= 0x40000000) {
                int n9 = n8;
                if (Integer.bitCount(n8) != 1) {
                    n9 = Integer.highestOneBit(n8 - 1) << 1;
                }
                this.d = n9 - 1;
                this.a = new int[n9];
                return;
            }
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        throw new IllegalArgumentException("capacity must be >= 1");
    }

    public /* synthetic */ e(int n8, int n9, g g8) {
        if ((n9 & 1) != 0) {
            n8 = 8;
        }
        this(n8);
    }

    private final void c() {
        int[] nArray = this.a;
        int n8 = nArray.length;
        int n9 = this.b;
        int n10 = n8 << 1;
        if (n10 >= 0) {
            int[] nArray2 = new int[n10];
            i.e(nArray, nArray2, 0, n9, n8);
            i.e(this.a, nArray2, n8 - n9, 0, this.b);
            this.a = nArray2;
            this.b = 0;
            this.c = n8;
            this.d = n10 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public final void a(int n8) {
        int[] nArray = this.a;
        int n9 = this.c;
        nArray[n9] = n8;
        this.c = n8 = this.d & n9 + 1;
        if (n8 == this.b) {
            this.c();
        }
    }

    public final void b() {
        this.c = this.b;
    }

    public final boolean d() {
        return this.b == this.c;
    }

    public final int e() {
        int n8 = this.b;
        if (n8 != this.c) {
            int n9 = this.a[n8];
            this.b = n8 + 1 & this.d;
            return n9;
        }
        f f8 = f.a;
        throw new ArrayIndexOutOfBoundsException();
    }
}

