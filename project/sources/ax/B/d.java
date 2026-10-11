package ax.B;

import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public final class d {
    public static final <E> void a(b<E> bVar, int i) {
        ax.Gb.l.f(bVar, "<this>");
        bVar.q(new int[i]);
        bVar.p(new Object[i]);
    }

    public static final <E> int b(b<E> bVar, int i) {
        ax.Gb.l.f(bVar, "<this>");
        try {
            return ax.C.a.a(bVar.i(), bVar.l(), i);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> int c(b<E> bVar, Object obj, int i) {
        ax.Gb.l.f(bVar, "<this>");
        int l = bVar.l();
        if (l == 0) {
            return -1;
        }
        int b = b(bVar, i);
        if (b < 0 || ax.Gb.l.a(obj, bVar.g()[b])) {
            return b;
        }
        int i2 = b + 1;
        while (i2 < l && bVar.i()[i2] == i) {
            if (ax.Gb.l.a(obj, bVar.g()[i2])) {
                return i2;
            }
            i2++;
        }
        for (int i3 = b - 1; i3 >= 0 && bVar.i()[i3] == i; i3--) {
            if (ax.Gb.l.a(obj, bVar.g()[i3])) {
                return i3;
            }
        }
        return ~i2;
    }

    public static final <E> int d(b<E> bVar) {
        ax.Gb.l.f(bVar, "<this>");
        return c(bVar, null, 0);
    }
}
