/*
 * Decompiled with CFR 0.152.
 */
package ax.Y;

import android.os.CancellationSignal;

@Deprecated
public final class d {
    private boolean a;
    private a b;
    private Object c;
    private boolean d;

    private void d() {
        while (this.d) {
            try {
                this.wait();
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void a() {
        block15: {
            Throwable throwable22;
            block14: {
                // MONITORENTER : this
                if (this.a) {
                    // MONITOREXIT : this
                    return;
                }
                this.a = true;
                this.d = true;
                a a8 = this.b;
                Object object = this.c;
                // MONITOREXIT : this
                if (a8 != null) {
                    try {
                        a8.a();
                    }
                    catch (Throwable throwable22) {
                        break block14;
                    }
                }
                if (object != null) {
                    ((CancellationSignal)object).cancel();
                }
                break block15;
            }
            // MONITORENTER : this
            this.d = false;
            this.notifyAll();
            // MONITOREXIT : this
            throw throwable22;
        }
        // MONITORENTER : this
        this.d = false;
        this.notifyAll();
        // MONITOREXIT : this
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object b() {
        synchronized (this) {
            try {
                if (this.c != null) return this.c;
                Object object = new CancellationSignal();
                this.c = object;
                if (!this.a) return this.c;
                object.cancel();
                return this.c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c(a a8) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                try {
                    this.d();
                    if (this.b == a8) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                this.b = a8;
                if (this.a && a8 != null) {
                    // MONITOREXIT @DISABLED, blocks:[2, 4] lbl12 : MonitorExitStatement: MONITOREXIT : this
                    a8.a();
                    return;
                }
                return;
            }
            throw throwable2;
        }
    }

    public static interface a {
        public void a();
    }
}

