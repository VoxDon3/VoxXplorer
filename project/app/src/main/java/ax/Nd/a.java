/*
 * Decompiled with CFR 0.152.
 */
package ax.Nd;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a {
    public static boolean a(byte[] byArray, int n8, int n9) {
        int n10 = 0;
        for (int i8 = 0; i8 < n9; ++i8) {
            n10 |= byArray[n8 + i8];
        }
        return n10 == 0;
    }

    public static boolean b(byte[] byArray, byte[] byArray2) {
        return Arrays.equals(byArray, byArray2);
    }

    public static boolean c(char[] cArray, char[] cArray2) {
        return Arrays.equals(cArray, cArray2);
    }

    public static byte[] d(byte[] byArray) {
        if (byArray == null) {
            return null;
        }
        return (byte[])byArray.clone();
    }

    public static boolean e(byte[] byArray, byte[] byArray2) {
        if (byArray != null && byArray2 != null) {
            int n8;
            if (byArray == byArray2) {
                return true;
            }
            int n9 = byArray.length < byArray2.length ? byArray.length : byArray2.length;
            int n10 = byArray.length ^ byArray2.length;
            int n11 = 0;
            while (true) {
                n8 = n10;
                if (n11 == n9) break;
                n10 |= byArray[n11] ^ byArray2[n11];
                ++n11;
            }
            for (int i8 = n9; i8 < byArray2.length; ++i8) {
                n9 = byArray2[i8];
                n8 |= n9 ^ ~n9;
            }
            if (n8 == 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[] f(byte[] byArray, int n8, int n9) {
        n9 = a.k(n8, n9);
        byte[] byArray2 = new byte[n9];
        System.arraycopy(byArray, n8, byArray2, 0, Math.min(byArray.length - n8, n9));
        return byArray2;
    }

    public static void g(byte[] byArray, byte by) {
        Arrays.fill(byArray, by);
    }

    public static void h(byte[] byArray, int n8, int n9, byte by) {
        Arrays.fill(byArray, n8, n9, by);
    }

    public static void i(int[] nArray, int n8) {
        Arrays.fill(nArray, n8);
    }

    public static void j(long[] lArray, long l8) {
        Arrays.fill(lArray, l8);
    }

    private static int k(int n8, int n9) {
        int n10 = n9 - n8;
        if (n10 >= 0) {
            return n10;
        }
        StringBuffer stringBuffer = new StringBuffer(n8);
        stringBuffer.append(" > ");
        stringBuffer.append(n9);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static int l(byte[] byArray) {
        if (byArray == null) {
            return 0;
        }
        int n8 = byArray.length;
        int n9 = n8 + 1;
        while (--n8 >= 0) {
            n9 = n9 * 257 ^ byArray[n8];
        }
        return n9;
    }

    public static int m(byte[] byArray, int n8, int n9) {
        if (byArray == null) {
            return 0;
        }
        int n10 = n9 + 1;
        while (--n9 >= 0) {
            n10 = n10 * 257 ^ byArray[n8 + n9];
        }
        return n10;
    }

    public static int n(char[] cArray) {
        if (cArray == null) {
            return 0;
        }
        int n8 = cArray.length;
        int n9 = n8 + 1;
        while (--n8 >= 0) {
            n9 = n9 * 257 ^ cArray[n8];
        }
        return n9;
    }

    public static boolean o(Object[] objectArray) {
        if (objectArray == null) {
            return true;
        }
        int n8 = objectArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (objectArray[i8] != null) continue;
            return true;
        }
        return false;
    }

    public static byte[] p(byte[] byArray, byte by) {
        if (byArray == null) {
            return new byte[]{by};
        }
        int n8 = byArray.length;
        byte[] byArray2 = new byte[n8 + 1];
        System.arraycopy(byArray, 0, byArray2, 1, n8);
        byArray2[0] = by;
        return byArray2;
    }

    public static class a<T>
    implements Iterator<T> {
        private int c0 = 0;
        private final T[] q;

        public a(T[] TArray) {
            this.q = TArray;
        }

        @Override
        public boolean hasNext() {
            return this.c0 < this.q.length;
        }

        @Override
        public T next() {
            int n8 = this.c0;
            Object object = this.q;
            if (n8 != ((T[])object).length) {
                this.c0 = n8 + 1;
                return (T)object[n8];
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Out of elements: ");
            ((StringBuilder)object).append(this.c0);
            throw new NoSuchElementException(((StringBuilder)object).toString());
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }
}

