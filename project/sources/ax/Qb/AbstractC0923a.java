package ax.Qb;

/* renamed from: ax.Qb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0923a<T> extends z0 implements InterfaceC0959s0, ax.wb.e<T>, J {
    private final ax.wb.i d0;

    public AbstractC0923a(ax.wb.i iVar, boolean z, boolean z2) {
        super(z2);
        if (z) {
            Z((InterfaceC0959s0) iVar.a(InterfaceC0959s0.c));
        }
        this.d0 = iVar.p(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.Qb.z0
    public String G() {
        return N.a(this) + " was cancelled";
    }

    protected void I0(Object obj) {
        w(obj);
    }

    public final <R> void N0(L l, R r, ax.Fb.p<? super R, ? super ax.wb.e<? super T>, ? extends Object> pVar) {
        l.h(pVar, r, this);
    }

    @Override // ax.Qb.z0
    public final void Y(Throwable th) {
        I.a(this.d0, th);
    }

    @Override // ax.wb.e
    public final ax.wb.i b() {
        return this.d0;
    }

    @Override // ax.Qb.z0, ax.Qb.InterfaceC0959s0
    public boolean e() {
        return super.e();
    }

    @Override // ax.wb.e
    public final void f(Object obj) {
        Object f0 = f0(D.d(obj, null, 1, null));
        if (f0 == A0.b) {
            return;
        }
        I0(f0);
    }

    @Override // ax.Qb.J
    public ax.wb.i h() {
        return this.d0;
    }

    @Override // ax.Qb.z0
    public String h0() {
        String b = F.b(this.d0);
        if (b == null) {
            return super.h0();
        }
        return '\"' + b + "\":" + super.h0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.Qb.z0
    protected final void m0(Object obj) {
        if (!(obj instanceof C0966z)) {
            K0(obj);
        } else {
            C0966z c0966z = (C0966z) obj;
            J0(c0966z.a, c0966z.a());
        }
    }

    protected void K0(T t) {
    }

    protected void J0(Throwable th, boolean z) {
    }
}
