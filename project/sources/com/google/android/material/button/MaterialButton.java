package com.google.android.material.button;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.C0575f;
import ax.H6.i;
import ax.O6.h;
import ax.O6.o;
import ax.O6.q;
import ax.O6.r;
import ax.k0.AbstractC2357a;
import ax.k6.C2402c;
import ax.k6.l;
import ax.o.C2653a;
import ax.u0.AbstractC3171i;
import ax.u0.C3173k;
import ax.u0.C3174l;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public class MaterialButton extends C0575f implements Checkable, o {
    private static final int[] F = {R.attr.state_checkable};
    private static final int[] G = {R.attr.state_checked};
    private static final int H = l.s;
    private static final int I = C2402c.A;
    private static final AbstractC3171i<MaterialButton> J = new a("widthIncrease");
    r A;
    int B;
    private float C;
    private float D;
    private C3173k E;
    private final com.google.android.material.button.b d;
    private final LinkedHashSet<b> e;
    private c f;
    private PorterDuff.Mode g;
    private ColorStateList h;
    private Drawable i;
    private String j;
    private int k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private float s;
    private int t;
    private int u;
    private LinearLayout.LayoutParams v;
    private boolean w;
    private int x;
    private boolean y;
    int z;

    class a extends AbstractC3171i<MaterialButton> {
        a(String str) {
            super(str);
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(MaterialButton materialButton) {
            return materialButton.getDisplayedWidthIncrease();
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MaterialButton materialButton, float f) {
            materialButton.setDisplayedWidthIncrease(f);
        }
    }

    public interface b {
        void a(MaterialButton materialButton, boolean z);
    }

    interface c {
        void a(MaterialButton materialButton, boolean z);
    }

    static class d extends AbstractC2357a {
        public static final Parcelable.Creator<d> CREATOR = new a();
        boolean d0;

        class a implements Parcelable.ClassLoaderCreator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.d0 = parcel.readInt() == 1;
        }

        @Override // ax.k0.AbstractC2357a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d0 ? 1 : 0);
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2402c.t);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.x = materialButton.getOpticalCenterShift();
        materialButton.s();
        materialButton.invalidate();
    }

    public static /* synthetic */ void b(MaterialButton materialButton, float f) {
        int i = (int) (f * 0.11f);
        if (materialButton.x != i) {
            materialButton.x = i;
            materialButton.s();
            materialButton.invalidate();
        }
    }

    private C3174l e() {
        return i.h(getContext(), C2402c.P, l.b);
    }

    private void f() {
        C3173k c3173k = new C3173k(this, J);
        this.E = c3173k;
        c3173k.q(e());
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.C;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        h g;
        if (this.w && this.y && (g = this.d.g()) != null) {
            return (int) (g.z() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f);
    }

    private boolean h() {
        int i = this.q;
        return i == 3 || i == 4;
    }

    private boolean i() {
        int i = this.q;
        return i == 1 || i == 2;
    }

    private boolean j() {
        int i = this.q;
        return i == 16 || i == 32;
    }

    private boolean k() {
        return (getParent() instanceof com.google.android.material.button.a) && ((com.google.android.material.button.a) getParent()).getOrientation() == 0;
    }

    private boolean l() {
        return getLayoutDirection() == 1;
    }

    private boolean m() {
        com.google.android.material.button.b bVar = this.d;
        return (bVar == null || bVar.q()) ? false : true;
    }

    private void n(boolean z) {
        if (this.A == null) {
            return;
        }
        if (this.E == null) {
            f();
        }
        if (this.y) {
            this.E.m(Math.min(this.B, this.A.e(getDrawableState()).a.a(getWidth())));
            if (z) {
                this.E.r();
            }
        }
    }

    private void p() {
        if (i()) {
            setCompoundDrawablesRelative(this.i, null, null, null);
        } else if (h()) {
            setCompoundDrawablesRelative(null, null, this.i, null);
        } else if (j()) {
            setCompoundDrawablesRelative(null, this.i, null, null);
        }
    }

    private void q(boolean z) {
        Drawable drawable = this.i;
        if (drawable != null) {
            Drawable mutate = ax.U.a.r(drawable).mutate();
            this.i = mutate;
            mutate.setTintList(this.h);
            PorterDuff.Mode mode = this.g;
            if (mode != null) {
                this.i.setTintMode(mode);
            }
            int i = this.k;
            if (i == 0) {
                i = this.i.getIntrinsicWidth();
            }
            int i2 = this.k;
            if (i2 == 0) {
                i2 = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i3 = this.l;
            int i4 = this.m;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.i.setVisible(true, z);
        }
        if (z) {
            p();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!i() || drawable3 == this.i) && ((!h() || drawable5 == this.i) && (!j() || drawable4 == this.i))) {
            return;
        }
        p();
    }

    private void r(int i, int i2) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        if (!i() && !h()) {
            if (j()) {
                this.l = 0;
                if (this.q == 16) {
                    this.m = 0;
                    q(false);
                    return;
                }
                int i3 = this.k;
                if (i3 == 0) {
                    i3 = this.i.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i3) - this.n) - getPaddingBottom()) / 2);
                if (this.m != max) {
                    this.m = max;
                    q(false);
                    return;
                }
                return;
            }
            return;
        }
        this.m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.q;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.l = 0;
            q(false);
            return;
        }
        int i5 = this.k;
        if (i5 == 0) {
            i5 = this.i.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i - getTextLayoutWidth()) - getPaddingEnd()) - i5) - this.n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (l() != (this.q == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.l != textLayoutWidth) {
            this.l = textLayoutWidth;
            q(false);
        }
    }

    private void s() {
        int i = (int) (this.C - this.D);
        int i2 = (i / 2) + this.x;
        getLayoutParams().width = (int) (this.s + i);
        setPaddingRelative(this.t + i2, getPaddingTop(), (this.u + i) - i2, getPaddingBottom());
    }

    private void setCheckedInternal(boolean z) {
        if (!g() || this.o == z) {
            return;
        }
        this.o = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            ((MaterialButtonToggleGroup) getParent()).w(this, this.o);
        }
        if (this.p) {
            return;
        }
        this.p = true;
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.o);
        }
        this.p = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        if (this.C != f) {
            this.C = f;
            s();
            invalidate();
            if (getParent() instanceof com.google.android.material.button.a) {
                ((com.google.android.material.button.a) getParent()).k(this, (int) this.C);
            }
        }
    }

    public boolean g() {
        com.google.android.material.button.b bVar = this.d;
        return bVar != null && bVar.r();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    String getA11yClassName() {
        if (TextUtils.isEmpty(this.j)) {
            return (g() ? CompoundButton.class : Button.class).getName();
        }
        return this.j;
    }

    int getAllowedWidthDecrease() {
        return this.z;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m()) {
            return this.d.b();
        }
        return 0;
    }

    public C3174l getCornerSpringForce() {
        return this.d.c();
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.q;
    }

    public int getIconPadding() {
        return this.n;
    }

    public int getIconSize() {
        return this.k;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.g;
    }

    public int getInsetBottom() {
        return this.d.d();
    }

    public int getInsetTop() {
        return this.d.e();
    }

    public ColorStateList getRippleColor() {
        if (m()) {
            return this.d.i();
        }
        return null;
    }

    public ax.O6.l getShapeAppearanceModel() {
        if (m()) {
            return this.d.j();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public q getStateListShapeAppearanceModel() {
        if (m()) {
            return this.d.k();
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m()) {
            return this.d.l();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m()) {
            return this.d.m();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C0575f
    public ColorStateList getSupportBackgroundTintList() {
        return m() ? this.d.n() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C0575f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m() ? this.d.o() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.o;
    }

    void o() {
        LinearLayout.LayoutParams layoutParams = this.v;
        if (layoutParams != null) {
            setLayoutParams(layoutParams);
            this.v = null;
            this.s = -1.0f;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m()) {
            ax.O6.i.f(this, this.d.g());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (g()) {
            View.mergeDrawableStates(onCreateDrawableState, F);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, G);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.C0575f, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.C0575f, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(g());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.C0575f, android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        com.google.android.material.button.b bVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (bVar = this.d) != null) {
            bVar.O(i4 - i2, i3 - i);
        }
        r(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.r != i6) {
            this.r = i6;
            this.s = -1.0f;
        }
        if (this.s == -1.0f) {
            this.s = getMeasuredWidth();
            if (this.v == null && (getParent() instanceof com.google.android.material.button.a) && ((com.google.android.material.button.a) getParent()).getButtonSizeChange() != null) {
                this.v = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.v);
                layoutParams.width = (int) this.s;
                setLayoutParams(layoutParams);
            }
        }
        if (this.z == -1) {
            if (this.i == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int i7 = this.k;
                if (i7 == 0) {
                    i7 = this.i.getIntrinsicWidth();
                }
                i5 = iconPadding + i7;
            }
            this.z = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.t == -1) {
            this.t = getPaddingStart();
        }
        if (this.u == -1) {
            this.u = getPaddingEnd();
        }
        this.y = k();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.a());
        setChecked(dVar.d0);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.d0 = this.o;
        return dVar;
    }

    @Override // androidx.appcompat.widget.C0575f, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        r(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (isEnabled() && this.d.s()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.i != null) {
            if (this.i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (m()) {
            this.d.u(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // androidx.appcompat.widget.C0575f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.d.v();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.C0575f, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C2653a.b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m()) {
            this.d.w(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    public void setCornerRadius(int i) {
        if (m()) {
            this.d.x(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(C3174l c3174l) {
        this.d.z(c3174l);
    }

    void setDisplayedWidthDecrease(int i) {
        this.D = Math.min(i, this.z);
        s();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m()) {
            this.d.g().f0(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            q(true);
            r(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.q != i) {
            this.q = i;
            r(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.n != i) {
            this.n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C2653a.b(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.k != i) {
            this.k = i;
            q(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            q(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.g != mode) {
            this.g = mode;
            q(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C2653a.a(getContext(), i));
    }

    public void setInsetBottom(int i) {
        this.d.A(i);
    }

    public void setInsetTop(int i) {
        this.d.B(i);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(c cVar) {
        this.f = cVar;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.w != z) {
            this.w = z;
            if (z) {
                this.d.y(new h.d() { // from class: ax.r6.a
                    @Override // ax.O6.h.d
                    public final void a(float f) {
                        MaterialButton.b(MaterialButton.this, f);
                    }
                });
            } else {
                this.d.y(null);
            }
            post(new Runnable() { // from class: ax.r6.b
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialButton.a(MaterialButton.this);
                }
            });
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        c cVar = this.f;
        if (cVar != null) {
            cVar.a(this, z);
        }
        super.setPressed(z);
        n(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m()) {
            this.d.C(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (m()) {
            setRippleColor(C2653a.a(getContext(), i));
        }
    }

    @Override // ax.O6.o
    public void setShapeAppearanceModel(ax.O6.l lVar) {
        if (!m()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.d.D(lVar);
    }

    void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m()) {
            this.d.E(z);
        }
    }

    void setSizeChange(r rVar) {
        if (this.A != rVar) {
            this.A = rVar;
            n(true);
        }
    }

    public void setStateListShapeAppearanceModel(q qVar) {
        if (!m()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        if (this.d.c() == null && qVar.f()) {
            this.d.z(e());
        }
        this.d.F(qVar);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m()) {
            this.d.G(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (m()) {
            setStrokeColor(C2653a.a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m()) {
            this.d.H(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.C0575f
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m()) {
            this.d.I(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.C0575f
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m()) {
            this.d.J(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        r(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.d.K(z);
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.s = -1.0f;
        super.setWidth(i);
    }

    void setWidthChangeMax(int i) {
        if (this.B != i) {
            this.B = i;
            n(true);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.o);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButton(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.button.MaterialButton.H
            int r0 = com.google.android.material.button.MaterialButton.I
            int[] r0 = new int[]{r0}
            android.content.Context r8 = ax.V6.a.e(r8, r9, r10, r4, r0)
            r7.<init>(r8, r9, r10)
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            r7.e = r8
            r8 = 0
            r7.o = r8
            r7.p = r8
            r6 = -1
            r7.r = r6
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7.s = r0
            r7.t = r6
            r7.u = r6
            r7.z = r6
            android.content.Context r0 = r7.getContext()
            int[] r2 = ax.k6.m.t2
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = ax.F6.w.i(r0, r1, r2, r3, r4, r5)
            int r10 = ax.k6.m.H2
            int r10 = r9.getDimensionPixelSize(r10, r8)
            r7.n = r10
            int r10 = ax.k6.m.K2
            int r10 = r9.getInt(r10, r6)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r10 = ax.F6.z.i(r10, r2)
            r7.g = r10
            android.content.Context r10 = r7.getContext()
            int r2 = ax.k6.m.J2
            android.content.res.ColorStateList r10 = ax.K6.c.a(r10, r9, r2)
            r7.h = r10
            android.content.Context r10 = r7.getContext()
            int r2 = ax.k6.m.F2
            android.graphics.drawable.Drawable r10 = ax.K6.c.d(r10, r9, r2)
            r7.i = r10
            int r10 = ax.k6.m.G2
            r2 = 1
            int r10 = r9.getInteger(r10, r2)
            r7.q = r10
            int r10 = ax.k6.m.I2
            int r10 = r9.getDimensionPixelSize(r10, r8)
            r7.k = r10
            int r10 = ax.k6.m.N2
            ax.O6.q r10 = ax.O6.q.b(r0, r9, r10)
            if (r10 == 0) goto L82
            ax.O6.l r0 = r10.c(r2)
            goto L8a
        L82:
            ax.O6.l$b r0 = ax.O6.l.e(r0, r1, r3, r4)
            ax.O6.l r0 = r0.m()
        L8a:
            int r1 = ax.k6.m.L2
            boolean r1 = r9.getBoolean(r1, r8)
            com.google.android.material.button.b r3 = new com.google.android.material.button.b
            r3.<init>(r7, r0)
            r7.d = r3
            r3.t(r9)
            int r0 = ax.k6.m.v2
            boolean r0 = r9.getBoolean(r0, r8)
            r7.setCheckedInternal(r0)
            if (r10 == 0) goto Laf
            ax.u0.l r0 = r7.e()
            r3.z(r0)
            r3.F(r10)
        Laf:
            r7.setOpticalCenterEnabled(r1)
            r9.recycle()
            int r9 = r7.n
            r7.setCompoundDrawablePadding(r9)
            android.graphics.drawable.Drawable r9 = r7.i
            if (r9 == 0) goto Lbf
            r8 = 1
        Lbf:
            r7.q(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
