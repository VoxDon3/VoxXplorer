package ax.p9;

/* renamed from: ax.p9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2784b extends Exception {
    private final long q;

    public C2784b(long j, String str) {
        super(str);
        this.q = j;
    }

    public ax.K8.a a() {
        return ax.K8.a.l(this.q);
    }

    public long b() {
        return this.q;
    }

    public C2784b(Throwable th) {
        super(th);
        this.q = ax.K8.a.STATUS_OTHER.getValue();
    }
}
