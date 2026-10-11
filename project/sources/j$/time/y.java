package j$.time;

import j$.time.chrono.InterfaceC3795b;
import j$.time.chrono.InterfaceC3798e;
import j$.time.chrono.InterfaceC3803j;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class y implements j$.time.temporal.m, InterfaceC3803j, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    public final LocalDateTime a;
    public final ZoneOffset b;
    public final v c;

    @Override // j$.time.chrono.InterfaceC3803j
    public final /* synthetic */ long K() {
        return j$.com.android.tools.r8.a.u(this);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return j$.com.android.tools.r8.a.d(this, (InterfaceC3803j) obj);
    }

    @Override // j$.time.chrono.InterfaceC3803j
    public final j$.time.chrono.m a() {
        return ((f) c()).a();
    }

    public static y L(LocalDateTime localDateTime, v vVar, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(vVar, "zone");
        if (vVar instanceof ZoneOffset) {
            return new y(localDateTime, vVar, (ZoneOffset) vVar);
        }
        j$.time.zone.f L = vVar.L();
        List f = L.f(localDateTime);
        if (f.size() == 1) {
            zoneOffset = (ZoneOffset) f.get(0);
        } else if (f.size() != 0) {
            if (zoneOffset == null || !f.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) Objects.requireNonNull((ZoneOffset) f.get(0), "offset");
            }
        } else {
            Object e = L.e(localDateTime);
            j$.time.zone.b bVar = e instanceof j$.time.zone.b ? (j$.time.zone.b) e : null;
            localDateTime = localDateTime.R(Duration.ofSeconds(bVar.d.a - bVar.c.a).a);
            zoneOffset = bVar.d;
        }
        return new y(localDateTime, vVar, zoneOffset);
    }

    public static y B(long j, int i, v vVar) {
        ZoneOffset d = vVar.L().d(Instant.M(j, i));
        return new y(LocalDateTime.P(j, i, d), vVar, d);
    }

    public y(LocalDateTime localDateTime, v vVar, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = vVar;
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return true;
        }
        return qVar != null && qVar.p(this);
    }

    @Override // j$.time.chrono.InterfaceC3803j
    public final InterfaceC3795b c() {
        return this.a.a;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u q(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) qVar).b;
            }
            return this.a.q(qVar);
        }
        return qVar.w(this);
    }

    @Override // j$.time.temporal.n
    public final int l(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i = x.a[((j$.time.temporal.a) qVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.b.a;
            }
            return this.a.l(qVar);
        }
        return j$.com.android.tools.r8.a.i(this, qVar);
    }

    @Override // j$.time.chrono.InterfaceC3803j
    public final i b() {
        return this.a.b;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m p(f fVar) {
        return L(LocalDateTime.O(fVar, this.a.b), this.c, this.b);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.l(this);
        }
        int i = x.a[((j$.time.temporal.a) qVar).ordinal()];
        return i != 1 ? i != 2 ? this.a.w(qVar) : this.b.a : j$.com.android.tools.r8.a.u(this);
    }

    @Override // j$.time.chrono.InterfaceC3803j
    public final ZoneOffset g() {
        return this.b;
    }

    @Override // j$.time.chrono.InterfaceC3803j
    public final v u() {
        return this.c;
    }

    @Override // j$.time.chrono.InterfaceC3803j
    public final InterfaceC3803j h(v vVar) {
        Objects.requireNonNull(vVar, "zone");
        return this.c.equals(vVar) ? this : L(this.a, vVar, this.b);
    }

    @Override // j$.time.chrono.InterfaceC3803j
    public final InterfaceC3798e F() {
        return this.a;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            int i = x.a[aVar.ordinal()];
            LocalDateTime localDateTime = this.a;
            v vVar = this.c;
            if (i == 1) {
                return B(j, localDateTime.b.d, vVar);
            }
            ZoneOffset zoneOffset = this.b;
            if (i != 2) {
                return L(localDateTime.d(j, qVar), vVar, zoneOffset);
            }
            ZoneOffset R = ZoneOffset.R(aVar.b.a(j, aVar));
            return (R.equals(zoneOffset) || !vVar.L().f(localDateTime).contains(R)) ? this : new y(localDateTime, vVar, R);
        }
        return (y) qVar.q(this, j);
    }

    @Override // j$.time.temporal.m
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final y e(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (y) sVar.j(this, j);
        }
        j$.time.temporal.b bVar = (j$.time.temporal.b) sVar;
        int compareTo = bVar.compareTo(j$.time.temporal.b.DAYS);
        ZoneOffset zoneOffset = this.b;
        v vVar = this.c;
        LocalDateTime localDateTime = this.a;
        if (compareTo >= 0 && bVar != j$.time.temporal.b.FOREVER) {
            return L(localDateTime.e(j, sVar), vVar, zoneOffset);
        }
        LocalDateTime e = localDateTime.e(j, sVar);
        Objects.requireNonNull(e, "localDateTime");
        Objects.requireNonNull(zoneOffset, "offset");
        Objects.requireNonNull(vVar, "zone");
        if (vVar.L().f(e).contains(zoneOffset)) {
            return new y(e, vVar, zoneOffset);
        }
        e.getClass();
        return B(j$.com.android.tools.r8.a.t(e, zoneOffset), e.b.d, vVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object J(j$.desugar.sun.nio.fs.m mVar) {
        if (mVar == j$.time.temporal.r.f) {
            return this.a.a;
        }
        return j$.com.android.tools.r8.a.r(this, mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.a.equals(yVar.a) && this.b.equals(yVar.b) && this.c.equals(yVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.a) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    public final String toString() {
        String localDateTime = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = localDateTime + zoneOffset.b;
        v vVar = this.c;
        if (zoneOffset == vVar) {
            return str;
        }
        return str + "[" + vVar.toString() + "]";
    }

    private Object writeReplace() {
        return new q((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
