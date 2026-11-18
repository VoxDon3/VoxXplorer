package com.voxdon.xplorer.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import ax.Q2.n;

/* loaded from: classes.dex */
public class PieProgress extends View {
    private Paint a;
    private RectF b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public PieProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = -1;
        this.e = -1996488705;
        this.f = 0;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, n.D1, 0, 0);
        try {
            this.f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
            int color = obtainStyledAttributes.getColor(1, -1);
            this.d = color;
            if (color == -1) {
                this.e = -1996488705;
            } else {
                this.e = ((Color.alpha(color) / 2) << 24) | (this.d & 16777215);
            }
            if (this.f > 0) {
                this.g = 1;
            } else {
                this.g = 2;
            }
            obtainStyledAttributes.recycle();
            a();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void a() {
        Paint paint = new Paint();
        this.a = paint;
        paint.setAntiAlias(true);
        this.b = new RectF();
    }

    public void b(int i, int i2) {
        this.d = i;
        this.e = (i & 16777215) | ((Color.alpha(i) / i2) << 24);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        int width = getWidth();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (width >= height) {
            width = height;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        float f = this.f / 2.0f;
        if (this.g == 1) {
            this.b.set(paddingLeft + f, paddingTop + f, (paddingLeft + width) - f, (paddingTop + width) - f);
            this.a.setStyle(Paint.Style.STROKE);
            this.a.setStrokeWidth(this.f);
            this.a.setColor(this.e);
            canvas.drawArc(this.b, 0.0f, 360.0f, false, this.a);
            canvas2 = canvas;
            this.a.setColor(this.d);
            canvas2.drawArc(this.b, -90.0f, this.c, false, this.a);
        } else {
            canvas2 = canvas;
            float f2 = paddingLeft;
            float f3 = paddingTop;
            float f4 = paddingLeft + width;
            float f5 = paddingTop + width;
            this.b.set(f2, f3, f4, f5);
            this.a.setStyle(Paint.Style.FILL);
            this.a.setColor(this.e);
            canvas2.drawCircle(this.b.centerX(), this.b.centerY(), this.b.width() / 2.0f, this.a);
            this.a.setColor(this.d);
            canvas2.drawArc(this.b, -90.0f, this.c, true, this.a);
            if (this.g == 3) {
                this.b.set(f2 + f, f3 + f, f4 - f, f5 - f);
                this.a.setStyle(Paint.Style.STROKE);
                this.a.setStrokeWidth(this.f);
                canvas2.drawCircle(this.b.centerX(), this.b.centerY(), this.b.width() / 2.0f, this.a);
            }
        }
        canvas2.restore();
    }

    public void setProgressAngle(int i) {
        this.c = i;
        invalidate();
    }

    public void setProgressPercent(int i) {
        this.c = (i * 360) / 100;
        invalidate();
    }

    public void setStrokeWidth(int i) {
        this.f = i;
        invalidate();
    }

    public void setStyle(int i) {
        this.g = i;
        invalidate();
    }

    public PieProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
