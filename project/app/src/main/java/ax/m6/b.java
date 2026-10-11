/*
 * Decompiled with CFR 0.152.
 */
package ax.m6;

import android.animation.ValueAnimator;
import ax.O6.h;
import com.google.android.material.appbar.AppBarLayout;

public final class b
implements ValueAnimator.AnimatorUpdateListener {
    public final AppBarLayout a;
    public final h b;

    public /* synthetic */ b(AppBarLayout appBarLayout, h h8) {
        this.a = appBarLayout;
        this.b = h8;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AppBarLayout.a(this.a, this.b, valueAnimator);
    }
}

