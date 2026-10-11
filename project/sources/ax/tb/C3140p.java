package ax.tb;

import ax.ub.C3228b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ax.tb.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3140p {
    public static <E> List<E> a(List<E> list) {
        ax.Gb.l.f(list, "builder");
        return ((C3228b) list).x();
    }

    public static final <T> Object[] b(T[] tArr, boolean z) {
        ax.Gb.l.f(tArr, "<this>");
        if (z && ax.Gb.l.a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        ax.Gb.l.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static <E> List<E> c() {
        return new C3228b(0, 1, null);
    }

    public static <T> List<T> d(T t) {
        List<T> singletonList = Collections.singletonList(t);
        ax.Gb.l.e(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static <T> T[] e(int i, T[] tArr) {
        ax.Gb.l.f(tArr, "array");
        if (i < tArr.length) {
            tArr[i] = null;
        }
        return tArr;
    }
}
