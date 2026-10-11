package j$.time;

import j$.time.chrono.InterfaceC3795b;
import j$.time.chrono.InterfaceC3798e;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class f implements j$.time.temporal.m, j$.time.temporal.o, InterfaceC3795b, Serializable {
    public static final f d = T(-999999999, 1, 1);
    public static final f e = T(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;

    static {
        T(1970, 1, 1);
    }

    public static f T(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.J(i);
        j$.time.temporal.a.MONTH_OF_YEAR.J(i2);
        j$.time.temporal.a.DAY_OF_MONTH.J(i3);
        return M(i, i2, i3);
    }

    public static f U(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.J(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + (i2 / 10);
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new f(aVar.b.a(j7, aVar), i3, i4);
    }

    public static f N(j$.time.temporal.n nVar) {
        Objects.requireNonNull(nVar, "temporal");
        f fVar = (f) nVar.J(j$.time.temporal.r.f);
        if (fVar != null) {
            return fVar;
        }
        throw new a("Unable to obtain LocalDate from TemporalAccessor: " + nVar + " of type " + nVar.getClass().getName());
    }

    public static f M(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.t.c.getClass();
                if (j$.time.chrono.t.l(i)) {
                    i4 = 29;
                }
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new a("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new a("Invalid date '" + k.O(i2).name() + " " + i3 + "'");
            }
        }
        return new f(i, i2, i3);
    }

    public static f Z(int i, int i2, int i3) {
        if (i2 == 2) {
            j$.time.chrono.t.c.getClass();
            i3 = Math.min(i3, j$.time.chrono.t.l((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new f(i, i2, i3);
    }

    public f(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.n(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u q(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.w(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        if (!aVar.B()) {
            throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
        int i = e.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.u.e(1L, S());
        }
        if (i == 2) {
            return j$.time.temporal.u.e(1L, R() ? 366 : 365);
        }
        if (i != 3) {
            return i != 4 ? ((j$.time.temporal.a) qVar).b : this.a <= 0 ? j$.time.temporal.u.e(1L, 1000000000L) : j$.time.temporal.u.e(1L, 999999999L);
        }
        return j$.time.temporal.u.e(1L, (k.O(this.b) != k.FEBRUARY || R()) ? 5L : 4L);
    }

    @Override // j$.time.temporal.n
    public final int l(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return O(qVar);
        }
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.EPOCH_DAY) {
                return x();
            }
            if (qVar != j$.time.temporal.a.PROLEPTIC_MONTH) {
                return O(qVar);
            }
            return ((this.a * 12) + this.b) - 1;
        }
        return qVar.l(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int O(j$.time.temporal.q qVar) {
        int i;
        int i2 = e.a[((j$.time.temporal.a) qVar).ordinal()];
        short s = this.c;
        int i3 = this.a;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return Q();
            case 3:
                i = (s - 1) / 7;
                return i + 1;
            case 4:
                if (i3 < 1) {
                    return 1 - i3;
                }
                return i3;
            case 5:
                return P().getValue();
            case 6:
                i = (s - 1) % 7;
                return i + 1;
            case 7:
                return ((Q() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.t("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((Q() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.t("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i3;
            case 13:
                return i3 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.chrono.InterfaceC3795b
    public final j$.time.chrono.m a() {
        return j$.time.chrono.t.c;
    }

    public final int Q() {
        return (k.O(this.b).L(R()) + this.c) - 1;
    }

    public final c P() {
        return c.L(((int) j$.com.android.tools.r8.a.W(x() + 3, 7)) + 1);
    }

    public final boolean R() {
        j$.time.chrono.t tVar = j$.time.chrono.t.c;
        long j = this.a;
        tVar.getClass();
        return j$.time.chrono.t.l(j);
    }

    public final int S() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : R() ? 29 : 28;
    }

    @Override // j$.time.temporal.m
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final f p(j$.time.temporal.o oVar) {
        if (oVar instanceof f) {
            return (f) oVar;
        }
        return (f) oVar.B(this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final f d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (f) qVar.q(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.J(j);
        int i = e.a[aVar.ordinal()];
        short s = this.c;
        short s2 = this.b;
        int i2 = this.a;
        switch (i) {
            case 1:
                int i3 = (int) j;
                if (s != i3) {
                    return T(i2, s2, i3);
                }
                return this;
            case 2:
                return c0((int) j);
            case 3:
                return W(j$.com.android.tools.r8.a.M(j - w(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH), 7));
            case 4:
                if (i2 < 1) {
                    j = 1 - j;
                }
                return d0((int) j);
            case 5:
                return W(j - P().getValue());
            case 6:
                return W(j - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return W(j - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return U(j);
            case 9:
                return W(j$.com.android.tools.r8.a.M(j - w(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR), 7));
            case 10:
                int i4 = (int) j;
                if (s2 != i4) {
                    j$.time.temporal.a.MONTH_OF_YEAR.J(i4);
                    return Z(i2, i4, s);
                }
                return this;
            case 11:
                return X(j - (((i2 * 12) + s2) - 1));
            case 12:
                return d0((int) j);
            case 13:
                if (w(j$.time.temporal.a.ERA) != j) {
                    return d0(1 - i2);
                }
                return this;
            default:
                throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
    }

    public final f d0(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.J(i);
        return Z(i, this.b, this.c);
    }

    public final f c0(int i) {
        if (Q() == i) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int i2 = this.a;
        long j = i2;
        aVar.J(j);
        j$.time.temporal.a.DAY_OF_YEAR.J(i);
        j$.time.chrono.t.c.getClass();
        boolean l = j$.time.chrono.t.l(j);
        if (i == 366 && !l) {
            throw new a("Invalid date 'DayOfYear 366' as '" + i2 + "' is not a leap year");
        }
        k O = k.O(((i - 1) / 31) + 1);
        if (i > (O.M(l) + O.L(l)) - 1) {
            O = k.a[((((int) 1) + 12) + O.ordinal()) % 12];
        }
        return new f(i2, O.getValue(), (i - O.L(l)) + 1);
    }

    @Override // j$.time.temporal.m
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final f e(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            switch (e.b[((j$.time.temporal.b) sVar).ordinal()]) {
                case 1:
                    return W(j);
                case 2:
                    return W(j$.com.android.tools.r8.a.M(j, 7));
                case 3:
                    return X(j);
                case 4:
                    return Y(j);
                case 5:
                    return Y(j$.com.android.tools.r8.a.M(j, 10));
                case 6:
                    return Y(j$.com.android.tools.r8.a.M(j, 100));
                case 7:
                    return Y(j$.com.android.tools.r8.a.M(j, 1000));
                case 8:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return d(j$.com.android.tools.r8.a.X(w(aVar), j), aVar);
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
        }
        return (f) sVar.j(this, j);
    }

    public final f Y(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return Z(aVar.b.a(this.a + j, aVar), this.b, this.c);
    }

    public final f X(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j3 = 12;
        return Z(aVar.b.a(j$.com.android.tools.r8.a.N(j2, j3), aVar), ((int) j$.com.android.tools.r8.a.W(j2, j3)) + 1, this.c);
    }

    public final f W(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.c + j;
        if (j2 > 0) {
            short s = this.b;
            int i = this.a;
            if (j2 <= 28) {
                return new f(i, s, (int) j2);
            }
            if (j2 <= 59) {
                long S = S();
                if (j2 <= S) {
                    return new f(i, s, (int) j2);
                }
                if (s < 12) {
                    return new f(i, s + 1, (int) (j2 - S));
                }
                int i2 = i + 1;
                j$.time.temporal.a.YEAR.J(i2);
                return new f(i2, 1, (int) (j2 - S));
            }
        }
        return U(j$.com.android.tools.r8.a.X(x(), j));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object J(j$.desugar.sun.nio.fs.m mVar) {
        return mVar == j$.time.temporal.r.f ? this : j$.com.android.tools.r8.a.p(this, mVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m B(j$.time.temporal.m mVar) {
        return j$.com.android.tools.r8.a.a(this, mVar);
    }

    @Override // j$.time.chrono.InterfaceC3795b
    public final InterfaceC3798e z(i iVar) {
        return LocalDateTime.O(this, iVar);
    }

    @Override // j$.time.chrono.InterfaceC3795b
    public final long x() {
        long j = this.a;
        long j2 = this.b;
        long j3 = 365 * j;
        long j4 = (((367 * j2) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j3 : j3 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.c - 1);
        if (j2 > 2) {
            j4 = !R() ? j4 - 2 : j4 - 1;
        }
        return j4 - 719528;
    }

    @Override // java.lang.Comparable
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC3795b interfaceC3795b) {
        if (interfaceC3795b instanceof f) {
            return L((f) interfaceC3795b);
        }
        return j$.com.android.tools.r8.a.b(this, interfaceC3795b);
    }

    public final int L(f fVar) {
        int i = this.a - fVar.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - fVar.b;
        return i2 == 0 ? this.c - fVar.c : i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && L((f) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC3795b
    public final int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    @Override // j$.time.chrono.InterfaceC3795b
    public final String toString() {
        int i = this.a;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (abs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        short s = this.b;
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        short s2 = this.c;
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    private Object writeReplace() {
        return new q((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
