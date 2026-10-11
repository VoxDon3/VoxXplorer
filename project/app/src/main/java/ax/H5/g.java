/*
 * Decompiled with CFR 0.152.
 */
package ax.H5;

import android.content.Context;
import ax.K0.a;
import ax.L5.k;
import java.util.Set;
import java.util.concurrent.Semaphore;

public final class g
extends a
implements k {
    private final Semaphore o = new Semaphore(0);
    private final Set p;

    public g(Context context, Set set) {
        super(context);
        this.p = set;
    }

    @Override
    protected final void t() {
        this.o.drainPermits();
        this.a();
    }
}

