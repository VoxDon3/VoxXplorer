/*
 * Decompiled with CFR 0.152.
 */
package ax.j6;

import ax.j6.G;
import ax.j6.j;
import java.util.ArrayDeque;
import java.util.Queue;

final class H {
    private final Object a = new Object();
    private Queue b;
    private boolean c;

    H() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(G g8) {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        ArrayDeque arrayDeque;
                        if (this.b != null) break block3;
                        this.b = arrayDeque = new ArrayDeque();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.b.add(g8);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void b(j j8) {
        Object object = this.a;
        // MONITORENTER : object
        if (this.b == null || this.c) {
            // MONITOREXIT : object
            return;
        }
        this.c = true;
        // MONITOREXIT : object
        while (true) {
            object = this.a;
            // MONITORENTER : object
            G g8 = (G)this.b.poll();
            if (g8 == null) {
                this.c = false;
                // MONITOREXIT : object
                return;
            }
            g8.b(j8);
        }
    }
}

