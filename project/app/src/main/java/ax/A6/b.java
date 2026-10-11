/*
 * Decompiled with CFR 0.152.
 */
package ax.A6;

import android.view.View;
import ax.A6.c;

public final class b
implements Runnable {
    public final View q;

    public /* synthetic */ b(View view) {
        this.q = view;
    }

    @Override
    public final void run() {
        c.c(this.q);
    }
}

