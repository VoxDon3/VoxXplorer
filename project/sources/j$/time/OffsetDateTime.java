package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class OffsetDateTime implements j$.time.temporal.m, j$.time.temporal.o, Comparable<OffsetDateTime>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 2287754244819255394L;
    public final LocalDateTime a;
    public final ZoneOffset b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int i;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.b;
        ZoneOffset zoneOffset2 = this.b;
        if (zoneOffset2.equals(zoneOffset)) {
            i = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.a;
            localDateTime.getClass();
            long t = j$.com.android.tools.r8.a.t(localDateTime, zoneOffset2);
            LocalDateTime localDateTime2 = offsetDateTime2.a;
            localDateTime2.getClass();
            int compare = Long.compare(t, j$.com.android.tools.r8.a.t(localDateTime2, offsetDateTime2.b));
            i = compare == 0 ? localDateTime.b.d - localDateTime2.b.d : compare;
        }
        return i == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : i;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.c;
        ZoneOffset zoneOffset = ZoneOffset.f;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.d;
        ZoneOffset zoneOffset2 = ZoneOffset.e;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public static OffsetDateTime L(Instant instant, v vVar) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(vVar, "zone");
        ZoneOffset d = vVar.L().d(instant);
        return new OffsetDateTime(LocalDateTime.P(instant.a, instant.b, d), d);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.a = (LocalDateTime) Objects.requireNonNull(localDateTime, "dateTime");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    public final OffsetDateTime N(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.a == localDateTime && this.b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return true;
        }
        return qVar != null && qVar.p(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u q(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar != j$.time.temporal.a.INSTANT_SECONDS && qVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.a.q(qVar);
            }
            return ((j$.time.temporal.a) qVar).b;
        }
        return qVar.w(this);
    }

    @Override // j$.time.temporal.n
    public final int l(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i = n.a[((j$.time.temporal.a) qVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.b.a;
            }
            return this.a.l(qVar);
        }
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.l(this);
        }
        int i = n.a[((j$.time.temporal.a) qVar).ordinal()];
        ZoneOffset zoneOffset = this.b;
        LocalDateTime localDateTime = this.a;
        if (i != 1) {
            return i != 2 ? localDateTime.w(qVar) : zoneOffset.a;
        }
        localDateTime.getClass();
        return j$.com.android.tools.r8.a.t(localDateTime, zoneOffset);
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m p(f fVar) {
        LocalDateTime localDateTime = this.a;
        return N(localDateTime.U(fVar, localDateTime.b), this.b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            int i = n.a[aVar.ordinal()];
            ZoneOffset zoneOffset = this.b;
            LocalDateTime localDateTime = this.a;
            if (i == 1) {
                return L(Instant.M(j, localDateTime.b.d), zoneOffset);
            }
            if (i == 2) {
                return N(localDateTime, ZoneOffset.R(aVar.b.a(j, aVar)));
            }
            return N(localDateTime.d(j, qVar), zoneOffset);
        }
        return (OffsetDateTime) qVar.q(this, j);
    }

    @Override // j$.time.temporal.m
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime e(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            return N(this.a.e(j, sVar), this.b);
        }
        return (OffsetDateTime) sVar.j(this, j);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object J(j$.desugar.sun.nio.fs.m mVar) {
        if (mVar == j$.time.temporal.r.d || mVar == j$.time.temporal.r.e) {
            return this.b;
        }
        if (mVar == j$.time.temporal.r.a) {
            return null;
        }
        j$.desugar.sun.nio.fs.m mVar2 = j$.time.temporal.r.f;
        LocalDateTime localDateTime = this.a;
        if (mVar == mVar2) {
            return localDateTime.a;
        }
        if (mVar == j$.time.temporal.r.g) {
            return localDateTime.b;
        }
        if (mVar == j$.time.temporal.r.b) {
            return j$.time.chrono.t.c;
        }
        if (mVar == j$.time.temporal.r.c) {
            return j$.time.temporal.b.NANOS;
        }
        return mVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m B(j$.time.temporal.m mVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        LocalDateTime localDateTime = this.a;
        return mVar.d(localDateTime.a.x(), aVar).d(localDateTime.b.W(), j$.time.temporal.a.NANO_OF_DAY).d(this.b.a, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.a;
    }

    public final String toString() {
        return this.a.toString() + this.b.b;
    }

    private Object writeReplace() {
        return new q((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
