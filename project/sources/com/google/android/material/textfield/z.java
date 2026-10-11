package com.google.android.material.textfield;

import android.annotation.SuppressLint;
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
import ax.d0.H;
import ax.k6.C2404e;
import ax.k6.C2406g;
import ax.k6.C2408i;
import com.google.android.material.internal.CheckableImageButton;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
class z extends LinearLayout {
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

    z(TextInputLayout textInputLayout, L l) {
        super(textInputLayout.getContext());
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C2408i.h, (ViewGroup) this, false);
        this.d = checkableImageButton;
        t.e(checkableImageButton);
        androidx.appcompat.widget.x xVar = new androidx.appcompat.widget.x(getContext());
        this.b = xVar;
        j(l);
        i(l);
        addView(checkableImageButton);
        addView(xVar);
    }

    private void C() {
        int i = (this.c == null || this.j) ? 8 : 0;
        setVisibility((this.d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.b.setVisibility(i);
        this.a.p0();
    }

    private void i(L l) {
        this.b.setVisibility(8);
        this.b.setId(C2406g.U);
        this.b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.b.setAccessibilityLiveRegion(1);
        o(l.n(ax.k6.m.a7, 0));
        int i = ax.k6.m.b7;
        if (l.s(i)) {
            p(l.c(i));
        }
        n(l.p(ax.k6.m.Z6));
    }

    private void j(L l) {
        if (ax.K6.c.h(getContext())) {
            ((ViewGroup.MarginLayoutParams) this.d.getLayoutParams()).setMarginEnd(0);
        }
        u(null);
        v(null);
        int i = ax.k6.m.h7;
        if (l.s(i)) {
            this.e = ax.K6.c.b(getContext(), l, i);
        }
        int i2 = ax.k6.m.i7;
        if (l.s(i2)) {
            this.f = ax.F6.z.i(l.k(i2, -1), null);
        }
        int i3 = ax.k6.m.e7;
        if (l.s(i3)) {
            s(l.g(i3));
            int i4 = ax.k6.m.d7;
            if (l.s(i4)) {
                r(l.p(i4));
            }
            q(l.a(ax.k6.m.c7, true));
        }
        t(l.f(ax.k6.m.f7, getResources().getDimensionPixelSize(C2404e.o0)));
        int i5 = ax.k6.m.g7;
        if (l.s(i5)) {
            w(t.b(l.k(i5, -1)));
        }
    }

    void A(H h) {
        if (this.b.getVisibility() != 0) {
            h.N0(this.d);
        } else {
            h.y0(this.b);
            h.N0(this.b);
        }
    }

    void B() {
        EditText editText = this.a.e;
        if (editText == null) {
            return;
        }
        this.b.setPaddingRelative(k() ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C2404e.P), editText.getCompoundPaddingBottom());
    }

    CharSequence a() {
        return this.c;
    }

    ColorStateList b() {
        return this.b.getTextColors();
    }

    int c() {
        return getPaddingStart() + this.b.getPaddingStart() + (k() ? this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.d.getLayoutParams()).getMarginEnd() : 0);
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

    void l(boolean z) {
        this.j = z;
        C();
    }

    void m() {
        t.d(this.a, this.d, this.e);
    }

    void n(CharSequence charSequence) {
        this.c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.b.setText(charSequence);
        C();
    }

    void o(int i) {
        ax.h0.j.m(this.b, i);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        B();
    }

    void p(ColorStateList colorStateList) {
        this.b.setTextColor(colorStateList);
    }

    void q(boolean z) {
        this.d.setCheckable(z);
    }

    void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.d.setContentDescription(charSequence);
        }
    }

    void s(Drawable drawable) {
        this.d.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.a, this.d, this.e, this.f);
            z(true);
            m();
        } else {
            z(false);
            u(null);
            v(null);
            r(null);
        }
    }

    void t(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != this.g) {
            this.g = i;
            t.g(this.d, i);
        }
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

    void z(boolean z) {
        if (k() != z) {
            this.d.setVisibility(z ? 0 : 8);
            B();
            C();
        }
    }
}
