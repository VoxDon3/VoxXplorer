package ax.Qb;

/* renamed from: ax.Qb.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0958s extends u0 implements r {
    public final InterfaceC0960t f0;

    public C0958s(InterfaceC0960t interfaceC0960t) {
        this.f0 = interfaceC0960t;
    }

    @Override // ax.Qb.r
    public InterfaceC0959s0 getParent() {
        return y();
    }

    @Override // ax.Qb.r
    public boolean h(Throwable th) {
        return y().I(th);
    }

    @Override // ax.Fb.l
    public /* bridge */ /* synthetic */ ax.sb.t invoke(Throwable th) {
        x(th);
        return ax.sb.t.a;
    }

    @Override // ax.Qb.B
    public void x(Throwable th) {
        this.f0.F0(y());
    }
}
