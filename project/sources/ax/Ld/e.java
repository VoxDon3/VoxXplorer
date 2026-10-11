package ax.Ld;

/* loaded from: classes3.dex */
public class e extends Exception {
    private Throwable q;

    public e(String str, Throwable th) {
        super(str);
        this.q = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.q;
    }
}
