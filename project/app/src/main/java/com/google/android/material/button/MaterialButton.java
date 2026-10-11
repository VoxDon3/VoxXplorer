/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.button;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
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
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.f;
import ax.F6.w;
import ax.F6.z;
import ax.O6.h;
import ax.O6.o;
import ax.O6.q;
import ax.O6.r;
import ax.k6.m;
import ax.u0.i;
import ax.u0.k;
import ax.u0.l;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.button.a;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaterialButton
extends f
implements Checkable,
o {
    private static final int[] F = new int[]{16842911};
    private static final int[] G = new int[]{0x10100A0};
    private static final int H = ax.k6.l.s;
    private static final int I = ax.k6.c.A;
    private static final i<MaterialButton> J = new i<MaterialButton>("widthIncrease"){

        public float c(MaterialButton materialButton) {
            return materialButton.getDisplayedWidthIncrease();
        }

        public void d(MaterialButton materialButton, float f8) {
            materialButton.setDisplayedWidthIncrease(f8);
        }
    };
    r A;
    int B;
    private float C;
    private float D;
    private k E;
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

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.k6.c.t);
    }

    public MaterialButton(Context object, AttributeSet attributeSet, int n8) {
        int n9 = H;
        super(ax.V6.a.e((Context)object, attributeSet, n8, n9, new int[]{I}), attributeSet, n8);
        this.e = new LinkedHashSet();
        boolean bl = false;
        this.o = false;
        this.p = false;
        this.r = -1;
        this.s = -1.0f;
        this.t = -1;
        this.u = -1;
        this.z = -1;
        object = this.getContext();
        TypedArray typedArray = ax.F6.w.i((Context)object, attributeSet, ax.k6.m.t2, n8, n9, new int[0]);
        this.n = typedArray.getDimensionPixelSize(ax.k6.m.H2, 0);
        this.g = ax.F6.z.i(typedArray.getInt(ax.k6.m.K2, -1), PorterDuff.Mode.SRC_IN);
        this.h = ax.K6.c.a(this.getContext(), typedArray, ax.k6.m.J2);
        this.i = ax.K6.c.d(this.getContext(), typedArray, ax.k6.m.F2);
        this.q = typedArray.getInteger(ax.k6.m.G2, 1);
        this.k = typedArray.getDimensionPixelSize(ax.k6.m.I2, 0);
        q q8 = ax.O6.q.b((Context)object, typedArray, ax.k6.m.N2);
        object = q8 != null ? q8.c(true) : ax.O6.l.e((Context)object, attributeSet, n8, n9).m();
        boolean bl2 = typedArray.getBoolean(ax.k6.m.L2, false);
        object = new com.google.android.material.button.b(this, (ax.O6.l)object);
        this.d = object;
        ((com.google.android.material.button.b)object).t(typedArray);
        this.setCheckedInternal(typedArray.getBoolean(ax.k6.m.v2, false));
        if (q8 != null) {
            ((com.google.android.material.button.b)object).z(this.e());
            ((com.google.android.material.button.b)object).F(q8);
        }
        this.setOpticalCenterEnabled(bl2);
        typedArray.recycle();
        this.setCompoundDrawablePadding(this.n);
        if (this.i != null) {
            bl = true;
        }
        this.q(bl);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.x = materialButton.getOpticalCenterShift();
        materialButton.s();
        materialButton.invalidate();
    }

    public static /* synthetic */ void b(MaterialButton materialButton, float f8) {
        int n8 = (int)(f8 * 0.11f);
        if (materialButton.x != n8) {
            materialButton.x = n8;
            materialButton.s();
            materialButton.invalidate();
        }
    }

    private l e() {
        return ax.H6.i.h(this.getContext(), ax.k6.c.P, ax.k6.l.b);
    }

    private void f() {
        k k8;
        this.E = k8 = new k(this, J);
        k8.q(this.e());
    }

    private Layout.Alignment getActualTextAlignment() {
        int n8 = this.getTextAlignment();
        if (n8 != 1) {
            if (n8 != 6 && n8 != 3) {
                if (n8 != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return this.getGravityTextAlignment();
    }

    private float getDisplayedWidthIncrease() {
        return this.C;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int n8 = this.getGravity() & 0x800007;
        if (n8 != 1) {
            if (n8 != 5 && n8 != 0x800005) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        h h8;
        if (this.w && this.y && (h8 = this.d.g()) != null) {
            return (int)(h8.z() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        String string;
        if (this.getLineCount() > 1) {
            return this.getLayout().getHeight();
        }
        TextPaint textPaint = this.getPaint();
        String string2 = string = this.getText().toString();
        if (this.getTransformationMethod() != null) {
            string2 = this.getTransformationMethod().getTransformation((CharSequence)string, (View)this).toString();
        }
        string = new Rect();
        textPaint.getTextBounds(string2, 0, string2.length(), (Rect)string);
        return Math.min(string.height(), this.getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int n8 = this.getLineCount();
        float f8 = 0.0f;
        for (int i8 = 0; i8 < n8; ++i8) {
            f8 = Math.max(f8, this.getLayout().getLineWidth(i8));
        }
        return (int)Math.ceil(f8);
    }

    private boolean h() {
        int n8 = this.q;
        return n8 == 3 || n8 == 4;
        {
        }
    }

    private boolean i() {
        int n8 = this.q;
        return n8 == 1 || n8 == 2;
        {
        }
    }

    private boolean j() {
        int n8 = this.q;
        return n8 == 16 || n8 == 32;
        {
        }
    }

    private boolean k() {
        return this.getParent() instanceof a && ((a)this.getParent()).getOrientation() == 0;
    }

    private boolean l() {
        return this.getLayoutDirection() == 1;
    }

    private boolean m() {
        com.google.android.material.button.b b8 = this.d;
        return b8 != null && !b8.q();
    }

    private void n(boolean bl) {
        if (this.A != null) {
            if (this.E == null) {
                this.f();
            }
            if (this.y) {
                int n8 = Math.min(this.B, this.A.e((int[])this.getDrawableState()).a.a(this.getWidth()));
                this.E.m(n8);
                if (bl) {
                    this.E.r();
                }
            }
        }
    }

    private void p() {
        if (this.i()) {
            this.setCompoundDrawablesRelative(this.i, null, null, null);
            return;
        }
        if (this.h()) {
            this.setCompoundDrawablesRelative(null, null, this.i, null);
            return;
        }
        if (this.j()) {
            this.setCompoundDrawablesRelative(null, this.i, null, null);
        }
    }

    private void q(boolean bl) {
        Drawable drawable = this.i;
        if (drawable != null) {
            int n8;
            this.i = drawable = ax.U.a.r(drawable).mutate();
            drawable.setTintList(this.h);
            drawable = this.g;
            if (drawable != null) {
                this.i.setTintMode((PorterDuff.Mode)drawable);
            }
            if ((n8 = this.k) == 0) {
                n8 = this.i.getIntrinsicWidth();
            }
            int n9 = this.k;
            if (n9 == 0) {
                n9 = this.i.getIntrinsicHeight();
            }
            drawable = this.i;
            int n10 = this.l;
            int n11 = this.m;
            drawable.setBounds(n10, n11, n8 + n10, n9 + n11);
            this.i.setVisible(true, bl);
        }
        if (bl) {
            this.p();
            return;
        }
        Drawable drawable2 = this.getCompoundDrawablesRelative();
        drawable = drawable2[0];
        Drawable drawable3 = drawable2[1];
        drawable2 = drawable2[2];
        if (this.i() && drawable != this.i || this.h() && drawable2 != this.i || this.j() && drawable3 != this.i) {
            this.p();
        }
    }

    private void r(int n8, int n9) {
        if (this.i != null && this.getLayout() != null) {
            if (!this.i() && !this.h()) {
                if (this.j()) {
                    int n10;
                    this.l = 0;
                    if (this.q == 16) {
                        this.m = 0;
                        this.q(false);
                        return;
                    }
                    n8 = n10 = this.k;
                    if (n10 == 0) {
                        n8 = this.i.getIntrinsicHeight();
                    }
                    if (this.m != (n8 = Math.max(0, (n9 - this.getTextHeight() - this.getPaddingTop() - n8 - this.n - this.getPaddingBottom()) / 2))) {
                        this.m = n8;
                        this.q(false);
                        return;
                    }
                }
            } else {
                this.m = 0;
                Layout.Alignment alignment = this.getActualTextAlignment();
                n9 = this.q;
                boolean bl = true;
                if (!(n9 == 1 || n9 == 3 || n9 == 2 && alignment == Layout.Alignment.ALIGN_NORMAL || n9 == 4 && alignment == Layout.Alignment.ALIGN_OPPOSITE)) {
                    int n11;
                    n9 = n11 = this.k;
                    if (n11 == 0) {
                        n9 = this.i.getIntrinsicWidth();
                    }
                    n8 = n9 = n8 - this.getTextLayoutWidth() - this.getPaddingEnd() - n9 - this.n - this.getPaddingStart();
                    if (alignment == Layout.Alignment.ALIGN_CENTER) {
                        n8 = n9 / 2;
                    }
                    boolean bl2 = this.l();
                    if (this.q != 4) {
                        bl = false;
                    }
                    n9 = n8;
                    if (bl2 != bl) {
                        n9 = -n8;
                    }
                    if (this.l != n9) {
                        this.l = n9;
                        this.q(false);
                        return;
                    }
                } else {
                    this.l = 0;
                    this.q(false);
                }
            }
        }
    }

    private void s() {
        int n8 = (int)(this.C - this.D);
        int n9 = n8 / 2 + this.x;
        this.getLayoutParams().width = (int)(this.s + (float)n8);
        this.setPaddingRelative(this.t + n9, this.getPaddingTop(), this.u + n8 - n9, this.getPaddingBottom());
    }

    private void setCheckedInternal(boolean bl) {
        if (this.g() && this.o != bl) {
            this.o = bl;
            this.refreshDrawableState();
            if (this.getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup)this.getParent()).w(this, this.o);
            }
            if (!this.p) {
                this.p = true;
                Iterator iterator = ((AbstractCollection)this.e).iterator();
                while (iterator.hasNext()) {
                    ((b)iterator.next()).a(this, this.o);
                }
                this.p = false;
            }
        }
    }

    private void setDisplayedWidthIncrease(float f8) {
        if (this.C != f8) {
            this.C = f8;
            this.s();
            this.invalidate();
            if (this.getParent() instanceof a) {
                ((a)this.getParent()).k(this, (int)this.C);
            }
        }
    }

    public boolean g() {
        com.google.android.material.button.b b8 = this.d;
        return b8 != null && b8.r();
    }

    @SuppressLint(value={"KotlinPropertyAccess"})
    String getA11yClassName() {
        if (!TextUtils.isEmpty((CharSequence)this.j)) {
            return this.j;
        }
        Class clazz = this.g() ? CompoundButton.class : Button.class;
        return clazz.getName();
    }

    int getAllowedWidthDecrease() {
        return this.z;
    }

    public ColorStateList getBackgroundTintList() {
        return this.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (this.m()) {
            return this.d.b();
        }
        return 0;
    }

    public l getCornerSpringForce() {
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
        if (this.m()) {
            return this.d.i();
        }
        return null;
    }

    public ax.O6.l getShapeAppearanceModel() {
        if (this.m()) {
            return this.d.j();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public q getStateListShapeAppearanceModel() {
        if (this.m()) {
            return this.d.k();
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (this.m()) {
            return this.d.l();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (this.m()) {
            return this.d.m();
        }
        return 0;
    }

    @Override
    public ColorStateList getSupportBackgroundTintList() {
        if (this.m()) {
            return this.d.n();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.m()) {
            return this.d.o();
        }
        return super.getSupportBackgroundTintMode();
    }

    public boolean isChecked() {
        return this.o;
    }

    void o() {
        LinearLayout.LayoutParams layoutParams = this.v;
        if (layoutParams != null) {
            this.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            this.v = null;
            this.s = -1.0f;
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.m()) {
            ax.O6.i.f((View)this, this.d.g());
        }
    }

    protected int[] onCreateDrawableState(int n8) {
        int[] nArray = super.onCreateDrawableState(n8 + 2);
        if (this.g()) {
            View.mergeDrawableStates((int[])nArray, (int[])F);
        }
        if (this.isChecked()) {
            View.mergeDrawableStates((int[])nArray, (int[])G);
        }
        return nArray;
    }

    @Override
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)this.getA11yClassName());
        accessibilityEvent.setChecked(this.isChecked());
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)this.getA11yClassName());
        accessibilityNodeInfo.setCheckable(this.g());
        accessibilityNodeInfo.setChecked(this.isChecked());
        accessibilityNodeInfo.setClickable(this.isClickable());
    }

    @Override
    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        com.google.android.material.button.b b8;
        super.onLayout(bl, n8, n9, n10, n11);
        if (Build.VERSION.SDK_INT == 21 && (b8 = this.d) != null) {
            b8.O(n11 - n9, n10 - n8);
        }
        this.r(this.getMeasuredWidth(), this.getMeasuredHeight());
        n8 = this.getResources().getConfiguration().orientation;
        if (this.r != n8) {
            this.r = n8;
            this.s = -1.0f;
        }
        if (this.s == -1.0f) {
            this.s = this.getMeasuredWidth();
            if (this.v == null && this.getParent() instanceof a && ((a)this.getParent()).getButtonSizeChange() != null) {
                this.v = (LinearLayout.LayoutParams)this.getLayoutParams();
                b8 = new LinearLayout.LayoutParams(this.v);
                ((LinearLayout.LayoutParams)b8).width = (int)this.s;
                this.setLayoutParams((ViewGroup.LayoutParams)b8);
            }
        }
        if (this.z == -1) {
            if (this.i == null) {
                n8 = 0;
            } else {
                n10 = this.getIconPadding();
                n8 = n9 = this.k;
                if (n9 == 0) {
                    n8 = this.i.getIntrinsicWidth();
                }
                n8 = n10 + n8;
            }
            this.z = this.getMeasuredWidth() - this.getTextLayoutWidth() - n8;
        }
        if (this.t == -1) {
            this.t = this.getPaddingStart();
        }
        if (this.u == -1) {
            this.u = this.getPaddingEnd();
        }
        this.y = this.k();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (d)parcelable;
        super.onRestoreInstanceState(parcelable.a());
        this.setChecked(parcelable.d0);
    }

    public Parcelable onSaveInstanceState() {
        d d8 = new d(super.onSaveInstanceState());
        d8.d0 = this.o;
        return d8;
    }

    @Override
    protected void onTextChanged(CharSequence charSequence, int n8, int n9, int n10) {
        super.onTextChanged(charSequence, n8, n9, n10);
        this.r(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    public boolean performClick() {
        if (this.isEnabled() && this.d.s()) {
            this.toggle();
        }
        return super.performClick();
    }

    public void refreshDrawableState() {
        int[] nArray;
        super.refreshDrawableState();
        if (this.i != null && this.i.setState(nArray = this.getDrawableState())) {
            this.invalidate();
        }
    }

    public void setA11yClassName(String string) {
        this.j = string;
    }

    public void setBackground(Drawable drawable) {
        this.setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int n8) {
        if (this.m()) {
            this.d.u(n8);
            return;
        }
        super.setBackgroundColor(n8);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.m()) {
            if (drawable != this.getBackground()) {
                Log.w((String)"MaterialButton", (String)"MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.d.v();
                super.setBackgroundDrawable(drawable);
                return;
            }
            this.getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override
    public void setBackgroundResource(int n8) {
        Drawable drawable = n8 != 0 ? ax.o.a.b(this.getContext(), n8) : null;
        this.setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean bl) {
        if (this.m()) {
            this.d.w(bl);
        }
    }

    public void setChecked(boolean bl) {
        this.setCheckedInternal(bl);
    }

    public void setCornerRadius(int n8) {
        if (this.m()) {
            this.d.x(n8);
        }
    }

    public void setCornerRadiusResource(int n8) {
        if (this.m()) {
            this.setCornerRadius(this.getResources().getDimensionPixelSize(n8));
        }
    }

    public void setCornerSpringForce(l l8) {
        this.d.z(l8);
    }

    void setDisplayedWidthDecrease(int n8) {
        this.D = Math.min(n8, this.z);
        this.s();
        this.invalidate();
    }

    public void setElevation(float f8) {
        super.setElevation(f8);
        if (this.m()) {
            this.d.g().f0(f8);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            this.q(true);
            this.r(this.getMeasuredWidth(), this.getMeasuredHeight());
        }
    }

    public void setIconGravity(int n8) {
        if (this.q != n8) {
            this.q = n8;
            this.r(this.getMeasuredWidth(), this.getMeasuredHeight());
        }
    }

    public void setIconPadding(int n8) {
        if (this.n != n8) {
            this.n = n8;
            this.setCompoundDrawablePadding(n8);
        }
    }

    public void setIconResource(int n8) {
        Drawable drawable = n8 != 0 ? ax.o.a.b(this.getContext(), n8) : null;
        this.setIcon(drawable);
    }

    public void setIconSize(int n8) {
        if (n8 >= 0) {
            if (this.k != n8) {
                this.k = n8;
                this.q(true);
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            this.q(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.g != mode) {
            this.g = mode;
            this.q(false);
        }
    }

    public void setIconTintResource(int n8) {
        this.setIconTint(ax.o.a.a(this.getContext(), n8));
    }

    public void setInsetBottom(int n8) {
        this.d.A(n8);
    }

    public void setInsetTop(int n8) {
        this.d.B(n8);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(c c8) {
        this.f = c8;
    }

    public void setOpticalCenterEnabled(boolean bl) {
        if (this.w != bl) {
            this.w = bl;
            if (bl) {
                this.d.y(new ax.r6.a(this));
            } else {
                this.d.y(null);
            }
            this.post(new ax.r6.b(this));
        }
    }

    public void setPressed(boolean bl) {
        c c8 = this.f;
        if (c8 != null) {
            c8.a(this, bl);
        }
        super.setPressed(bl);
        this.n(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.m()) {
            this.d.C(colorStateList);
        }
    }

    public void setRippleColorResource(int n8) {
        if (this.m()) {
            this.setRippleColor(ax.o.a.a(this.getContext(), n8));
        }
    }

    @Override
    public void setShapeAppearanceModel(ax.O6.l l8) {
        if (this.m()) {
            this.d.D(l8);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    void setShouldDrawSurfaceColorStroke(boolean bl) {
        if (this.m()) {
            this.d.E(bl);
        }
    }

    void setSizeChange(r r8) {
        if (this.A != r8) {
            this.A = r8;
            this.n(true);
        }
    }

    public void setStateListShapeAppearanceModel(q q8) {
        if (this.m()) {
            if (this.d.c() == null && q8.f()) {
                this.d.z(this.e());
            }
            this.d.F(q8);
            return;
        }
        throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (this.m()) {
            this.d.G(colorStateList);
        }
    }

    public void setStrokeColorResource(int n8) {
        if (this.m()) {
            this.setStrokeColor(ax.o.a.a(this.getContext(), n8));
        }
    }

    public void setStrokeWidth(int n8) {
        if (this.m()) {
            this.d.H(n8);
        }
    }

    public void setStrokeWidthResource(int n8) {
        if (this.m()) {
            this.setStrokeWidth(this.getResources().getDimensionPixelSize(n8));
        }
    }

    @Override
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.m()) {
            this.d.I(colorStateList);
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.m()) {
            this.d.J(mode);
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void setTextAlignment(int n8) {
        super.setTextAlignment(n8);
        this.r(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean bl) {
        this.d.K(bl);
    }

    public void setWidth(int n8) {
        this.s = -1.0f;
        super.setWidth(n8);
    }

    void setWidthChangeMax(int n8) {
        if (this.B != n8) {
            this.B = n8;
            this.n(true);
        }
    }

    public void toggle() {
        this.setChecked(this.o ^ true);
    }

    public static interface b {
        public void a(MaterialButton var1, boolean var2);
    }

    static interface c {
        public void a(MaterialButton var1, boolean var2);
    }

    static class d
    extends ax.k0.a {
        public static final Parcelable.Creator<d> CREATOR = new Parcelable.ClassLoaderCreator<d>(){

            public d a(Parcel parcel) {
                return new d(parcel, null);
            }

            public d b(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            public d[] c(int n8) {
                return new d[n8];
            }
        };
        boolean d0;

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                this.getClass().getClassLoader();
            }
            this.b(parcel);
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            int n8 = parcel.readInt();
            boolean bl = true;
            if (n8 != 1) {
                bl = false;
            }
            this.d0 = bl;
        }

        @Override
        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            parcel.writeInt(this.d0 ? 1 : 0);
        }
    }
}

