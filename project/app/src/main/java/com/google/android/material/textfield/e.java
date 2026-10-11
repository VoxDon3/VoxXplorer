/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.f;

public final class e
implements ValueAnimator.AnimatorUpdateListener {
    public final f a;

    public /* synthetic */ e(f f8) {
        this.a = f8;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        f.y(this.a, valueAnimator);
    }
}

