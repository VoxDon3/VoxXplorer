package ax.r0;

import ax.r0.C2904A;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: ax.r0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2912I extends AbstractC2916c<Long> implements C2904A.h, RandomAccess, b0 {
    private static final C2912I e0;
    private long[] c0;
    private int d0;

    static {
        C2912I c2912i = new C2912I(new long[0], 0);
        e0 = c2912i;
        c2912i.F();
    }

    C2912I() {
        this(new long[10], 0);
    }

    private void i(int i, long j) {
        int i2;
        e();
        if (i < 0 || i > (i2 = this.d0)) {
            throw new IndexOutOfBoundsException(q(i));
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
        this.c0[i] = j;
        this.d0++;
        ((AbstractList) this).modCount++;
    }

    private void l(int i) {
        if (i < 0 || i >= this.d0) {
            throw new IndexOutOfBoundsException(q(i));
        }
    }

    private String q(int i) {
        return "Index:" + i + ", Size:" + this.d0;
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        e();
        C2904A.a(collection);
        if (!(collection instanceof C2912I)) {
            return super.addAll(collection);
        }
        C2912I c2912i = (C2912I) collection;
        int i = c2912i.d0;
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
        System.arraycopy(c2912i.c0, 0, this.c0, this.d0, c2912i.d0);
        this.d0 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2912I)) {
            return super.equals(obj);
        }
        C2912I c2912i = (C2912I) obj;
        if (this.d0 != c2912i.d0) {
            return false;
        }
        long[] jArr = c2912i.c0;
        for (int i = 0; i < this.d0; i++) {
            if (this.c0[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void add(int i, Long l) {
        i(i, l.longValue());
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l) {
        k(l.longValue());
        return true;
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d0; i2++) {
            i = (i * 31) + C2904A.f(this.c0[i2]);
        }
        return i;
    }

    public void k(long j) {
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
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Long get(int i) {
        return Long.valueOf(p(i));
    }

    public long p(int i) {
        l(i);
        return this.c0[i];
    }

    @Override // ax.r0.C2904A.i
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C2904A.h L(int i) {
        if (i >= this.d0) {
            return new C2912I(Arrays.copyOf(this.c0, i), this.d0);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
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
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Long remove(int i) {
        e();
        l(i);
        long[] jArr = this.c0;
        long j = jArr[i];
        if (i < this.d0 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.d0--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.d0;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Long set(int i, Long l) {
        return Long.valueOf(u(i, l.longValue()));
    }

    public long u(int i, long j) {
        e();
        l(i);
        long[] jArr = this.c0;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    private C2912I(long[] jArr, int i) {
        this.c0 = jArr;
        this.d0 = i;
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        e();
        for (int i = 0; i < this.d0; i++) {
            if (obj.equals(Long.valueOf(this.c0[i]))) {
                long[] jArr = this.c0;
                System.arraycopy(jArr, i + 1, jArr, i, (this.d0 - i) - 1);
                this.d0--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
