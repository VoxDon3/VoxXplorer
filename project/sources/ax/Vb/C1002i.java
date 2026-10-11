package ax.Vb;

/* renamed from: ax.Vb.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1002i extends RuntimeException {
    private final transient ax.wb.i q;

    public C1002i(ax.wb.i iVar) {
        this.q = iVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.q.toString();
    }
}
