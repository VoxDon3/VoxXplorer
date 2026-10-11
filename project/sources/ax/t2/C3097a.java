package ax.t2;

import android.animation.Animator;
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
import ax.b0.C1446g;

/* renamed from: ax.t2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3097a extends Drawable implements Animatable {
    private static final Interpolator g = new LinearInterpolator();
    private static final Interpolator h = new ax.D0.b();
    private static final int[] i = {-16777216};
    private final c a;
    private float b;
    private Resources c;
    private Animator d;
    float e;
    boolean f;

    /* renamed from: ax.t2.a$a, reason: collision with other inner class name */
    class C0455a implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ c a;

        C0455a(c cVar) {
            this.a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C3097a.this.n(floatValue, this.a);
            C3097a.this.b(floatValue, this.a, false);
            C3097a.this.invalidateSelf();
        }
    }

    /* renamed from: ax.t2.a$c */
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
            Paint paint = new Paint();
            this.b = paint;
            Paint paint2 = new Paint();
            this.c = paint2;
            Paint paint3 = new Paint();
            this.d = paint3;
            this.e = 0.0f;
            this.f = 0.0f;
            this.g = 0.0f;
            this.h = 5.0f;
            this.p = 1.0f;
            this.t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void A() {
            this.k = this.e;
            this.l = this.f;
            this.m = this.g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.a;
            float f = this.q;
            float f2 = (this.h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.r * this.p) / 2.0f, this.h / 2.0f);
            }
            rectF.set(rect.centerX() - f2, rect.centerY() - f2, rect.centerX() + f2, rect.centerY() + f2);
            float f3 = this.e;
            float f4 = this.g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f + f4) * 360.0f) - f5;
            this.b.setColor(this.u);
            this.b.setAlpha(this.t);
            float f7 = this.h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.b);
            b(canvas, f5, f6, rectF);
        }

        void b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.n) {
                Path path = this.o;
                if (path == null) {
                    Path path2 = new Path();
                    this.o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f3 = (this.r * this.p) / 2.0f;
                this.o.moveTo(0.0f, 0.0f);
                this.o.lineTo(this.r * this.p, 0.0f);
                Path path3 = this.o;
                float f4 = this.r;
                float f5 = this.p;
                path3.lineTo((f4 * f5) / 2.0f, this.s * f5);
                this.o.offset((min + rectF.centerX()) - f3, rectF.centerY() + (this.h / 2.0f));
                this.o.close();
                this.c.setColor(this.u);
                this.c.setAlpha(this.t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
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
            return this.i[f()];
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
            t(f());
        }

        void m() {
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        void n(int i) {
            this.t = i;
        }

        void o(float f, float f2) {
            this.r = (int) f;
            this.s = (int) f2;
        }

        void p(float f) {
            if (f != this.p) {
                this.p = f;
            }
        }

        void q(float f) {
            this.q = f;
        }

        void r(int i) {
            this.u = i;
        }

        void s(ColorFilter colorFilter) {
            this.b.setColorFilter(colorFilter);
        }

        void t(int i) {
            this.j = i;
            this.u = this.i[i];
        }

        void u(int[] iArr) {
            this.i = iArr;
            t(0);
        }

        void v(float f) {
            this.f = f;
        }

        void w(float f) {
            this.g = f;
        }

        void x(boolean z) {
            if (this.n != z) {
                this.n = z;
            }
        }

        void y(float f) {
            this.e = f;
        }

        void z(float f) {
            this.h = f;
            this.b.setStrokeWidth(f);
        }
    }

    public C3097a(Context context) {
        this.c = ((Context) C1446g.g(context)).getResources();
        c cVar = new c();
        this.a = cVar;
        cVar.u(i);
        k(2.5f);
        m();
    }

    private void a(float f, c cVar) {
        n(f, cVar);
        float floor = (float) (Math.floor(cVar.j() / 0.8f) + 1.0d);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((floor - cVar.j()) * f));
    }

    private int c(float f, int i2, int i3) {
        return ((((i2 >> 24) & 255) + ((int) ((((i3 >> 24) & 255) - r0) * f))) << 24) | ((((i2 >> 16) & 255) + ((int) ((((i3 >> 16) & 255) - r1) * f))) << 16) | ((((i2 >> 8) & 255) + ((int) ((((i3 >> 8) & 255) - r2) * f))) << 8) | ((i2 & 255) + ((int) (f * ((i3 & 255) - r8))));
    }

    private void h(float f) {
        this.b = f;
    }

    private void i(float f, float f2, float f3, float f4) {
        c cVar = this.a;
        float f5 = this.c.getDisplayMetrics().density;
        cVar.z(f2 * f5);
        cVar.q(f * f5);
        cVar.t(0);
        cVar.o(f3 * f5, f4 * f5);
    }

    private void m() {
        c cVar = this.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C0455a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(g);
        ofFloat.addListener(new b(cVar));
        this.d = ofFloat;
    }

    void b(float f, c cVar, boolean z) {
        float interpolation;
        float f2;
        if (this.f) {
            a(f, cVar);
            return;
        }
        if (f != 1.0f || z) {
            float j = cVar.j();
            if (f < 0.5f) {
                interpolation = cVar.k();
                f2 = (h.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float k = cVar.k() + 0.79f;
                interpolation = k - (((1.0f - h.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = k;
            }
            float f3 = j + (0.20999998f * f);
            float f4 = (f + this.e) * 216.0f;
            cVar.y(interpolation);
            cVar.v(f2);
            cVar.w(f3);
            h(f4);
        }
    }

    public void d(boolean z) {
        this.a.x(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.b, bounds.exactCenterX(), bounds.exactCenterY());
        this.a.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f) {
        this.a.p(f);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.a.u(iArr);
        this.a.t(0);
        invalidateSelf();
    }

    public void g(float f) {
        this.a.w(f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.d.isRunning();
    }

    public void j(float f, float f2) {
        this.a.y(f);
        this.a.v(f2);
        invalidateSelf();
    }

    public void k(float f) {
        this.a.z(f);
        invalidateSelf();
    }

    public void l(int i2) {
        if (i2 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    void n(float f, c cVar) {
        if (f > 0.75f) {
            cVar.r(c((f - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.a.n(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.d.cancel();
        this.a.A();
        if (this.a.d() != this.a.g()) {
            this.f = true;
            this.d.setDuration(666L);
            this.d.start();
        } else {
            this.a.t(0);
            this.a.m();
            this.d.setDuration(1332L);
            this.d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.d.cancel();
        h(0.0f);
        this.a.x(false);
        this.a.t(0);
        this.a.m();
        invalidateSelf();
    }

    /* renamed from: ax.t2.a$b */
    class b implements Animator.AnimatorListener {
        final /* synthetic */ c a;

        b(c cVar) {
            this.a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            C3097a.this.b(1.0f, this.a, true);
            this.a.A();
            this.a.l();
            C3097a c3097a = C3097a.this;
            if (!c3097a.f) {
                c3097a.e += 1.0f;
                return;
            }
            c3097a.f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.a.x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C3097a.this.e = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }
}
