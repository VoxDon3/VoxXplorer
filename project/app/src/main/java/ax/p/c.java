/*
 * Decompiled with CFR 0.152.
 */
package ax.p;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import ax.U.a;

public class c
extends Drawable
implements Drawable.Callback {
    private Drawable a;

    public c(Drawable drawable) {
        this.b(drawable);
    }

    public Drawable a() {
        return this.a;
    }

    public void b(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback)this);
        }
    }

    public void draw(Canvas canvas) {
        this.a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.a.getPadding(rect);
    }

    public int[] getState() {
        return this.a.getState();
    }

    public Region getTransparentRegion() {
        return this.a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        this.invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return ax.U.a.h(this.a);
    }

    public boolean isStateful() {
        return this.a.isStateful();
    }

    public void jumpToCurrentState() {
        this.a.jumpToCurrentState();
    }

    protected void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
    }

    protected boolean onLevelChange(int n8) {
        return this.a.setLevel(n8);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable2, long l8) {
        this.scheduleSelf(runnable2, l8);
    }

    public void setAlpha(int n8) {
        this.a.setAlpha(n8);
    }

    public void setAutoMirrored(boolean bl) {
        ax.U.a.j(this.a, bl);
    }

    public void setChangingConfigurations(int n8) {
        this.a.setChangingConfigurations(n8);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public void setDither(boolean bl) {
        this.a.setDither(bl);
    }

    public void setFilterBitmap(boolean bl) {
        this.a.setFilterBitmap(bl);
    }

    public void setHotspot(float f8, float f9) {
        ax.U.a.k(this.a, f8, f9);
    }

    public void setHotspotBounds(int n8, int n9, int n10, int n11) {
        ax.U.a.l(this.a, n8, n9, n10, n11);
    }

    public boolean setState(int[] nArray) {
        return this.a.setState(nArray);
    }

    public void setTint(int n8) {
        ax.U.a.n(this.a, n8);
    }

    public void setTintList(ColorStateList colorStateList) {
        ax.U.a.o(this.a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        ax.U.a.p(this.a, mode);
    }

    public boolean setVisible(boolean bl, boolean bl2) {
        return super.setVisible(bl, bl2) || this.a.setVisible(bl, bl2);
        {
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable2) {
        this.unscheduleSelf(runnable2);
    }
}

