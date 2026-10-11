/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import ax.d0.H;
import ax.k6.c;
import ax.k6.f;
import ax.l6.a;
import com.google.android.material.textfield.i;
import com.google.android.material.textfield.j;
import com.google.android.material.textfield.k;
import com.google.android.material.textfield.l;
import com.google.android.material.textfield.m;
import com.google.android.material.textfield.n;
import com.google.android.material.textfield.o;
import com.google.android.material.textfield.q;
import com.google.android.material.textfield.r;
import com.google.android.material.textfield.s;

class p
extends s {
    private final int e;
    private final int f;
    private final TimeInterpolator g;
    private AutoCompleteTextView h;
    private final View.OnClickListener i = new l(this);
    private final View.OnFocusChangeListener j = new m(this);
    private final AccessibilityManager.TouchExplorationStateChangeListener k = new n(this);
    private boolean l;
    private boolean m;
    private boolean n;
    private long o = Long.MAX_VALUE;
    private AccessibilityManager p;
    private ValueAnimator q;
    private ValueAnimator r;

    p(r r8) {
        super(r8);
        Context context = r8.getContext();
        int n8 = ax.k6.c.I;
        this.f = ax.H6.i.f(context, n8, 67);
        this.e = ax.H6.i.f(r8.getContext(), n8, 50);
        this.g = ax.H6.i.g(r8.getContext(), ax.k6.c.N, ax.l6.a.a);
    }

    public static /* synthetic */ void A(p p8) {
        p8.K();
        p8.H(false);
    }

    public static /* synthetic */ void B(p p8, View view) {
        p8.J();
    }

    private static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView)editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator E(int n8, float ... object) {
        object = ValueAnimator.ofFloat((float[])object);
        object.setInterpolator(this.g);
        object.setDuration((long)n8);
        object.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new i(this));
        return object;
    }

    private void F() {
        ValueAnimator valueAnimator;
        this.r = this.E(this.f, 0.0f, 1.0f);
        this.q = valueAnimator = this.E(this.e, 1.0f, 0.0f);
        valueAnimator.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
            final p a;
            {
                this.a = p8;
            }

            public void onAnimationEnd(Animator animator) {
                this.a.r();
                this.a.r.start();
            }
        });
    }

    private boolean G() {
        long l8 = SystemClock.uptimeMillis() - this.o;
        return l8 < 0L || l8 > 300L;
        {
        }
    }

    private void H(boolean bl) {
        if (this.n != bl) {
            this.n = bl;
            this.r.cancel();
            this.q.start();
        }
    }

    @SuppressLint(value={"ClickableViewAccessibility"})
    private void I() {
        this.h.setOnTouchListener((View.OnTouchListener)new j(this));
        this.h.setOnDismissListener((AutoCompleteTextView.OnDismissListener)new k(this));
        this.h.setThreshold(0);
    }

    private void J() {
        if (this.h == null) {
            return;
        }
        if (this.G()) {
            this.m = false;
        }
        if (!this.m) {
            this.H(this.n ^ true);
            if (this.n) {
                this.h.requestFocus();
                this.h.showDropDown();
                return;
            }
            this.h.dismissDropDown();
            return;
        }
        this.m = false;
    }

    private void K() {
        this.m = true;
        this.o = SystemClock.uptimeMillis();
    }

    public static /* synthetic */ void v(p p8) {
        boolean bl = p8.h.isPopupShowing();
        p8.H(bl);
        p8.m = bl;
    }

    public static /* synthetic */ void w(p object, boolean bl) {
        AutoCompleteTextView autoCompleteTextView = object.h;
        if (autoCompleteTextView != null && !com.google.android.material.textfield.q.a((EditText)autoCompleteTextView)) {
            object = object.d;
            int n8 = bl ? 2 : 1;
            object.setImportantForAccessibility(n8);
        }
    }

    public static /* synthetic */ void x(p p8, ValueAnimator valueAnimator) {
        p8.getClass();
        float f8 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        p8.d.setAlpha(f8);
    }

    public static /* synthetic */ void y(p p8, View view, boolean bl) {
        p8.l = bl;
        p8.r();
        if (!bl) {
            p8.H(false);
            p8.m = false;
        }
    }

    public static /* synthetic */ boolean z(p p8, View view, MotionEvent motionEvent) {
        p8.getClass();
        if (motionEvent.getAction() == 1) {
            if (p8.G()) {
                p8.m = false;
            }
            p8.J();
            p8.K();
        }
        return false;
    }

    @Override
    public void a(Editable editable) {
        if (this.p.isTouchExplorationEnabled() && com.google.android.material.textfield.q.a((EditText)this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post((Runnable)new o(this));
    }

    @Override
    int c() {
        return ax.k6.k.g;
    }

    @Override
    int d() {
        return ax.k6.f.j;
    }

    @Override
    View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override
    View.OnClickListener f() {
        return this.i;
    }

    @Override
    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override
    boolean i(int n8) {
        return n8 != 0;
    }

    @Override
    boolean j() {
        return true;
    }

    @Override
    boolean k() {
        return this.l;
    }

    @Override
    boolean l() {
        return true;
    }

    @Override
    boolean m() {
        return this.n;
    }

    @Override
    public void n(EditText editText) {
        this.h = com.google.android.material.textfield.p.D(editText);
        this.I();
        this.a.setErrorIconDrawable(null);
        if (!com.google.android.material.textfield.q.a(editText) && this.p.isTouchExplorationEnabled()) {
            this.d.setImportantForAccessibility(2);
        }
        this.a.setEndIconVisible(true);
    }

    @Override
    public void o(View view, H h8) {
        if (!com.google.android.material.textfield.q.a((EditText)this.h)) {
            h8.m0(Spinner.class.getName());
        }
        if (h8.W()) {
            h8.x0(null);
        }
    }

    @Override
    @SuppressLint(value={"WrongConstant"})
    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (this.p.isEnabled() && !com.google.android.material.textfield.q.a((EditText)this.h)) {
            boolean bl = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || bl) {
                this.J();
                this.K();
            }
        }
    }

    @Override
    void s() {
        this.F();
        this.p = (AccessibilityManager)this.c.getSystemService("accessibility");
    }

    @Override
    boolean t() {
        return true;
    }

    @Override
    @SuppressLint(value={"ClickableViewAccessibility"})
    void u() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }
}

