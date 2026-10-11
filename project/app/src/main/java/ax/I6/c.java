/*
 * Decompiled with CFR 0.152.
 */
package ax.I6;

import android.animation.ValueAnimator;
import com.google.android.material.progressindicator.g;

public final class c
implements ValueAnimator.AnimatorUpdateListener {
    public final g a;

    public /* synthetic */ c(g g8) {
        this.a = g8;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        g.w(this.a, valueAnimator);
    }
}

