package ax.j6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class E implements Runnable {
    final /* synthetic */ F c0;
    final /* synthetic */ AbstractC2327j q;

    E(F f, AbstractC2327j abstractC2327j) {
        this.c0 = f;
        this.q = abstractC2327j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2326i interfaceC2326i;
        try {
            interfaceC2326i = this.c0.b;
            AbstractC2327j a = interfaceC2326i.a(this.q.j());
            if (a == null) {
                this.c0.d(new NullPointerException("Continuation returned null"));
                return;
            }
            F f = this.c0;
            Executor executor = C2329l.b;
            a.e(executor, f);
            a.d(executor, this.c0);
            a.a(executor, this.c0);
        } catch (C2325h e) {
            if (e.getCause() instanceof Exception) {
                this.c0.d((Exception) e.getCause());
            } else {
                this.c0.d(e);
            }
        } catch (CancellationException unused) {
            this.c0.c();
        } catch (Exception e2) {
            this.c0.d(e2);
        }
    }
}
