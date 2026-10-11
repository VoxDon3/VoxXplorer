package ax.L2;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class E {
    private static final String e = ax.B2.i.i("WorkTimer");
    final ax.B2.p a;
    final Map<ax.K2.m, b> b = new HashMap();
    final Map<ax.K2.m, a> c = new HashMap();
    final Object d = new Object();

    public interface a {
        void a(ax.K2.m mVar);
    }

    public static class b implements Runnable {
        private final ax.K2.m c0;
        private final E q;

        b(E e, ax.K2.m mVar) {
            this.q = e;
            this.c0 = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.q.d) {
                try {
                    if (this.q.b.remove(this.c0) != null) {
                        a remove = this.q.c.remove(this.c0);
                        if (remove != null) {
                            remove.a(this.c0);
                        }
                    } else {
                        ax.B2.i.e().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.c0));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public E(ax.B2.p pVar) {
        this.a = pVar;
    }

    public void a(ax.K2.m mVar, long j, a aVar) {
        synchronized (this.d) {
            ax.B2.i.e().a(e, "Starting timer for " + mVar);
            b(mVar);
            b bVar = new b(this, mVar);
            this.b.put(mVar, bVar);
            this.c.put(mVar, aVar);
            this.a.a(j, bVar);
        }
    }

    public void b(ax.K2.m mVar) {
        synchronized (this.d) {
            try {
                if (this.b.remove(mVar) != null) {
                    ax.B2.i.e().a(e, "Stopping timer for " + mVar);
                    this.c.remove(mVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
