package ax.r7;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class P extends T<Comparable<?>> implements Serializable {
    static final P q = new P();

    private P() {
    }

    @Override // ax.r7.T
    public <S extends Comparable<?>> T<S> g() {
        return Z.q;
    }

    @Override // ax.r7.T, java.util.Comparator
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        ax.q7.n.n(comparable);
        ax.q7.n.n(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
