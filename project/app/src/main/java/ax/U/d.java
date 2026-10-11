/*
 * Decompiled with CFR 0.152.
 */
package ax.U;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import ax.U.a;
import ax.U.b;
import ax.U.c;
import ax.U.f;

class d
extends Drawable
implements Drawable.Callback,
c,
b {
    static final PorterDuff.Mode g = PorterDuff.Mode.SRC_IN;
    private int a;
    private PorterDuff.Mode b;
    private boolean c;
    f d;
    private boolean e;
    Drawable f;

    d(Drawable drawable) {
        this.d = this.d();
        this.a(drawable);
    }

    d(f f8, Resources resources) {
        this.d = f8;
        this.e(resources);
    }

    private f d() {
        return new f(this.d);
    }

    private void e(Resources resources) {
        f f8 = this.d;
        if (f8 != null && (f8 = f8.b) != null) {
            this.a(f8.newDrawable(resources));
        }
    }

    private boolean f(int[] nArray) {
        if (!this.c()) {
            return false;
        }
        f f8 = this.d;
        ColorStateList colorStateList = f8.c;
        f8 = f8.d;
        if (colorStateList != null && f8 != null) {
            int n8 = colorStateList.getColorForState(nArray, colorStateList.getDefaultColor());
            if (!this.c || n8 != this.a || f8 != this.b) {
                this.setColorFilter(n8, (PorterDuff.Mode)f8);
                this.a = n8;
                this.b = f8;
                this.c = true;
                return true;
            }
        } else {
            this.c = false;
            this.clearColorFilter();
        }
        return false;
    }

    @Override
    public final void a(Drawable drawable) {
        Object object = this.f;
        if (object != null) {
            object.setCallback(null);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback)this);
            this.setVisible(drawable.isVisible(), true);
            this.setState(drawable.getState());
            this.setLevel(drawable.getLevel());
            this.setBounds(drawable.getBounds());
            object = this.d;
            if (object != null) {
                object.b = drawable.getConstantState();
            }
        }
        this.invalidateSelf();
    }

    @Override
    public final Drawable b() {
        return this.f;
    }

    protected boolean c() {
        throw null;
    }

    public void draw(Canvas canvas) {
        this.f.draw(canvas);
    }

    public int getChangingConfigurations() {
        int n8 = super.getChangingConfigurations();
        f f8 = this.d;
        int n9 = f8 != null ? f8.getChangingConfigurations() : 0;
        return n8 | n9 | this.f.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        f f8 = this.d;
        if (f8 != null && f8.a()) {
            this.d.a = this.getChangingConfigurations();
            return this.d;
        }
        return null;
    }

    public Drawable getCurrent() {
        return this.f.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return ax.U.a.f(this.f);
    }

    public int getMinimumHeight() {
        return this.f.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f.getPadding(rect);
    }

    public int[] getState() {
        return this.f.getState();
    }

    public Region getTransparentRegion() {
        return this.f.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        this.invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return ax.U.a.h(this.f);
    }

    public boolean isStateful() {
        f f8;
        f8 = this.c() && (f8 = this.d) != null ? f8.c : null;
        return f8 != null && f8.isStateful() || this.f.isStateful();
    }

    public void jumpToCurrentState() {
        this.f.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.e && super.mutate() == this) {
            f f8;
            this.d = this.d();
            Object object = this.f;
            if (object != null) {
                object.mutate();
            }
            if ((f8 = this.d) != null) {
                object = this.f;
                object = object != null ? object.getConstantState() : null;
                f8.b = object;
            }
            this.e = true;
        }
        return this;
    }

    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int n8) {
        return ax.U.a.m(this.f, n8);
    }

    protected boolean onLevelChange(int n8) {
        return this.f.setLevel(n8);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable2, long l8) {
        this.scheduleSelf(runnable2, l8);
    }

    public void setAlpha(int n8) {
        this.f.setAlpha(n8);
    }

    public void setAutoMirrored(boolean bl) {
        ax.U.a.j(this.f, bl);
    }

    public void setChangingConfigurations(int n8) {
        this.f.setChangingConfigurations(n8);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
    }

    public void setDither(boolean bl) {
        this.f.setDither(bl);
    }

    public void setFilterBitmap(boolean bl) {
        this.f.setFilterBitmap(bl);
    }

    public boolean setState(int[] nArray) {
        boolean bl = this.f.setState(nArray);
        return this.f(nArray) || bl;
        {
        }
    }

    public void setTint(int n8) {
        this.setTintList(ColorStateList.valueOf((int)n8));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.d.c = colorStateList;
        this.f(this.getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.d.d = mode;
        this.f(this.getState());
    }

    public boolean setVisible(boolean bl, boolean bl2) {
        return super.setVisible(bl, bl2) || this.f.setVisible(bl, bl2);
        {
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable2) {
        this.unscheduleSelf(runnable2);
    }
}

