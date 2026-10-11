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
import ax.k6.C2402c;
import ax.l6.C2472a;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.Iterator;
import java.util.LinkedHashSet;

@Deprecated
/* loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private static final int m = C2402c.D;
    private static final int n = C2402c.G;
    private static final int o = C2402c.M;
    private final LinkedHashSet<c> a;
    private int b;
    private int c;
    private TimeInterpolator d;
    private TimeInterpolator e;
    private int f;
    private AccessibilityManager g;
    private AccessibilityManager.TouchExplorationStateChangeListener h;
    private boolean i;
    private int j;
    private int k;
    private ViewPropertyAnimator l;

    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (HideBottomViewOnScrollBehavior.this.h == null || HideBottomViewOnScrollBehavior.this.g == null) {
                return;
            }
            HideBottomViewOnScrollBehavior.this.g.removeTouchExplorationStateChangeListener(HideBottomViewOnScrollBehavior.this.h);
            HideBottomViewOnScrollBehavior.this.h = null;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.l = null;
        }
    }

    public interface c {
        void a(View view, int i);
    }

    public HideBottomViewOnScrollBehavior() {
        this.a = new LinkedHashSet<>();
        this.f = 0;
        this.i = true;
        this.j = 2;
        this.k = 0;
    }

    public static /* synthetic */ void I(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, View view, boolean z) {
        if (!z) {
            hideBottomViewOnScrollBehavior.getClass();
        } else if (hideBottomViewOnScrollBehavior.P()) {
            hideBottomViewOnScrollBehavior.U(view);
        }
    }

    private void N(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.l = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new b());
    }

    private void O(final V v) {
        if (this.g == null) {
            this.g = (AccessibilityManager) ax.Q.b.f(v.getContext(), AccessibilityManager.class);
        }
        if (this.g == null || this.h != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: ax.o6.a
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                HideBottomViewOnScrollBehavior.I(HideBottomViewOnScrollBehavior.this, v, z);
            }
        };
        this.h = touchExplorationStateChangeListener;
        this.g.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        v.addOnAttachStateChangeListener(new a());
    }

    private void W(V v, int i) {
        this.j = i;
        Iterator<c> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(v, this.j);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public boolean P() {
        return this.j == 1;
    }

    public boolean Q() {
        return this.j == 2;
    }

    public void R(V v, int i) {
        this.k = i;
        if (this.j == 1) {
            v.setTranslationY(this.f + i);
        }
    }

    public void S(V v) {
        T(v, true);
    }

    public void T(V v, boolean z) {
        AccessibilityManager accessibilityManager;
        if (P()) {
            return;
        }
        if (this.i && (accessibilityManager = this.g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        W(v, 1);
        int i = this.f + this.k;
        if (z) {
            N(v, i, this.c, this.e);
        } else {
            v.setTranslationY(i);
        }
    }

    public void U(V v) {
        V(v, true);
    }

    public void V(V v, boolean z) {
        if (Q()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        W(v, 2);
        if (z) {
            N(v, 0, this.b, this.d);
        } else {
            v.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        this.b = i.f(v.getContext(), m, 225);
        this.c = i.f(v.getContext(), n, 175);
        Context context = v.getContext();
        int i2 = o;
        this.d = i.g(context, i2, C2472a.d);
        this.e = i.g(v.getContext(), i2, C2472a.c);
        O(v);
        return super.p(coordinatorLayout, v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            S(v);
        } else if (i2 < 0) {
            U(v);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new LinkedHashSet<>();
        this.f = 0;
        this.i = true;
        this.j = 2;
        this.k = 0;
    }
}
