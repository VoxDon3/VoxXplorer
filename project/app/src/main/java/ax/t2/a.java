/*
 * Decompiled with CFR 0.152.
 */
package ax.t2;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import ax.D0.b;
import ax.b0.g;

public class a
extends Drawable
implements Animatable {
    private static final Interpolator g = new LinearInterpolator();
    private static final Interpolator h = new b();
    private static final int[] i = new int[]{-16777216};
    private final c a;
    private float b;
    private Resources c;
    private Animator d;
    float e;
    boolean f;

    public a(Context object) {
        this.c = ax.b0.g.g(object).getResources();
        object = new c();
        this.a = object;
        ((c)object).u(i);
        this.k(2.5f);
        this.m();
    }

    private void a(float f8, c c8) {
        this.n(f8, c8);
        float f9 = (float)(Math.floor(c8.j() / 0.8f) + 1.0);
        c8.y(c8.k() + (c8.i() - 0.01f - c8.k()) * f8);
        c8.v(c8.i());
        c8.w(c8.j() + (f9 - c8.j()) * f8);
    }

    private int c(float f8, int n8, int n9) {
        int n10 = n8 >> 24 & 0xFF;
        int n11 = n8 >> 16 & 0xFF;
        int n12 = n8 >> 8 & 0xFF;
        return n10 + (int)((float)((n9 >> 24 & 0xFF) - n10) * f8) << 24 | n11 + (int)((float)((n9 >> 16 & 0xFF) - n11) * f8) << 16 | n12 + (int)((float)((n9 >> 8 & 0xFF) - n12) * f8) << 8 | (n8 &= 0xFF) + (int)(f8 * (float)((n9 & 0xFF) - n8));
    }

    private void h(float f8) {
        this.b = f8;
    }

    private void i(float f8, float f9, float f10, float f11) {
        c c8 = this.a;
        float f12 = this.c.getDisplayMetrics().density;
        c8.z(f9 * f12);
        c8.q(f8 * f12);
        c8.t(0);
        c8.o(f10 * f12, f11 * f12);
    }

    private void m() {
        c c8 = this.a;
        ValueAnimator valueAnimator = ValueAnimator.ofFloat((float[])new float[]{0.0f, 1.0f});
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, c8){
            final c a;
            final a b;
            {
                this.b = a8;
                this.a = c8;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float f8 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
                this.b.n(f8, this.a);
                this.b.b(f8, this.a, false);
                this.b.invalidateSelf();
            }
        });
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setRepeatMode(1);
        valueAnimator.setInterpolator((TimeInterpolator)g);
        valueAnimator.addListener(new Animator.AnimatorListener(this, c8){
            final c a;
            final a b;
            {
                this.b = a8;
                this.a = c8;
            }

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
                this.b.b(1.0f, this.a, true);
                this.a.A();
                this.a.l();
                a a8 = this.b;
                if (a8.f) {
                    a8.f = false;
                    animator.cancel();
                    animator.setDuration(1332L);
                    animator.start();
                    this.a.x(false);
                    return;
                }
                a8.e += 1.0f;
            }

            public void onAnimationStart(Animator animator) {
                this.b.e = 0.0f;
            }
        });
        this.d = valueAnimator;
    }

    void b(float f8, c c8, boolean bl) {
        float f9;
        float f10;
        if (this.f) {
            this.a(f8, c8);
            return;
        }
        if (f8 == 1.0f && !bl) {
            return;
        }
        float f11 = c8.j();
        if (f8 < 0.5f) {
            f10 = f8 / 0.5f;
            f9 = c8.k();
            f10 = h.getInterpolation(f10) * 0.79f + 0.01f + f9;
        } else {
            f9 = (f8 - 0.5f) / 0.5f;
            f10 = c8.k() + 0.79f;
            f9 = f10 - ((1.0f - h.getInterpolation(f9)) * 0.79f + 0.01f);
        }
        float f12 = this.e;
        c8.y(f9);
        c8.v(f10);
        c8.w(f11 + 0.20999998f * f8);
        this.h((f8 + f12) * 216.0f);
    }

    public void d(boolean bl) {
        this.a.x(bl);
        this.invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect rect = this.getBounds();
        canvas.save();
        canvas.rotate(this.b, rect.exactCenterX(), rect.exactCenterY());
        this.a.a(canvas, rect);
        canvas.restore();
    }

    public void e(float f8) {
        this.a.p(f8);
        this.invalidateSelf();
    }

    public void f(int ... nArray) {
        this.a.u(nArray);
        this.a.t(0);
        this.invalidateSelf();
    }

    public void g(float f8) {
        this.a.w(f8);
        this.invalidateSelf();
    }

    public int getAlpha() {
        return this.a.c();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.d.isRunning();
    }

    public void j(float f8, float f9) {
        this.a.y(f8);
        this.a.v(f9);
        this.invalidateSelf();
    }

    public void k(float f8) {
        this.a.z(f8);
        this.invalidateSelf();
    }

    public void l(int n8) {
        if (n8 == 0) {
            this.i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            this.i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        this.invalidateSelf();
    }

    void n(float f8, c c8) {
        if (f8 > 0.75f) {
            c8.r(this.c((f8 - 0.75f) / 0.25f, c8.h(), c8.e()));
            return;
        }
        c8.r(c8.h());
    }

    public void setAlpha(int n8) {
        this.a.n(n8);
        this.invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.s(colorFilter);
        this.invalidateSelf();
    }

    public void start() {
        this.d.cancel();
        this.a.A();
        if (this.a.d() != this.a.g()) {
            this.f = true;
            this.d.setDuration(666L);
            this.d.start();
            return;
        }
        this.a.t(0);
        this.a.m();
        this.d.setDuration(1332L);
        this.d.start();
    }

    public void stop() {
        this.d.cancel();
        this.h(0.0f);
        this.a.x(false);
        this.a.t(0);
        this.a.m();
        this.invalidateSelf();
    }

    private static class c {
        final RectF a = new RectF();
        final Paint b;
        final Paint c;
        final Paint d;
        float e;
        float f;
        float g;
        float h;
        int[] i;
        int j;
        float k;
        float l;
        float m;
        boolean n;
        Path o;
        float p;
        float q;
        int r;
        int s;
        int t;
        int u;

        c() {
            Paint paint;
            Paint paint2;
            Paint paint3;
            this.b = paint3 = new Paint();
            this.c = paint2 = new Paint();
            this.d = paint = new Paint();
            this.e = 0.0f;
            this.f = 0.0f;
            this.g = 0.0f;
            this.h = 5.0f;
            this.p = 1.0f;
            this.t = 255;
            paint3.setStrokeCap(Paint.Cap.SQUARE);
            paint3.setAntiAlias(true);
            paint3.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint.setColor(0);
        }

        void A() {
            this.k = this.e;
            this.l = this.f;
            this.m = this.g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.a;
            float f8 = this.q;
            float f9 = this.h / 2.0f + f8;
            if (f8 <= 0.0f) {
                f9 = (float)Math.min(rect.width(), rect.height()) / 2.0f - Math.max((float)this.r * this.p / 2.0f, this.h / 2.0f);
            }
            rectF.set((float)rect.centerX() - f9, (float)rect.centerY() - f9, (float)rect.centerX() + f9, (float)rect.centerY() + f9);
            f9 = this.e;
            f8 = this.g;
            f9 = (f9 + f8) * 360.0f;
            f8 = (this.f + f8) * 360.0f - f9;
            this.b.setColor(this.u);
            this.b.setAlpha(this.t);
            float f10 = this.h / 2.0f;
            rectF.inset(f10, f10);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.d);
            f10 = -f10;
            rectF.inset(f10, f10);
            canvas.drawArc(rectF, f9, f8, false, this.b);
            this.b(canvas, f9, f8, rectF);
        }

        void b(Canvas canvas, float f8, float f9, RectF rectF) {
            if (this.n) {
                Path path = this.o;
                if (path == null) {
                    this.o = path = new Path();
                    path.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float f10 = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f11 = (float)this.r * this.p / 2.0f;
                this.o.moveTo(0.0f, 0.0f);
                this.o.lineTo((float)this.r * this.p, 0.0f);
                path = this.o;
                float f12 = this.r;
                float f13 = this.p;
                path.lineTo(f12 * f13 / 2.0f, (float)this.s * f13);
                this.o.offset(f10 + rectF.centerX() - f11, rectF.centerY() + this.h / 2.0f);
                this.o.close();
                this.c.setColor(this.u);
                this.c.setAlpha(this.t);
                canvas.save();
                canvas.rotate(f8 + f9, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.o, this.c);
                canvas.restore();
            }
        }

        int c() {
            return this.t;
        }

        float d() {
            return this.f;
        }

        int e() {
            return this.i[this.f()];
        }

        int f() {
            return (this.j + 1) % this.i.length;
        }

        float g() {
            return this.e;
        }

        int h() {
            return this.i[this.j];
        }

        float i() {
            return this.l;
        }

        float j() {
            return this.m;
        }

        float k() {
            return this.k;
        }

        void l() {
            this.t(this.f());
        }

        void m() {
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            this.y(0.0f);
            this.v(0.0f);
            this.w(0.0f);
        }

        void n(int n8) {
            this.t = n8;
        }

        void o(float f8, float f9) {
            this.r = (int)f8;
            this.s = (int)f9;
        }

        void p(float f8) {
            if (f8 != this.p) {
                this.p = f8;
            }
        }

        void q(float f8) {
            this.q = f8;
        }

        void r(int n8) {
            this.u = n8;
        }

        void s(ColorFilter colorFilter) {
            this.b.setColorFilter(colorFilter);
        }

        void t(int n8) {
            this.j = n8;
            this.u = this.i[n8];
        }

        void u(int[] nArray) {
            this.i = nArray;
            this.t(0);
        }

        void v(float f8) {
            this.f = f8;
        }

        void w(float f8) {
            this.g = f8;
        }

        void x(boolean bl) {
            if (this.n != bl) {
                this.n = bl;
            }
        }

        void y(float f8) {
            this.e = f8;
        }

        void z(float f8) {
            this.h = f8;
            this.b.setStrokeWidth(f8);
        }
    }
}

