package j$.time.temporal;

/* loaded from: classes2.dex */
public enum k implements q {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient u b;
    public final transient long c;

    @Override // j$.time.temporal.q
    public final boolean B() {
        return true;
    }

    static {
        b bVar = b.NANOS;
    }

    k(String str, long j) {
        this.a = str;
        this.b = u.e((-365243219162L) + j, 365241780471L + j);
        this.c = j;
    }

    @Override // j$.time.temporal.q
    public final u j() {
        return this.b;
    }

    @Override // j$.time.temporal.q
    public final boolean p(n nVar) {
        return nVar.f(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.q
    public final u w(n nVar) {
        if (nVar.f(a.EPOCH_DAY)) {
            return this.b;
        }
        throw new j$.time.a("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.q
    public final long l(n nVar) {
        return nVar.w(a.EPOCH_DAY) + this.c;
    }

    @Override // j$.time.temporal.q
    public final m q(m mVar, long j) {
        if (!this.b.d(j)) {
            throw new j$.time.a("Invalid value: " + this.a + " " + j);
        }
        return mVar.d(j$.com.android.tools.r8.a.Y(j, this.c), a.EPOCH_DAY);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
