package ax.tb;

import ax.vb.C3295a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ax.tb.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3141q extends C3140p {
    public static <T> ArrayList<T> f(T... tArr) {
        ax.Gb.l.f(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new C3131g(tArr, true));
    }

    public static final <T> Collection<T> g(T[] tArr) {
        ax.Gb.l.f(tArr, "<this>");
        return new C3131g(tArr, false);
    }

    public static final <T extends Comparable<? super T>> int h(List<? extends T> list, T t, int i, int i2) {
        ax.Gb.l.f(list, "<this>");
        p(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int a = C3295a.a(list.get(i4), t);
            if (a < 0) {
                i = i4 + 1;
            } else {
                if (a <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int i(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return h(list, comparable, i, i2);
    }

    public static <T> List<T> j() {
        return C3110A.q;
    }

    public static <T> int k(List<? extends T> list) {
        ax.Gb.l.f(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> l(T... tArr) {
        ax.Gb.l.f(tArr, "elements");
        return tArr.length > 0 ? C3136l.c(tArr) : j();
    }

    public static <T> List<T> m(T... tArr) {
        ax.Gb.l.f(tArr, "elements");
        return C3137m.t(tArr);
    }

    public static <T> List<T> n(T... tArr) {
        ax.Gb.l.f(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new C3131g(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> o(List<? extends T> list) {
        ax.Gb.l.f(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : C3140p.d(list.get(0)) : j();
    }

    private static final void p(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        }
        if (i3 <= i) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
    }

    public static void q() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void r() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
