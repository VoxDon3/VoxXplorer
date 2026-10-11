/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.g;
import ax.F6.j;
import ax.F6.w;
import ax.K6.e;
import ax.O6.i;
import ax.O6.l;
import ax.O6.o;
import ax.c0.d0;
import ax.d0.H;
import ax.k6.k;
import ax.k6.m;
import ax.l6.h;
import com.google.android.material.chip.a;
import com.google.android.material.chip.b;
import java.util.List;

public class Chip
extends g
implements a.a,
o,
Checkable {
    private static final int w = ax.k6.l.v;
    private static final Rect x = new Rect();
    private static final int[] y = new int[]{0x10100A1};
    private static final int[] z = new int[]{16842911};
    private a e;
    private InsetDrawable f;
    private RippleDrawable g;
    private View.OnClickListener h;
    private CompoundButton.OnCheckedChangeListener i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private CharSequence q;
    private final c r;
    private boolean s;
    private final Rect t;
    private final RectF u;
    private final ax.K6.g v;

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.k6.c.d);
    }

    public Chip(Context context, AttributeSet attributeSet, int n8) {
        int n9 = w;
        super(ax.V6.a.d(context, attributeSet, n8, n9), attributeSet, n8);
        this.t = new Rect();
        this.u = new RectF();
        this.v = new ax.K6.g(this){
            final Chip a;
            {
                this.a = chip;
            }

            @Override
            public void a(int n8) {
            }

            @Override
            public void b(Typeface object, boolean bl) {
                Chip chip = this.a;
                object = chip.e.Z2() ? this.a.e.t1() : this.a.getText();
                chip.setText((CharSequence)object);
                this.a.requestLayout();
                this.a.invalidate();
            }
        };
        context = this.getContext();
        this.C(attributeSet);
        a a8 = a.H0(context, attributeSet, n8, n9);
        this.o(context, attributeSet, n8);
        this.setChipDrawable(a8);
        a8.f0(this.getElevation());
        attributeSet = ax.F6.w.i(context, attributeSet, ax.k6.m.C0, n8, n9, new int[0]);
        if (Build.VERSION.SDK_INT < 23) {
            this.setTextColor(ax.K6.c.a(context, (TypedArray)attributeSet, ax.k6.m.F0));
        }
        boolean bl = attributeSet.hasValue(ax.k6.m.o1);
        attributeSet.recycle();
        this.r = new c(this, this);
        this.x();
        if (!bl) {
            this.p();
        }
        this.setChecked(this.j);
        this.setText(a8.t1());
        this.setEllipsize(a8.n1());
        this.B();
        if (!this.e.Z2()) {
            this.setLines(1);
            this.setHorizontallyScrolling(true);
        }
        this.setGravity(8388627);
        this.A();
        if (this.v()) {
            this.setMinHeight(this.p);
        }
        this.o = this.getLayoutDirection();
        super.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)new ax.w6.b(this));
    }

    private void A() {
        a a8;
        if (!TextUtils.isEmpty((CharSequence)this.getText()) && (a8 = this.e) != null) {
            int n8 = (int)(a8.V0() + this.e.v1() + this.e.C0());
            int n9 = (int)(this.e.a1() + this.e.w1() + this.e.y0());
            int n10 = n8;
            int n11 = n9;
            if (this.f != null) {
                a8 = new Rect();
                this.f.getPadding((Rect)a8);
                n11 = n9 + ((Rect)a8).left;
                n10 = n8 + ((Rect)a8).right;
            }
            this.setPaddingRelative(n11, this.getPaddingTop(), n10, this.getPaddingBottom());
        }
    }

    private void B() {
        TextPaint textPaint = this.getPaint();
        Object object = this.e;
        if (object != null) {
            textPaint.drawableState = object.getState();
        }
        if ((object = this.getTextAppearance()) != null) {
            ((e)object).p(this.getContext(), textPaint, this.v);
        }
    }

    private void C(AttributeSet attributeSet) {
        block6: {
            block7: {
                block8: {
                    block9: {
                        block10: {
                            block5: {
                                if (attributeSet == null) break block5;
                                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                                    Log.w((String)"Chip", (String)"Do not set the background; Chip manages its own background drawable.");
                                }
                                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) break block6;
                                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) break block7;
                                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) break block8;
                                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) break block9;
                                if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) break block10;
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w((String)"Chip", (String)"Chip text must be vertically center and start aligned");
                                }
                            }
                            return;
                        }
                        throw new UnsupportedOperationException("Chip does not support multi-line text");
                    }
                    throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                }
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    public static /* synthetic */ void b(Chip chip, CompoundButton compoundButton, boolean bl) {
        chip = chip.i;
        if (chip != null) {
            chip.onCheckedChanged(compoundButton, bl);
        }
    }

    private RectF getCloseIconTouchBounds() {
        this.u.setEmpty();
        if (this.n() && this.h != null) {
            this.e.k1(this.u);
        }
        return this.u;
    }

    private Rect getCloseIconTouchBoundsInt() {
        RectF rectF = this.getCloseIconTouchBounds();
        this.t.set((int)rectF.left, (int)rectF.top, (int)rectF.right, (int)rectF.bottom);
        return this.t;
    }

    private e getTextAppearance() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.u1();
        }
        return null;
    }

    static /* synthetic */ boolean h(Chip chip, boolean bl) {
        chip.m = bl;
        return bl;
    }

    private void k(a a8) {
        a8.C2(this);
    }

    private int[] l() {
        int n8;
        int n9 = n8 = this.isEnabled();
        if (this.m) {
            n9 = n8 + 1;
        }
        n8 = n9;
        if (this.l) {
            n8 = n9 + 1;
        }
        n9 = n8;
        if (this.k) {
            n9 = n8 + 1;
        }
        n8 = n9;
        if (this.isChecked()) {
            n8 = n9 + 1;
        }
        int[] nArray = new int[n8];
        boolean bl = this.isEnabled();
        n9 = 0;
        if (bl) {
            nArray[0] = 16842910;
            n9 = 1;
        }
        n8 = n9;
        if (this.m) {
            nArray[n9] = 16842908;
            n8 = n9 + 1;
        }
        n9 = n8;
        if (this.l) {
            nArray[n8] = 16843623;
            n9 = n8 + 1;
        }
        n8 = n9;
        if (this.k) {
            nArray[n9] = 16842919;
            n8 = n9 + 1;
        }
        if (this.isChecked()) {
            nArray[n8] = 0x10100A1;
        }
        return nArray;
    }

    private boolean n() {
        a a8 = this.e;
        return a8 != null && a8.d1() != null;
    }

    private void o(Context context, AttributeSet attributeSet, int n8) {
        attributeSet = ax.F6.w.i(context, attributeSet, ax.k6.m.C0, n8, w, new int[0]);
        this.n = attributeSet.getBoolean(ax.k6.m.j1, false);
        float f8 = ax.K6.b.e(context);
        this.p = (int)Math.ceil(attributeSet.getDimension(ax.k6.m.X0, f8));
        attributeSet.recycle();
    }

    private void p() {
        this.setOutlineProvider(new ViewOutlineProvider(this){
            final Chip a;
            {
                this.a = chip;
            }

            public void getOutline(View view, Outline outline) {
                if (this.a.e != null) {
                    this.a.e.getOutline(outline);
                    return;
                }
                outline.setAlpha(0.0f);
            }
        });
    }

    private void q(int n8, int n9, int n10, int n11) {
        this.f = new InsetDrawable((Drawable)this.e, n8, n9, n10, n11);
    }

    private void setCloseIconHovered(boolean bl) {
        if (this.l != bl) {
            this.l = bl;
            this.refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean bl) {
        if (this.k != bl) {
            this.k = bl;
            this.refreshDrawableState();
        }
    }

    private void u() {
        if (this.f != null) {
            this.f = null;
            this.setMinWidth(0);
            this.setMinHeight((int)this.getChipMinHeight());
            this.y();
        }
    }

    private void w(a a8) {
        if (a8 != null) {
            a8.C2(null);
        }
    }

    private void x() {
        if (this.n() && this.s() && this.h != null) {
            d0.l0((View)this, this.r);
            this.s = true;
            return;
        }
        d0.l0((View)this, null);
        this.s = false;
    }

    private void y() {
        this.z();
    }

    private void z() {
        this.g = new RippleDrawable(ax.L6.a.e(this.e.r1()), this.getBackgroundDrawable(), null);
        this.e.Y2(false);
        this.setBackground((Drawable)this.g);
        this.A();
    }

    @Override
    public void a() {
        this.m(this.p);
        this.requestLayout();
        this.invalidateOutline();
    }

    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.s) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return this.r.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
        {
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (this.r.w(keyEvent) && this.r.A() != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        a a8 = this.e;
        boolean bl = a8 != null && a8.B1() ? this.e.y2(this.l()) : false;
        if (bl) {
            this.invalidate();
        }
    }

    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty((CharSequence)this.q)) {
            return this.q;
        }
        if (this.r()) {
            ViewParent viewParent = this.getParent();
            if (viewParent instanceof b && ((b)viewParent).f()) {
                return "android.widget.RadioButton";
            }
            return "android.widget.Button";
        }
        if (this.isClickable()) {
            return "android.widget.Button";
        }
        return "android.view.View";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable;
        Object object = insetDrawable = this.f;
        if (insetDrawable == null) {
            object = this.e;
        }
        return object;
    }

    public Drawable getCheckedIcon() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.R0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.S0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.T0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        a a8 = this.e;
        if (a8 != null) {
            return Math.max(0.0f, a8.U0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.e;
    }

    public float getChipEndPadding() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.V0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.W0();
        }
        return null;
    }

    public float getChipIconSize() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.X0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.Y0();
        }
        return null;
    }

    public float getChipMinHeight() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.Z0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.a1();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.b1();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.c1();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return this.getText();
    }

    public Drawable getCloseIcon() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.d1();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.e1();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.f1();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.g1();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.h1();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.j1();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.n1();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.s && (this.r.A() == 1 || this.r.x() == 1)) {
            rect.set(this.getCloseIconTouchBoundsInt());
            return;
        }
        super.getFocusedRect(rect);
    }

    public h getHideMotionSpec() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.o1();
        }
        return null;
    }

    public float getIconEndPadding() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.p1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.q1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.r1();
        }
        return null;
    }

    public l getShapeAppearanceModel() {
        return this.e.I();
    }

    public h getShowMotionSpec() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.s1();
        }
        return null;
    }

    public float getTextEndPadding() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.v1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        a a8 = this.e;
        if (a8 != null) {
            return a8.w1();
        }
        return 0.0f;
    }

    public boolean m(int n8) {
        this.p = n8;
        boolean bl = this.v();
        int n9 = 0;
        if (!bl) {
            if (this.f != null) {
                this.u();
            } else {
                this.y();
            }
            return false;
        }
        int n10 = Math.max(0, n8 - this.e.getIntrinsicHeight());
        int n11 = Math.max(0, n8 - this.e.getIntrinsicWidth());
        if (n11 <= 0 && n10 <= 0) {
            if (this.f != null) {
                this.u();
            } else {
                this.y();
            }
            return false;
        }
        n11 = n11 > 0 ? (n11 /= 2) : 0;
        if (n10 > 0) {
            n9 = n10 / 2;
        }
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            if (rect.top == n9 && rect.bottom == n9 && rect.left == n11 && rect.right == n11) {
                this.y();
                return true;
            }
        }
        if (this.getMinHeight() != n8) {
            this.setMinHeight(n8);
        }
        if (this.getMinWidth() != n8) {
            this.setMinWidth(n8);
        }
        this.q(n11, n9, n11, n9);
        this.y();
        return true;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ax.O6.i.f((View)this, this.e);
    }

    protected int[] onCreateDrawableState(int n8) {
        int[] nArray = super.onCreateDrawableState(n8 + 2);
        if (this.isChecked()) {
            View.mergeDrawableStates((int[])nArray, (int[])y);
        }
        if (this.r()) {
            View.mergeDrawableStates((int[])nArray, (int[])z);
        }
        return nArray;
    }

    protected void onFocusChanged(boolean bl, int n8, Rect rect) {
        super.onFocusChanged(bl, n8, rect);
        if (this.s) {
            this.r.I(bl, n8, rect);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int n8 = motionEvent.getActionMasked();
        if (n8 != 7) {
            if (n8 == 10) {
                this.setCloseIconHovered(false);
            }
        } else {
            this.setCloseIconHovered(this.getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo object) {
        super.onInitializeAccessibilityNodeInfo((AccessibilityNodeInfo)object);
        object.setClassName(this.getAccessibilityClassName());
        object.setCheckable(this.r());
        object.setClickable(this.isClickable());
        if (this.getParent() instanceof b) {
            b b8 = (b)this.getParent();
            object = H.Q0((AccessibilityNodeInfo)object);
            int n8 = b8.c() ? b8.d((View)this) : -1;
            ((H)object).p0(H.f.a(b8.b((View)this), 1, n8, 1, false, this.isChecked()));
        }
    }

    @TargetApi(value=24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int n8) {
        if (this.getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && this.isEnabled()) {
            return ax.w6.a.a(this.getContext(), 1002);
        }
        return super.onResolvePointerIcon(motionEvent, n8);
    }

    public void onRtlPropertiesChanged(int n8) {
        super.onRtlPropertiesChanged(n8);
        if (this.o != n8) {
            this.o = n8;
            this.A();
        }
    }

    /*
     * Unable to fully structure code
     */
    @SuppressLint(value={"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent var1_1) {
        block7: {
            block11: {
                block8: {
                    block9: {
                        block10: {
                            var2_2 = var1_1.getActionMasked();
                            var3_3 = this.getCloseIconTouchBounds().contains(var1_1.getX(), var1_1.getY());
                            if (var2_2 == 0) break block8;
                            if (var2_2 == 1) break block9;
                            if (var2_2 == 2) break block10;
                            if (var2_2 == 3) ** GOTO lbl-1000
                            break block11;
                        }
                        if (this.k) {
                            if (!var3_3) {
                                this.setCloseIconPressed(false);
                            }
lbl12:
                            // 4 sources

                            while (true) {
                                var2_2 = 1;
                                break block7;
                                break;
                            }
                        }
                        break block11;
                    }
                    if (this.k) {
                        this.t();
                        var2_2 = 1;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var2_2 = 0;
                    }
                    this.setCloseIconPressed(false);
                    break block7;
                }
                if (var3_3) {
                    this.setCloseIconPressed(true);
                    ** continue;
                }
            }
            var2_2 = 0;
        }
        return var2_2 != 0 || super.onTouchEvent(var1_1);
        {
        }
    }

    public boolean r() {
        a a8 = this.e;
        return a8 != null && a8.A1();
    }

    public boolean s() {
        a a8 = this.e;
        return a8 != null && a8.C1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.q = charSequence;
    }

    public void setBackground(Drawable drawable) {
        if (drawable != this.getBackgroundDrawable() && drawable != this.g) {
            Log.w((String)"Chip", (String)"Do not set the background; Chip manages its own background drawable.");
            return;
        }
        super.setBackground(drawable);
    }

    public void setBackgroundColor(int n8) {
        Log.w((String)"Chip", (String)"Do not set the background color; Chip manages its own background drawable.");
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != this.getBackgroundDrawable() && drawable != this.g) {
            Log.w((String)"Chip", (String)"Do not set the background drawable; Chip manages its own background drawable.");
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override
    public void setBackgroundResource(int n8) {
        Log.w((String)"Chip", (String)"Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w((String)"Chip", (String)"Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w((String)"Chip", (String)"Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean bl) {
        a a8 = this.e;
        if (a8 != null) {
            a8.K1(bl);
        }
    }

    public void setCheckableResource(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.L1(n8);
        }
    }

    public void setChecked(boolean bl) {
        a a8 = this.e;
        if (a8 == null) {
            this.j = bl;
            return;
        }
        if (a8.A1()) {
            super.setChecked(bl);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        a a8 = this.e;
        if (a8 != null) {
            a8.M1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean bl) {
        this.setCheckedIconVisible(bl);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int n8) {
        this.setCheckedIconVisible(n8);
    }

    public void setCheckedIconResource(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.N1(n8);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        a a8 = this.e;
        if (a8 != null) {
            a8.O1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.P1(n8);
        }
    }

    public void setCheckedIconVisible(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.Q1(n8);
        }
    }

    public void setCheckedIconVisible(boolean bl) {
        a a8 = this.e;
        if (a8 != null) {
            a8.R1(bl);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        a a8 = this.e;
        if (a8 != null) {
            a8.S1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.T1(n8);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.U1(f8);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.V1(n8);
        }
    }

    public void setChipDrawable(a a8) {
        a a9 = this.e;
        if (a9 != a8) {
            this.w(a9);
            this.e = a8;
            a8.N2(false);
            this.k(this.e);
            this.m(this.p);
        }
    }

    public void setChipEndPadding(float f8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.W1(f8);
        }
    }

    public void setChipEndPaddingResource(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.X1(n8);
        }
    }

    public void setChipIcon(Drawable drawable) {
        a a8 = this.e;
        if (a8 != null) {
            a8.Y1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean bl) {
        this.setChipIconVisible(bl);
    }

    @Deprecated
    public void setChipIconEnabledResource(int n8) {
        this.setChipIconVisible(n8);
    }

    public void setChipIconResource(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.Z1(n8);
        }
    }

    public void setChipIconSize(float f8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.a2(f8);
        }
    }

    public void setChipIconSizeResource(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.b2(n8);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        a a8 = this.e;
        if (a8 != null) {
            a8.c2(colorStateList);
        }
    }

    public void setChipIconTintResource(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.d2(n8);
        }
    }

    public void setChipIconVisible(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.e2(n8);
        }
    }

    public void setChipIconVisible(boolean bl) {
        a a8 = this.e;
        if (a8 != null) {
            a8.f2(bl);
        }
    }

    public void setChipMinHeight(float f8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.g2(f8);
        }
    }

    public void setChipMinHeightResource(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.h2(n8);
        }
    }

    public void setChipStartPadding(float f8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.i2(f8);
        }
    }

    public void setChipStartPaddingResource(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.j2(n8);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        a a8 = this.e;
        if (a8 != null) {
            a8.k2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.l2(n8);
        }
    }

    public void setChipStrokeWidth(float f8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.m2(f8);
        }
    }

    public void setChipStrokeWidthResource(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.n2(n8);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        this.setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int n8) {
        this.setText(this.getResources().getString(n8));
    }

    public void setCloseIcon(Drawable drawable) {
        a a8 = this.e;
        if (a8 != null) {
            a8.p2(drawable);
        }
        this.x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        a a8 = this.e;
        if (a8 != null) {
            a8.q2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean bl) {
        this.setCloseIconVisible(bl);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int n8) {
        this.setCloseIconVisible(n8);
    }

    public void setCloseIconEndPadding(float f8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.r2(f8);
        }
    }

    public void setCloseIconEndPaddingResource(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.s2(n8);
        }
    }

    public void setCloseIconResource(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.t2(n8);
        }
        this.x();
    }

    public void setCloseIconSize(float f8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.u2(f8);
        }
    }

    public void setCloseIconSizeResource(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.v2(n8);
        }
    }

    public void setCloseIconStartPadding(float f8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.w2(f8);
        }
    }

    public void setCloseIconStartPaddingResource(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.x2(n8);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        a a8 = this.e;
        if (a8 != null) {
            a8.z2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.A2(n8);
        }
    }

    public void setCloseIconVisible(int n8) {
        this.setCloseIconVisible(this.getResources().getBoolean(n8));
    }

    public void setCloseIconVisible(boolean bl) {
        a a8 = this.e;
        if (a8 != null) {
            a8.B2(bl);
        }
        this.x();
    }

    @Override
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int n8, int n9, int n10, int n11) {
        if (n8 == 0) {
            if (n10 == 0) {
                super.setCompoundDrawablesRelativeWithIntrinsicBounds(n8, n9, n10, n11);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int n8, int n9, int n10, int n11) {
        if (n8 == 0) {
            if (n10 == 0) {
                super.setCompoundDrawablesWithIntrinsicBounds(n8, n9, n10, n11);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    public void setElevation(float f8) {
        super.setElevation(f8);
        a a8 = this.e;
        if (a8 != null) {
            a8.f0(f8);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        block5: {
            block4: {
                if (this.e == null) break block4;
                if (truncateAt == TextUtils.TruncateAt.MARQUEE) break block5;
                super.setEllipsize(truncateAt);
                a a8 = this.e;
                if (a8 != null) {
                    a8.D2(truncateAt);
                }
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean bl) {
        this.n = bl;
        this.m(this.p);
    }

    public void setGravity(int n8) {
        if (n8 != 8388627) {
            Log.w((String)"Chip", (String)"Chip text must be vertically center and start aligned");
            return;
        }
        super.setGravity(n8);
    }

    public void setHideMotionSpec(h h8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.E2(h8);
        }
    }

    public void setHideMotionSpecResource(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.F2(n8);
        }
    }

    public void setIconEndPadding(float f8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.G2(f8);
        }
    }

    public void setIconEndPaddingResource(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.H2(n8);
        }
    }

    public void setIconStartPadding(float f8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.I2(f8);
        }
    }

    public void setIconStartPaddingResource(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.J2(n8);
        }
    }

    public void setInternalOnCheckedChangeListener(j<Chip> j8) {
    }

    public void setLayoutDirection(int n8) {
        if (this.e == null) {
            return;
        }
        super.setLayoutDirection(n8);
    }

    public void setLines(int n8) {
        if (n8 <= 1) {
            super.setLines(n8);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int n8) {
        if (n8 <= 1) {
            super.setMaxLines(n8);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int n8) {
        super.setMaxWidth(n8);
        a a8 = this.e;
        if (a8 != null) {
            a8.K2(n8);
        }
    }

    public void setMinLines(int n8) {
        if (n8 <= 1) {
            super.setMinLines(n8);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
        this.x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        a a8 = this.e;
        if (a8 != null) {
            a8.L2(colorStateList);
        }
        if (!this.e.y1()) {
            this.z();
        }
    }

    public void setRippleColorResource(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.M2(n8);
            if (!this.e.y1()) {
                this.z();
            }
        }
    }

    @Override
    public void setShapeAppearanceModel(l l8) {
        this.e.setShapeAppearanceModel(l8);
    }

    public void setShowMotionSpec(h h8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.O2(h8);
        }
    }

    public void setShowMotionSpecResource(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.P2(n8);
        }
    }

    public void setSingleLine(boolean bl) {
        if (bl) {
            super.setSingleLine(bl);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence object, TextView.BufferType bufferType) {
        a a8 = this.e;
        if (a8 != null) {
            CharSequence charSequence = object;
            if (object == null) {
                charSequence = "";
            }
            object = a8.Z2() ? null : charSequence;
            super.setText((CharSequence)object, bufferType);
            object = this.e;
            if (object != null) {
                ((a)object).Q2(charSequence);
            }
        }
    }

    public void setTextAppearance(int n8) {
        super.setTextAppearance(n8);
        a a8 = this.e;
        if (a8 != null) {
            a8.S2(n8);
        }
        this.B();
    }

    public void setTextAppearance(Context object, int n8) {
        super.setTextAppearance((Context)object, n8);
        object = this.e;
        if (object != null) {
            ((a)object).S2(n8);
        }
        this.B();
    }

    public void setTextAppearance(e e8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.R2(e8);
        }
        this.B();
    }

    public void setTextAppearanceResource(int n8) {
        this.setTextAppearance(this.getContext(), n8);
    }

    public void setTextEndPadding(float f8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.T2(f8);
        }
    }

    public void setTextEndPaddingResource(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.U2(n8);
        }
    }

    public void setTextSize(int n8, float f8) {
        super.setTextSize(n8, f8);
        a a8 = this.e;
        if (a8 != null) {
            a8.V2(TypedValue.applyDimension((int)n8, (float)f8, (DisplayMetrics)this.getResources().getDisplayMetrics()));
        }
        this.B();
    }

    public void setTextStartPadding(float f8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.W2(f8);
        }
    }

    public void setTextStartPaddingResource(int n8) {
        a a8 = this.e;
        if (a8 != null) {
            a8.X2(n8);
        }
    }

    public boolean t() {
        boolean bl = false;
        this.playSoundEffect(0);
        View.OnClickListener onClickListener = this.h;
        if (onClickListener != null) {
            onClickListener.onClick((View)this);
            bl = true;
        }
        if (this.s) {
            this.r.U(1, 1);
        }
        return bl;
    }

    public boolean v() {
        return this.n;
    }

    private class c
    extends ax.l0.a {
        final Chip q;

        c(Chip chip, Chip chip2) {
            this.q = chip;
            super((View)chip2);
        }

        @Override
        protected int B(float f8, float f9) {
            if (this.q.n() && this.q.getCloseIconTouchBounds().contains(f8, f9)) {
                return 1;
            }
            return 0;
        }

        @Override
        protected void C(List<Integer> list) {
            list.add(0);
            if (this.q.n() && this.q.s() && this.q.h != null) {
                list.add(1);
            }
        }

        @Override
        protected boolean J(int n8, int n9, Bundle bundle) {
            if (n9 == 16) {
                if (n8 == 0) {
                    return this.q.performClick();
                }
                if (n8 == 1) {
                    return this.q.t();
                }
            }
            return false;
        }

        @Override
        protected void M(H h8) {
            h8.k0(this.q.r());
            h8.n0(this.q.isClickable());
            h8.m0(this.q.getAccessibilityClassName());
            CharSequence charSequence = this.q.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                h8.M0(charSequence);
                return;
            }
            h8.q0(charSequence);
        }

        @Override
        protected void N(int n8, H h8) {
            CharSequence charSequence = "";
            if (n8 == 1) {
                CharSequence charSequence2 = this.q.getCloseIconContentDescription();
                if (charSequence2 != null) {
                    h8.q0(charSequence2);
                } else {
                    charSequence2 = this.q.getText();
                    Context context = this.q.getContext();
                    n8 = ax.k6.k.n;
                    if (!TextUtils.isEmpty((CharSequence)charSequence2)) {
                        charSequence = charSequence2;
                    }
                    h8.q0(context.getString(n8, new Object[]{charSequence}).trim());
                }
                h8.i0(this.q.getCloseIconTouchBoundsInt());
                h8.b(H.a.i);
                h8.s0(this.q.isEnabled());
                h8.m0(Button.class.getName());
                return;
            }
            h8.q0("");
            h8.i0(x);
        }

        @Override
        protected void O(int n8, boolean bl) {
            if (n8 == 1) {
                Chip.h(this.q, bl);
            }
            if (this.q.e.J1(this.q.m)) {
                this.q.refreshDrawableState();
            }
        }
    }
}

