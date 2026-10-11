package ax.p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: ax.p.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2748d extends Drawable {
    private static final float m = (float) Math.toRadians(45.0d);
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

    private static float a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    public void b(float f) {
        if (this.j != f) {
            this.j = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = this.l;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? ax.U.a.f(this) == 0 : ax.U.a.f(this) == 1))) {
            z = true;
        }
        float f = this.b;
        float a = a(this.c, (float) Math.sqrt(f * f * 2.0f), this.j);
        float a2 = a(this.c, this.d, this.j);
        float round = Math.round(a(0.0f, this.k, this.j));
        float a3 = a(0.0f, m, this.j);
        float a4 = a(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.j);
        double d = a;
        double d2 = a3;
        boolean z2 = z;
        float round2 = Math.round(Math.cos(d2) * d);
        float round3 = Math.round(d * Math.sin(d2));
        this.g.rewind();
        float a5 = a(this.e + this.a.getStrokeWidth(), -this.k, this.j);
        float f2 = (-a2) / 2.0f;
        this.g.moveTo(f2 + round, 0.0f);
        this.g.rLineTo(a2 - (round * 2.0f), 0.0f);
        this.g.moveTo(f2, a5);
        this.g.rLineTo(round2, round3);
        this.g.moveTo(f2, -a5);
        this.g.rLineTo(round2, -round3);
        this.g.close();
        canvas.save();
        float strokeWidth = this.a.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (height - (r5 * 2.0f))) / 4) * 2) + (strokeWidth * 1.5f) + this.e);
        if (this.f) {
            canvas.rotate(a4 * (this.i ^ z2 ? -1 : 1));
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.g, this.a);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.a.getAlpha()) {
            this.a.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
