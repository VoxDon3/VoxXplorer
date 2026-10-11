package ax.j6;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class u implements Runnable {
    final /* synthetic */ v c0;
    final /* synthetic */ AbstractC2327j q;

    u(v vVar, AbstractC2327j abstractC2327j) {
        this.c0 = vVar;
        this.q = abstractC2327j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K k;
        K k2;
        K k3;
        InterfaceC2319b interfaceC2319b;
        try {
            interfaceC2319b = this.c0.b;
            AbstractC2327j abstractC2327j = (AbstractC2327j) interfaceC2319b.a(this.q);
            if (abstractC2327j == null) {
                this.c0.d(new NullPointerException("Continuation returned null"));
                return;
            }
            v vVar = this.c0;
            Executor executor = C2329l.b;
            abstractC2327j.e(executor, vVar);
            abstractC2327j.d(executor, this.c0);
            abstractC2327j.a(executor, this.c0);
        } catch (C2325h e) {
            if (e.getCause() instanceof Exception) {
                k3 = this.c0.c;
                k3.p((Exception) e.getCause());
            } else {
                k2 = this.c0.c;
                k2.p(e);
            }
        } catch (Exception e2) {
            k = this.c0.c;
            k.p(e2);
        }
    }
}
