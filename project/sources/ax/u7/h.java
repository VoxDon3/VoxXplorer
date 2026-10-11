package ax.u7;

import ax.q7.n;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class h {

    static final class a {
        private static final byte[] a;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i = 0; i < 10; i++) {
                bArr[i + 48] = (byte) i;
            }
            for (int i2 = 0; i2 < 26; i2++) {
                byte b = (byte) (i2 + 10);
                bArr[i2 + 65] = b;
                bArr[i2 + 97] = b;
            }
            a = bArr;
        }

        static int a(char c) {
            if (c < 128) {
                return a[c];
            }
            return -1;
        }
    }

    private static class b extends AbstractList<Long> implements RandomAccess, Serializable {
        final int c0;
        final int d0;
        final long[] q;

        b(long[] jArr, int i, int i2) {
            this.q = jArr;
            this.c0 = i;
            this.d0 = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Long) && h.h(this.q, ((Long) obj).longValue(), this.c0, this.d0) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Long get(int i) {
            n.l(i, size());
            return Long.valueOf(this.q[this.c0 + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return super.equals(obj);
            }
            b bVar = (b) obj;
            int size = size();
            if (bVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.q[this.c0 + i] != bVar.q[bVar.c0 + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Long set(int i, Long l) {
            n.l(i, size());
            long[] jArr = this.q;
            int i2 = this.c0;
            long j = jArr[i2 + i];
            jArr[i2 + i] = ((Long) n.n(l)).longValue();
            return Long.valueOf(j);
        }

        long[] h() {
            return Arrays.copyOfRange(this.q, this.c0, this.d0);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i = 1;
            for (int i2 = this.c0; i2 < this.d0; i2++) {
                i = (i * 31) + h.g(this.q[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int h;
            if (!(obj instanceof Long) || (h = h.h(this.q, ((Long) obj).longValue(), this.c0, this.d0)) < 0) {
                return -1;
            }
            return h - this.c0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int i;
            if (!(obj instanceof Long) || (i = h.i(this.q, ((Long) obj).longValue(), this.c0, this.d0)) < 0) {
                return -1;
            }
            return i - this.c0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.d0 - this.c0;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i, int i2) {
            n.s(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            long[] jArr = this.q;
            int i3 = this.c0;
            return new b(jArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 10);
            sb.append('[');
            sb.append(this.q[this.c0]);
            int i = this.c0;
            while (true) {
                i++;
                if (i >= this.d0) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.q[i]);
            }
        }
    }

    private static int c(long j) {
        int i = (int) j;
        n.i(j == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", j);
        return i;
    }

    public static int d(long j, long j2) {
        return Long.compare(j, j2);
    }

    public static long[] e(long[]... jArr) {
        long j = 0;
        for (long[] jArr2 : jArr) {
            j += jArr2.length;
        }
        long[] jArr3 = new long[c(j)];
        int i = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i, jArr4.length);
            i += jArr4.length;
        }
        return jArr3;
    }

    public static long f(byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9) {
        return ((b3 & 255) << 48) | ((b2 & 255) << 56) | ((b4 & 255) << 40) | ((b5 & 255) << 32) | ((b6 & 255) << 24) | ((b7 & 255) << 16) | ((b8 & 255) << 8) | (b9 & 255);
    }

    public static int g(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(long[] jArr, long j, int i, int i2) {
        while (i < i2) {
            if (jArr[i] == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(long[] jArr, long j, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (jArr[i3] == j) {
                return i3;
            }
        }
        return -1;
    }

    public static long j(long... jArr) {
        n.d(jArr.length > 0);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j2 = jArr[i];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }

    public static long[] k(Collection<? extends Number> collection) {
        if (collection instanceof b) {
            return ((b) collection).h();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = ((Number) n.n(array[i])).longValue();
        }
        return jArr;
    }

    public static byte[] l(long j) {
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) (255 & j);
            j >>= 8;
        }
        return bArr;
    }

    public static Long m(String str, int i) {
        if (((String) n.n(str)).isEmpty()) {
            return null;
        }
        if (i < 2 || i > 36) {
            throw new IllegalArgumentException("radix must be between MIN_RADIX and MAX_RADIX but was " + i);
        }
        int i2 = str.charAt(0) == '-' ? 1 : 0;
        if (i2 == str.length()) {
            return null;
        }
        int i3 = i2 + 1;
        int a2 = a.a(str.charAt(i2));
        if (a2 < 0 || a2 >= i) {
            return null;
        }
        long j = -a2;
        long j2 = i;
        long j3 = Long.MIN_VALUE / j2;
        while (i3 < str.length()) {
            int i4 = i3 + 1;
            int a3 = a.a(str.charAt(i3));
            if (a3 < 0 || a3 >= i || j < j3) {
                return null;
            }
            long j4 = j * j2;
            long j5 = a3;
            if (j4 < j5 - Long.MIN_VALUE) {
                return null;
            }
            j = j4 - j5;
            i3 = i4;
        }
        if (i2 != 0) {
            return Long.valueOf(j);
        }
        if (j == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j);
    }
}
