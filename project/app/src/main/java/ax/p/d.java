/*
 * Decompiled with CFR 0.152.
 */
package ax.p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import ax.U.a;

public class d
extends Drawable {
    private static final float m = (float)Math.toRadians(45.0);
    private final Paint a;
    private float b;
    private float c;
    private float d;
    private float e;
    private boolean f;
    private final Path g;
    private final int h;
    private boolean i;
    private float j;
    private float k;
    private int l;

    private static float a(float f8, float f9, float f10) {
        return f8 + (f9 - f8) * f10;
    }

    public void b(float f8) {
        if (this.j != f8) {
            this.j = f8;
            this.invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        int n8;
        Rect rect;
        block6: {
            block7: {
                int n9;
                block8: {
                    rect = this.getBounds();
                    int n10 = this.l;
                    n8 = n9 = 0;
                    if (n10 == 0) break block6;
                    if (n10 == 1) break block7;
                    if (n10 == 3) break block8;
                    n8 = n9;
                    if (ax.U.a.f(this) != 1) break block6;
                    break block7;
                }
                n8 = n9;
                if (ax.U.a.f(this) != 0) break block6;
            }
            n8 = 1;
        }
        float f8 = this.b;
        f8 = (float)Math.sqrt(f8 * f8 * 2.0f);
        float f9 = ax.p.d.a(this.c, f8, this.j);
        float f10 = ax.p.d.a(this.c, this.d, this.j);
        float f11 = Math.round(ax.p.d.a(0.0f, this.k, this.j));
        float f12 = ax.p.d.a(0.0f, m, this.j);
        f8 = n8 != 0 ? 0.0f : -180.0f;
        float f13 = n8 != 0 ? 180.0f : 0.0f;
        f8 = ax.p.d.a(f8, f13, this.j);
        double d8 = f9;
        double d9 = f12;
        f13 = Math.round(Math.cos(d9) * d8);
        f9 = Math.round(d8 * Math.sin(d9));
        this.g.rewind();
        f12 = ax.p.d.a(this.e + this.a.getStrokeWidth(), -this.k, this.j);
        float f14 = -f10 / 2.0f;
        this.g.moveTo(f14 + f11, 0.0f);
        this.g.rLineTo(f10 - f11 * 2.0f, 0.0f);
        this.g.moveTo(f14, f12);
        this.g.rLineTo(f13, f9);
        this.g.moveTo(f14, -f12);
        this.g.rLineTo(f13, -f9);
        this.g.close();
        canvas.save();
        f13 = this.a.getStrokeWidth();
        f10 = rect.height();
        f11 = this.e;
        f10 = (int)(f10 - 3.0f * f13 - f11 * 2.0f) / 4 * 2;
        canvas.translate((float)rect.centerX(), f10 + (f13 * 1.5f + f11));
        if (this.f) {
            n8 = this.i ^ n8 ? -1 : 1;
            canvas.rotate(f8 * (float)n8);
        } else if (n8 != 0) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.g, this.a);
        canvas.restore();
    }

    public int getIntrinsicHeight() {
        return this.h;
    }

    public int getIntrinsicWidth() {
        return this.h;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int n8) {
        if (n8 != this.a.getAlpha()) {
            this.a.setAlpha(n8);
            this.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.invalidateSelf();
    }
}

