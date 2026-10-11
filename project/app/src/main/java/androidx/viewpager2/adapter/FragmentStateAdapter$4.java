/*
 * Decompiled with CFR 0.152.
 */
package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import ax.G0.h;

class FragmentStateAdapter$4
implements f {
    final Runnable c0;
    final Handler q;

    @Override
    public void b(h h8, d.a a8) {
        if (a8 == d.a.ON_DESTROY) {
            this.q.removeCallbacks(this.c0);
            h8.getLifecycle().c(this);
        }
    }
}

