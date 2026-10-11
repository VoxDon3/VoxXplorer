/*
 * Decompiled with CFR 0.152.
 */
package ax.F6;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import ax.F6.f;

public class e
extends Drawable {
    private final Drawable a;
    private final Drawable b;
    private final float[] c;
    private float d;

    public void a(float f8) {
        if (this.d != f8) {
            this.d = f8;
            f.a(f8, this.c);
            this.a.setAlpha((int)(this.c[0] * 255.0f));
            this.b.setAlpha((int)(this.c[1] * 255.0f));
            this.invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        this.a.draw(canvas);
        this.b.draw(canvas);
    }

    public int getIntrinsicHeight() {
        return Math.max(this.a.getIntrinsicHeight(), this.b.getIntrinsicHeight());
    }

    public int getIntrinsicWidth() {
        return Math.max(this.a.getIntrinsicWidth(), this.b.getIntrinsicWidth());
    }

    public int getMinimumHeight() {
        return Math.max(this.a.getMinimumHeight(), this.b.getMinimumHeight());
    }

    public int getMinimumWidth() {
        return Math.max(this.a.getMinimumWidth(), this.b.getMinimumWidth());
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        return this.a.isStateful() || this.b.isStateful();
        {
        }
    }

    public void setAlpha(int n8) {
        if (this.d <= 0.5f) {
            this.a.setAlpha(n8);
            this.b.setAlpha(0);
        } else {
            this.a.setAlpha(0);
            this.b.setAlpha(n8);
        }
        this.invalidateSelf();
    }

    public void setBounds(int n8, int n9, int n10, int n11) {
        super.setBounds(n8, n9, n10, n11);
        this.a.setBounds(n8, n9, n10, n11);
        this.b.setBounds(n8, n9, n10, n11);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
        this.invalidateSelf();
    }

    public boolean setState(int[] nArray) {
        boolean bl = this.a.setState(nArray);
        boolean bl2 = this.b.setState(nArray);
        return bl || bl2;
        {
        }
    }
}

