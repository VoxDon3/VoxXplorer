/*
 * Decompiled with CFR 0.152.
 */
package ax.u0;

import android.animation.ValueAnimator;
import ax.u0.c;

public final class f
implements ValueAnimator.DurationScaleChangeListener {
    public final c.d a;

    public /* synthetic */ f(c.d d8) {
        this.a = d8;
    }

    public final void onChanged(float f8) {
        c.d.c(this.a, f8);
    }
}

