/*
 * Decompiled with CFR 0.152.
 */
package ax.a2;

import android.animation.ValueAnimator;
import androidx.media3.ui.b;

public final class e
implements ValueAnimator.AnimatorUpdateListener {
    public final b a;

    public /* synthetic */ e(b b8) {
        this.a = b8;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        b.c(this.a, valueAnimator);
    }
}

