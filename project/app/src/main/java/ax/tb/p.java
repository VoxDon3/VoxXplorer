/*
 * Decompiled with CFR 0.152.
 */
package ax.tb;

import ax.Gb.l;
import ax.ub.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class p {
    public static <E> List<E> a(List<E> list) {
        l.f(list, "builder");
        return ((b)list).x();
    }

    public static final <T> Object[] b(T[] TArray, boolean bl) {
        l.f(TArray, "<this>");
        if (bl && l.a(TArray.getClass(), Object[].class)) {
            return TArray;
        }
        TArray = Arrays.copyOf(TArray, TArray.length, Object[].class);
        l.e(TArray, "copyOf(...)");
        return TArray;
    }

    public static <E> List<E> c() {
        return new b(0, 1, null);
    }

    public static <T> List<T> d(T object) {
        object = Collections.singletonList(object);
        l.e(object, "singletonList(...)");
        return object;
    }

    public static <T> T[] e(int n8, T[] TArray) {
        l.f(TArray, "array");
        if (n8 < TArray.length) {
            TArray[n8] = null;
        }
        return TArray;
    }
}

