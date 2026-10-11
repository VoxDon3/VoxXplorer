package ax.a6;

/* loaded from: classes3.dex */
public final class w0 implements y0 {
    private B0 a;

    public static void b(B0 b0, B0 b02) {
        w0 w0Var = (w0) b0;
        if (w0Var.a != null) {
            throw new IllegalStateException();
        }
        w0Var.a = b02;
    }

    @Override // ax.a6.C0
    public final Object a() {
        B0 b0 = this.a;
        if (b0 != null) {
            return b0.a();
        }
        throw new IllegalStateException();
    }
}
