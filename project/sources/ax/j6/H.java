package ax.j6;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes3.dex */
final class H {
    private final Object a = new Object();
    private Queue b;
    private boolean c;

    H() {
    }

    public final void a(G g) {
        synchronized (this.a) {
            try {
                if (this.b == null) {
                    this.b = new ArrayDeque();
                }
                this.b.add(g);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(AbstractC2327j abstractC2327j) {
        G g;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        try {
                            g = (G) this.b.poll();
                            if (g == null) {
                                this.c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    g.b(abstractC2327j);
                }
            }
        }
    }
}
