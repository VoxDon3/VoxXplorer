/*
 * Decompiled with CFR 0.152.
 */
package ax.u7;

import ax.q7.n;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class h {
    private static int c(long l8) {
        int n8 = (int)l8;
        boolean bl = l8 == (long)n8;
        n.i(bl, "the total number of elements (%s) in the arrays must fit in an int", l8);
        return n8;
    }

    public static int d(long l8, long l9) {
        return Long.compare(l8, l9);
    }

    public static long[] e(long[] ... lArray) {
        int n8;
        int n9 = lArray.length;
        long l8 = 0L;
        for (n8 = 0; n8 < n9; ++n8) {
            l8 += (long)lArray[n8].length;
        }
        long[] lArray2 = new long[h.c(l8)];
        int n10 = lArray.length;
        n9 = 0;
        for (n8 = 0; n8 < n10; ++n8) {
            long[] lArray3 = lArray[n8];
            System.arraycopy(lArray3, 0, lArray2, n9, lArray3.length);
            n9 += lArray3.length;
        }
        return lArray2;
    }

    public static long f(byte by, byte by2, byte by3, byte by4, byte by5, byte by6, byte by7, byte by8) {
        long l8 = by;
        return ((long)by2 & 0xFFL) << 48 | (l8 & 0xFFL) << 56 | ((long)by3 & 0xFFL) << 40 | ((long)by4 & 0xFFL) << 32 | ((long)by5 & 0xFFL) << 24 | ((long)by6 & 0xFFL) << 16 | ((long)by7 & 0xFFL) << 8 | (long)by8 & 0xFFL;
    }

    public static int g(long l8) {
        return (int)(l8 ^ l8 >>> 32);
    }

    private static int h(long[] lArray, long l8, int n8, int n9) {
        while (n8 < n9) {
            if (lArray[n8] == l8) {
                return n8;
            }
            ++n8;
        }
        return -1;
    }

    private static int i(long[] lArray, long l8, int n8, int n9) {
        --n9;
        while (n9 >= n8) {
            if (lArray[n9] == l8) {
                return n9;
            }
            --n9;
        }
        return -1;
    }

    public static long j(long ... lArray) {
        int n8 = lArray.length;
        boolean bl = n8 > 0;
        n.d(bl);
        long l8 = lArray[0];
        for (int i8 = 1; i8 < lArray.length; ++i8) {
            long l9 = lArray[i8];
            long l10 = l8;
            if (l9 > l8) {
                l10 = l9;
            }
            l8 = l10;
        }
        return l8;
    }

    public static long[] k(Collection<? extends Number> objectArray) {
        if (objectArray instanceof b) {
            return ((b)objectArray).h();
        }
        objectArray = objectArray.toArray();
        int n8 = objectArray.length;
        long[] lArray = new long[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            lArray[i8] = ((Number)n.n(objectArray[i8])).longValue();
        }
        return lArray;
    }

    public static byte[] l(long l8) {
        byte[] byArray = new byte[8];
        for (int i8 = 7; i8 >= 0; --i8) {
            byArray[i8] = (byte)(0xFFL & l8);
            l8 >>= 8;
        }
        return byArray;
    }

    public static Long m(String charSequence, int n8) {
        if (n.n(charSequence).isEmpty()) {
            return null;
        }
        if (n8 >= 2 && n8 <= 36) {
            int n9 = 0;
            if (((String)charSequence).charAt(0) == '-') {
                n9 = 1;
            }
            if (n9 == ((String)charSequence).length()) {
                return null;
            }
            int n10 = a.a(((String)charSequence).charAt(n9));
            if (n10 >= 0 && n10 < n8) {
                long l8 = -n10;
                long l9 = n8;
                long l10 = Long.MIN_VALUE / l9;
                for (int i8 = n9 + 1; i8 < ((String)charSequence).length(); ++i8) {
                    n10 = a.a(((String)charSequence).charAt(i8));
                    if (n10 >= 0 && n10 < n8 && l8 >= l10) {
                        long l11 = n10;
                        if ((l8 *= l9) < l11 - Long.MIN_VALUE) {
                            return null;
                        }
                        l8 -= l11;
                        continue;
                    }
                    return null;
                }
                if (n9 != 0) {
                    return l8;
                }
                if (l8 == Long.MIN_VALUE) {
                    return null;
                }
                return -l8;
            }
            return null;
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("radix must be between MIN_RADIX and MAX_RADIX but was ");
        ((StringBuilder)charSequence).append(n8);
        throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
    }

    static final class a {
        private static final byte[] a;

        static {
            byte[] byArray = new byte[128];
            Arrays.fill(byArray, (byte)-1);
            int n8 = 0;
            int n9 = 0;
            while (true) {
                if (n9 >= 10) break;
                byArray[n9 + 48] = (byte)n9;
                ++n9;
            }
            for (int i8 = n8; i8 < 26; ++i8) {
                byte by;
                byArray[i8 + 65] = by = (byte)(i8 + 10);
                byArray[i8 + 97] = by;
            }
            a = byArray;
        }

        static int a(char c8) {
            if (c8 < '\u0080') {
                return a[c8];
            }
            return -1;
        }
    }

    private static class b
    extends AbstractList<Long>
    implements RandomAccess,
    Serializable {
        final int c0;
        final int d0;
        final long[] q;

        b(long[] lArray, int n8, int n9) {
            this.q = lArray;
            this.c0 = n8;
            this.d0 = n9;
        }

        @Override
        public boolean contains(Object object) {
            return object instanceof Long && h.h(this.q, (Long)object, this.c0, this.d0) != -1;
        }

        public Long e(int n8) {
            n.l(n8, this.size());
            return this.q[this.c0 + n8];
        }

        @Override
        public boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (object instanceof b) {
                object = (b)object;
                int n8 = this.size();
                if (((b)object).size() != n8) {
                    return false;
                }
                for (int i8 = 0; i8 < n8; ++i8) {
                    if (this.q[this.c0 + i8] == ((b)object).q[((b)object).c0 + i8]) continue;
                    return false;
                }
                return true;
            }
            return super.equals(object);
        }

        public Long g(int n8, Long l8) {
            n.l(n8, this.size());
            long[] lArray = this.q;
            int n9 = this.c0;
            long l9 = lArray[n9 + n8];
            lArray[n9 + n8] = n.n(l8);
            return l9;
        }

        long[] h() {
            return Arrays.copyOfRange(this.q, this.c0, this.d0);
        }

        @Override
        public int hashCode() {
            int n8 = 1;
            for (int i8 = this.c0; i8 < this.d0; ++i8) {
                n8 = n8 * 31 + h.g(this.q[i8]);
            }
            return n8;
        }

        @Override
        public int indexOf(Object object) {
            int n8;
            if (object instanceof Long && (n8 = h.h(this.q, (Long)object, this.c0, this.d0)) >= 0) {
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
            if (object instanceof Long && (n8 = h.i(this.q, (Long)object, this.c0, this.d0)) >= 0) {
                return n8 - this.c0;
            }
            return -1;
        }

        @Override
        public int size() {
            return this.d0 - this.c0;
        }

        @Override
        public List<Long> subList(int n8, int n9) {
            n.s(n8, n9, this.size());
            if (n8 == n9) {
                return Collections.EMPTY_LIST;
            }
            long[] lArray = this.q;
            int n10 = this.c0;
            return new b(lArray, n8 + n10, n10 + n9);
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(this.size() * 10);
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

