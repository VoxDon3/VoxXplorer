package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import ax.C6.f;
import ax.F6.u;
import ax.F6.w;
import ax.F6.z;
import ax.K6.c;
import ax.K6.e;
import ax.O6.h;
import ax.a0.C1263a;
import ax.k6.m;
import ax.o.C2653a;
import ax.s6.C3053a;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class a extends h implements ax.U.b, Drawable.Callback, u.b {
    private static final int[] T0 = {R.attr.state_enabled};
    private static final ShapeDrawable U0 = new ShapeDrawable(new OvalShape());
    private int A0;
    private int B0;
    private int C0;
    private int D0;
    private boolean E0;
    private int F0;
    private int G0;
    private ColorFilter H0;
    private PorterDuffColorFilter I0;
    private ColorStateList J;
    private ColorStateList J0;
    private ColorStateList K;
    private PorterDuff.Mode K0;
    private float L;
    private int[] L0;
    private float M;
    private boolean M0;
    private ColorStateList N;
    private ColorStateList N0;
    private float O;
    private WeakReference<InterfaceC0551a> O0;
    private ColorStateList P;
    private TextUtils.TruncateAt P0;
    private CharSequence Q;
    private boolean Q0;
    private boolean R;
    private int R0;
    private Drawable S;
    private boolean S0;
    private ColorStateList T;
    private float U;
    private boolean V;
    private boolean W;
    private Drawable X;
    private Drawable Y;
    private ColorStateList Z;
    private float a0;
    private CharSequence b0;
    private boolean c0;
    private boolean d0;
    private Drawable e0;
    private ColorStateList f0;
    private ax.l6.h g0;
    private ax.l6.h h0;
    private float i0;
    private float j0;
    private float k0;
    private float l0;
    private float m0;
    private float n0;
    private float o0;
    private float p0;
    private final Context q0;
    private final Paint r0;
    private final Paint s0;
    private final Paint.FontMetrics t0;
    private final RectF u0;
    private final PointF v0;
    private final Path w0;
    private final u x0;
    private int y0;
    private int z0;

    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0551a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.M = -1.0f;
        this.r0 = new Paint(1);
        this.t0 = new Paint.FontMetrics();
        this.u0 = new RectF();
        this.v0 = new PointF();
        this.w0 = new Path();
        this.G0 = 255;
        this.K0 = PorterDuff.Mode.SRC_IN;
        this.O0 = new WeakReference<>(null);
        U(context);
        this.q0 = context;
        u uVar = new u(this);
        this.x0 = uVar;
        this.Q = HttpUrl.FRAGMENT_ENCODE_SET;
        uVar.g().density = context.getResources().getDisplayMetrics().density;
        this.s0 = null;
        int[] iArr = T0;
        setState(iArr);
        y2(iArr);
        this.Q0 = true;
        U0.setTint(-1);
    }

    private void A0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (c3()) {
            float f = this.p0 + this.o0;
            if (ax.U.a.f(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.a0;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.a0;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.a0;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    private void B0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (c3()) {
            float f = this.p0 + this.o0 + this.a0 + this.n0 + this.m0;
            if (ax.U.a.f(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void D0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.Q != null) {
            float y0 = this.i0 + y0() + this.l0;
            float C0 = this.p0 + C0() + this.m0;
            if (ax.U.a.f(this) == 0) {
                rectF.left = rect.left + y0;
                rectF.right = rect.right - C0;
            } else {
                rectF.left = rect.left + C0;
                rectF.right = rect.right - y0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean D1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private float E0() {
        this.x0.g().getFontMetrics(this.t0);
        Paint.FontMetrics fontMetrics = this.t0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean E1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean F1(e eVar) {
        return (eVar == null || eVar.j() == null || !eVar.j().isStateful()) ? false : true;
    }

    private boolean G0() {
        return this.d0 && this.e0 != null && this.c0;
    }

    private void G1(AttributeSet attributeSet, int i, int i2) {
        TypedArray i3 = w.i(this.q0, attributeSet, m.C0, i, i2, new int[0]);
        this.S0 = i3.hasValue(m.o1);
        o2(c.a(this.q0, i3, m.b1));
        S1(c.a(this.q0, i3, m.O0));
        g2(i3.getDimension(m.W0, 0.0f));
        int i4 = m.P0;
        if (i3.hasValue(i4)) {
            U1(i3.getDimension(i4, 0.0f));
        }
        k2(c.a(this.q0, i3, m.Z0));
        m2(i3.getDimension(m.a1, 0.0f));
        L2(c.a(this.q0, i3, m.n1));
        Q2(i3.getText(m.I0));
        e g = c.g(this.q0, i3, m.D0);
        g.o(i3.getDimension(m.E0, g.k()));
        if (Build.VERSION.SDK_INT < 23) {
            g.n(c.a(this.q0, i3, m.F0));
        }
        R2(g);
        int i5 = i3.getInt(m.G0, 0);
        if (i5 == 1) {
            D2(TextUtils.TruncateAt.START);
        } else if (i5 == 2) {
            D2(TextUtils.TruncateAt.MIDDLE);
        } else if (i5 == 3) {
            D2(TextUtils.TruncateAt.END);
        }
        f2(i3.getBoolean(m.V0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            f2(i3.getBoolean(m.S0, false));
        }
        Y1(c.d(this.q0, i3, m.R0));
        int i6 = m.U0;
        if (i3.hasValue(i6)) {
            c2(c.a(this.q0, i3, i6));
        }
        a2(i3.getDimension(m.T0, -1.0f));
        B2(i3.getBoolean(m.i1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            B2(i3.getBoolean(m.d1, false));
        }
        p2(c.d(this.q0, i3, m.c1));
        z2(c.a(this.q0, i3, m.h1));
        u2(i3.getDimension(m.f1, 0.0f));
        K1(i3.getBoolean(m.J0, false));
        R1(i3.getBoolean(m.N0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            R1(i3.getBoolean(m.L0, false));
        }
        M1(c.d(this.q0, i3, m.K0));
        int i7 = m.M0;
        if (i3.hasValue(i7)) {
            O1(c.a(this.q0, i3, i7));
        }
        O2(ax.l6.h.b(this.q0, i3, m.p1));
        E2(ax.l6.h.b(this.q0, i3, m.k1));
        i2(i3.getDimension(m.Y0, 0.0f));
        I2(i3.getDimension(m.m1, 0.0f));
        G2(i3.getDimension(m.l1, 0.0f));
        W2(i3.getDimension(m.r1, 0.0f));
        T2(i3.getDimension(m.q1, 0.0f));
        w2(i3.getDimension(m.g1, 0.0f));
        r2(i3.getDimension(m.e1, 0.0f));
        W1(i3.getDimension(m.Q0, 0.0f));
        K2(i3.getDimensionPixelSize(m.H0, SubsamplingScaleImageView.TILE_SIZE_AUTO));
        i3.recycle();
    }

    public static a H0(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(context, attributeSet, i, i2);
        aVar.G1(attributeSet, i, i2);
        return aVar;
    }

    private void I0(Canvas canvas, Rect rect) {
        if (a3()) {
            x0(rect, this.u0);
            RectF rectF = this.u0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.e0.setBounds(0, 0, (int) this.u0.width(), (int) this.u0.height());
            this.e0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean I1(int[] r7, int[] r8) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.I1(int[], int[]):boolean");
    }

    private void J0(Canvas canvas, Rect rect) {
        if (this.S0) {
            return;
        }
        this.r0.setColor(this.z0);
        this.r0.setStyle(Paint.Style.FILL);
        this.r0.setColorFilter(x1());
        this.u0.set(rect);
        canvas.drawRoundRect(this.u0, U0(), U0(), this.r0);
    }

    private void K0(Canvas canvas, Rect rect) {
        if (b3()) {
            x0(rect, this.u0);
            RectF rectF = this.u0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.S.setBounds(0, 0, (int) this.u0.width(), (int) this.u0.height());
            this.S.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private void L0(Canvas canvas, Rect rect) {
        if (this.O <= 0.0f || this.S0) {
            return;
        }
        this.r0.setColor(this.B0);
        this.r0.setStyle(Paint.Style.STROKE);
        if (!this.S0) {
            this.r0.setColorFilter(x1());
        }
        RectF rectF = this.u0;
        float f = rect.left;
        float f2 = this.O;
        rectF.set(f + (f2 / 2.0f), rect.top + (f2 / 2.0f), rect.right - (f2 / 2.0f), rect.bottom - (f2 / 2.0f));
        float f3 = this.M - (this.O / 2.0f);
        canvas.drawRoundRect(this.u0, f3, f3, this.r0);
    }

    private void M0(Canvas canvas, Rect rect) {
        if (this.S0) {
            return;
        }
        this.r0.setColor(this.y0);
        this.r0.setStyle(Paint.Style.FILL);
        this.u0.set(rect);
        canvas.drawRoundRect(this.u0, U0(), U0(), this.r0);
    }

    private void N0(Canvas canvas, Rect rect) {
        if (c3()) {
            A0(rect, this.u0);
            RectF rectF = this.u0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.X.setBounds(0, 0, (int) this.u0.width(), (int) this.u0.height());
            this.Y.setBounds(this.X.getBounds());
            this.Y.jumpToCurrentState();
            this.Y.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private void O0(Canvas canvas, Rect rect) {
        this.r0.setColor(this.C0);
        this.r0.setStyle(Paint.Style.FILL);
        this.u0.set(rect);
        if (!this.S0) {
            canvas.drawRoundRect(this.u0, U0(), U0(), this.r0);
        } else {
            l(new RectF(rect), this.w0);
            super.u(canvas, this.r0, this.w0, x());
        }
    }

    private void P0(Canvas canvas, Rect rect) {
        Canvas canvas2;
        Paint paint = this.s0;
        if (paint != null) {
            paint.setColor(ax.T.a.k(-16777216, 127));
            canvas.drawRect(rect, this.s0);
            if (b3() || a3()) {
                x0(rect, this.u0);
                canvas.drawRect(this.u0, this.s0);
            }
            if (this.Q != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.s0);
            } else {
                canvas2 = canvas;
            }
            if (c3()) {
                A0(rect, this.u0);
                canvas2.drawRect(this.u0, this.s0);
            }
            this.s0.setColor(ax.T.a.k(-65536, 127));
            z0(rect, this.u0);
            canvas2.drawRect(this.u0, this.s0);
            this.s0.setColor(ax.T.a.k(-16711936, 127));
            B0(rect, this.u0);
            canvas2.drawRect(this.u0, this.s0);
        }
    }

    private void Q0(Canvas canvas, Rect rect) {
        if (this.Q != null) {
            Paint.Align F0 = F0(rect, this.v0);
            D0(rect, this.u0);
            if (this.x0.e() != null) {
                this.x0.g().drawableState = getState();
                this.x0.n(this.q0);
            }
            this.x0.g().setTextAlign(F0);
            int i = 0;
            boolean z = Math.round(this.x0.h(t1().toString())) > Math.round(this.u0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.u0);
            }
            CharSequence charSequence = this.Q;
            if (z && this.P0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.x0.g(), this.u0.width(), this.P0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.v0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.x0.g());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    private boolean a3() {
        return this.d0 && this.e0 != null && this.E0;
    }

    private boolean b3() {
        return this.R && this.S != null;
    }

    private boolean c3() {
        return this.W && this.X != null;
    }

    private void d3(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void e3() {
        this.N0 = this.M0 ? ax.L6.a.e(this.P) : null;
    }

    private void f3() {
        this.Y = new RippleDrawable(ax.L6.a.e(r1()), this.X, U0);
    }

    private float l1() {
        Drawable drawable = this.E0 ? this.e0 : this.S;
        float f = this.U;
        if (f <= 0.0f && drawable != null) {
            f = (float) Math.ceil(z.c(this.q0, 24));
            if (drawable.getIntrinsicHeight() <= f) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f;
    }

    private float m1() {
        Drawable drawable = this.E0 ? this.e0 : this.S;
        float f = this.U;
        return (f > 0.0f || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    private void o2(ColorStateList colorStateList) {
        if (this.J != colorStateList) {
            this.J = colorStateList;
            onStateChange(getState());
        }
    }

    private void w0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        ax.U.a.m(drawable, ax.U.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.X) {
            if (drawable.isStateful()) {
                drawable.setState(i1());
            }
            drawable.setTintList(this.Z);
            return;
        }
        Drawable drawable2 = this.S;
        if (drawable == drawable2 && this.V) {
            drawable2.setTintList(this.T);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void x0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (b3() || a3()) {
            float f = this.i0 + this.j0;
            float m1 = m1();
            if (ax.U.a.f(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + m1;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - m1;
            }
            float l1 = l1();
            float exactCenterY = rect.exactCenterY() - (l1 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + l1;
        }
    }

    private ColorFilter x1() {
        ColorFilter colorFilter = this.H0;
        return colorFilter != null ? colorFilter : this.I0;
    }

    private void z0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (c3()) {
            float f = this.p0 + this.o0 + this.a0 + this.n0 + this.m0;
            if (ax.U.a.f(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    private static boolean z1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public boolean A1() {
        return this.c0;
    }

    public void A2(int i) {
        z2(C2653a.a(this.q0, i));
    }

    public boolean B1() {
        return E1(this.X);
    }

    public void B2(boolean z) {
        if (this.W != z) {
            boolean c3 = c3();
            this.W = z;
            boolean c32 = c3();
            if (c3 != c32) {
                if (c32) {
                    w0(this.X);
                } else {
                    d3(this.X);
                }
                invalidateSelf();
                H1();
            }
        }
    }

    float C0() {
        if (c3()) {
            return this.n0 + this.a0 + this.o0;
        }
        return 0.0f;
    }

    public boolean C1() {
        return this.W;
    }

    public void C2(InterfaceC0551a interfaceC0551a) {
        this.O0 = new WeakReference<>(interfaceC0551a);
    }

    public void D2(TextUtils.TruncateAt truncateAt) {
        this.P0 = truncateAt;
    }

    public void E2(ax.l6.h hVar) {
        this.h0 = hVar;
    }

    Paint.Align F0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.Q != null) {
            float y0 = this.i0 + y0() + this.l0;
            if (ax.U.a.f(this) == 0) {
                pointF.x = rect.left + y0;
            } else {
                pointF.x = rect.right - y0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - E0();
        }
        return align;
    }

    public void F2(int i) {
        E2(ax.l6.h.c(this.q0, i));
    }

    public void G2(float f) {
        if (this.k0 != f) {
            float y0 = y0();
            this.k0 = f;
            float y02 = y0();
            invalidateSelf();
            if (y0 != y02) {
                H1();
            }
        }
    }

    protected void H1() {
        InterfaceC0551a interfaceC0551a = this.O0.get();
        if (interfaceC0551a != null) {
            interfaceC0551a.a();
        }
    }

    public void H2(int i) {
        G2(this.q0.getResources().getDimension(i));
    }

    public void I2(float f) {
        if (this.j0 != f) {
            float y0 = y0();
            this.j0 = f;
            float y02 = y0();
            invalidateSelf();
            if (y0 != y02) {
                H1();
            }
        }
    }

    boolean J1(boolean z) {
        if (this.X != null) {
            return y2(z ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : T0);
        }
        return false;
    }

    public void J2(int i) {
        I2(this.q0.getResources().getDimension(i));
    }

    public void K1(boolean z) {
        if (this.c0 != z) {
            this.c0 = z;
            float y0 = y0();
            if (!z && this.E0) {
                this.E0 = false;
            }
            float y02 = y0();
            invalidateSelf();
            if (y0 != y02) {
                H1();
            }
        }
    }

    public void K2(int i) {
        this.R0 = i;
    }

    public void L1(int i) {
        K1(this.q0.getResources().getBoolean(i));
    }

    public void L2(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            e3();
            onStateChange(getState());
        }
    }

    public void M1(Drawable drawable) {
        if (this.e0 != drawable) {
            float y0 = y0();
            this.e0 = drawable;
            float y02 = y0();
            d3(this.e0);
            w0(this.e0);
            invalidateSelf();
            if (y0 != y02) {
                H1();
            }
        }
    }

    public void M2(int i) {
        L2(C2653a.a(this.q0, i));
    }

    public void N1(int i) {
        M1(C2653a.b(this.q0, i));
    }

    void N2(boolean z) {
        this.Q0 = z;
    }

    public void O1(ColorStateList colorStateList) {
        if (this.f0 != colorStateList) {
            this.f0 = colorStateList;
            if (G0()) {
                this.e0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void O2(ax.l6.h hVar) {
        this.g0 = hVar;
    }

    public void P1(int i) {
        O1(C2653a.a(this.q0, i));
    }

    public void P2(int i) {
        O2(ax.l6.h.c(this.q0, i));
    }

    public void Q1(int i) {
        R1(this.q0.getResources().getBoolean(i));
    }

    public void Q2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (TextUtils.equals(this.Q, charSequence)) {
            return;
        }
        this.Q = charSequence;
        this.x0.m(true);
        invalidateSelf();
        H1();
    }

    public Drawable R0() {
        return this.e0;
    }

    public void R1(boolean z) {
        if (this.d0 != z) {
            boolean a3 = a3();
            this.d0 = z;
            boolean a32 = a3();
            if (a3 != a32) {
                if (a32) {
                    w0(this.e0);
                } else {
                    d3(this.e0);
                }
                invalidateSelf();
                H1();
            }
        }
    }

    public void R2(e eVar) {
        this.x0.k(eVar, this.q0);
    }

    public ColorStateList S0() {
        return this.f0;
    }

    public void S1(ColorStateList colorStateList) {
        if (this.K != colorStateList) {
            this.K = colorStateList;
            onStateChange(getState());
        }
    }

    public void S2(int i) {
        R2(new e(this.q0, i));
    }

    public ColorStateList T0() {
        return this.K;
    }

    public void T1(int i) {
        S1(C2653a.a(this.q0, i));
    }

    public void T2(float f) {
        if (this.m0 != f) {
            this.m0 = f;
            invalidateSelf();
            H1();
        }
    }

    public float U0() {
        return this.S0 ? N() : this.M;
    }

    @Deprecated
    public void U1(float f) {
        if (this.M != f) {
            this.M = f;
            setShapeAppearanceModel(I().x(f));
        }
    }

    public void U2(int i) {
        T2(this.q0.getResources().getDimension(i));
    }

    public float V0() {
        return this.p0;
    }

    @Deprecated
    public void V1(int i) {
        U1(this.q0.getResources().getDimension(i));
    }

    public void V2(float f) {
        e u1 = u1();
        if (u1 != null) {
            u1.o(f);
            this.x0.g().setTextSize(f);
            a();
        }
    }

    public Drawable W0() {
        Drawable drawable = this.S;
        if (drawable != null) {
            return ax.U.a.q(drawable);
        }
        return null;
    }

    public void W1(float f) {
        if (this.p0 != f) {
            this.p0 = f;
            invalidateSelf();
            H1();
        }
    }

    public void W2(float f) {
        if (this.l0 != f) {
            this.l0 = f;
            invalidateSelf();
            H1();
        }
    }

    public float X0() {
        return this.U;
    }

    public void X1(int i) {
        W1(this.q0.getResources().getDimension(i));
    }

    public void X2(int i) {
        W2(this.q0.getResources().getDimension(i));
    }

    public ColorStateList Y0() {
        return this.T;
    }

    public void Y1(Drawable drawable) {
        Drawable W0 = W0();
        if (W0 != drawable) {
            float y0 = y0();
            this.S = drawable != null ? ax.U.a.r(drawable).mutate() : null;
            float y02 = y0();
            d3(W0);
            if (b3()) {
                w0(this.S);
            }
            invalidateSelf();
            if (y0 != y02) {
                H1();
            }
        }
    }

    public void Y2(boolean z) {
        if (this.M0 != z) {
            this.M0 = z;
            e3();
            onStateChange(getState());
        }
    }

    public float Z0() {
        return this.L;
    }

    public void Z1(int i) {
        Y1(C2653a.b(this.q0, i));
    }

    boolean Z2() {
        return this.Q0;
    }

    @Override // ax.F6.u.b
    public void a() {
        H1();
        invalidateSelf();
    }

    public float a1() {
        return this.i0;
    }

    public void a2(float f) {
        if (this.U != f) {
            float y0 = y0();
            this.U = f;
            float y02 = y0();
            invalidateSelf();
            if (y0 != y02) {
                H1();
            }
        }
    }

    public ColorStateList b1() {
        return this.N;
    }

    public void b2(int i) {
        a2(this.q0.getResources().getDimension(i));
    }

    public float c1() {
        return this.O;
    }

    public void c2(ColorStateList colorStateList) {
        this.V = true;
        if (this.T != colorStateList) {
            this.T = colorStateList;
            if (b3()) {
                this.S.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public Drawable d1() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return ax.U.a.q(drawable);
        }
        return null;
    }

    public void d2(int i) {
        c2(C2653a.a(this.q0, i));
    }

    @Override // ax.O6.h, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        int i;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i2 = this.G0;
        if (i2 < 255) {
            canvas2 = canvas;
            i = C3053a.a(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i2);
        } else {
            canvas2 = canvas;
            i = 0;
        }
        M0(canvas2, bounds);
        J0(canvas2, bounds);
        if (this.S0) {
            super.draw(canvas2);
        }
        L0(canvas2, bounds);
        O0(canvas2, bounds);
        K0(canvas2, bounds);
        I0(canvas2, bounds);
        if (this.Q0) {
            Q0(canvas2, bounds);
        }
        N0(canvas2, bounds);
        P0(canvas2, bounds);
        if (this.G0 < 255) {
            canvas2.restoreToCount(i);
        }
    }

    public CharSequence e1() {
        return this.b0;
    }

    public void e2(int i) {
        f2(this.q0.getResources().getBoolean(i));
    }

    public float f1() {
        return this.o0;
    }

    public void f2(boolean z) {
        if (this.R != z) {
            boolean b3 = b3();
            this.R = z;
            boolean b32 = b3();
            if (b3 != b32) {
                if (b32) {
                    w0(this.S);
                } else {
                    d3(this.S);
                }
                invalidateSelf();
                H1();
            }
        }
    }

    public float g1() {
        return this.a0;
    }

    public void g2(float f) {
        if (this.L != f) {
            this.L = f;
            invalidateSelf();
            H1();
        }
    }

    @Override // ax.O6.h, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.G0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.H0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.L;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.i0 + y0() + this.l0 + this.x0.h(t1().toString()) + this.m0 + C0() + this.p0), this.R0);
    }

    @Override // ax.O6.h, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // ax.O6.h, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Outline outline2;
        if (this.S0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.M);
        } else {
            outline.setRoundRect(bounds, this.M);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    public float h1() {
        return this.n0;
    }

    public void h2(int i) {
        g2(this.q0.getResources().getDimension(i));
    }

    public int[] i1() {
        return this.L0;
    }

    public void i2(float f) {
        if (this.i0 != f) {
            this.i0 = f;
            invalidateSelf();
            H1();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // ax.O6.h, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (D1(this.J) || D1(this.K) || D1(this.N)) {
            return true;
        }
        return (this.M0 && D1(this.N0)) || F1(this.x0.e()) || G0() || E1(this.S) || E1(this.e0) || D1(this.J0);
    }

    public ColorStateList j1() {
        return this.Z;
    }

    public void j2(int i) {
        i2(this.q0.getResources().getDimension(i));
    }

    public void k1(RectF rectF) {
        B0(getBounds(), rectF);
    }

    public void k2(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            if (this.S0) {
                o0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void l2(int i) {
        k2(C2653a.a(this.q0, i));
    }

    public void m2(float f) {
        if (this.O != f) {
            this.O = f;
            this.r0.setStrokeWidth(f);
            if (this.S0) {
                super.p0(f);
            }
            invalidateSelf();
        }
    }

    public TextUtils.TruncateAt n1() {
        return this.P0;
    }

    public void n2(int i) {
        m2(this.q0.getResources().getDimension(i));
    }

    public ax.l6.h o1() {
        return this.h0;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (b3()) {
            onLayoutDirectionChanged |= ax.U.a.m(this.S, i);
        }
        if (a3()) {
            onLayoutDirectionChanged |= ax.U.a.m(this.e0, i);
        }
        if (c3()) {
            onLayoutDirectionChanged |= ax.U.a.m(this.X, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (b3()) {
            onLevelChange |= this.S.setLevel(i);
        }
        if (a3()) {
            onLevelChange |= this.e0.setLevel(i);
        }
        if (c3()) {
            onLevelChange |= this.X.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // ax.O6.h, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.S0) {
            super.onStateChange(iArr);
        }
        return I1(iArr, i1());
    }

    public float p1() {
        return this.k0;
    }

    public void p2(Drawable drawable) {
        Drawable d1 = d1();
        if (d1 != drawable) {
            float C0 = C0();
            this.X = drawable != null ? ax.U.a.r(drawable).mutate() : null;
            f3();
            float C02 = C0();
            d3(d1);
            if (c3()) {
                w0(this.X);
            }
            invalidateSelf();
            if (C0 != C02) {
                H1();
            }
        }
    }

    public float q1() {
        return this.j0;
    }

    public void q2(CharSequence charSequence) {
        if (this.b0 != charSequence) {
            this.b0 = C1263a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public ColorStateList r1() {
        return this.P;
    }

    public void r2(float f) {
        if (this.o0 != f) {
            this.o0 = f;
            invalidateSelf();
            if (c3()) {
                H1();
            }
        }
    }

    public ax.l6.h s1() {
        return this.g0;
    }

    public void s2(int i) {
        r2(this.q0.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // ax.O6.h, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.G0 != i) {
            this.G0 = i;
            invalidateSelf();
        }
    }

    @Override // ax.O6.h, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.H0 != colorFilter) {
            this.H0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // ax.O6.h, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.J0 != colorStateList) {
            this.J0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // ax.O6.h, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.K0 != mode) {
            this.K0 = mode;
            this.I0 = f.l(this, this.J0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (b3()) {
            visible |= this.S.setVisible(z, z2);
        }
        if (a3()) {
            visible |= this.e0.setVisible(z, z2);
        }
        if (c3()) {
            visible |= this.X.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public CharSequence t1() {
        return this.Q;
    }

    public void t2(int i) {
        p2(C2653a.b(this.q0, i));
    }

    public e u1() {
        return this.x0.e();
    }

    public void u2(float f) {
        if (this.a0 != f) {
            this.a0 = f;
            invalidateSelf();
            if (c3()) {
                H1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public float v1() {
        return this.m0;
    }

    public void v2(int i) {
        u2(this.q0.getResources().getDimension(i));
    }

    public float w1() {
        return this.l0;
    }

    public void w2(float f) {
        if (this.n0 != f) {
            this.n0 = f;
            invalidateSelf();
            if (c3()) {
                H1();
            }
        }
    }

    public void x2(int i) {
        w2(this.q0.getResources().getDimension(i));
    }

    float y0() {
        if (b3() || a3()) {
            return this.j0 + m1() + this.k0;
        }
        return 0.0f;
    }

    public boolean y1() {
        return this.M0;
    }

    public boolean y2(int[] iArr) {
        if (Arrays.equals(this.L0, iArr)) {
            return false;
        }
        this.L0 = iArr;
        if (c3()) {
            return I1(getState(), iArr);
        }
        return false;
    }

    public void z2(ColorStateList colorStateList) {
        if (this.Z != colorStateList) {
            this.Z = colorStateList;
            if (c3()) {
                this.X.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }
}
