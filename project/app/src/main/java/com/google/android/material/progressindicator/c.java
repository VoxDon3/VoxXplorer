/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Pair;
import ax.W.a;
import com.google.android.material.progressindicator.f;
import com.google.android.material.progressindicator.i;
import java.util.ArrayList;

final class c
extends i<f> {
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private int l;
    private float m;
    private boolean n;
    private float o;
    private final RectF p = new RectF();
    private final Pair<i.b, i.b> q = new Pair((Object)new i.b(this), (Object)new i.b(this));

    c(f f8) {
        super(f8);
    }

    private void j(Path path, i.b object, i.b b8) {
        Object object2 = this.j / 2.0f * 0.48f;
        Object object3 = new i.b(this, (i.b)object);
        object = new i.b(this, b8);
        ((i.b)object3).b((float)object2);
        ((i.b)object).b(-object2);
        object3 = ((i.b)object3).a;
        Object object4 = object3[0];
        Object object5 = object3[1];
        object = ((i.b)object).a;
        Object object6 = object[0];
        object2 = object[1];
        object = b8.a;
        path.cubicTo((float)object4, (float)object5, (float)object6, object2, (float)object[0], (float)object[1]);
    }

    private void k(PathMeasure pathMeasure, Path path, Pair<i.b, i.b> object, float f8, float f9, float f10, float f11) {
        float f12 = this.h * f10;
        int n8 = this.n ? ((f)this.a).j : ((f)this.a).k;
        f10 = this.i;
        if (f10 != this.m || pathMeasure == this.d && (f12 != this.k || n8 != this.l)) {
            this.k = f12;
            this.l = n8;
            this.m = f10;
            this.g();
        }
        path.rewind();
        f12 = 0.0f;
        float f13 = ax.W.a.a(f9, 0.0f, 1.0f);
        f10 = f8;
        f9 = f12;
        if (((f)this.a).b(this.n)) {
            f9 = f11 / (float)((double)this.i * (Math.PI * 2) / (double)this.j);
            f10 = f8 + f9;
            f9 = 0.0f - f9 * 360.0f;
        }
        f8 = pathMeasure.getLength() * (f10 %= 1.0f) / 2.0f;
        f10 = (f10 + f13) * pathMeasure.getLength() / 2.0f;
        pathMeasure.getSegment(f8, f10, path, true);
        i.b b8 = (i.b)((Pair)object).first;
        b8.c();
        pathMeasure.getPosTan(f8, b8.a, b8.b);
        object = (i.b)((Pair)object).second;
        ((i.b)object).c();
        pathMeasure.getPosTan(f10, ((i.b)object).a, ((i.b)object).b);
        this.e.reset();
        this.e.setRotate(f9);
        b8.d(f9);
        ((i.b)object).d(f9);
        path.transform(this.e);
    }

    private void l(PathMeasure object, Path path, float f8) {
        Object object2;
        path.rewind();
        float f9 = object.getLength();
        int n8 = this.n ? ((f)this.a).j : ((f)this.a).k;
        int n9 = Math.max(3, (int)(f9 / (float)n8 / 2.0f)) * 2;
        this.j = f9 / (float)n9;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (n8 = 0; n8 < n9; ++n8) {
            i.b b8 = new i.b(this);
            float f10 = this.j;
            f9 = n8;
            object.getPosTan(f10 * f9, b8.a, b8.b);
            object2 = new i.b(this);
            f10 = this.j;
            object.getPosTan(f9 * f10 + f10 / 2.0f, ((i.b)object2).a, ((i.b)object2).b);
            arrayList.add(b8);
            ((i.b)object2).a(f8 * 2.0f);
            arrayList.add(object2);
        }
        arrayList.add((i.b)arrayList.get(0));
        object = (i.b)arrayList.get(0);
        object2 = object.a;
        f8 = object2[0];
        path.moveTo(f8, object2[1]);
        for (n8 = 1; n8 < arrayList.size(); ++n8) {
            object2 = (i.b)arrayList.get(n8);
            this.j(path, (i.b)object, (i.b)object2);
            object = object2;
        }
    }

    private void m(Canvas canvas, Paint paint, float f8, float f9, int n8, int n9, int n10, float f10, float f11, boolean bl) {
        float f12;
        f9 = f9 >= f8 ? (f9 -= f8) : f9 + 1.0f - f8;
        f8 = f12 = f8 % 1.0f;
        if (f12 < 0.0f) {
            f8 = f12 + 1.0f;
        }
        if (this.o < 1.0f && (f12 = f8 + f9) > 1.0f) {
            this.m(canvas, paint, f8, 1.0f, n8, n9, 0, f10, f11, bl);
            this.m(canvas, paint, 1.0f, f12, n8, 0, n10, f10, f11, bl);
            return;
        }
        float f13 = (float)Math.toDegrees(this.g / this.i);
        float f14 = f9 - 0.99f;
        f12 = f9;
        float f15 = f8;
        if (f14 >= 0.0f) {
            f14 = f14 * f13 / 180.0f / 0.01f;
            f12 = f9 += f14;
            f15 = f8;
            if (!bl) {
                f15 = f8 - f14 / 2.0f;
                f12 = f9;
            }
        }
        f8 = ax.G6.a.d(1.0f - this.o, 1.0f, f15);
        f9 = ax.G6.a.d(0.0f, this.o, f12);
        f12 = (float)Math.toDegrees((float)n9 / this.i);
        f9 = f9 * 360.0f - f12 - (float)Math.toDegrees((float)n10 / this.i);
        f15 = f8 * 360.0f + f12;
        if (!(f9 <= 0.0f)) {
            n9 = ((f)this.a).b(this.n) && bl && f10 > 0.0f ? 1 : 0;
            paint.setAntiAlias(true);
            paint.setColor(n8);
            paint.setStrokeWidth(this.f);
            f8 = this.g * 2.0f;
            f12 = f13 * 2.0f;
            if (f9 < f12) {
                f11 = f15 + f13 * (f9 /= f12);
                i.b b8 = new i.b(this);
                if (n9 == 0) {
                    b8.d(f11 + 90.0f);
                    b8.a(-this.i);
                } else {
                    f11 = f11 / 360.0f * this.d.getLength() / 2.0f;
                    f12 = this.h * f10;
                    f10 = this.i;
                    if (f10 != this.m || f12 != this.k) {
                        this.k = f12;
                        this.m = f10;
                        this.g();
                    }
                    this.d.getPosTan(f11, b8.a, b8.b);
                }
                paint.setStyle(Paint.Style.FILL);
                this.o(canvas, paint, b8, f8, this.f, f9);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            Paint.Cap cap = ((f)this.a).g() ? Paint.Cap.ROUND : Paint.Cap.BUTT;
            paint.setStrokeCap(cap);
            f15 += f13;
            f9 -= f12;
            ((i.b)this.q.first).c();
            ((i.b)this.q.second).c();
            if (n9 == 0) {
                ((i.b)this.q.first).d(f15 + 90.0f);
                ((i.b)this.q.first).a(-this.i);
                ((i.b)this.q.second).d(f15 + f9 + 90.0f);
                ((i.b)this.q.second).a(-this.i);
                cap = this.p;
                f10 = this.i;
                cap.set(-f10, -f10, f10, f10);
                canvas.drawArc(this.p, f15, f9, false, paint);
            } else {
                this.k(this.d, this.c, this.q, f15 / 360.0f, f9 / 360.0f, f10, f11);
                canvas.drawPath(this.c, paint);
            }
            if (!((f)this.a).g() && this.g > 0.0f) {
                paint.setStyle(Paint.Style.FILL);
                this.n(canvas, paint, (i.b)this.q.first, f8, this.f);
                this.n(canvas, paint, (i.b)this.q.second, f8, this.f);
            }
        }
    }

    private void n(Canvas canvas, Paint paint, i.b b8, float f8, float f9) {
        this.o(canvas, paint, b8, f8, f9, 1.0f);
    }

    private void o(Canvas canvas, Paint paint, i.b b8, float f8, float f9, float f10) {
        float f11 = Math.min(f9, this.f);
        float f12 = this.g * f11 / this.f;
        f9 = f8 / 2.0f;
        f12 = Math.min(f9, f12);
        RectF rectF = new RectF(-f8 / 2.0f, -f11 / 2.0f, f9, f11 / 2.0f);
        canvas.save();
        float[] fArray = b8.a;
        canvas.translate(fArray[0], fArray[1]);
        canvas.rotate(this.i(b8.b));
        canvas.scale(f10, f10);
        canvas.drawRoundRect(rectF, f12, f12, paint);
        canvas.restore();
    }

    private int p() {
        Object s8 = this.a;
        return ((f)s8).p + ((f)s8).q * 2;
    }

    @Override
    void a(Canvas object, Rect rect, float f8, boolean bl, boolean bl2) {
        float f9 = (float)rect.width() / (float)this.f();
        float f10 = (float)rect.height() / (float)this.e();
        Object s8 = this.a;
        float f11 = (float)((f)s8).p / 2.0f + (float)((f)s8).q;
        object.translate(f11 * f9 + (float)rect.left, f11 * f10 + (float)rect.top);
        object.rotate(-90.0f);
        object.scale(f9, f10);
        if (((f)this.a).r != 0) {
            object.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                object.rotate(0.1f);
            }
        }
        f10 = -f11;
        object.clipRect(f10, f10, f11, f11);
        object = this.a;
        this.f = (float)((f)object).a * f8;
        this.g = (float)Math.min(((f)object).a / 2, ((f)object).a()) * f8;
        object = this.a;
        this.h = (float)((f)object).l * f8;
        this.i = f10 = (float)(((f)object).p - ((f)object).a) / 2.0f;
        if (bl || bl2) {
            f11 = (1.0f - f8) * (float)((f)object).a / 2.0f;
            if (bl && ((f)object).g == 2 || bl2 && ((f)object).h == 1) {
                this.i = f10 + f11;
            } else if (bl && ((f)object).g == 1 || bl2 && ((f)object).h == 2) {
                this.i = f10 - f11;
            }
        }
        if (bl2 && ((f)object).h == 3) {
            this.o = f8;
            return;
        }
        this.o = 1.0f;
    }

    @Override
    void b(Canvas canvas, Paint paint, int n8, int n9) {
    }

    @Override
    void c(Canvas canvas, Paint paint, i.a a8, int n8) {
        int n9 = ax.z6.a.a(a8.c, n8);
        canvas.save();
        canvas.rotate(a8.g);
        this.n = a8.h;
        float f8 = a8.a;
        float f9 = a8.b;
        n8 = a8.d;
        this.m(canvas, paint, f8, f9, n9, n8, n8, a8.e, a8.f, true);
        canvas.restore();
    }

    @Override
    void d(Canvas canvas, Paint paint, float f8, float f9, int n8, int n9, int n10) {
        n8 = ax.z6.a.a(n8, n9);
        this.n = false;
        this.m(canvas, paint, f8, f9, n8, n10, n10, 0.0f, 0.0f, false);
    }

    @Override
    int e() {
        return this.p();
    }

    @Override
    int f() {
        return this.p();
    }

    @Override
    void g() {
        this.b.rewind();
        this.b.moveTo(1.0f, 0.0f);
        for (int i8 = 0; i8 < 2; ++i8) {
            this.b.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            this.b.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            this.b.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            this.b.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
        }
        this.e.reset();
        Matrix matrix = this.e;
        float f8 = this.i;
        matrix.setScale(f8, f8);
        this.b.transform(this.e);
        if (((f)this.a).b(this.n)) {
            this.d.setPath(this.b, false);
            this.l(this.d, this.b, this.k);
        }
        this.d.setPath(this.b, false);
    }
}

