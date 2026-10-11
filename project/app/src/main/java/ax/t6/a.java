/*
 * Decompiled with CFR 0.152.
 */
package ax.t6;

import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import ax.O6.o;
import ax.k6.c;
import ax.k6.l;

public class a
extends CardView
implements Checkable,
o {
    private static final int[] m = new int[]{16842911};
    private static final int[] n = new int[]{0x10100A0};
    private static final int[] o = new int[]{c.Y};
    private static final int p = ax.k6.l.t;
    private boolean j;
    private boolean k;
    private boolean l;

    private void e() {
        if (Build.VERSION.SDK_INT <= 26) {
            return;
        }
        throw null;
    }

    private RectF getBoundsAsRectF() {
        new RectF();
        throw null;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return this.l;
    }

    @Override
    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public ColorStateList getCardForegroundColor() {
        throw null;
    }

    float getCardViewRadius() {
        return a.super.getRadius();
    }

    public Drawable getCheckedIcon() {
        throw null;
    }

    public int getCheckedIconGravity() {
        throw null;
    }

    public int getCheckedIconMargin() {
        throw null;
    }

    public int getCheckedIconSize() {
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        throw null;
    }

    @Override
    public int getContentPaddingBottom() {
        throw null;
    }

    @Override
    public int getContentPaddingLeft() {
        throw null;
    }

    @Override
    public int getContentPaddingRight() {
        throw null;
    }

    @Override
    public int getContentPaddingTop() {
        throw null;
    }

    public float getProgress() {
        throw null;
    }

    @Override
    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    public ax.O6.l getShapeAppearanceModel() {
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    public int getStrokeWidth() {
        throw null;
    }

    public boolean isChecked() {
        return this.k;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    protected int[] onCreateDrawableState(int n8) {
        int[] nArray = super.onCreateDrawableState(n8 + 3);
        if (this.f()) {
            View.mergeDrawableStates((int[])nArray, (int[])m);
        }
        if (this.isChecked()) {
            View.mergeDrawableStates((int[])nArray, (int[])n);
        }
        if (this.g()) {
            View.mergeDrawableStates((int[])nArray, (int[])o);
        }
        return nArray;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)"androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)"androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(this.f());
        accessibilityNodeInfo.setClickable(this.isClickable());
        accessibilityNodeInfo.setChecked(this.isChecked());
    }

    @Override
    protected void onMeasure(int n8, int n9) {
        super.onMeasure(n8, n9);
        this.getMeasuredWidth();
        this.getMeasuredHeight();
        throw null;
    }

    public void setBackground(Drawable drawable) {
        this.setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!this.j) {
            return;
        }
        throw null;
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override
    public void setCardBackgroundColor(int n8) {
        ColorStateList.valueOf((int)n8);
        throw null;
    }

    @Override
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    @Override
    public void setCardElevation(float f8) {
        super.setCardElevation(f8);
        throw null;
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCheckable(boolean bl) {
        throw null;
    }

    public void setChecked(boolean bl) {
        if (this.k != bl) {
            this.toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        throw null;
    }

    public void setCheckedIconGravity(int n8) {
        throw null;
    }

    public void setCheckedIconMargin(int n8) {
        throw null;
    }

    public void setCheckedIconMarginResource(int n8) {
        if (n8 == -1) {
            return;
        }
        this.getResources().getDimensionPixelSize(n8);
        throw null;
    }

    public void setCheckedIconResource(int n8) {
        ax.o.a.b(this.getContext(), n8);
        throw null;
    }

    public void setCheckedIconSize(int n8) {
        throw null;
    }

    public void setCheckedIconSizeResource(int n8) {
        if (n8 == 0) {
            return;
        }
        this.getResources().getDimensionPixelSize(n8);
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setClickable(boolean bl) {
        super.setClickable(bl);
    }

    public void setDragged(boolean bl) {
        if (this.l != bl) {
            this.l = bl;
            this.refreshDrawableState();
            this.e();
            this.invalidate();
        }
    }

    @Override
    public void setMaxCardElevation(float f8) {
        super.setMaxCardElevation(f8);
        throw null;
    }

    public void setOnCheckedChangeListener(a a8) {
    }

    @Override
    public void setPreventCornerOverlap(boolean bl) {
        super.setPreventCornerOverlap(bl);
        throw null;
    }

    public void setProgress(float f8) {
        throw null;
    }

    @Override
    public void setRadius(float f8) {
        super.setRadius(f8);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(int n8) {
        ax.o.a.a(this.getContext(), n8);
        throw null;
    }

    @Override
    public void setShapeAppearanceModel(ax.O6.l l8) {
        this.setClipToOutline(l8.v(this.getBoundsAsRectF()));
        throw null;
    }

    public void setStrokeColor(int n8) {
        this.setStrokeColor(ColorStateList.valueOf((int)n8));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeWidth(int n8) {
        throw null;
    }

    @Override
    public void setUseCompatPadding(boolean bl) {
        super.setUseCompatPadding(bl);
        throw null;
    }

    public void toggle() {
        if (this.f() && this.isEnabled()) {
            this.k ^= true;
            this.refreshDrawableState();
            this.e();
            throw null;
        }
    }

    public static interface a {
    }
}

