/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import ax.Q2.n;

public class PieProgress
extends View {
    private Paint a;
    private RectF b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public PieProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PieProgress(Context context, AttributeSet attributeSet, int n8) {
        Throwable throwable2;
        block4: {
            block3: {
                block2: {
                    super(context, attributeSet, n8);
                    this.d = -1;
                    this.e = -1996488705;
                    this.f = 0;
                    context = context.getTheme().obtainStyledAttributes(attributeSet, n.D1, 0, 0);
                    try {
                        this.f = context.getDimensionPixelOffset(0, 0);
                        this.d = n8 = context.getColor(1, -1);
                        if (n8 != -1) break block2;
                        this.e = -1996488705;
                        break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                int n9 = Color.alpha((int)n8);
                n8 = this.d;
                this.e = n9 / 2 << 24 | n8 & 0xFFFFFF;
            }
            this.g = this.f > 0 ? 1 : 2;
            context.recycle();
            this.a();
            return;
        }
        context.recycle();
        throw throwable2;
    }

    private void a() {
        Paint paint;
        this.a = paint = new Paint();
        paint.setAntiAlias(true);
        this.b = new RectF();
    }

    public void b(int n8, int n9) {
        this.d = n8;
        this.e = n8 & 0xFFFFFF | Color.alpha((int)n8) / n9 << 24;
        this.invalidate();
    }

    protected void onDraw(Canvas canvas) {
        canvas.save();
        int n8 = this.getWidth();
        int n9 = this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
        if (n8 < n9) {
            n9 = n8;
        }
        int n10 = this.getPaddingLeft();
        n8 = this.getPaddingTop();
        float f8 = (float)this.f / 2.0f;
        if (this.g == 1) {
            this.b.set((float)n10 + f8, (float)n8 + f8, (float)(n10 + n9) - f8, (float)(n8 + n9) - f8);
            this.a.setStyle(Paint.Style.STROKE);
            this.a.setStrokeWidth((float)this.f);
            this.a.setColor(this.e);
            canvas.drawArc(this.b, 0.0f, 360.0f, false, this.a);
            this.a.setColor(this.d);
            canvas.drawArc(this.b, -90.0f, (float)this.c, false, this.a);
        } else {
            RectF rectF = this.b;
            float f9 = n10;
            float f10 = n8;
            float f11 = n10 + n9;
            float f12 = n8 + n9;
            rectF.set(f9, f10, f11, f12);
            this.a.setStyle(Paint.Style.FILL);
            this.a.setColor(this.e);
            canvas.drawCircle(this.b.centerX(), this.b.centerY(), this.b.width() / 2.0f, this.a);
            this.a.setColor(this.d);
            canvas.drawArc(this.b, -90.0f, (float)this.c, true, this.a);
            if (this.g == 3) {
                this.b.set(f9 + f8, f10 + f8, f11 - f8, f12 - f8);
                this.a.setStyle(Paint.Style.STROKE);
                this.a.setStrokeWidth((float)this.f);
                canvas.drawCircle(this.b.centerX(), this.b.centerY(), this.b.width() / 2.0f, this.a);
            }
        }
        canvas.restore();
    }

    public void setProgressAngle(int n8) {
        this.c = n8;
        this.invalidate();
    }

    public void setProgressPercent(int n8) {
        this.c = n8 * 360 / 100;
        this.invalidate();
    }

    public void setStrokeWidth(int n8) {
        this.f = n8;
        this.invalidate();
    }

    public void setStyle(int n8) {
        this.g = n8;
        this.invalidate();
    }
}

