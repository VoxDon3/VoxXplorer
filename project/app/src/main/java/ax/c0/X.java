/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.view.WindowInsetsController;
import ax.c0.P;
import java.util.concurrent.atomic.AtomicBoolean;

public final class X
implements WindowInsetsController.OnControllableInsetsChangedListener {
    public final AtomicBoolean a;

    public /* synthetic */ X(AtomicBoolean atomicBoolean) {
        this.a = atomicBoolean;
    }

    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int n8) {
        P.b.d(this.a, windowInsetsController, n8);
    }
}

