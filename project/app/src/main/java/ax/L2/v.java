/*
 * Decompiled with CFR 0.152.
 */
package ax.L2;

import androidx.work.WorkerParameters;
import ax.C2.D;

public class v
implements Runnable {
    private ax.C2.v c0;
    private WorkerParameters.a d0;
    private D q;

    public v(D d8, ax.C2.v v8, WorkerParameters.a a8) {
        this.q = d8;
        this.c0 = v8;
        this.d0 = a8;
    }

    @Override
    public void run() {
        this.q.l().o(this.c0, this.d0);
    }
}

