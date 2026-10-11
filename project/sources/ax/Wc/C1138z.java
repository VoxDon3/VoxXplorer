package ax.Wc;

/* renamed from: ax.Wc.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1138z extends IllegalStateException {
    private Throwable q;

    public C1138z(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.q;
    }

    public C1138z(String str, Throwable th) {
        super(str);
        this.q = th;
    }
}
