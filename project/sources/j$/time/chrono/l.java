package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class l implements InterfaceC3803j, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    public final transient C3800g a;
    public final transient ZoneOffset b;
    public final transient j$.time.v c;

    @Override // j$.time.temporal.n
    public final /* synthetic */ Object J(j$.desugar.sun.nio.fs.m mVar) {
        return j$.com.android.tools.r8.a.r(this, mVar);
    }

    @Override // j$.time.chrono.InterfaceC3803j
    public final /* synthetic */ long K() {
        return j$.com.android.tools.r8.a.u(this);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ int l(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.i(this, qVar);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return j$.com.android.tools.r8.a.d(this, (InterfaceC3803j) obj);
    }

    public static l L(j$.time.v vVar, ZoneOffset zoneOffset, C3800g c3800g) {
        Objects.requireNonNull(c3800g, "localDateTime");
        Objects.requireNonNull(vVar, "zone");
        if (vVar instanceof ZoneOffset) {
            return new l(vVar, (ZoneOffset) vVar, c3800g);
        }
        j$.time.zone.f L = vVar.L();
        LocalDateTime M = LocalDateTime.M(c3800g);
        List f = L.f(M);
        if (f.size() == 1) {
            zoneOffset = (ZoneOffset) f.get(0);
        } else if (f.size() != 0) {
            if (zoneOffset == null || !f.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) f.get(0);
            }
            c3800g = c3800g;
        } else {
            Object e = L.e(M);
            j$.time.zone.b bVar = e instanceof j$.time.zone.b ? (j$.time.zone.b) e : null;
            c3800g = c3800g.N(c3800g.a, 0L, 0L, Duration.ofSeconds(bVar.d.a - bVar.c.a).a, 0L);
            zoneOffset = bVar.d;
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new l(vVar, zoneOffset, c3800g);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u q(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar != j$.time.temporal.a.INSTANT_SECONDS && qVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return ((C3800g) F()).q(qVar);
            }
            return ((j$.time.temporal.a) qVar).b;
        }
        return qVar.w(this);
    }

    public static l B(m mVar, j$.time.temporal.m mVar2) {
        l lVar = (l) mVar2;
        if (mVar.equals(lVar.a())) {
            return lVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + mVar.i() + ", actual: " + lVar.a().i());
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i = AbstractC3802i.a[((j$.time.temporal.a) qVar).ordinal()];
            if (i == 1) {
                return K();
            }
            if (i != 2) {
                return ((C3800g) F()).w(qVar);
            }
            return g().a;
        }
        return qVar.l(this);
    }

    public l(j$.time.v vVar, ZoneOffset zoneOffset, C3800g c3800g) {
        this.a = (C3800g) Objects.requireNonNull(c3800g, "dateTime");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
        this.c = (j$.time.v) Objects.requireNonNull(vVar, "zone");
    }

    @Override // j$.time.chrono.InterfaceC3803j
    public final ZoneOffset g() {
        return this.b;
    }

    @Override // j$.time.chrono.InterfaceC3803j
    public final InterfaceC3795b c() {
        return ((C3800g) F()).c();
    }

    @Override // j$.time.chrono.InterfaceC3803j
    public final j$.time.i b() {
        return ((C3800g) F()).b();
    }

    @Override // j$.time.chrono.InterfaceC3803j
    public final InterfaceC3798e F() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC3803j
    public final j$.time.v u() {
        return this.c;
    }

    @Override // j$.time.chrono.InterfaceC3803j
    public final m a() {
        return c().a();
    }

    @Override // j$.time.chrono.InterfaceC3803j
    public final InterfaceC3803j h(j$.time.v vVar) {
        return L(vVar, this.b, this.a);
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return true;
        }
        return qVar != null && qVar.p(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return B(a(), qVar.q(this, j));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i = AbstractC3804k.a[aVar.ordinal()];
        if (i == 1) {
            return e(j - j$.com.android.tools.r8.a.u(this), j$.time.temporal.b.SECONDS);
        }
        j$.time.v vVar = this.c;
        C3800g c3800g = this.a;
        if (i != 2) {
            return L(vVar, this.b, c3800g.d(j, qVar));
        }
        ZoneOffset R = ZoneOffset.R(aVar.b.a(j, aVar));
        c3800g.getClass();
        Instant M = Instant.M(j$.com.android.tools.r8.a.t(c3800g, R), c3800g.b.d);
        m a = a();
        ZoneOffset d = vVar.L().d(M);
        Objects.requireNonNull(d, "offset");
        return new l(vVar, d, (C3800g) a.r(LocalDateTime.P(M.a, M.b, d)));
    }

    @Override // j$.time.temporal.m
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final l e(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            return B(a(), this.a.e(j, sVar).B(this));
        }
        return B(a(), sVar.j(this, j));
    }

    private Object writeReplace() {
        return new F((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC3803j) && j$.com.android.tools.r8.a.d(this, (InterfaceC3803j) obj) == 0;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.a) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    public final String toString() {
        String c3800g = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = c3800g + zoneOffset.b;
        j$.time.v vVar = this.c;
        if (zoneOffset == vVar) {
            return str;
        }
        return str + "[" + vVar.toString() + "]";
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m p(j$.time.f fVar) {
        return B(a(), fVar.B(this));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return B(a(), j$.time.temporal.r.b(this, j, bVar));
    }
}
