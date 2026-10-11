/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.H;
import androidx.appcompat.widget.I;
import androidx.appcompat.widget.O;
import androidx.appcompat.widget.e;
import androidx.appcompat.widget.n;
import androidx.appcompat.widget.w;
import ax.h0.j;
import ax.m.a;

public class f
extends Button
implements ax.h0.n {
    private final e a;
    private final w b;
    private n c;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.m.a.q);
    }

    public f(Context object, AttributeSet attributeSet, int n8) {
        super(I.b((Context)object), attributeSet, n8);
        H.a((View)this, this.getContext());
        object = new e((View)this);
        this.a = object;
        ((e)object).e(attributeSet, n8);
        this.b = object = new w((TextView)this);
        ((w)object).m(attributeSet, n8);
        ((w)object).b();
        this.getEmojiTextViewHelper().c(attributeSet, n8);
    }

    private n getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new n((TextView)this);
        }
        return this.c;
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
            return super.getAutoSizeMaxTextSize();
        }
        w w8 = this.b;
        if (w8 != null) {
            return w8.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (O.c) {
            return super.getAutoSizeMinTextSize();
        }
        w w8 = this.b;
        if (w8 != null) {
            return w8.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (O.c) {
            return super.getAutoSizeStepGranularity();
        }
        w w8 = this.b;
        if (w8 != null) {
            return w8.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (O.c) {
            return super.getAutoSizeTextAvailableSizes();
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
            if (super.getAutoSizeTextType() == 1) {
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

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)Button.class.getName());
    }

    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        super.onLayout(bl, n8, n9, n10, n11);
        w w8 = this.b;
        if (w8 != null) {
            w8.o(bl, n8, n9, n10, n11);
        }
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
            super.setAutoSizeTextTypeUniformWithConfiguration(n8, n9, n10, n11);
            return;
        }
        w w8 = this.b;
        if (w8 != null) {
            w8.t(n8, n9, n10, n11);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] nArray, int n8) throws IllegalArgumentException {
        if (O.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(nArray, n8);
            return;
        }
        w w8 = this.b;
        if (w8 != null) {
            w8.u(nArray, n8);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int n8) {
        if (O.c) {
            super.setAutoSizeTextTypeWithDefaults(n8);
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

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j.p((TextView)this, callback));
    }

    public void setEmojiCompatEnabled(boolean bl) {
        this.getEmojiTextViewHelper().e(bl);
    }

    public void setFilters(InputFilter[] inputFilterArray) {
        super.setFilters(this.getEmojiTextViewHelper().a(inputFilterArray));
    }

    public void setSupportAllCaps(boolean bl) {
        w w8 = this.b;
        if (w8 != null) {
            w8.s(bl);
        }
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
}

