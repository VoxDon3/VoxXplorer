/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import ax.c0.m0;
import ax.c0.o0;
import ax.c0.q0;
import java.lang.ref.WeakReference;

public final class n0 {
    private final WeakReference<View> a;

    n0(View view) {
        this.a = new WeakReference<View>(view);
    }

    public static /* synthetic */ void a(q0 q02, View view, ValueAnimator valueAnimator) {
        q02.a(view);
    }

    private void h(View view, o0 o02) {
        if (o02 != null) {
            view.animate().setListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this, o02, view){
                final o0 a;
                final View b;
                final n0 c;
                {
                    this.c = n02;
                    this.a = o02;
                    this.b = view;
                }

                public void onAnimationCancel(Animator animator) {
                    this.a.a(this.b);
                }

                public void onAnimationEnd(Animator animator) {
                    this.a.b(this.b);
                }

                public void onAnimationStart(Animator animator) {
                    this.a.c(this.b);
                }
            });
            return;
        }
        view.animate().setListener(null);
    }

    public n0 b(float f8) {
        View view = (View)this.a.get();
        if (view != null) {
            view.animate().alpha(f8);
        }
        return this;
    }

    public void c() {
        View view = (View)this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View)this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public n0 e(long l8) {
        View view = (View)this.a.get();
        if (view != null) {
            view.animate().setDuration(l8);
        }
        return this;
    }

    public n0 f(Interpolator interpolator) {
        View view = (View)this.a.get();
        if (view != null) {
            view.animate().setInterpolator((TimeInterpolator)interpolator);
        }
        return this;
    }

    public n0 g(o0 o02) {
        View view = (View)this.a.get();
        if (view != null) {
            this.h(view, o02);
        }
        return this;
    }

    public n0 i(long l8) {
        View view = (View)this.a.get();
        if (view != null) {
            view.animate().setStartDelay(l8);
        }
        return this;
    }

    public n0 j(q0 object) {
        View view = (View)this.a.get();
        if (view != null) {
            object = object != null ? new m0((q0)object, view) : null;
            view.animate().setUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        }
        return this;
    }

    public void k() {
        View view = (View)this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public n0 l(float f8) {
        View view = (View)this.a.get();
        if (view != null) {
            view.animate().translationY(f8);
        }
        return this;
    }
}

