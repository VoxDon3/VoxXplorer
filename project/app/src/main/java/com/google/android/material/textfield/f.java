/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import ax.H6.i;
import ax.k6.k;
import com.google.android.material.textfield.a;
import com.google.android.material.textfield.b;
import com.google.android.material.textfield.c;
import com.google.android.material.textfield.d;
import com.google.android.material.textfield.e;
import com.google.android.material.textfield.r;
import com.google.android.material.textfield.s;

class f
extends s {
    private final int e;
    private final int f;
    private final TimeInterpolator g;
    private final TimeInterpolator h;
    private EditText i;
    private final View.OnClickListener j = new a(this);
    private final View.OnFocusChangeListener k = new b(this);
    private AnimatorSet l;
    private ValueAnimator m;

    f(r r8) {
        super(r8);
        Context context = r8.getContext();
        int n8 = ax.k6.c.I;
        this.e = ax.H6.i.f(context, n8, 100);
        this.f = ax.H6.i.f(r8.getContext(), n8, 150);
        this.g = ax.H6.i.g(r8.getContext(), ax.k6.c.N, ax.l6.a.a);
        this.h = ax.H6.i.g(r8.getContext(), ax.k6.c.M, ax.l6.a.d);
    }

    private void A(boolean bl) {
        boolean bl2 = this.b.F() == bl;
        if (bl && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (bl2) {
                this.l.end();
                return;
            }
        } else if (!bl) {
            this.l.cancel();
            this.m.start();
            if (bl2) {
                this.m.end();
            }
        }
    }

    private ValueAnimator B(float ... object) {
        object = ValueAnimator.ofFloat((float[])object);
        object.setInterpolator(this.g);
        object.setDuration((long)this.e);
        object.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new c(this));
        return object;
    }

    private ValueAnimator C() {
        ValueAnimator valueAnimator = ValueAnimator.ofFloat((float[])new float[]{0.8f, 1.0f});
        valueAnimator.setInterpolator(this.h);
        valueAnimator.setDuration((long)this.f);
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new e(this));
        return valueAnimator;
    }

    private void D() {
        AnimatorSet animatorSet;
        ValueAnimator valueAnimator = this.C();
        ValueAnimator valueAnimator2 = this.B(0.0f, 1.0f);
        this.l = animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{valueAnimator, valueAnimator2});
        this.l.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
            final f a;
            {
                this.a = f8;
            }

            public void onAnimationStart(Animator animator) {
                this.a.b.a0(true);
            }
        });
        animatorSet = this.B(1.0f, 0.0f);
        this.m = animatorSet;
        animatorSet.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
            final f a;
            {
                this.a = f8;
            }

            public void onAnimationEnd(Animator animator) {
                this.a.b.a0(false);
            }
        });
    }

    private boolean E() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
    }

    public static /* synthetic */ void v(f f8, View view) {
        view = f8.i;
        if (view == null) {
            return;
        }
        if ((view = view.getText()) != null) {
            view.clear();
        }
        f8.r();
    }

    public static /* synthetic */ void w(f f8, View view, boolean bl) {
        f8.A(f8.E());
    }

    public static /* synthetic */ void x(f f8, ValueAnimator valueAnimator) {
        f8.getClass();
        float f9 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        f8.d.setAlpha(f9);
    }

    public static /* synthetic */ void y(f f8, ValueAnimator valueAnimator) {
        f8.getClass();
        float f9 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        f8.d.setScaleX(f9);
        f8.d.setScaleY(f9);
    }

    public static /* synthetic */ void z(f f8) {
        f8.A(true);
    }

    @Override
    void a(Editable editable) {
        if (this.b.w() != null) {
            return;
        }
        this.A(this.E());
    }

    @Override
    int c() {
        return ax.k6.k.e;
    }

    @Override
    int d() {
        return ax.k6.f.k;
    }

    @Override
    View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override
    View.OnClickListener f() {
        return this.j;
    }

    @Override
    View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override
    public void n(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(this.E());
    }

    @Override
    void q(boolean bl) {
        if (this.b.w() == null) {
            return;
        }
        this.A(bl);
    }

    @Override
    void s() {
        this.D();
    }

    @Override
    void u() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post((Runnable)new d(this));
        }
    }
}

