package ax.vd;

/* renamed from: ax.vd.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3308e extends Exception {
    private Throwable q;

    public C3308e(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.q;
    }
}
