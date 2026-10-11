/*
 * Decompiled with CFR 0.152.
 */
package ax.tb;

import ax.tb.j;
import ax.tb.k;
import ax.tb.n;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class l
extends k {
    public static final <T> List<T> c(T[] object) {
        ax.Gb.l.f(object, "<this>");
        object = n.a(object);
        ax.Gb.l.e(object, "asList(...)");
        return object;
    }

    public static byte[] d(byte[] byArray, byte[] byArray2, int n8, int n9, int n10) {
        ax.Gb.l.f(byArray, "<this>");
        ax.Gb.l.f(byArray2, "destination");
        System.arraycopy(byArray, n9, byArray2, n8, n10 - n9);
        return byArray2;
    }

    public static int[] e(int[] nArray, int[] nArray2, int n8, int n9, int n10) {
        ax.Gb.l.f(nArray, "<this>");
        ax.Gb.l.f(nArray2, "destination");
        System.arraycopy(nArray, n9, nArray2, n8, n10 - n9);
        return nArray2;
    }

    public static long[] f(long[] lArray, long[] lArray2, int n8, int n9, int n10) {
        ax.Gb.l.f(lArray, "<this>");
        ax.Gb.l.f(lArray2, "destination");
        System.arraycopy(lArray, n9, lArray2, n8, n10 - n9);
        return lArray2;
    }

    public static <T> T[] g(T[] TArray, T[] TArray2, int n8, int n9, int n10) {
        ax.Gb.l.f(TArray, "<this>");
        ax.Gb.l.f(TArray2, "destination");
        System.arraycopy(TArray, n9, TArray2, n8, n10 - n9);
        return TArray2;
    }

    public static /* synthetic */ byte[] h(byte[] byArray, byte[] byArray2, int n8, int n9, int n10, int n11, Object object) {
        if ((n11 & 2) != 0) {
            n8 = 0;
        }
        if ((n11 & 4) != 0) {
            n9 = 0;
        }
        if ((n11 & 8) != 0) {
            n10 = byArray.length;
        }
        return l.d(byArray, byArray2, n8, n9, n10);
    }

    public static /* synthetic */ int[] i(int[] nArray, int[] nArray2, int n8, int n9, int n10, int n11, Object object) {
        if ((n11 & 2) != 0) {
            n8 = 0;
        }
        if ((n11 & 4) != 0) {
            n9 = 0;
        }
        if ((n11 & 8) != 0) {
            n10 = nArray.length;
        }
        return l.e(nArray, nArray2, n8, n9, n10);
    }

    public static /* synthetic */ Object[] j(Object[] objectArray, Object[] objectArray2, int n8, int n9, int n10, int n11, Object object) {
        if ((n11 & 2) != 0) {
            n8 = 0;
        }
        if ((n11 & 4) != 0) {
            n9 = 0;
        }
        if ((n11 & 8) != 0) {
            n10 = objectArray.length;
        }
        return l.g(objectArray, objectArray2, n8, n9, n10);
    }

    public static byte[] k(byte[] byArray, int n8, int n9) {
        ax.Gb.l.f(byArray, "<this>");
        j.b(n9, byArray.length);
        byArray = Arrays.copyOfRange(byArray, n8, n9);
        ax.Gb.l.e(byArray, "copyOfRange(...)");
        return byArray;
    }

    public static <T> T[] l(T[] TArray, int n8, int n9) {
        ax.Gb.l.f(TArray, "<this>");
        j.b(n9, TArray.length);
        TArray = Arrays.copyOfRange(TArray, n8, n9);
        ax.Gb.l.e(TArray, "copyOfRange(...)");
        return TArray;
    }

    public static final void m(int[] nArray, int n8, int n9, int n10) {
        ax.Gb.l.f(nArray, "<this>");
        Arrays.fill(nArray, n9, n10, n8);
    }

    public static <T> void n(T[] TArray, T t8, int n8, int n9) {
        ax.Gb.l.f(TArray, "<this>");
        Arrays.fill(TArray, n8, n9, t8);
    }

    public static /* synthetic */ void o(int[] nArray, int n8, int n9, int n10, int n11, Object object) {
        if ((n11 & 2) != 0) {
            n9 = 0;
        }
        if ((n11 & 4) != 0) {
            n10 = nArray.length;
        }
        l.m(nArray, n8, n9, n10);
    }

    public static /* synthetic */ void p(Object[] objectArray, Object object, int n8, int n9, int n10, Object object2) {
        if ((n10 & 2) != 0) {
            n8 = 0;
        }
        if ((n10 & 4) != 0) {
            n9 = objectArray.length;
        }
        l.n(objectArray, object, n8, n9);
    }

    public static final <T> void q(T[] TArray) {
        ax.Gb.l.f(TArray, "<this>");
        if (TArray.length > 1) {
            Arrays.sort(TArray);
        }
    }

    public static final <T> void r(T[] TArray, Comparator<? super T> comparator) {
        ax.Gb.l.f(TArray, "<this>");
        ax.Gb.l.f(comparator, "comparator");
        if (TArray.length > 1) {
            Arrays.sort(TArray, comparator);
        }
    }
}

