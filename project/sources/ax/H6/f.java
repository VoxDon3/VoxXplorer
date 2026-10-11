package ax.H6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import ax.i.C2186b;
import ax.k6.C2404e;
import ax.l6.C2472a;

/* loaded from: classes3.dex */
public class f extends ax.H6.a<View> {
    private final float g;
    private final float h;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.b.setTranslationY(0.0f);
            f.this.k(0.0f);
        }
    }

    public f(View view) {
        super(view);
        Resources resources = view.getResources();
        this.g = resources.getDimension(C2404e.j);
        this.h = resources.getDimension(C2404e.k);
    }

    private Animator g() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.b, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v = this.b;
        if (v instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new ax.D0.b());
        return animatorSet;
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        Animator g = g();
        g.setDuration(this.e);
        g.start();
    }

    public void h(C2186b c2186b, Animator.AnimatorListener animatorListener) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.b, (Property<V, Float>) View.TRANSLATION_Y, this.b.getHeight() * this.b.getScaleY());
        ofFloat.setInterpolator(new ax.D0.b());
        ofFloat.setDuration(C2472a.c(this.c, this.d, c2186b.a()));
        ofFloat.addListener(new a());
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
    }

    public void i(C2186b c2186b, Animator.AnimatorListener animatorListener) {
        Animator g = g();
        g.setDuration(C2472a.c(this.c, this.d, c2186b.a()));
        if (animatorListener != null) {
            g.addListener(animatorListener);
        }
        g.start();
    }

    public void j(C2186b c2186b) {
        super.d(c2186b);
    }

    public void k(float f) {
        float a2 = a(f);
        float width = this.b.getWidth();
        float height = this.b.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f2 = this.g / width;
        float f3 = this.h / height;
        float a3 = 1.0f - C2472a.a(0.0f, f2, a2);
        float a4 = 1.0f - C2472a.a(0.0f, f3, a2);
        if (Float.isNaN(a3) || Float.isNaN(a4)) {
            return;
        }
        this.b.setScaleX(a3);
        this.b.setPivotY(height);
        this.b.setScaleY(a4);
        V v = this.b;
        if (v instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(a4 != 0.0f ? a3 / a4 : 1.0f);
            }
        }
    }

    public void l(C2186b c2186b) {
        if (super.e(c2186b) == null) {
            return;
        }
        k(c2186b.a());
    }
}
