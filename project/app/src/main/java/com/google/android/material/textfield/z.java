/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.L;
import androidx.appcompat.widget.x;
import ax.K6.c;
import ax.d0.H;
import ax.h0.j;
import ax.k6.e;
import ax.k6.g;
import ax.k6.i;
import ax.k6.m;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.t;

@SuppressLint(value={"ViewConstructor"})
class z
extends LinearLayout {
    private final TextInputLayout a;
    private final TextView b;
    private CharSequence c;
    private final CheckableImageButton d;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private int g;
    private ImageView.ScaleType h;
    private View.OnLongClickListener i;
    private boolean j;

    z(TextInputLayout object, L l8) {
        super(object.getContext());
        this.a = object;
        this.setVisibility(8);
        this.setOrientation(0);
        this.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-2, -1, 0x800003));
        object = (CheckableImageButton)LayoutInflater.from((Context)this.getContext()).inflate(ax.k6.i.h, (ViewGroup)this, false);
        this.d = object;
        t.e((CheckableImageButton)((Object)object));
        x x8 = new x(this.getContext());
        this.b = x8;
        this.j(l8);
        this.i(l8);
        this.addView((View)object);
        this.addView((View)x8);
    }

    private void C() {
        CharSequence charSequence = this.c;
        int n8 = 8;
        int n9 = charSequence != null && !this.j ? 0 : 8;
        if (this.d.getVisibility() == 0 || n9 == 0) {
            n8 = 0;
        }
        this.setVisibility(n8);
        this.b.setVisibility(n9);
        this.a.p0();
    }

    private void i(L l8) {
        this.b.setVisibility(8);
        this.b.setId(ax.k6.g.U);
        this.b.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-2, -2));
        this.b.setAccessibilityLiveRegion(1);
        this.o(l8.n(m.a7, 0));
        int n8 = m.b7;
        if (l8.s(n8)) {
            this.p(l8.c(n8));
        }
        this.n(l8.p(m.Z6));
    }

    private void j(L l8) {
        if (ax.K6.c.h(this.getContext())) {
            ((ViewGroup.MarginLayoutParams)this.d.getLayoutParams()).setMarginEnd(0);
        }
        this.u(null);
        this.v(null);
        int n8 = m.h7;
        if (l8.s(n8)) {
            this.e = ax.K6.c.b(this.getContext(), l8, n8);
        }
        if (l8.s(n8 = m.i7)) {
            this.f = ax.F6.z.i(l8.k(n8, -1), null);
        }
        if (l8.s(n8 = m.e7)) {
            this.s(l8.g(n8));
            n8 = m.d7;
            if (l8.s(n8)) {
                this.r(l8.p(n8));
            }
            this.q(l8.a(m.c7, true));
        }
        this.t(l8.f(m.f7, this.getResources().getDimensionPixelSize(ax.k6.e.o0)));
        n8 = m.g7;
        if (l8.s(n8)) {
            this.w(t.b(l8.k(n8, -1)));
        }
    }

    void A(H h8) {
        if (this.b.getVisibility() == 0) {
            h8.y0((View)this.b);
            h8.N0((View)this.b);
            return;
        }
        h8.N0((View)this.d);
    }

    void B() {
        EditText editText = this.a.e;
        if (editText == null) {
            return;
        }
        int n8 = this.k() ? 0 : editText.getPaddingStart();
        this.b.setPaddingRelative(n8, editText.getCompoundPaddingTop(), this.getContext().getResources().getDimensionPixelSize(ax.k6.e.P), editText.getCompoundPaddingBottom());
    }

    CharSequence a() {
        return this.c;
    }

    ColorStateList b() {
        return this.b.getTextColors();
    }

    int c() {
        int n8 = this.k() ? this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams)this.d.getLayoutParams()).getMarginEnd() : 0;
        return this.getPaddingStart() + this.b.getPaddingStart() + n8;
    }

    TextView d() {
        return this.b;
    }

    CharSequence e() {
        return this.d.getContentDescription();
    }

    Drawable f() {
        return this.d.getDrawable();
    }

    int g() {
        return this.g;
    }

    ImageView.ScaleType h() {
        return this.h;
    }

    boolean k() {
        return this.d.getVisibility() == 0;
    }

    void l(boolean bl) {
        this.j = bl;
        this.C();
    }

    void m() {
        t.d(this.a, this.d, this.e);
    }

    void n(CharSequence charSequence) {
        CharSequence charSequence2 = TextUtils.isEmpty((CharSequence)charSequence) ? null : charSequence;
        this.c = charSequence2;
        this.b.setText(charSequence);
        this.C();
    }

    void o(int n8) {
        ax.h0.j.m(this.b, n8);
    }

    protected void onMeasure(int n8, int n9) {
        super.onMeasure(n8, n9);
        this.B();
    }

    void p(ColorStateList colorStateList) {
        this.b.setTextColor(colorStateList);
    }

    void q(boolean bl) {
        this.d.setCheckable(bl);
    }

    void r(CharSequence charSequence) {
        if (this.e() != charSequence) {
            this.d.setContentDescription(charSequence);
        }
    }

    void s(Drawable drawable) {
        this.d.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.a, this.d, this.e, this.f);
            this.z(true);
            this.m();
            return;
        }
        this.z(false);
        this.u(null);
        this.v(null);
        this.r(null);
    }

    void t(int n8) {
        if (n8 >= 0) {
            if (n8 != this.g) {
                this.g = n8;
                t.g(this.d, n8);
            }
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    void u(View.OnClickListener onClickListener) {
        t.h(this.d, onClickListener, this.i);
    }

    void v(View.OnLongClickListener onLongClickListener) {
        this.i = onLongClickListener;
        t.i(this.d, onLongClickListener);
    }

    void w(ImageView.ScaleType scaleType) {
        this.h = scaleType;
        t.j(this.d, scaleType);
    }

    void x(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            t.a(this.a, this.d, colorStateList, this.f);
        }
    }

    void y(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            t.a(this.a, this.d, this.e, mode);
        }
    }

    void z(boolean bl) {
        if (this.k() != bl) {
            CheckableImageButton checkableImageButton = this.d;
            int n8 = bl ? 0 : 8;
            checkableImageButton.setVisibility(n8);
            this.B();
            this.C();
        }
    }
}

