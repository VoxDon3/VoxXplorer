package com.google.android.material.textfield;

import android.annotation.SuppressLint;
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
import ax.k6.C2404e;
import ax.k6.C2406g;
import ax.k6.C2408i;
import ax.k6.C2410k;
import ax.o.C2653a;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
class r extends LinearLayout {
    final TextInputLayout a;
    private final FrameLayout b;
    private final CheckableImageButton c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private View.OnLongClickListener f;
    private final CheckableImageButton g;
    private final d h;
    private int i;
    private final LinkedHashSet<TextInputLayout.h> j;
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
    private final TextWatcher v;
    private final TextInputLayout.g w;

    class a extends ax.F6.v {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            r.this.m().a(editable);
        }

        @Override // ax.F6.v, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            r.this.m().b(charSequence, i, i2, i3);
        }
    }

    class b implements TextInputLayout.g {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout) {
            if (r.this.s == textInputLayout.getEditText()) {
                return;
            }
            if (r.this.s != null) {
                r.this.s.removeTextChangedListener(r.this.v);
                if (r.this.s.getOnFocusChangeListener() == r.this.m().e()) {
                    r.this.s.setOnFocusChangeListener(null);
                }
            }
            r.this.s = textInputLayout.getEditText();
            if (r.this.s != null) {
                r.this.s.addTextChangedListener(r.this.v);
            }
            r.this.m().n(r.this.s);
            r rVar = r.this;
            rVar.h0(rVar.m());
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            r.this.g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            r.this.M();
        }
    }

    private static class d {
        private final SparseArray<s> a = new SparseArray<>();
        private final r b;
        private final int c;
        private final int d;

        d(r rVar, L l) {
            this.b = rVar;
            this.c = l.n(ax.k6.m.t6, 0);
            this.d = l.n(ax.k6.m.S6, 0);
        }

        private s b(int i) {
            if (i == -1) {
                return new g(this.b);
            }
            if (i == 0) {
                return new w(this.b);
            }
            if (i == 1) {
                return new y(this.b, this.d);
            }
            if (i == 2) {
                return new f(this.b);
            }
            if (i == 3) {
                return new p(this.b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i);
        }

        s c(int i) {
            s sVar = this.a.get(i);
            if (sVar != null) {
                return sVar;
            }
            s b = b(i);
            this.a.append(i, b);
            return b;
        }
    }

    r(TextInputLayout textInputLayout, L l) {
        super(textInputLayout.getContext());
        this.i = 0;
        this.j = new LinkedHashSet<>();
        this.v = new a();
        b bVar = new b();
        this.w = bVar;
        this.t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton i = i(this, from, C2406g.P);
        this.c = i;
        CheckableImageButton i2 = i(frameLayout, from, C2406g.O);
        this.g = i2;
        this.h = new d(this, l);
        androidx.appcompat.widget.x xVar = new androidx.appcompat.widget.x(getContext());
        this.q = xVar;
        C(l);
        B(l);
        D(l);
        frameLayout.addView(i2);
        addView(xVar);
        addView(frameLayout);
        addView(i);
        textInputLayout.j(bVar);
        addOnAttachStateChangeListener(new c());
    }

    private void B(L l) {
        int i = ax.k6.m.T6;
        if (!l.s(i)) {
            int i2 = ax.k6.m.x6;
            if (l.s(i2)) {
                this.k = ax.K6.c.b(getContext(), l, i2);
            }
            int i3 = ax.k6.m.y6;
            if (l.s(i3)) {
                this.l = ax.F6.z.i(l.k(i3, -1), null);
            }
        }
        int i4 = ax.k6.m.v6;
        if (l.s(i4)) {
            U(l.k(i4, 0));
            int i5 = ax.k6.m.s6;
            if (l.s(i5)) {
                Q(l.p(i5));
            }
            O(l.a(ax.k6.m.r6, true));
        } else if (l.s(i)) {
            int i6 = ax.k6.m.U6;
            if (l.s(i6)) {
                this.k = ax.K6.c.b(getContext(), l, i6);
            }
            int i7 = ax.k6.m.V6;
            if (l.s(i7)) {
                this.l = ax.F6.z.i(l.k(i7, -1), null);
            }
            U(l.a(i, false) ? 1 : 0);
            Q(l.p(ax.k6.m.R6));
        }
        T(l.f(ax.k6.m.u6, getResources().getDimensionPixelSize(C2404e.o0)));
        int i8 = ax.k6.m.w6;
        if (l.s(i8)) {
            X(t.b(l.k(i8, -1)));
        }
    }

    private void C(L l) {
        int i = ax.k6.m.D6;
        if (l.s(i)) {
            this.d = ax.K6.c.b(getContext(), l, i);
        }
        int i2 = ax.k6.m.E6;
        if (l.s(i2)) {
            this.e = ax.F6.z.i(l.k(i2, -1), null);
        }
        int i3 = ax.k6.m.C6;
        if (l.s(i3)) {
            c0(l.g(i3));
        }
        this.c.setContentDescription(getResources().getText(C2410k.f));
        this.c.setImportantForAccessibility(2);
        this.c.setClickable(false);
        this.c.setPressable(false);
        this.c.setCheckable(false);
        this.c.setFocusable(false);
    }

    private void D(L l) {
        this.q.setVisibility(8);
        this.q.setId(C2406g.V);
        this.q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        this.q.setAccessibilityLiveRegion(1);
        q0(l.n(ax.k6.m.k7, 0));
        int i = ax.k6.m.l7;
        if (l.s(i)) {
            r0(l.c(i));
        }
        p0(l.p(ax.k6.m.j7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.u;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.t) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.u == null || this.t == null || !isAttachedToWindow()) {
            return;
        }
        this.t.addTouchExplorationStateChangeListener(this.u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(s sVar) {
        if (this.s == null) {
            return;
        }
        if (sVar.e() != null) {
            this.s.setOnFocusChangeListener(sVar.e());
        }
        if (sVar.g() != null) {
            this.g.setOnFocusChangeListener(sVar.g());
        }
    }

    private CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(C2408i.g, viewGroup, false);
        checkableImageButton.setId(i);
        t.e(checkableImageButton);
        if (ax.K6.c.h(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    private void j(int i) {
        Iterator<TextInputLayout.h> it = this.j.iterator();
        while (it.hasNext()) {
            it.next().a(this.a, i);
        }
    }

    private void s0(s sVar) {
        sVar.s();
        this.u = sVar.h();
        g();
    }

    private int t(s sVar) {
        int i = this.h.c;
        return i == 0 ? sVar.d() : i;
    }

    private void t0(s sVar) {
        M();
        this.u = null;
        sVar.u();
    }

    private void u0(boolean z) {
        if (!z || n() == null) {
            t.a(this.a, this.g, this.k, this.l);
            return;
        }
        Drawable mutate = ax.U.a.r(n()).mutate();
        mutate.setTint(this.a.getErrorCurrentTextColors());
        this.g.setImageDrawable(mutate);
    }

    private void v0() {
        this.b.setVisibility((this.g.getVisibility() != 0 || G()) ? 8 : 0);
        setVisibility((F() || G() || ((this.p == null || this.r) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    private void w0() {
        this.c.setVisibility(s() != null && this.a.O() && this.a.d0() ? 0 : 8);
        v0();
        x0();
        if (A()) {
            return;
        }
        this.a.p0();
    }

    private void y0() {
        int visibility = this.q.getVisibility();
        int i = (this.p == null || this.r) ? 8 : 0;
        if (visibility != i) {
            m().q(i == 0);
        }
        v0();
        this.q.setVisibility(i);
        this.a.p0();
    }

    boolean A() {
        return this.i != 0;
    }

    boolean E() {
        return A() && this.g.isChecked();
    }

    boolean F() {
        return this.b.getVisibility() == 0 && this.g.getVisibility() == 0;
    }

    boolean G() {
        return this.c.getVisibility() == 0;
    }

    void H(boolean z) {
        this.r = z;
        y0();
    }

    void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.a.d0());
        }
    }

    void J() {
        t.d(this.a, this.g, this.k);
    }

    void K() {
        t.d(this.a, this.c, this.d);
    }

    void L(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean isChecked;
        s m = m();
        boolean z3 = true;
        if (!m.l() || (isChecked = this.g.isChecked()) == m.m()) {
            z2 = false;
        } else {
            this.g.setChecked(!isChecked);
            z2 = true;
        }
        if (!m.j() || (isActivated = this.g.isActivated()) == m.k()) {
            z3 = z2;
        } else {
            N(!isActivated);
        }
        if (z || z3) {
            J();
        }
    }

    void N(boolean z) {
        this.g.setActivated(z);
    }

    void O(boolean z) {
        this.g.setCheckable(z);
    }

    void P(int i) {
        Q(i != 0 ? getResources().getText(i) : null);
    }

    void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.g.setContentDescription(charSequence);
        }
    }

    void R(int i) {
        S(i != 0 ? C2653a.b(getContext(), i) : null);
    }

    void S(Drawable drawable) {
        this.g.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.a, this.g, this.k, this.l);
            J();
        }
    }

    void T(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != this.m) {
            this.m = i;
            t.g(this.g, i);
            t.g(this.c, i);
        }
    }

    void U(int i) {
        if (this.i == i) {
            return;
        }
        t0(m());
        int i2 = this.i;
        this.i = i;
        j(i2);
        a0(i != 0);
        s m = m();
        R(t(m));
        P(m.c());
        O(m.l());
        if (!m.i(this.a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        s0(m);
        V(m.f());
        EditText editText = this.s;
        if (editText != null) {
            m.n(editText);
            h0(m);
        }
        t.a(this.a, this.g, this.k, this.l);
        L(true);
    }

    void V(View.OnClickListener onClickListener) {
        t.h(this.g, onClickListener, this.o);
    }

    void W(View.OnLongClickListener onLongClickListener) {
        this.o = onLongClickListener;
        t.i(this.g, onLongClickListener);
    }

    void X(ImageView.ScaleType scaleType) {
        this.n = scaleType;
        t.j(this.g, scaleType);
        t.j(this.c, scaleType);
    }

    void Y(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            t.a(this.a, this.g, colorStateList, this.l);
        }
    }

    void Z(PorterDuff.Mode mode) {
        if (this.l != mode) {
            this.l = mode;
            t.a(this.a, this.g, this.k, mode);
        }
    }

    void a0(boolean z) {
        if (F() != z) {
            this.g.setVisibility(z ? 0 : 8);
            v0();
            x0();
            this.a.p0();
        }
    }

    void b0(int i) {
        c0(i != 0 ? C2653a.b(getContext(), i) : null);
        K();
    }

    void c0(Drawable drawable) {
        this.c.setImageDrawable(drawable);
        w0();
        t.a(this.a, this.c, this.d, this.e);
    }

    void d0(View.OnClickListener onClickListener) {
        t.h(this.c, onClickListener, this.f);
    }

    void e0(View.OnLongClickListener onLongClickListener) {
        this.f = onLongClickListener;
        t.i(this.c, onLongClickListener);
    }

    void f0(ColorStateList colorStateList) {
        if (this.d != colorStateList) {
            this.d = colorStateList;
            t.a(this.a, this.c, colorStateList, this.e);
        }
    }

    void g0(PorterDuff.Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            t.a(this.a, this.c, this.d, mode);
        }
    }

    void h() {
        this.g.performClick();
        this.g.jumpDrawablesToCurrentState();
    }

    void i0(int i) {
        j0(i != 0 ? getResources().getText(i) : null);
    }

    void j0(CharSequence charSequence) {
        this.g.setContentDescription(charSequence);
    }

    CheckableImageButton k() {
        if (G()) {
            return this.c;
        }
        if (A() && F()) {
            return this.g;
        }
        return null;
    }

    void k0(int i) {
        l0(i != 0 ? C2653a.b(getContext(), i) : null);
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

    void m0(boolean z) {
        if (z && this.i != 1) {
            U(1);
        } else {
            if (z) {
                return;
            }
            U(0);
        }
    }

    Drawable n() {
        return this.g.getDrawable();
    }

    void n0(ColorStateList colorStateList) {
        this.k = colorStateList;
        t.a(this.a, this.g, colorStateList, this.l);
    }

    int o() {
        return this.m;
    }

    void o0(PorterDuff.Mode mode) {
        this.l = mode;
        t.a(this.a, this.g, this.k, mode);
    }

    int p() {
        return this.i;
    }

    void p0(CharSequence charSequence) {
        this.p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.q.setText(charSequence);
        y0();
    }

    ImageView.ScaleType q() {
        return this.n;
    }

    void q0(int i) {
        ax.h0.j.m(this.q, i);
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
        this.q.setPaddingRelative(getContext().getResources().getDimensionPixelSize(C2404e.P), this.a.e.getPaddingTop(), (F() || G()) ? 0 : this.a.e.getPaddingEnd(), this.a.e.getPaddingBottom());
    }

    int y() {
        return getPaddingEnd() + this.q.getPaddingEnd() + ((F() || G()) ? this.g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.g.getLayoutParams()).getMarginStart() : 0);
    }

    TextView z() {
        return this.q;
    }
}
