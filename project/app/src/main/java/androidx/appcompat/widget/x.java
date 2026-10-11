/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

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
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.widget.H;
import androidx.appcompat.widget.I;
import androidx.appcompat.widget.O;
import androidx.appcompat.widget.e;
import androidx.appcompat.widget.n;
import androidx.appcompat.widget.o;
import androidx.appcompat.widget.v;
import androidx.appcompat.widget.w;
import ax.a0.s;
import ax.h0.j;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class x
extends TextView
implements ax.h0.n {
    private final e a;
    private final w b;
    private final v c;
    private n d;
    private boolean e = false;
    private a f = null;
    private Future<s> g;

    public x(Context context) {
        this(context, null);
    }

    public x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public x(Context object, AttributeSet attributeSet, int n8) {
        super(I.b((Context)object), attributeSet, n8);
        H.a((View)this, this.getContext());
        object = new e((View)this);
        this.a = object;
        ((e)object).e(attributeSet, n8);
        this.b = object = new w(this);
        ((w)object).m(attributeSet, n8);
        ((w)object).b();
        this.c = new v(this);
        this.getEmojiTextViewHelper().c(attributeSet, n8);
    }

    private n getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new n(this);
        }
        return this.d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void r() {
        Future<s> future = this.g;
        if (future == null) return;
        try {
            this.g = null;
            j.l(this, future.get());
            return;
        }
        catch (InterruptedException | ExecutionException exception) {
            return;
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Object object = this.a;
        if (object != null) {
            ((e)object).b();
        }
        if ((object = this.b) != null) {
            ((w)object).b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (O.c) {
            return this.getSuperCaller().d();
        }
        w w8 = this.b;
        if (w8 != null) {
            return w8.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (O.c) {
            return this.getSuperCaller().i();
        }
        w w8 = this.b;
        if (w8 != null) {
            return w8.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (O.c) {
            return this.getSuperCaller().k();
        }
        w w8 = this.b;
        if (w8 != null) {
            return w8.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (O.c) {
            return this.getSuperCaller().b();
        }
        w w8 = this.b;
        if (w8 != null) {
            return w8.h();
        }
        return new int[0];
    }

    @SuppressLint(value={"WrongConstant"})
    public int getAutoSizeTextType() {
        if (O.c) {
            if (this.getSuperCaller().h() == 1) {
                return 1;
            }
            return 0;
        }
        w w8 = this.b;
        if (w8 != null) {
            return w8.i();
        }
        return 0;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return j.o(super.getCustomSelectionActionModeCallback());
    }

    public int getFirstBaselineToTopHeight() {
        return j.a(this);
    }

    public int getLastBaselineToBottomHeight() {
        return j.b(this);
    }

    a getSuperCaller() {
        if (this.f == null) {
            int n8 = Build.VERSION.SDK_INT;
            if (n8 >= 34) {
                this.f = new d(this);
            } else if (n8 >= 28) {
                this.f = new c(this);
            } else if (n8 >= 26) {
                this.f = new b(this);
            }
        }
        return this.f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e e8 = this.a;
        if (e8 != null) {
            return e8.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e e8 = this.a;
        if (e8 != null) {
            return e8.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.k();
    }

    public CharSequence getText() {
        this.r();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        v v8;
        if (Build.VERSION.SDK_INT < 28 && (v8 = this.c) != null) {
            return v8.a();
        }
        return this.getSuperCaller().c();
    }

    public s.a getTextMetricsParamsCompat() {
        return j.e(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnection = super.onCreateInputConnection(editorInfo);
        this.b.r(this, inputConnection, editorInfo);
        return o.a(inputConnection, editorInfo, (View)this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 30 && n8 < 33 && this.onCheckIsTextEditor()) {
            ((InputMethodManager)this.getContext().getSystemService("input_method")).isActive((View)this);
        }
    }

    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        super.onLayout(bl, n8, n9, n10, n11);
        w w8 = this.b;
        if (w8 != null) {
            w8.o(bl, n8, n9, n10, n11);
        }
    }

    protected void onMeasure(int n8, int n9) {
        this.r();
        super.onMeasure(n8, n9);
    }

    protected void onTextChanged(CharSequence object, int n8, int n9, int n10) {
        super.onTextChanged((CharSequence)object, n8, n9, n10);
        object = this.b;
        if (object != null && !O.c && ((w)object).l()) {
            this.b.c();
        }
    }

    public void setAllCaps(boolean bl) {
        super.setAllCaps(bl);
        this.getEmojiTextViewHelper().d(bl);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int n8, int n9, int n10, int n11) throws IllegalArgumentException {
        if (O.c) {
            this.getSuperCaller().g(n8, n9, n10, n11);
            return;
        }
        w w8 = this.b;
        if (w8 != null) {
            w8.t(n8, n9, n10, n11);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] nArray, int n8) throws IllegalArgumentException {
        if (O.c) {
            this.getSuperCaller().a(nArray, n8);
            return;
        }
        w w8 = this.b;
        if (w8 != null) {
            w8.u(nArray, n8);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int n8) {
        if (O.c) {
            this.getSuperCaller().l(n8);
            return;
        }
        w w8 = this.b;
        if (w8 != null) {
            w8.v(n8);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e e8 = this.a;
        if (e8 != null) {
            e8.f(drawable);
        }
    }

    public void setBackgroundResource(int n8) {
        super.setBackgroundResource(n8);
        e e8 = this.a;
        if (e8 != null) {
            e8.g(n8);
        }
    }

    public void setCompoundDrawables(Drawable object, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawables((Drawable)object, drawable, drawable2, drawable3);
        object = this.b;
        if (object != null) {
            ((w)object).p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable object, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawablesRelative((Drawable)object, drawable, drawable2, drawable3);
        object = this.b;
        if (object != null) {
            ((w)object).p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int n8, int n9, int n10, int n11) {
        Context context = this.getContext();
        Drawable drawable = null;
        Object object = n8 != 0 ? ax.o.a.b(context, n8) : null;
        Drawable drawable2 = n9 != 0 ? ax.o.a.b(context, n9) : null;
        Drawable drawable3 = n10 != 0 ? ax.o.a.b(context, n10) : null;
        if (n11 != 0) {
            drawable = ax.o.a.b(context, n11);
        }
        this.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)object, drawable2, drawable3, drawable);
        object = this.b;
        if (object != null) {
            ((w)object).p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable object, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)object, drawable, drawable2, drawable3);
        object = this.b;
        if (object != null) {
            ((w)object).p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int n8, int n9, int n10, int n11) {
        Context context = this.getContext();
        Drawable drawable = null;
        Object object = n8 != 0 ? ax.o.a.b(context, n8) : null;
        Drawable drawable2 = n9 != 0 ? ax.o.a.b(context, n9) : null;
        Drawable drawable3 = n10 != 0 ? ax.o.a.b(context, n10) : null;
        if (n11 != 0) {
            drawable = ax.o.a.b(context, n11);
        }
        this.setCompoundDrawablesWithIntrinsicBounds((Drawable)object, drawable2, drawable3, drawable);
        object = this.b;
        if (object != null) {
            ((w)object).p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable object, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawablesWithIntrinsicBounds((Drawable)object, drawable, drawable2, drawable3);
        object = this.b;
        if (object != null) {
            ((w)object).p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j.p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean bl) {
        this.getEmojiTextViewHelper().e(bl);
    }

    public void setFilters(InputFilter[] inputFilterArray) {
        super.setFilters(this.getEmojiTextViewHelper().a(inputFilterArray));
    }

    public void setFirstBaselineToTopHeight(int n8) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.getSuperCaller().j(n8);
            return;
        }
        j.h(this, n8);
    }

    public void setLastBaselineToBottomHeight(int n8) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.getSuperCaller().f(n8);
            return;
        }
        j.i(this, n8);
    }

    public void setLineHeight(int n8) {
        j.j(this, n8);
    }

    public void setLineHeight(int n8, float f8) {
        if (Build.VERSION.SDK_INT >= 34) {
            this.getSuperCaller().m(n8, f8);
            return;
        }
        j.k(this, n8, f8);
    }

    public void setPrecomputedText(s s8) {
        j.l(this, s8);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e e8 = this.a;
        if (e8 != null) {
            e8.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e e8 = this.a;
        if (e8 != null) {
            e8.j(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.b.w(colorStateList);
        this.b.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.b.x(mode);
        this.b.b();
    }

    public void setTextAppearance(Context context, int n8) {
        super.setTextAppearance(context, n8);
        w w8 = this.b;
        if (w8 != null) {
            w8.q(context, n8);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        v v8;
        if (Build.VERSION.SDK_INT < 28 && (v8 = this.c) != null) {
            v8.b(textClassifier);
            return;
        }
        this.getSuperCaller().e(textClassifier);
    }

    public void setTextFuture(Future<s> future) {
        this.g = future;
        if (future != null) {
            this.requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(s.a a8) {
        j.n(this, a8);
    }

    public void setTextSize(int n8, float f8) {
        if (O.c) {
            super.setTextSize(n8, f8);
            return;
        }
        w w8 = this.b;
        if (w8 != null) {
            w8.A(n8, f8);
        }
    }

    public void setTypeface(Typeface typeface, int n8) {
        if (this.e) {
            return;
        }
        Typeface typeface2 = typeface != null && n8 > 0 ? ax.T.e.a(this.getContext(), typeface, n8) : null;
        this.e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, n8);
            return;
        }
        finally {
            this.e = false;
        }
    }

    private static interface a {
        public void a(int[] var1, int var2);

        public int[] b();

        public TextClassifier c();

        public int d();

        public void e(TextClassifier var1);

        public void f(int var1);

        public void g(int var1, int var2, int var3, int var4);

        public int h();

        public int i();

        public void j(int var1);

        public int k();

        public void l(int var1);

        public void m(int var1, float var2);
    }

    class b
    implements a {
        final x a;

        b(x x8) {
            this.a = x8;
        }

        @Override
        public void a(int[] nArray, int n8) {
            x.super.setAutoSizeTextTypeUniformWithPresetSizes(nArray, n8);
        }

        @Override
        public int[] b() {
            return x.super.getAutoSizeTextAvailableSizes();
        }

        @Override
        public TextClassifier c() {
            return x.super.getTextClassifier();
        }

        @Override
        public int d() {
            return x.super.getAutoSizeMaxTextSize();
        }

        @Override
        public void e(TextClassifier textClassifier) {
            x.super.setTextClassifier(textClassifier);
        }

        @Override
        public void f(int n8) {
        }

        @Override
        public void g(int n8, int n9, int n10, int n11) {
            x.super.setAutoSizeTextTypeUniformWithConfiguration(n8, n9, n10, n11);
        }

        @Override
        public int h() {
            return x.super.getAutoSizeTextType();
        }

        @Override
        public int i() {
            return x.super.getAutoSizeMinTextSize();
        }

        @Override
        public void j(int n8) {
        }

        @Override
        public int k() {
            return x.super.getAutoSizeStepGranularity();
        }

        @Override
        public void l(int n8) {
            x.super.setAutoSizeTextTypeWithDefaults(n8);
        }

        @Override
        public void m(int n8, float f8) {
        }
    }

    class c
    extends b {
        final x b;

        c(x x8) {
            this.b = x8;
            super(x8);
        }

        @Override
        public void f(int n8) {
            x.super.setLastBaselineToBottomHeight(n8);
        }

        @Override
        public void j(int n8) {
            x.super.setFirstBaselineToTopHeight(n8);
        }
    }

    class d
    extends c {
        final x c;

        d(x x8) {
            this.c = x8;
            super(x8);
        }

        @Override
        public void m(int n8, float f8) {
            x.super.setLineHeight(n8, f8);
        }
    }
}

