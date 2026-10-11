/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import android.content.Context;
import ax.S0.z;

public final class E
implements Runnable {
    public final Context c0;
    public final z.e q;

    public /* synthetic */ E(z.e e8, Context context) {
        this.q = e8;
        this.c0 = context;
    }

    @Override
    public final void run() {
        z.e.a(this.q, this.c0);
    }
}

