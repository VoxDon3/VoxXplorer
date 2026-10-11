/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import ax.W.a;
import com.google.android.material.progressindicator.i;
import com.google.android.material.progressindicator.o;

final class l
extends i<o> {
    private float f = 300.0f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private int l;
    private boolean m;
    private float n;
    Pair<i.b, i.b> o = new Pair((Object)new i.b(this), (Object)new i.b(this));

    l(o o8) {
        super(o8);
    }

    private void j(PathMeasure pathMeasure, Path path, Pair<i.b, i.b> object, float f8, float f9, float f10, float f11) {
        int n8 = this.m ? ((o)this.a).j : ((o)this.a).k;
        if (pathMeasure == this.d && n8 != this.l) {
            this.l = n8;
            this.g();
        }
        path.rewind();
        float f12 = -this.f / 2.0f;
        boolean bl = ((o)this.a).b(this.m);
        float f13 = f12;
        float f14 = f8;
        float f15 = f9;
        if (bl) {
            f15 = this.f;
            f13 = this.k;
            f14 = f15 / f13;
            f15 = f11 / f14;
            float f16 = f14 / (f14 + 1.0f);
            f14 = (f8 + f15) * f16;
            f15 = (f9 + f15) * f16;
            f13 = f12 - f11 * f13;
        }
        f8 = f14 * pathMeasure.getLength();
        f9 = f15 * pathMeasure.getLength();
        pathMeasure.getSegment(f8, f9, path, true);
        i.b b8 = (i.b)((Pair)object).first;
        b8.c();
        pathMeasure.getPosTan(f8, b8.a, b8.b);
        object = (i.b)((Pair)object).second;
        ((i.b)object).c();
        pathMeasure.getPosTan(f9, ((i.b)object).a, ((i.b)object).b);
        this.e.reset();
        this.e.setTranslate(f13, 0.0f);
        b8.f(f13, 0.0f);
        ((i.b)object).f(f13, 0.0f);
        if (bl) {
            f8 = this.j * f10;
            this.e.postScale(1.0f, f8);
            b8.e(1.0f, f8);
            ((i.b)object).e(1.0f, f8);
        }
        path.transform(this.e);
    }

    private void k(Canvas canvas, Paint paint, float f8, float f9, int n8, int n9, int n10, float f10, float f11, boolean bl) {
        float f12;
        float f13;
        f8 = ax.W.a.a(f8, 0.0f, 1.0f);
        f9 = ax.W.a.a(f9, 0.0f, 1.0f);
        f8 = ax.G6.a.d(1.0f - this.n, 1.0f, f8);
        f9 = ax.G6.a.d(1.0f - this.n, 1.0f, f9);
        n9 = (int)((float)n9 * ax.W.a.a(f8, 0.0f, 0.01f) / 0.01f);
        int n11 = (int)((float)n10 * (1.0f - ax.W.a.a(f9, 0.99f, 1.0f)) / 0.01f);
        float f14 = this.f;
        n10 = (int)(f8 * f14 + (float)n9);
        n11 = (int)(f9 * f14 - (float)n11);
        f8 = this.h;
        f9 = this.i;
        if (f8 != f9) {
            f9 = Math.max(f8, f9);
            f8 = this.f;
            f9 /= f8;
            f8 = ax.G6.a.d(this.h, this.i, ax.W.a.a((float)n10 / f8, 0.0f, f9) / f9);
            f13 = this.h;
            f12 = this.i;
            f14 = this.f;
            f9 = ax.G6.a.d(f13, f12, ax.W.a.a((f14 - (float)n11) / f14, 0.0f, f9) / f9);
        } else {
            f9 = f8;
        }
        float f15 = -this.f / 2.0f;
        n9 = ((o)this.a).b(this.m) && bl && f10 > 0.0f ? 1 : 0;
        if (n10 <= n11) {
            float f16 = (float)n10 + f8;
            f13 = (float)n11 - f9;
            f12 = f8 * 2.0f;
            f14 = 2.0f * f9;
            paint.setColor(n8);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.g);
            ((i.b)this.o.first).c();
            ((i.b)this.o.second).c();
            ((i.b)this.o.first).f(f16 + f15, 0.0f);
            ((i.b)this.o.second).f(f15 + f13, 0.0f);
            if (n10 == 0 && f13 + f9 < f16 + f8) {
                Pair<i.b, i.b> pair = this.o;
                i.b b8 = (i.b)pair.first;
                f10 = this.g;
                this.m(canvas, paint, b8, f12, f10, f8, (i.b)pair.second, f14, f10, f9, true);
                return;
            }
            if (f16 - f8 > f13 - f9) {
                Pair<i.b, i.b> pair = this.o;
                i.b b9 = (i.b)pair.second;
                f10 = this.g;
                this.m(canvas, paint, b9, f14, f10, f9, (i.b)pair.first, f12, f10, f8, false);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            Object object = ((o)this.a).g() ? Paint.Cap.ROUND : Paint.Cap.BUTT;
            paint.setStrokeCap((Paint.Cap)object);
            if (n9 == 0) {
                object = this.o;
                Object object2 = object.first;
                f11 = ((i.b)object2).a[0];
                f10 = ((i.b)object2).a[1];
                object = object.second;
                canvas.drawLine(f11, f10, ((i.b)object).a[0], ((i.b)object).a[1], paint);
            } else {
                PathMeasure pathMeasure = this.d;
                object = this.c;
                Pair<i.b, i.b> pair = this.o;
                f15 = this.f;
                this.j(pathMeasure, (Path)object, pair, f16 / f15, f13 / f15, f10, f11);
                canvas.drawPath(this.c, paint);
            }
            if (!((o)this.a).g()) {
                if (f16 > 0.0f && f8 > 0.0f) {
                    this.l(canvas, paint, (i.b)this.o.first, f12, this.g, f8);
                }
                if (f13 < this.f && f9 > 0.0f) {
                    this.l(canvas, paint, (i.b)this.o.second, f14, this.g, f9);
                }
            }
        }
    }

    private void l(Canvas canvas, Paint paint, i.b b8, float f8, float f9, float f10) {
        this.m(canvas, paint, b8, f8, f9, f10, null, 0.0f, 0.0f, 0.0f, false);
    }

    private void m(Canvas canvas, Paint paint, i.b b8, float f8, float f9, float f10, i.b object, float f11, float f12, float f13, boolean bl) {
        float f14 = Math.min(f9, this.g);
        float f15 = -f8 / 2.0f;
        f9 = -f14 / 2.0f;
        float f16 = f8 / 2.0f;
        RectF rectF = new RectF(f15, f9, f16, f14 /= 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (object != null) {
            f12 = Math.min(f12, this.g);
            f13 = Math.min(f11 / 2.0f, f13 * f12 / this.g);
            RectF rectF2 = new RectF();
            if (bl) {
                f8 = ((i.b)object).a[0] - f13 - (b8.a[0] - f10);
                if (f8 > 0.0f) {
                    ((i.b)object).f(-f8 / 2.0f, 0.0f);
                    f8 = f11 + f8;
                } else {
                    f8 = f11;
                }
                rectF2.set(0.0f, f9, f16, f14);
            } else {
                f8 = ((i.b)object).a[0] + f13 - (b8.a[0] + f10);
                if (f8 < 0.0f) {
                    ((i.b)object).f(-f8 / 2.0f, 0.0f);
                    f8 = f11 - f8;
                } else {
                    f8 = f11;
                }
                rectF2.set(f15, f9, 0.0f, f14);
            }
            RectF rectF3 = new RectF(-f8 / 2.0f, -f12 / 2.0f, f8 / 2.0f, f12 / 2.0f);
            Object object2 = ((i.b)object).a;
            canvas.translate(object2[0], object2[1]);
            canvas.rotate(this.i(((i.b)object).b));
            object2 = new Path();
            object2.addRoundRect(rectF3, f13, f13, Path.Direction.CCW);
            canvas.clipPath((Path)object2);
            canvas.rotate(-this.i(((i.b)object).b));
            object = ((i.b)object).a;
            canvas.translate((float)(-object[0]), (float)(-object[1]));
            object = b8.a;
            canvas.translate((float)object[0], (float)object[1]);
            canvas.rotate(this.i(b8.b));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            object = b8.a;
            canvas.translate((float)object[0], (float)object[1]);
            canvas.rotate(this.i(b8.b));
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
        canvas.restore();
    }

    @Override
    void a(Canvas canvas, Rect object, float f8, boolean bl, boolean bl2) {
        if (this.f != (float)object.width()) {
            this.f = object.width();
            this.g();
        }
        float f9 = this.e();
        canvas.translate((float)object.left + (float)object.width() / 2.0f, (float)object.top + (float)object.height() / 2.0f + Math.max(0.0f, ((float)object.height() - f9) / 2.0f));
        if (((o)this.a).q) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f10 = this.f / 2.0f;
        canvas.clipRect(-f10, -(f9 /= 2.0f), f10, f9);
        object = this.a;
        this.g = (float)((o)object).a * f8;
        this.h = (float)Math.min(((o)object).a / 2, ((o)object).a()) * f8;
        object = this.a;
        this.j = (float)((o)object).l * f8;
        this.i = Math.min((float)((o)object).a / 2.0f, (float)((o)object).i()) * f8;
        if (bl || bl2) {
            if (bl && ((o)this.a).g == 2 || bl2 && ((o)this.a).h == 1) {
                canvas.scale(1.0f, -1.0f);
            }
            if (bl || bl2 && ((o)this.a).h != 3) {
                canvas.translate(0.0f, (float)((o)this.a).a * (1.0f - f8) / 2.0f);
            }
        }
        if (bl2 && ((o)this.a).h == 3) {
            this.n = f8;
            return;
        }
        this.n = 1.0f;
    }

    @Override
    void b(Canvas canvas, Paint paint, int n8, int n9) {
        n8 = ax.z6.a.a(n8, n9);
        this.m = false;
        if (((o)this.a).r > 0 && n8 != 0) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(n8);
            Object s8 = this.a;
            float f8 = ((o)s8).s != null ? ((o)s8).s.floatValue() + (float)((o)this.a).r / 2.0f : this.g / 2.0f;
            i.b b8 = new i.b(this, new float[]{this.f / 2.0f - f8, 0.0f}, new float[]{1.0f, 0.0f});
            s8 = this.a;
            this.l(canvas, paint, b8, ((o)s8).r, ((o)s8).r, this.h * (float)((o)s8).r / this.g);
        }
    }

    @Override
    void c(Canvas canvas, Paint paint, i.a a8, int n8) {
        int n9 = ax.z6.a.a(a8.c, n8);
        this.m = a8.h;
        float f8 = a8.a;
        float f9 = a8.b;
        n8 = a8.d;
        this.k(canvas, paint, f8, f9, n9, n8, n8, a8.e, a8.f, true);
    }

    @Override
    void d(Canvas canvas, Paint paint, float f8, float f9, int n8, int n9, int n10) {
        n8 = ax.z6.a.a(n8, n9);
        this.m = false;
        this.k(canvas, paint, f8, f9, n8, n10, n10, 0.0f, 0.0f, false);
    }

    @Override
    int e() {
        Object s8 = this.a;
        return ((o)s8).a + ((o)s8).l * 2;
    }

    @Override
    int f() {
        return -1;
    }

    @Override
    void g() {
        this.b.rewind();
        if (((o)this.a).b(this.m)) {
            int n8 = this.m ? ((o)this.a).j : ((o)this.a).k;
            float f8 = this.f;
            int n9 = (int)(f8 / (float)n8);
            this.k = f8 / (float)n9;
            for (n8 = 0; n8 <= n9; ++n8) {
                Path path = this.b;
                int n10 = n8 * 2;
                float f9 = n10;
                f8 = n10 + 1;
                path.cubicTo(f9 + 0.48f, 0.0f, f8 - 0.48f, 1.0f, f8, 1.0f);
                path = this.b;
                f9 = n10 + 2;
                path.cubicTo(f8 + 0.48f, 1.0f, f9 - 0.48f, 0.0f, f9, 0.0f);
            }
            this.e.reset();
            this.e.setScale(this.k / 2.0f, -2.0f);
            this.e.postTranslate(0.0f, 1.0f);
            this.b.transform(this.e);
        } else {
            this.b.lineTo(this.f, 0.0f);
        }
        this.d.setPath(this.b, false);
    }
}

