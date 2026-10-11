/*
 * Decompiled with CFR 0.152.
 */
package ax.P6;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;

public final class c
implements ValueAnimator.AnimatorUpdateListener {
    public final SideSheetBehavior a;
    public final ViewGroup.MarginLayoutParams b;
    public final int c;
    public final View d;

    public /* synthetic */ c(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int n8, View view) {
        this.a = sideSheetBehavior;
        this.b = marginLayoutParams;
        this.c = n8;
        this.d = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        SideSheetBehavior.K(this.a, this.b, this.c, this.d, valueAnimator);
    }
}

