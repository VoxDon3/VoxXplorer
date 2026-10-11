/*
 * Decompiled with CFR 0.152.
 */
package ax.U5;

import android.os.Process;

final class c
extends Thread {
    c(ThreadGroup threadGroup, String string) {
        super(threadGroup, "GmsDynamite");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Process.setThreadPriority((int)19);
        synchronized (this) {
            try {
                try {
                    while (true) {
                        this.wait();
                    }
                }
                catch (InterruptedException interruptedException) {
                    return;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

