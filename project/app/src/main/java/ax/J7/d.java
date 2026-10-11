/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import android.os.Process;

public abstract class d
implements Runnable {
    protected abstract void a();

    @Override
    public final void run() {
        Process.setThreadPriority((int)10);
        this.a();
    }
}

