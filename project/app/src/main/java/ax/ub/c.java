/*
 * Decompiled with CFR 0.152.
 */
package ax.ub;

import ax.Gb.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class c {
    public static final /* synthetic */ boolean a(Object[] objectArray, int n8, int n9, List list) {
        return c.h(objectArray, n8, n9, list);
    }

    public static final /* synthetic */ int b(Object[] objectArray, int n8, int n9) {
        return c.i(objectArray, n8, n9);
    }

    public static final /* synthetic */ String c(Object[] objectArray, int n8, int n9, Collection collection) {
        return c.j(objectArray, n8, n9, collection);
    }

    public static final <E> E[] d(int n8) {
        if (n8 >= 0) {
            return new Object[n8];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    public static final <T> T[] e(T[] TArray, int n8) {
        l.f(TArray, "<this>");
        TArray = Arrays.copyOf(TArray, n8);
        l.e(TArray, "copyOf(...)");
        return TArray;
    }

    public static final <E> void f(E[] EArray, int n8) {
        l.f(EArray, "<this>");
        EArray[n8] = null;
    }

    public static final <E> void g(E[] EArray, int n8, int n9) {
        l.f(EArray, "<this>");
        while (n8 < n9) {
            c.f(EArray, n8);
            ++n8;
        }
    }

    private static final <T> boolean h(T[] TArray, int n8, int n9, List<?> list) {
        if (n9 != list.size()) {
            return false;
        }
        for (int i8 = 0; i8 < n9; ++i8) {
            if (l.a(TArray[n8 + i8], list.get(i8))) continue;
            return false;
        }
        return true;
    }

    private static final <T> int i(T[] TArray, int n8, int n9) {
        int n10 = 1;
        for (int i8 = 0; i8 < n9; ++i8) {
            T t8 = TArray[n8 + i8];
            int n11 = t8 != null ? t8.hashCode() : 0;
            n10 = n10 * 31 + n11;
        }
        return n10;
    }

    private static final <T> String j(T[] object, int n8, int n9, Collection<? extends T> collection) {
        StringBuilder stringBuilder = new StringBuilder(n9 * 3 + 2);
        stringBuilder.append("[");
        for (int i8 = 0; i8 < n9; ++i8) {
            T t8;
            if (i8 > 0) {
                stringBuilder.append(", ");
            }
            if ((t8 = object[n8 + i8]) == collection) {
                stringBuilder.append("(this Collection)");
                continue;
            }
            stringBuilder.append(t8);
        }
        stringBuilder.append("]");
        object = stringBuilder.toString();
        l.e(object, "toString(...)");
        return object;
    }
}

