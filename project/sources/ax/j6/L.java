package ax.j6;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class L implements Runnable {
    final /* synthetic */ Callable c0;
    final /* synthetic */ K q;

    L(K k, Callable callable) {
        this.q = k;
        this.c0 = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.q.q(this.c0.call());
        } catch (Exception e) {
            this.q.p(e);
        } catch (Throwable th) {
            this.q.p(new RuntimeException(th));
        }
    }
}
