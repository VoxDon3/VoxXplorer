package ax.Qb;

/* renamed from: ax.Qb.p0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0954p0 extends AbstractC0941j {
    private final ax.Fb.l<Throwable, ax.sb.t> q;

    /* JADX WARN: Multi-variable type inference failed */
    public C0954p0(ax.Fb.l<? super Throwable, ax.sb.t> lVar) {
        this.q = lVar;
    }

    @Override // ax.Qb.AbstractC0943k
    public void f(Throwable th) {
        this.q.invoke(th);
    }

    @Override // ax.Fb.l
    public /* bridge */ /* synthetic */ ax.sb.t invoke(Throwable th) {
        f(th);
        return ax.sb.t.a;
    }

    public String toString() {
        return "InvokeOnCancel[" + N.a(this.q) + '@' + N.b(this) + ']';
    }
}
