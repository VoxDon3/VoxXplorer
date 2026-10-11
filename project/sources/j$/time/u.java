package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class u implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 4183400860270640070L;
    public final int a;
    public final int b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        u uVar = (u) obj;
        int i = this.a - uVar.a;
        return i == 0 ? this.b - uVar.b : i;
    }

    static {
        j$.time.format.m mVar = new j$.time.format.m();
        mVar.h(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.s.EXCEEDS_PAD);
        mVar.c('-');
        mVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        mVar.l(Locale.getDefault(), j$.time.format.r.SMART, null);
    }

    public u(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final u P(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new u(i, i2);
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.YEAR || qVar == j$.time.temporal.a.MONTH_OF_YEAR || qVar == j$.time.temporal.a.PROLEPTIC_MONTH || qVar == j$.time.temporal.a.YEAR_OF_ERA || qVar == j$.time.temporal.a.ERA : qVar != null && qVar.p(this);
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
        int i = t.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return L();
        }
        int i2 = this.a;
        if (i == 3) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 4) {
            return i2;
        }
        if (i == 5) {
            return i2 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
    }

    public final long L() {
        return ((this.a * 12) + this.b) - 1;
    }

    @Override // j$.time.temporal.m
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final u d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (u) qVar.q(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.J(j);
        int i = t.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            int i3 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.J(i3);
            return P(i2, i3);
        }
        if (i == 2) {
            return N(j - L());
        }
        int i4 = this.b;
        if (i == 3) {
            if (i2 < 1) {
                j = 1 - j;
            }
            int i5 = (int) j;
            j$.time.temporal.a.YEAR.J(i5);
            return P(i5, i4);
        }
        if (i == 4) {
            int i6 = (int) j;
            j$.time.temporal.a.YEAR.J(i6);
            return P(i6, i4);
        }
        if (i != 5) {
            throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
        if (w(j$.time.temporal.a.ERA) == j) {
            return this;
        }
        int i7 = 1 - i2;
        j$.time.temporal.a.YEAR.J(i7);
        return P(i7, i4);
    }

    @Override // j$.time.temporal.m
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final u e(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            switch (t.b[((j$.time.temporal.b) sVar).ordinal()]) {
                case 1:
                    return N(j);
                case 2:
                    return O(j);
                case 3:
                    return O(j$.com.android.tools.r8.a.M(j, 10));
                case 4:
                    return O(j$.com.android.tools.r8.a.M(j, 100));
                case 5:
                    return O(j$.com.android.tools.r8.a.M(j, 1000));
                case 6:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return d(j$.com.android.tools.r8.a.X(w(aVar), j), aVar);
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
        }
        return (u) sVar.j(this, j);
    }

    public final u O(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return P(aVar.b.a(this.a + j, aVar), this.b);
    }

    public final u N(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j3 = 12;
        return P(aVar.b.a(j$.com.android.tools.r8.a.N(j2, j3), aVar), ((int) j$.com.android.tools.r8.a.W(j2, j3)) + 1);
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
            return j$.time.temporal.b.MONTHS;
        }
        return j$.time.temporal.r.c(this, mVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m B(j$.time.temporal.m mVar) {
        if (!j$.com.android.tools.r8.a.K(mVar).equals(j$.time.chrono.t.c)) {
            throw new a("Adjustment only supported on ISO date-time");
        }
        return mVar.d(L(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.a == uVar.a && this.b == uVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b << 27) ^ this.a;
    }

    public final String toString() {
        int i = this.a;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(9);
        if (abs >= 1000) {
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }

    private Object writeReplace() {
        return new q((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m p(f fVar) {
        return (u) j$.com.android.tools.r8.a.a(fVar, this);
    }
}
