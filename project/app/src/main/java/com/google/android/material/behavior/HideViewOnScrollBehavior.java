/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.H6.i;
import com.google.android.material.behavior.a;
import com.google.android.material.behavior.b;
import com.google.android.material.behavior.d;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HideViewOnScrollBehavior<V extends View>
extends CoordinatorLayout.c<V> {
    private static final int o = ax.k6.c.D;
    private static final int p = ax.k6.c.G;
    private static final int q = ax.k6.c.M;
    private d a;
    private AccessibilityManager b;
    private AccessibilityManager.TouchExplorationStateChangeListener c;
    private boolean d = true;
    private final LinkedHashSet<c> e = new LinkedHashSet();
    private int f;
    private int g;
    private TimeInterpolator h;
    private TimeInterpolator i;
    private int j = 0;
    private int k = 2;
    private int l = 0;
    private ViewPropertyAnimator m;
    private boolean n = false;

    public HideViewOnScrollBehavior() {
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static /* synthetic */ void I(HideViewOnScrollBehavior hideViewOnScrollBehavior, View view, boolean bl) {
        if (hideViewOnScrollBehavior.d && bl && hideViewOnScrollBehavior.S()) {
            hideViewOnScrollBehavior.V(view);
        }
    }

    static /* synthetic */ AccessibilityManager.TouchExplorationStateChangeListener K(HideViewOnScrollBehavior hideViewOnScrollBehavior, AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
        hideViewOnScrollBehavior.c = touchExplorationStateChangeListener;
        return touchExplorationStateChangeListener;
    }

    static /* synthetic */ ViewPropertyAnimator M(HideViewOnScrollBehavior hideViewOnScrollBehavior, ViewPropertyAnimator viewPropertyAnimator) {
        hideViewOnScrollBehavior.m = viewPropertyAnimator;
        return viewPropertyAnimator;
    }

    private void N(V v8, int n8, long l8, TimeInterpolator timeInterpolator) {
        this.m = this.a.d(v8, n8).setInterpolator(timeInterpolator).setDuration(l8).setListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
            final HideViewOnScrollBehavior a;
            {
                this.a = hideViewOnScrollBehavior;
            }

            public void onAnimationEnd(Animator animator) {
                HideViewOnScrollBehavior.M(this.a, null);
            }
        });
    }

    private void O(V v8) {
        if (this.b == null) {
            this.b = ax.Q.b.f(v8.getContext(), AccessibilityManager.class);
        }
        if (this.b != null && this.c == null) {
            ax.o6.b b8 = new ax.o6.b(this, (View)v8);
            this.c = b8;
            this.b.addTouchExplorationStateChangeListener((AccessibilityManager.TouchExplorationStateChangeListener)b8);
            v8.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this){
                final HideViewOnScrollBehavior a;
                {
                    this.a = hideViewOnScrollBehavior;
                }

                public void onViewAttachedToWindow(View view) {
                }

                public void onViewDetachedFromWindow(View view) {
                    if (this.a.c != null && this.a.b != null) {
                        this.a.b.removeTouchExplorationStateChangeListener(this.a.c);
                        HideViewOnScrollBehavior.K(this.a, null);
                    }
                }
            });
        }
    }

    private boolean P(int n8) {
        return n8 == 80 || n8 == 81;
        {
        }
    }

    private boolean Q(int n8) {
        return n8 == 3 || n8 == 19;
        {
        }
    }

    private void T(V v8, int n8) {
        if (this.n) {
            return;
        }
        int n9 = ((CoordinatorLayout.f)v8.getLayoutParams()).c;
        if (this.P(n9)) {
            this.U(1);
            return;
        }
        n8 = this.Q(Gravity.getAbsoluteGravity((int)n9, (int)n8)) ? 2 : 0;
        this.U(n8);
    }

    private void U(int n8) {
        Object object = this.a;
        if (object != null && ((d)object).c() == n8) {
            return;
        }
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 == 2) {
                    this.a = new b();
                    return;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Invalid view edge position value: ");
                ((StringBuilder)object).append(n8);
                ((StringBuilder)object).append(". Must be ");
                ((StringBuilder)object).append(0);
                ((StringBuilder)object).append(", ");
                ((StringBuilder)object).append(1);
                ((StringBuilder)object).append(" or ");
                ((StringBuilder)object).append(2);
                ((StringBuilder)object).append(".");
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            this.a = new a();
            return;
        }
        this.a = new com.google.android.material.behavior.c();
    }

    private void Z(V v8, int n8) {
        this.k = n8;
        Iterator iterator = ((AbstractCollection)this.e).iterator();
        while (iterator.hasNext()) {
            ((c)iterator.next()).a((View)v8, this.k);
        }
    }

    @Override
    public boolean E(CoordinatorLayout coordinatorLayout, V v8, View view, View view2, int n8, int n9) {
        return n8 == 2;
    }

    public boolean R() {
        return this.k == 2;
    }

    public boolean S() {
        return this.k == 1;
    }

    public void V(V v8) {
        this.W(v8, true);
    }

    public void W(V v8, boolean bl) {
        if (this.R()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.m;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v8.clearAnimation();
        }
        this.Z(v8, 2);
        int n8 = this.a.b();
        if (bl) {
            this.N(v8, n8, this.f, this.h);
            return;
        }
        this.a.e(v8, n8);
    }

    public void X(V v8) {
        this.Y(v8, true);
    }

    public void Y(V v8, boolean bl) {
        AccessibilityManager accessibilityManager;
        if (this.S() || this.d && (accessibilityManager = this.b) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        accessibilityManager = this.m;
        if (accessibilityManager != null) {
            accessibilityManager.cancel();
            v8.clearAnimation();
        }
        this.Z(v8, 1);
        int n8 = this.j + this.l;
        if (bl) {
            this.N(v8, n8, this.g, this.i);
            return;
        }
        this.a.e(v8, n8);
    }

    @Override
    public boolean p(CoordinatorLayout coordinatorLayout, V v8, int n8) {
        this.O(v8);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)v8.getLayoutParams();
        this.T(v8, n8);
        this.j = this.a.a(v8, marginLayoutParams);
        this.f = ax.H6.i.f(v8.getContext(), o, 225);
        this.g = ax.H6.i.f(v8.getContext(), p, 175);
        marginLayoutParams = v8.getContext();
        int n9 = q;
        this.h = ax.H6.i.g((Context)marginLayoutParams, n9, ax.l6.a.d);
        this.i = ax.H6.i.g(v8.getContext(), n9, ax.l6.a.c);
        return super.p(coordinatorLayout, v8, n8);
    }

    @Override
    public void x(CoordinatorLayout coordinatorLayout, V v8, View view, int n8, int n9, int n10, int n11, int n12, int[] nArray) {
        if (n9 > 0) {
            this.X(v8);
            return;
        }
        if (n9 < 0) {
            this.V(v8);
        }
    }

    public static interface c {
        public void a(View var1, int var2);
    }
}

