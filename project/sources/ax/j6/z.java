package ax.j6;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class z implements G {
    private final Executor a;
    private final Object b = new Object();
    private InterfaceC2322e c;

    public z(Executor executor, InterfaceC2322e interfaceC2322e) {
        this.a = executor;
        this.c = interfaceC2322e;
    }

    @Override // ax.j6.G
    public final void b(AbstractC2327j abstractC2327j) {
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new y(this, abstractC2327j));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
