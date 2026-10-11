package ax.r7;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: ax.r7.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2979m<T> extends T<T> implements Serializable {
    final Comparator<T> q;

    C2979m(Comparator<T> comparator) {
        this.q = (Comparator) ax.q7.n.n(comparator);
    }

    @Override // ax.r7.T, java.util.Comparator
    public int compare(T t, T t2) {
        return this.q.compare(t, t2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2979m) {
            return this.q.equals(((C2979m) obj).q);
        }
        return false;
    }

    public int hashCode() {
        return this.q.hashCode();
    }

    public String toString() {
        return this.q.toString();
    }
}
