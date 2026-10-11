/*
 * Decompiled with CFR 0.152.
 */
package ax.O2;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import ax.v7.e;

public final class b
implements Runnable {
    public final e c0;
    public final ConstraintTrackingWorker q;

    public /* synthetic */ b(ConstraintTrackingWorker constraintTrackingWorker, e e8) {
        this.q = constraintTrackingWorker;
        this.c0 = e8;
    }

    @Override
    public final void run() {
        ConstraintTrackingWorker.p(this.q, this.c0);
    }
}

