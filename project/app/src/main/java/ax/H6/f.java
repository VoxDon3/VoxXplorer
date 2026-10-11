/*
 * Decompiled with CFR 0.152.
 */
package ax.H6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import ax.H6.a;
import ax.i.b;
import ax.k6.e;

public class f
extends a<View> {
    private final float g;
    private final float h;

    public f(View view) {
        super(view);
        view = view.getResources();
        this.g = view.getDimension(ax.k6.e.j);
        this.h = view.getDimension(ax.k6.e.k);
    }

    private Animator g() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.b, (Property)View.SCALE_X, (float[])new float[]{1.0f}), ObjectAnimator.ofFloat(this.b, (Property)View.SCALE_Y, (float[])new float[]{1.0f})});
        Object object = this.b;
        if (object instanceof ViewGroup) {
            object = (ViewGroup)object;
            for (int i8 = 0; i8 < object.getChildCount(); ++i8) {
                animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat((Object)object.getChildAt(i8), (Property)View.SCALE_Y, (float[])new float[]{1.0f})});
            }
        }
        animatorSet.setInterpolator((TimeInterpolator)new ax.D0.b());
        return animatorSet;
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        Animator animator = this.g();
        animator.setDuration((long)this.e);
        animator.start();
    }

    public void h(b b8, Animator.AnimatorListener animatorListener) {
        float f8 = this.b.getHeight();
        float f9 = this.b.getScaleY();
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(this.b, (Property)View.TRANSLATION_Y, (float[])new float[]{f8 * f9});
        objectAnimator.setInterpolator((TimeInterpolator)new ax.D0.b());
        objectAnimator.setDuration((long)ax.l6.a.c(this.c, this.d, b8.a()));
        objectAnimator.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
            final f a;
            {
                this.a = f8;
            }

            public void onAnimationEnd(Animator animator) {
                this.a.b.setTranslationY(0.0f);
                this.a.k(0.0f);
            }
        });
        if (animatorListener != null) {
            objectAnimator.addListener(animatorListener);
        }
        objectAnimator.start();
    }

    public void i(b b8, Animator.AnimatorListener animatorListener) {
        Animator animator = this.g();
        animator.setDuration((long)ax.l6.a.c(this.c, this.d, b8.a()));
        if (animatorListener != null) {
            animator.addListener(animatorListener);
        }
        animator.start();
    }

    public void j(b b8) {
        super.d(b8);
    }

    public void k(float f8) {
        float f9 = this.a(f8);
        float f10 = this.b.getWidth();
        f8 = this.b.getHeight();
        if (!(f10 <= 0.0f) && !(f8 <= 0.0f)) {
            f10 = this.g / f10;
            float f11 = this.h / f8;
            f10 = ax.l6.a.a(0.0f, f10, f9);
            f11 = ax.l6.a.a(0.0f, f11, f9);
            f9 = 1.0f - f10;
            f10 = 1.0f - f11;
            if (!Float.isNaN(f9) && !Float.isNaN(f10)) {
                this.b.setScaleX(f9);
                this.b.setPivotY(f8);
                this.b.setScaleY(f10);
                Object object = this.b;
                if (object instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup)object;
                    for (int i8 = 0; i8 < viewGroup.getChildCount(); ++i8) {
                        object = viewGroup.getChildAt(i8);
                        object.setPivotY((float)(-object.getTop()));
                        f8 = f10 != 0.0f ? f9 / f10 : 1.0f;
                        object.setScaleY(f8);
                    }
                }
            }
        }
    }

    public void l(b b8) {
        if (super.e(b8) == null) {
            return;
        }
        this.k(b8.a());
    }
}

