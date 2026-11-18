package com.voxdon.xplorer.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import ax.Q2.n;
import ax.u3.C3180B;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public class RefreshProgressBar extends View {
    private final GradientDrawable a;
    final ValueAnimator b;
    private final Paint c;
    private final int d;
    private final int e;
    private final int f;
    private final float g;
    private int h;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            RefreshProgressBar.this.invalidate();
        }
    }

    private static class b implements Interpolator {
        private b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return ((float) Math.pow(2.0d, f)) - 1.0f;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public RefreshProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.c = paint;
        float s = C3180B.s(context);
        this.g = s;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.T1);
        try {
            int color = obtainStyledAttributes.getColor(0, ax.Q.b.c(context, R.color.refresh_progress_bar));
            this.d = color;
            this.e = obtainStyledAttributes.getDimensionPixelSize(1, Math.round(4.0f * s));
            this.f = obtainStyledAttributes.getDimensionPixelSize(2, Math.round(s * 3.0f));
            obtainStyledAttributes.recycle();
            ValueAnimator valueAnimator = new ValueAnimator();
            this.b = valueAnimator;
            valueAnimator.setFloatValues(1.0f, 2.0f);
            valueAnimator.setRepeatCount(-1);
            valueAnimator.setInterpolator(new b(null));
            paint.setColor(color);
            this.a = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{(color & 16777215) | 570425344, 0});
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void a() {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator == null || valueAnimator.isStarted()) {
            return;
        }
        this.b.addUpdateListener(new a());
        this.b.start();
    }

    private void b() {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.cancel();
        this.b.removeAllUpdateListeners();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.b.isStarted()) {
            this.a.draw(canvas);
            float floatValue = ((Float) this.b.getAnimatedValue()).floatValue();
            int width = getWidth() >> (this.h - 1);
            int i = 0;
            while (i < this.h) {
                int i2 = i + 1;
                float f = (r1 >> i2) * floatValue;
                float f2 = width;
                canvas.drawRect((f + this.f) - f2, 0.0f, (i == 0 ? r1 + width : 2.0f * f) - f2, this.e, this.c);
                i = i2;
            }
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            int width = getWidth();
            this.a.setBounds(0, this.e, width, getHeight() - this.e);
            float f = ((width / this.g) / 320.0f) - 1.0f;
            this.b.setDuration((int) (((0.3f * f) + 1.0f) * 1500.0f));
            this.h = (int) (((f * 0.1f) + 1.0f) * 5.0f);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            b();
        } else if (getVisibility() == 0) {
            a();
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }
}
