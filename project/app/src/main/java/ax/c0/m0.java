/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.animation.ValueAnimator;
import android.view.View;
import ax.c0.n0;
import ax.c0.q0;

public final class m0
implements ValueAnimator.AnimatorUpdateListener {
    public final q0 a;
    public final View b;

    public /* synthetic */ m0(q0 q02, View view) {
        this.a = q02;
        this.b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        n0.a(this.a, this.b, valueAnimator);
    }
}

