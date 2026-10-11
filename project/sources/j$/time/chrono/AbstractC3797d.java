package j$.time.chrono;

import java.io.Serializable;

/* renamed from: j$.time.chrono.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3797d implements InterfaceC3795b, j$.time.temporal.m, j$.time.temporal.o, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    @Override // j$.time.temporal.o
    public final /* synthetic */ j$.time.temporal.m B(j$.time.temporal.m mVar) {
        return j$.com.android.tools.r8.a.a(this, mVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: G */
    public final /* synthetic */ int compareTo(InterfaceC3795b interfaceC3795b) {
        return j$.com.android.tools.r8.a.b(this, interfaceC3795b);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ Object J(j$.desugar.sun.nio.fs.m mVar) {
        return j$.com.android.tools.r8.a.p(this, mVar);
    }

    public abstract InterfaceC3795b O(long j);

    public abstract InterfaceC3795b P(long j);

    public abstract InterfaceC3795b Q(long j);

    @Override // j$.time.chrono.InterfaceC3795b, j$.time.temporal.n
    public /* synthetic */ boolean f(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.n(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ int l(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public /* synthetic */ j$.time.temporal.u q(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.d(this, qVar);
    }

    public static InterfaceC3795b L(m mVar, j$.time.temporal.m mVar2) {
        InterfaceC3795b interfaceC3795b = (InterfaceC3795b) mVar2;
        if (mVar.equals(interfaceC3795b.a())) {
            return interfaceC3795b;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + mVar.i() + ", actual: " + interfaceC3795b.a().i());
    }

    @Override // j$.time.chrono.InterfaceC3795b
    public InterfaceC3798e z(j$.time.i iVar) {
        return new C3800g(this, iVar);
    }

    @Override // j$.time.temporal.m
    public InterfaceC3795b e(long j, j$.time.temporal.s sVar) {
        boolean z = sVar instanceof j$.time.temporal.b;
        if (!z) {
            if (z) {
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
            return L(a(), sVar.j(this, j));
        }
        switch (AbstractC3796c.a[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return O(j);
            case 2:
                return O(j$.com.android.tools.r8.a.M(j, 7));
            case 3:
                return P(j);
            case 4:
                return Q(j);
            case 5:
                return Q(j$.com.android.tools.r8.a.M(j, 10));
            case 6:
                return Q(j$.com.android.tools.r8.a.M(j, 100));
            case 7:
                return Q(j$.com.android.tools.r8.a.M(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.X(w(aVar), j), (j$.time.temporal.q) aVar);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public n M() {
        return a().H(j$.time.temporal.r.a(this, j$.time.temporal.a.ERA));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC3795b) && j$.com.android.tools.r8.a.b(this, (InterfaceC3795b) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC3795b
    public int hashCode() {
        long x = x();
        return a().hashCode() ^ ((int) (x ^ (x >>> 32)));
    }

    @Override // j$.time.temporal.m
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public InterfaceC3795b p(j$.time.temporal.o oVar) {
        return L(a(), oVar.B(this));
    }

    @Override // j$.time.chrono.InterfaceC3795b
    public final String toString() {
        long w = w(j$.time.temporal.a.YEAR_OF_ERA);
        long w2 = w(j$.time.temporal.a.MONTH_OF_YEAR);
        long w3 = w(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(a().toString());
        sb.append(" ");
        sb.append(M());
        sb.append(" ");
        sb.append(w);
        sb.append(w2 < 10 ? "-0" : "-");
        sb.append(w2);
        sb.append(w3 < 10 ? "-0" : "-");
        sb.append(w3);
        return sb.toString();
    }

    @Override // j$.time.temporal.m
    public InterfaceC3795b d(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
        return L(a(), qVar.q(this, j));
    }

    @Override // j$.time.temporal.m
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public InterfaceC3795b j(long j, j$.time.temporal.s sVar) {
        return L(a(), j$.time.temporal.r.b(this, j, sVar));
    }

    @Override // j$.time.chrono.InterfaceC3795b
    public long x() {
        return w(j$.time.temporal.a.EPOCH_DAY);
    }
}
