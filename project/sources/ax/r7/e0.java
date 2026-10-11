package ax.r7;

/* loaded from: classes3.dex */
final class e0<E> extends AbstractC2964C<E> {
    final transient E d0;

    e0(E e) {
        this.d0 = (E) ax.q7.n.n(e);
    }

    @Override // ax.r7.AbstractC2989x, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.d0.equals(obj);
    }

    @Override // ax.r7.AbstractC2964C, ax.r7.AbstractC2989x
    public AbstractC2991z<E> e() {
        return AbstractC2991z.A(this.d0);
    }

    @Override // ax.r7.AbstractC2989x
    int g(Object[] objArr, int i) {
        objArr[i] = this.d0;
        return i + 1;
    }

    @Override // ax.r7.AbstractC2964C, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d0.hashCode();
    }

    @Override // ax.r7.AbstractC2989x
    boolean l() {
        return false;
    }

    @Override // ax.r7.AbstractC2964C, ax.r7.AbstractC2989x, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: n */
    public j0<E> iterator() {
        return G.t(this.d0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.d0.toString() + ']';
    }
}
