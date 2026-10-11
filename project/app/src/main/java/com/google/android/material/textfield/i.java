/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.p;

public final class i
implements ValueAnimator.AnimatorUpdateListener {
    public final p a;

    public /* synthetic */ i(p p8) {
        this.a = p8;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        p.x(this.a, valueAnimator);
    }
}

