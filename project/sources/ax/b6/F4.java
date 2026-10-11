package ax.b6;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class F4 extends AbstractC1678u3<Long> implements InterfaceC1648q4, InterfaceC1564g5, RandomAccess {
    private static final F4 e0 = new F4(new long[0], 0, false);
    private long[] c0;
    private int d0;

    F4() {
        this(new long[10], 0, true);
    }

    public static F4 h() {
        return e0;
    }

    private final String i(int i) {
        return "Index:" + i + ", Size:" + this.d0;
    }

    private final void k(int i) {
        if (i < 0 || i >= this.d0) {
            throw new IndexOutOfBoundsException(i(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        e();
        if (i < 0 || i > (i2 = this.d0)) {
            throw new IndexOutOfBoundsException(i(i));
        }
        long[] jArr = this.c0;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.c0, i, jArr2, i + 1, this.d0 - i);
            this.c0 = jArr2;
        }
        this.c0[i] = longValue;
        this.d0++;
        ((AbstractList) this).modCount++;
    }

    @Override // ax.b6.AbstractC1678u3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        e();
        C1616m4.e(collection);
        if (!(collection instanceof F4)) {
            return super.addAll(collection);
        }
        F4 f4 = (F4) collection;
        int i = f4.d0;
        if (i == 0) {
            return false;
        }
        int i2 = this.d0;
        if (SubsamplingScaleImageView.TILE_SIZE_AUTO - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.c0;
        if (i3 > jArr.length) {
            this.c0 = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(f4.c0, 0, this.c0, this.d0, f4.d0);
        this.d0 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // ax.b6.AbstractC1678u3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F4)) {
            return super.equals(obj);
        }
        F4 f4 = (F4) obj;
        if (this.d0 != f4.d0) {
            return false;
        }
        long[] jArr = f4.c0;
        for (int i = 0; i < this.d0; i++) {
            if (this.c0[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void g(long j) {
        e();
        int i = this.d0;
        long[] jArr = this.c0;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.c0 = jArr2;
        }
        long[] jArr3 = this.c0;
        int i2 = this.d0;
        this.d0 = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(m(i));
    }

    @Override // ax.b6.AbstractC1678u3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d0; i2++) {
            i = (i * 31) + C1616m4.b(this.c0[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.c0[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // ax.b6.InterfaceC1648q4
    public final long m(int i) {
        k(i);
        return this.c0[i];
    }

    @Override // ax.b6.InterfaceC1671t4
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final InterfaceC1648q4 d(int i) {
        if (i >= this.d0) {
            return new F4(Arrays.copyOf(this.c0, i), this.d0, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // ax.b6.AbstractC1678u3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        e();
        k(i);
        long[] jArr = this.c0;
        long j = jArr[i];
        if (i < this.d0 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.d0--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        e();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.c0;
        System.arraycopy(jArr, i2, jArr, i, this.d0 - i2);
        this.d0 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        e();
        k(i);
        long[] jArr = this.c0;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d0;
    }

    private F4(long[] jArr, int i, boolean z) {
        super(z);
        this.c0 = jArr;
        this.d0 = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        g(((Long) obj).longValue());
        return true;
    }
}
