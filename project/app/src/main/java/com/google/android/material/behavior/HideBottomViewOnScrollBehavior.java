/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.H6.i;
import ax.Q.b;
import ax.l6.a;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedHashSet;

@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View>
extends CoordinatorLayout.c<V> {
    private static final int m = ax.k6.c.D;
    private static final int n = ax.k6.c.G;
    private static final int o = ax.k6.c.M;
    private final LinkedHashSet<c> a = new LinkedHashSet();
    private int b;
    private int c;
    private TimeInterpolator d;
    private TimeInterpolator e;
    private int f = 0;
    private AccessibilityManager g;
    private AccessibilityManager.TouchExplorationStateChangeListener h;
    private boolean i = true;
    private int j = 2;
    private int k = 0;
    private ViewPropertyAnimator l;

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static /* synthetic */ void I(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, View view, boolean bl) {
        if (bl) {
            if (hideBottomViewOnScrollBehavior.P()) {
                hideBottomViewOnScrollBehavior.U(view);
            }
            return;
        }
        hideBottomViewOnScrollBehavior.getClass();
    }

    static /* synthetic */ AccessibilityManager.TouchExplorationStateChangeListener K(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
        hideBottomViewOnScrollBehavior.h = touchExplorationStateChangeListener;
        return touchExplorationStateChangeListener;
    }

    static /* synthetic */ ViewPropertyAnimator M(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, ViewPropertyAnimator viewPropertyAnimator) {
        hideBottomViewOnScrollBehavior.l = viewPropertyAnimator;
        return viewPropertyAnimator;
    }

    private void N(V v8, int n8, long l8, TimeInterpolator timeInterpolator) {
        this.l = v8.animate().translationY((float)n8).setInterpolator(timeInterpolator).setDuration(l8).setListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
            final HideBottomViewOnScrollBehavior a;
            {
                this.a = hideBottomViewOnScrollBehavior;
            }

            public void onAnimationEnd(Animator animator) {
                HideBottomViewOnScrollBehavior.M(this.a, null);
            }
        });
    }

    private void O(V v8) {
        if (this.g == null) {
            this.g = ax.Q.b.f(v8.getContext(), AccessibilityManager.class);
        }
        if (this.g != null && this.h == null) {
            ax.o6.a a8 = new ax.o6.a(this, (View)v8);
            this.h = a8;
            this.g.addTouchExplorationStateChangeListener((AccessibilityManager.TouchExplorationStateChangeListener)a8);
            v8.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this){
                final HideBottomViewOnScrollBehavior a;
                {
                    this.a = hideBottomViewOnScrollBehavior;
                }

                public void onViewAttachedToWindow(View view) {
                }

                public void onViewDetachedFromWindow(View view) {
                    if (this.a.h != null && this.a.g != null) {
                        this.a.g.removeTouchExplorationStateChangeListener(this.a.h);
                        HideBottomViewOnScrollBehavior.K(this.a, null);
                    }
                }
            });
        }
    }

    private void W(V v8, int n8) {
        this.j = n8;
        Iterator iterator = ((AbstractCollection)this.a).iterator();
        while (iterator.hasNext()) {
            ((c)iterator.next()).a((View)v8, this.j);
        }
    }

    @Override
    public boolean E(CoordinatorLayout coordinatorLayout, V v8, View view, View view2, int n8, int n9) {
        return n8 == 2;
    }

    public boolean P() {
        return this.j == 1;
    }

    public boolean Q() {
        return this.j == 2;
    }

    public void R(V v8, int n8) {
        this.k = n8;
        if (this.j == 1) {
            v8.setTranslationY((float)(this.f + n8));
        }
    }

    public void S(V v8) {
        this.T(v8, true);
    }

    public void T(V v8, boolean bl) {
        AccessibilityManager accessibilityManager;
        if (this.P() || this.i && (accessibilityManager = this.g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        accessibilityManager = this.l;
        if (accessibilityManager != null) {
            accessibilityManager.cancel();
            v8.clearAnimation();
        }
        this.W(v8, 1);
        int n8 = this.f + this.k;
        if (bl) {
            this.N(v8, n8, this.c, this.e);
            return;
        }
        v8.setTranslationY((float)n8);
    }

    public void U(V v8) {
        this.V(v8, true);
    }

    public void V(V v8, boolean bl) {
        if (this.Q()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v8.clearAnimation();
        }
        this.W(v8, 2);
        if (bl) {
            this.N(v8, 0, this.b, this.d);
            return;
        }
        v8.setTranslationY(0.0f);
    }

    @Override
    public boolean p(CoordinatorLayout coordinatorLayout, V v8, int n8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)v8.getLayoutParams();
        this.f = v8.getMeasuredHeight() + marginLayoutParams.bottomMargin;
        this.b = ax.H6.i.f(v8.getContext(), m, 225);
        this.c = ax.H6.i.f(v8.getContext(), n, 175);
        marginLayoutParams = v8.getContext();
        int n9 = o;
        this.d = ax.H6.i.g((Context)marginLayoutParams, n9, ax.l6.a.d);
        this.e = ax.H6.i.g(v8.getContext(), n9, ax.l6.a.c);
        this.O(v8);
        return super.p(coordinatorLayout, v8, n8);
    }

    @Override
    public void x(CoordinatorLayout coordinatorLayout, V v8, View view, int n8, int n9, int n10, int n11, int n12, int[] nArray) {
        if (n9 > 0) {
            this.S(v8);
            return;
        }
        if (n9 < 0) {
            this.U(v8);
        }
    }

    public static interface c {
        public void a(View var1, int var2);
    }
}

