/*
 * Decompiled with CFR 0.152.
 */
package ax.x6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import ax.x6.c;

public final class a {
    public static Animator a(c c8, float f8, float f9, float f10) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofObject((Object)c8, c.c.a, c.b.b, (Object[])new c.e[]{new c.e(f8, f9, f10)});
        c.e e8 = c8.getRevealInfo();
        if (e8 != null) {
            float f11 = e8.c;
            e8 = ViewAnimationUtils.createCircularReveal((View)((View)c8), (int)((int)f8), (int)((int)f9), (float)f11, (float)f10);
            c8 = new AnimatorSet();
            c8.playTogether(new Animator[]{objectAnimator, e8});
            return c8;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    public static Animator.AnimatorListener b(c c8) {
        return new AnimatorListenerAdapter(c8){
            final c a;
            {
                this.a = c8;
            }

            public void onAnimationEnd(Animator animator) {
                this.a.b();
            }

            public void onAnimationStart(Animator animator) {
                this.a.a();
            }
        };
    }
}

