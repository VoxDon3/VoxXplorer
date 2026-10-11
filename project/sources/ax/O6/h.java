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
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import ax.O6.l;
import ax.O6.m;
import ax.O6.n;
import ax.b0.C1441b;
import ax.k6.C2402c;
import ax.u0.AbstractC3171i;
import ax.u0.C3173k;
import ax.u0.C3174l;
import ax.z6.C3555a;
import java.util.BitSet;

/* loaded from: classes3.dex */
public class h extends Drawable implements ax.U.b, o {
    private static final String F = "h";
    static final l G = l.a().q(0, 0.0f).m();
    private static final Paint H;
    private static final e[] I;
    private C3174l A;
    C3173k[] B;
    private float[] C;
    private float[] D;
    private d E;
    private final l.c a;
    private c b;
    private final n.g[] c;
    private final n.g[] d;
    private final BitSet e;
    private boolean f;
    private boolean g;
    private final Matrix h;
    private final Path i;
    private final Path j;
    private final RectF k;
    private final RectF l;
    private final Region m;
    private final Region n;
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

    class a implements l.c {
        a() {
        }

        @Override // ax.O6.l.c
        public ax.O6.d a(ax.O6.d dVar) {
            return dVar instanceof j ? dVar : new ax.O6.b(-h.this.K(), dVar);
        }
    }

    class b implements m.b {
        b() {
        }

        @Override // ax.O6.m.b
        public void a(n nVar, Matrix matrix, int i) {
            h.this.e.set(i + 4, nVar.e());
            h.this.d[i] = nVar.f(matrix);
        }

        @Override // ax.O6.m.b
        public void b(n nVar, Matrix matrix, int i) {
            h.this.e.set(i, nVar.e());
            h.this.c[i] = nVar.f(matrix);
        }
    }

    public interface d {
        void a(float f);
    }

    private static class e extends AbstractC3171i<h> {
        private final int b;

        e(int i) {
            super("cornerSizeAtIndex" + i);
            this.b = i;
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(h hVar) {
            if (hVar.C != null) {
                return hVar.C[this.b];
            }
            return 0.0f;
        }

        @Override // ax.u0.AbstractC3171i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(h hVar, float f) {
            if (hVar.C == null || hVar.C[this.b] == f) {
                return;
            }
            hVar.C[this.b] = f;
            if (hVar.E != null) {
                hVar.E.a(hVar.z());
            }
            hVar.invalidateSelf();
        }
    }

    static {
        int i = 0;
        Paint paint = new Paint(1);
        H = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        I = new e[4];
        while (true) {
            e[] eVarArr = I;
            if (i >= eVarArr.length) {
                return;
            }
            eVarArr[i] = new e(i);
            i++;
        }
    }

