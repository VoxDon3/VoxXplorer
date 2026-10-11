/*
 * Decompiled with CFR 0.152.
 */
package ax.I6;

import android.animation.ValueAnimator;
import com.google.android.material.progressindicator.g;

public final class b
implements ValueAnimator.AnimatorUpdateListener {
    public final g a;
    public final com.google.android.material.progressindicator.b b;

    public /* synthetic */ b(g g8, com.google.android.material.progressindicator.b b8) {
        this.a = g8;
        this.b = b8;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        g.v(this.a, this.b, valueAnimator);
    }
}

