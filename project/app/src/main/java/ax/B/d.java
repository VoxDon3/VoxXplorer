/*
 * Decompiled with CFR 0.152.
 */
package ax.B;

import ax.B.b;
import ax.C.a;
import ax.Gb.l;
import java.util.ConcurrentModificationException;

public final class d {
    public static final <E> void a(b<E> b8, int n8) {
        l.f(b8, "<this>");
        b8.q(new int[n8]);
        b8.p(new Object[n8]);
    }

    public static final <E> int b(b<E> b8, int n8) {
        l.f(b8, "<this>");
        try {
            n8 = a.a(b8.i(), b8.l(), n8);
            return n8;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> int c(b<E> b8, Object object, int n8) {
        int n9;
        l.f(b8, "<this>");
        int n10 = b8.l();
        if (n10 == 0) {
            return -1;
        }
        int n11 = d.b(b8, n8);
        if (n11 < 0 || l.a(object, b8.g()[n11])) {
            return n11;
        }
        for (n9 = n11 + 1; n9 < n10 && b8.i()[n9] == n8; ++n9) {
            if (!l.a(object, b8.g()[n9])) continue;
            return n9;
        }
        --n11;
        while (n11 >= 0 && b8.i()[n11] == n8) {
            if (l.a(object, b8.g()[n11])) {
                return n11;
            }
            --n11;
        }
        return ~n9;
    }

    public static final <E> int d(b<E> b8) {
        l.f(b8, "<this>");
        return d.c(b8, null, 0);
    }
}

