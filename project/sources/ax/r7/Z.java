package ax.r7;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class Z extends T<Comparable<?>> implements Serializable {
    static final Z q = new Z();

    private Z() {
    }

    @Override // ax.r7.T
    public <S extends Comparable<?>> T<S> g() {
        return T.d();
    }

    @Override // ax.r7.T, java.util.Comparator
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        ax.q7.n.n(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
