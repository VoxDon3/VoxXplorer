/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.A;
import androidx.appcompat.widget.L;
import androidx.appcompat.widget.x;
import ax.F6.s;
import ax.F6.w;
import ax.O6.l;
import ax.Q.b;
import ax.T6.n;
import ax.T6.o;
import ax.T6.p;
import ax.a0.a;
import ax.c0.d0;
import ax.d0.H;
import ax.h0.j;
import ax.k6.d;
import ax.k6.l;
import ax.k6.m;
import ax.v2.c;
import ax.v2.k;
import ax.v2.t;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.q;
import com.google.android.material.textfield.r;
import com.google.android.material.textfield.u;
import com.google.android.material.textfield.v;
import com.google.android.material.textfield.z;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TextInputLayout
extends LinearLayout
implements ViewTreeObserver.OnGlobalLayoutListener {
    private static final int D0 = ax.k6.l.l;
    private static final int[][] E0 = new int[][]{{16842919}, new int[0]};
    private ColorStateList A;
    private boolean A0;
    private ColorStateList B;
    private boolean B0;
    private ColorStateList C;
    private boolean C0;
    private boolean D;
    private CharSequence E;
    private boolean F;
    private ax.O6.h G;
    private ax.O6.h H;
    private StateListDrawable I;
    private boolean J;
    private ax.O6.h K;
    private ax.O6.h L;
    private ax.O6.l M;
    private boolean N;
    private final int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private final Rect W;
    private final FrameLayout a;
    private final Rect a0;
    private final z b;
    private final RectF b0;
    private final r c;
    private Typeface c0;
    private final int d;
    private Drawable d0;
    EditText e;
    private int e0;
    private CharSequence f;
    private final LinkedHashSet<g> f0;
    private int g;
    private Drawable g0;
    private int h;
    private int h0;
    private int i;
    private Drawable i0;
    private int j;
    private ColorStateList j0;
    private final u k;
    private ColorStateList k0;
    boolean l;
    private int l0;
    private int m;
    private int m0;
    private boolean n;
    private int n0;
    private f o;
    private ColorStateList o0;
    private TextView p;
    private int p0;
    private int q;
    private int q0;
    private int r;
    private int r0;
    private CharSequence s;
    private int s0;
    private boolean t;
    private int t0;
    private TextView u;
    int u0;
    private ColorStateList v;
    private boolean v0;
    private int w;
    final ax.F6.a w0;
    private c x;
    private boolean x0;
    private c y;
    private boolean y0;
    private ColorStateList z;
    private ValueAnimator z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.k6.c.h0);
    }

    public TextInputLayout(Context context, AttributeSet object, int n8) {
        Object object2;
        int n9 = D0;
        super(ax.V6.a.d(context, (AttributeSet)object, n8, n9), (AttributeSet)object, n8);
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = new u(this);
        this.o = new o();
        this.W = new Rect();
        this.a0 = new Rect();
        this.b0 = new RectF();
        this.f0 = new LinkedHashSet();
        this.w0 = object2 = new ax.F6.a((View)this);
        this.C0 = false;
        Object object3 = this.getContext();
        this.setOrientation(1);
        this.setWillNotDraw(false);
        this.setAddStatesFromChildren(true);
        context = new FrameLayout(object3);
        this.a = context;
        context.setAddStatesFromChildren(true);
        Object object4 = ax.l6.a.a;
        object2.o0((TimeInterpolator)object4);
        object2.l0((TimeInterpolator)object4);
        object2.X(0x800033);
        object4 = ax.k6.m.Q5;
        int n10 = ax.k6.m.n6;
        int n11 = ax.k6.m.l6;
        int n12 = ax.k6.m.F6;
        int n13 = ax.k6.m.K6;
        int n14 = ax.k6.m.P6;
        object4 = ax.F6.w.j(object3, (AttributeSet)object, (int[])object4, n8, n9, new int[]{n10, n11, n12, n13, n14});
        object2 = new z(this, (L)object4);
        this.b = object2;
        this.D = ((L)object4).a(ax.k6.m.N6, true);
        this.setHint(((L)object4).p(ax.k6.m.V5));
        this.y0 = ((L)object4).a(ax.k6.m.M6, true);
        this.x0 = ((L)object4).a(ax.k6.m.H6, true);
        int n15 = ax.k6.m.X5;
        if (((L)object4).s(n15)) {
            this.setMinEms(((L)object4).k(n15, -1));
        } else {
            n15 = ax.k6.m.U5;
            if (((L)object4).s(n15)) {
                this.setMinWidth(((L)object4).f(n15, -1));
            }
        }
        n15 = ax.k6.m.W5;
        if (((L)object4).s(n15)) {
            this.setMaxEms(((L)object4).k(n15, -1));
        } else {
            n15 = ax.k6.m.T5;
            if (((L)object4).s(n15)) {
                this.setMaxWidth(((L)object4).f(n15, -1));
            }
        }
        this.M = ax.O6.l.e(object3, (AttributeSet)object, n8, n9).m();
        this.O = object3.getResources().getDimensionPixelOffset(ax.k6.e.u0);
        this.Q = ((L)object4).e(ax.k6.m.a6, 0);
        this.d = this.getResources().getDimensionPixelSize(ax.k6.e.x);
        this.S = ((L)object4).f(ax.k6.m.h6, object3.getResources().getDimensionPixelSize(ax.k6.e.v0));
        this.T = ((L)object4).f(ax.k6.m.i6, object3.getResources().getDimensionPixelSize(ax.k6.e.w0));
        this.R = this.S;
        float f8 = ((L)object4).d(ax.k6.m.e6, -1.0f);
        float f9 = ((L)object4).d(ax.k6.m.d6, -1.0f);
        float f10 = ((L)object4).d(ax.k6.m.b6, -1.0f);
        float f11 = ((L)object4).d(ax.k6.m.c6, -1.0f);
        object = this.M.w();
        if (f8 >= 0.0f) {
            ((l.b)object).C(f8);
        }
        if (f9 >= 0.0f) {
            ((l.b)object).G(f9);
        }
        if (f10 >= 0.0f) {
            ((l.b)object).y(f10);
        }
        if (f11 >= 0.0f) {
            ((l.b)object).u(f11);
        }
        this.M = ((l.b)object).m();
        object = ax.K6.c.b(object3, (L)object4, ax.k6.m.Y5);
        if (object != null) {
            this.p0 = n8 = object.getDefaultColor();
            this.V = n8;
            if (object.isStateful()) {
                this.q0 = object.getColorForState(new int[]{-16842910}, -1);
                this.r0 = object.getColorForState(new int[]{16842908, 16842910}, -1);
                this.s0 = object.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.r0 = this.p0;
                object = ax.o.a.a(object3, ax.k6.d.c);
                this.q0 = object.getColorForState(new int[]{-16842910}, -1);
                this.s0 = object.getColorForState(new int[]{16843623}, -1);
            }
        } else {
            this.V = 0;
            this.p0 = 0;
            this.q0 = 0;
            this.r0 = 0;
            this.s0 = 0;
        }
        n8 = ax.k6.m.S5;
        if (((L)object4).s(n8)) {
            object = ((L)object4).c(n8);
            this.k0 = object;
            this.j0 = object;
        }
        n8 = ax.k6.m.f6;
        object = ax.K6.c.b(object3, (L)object4, n8);
        this.n0 = ((L)object4).b(n8, 0);
        this.l0 = ax.Q.b.c(object3, ax.k6.d.d);
        this.t0 = ax.Q.b.c(object3, ax.k6.d.e);
        this.m0 = ax.Q.b.c(object3, ax.k6.d.f);
        if (object != null) {
            this.setBoxStrokeColorStateList((ColorStateList)object);
        }
        if (((L)object4).s(n8 = ax.k6.m.g6)) {
            this.setBoxStrokeErrorColor(ax.K6.c.b(object3, (L)object4, n8));
        }
        if (((L)object4).n(n14, -1) != -1) {
            this.setHintTextAppearance(((L)object4).n(n14, 0));
        }
        this.B = ((L)object4).c(ax.k6.m.p6);
        this.C = ((L)object4).c(ax.k6.m.q6);
        n12 = ((L)object4).n(n12, 0);
        CharSequence charSequence = ((L)object4).p(ax.k6.m.A6);
        n8 = ((L)object4).k(ax.k6.m.z6, 1);
        boolean bl = ((L)object4).a(ax.k6.m.B6, false);
        n13 = ((L)object4).n(n13, 0);
        boolean bl2 = ((L)object4).a(ax.k6.m.J6, false);
        object = ((L)object4).p(ax.k6.m.I6);
        n14 = ((L)object4).n(ax.k6.m.X6, 0);
        object3 = ((L)object4).p(ax.k6.m.W6);
        boolean bl3 = ((L)object4).a(ax.k6.m.j6, false);
        this.setCounterMaxLength(((L)object4).k(ax.k6.m.k6, -1));
        this.r = ((L)object4).n(n10, 0);
        this.q = ((L)object4).n(n11, 0);
        this.setBoxBackgroundMode(((L)object4).k(ax.k6.m.Z5, 0));
        this.setErrorContentDescription(charSequence);
        this.setErrorAccessibilityLiveRegion(n8);
        this.setCounterOverflowTextAppearance(this.q);
        this.setHelperTextTextAppearance(n13);
        this.setErrorTextAppearance(n12);
        this.setCounterTextAppearance(this.r);
        this.setPlaceholderText((CharSequence)object3);
        this.setPlaceholderTextAppearance(n14);
        n8 = ax.k6.m.G6;
        if (((L)object4).s(n8)) {
            this.setErrorTextColor(((L)object4).c(n8));
        }
        if (((L)object4).s(n8 = ax.k6.m.L6)) {
            this.setHelperTextColor(((L)object4).c(n8));
        }
        if (((L)object4).s(n8 = ax.k6.m.Q6)) {
            this.setHintTextColor(((L)object4).c(n8));
        }
        if (((L)object4).s(n8 = ax.k6.m.o6)) {
            this.setCounterTextColor(((L)object4).c(n8));
        }
        if (((L)object4).s(n8 = ax.k6.m.m6)) {
            this.setCounterOverflowTextColor(((L)object4).c(n8));
        }
        if (((L)object4).s(n8 = ax.k6.m.Y6)) {
            this.setPlaceholderTextColor(((L)object4).c(n8));
        }
        object3 = new r(this, (L)object4);
        this.c = object3;
        boolean bl4 = ((L)object4).a(ax.k6.m.R5, true);
        this.setHintMaxLines(((L)object4).k(ax.k6.m.O6, 1));
        ((L)object4).x();
        this.setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            ax.T6.b.a(this, 1);
        }
        context.addView((View)object2);
        context.addView((View)object3);
        this.addView((View)context);
        this.setEnabled(bl4);
        this.setHelperTextEnabled(bl2);
        this.setErrorEnabled(bl);
        this.setCounterEnabled(bl3);
        this.setHelperText((CharSequence)object);
    }

    private void A(boolean bl) {
        ValueAnimator valueAnimator = this.z0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.z0.cancel();
        }
        if (bl && this.y0) {
            this.m(1.0f);
        } else {
            this.w0.j0(1.0f);
        }
        this.v0 = false;
        if (this.C()) {
            this.W();
        }
        this.z0();
        this.b.l(false);
        this.c.H(false);
    }

    private void A0(Editable editable) {
        if (this.o.a(editable) == 0 && !this.v0) {
            this.g0();
            return;
        }
        this.M();
    }

    private c B() {
        c c8 = new c();
        c8.e0(ax.H6.i.f(this.getContext(), ax.k6.c.H, 87));
        c8.g0(ax.H6.i.g(this.getContext(), ax.k6.c.N, ax.l6.a.a));
        return c8;
    }

    private void B0(boolean bl, boolean bl2) {
        int n8 = this.o0.getDefaultColor();
        int n9 = this.o0.getColorForState(new int[]{16843623, 16842910}, n8);
        int n10 = this.o0.getColorForState(new int[]{16843518, 16842910}, n8);
        if (bl) {
            this.U = n10;
            return;
        }
        if (bl2) {
            this.U = n9;
            return;
        }
        this.U = n8;
    }

    private boolean C() {
        return this.D && !TextUtils.isEmpty((CharSequence)this.E) && this.G instanceof com.google.android.material.textfield.h;
    }

    private void D() {
        Iterator iterator = ((AbstractCollection)this.f0).iterator();
        while (iterator.hasNext()) {
            ((g)iterator.next()).a(this);
        }
    }

    private void E(Canvas canvas) {
        ax.O6.h h8;
        if (this.L != null && (h8 = this.K) != null) {
            h8.draw(canvas);
            if (this.e.isFocused()) {
                h8 = this.L.getBounds();
                Rect rect = this.K.getBounds();
                float f8 = this.w0.B();
                int n8 = rect.centerX();
                ((Rect)h8).left = ax.l6.a.c(n8, rect.left, f8);
                ((Rect)h8).right = ax.l6.a.c(n8, rect.right, f8);
                this.L.draw(canvas);
            }
        }
    }

    private void F(Canvas canvas) {
        if (this.D) {
            this.w0.k(canvas);
        }
    }

    private void G(boolean bl) {
        ValueAnimator valueAnimator = this.z0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.z0.cancel();
        }
        if (bl && this.y0) {
            this.m(0.0f);
        } else {
            this.w0.j0(0.0f);
        }
        if (this.C() && ((com.google.android.material.textfield.h)this.G).z0()) {
            this.z();
        }
        this.v0 = true;
        this.M();
        this.b.l(true);
        this.c.H(true);
    }

    private ax.O6.h H(boolean bl) {
        float f8 = this.getResources().getDimensionPixelOffset(ax.k6.e.s0);
        float f9 = bl ? f8 : 0.0f;
        Object object = this.e;
        float f10 = object instanceof v ? ((v)object).getPopupElevation() : (float)this.getResources().getDimensionPixelOffset(ax.k6.e.w);
        int n8 = this.getResources().getDimensionPixelOffset(ax.k6.e.n0);
        ax.O6.l l8 = ax.O6.l.a().C(f9).G(f9).u(f8).y(f8).m();
        object = this.e;
        object = object instanceof v ? ((v)object).getDropDownBackgroundTintList() : null;
        object = ax.O6.h.r(this.getContext(), f10, (ColorStateList)object);
        ((ax.O6.h)object).setShapeAppearanceModel(l8);
        ((ax.O6.h)object).j0(0, n8, 0, n8);
        return object;
    }

    private static Drawable I(ax.O6.h h8, int n8, int n9, int[][] nArray) {
        return new RippleDrawable(new ColorStateList(nArray, new int[]{ax.z6.a.k(n9, n8, 0.1f), n8}), (Drawable)h8, (Drawable)h8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int J(int n8, boolean bl) {
        int n9;
        if (!bl && this.getPrefixText() != null) {
            n9 = this.b.c();
            return n8 + n9;
        }
        if (bl && this.getSuffixText() != null) {
            n9 = this.c.y();
            return n8 + n9;
        }
        n9 = this.e.getCompoundPaddingLeft();
        return n8 + n9;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int K(int n8, boolean bl) {
        int n9;
        if (!bl && this.getSuffixText() != null) {
            n9 = this.c.y();
            return n8 - n9;
        }
        if (bl && this.getPrefixText() != null) {
            n9 = this.b.c();
            return n8 - n9;
        }
        n9 = this.e.getCompoundPaddingRight();
        return n8 - n9;
    }

    private static Drawable L(Context object, ax.O6.h h8, int n8, int[][] object2) {
        int n9 = ax.z6.a.c((Context)object, ax.k6.c.i, "TextInputLayout");
        object = new ax.O6.h(h8.I());
        n8 = ax.z6.a.k(n8, n9, 0.1f);
        ((ax.O6.h)object).g0(new ColorStateList(object2, new int[]{n8, 0}));
        ((ax.O6.h)object).setTint(n9);
        object2 = new ColorStateList(object2, new int[]{n8, n9});
        ax.O6.h h9 = new ax.O6.h(h8.I());
        h9.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable((ColorStateList)object2, (Drawable)object, (Drawable)h9), h8});
    }

    private void M() {
        TextView textView = this.u;
        if (textView != null && this.t) {
            textView.setText(null);
            ax.v2.t.a((ViewGroup)this.a, this.y);
            this.u.setVisibility(4);
        }
    }

    private boolean R() {
        return this.getHintMaxLines() == 1;
    }

    private boolean S() {
        return this.d0() || this.p != null && this.n;
        {
        }
    }

    private boolean U() {
        return this.P == 1 && this.e.getMinLines() <= 1;
    }

    private void V() {
        this.q();
        this.s0();
        this.C0();
        this.h0();
        this.l();
        if (this.P != 0) {
            this.v0();
        }
        this.b0();
    }

    private void W() {
        if (this.C()) {
            RectF rectF = this.b0;
            this.w0.o(rectF, this.e.getWidth(), this.e.getGravity());
            if (!(rectF.width() <= 0.0f) && !(rectF.height() <= 0.0f)) {
                this.p(rectF);
                rectF.offset((float)(-this.getPaddingLeft()), (float)(-this.getPaddingTop()) - rectF.height() / 2.0f + (float)this.R);
                rectF.top = 0.0f;
                ((com.google.android.material.textfield.h)this.G).C0(rectF);
            }
        }
    }

    private void X() {
        if (this.C() && !this.v0) {
            this.z();
            this.W();
        }
    }

    private static void Y(ViewGroup viewGroup, boolean bl) {
        int n8 = viewGroup.getChildCount();
        for (int i8 = 0; i8 < n8; ++i8) {
            View view = viewGroup.getChildAt(i8);
            view.setEnabled(bl);
            if (!(view instanceof ViewGroup)) continue;
            TextInputLayout.Y((ViewGroup)view, bl);
        }
    }

    public static /* synthetic */ void a(TextInputLayout textInputLayout) {
        textInputLayout.e.requestLayout();
    }

    private void a0() {
        TextView textView = this.u;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public static /* synthetic */ void b(TextInputLayout textInputLayout, StaticLayout.Builder builder) {
        if (Build.VERSION.SDK_INT >= 23) {
            ax.T6.d.a(builder, ax.T6.c.a(textInputLayout.u));
            return;
        }
        ((Object)((Object)textInputLayout)).getClass();
    }

    private void b0() {
        EditText editText = this.e;
        if (editText instanceof AutoCompleteTextView && (editText = (AutoCompleteTextView)editText).getDropDownBackground() == null) {
            int n8 = this.P;
            if (n8 == 2) {
                editText.setDropDownBackgroundDrawable(this.getOrCreateOutlinedDropDownMenuBackground());
                return;
            }
            if (n8 == 1) {
                editText.setDropDownBackgroundDrawable(this.getOrCreateFilledDropDownMenuBackground());
            }
        }
    }

    public static /* synthetic */ int c(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private boolean e0() {
        return (this.c.G() || this.c.A() && this.N() || this.c.w() != null) && this.c.getMeasuredWidth() > 0;
    }

    private boolean f0() {
        return (this.getStartIconDrawable() != null || this.getPrefixText() != null && this.getPrefixTextView().getVisibility() == 0) && this.b.getMeasuredWidth() > 0;
    }

    private void g0() {
        if (this.u != null && this.t && !TextUtils.isEmpty((CharSequence)this.s)) {
            this.u.setText(this.s);
            ax.v2.t.a((ViewGroup)this.a, this.x);
            this.u.setVisibility(0);
            this.u.bringToFront();
        }
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.e;
        if (editText instanceof AutoCompleteTextView && !com.google.android.material.textfield.q.a(editText)) {
            int n8 = ax.z6.a.d((View)this.e, ax.m.a.w);
            int n9 = this.P;
            if (n9 == 2) {
                return TextInputLayout.L(this.getContext(), this.G, n8, E0);
            }
            if (n9 == 1) {
                return TextInputLayout.I(this.G, this.V, n8, E0);
            }
            return null;
        }
        return this.G;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.I == null) {
            Object object;
            this.I = object = new StateListDrawable();
            Drawable drawable = this.getOrCreateOutlinedDropDownMenuBackground();
            object.addState(new int[]{0x10100AA}, drawable);
            drawable = this.I;
            object = this.H(false);
            drawable.addState(new int[0], (Drawable)object);
        }
        return this.I;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.H == null) {
            this.H = this.H(true);
        }
        return this.H;
    }

    private void h0() {
        if (this.P == 1) {
            if (ax.K6.c.i(this.getContext())) {
                this.Q = this.getResources().getDimensionPixelSize(ax.k6.e.L);
                return;
            }
            if (ax.K6.c.h(this.getContext())) {
                this.Q = this.getResources().getDimensionPixelSize(ax.k6.e.K);
            }
        }
    }

    private void i0(Rect rect) {
        int n8;
        int n9;
        ax.O6.h h8 = this.K;
        if (h8 != null) {
            n9 = rect.bottom;
            n8 = this.S;
            h8.setBounds(rect.left, n9 - n8, rect.right, n9);
        }
        if ((h8 = this.L) != null) {
            n9 = rect.bottom;
            n8 = this.T;
            h8.setBounds(rect.left, n9 - n8, rect.right, n9);
        }
    }

    private void j0(int n8) {
        this.w0.s0(n8);
        Rect rect = this.W;
        ax.F6.c.a((ViewGroup)this, (View)this.e, rect);
        this.w0.S(this.s(rect));
        this.v0();
        this.l();
        this.t0(n8);
    }

    private void k() {
        TextView textView = this.u;
        if (textView != null) {
            this.a.addView((View)textView);
            this.u.setVisibility(0);
        }
    }

    private void k0() {
        if (this.p != null) {
            Object object = this.e;
            object = object == null ? null : object.getText();
            this.l0((Editable)object);
        }
    }

    private void l() {
        if (this.e != null && this.P == 1) {
            if (!this.R()) {
                EditText editText = this.e;
                editText.setPaddingRelative(editText.getPaddingStart(), (int)(this.w0.q() + (float)this.d), this.e.getPaddingEnd(), this.getResources().getDimensionPixelSize(ax.k6.e.G));
                return;
            }
            if (ax.K6.c.i(this.getContext())) {
                EditText editText = this.e;
                editText.setPaddingRelative(editText.getPaddingStart(), this.getResources().getDimensionPixelSize(ax.k6.e.J), this.e.getPaddingEnd(), this.getResources().getDimensionPixelSize(ax.k6.e.I));
                return;
            }
            if (ax.K6.c.h(this.getContext())) {
                EditText editText = this.e;
                editText.setPaddingRelative(editText.getPaddingStart(), this.getResources().getDimensionPixelSize(ax.k6.e.H), this.e.getPaddingEnd(), this.getResources().getDimensionPixelSize(ax.k6.e.G));
            }
        }
    }

    private static void m0(Context context, TextView textView, int n8, int n9, boolean bl) {
        int n10 = bl ? ax.k6.k.c : ax.k6.k.b;
        textView.setContentDescription((CharSequence)context.getString(n10, new Object[]{n8, n9}));
    }

    private void n() {
        int n8;
        ax.O6.l l8;
        Object object = this.G;
        if (object == null) {
            return;
        }
        if ((object = ((ax.O6.h)object).I()) != (l8 = this.M)) {
            this.G.setShapeAppearanceModel(l8);
        }
        if (this.x()) {
            this.G.m0(this.R, this.U);
        }
        this.V = n8 = this.r();
        this.G.g0(ColorStateList.valueOf((int)n8));
        this.o();
        this.s0();
    }

    private void n0() {
        TextView textView = this.p;
        if (textView != null) {
            int n8 = this.n ? this.q : this.r;
            this.c0(textView, n8);
            if (!this.n && (textView = this.z) != null) {
                this.p.setTextColor((ColorStateList)textView);
            }
            if (this.n && (textView = this.A) != null) {
                this.p.setTextColor((ColorStateList)textView);
            }
        }
    }

    private void o() {
        if (this.K != null && this.L != null) {
            if (this.y()) {
                ax.O6.h h8 = this.K;
                ColorStateList colorStateList = this.e.isFocused() ? ColorStateList.valueOf((int)this.l0) : ColorStateList.valueOf((int)this.U);
                h8.g0(colorStateList);
                this.L.g0(ColorStateList.valueOf((int)this.U));
            }
            this.invalidate();
        }
    }

    private void o0() {
        ColorStateList colorStateList = this.B;
        if (colorStateList == null) {
            colorStateList = ax.z6.a.h(this.getContext(), ax.m.a.v);
        }
        EditText editText = this.e;
        if (editText != null && ax.T6.m.a(editText) != null) {
            Drawable drawable = ax.U.a.r(ax.T6.m.a(this.e)).mutate();
            editText = colorStateList;
            if (this.S()) {
                ColorStateList colorStateList2 = this.C;
                editText = colorStateList;
                if (colorStateList2 != null) {
                    editText = colorStateList2;
                }
            }
            drawable.setTintList((ColorStateList)editText);
        }
    }

    private void p(RectF rectF) {
        float f8 = rectF.left;
        int n8 = this.O;
        rectF.left = f8 - (float)n8;
        rectF.right += (float)n8;
    }

    private void q() {
        int n8 = this.P;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 == 2) {
                    this.G = this.D && !(this.G instanceof com.google.android.material.textfield.h) ? com.google.android.material.textfield.h.x0(this.M) : new ax.O6.h(this.M);
                    this.K = null;
                    this.L = null;
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.P);
                stringBuilder.append(" is illegal; only @BoxBackgroundMode constants are supported.");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.G = new ax.O6.h(this.M);
            this.K = new ax.O6.h();
            this.L = new ax.O6.h();
            return;
        }
        this.G = null;
        this.K = null;
        this.L = null;
    }

    private int r() {
        int n8 = this.V;
        if (this.P == 1) {
            n8 = ax.z6.a.j(ax.z6.a.e((View)this, ax.k6.c.i, 0), this.V);
        }
        return n8;
    }

    private void r0() {
        Drawable drawable = this.getEditTextBoxBackground();
        this.e.setBackground(drawable);
    }

    private Rect s(Rect rect) {
        if (this.e != null) {
            Rect rect2 = this.a0;
            boolean bl = ax.F6.z.h((View)this);
            rect2.bottom = rect.bottom;
            int n8 = this.P;
            if (n8 != 1) {
                if (n8 != 2) {
                    rect2.left = this.J(rect.left, bl);
                    rect2.top = this.getPaddingTop();
                    rect2.right = this.K(rect.right, bl);
                    return rect2;
                }
                rect2.left = rect.left + this.e.getPaddingLeft();
                rect2.top = rect.top - this.w();
                rect2.right = rect.right - this.e.getPaddingRight();
                return rect2;
            }
            rect2.left = this.J(rect.left, bl);
            rect2.top = rect.top + this.Q;
            rect2.right = this.K(rect.right, bl);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private void setEditText(EditText editText) {
        if (this.e == null) {
            if (this.getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i((String)"TextInputLayout", (String)"EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.e = editText;
            int n8 = this.g;
            if (n8 != -1) {
                this.setMinEms(n8);
            } else {
                this.setMinWidth(this.i);
            }
            n8 = this.h;
            if (n8 != -1) {
                this.setMaxEms(n8);
            } else {
                this.setMaxWidth(this.j);
            }
            this.J = false;
            this.V();
            this.setTextInputAccessibilityDelegate(new e(this));
            this.w0.p0(this.e.getTypeface());
            this.w0.h0(this.e.getTextSize());
            this.w0.d0(this.e.getLetterSpacing());
            n8 = this.e.getGravity();
            this.w0.X(n8 & 0xFFFFFF8F | 0x30);
            this.w0.g0(n8);
            this.u0 = editText.getMinimumHeight();
            this.e.addTextChangedListener(new TextWatcher(){
                int a;
                final EditText b;
                final TextInputLayout c;
                {
                    this.c = textInputLayout;
                    this.b = editText;
                    this.a = editText.getLineCount();
                }

                public void afterTextChanged(Editable editable) {
                    int n8;
                    int n9;
                    TextInputLayout textInputLayout = this.c;
                    textInputLayout.w0(textInputLayout.B0 ^ true);
                    textInputLayout = this.c;
                    if (textInputLayout.l) {
                        textInputLayout.l0(editable);
                    }
                    if (this.c.t) {
                        this.c.A0(editable);
                    }
                    if ((n9 = this.b.getLineCount()) != (n8 = this.a)) {
                        int n10;
                        if (n9 < n8 && (n8 = this.b.getMinimumHeight()) != (n10 = this.c.u0)) {
                            this.b.setMinimumHeight(n10);
                        }
                        this.a = n9;
                    }
                }

                public void beforeTextChanged(CharSequence charSequence, int n8, int n9, int n10) {
                }

                public void onTextChanged(CharSequence charSequence, int n8, int n9, int n10) {
                }
            });
            if (this.j0 == null) {
                this.j0 = this.e.getHintTextColors();
            }
            if (this.D) {
                if (TextUtils.isEmpty((CharSequence)this.E)) {
                    CharSequence charSequence;
                    this.f = charSequence = this.e.getHint();
                    this.setHint(charSequence);
                    this.e.setHint(null);
                }
                this.F = true;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                this.o0();
            }
            if (this.p != null) {
                this.l0(this.e.getText());
            }
            this.q0();
            this.k.f();
            this.b.bringToFront();
            this.c.bringToFront();
            this.D();
            this.c.x0();
            if (!this.isEnabled()) {
                editText.setEnabled(false);
            }
            this.x0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals((CharSequence)charSequence, (CharSequence)this.E)) {
            this.E = charSequence;
            this.w0.n0(charSequence);
            if (!this.v0) {
                this.W();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean bl) {
        if (this.t == bl) {
            return;
        }
        if (bl) {
            this.k();
        } else {
            this.a0();
            this.u = null;
        }
        this.t = bl;
    }

    private int t(Rect rect, Rect rect2, float f8) {
        if (this.U()) {
            return (int)((float)rect2.top + f8);
        }
        return rect.bottom - this.e.getCompoundPaddingBottom();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void t0(int n8) {
        float f8;
        float f9;
        block5: {
            float f10;
            if (this.e == null) {
                return;
            }
            f9 = this.w0.z();
            Object object = this.s;
            f8 = f10 = 0.0f;
            if (object != null) {
                s.a a82;
                block4: {
                    object = new TextPaint(129);
                    object.set(this.u.getPaint());
                    object.setTextSize(this.u.getTextSize());
                    object.setTypeface(this.u.getTypeface());
                    object.setLetterSpacing(this.u.getLetterSpacing());
                    try {
                        object = ax.F6.s.c(this.s, (TextPaint)object, n8);
                        boolean bl = this.getLayoutDirection() == 1;
                        object = ((s)object).h(bl).g(true).i(this.u.getLineSpacingExtra(), this.u.getLineSpacingMultiplier());
                        p p8 = new p(this);
                        object = ((s)object).k(p8).a();
                        f8 = this.P == 1 ? this.w0.q() + (float)this.Q + (float)this.d : 0.0f;
                    }
                    catch (s.a a82) {
                        break block4;
                    }
                    n8 = object.getHeight();
                    f8 = (float)n8 + f8;
                    break block5;
                }
                Log.e((String)"TextInputLayout", (String)a82.getCause().getMessage(), (Throwable)a82);
                f8 = f10;
            }
        }
        f8 = Math.max(f9, f8);
        if (!((float)this.e.getMeasuredHeight() < f8)) return;
        this.e.setMinimumHeight(Math.round(f8));
    }

    private int u(Rect rect, float f8) {
        if (this.U()) {
            return (int)((float)rect.centerY() - f8 / 2.0f);
        }
        int n8 = this.P == 0 && !this.R() ? (int)(this.w0.A() / 2.0f) : 0;
        return rect.top + this.e.getCompoundPaddingTop() - n8;
    }

    private boolean u0() {
        if (this.e == null) {
            return false;
        }
        int n8 = Math.max(this.c.getMeasuredHeight(), this.b.getMeasuredHeight());
        if (this.e.getMeasuredHeight() < n8) {
            this.e.setMinimumHeight(n8);
            return true;
        }
        return false;
    }

    private Rect v(Rect rect) {
        if (this.e != null) {
            Rect rect2 = this.a0;
            float f8 = this.R() ? this.w0.A() : this.w0.y() * (float)this.w0.w();
            rect2.left = rect.left + this.e.getCompoundPaddingLeft();
            rect2.top = this.u(rect, f8);
            rect2.right = rect.right - this.e.getCompoundPaddingRight();
            rect2.bottom = this.t(rect, rect2, f8);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private void v0() {
        if (this.P != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)this.a.getLayoutParams();
            int n8 = this.w();
            if (n8 != layoutParams.topMargin) {
                layoutParams.topMargin = n8;
                this.a.requestLayout();
            }
        }
    }

    private int w() {
        if (!this.D) {
            return 0;
        }
        int n8 = this.P;
        if (n8 != 0) {
            if (n8 != 2) {
                return 0;
            }
            if (this.R()) {
                return (int)(this.w0.q() / 2.0f);
            }
            return Math.max(0, (int)(this.w0.q() - this.w0.n() / 2.0f));
        }
        return (int)this.w0.q();
    }

    private boolean x() {
        return this.P == 2 && this.y();
    }

    private void x0(boolean bl, boolean bl2) {
        block19: {
            block18: {
                block17: {
                    boolean bl3 = this.isEnabled();
                    EditText editText = this.e;
                    int n8 = 0;
                    boolean bl4 = editText != null && !TextUtils.isEmpty((CharSequence)editText.getText());
                    editText = this.e;
                    int n9 = n8;
                    if (editText != null) {
                        n9 = n8;
                        if (editText.hasFocus()) {
                            n9 = 1;
                        }
                    }
                    if ((editText = this.j0) != null) {
                        this.w0.Q((ColorStateList)editText);
                    }
                    if (!bl3) {
                        editText = this.j0;
                        if (editText != null) {
                            n8 = this.t0;
                            n8 = editText.getColorForState(new int[]{-16842910}, n8);
                        } else {
                            n8 = this.t0;
                        }
                        this.w0.Q(ColorStateList.valueOf((int)n8));
                    } else if (this.d0()) {
                        this.w0.Q(this.k.r());
                    } else if (this.n && (editText = this.p) != null) {
                        this.w0.Q(editText.getTextColors());
                    } else if (n9 != 0 && (editText = this.k0) != null) {
                        this.w0.W((ColorStateList)editText);
                    }
                    if (bl4 || !this.x0 || this.isEnabled() && n9 != 0) break block17;
                    if (bl2 || !this.v0) {
                        this.G(bl);
                        return;
                    }
                    break block18;
                }
                if (bl2 || this.v0) break block19;
            }
            return;
        }
        this.A(bl);
    }

    private boolean y() {
        return this.R > -1 && this.U != 0;
    }

    private void y0() {
        EditText editText;
        if (this.u != null && (editText = this.e) != null) {
            int n8 = editText.getGravity();
            this.u.setGravity(n8);
            this.u.setPadding(this.e.getCompoundPaddingLeft(), this.e.getCompoundPaddingTop(), this.e.getCompoundPaddingRight(), this.e.getCompoundPaddingBottom());
        }
    }

    private void z() {
        if (this.C()) {
            ((com.google.android.material.textfield.h)this.G).A0();
        }
    }

    private void z0() {
        Object object = this.e;
        object = object == null ? null : object.getText();
        this.A0((Editable)object);
    }

    void C0() {
        block17: {
            boolean bl;
            EditText editText;
            boolean bl2;
            block19: {
                block18: {
                    if (this.G == null || this.P == 0) break block17;
                    bl2 = this.isFocused();
                    boolean bl3 = false;
                    bl2 = bl2 || (editText = this.e) != null && editText.hasFocus();
                    if (this.isHovered()) break block18;
                    editText = this.e;
                    bl = bl3;
                    if (editText == null) break block19;
                    bl = bl3;
                    if (!editText.isHovered()) break block19;
                }
                bl = true;
            }
            if (!this.isEnabled()) {
                this.U = this.t0;
            } else if (this.d0()) {
                if (this.o0 != null) {
                    this.B0(bl2, bl);
                } else {
                    this.U = this.getErrorCurrentTextColors();
                }
            } else if (this.n && (editText = this.p) != null) {
                if (this.o0 != null) {
                    this.B0(bl2, bl);
                } else {
                    this.U = editText.getCurrentTextColor();
                }
            } else {
                this.U = bl2 ? this.n0 : (bl ? this.m0 : this.l0);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                this.o0();
            }
            this.c.I();
            this.Z();
            if (this.P == 2) {
                int n8 = this.R;
                this.R = bl2 && this.isEnabled() ? this.T : this.S;
                if (this.R != n8) {
                    this.X();
                }
            }
            if (this.P == 1) {
                this.V = !this.isEnabled() ? this.q0 : (bl && !bl2 ? this.s0 : (bl2 ? this.r0 : this.p0));
            }
            this.n();
        }
    }

    public boolean N() {
        return this.c.F();
    }

    public boolean O() {
        return this.k.A();
    }

    public boolean P() {
        return this.k.B();
    }

    final boolean Q() {
        return this.v0;
    }

    public boolean T() {
        return this.F;
    }

    public void Z() {
        this.b.m();
    }

    public void addView(View view, int n8, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = layoutParams2.gravity & 0xFFFFFF8F | 0x10;
            this.a.addView(view, (ViewGroup.LayoutParams)layoutParams2);
            this.a.setLayoutParams(layoutParams);
            this.v0();
            this.setEditText((EditText)view);
            return;
        }
        super.addView(view, n8, layoutParams);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void c0(TextView textView, int n8) {
        block2: {
            try {
                ax.h0.j.m(textView, n8);
                if (Build.VERSION.SDK_INT < 23 || (n8 = textView.getTextColors().getDefaultColor()) != -65281) break block2;
            }
            catch (Exception exception) {}
            ax.h0.j.m(textView, ax.m.i.b);
            textView.setTextColor(ax.Q.b.c(this.getContext(), ax.k6.d.a));
        }
    }

    boolean d0() {
        return this.k.l();
    }

    @TargetApi(value=26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int n8) {
        EditText editText = this.e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, n8);
            return;
        }
        CharSequence charSequence = this.f;
        if (charSequence != null) {
            boolean bl = this.F;
            this.F = false;
            charSequence = editText.getHint();
            this.e.setHint(this.f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, n8);
                return;
            }
            finally {
                this.e.setHint(charSequence);
                this.F = bl;
            }
        }
        ax.T6.f.a(viewStructure, ax.T6.e.a(this));
        ax.T6.g.a(this, viewStructure, n8);
        ax.T6.h.a(this, viewStructure, n8);
        ax.T6.i.a(viewStructure, this.a.getChildCount());
        for (int i8 = 0; i8 < this.a.getChildCount(); ++i8) {
            editText = this.a.getChildAt(i8);
            charSequence = ax.T6.j.a(viewStructure, i8);
            ax.T6.k.a((View)editText, (ViewStructure)charSequence, n8);
            if (editText != this.e) continue;
            ax.T6.l.a((ViewStructure)charSequence, this.getHint());
        }
    }

    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.B0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.B0 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.F(canvas);
        this.E(canvas);
    }

    protected void drawableStateChanged() {
        if (this.A0) {
            return;
        }
        boolean bl = true;
        this.A0 = true;
        super.drawableStateChanged();
        int[] nArray = this.getDrawableState();
        ax.F6.a a8 = this.w0;
        boolean bl2 = a8 != null ? a8.m0(nArray) : false;
        if (this.e != null) {
            if (!this.isLaidOut() || !this.isEnabled()) {
                bl = false;
            }
            this.w0(bl);
        }
        this.q0();
        this.C0();
        if (bl2) {
            this.invalidate();
        }
        this.A0 = false;
    }

    public int getBaseline() {
        EditText editText = this.e;
        if (editText != null) {
            return editText.getBaseline() + this.getPaddingTop() + this.w();
        }
        return super.getBaseline();
    }

    ax.O6.h getBoxBackground() {
        int n8 = this.P;
        if (n8 != 1 && n8 != 2) {
            throw new IllegalStateException();
        }
        return this.G;
    }

    public int getBoxBackgroundColor() {
        return this.V;
    }

    public int getBoxBackgroundMode() {
        return this.P;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.Q;
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (ax.F6.z.h((View)this)) {
            return this.M.j().a(this.b0);
        }
        return this.M.l().a(this.b0);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (ax.F6.z.h((View)this)) {
            return this.M.l().a(this.b0);
        }
        return this.M.j().a(this.b0);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (ax.F6.z.h((View)this)) {
            return this.M.r().a(this.b0);
        }
        return this.M.t().a(this.b0);
    }

    public float getBoxCornerRadiusTopStart() {
        if (ax.F6.z.h((View)this)) {
            return this.M.t().a(this.b0);
        }
        return this.M.r().a(this.b0);
    }

    public int getBoxStrokeColor() {
        return this.n0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.o0;
    }

    public int getBoxStrokeWidth() {
        return this.S;
    }

    public int getBoxStrokeWidthFocused() {
        return this.T;
    }

    public int getCounterMaxLength() {
        return this.m;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.l && this.n && (textView = this.p) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.A;
    }

    public ColorStateList getCounterTextColor() {
        return this.z;
    }

    public ColorStateList getCursorColor() {
        return this.B;
    }

    public ColorStateList getCursorErrorColor() {
        return this.C;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.j0;
    }

    public EditText getEditText() {
        return this.e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.c.l();
    }

    public Drawable getEndIconDrawable() {
        return this.c.n();
    }

    public int getEndIconMinSize() {
        return this.c.o();
    }

    public int getEndIconMode() {
        return this.c.p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.c.q();
    }

    CheckableImageButton getEndIconView() {
        return this.c.r();
    }

    public CharSequence getError() {
        if (this.k.A()) {
            return this.k.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.k.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.k.o();
    }

    public int getErrorCurrentTextColors() {
        return this.k.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.c.s();
    }

    public CharSequence getHelperText() {
        if (this.k.B()) {
            return this.k.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.k.u();
    }

    public CharSequence getHint() {
        if (this.D) {
            return this.E;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.w0.q();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.w0.t();
    }

    public int getHintMaxLines() {
        return this.w0.x();
    }

    public ColorStateList getHintTextColor() {
        return this.k0;
    }

    public f getLengthCounter() {
        return this.o;
    }

    public int getMaxEms() {
        return this.h;
    }

    public int getMaxWidth() {
        return this.j;
    }

    public int getMinEms() {
        return this.g;
    }

    public int getMinWidth() {
        return this.i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.c.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.c.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.t) {
            return this.s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.v;
    }

    public CharSequence getPrefixText() {
        return this.b.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.b.b();
    }

    public TextView getPrefixTextView() {
        return this.b.d();
    }

    public ax.O6.l getShapeAppearanceModel() {
        return this.M;
    }

    public CharSequence getStartIconContentDescription() {
        return this.b.e();
    }

    public Drawable getStartIconDrawable() {
        return this.b.f();
    }

    public int getStartIconMinSize() {
        return this.b.g();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.b.h();
    }

    public CharSequence getSuffixText() {
        return this.c.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.c.x();
    }

    public TextView getSuffixTextView() {
        return this.c.z();
    }

    public Typeface getTypeface() {
        return this.c0;
    }

    public void j(g g8) {
        ((AbstractCollection)this.f0).add(g8);
        if (this.e != null) {
            g8.a(this);
        }
    }

    void l0(Editable object) {
        int n8 = this.o.a((Editable)object);
        boolean bl = this.n;
        int n9 = this.m;
        if (n9 == -1) {
            this.p.setText((CharSequence)String.valueOf(n8));
            this.p.setContentDescription(null);
            this.n = false;
        } else {
            boolean bl2 = n8 > n9;
            this.n = bl2;
            TextInputLayout.m0(this.getContext(), this.p, n8, this.m, this.n);
            if (bl != this.n) {
                this.n0();
            }
            object = ax.a0.a.c();
            this.p.setText((CharSequence)((a)object).j(this.getContext().getString(ax.k6.k.d, new Object[]{n8, this.m})));
        }
        if (this.e != null && bl != this.n) {
            this.w0(false);
            this.C0();
            this.q0();
        }
    }

    void m(float f8) {
        if (this.w0.B() == f8) {
            return;
        }
        if (this.z0 == null) {
            ValueAnimator valueAnimator;
            this.z0 = valueAnimator = new ValueAnimator();
            valueAnimator.setInterpolator(ax.H6.i.g(this.getContext(), ax.k6.c.M, ax.l6.a.b));
            this.z0.setDuration((long)ax.H6.i.f(this.getContext(), ax.k6.c.G, 167));
            this.z0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this){
                final TextInputLayout a;
                {
                    this.a = textInputLayout;
                }

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.w0.j0(((Float)valueAnimator.getAnimatedValue()).floatValue());
                }
            });
        }
        this.z0.setFloatValues(new float[]{this.w0.B(), f8});
        this.z0.start();
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.w0.L(configuration);
    }

    public void onGlobalLayout() {
        this.c.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
        this.C0 = false;
        boolean bl = this.u0();
        boolean bl2 = this.p0();
        if (!bl && !bl2) {
            return;
        }
        this.e.post((Runnable)new n(this));
    }

    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        super.onLayout(bl, n8, n9, n10, n11);
        EditText editText = this.e;
        if (editText != null) {
            Rect rect = this.W;
            ax.F6.c.a((ViewGroup)this, (View)editText, rect);
            this.i0(rect);
            if (this.D) {
                this.w0.h0(this.e.getTextSize());
                n8 = this.e.getGravity();
                this.w0.X(n8 & 0xFFFFFF8F | 0x30);
                this.w0.g0(n8);
                this.w0.S(this.s(rect));
                this.w0.c0(this.v(rect));
                this.w0.N();
                if (this.C() && !this.v0) {
                    this.W();
                }
            }
        }
    }

    protected void onMeasure(int n8, int n9) {
        super.onMeasure(n8, n9);
        if (!this.C0) {
            this.c.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
            this.C0 = true;
        }
        this.y0();
        this.c.x0();
        if (!this.R()) {
            this.j0(this.e.getMeasuredWidth() - this.e.getCompoundPaddingLeft() - this.e.getCompoundPaddingRight());
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (i)parcelable;
        super.onRestoreInstanceState(parcelable.a());
        this.setError(parcelable.d0);
        if (parcelable.e0) {
            this.post(new Runnable(this){
                final TextInputLayout q;
                {
                    this.q = textInputLayout;
                }

                @Override
                public void run() {
                    this.q.c.h();
                }
            });
        }
        this.requestLayout();
    }

    public void onRtlPropertiesChanged(int n8) {
        super.onRtlPropertiesChanged(n8);
        boolean bl = true;
        if (n8 != 1) {
            bl = false;
        }
        if (bl != this.N) {
            float f8 = this.M.r().a(this.b0);
            float f9 = this.M.t().a(this.b0);
            float f10 = this.M.j().a(this.b0);
            float f11 = this.M.l().a(this.b0);
            Object object = this.M.q();
            ax.O6.e e8 = this.M.s();
            ax.O6.e e9 = this.M.i();
            ax.O6.e e10 = this.M.k();
            object = ax.O6.l.a().B(e8).F((ax.O6.e)object).t(e10).x(e9).C(f9).G(f8).u(f11).y(f10).m();
            this.N = bl;
            this.setShapeAppearanceModel((ax.O6.l)object);
        }
    }

    public Parcelable onSaveInstanceState() {
        i i8 = new i(super.onSaveInstanceState());
        if (this.d0()) {
            i8.d0 = this.getError();
        }
        i8.e0 = this.c.E();
        return i8;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    boolean p0() {
        block12: {
            if (this.e == null) {
                return false;
            }
            var3_1 = this.f0();
            var4_2 = true;
            if (!var3_1) break block12;
            var1_3 = this.b.getMeasuredWidth() - this.e.getPaddingLeft();
            if (this.d0 == null || this.e0 != var1_3) {
                this.d0 = var5_4 /* !! */  = new ColorDrawable();
                this.e0 = var1_3;
                var5_4 /* !! */ .setBounds(0, 0, var1_3, 1);
            }
            if ((var6_5 = (var5_4 /* !! */  = this.e.getCompoundDrawablesRelative())[0]) == (var7_6 = this.d0)) ** GOTO lbl-1000
            this.e.setCompoundDrawablesRelative(var7_6, var5_4 /* !! */ [1], var5_4 /* !! */ [2], var5_4 /* !! */ [3]);
            ** GOTO lbl19
        }
        if (this.d0 != null) {
            var5_4 /* !! */  = this.e.getCompoundDrawablesRelative();
            this.e.setCompoundDrawablesRelative(null, var5_4 /* !! */ [1], var5_4 /* !! */ [2], var5_4 /* !! */ [3]);
            this.d0 = null;
lbl19:
            // 2 sources

            var3_1 = true;
        } else lbl-1000:
        // 2 sources

        {
            var3_1 = false;
        }
        if (this.e0()) {
            var2_7 = this.c.z().getMeasuredWidth() - this.e.getPaddingRight();
            var5_4 /* !! */  = this.c.k();
            var1_3 = var2_7;
            if (var5_4 /* !! */  != null) {
                var1_3 = var2_7 + var5_4 /* !! */ .getMeasuredWidth() + ((ViewGroup.MarginLayoutParams)var5_4 /* !! */ .getLayoutParams()).getMarginStart();
            }
            var5_4 /* !! */  = this.e.getCompoundDrawablesRelative();
            var6_5 = this.g0;
            if (var6_5 != null && this.h0 != var1_3) {
                this.h0 = var1_3;
                var6_5.setBounds(0, 0, var1_3, 1);
                this.e.setCompoundDrawablesRelative(var5_4 /* !! */ [0], var5_4 /* !! */ [1], this.g0, var5_4 /* !! */ [3]);
                return true;
            }
            if (var6_5 == null) {
                this.g0 = var6_5 = new ColorDrawable();
                this.h0 = var1_3;
                var6_5.setBounds(0, 0, var1_3, 1);
            }
            if ((var6_5 = var5_4 /* !! */ [2]) != (var7_6 = this.g0)) {
                this.i0 = var6_5;
                this.e.setCompoundDrawablesRelative(var5_4 /* !! */ [0], var5_4 /* !! */ [1], var7_6, var5_4 /* !! */ [3]);
                return true;
            }
        } else if (this.g0 != null) {
            var5_4 /* !! */  = this.e.getCompoundDrawablesRelative();
            if (var5_4 /* !! */ [2] == this.g0) {
                this.e.setCompoundDrawablesRelative(var5_4 /* !! */ [0], var5_4 /* !! */ [1], this.i0, var5_4 /* !! */ [3]);
                var3_1 = var4_2;
            }
            this.g0 = null;
            return var3_1;
        }
        return var3_1;
    }

    void q0() {
        Drawable drawable;
        EditText editText = this.e;
        if (editText != null && this.P == 0 && (drawable = editText.getBackground()) != null) {
            editText = drawable;
            if (androidx.appcompat.widget.A.a(drawable)) {
                editText = drawable.mutate();
            }
            if (this.d0()) {
                editText.setColorFilter((ColorFilter)androidx.appcompat.widget.k.e(this.getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
                return;
            }
            if (this.n && (drawable = this.p) != null) {
                editText.setColorFilter((ColorFilter)androidx.appcompat.widget.k.e(drawable.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
                return;
            }
            ax.U.a.c((Drawable)editText);
            this.e.refreshDrawableState();
        }
    }

    void s0() {
        EditText editText = this.e;
        if (editText != null && this.G != null && (this.J || editText.getBackground() == null) && this.P != 0) {
            this.r0();
            this.J = true;
        }
    }

    public void setBoxBackgroundColor(int n8) {
        if (this.V != n8) {
            this.V = n8;
            this.p0 = n8;
            this.r0 = n8;
            this.s0 = n8;
            this.n();
        }
    }

    public void setBoxBackgroundColorResource(int n8) {
        this.setBoxBackgroundColor(ax.Q.b.c(this.getContext(), n8));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int n8;
        this.p0 = n8 = colorStateList.getDefaultColor();
        this.V = n8;
        this.q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.r0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.s0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        this.n();
    }

    public void setBoxBackgroundMode(int n8) {
        if (n8 != this.P) {
            this.P = n8;
            if (this.e != null) {
                this.V();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int n8) {
        this.Q = n8;
    }

    public void setBoxCornerFamily(int n8) {
        this.M = this.M.w().A(n8, this.M.r()).E(n8, this.M.t()).s(n8, this.M.j()).w(n8, this.M.l()).m();
        this.n();
    }

    public void setBoxStrokeColor(int n8) {
        if (this.n0 != n8) {
            this.n0 = n8;
            this.C0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.l0 = colorStateList.getDefaultColor();
            this.t0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.m0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.n0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.n0 != colorStateList.getDefaultColor()) {
            this.n0 = colorStateList.getDefaultColor();
        }
        this.C0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.o0 != colorStateList) {
            this.o0 = colorStateList;
            this.C0();
        }
    }

    public void setBoxStrokeWidth(int n8) {
        this.S = n8;
        this.C0();
    }

    public void setBoxStrokeWidthFocused(int n8) {
        this.T = n8;
        this.C0();
    }

    public void setBoxStrokeWidthFocusedResource(int n8) {
        this.setBoxStrokeWidthFocused(this.getResources().getDimensionPixelSize(n8));
    }

    public void setBoxStrokeWidthResource(int n8) {
        this.setBoxStrokeWidth(this.getResources().getDimensionPixelSize(n8));
    }

    public void setCounterEnabled(boolean bl) {
        if (this.l != bl) {
            if (bl) {
                x x8 = new x(this.getContext());
                this.p = x8;
                x8.setId(ax.k6.g.Q);
                x8 = this.c0;
                if (x8 != null) {
                    this.p.setTypeface((Typeface)x8);
                }
                this.p.setMaxLines(1);
                this.k.e(this.p, 2);
                ((ViewGroup.MarginLayoutParams)this.p.getLayoutParams()).setMarginStart(this.getResources().getDimensionPixelOffset(ax.k6.e.x0));
                this.n0();
                this.k0();
            } else {
                this.k.C(this.p, 2);
                this.p = null;
            }
            this.l = bl;
        }
    }

    public void setCounterMaxLength(int n8) {
        if (this.m != n8) {
            this.m = n8 > 0 ? n8 : -1;
            if (this.l) {
                this.k0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int n8) {
        if (this.q != n8) {
            this.q = n8;
            this.n0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            this.n0();
        }
    }

    public void setCounterTextAppearance(int n8) {
        if (this.r != n8) {
            this.r = n8;
            this.n0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            this.n0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            this.o0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            if (this.S()) {
                this.o0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.j0 = colorStateList;
        this.k0 = colorStateList;
        if (this.e != null) {
            this.w0(false);
        }
    }

    public void setEnabled(boolean bl) {
        TextInputLayout.Y((ViewGroup)this, bl);
        super.setEnabled(bl);
    }

    public void setEndIconActivated(boolean bl) {
        this.c.N(bl);
    }

    public void setEndIconCheckable(boolean bl) {
        this.c.O(bl);
    }

    public void setEndIconContentDescription(int n8) {
        this.c.P(n8);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.c.Q(charSequence);
    }

    public void setEndIconDrawable(int n8) {
        this.c.R(n8);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.c.S(drawable);
    }

    public void setEndIconMinSize(int n8) {
        this.c.T(n8);
    }

    public void setEndIconMode(int n8) {
        this.c.U(n8);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.c.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.c.W(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.c.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.c.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.c.Z(mode);
    }

    public void setEndIconVisible(boolean bl) {
        this.c.a0(bl);
    }

    public void setError(CharSequence charSequence) {
        if (!this.k.A()) {
            if (TextUtils.isEmpty((CharSequence)charSequence)) {
                return;
            }
            this.setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            this.k.Q(charSequence);
            return;
        }
        this.k.w();
    }

    public void setErrorAccessibilityLiveRegion(int n8) {
        this.k.E(n8);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.k.F(charSequence);
    }

    public void setErrorEnabled(boolean bl) {
        this.k.G(bl);
    }

    public void setErrorIconDrawable(int n8) {
        this.c.b0(n8);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.c.c0(drawable);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.c.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.c.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.c.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.c.g0(mode);
    }

    public void setErrorTextAppearance(int n8) {
        this.k.H(n8);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.k.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean bl) {
        if (this.x0 != bl) {
            this.x0 = bl;
            this.w0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty((CharSequence)charSequence)) {
            if (this.P()) {
                this.setHelperTextEnabled(false);
            }
            return;
        }
        if (!this.P()) {
            this.setHelperTextEnabled(true);
        }
        this.k.R(charSequence);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.k.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean bl) {
        this.k.K(bl);
    }

    public void setHelperTextTextAppearance(int n8) {
        this.k.J(n8);
    }

    public void setHint(int n8) {
        CharSequence charSequence = n8 != 0 ? this.getResources().getText(n8) : null;
        this.setHint(charSequence);
    }

    public void setHint(CharSequence charSequence) {
        if (this.D) {
            this.setHintInternal(charSequence);
            this.sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean bl) {
        this.y0 = bl;
    }

    public void setHintEnabled(boolean bl) {
        if (bl != this.D) {
            this.D = bl;
            if (!bl) {
                this.F = false;
                if (!TextUtils.isEmpty((CharSequence)this.E) && TextUtils.isEmpty((CharSequence)this.e.getHint())) {
                    this.e.setHint(this.E);
                }
                this.setHintInternal(null);
            } else {
                CharSequence charSequence = this.e.getHint();
                if (!TextUtils.isEmpty((CharSequence)charSequence)) {
                    if (TextUtils.isEmpty((CharSequence)this.E)) {
                        this.setHint(charSequence);
                    }
                    this.e.setHint(null);
                }
                this.F = true;
            }
            if (this.e != null) {
                this.v0();
            }
        }
    }

    public void setHintMaxLines(int n8) {
        this.w0.T(n8);
        this.w0.e0(n8);
        this.requestLayout();
    }

    public void setHintTextAppearance(int n8) {
        this.w0.U(n8);
        this.k0 = this.w0.p();
        if (this.e != null) {
            this.w0(false);
            this.v0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.k0 != colorStateList) {
            if (this.j0 == null) {
                this.w0.W(colorStateList);
            }
            this.k0 = colorStateList;
            if (this.e != null) {
                this.w0(false);
            }
        }
    }

    public void setLengthCounter(f f8) {
        this.o = f8;
    }

    public void setMaxEms(int n8) {
        this.h = n8;
        EditText editText = this.e;
        if (editText != null && n8 != -1) {
            editText.setMaxEms(n8);
        }
    }

    public void setMaxWidth(int n8) {
        this.j = n8;
        EditText editText = this.e;
        if (editText != null && n8 != -1) {
            editText.setMaxWidth(n8);
        }
    }

    public void setMaxWidthResource(int n8) {
        this.setMaxWidth(this.getContext().getResources().getDimensionPixelSize(n8));
    }

    public void setMinEms(int n8) {
        this.g = n8;
        EditText editText = this.e;
        if (editText != null && n8 != -1) {
            editText.setMinEms(n8);
        }
    }

    public void setMinWidth(int n8) {
        this.i = n8;
        EditText editText = this.e;
        if (editText != null && n8 != -1) {
            editText.setMinWidth(n8);
        }
    }

    public void setMinWidthResource(int n8) {
        this.setMinWidth(this.getContext().getResources().getDimensionPixelSize(n8));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int n8) {
        this.c.i0(n8);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.c.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int n8) {
        this.c.k0(n8);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.c.l0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean bl) {
        this.c.m0(bl);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.c.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.c.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.u == null) {
            Object object = new x(this.getContext());
            this.u = object;
            object.setId(ax.k6.g.T);
            this.u.setImportantForAccessibility(1);
            this.u.setAccessibilityLiveRegion(1);
            this.x = object = this.B();
            ((k)object).j0(67L);
            this.y = this.B();
            this.setPlaceholderTextAppearance(this.w);
            this.setPlaceholderTextColor(this.v);
            ax.c0.d0.l0((View)this.u, new ax.c0.a(this){
                final TextInputLayout d;
                {
                    this.d = textInputLayout;
                }

                @Override
                public void g(View view, H h8) {
                    super.g(view, h8);
                    h8.O0(false);
                }
            });
        }
        if (TextUtils.isEmpty((CharSequence)charSequence)) {
            this.setPlaceholderTextEnabled(false);
        } else {
            if (!this.t) {
                this.setPlaceholderTextEnabled(true);
            }
            this.s = charSequence;
        }
        this.z0();
    }

    public void setPlaceholderTextAppearance(int n8) {
        this.w = n8;
        TextView textView = this.u;
        if (textView != null) {
            ax.h0.j.m(textView, n8);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.v != colorStateList) {
            this.v = colorStateList;
            TextView textView = this.u;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.b.n(charSequence);
    }

    public void setPrefixTextAppearance(int n8) {
        this.b.o(n8);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.b.p(colorStateList);
    }

    public void setShapeAppearanceModel(ax.O6.l l8) {
        ax.O6.h h8 = this.G;
        if (h8 != null && h8.I() != l8) {
            this.M = l8;
            this.n();
        }
    }

    public void setStartIconCheckable(boolean bl) {
        this.b.q(bl);
    }

    public void setStartIconContentDescription(int n8) {
        CharSequence charSequence = n8 != 0 ? this.getResources().getText(n8) : null;
        this.setStartIconContentDescription(charSequence);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.b.r(charSequence);
    }

    public void setStartIconDrawable(int n8) {
        Drawable drawable = n8 != 0 ? ax.o.a.b(this.getContext(), n8) : null;
        this.setStartIconDrawable(drawable);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.b.s(drawable);
    }

    public void setStartIconMinSize(int n8) {
        this.b.t(n8);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.b.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.b.v(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.b.w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.b.x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.b.y(mode);
    }

    public void setStartIconVisible(boolean bl) {
        this.b.z(bl);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.c.p0(charSequence);
    }

    public void setSuffixTextAppearance(int n8) {
        this.c.q0(n8);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.c.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e e8) {
        EditText editText = this.e;
        if (editText != null) {
            ax.c0.d0.l0((View)editText, e8);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.c0) {
            this.c0 = typeface;
            this.w0.p0(typeface);
            this.k.N(typeface);
            TextView textView = this.p;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void w0(boolean bl) {
        this.x0(bl, false);
    }

    public static class e
    extends ax.c0.a {
        private final TextInputLayout d;

        public e(TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        @Override
        public void g(View view, H h8) {
            super.g(view, h8);
            Object object = this.d.getEditText();
            Editable editable = object != null ? object.getText() : null;
            object = this.d.getHint();
            CharSequence charSequence = this.d.getError();
            Object object2 = this.d.getPlaceholderText();
            int n8 = this.d.getCounterMaxLength();
            CharSequence charSequence2 = this.d.getCounterOverflowDescription();
            boolean bl = TextUtils.isEmpty((CharSequence)editable);
            boolean bl2 = TextUtils.isEmpty((CharSequence)object);
            boolean bl3 = this.d.Q();
            boolean bl4 = TextUtils.isEmpty((CharSequence)charSequence);
            boolean bl5 = !bl4 || !TextUtils.isEmpty((CharSequence)charSequence2);
            object = !bl2 ? object.toString() : "";
            this.d.b.A(h8);
            if (!bl) {
                h8.M0((CharSequence)editable);
            } else if (!TextUtils.isEmpty((CharSequence)object)) {
                h8.M0((CharSequence)object);
                if (!bl3 && object2 != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((String)object);
                    stringBuilder.append(", ");
                    stringBuilder.append(object2);
                    h8.M0(stringBuilder.toString());
                }
            } else if (object2 != null) {
                h8.M0((CharSequence)object2);
            }
            if (!TextUtils.isEmpty((CharSequence)object)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    h8.x0((CharSequence)object);
                } else {
                    object2 = object;
                    if (!bl) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append(editable);
                        ((StringBuilder)object2).append(", ");
                        ((StringBuilder)object2).append((String)object);
                        object2 = ((StringBuilder)object2).toString();
                    }
                    h8.M0((CharSequence)object2);
                }
                h8.I0(bl);
            }
            if (editable == null || editable.length() != n8) {
                n8 = -1;
            }
            h8.z0(n8);
            if (bl5) {
                object = !bl4 ? charSequence : charSequence2;
                h8.t0((CharSequence)object);
            }
            if ((object = this.d.k.t()) != null) {
                h8.y0((View)object);
            }
            this.d.c.m().o(view, h8);
        }

        @Override
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.d.c.m().p(view, accessibilityEvent);
        }
    }

    public static interface f {
        public int a(Editable var1);
    }

    public static interface g {
        public void a(TextInputLayout var1);
    }

    public static interface h {
        public void a(TextInputLayout var1, int var2);
    }

    static class i
    extends ax.k0.a {
        public static final Parcelable.Creator<i> CREATOR = new Parcelable.ClassLoaderCreator<i>(){

            public i a(Parcel parcel) {
                return new i(parcel, null);
            }

            public i b(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            public i[] c(int n8) {
                return new i[n8];
            }
        };
        CharSequence d0;
        boolean e0;

        i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d0 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            int n8 = parcel.readInt();
            boolean bl = true;
            if (n8 != 1) {
                bl = false;
            }
            this.e0 = bl;
        }

        i(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TextInputLayout.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" error=");
            stringBuilder.append((Object)this.d0);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        @Override
        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            TextUtils.writeToParcel((CharSequence)this.d0, (Parcel)parcel, (int)n8);
            parcel.writeInt(this.e0 ? 1 : 0);
        }
    }
}

