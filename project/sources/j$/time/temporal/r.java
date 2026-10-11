package j$.time.temporal;

import j$.util.Objects;

/* loaded from: classes2.dex */
public abstract class r {
    public static final j$.desugar.sun.nio.fs.m a = new j$.desugar.sun.nio.fs.m(2);
    public static final j$.desugar.sun.nio.fs.m b = new j$.desugar.sun.nio.fs.m(3);
    public static final j$.desugar.sun.nio.fs.m c = new j$.desugar.sun.nio.fs.m(4);
    public static final j$.desugar.sun.nio.fs.m d = new j$.desugar.sun.nio.fs.m(5);
    public static final j$.desugar.sun.nio.fs.m e = new j$.desugar.sun.nio.fs.m(6);
    public static final j$.desugar.sun.nio.fs.m f = new j$.desugar.sun.nio.fs.m(7);
    public static final j$.desugar.sun.nio.fs.m g = new j$.desugar.sun.nio.fs.m(8);

    public static u d(n nVar, q qVar) {
        if (!(qVar instanceof a)) {
            Objects.requireNonNull(qVar, "field");
            return qVar.w(nVar);
        }
        if (nVar.f(qVar)) {
            return ((a) qVar).b;
        }
        throw new t(j$.time.b.a("Unsupported field: ", qVar));
    }

    public static int a(n nVar, q qVar) {
        u q = nVar.q(qVar);
        if (q.a < -2147483648L || q.d > 2147483647L) {
            throw new t("Invalid field " + qVar + " for get() method, use getLong() instead");
        }
        long w = nVar.w(qVar);
        if (q.d(w)) {
            return (int) w;
        }
        throw new j$.time.a("Invalid value for " + qVar + " (valid values " + q + "): " + w);
    }

    public static Object c(n nVar, j$.desugar.sun.nio.fs.m mVar) {
        if (mVar == a || mVar == b || mVar == c) {
            return null;
        }
        return mVar.a(nVar);
    }

    public static m b(m mVar, long j, s sVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            mVar = mVar.e(Long.MAX_VALUE, sVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return mVar.e(j2, sVar);
    }
}
