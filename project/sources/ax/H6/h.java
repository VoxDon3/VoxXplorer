package ax.H6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import ax.i.C2186b;
import ax.k6.C2404e;
import ax.l6.C2472a;

/* loaded from: classes3.dex */
public class h extends ax.H6.a<View> {
    private final float g;
    private final float h;
    private final float i;

    class a extends AnimatorListenerAdapter {
        final /* synthetic */ boolean a;
        final /* synthetic */ int b;

        a(boolean z, int i) {
            this.a = z;
            this.b = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h.this.b.setTranslationX(0.0f);
            h.this.k(0.0f, this.a, this.b);
        }
    }

    public h(View view) {
        super(view);
        Resources resources = view.getResources();
        this.g = resources.getDimension(C2404e.m);
        this.h = resources.getDimension(C2404e.l);
        this.i = resources.getDimension(C2404e.n);
    }

    private boolean g(int i, int i2) {
        return (Gravity.getAbsoluteGravity(i, this.b.getLayoutDirection()) & i2) == i2;
    }

    private int i(boolean z) {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.b, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v = this.b;
        if (v instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.e);
        animatorSet.start();
    }

    public void h(C2186b c2186b, int i, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z = c2186b.b() == 0;
        boolean g = g(i, 3);
        float width = (this.b.getWidth() * this.b.getScaleX()) + i(g);
        V v = this.b;
        Property property = View.TRANSLATION_X;
        if (g) {
            width = -width;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v, (Property<V, Float>) property, width);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new ax.D0.b());
        ofFloat.setDuration(C2472a.c(this.c, this.d, c2186b.a()));
        ofFloat.addListener(new a(z, i));
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
    }

    public void j(C2186b c2186b) {
        super.d(c2186b);
    }

    public void k(float f, boolean z, int i) {
        float a2 = a(f);
        boolean g = g(i, 3);
        boolean z2 = z == g;
        int width = this.b.getWidth();
        int height = this.b.getHeight();
        float f2 = width;
        if (f2 > 0.0f) {
            float f3 = height;
            if (f3 <= 0.0f) {
                return;
            }
            float f4 = this.g / f2;
            float f5 = this.h / f2;
            float f6 = this.i / f3;
            V v = this.b;
            if (g) {
                f2 = 0.0f;
            }
            v.setPivotX(f2);
            if (!z2) {
                f5 = -f4;
            }
            float a3 = C2472a.a(0.0f, f5, a2);
            float f7 = a3 + 1.0f;
            float a4 = 1.0f - C2472a.a(0.0f, f6, a2);
            if (Float.isNaN(f7) || Float.isNaN(a4)) {
                return;
            }
            this.b.setScaleX(f7);
            this.b.setScaleY(a4);
            V v2 = this.b;
            if (v2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v2;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    childAt.setPivotX(g ? (width - childAt.getRight()) + childAt.getWidth() : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f8 = z2 ? 1.0f - a3 : 1.0f;
                    float f9 = a4 != 0.0f ? (f7 / a4) * f8 : 1.0f;
                    if (!Float.isNaN(f8) && !Float.isNaN(f9)) {
                        childAt.setScaleX(f8);
                        childAt.setScaleY(f9);
                    }
                }
            }
        }
    }

    public void l(C2186b c2186b, int i) {
        if (super.e(c2186b) == null) {
            return;
        }
        k(c2186b.a(), c2186b.b() == 0, i);
    }
}
