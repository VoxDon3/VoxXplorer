/*
 * Decompiled with CFR 0.152.
 */
package ax.L5;

import android.os.Bundle;
import ax.L5.H;
import com.google.android.gms.common.api.internal.LifecycleCallback;

final class G
implements Runnable {
    final String c0;
    final H d0;
    final LifecycleCallback q;

    G(H h8, LifecycleCallback lifecycleCallback, String string) {
        this.d0 = h8;
        this.q = lifecycleCallback;
        this.c0 = string;
    }

    @Override
    public final void run() {
        H h8 = this.d0;
        if (H.a(h8) > 0) {
            String string;
            LifecycleCallback lifecycleCallback = this.q;
            if (H.b(h8) != null) {
                string = this.c0;
                string = H.b(h8).getBundle(string);
            } else {
                string = null;
            }
            lifecycleCallback.f((Bundle)string);
        }
        if (H.a(this.d0) >= 2) {
            this.q.j();
        }
        if (H.a(this.d0) >= 3) {
            this.q.h();
        }
        if (H.a(this.d0) >= 4) {
            this.q.k();
        }
        if (H.a(this.d0) >= 5) {
            this.q.g();
        }
    }
}

