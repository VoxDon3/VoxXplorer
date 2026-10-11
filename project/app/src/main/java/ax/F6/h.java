/*
 * Decompiled with CFR 0.152.
 */
package ax.F6;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.B;
import ax.F6.w;
import ax.k6.m;

public class h
extends B {
    private Drawable p;
    private final Rect q = new Rect();
    private final Rect r = new Rect();
    private int s = 119;
    protected boolean t = true;
    boolean u = false;

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public h(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8);
        context = w.i(context, attributeSet, m.S1, n8, 0, new int[0]);
        this.s = context.getInt(m.U1, this.s);
        attributeSet = context.getDrawable(m.T1);
        if (attributeSet != null) {
            this.setForeground((Drawable)attributeSet);
        }
        this.t = context.getBoolean(m.V1, true);
        context.recycle();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.p;
        if (drawable != null) {
            if (this.u) {
                this.u = false;
                Rect rect = this.q;
                Rect rect2 = this.r;
                int n8 = this.getRight() - this.getLeft();
                int n9 = this.getBottom() - this.getTop();
                if (this.t) {
                    rect.set(0, 0, n8, n9);
                } else {
                    rect.set(this.getPaddingLeft(), this.getPaddingTop(), n8 - this.getPaddingRight(), n9 - this.getPaddingBottom());
                }
                Gravity.apply((int)this.s, (int)drawable.getIntrinsicWidth(), (int)drawable.getIntrinsicHeight(), (Rect)rect, (Rect)rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f8, float f9) {
        super.drawableHotspotChanged(f8, f9);
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.setHotspot(f8, f9);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.p;
        if (drawable != null && drawable.isStateful()) {
            this.p.setState(this.getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.p;
    }

    public int getForegroundGravity() {
        return this.s;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        super.onLayout(bl, n8, n9, n10, n11);
        this.u = bl | this.u;
    }

    protected void onSizeChanged(int n8, int n9, int n10, int n11) {
        super.onSizeChanged(n8, n9, n10, n11);
        this.u = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                this.unscheduleDrawable(this.p);
            }
            this.p = drawable;
            this.u = true;
            if (drawable != null) {
                this.setWillNotDraw(false);
                drawable.setCallback((Drawable.Callback)this);
                if (drawable.isStateful()) {
                    drawable.setState(this.getDrawableState());
                }
                if (this.s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                this.setWillNotDraw(true);
            }
            this.requestLayout();
            this.invalidate();
        }
    }

    public void setForegroundGravity(int n8) {
        if (this.s != n8) {
            int n9 = n8;
            if ((0x800007 & n8) == 0) {
                n9 = n8 | 0x800003;
            }
            n8 = n9;
            if ((n9 & 0x70) == 0) {
                n8 = n9 | 0x30;
            }
            this.s = n8;
            if (n8 == 119 && this.p != null) {
                Rect rect = new Rect();
                this.p.getPadding(rect);
            }
            this.requestLayout();
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.p;
        {
        }
    }
}

