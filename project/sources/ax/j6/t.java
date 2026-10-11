package ax.j6;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class t implements G {
    private final Executor a;
    private final InterfaceC2319b b;
    private final K c;

    public t(Executor executor, InterfaceC2319b interfaceC2319b, K k) {
        this.a = executor;
        this.b = interfaceC2319b;
        this.c = k;
    }

    @Override // ax.j6.G
    public final void b(AbstractC2327j abstractC2327j) {
        this.a.execute(new s(this, abstractC2327j));
    }
}
