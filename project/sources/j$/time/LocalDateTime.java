package j$.time;

import j$.time.chrono.InterfaceC3795b;
import j$.time.chrono.InterfaceC3798e;
import j$.time.chrono.InterfaceC3803j;
import j$.time.format.DateTimeFormatter;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class LocalDateTime implements j$.time.temporal.m, j$.time.temporal.o, InterfaceC3798e, Serializable {
    public static final LocalDateTime c = O(f.d, i.e);
    public static final LocalDateTime d = O(f.e, i.f);
    private static final long serialVersionUID = 6207766400415563566L;
    public final f a;
    public final i b;

    @Override // j$.time.chrono.InterfaceC3798e
    public final j$.time.chrono.m a() {
        return ((f) c()).a();
    }

    @Override // j$.time.chrono.InterfaceC3798e
    public final InterfaceC3803j s(ZoneOffset zoneOffset) {
        return y.L(this, zoneOffset, null);
    }

    public static LocalDateTime O(f fVar, i iVar) {
        Objects.requireNonNull(fVar, "date");
        Objects.requireNonNull(iVar, "time");
        return new LocalDateTime(fVar, iVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m B(j$.time.temporal.m mVar) {
        return mVar.d(((f) c()).x(), j$.time.temporal.a.EPOCH_DAY).d(b().W(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public static LocalDateTime P(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.J(j2);
        return new LocalDateTime(f.U(j$.com.android.tools.r8.a.N(j + zoneOffset.a, 86400)), i.P((((int) j$.com.android.tools.r8.a.W(r5, r7)) * 1000000000) + j2));
    }

    public static LocalDateTime M(j$.time.temporal.n nVar) {
        if (nVar instanceof LocalDateTime) {
            return (LocalDateTime) nVar;
        }
        if (!(nVar instanceof y)) {
            if (nVar instanceof OffsetDateTime) {
                return ((OffsetDateTime) nVar).toLocalDateTime();
            }
            try {
                return new LocalDateTime(f.N(nVar), i.N(nVar));
            } catch (a e) {
                throw new a("Unable to obtain LocalDateTime from TemporalAccessor: " + nVar + " of type " + nVar.getClass().getName(), e);
            }
        }
        return ((y) nVar).a;
    }

    public LocalDateTime(f fVar, i iVar) {
        this.a = fVar;
        this.b = iVar;
    }

    public final LocalDateTime U(f fVar, i iVar) {
        return (this.a == fVar && this.b == iVar) ? this : new LocalDateTime(fVar, iVar);
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
            if (((j$.time.temporal.a) qVar).L()) {
                i iVar = this.b;
                iVar.getClass();
                return j$.time.temporal.r.d(iVar, qVar);
            }
            return this.a.q(qVar);
        }
        return qVar.w(this);
    }

    @Override // j$.time.temporal.n
    public final int l(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).L() ? this.b.l(qVar) : this.a.l(qVar);
        }
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).L() ? this.b.w(qVar) : this.a.w(qVar);
        }
        return qVar.l(this);
    }

    public final int L(LocalDateTime localDateTime) {
        int L = this.a.L(localDateTime.a);
        return L == 0 ? this.b.compareTo(localDateTime.b) : L;
    }

    @Override // j$.time.chrono.InterfaceC3798e
    public final InterfaceC3795b c() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC3798e
    public final i b() {
        return this.b;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m p(f fVar) {
        return U(fVar, this.b);
    }

    @Override // j$.time.temporal.m
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            boolean L = ((j$.time.temporal.a) qVar).L();
            i iVar = this.b;
            f fVar = this.a;
            if (L) {
                return U(fVar, iVar.d(j, qVar));
            }
            return U(fVar.d(j, qVar), iVar);
        }
        return (LocalDateTime) qVar.q(this, j);
    }

    @Override // j$.time.temporal.m
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime e(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            int i = g.a[((j$.time.temporal.b) sVar).ordinal()];
            i iVar = this.b;
            f fVar = this.a;
            switch (i) {
                case 1:
                    return S(this.a, 0L, 0L, 0L, j);
                case 2:
                    LocalDateTime U = U(fVar.W(j / 86400000000L), iVar);
                    return U.S(U.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
                case 3:
                    LocalDateTime U2 = U(fVar.W(j / 86400000), iVar);
                    return U2.S(U2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
                case 4:
                    return R(j);
                case 5:
                    return S(this.a, 0L, j, 0L, 0L);
                case 6:
                    return S(this.a, j, 0L, 0L, 0L);
                case 7:
                    LocalDateTime U3 = U(fVar.W(j / 256), iVar);
                    return U3.S(U3.a, (j % 256) * 12, 0L, 0L, 0L);
                default:
                    return U(fVar.e(j, sVar), iVar);
            }
        }
        return (LocalDateTime) sVar.j(this, j);
    }

    public final LocalDateTime R(long j) {
        return S(this.a, 0L, 0L, j, 0L);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j, bVar);
    }

    public final LocalDateTime S(f fVar, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        i iVar = this.b;
        if (j5 == 0) {
            return U(fVar, iVar);
        }
        long j6 = j / 24;
        long j7 = j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long j8 = 1;
        long j9 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long W = iVar.W();
        long j10 = (j9 * j8) + W;
        long N = j$.com.android.tools.r8.a.N(j10, 86400000000000L) + (j7 * j8);
        long W2 = j$.com.android.tools.r8.a.W(j10, 86400000000000L);
        if (W2 != W) {
            iVar = i.P(W2);
        }
        return U(fVar.W(N), iVar);
    }

    @Override // j$.time.temporal.n
    public final Object J(j$.desugar.sun.nio.fs.m mVar) {
        if (mVar == j$.time.temporal.r.f) {
            return this.a;
        }
        return j$.com.android.tools.r8.a.q(this, mVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC3798e interfaceC3798e) {
        if (interfaceC3798e instanceof LocalDateTime) {
            return L((LocalDateTime) interfaceC3798e);
        }
        return j$.com.android.tools.r8.a.c(this, interfaceC3798e);
    }

    public final boolean N(InterfaceC3798e interfaceC3798e) {
        if (interfaceC3798e instanceof LocalDateTime) {
            return L((LocalDateTime) interfaceC3798e) < 0;
        }
        long x = this.a.x();
        long x2 = interfaceC3798e.c().x();
        if (x >= x2) {
            return x == x2 && this.b.W() < interfaceC3798e.b().W();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    private Object writeReplace() {
        return new q((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
