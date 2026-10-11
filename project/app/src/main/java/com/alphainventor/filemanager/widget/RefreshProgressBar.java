/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import ax.Q2.n;
import ax.u3.B;

public class RefreshProgressBar
extends View {
    private final GradientDrawable a;
    final ValueAnimator b;
    private final Paint c;
    private final int d;
    private final int e;
    private final int f;
    private final float g;
    private int h;

    public RefreshProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n8;
        float f8;
        Paint paint;
        this.c = paint = new Paint();
        this.g = f8 = B.s(context);
        attributeSet = context.obtainStyledAttributes(attributeSet, n.T1);
        this.d = n8 = attributeSet.getColor(0, ax.Q.b.c(context, 2131100772));
        this.e = attributeSet.getDimensionPixelSize(1, Math.round(4.0f * f8));
        this.f = attributeSet.getDimensionPixelSize(2, Math.round(f8 * 3.0f));
        context = new ValueAnimator();
        this.b = context;
        context.setFloatValues(new float[]{1.0f, 2.0f});
        context.setRepeatCount(-1);
        context.setInterpolator((TimeInterpolator)new b());
        paint.setColor(n8);
        this.a = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{n8 & 0xFFFFFF | 0x22000000, 0});
        return;
        finally {
            attributeSet.recycle();
        }
    }

    private void a() {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null && !valueAnimator.isStarted()) {
            this.b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this){
                final RefreshProgressBar a;
                {
                    this.a = refreshProgressBar;
                }

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.invalidate();
                }
            });
            this.b.start();
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.cancel();
        this.b.removeAllUpdateListeners();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b();
    }

    protected void onDraw(Canvas canvas) {
        if (this.b.isStarted()) {
            this.a.draw(canvas);
            float f8 = ((Float)this.b.getAnimatedValue()).floatValue();
            int n8 = this.getWidth();
            int n9 = n8 >> this.h - 1;
            int n10 = 0;
            while (n10 < this.h) {
                int n11 = n10 + 1;
                float f9 = (float)(n8 >> n11) * f8;
                float f10 = n10 == 0 ? (float)(n8 + n9) : 2.0f * f9;
                float f11 = this.f;
                float f12 = n9;
                canvas.drawRect(f9 + f11 - f12, 0.0f, f10 - f12, (float)this.e, this.c);
                n10 = n11;
            }
        }
    }

    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        if (bl) {
            n8 = this.getWidth();
            this.a.setBounds(0, this.e, n8, this.getHeight() - this.e);
            float f8 = (float)n8 / this.g / 320.0f - 1.0f;
            this.b.setDuration((long)((int)((0.3f * f8 + 1.0f) * 1500.0f)));
            this.h = (int)((f8 * 0.1f + 1.0f) * 5.0f);
        }
    }

    protected void onVisibilityChanged(View view, int n8) {
        super.onVisibilityChanged(view, n8);
        if (n8 == 0) {
            if (this.getVisibility() == 0) {
                this.a();
            }
            return;
        }
        this.b();
    }

    protected void onWindowVisibilityChanged(int n8) {
        super.onWindowVisibilityChanged(n8);
    }

    private static class b
    implements Interpolator {
        private b() {
        }

        public float getInterpolation(float f8) {
            return (float)Math.pow(2.0, f8) - 1.0f;
        }
    }
}

