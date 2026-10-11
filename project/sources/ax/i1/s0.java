package ax.i1;

import ax.P0.C0915y;
import ax.i1.InterfaceC2209F;

/* loaded from: classes.dex */
public abstract class s0 extends AbstractC2218h<Void> {
    private static final Void l = null;
    protected final InterfaceC2209F k;

    protected s0(InterfaceC2209F interfaceC2209F) {
        this.k = interfaceC2209F;
    }

    @Override // ax.i1.AbstractC2218h, ax.i1.AbstractC2211a
    protected final void A(ax.U0.z zVar) {
        super.A(zVar);
        S();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.i1.AbstractC2218h
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2209F.b E(Void r1, InterfaceC2209F.b bVar) {
        return J(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.i1.AbstractC2218h
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final long F(Void r1, long j, InterfaceC2209F.b bVar) {
        return L(j, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.i1.AbstractC2218h
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final int G(Void r1, int i) {
        return N(i);
    }

    protected abstract void P(ax.P0.N n);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.i1.AbstractC2218h
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final void H(Void r1, InterfaceC2209F interfaceC2209F, ax.P0.N n) {
        P(n);
    }

    protected final void R() {
        I(l, this.k);
    }

    protected void S() {
        R();
    }

    @Override // ax.i1.AbstractC2211a, ax.i1.InterfaceC2209F
    public void a(C0915y c0915y) {
        this.k.a(c0915y);
    }

    @Override // ax.i1.InterfaceC2209F
    public C0915y j() {
        return this.k.j();
    }

    @Override // ax.i1.AbstractC2211a, ax.i1.InterfaceC2209F
    public boolean m() {
        return this.k.m();
    }

    @Override // ax.i1.AbstractC2211a, ax.i1.InterfaceC2209F
    public ax.P0.N o() {
        return this.k.o();
    }

    protected InterfaceC2209F.b J(InterfaceC2209F.b bVar) {
        return bVar;
    }

    protected int N(int i) {
        return i;
    }

    protected long L(long j, InterfaceC2209F.b bVar) {
        return j;
    }
}
