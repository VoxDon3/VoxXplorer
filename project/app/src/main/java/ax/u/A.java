/*
 * Decompiled with CFR 0.152.
 */
package ax.u;

import android.window.OnBackInvokedCallback;

public final class A
implements OnBackInvokedCallback {
    public final Runnable a;

    public /* synthetic */ A(Runnable runnable2) {
        this.a = runnable2;
    }

    public final void onBackInvoked() {
        this.a.run();
    }
}

