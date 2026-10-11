package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class o implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 7264499704384272492L;
    public final i a;
    public final ZoneOffset b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o oVar = (o) obj;
        ZoneOffset zoneOffset = oVar.b;
        boolean equals = this.b.equals(zoneOffset);
        i iVar = oVar.a;
        i iVar2 = this.a;
        if (equals) {
            return iVar2.compareTo(iVar);
        }
        int compare = Long.compare(iVar2.W() - (r1.a * 1000000000), iVar.W() - (oVar.b.a * 1000000000));
        return compare == 0 ? iVar2.compareTo(iVar) : compare;
    }

    static {
        i iVar = i.e;
        ZoneOffset zoneOffset = ZoneOffset.f;
        iVar.getClass();
        new o(iVar, zoneOffset);
        i iVar2 = i.f;
        ZoneOffset zoneOffset2 = ZoneOffset.e;
        iVar2.getClass();
        new o(iVar2, zoneOffset2);
    }

    public o(i iVar, ZoneOffset zoneOffset) {
        this.a = (i) Objects.requireNonNull(iVar, "time");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    public final o M(i iVar, ZoneOffset zoneOffset) {
        return (this.a == iVar && this.b.equals(zoneOffset)) ? this : new o(iVar, zoneOffset);
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).L() || qVar == j$.time.temporal.a.OFFSET_SECONDS : qVar != null && qVar.p(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u q(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar != j$.time.temporal.a.OFFSET_SECONDS) {
                i iVar = this.a;
                iVar.getClass();
                return j$.time.temporal.r.d(iVar, qVar);
            }
            return ((j$.time.temporal.a) qVar).b;
        }
        return qVar.w(this);
    }

    @Override // j$.time.temporal.n
    public final int l(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.b.a;
            }
            return this.a.w(qVar);
        }
        return qVar.l(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
            i iVar = this.a;
            if (qVar == aVar) {
                j$.time.temporal.a aVar2 = (j$.time.temporal.a) qVar;
                return M(iVar, ZoneOffset.R(aVar2.b.a(j, aVar2)));
            }
            return M(iVar.d(j, qVar), this.b);
        }
        return (o) qVar.q(this, j);
    }

    @Override // j$.time.temporal.m
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final o e(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            return M(this.a.e(j, sVar), this.b);
        }
        return (o) sVar.j(this, j);
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
        if (((mVar == j$.time.temporal.r.a) || (mVar == j$.time.temporal.r.b)) || mVar == j$.time.temporal.r.f) {
            return null;
        }
        if (mVar == j$.time.temporal.r.g) {
            return this.a;
        }
        if (mVar == j$.time.temporal.r.c) {
            return j$.time.temporal.b.NANOS;
        }
        return mVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m B(j$.time.temporal.m mVar) {
        return mVar.d(this.a.W(), j$.time.temporal.a.NANO_OF_DAY).d(this.b.a, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.a.equals(oVar.a) && this.b.equals(oVar.b)) {
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
        return new q((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m p(f fVar) {
        return (o) j$.com.android.tools.r8.a.a(fVar, this);
    }
}
