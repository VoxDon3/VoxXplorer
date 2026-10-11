package ax.Pb;

import ax.Gb.l;
import ax.Lb.f;

/* loaded from: classes3.dex */
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long d(long j, int i) {
        return a.n((j << 1) + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(long j) {
        return a.n((j << 1) + 1);
    }

    private static final long f(long j) {
        return a.n(j << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long g(long j) {
        return j * 1000000;
    }

    public static final long h(int i, d dVar) {
        l.f(dVar, "unit");
        return dVar.compareTo(d.f0) <= 0 ? f(e.b(i, dVar, d.c0)) : i(i, dVar);
    }

    public static final long i(long j, d dVar) {
        l.f(dVar, "unit");
        d dVar2 = d.c0;
        long b = e.b(4611686018426999999L, dVar2, dVar);
        return ((-b) > j || j > b) ? e(f.h(e.a(j, dVar, d.e0), -4611686018427387903L, 4611686018427387903L)) : f(e.b(j, dVar, dVar2));
    }
}
