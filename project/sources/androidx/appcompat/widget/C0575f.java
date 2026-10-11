package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import ax.m.C2506a;

/* renamed from: androidx.appcompat.widget.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0575f extends Button implements ax.h0.n {
    private final C0574e a;
    private final w b;
    private C0583n c;

    public C0575f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2506a.q);
    }

    private C0583n getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new C0583n(this);
        }
        return this.c;
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
            return super.getAutoSizeMaxTextSize();
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
            return super.getAutoSizeMinTextSize();
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
            return super.getAutoSizeStepGranularity();
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
            return super.getAutoSizeTextAvailableSizes();
        }
        w wVar = this.b;
        return wVar != null ? wVar.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (O.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        w wVar = this.b;
        if (wVar != null) {
            wVar.o(z, i, i2, i3, i4);
        }
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
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
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
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
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
            super.setAutoSizeTextTypeWithDefaults(i);
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

    public void setSupportAllCaps(boolean z) {
        w wVar = this.b;
        if (wVar != null) {
            wVar.s(z);
        }
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

    public C0575f(Context context, AttributeSet attributeSet, int i) {
        super(I.b(context), attributeSet, i);
        H.a(this, getContext());
        C0574e c0574e = new C0574e(this);
        this.a = c0574e;
        c0574e.e(attributeSet, i);
        w wVar = new w(this);
        this.b = wVar;
        wVar.m(attributeSet, i);
        wVar.b();
        getEmojiTextViewHelper().c(attributeSet, i);
    }
}
