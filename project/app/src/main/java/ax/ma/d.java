/*
 * Decompiled with CFR 0.152.
 */
package ax.ma;

import ax.Gb.l;
import ax.Lb.b;
import ax.Lb.e;
import ax.Lb.f;
import ax.la.x;
import ax.ma.c;
import java.util.List;
import java.util.NoSuchElementException;

public final class d {
    private static final e a = new e(16, 2048);

    public static final /* synthetic */ e a() {
        return a;
    }

    public static final int b(int n8, int n9) {
        if ((n8 %= n9) == 0) {
            return 0;
        }
        if ((n9 -= n8) >= n8) {
            return -n8;
        }
        return n9;
    }

    public static final int c(int n8, List<Integer> object) {
        l.f(object, "multiples");
        for (Number number : (Iterable)object) {
            if (n8 % number.intValue() != 0) continue;
            return number.intValue();
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final int d(int n8, int n9) {
        return n8 + d.b(n8, n9);
    }

    public static final int e(b<Integer> b8, int n8, int n9) {
        l.f(b8, "<this>");
        int n10 = d.d(n8, n9);
        if (n10 > ((Number)b8.i()).intValue()) {
            return n10 - (int)Math.ceil((float)(n10 - ((Number)b8.i()).intValue()) / (float)n9) * n9;
        }
        n8 = n10;
        if (n10 < ((Number)b8.g()).intValue()) {
            n8 = n10 + (int)Math.ceil((float)(((Number)b8.g()).intValue() - n10) / (float)n9) * n9;
        }
        return n8;
    }

    public static final int f(b<Integer> b8, int n8, Iterable<Integer> object) {
        l.f(b8, "<this>");
        l.f(object, "divisors");
        object = object.iterator();
        int n9 = Integer.MAX_VALUE;
        while (object.hasNext()) {
            int n10 = d.e(b8, n8, ((Number)object.next()).intValue()) - n8;
            if (n10 == 0) {
                return n8;
            }
            if (Math.abs(n10) >= Math.abs(n9)) continue;
            n9 = n10;
        }
        if (n9 < Integer.MAX_VALUE) {
            return n8 + n9;
        }
        throw new IllegalArgumentException("No divisors provided.");
    }

    public static final x g(c c8, x x8) {
        l.f(c8, "<this>");
        l.f(x8, "resolution");
        int n8 = f.g(x8.b(), c8);
        int n9 = f.g(x8.a(), c8);
        int n10 = f.d(n8, n9) == n8 ? n8 : n9;
        n10 = d.c(d.f(c8, n10, (Iterable<Integer>)c8.l()), c8.l());
        n8 = d.e(c8, n8, n10);
        n10 = d.e(c8, n9, n10);
        if (n8 == x8.b() && n10 == x8.a()) {
            return x8;
        }
        return new x(n8, n10);
    }
}

