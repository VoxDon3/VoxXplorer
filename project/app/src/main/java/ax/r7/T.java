/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.f;
import ax.q7.n;
import ax.r7.K;
import ax.r7.P;
import ax.r7.a0;
import ax.r7.h;
import ax.r7.m;
import ax.r7.o;
import ax.r7.z;
import java.util.Comparator;
import java.util.Map;

public abstract class T<T>
implements Comparator<T> {
    protected T() {
    }

    public static <T> T<T> b(Comparator<T> comparator) {
        if (comparator instanceof T) {
            return (T)comparator;
        }
        return new m<T>(comparator);
    }

    public static <C extends Comparable> T<C> d() {
        return P.q;
    }

    public <U extends T> T<U> a(Comparator<? super U> comparator) {
        return new o<U>(this, n.n(comparator));
    }

    public <E extends T> z<E> c(Iterable<E> iterable) {
        return z.J(this, iterable);
    }

    @Override
    public abstract int compare(T var1, T var2);

    <T2 extends T> T<Map.Entry<T2, ?>> e() {
        return this.f(K.e());
    }

    public <F> T<F> f(f<F, ? extends T> f8) {
        return new h<F, T>(f8, this);
    }

    public <S extends T> T<S> g() {
        return new a0(this);
    }
}

