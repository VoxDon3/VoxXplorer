/*
 * Decompiled with CFR 0.152.
 */
package ax.w2;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import ax.U.a;
import ax.U.b;

abstract class i
extends Drawable
implements b {
    Drawable a;

    i() {
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ax.U.a.a(drawable, theme);
        }
    }

    public void clearColorFilter() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.clearColorFilter();
            return;
        }
        super.clearColorFilter();
    }

    public Drawable getCurrent() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumHeight() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    public int[] getState() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public void jumpToCurrentState() {
        Drawable drawable = this.a;
        if (drawable != null) {
            ax.U.a.i(drawable);
        }
    }

    protected boolean onLevelChange(int n8) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setLevel(n8);
        }
        return super.onLevelChange(n8);
    }

    public void setChangingConfigurations(int n8) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setChangingConfigurations(n8);
            return;
        }
        super.setChangingConfigurations(n8);
    }

    public void setColorFilter(int n8, PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(n8, mode);
            return;
        }
        super.setColorFilter(n8, mode);
    }

    public void setFilterBitmap(boolean bl) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setFilterBitmap(bl);
        }
    }

    public void setHotspot(float f8, float f9) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ax.U.a.k(drawable, f8, f9);
        }
    }

    public void setHotspotBounds(int n8, int n9, int n10, int n11) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ax.U.a.l(drawable, n8, n9, n10, n11);
        }
    }

    public boolean setState(int[] nArray) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(nArray);
        }
        return super.setState(nArray);
    }
}

