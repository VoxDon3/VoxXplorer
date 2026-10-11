package ax.j6;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class B implements G {
    private final Executor a;
    private final Object b = new Object();
    private InterfaceC2323f c;

    public B(Executor executor, InterfaceC2323f interfaceC2323f) {
        this.a = executor;
        this.c = interfaceC2323f;
    }

    @Override // ax.j6.G
    public final void b(AbstractC2327j abstractC2327j) {
        if (abstractC2327j.m() || abstractC2327j.k()) {
            return;
        }
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new RunnableC2317A(this, abstractC2327j));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
