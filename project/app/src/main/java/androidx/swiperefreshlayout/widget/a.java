/*
 * Decompiled with CFR 0.152.
 */
package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import ax.c0.d0;

class a
extends ImageView {
    private Animation.AnimationListener a;
    private int b;
    private int c;

    a(Context context) {
        super(context);
        float f8 = this.getContext().getResources().getDisplayMetrics().density;
        int n8 = (int)(1.75f * f8);
        int n9 = (int)(0.0f * f8);
        this.b = (int)(3.5f * f8);
        context = this.getContext().obtainStyledAttributes(ax.s2.a.f);
        this.c = context.getColor(ax.s2.a.g, -328966);
        context.recycle();
        if (this.a()) {
            context = new ShapeDrawable((Shape)new OvalShape());
            d0.r0((View)this, f8 * 4.0f);
        } else {
            context = new ShapeDrawable((Shape)new a(this, this.b));
            this.setLayerType(1, context.getPaint());
            context.getPaint().setShadowLayer((float)this.b, (float)n9, (float)n8, 0x1E000000);
            n9 = this.b;
            this.setPadding(n9, n9, n9, n9);
        }
        context.getPaint().setColor(this.c);
        d0.o0((View)this, (Drawable)context);
    }

    private boolean a() {
        return true;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.a = animationListener;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(this.getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.a;
        if (animationListener != null) {
            animationListener.onAnimationStart(this.getAnimation());
        }
    }

    protected void onMeasure(int n8, int n9) {
        super.onMeasure(n8, n9);
        if (!this.a()) {
            this.setMeasuredDimension(this.getMeasuredWidth() + this.b * 2, this.getMeasuredHeight() + this.b * 2);
        }
    }

    public void setBackgroundColor(int n8) {
        if (this.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable)this.getBackground()).getPaint().setColor(n8);
            this.c = n8;
        }
    }

    private static class a
    extends OvalShape {
        private int c0;
        private a d0;
        private Paint q;

        a(a a8, int n8) {
            this.d0 = a8;
            this.q = new Paint();
            this.c0 = n8;
            this.b((int)this.rect().width());
        }

        private void b(int n8) {
            Paint paint = this.q;
            float f8 = n8 / 2;
            float f9 = this.c0;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader((Shader)new RadialGradient(f8, f8, f9, new int[]{0x3D000000, 0}, null, tileMode));
        }

        public void draw(Canvas canvas, Paint paint) {
            int n8 = this.d0.getWidth() / 2;
            int n9 = this.d0.getHeight() / 2;
            float f8 = n8;
            float f9 = n9;
            canvas.drawCircle(f8, f9, f8, this.q);
            canvas.drawCircle(f8, f9, (float)(n8 - this.c0), paint);
        }

        protected void onResize(float f8, float f9) {
            super.onResize(f8, f9);
            this.b((int)f8);
        }
    }
}

