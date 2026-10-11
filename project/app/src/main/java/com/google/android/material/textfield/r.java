/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.L;
import androidx.appcompat.widget.x;
import ax.F6.v;
import ax.F6.z;
import ax.K6.c;
import ax.h0.j;
import ax.k6.e;
import ax.k6.i;
import ax.k6.k;
import ax.k6.m;
import ax.o.a;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.f;
import com.google.android.material.textfield.g;
import com.google.android.material.textfield.p;
import com.google.android.material.textfield.s;
import com.google.android.material.textfield.t;
import com.google.android.material.textfield.w;
import com.google.android.material.textfield.y;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedHashSet;

@SuppressLint(value={"ViewConstructor"})
class r
extends LinearLayout {
    final TextInputLayout a;
    private final FrameLayout b;
    private final CheckableImageButton c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private View.OnLongClickListener f;
    private final CheckableImageButton g;
    private final d h;
    private int i = 0;
    private final LinkedHashSet<TextInputLayout.h> j = new LinkedHashSet();
    private ColorStateList k;
    private PorterDuff.Mode l;
    private int m;
    private ImageView.ScaleType n;
    private View.OnLongClickListener o;
    private CharSequence p;
    private final TextView q;
    private boolean r;
    private EditText s;
    private final AccessibilityManager t;
    private AccessibilityManager.TouchExplorationStateChangeListener u;
    private final TextWatcher v = new v(this){
        final r a;
        {
            this.a = r8;
        }

        public void afterTextChanged(Editable editable) {
            this.a.m().a(editable);
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int n8, int n9, int n10) {
            this.a.m().b(charSequence, n8, n9, n10);
        }
    };
    private final TextInputLayout.g w;

    r(TextInputLayout textInputLayout, L l8) {
        super(textInputLayout.getContext());
        CheckableImageButton checkableImageButton;
        CheckableImageButton checkableImageButton2;
        FrameLayout frameLayout;
        TextInputLayout.g g8;
        this.w = g8 = new TextInputLayout.g(this){
            final r a;
            {
                this.a = r8;
            }

            @Override
            public void a(TextInputLayout linearLayout) {
                if (this.a.s == linearLayout.getEditText()) {
                    return;
                }
                if (this.a.s != null) {
                    this.a.s.removeTextChangedListener(this.a.v);
                    if (this.a.s.getOnFocusChangeListener() == this.a.m().e()) {
                        this.a.s.setOnFocusChangeListener(null);
                    }
                }
                com.google.android.material.textfield.r.b(this.a, linearLayout.getEditText());
                if (this.a.s != null) {
                    this.a.s.addTextChangedListener(this.a.v);
                }
                this.a.m().n(this.a.s);
                linearLayout = this.a;
                ((r)linearLayout).h0(linearLayout.m());
            }
        };
        this.t = (AccessibilityManager)this.getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        this.setVisibility(8);
        this.setOrientation(0);
        this.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-2, -1, 0x800005));
        this.b = frameLayout = new FrameLayout(this.getContext());
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-2, -1));
        Object object = LayoutInflater.from((Context)this.getContext());
        this.c = checkableImageButton2 = this.i((ViewGroup)this, (LayoutInflater)object, ax.k6.g.P);
        this.g = checkableImageButton = this.i((ViewGroup)frameLayout, (LayoutInflater)object, ax.k6.g.O);
        this.h = new d(this, l8);
        object = new x(this.getContext());
        this.q = object;
        this.C(l8);
        this.B(l8);
        this.D(l8);
        frameLayout.addView((View)checkableImageButton);
        this.addView((View)object);
        this.addView((View)frameLayout);
        this.addView((View)checkableImageButton2);
        textInputLayout.j(g8);
        this.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this){
            final r a;
            {
                this.a = r8;
            }

            public void onViewAttachedToWindow(View view) {
                this.a.g();
            }

            public void onViewDetachedFromWindow(View view) {
                this.a.M();
            }
        });
    }

    private void B(L l8) {
        int n8;
        int n9 = ax.k6.m.T6;
        if (!l8.s(n9)) {
            n8 = ax.k6.m.x6;
            if (l8.s(n8)) {
                this.k = ax.K6.c.b(this.getContext(), l8, n8);
            }
            if (l8.s(n8 = ax.k6.m.y6)) {
                this.l = z.i(l8.k(n8, -1), null);
            }
        }
        if (l8.s(n8 = ax.k6.m.v6)) {
            this.U(l8.k(n8, 0));
            n9 = ax.k6.m.s6;
            if (l8.s(n9)) {
                this.Q(l8.p(n9));
            }
            this.O(l8.a(ax.k6.m.r6, true));
        } else if (l8.s(n9)) {
            n8 = ax.k6.m.U6;
            if (l8.s(n8)) {
                this.k = ax.K6.c.b(this.getContext(), l8, n8);
            }
            if (l8.s(n8 = ax.k6.m.V6)) {
                this.l = z.i(l8.k(n8, -1), null);
            }
            this.U(l8.a(n9, false) ? 1 : 0);
            this.Q(l8.p(ax.k6.m.R6));
        }
        this.T(l8.f(ax.k6.m.u6, this.getResources().getDimensionPixelSize(ax.k6.e.o0)));
        n9 = ax.k6.m.w6;
        if (l8.s(n9)) {
            this.X(com.google.android.material.textfield.t.b(l8.k(n9, -1)));
        }
    }

    private void C(L l8) {
        int n8 = ax.k6.m.D6;
        if (l8.s(n8)) {
            this.d = ax.K6.c.b(this.getContext(), l8, n8);
        }
        if (l8.s(n8 = ax.k6.m.E6)) {
            this.e = z.i(l8.k(n8, -1), null);
        }
        if (l8.s(n8 = ax.k6.m.C6)) {
            this.c0(l8.g(n8));
        }
        this.c.setContentDescription(this.getResources().getText(ax.k6.k.f));
        this.c.setImportantForAccessibility(2);
        this.c.setClickable(false);
        this.c.setPressable(false);
        this.c.setCheckable(false);
        this.c.setFocusable(false);
    }

    private void D(L l8) {
        this.q.setVisibility(8);
        this.q.setId(ax.k6.g.V);
        this.q.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-2, -2, 80.0f));
        this.q.setAccessibilityLiveRegion(1);
        this.q0(l8.n(ax.k6.m.k7, 0));
        int n8 = ax.k6.m.l7;
        if (l8.s(n8)) {
            this.r0(l8.c(n8));
        }
        this.p0(l8.p(ax.k6.m.j7));
    }

    private void M() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.u;
        if (touchExplorationStateChangeListener != null && (accessibilityManager = this.t) != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
    }

    static /* synthetic */ EditText b(r r8, EditText editText) {
        r8.s = editText;
        return editText;
    }

    private void g() {
        if (this.u != null && this.t != null && this.isAttachedToWindow()) {
            this.t.addTouchExplorationStateChangeListener(this.u);
        }
    }

    private void h0(s s8) {
        if (this.s != null) {
            if (s8.e() != null) {
                this.s.setOnFocusChangeListener(s8.e());
            }
            if (s8.g() != null) {
                this.g.setOnFocusChangeListener(s8.g());
            }
        }
    }

    private CheckableImageButton i(ViewGroup object, LayoutInflater layoutInflater, int n8) {
        object = (CheckableImageButton)layoutInflater.inflate(ax.k6.i.g, object, false);
        object.setId(n8);
        com.google.android.material.textfield.t.e((CheckableImageButton)((Object)object));
        if (ax.K6.c.h(this.getContext())) {
            ((ViewGroup.MarginLayoutParams)object.getLayoutParams()).setMarginStart(0);
        }
        return object;
    }

    private void j(int n8) {
        Iterator iterator = ((AbstractCollection)this.j).iterator();
        while (iterator.hasNext()) {
            ((TextInputLayout.h)iterator.next()).a(this.a, n8);
        }
    }

    private void s0(s s8) {
        s8.s();
        this.u = s8.h();
        this.g();
    }

    private int t(s s8) {
        int n8 = this.h.c;
        if (n8 == 0) {
            return s8.d();
        }
        return n8;
    }

    private void t0(s s8) {
        this.M();
        this.u = null;
        s8.u();
    }

    private void u0(boolean bl) {
        if (bl && this.n() != null) {
            Drawable drawable = ax.U.a.r(this.n()).mutate();
            drawable.setTint(this.a.getErrorCurrentTextColors());
            this.g.setImageDrawable(drawable);
            return;
        }
        com.google.android.material.textfield.t.a(this.a, this.g, this.k, this.l);
    }

    private void v0() {
        FrameLayout frameLayout = this.b;
        int n8 = this.g.getVisibility();
        int n9 = 8;
        n8 = n8 == 0 && !this.G() ? 0 : 8;
        frameLayout.setVisibility(n8);
        n8 = this.p != null && !this.r ? 0 : 8;
        if (this.F() || this.G() || n8 == 0) {
            n9 = 0;
        }
        this.setVisibility(n9);
    }

    private void w0() {
        Object object = this.s();
        int n8 = 0;
        int n9 = object != null && this.a.O() && this.a.d0() ? 1 : 0;
        object = this.c;
        n9 = n9 != 0 ? n8 : 8;
        object.setVisibility(n9);
        this.v0();
        this.x0();
        if (!this.A()) {
            this.a.p0();
        }
    }

    private void y0() {
        int n8 = this.q.getVisibility();
        Object object = this.p;
        boolean bl = false;
        int n9 = object != null && !this.r ? 0 : 8;
        if (n8 != n9) {
            object = this.m();
            if (n9 == 0) {
                bl = true;
            }
            ((s)object).q(bl);
        }
        this.v0();
        this.q.setVisibility(n9);
        this.a.p0();
    }

    boolean A() {
        return this.i != 0;
    }

    boolean E() {
        return this.A() && this.g.isChecked();
    }

    boolean F() {
        return this.b.getVisibility() == 0 && this.g.getVisibility() == 0;
    }

    boolean G() {
        return this.c.getVisibility() == 0;
    }

    void H(boolean bl) {
        this.r = bl;
        this.y0();
    }

    void I() {
        this.w0();
        this.K();
        this.J();
        if (this.m().t()) {
            this.u0(this.a.d0());
        }
    }

    void J() {
        com.google.android.material.textfield.t.d(this.a, this.g, this.k);
    }

    void K() {
        com.google.android.material.textfield.t.d(this.a, this.c, this.d);
    }

    void L(boolean bl) {
        boolean bl2;
        s s8 = this.m();
        boolean bl3 = s8.l();
        boolean bl4 = true;
        if (bl3 && (bl3 = this.g.isChecked()) != s8.m()) {
            this.g.setChecked(bl3 ^ true);
            bl2 = true;
        } else {
            bl2 = false;
        }
        if (s8.j() && (bl3 = this.g.isActivated()) != s8.k()) {
            this.N(bl3 ^ true);
            bl2 = bl4;
        }
        if (!bl && !bl2) {
            return;
        }
        this.J();
    }

    void N(boolean bl) {
        this.g.setActivated(bl);
    }

    void O(boolean bl) {
        this.g.setCheckable(bl);
    }

    void P(int n8) {
        CharSequence charSequence = n8 != 0 ? this.getResources().getText(n8) : null;
        this.Q(charSequence);
    }

    void Q(CharSequence charSequence) {
        if (this.l() != charSequence) {
            this.g.setContentDescription(charSequence);
        }
    }

    void R(int n8) {
        Drawable drawable = n8 != 0 ? ax.o.a.b(this.getContext(), n8) : null;
        this.S(drawable);
    }

    void S(Drawable drawable) {
        this.g.setImageDrawable(drawable);
        if (drawable != null) {
            com.google.android.material.textfield.t.a(this.a, this.g, this.k, this.l);
            this.J();
        }
    }

    void T(int n8) {
        if (n8 >= 0) {
            if (n8 != this.m) {
                this.m = n8;
                com.google.android.material.textfield.t.g(this.g, n8);
                com.google.android.material.textfield.t.g(this.c, n8);
            }
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    void U(int n8) {
        if (this.i == n8) {
            return;
        }
        this.t0(this.m());
        int n9 = this.i;
        this.i = n8;
        this.j(n9);
        boolean bl = n8 != 0;
        this.a0(bl);
        s s8 = this.m();
        this.R(this.t(s8));
        this.P(s8.c());
        this.O(s8.l());
        if (s8.i(this.a.getBoxBackgroundMode())) {
            this.s0(s8);
            this.V(s8.f());
            EditText editText = this.s;
            if (editText != null) {
                s8.n(editText);
                this.h0(s8);
            }
            com.google.android.material.textfield.t.a(this.a, this.g, this.k, this.l);
            this.L(true);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The current box background mode ");
        stringBuilder.append(this.a.getBoxBackgroundMode());
        stringBuilder.append(" is not supported by the end icon mode ");
        stringBuilder.append(n8);
        throw new IllegalStateException(stringBuilder.toString());
    }

    void V(View.OnClickListener onClickListener) {
        com.google.android.material.textfield.t.h(this.g, onClickListener, this.o);
    }

    void W(View.OnLongClickListener onLongClickListener) {
        this.o = onLongClickListener;
        com.google.android.material.textfield.t.i(this.g, onLongClickListener);
    }

    void X(ImageView.ScaleType scaleType) {
        this.n = scaleType;
        com.google.android.material.textfield.t.j(this.g, scaleType);
        com.google.android.material.textfield.t.j(this.c, scaleType);
    }

    void Y(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            com.google.android.material.textfield.t.a(this.a, this.g, colorStateList, this.l);
        }
    }

    void Z(PorterDuff.Mode mode) {
        if (this.l != mode) {
            this.l = mode;
            com.google.android.material.textfield.t.a(this.a, this.g, this.k, mode);
        }
    }

    void a0(boolean bl) {
        if (this.F() != bl) {
            CheckableImageButton checkableImageButton = this.g;
            int n8 = bl ? 0 : 8;
            checkableImageButton.setVisibility(n8);
            this.v0();
            this.x0();
            this.a.p0();
        }
    }

    void b0(int n8) {
        Drawable drawable = n8 != 0 ? ax.o.a.b(this.getContext(), n8) : null;
        this.c0(drawable);
        this.K();
    }

    void c0(Drawable drawable) {
        this.c.setImageDrawable(drawable);
        this.w0();
        com.google.android.material.textfield.t.a(this.a, this.c, this.d, this.e);
    }

    void d0(View.OnClickListener onClickListener) {
        com.google.android.material.textfield.t.h(this.c, onClickListener, this.f);
    }

    void e0(View.OnLongClickListener onLongClickListener) {
        this.f = onLongClickListener;
        com.google.android.material.textfield.t.i(this.c, onLongClickListener);
    }

    void f0(ColorStateList colorStateList) {
        if (this.d != colorStateList) {
            this.d = colorStateList;
            com.google.android.material.textfield.t.a(this.a, this.c, colorStateList, this.e);
        }
    }

    void g0(PorterDuff.Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            com.google.android.material.textfield.t.a(this.a, this.c, this.d, mode);
        }
    }

    void h() {
        this.g.performClick();
        this.g.jumpDrawablesToCurrentState();
    }

    void i0(int n8) {
        CharSequence charSequence = n8 != 0 ? this.getResources().getText(n8) : null;
        this.j0(charSequence);
    }

    void j0(CharSequence charSequence) {
        this.g.setContentDescription(charSequence);
    }

    CheckableImageButton k() {
        if (this.G()) {
            return this.c;
        }
        if (this.A() && this.F()) {
            return this.g;
        }
        return null;
    }

    void k0(int n8) {
        Drawable drawable = n8 != 0 ? ax.o.a.b(this.getContext(), n8) : null;
        this.l0(drawable);
    }

    CharSequence l() {
        return this.g.getContentDescription();
    }

    void l0(Drawable drawable) {
        this.g.setImageDrawable(drawable);
    }

    s m() {
        return this.h.c(this.i);
    }

    void m0(boolean bl) {
        if (bl && this.i != 1) {
            this.U(1);
            return;
        }
        if (!bl) {
            this.U(0);
        }
    }

    Drawable n() {
        return this.g.getDrawable();
    }

    void n0(ColorStateList colorStateList) {
        this.k = colorStateList;
        com.google.android.material.textfield.t.a(this.a, this.g, colorStateList, this.l);
    }

    int o() {
        return this.m;
    }

    void o0(PorterDuff.Mode mode) {
        this.l = mode;
        com.google.android.material.textfield.t.a(this.a, this.g, this.k, mode);
    }

    int p() {
        return this.i;
    }

    void p0(CharSequence charSequence) {
        CharSequence charSequence2 = TextUtils.isEmpty((CharSequence)charSequence) ? null : charSequence;
        this.p = charSequence2;
        this.q.setText(charSequence);
        this.y0();
    }

    ImageView.ScaleType q() {
        return this.n;
    }

    void q0(int n8) {
        ax.h0.j.m(this.q, n8);
    }

    CheckableImageButton r() {
        return this.g;
    }

    void r0(ColorStateList colorStateList) {
        this.q.setTextColor(colorStateList);
    }

    Drawable s() {
        return this.c.getDrawable();
    }

    CharSequence u() {
        return this.g.getContentDescription();
    }

    Drawable v() {
        return this.g.getDrawable();
    }

    CharSequence w() {
        return this.p;
    }

    ColorStateList x() {
        return this.q.getTextColors();
    }

    void x0() {
        if (this.a.e == null) {
            return;
        }
        int n8 = !this.F() && !this.G() ? this.a.e.getPaddingEnd() : 0;
        this.q.setPaddingRelative(this.getContext().getResources().getDimensionPixelSize(ax.k6.e.P), this.a.e.getPaddingTop(), n8, this.a.e.getPaddingBottom());
    }

    int y() {
        int n8 = !this.F() && !this.G() ? 0 : this.g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams)this.g.getLayoutParams()).getMarginStart();
        return this.getPaddingEnd() + this.q.getPaddingEnd() + n8;
    }

    TextView z() {
        return this.q;
    }

    private static class d {
        private final SparseArray<s> a = new SparseArray();
        private final r b;
        private final int c;
        private final int d;

        d(r r8, L l8) {
            this.b = r8;
            this.c = l8.n(ax.k6.m.t6, 0);
            this.d = l8.n(ax.k6.m.S6, 0);
        }

        private s b(int n8) {
            if (n8 != -1) {
                if (n8 != 0) {
                    if (n8 != 1) {
                        if (n8 != 2) {
                            if (n8 == 3) {
                                return new p(this.b);
                            }
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Invalid end icon mode: ");
                            stringBuilder.append(n8);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        return new f(this.b);
                    }
                    return new y(this.b, this.d);
                }
                return new w(this.b);
            }
            return new g(this.b);
        }

        s c(int n8) {
            s s8;
            s s9 = s8 = (s)this.a.get(n8);
            if (s8 == null) {
                s9 = this.b(n8);
                this.a.append(n8, (Object)s9);
            }
            return s9;
        }
    }
}

