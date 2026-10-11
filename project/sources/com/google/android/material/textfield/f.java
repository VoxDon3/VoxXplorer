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
import ax.k6.C2402c;
import ax.k6.C2405f;
import ax.k6.C2410k;
import ax.l6.C2472a;

/* loaded from: classes3.dex */
class f extends s {
    private final int e;
    private final int f;
    private final TimeInterpolator g;
    private final TimeInterpolator h;
    private EditText i;
    private final View.OnClickListener j;
    private final View.OnFocusChangeListener k;
    private AnimatorSet l;
    private ValueAnimator m;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.b.a0(true);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.b.a0(false);
        }
    }

    f(r rVar) {
        super(rVar);
        this.j = new View.OnClickListener() { // from class: com.google.android.material.textfield.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.v(f.this, view);
            }
        };
        this.k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                r0.A(f.this.E());
            }
        };
        Context context = rVar.getContext();
        int i = C2402c.I;
        this.e = ax.H6.i.f(context, i, 100);
        this.f = ax.H6.i.f(rVar.getContext(), i, 150);
        this.g = ax.H6.i.g(rVar.getContext(), C2402c.N, C2472a.a);
        this.h = ax.H6.i.g(rVar.getContext(), C2402c.M, C2472a.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(boolean z) {
        boolean z2 = this.b.F() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.g);
        ofFloat.setDuration(this.e);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.x(f.this, valueAnimator);
            }
        });
        return ofFloat;
    }

    private ValueAnimator C() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.y(f.this, valueAnimator);
            }
        });
        return ofFloat;
    }

    private void D() {
        ValueAnimator C = C();
        ValueAnimator B = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(C, B);
        this.l.addListener(new a());
        ValueAnimator B2 = B(1.0f, 0.0f);
        this.m = B2;
        B2.addListener(new b());
    }

    private boolean E() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }

    public static /* synthetic */ void v(f fVar, View view) {
        EditText editText = fVar.i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        fVar.r();
    }

    public static /* synthetic */ void x(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        fVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fVar.d.setScaleX(floatValue);
        fVar.d.setScaleY(floatValue);
    }

    @Override // com.google.android.material.textfield.s
    void a(Editable editable) {
        if (this.b.w() != null) {
            return;
        }
        A(E());
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return C2410k.e;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return C2405f.k;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.j;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // com.google.android.material.textfield.s
    public void n(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(E());
    }

    @Override // com.google.android.material.textfield.s
    void q(boolean z) {
        if (this.b.w() == null) {
            return;
        }
        A(z);
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        D();
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.d
                @Override // java.lang.Runnable
                public final void run() {
                    f.this.A(true);
                }
            });
        }
    }
}
