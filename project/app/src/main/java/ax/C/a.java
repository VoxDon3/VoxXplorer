/*
 * Decompiled with CFR 0.152.
 */
package ax.C;

import ax.Gb.l;

public final class a {
    public static final int[] a = new int[0];
    public static final long[] b = new long[0];
    public static final Object[] c = new Object[0];

    public static final int a(int[] nArray, int n8, int n9) {
        l.f(nArray, "array");
        --n8;
        int n10 = 0;
        while (n10 <= n8) {
            int n11 = n10 + n8 >>> 1;
            int n12 = nArray[n11];
            if (n12 < n9) {
                n10 = n11 + 1;
                continue;
            }
            if (n12 > n9) {
                n8 = n11 - 1;
                continue;
            }
            return n11;
        }
        return ~n10;
    }

    public static final int b(long[] lArray, int n8, long l8) {
        l.f(lArray, "array");
        --n8;
        int n9 = 0;
        while (n9 <= n8) {
            int n10 = n9 + n8 >>> 1;
            long l9 = lArray[n10] - l8;
            long l10 = l9 == 0L ? 0 : (l9 < 0L ? -1 : 1);
            if (l10 < 0) {
                n9 = n10 + 1;
                continue;
            }
            if (l10 > 0) {
                n8 = n10 - 1;
                continue;
            }
            return n10;
        }
        return ~n9;
    }

    public static final boolean c(Object object, Object object2) {
        return l.a(object, object2);
    }

    public static final int d(int n8) {
        for (int i8 = 4; i8 < 32; ++i8) {
            int n9 = (1 << i8) - 12;
            if (n8 > n9) continue;
            return n9;
        }
        return n8;
    }

    public static final int e(int n8) {
        return ax.C.a.d(n8 * 4) / 4;
    }

    public static final int f(int n8) {
        return ax.C.a.d(n8 * 8) / 8;
    }
}

