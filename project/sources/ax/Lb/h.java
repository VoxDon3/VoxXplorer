package ax.Lb;

import ax.Gb.l;
import ax.Lb.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class h extends g {
    public static int b(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static long c(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static int d(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static long e(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static int f(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static int g(int i, b<Integer> bVar) {
        l.f(bVar, "range");
        if (bVar instanceof a) {
            return ((Number) i(Integer.valueOf(i), (a) bVar)).intValue();
        }
        if (!bVar.isEmpty()) {
            return i < bVar.g().intValue() ? bVar.g().intValue() : i > bVar.i().intValue() ? bVar.i().intValue() : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + bVar + '.');
    }

    public static long h(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    public static final <T extends Comparable<? super T>> T i(T t, a<T> aVar) {
        l.f(t, "<this>");
        l.f(aVar, "range");
        if (!aVar.isEmpty()) {
            return (!aVar.e(t, aVar.g()) || aVar.e(aVar.g(), t)) ? (!aVar.e(aVar.i(), t) || aVar.e(t, aVar.i())) ? t : aVar.i() : aVar.g();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + aVar + '.');
    }

    public static c j(int i, int i2) {
        return c.e0.a(i, i2, -1);
    }

    public static c k(c cVar, int i) {
        l.f(cVar, "<this>");
        g.a(i > 0, Integer.valueOf(i));
        c.a aVar = c.e0;
        int k = cVar.k();
        int l = cVar.l();
        if (cVar.n() <= 0) {
            i = -i;
        }
        return aVar.a(k, l, i);
    }

    public static e l(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? e.f0.a() : new e(i, i2 - 1);
    }
}
