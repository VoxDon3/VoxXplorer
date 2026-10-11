package ax.j6;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class F<TResult, TContinuationResult> implements InterfaceC2324g<TContinuationResult>, InterfaceC2323f, InterfaceC2321d, G {
    private final Executor a;
    private final InterfaceC2326i b;
    private final K c;

    public F(Executor executor, InterfaceC2326i interfaceC2326i, K k) {
        this.a = executor;
        this.b = interfaceC2326i;
        this.c = k;
    }

    @Override // ax.j6.InterfaceC2324g
    public final void a(TContinuationResult tcontinuationresult) {
        this.c.q(tcontinuationresult);
    }

    @Override // ax.j6.G
    public final void b(AbstractC2327j abstractC2327j) {
        this.a.execute(new E(this, abstractC2327j));
    }

    @Override // ax.j6.InterfaceC2321d
    public final void c() {
        this.c.r();
    }

    @Override // ax.j6.InterfaceC2323f
    public final void d(Exception exc) {
        this.c.p(exc);
    }
}
