/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.ui;

import android.animation.ValueAnimator;
import androidx.media3.ui.w;

public final class o
implements ValueAnimator.AnimatorUpdateListener {
    public final w a;

    public /* synthetic */ o(w w8) {
        this.a = w8;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        w.l(this.a, valueAnimator);
    }
}

