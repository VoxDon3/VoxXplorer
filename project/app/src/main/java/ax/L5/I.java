/*
 * Decompiled with CFR 0.152.
 */
package ax.L5;

import android.os.Bundle;
import ax.L5.J;
import com.google.android.gms.common.api.internal.LifecycleCallback;

final class I
implements Runnable {
    final String c0;
    final J d0;
    final LifecycleCallback q;

    I(J j8, LifecycleCallback lifecycleCallback, String string) {
        this.d0 = j8;
        this.q = lifecycleCallback;
        this.c0 = string;
    }

    @Override
    public final void run() {
        J j8 = this.d0;
        if (J.K2(j8) > 0) {
            String string;
            LifecycleCallback lifecycleCallback = this.q;
            if (J.L2(j8) != null) {
                string = this.c0;
                string = J.L2(j8).getBundle(string);
            } else {
                string = null;
            }
            lifecycleCallback.f((Bundle)string);
        }
        if (J.K2(this.d0) >= 2) {
            this.q.j();
        }
        if (J.K2(this.d0) >= 3) {
            this.q.h();
        }
        if (J.K2(this.d0) >= 4) {
            this.q.k();
        }
        if (J.K2(this.d0) >= 5) {
            this.q.g();
        }
    }
}

