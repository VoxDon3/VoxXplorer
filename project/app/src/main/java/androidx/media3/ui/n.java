/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.ui;

import android.animation.ValueAnimator;
import androidx.media3.ui.w;

public final class n
implements ValueAnimator.AnimatorUpdateListener {
    public final w a;

    public /* synthetic */ n(w w8) {
        this.a = w8;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        w.a(this.a, valueAnimator);
    }
}

