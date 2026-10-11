/*
 * Decompiled with CFR 0.152.
 */
package ax.tb;

import ax.tb.A;
import ax.tb.g;
import ax.tb.l;
import ax.tb.m;
import ax.tb.p;
import ax.vb.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class q
extends p {
    public static <T> ArrayList<T> f(T ... TArray) {
        ax.Gb.l.f(TArray, "elements");
        if (TArray.length == 0) {
            return new ArrayList();
        }
        return new ArrayList<T>(new g<T>(TArray, true));
    }

    public static final <T> Collection<T> g(T[] TArray) {
        ax.Gb.l.f(TArray, "<this>");
        return new g<T>(TArray, false);
    }

    public static final <T extends Comparable<? super T>> int h(List<? extends T> list, T t8, int n8, int n9) {
        ax.Gb.l.f(list, "<this>");
        q.p(list.size(), n8, n9);
        --n9;
        while (n8 <= n9) {
            int n10 = n8 + n9 >>> 1;
            int n11 = a.a((Comparable)list.get(n10), t8);
            if (n11 < 0) {
                n8 = n10 + 1;
                continue;
            }
            if (n11 > 0) {
                n9 = n10 - 1;
                continue;
            }
            return n10;
        }
        return -(n8 + 1);
    }

    public static /* synthetic */ int i(List list, Comparable comparable, int n8, int n9, int n10, Object object) {
        if ((n10 & 2) != 0) {
            n8 = 0;
        }
        if ((n10 & 4) != 0) {
            n9 = list.size();
        }
        return q.h(list, comparable, n8, n9);
    }

    public static <T> List<T> j() {
        return A.q;
    }

    public static <T> int k(List<? extends T> list) {
        ax.Gb.l.f(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> l(T ... TArray) {
        ax.Gb.l.f(TArray, "elements");
        if (TArray.length > 0) {
            return l.c(TArray);
        }
        return q.j();
    }

    public static <T> List<T> m(T ... TArray) {
        ax.Gb.l.f(TArray, "elements");
        return m.t(TArray);
    }

    public static <T> List<T> n(T ... TArray) {
        ax.Gb.l.f(TArray, "elements");
        if (TArray.length == 0) {
            return new ArrayList();
        }
        return new ArrayList<T>(new g<T>(TArray, true));
    }

    public static final <T> List<T> o(List<? extends T> list) {
        ax.Gb.l.f(list, "<this>");
        int n8 = list.size();
        if (n8 != 0) {
            if (n8 != 1) {
                return list;
            }
            return p.d(list.get(0));
        }
        return q.j();
    }

    private static final void p(int n8, int n9, int n10) {
        if (n9 <= n10) {
            if (n9 >= 0) {
                if (n10 <= n8) {
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("toIndex (");
                stringBuilder.append(n10);
                stringBuilder.append(") is greater than size (");
                stringBuilder.append(n8);
                stringBuilder.append(").");
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fromIndex (");
            stringBuilder.append(n9);
            stringBuilder.append(") is less than zero.");
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("fromIndex (");
        stringBuilder.append(n9);
        stringBuilder.append(") is greater than toIndex (");
        stringBuilder.append(n10);
        stringBuilder.append(").");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static void q() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void r() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}

