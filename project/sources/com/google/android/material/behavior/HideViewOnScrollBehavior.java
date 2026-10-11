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
import ax.k6.C2402c;
import ax.l6.C2472a;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private static final int o = C2402c.D;
    private static final int p = C2402c.G;
    private static final int q = C2402c.M;
    private d a;
    private AccessibilityManager b;
    private AccessibilityManager.TouchExplorationStateChangeListener c;
    private boolean d;
    private final LinkedHashSet<c> e;
    private int f;
    private int g;
    private TimeInterpolator h;
    private TimeInterpolator i;
    private int j;
    private int k;
    private int l;
    private ViewPropertyAnimator m;
    private boolean n;

    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (HideViewOnScrollBehavior.this.c == null || HideViewOnScrollBehavior.this.b == null) {
                return;
            }
            HideViewOnScrollBehavior.this.b.removeTouchExplorationStateChangeListener(HideViewOnScrollBehavior.this.c);
            HideViewOnScrollBehavior.this.c = null;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideViewOnScrollBehavior.this.m = null;
        }
    }

    public interface c {
        void a(View view, int i);
    }

    public HideViewOnScrollBehavior() {
        this.d = true;
        this.e = new LinkedHashSet<>();
        this.j = 0;
        this.k = 2;
        this.l = 0;
        this.n = false;
    }

    public static /* synthetic */ void I(HideViewOnScrollBehavior hideViewOnScrollBehavior, View view, boolean z) {
        if (hideViewOnScrollBehavior.d && z && hideViewOnScrollBehavior.S()) {
            hideViewOnScrollBehavior.V(view);
        }
    }

    private void N(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.m = this.a.d(v, i).setInterpolator(timeInterpolator).setDuration(j).setListener(new b());
    }

    private void O(final V v) {
        if (this.b == null) {
            this.b = (AccessibilityManager) ax.Q.b.f(v.getContext(), AccessibilityManager.class);
        }
        if (this.b == null || this.c != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: ax.o6.b
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                HideViewOnScrollBehavior.I(HideViewOnScrollBehavior.this, v, z);
            }
        };
        this.c = touchExplorationStateChangeListener;
        this.b.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        v.addOnAttachStateChangeListener(new a());
    }

    private boolean P(int i) {
        return i == 80 || i == 81;
    }

    private boolean Q(int i) {
        return i == 3 || i == 19;
    }

    private void T(V v, int i) {
        if (this.n) {
            return;
        }
        int i2 = ((CoordinatorLayout.f) v.getLayoutParams()).c;
        if (P(i2)) {
            U(1);
        } else {
            U(Q(Gravity.getAbsoluteGravity(i2, i)) ? 2 : 0);
        }
    }

    private void U(int i) {
        d dVar = this.a;
        if (dVar == null || dVar.c() != i) {
            if (i == 0) {
                this.a = new com.google.android.material.behavior.c();
                return;
            }
            if (i == 1) {
                this.a = new com.google.android.material.behavior.a();
                return;
            }
            if (i == 2) {
                this.a = new com.google.android.material.behavior.b();
                return;
            }
            throw new IllegalArgumentException("Invalid view edge position value: " + i + ". Must be 0, 1 or 2.");
        }
    }

    private void Z(V v, int i) {
        this.k = i;
        Iterator<c> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().a(v, this.k);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public boolean R() {
        return this.k == 2;
    }

    public boolean S() {
        return this.k == 1;
    }

    public void V(V v) {
        W(v, true);
    }

    public void W(V v, boolean z) {
        if (R()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.m;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        Z(v, 2);
        int b2 = this.a.b();
        if (z) {
            N(v, b2, this.f, this.h);
        } else {
            this.a.e(v, b2);
        }
    }

    public void X(V v) {
        Y(v, true);
    }

    public void Y(V v, boolean z) {
        AccessibilityManager accessibilityManager;
        if (S()) {
            return;
        }
        if (this.d && (accessibilityManager = this.b) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.m;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        Z(v, 1);
        int i = this.j + this.l;
        if (z) {
            N(v, i, this.g, this.i);
        } else {
            this.a.e(v, i);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v, int i) {
        O(v);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        T(v, i);
        this.j = this.a.a(v, marginLayoutParams);
        this.f = i.f(v.getContext(), o, 225);
        this.g = i.f(v.getContext(), p, 175);
        Context context = v.getContext();
        int i2 = q;
        this.h = i.g(context, i2, C2472a.d);
        this.i = i.g(v.getContext(), i2, C2472a.c);
        return super.p(coordinatorLayout, v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            X(v);
        } else if (i2 < 0) {
            V(v);
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = true;
        this.e = new LinkedHashSet<>();
        this.j = 0;
        this.k = 2;
        this.l = 0;
        this.n = false;
    }
}
