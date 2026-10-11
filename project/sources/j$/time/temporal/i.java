package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes2.dex */
public enum i implements s {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");

    public final String a;

    static {
        Duration.ofSeconds(31556952L);
        Duration.ofSeconds(7889238L);
    }

    i(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.s
    public final m j(m mVar, long j) {
        int i = c.a[ordinal()];
        if (i == 1) {
            return mVar.d(j$.com.android.tools.r8.a.X(mVar.l(r0), j), j.c);
        }
        if (i == 2) {
            return mVar.e(j / 4, b.YEARS).e((j % 4) * 3, b.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
