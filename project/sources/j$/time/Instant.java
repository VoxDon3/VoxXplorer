package j$.time;

import j$.time.format.DateTimeFormatter;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.m, j$.time.temporal.o, Comparable<Instant>, Serializable {
    public static final Instant c = new Instant(0, 0);
    public static final Instant d = M(-31557014167219200L, 0);
    public static final Instant e = M(31556889864403199L, 999999999);
    private static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int compare = Long.compare(this.a, instant2.a);
        return compare != 0 ? compare : this.b - instant2.b;
    }

    public static Instant M(long j, long j2) {
        return L(j$.com.android.tools.r8.a.X(j, j$.com.android.tools.r8.a.N(j2, 1000000000L)), (int) j$.com.android.tools.r8.a.W(j2, 1000000000L));
    }

    public static Instant L(long j, int i) {
        if ((i | j) == 0) {
            return c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new a("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    public Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.NANO_OF_SECOND || qVar == j$.time.temporal.a.MICRO_OF_SECOND || qVar == j$.time.temporal.a.MILLI_OF_SECOND : qVar != null && qVar.p(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u q(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.d(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final int l(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.r.d(this, qVar).a(qVar.l(this), qVar);
        }
        int i = d.a[((j$.time.temporal.a) qVar).ordinal()];
        int i2 = this.b;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            return i2 / 1000;
        }
        if (i == 3) {
            return i2 / 1000000;
        }
        if (i == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.b.a(this.a, aVar);
        }
        throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        int i;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.l(this);
        }
        int i2 = d.a[((j$.time.temporal.a) qVar).ordinal()];
        int i3 = this.b;
        if (i2 == 1) {
            return i3;
        }
        if (i2 == 2) {
            i = i3 / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
            }
            i = i3 / 1000000;
        }
        return i;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (Instant) qVar.q(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.J(j);
        int i = d.a[aVar.ordinal()];
        int i2 = this.b;
        long j2 = this.a;
        if (i != 1) {
            if (i == 2) {
                int i3 = ((int) j) * 1000;
                if (i3 != i2) {
                    return L(j2, i3);
                }
            } else if (i == 3) {
                int i4 = ((int) j) * 1000000;
                if (i4 != i2) {
                    return L(j2, i4);
                }
            } else {
                if (i != 4) {
                    throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
                }
                if (j != j2) {
                    return L(j, i2);
                }
            }
        } else if (j != i2) {
            return L(j2, (int) j);
        }
        return this;
    }

    @Override // j$.time.temporal.m
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final Instant e(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (Instant) sVar.j(this, j);
        }
        switch (d.b[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return N(0L, j);
            case 2:
                return N(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return N(j / 1000, (j % 1000) * 1000000);
            case 4:
                return N(j, 0L);
            case 5:
                return N(j$.com.android.tools.r8.a.M(j, 60), 0L);
            case 6:
                return N(j$.com.android.tools.r8.a.M(j, 3600), 0L);
            case 7:
                return N(j$.com.android.tools.r8.a.M(j, 43200), 0L);
            case 8:
                return N(j$.com.android.tools.r8.a.M(j, 86400), 0L);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public final Instant N(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return M(j$.com.android.tools.r8.a.X(j$.com.android.tools.r8.a.X(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object J(j$.desugar.sun.nio.fs.m mVar) {
        if (mVar == j$.time.temporal.r.c) {
            return j$.time.temporal.b.NANOS;
        }
        if (mVar == j$.time.temporal.r.b || mVar == j$.time.temporal.r.a || mVar == j$.time.temporal.r.e || mVar == j$.time.temporal.r.d || mVar == j$.time.temporal.r.f || mVar == j$.time.temporal.r.g) {
            return null;
        }
        return mVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m B(j$.time.temporal.m mVar) {
        return mVar.d(this.a, j$.time.temporal.a.INSTANT_SECONDS).d(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.L(this, zoneOffset);
    }

    public long toEpochMilli() {
        int i = this.b;
        long j = this.a;
        if (j < 0 && i > 0) {
            return j$.com.android.tools.r8.a.X(j$.com.android.tools.r8.a.M(j + 1, 1000), (i / 1000000) - 1000);
        }
        return j$.com.android.tools.r8.a.X(j$.com.android.tools.r8.a.M(j, 1000), i / 1000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.a == instant.a && this.b == instant.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.e.a(this);
    }

    private Object writeReplace() {
        return new q((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m p(f fVar) {
        return (Instant) j$.com.android.tools.r8.a.a(fVar, this);
    }
}
