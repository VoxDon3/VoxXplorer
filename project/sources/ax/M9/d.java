package ax.M9;

/* loaded from: classes3.dex */
public class d extends RuntimeException {
    private final e q;

    public d(String str, Throwable th, e eVar) {
        super(str, th);
        this.q = eVar;
    }

    public boolean a(e eVar) {
        return this.q == eVar;
    }
}
