/*
 * Decompiled with CFR 0.152.
 */
package ax.u7;

import ax.q7.n;
import ax.u7.g;
import ax.u7.h;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class f
extends g {
    public static List<Integer> c(int ... nArray) {
        if (nArray.length == 0) {
            return Collections.EMPTY_LIST;
        }
        return new a(nArray);
    }

    private static int d(long l8) {
        int n8 = (int)l8;
        boolean bl = l8 == (long)n8;
        n.i(bl, "the total number of elements (%s) in the arrays must fit in an int", l8);
        return n8;
    }

    public static int e(long l8) {
        int n8 = (int)l8;
        boolean bl = (long)n8 == l8;
        n.i(bl, "Out of range: %s", l8);
        return n8;
    }

    public static int[] f(int[] ... nArray) {
        int n8;
        int n9 = nArray.length;
        long l8 = 0L;
        for (n8 = 0; n8 < n9; ++n8) {
            l8 += (long)nArray[n8].length;
        }
        int[] nArray2 = new int[f.d(l8)];
        int n10 = nArray.length;
        n9 = 0;
        for (n8 = 0; n8 < n10; ++n8) {
            int[] nArray3 = nArray[n8];
            System.arraycopy(nArray3, 0, nArray2, n9, nArray3.length);
            n9 += nArray3.length;
        }
        return nArray2;
    }

    public static int g(int n8, int n9, int n10) {
        boolean bl = n9 <= n10;
        n.h(bl, "min (%s) must be less than or equal to max (%s)", n9, n10);
        return Math.min(Math.max(n8, n9), n10);
    }

    public static int h(byte[] byArray) {
        boolean bl = byArray.length >= 4;
        n.h(bl, "array too small: %s < %s", byArray.length, 4);
        return f.i(byArray[0], byArray[1], byArray[2], byArray[3]);
    }

    public static int i(byte by, byte by2, byte by3, byte by4) {
        return by << 24 | (by2 & 0xFF) << 16 | (by3 & 0xFF) << 8 | by4 & 0xFF;
    }

    public static int j(int n8) {
        return n8;
    }

    public static int k(int[] nArray, int n8) {
        return f.l(nArray, n8, 0, nArray.length);
    }

    private static int l(int[] nArray, int n8, int n9, int n10) {
        while (n9 < n10) {
            if (nArray[n9] == n8) {
                return n9;
            }
            ++n9;
        }
        return -1;
    }

    private static int m(int[] nArray, int n8, int n9, int n10) {
        --n10;
        while (n10 >= n9) {
            if (nArray[n10] == n8) {
                return n10;
            }
            --n10;
        }
        return -1;
    }

    public static int n(long l8) {
        if (l8 > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (l8 < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int)l8;
    }

    public static int[] o(Collection<? extends Number> objectArray) {
        if (objectArray instanceof a) {
            return ((a)objectArray).h();
        }
        objectArray = objectArray.toArray();
        int n8 = objectArray.length;
        int[] nArray = new int[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            nArray[i8] = ((Number)n.n(objectArray[i8])).intValue();
        }
        return nArray;
    }

    public static Integer p(String string) {
        return f.q(string, 10);
    }

    public static Integer q(String object, int n8) {
        if ((object = h.m((String)object, n8)) != null && (Long)object == (long)((Long)object).intValue()) {
            return ((Long)object).intValue();
        }
        return null;
    }

    private static class a
    extends AbstractList<Integer>
    implements RandomAccess,
    Serializable {
        final int c0;
        final int d0;
        final int[] q;

        a(int[] nArray) {
            this(nArray, 0, nArray.length);
        }

        a(int[] nArray, int n8, int n9) {
            this.q = nArray;
            this.c0 = n8;
            this.d0 = n9;
        }

        @Override
        public boolean contains(Object object) {
            return object instanceof Integer && f.l(this.q, (Integer)object, this.c0, this.d0) != -1;
        }

        public Integer e(int n8) {
            n.l(n8, this.size());
            return this.q[this.c0 + n8];
        }

        @Override
        public boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (object instanceof a) {
                object = (a)object;
                int n8 = this.size();
                if (((a)object).size() != n8) {
                    return false;
                }
                for (int i8 = 0; i8 < n8; ++i8) {
                    if (this.q[this.c0 + i8] == ((a)object).q[((a)object).c0 + i8]) continue;
                    return false;
                }
                return true;
            }
            return super.equals(object);
        }

        public Integer g(int n8, Integer n9) {
            n.l(n8, this.size());
            int[] nArray = this.q;
            int n10 = this.c0;
            int n11 = nArray[n10 + n8];
            nArray[n10 + n8] = n.n(n9);
            return n11;
        }

        int[] h() {
            return Arrays.copyOfRange(this.q, this.c0, this.d0);
        }

        @Override
        public int hashCode() {
            int n8 = 1;
            for (int i8 = this.c0; i8 < this.d0; ++i8) {
                n8 = n8 * 31 + f.j(this.q[i8]);
            }
            return n8;
        }

        @Override
        public int indexOf(Object object) {
            int n8;
            if (object instanceof Integer && (n8 = f.l(this.q, (Integer)object, this.c0, this.d0)) >= 0) {
                return n8 - this.c0;
            }
            return -1;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public int lastIndexOf(Object object) {
            int n8;
            if (object instanceof Integer && (n8 = f.m(this.q, (Integer)object, this.c0, this.d0)) >= 0) {
                return n8 - this.c0;
            }
            return -1;
        }

        @Override
        public int size() {
            return this.d0 - this.c0;
        }

        @Override
        public List<Integer> subList(int n8, int n9) {
            n.s(n8, n9, this.size());
            if (n8 == n9) {
                return Collections.EMPTY_LIST;
            }
            int[] nArray = this.q;
            int n10 = this.c0;
            return new a(nArray, n8 + n10, n10 + n9);
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(this.size() * 5);
            stringBuilder.append('[');
            stringBuilder.append(this.q[this.c0]);
            int n8 = this.c0;
            while (++n8 < this.d0) {
                stringBuilder.append(", ");
                stringBuilder.append(this.q[n8]);
            }
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }
}

