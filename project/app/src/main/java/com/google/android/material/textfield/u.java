/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.x;
import ax.H6.i;
import ax.K6.c;
import ax.h0.j;
import ax.k6.e;
import ax.k6.g;
import ax.l6.a;
import ax.l6.b;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;

final class u {
    private ColorStateList A;
    private Typeface B;
    private final int a;
    private final int b;
    private final int c;
    private final TimeInterpolator d;
    private final TimeInterpolator e;
    private final TimeInterpolator f;
    private final Context g;
    private final TextInputLayout h;
    private LinearLayout i;
    private int j;
    private FrameLayout k;
    private Animator l;
    private final float m;
    private int n;
    private int o;
    private CharSequence p;
    private boolean q;
    private TextView r;
    private CharSequence s;
    private int t;
    private int u;
    private ColorStateList v;
    private CharSequence w;
    private boolean x;
    private TextView y;
    private int z;

    public u(TextInputLayout textInputLayout) {
        Context context;
        this.g = context = textInputLayout.getContext();
        this.h = textInputLayout;
        this.m = context.getResources().getDimensionPixelSize(ax.k6.e.i);
        int n8 = ax.k6.c.J;
        this.a = ax.H6.i.f(context, n8, 217);
        this.b = ax.H6.i.f(context, ax.k6.c.G, 167);
        this.c = ax.H6.i.f(context, n8, 167);
        n8 = ax.k6.c.L;
        this.d = ax.H6.i.g(context, n8, ax.l6.a.d);
        textInputLayout = ax.l6.a.a;
        this.e = ax.H6.i.g(context, n8, (TimeInterpolator)textInputLayout);
        this.f = ax.H6.i.g(context, ax.k6.c.N, (TimeInterpolator)textInputLayout);
    }

    private void D(int n8, int n9) {
        TextView textView;
        if (n8 == n9) {
            return;
        }
        if (n9 != 0 && (textView = this.m(n9)) != null) {
            textView.setVisibility(0);
            textView.setAlpha(1.0f);
        }
        if (n8 != 0 && (textView = this.m(n8)) != null) {
            textView.setVisibility(4);
            if (n8 == 1) {
                textView.setText(null);
            }
        }
        this.n = n9;
    }

