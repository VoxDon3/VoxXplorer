package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import ax.a0.s;
import ax.o.C2653a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class x extends TextView implements ax.h0.n {
    private final C0574e a;
    private final w b;
    private final v c;
    private C0583n d;
    private boolean e;
    private a f;
    private Future<ax.a0.s> g;

    private interface a {
        void a(int[] iArr, int i);

        int[] b();

        TextClassifier c();

        int d();

        void e(TextClassifier textClassifier);

        void f(int i);

        void g(int i, int i2, int i3, int i4);

        int h();

        int i();

        void j(int i);

        int k();

        void l(int i);

        void m(int i, float f);
    }

    class b implements a {
        b() {
        }

        @Override // androidx.appcompat.widget.x.a
        public void a(int[] iArr, int i) {
            x.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @Override // androidx.appcompat.widget.x.a
        public int[] b() {
            return x.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.x.a
        public TextClassifier c() {
            return x.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.x.a
        public int d() {
            return x.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.x.a
        public void e(TextClassifier textClassifier) {
            x.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.x.a
        public void f(int i) {
        }

        @Override // androidx.appcompat.widget.x.a
        public void g(int i, int i2, int i3, int i4) {
            x.super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @Override // androidx.appcompat.widget.x.a
        public int h() {
            return x.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.x.a
        public int i() {
            return x.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.x.a
        public void j(int i) {
        }

        @Override // androidx.appcompat.widget.x.a
        public int k() {
            return x.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.x.a
        public void l(int i) {
            x.super.setAutoSizeTextTypeWithDefaults(i);
        }

        @Override // androidx.appcompat.widget.x.a
        public void m(int i, float f) {
        }
    }

    class c extends b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.x.b, androidx.appcompat.widget.x.a
        public void f(int i) {
            x.super.setLastBaselineToBottomHeight(i);
        }

        @Override // androidx.appcompat.widget.x.b, androidx.appcompat.widget.x.a
        public void j(int i) {
            x.super.setFirstBaselineToTopHeight(i);
        }
    }

    class d extends c {
        d() {
            super();
        }

        @Override // androidx.appcompat.widget.x.b, androidx.appcompat.widget.x.a
        public void m(int i, float f) {
            x.super.setLineHeight(i, f);
        }
    }

    public x(Context context) {
        this(context, null);
    }

    private C0583n getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0583n(this);
        }
        return this.d;
    }

    private void r() {
        Future<ax.a0.s> future = this.g;
        if (future != null) {
            try {
                this.g = null;
                ax.h0.j.l(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0574e c0574e = this.a;
        if (c0574e != null) {
            c0574e.b();
        }
        w wVar = this.b;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (O.c) {
            return getSuperCaller().d();
        }
        w wVar = this.b;
        if (wVar != null) {
            return wVar.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (O.c) {
            return getSuperCaller().i();
        }
        w wVar = this.b;
        if (wVar != null) {
            return wVar.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (O.c) {
            return getSuperCaller().k();
        }
        w wVar = this.b;
        if (wVar != null) {
            return wVar.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (O.c) {
            return getSuperCaller().b();
        }
        w wVar = this.b;
        return wVar != null ? wVar.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (O.c) {
            return getSuperCaller().h() == 1 ? 1 : 0;
        }
        w wVar = this.b;
        if (wVar != null) {
            return wVar.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ax.h0.j.o(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return ax.h0.j.a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return ax.h0.j.b(this);
    }

    a getSuperCaller() {
        if (this.f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f = new d();
            } else if (i >= 28) {
                this.f = new c();
            } else if (i >= 26) {
                this.f = new b();
            }
        }
        return this.f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0574e c0574e = this.a;
        if (c0574e != null) {
            return c0574e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0574e c0574e = this.a;
        if (c0574e != null) {
            return c0574e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        r();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        v vVar;
        return (Build.VERSION.SDK_INT >= 28 || (vVar = this.c) == null) ? getSuperCaller().c() : vVar.a();
    }

    public s.a getTextMetricsParamsCompat() {
        return ax.h0.j.e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.r(this, onCreateInputConnection, editorInfo);
        return C0584o.a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        w wVar = this.b;
        if (wVar != null) {
            wVar.o(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        r();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        w wVar = this.b;
        if (wVar == null || O.c || !wVar.l()) {
            return;
        }
        this.b.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (O.c) {
            getSuperCaller().g(i, i2, i3, i4);
            return;
        }
        w wVar = this.b;
        if (wVar != null) {
            wVar.t(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (O.c) {
            getSuperCaller().a(iArr, i);
            return;
        }
        w wVar = this.b;
        if (wVar != null) {
            wVar.u(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (O.c) {
            getSuperCaller().l(i);
            return;
        }
        w wVar = this.b;
        if (wVar != null) {
            wVar.v(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0574e c0574e = this.a;
        if (c0574e != null) {
            c0574e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0574e c0574e = this.a;
        if (c0574e != null) {
            c0574e.g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w wVar = this.b;
        if (wVar != null) {
            wVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w wVar = this.b;
        if (wVar != null) {
            wVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        w wVar = this.b;
        if (wVar != null) {
            wVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        w wVar = this.b;
        if (wVar != null) {
            wVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ax.h0.j.p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().j(i);
        } else {
            ax.h0.j.h(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i);
        } else {
            ax.h0.j.i(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        ax.h0.j.j(this, i);
    }

    public void setPrecomputedText(ax.a0.s sVar) {
        ax.h0.j.l(this, sVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0574e c0574e = this.a;
        if (c0574e != null) {
            c0574e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0574e c0574e = this.a;
        if (c0574e != null) {
            c0574e.j(mode);
        }
    }

    @Override // ax.h0.n
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.b.w(colorStateList);
        this.b.b();
    }

    @Override // ax.h0.n
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.b.x(mode);
        this.b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        w wVar = this.b;
        if (wVar != null) {
            wVar.q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        v vVar;
        if (Build.VERSION.SDK_INT >= 28 || (vVar = this.c) == null) {
            getSuperCaller().e(textClassifier);
        } else {
            vVar.b(textClassifier);
        }
    }

    public void setTextFuture(Future<ax.a0.s> future) {
        this.g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(s.a aVar) {
        ax.h0.j.n(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (O.c) {
            super.setTextSize(i, f);
            return;
        }
        w wVar = this.b;
        if (wVar != null) {
            wVar.A(i, f);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        if (this.e) {
            return;
        }
        Typeface a2 = (typeface == null || i <= 0) ? null : ax.T.e.a(getContext(), typeface, i);
        this.e = true;
        if (a2 != null) {
            typeface = a2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.e = false;
        }
    }

    public x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().m(i, f);
        } else {
            ax.h0.j.k(this, i, f);
        }
    }

    public x(Context context, AttributeSet attributeSet, int i) {
        super(I.b(context), attributeSet, i);
        this.e = false;
        this.f = null;
        H.a(this, getContext());
        C0574e c0574e = new C0574e(this);
        this.a = c0574e;
        c0574e.e(attributeSet, i);
        w wVar = new w(this);
        this.b = wVar;
        wVar.m(attributeSet, i);
        wVar.b();
        this.c = new v(this);
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? C2653a.b(context, i) : null, i2 != 0 ? C2653a.b(context, i2) : null, i3 != 0 ? C2653a.b(context, i3) : null, i4 != 0 ? C2653a.b(context, i4) : null);
        w wVar = this.b;
        if (wVar != null) {
            wVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? C2653a.b(context, i) : null, i2 != 0 ? C2653a.b(context, i2) : null, i3 != 0 ? C2653a.b(context, i3) : null, i4 != 0 ? C2653a.b(context, i4) : null);
        w wVar = this.b;
        if (wVar != null) {
            wVar.p();
        }
    }
}
