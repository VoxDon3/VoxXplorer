/*
 * Decompiled with CFR 0.152.
 */
package ax.m6;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import ax.O6.h;
import com.google.android.material.appbar.AppBarLayout;

public final class a
implements ValueAnimator.AnimatorUpdateListener {
    public final AppBarLayout a;
    public final ColorStateList b;
    public final h c;
    public final Integer d;

    public /* synthetic */ a(AppBarLayout appBarLayout, ColorStateList colorStateList, h h8, Integer n8) {
        this.a = appBarLayout;
        this.b = colorStateList;
        this.c = h8;
        this.d = n8;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AppBarLayout.b(this.a, this.b, this.c, this.d, valueAnimator);
    }
}

