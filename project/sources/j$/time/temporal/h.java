package j$.time.temporal;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class h implements q {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ h[] b;

    @Override // j$.time.temporal.q
    public final boolean B() {
        return true;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) b.clone();
    }

    static {
        h hVar = new h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.q
            public final u j() {
                return u.f(90L, 92L);
            }

            @Override // j$.time.temporal.q
            public final boolean p(n nVar) {
                if (!nVar.f(a.DAY_OF_YEAR) || !nVar.f(a.MONTH_OF_YEAR) || !nVar.f(a.YEAR)) {
                    return false;
                }
                h hVar2 = j.a;
                return j$.com.android.tools.r8.a.K(nVar).equals(j$.time.chrono.t.c);
            }

            @Override // j$.time.temporal.q
            public final u w(n nVar) {
                if (!p(nVar)) {
                    throw new t("Unsupported field: DayOfQuarter");
                }
                long w = nVar.w(h.QUARTER_OF_YEAR);
                if (w == 1) {
                    long w2 = nVar.w(a.YEAR);
                    j$.time.chrono.t.c.getClass();
                    return j$.time.chrono.t.l(w2) ? u.e(1L, 91L) : u.e(1L, 90L);
                }
                if (w == 2) {
                    return u.e(1L, 91L);
                }
                if (w == 3 || w == 4) {
                    return u.e(1L, 92L);
                }
                return j();
            }

            @Override // j$.time.temporal.q
            public final long l(n nVar) {
                if (!p(nVar)) {
                    throw new t("Unsupported field: DayOfQuarter");
                }
                int l = nVar.l(a.DAY_OF_YEAR);
                int l2 = nVar.l(a.MONTH_OF_YEAR);
                long w = nVar.w(a.YEAR);
                int[] iArr = h.a;
                int i = (l2 - 1) / 3;
                j$.time.chrono.t.c.getClass();
                return l - iArr[i + (j$.time.chrono.t.l(w) ? 4 : 0)];
            }

            @Override // j$.time.temporal.q
            public final m q(m mVar, long j) {
                long l = l(mVar);
                j().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return mVar.d((j - l) + mVar.w(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.q
            public final u j() {
                return u.e(1L, 4L);
            }

            @Override // j$.time.temporal.q
            public final boolean p(n nVar) {
                if (!nVar.f(a.MONTH_OF_YEAR)) {
                    return false;
                }
                h hVar3 = j.a;
                return j$.com.android.tools.r8.a.K(nVar).equals(j$.time.chrono.t.c);
            }

            @Override // j$.time.temporal.q
            public final long l(n nVar) {
                if (!p(nVar)) {
                    throw new t("Unsupported field: QuarterOfYear");
                }
                return (nVar.w(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.q
            public final u w(n nVar) {
                if (!p(nVar)) {
                    throw new t("Unsupported field: QuarterOfYear");
                }
                return j();
            }

            @Override // j$.time.temporal.q
            public final m q(m mVar, long j) {
                long l = l(mVar);
                j().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return mVar.d(((j - l) * 3) + mVar.w(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.q
            public final u j() {
                return u.f(52L, 53L);
            }

            @Override // j$.time.temporal.q
            public final boolean p(n nVar) {
                if (!nVar.f(a.EPOCH_DAY)) {
                    return false;
                }
                h hVar4 = j.a;
                return j$.com.android.tools.r8.a.K(nVar).equals(j$.time.chrono.t.c);
            }

            @Override // j$.time.temporal.q
            public final u w(n nVar) {
                if (!p(nVar)) {
                    throw new t("Unsupported field: WeekOfWeekBasedYear");
                }
                return u.e(1L, h.M(h.L(j$.time.f.N(nVar))));
            }

            @Override // j$.time.temporal.q
            public final long l(n nVar) {
                if (!p(nVar)) {
                    throw new t("Unsupported field: WeekOfWeekBasedYear");
                }
                return h.J(j$.time.f.N(nVar));
            }

            @Override // j$.time.temporal.q
            public final m q(m mVar, long j) {
                j().b(j, this);
                return mVar.e(j$.com.android.tools.r8.a.Y(j, l(mVar)), b.WEEKS);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.q
            public final u j() {
                return a.YEAR.b;
            }

            @Override // j$.time.temporal.q
            public final boolean p(n nVar) {
                if (!nVar.f(a.EPOCH_DAY)) {
                    return false;
                }
                h hVar5 = j.a;
                return j$.com.android.tools.r8.a.K(nVar).equals(j$.time.chrono.t.c);
            }

            @Override // j$.time.temporal.q
            public final long l(n nVar) {
                if (p(nVar)) {
                    return h.L(j$.time.f.N(nVar));
                }
                throw new t("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.q
            public final u w(n nVar) {
                if (!p(nVar)) {
                    throw new t("Unsupported field: WeekBasedYear");
                }
                return j();
            }

            @Override // j$.time.temporal.q
            public final m q(m mVar, long j) {
                if (!p(mVar)) {
                    throw new t("Unsupported field: WeekBasedYear");
                }
                int a2 = a.YEAR.b.a(j, h.WEEK_BASED_YEAR);
                j$.time.f N = j$.time.f.N(mVar);
                int l = N.l(a.DAY_OF_WEEK);
                int J = h.J(N);
                if (J == 53 && h.M(a2) == 52) {
                    J = 52;
                }
                return mVar.p(j$.time.f.T(a2, 1, 4).W(((J - 1) * 7) + (l - r6.l(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = hVar4;
        b = new h[]{hVar, hVar2, hVar3, hVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int M(int i) {
        j$.time.f T = j$.time.f.T(i, 1, 1);
        if (T.P() != j$.time.c.THURSDAY) {
            return (T.P() == j$.time.c.WEDNESDAY && T.R()) ? 53 : 52;
        }
        return 53;
    }

    public static int J(j$.time.f fVar) {
        int ordinal = fVar.P().ordinal();
        int Q = fVar.Q() - 1;
        int i = (3 - ordinal) + Q;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (Q < i3) {
            return (int) u.e(1L, M(L(fVar.c0(SubsamplingScaleImageView.ORIENTATION_180).Y(-1L)))).d;
        }
        int i4 = ((Q - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && fVar.R())) {
            return i4;
        }
        return 1;
    }

    public static int L(j$.time.f fVar) {
        int i = fVar.a;
        int Q = fVar.Q();
        if (Q <= 3) {
            return Q - fVar.P().ordinal() < -2 ? i - 1 : i;
        }
        if (Q >= 363) {
            return ((Q - 363) - (fVar.R() ? 1 : 0)) - fVar.P().ordinal() >= 0 ? i + 1 : i;
        }
        return i;
    }
}
