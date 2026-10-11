/*
 * Decompiled with CFR 0.152.
 */
package ax.P;

import android.app.Activity;
import ax.P.b;

public final class a
implements Runnable {
    public final Activity q;

    public /* synthetic */ a(Activity activity) {
        this.q = activity;
    }

    @Override
    public final void run() {
        b.n(this.q);
    }
}

