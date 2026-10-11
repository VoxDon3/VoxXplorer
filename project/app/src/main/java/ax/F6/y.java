/*
 * Decompiled with CFR 0.152.
 */
package ax.F6;

import android.view.View;
import ax.F6.z;

public final class y
implements Runnable {
    public final boolean c0;
    public final View q;

    public /* synthetic */ y(View view, boolean bl) {
        this.q = view;
        this.c0 = bl;
    }

    @Override
    public final void run() {
        z.a(this.q, this.c0);
    }
}

