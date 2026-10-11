/*
 * Decompiled with CFR 0.152.
 */
package ax.N6;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

public class a {
    private static final int[] i = new int[3];
    private static final float[] j = new float[]{0.0f, 0.5f, 1.0f};
    private static final int[] k = new int[4];
    private static final float[] l = new float[]{0.0f, 0.0f, 0.5f, 1.0f};
    private final Paint a;
    private final Paint b;
    private final Paint c;
    private int d;
    private int e;
    private int f;
    private final Path g = new Path();
    private final Paint h;

    public a() {
        this(-16777216);
    }

    public a(int n8) {
        Paint paint;
        this.h = paint = new Paint();
        this.a = new Paint();
        this.d(n8);
        paint.setColor(0);
        this.b = paint = new Paint(4);
        paint.setStyle(Paint.Style.FILL);
        this.c = new Paint(paint);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int n8, float f8, float f9) {
        float f10;
        Object object;
        boolean bl = f9 < 0.0f;
        Path path = this.g;
        if (bl) {
            object = k;
            object[0] = 0;
            object[1] = this.f;
            object[2] = this.e;
            object[3] = this.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f8, f9);
            path.close();
            f10 = -n8;
            rectF.inset(f10, f10);
            object = k;
            object[0] = 0;
            object[1] = this.d;
            object[2] = this.e;
            object[3] = this.f;
        }
        float f11 = rectF.width() / 2.0f;
        if (f11 <= 0.0f) {
            return;
        }
        float f12 = 1.0f - (float)n8 / f11;
        f10 = (1.0f - f12) / 2.0f;
        object = l;
        object[1] = (int)f12;
        object[2] = (int)(f10 + f12);
        object = new RadialGradient(rectF.centerX(), rectF.centerY(), f11, k, (float[])object, Shader.TileMode.CLAMP);
        this.b.setShader((Shader)object);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!bl) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.h);
        }
        canvas.drawArc(rectF, f8, f9, true, this.b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int n8) {
        rectF.bottom += (float)n8;
        rectF.offset(0.0f, (float)(-n8));
        int[] nArray = i;
        nArray[0] = this.f;
        nArray[1] = this.e;
        nArray[2] = this.d;
        Paint paint = this.c;
        float f8 = rectF.left;
        paint.setShader((Shader)new LinearGradient(f8, rectF.top, f8, rectF.bottom, nArray, j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.c);
        canvas.restore();
    }

    public Paint c() {
        return this.a;
    }

    public void d(int n8) {
        this.d = ax.T.a.k(n8, 68);
        this.e = ax.T.a.k(n8, 20);
        this.f = ax.T.a.k(n8, 0);
        this.a.setColor(this.d);
    }
}

