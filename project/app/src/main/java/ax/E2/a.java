/*
 * Decompiled with CFR 0.152.
 */
package ax.E2;

import androidx.work.impl.background.systemalarm.d;

public final class a
implements Runnable {
    public final d q;

    public /* synthetic */ a(d d8) {
        this.q = d8;
    }

    @Override
    public final void run() {
        d.c(this.q);
    }
}

