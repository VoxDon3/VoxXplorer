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
import ax.c0.C1788s;
import ax.c0.N;
import ax.p.C2747c;
import com.android.ex.photo.h;
import com.android.ex.photo.i;

/* loaded from: classes.dex */
public class PhotoView extends View implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
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
    private Matrix c;
    private Matrix d;
    private int e;
    private boolean f;
    private boolean g;
    private byte[] h;
    private boolean i;
    private boolean j;
    private Rect k;
    private int l;
    private float m;
    private C1788s n;
    private ScaleGestureDetector o;
    private View.OnClickListener p;
    private a q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private c v;
    private float w;
    private float x;
    private e y;
    private d z;

    public interface a {
        void a();
    }

    private static class b implements Runnable {
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

        public void a(float f) {
            if (this.g0) {
                return;
            }
            this.c0 = f;
            this.e0 = f / 500.0f;
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

        @Override // java.lang.Runnable
        public void run() {
            if (this.h0) {
                return;
            }
            if (this.d0 != this.c0) {
                long currentTimeMillis = System.currentTimeMillis();
                float f = this.e0 * (this.f0 != -1 ? currentTimeMillis - r2 : 0L);
                float f2 = this.d0;
                float f3 = this.c0;
                if ((f2 < f3 && f2 + f > f3) || (f2 > f3 && f2 + f < f3)) {
                    f = f3 - f2;
                }
                this.q.s(f, false);
                float f4 = this.d0 + f;
                this.d0 = f4;
                if (f4 == this.c0) {
                    b();
                }
                this.f0 = currentTimeMillis;
            }
            if (this.h0) {
                return;
            }
            this.q.post(this);
        }
    }

    private static class c implements Runnable {
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

        public boolean b(float f, float f2, float f3, float f4) {
            if (this.j0) {
                return false;
            }
            this.c0 = f3;
            this.d0 = f4;
            this.f0 = f2;
            this.i0 = System.currentTimeMillis();
            this.g0 = f;
            float f5 = this.f0;
            this.e0 = f5 > f;
            this.h0 = (f5 - f) / 200.0f;
            this.j0 = true;
            this.k0 = false;
            this.q.post(this);
            return true;
        }

        public void c() {
            this.j0 = false;
            this.k0 = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
        
            if (r4.e0 == (r2 > r0)) goto L12;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r4 = this;
                boolean r0 = r4.k0
                if (r0 == 0) goto L5
                goto L43
            L5:
                long r0 = java.lang.System.currentTimeMillis()
                long r2 = r4.i0
                long r0 = r0 - r2
                float r2 = r4.g0
                float r3 = r4.h0
                float r0 = (float) r0
                float r3 = r3 * r0
                float r2 = r2 + r3
                com.android.ex.photo.views.PhotoView r0 = r4.q
                float r1 = r4.c0
                float r3 = r4.d0
                com.android.ex.photo.views.PhotoView.a(r0, r2, r1, r3)
                float r0 = r4.f0
                int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r1 == 0) goto L2e
                boolean r1 = r4.e0
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 <= 0) goto L2b
                r2 = 1
                goto L2c
            L2b:
                r2 = 0
            L2c:
                if (r1 != r2) goto L3a
            L2e:
                com.android.ex.photo.views.PhotoView r1 = r4.q
                float r2 = r4.c0
                float r3 = r4.d0
                com.android.ex.photo.views.PhotoView.a(r1, r0, r2, r3)
                r4.c()
            L3a:
                boolean r0 = r4.k0
                if (r0 != 0) goto L43
                com.android.ex.photo.views.PhotoView r0 = r4.q
                r0.post(r4)
            L43:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.ex.photo.views.PhotoView.c.run():void");
        }
    }

    private static class d implements Runnable {
        private float c0;
        private float d0;
        private long e0 = -1;
        private boolean f0;
        private boolean g0;
        private final PhotoView q;

        public d(PhotoView photoView) {
            this.q = photoView;
        }

        public boolean a(float f, float f2) {
            if (this.f0) {
                return false;
            }
            this.e0 = -1L;
            this.c0 = f;
            this.d0 = f2;
            this.g0 = false;
            this.f0 = true;
            this.q.postDelayed(this, 250L);
            return true;
        }

        public void b() {
            this.f0 = false;
            this.g0 = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            float f;
            float f2;
            if (this.g0) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.e0;
            float f3 = j != -1 ? currentTimeMillis - j : 0.0f;
            if (j == -1) {
                this.e0 = currentTimeMillis;
            }
            if (f3 >= 100.0f) {
                f2 = this.c0;
                f = this.d0;
            } else {
                float f4 = 100.0f - f3;
                float f5 = (this.c0 / f4) * 10.0f;
                float f6 = (this.d0 / f4) * 10.0f;
                if (Math.abs(f5) > Math.abs(this.c0) || Float.isNaN(f5)) {
                    f5 = this.c0;
                }
                if (Math.abs(f6) > Math.abs(this.d0) || Float.isNaN(f6)) {
                    f6 = this.d0;
                }
                float f7 = f5;
                f = f6;
                f2 = f7;
            }
            this.q.y(f2, f);
            float f8 = this.c0 - f2;
            this.c0 = f8;
            float f9 = this.d0 - f;
            this.d0 = f9;
            if (f8 == 0.0f && f9 == 0.0f) {
                b();
            }
            if (this.g0) {
                return;
            }
            this.q.post(this);
        }
    }

    private static class e implements Runnable {
        private float c0;
        private float d0;
        private float e0;
        private float f0;
        private long g0 = -1;
        private boolean h0;
        private boolean i0;
        private final PhotoView q;

        public e(PhotoView photoView) {
            this.q = photoView;
        }

        public boolean b(float f, float f2) {
            if (this.h0) {
                return false;
            }
            this.g0 = -1L;
            this.c0 = f;
            this.d0 = f2;
            double atan2 = (float) Math.atan2(f2, f);
            this.e0 = (float) (Math.cos(atan2) * 1000.0d);
            this.f0 = (float) (Math.sin(atan2) * 1000.0d);
            this.i0 = false;
            this.h0 = true;
            this.q.post(this);
            return true;
        }

        public void c() {
            this.h0 = false;
            this.i0 = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.i0) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            float f = this.g0 != -1 ? (currentTimeMillis - r2) / 1000.0f : 0.0f;
            int y = this.q.y(this.c0 * f, this.d0 * f);
            this.g0 = currentTimeMillis;
            float f2 = this.e0 * f;
            if (Math.abs(this.c0) > Math.abs(f2)) {
                this.c0 -= f2;
            } else {
                this.c0 = 0.0f;
            }
            float f3 = this.f0 * f;
            if (Math.abs(this.d0) > Math.abs(f3)) {
                this.d0 -= f3;
            } else {
                this.d0 = 0.0f;
            }
            float f4 = this.c0;
            if ((f4 == 0.0f && this.d0 == 0.0f) || y == 0) {
                c();
                this.q.x();
            } else if (y == 1) {
                this.e0 = f4 <= 0.0f ? -1000.0f : 1000.0f;
                this.f0 = 0.0f;
                this.d0 = 0.0f;
            } else if (y == 2) {
                this.e0 = 0.0f;
                this.f0 = this.d0 <= 0.0f ? -1000.0f : 1000.0f;
                this.c0 = 0.0f;
            }
            if (this.i0) {
                return;
            }
            this.q.post(this);
        }
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Matrix();
        this.d = new Matrix();
        this.e = -1;
        this.k = new Rect();
        this.s = true;
        this.C = new RectF();
        this.D = new RectF();
        this.E = new RectF();
        this.F = new float[9];
        n();
    }

    private int getCropSize() {
        int i = this.l;
        return i > 0 ? i : M;
    }

    private float getScale() {
        this.c.getValues(this.F);
        return this.F[0];
    }

    private void h(boolean z) {
        Drawable drawable = this.a;
        if (drawable == null || !this.f) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = this.a.getIntrinsicHeight();
        boolean z2 = (intrinsicWidth < 0 || getWidth() == intrinsicWidth) && (intrinsicHeight < 0 || getHeight() == intrinsicHeight);
        this.a.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        if (z || (this.w == 0.0f && this.a != null && this.f)) {
            k();
            l();
        }
        if (z2 || this.c.isIdentity()) {
            this.b = null;
        } else {
            this.b = this.c;
        }
        i();
    }

    private void i() {
        a aVar = this.q;
        if (aVar != null) {
            aVar.a();
        }
    }

    private void k() {
        int intrinsicWidth = this.a.getIntrinsicWidth();
        int intrinsicHeight = this.a.getIntrinsicHeight();
        int width = this.j ? M : getWidth();
        int height = this.j ? M : getHeight();
        if ((intrinsicWidth < 0 || width == intrinsicWidth) && ((intrinsicHeight < 0 || height == intrinsicHeight) && !this.j)) {
            this.c.reset();
        } else {
            float f = intrinsicWidth;
            float f2 = intrinsicHeight;
            this.C.set(0.0f, 0.0f, f, f2);
            if (this.j) {
                this.D.set(this.k);
            } else {
                this.D.set(0.0f, 0.0f, width, height);
            }
            float f3 = width / 2;
            float f4 = this.m;
            float f5 = height / 2;
            RectF rectF = new RectF(f3 - ((f * f4) / 2.0f), f5 - ((f2 * f4) / 2.0f), f3 + ((f * f4) / 2.0f), f5 + ((f2 * f4) / 2.0f));
            if (this.D.contains(rectF)) {
                this.c.setRectToRect(this.C, rectF, Matrix.ScaleToFit.CENTER);
            } else {
                this.c.setRectToRect(this.C, this.D, Matrix.ScaleToFit.CENTER);
            }
        }
        this.d.set(this.c);
    }

    private void l() {
        int intrinsicWidth = this.a.getIntrinsicWidth();
        int intrinsicHeight = this.a.getIntrinsicHeight();
        int cropSize = this.j ? getCropSize() : getWidth();
        int cropSize2 = this.j ? getCropSize() : getHeight();
        if (intrinsicWidth >= cropSize || intrinsicHeight >= cropSize2 || this.j) {
            this.w = getScale();
        } else {
            this.w = 1.0f;
        }
        this.x = Math.max(this.w * 4.0f, 4.0f);
    }

    private float m(Matrix matrix) {
        matrix.getValues(this.F);
        float[] fArr = this.F;
        return (float) Math.hypot(fArr[0], fArr[3]);
    }

    private void n() {
        Context context = getContext();
        if (!L) {
            L = true;
            Resources resources = context.getApplicationContext().getResources();
            M = resources.getDimensionPixelSize(i.b);
            Paint paint = new Paint();
            P = paint;
            paint.setAntiAlias(true);
            P.setColor(resources.getColor(h.a));
            P.setStyle(Paint.Style.FILL);
            Paint paint2 = new Paint();
            Q = paint2;
            paint2.setAntiAlias(true);
            Q.setColor(resources.getColor(h.b));
            Q.setStyle(Paint.Style.STROKE);
            Q.setStrokeWidth(resources.getDimension(i.a));
            int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            K = scaledTouchSlop * scaledTouchSlop;
        }
        this.n = new C1788s(context, this, null);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this);
        this.o = scaleGestureDetector;
        this.J = N.a(scaleGestureDetector);
        this.v = new c(this);
        this.y = new e(this);
        this.z = new d(this);
        this.A = new b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(float f, boolean z) {
        if (z) {
            this.A.a(f);
            return;
        }
        this.B += f;
        this.c.postRotate(f, getWidth() / 2, getHeight() / 2);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(float f, float f2, float f3) {
        this.c.postRotate(-this.B, getWidth() / 2, getHeight() / 2);
        float min = Math.min(Math.max(f, this.w), this.x * 1.5f) / getScale();
        this.c.postScale(min, min, f2, f3);
        this.c.postRotate(this.B, getWidth() / 2, getHeight() / 2);
        invalidate();
        i();
    }

    private boolean u(MotionEvent motionEvent) {
        boolean z;
        float centerY;
        float f;
        if (this.s && this.r && this.G) {
            if (this.t) {
                z = false;
            } else {
                float scale = getScale();
                float f2 = this.w;
                if (scale > f2) {
                    float f3 = f2 / scale;
                    float f4 = 1.0f - f3;
                    f = ((getWidth() / 2) - (this.E.centerX() * f3)) / f4;
                    centerY = ((getHeight() / 2) - (f3 * this.E.centerY())) / f4;
                } else {
                    f2 = Math.min(this.x, Math.max(f2, scale * 2.0f));
                    float f5 = f2 / scale;
                    float width = (getWidth() - this.E.width()) / f5;
                    float height = (getHeight() - this.E.height()) / f5;
                    float centerX = this.E.width() <= width * 2.0f ? this.E.centerX() : Math.min(Math.max(this.E.left + width, motionEvent.getX()), this.E.right - width);
                    centerY = this.E.height() <= 2.0f * height ? this.E.centerY() : Math.min(Math.max(this.E.top + height, motionEvent.getY()), this.E.bottom - height);
                    f = centerX;
                }
                this.v.b(scale, f2, f, centerY);
                z = true;
            }
            this.t = false;
        } else {
            z = false;
        }
        this.G = false;
        return z;
    }

    private void v(float f) {
        float f2 = this.x;
        if (f > f2) {
            float f3 = 1.0f / (1.0f - (f2 / f));
            float f4 = 1.0f - f3;
            float width = getWidth() / 2;
            float height = getHeight() / 2;
            RectF rectF = this.E;
            float f5 = rectF.left * f4;
            float f6 = rectF.top * f4;
            float width2 = (getWidth() * f3) + (this.E.right * f4);
            float height2 = (getHeight() * f3) + (this.E.bottom * f4);
            this.v.b(f, this.x, width2 > f5 ? (width2 + f5) / 2.0f : Math.min(Math.max(width2, width), f5), height2 > f6 ? (height2 + f6) / 2.0f : Math.min(Math.max(height2, height), f6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        this.E.set(this.C);
        this.c.mapRect(this.E);
        boolean z = this.j;
        float f = 0.0f;
        float f2 = z ? this.k.left : 0.0f;
        float width = z ? this.k.right : getWidth();
        RectF rectF = this.E;
        float f3 = rectF.left;
        float f4 = rectF.right;
        float f5 = width - f2;
        float f6 = f4 - f3 < f5 ? f2 + ((f5 - (f4 + f3)) / 2.0f) : f3 > f2 ? f2 - f3 : f4 < width ? width - f4 : 0.0f;
        boolean z2 = this.j;
        float f7 = z2 ? this.k.top : 0.0f;
        float height = z2 ? this.k.bottom : getHeight();
        RectF rectF2 = this.E;
        float f8 = rectF2.top;
        float f9 = rectF2.bottom;
        float f10 = height - f7;
        if (f9 - f8 < f10) {
            f = f7 + ((f10 - (f9 + f8)) / 2.0f);
        } else if (f8 > f7) {
            f = f7 - f8;
        } else if (f9 < height) {
            f = height - f9;
        }
        if (Math.abs(f6) > 20.0f || Math.abs(f) > 20.0f) {
            this.z.a(f6, f);
        } else {
            this.c.postTranslate(f6, f);
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int y(float f, float f2) {
        float max;
        float max2;
        this.E.set(this.C);
        this.c.mapRect(this.E);
        boolean z = this.j;
        float f3 = z ? this.k.left : 0.0f;
        float width = z ? this.k.right : getWidth();
        RectF rectF = this.E;
        float f4 = rectF.left;
        float f5 = rectF.right;
        if (this.j) {
            max = Math.max(f3 - f5, Math.min(width - f4, f));
        } else {
            float f6 = width - f3;
            max = f5 - f4 < f6 ? f3 + ((f6 - (f5 + f4)) / 2.0f) : Math.max(width - f5, Math.min(f3 - f4, f));
        }
        boolean z2 = this.j;
        float f7 = z2 ? this.k.top : 0.0f;
        float height = z2 ? this.k.bottom : getHeight();
        RectF rectF2 = this.E;
        float f8 = rectF2.top;
        float f9 = rectF2.bottom;
        if (this.j) {
            max2 = Math.max(f7 - f9, Math.min(height - f8, f2));
        } else {
            float f10 = height - f7;
            max2 = f9 - f8 < f10 ? f7 + ((f10 - (f9 + f8)) / 2.0f) : Math.max(height - f9, Math.min(f7 - f8, f2));
        }
        this.c.postTranslate(max, max2);
        invalidate();
        boolean z3 = max == f;
        boolean z4 = max2 == f2;
        if (z3 && z4) {
            return 3;
        }
        if (z3) {
            return 1;
        }
        return z4 ? 2 : 0;
    }

    public void e(Drawable drawable) {
        boolean z;
        Drawable drawable2;
        if (drawable == null || drawable == (drawable2 = this.a)) {
            z = false;
        } else {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.a = drawable;
            this.w = 0.0f;
            drawable.setCallback(this);
            z = true;
        }
        h(z);
        invalidate();
    }

    public void f(Bitmap bitmap) {
        Drawable drawable = this.a;
        boolean z = drawable instanceof BitmapDrawable;
        boolean z2 = !z;
        if (drawable != null && z) {
            if (bitmap == ((BitmapDrawable) drawable).getBitmap()) {
                return;
            }
            z2 = (bitmap == null || (this.a.getIntrinsicWidth() == bitmap.getWidth() && this.a.getIntrinsicHeight() == bitmap.getHeight())) ? false : true;
            this.w = 0.0f;
            this.a = null;
        }
        if (this.a == null && bitmap != null) {
            this.a = new BitmapDrawable(getResources(), bitmap);
        }
        h(z2);
        invalidate();
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
        setOnClickListener(null);
        this.p = null;
        this.q = null;
        this.G = false;
    }

    public Bitmap getCroppedPhoto() {
        if (!this.j) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect rect = this.k;
        float f = 256.0f / (rect.right - rect.left);
        Matrix matrix = new Matrix(this.b);
        Rect rect2 = this.k;
        matrix.postTranslate(-rect2.left, -rect2.top);
        matrix.postScale(f, f);
        if (this.a != null) {
            canvas.concat(matrix);
            this.a.draw(canvas);
        }
        return createBitmap;
    }

    public float getCurrentScale() {
        return m(this.c);
    }

    public Drawable getDrawable() {
        return this.a;
    }

    public float getInitialScale() {
        return m(this.d);
    }

    public float getMinScale() {
        return this.w;
    }

    public Bitmap getPhoto() {
        Drawable drawable = this.a;
        if (drawable == null || !(drawable instanceof BitmapDrawable)) {
            return null;
        }
        return ((BitmapDrawable) drawable).getBitmap();
    }

    public byte[] getVideoData() {
        return this.h;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.a == drawable) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void j(boolean z) {
        this.r = z;
        if (z) {
            return;
        }
        r();
    }

    public boolean o(float f, float f2) {
        if (!this.r) {
            return false;
        }
        if (this.y.h0) {
            return true;
        }
        this.c.getValues(this.F);
        this.E.set(this.C);
        this.c.mapRect(this.E);
        float width = getWidth();
        float f3 = this.F[2];
        RectF rectF = this.E;
        return this.r && rectF.right - rectF.left > width && f3 != 0.0f;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        this.G = true;
        if (this.J) {
            return false;
        }
        return u(motionEvent);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && this.J && this.G) {
                    int x = (int) (motionEvent.getX() - this.H);
                    int y = (int) (motionEvent.getY() - this.I);
                    if ((x * x) + (y * y) > K) {
                        this.G = false;
                        return false;
                    }
                }
            } else if (this.J) {
                return u(motionEvent);
            }
        } else if (this.J) {
            this.H = motionEvent.getX();
            this.I = motionEvent.getY();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (!this.r) {
            return true;
        }
        this.y.c();
        this.z.b();
        return true;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        Drawable drawable = this.a;
        if (drawable != null) {
            if (drawable instanceof C2747c) {
                Drawable a2 = ((C2747c) drawable).a();
                if ((a2 instanceof BitmapDrawable) && ((BitmapDrawable) a2).getBitmap() == null) {
                    return;
                }
            }
            int saveCount = canvas.getSaveCount();
            canvas.save();
            Matrix matrix = this.b;
            if (matrix != null) {
                canvas.concat(matrix);
            }
            Paint b2 = ax.C3.e.b(20);
            if (this.a != null) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, r1.getBounds().width(), this.a.getBounds().height(), b2);
            } else {
                canvas2 = canvas;
            }
            try {
                this.a.draw(canvas2);
            } catch (RuntimeException unused) {
            }
            canvas2.restoreToCount(saveCount);
            if (this.h != null) {
                canvas2.drawBitmap(this.i ? N : O, (getWidth() - r15.getWidth()) / 2, (getHeight() - r15.getHeight()) / 2, (Paint) null);
            }
            this.E.set(this.a.getBounds());
            Matrix matrix2 = this.b;
            if (matrix2 != null) {
                matrix2.mapRect(this.E);
            }
            if (this.j) {
                int saveCount2 = canvas2.getSaveCount();
                canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), P);
                canvas2.save();
                canvas2.clipRect(this.k);
                Matrix matrix3 = this.b;
                if (matrix3 != null) {
                    canvas2.concat(matrix3);
                }
                this.a.draw(canvas2);
                canvas2.restoreToCount(saveCount2);
                canvas2.drawRect(this.k, Q);
            }
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.r || this.v.j0) {
            return true;
        }
        this.y.b(f, f2);
        return true;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() != 8) {
            return super.onGenericMotionEvent(motionEvent);
        }
        float scale = getScale();
        if (motionEvent.getAxisValue(9) >= 0.0f) {
            float f = this.x;
            if (scale >= f) {
                return true;
            }
            t(Math.min(f, scale + 0.15f), motionEvent.getX(), motionEvent.getY());
            return true;
        }
        float f2 = this.w;
        if (scale <= f2) {
            return true;
        }
        t(Math.max(f2, scale - 0.15f), motionEvent.getX(), motionEvent.getY());
        x();
        return true;
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f = true;
        int width = getWidth();
        int height = getHeight();
        if (this.j) {
            int min = Math.min(M, Math.min(width, height));
            this.l = min;
            int i5 = (width - min) / 2;
            int i6 = (height - min) / 2;
            this.k.set(i5, i6, i5 + min, min + i6);
        }
        h(z);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = this.e;
        if (i3 == -1) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
            setMeasuredDimension(getMeasuredWidth(), this.e);
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (!this.r) {
            return true;
        }
        this.u = false;
        t(getScale() * scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (this.r) {
            this.v.c();
            this.u = true;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        float scale = getScale();
        if (scale > this.x) {
            v(scale);
        }
        if (this.r && this.u) {
            this.t = true;
            r();
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.r || this.v.j0) {
            return true;
        }
        y(-f, -f2);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        View.OnClickListener onClickListener = this.p;
        if (onClickListener != null && !this.u) {
            onClickListener.onClick(this);
        }
        this.u = false;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ScaleGestureDetector scaleGestureDetector = this.o;
        if (scaleGestureDetector != null && this.n != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
            this.n.a(motionEvent);
            int action = motionEvent.getAction();
            if ((action == 1 || action == 3) && !this.y.h0) {
                x();
            }
        }
        return true;
    }

    public boolean p(float f, float f2) {
        if (!this.r) {
            return false;
        }
        if (this.y.h0) {
            return true;
        }
        this.c.getValues(this.F);
        this.E.set(this.C);
        this.c.mapRect(this.E);
        float width = getWidth();
        float f3 = this.F[2];
        RectF rectF = this.E;
        float f4 = rectF.right - rectF.left;
        if (!this.r || f4 <= width) {
            return false;
        }
        return f3 == 0.0f || width < f4 + f3;
    }

    public boolean q() {
        return this.a != null;
    }

    public void r() {
        this.c.set(this.d);
        invalidate();
        i();
    }

    public void setFixedHeight(int i) {
        boolean z = i != this.e;
        this.e = i;
        setMeasuredDimension(getMeasuredWidth(), this.e);
        if (z) {
            h(true);
            requestLayout();
        }
    }

    public void setMaxInitialScale(float f) {
        this.m = f;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.p = onClickListener;
    }

    public void setOnScaleChangedListener(a aVar) {
        this.q = aVar;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return this.a == drawable || super.verifyDrawable(drawable);
    }

    public void w(boolean z, boolean z2) {
        if (z != this.g) {
            this.g = z;
            requestLayout();
            invalidate();
        }
    }
}
