/*
 * Decompiled with CFR 0.152.
 */
package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.cardview.widget.e;

class d
extends Drawable {
    private float a;
    private final Paint b;
    private final RectF c;
    private final Rect d;
    private float e;
    private boolean f = false;
    private boolean g = true;
    private ColorStateList h;
    private PorterDuffColorFilter i;
    private ColorStateList j;
    private PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    d(ColorStateList colorStateList, float f8) {
        this.a = f8;
        this.b = new Paint(5);
        this.e(colorStateList);
        this.c = new RectF();
        this.d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(this.getState(), 0), mode);
        }
        return null;
    }

    private void e(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList == null) {
            colorStateList2 = ColorStateList.valueOf((int)0);
        }
        this.h = colorStateList2;
        this.b.setColor(colorStateList2.getColorForState(this.getState(), this.h.getDefaultColor()));
    }

    private void i(Rect rect) {
        Rect rect2 = rect;
        if (rect == null) {
            rect2 = this.getBounds();
        }
        this.c.set((float)rect2.left, (float)rect2.top, (float)rect2.right, (float)rect2.bottom);
        this.d.set(rect2);
        if (this.f) {
            float f8 = androidx.cardview.widget.e.b(this.e, this.a, this.g);
            float f9 = androidx.cardview.widget.e.a(this.e, this.a, this.g);
            this.d.inset((int)Math.ceil(f9), (int)Math.ceil(f8));
            this.c.set(this.d);
        }
    }

    public ColorStateList b() {
        return this.h;
    }

    float c() {
        return this.e;
    }

    public float d() {
        return this.a;
    }

    public void draw(Canvas canvas) {
        boolean bl;
        Paint paint = this.b;
        if (this.i != null && paint.getColorFilter() == null) {
            paint.setColorFilter((ColorFilter)this.i);
            bl = true;
        } else {
            bl = false;
        }
        RectF rectF = this.c;
        float f8 = this.a;
        canvas.drawRoundRect(rectF, f8, f8, paint);
        if (bl) {
            paint.setColorFilter(null);
        }
    }

    public void f(ColorStateList colorStateList) {
        this.e(colorStateList);
        this.invalidateSelf();
    }

    void g(float f8, boolean bl, boolean bl2) {
        if (f8 == this.e && this.f == bl && this.g == bl2) {
            return;
        }
        this.e = f8;
        this.f = bl;
        this.g = bl2;
        this.i(null);
        this.invalidateSelf();
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.d, this.a);
    }

    void h(float f8) {
        if (f8 == this.a) {
            return;
        }
        this.a = f8;
        this.i(null);
        this.invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.j;
        return colorStateList != null && colorStateList.isStateful() || (colorStateList = this.h) != null && colorStateList.isStateful() || super.isStateful();
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.i(rect);
    }

    protected boolean onStateChange(int[] object) {
        ColorStateList colorStateList = this.h;
        int n8 = colorStateList.getColorForState(object, colorStateList.getDefaultColor());
        boolean bl = n8 != this.b.getColor();
        if (bl) {
            this.b.setColor(n8);
        }
        if ((object = (Object)this.j) != null && (colorStateList = this.k) != null) {
            this.i = this.a((ColorStateList)object, (PorterDuff.Mode)colorStateList);
            return true;
        }
        return bl;
    }

    public void setAlpha(int n8) {
        this.b.setAlpha(n8);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.i = this.a(colorStateList, this.k);
        this.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        this.i = this.a(this.j, mode);
        this.invalidateSelf();
    }
}