    public h() {
        this(new l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float K() {
        if (T()) {
            return this.p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean R() {
        c cVar = this.b;
        int i = cVar.r;
        if (i == 1 || cVar.s <= 0) {
            return false;
        }
        return i == 2 || b0();
    }

    private boolean S() {
        Paint.Style style = this.b.w;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean T() {
        Paint.Style style = this.b.w;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.p.getStrokeWidth() > 0.0f;
    }

    private void V() {
        super.invalidateSelf();
    }

    private void Y(Canvas canvas) {
        if (R()) {
            canvas.save();
            a0(canvas);
            if (!this.x) {
                s(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.w.width() - getBounds().width());
            int height = (int) (this.w.height() - getBounds().height());
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.w.width()) + (this.b.s * 2) + width, ((int) this.w.height()) + (this.b.s * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (getBounds().left - this.b.s) - width;
            float f2 = (getBounds().top - this.b.s) - height;
            canvas2.translate(-f, -f2);
            s(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    private static int Z(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    private void a0(Canvas canvas) {
        canvas.translate(F(), G());
    }

    private PorterDuffColorFilter j(Paint paint, boolean z) {
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int q = q(color);
        this.v = q;
        if (q != color) {
            return new PorterDuffColorFilter(q, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void k(RectF rectF, Path path) {
        l(rectF, path);
        if (this.b.k != 1.0f) {
            this.h.reset();
            Matrix matrix = this.h;
            float f = this.b.k;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.h);
        }
        path.computeBounds(this.w, true);
    }

    private float m(RectF rectF, l lVar, float[] fArr) {
        if (fArr == null) {
            if (lVar.v(rectF)) {
                return lVar.r().a(rectF);
            }
            return -1.0f;
        }
        if (ax.G6.a.a(fArr) && lVar.u()) {
            return fArr[0];
        }
        return -1.0f;
    }

    private void n() {
        t0();
        this.s.d(this.z, this.D, this.b.l, y(), null, this.j);
    }

    private PorterDuffColorFilter o(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = q(colorForState);
        }
        this.v = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter p(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? j(paint, z) : o(colorStateList, mode, z);
    }

    private boolean q0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.b.e == null || color2 == (colorForState2 = this.b.e.getColorForState(iArr, (color2 = this.o.getColor())))) {
            z = false;
        } else {
            this.o.setColor(colorForState2);
            z = true;
        }
        if (this.b.f == null || color == (colorForState = this.b.f.getColorForState(iArr, (color = this.p.getColor())))) {
            return z;
        }
        this.p.setColor(colorForState);
        return true;
    }

    public static h r(Context context, float f, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(C3555a.c(context, C2402c.i, h.class.getSimpleName()));
        }
        h hVar = new h();
        hVar.U(context);
        hVar.g0(colorStateList);
        hVar.f0(f);
        return hVar;
    }

    private void r0(int[] iArr) {
        s0(iArr, false);
    }

    private void s(Canvas canvas) {
        if (this.e.cardinality() > 0) {
            Log.w(F, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.b.t != 0) {
            canvas.drawPath(this.i, this.q.c());
        }
        for (int i = 0; i < 4; i++) {
            this.c[i].b(this.q, this.b.s, canvas);
            this.d[i].b(this.q, this.b.s, canvas);
        }
        if (this.x) {
            int F2 = F();
            int G2 = G();
            canvas.translate(-F2, -G2);
            canvas.drawPath(this.i, H);
            canvas.translate(F2, G2);
        }
    }

    private void s0(int[] iArr, boolean z) {
        RectF x = x();
        if (this.b.b == null || x.isEmpty()) {
            return;
        }
        boolean z2 = z | (this.A == null);
        if (this.C == null) {
            this.C = new float[4];
        }
        l d2 = this.b.b.d(iArr);
        for (int i = 0; i < 4; i++) {
            float a2 = this.s.f(i, d2).a(x);
            if (z2) {
                this.C[i] = a2;
            }
            C3173k c3173k = this.B[i];
            if (c3173k != null) {
                c3173k.m(a2);
                if (z2) {
                    this.B[i].r();
                }
            }
        }
        if (z2) {
            invalidateSelf();
        }
    }

    private void t(Canvas canvas) {
        v(canvas, this.o, this.i, this.b.a, this.C, x());
    }

    private void t0() {
        this.z = I().z(this.a);
        float[] fArr = this.C;
        if (fArr == null) {
            this.D = null;
            return;
        }
        if (this.D == null) {
            this.D = new float[fArr.length];
        }
        float K = K();
        int i = 0;
        while (true) {
            float[] fArr2 = this.C;
            if (i >= fArr2.length) {
                return;
            }
            this.D[i] = Math.max(0.0f, fArr2[i] - K);
            i++;
        }
    }

    private boolean u0() {
        PorterDuffColorFilter porterDuffColorFilter = this.t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.u;
        c cVar = this.b;
        this.t = p(cVar.h, cVar.i, this.o, true);
        c cVar2 = this.b;
        this.u = p(cVar2.g, cVar2.i, this.p, false);
        c cVar3 = this.b;
        if (cVar3.v) {
            this.q.d(cVar3.h.getColorForState(getState(), 0));
        }
        return (C1441b.a(porterDuffColorFilter, this.t) && C1441b.a(porterDuffColorFilter2, this.u)) ? false : true;
    }

    private void v(Canvas canvas, Paint paint, Path path, l lVar, float[] fArr, RectF rectF) {
        float m = m(rectF, lVar, fArr);
        if (m < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = m * this.b.l;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    private void v0() {
        float Q = Q();
        this.b.s = (int) Math.ceil(0.75f * Q);
        this.b.t = (int) Math.ceil(Q * 0.25f);
        u0();
        V();
    }

    private RectF y() {
        this.l.set(x());
        float K = K();
        this.l.inset(K, K);
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
        c cVar = this.b;
        return (int) (cVar.t * Math.sin(Math.toRadians(cVar.u)));
    }

    public int G() {
        c cVar = this.b;
        return (int) (cVar.t * Math.cos(Math.toRadians(cVar.u)));
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
        float[] fArr = this.C;
        return fArr != null ? fArr[3] : this.b.a.r().a(x());
    }

    public float O() {
        float[] fArr = this.C;
        return fArr != null ? fArr[0] : this.b.a.t().a(x());
    }

    public float P() {
        return this.b.q;
    }

    public float Q() {
        return A() + P();
    }

    public void U(Context context) {
        this.b.c = new ax.D6.a(context);
        v0();
    }

    public boolean W() {
        ax.D6.a aVar = this.b.c;
        return aVar != null && aVar.d();
    }

    public boolean X() {
        if (this.b.a.v(x())) {
            return true;
        }
        float[] fArr = this.C;
        return fArr != null && ax.G6.a.a(fArr) && this.b.a.u();
    }

    public boolean b0() {
        return (X() || this.i.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void c0(float f) {
        setShapeAppearanceModel(this.b.a.x(f));
    }

    public void d0(ax.O6.d dVar) {
        setShapeAppearanceModel(this.b.a.y(dVar));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.o.setColorFilter(this.t);
        int alpha = this.o.getAlpha();
        this.o.setAlpha(Z(alpha, this.b.n));
        this.p.setColorFilter(this.u);
        this.p.setStrokeWidth(this.b.m);
        int alpha2 = this.p.getAlpha();
        this.p.setAlpha(Z(alpha2, this.b.n));
        if (S()) {
            if (this.f) {
                k(x(), this.i);
                this.f = false;
            }
            Y(canvas);
            t(canvas);
        }
        if (T()) {
            if (this.g) {
                n();
                this.g = false;
            }
            w(canvas);
        }
        this.o.setAlpha(alpha);
        this.p.setAlpha(alpha2);
    }

    public void e0(C3174l c3174l) {
        if (this.A == c3174l) {
            return;
        }
        this.A = c3174l;
        int i = 0;
        while (true) {
            C3173k[] c3173kArr = this.B;
            if (i >= c3173kArr.length) {
                s0(getState(), true);
                invalidateSelf();
                return;
            } else {
                if (c3173kArr[i] == null) {
                    c3173kArr[i] = new C3173k(this, I[i]);
                }
                this.B[i].q(new C3174l().f(c3174l.a()).h(c3174l.c()));
                i++;
            }
        }
    }

    public void f0(float f) {
        c cVar = this.b;
        if (cVar.p != f) {
            cVar.p = f;
            v0();
        }
    }

    public void g0(ColorStateList colorStateList) {
        c cVar = this.b;
        if (cVar.e != colorStateList) {
            cVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.b.n;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.b.r == 2) {
            return;
        }
        RectF x = x();
        if (x.isEmpty()) {
            return;
        }
        float m = m(x, this.b.a, this.C);
        if (m >= 0.0f) {
            outline.setRoundRect(getBounds(), m * this.b.l);
            return;
        }
        if (this.f) {
            k(x, this.i);
            this.f = false;
        }
        ax.C6.f.j(outline, this.i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.b.j;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.m.set(getBounds());
        k(x(), this.i);
        this.n.setPath(this.i, this.m);
        this.m.op(this.n, Region.Op.DIFFERENCE);
        return this.m;
    }

    public void h0(float f) {
        c cVar = this.b;
        if (cVar.l != f) {
            cVar.l = f;
            this.f = true;
            this.g = true;
            invalidateSelf();
        }
    }

    public void i0(d dVar) {
        this.E = dVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f = true;
        this.g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.b.h;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.b.g;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.b.f;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.b.e;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        q qVar = this.b.b;
        return qVar != null && qVar.f();
    }

    public void j0(int i, int i2, int i3, int i4) {
        c cVar = this.b;
        if (cVar.j == null) {
            cVar.j = new Rect();
        }
        this.b.j.set(i, i2, i3, i4);
        invalidateSelf();
    }

    public void k0(float f) {
        c cVar = this.b;
        if (cVar.o != f) {
            cVar.o = f;
            v0();
        }
    }

    protected final void l(RectF rectF, Path path) {
        m mVar = this.s;
        c cVar = this.b;
        mVar.d(cVar.a, this.C, cVar.l, rectF, this.r, path);
    }

    public void l0(q qVar) {
        c cVar = this.b;
        if (cVar.b != qVar) {
            cVar.b = qVar;
            s0(getState(), true);
            invalidateSelf();
        }
    }

    public void m0(float f, int i) {
        p0(f);
        o0(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.b = new c(this.b);
        return this;
    }

    public void n0(float f, ColorStateList colorStateList) {
        p0(f);
        o0(colorStateList);
    }

    public void o0(ColorStateList colorStateList) {
        c cVar = this.b;
        if (cVar.f != colorStateList) {
            cVar.f = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f = true;
        this.g = true;
        super.onBoundsChange(rect);
        if (this.b.b != null && !rect.isEmpty()) {
            s0(getState(), this.y);
        }
        this.y = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        if (this.b.b != null) {
            r0(iArr);
        }
        boolean z = q0(iArr) || u0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public void p0(float f) {
        this.b.m = f;
        invalidateSelf();
    }

    protected int q(int i) {
        float Q = Q() + D();
        ax.D6.a aVar = this.b.c;
        return aVar != null ? aVar.c(i, Q) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        c cVar = this.b;
        if (cVar.n != i) {
            cVar.n = i;
            V();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.d = colorFilter;
        V();
    }

    @Override // ax.O6.o
    public void setShapeAppearanceModel(l lVar) {
        c cVar = this.b;
        cVar.a = lVar;
        cVar.b = null;
        this.C = null;
        this.D = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.b.h = colorStateList;
        u0();
        V();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.b;
        if (cVar.i != mode) {
            cVar.i = mode;
            u0();
            V();
        }
    }

    protected void u(Canvas canvas, Paint paint, Path path, RectF rectF) {
        v(canvas, paint, path, this.b.a, this.C, rectF);
    }

    protected void w(Canvas canvas) {
        v(canvas, this.p, this.j, this.z, this.D, y());
    }

    protected RectF x() {
        this.k.set(getBounds());
        return this.k;
    }

    public float z() {
        float a2;
        float a3;
        float[] fArr = this.C;
        if (fArr != null) {
            a2 = (fArr[3] + fArr[2]) - fArr[1];
            a3 = fArr[0];
        } else {
            RectF x = x();
            a2 = (this.s.f(3, I()).a(x) + this.s.f(2, I()).a(x)) - this.s.f(1, I()).a(x);
            a3 = this.s.f(0, I()).a(x);
        }
        return (a2 - a3) / 2.0f;
    }

    public h(Context context, AttributeSet attributeSet, int i, int i2) {
        this(l.e(context, attributeSet, i, i2).m());
    }

    public h(l lVar) {
        this(new c(lVar, null));
    }

    protected h(c cVar) {
        m mVar;
        this.a = new a();
        this.c = new n.g[4];
        this.d = new n.g[4];
        this.e = new BitSet(8);
        this.h = new Matrix();
        this.i = new Path();
        this.j = new Path();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new Region();
        this.n = new Region();
        Paint paint = new Paint(1);
        this.o = paint;
        Paint paint2 = new Paint(1);
        this.p = paint2;
        this.q = new ax.N6.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = m.j();
        } else {
            mVar = new m();
        }
        this.s = mVar;
        this.w = new RectF();
        this.x = true;
        this.y = true;
        this.B = new C3173k[4];
        this.b = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        u0();
        q0(getState());
        this.r = new b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class c extends Drawable.ConstantState {
        l a;
        q b;
        ax.D6.a c;
        ColorFilter d;
        ColorStateList e;
        ColorStateList f;
        ColorStateList g;
        ColorStateList h;
        PorterDuff.Mode i;
        Rect j;
        float k;
        float l;
        float m;
        int n;
        float o;
        float p;
        float q;
        int r;
        int s;
        int t;
        int u;
        boolean v;
        Paint.Style w;

        public c(l lVar, ax.D6.a aVar) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = PorterDuff.Mode.SRC_IN;
            this.j = null;
            this.k = 1.0f;
            this.l = 1.0f;
            this.n = 255;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0.0f;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 0;
            this.v = false;
            this.w = Paint.Style.FILL_AND_STROKE;
            this.a = lVar;
            this.c = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVar = new h(this);
            hVar.f = true;
            hVar.g = true;
            return hVar;
        }

        public c(c cVar) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = PorterDuff.Mode.SRC_IN;
            this.j = null;
            this.k = 1.0f;
            this.l = 1.0f;
            this.n = 255;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0.0f;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 0;
            this.v = false;
            this.w = Paint.Style.FILL_AND_STROKE;
            this.a = cVar.a;
            this.b = cVar.b;
            this.c = cVar.c;
            this.m = cVar.m;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.i = cVar.i;
            this.h = cVar.h;
            this.n = cVar.n;
            this.k = cVar.k;
            this.t = cVar.t;
            this.r = cVar.r;
            this.v = cVar.v;
            this.l = cVar.l;
            this.o = cVar.o;
            this.p = cVar.p;
            this.q = cVar.q;
            this.s = cVar.s;
            this.u = cVar.u;
            this.g = cVar.g;
            this.w = cVar.w;
            if (cVar.j != null) {
                this.j = new Rect(cVar.j);
            }
        }
    }
}
