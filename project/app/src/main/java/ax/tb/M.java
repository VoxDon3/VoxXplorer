/*
 * Decompiled with CFR 0.152.
 */
package ax.tb;

import ax.Gb.l;
import ax.ub.h;
import java.util.Collections;
import java.util.Set;

class M {
    public static <E> Set<E> a(Set<E> set) {
        l.f(set, "builder");
        return ((h)set).g();
    }

    public static <E> Set<E> b() {
        return new h();
    }

    public static <T> Set<T> c(T object) {
        object = Collections.singleton(object);
        l.e(object, "singleton(...)");
        return object;
    }
}

