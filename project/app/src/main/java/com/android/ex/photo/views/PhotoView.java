/*
 * Decompiled with CFR 0.152.
 */
package com.android.ex.photo.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import ax.c0.N;
import ax.c0.s;
import com.android.ex.photo.h;
import com.android.ex.photo.i;

public class PhotoView
extends View
implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener,
ScaleGestureDetector.OnScaleGestureListener {
    private static int K;
    private static boolean L;
    private static int M;
    private static Bitmap N;
    private static Bitmap O;
    private static Paint P;
    private static Paint Q;
    private b A;
    private float B;
    private RectF C;
    private RectF D;
    private RectF E;
    private float[] F;
    private boolean G;
    private float H;
    private float I;
    private boolean J;
    private Drawable a;
    private Matrix b;
    private Matrix c = new Matrix();
    private Matrix d = new Matrix();
    private int e = -1;
    private boolean f;
    private boolean g;
    private byte[] h;
    private boolean i;
    private boolean j;
    private Rect k = new Rect();
    private int l;
    private float m;
    private s n;
    private ScaleGestureDetector o;
    private View.OnClickListener p;
    private a q;
    private boolean r;
    private boolean s = true;
    private boolean t;
    private boolean u;
    private c v;
    private float w;
    private float x;
    private e y;
    private d z;

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = new RectF();
        this.D = new RectF();
        this.E = new RectF();
        this.F = new float[9];
        this.n();
    }

    private int getCropSize() {
        int n8 = this.l;
        if (n8 > 0) {
            return n8;
        }
        return M;
    }

    private float getScale() {
        this.c.getValues(this.F);
        return this.F[0];
    }

    private void h(boolean bl) {
        Drawable drawable = this.a;
        if (drawable != null && this.f) {
            int n8 = drawable.getIntrinsicWidth();
            int n9 = this.a.getIntrinsicHeight();
            int n10 = this.getWidth();
            int n11 = this.getHeight();
            n10 = n8 >= 0 && n10 != n8 || n9 >= 0 && n11 != n9 ? 0 : 1;
            this.a.setBounds(0, 0, n8, n9);
            if (bl || this.w == 0.0f && this.a != null && this.f) {
                this.k();
                this.l();
            }
            this.b = n10 == 0 && !this.c.isIdentity() ? this.c : null;
            this.i();
        }
    }

    private void i() {
        a a8 = this.q;
        if (a8 != null) {
            a8.a();
        }
    }

    private void k() {
        int n8 = this.a.getIntrinsicWidth();
        int n9 = this.a.getIntrinsicHeight();
        int n10 = this.j ? M : this.getWidth();
        int n11 = this.j ? M : this.getHeight();
        if (!(n8 >= 0 && n10 != n8 || n9 >= 0 && n11 != n9 || this.j)) {
            this.c.reset();
        } else {
            RectF rectF = this.C;
            float f8 = n8;
            float f9 = n9;
            rectF.set(0.0f, 0.0f, f8, f9);
            if (this.j) {
                this.D.set(this.k);
            } else {
                this.D.set(0.0f, 0.0f, (float)n10, (float)n11);
            }
            float f10 = n10 / 2;
            float f11 = this.m;
            float f12 = f8 * f11 / 2.0f;
            float f13 = n11 / 2;
            rectF = new RectF(f10 - f12, f13 - f9 * f11 / 2.0f, f10 + f8 * f11 / 2.0f, f13 + f9 * f11 / 2.0f);
            if (this.D.contains(rectF)) {
                this.c.setRectToRect(this.C, rectF, Matrix.ScaleToFit.CENTER);
            } else {
                this.c.setRectToRect(this.C, this.D, Matrix.ScaleToFit.CENTER);
            }
        }
        this.d.set(this.c);
    }

    private void l() {
        int n8 = this.a.getIntrinsicWidth();
        int n9 = this.a.getIntrinsicHeight();
        int n10 = this.j ? this.getCropSize() : this.getWidth();
        int n11 = this.j ? this.getCropSize() : this.getHeight();
        this.w = n8 < n10 && n9 < n11 && !this.j ? 1.0f : this.getScale();
        this.x = Math.max(this.w * 4.0f, 4.0f);
    }

    private float m(Matrix object) {
        object.getValues(this.F);
        object = this.F;
        return (float)Math.hypot((double)object[0], (double)object[3]);
    }

    private void n() {
        Context context = this.getContext();
        if (!L) {
            Paint paint;
            L = true;
            Resources resources = context.getApplicationContext().getResources();
            M = resources.getDimensionPixelSize(com.android.ex.photo.i.b);
            P = paint = new Paint();
            paint.setAntiAlias(true);
            P.setColor(resources.getColor(com.android.ex.photo.h.a));
            P.setStyle(Paint.Style.FILL);
            Q = paint = new Paint();
            paint.setAntiAlias(true);
            Q.setColor(resources.getColor(com.android.ex.photo.h.b));
            Q.setStyle(Paint.Style.STROKE);
            Q.setStrokeWidth(resources.getDimension(com.android.ex.photo.i.a));
            int n8 = ViewConfiguration.get((Context)context).getScaledTouchSlop();
            K = n8 * n8;
        }
        this.n = new s(context, this, null);
        context = new ScaleGestureDetector(context, (ScaleGestureDetector.OnScaleGestureListener)this);
        this.o = context;
        this.J = ax.c0.N.a((ScaleGestureDetector)context);
        this.v = new c(this);
        this.y = new e(this);
        this.z = new d(this);
        this.A = new b(this);
    }

    private void s(float f8, boolean bl) {
        if (bl) {
            this.A.a(f8);
            return;
        }
        this.B += f8;
        this.c.postRotate(f8, (float)(this.getWidth() / 2), (float)(this.getHeight() / 2));
        this.invalidate();
    }

    private void t(float f8, float f9, float f10) {
        this.c.postRotate(-this.B, (float)(this.getWidth() / 2), (float)(this.getHeight() / 2));
        f8 = Math.min(Math.max(f8, this.w), this.x * 1.5f) / this.getScale();
        this.c.postScale(f8, f8, f9, f10);
        this.c.postRotate(this.B, (float)(this.getWidth() / 2), (float)(this.getHeight() / 2));
        this.invalidate();
        this.i();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean u(MotionEvent motionEvent) {
        boolean bl;
        if (this.s && this.r && this.G) {
            if (!this.t) {
                float f8;
                float f9;
                float f10;
                float f11 = this.getScale();
                if (f11 > (f10 = this.w)) {
                    float f12 = f10 / f11;
                    float f13 = this.getWidth() / 2;
                    f9 = this.E.centerX();
                    f8 = 1.0f - f12;
                    f9 = (f13 - f9 * f12) / f8;
                    f8 = ((float)(this.getHeight() / 2) - f12 * this.E.centerY()) / f8;
                } else {
                    f8 = Math.max(f10, f11 * 2.0f);
                    float f14 = Math.min(this.x, f8);
                    f8 = f14 / f11;
                    f10 = ((float)this.getWidth() - this.E.width()) / f8;
                    f8 = ((float)this.getHeight() - this.E.height()) / f8;
                    f10 = this.E.width() <= f10 * 2.0f ? this.E.centerX() : Math.min(Math.max(this.E.left + f10, motionEvent.getX()), this.E.right - f10);
                    f8 = this.E.height() <= 2.0f * f8 ? this.E.centerY() : Math.min(Math.max(this.E.top + f8, motionEvent.getY()), this.E.bottom - f8);
                    f9 = f10;
                    f10 = f14;
                }
                this.v.b(f11, f10, f9, f8);
                bl = true;
            } else {
                bl = false;
            }
            this.t = false;
        } else {
            bl = false;
        }
        this.G = false;
        return bl;
    }

    private void v(float f8) {
        float f9 = this.x;
        if (f8 > f9) {
            float f10 = 1.0f / (1.0f - f9 / f8);
            float f11 = 1.0f - f10;
            f9 = this.getWidth() / 2;
            float f12 = this.getHeight() / 2;
            RectF rectF = this.E;
            float f13 = rectF.left * f11;
            float f14 = rectF.top * f11;
            float f15 = (float)this.getWidth() * f10 + this.E.right * f11;
            f10 = (float)this.getHeight() * f10 + this.E.bottom * f11;
            f9 = f15 > f13 ? (f15 + f13) / 2.0f : Math.min(Math.max(f15, f9), f13);
            f14 = f10 > f14 ? (f10 + f14) / 2.0f : Math.min(Math.max(f10, f12), f14);
            this.v.b(f8, this.x, f9, f14);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void x() {
        this.E.set(this.C);
        this.c.mapRect(this.E);
        boolean bl = this.j;
        float f8 = 0.0f;
        float f9 = bl ? (float)this.k.left : 0.0f;
        int n8 = bl ? this.k.right : this.getWidth();
        float f10 = n8;
        RectF rectF = this.E;
        float f11 = rectF.left;
        float f12 = rectF.right;
        float f13 = f10 - f9;
        f9 = f12 - f11 < f13 ? (f9 += (f13 - (f12 + f11)) / 2.0f) : (f11 > f9 ? (f9 -= f11) : (f12 < f10 ? f10 - f12 : 0.0f));
        bl = this.j;
        f10 = bl ? (float)this.k.top : 0.0f;
        n8 = bl ? this.k.bottom : this.getHeight();
        f11 = n8;
        rectF = this.E;
        float f14 = rectF.top;
        f12 = rectF.bottom;
        f13 = f11 - f10;
        if (f12 - f14 < f13) {
            f10 += (f13 - (f12 + f14)) / 2.0f;
        } else if (f14 > f10) {
            f10 -= f14;
        } else {
            f10 = f8;
            if (f12 < f11) {
                f10 = f11 - f12;
            }
        }
        if (!(Math.abs(f9) > 20.0f) && !(Math.abs(f10) > 20.0f)) {
            this.c.postTranslate(f9, f10);
            this.invalidate();
            return;
        }
        this.z.a(f9, f10);
    }

    /*
     * Enabled aggressive block sorting
     */
    private int y(float f8, float f9) {
        float f10;
        this.E.set(this.C);
        this.c.mapRect(this.E);
        boolean bl = this.j;
        float f11 = 0.0f;
        float f12 = bl ? (float)this.k.left : 0.0f;
        int n8 = bl ? this.k.right : this.getWidth();
        float f13 = n8;
        RectF rectF = this.E;
        float f14 = rectF.left;
        float f15 = rectF.right;
        f12 = this.j ? Math.max(f12 - f15, Math.min(f13 - f14, f8)) : (f15 - f14 < (f10 = f13 - f12) ? (f12 += (f10 - (f15 + f14)) / 2.0f) : Math.max(f13 - f15, Math.min(f12 - f14, f8)));
        bl = this.j;
        if (bl) {
            f11 = this.k.top;
        }
        n8 = bl ? this.k.bottom : this.getHeight();
        f15 = n8;
        rectF = this.E;
        f10 = rectF.top;
        f13 = rectF.bottom;
        f11 = this.j ? Math.max(f11 - f13, Math.min(f15 - f10, f9)) : (f13 - f10 < (f14 = f15 - f11) ? (f11 += (f14 - (f13 + f10)) / 2.0f) : Math.max(f15 - f13, Math.min(f11 - f10, f9)));
        this.c.postTranslate(f12, f11);
        this.invalidate();
        n8 = f12 == f8 ? 1 : 0;
        boolean bl2 = f11 == f9;
        if (n8 != 0 && bl2) {
            return 3;
        }
        if (n8 != 0) {
            return 1;
        }
        if (bl2) {
            return 2;
        }
        return 0;
    }

    public void e(Drawable drawable) {
        boolean bl;
        Drawable drawable2;
        if (drawable != null && drawable != (drawable2 = this.a)) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.a = drawable;
            this.w = 0.0f;
            drawable.setCallback((Drawable.Callback)this);
            bl = true;
        } else {
            bl = false;
        }
        this.h(bl);
        this.invalidate();
    }

    public void f(Bitmap bitmap) {
        boolean bl;
        Drawable drawable = this.a;
        boolean bl2 = drawable instanceof BitmapDrawable;
        boolean bl3 = bl = bl2 ^ true;
        if (drawable != null) {
            bl3 = bl;
            if (bl2) {
                if (bitmap == ((BitmapDrawable)drawable).getBitmap()) {
                    return;
                }
                bl3 = bitmap != null && (this.a.getIntrinsicWidth() != bitmap.getWidth() || this.a.getIntrinsicHeight() != bitmap.getHeight());
                this.w = 0.0f;
                this.a = null;
            }
        }
        if (this.a == null && bitmap != null) {
            this.a = new BitmapDrawable(this.getResources(), bitmap);
        }
        this.h(bl3);
        this.invalidate();
    }

    public void g() {
        this.n = null;
        this.o = null;
        this.a = null;
        this.v.c();
        this.v = null;
        this.y.c();
        this.y = null;
        this.z.b();
        this.z = null;
        this.A.b();
        this.A = null;
        this.setOnClickListener(null);
        this.p = null;
        this.q = null;
        this.G = false;
    }

    public Bitmap getCroppedPhoto() {
        if (!this.j) {
            return null;
        }
        Bitmap bitmap = Bitmap.createBitmap((int)256, (int)256, (Bitmap.Config)Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        Rect rect = this.k;
        float f8 = 256.0f / (float)(rect.right - rect.left);
        rect = new Matrix(this.b);
        Rect rect2 = this.k;
        rect.postTranslate((float)(-rect2.left), (float)(-rect2.top));
        rect.postScale(f8, f8);
        if (this.a != null) {
            canvas.concat((Matrix)rect);
            this.a.draw(canvas);
        }
        return bitmap;
    }

    public float getCurrentScale() {
        return this.m(this.c);
    }

    public Drawable getDrawable() {
        return this.a;
    }

    public float getInitialScale() {
        return this.m(this.d);
    }

    public float getMinScale() {
        return this.w;
    }

    public Bitmap getPhoto() {
        Drawable drawable = this.a;
        if (drawable != null && drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable)drawable).getBitmap();
        }
        return null;
    }

    public byte[] getVideoData() {
        return this.h;
    }

    public void invalidateDrawable(Drawable drawable) {
        if (this.a == drawable) {
            this.invalidate();
            return;
        }
        super.invalidateDrawable(drawable);
    }

    public void j(boolean bl) {
        this.r = bl;
        if (!bl) {
            this.r();
        }
    }

    public boolean o(float f8, float f9) {
        if (!this.r) {
            return false;
        }
        if (this.y.h0) {
            return true;
        }
        this.c.getValues(this.F);
        this.E.set(this.C);
        this.c.mapRect(this.E);
        f9 = this.getWidth();
        float f10 = this.F[2];
        RectF rectF = this.E;
        f8 = rectF.right;
        float f11 = rectF.left;
        if (this.r && !(f8 - f11 <= f9)) {
            return f10 != 0.0f;
        }
        return false;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        this.G = true;
        if (!this.J) {
            return this.u(motionEvent);
        }
        return false;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        int n8 = motionEvent.getAction();
        if (n8 != 0) {
            if (n8 != 1) {
                int n9;
                if (n8 == 2 && this.J && this.G && (n8 = (int)(motionEvent.getX() - this.H)) * n8 + (n9 = (int)(motionEvent.getY() - this.I)) * n9 > K) {
                    this.G = false;
                    return false;
                }
            } else if (this.J) {
                return this.u(motionEvent);
            }
        } else if (this.J) {
            this.H = motionEvent.getX();
            this.I = motionEvent.getY();
        }
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        if (this.r) {
            this.y.c();
            this.z.b();
        }
        return true;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.a;
        if (!(drawable == null || drawable instanceof ax.p.c && (drawable = ((ax.p.c)drawable).a()) instanceof BitmapDrawable && ((BitmapDrawable)drawable).getBitmap() == null)) {
            int n8 = canvas.getSaveCount();
            canvas.save();
            drawable = this.b;
            if (drawable != null) {
                canvas.concat((Matrix)drawable);
            }
            drawable = ax.C3.e.b(20);
            Drawable drawable2 = this.a;
            if (drawable2 != null) {
                canvas.drawRect(0.0f, 0.0f, (float)drawable2.getBounds().width(), (float)this.a.getBounds().height(), (Paint)drawable);
            }
            try {
                this.a.draw(canvas);
            }
            catch (RuntimeException runtimeException) {
                // empty catch block
            }
            canvas.restoreToCount(n8);
            if (this.h != null) {
                drawable = this.i ? N : O;
                int n9 = (this.getWidth() - drawable.getWidth()) / 2;
                n8 = (this.getHeight() - drawable.getHeight()) / 2;
                canvas.drawBitmap((Bitmap)drawable, (float)n9, (float)n8, null);
            }
            this.E.set(this.a.getBounds());
            drawable = this.b;
            if (drawable != null) {
                drawable.mapRect(this.E);
            }
            if (this.j) {
                n8 = canvas.getSaveCount();
                canvas.drawRect(0.0f, 0.0f, (float)this.getWidth(), (float)this.getHeight(), P);
                canvas.save();
                canvas.clipRect(this.k);
                drawable = this.b;
                if (drawable != null) {
                    canvas.concat((Matrix)drawable);
                }
                this.a.draw(canvas);
                canvas.restoreToCount(n8);
                canvas.drawRect(this.k, Q);
            }
        }
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
        if (this.r && !this.v.j0) {
            this.y.b(f8, f9);
        }
        return true;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8) {
            float f8 = this.getScale();
            if (motionEvent.getAxisValue(9) < 0.0f) {
                float f9 = this.w;
                if (f8 > f9) {
                    this.t(Math.max(f9, f8 - 0.15f), motionEvent.getX(), motionEvent.getY());
                    this.x();
                }
            } else {
                float f10 = this.x;
                if (f8 < f10) {
                    this.t(Math.min(f10, f8 + 0.15f), motionEvent.getX(), motionEvent.getY());
                }
            }
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        super.onLayout(bl, n8, n9, n10, n11);
        this.f = true;
        n9 = this.getWidth();
        n10 = this.getHeight();
        if (this.j) {
            this.l = n8 = Math.min(M, Math.min(n9, n10));
            n9 = (n9 - n8) / 2;
            n10 = (n10 - n8) / 2;
            this.k.set(n9, n10, n9 + n8, n8 + n10);
        }
        this.h(bl);
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    protected void onMeasure(int n8, int n9) {
        int n10 = this.e;
        if (n10 != -1) {
            super.onMeasure(n8, View.MeasureSpec.makeMeasureSpec((int)n10, (int)Integer.MIN_VALUE));
            this.setMeasuredDimension(this.getMeasuredWidth(), this.e);
            return;
        }
        super.onMeasure(n8, n9);
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.r) {
            this.u = false;
            this.t(this.getScale() * scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        }
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (this.r) {
            this.v.c();
            this.u = true;
        }
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        float f8 = this.getScale();
        if (f8 > this.x) {
            this.v(f8);
        }
        if (this.r && this.u) {
            this.t = true;
            this.r();
        }
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
        if (this.r && !this.v.j0) {
            this.y(-f8, -f9);
        }
        return true;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        motionEvent = this.p;
        if (motionEvent != null && !this.u) {
            motionEvent.onClick((View)this);
        }
        this.u = false;
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ScaleGestureDetector scaleGestureDetector = this.o;
        if (scaleGestureDetector != null && this.n != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
            this.n.a(motionEvent);
            int n8 = motionEvent.getAction();
            if (!(n8 != 1 && n8 != 3 || this.y.h0)) {
                this.x();
            }
        }
        return true;
    }

    public boolean p(float f8, float f9) {
        if (!this.r) {
            return false;
        }
        if (this.y.h0) {
            return true;
        }
        this.c.getValues(this.F);
        this.E.set(this.C);
        this.c.mapRect(this.E);
        f9 = this.getWidth();
        f8 = this.F[2];
        RectF rectF = this.E;
        float f10 = rectF.right - rectF.left;
        if (this.r && !(f10 <= f9)) {
            if (f8 == 0.0f) {
                return true;
            }
            return !(f9 >= f10 + f8);
        }
        return false;
    }

    public boolean q() {
        return this.a != null;
    }

    public void r() {
        this.c.set(this.d);
        this.invalidate();
        this.i();
    }

    public void setFixedHeight(int n8) {
        boolean bl = n8 != this.e;
        this.e = n8;
        this.setMeasuredDimension(this.getMeasuredWidth(), this.e);
        if (bl) {
            this.h(true);
            this.requestLayout();
        }
    }

    public void setMaxInitialScale(float f8) {
        this.m = f8;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.p = onClickListener;
    }

    public void setOnScaleChangedListener(a a8) {
        this.q = a8;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return this.a == drawable || super.verifyDrawable(drawable);
        {
        }
    }

    public void w(boolean bl, boolean bl2) {
        if (bl != this.g) {
            this.g = bl;
            this.requestLayout();
            this.invalidate();
        }
    }

    public static interface a {
        public void a();
    }

    private static class b
    implements Runnable {
        private float c0;
        private float d0;
        private float e0;
        private long f0;
        private boolean g0;
        private boolean h0;
        private final PhotoView q;

        public b(PhotoView photoView) {
            this.q = photoView;
        }

        public void a(float f8) {
            if (this.g0) {
                return;
            }
            this.c0 = f8;
            this.e0 = f8 / 500.0f;
            this.d0 = 0.0f;
            this.f0 = -1L;
            this.h0 = false;
            this.g0 = true;
            this.q.post(this);
        }

        public void b() {
            this.g0 = false;
            this.h0 = true;
        }

        @Override
        public void run() {
            block11: {
                block7: {
                    block8: {
                        float f8;
                        long l8;
                        block10: {
                            float f9;
                            float f10;
                            block9: {
                                if (this.h0) break block7;
                                if (this.d0 == this.c0) break block8;
                                l8 = System.currentTimeMillis();
                                long l9 = this.f0;
                                l9 = l9 != -1L ? l8 - l9 : 0L;
                                float f11 = this.e0 * (float)l9;
                                f10 = this.d0;
                                f9 = this.c0;
                                if (f10 < f9 && f10 + f11 > f9) break block9;
                                f8 = f11;
                                if (!(f10 > f9)) break block10;
                                f8 = f11;
                                if (!(f10 + f11 < f9)) break block10;
                            }
                            f8 = f9 - f10;
                        }
                        this.q.s(f8, false);
                        this.d0 = f8 = this.d0 + f8;
                        if (f8 == this.c0) {
                            this.b();
                        }
                        this.f0 = l8;
                    }
                    if (!this.h0) break block11;
                }
                return;
            }
            this.q.post(this);
        }
    }

    private static class c
    implements Runnable {
        private float c0;
        private float d0;
        private boolean e0;
        private float f0;
        private float g0;
        private float h0;
        private long i0;
        private boolean j0;
        private boolean k0;
        private final PhotoView q;

        public c(PhotoView photoView) {
            this.q = photoView;
        }

        public boolean b(float f8, float f9, float f10, float f11) {
            if (this.j0) {
                return false;
            }
            this.c0 = f10;
            this.d0 = f11;
            this.f0 = f9;
            this.i0 = System.currentTimeMillis();
            this.g0 = f8;
            f9 = this.f0;
            boolean bl = f9 > f8;
            this.e0 = bl;
            this.h0 = (f9 - f8) / 200.0f;
            this.j0 = true;
            this.k0 = false;
            this.q.post(this);
            return true;
        }

        public void c() {
            this.j0 = false;
            this.k0 = true;
        }

        @Override
        public void run() {
            if (!this.k0) {
                boolean bl;
                boolean bl2;
                long l8 = System.currentTimeMillis();
                long l9 = this.i0;
                float f8 = this.g0 + this.h0 * (float)(l8 - l9);
                this.q.t(f8, this.c0, this.d0);
                float f9 = this.f0;
                if (f8 == f9 || (bl2 = this.e0) == (bl = f8 > f9)) {
                    this.q.t(f9, this.c0, this.d0);
                    this.c();
                }
                if (!this.k0) {
                    this.q.post(this);
                }
            }
        }
    }

    private static class d
    implements Runnable {
        private float c0;
        private float d0;
        private long e0 = -1L;
        private boolean f0;
        private boolean g0;
        private final PhotoView q;

        public d(PhotoView photoView) {
            this.q = photoView;
        }

        public boolean a(float f8, float f9) {
            if (this.f0) {
                return false;
            }
            this.e0 = -1L;
            this.c0 = f8;
            this.d0 = f9;
            this.g0 = false;
            this.f0 = true;
            this.q.postDelayed(this, 250L);
            return true;
        }

        public void b() {
            this.f0 = false;
            this.g0 = true;
        }

        @Override
        public void run() {
            block17: {
                block11: {
                    float f8;
                    float f9;
                    block13: {
                        block16: {
                            float f10;
                            block15: {
                                block14: {
                                    block12: {
                                        if (this.g0) break block11;
                                        long l8 = System.currentTimeMillis();
                                        long l9 = this.e0;
                                        f9 = l9 != -1L ? (float)(l8 - l9) : 0.0f;
                                        if (l9 == -1L) {
                                            this.e0 = l8;
                                        }
                                        if (!(f9 >= 100.0f)) break block12;
                                        f9 = this.c0;
                                        f8 = this.d0;
                                        break block13;
                                    }
                                    f8 = this.c0;
                                    f9 = 100.0f - f9;
                                    f8 = f8 / f9 * 10.0f;
                                    f10 = this.d0 / f9 * 10.0f;
                                    if (Math.abs(f8) > Math.abs(this.c0)) break block14;
                                    f9 = f8;
                                    if (!Float.isNaN(f8)) break block15;
                                }
                                f9 = this.c0;
                            }
                            if (Math.abs(f10) > Math.abs(this.d0)) break block16;
                            f8 = f10;
                            if (!Float.isNaN(f10)) break block13;
                        }
                        f8 = this.d0;
                    }
                    this.q.y(f9, f8);
                    this.c0 = f9 = this.c0 - f9;
                    this.d0 = f8 = this.d0 - f8;
                    if (f9 == 0.0f && f8 == 0.0f) {
                        this.b();
                    }
                    if (!this.g0) break block17;
                }
                return;
            }
            this.q.post(this);
        }
    }

    private static class e
    implements Runnable {
        private float c0;
        private float d0;
        private float e0;
        private float f0;
        private long g0 = -1L;
        private boolean h0;
        private boolean i0;
        private final PhotoView q;

        public e(PhotoView photoView) {
            this.q = photoView;
        }

        public boolean b(float f8, float f9) {
            if (this.h0) {
                return false;
            }
            this.g0 = -1L;
            this.c0 = f8;
            this.d0 = f9;
            double d8 = (float)Math.atan2(f9, f8);
            this.e0 = (float)(Math.cos(d8) * 1000.0);
            this.f0 = (float)(Math.sin(d8) * 1000.0);
            this.i0 = false;
            this.h0 = true;
            this.q.post(this);
            return true;
        }

        public void c() {
            this.h0 = false;
            this.i0 = true;
        }

        @Override
        public void run() {
            block11: {
                block10: {
                    if (this.i0) break block10;
                    long l8 = System.currentTimeMillis();
                    long l9 = this.g0;
                    float f8 = 1000.0f;
                    float f9 = l9 != -1L ? (float)(l8 - l9) / 1000.0f : 0.0f;
                    int n8 = this.q.y(this.c0 * f9, this.d0 * f9);
                    this.g0 = l8;
                    float f10 = this.e0 * f9;
                    this.c0 = Math.abs(this.c0) > Math.abs(f10) ? (this.c0 -= f10) : 0.0f;
                    f9 = this.f0 * f9;
                    this.d0 = Math.abs(this.d0) > Math.abs(f9) ? (this.d0 -= f9) : 0.0f;
                    f9 = this.c0;
                    if (f9 == 0.0f && this.d0 == 0.0f || n8 == 0) {
                        this.c();
                        this.q.x();
                    } else if (n8 == 1) {
                        if (!(f9 > 0.0f)) {
                            f8 = -1000.0f;
                        }
                        this.e0 = f8;
                        this.f0 = 0.0f;
                        this.d0 = 0.0f;
                    } else if (n8 == 2) {
                        this.e0 = 0.0f;
                        if (!(this.d0 > 0.0f)) {
                            f8 = -1000.0f;
                        }
                        this.f0 = f8;
                        this.c0 = 0.0f;
                    }
                    if (!this.i0) break block11;
                }
                return;
            }
            this.q.post(this);
        }
    }
}

