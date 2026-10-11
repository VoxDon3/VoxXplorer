package ax.yb;

/* renamed from: ax.yb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3522c implements ax.wb.e<Object> {
    public static final C3522c q = new C3522c();

    private C3522c() {
    }

    @Override // ax.wb.e
    public ax.wb.i b() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // ax.wb.e
    public void f(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
