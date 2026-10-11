package ax.j6;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class x implements G {
    private final Executor a;
    private final Object b = new Object();
    private InterfaceC2321d c;

    public x(Executor executor, InterfaceC2321d interfaceC2321d) {
        this.a = executor;
        this.c = interfaceC2321d;
    }

    @Override // ax.j6.G
    public final void b(AbstractC2327j abstractC2327j) {
        if (abstractC2327j.k()) {
            synchronized (this.b) {
                try {
                    if (this.c == null) {
                        return;
                    }
                    this.a.execute(new w(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
