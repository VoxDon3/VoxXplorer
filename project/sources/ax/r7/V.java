package ax.r7;

import j$.util.Objects;

/* loaded from: classes3.dex */
class V<E> extends AbstractC2991z<E> {
    static final AbstractC2991z<Object> f0 = new V(new Object[0], 0);
    final transient Object[] d0;
    private final transient int e0;

    V(Object[] objArr, int i) {
        this.d0 = objArr;
        this.e0 = i;
    }

    @Override // ax.r7.AbstractC2991z, ax.r7.AbstractC2989x
    int g(Object[] objArr, int i) {
        System.arraycopy(this.d0, 0, objArr, i, this.e0);
        return i + this.e0;
    }

    @Override // java.util.List
    public E get(int i) {
        ax.q7.n.l(i, this.e0);
        E e = (E) this.d0[i];
        Objects.requireNonNull(e);
        return e;
    }

    @Override // ax.r7.AbstractC2989x
    Object[] h() {
        return this.d0;
    }

    @Override // ax.r7.AbstractC2989x
    int i() {
        return this.e0;
    }

    @Override // ax.r7.AbstractC2989x
    int k() {
        return 0;
    }

    @Override // ax.r7.AbstractC2989x
    boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.e0;
    }
}
