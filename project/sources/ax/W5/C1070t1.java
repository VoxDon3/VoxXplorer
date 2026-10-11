package ax.W5;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: ax.W5.t1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1070t1 extends AbstractC1025e0 implements RandomAccess {
    private static final C1070t1 e0 = new C1070t1(new Object[0], 0, false);
    private Object[] c0;
    private int d0;

    private C1070t1(Object[] objArr, int i, boolean z) {
        super(z);
        this.c0 = objArr;
        this.d0 = i;
    }

    public static C1070t1 g() {
        return e0;
    }

    private final String h(int i) {
        return "Index:" + i + ", Size:" + this.d0;
    }

    private final void i(int i) {
        if (i < 0 || i >= this.d0) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        e();
        if (i < 0 || i > (i2 = this.d0)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        Object[] objArr = this.c0;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.c0, i, objArr2, i + 1, this.d0 - i);
            this.c0 = objArr2;
        }
        this.c0[i] = obj;
        this.d0++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        i(i);
        return this.c0[i];
    }

    @Override // ax.W5.AbstractC1025e0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        e();
        i(i);
        Object[] objArr = this.c0;
        Object obj = objArr[i];
        if (i < this.d0 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.d0--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        e();
        i(i);
        Object[] objArr = this.c0;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d0;
    }

    @Override // ax.W5.M0
    public final /* bridge */ /* synthetic */ M0 v(int i) {
        if (i >= this.d0) {
            return new C1070t1(Arrays.copyOf(this.c0, i), this.d0, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // ax.W5.AbstractC1025e0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e();
        int i = this.d0;
        Object[] objArr = this.c0;
        if (i == objArr.length) {
            this.c0 = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.c0;
        int i2 = this.d0;
        this.d0 = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
