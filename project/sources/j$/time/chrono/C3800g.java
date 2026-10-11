package j$.time.chrono;

import j$.time.ZoneOffset;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3800g implements InterfaceC3798e, j$.time.temporal.m, j$.time.temporal.o, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    public final transient InterfaceC3795b a;
    public final transient j$.time.i b;

    @Override // java.lang.Comparable
    /* renamed from: E */
    public final /* synthetic */ int compareTo(InterfaceC3798e interfaceC3798e) {
        return j$.com.android.tools.r8.a.c(this, interfaceC3798e);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ Object J(j$.desugar.sun.nio.fs.m mVar) {
        return j$.com.android.tools.r8.a.q(this, mVar);
    }

    public static C3800g L(m mVar, j$.time.temporal.m mVar2) {
        C3800g c3800g = (C3800g) mVar2;
        if (mVar.equals(c3800g.a.a())) {
            return c3800g;
        }
        throw new ClassCastException("Chronology mismatch, required: " + mVar.i() + ", actual: " + c3800g.a.a().i());
    }

    @Override // j$.time.chrono.InterfaceC3798e
    public final m a() {
        return this.a.a();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return L(this.a.a(), j$.time.temporal.r.b(this, j, bVar));
    }

    public C3800g(InterfaceC3795b interfaceC3795b, j$.time.i iVar) {
        Objects.requireNonNull(interfaceC3795b, "date");
        Objects.requireNonNull(iVar, "time");
        this.a = interfaceC3795b;
        this.b = iVar;
    }

    public final C3800g P(j$.time.temporal.m mVar, j$.time.i iVar) {
        InterfaceC3795b interfaceC3795b = this.a;
        return (interfaceC3795b == mVar && this.b == iVar) ? this : new C3800g(AbstractC3797d.L(interfaceC3795b.a(), mVar), iVar);
    }

    @Override // j$.time.chrono.InterfaceC3798e
    public final InterfaceC3795b c() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC3798e
    public final j$.time.i b() {
        return this.b;
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar != null && qVar.p(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        return aVar.B() || aVar.L();
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u q(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (!((j$.time.temporal.a) qVar).L()) {
                return this.a.q(qVar);
            }
            j$.time.i iVar = this.b;
            iVar.getClass();
            return j$.time.temporal.r.d(iVar, qVar);
        }
        return qVar.w(this);
    }

    @Override // j$.time.temporal.n
    public final int l(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).L() ? this.b.l(qVar) : this.a.l(qVar);
        }
        return q(qVar).a(w(qVar), qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).L() ? this.b.w(qVar) : this.a.w(qVar);
        }
        return qVar.l(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m p(j$.time.f fVar) {
        return P(fVar, this.b);
    }

    @Override // j$.time.temporal.m
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final C3800g d(long j, j$.time.temporal.q qVar) {
        boolean z = qVar instanceof j$.time.temporal.a;
        InterfaceC3795b interfaceC3795b = this.a;
        if (z) {
            boolean L = ((j$.time.temporal.a) qVar).L();
            j$.time.i iVar = this.b;
            if (L) {
                return P(interfaceC3795b, iVar.d(j, qVar));
            }
            return P(interfaceC3795b.d(j, qVar), iVar);
        }
        return L(interfaceC3795b.a(), qVar.q(this, j));
    }

    @Override // j$.time.temporal.m
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final C3800g e(long j, j$.time.temporal.s sVar) {
        boolean z = sVar instanceof j$.time.temporal.b;
        InterfaceC3795b interfaceC3795b = this.a;
        if (z) {
            int i = AbstractC3799f.a[((j$.time.temporal.b) sVar).ordinal()];
            j$.time.i iVar = this.b;
            switch (i) {
                case 1:
                    return N(this.a, 0L, 0L, 0L, j);
                case 2:
                    C3800g P = P(interfaceC3795b.e(j / 86400000000L, (j$.time.temporal.s) j$.time.temporal.b.DAYS), iVar);
                    return P.N(P.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
                case 3:
                    C3800g P2 = P(interfaceC3795b.e(j / 86400000, (j$.time.temporal.s) j$.time.temporal.b.DAYS), iVar);
                    return P2.N(P2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
                case 4:
                    return N(this.a, 0L, 0L, j, 0L);
                case 5:
                    return N(this.a, 0L, j, 0L, 0L);
                case 6:
                    return N(this.a, j, 0L, 0L, 0L);
                case 7:
                    C3800g P3 = P(interfaceC3795b.e(j / 256, (j$.time.temporal.s) j$.time.temporal.b.DAYS), iVar);
                    return P3.N(P3.a, (j % 256) * 12, 0L, 0L, 0L);
                default:
                    return P(interfaceC3795b.e(j, sVar), iVar);
            }
        }
        return L(interfaceC3795b.a(), sVar.j(this, j));
    }

    public final C3800g N(InterfaceC3795b interfaceC3795b, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        j$.time.i iVar = this.b;
        if (j5 == 0) {
            return P(interfaceC3795b, iVar);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = (j2 % 1440) * 60000000000L;
        long j9 = ((j % 24) * 3600000000000L) + j8 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long W = iVar.W();
        long j10 = j9 + W;
        long N = j$.com.android.tools.r8.a.N(j10, 86400000000000L) + j7 + j6 + (j3 / 86400) + (j4 / 86400000000000L);
        long W2 = j$.com.android.tools.r8.a.W(j10, 86400000000000L);
        if (W2 != W) {
            iVar = j$.time.i.P(W2);
        }
        return P(interfaceC3795b.e(N, (j$.time.temporal.s) j$.time.temporal.b.DAYS), iVar);
    }

    @Override // j$.time.chrono.InterfaceC3798e
    public final InterfaceC3803j s(ZoneOffset zoneOffset) {
        return l.L(zoneOffset, null, this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m B(j$.time.temporal.m mVar) {
        return mVar.d(c().x(), j$.time.temporal.a.EPOCH_DAY).d(b().W(), j$.time.temporal.a.NANO_OF_DAY);
    }

    private Object writeReplace() {
        return new F((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC3798e) && j$.com.android.tools.r8.a.c(this, (InterfaceC3798e) obj) == 0;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }
}
