/*
 * Decompiled with CFR 0.152.
 */
package ax.U;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import ax.U.d;
import ax.U.f;
import java.lang.reflect.Method;

class e
extends d {
    private static Method h;

    e(Drawable drawable) {
        super(drawable);
        this.g();
    }

    e(f f8, Resources resources) {
        super(f8, resources);
        this.g();
    }

    private void g() {
        if (h == null) {
            try {
                h = Drawable.class.getDeclaredMethod("isProjected", null);
                return;
            }
            catch (Exception exception) {
                Log.w((String)"WrappedDrawableApi21", (String)"Failed to retrieve Drawable#isProjected() method", (Throwable)exception);
            }
        }
    }

    @Override
    protected boolean c() {
        if (Build.VERSION.SDK_INT == 21) {
            Drawable drawable = this.f;
            return drawable instanceof GradientDrawable || drawable instanceof DrawableContainer || drawable instanceof InsetDrawable || drawable instanceof RippleDrawable;
            {
            }
        }
        return false;
    }

    public Rect getDirtyBounds() {
        return this.f.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f;
        if (drawable != null && (method = h) != null) {
            try {
                boolean bl = (Boolean)method.invoke(drawable, null);
                return bl;
            }
            catch (Exception exception) {
                Log.w((String)"WrappedDrawableApi21", (String)"Error calling Drawable#isProjected() method", (Throwable)exception);
            }
        }
        return false;
    }

    public void setHotspot(float f8, float f9) {
        this.f.setHotspot(f8, f9);
    }

    public void setHotspotBounds(int n8, int n9, int n10, int n11) {
        this.f.setHotspotBounds(n8, n9, n10, n11);
    }

    @Override
    public boolean setState(int[] nArray) {
        if (super.setState(nArray)) {
            this.invalidateSelf();
            return true;
        }
        return false;
    }

    @Override
    public void setTint(int n8) {
        if (this.c()) {
            super.setTint(n8);
            return;
        }
        this.f.setTint(n8);
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        if (this.c()) {
            super.setTintList(colorStateList);
            return;
        }
        this.f.setTintList(colorStateList);
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.c()) {
            super.setTintMode(mode);
            return;
        }
        this.f.setTintMode(mode);
    }
}

