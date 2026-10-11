/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.view.View;
import ax.c0.P;

public final class O
implements Runnable {
    public final View q;

    public /* synthetic */ O(View view) {
        this.q = view;
    }

    @Override
    public final void run() {
        P.a.c(this.q);
    }
}

