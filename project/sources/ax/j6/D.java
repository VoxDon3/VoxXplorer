package ax.j6;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class D implements G {
    private final Executor a;
    private final Object b = new Object();
    private InterfaceC2324g c;

    public D(Executor executor, InterfaceC2324g interfaceC2324g) {
        this.a = executor;
        this.c = interfaceC2324g;
    }

    @Override // ax.j6.G
    public final void b(AbstractC2327j abstractC2327j) {
        if (abstractC2327j.m()) {
            synchronized (this.b) {
                try {
                    if (this.c == null) {
                        return;
                    }
                    this.a.execute(new C(this, abstractC2327j));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
