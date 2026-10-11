/*
 * Decompiled with CFR 0.152.
 */
package ax.H6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import ax.H6.a;
import ax.i.b;
import ax.k6.e;

public class h
extends a<View> {
    private final float g;
    private final float h;
    private final float i;

    public h(View view) {
        super(view);
        view = view.getResources();
        this.g = view.getDimension(ax.k6.e.m);
        this.h = view.getDimension(ax.k6.e.l);
        this.i = view.getDimension(ax.k6.e.n);
    }

    private boolean g(int n8, int n9) {
        return (Gravity.getAbsoluteGravity((int)n8, (int)this.b.getLayoutDirection()) & n9) == n9;
    }

    private int i(boolean bl) {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            layoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
            if (bl) {
                return layoutParams.leftMargin;
            }
            return layoutParams.rightMargin;
        }
        return 0;
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.b, (Property)View.SCALE_X, (float[])new float[]{1.0f}), ObjectAnimator.ofFloat(this.b, (Property)View.SCALE_Y, (float[])new float[]{1.0f})});
        Object object = this.b;
        if (object instanceof ViewGroup) {
            object = (ViewGroup)object;
            for (int i8 = 0; i8 < object.getChildCount(); ++i8) {
                animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat((Object)object.getChildAt(i8), (Property)View.SCALE_Y, (float[])new float[]{1.0f})});
            }
        }
        animatorSet.setDuration((long)this.e);
        animatorSet.start();
    }

    public void h(b b8, int n8, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean bl = b8.b() == 0;
        boolean bl2 = this.g(n8, 3);
        float f8 = (float)this.b.getWidth() * this.b.getScaleX() + (float)this.i(bl2);
        Object v8 = this.b;
        Property property = View.TRANSLATION_X;
        float f9 = f8;
        if (bl2) {
            f9 = -f8;
        }
        property = ObjectAnimator.ofFloat(v8, (Property)property, (float[])new float[]{f9});
        if (animatorUpdateListener != null) {
            property.addUpdateListener(animatorUpdateListener);
        }
        property.setInterpolator((TimeInterpolator)new ax.D0.b());
        property.setDuration((long)ax.l6.a.c(this.c, this.d, b8.a()));
        property.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this, bl, n8){
            final boolean a;
            final int b;
            final h c;
            {
                this.c = h8;
                this.a = bl;
                this.b = n8;
            }

            public void onAnimationEnd(Animator animator) {
                this.c.b.setTranslationX(0.0f);
                this.c.k(0.0f, this.a, this.b);
            }
        });
        if (animatorListener != null) {
            property.addListener(animatorListener);
        }
        property.start();
    }

    public void j(b b8) {
        super.d(b8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void k(float f8, boolean bl, int n8) {
        float f9 = this.a(f8);
        boolean bl2 = this.g(n8, 3);
        int n9 = 0;
        n8 = bl == bl2 ? 1 : 0;
        int n10 = this.b.getWidth();
        int n11 = this.b.getHeight();
        f8 = n10;
        if (f8 <= 0.0f) return;
        float f10 = n11;
        if (f10 <= 0.0f) {
            return;
        }
        float f11 = this.g / f8;
        float f12 = this.h / f8;
        float f13 = this.i / f10;
        Object v8 = this.b;
        if (bl2) {
            f8 = 0.0f;
        }
        v8.setPivotX(f8);
        f8 = n8 != 0 ? f12 : -f11;
        f10 = ax.l6.a.a(0.0f, f8, f9);
        f11 = f10 + 1.0f;
        f9 = 1.0f - ax.l6.a.a(0.0f, f13, f9);
        if (Float.isNaN(f11)) return;
        if (Float.isNaN(f9)) {
            return;
        }
        this.b.setScaleX(f11);
        this.b.setScaleY(f9);
        Object v9 = this.b;
        if (!(v9 instanceof ViewGroup)) return;
        ViewGroup viewGroup = (ViewGroup)v9;
        while (n9 < viewGroup.getChildCount()) {
            View view = viewGroup.getChildAt(n9);
            n11 = bl2 ? n10 - view.getRight() + view.getWidth() : -view.getLeft();
            f8 = n11;
            view.setPivotX(f8);
            view.setPivotY((float)(-view.getTop()));
            f8 = n8 != 0 ? 1.0f - f10 : 1.0f;
            f12 = f9 != 0.0f ? f11 / f9 * f8 : 1.0f;
            if (!Float.isNaN(f8) && !Float.isNaN(f12)) {
                view.setScaleX(f8);
                view.setScaleY(f12);
            }
            ++n9;
        }
    }

    public void l(b b8, int n8) {
        if (super.e(b8) == null) {
            return;
        }
        boolean bl = b8.b() == 0;
        this.k(b8.a(), bl, n8);
    }
}

