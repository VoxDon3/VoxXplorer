package ax.r7;

import ax.q7.InterfaceC2879f;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class T<T> implements Comparator<T> {
    protected T() {
    }

    public static <T> T<T> b(Comparator<T> comparator) {
        return comparator instanceof T ? (T) comparator : new C2979m(comparator);
    }

    public static <C extends Comparable> T<C> d() {
        return P.q;
    }

    public <U extends T> T<U> a(Comparator<? super U> comparator) {
        return new C2981o(this, (Comparator) ax.q7.n.n(comparator));
    }

    public <E extends T> AbstractC2991z<E> c(Iterable<E> iterable) {
        return AbstractC2991z.J(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t, T t2);

    <T2 extends T> T<Map.Entry<T2, ?>> e() {
        return (T<Map.Entry<T2, ?>>) f(K.e());
    }

    public <F> T<F> f(InterfaceC2879f<F, ? extends T> interfaceC2879f) {
        return new C2974h(interfaceC2879f, this);
    }

    public <S extends T> T<S> g() {
        return new a0(this);
    }
}
