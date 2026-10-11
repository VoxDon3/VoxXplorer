package ax.r7;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class a0<T> extends T<T> implements Serializable {
    final T<? super T> q;

    a0(T<? super T> t) {
        this.q = (T) ax.q7.n.n(t);
    }

    @Override // ax.r7.T, java.util.Comparator
    public int compare(T t, T t2) {
        return this.q.compare(t2, t);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            return this.q.equals(((a0) obj).q);
        }
        return false;
    }

    @Override // ax.r7.T
    public <S extends T> T<S> g() {
        return this.q;
    }

    public int hashCode() {
        return -this.q.hashCode();
    }

    public String toString() {
        return this.q + ".reverse()";
    }
}
