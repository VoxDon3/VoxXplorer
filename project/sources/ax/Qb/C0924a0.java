package ax.Qb;

/* renamed from: ax.Qb.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0924a0 extends AbstractC0941j {
    private final Z q;

    public C0924a0(Z z) {
        this.q = z;
    }

    @Override // ax.Qb.AbstractC0943k
    public void f(Throwable th) {
        this.q.d();
    }

    @Override // ax.Fb.l
    public /* bridge */ /* synthetic */ ax.sb.t invoke(Throwable th) {
        f(th);
        return ax.sb.t.a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.q + ']';
    }
}
