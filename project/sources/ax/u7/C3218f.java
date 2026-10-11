package ax.u7;

import ax.q7.n;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: ax.u7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3218f extends AbstractC3219g {

    /* renamed from: ax.u7.f$a */
    private static class a extends AbstractList<Integer> implements RandomAccess, Serializable {
        final int c0;
        final int d0;
        final int[] q;

        a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && C3218f.l(this.q, ((Integer) obj).intValue(), this.c0, this.d0) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Integer get(int i) {
            n.l(i, size());
            return Integer.valueOf(this.q[this.c0 + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.q[this.c0 + i] != aVar.q[aVar.c0 + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer set(int i, Integer num) {
            n.l(i, size());
            int[] iArr = this.q;
            int i2 = this.c0;
            int i3 = iArr[i2 + i];
            iArr[i2 + i] = ((Integer) n.n(num)).intValue();
            return Integer.valueOf(i3);
        }

        int[] h() {
            return Arrays.copyOfRange(this.q, this.c0, this.d0);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i = 1;
            for (int i2 = this.c0; i2 < this.d0; i2++) {
                i = (i * 31) + C3218f.j(this.q[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int l;
            if (!(obj instanceof Integer) || (l = C3218f.l(this.q, ((Integer) obj).intValue(), this.c0, this.d0)) < 0) {
                return -1;
            }
            return l - this.c0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int m;
            if (!(obj instanceof Integer) || (m = C3218f.m(this.q, ((Integer) obj).intValue(), this.c0, this.d0)) < 0) {
                return -1;
            }
            return m - this.c0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.d0 - this.c0;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i, int i2) {
            n.s(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            int[] iArr = this.q;
            int i3 = this.c0;
            return new a(iArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
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

        a(int[] iArr, int i, int i2) {
            this.q = iArr;
            this.c0 = i;
            this.d0 = i2;
        }
    }

    public static List<Integer> c(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new a(iArr);
    }

    private static int d(long j) {
        int i = (int) j;
        n.i(j == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", j);
        return i;
    }

    public static int e(long j) {
        int i = (int) j;
        n.i(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int[] f(int[]... iArr) {
        long j = 0;
        for (int[] iArr2 : iArr) {
            j += iArr2.length;
        }
        int[] iArr3 = new int[d(j)];
        int i = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i, iArr4.length);
            i += iArr4.length;
        }
        return iArr3;
    }

    public static int g(int i, int i2, int i3) {
        n.h(i2 <= i3, "min (%s) must be less than or equal to max (%s)", i2, i3);
        return Math.min(Math.max(i, i2), i3);
    }

    public static int h(byte[] bArr) {
        n.h(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return i(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int i(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static int k(int[] iArr, int i) {
        return l(iArr, i, 0, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(int[] iArr, int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (iArr[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    public static int n(long j) {
        if (j > 2147483647L) {
            return SubsamplingScaleImageView.TILE_SIZE_AUTO;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int[] o(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).h();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) n.n(array[i])).intValue();
        }
        return iArr;
    }

    public static Integer p(String str) {
        return q(str, 10);
    }

    public static Integer q(String str, int i) {
        Long m = h.m(str, i);
        if (m == null || m.longValue() != m.intValue()) {
            return null;
        }
        return Integer.valueOf(m.intValue());
    }

    public static int j(int i) {
        return i;
    }
}
