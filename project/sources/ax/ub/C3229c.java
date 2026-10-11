package ax.ub;

import ax.Gb.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: ax.ub.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3229c {
    public static final <E> E[] d(int i) {
        if (i >= 0) {
            return (E[]) new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    public static final <T> T[] e(T[] tArr, int i) {
        l.f(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i);
        l.e(tArr2, "copyOf(...)");
        return tArr2;
    }

    public static final <E> void f(E[] eArr, int i) {
        l.f(eArr, "<this>");
        eArr[i] = null;
    }

    public static final <E> void g(E[] eArr, int i, int i2) {
        l.f(eArr, "<this>");
        while (i < i2) {
            f(eArr, i);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean h(T[] tArr, int i, int i2, List<?> list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!l.a(tArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int i(T[] tArr, int i, int i2) {
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            T t = tArr[i + i4];
            i3 = (i3 * 31) + (t != null ? t.hashCode() : 0);
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> String j(T[] tArr, int i, int i2, Collection<? extends T> collection) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            T t = tArr[i + i3];
            if (t == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(t);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        l.e(sb2, "toString(...)");
        return sb2;
    }
}
