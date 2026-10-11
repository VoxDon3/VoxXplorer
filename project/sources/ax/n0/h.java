package ax.n0;

/* loaded from: classes.dex */
final class h<T> extends n<T> {
    private final Throwable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Throwable th) {
        super(null);
        ax.Gb.l.f(th, "finalException");
        this.a = th;
    }

    public final Throwable a() {
        return this.a;
    }
}
