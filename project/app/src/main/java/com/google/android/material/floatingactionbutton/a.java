/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.floatingactionbutton;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.google.android.material.floatingactionbutton.b;

public final class a
implements ValueAnimator.AnimatorUpdateListener {
    public final b a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final Matrix i;

    public /* synthetic */ a(b b8, float f8, float f9, float f10, float f11, float f12, float f13, float f14, Matrix matrix) {
        this.a = b8;
        this.b = f8;
        this.c = f9;
        this.d = f10;
        this.e = f11;
        this.f = f12;
        this.g = f13;
        this.h = f14;
        this.i = matrix;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        com.google.android.material.floatingactionbutton.b.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, valueAnimator);
    }
}

