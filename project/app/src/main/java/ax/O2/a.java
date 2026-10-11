/*
 * Decompiled with CFR 0.152.
 */
package ax.O2;

import androidx.work.impl.workers.ConstraintTrackingWorker;

public final class a
implements Runnable {
    public final ConstraintTrackingWorker q;

    public /* synthetic */ a(ConstraintTrackingWorker constraintTrackingWorker) {
        this.q = constraintTrackingWorker;
    }

    @Override
    public final void run() {
        ConstraintTrackingWorker.o(this.q);
    }
}

