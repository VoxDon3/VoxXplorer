package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
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
import android.view.autofill.AutofillId;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.A;
import androidx.appcompat.widget.C0580k;
import ax.F6.C0691a;
import ax.F6.s;
import ax.a0.C1263a;
import ax.c0.C1753a;
import ax.c0.C1760d0;
import ax.d0.H;
import ax.k0.AbstractC2357a;
import ax.k6.C2402c;
import ax.k6.C2403d;
import ax.k6.C2404e;
import ax.k6.C2406g;
import ax.k6.C2410k;
import ax.l6.C2472a;
import ax.m.C2506a;
import ax.o.C2653a;
import ax.v2.C3260c;
import ax.z6.C3555a;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    private static final int D0 = ax.k6.l.l;
    private static final int[][] E0 = {new int[]{R.attr.state_pressed}, new int[0]};
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
    final C0691a w0;
    private C3260c x;
    private boolean x0;
    private C3260c y;
    private boolean y0;
    private ColorStateList z;
    private ValueAnimator z0;

    class a implements TextWatcher {
        int a;
        final /* synthetic */ EditText b;

        a(EditText editText) {
            this.b = editText;
            this.a = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.w0(!r0.B0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.l) {
                textInputLayout.l0(editable);
            }
            if (TextInputLayout.this.t) {
                TextInputLayout.this.A0(editable);
            }
            int lineCount = this.b.getLineCount();
            int i = this.a;
            if (lineCount != i) {
                if (lineCount < i) {
                    int minimumHeight = this.b.getMinimumHeight();
                    int i2 = TextInputLayout.this.u0;
                    if (minimumHeight != i2) {
                        this.b.setMinimumHeight(i2);
                    }
                }
                this.a = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    class b extends C1753a {
        b() {
        }

        @Override // ax.c0.C1753a
        public void g(View view, H h) {
            super.g(view, h);
            h.O0(false);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.c.h();
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.w0.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends C1753a {
        private final TextInputLayout d;

        public e(TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        @Override // ax.c0.C1753a
        public void g(View view, H h) {
            super.g(view, h);
            EditText editText = this.d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.d.getHint();
            CharSequence error = this.d.getError();
            CharSequence placeholderText = this.d.getPlaceholderText();
            int counterMaxLength = this.d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.d.getCounterOverflowDescription();
            boolean isEmpty = TextUtils.isEmpty(text);
            boolean isEmpty2 = TextUtils.isEmpty(hint);
            boolean Q = this.d.Q();
            boolean isEmpty3 = TextUtils.isEmpty(error);
            boolean z = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String charSequence = !isEmpty2 ? hint.toString() : HttpUrl.FRAGMENT_ENCODE_SET;
            this.d.b.A(h);
            if (!isEmpty) {
                h.M0(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                h.M0(charSequence);
                if (!Q && placeholderText != null) {
                    h.M0(charSequence + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                h.M0(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    h.x0(charSequence);
                } else {
                    if (!isEmpty) {
                        charSequence = ((Object) text) + ", " + charSequence;
                    }
                    h.M0(charSequence);
                }
                h.I0(isEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            h.z0(counterMaxLength);
            if (z) {
                if (isEmpty3) {
                    error = counterOverflowDescription;
                }
                h.t0(error);
            }
            View t = this.d.k.t();
            if (t != null) {
                h.y0(t);
            }
            this.d.c.m().o(view, h);
        }

        @Override // ax.c0.C1753a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.d.c.m().p(view, accessibilityEvent);
        }
    }

    public interface f {
        int a(Editable editable);
    }

    public interface g {
        void a(TextInputLayout textInputLayout);
    }

    public interface h {
        void a(TextInputLayout textInputLayout, int i);
    }

    static class i extends AbstractC2357a {
        public static final Parcelable.Creator<i> CREATOR = new a();
        CharSequence d0;
        boolean e0;

        class a implements Parcelable.ClassLoaderCreator<i> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i) {
                return new i[i];
            }
        }

        i(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.d0) + "}";
        }

        @Override // ax.k0.AbstractC2357a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.d0, parcel, i);
            parcel.writeInt(this.e0 ? 1 : 0);
        }

        i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d0 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.e0 = parcel.readInt() == 1;
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2402c.h0);
    }

    private void A(boolean z) {
        ValueAnimator valueAnimator = this.z0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.z0.cancel();
        }
        if (z && this.y0) {
            m(1.0f);
        } else {
            this.w0.j0(1.0f);
        }
        this.v0 = false;
        if (C()) {
            W();
        }
        z0();
        this.b.l(false);
        this.c.H(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(Editable editable) {
        if (this.o.a(editable) != 0 || this.v0) {
            M();
        } else {
            g0();
        }
    }

    private C3260c B() {
        C3260c c3260c = new C3260c();
        c3260c.e0(ax.H6.i.f(getContext(), C2402c.H, 87));
        c3260c.g0(ax.H6.i.g(getContext(), C2402c.N, C2472a.a));
        return c3260c;
    }

    private void B0(boolean z, boolean z2) {
        int defaultColor = this.o0.getDefaultColor();
        int colorForState = this.o0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.o0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.U = colorForState2;
        } else if (z2) {
            this.U = colorForState;
        } else {
            this.U = defaultColor;
        }
    }

    private boolean C() {
        return this.D && !TextUtils.isEmpty(this.E) && (this.G instanceof com.google.android.material.textfield.h);
    }

    private void D() {
        Iterator<g> it = this.f0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void E(Canvas canvas) {
        ax.O6.h hVar;
        if (this.L == null || (hVar = this.K) == null) {
            return;
        }
        hVar.draw(canvas);
        if (this.e.isFocused()) {
            Rect bounds = this.L.getBounds();
            Rect bounds2 = this.K.getBounds();
            float B = this.w0.B();
            int centerX = bounds2.centerX();
            bounds.left = C2472a.c(centerX, bounds2.left, B);
            bounds.right = C2472a.c(centerX, bounds2.right, B);
            this.L.draw(canvas);
        }
    }

    private void F(Canvas canvas) {
        if (this.D) {
            this.w0.k(canvas);
        }
    }

    private void G(boolean z) {
        ValueAnimator valueAnimator = this.z0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.z0.cancel();
        }
        if (z && this.y0) {
            m(0.0f);
        } else {
            this.w0.j0(0.0f);
        }
        if (C() && ((com.google.android.material.textfield.h) this.G).z0()) {
            z();
        }
        this.v0 = true;
        M();
        this.b.l(true);
        this.c.H(true);
    }

    private ax.O6.h H(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(C2404e.s0);
        float f2 = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.e;
        float popupElevation = editText instanceof v ? ((v) editText).getPopupElevation() : getResources().getDimensionPixelOffset(C2404e.w);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C2404e.n0);
        ax.O6.l m = ax.O6.l.a().C(f2).G(f2).u(dimensionPixelOffset).y(dimensionPixelOffset).m();
        EditText editText2 = this.e;
        ax.O6.h r = ax.O6.h.r(getContext(), popupElevation, editText2 instanceof v ? ((v) editText2).getDropDownBackgroundTintList() : null);
        r.setShapeAppearanceModel(m);
        r.j0(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return r;
    }

    private static Drawable I(ax.O6.h hVar, int i2, int i3, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{C3555a.k(i3, i2, 0.1f), i2}), hVar, hVar);
    }

    private int J(int i2, boolean z) {
        return i2 + ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.e.getCompoundPaddingLeft() : this.c.y() : this.b.c());
    }

    private int K(int i2, boolean z) {
        return i2 - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.e.getCompoundPaddingRight() : this.b.c() : this.c.y());
    }

    private static Drawable L(Context context, ax.O6.h hVar, int i2, int[][] iArr) {
        int c2 = C3555a.c(context, C2402c.i, "TextInputLayout");
        ax.O6.h hVar2 = new ax.O6.h(hVar.I());
        int k = C3555a.k(i2, c2, 0.1f);
        hVar2.g0(new ColorStateList(iArr, new int[]{k, 0}));
        hVar2.setTint(c2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{k, c2});
        ax.O6.h hVar3 = new ax.O6.h(hVar.I());
        hVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, hVar2, hVar3), hVar});
    }

    private void M() {
        TextView textView = this.u;
        if (textView == null || !this.t) {
            return;
        }
        textView.setText((CharSequence) null);
        ax.v2.t.a(this.a, this.y);
        this.u.setVisibility(4);
    }

    private boolean R() {
        return getHintMaxLines() == 1;
    }

    private boolean S() {
        if (d0()) {
            return true;
        }
        return this.p != null && this.n;
    }

    private boolean U() {
        return this.P == 1 && this.e.getMinLines() <= 1;
    }

    private void V() {
        q();
        s0();
        C0();
        h0();
        l();
        if (this.P != 0) {
            v0();
        }
        b0();
    }

    private void W() {
        if (C()) {
            RectF rectF = this.b0;
            this.w0.o(rectF, this.e.getWidth(), this.e.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            p(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.R);
            rectF.top = 0.0f;
            ((com.google.android.material.textfield.h) this.G).C0(rectF);
        }
    }

    private void X() {
        if (!C() || this.v0) {
            return;
        }
        z();
        W();
    }

    private static void Y(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                Y((ViewGroup) childAt, z);
            }
        }
    }

    private void a0() {
        TextView textView = this.u;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public static /* synthetic */ void b(TextInputLayout textInputLayout, StaticLayout.Builder builder) {
        int breakStrategy;
        if (Build.VERSION.SDK_INT < 23) {
            textInputLayout.getClass();
        } else {
            breakStrategy = textInputLayout.u.getBreakStrategy();
            builder.setBreakStrategy(breakStrategy);
        }
    }

    private void b0() {
        EditText editText = this.e;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i2 = this.P;
                if (i2 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i2 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
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
        return (this.c.G() || ((this.c.A() && N()) || this.c.w() != null)) && this.c.getMeasuredWidth() > 0;
    }

    private boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.b.getMeasuredWidth() > 0;
    }

    private void g0() {
        if (this.u == null || !this.t || TextUtils.isEmpty(this.s)) {
            return;
        }
        this.u.setText(this.s);
        ax.v2.t.a(this.a, this.x);
        this.u.setVisibility(0);
        this.u.bringToFront();
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.e;
        if (!(editText instanceof AutoCompleteTextView) || q.a(editText)) {
            return this.G;
        }
        int d2 = C3555a.d(this.e, C2506a.w);
        int i2 = this.P;
        if (i2 == 2) {
            return L(getContext(), this.G, d2, E0);
        }
        if (i2 == 1) {
            return I(this.G, this.V, d2, E0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.I == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.I = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.I.addState(new int[0], H(false));
        }
        return this.I;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.H == null) {
            this.H = H(true);
        }
        return this.H;
    }

    private void h0() {
        if (this.P == 1) {
            if (ax.K6.c.i(getContext())) {
                this.Q = getResources().getDimensionPixelSize(C2404e.L);
            } else if (ax.K6.c.h(getContext())) {
                this.Q = getResources().getDimensionPixelSize(C2404e.K);
            }
        }
    }

    private void i0(Rect rect) {
        ax.O6.h hVar = this.K;
        if (hVar != null) {
            int i2 = rect.bottom;
            hVar.setBounds(rect.left, i2 - this.S, rect.right, i2);
        }
        ax.O6.h hVar2 = this.L;
        if (hVar2 != null) {
            int i3 = rect.bottom;
            hVar2.setBounds(rect.left, i3 - this.T, rect.right, i3);
        }
    }

    private void j0(int i2) {
        this.w0.s0(i2);
        Rect rect = this.W;
        ax.F6.c.a(this, this.e, rect);
        this.w0.S(s(rect));
        v0();
        l();
        t0(i2);
    }

    private void k() {
        TextView textView = this.u;
        if (textView != null) {
            this.a.addView(textView);
            this.u.setVisibility(0);
        }
    }

    private void k0() {
        if (this.p != null) {
            EditText editText = this.e;
            l0(editText == null ? null : editText.getText());
        }
    }

    private void l() {
        if (this.e == null || this.P != 1) {
            return;
        }
        if (!R()) {
            EditText editText = this.e;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.w0.q() + this.d), this.e.getPaddingEnd(), getResources().getDimensionPixelSize(C2404e.G));
        } else if (ax.K6.c.i(getContext())) {
            EditText editText2 = this.e;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(C2404e.J), this.e.getPaddingEnd(), getResources().getDimensionPixelSize(C2404e.I));
        } else if (ax.K6.c.h(getContext())) {
            EditText editText3 = this.e;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(C2404e.H), this.e.getPaddingEnd(), getResources().getDimensionPixelSize(C2404e.G));
        }
    }

    private static void m0(Context context, TextView textView, int i2, int i3, boolean z) {
        textView.setContentDescription(context.getString(z ? C2410k.c : C2410k.b, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    private void n() {
        ax.O6.h hVar = this.G;
        if (hVar == null) {
            return;
        }
        ax.O6.l I = hVar.I();
        ax.O6.l lVar = this.M;
        if (I != lVar) {
            this.G.setShapeAppearanceModel(lVar);
        }
        if (x()) {
            this.G.m0(this.R, this.U);
        }
        int r = r();
        this.V = r;
        this.G.g0(ColorStateList.valueOf(r));
        o();
        s0();
    }

    private void n0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.p;
        if (textView != null) {
            c0(textView, this.n ? this.q : this.r);
            if (!this.n && (colorStateList2 = this.z) != null) {
                this.p.setTextColor(colorStateList2);
            }
            if (!this.n || (colorStateList = this.A) == null) {
                return;
            }
            this.p.setTextColor(colorStateList);
        }
    }

    private void o() {
        if (this.K == null || this.L == null) {
            return;
        }
        if (y()) {
            this.K.g0(this.e.isFocused() ? ColorStateList.valueOf(this.l0) : ColorStateList.valueOf(this.U));
            this.L.g0(ColorStateList.valueOf(this.U));
        }
        invalidate();
    }

    private void o0() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.B;
        if (colorStateList2 == null) {
            colorStateList2 = C3555a.h(getContext(), C2506a.v);
        }
        EditText editText = this.e;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.e.getTextCursorDrawable();
            Drawable mutate = ax.U.a.r(textCursorDrawable2).mutate();
            if (S() && (colorStateList = this.C) != null) {
                colorStateList2 = colorStateList;
            }
            mutate.setTintList(colorStateList2);
        }
    }

    private void p(RectF rectF) {
        float f2 = rectF.left;
        int i2 = this.O;
        rectF.left = f2 - i2;
        rectF.right += i2;
    }

    private void q() {
        int i2 = this.P;
        if (i2 == 0) {
            this.G = null;
            this.K = null;
            this.L = null;
            return;
        }
        if (i2 == 1) {
            this.G = new ax.O6.h(this.M);
            this.K = new ax.O6.h();
            this.L = new ax.O6.h();
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException(this.P + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.D || (this.G instanceof com.google.android.material.textfield.h)) {
                this.G = new ax.O6.h(this.M);
            } else {
                this.G = com.google.android.material.textfield.h.x0(this.M);
            }
            this.K = null;
            this.L = null;
        }
    }

    private int r() {
        return this.P == 1 ? C3555a.j(C3555a.e(this, C2402c.i, 0), this.V) : this.V;
    }

    private void r0() {
        this.e.setBackground(getEditTextBoxBackground());
    }

    private Rect s(Rect rect) {
        if (this.e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.a0;
        boolean h2 = ax.F6.z.h(this);
        rect2.bottom = rect.bottom;
        int i2 = this.P;
        if (i2 == 1) {
            rect2.left = J(rect.left, h2);
            rect2.top = rect.top + this.Q;
            rect2.right = K(rect.right, h2);
            return rect2;
        }
        if (i2 != 2) {
            rect2.left = J(rect.left, h2);
            rect2.top = getPaddingTop();
            rect2.right = K(rect.right, h2);
            return rect2;
        }
        rect2.left = rect.left + this.e.getPaddingLeft();
        rect2.top = rect.top - w();
        rect2.right = rect.right - this.e.getPaddingRight();
        return rect2;
    }

    private void setEditText(EditText editText) {
        if (this.e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.e = editText;
        int i2 = this.g;
        if (i2 != -1) {
            setMinEms(i2);
        } else {
            setMinWidth(this.i);
        }
        int i3 = this.h;
        if (i3 != -1) {
            setMaxEms(i3);
        } else {
            setMaxWidth(this.j);
        }
        this.J = false;
        V();
        setTextInputAccessibilityDelegate(new e(this));
        this.w0.p0(this.e.getTypeface());
        this.w0.h0(this.e.getTextSize());
        this.w0.d0(this.e.getLetterSpacing());
        int gravity = this.e.getGravity();
        this.w0.X((gravity & (-113)) | 48);
        this.w0.g0(gravity);
        this.u0 = editText.getMinimumHeight();
        this.e.addTextChangedListener(new a(editText));
        if (this.j0 == null) {
            this.j0 = this.e.getHintTextColors();
        }
        if (this.D) {
            if (TextUtils.isEmpty(this.E)) {
                CharSequence hint = this.e.getHint();
                this.f = hint;
                setHint(hint);
                this.e.setHint((CharSequence) null);
            }
            this.F = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            o0();
        }
        if (this.p != null) {
            l0(this.e.getText());
        }
        q0();
        this.k.f();
        this.b.bringToFront();
        this.c.bringToFront();
        D();
        this.c.x0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        x0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.E)) {
            return;
        }
        this.E = charSequence;
        this.w0.n0(charSequence);
        if (this.v0) {
            return;
        }
        W();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.t == z) {
            return;
        }
        if (z) {
            k();
        } else {
            a0();
            this.u = null;
        }
        this.t = z;
    }

    private int t(Rect rect, Rect rect2, float f2) {
        return U() ? (int) (rect2.top + f2) : rect.bottom - this.e.getCompoundPaddingBottom();
    }

    private void t0(int i2) {
        if (this.e == null) {
            return;
        }
        float z = this.w0.z();
        float f2 = 0.0f;
        if (this.s != null) {
            TextPaint textPaint = new TextPaint(129);
            textPaint.set(this.u.getPaint());
            textPaint.setTextSize(this.u.getTextSize());
            textPaint.setTypeface(this.u.getTypeface());
            textPaint.setLetterSpacing(this.u.getLetterSpacing());
            try {
                f2 = ax.F6.s.c(this.s, textPaint, i2).h(getLayoutDirection() == 1).g(true).i(this.u.getLineSpacingExtra(), this.u.getLineSpacingMultiplier()).k(new ax.F6.t() { // from class: ax.T6.p
                    @Override // ax.F6.t
                    public final void a(StaticLayout.Builder builder) {
                        TextInputLayout.b(TextInputLayout.this, builder);
                    }
                }).a().getHeight() + (this.P == 1 ? this.w0.q() + this.Q + this.d : 0.0f);
            } catch (s.a e2) {
                Log.e("TextInputLayout", e2.getCause().getMessage(), e2);
            }
        }
        float max = Math.max(z, f2);
        if (this.e.getMeasuredHeight() < max) {
            this.e.setMinimumHeight(Math.round(max));
        }
    }

    private int u(Rect rect, float f2) {
        if (U()) {
            return (int) (rect.centerY() - (f2 / 2.0f));
        }
        return (rect.top + this.e.getCompoundPaddingTop()) - ((this.P != 0 || R()) ? 0 : (int) (this.w0.A() / 2.0f));
    }

    private boolean u0() {
        int max;
        if (this.e == null || this.e.getMeasuredHeight() >= (max = Math.max(this.c.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            return false;
        }
        this.e.setMinimumHeight(max);
        return true;
    }

    private Rect v(Rect rect) {
        if (this.e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.a0;
        float A = R() ? this.w0.A() : this.w0.y() * this.w0.w();
        rect2.left = rect.left + this.e.getCompoundPaddingLeft();
        rect2.top = u(rect, A);
        rect2.right = rect.right - this.e.getCompoundPaddingRight();
        rect2.bottom = t(rect, rect2, A);
        return rect2;
    }

    private void v0() {
        if (this.P != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.a.getLayoutParams();
            int w = w();
            if (w != layoutParams.topMargin) {
                layoutParams.topMargin = w;
                this.a.requestLayout();
            }
        }
    }

    private int w() {
        if (!this.D) {
            return 0;
        }
        int i2 = this.P;
        if (i2 == 0) {
            return (int) this.w0.q();
        }
        if (i2 != 2) {
            return 0;
        }
        return R() ? (int) (this.w0.q() / 2.0f) : Math.max(0, (int) (this.w0.q() - (this.w0.n() / 2.0f)));
    }

    private boolean x() {
        return this.P == 2 && y();
    }

    private void x0(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.e;
        boolean z3 = false;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.e;
        if (editText2 != null && editText2.hasFocus()) {
            z3 = true;
        }
        ColorStateList colorStateList2 = this.j0;
        if (colorStateList2 != null) {
            this.w0.Q(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.j0;
            this.w0.Q(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.t0) : this.t0));
        } else if (d0()) {
            this.w0.Q(this.k.r());
        } else if (this.n && (textView = this.p) != null) {
            this.w0.Q(textView.getTextColors());
        } else if (z3 && (colorStateList = this.k0) != null) {
            this.w0.W(colorStateList);
        }
        if (z4 || !this.x0 || (isEnabled() && z3)) {
            if (z2 || this.v0) {
                A(z);
                return;
            }
            return;
        }
        if (z2 || !this.v0) {
            G(z);
        }
    }

    private boolean y() {
        return this.R > -1 && this.U != 0;
    }

    private void y0() {
        EditText editText;
        if (this.u == null || (editText = this.e) == null) {
            return;
        }
        this.u.setGravity(editText.getGravity());
        this.u.setPadding(this.e.getCompoundPaddingLeft(), this.e.getCompoundPaddingTop(), this.e.getCompoundPaddingRight(), this.e.getCompoundPaddingBottom());
    }

    private void z() {
        if (C()) {
            ((com.google.android.material.textfield.h) this.G).A0();
        }
    }

    private void z0() {
        EditText editText = this.e;
        A0(editText == null ? null : editText.getText());
    }

    void C0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.G == null || this.P == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.e) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.U = this.t0;
        } else if (d0()) {
            if (this.o0 != null) {
                B0(z2, z);
            } else {
                this.U = getErrorCurrentTextColors();
            }
        } else if (!this.n || (textView = this.p) == null) {
            if (z2) {
                this.U = this.n0;
            } else if (z) {
                this.U = this.m0;
            } else {
                this.U = this.l0;
            }
        } else if (this.o0 != null) {
            B0(z2, z);
        } else {
            this.U = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            o0();
        }
        this.c.I();
        Z();
        if (this.P == 2) {
            int i2 = this.R;
            if (z2 && isEnabled()) {
                this.R = this.T;
            } else {
                this.R = this.S;
            }
            if (this.R != i2) {
                X();
            }
        }
        if (this.P == 1) {
            if (!isEnabled()) {
                this.V = this.q0;
            } else if (z && !z2) {
                this.V = this.s0;
            } else if (z2) {
                this.V = this.r0;
            } else {
                this.V = this.p0;
            }
        }
        n();
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

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i2, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.a.addView(view, layoutParams2);
        this.a.setLayoutParams(layoutParams);
        v0();
        setEditText((EditText) view);
    }

    void c0(TextView textView, int i2) {
        try {
            ax.h0.j.m(textView, i2);
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
            ax.h0.j.m(textView, ax.m.i.b);
            textView.setTextColor(ax.Q.b.c(getContext(), C2403d.a));
        }
    }

    boolean d0() {
        return this.k.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        AutofillId autofillId;
        ViewStructure newChild;
        EditText editText = this.e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.f != null) {
            boolean z = this.F;
            this.F = false;
            CharSequence hint = editText.getHint();
            this.e.setHint(this.f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
                return;
            } finally {
                this.e.setHint(hint);
                this.F = z;
            }
        }
        autofillId = getAutofillId();
        viewStructure.setAutofillId(autofillId);
        onProvideAutofillStructure(viewStructure, i2);
        onProvideAutofillVirtualStructure(viewStructure, i2);
        viewStructure.setChildCount(this.a.getChildCount());
        for (int i3 = 0; i3 < this.a.getChildCount(); i3++) {
            View childAt = this.a.getChildAt(i3);
            newChild = viewStructure.newChild(i3);
            childAt.dispatchProvideAutofillStructure(newChild, i2);
            if (childAt == this.e) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.B0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.B0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        F(canvas);
        E(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.A0) {
            return;
        }
        this.A0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C0691a c0691a = this.w0;
        boolean m0 = c0691a != null ? c0691a.m0(drawableState) : false;
        if (this.e != null) {
            w0(isLaidOut() && isEnabled());
        }
        q0();
        C0();
        if (m0) {
            invalidate();
        }
        this.A0 = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.e;
        return editText != null ? editText.getBaseline() + getPaddingTop() + w() : super.getBaseline();
    }

    ax.O6.h getBoxBackground() {
        int i2 = this.P;
        if (i2 == 1 || i2 == 2) {
            return this.G;
        }
        throw new IllegalStateException();
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
        return ax.F6.z.h(this) ? this.M.j().a(this.b0) : this.M.l().a(this.b0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return ax.F6.z.h(this) ? this.M.l().a(this.b0) : this.M.j().a(this.b0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return ax.F6.z.h(this) ? this.M.r().a(this.b0) : this.M.t().a(this.b0);
    }

    public float getBoxCornerRadiusTopStart() {
        return ax.F6.z.h(this) ? this.M.t().a(this.b0) : this.M.r().a(this.b0);
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

    public void j(g gVar) {
        this.f0.add(gVar);
        if (this.e != null) {
            gVar.a(this);
        }
    }

    void l0(Editable editable) {
        int a2 = this.o.a(editable);
        boolean z = this.n;
        int i2 = this.m;
        if (i2 == -1) {
            this.p.setText(String.valueOf(a2));
            this.p.setContentDescription(null);
            this.n = false;
        } else {
            this.n = a2 > i2;
            m0(getContext(), this.p, a2, this.m, this.n);
            if (z != this.n) {
                n0();
            }
            this.p.setText(C1263a.c().j(getContext().getString(C2410k.d, Integer.valueOf(a2), Integer.valueOf(this.m))));
        }
        if (this.e == null || z == this.n) {
            return;
        }
        w0(false);
        C0();
        q0();
    }

    void m(float f2) {
        if (this.w0.B() == f2) {
            return;
        }
        if (this.z0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.z0 = valueAnimator;
            valueAnimator.setInterpolator(ax.H6.i.g(getContext(), C2402c.M, C2472a.b));
            this.z0.setDuration(ax.H6.i.f(getContext(), C2402c.G, 167));
            this.z0.addUpdateListener(new d());
        }
        this.z0.setFloatValues(this.w0.B(), f2);
        this.z0.start();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.w0.L(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.C0 = false;
        boolean u0 = u0();
        boolean p0 = p0();
        if (u0 || p0) {
            this.e.post(new Runnable() { // from class: ax.T6.n
                @Override // java.lang.Runnable
                public final void run() {
                    TextInputLayout.this.e.requestLayout();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        EditText editText = this.e;
        if (editText != null) {
            Rect rect = this.W;
            ax.F6.c.a(this, editText, rect);
            i0(rect);
            if (this.D) {
                this.w0.h0(this.e.getTextSize());
                int gravity = this.e.getGravity();
                this.w0.X((gravity & (-113)) | 48);
                this.w0.g0(gravity);
                this.w0.S(s(rect));
                this.w0.c0(v(rect));
                this.w0.N();
                if (!C() || this.v0) {
                    return;
                }
                W();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (!this.C0) {
            this.c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.C0 = true;
        }
        y0();
        this.c.x0();
        if (R()) {
            return;
        }
        j0((this.e.getMeasuredWidth() - this.e.getCompoundPaddingLeft()) - this.e.getCompoundPaddingRight());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        setError(iVar.d0);
        if (iVar.e0) {
            post(new c());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z = i2 == 1;
        if (z != this.N) {
            float a2 = this.M.r().a(this.b0);
            float a3 = this.M.t().a(this.b0);
            ax.O6.l m = ax.O6.l.a().B(this.M.s()).F(this.M.q()).t(this.M.k()).x(this.M.i()).C(a3).G(a2).u(this.M.l().a(this.b0)).y(this.M.j().a(this.b0)).m();
            this.N = z;
            setShapeAppearanceModel(m);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        if (d0()) {
            iVar.d0 = getError();
        }
        iVar.e0 = this.c.E();
        return iVar;
    }

    boolean p0() {
        boolean z;
        if (this.e == null) {
            return false;
        }
        boolean z2 = true;
        if (f0()) {
            int measuredWidth = this.b.getMeasuredWidth() - this.e.getPaddingLeft();
            if (this.d0 == null || this.e0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.d0 = colorDrawable;
                this.e0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.e.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.d0;
            if (drawable != drawable2) {
                this.e.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.d0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.e.getCompoundDrawablesRelative();
                this.e.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.d0 = null;
                z = true;
            }
            z = false;
        }
        if (e0()) {
            int measuredWidth2 = this.c.z().getMeasuredWidth() - this.e.getPaddingRight();
            CheckableImageButton k = this.c.k();
            if (k != null) {
                measuredWidth2 = measuredWidth2 + k.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) k.getLayoutParams()).getMarginStart();
            }
            Drawable[] compoundDrawablesRelative3 = this.e.getCompoundDrawablesRelative();
            Drawable drawable3 = this.g0;
            if (drawable3 != null && this.h0 != measuredWidth2) {
                this.h0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.g0, compoundDrawablesRelative3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.g0 = colorDrawable2;
                this.h0 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.g0;
            if (drawable4 != drawable5) {
                this.i0 = drawable4;
                this.e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.g0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.e.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.g0) {
                this.e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.i0, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.g0 = null;
            return z2;
        }
        return z;
    }

    void q0() {
        Drawable background;
        TextView textView;
        EditText editText = this.e;
        if (editText == null || this.P != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (A.a(background)) {
            background = background.mutate();
        }
        if (d0()) {
            background.setColorFilter(C0580k.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.n && (textView = this.p) != null) {
            background.setColorFilter(C0580k.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            ax.U.a.c(background);
            this.e.refreshDrawableState();
        }
    }

    void s0() {
        EditText editText = this.e;
        if (editText == null || this.G == null) {
            return;
        }
        if ((this.J || editText.getBackground() == null) && this.P != 0) {
            r0();
            this.J = true;
        }
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.V != i2) {
            this.V = i2;
            this.p0 = i2;
            this.r0 = i2;
            this.s0 = i2;
            n();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(ax.Q.b.c(getContext(), i2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.p0 = defaultColor;
        this.V = defaultColor;
        this.q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.r0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.s0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        n();
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 == this.P) {
            return;
        }
        this.P = i2;
        if (this.e != null) {
            V();
        }
    }

    public void setBoxCollapsedPaddingTop(int i2) {
        this.Q = i2;
    }

    public void setBoxCornerFamily(int i2) {
        this.M = this.M.w().A(i2, this.M.r()).E(i2, this.M.t()).s(i2, this.M.j()).w(i2, this.M.l()).m();
        n();
    }

    public void setBoxStrokeColor(int i2) {
        if (this.n0 != i2) {
            this.n0 = i2;
            C0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.l0 = colorStateList.getDefaultColor();
            this.t0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.m0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.n0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.n0 != colorStateList.getDefaultColor()) {
            this.n0 = colorStateList.getDefaultColor();
        }
        C0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.o0 != colorStateList) {
            this.o0 = colorStateList;
            C0();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.S = i2;
        C0();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.T = i2;
        C0();
    }

    public void setBoxStrokeWidthFocusedResource(int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z) {
        if (this.l != z) {
            if (z) {
                androidx.appcompat.widget.x xVar = new androidx.appcompat.widget.x(getContext());
                this.p = xVar;
                xVar.setId(C2406g.Q);
                Typeface typeface = this.c0;
                if (typeface != null) {
                    this.p.setTypeface(typeface);
                }
                this.p.setMaxLines(1);
                this.k.e(this.p, 2);
                ((ViewGroup.MarginLayoutParams) this.p.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(C2404e.x0));
                n0();
                k0();
            } else {
                this.k.C(this.p, 2);
                this.p = null;
            }
            this.l = z;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.m != i2) {
            if (i2 > 0) {
                this.m = i2;
            } else {
                this.m = -1;
            }
            if (this.l) {
                k0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.q != i2) {
            this.q = i2;
            n0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            n0();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.r != i2) {
            this.r = i2;
            n0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            n0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            o0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            if (S()) {
                o0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.j0 = colorStateList;
        this.k0 = colorStateList;
        if (this.e != null) {
            w0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        Y(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.c.N(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.c.O(z);
    }

    public void setEndIconContentDescription(int i2) {
        this.c.P(i2);
    }

    public void setEndIconDrawable(int i2) {
        this.c.R(i2);
    }

    public void setEndIconMinSize(int i2) {
        this.c.T(i2);
    }

    public void setEndIconMode(int i2) {
        this.c.U(i2);
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

    public void setEndIconVisible(boolean z) {
        this.c.a0(z);
    }

    public void setError(CharSequence charSequence) {
        if (!this.k.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.k.w();
        } else {
            this.k.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i2) {
        this.k.E(i2);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.k.F(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.k.G(z);
    }

    public void setErrorIconDrawable(int i2) {
        this.c.b0(i2);
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

    public void setErrorTextAppearance(int i2) {
        this.k.H(i2);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.k.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.x0 != z) {
            this.x0 = z;
            w0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (P()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!P()) {
                setHelperTextEnabled(true);
            }
            this.k.R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.k.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.k.K(z);
    }

    public void setHelperTextTextAppearance(int i2) {
        this.k.J(i2);
    }

    public void setHint(CharSequence charSequence) {
        if (this.D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.y0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.D) {
            this.D = z;
            if (z) {
                CharSequence hint = this.e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.E)) {
                        setHint(hint);
                    }
                    this.e.setHint((CharSequence) null);
                }
                this.F = true;
            } else {
                this.F = false;
                if (!TextUtils.isEmpty(this.E) && TextUtils.isEmpty(this.e.getHint())) {
                    this.e.setHint(this.E);
                }
                setHintInternal(null);
            }
            if (this.e != null) {
                v0();
            }
        }
    }

    public void setHintMaxLines(int i2) {
        this.w0.T(i2);
        this.w0.e0(i2);
        requestLayout();
    }

    public void setHintTextAppearance(int i2) {
        this.w0.U(i2);
        this.k0 = this.w0.p();
        if (this.e != null) {
            w0(false);
            v0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.k0 != colorStateList) {
            if (this.j0 == null) {
                this.w0.W(colorStateList);
            }
            this.k0 = colorStateList;
            if (this.e != null) {
                w0(false);
            }
        }
    }

    public void setLengthCounter(f fVar) {
        this.o = fVar;
    }

    public void setMaxEms(int i2) {
        this.h = i2;
        EditText editText = this.e;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxEms(i2);
    }

    public void setMaxWidth(int i2) {
        this.j = i2;
        EditText editText = this.e;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxWidth(i2);
    }

    public void setMaxWidthResource(int i2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public void setMinEms(int i2) {
        this.g = i2;
        EditText editText = this.e;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinEms(i2);
    }

    public void setMinWidth(int i2) {
        this.i = i2;
        EditText editText = this.e;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinWidth(i2);
    }

    public void setMinWidthResource(int i2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        this.c.i0(i2);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        this.c.k0(i2);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        this.c.m0(z);
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
            androidx.appcompat.widget.x xVar = new androidx.appcompat.widget.x(getContext());
            this.u = xVar;
            xVar.setId(C2406g.T);
            this.u.setImportantForAccessibility(1);
            this.u.setAccessibilityLiveRegion(1);
            C3260c B = B();
            this.x = B;
            B.j0(67L);
            this.y = B();
            setPlaceholderTextAppearance(this.w);
            setPlaceholderTextColor(this.v);
            C1760d0.l0(this.u, new b());
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.t) {
                setPlaceholderTextEnabled(true);
            }
            this.s = charSequence;
        }
        z0();
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.w = i2;
        TextView textView = this.u;
        if (textView != null) {
            ax.h0.j.m(textView, i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.v != colorStateList) {
            this.v = colorStateList;
            TextView textView = this.u;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.b.n(charSequence);
    }

    public void setPrefixTextAppearance(int i2) {
        this.b.o(i2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.b.p(colorStateList);
    }

    public void setShapeAppearanceModel(ax.O6.l lVar) {
        ax.O6.h hVar = this.G;
        if (hVar == null || hVar.I() == lVar) {
            return;
        }
        this.M = lVar;
        n();
    }

    public void setStartIconCheckable(boolean z) {
        this.b.q(z);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? C2653a.b(getContext(), i2) : null);
    }

    public void setStartIconMinSize(int i2) {
        this.b.t(i2);
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

    public void setStartIconVisible(boolean z) {
        this.b.z(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.c.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i2) {
        this.c.q0(i2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.c.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.e;
        if (editText != null) {
            C1760d0.l0(editText, eVar);
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

    void w0(boolean z) {
        x0(z, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            Method dump skipped, instructions count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.c.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.c.S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.c.c0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.c.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.c.l0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.b.r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.b.s(drawable);
    }

    public void setHint(int i2) {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }
}