    private void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void O(ViewGroup viewGroup, int n8) {
        if (n8 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean P(TextView textView, CharSequence charSequence) {
        return this.h.isLaidOut() && this.h.isEnabled() && (this.o != this.n || textView == null || !TextUtils.equals((CharSequence)textView.getText(), (CharSequence)charSequence));
    }

    private void S(int n8, int n9, boolean bl) {
        if (n8 == n9) {
            return;
        }
        if (bl) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.l = animatorSet;
            ArrayList<Animator> arrayList = new ArrayList<Animator>();
            boolean bl2 = this.x;
            TextView textView = this.y;
            this.i(arrayList, bl2, textView, 2, n8, n9);
            this.i(arrayList, this.q, this.r, 1, n8, n9);
            ax.l6.b.a(animatorSet, arrayList);
            animatorSet.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this, n9, this.m(n8), n8, this.m(n9)){
                final int a;
                final TextView b;
                final int c;
                final TextView d;
                final u e;
                {
                    this.e = u8;
                    this.a = n8;
                    this.b = textView;
                    this.c = n9;
                    this.d = textView2;
                }

                public void onAnimationEnd(Animator animator) {
                    com.google.android.material.textfield.u.a(this.e, this.a);
                    com.google.android.material.textfield.u.b(this.e, null);
                    animator = this.b;
                    if (animator != null) {
                        animator.setVisibility(4);
                        if (this.c == 1 && this.e.r != null) {
                            this.e.r.setText(null);
                        }
                    }
                    if ((animator = this.d) != null) {
                        animator.setTranslationY(0.0f);
                        this.d.setAlpha(1.0f);
                    }
                }

                public void onAnimationStart(Animator animator) {
                    animator = this.d;
                    if (animator != null) {
                        animator.setVisibility(0);
                        this.d.setAlpha(0.0f);
                    }
                }
            });
            animatorSet.start();
        } else {
            this.D(n8, n9);
        }
        this.h.q0();
        this.h.w0(bl);
        this.h.C0();
    }

    static /* synthetic */ int a(u u8, int n8) {
        u8.n = n8;
        return n8;
    }

    static /* synthetic */ Animator b(u u8, Animator animator) {
        u8.l = animator;
        return animator;
    }

    private boolean g() {
        return this.i != null && this.h.getEditText() != null;
    }

    private void i(List<Animator> list, boolean bl, TextView textView, int n8, int n9, int n10) {
        if (textView != null && bl) {
            if (n8 != n10 && n8 != n9) {
                return;
            }
            bl = n10 == n8;
            ObjectAnimator objectAnimator = this.j(textView, bl);
            if (n8 == n10 && n9 != 0) {
                objectAnimator.setStartDelay((long)this.c);
            }
            list.add((Animator)objectAnimator);
            if (n10 == n8 && n9 != 0) {
                textView = this.k(textView);
                textView.setStartDelay((long)this.c);
                list.add((Animator)textView);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private ObjectAnimator j(TextView textView, boolean bl) {
        float f8 = bl ? 1.0f : 0.0f;
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat((Object)textView, (Property)View.ALPHA, (float[])new float[]{f8});
        int n8 = bl ? this.b : this.c;
        long l8 = n8;
        objectAnimator.setDuration(l8);
        textView = bl ? this.e : this.f;
        objectAnimator.setInterpolator((TimeInterpolator)textView);
        return objectAnimator;
    }

    private ObjectAnimator k(TextView textView) {
        textView = ObjectAnimator.ofFloat((Object)textView, (Property)View.TRANSLATION_Y, (float[])new float[]{-this.m, 0.0f});
        textView.setDuration((long)this.a);
        textView.setInterpolator(this.d);
        return textView;
    }

    private TextView m(int n8) {
        if (n8 != 1) {
            if (n8 != 2) {
                return null;
            }
            return this.y;
        }
        return this.r;
    }

    private int v(boolean bl, int n8, int n9) {
        if (bl) {
            return this.g.getResources().getDimensionPixelSize(n8);
        }
        return n9;
    }

    private boolean y(int n8) {
        return n8 == 1 && this.r != null && !TextUtils.isEmpty((CharSequence)this.p);
    }

    boolean A() {
        return this.q;
    }

    boolean B() {
        return this.x;
    }

    void C(TextView textView, int n8) {
        FrameLayout frameLayout;
        if (this.i == null) {
            return;
        }
        if (this.z(n8) && (frameLayout = this.k) != null) {
            frameLayout.removeView((View)textView);
        } else {
            this.i.removeView((View)textView);
        }
        this.j = n8 = this.j - 1;
        this.O((ViewGroup)this.i, n8);
    }

    void E(int n8) {
        this.t = n8;
        TextView textView = this.r;
        if (textView != null) {
            textView.setAccessibilityLiveRegion(n8);
        }
    }

    void F(CharSequence charSequence) {
        this.s = charSequence;
        TextView textView = this.r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void G(boolean bl) {
        if (this.q == bl) {
            return;
        }
        this.h();
        if (bl) {
            x x8 = new x(this.g);
            this.r = x8;
            x8.setId(ax.k6.g.R);
            this.r.setTextAlignment(5);
            x8 = this.B;
            if (x8 != null) {
                this.r.setTypeface((Typeface)x8);
            }
            this.H(this.u);
            this.I(this.v);
            this.F(this.s);
            this.E(this.t);
            this.r.setVisibility(4);
            this.e(this.r, 0);
        } else {
            this.w();
            this.C(this.r, 0);
            this.r = null;
            this.h.q0();
            this.h.C0();
        }
        this.q = bl;
    }

    void H(int n8) {
        this.u = n8;
        TextView textView = this.r;
        if (textView != null) {
            this.h.c0(textView, n8);
        }
    }

    void I(ColorStateList colorStateList) {
        this.v = colorStateList;
        TextView textView = this.r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    void J(int n8) {
        this.z = n8;
        TextView textView = this.y;
        if (textView != null) {
            ax.h0.j.m(textView, n8);
        }
    }

    void K(boolean bl) {
        if (this.x == bl) {
            return;
        }
        this.h();
        if (bl) {
            x x8 = new x(this.g);
            this.y = x8;
            x8.setId(ax.k6.g.S);
            this.y.setTextAlignment(5);
            x8 = this.B;
            if (x8 != null) {
                this.y.setTypeface((Typeface)x8);
            }
            this.y.setVisibility(4);
            this.y.setAccessibilityLiveRegion(1);
            this.J(this.z);
            this.L(this.A);
            this.e(this.y, 1);
            this.y.setAccessibilityDelegate(new View.AccessibilityDelegate(this){
                final u a;
                {
                    this.a = u8;
                }

                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    view = this.a.h.getEditText();
                    if (view != null) {
                        accessibilityNodeInfo.setLabeledBy(view);
                    }
                }
            });
        } else {
            this.x();
            this.C(this.y, 1);
            this.y = null;
            this.h.q0();
            this.h.C0();
        }
        this.x = bl;
    }

    void L(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.y;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    void N(Typeface typeface) {
        if (typeface != this.B) {
            this.B = typeface;
            this.M(this.r, typeface);
            this.M(this.y, typeface);
        }
    }

    void Q(CharSequence charSequence) {
        this.h();
        this.p = charSequence;
        this.r.setText(charSequence);
        int n8 = this.n;
        if (n8 != 1) {
            this.o = 1;
        }
        this.S(n8, this.o, this.P(this.r, charSequence));
    }

    void R(CharSequence charSequence) {
        this.h();
        this.w = charSequence;
        this.y.setText(charSequence);
        int n8 = this.n;
        if (n8 != 2) {
            this.o = 2;
        }
        this.S(n8, this.o, this.P(this.y, charSequence));
    }

    void e(TextView textView, int n8) {
        LinearLayout linearLayout;
        if (this.i == null && this.k == null) {
            this.i = linearLayout = new LinearLayout(this.g);
            linearLayout.setOrientation(0);
            this.h.addView((View)this.i, -1, -2);
            this.k = new FrameLayout(this.g);
            linearLayout = new LinearLayout.LayoutParams(0, -2, 1.0f);
            this.i.addView((View)this.k, (ViewGroup.LayoutParams)linearLayout);
            if (this.h.getEditText() != null) {
                this.f();
            }
        }
        if (this.z(n8)) {
            this.k.setVisibility(0);
            this.k.addView((View)textView);
        } else {
            linearLayout = new LinearLayout.LayoutParams(-2, -2);
            this.i.addView((View)textView, (ViewGroup.LayoutParams)linearLayout);
        }
        this.i.setVisibility(0);
        ++this.j;
    }

    void f() {
        if (this.g()) {
            EditText editText = this.h.getEditText();
            boolean bl = ax.K6.c.h(this.g);
            LinearLayout linearLayout = this.i;
            int n8 = ax.k6.e.N;
            linearLayout.setPaddingRelative(this.v(bl, n8, editText.getPaddingStart()), this.v(bl, ax.k6.e.O, this.g.getResources().getDimensionPixelSize(ax.k6.e.M)), this.v(bl, n8, editText.getPaddingEnd()), 0);
        }
    }

    void h() {
        Animator animator = this.l;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean l() {
        return this.y(this.o);
    }

    int n() {
        return this.t;
    }

    CharSequence o() {
        return this.s;
    }

    CharSequence p() {
        return this.p;
    }

    int q() {
        TextView textView = this.r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    ColorStateList r() {
        TextView textView = this.r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence s() {
        return this.w;
    }

    View t() {
        return this.y;
    }

    int u() {
        TextView textView = this.y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    void w() {
        this.p = null;
        this.h();
        if (this.n == 1) {
            this.o = this.x && !TextUtils.isEmpty((CharSequence)this.w) ? 2 : 0;
        }
        this.S(this.n, this.o, this.P(this.r, ""));
    }

    void x() {
        this.h();
        int n8 = this.n;
        if (n8 == 2) {
            this.o = 0;
        }
        this.S(n8, this.o, this.P(this.y, ""));
    }

    boolean z(int n8) {
        return n8 == 0 || n8 == 1;
        {
        }
    }
}

