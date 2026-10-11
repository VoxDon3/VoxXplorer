/*
 * Decompiled with CFR 0.152.
 */
package ax.O6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import ax.C6.f;
import ax.O6.b;
import ax.O6.j;
import ax.O6.l;
import ax.O6.m;
import ax.O6.n;
import ax.O6.o;
import ax.O6.q;
import ax.u0.i;
import ax.u0.k;
import ax.z6.a;
import java.util.BitSet;

public class h
extends Drawable
implements ax.U.b,
o {
    private static final String F = "h";
    static final l G;
    private static final Paint H;
    private static final e[] I;
    private ax.u0.l A;
    k[] B;
    private float[] C;
    private float[] D;
    private d E;
    private final l.c a = new l.c(this){
        final h a;
        {
            this.a = h8;
        }

        @Override
        public ax.O6.d a(ax.O6.d d8) {
            if (d8 instanceof j) {
                return d8;
            }
            return new b(-this.a.K(), d8);
        }
    };
    private c b;
    private final n.g[] c = new n.g[4];
    private final n.g[] d = new n.g[4];
    private final BitSet e = new BitSet(8);
    private boolean f;
    private boolean g;
    private final Matrix h = new Matrix();
    private final Path i = new Path();
    private final Path j = new Path();
    private final RectF k = new RectF();
    private final RectF l = new RectF();
    private final Region m = new Region();
    private final Region n = new Region();
    private final Paint o;
    private final Paint p;
    private final ax.N6.a q;
    private final m.b r;
    private final m s;
    private PorterDuffColorFilter t;
    private PorterDuffColorFilter u;
    private int v;
    private final RectF w;
    private boolean x;
    private boolean y;
    private l z;

    static {
        e[] eArray = ax.O6.l.a();
        G = eArray.q(0, 0.0f).m();
        eArray = new Paint(1);
        H = eArray;
        eArray.setColor(-1);
        eArray.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        I = new e[4];
        for (int i8 = 0; i8 < (eArray = I).length; ++i8) {
            eArray[i8] = new e(i8);
        }
    }

    public h() {
        this(new l());
    }

    public h(Context context, AttributeSet attributeSet, int n8, int n9) {
        this(ax.O6.l.e(context, attributeSet, n8, n9).m());
    }

    protected h(c c8) {
        Paint paint;
        Paint paint2;
        this.o = paint2 = new Paint(1);
        this.p = paint = new Paint(1);
        this.q = new ax.N6.a();
        m m8 = Looper.getMainLooper().getThread() == Thread.currentThread() ? ax.O6.m.j() : new m();
        this.s = m8;
        this.w = new RectF();
        this.x = true;
        this.y = true;
        this.B = new k[4];
        this.b = c8;
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        this.u0();
        this.q0(this.getState());
        this.r = new m.b(this){
            final h a;
            {
                this.a = h8;
            }

            @Override
            public void a(n n8, Matrix matrix, int n9) {
                this.a.e.set(n9 + 4, n8.e());
                ((h)this.a).d[n9] = n8.f(matrix);
            }

            @Override
            public void b(n n8, Matrix matrix, int n9) {
                this.a.e.set(n9, n8.e());
                ((h)this.a).c[n9] = n8.f(matrix);
            }
        };
    }

    public h(l l8) {
        this(new c(l8, null));
    }

    private float K() {
        if (this.T()) {
            return this.p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean R() {
        c c8 = this.b;
        int n8 = c8.r;
        return n8 != 1 && c8.s > 0 && (n8 == 2 || this.b0());
    }

    private boolean S() {
        Paint.Style style = this.b.w;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
        {
        }
    }

    private boolean T() {
        Paint.Style style = this.b.w;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.p.getStrokeWidth() > 0.0f;
    }

    private void V() {
        super.invalidateSelf();
    }

    private void Y(Canvas canvas) {
        if (!this.R()) {
            return;
        }
        canvas.save();
        this.a0(canvas);
        if (!this.x) {
            this.s(canvas);
            canvas.restore();
            return;
        }
        int n8 = (int)(this.w.width() - (float)this.getBounds().width());
        int n9 = (int)(this.w.height() - (float)this.getBounds().height());
        if (n8 >= 0 && n9 >= 0) {
            Bitmap bitmap = Bitmap.createBitmap((int)((int)this.w.width() + this.b.s * 2 + n8), (int)((int)this.w.height() + this.b.s * 2 + n9), (Bitmap.Config)Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmap);
            float f8 = this.getBounds().left - this.b.s - n8;
            float f9 = this.getBounds().top - this.b.s - n9;
            canvas2.translate(-f8, -f9);
            this.s(canvas2);
            canvas.drawBitmap(bitmap, f8, f9, null);
            bitmap.recycle();
            canvas.restore();
            return;
        }
        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
    }

    private static int Z(int n8, int n9) {
        return n8 * (n9 + (n9 >>> 7)) >>> 8;
    }

    private void a0(Canvas canvas) {
        int n8 = this.F();
        int n9 = this.G();
        canvas.translate((float)n8, (float)n9);
    }

    static /* synthetic */ boolean h(h h8, boolean bl) {
        h8.f = bl;
        return bl;
    }

    static /* synthetic */ boolean i(h h8, boolean bl) {
        h8.g = bl;
        return bl;
    }

    private PorterDuffColorFilter j(Paint paint, boolean bl) {
        if (bl) {
            int n8;
            int n9 = paint.getColor();
            this.v = n8 = this.q(n9);
            if (n8 != n9) {
                return new PorterDuffColorFilter(n8, PorterDuff.Mode.SRC_IN);
            }
        }
        return null;
    }

    private void k(RectF rectF, Path path) {
        this.l(rectF, path);
        if (this.b.k != 1.0f) {
            this.h.reset();
            Matrix matrix = this.h;
            float f8 = this.b.k;
            matrix.setScale(f8, f8, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.h);
        }
        path.computeBounds(this.w, true);
    }

    private float m(RectF rectF, l l8, float[] fArray) {
        if (fArray == null) {
            if (l8.v(rectF)) {
                return l8.r().a(rectF);
            }
        } else if (ax.G6.a.a(fArray) && l8.u()) {
            return fArray[0];
        }
        return -1.0f;
    }

    private void n() {
        this.t0();
        this.s.d(this.z, this.D, this.b.l, this.y(), null, this.j);
    }

    private PorterDuffColorFilter o(ColorStateList colorStateList, PorterDuff.Mode mode, boolean bl) {
        int n8;
        int n9 = n8 = colorStateList.getColorForState(this.getState(), 0);
        if (bl) {
            n9 = this.q(n8);
        }
        this.v = n9;
        return new PorterDuffColorFilter(n9, mode);
    }

    private PorterDuffColorFilter p(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean bl) {
        if (colorStateList != null && mode != null) {
            return this.o(colorStateList, mode, bl);
        }
        return this.j(paint, bl);
    }

    private boolean q0(int[] nArray) {
        boolean bl;
        int n8;
        int n9;
        if (this.b.e != null && (n9 = this.o.getColor()) != (n8 = this.b.e.getColorForState(nArray, n9))) {
            this.o.setColor(n8);
            bl = true;
        } else {
            bl = false;
        }
        if (this.b.f != null && (n8 = this.p.getColor()) != (n9 = this.b.f.getColorForState(nArray, n8))) {
            this.p.setColor(n9);
            return true;
        }
        return bl;
    }

    public static h r(Context context, float f8, ColorStateList object) {
        ColorStateList colorStateList = object;
        if (object == null) {
            colorStateList = ColorStateList.valueOf((int)ax.z6.a.c(context, ax.k6.c.i, h.class.getSimpleName()));
        }
        object = new h();
        ((h)object).U(context);
        ((h)object).g0(colorStateList);
        ((h)object).f0(f8);
        return object;
    }

    private void r0(int[] nArray) {
        this.s0(nArray, false);
    }

    private void s(Canvas canvas) {
        int n8;
        if (this.e.cardinality() > 0) {
            Log.w((String)F, (String)"Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.b.t != 0) {
            canvas.drawPath(this.i, this.q.c());
        }
        for (n8 = 0; n8 < 4; ++n8) {
            this.c[n8].b(this.q, this.b.s, canvas);
            this.d[n8].b(this.q, this.b.s, canvas);
        }
        if (this.x) {
            int n9 = this.F();
            n8 = this.G();
            canvas.translate((float)(-n9), (float)(-n8));
            canvas.drawPath(this.i, H);
            canvas.translate((float)n9, (float)n8);
        }
    }

    private void s0(int[] object, boolean bl) {
        RectF rectF = this.x();
        if (this.b.b != null && !rectF.isEmpty()) {
            Object object2 = this.A;
            int n8 = 0;
            int n9 = object2 == null ? 1 : 0;
            boolean bl2 = bl | n9;
            if (this.C == null) {
                this.C = new float[4];
            }
            object = this.b.b.d((int[])object);
            for (n9 = n8; n9 < 4; ++n9) {
                float f8 = this.s.f(n9, (l)object).a(rectF);
                if (bl2) {
                    this.C[n9] = f8;
                }
                if ((object2 = this.B[n9]) == null) continue;
                ((k)object2).m(f8);
                if (!bl2) continue;
                this.B[n9].r();
            }
            if (bl2) {
                this.invalidateSelf();
            }
        }
    }

    private void t(Canvas canvas) {
        this.v(canvas, this.o, this.i, this.b.a, this.C, this.x());
    }

    private void t0() {
        this.z = this.I().z(this.a);
        float[] fArray = this.C;
        if (fArray == null) {
            this.D = null;
            return;
        }
        if (this.D == null) {
            this.D = new float[fArray.length];
        }
        float f8 = this.K();
        for (int i8 = 0; i8 < (fArray = this.C).length; ++i8) {
            this.D[i8] = Math.max(0.0f, fArray[i8] - f8);
        }
    }

    private boolean u0() {
        PorterDuffColorFilter porterDuffColorFilter = this.t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.u;
        c c8 = this.b;
        this.t = this.p(c8.h, c8.i, this.o, true);
        c8 = this.b;
        this.u = this.p(c8.g, c8.i, this.p, false);
        c8 = this.b;
        if (c8.v) {
            this.q.d(c8.h.getColorForState(this.getState(), 0));
        }
        return !ax.b0.b.a(porterDuffColorFilter, this.t) || !ax.b0.b.a(porterDuffColorFilter2, this.u);
        {
        }
    }

    private void v(Canvas canvas, Paint paint, Path path, l l8, float[] fArray, RectF rectF) {
        float f8 = this.m(rectF, l8, fArray);
        if (f8 >= 0.0f) {
            canvas.drawRoundRect(rectF, f8 *= this.b.l, f8, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void v0() {
        float f8 = this.Q();
        this.b.s = (int)Math.ceil(0.75f * f8);
        this.b.t = (int)Math.ceil(f8 * 0.25f);
        this.u0();
        this.V();
    }

    private RectF y() {
        this.l.set(this.x());
        float f8 = this.K();
        this.l.inset(f8, f8);
        return this.l;
    }

    public float A() {
        return this.b.p;
    }

    public ColorStateList B() {
        return this.b.e;
    }

    public float C() {
        return this.b.l;
    }

    public float D() {
        return this.b.o;
    }

    public int E() {
        return this.v;
    }

    public int F() {
        c c8 = this.b;
        return (int)((double)c8.t * Math.sin(Math.toRadians(c8.u)));
    }

    public int G() {
        c c8 = this.b;
        return (int)((double)c8.t * Math.cos(Math.toRadians(c8.u)));
    }

    public int H() {
        return this.b.s;
    }

    public l I() {
        return this.b.a;
    }

    public ColorStateList J() {
        return this.b.f;
    }

    public float L() {
        return this.b.m;
    }

    public ColorStateList M() {
        return this.b.h;
    }

    public float N() {
        float[] fArray = this.C;
        if (fArray != null) {
            return fArray[3];
        }
        return this.b.a.r().a(this.x());
    }

    public float O() {
        float[] fArray = this.C;
        if (fArray != null) {
            return fArray[0];
        }
        return this.b.a.t().a(this.x());
    }

    public float P() {
        return this.b.q;
    }

    public float Q() {
        return this.A() + this.P();
    }

    public void U(Context context) {
        this.b.c = new ax.D6.a(context);
        this.v0();
    }

    public boolean W() {
        ax.D6.a a8 = this.b.c;
        return a8 != null && a8.d();
    }

    public boolean X() {
        float[] fArray;
        return this.b.a.v(this.x()) || (fArray = this.C) != null && ax.G6.a.a(fArray) && this.b.a.u();
        {
        }
    }

    public boolean b0() {
        return !this.X() && !this.i.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    public void c0(float f8) {
        this.setShapeAppearanceModel(this.b.a.x(f8));
    }

    public void d0(ax.O6.d d8) {
        this.setShapeAppearanceModel(this.b.a.y(d8));
    }

    public void draw(Canvas canvas) {
        this.o.setColorFilter((ColorFilter)this.t);
        int n8 = this.o.getAlpha();
        this.o.setAlpha(ax.O6.h.Z(n8, this.b.n));
        this.p.setColorFilter((ColorFilter)this.u);
        this.p.setStrokeWidth(this.b.m);
        int n9 = this.p.getAlpha();
        this.p.setAlpha(ax.O6.h.Z(n9, this.b.n));
        if (this.S()) {
            if (this.f) {
                this.k(this.x(), this.i);
                this.f = false;
            }
            this.Y(canvas);
            this.t(canvas);
        }
        if (this.T()) {
            if (this.g) {
                this.n();
                this.g = false;
            }
            this.w(canvas);
        }
        this.o.setAlpha(n8);
        this.p.setAlpha(n9);
    }

    public void e0(ax.u0.l l8) {
        if (this.A != l8) {
            k[] kArray;
            this.A = l8;
            for (int i8 = 0; i8 < (kArray = this.B).length; ++i8) {
                if (kArray[i8] == null) {
                    kArray[i8] = new k(this, I[i8]);
                }
                this.B[i8].q(new ax.u0.l().f(l8.a()).h(l8.c()));
            }
            this.s0(this.getState(), true);
            this.invalidateSelf();
        }
    }

    public void f0(float f8) {
        c c8 = this.b;
        if (c8.p != f8) {
            c8.p = f8;
            this.v0();
        }
    }

    public void g0(ColorStateList colorStateList) {
        c c8 = this.b;
        if (c8.e != colorStateList) {
            c8.e = colorStateList;
            this.onStateChange(this.getState());
        }
    }

    public int getAlpha() {
        return this.b.n;
    }

    public Drawable.ConstantState getConstantState() {
        return this.b;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        RectF rectF;
        if (this.b.r == 2 || (rectF = this.x()).isEmpty()) {
            return;
        }
        float f8 = this.m(rectF, this.b.a, this.C);
        if (f8 >= 0.0f) {
            outline.setRoundRect(this.getBounds(), f8 * this.b.l);
            return;
        }
        if (this.f) {
            this.k(rectF, this.i);
            this.f = false;
        }
        ax.C6.f.j(outline, this.i);
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.b.j;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    public Region getTransparentRegion() {
        Rect rect = this.getBounds();
        this.m.set(rect);
        this.k(this.x(), this.i);
        this.n.setPath(this.i, this.m);
        this.m.op(this.n, Region.Op.DIFFERENCE);
        return this.m;
    }

    public void h0(float f8) {
        c c8 = this.b;
        if (c8.l != f8) {
            c8.l = f8;
            this.f = true;
            this.g = true;
            this.invalidateSelf();
        }
    }

    public void i0(d d8) {
        this.E = d8;
    }

    public void invalidateSelf() {
        this.f = true;
        this.g = true;
        super.invalidateSelf();
    }

    public boolean isStateful() {
        Object object;
        return super.isStateful() || (object = this.b.h) != null && object.isStateful() || (object = this.b.g) != null && object.isStateful() || (object = this.b.f) != null && object.isStateful() || (object = this.b.e) != null && object.isStateful() || (object = this.b.b) != null && ((q)object).f();
        {
        }
    }

    public void j0(int n8, int n9, int n10, int n11) {
        c c8 = this.b;
        if (c8.j == null) {
            c8.j = new Rect();
        }
        this.b.j.set(n8, n9, n10, n11);
        this.invalidateSelf();
    }

    public void k0(float f8) {
        c c8 = this.b;
        if (c8.o != f8) {
            c8.o = f8;
            this.v0();
        }
    }

    protected final void l(RectF rectF, Path path) {
        m m8 = this.s;
        c c8 = this.b;
        m8.d(c8.a, this.C, c8.l, rectF, this.r, path);
    }

    public void l0(q q8) {
        c c8 = this.b;
        if (c8.b != q8) {
            c8.b = q8;
            this.s0(this.getState(), true);
            this.invalidateSelf();
        }
    }

    public void m0(float f8, int n8) {
        this.p0(f8);
        this.o0(ColorStateList.valueOf((int)n8));
    }

    public Drawable mutate() {
        this.b = new c(this.b);
        return this;
    }

    public void n0(float f8, ColorStateList colorStateList) {
        this.p0(f8);
        this.o0(colorStateList);
    }

    public void o0(ColorStateList colorStateList) {
        c c8 = this.b;
        if (c8.f != colorStateList) {
            c8.f = colorStateList;
            this.onStateChange(this.getState());
        }
    }

    protected void onBoundsChange(Rect rect) {
        this.f = true;
        this.g = true;
        super.onBoundsChange(rect);
        if (this.b.b != null && !rect.isEmpty()) {
            this.s0(this.getState(), this.y);
        }
        this.y = rect.isEmpty();
    }

    protected boolean onStateChange(int[] nArray) {
        if (this.b.b != null) {
            this.r0(nArray);
        }
        boolean bl = this.q0(nArray);
        boolean bl2 = this.u0();
        bl = bl || bl2;
        if (bl) {
            this.invalidateSelf();
        }
        return bl;
    }

    public void p0(float f8) {
        this.b.m = f8;
        this.invalidateSelf();
    }

    protected int q(int n8) {
        float f8 = this.Q();
        float f9 = this.D();
        ax.D6.a a8 = this.b.c;
        int n9 = n8;
        if (a8 != null) {
            n9 = a8.c(n8, f8 + f9);
        }
        return n9;
    }

    public void setAlpha(int n8) {
        c c8 = this.b;
        if (c8.n != n8) {
            c8.n = n8;
            this.V();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.b.d = colorFilter;
        this.V();
    }

    @Override
    public void setShapeAppearanceModel(l l8) {
        c c8 = this.b;
        c8.a = l8;
        c8.b = null;
        this.C = null;
        this.D = null;
        this.invalidateSelf();
    }

    public void setTint(int n8) {
        this.setTintList(ColorStateList.valueOf((int)n8));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.b.h = colorStateList;
        this.u0();
        this.V();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        c c8 = this.b;
        if (c8.i != mode) {
            c8.i = mode;
            this.u0();
            this.V();
        }
    }

    protected void u(Canvas canvas, Paint paint, Path path, RectF rectF) {
        this.v(canvas, paint, path, this.b.a, this.C, rectF);
    }

    protected void w(Canvas canvas) {
        this.v(canvas, this.p, this.j, this.z, this.D, this.y());
    }

    protected RectF x() {
        this.k.set(this.getBounds());
        return this.k;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public float z() {
        float f8;
        float f9;
        float[] fArray = this.C;
        if (fArray != null) {
            f9 = fArray[3] + fArray[2] - fArray[1];
            f8 = fArray[0];
            return (f9 - f8) / 2.0f;
        }
        RectF rectF = this.x();
        f9 = this.s.f(3, this.I()).a(rectF) + this.s.f(2, this.I()).a(rectF) - this.s.f(1, this.I()).a(rectF);
        f8 = this.s.f(0, this.I()).a(rectF);
        return (f9 - f8) / 2.0f;
    }

    protected static class c
    extends Drawable.ConstantState {
        l a;
        q b;
        ax.D6.a c;
        ColorFilter d;
        ColorStateList e = null;
        ColorStateList f = null;
        ColorStateList g = null;
        ColorStateList h = null;
        PorterDuff.Mode i = PorterDuff.Mode.SRC_IN;
        Rect j = null;
        float k = 1.0f;
        float l = 1.0f;
        float m;
        int n = 255;
        float o = 0.0f;
        float p = 0.0f;
        float q = 0.0f;
        int r = 0;
        int s = 0;
        int t = 0;
        int u = 0;
        boolean v = false;
        Paint.Style w = Paint.Style.FILL_AND_STROKE;

        public c(c c8) {
            this.a = c8.a;
            this.b = c8.b;
            this.c = c8.c;
            this.m = c8.m;
            this.d = c8.d;
            this.e = c8.e;
            this.f = c8.f;
            this.i = c8.i;
            this.h = c8.h;
            this.n = c8.n;
            this.k = c8.k;
            this.t = c8.t;
            this.r = c8.r;
            this.v = c8.v;
            this.l = c8.l;
            this.o = c8.o;
            this.p = c8.p;
            this.q = c8.q;
            this.s = c8.s;
            this.u = c8.u;
            this.g = c8.g;
            this.w = c8.w;
            if (c8.j != null) {
                this.j = new Rect(c8.j);
            }
        }

        public c(l l8, ax.D6.a a8) {
            this.a = l8;
            this.c = a8;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            h h8 = new h(this);
            ax.O6.h.h(h8, true);
            ax.O6.h.i(h8, true);
            return h8;
        }
    }

    public static interface d {
        public void a(float var1);
    }

    private static class e
    extends i<h> {
        private final int b;

        e(int n8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("cornerSizeAtIndex");
            stringBuilder.append(n8);
            super(stringBuilder.toString());
            this.b = n8;
        }

        public float c(h h8) {
            if (h8.C != null) {
                return h8.C[this.b];
            }
            return 0.0f;
        }

        public void d(h h8, float f8) {
            if (h8.C != null && h8.C[this.b] != f8) {
                ((h)h8).C[this.b] = f8;
                if (h8.E != null) {
                    h8.E.a(h8.z());
                }
                h8.invalidateSelf();
            }
        }
    }
}

