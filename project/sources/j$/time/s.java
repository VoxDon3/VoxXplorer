package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class s implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    public final int a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((s) obj).a;
    }

    static {
        j$.time.format.m mVar = new j$.time.format.m();
        mVar.h(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.s.EXCEEDS_PAD);
        mVar.l(Locale.getDefault(), j$.time.format.r.SMART, null);
    }

    public static s L(int i) {
        j$.time.temporal.a.YEAR.J(i);
        return new s(i);
    }

    public s(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.YEAR || qVar == j$.time.temporal.a.YEAR_OF_ERA || qVar == j$.time.temporal.a.ERA : qVar != null && qVar.p(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u q(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.u.e(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.r.d(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final int l(j$.time.temporal.q qVar) {
        return q(qVar).a(w(qVar), qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.l(this);
        }
        int i = r.a[((j$.time.temporal.a) qVar).ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return i2;
        }
        if (i == 3) {
            return i2 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.m
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final s d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (s) qVar.q(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.J(j);
        int i = r.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                j = 1 - j;
            }
            return L((int) j);
        }
        if (i == 2) {
            return L((int) j);
        }
        if (i == 3) {
            return w(j$.time.temporal.a.ERA) == j ? this : L(1 - i2);
        }
        throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.m
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final s e(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            int i = r.b[((j$.time.temporal.b) sVar).ordinal()];
            if (i == 1) {
                return N(j);
            }
            if (i == 2) {
                return N(j$.com.android.tools.r8.a.M(j, 10));
            }
            if (i == 3) {
                return N(j$.com.android.tools.r8.a.M(j, 100));
            }
            if (i == 4) {
                return N(j$.com.android.tools.r8.a.M(j, 1000));
            }
            if (i == 5) {
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.X(w(aVar), j), aVar);
            }
            throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
        return (s) sVar.j(this, j);
    }

    public final s N(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return L(aVar.b.a(this.a + j, aVar));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object J(j$.desugar.sun.nio.fs.m mVar) {
        if (mVar == j$.time.temporal.r.b) {
            return j$.time.chrono.t.c;
        }
        if (mVar == j$.time.temporal.r.c) {
            return j$.time.temporal.b.YEARS;
        }
        return j$.time.temporal.r.c(this, mVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m B(j$.time.temporal.m mVar) {
        if (!j$.com.android.tools.r8.a.K(mVar).equals(j$.time.chrono.t.c)) {
            throw new a("Adjustment only supported on ISO date-time");
        }
        return mVar.d(this.a, j$.time.temporal.a.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            if (this.a == ((s) obj).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    private Object writeReplace() {
        return new q((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m p(f fVar) {
        return (s) j$.com.android.tools.r8.a.a(fVar, this);
    }
}
