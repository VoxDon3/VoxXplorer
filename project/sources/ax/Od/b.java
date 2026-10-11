package ax.Od;

/* loaded from: classes3.dex */
public class b extends IllegalStateException {
    private Throwable q;

    b(String str, Throwable th) {
        super(str);
        this.q = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.q;
    }
}
