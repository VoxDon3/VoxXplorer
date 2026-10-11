/*
 * Decompiled with CFR 0.152.
 */
package ax.I1;

import ax.q1.s;
import java.io.IOException;

final class g {
    private static final long[] d = new long[]{128L, 64L, 32L, 16L, 8L, 4L, 2L, 1L};
    private final byte[] a = new byte[8];
    private int b;
    private int c;

    public static long a(byte[] byArray, int n8, boolean bl) {
        long l8;
        long l9 = l8 = (long)byArray[0] & 0xFFL;
        if (bl) {
            l9 = l8 & (d[n8 - 1] ^ 0xFFFFFFFFFFFFFFFFL);
        }
        for (int i8 = 1; i8 < n8; ++i8) {
            l9 = l9 << 8 | (long)byArray[i8] & 0xFFL;
        }
        return l9;
    }

    public static int c(int n8) {
        long[] lArray;
        for (int i8 = 0; i8 < (lArray = d).length; ++i8) {
            if ((lArray[i8] & (long)n8) == 0L) continue;
            return i8 + 1;
        }
        return -1;
    }

    public int b() {
        return this.c;
    }

    public long d(s s8, boolean bl, boolean bl2, int n8) throws IOException {
        int n9;
        if (this.b == 0) {
            if (!s8.e(this.a, 0, 1, bl)) {
                return -1L;
            }
            this.c = n9 = g.c(this.a[0] & 0xFF);
            if (n9 != -1) {
                this.b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        if ((n9 = this.c) > n8) {
            this.b = 0;
            return -2L;
        }
        if (n9 != 1) {
            s8.readFully(this.a, 1, n9 - 1);
        }
        this.b = 0;
        return g.a(this.a, this.c, bl2);
    }

    public void e() {
        this.b = 0;
        this.c = 0;
    }
}

