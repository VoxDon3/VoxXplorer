/*
 * Decompiled with CFR 0.152.
 */
package ax.Lb;

import ax.Gb.l;
import ax.Lb.a;
import ax.Lb.b;
import ax.Lb.c;
import ax.Lb.e;
import ax.Lb.g;

class h
extends g {
    public static int b(int n8, int n9) {
        if (n8 < n9) {
            return n9;
        }
        return n8;
    }

    public static long c(long l8, long l9) {
        if (l8 < l9) {
            return l9;
        }
        return l8;
    }

    public static int d(int n8, int n9) {
        if (n8 > n9) {
            return n9;
        }
        return n8;
    }

    public static long e(long l8, long l9) {
        if (l8 > l9) {
            return l9;
        }
        return l8;
    }

    public static int f(int n8, int n9, int n10) {
        if (n9 <= n10) {
            if (n8 < n9) {
                return n9;
            }
            if (n8 > n10) {
                return n10;
            }
            return n8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot coerce value to an empty range: maximum ");
        stringBuilder.append(n10);
        stringBuilder.append(" is less than minimum ");
        stringBuilder.append(n9);
        stringBuilder.append('.');
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static int g(int n8, b<Integer> b8) {
        l.f(b8, "range");
        if (b8 instanceof a) {
            return ((Number)h.i(n8, (a)b8)).intValue();
        }
        if (!b8.isEmpty()) {
            if (n8 < ((Number)b8.g()).intValue()) {
                return ((Number)b8.g()).intValue();
            }
            int n9 = n8;
            if (n8 > ((Number)b8.i()).intValue()) {
                n9 = ((Number)b8.i()).intValue();
            }
            return n9;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot coerce value to an empty range: ");
        stringBuilder.append(b8);
        stringBuilder.append('.');
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static long h(long l8, long l9, long l10) {
        if (l9 <= l10) {
            if (l8 < l9) {
                return l9;
            }
            if (l8 > l10) {
                return l10;
            }
            return l8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot coerce value to an empty range: maximum ");
        stringBuilder.append(l10);
        stringBuilder.append(" is less than minimum ");
        stringBuilder.append(l9);
        stringBuilder.append('.');
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static final <T extends Comparable<? super T>> T i(T object, a<T> a8) {
        l.f(object, "<this>");
        l.f(a8, "range");
        if (!a8.isEmpty()) {
            if (a8.e(object, a8.g()) && !a8.e(a8.g(), object)) {
                return a8.g();
            }
            Object object2 = object;
            if (a8.e(a8.i(), object)) {
                object2 = object;
                if (!a8.e(object, a8.i())) {
                    object2 = a8.i();
                }
            }
            return (T)object2;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Cannot coerce value to an empty range: ");
        ((StringBuilder)object).append(a8);
        ((StringBuilder)object).append('.');
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public static c j(int n8, int n9) {
        return c.e0.a(n8, n9, -1);
    }

    public static c k(c c8, int n8) {
        l.f(c8, "<this>");
        boolean bl = n8 > 0;
        g.a(bl, n8);
        c.a a8 = c.e0;
        int n9 = c8.k();
        int n10 = c8.l();
        if (c8.n() <= 0) {
            n8 = -n8;
        }
        return a8.a(n9, n10, n8);
    }

    public static e l(int n8, int n9) {
        if (n9 <= Integer.MIN_VALUE) {
            return e.f0.a();
        }
        return new e(n8, n9 - 1);
    }
}

