package ax.Q8;

/* loaded from: classes3.dex */
public class F extends ax.k9.d {
    private final m c0;
    private long d0;

    public F(long j, m mVar, String str, Throwable th) {
        super(str, th);
        this.d0 = j;
        this.c0 = mVar;
    }

    public ax.K8.a a() {
        return ax.K8.a.l(this.d0);
    }

    public long b() {
        return this.d0;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return String.format("%s (0x%08x): %s", a().name(), Long.valueOf(this.d0), super.getMessage());
    }

    public F(t tVar, String str) {
        super(str);
        this.d0 = tVar.m();
        this.c0 = tVar.h();
    }
}
