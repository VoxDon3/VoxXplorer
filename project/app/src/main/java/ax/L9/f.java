/*
 * Decompiled with CFR 0.152.
 */
package ax.L9;

public class f {
    private final Object a = new Object();
    private boolean b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a() {
        Object object = this.a;
        synchronized (object) {
            this.b = true;
            this.a.notifyAll();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b() {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                try {
                    if (this.b) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                try {
                    this.a.wait();
                    return;
                }
                catch (InterruptedException interruptedException) {
                    RuntimeException runtimeException = new RuntimeException(interruptedException);
                    throw runtimeException;
                }
            }
            throw throwable2;
        }
    }
}

