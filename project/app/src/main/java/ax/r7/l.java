/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.j;
import ax.r7.w;
import java.util.Arrays;

final class l {
    static Object a(int n8) {
        if (n8 >= 2 && n8 <= 0x40000000 && Integer.highestOneBit(n8) == n8) {
            if (n8 <= 256) {
                return new byte[n8];
            }
            if (n8 <= 65536) {
                return new short[n8];
            }
            return new int[n8];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("must be power of 2 between 2^1 and 2^30: ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    static int b(int n8, int n9) {
        return n8 & ~n9;
    }

    static int c(int n8, int n9) {
        return n8 & n9;
    }

    static int d(int n8, int n9, int n10) {
        return n8 & ~n10 | n9 & n10;
    }

    static int e(int n8) {
        int n9 = n8 < 32 ? 4 : 2;
        return n9 * (n8 + 1);
    }

    static int f(Object object, Object object2, int n8, Object object3, int[] nArray, Object[] objectArray, Object[] objectArray2) {
        int n9 = w.c(object);
        int n10 = n9 & n8;
        int n11 = l.h(object3, n10);
        if (n11 == 0) {
            return -1;
        }
        int n12 = l.b(n9, n8);
        n9 = -1;
        while (true) {
            int n13;
            if (l.b(n13 = nArray[--n11], n8) == n12 && j.a(object, objectArray[n11]) && (objectArray2 == null || j.a(object2, objectArray2[n11]))) {
                n13 = l.c(n13, n8);
                if (n9 == -1) {
                    l.i(object3, n10, n13);
                    return n11;
                }
                nArray[n9] = l.d(nArray[n9], n13, n8);
                return n11;
            }
            if ((n13 = l.c(n13, n8)) == 0) {
                return -1;
            }
            n9 = n11;
            n11 = n13;
        }
    }

    static void g(Object object) {
        if (object instanceof byte[]) {
            Arrays.fill((byte[])object, (byte)0);
            return;
        }
        if (object instanceof short[]) {
            Arrays.fill((short[])object, (short)0);
            return;
        }
        Arrays.fill((int[])object, 0);
    }

    static int h(Object object, int n8) {
        if (object instanceof byte[]) {
            return ((byte[])object)[n8] & 0xFF;
        }
        if (object instanceof short[]) {
            return ((short[])object)[n8] & 0xFFFF;
        }
        return ((int[])object)[n8];
    }

    static void i(Object object, int n8, int n9) {
        if (object instanceof byte[]) {
            ((byte[])object)[n8] = (byte)n9;
            return;
        }
        if (object instanceof short[]) {
            ((short[])object)[n8] = (short)n9;
            return;
        }
        ((int[])object)[n8] = n9;
    }

    static int j(int n8) {
        return Math.max(4, w.a(n8 + 1, 1.0));
    }
}

