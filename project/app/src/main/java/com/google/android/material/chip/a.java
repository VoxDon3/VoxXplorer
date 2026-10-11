/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.chip;

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
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import ax.C6.f;
import ax.F6.u;
import ax.F6.w;
import ax.F6.z;
import ax.K6.c;
import ax.K6.e;
import ax.U.b;
import ax.k6.m;
import ax.l6.h;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class a
extends ax.O6.h
implements b,
Drawable.Callback,
u.b {
    private static final int[] T0 = new int[]{16842910};
    private static final ShapeDrawable U0 = new ShapeDrawable((Shape)new OvalShape());
    private int A0;
    private int B0;
    private int C0;
    private int D0;
    private boolean E0;
    private int F0;
    private int G0 = 255;
    private ColorFilter H0;
    private PorterDuffColorFilter I0;
    private ColorStateList J;
    private ColorStateList J0;
    private ColorStateList K;
    private PorterDuff.Mode K0;
    private float L;
    private int[] L0;
    private float M = -1.0f;
    private boolean M0;
    private ColorStateList N;
    private ColorStateList N0;
    private float O;
    private WeakReference<a> O0;
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
    private h g0;
    private h h0;
    private float i0;
    private float j0;
    private float k0;
    private float l0;
    private float m0;
    private float n0;
    private float o0;
    private float p0;
    private final Context q0;
    private final Paint r0 = new Paint(1);
    private final Paint s0;
    private final Paint.FontMetrics t0 = new Paint.FontMetrics();
    private final RectF u0 = new RectF();
    private final PointF v0 = new PointF();
    private final Path w0 = new Path();
    private final u x0;
    private int y0;
    private int z0;

    private a(Context object, AttributeSet object2, int n8, int n9) {
        super((Context)object, (AttributeSet)object2, n8, n9);
        this.K0 = PorterDuff.Mode.SRC_IN;
        this.O0 = new WeakReference<Object>(null);
        this.U((Context)object);
        this.q0 = object;
        object2 = new u(this);
        this.x0 = object2;
        this.Q = "";
        ((u)object2).g().density = object.getResources().getDisplayMetrics().density;
        this.s0 = null;
        object = T0;
        this.setState((int[])object);
        this.y2((int[])object);
        this.Q0 = true;
        U0.setTint(-1);
    }

    private void A0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.c3()) {
            float f8 = this.p0 + this.o0;
            if (ax.U.a.f(this) == 0) {
                rectF.right = f8 = (float)rect.right - f8;
                rectF.left = f8 - this.a0;
            } else {
                rectF.left = f8 = (float)rect.left + f8;
                rectF.right = f8 + this.a0;
            }
            float f9 = rect.exactCenterY();
            f8 = this.a0;
            rectF.top = f9 -= f8 / 2.0f;
            rectF.bottom = f9 + f8;
        }
    }

    private void B0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.c3()) {
            float f8 = this.p0 + this.o0 + this.a0 + this.n0 + this.m0;
            if (ax.U.a.f(this) == 0) {
                float f9;
                rectF.right = f9 = (float)rect.right;
                rectF.left = f9 - f8;
            } else {
                int n8 = rect.left;
                rectF.left = n8;
                rectF.right = (float)n8 + f8;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void D0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.Q != null) {
            float f8 = this.i0 + this.y0() + this.l0;
            float f9 = this.p0 + this.C0() + this.m0;
            if (ax.U.a.f(this) == 0) {
                rectF.left = (float)rect.left + f8;
                rectF.right = (float)rect.right - f9;
            } else {
                rectF.left = (float)rect.left + f9;
                rectF.right = (float)rect.right - f8;
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

    private static boolean F1(e e8) {
        return e8 != null && e8.j() != null && e8.j().isStateful();
    }

    private boolean G0() {
        return this.d0 && this.e0 != null && this.c0;
    }

    private void G1(AttributeSet attributeSet, int n8, int n9) {
        TypedArray typedArray = w.i(this.q0, attributeSet, m.C0, n8, n9, new int[0]);
        this.S0 = typedArray.hasValue(m.o1);
        this.o2(c.a(this.q0, typedArray, m.b1));
        this.S1(c.a(this.q0, typedArray, m.O0));
        this.g2(typedArray.getDimension(m.W0, 0.0f));
        n8 = m.P0;
        if (typedArray.hasValue(n8)) {
            this.U1(typedArray.getDimension(n8, 0.0f));
        }
        this.k2(c.a(this.q0, typedArray, m.Z0));
        this.m2(typedArray.getDimension(m.a1, 0.0f));
        this.L2(c.a(this.q0, typedArray, m.n1));
        this.Q2(typedArray.getText(m.I0));
        e e8 = c.g(this.q0, typedArray, m.D0);
        e8.o(typedArray.getDimension(m.E0, e8.k()));
        if (Build.VERSION.SDK_INT < 23) {
            e8.n(c.a(this.q0, typedArray, m.F0));
        }
        this.R2(e8);
        n8 = typedArray.getInt(m.G0, 0);
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 == 3) {
                    this.D2(TextUtils.TruncateAt.END);
                }
            } else {
                this.D2(TextUtils.TruncateAt.MIDDLE);
            }
        } else {
            this.D2(TextUtils.TruncateAt.START);
        }
        this.f2(typedArray.getBoolean(m.V0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            this.f2(typedArray.getBoolean(m.S0, false));
        }
        this.Y1(c.d(this.q0, typedArray, m.R0));
        n8 = m.U0;
        if (typedArray.hasValue(n8)) {
            this.c2(c.a(this.q0, typedArray, n8));
        }
        this.a2(typedArray.getDimension(m.T0, -1.0f));
        this.B2(typedArray.getBoolean(m.i1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            this.B2(typedArray.getBoolean(m.d1, false));
        }
        this.p2(c.d(this.q0, typedArray, m.c1));
        this.z2(c.a(this.q0, typedArray, m.h1));
        this.u2(typedArray.getDimension(m.f1, 0.0f));
        this.K1(typedArray.getBoolean(m.J0, false));
        this.R1(typedArray.getBoolean(m.N0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            this.R1(typedArray.getBoolean(m.L0, false));
        }
        this.M1(c.d(this.q0, typedArray, m.K0));
        n8 = m.M0;
        if (typedArray.hasValue(n8)) {
            this.O1(c.a(this.q0, typedArray, n8));
        }
        this.O2(h.b(this.q0, typedArray, m.p1));
        this.E2(h.b(this.q0, typedArray, m.k1));
        this.i2(typedArray.getDimension(m.Y0, 0.0f));
        this.I2(typedArray.getDimension(m.m1, 0.0f));
        this.G2(typedArray.getDimension(m.l1, 0.0f));
        this.W2(typedArray.getDimension(m.r1, 0.0f));
        this.T2(typedArray.getDimension(m.q1, 0.0f));
        this.w2(typedArray.getDimension(m.g1, 0.0f));
        this.r2(typedArray.getDimension(m.e1, 0.0f));
        this.W1(typedArray.getDimension(m.Q0, 0.0f));
        this.K2(typedArray.getDimensionPixelSize(m.H0, Integer.MAX_VALUE));
        typedArray.recycle();
    }

    public static a H0(Context object, AttributeSet attributeSet, int n8, int n9) {
        object = new a((Context)object, attributeSet, n8, n9);
        super.G1(attributeSet, n8, n9);
        return object;
    }

    private void I0(Canvas canvas, Rect rect) {
        if (this.a3()) {
            this.x0(rect, this.u0);
            rect = this.u0;
            float f8 = rect.left;
            float f9 = rect.top;
            canvas.translate(f8, f9);
            this.e0.setBounds(0, 0, (int)this.u0.width(), (int)this.u0.height());
            this.e0.draw(canvas);
            canvas.translate(-f8, -f9);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean I1(int[] var1_1, int[] var2_2) {
        var7_3 = super.onStateChange(var1_1);
        var11_4 /* !! */  = this.J;
        var4_5 = var11_4 /* !! */  != null ? var11_4 /* !! */ .getColorForState(var1_1, this.y0) : 0;
        var5_6 = this.q(var4_5);
        var4_5 = this.y0;
        var10_7 = true;
        if (var4_5 != var5_6) {
            this.y0 = var5_6;
            var7_3 = true;
        }
        var4_5 = (var11_4 /* !! */  = this.K) != null ? var11_4 /* !! */ .getColorForState(var1_1, this.z0) : 0;
        if (this.z0 != (var4_5 = this.q(var4_5))) {
            this.z0 = var4_5;
            var7_3 = true;
        }
        var4_5 = this.A0 != (var6_8 = ax.z6.a.j(var5_6, var4_5)) ? 1 : 0;
        var5_6 = this.B() == null ? 1 : 0;
        var8_9 = var7_3;
        if ((var4_5 | var5_6) != 0) {
            this.A0 = var6_8;
            this.g0(ColorStateList.valueOf((int)var6_8));
            var8_9 = true;
        }
        if (this.B0 != (var4_5 = (var11_4 /* !! */  = this.N) != null ? var11_4 /* !! */ .getColorForState(var1_1, this.B0) : 0)) {
            this.B0 = var4_5;
            var8_9 = true;
        }
        var4_5 = this.N0 != null && ax.L6.a.f(var1_1) != false ? this.N0.getColorForState(var1_1, this.C0) : 0;
        var7_3 = var8_9;
        if (this.C0 != var4_5) {
            this.C0 = var4_5;
            var7_3 = var8_9;
            if (this.M0) {
                var7_3 = true;
            }
        }
        if (this.D0 != (var4_5 = this.x0.e() != null && this.x0.e().j() != null ? this.x0.e().j().getColorForState(var1_1, this.D0) : 0)) {
            this.D0 = var4_5;
            var7_3 = true;
        }
        var9_10 = a.z1(this.getState(), 0x10100A0) != false && this.c0 != false;
        var8_9 = var7_3;
        if (this.E0 == var9_10) ** GOTO lbl46
        var8_9 = var7_3;
        if (this.e0 == null) ** GOTO lbl46
        var3_11 = this.y0();
        this.E0 = var9_10;
        if (var3_11 != this.y0()) {
            var8_9 = true;
            var4_5 = 1;
        } else {
            var8_9 = true;
lbl46:
            // 3 sources

            var4_5 = 0;
        }
        var11_4 /* !! */  = this.J0;
        var5_6 = var11_4 /* !! */  != null ? var11_4 /* !! */ .getColorForState(var1_1, this.F0) : 0;
        if (this.F0 != var5_6) {
            this.F0 = var5_6;
            this.I0 = f.l(this, this.J0, this.K0);
            var8_9 = var10_7;
        }
        var7_3 = var8_9;
        if (a.E1(this.S)) {
            var7_3 = var8_9 | this.S.setState(var1_1);
        }
        var8_9 = var7_3;
        if (a.E1(this.e0)) {
            var8_9 = var7_3 | this.e0.setState(var1_1);
        }
        var7_3 = var8_9;
        if (a.E1(this.X)) {
            var11_4 /* !! */  = (ColorStateList)new int[var1_1.length + var2_2.length];
            System.arraycopy(var1_1, 0, var11_4 /* !! */ , 0, var1_1.length);
            System.arraycopy(var2_2, 0, var11_4 /* !! */ , var1_1.length, var2_2.length);
            var7_3 = var8_9 | this.X.setState((int[])var11_4 /* !! */ );
        }
        var8_9 = var7_3;
        if (a.E1(this.Y)) {
            var8_9 = var7_3 | this.Y.setState(var2_2);
        }
        if (var8_9) {
            this.invalidateSelf();
        }
        if (var4_5 != 0) {
            this.H1();
        }
        return var8_9;
    }

    private void J0(Canvas canvas, Rect rect) {
        if (!this.S0) {
            this.r0.setColor(this.z0);
            this.r0.setStyle(Paint.Style.FILL);
            this.r0.setColorFilter(this.x1());
            this.u0.set(rect);
            canvas.drawRoundRect(this.u0, this.U0(), this.U0(), this.r0);
        }
    }

    private void K0(Canvas canvas, Rect rect) {
        if (this.b3()) {
            this.x0(rect, this.u0);
            rect = this.u0;
            float f8 = rect.left;
            float f9 = rect.top;
            canvas.translate(f8, f9);
            this.S.setBounds(0, 0, (int)this.u0.width(), (int)this.u0.height());
            this.S.draw(canvas);
            canvas.translate(-f8, -f9);
        }
    }

    private void L0(Canvas canvas, Rect rect) {
        if (this.O > 0.0f && !this.S0) {
            this.r0.setColor(this.B0);
            this.r0.setStyle(Paint.Style.STROKE);
            if (!this.S0) {
                this.r0.setColorFilter(this.x1());
            }
            RectF rectF = this.u0;
            float f8 = rect.left;
            float f9 = this.O;
            rectF.set(f8 + f9 / 2.0f, (float)rect.top + f9 / 2.0f, (float)rect.right - f9 / 2.0f, (float)rect.bottom - f9 / 2.0f);
            f9 = this.M - this.O / 2.0f;
            canvas.drawRoundRect(this.u0, f9, f9, this.r0);
        }
    }

    private void M0(Canvas canvas, Rect rect) {
        if (!this.S0) {
            this.r0.setColor(this.y0);
            this.r0.setStyle(Paint.Style.FILL);
            this.u0.set(rect);
            canvas.drawRoundRect(this.u0, this.U0(), this.U0(), this.r0);
        }
    }

    private void N0(Canvas canvas, Rect rect) {
        if (this.c3()) {
            this.A0(rect, this.u0);
            rect = this.u0;
            float f8 = rect.left;
            float f9 = rect.top;
            canvas.translate(f8, f9);
            this.X.setBounds(0, 0, (int)this.u0.width(), (int)this.u0.height());
            this.Y.setBounds(this.X.getBounds());
            this.Y.jumpToCurrentState();
            this.Y.draw(canvas);
            canvas.translate(-f8, -f9);
        }
    }

    private void O0(Canvas canvas, Rect rect) {
        this.r0.setColor(this.C0);
        this.r0.setStyle(Paint.Style.FILL);
        this.u0.set(rect);
        if (!this.S0) {
            canvas.drawRoundRect(this.u0, this.U0(), this.U0(), this.r0);
            return;
        }
        this.l(new RectF(rect), this.w0);
        super.u(canvas, this.r0, this.w0, this.x());
    }

    private void P0(Canvas canvas, Rect rect) {
        Paint paint = this.s0;
        if (paint != null) {
            paint.setColor(ax.T.a.k(-16777216, 127));
            canvas.drawRect(rect, this.s0);
            if (this.b3() || this.a3()) {
                this.x0(rect, this.u0);
                canvas.drawRect(this.u0, this.s0);
            }
            if (this.Q != null) {
                canvas.drawLine((float)rect.left, rect.exactCenterY(), (float)rect.right, rect.exactCenterY(), this.s0);
            }
            if (this.c3()) {
                this.A0(rect, this.u0);
                canvas.drawRect(this.u0, this.s0);
            }
            this.s0.setColor(ax.T.a.k(-65536, 127));
            this.z0(rect, this.u0);
            canvas.drawRect(this.u0, this.s0);
            this.s0.setColor(ax.T.a.k(-16711936, 127));
            this.B0(rect, this.u0);
            canvas.drawRect(this.u0, this.s0);
        }
    }

    private void Q0(Canvas canvas, Rect object) {
        if (this.Q != null) {
            Object object2 = this.F0((Rect)object, this.v0);
            this.D0((Rect)object, this.u0);
            if (this.x0.e() != null) {
                this.x0.g().drawableState = this.getState();
                this.x0.n(this.q0);
            }
            this.x0.g().setTextAlign(object2);
            int n8 = Math.round(this.x0.h(this.t1().toString()));
            int n9 = Math.round(this.u0.width());
            int n10 = 0;
            n9 = n8 > n9 ? 1 : 0;
            if (n9 != 0) {
                n10 = canvas.save();
                canvas.clipRect(this.u0);
            }
            object2 = this.Q;
            object = object2;
            if (n9 != 0) {
                object = object2;
                if (this.P0 != null) {
                    object = TextUtils.ellipsize((CharSequence)object2, (TextPaint)this.x0.g(), (float)this.u0.width(), (TextUtils.TruncateAt)this.P0);
                }
            }
            n8 = object.length();
            object2 = this.v0;
            canvas.drawText((CharSequence)object, 0, n8, object2.x, object2.y, (Paint)this.x0.g());
            if (n9 != 0) {
                canvas.restoreToCount(n10);
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
        ColorStateList colorStateList = this.M0 ? ax.L6.a.e(this.P) : null;
        this.N0 = colorStateList;
    }

    private void f3() {
        this.Y = new RippleDrawable(ax.L6.a.e(this.r1()), this.X, (Drawable)U0);
    }

    private float l1() {
        float f8;
        Drawable drawable = this.E0 ? this.e0 : this.S;
        float f9 = f8 = this.U;
        if (f8 <= 0.0f) {
            f9 = f8;
            if (drawable != null) {
                f9 = f8 = (float)Math.ceil(z.c(this.q0, 24));
                if ((float)drawable.getIntrinsicHeight() <= f8) {
                    return drawable.getIntrinsicHeight();
                }
            }
        }
        return f9;
    }

    private float m1() {
        Drawable drawable = this.E0 ? this.e0 : this.S;
        float f8 = this.U;
        if (f8 <= 0.0f && drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return f8;
    }

    private void o2(ColorStateList colorStateList) {
        if (this.J != colorStateList) {
            this.J = colorStateList;
            this.onStateChange(this.getState());
        }
    }

    private void w0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback)this);
            ax.U.a.m(drawable, ax.U.a.f(this));
            drawable.setLevel(this.getLevel());
            drawable.setVisible(this.isVisible(), false);
            if (drawable == this.X) {
                if (drawable.isStateful()) {
                    drawable.setState(this.i1());
                }
                drawable.setTintList(this.Z);
                return;
            }
            Drawable drawable2 = this.S;
            if (drawable == drawable2 && this.V) {
                drawable2.setTintList(this.T);
            }
            if (drawable.isStateful()) {
                drawable.setState(this.getState());
            }
        }
    }

    private void x0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (!this.b3() && !this.a3()) {
            return;
        }
        float f8 = this.i0 + this.j0;
        float f9 = this.m1();
        if (ax.U.a.f(this) == 0) {
            rectF.left = f8 = (float)rect.left + f8;
            rectF.right = f8 + f9;
        } else {
            rectF.right = f8 = (float)rect.right - f8;
            rectF.left = f8 - f9;
        }
        f8 = this.l1();
        rectF.top = f9 = rect.exactCenterY() - f8 / 2.0f;
        rectF.bottom = f9 + f8;
    }

    private ColorFilter x1() {
        ColorFilter colorFilter = this.H0;
        if (colorFilter != null) {
            return colorFilter;
        }
        return this.I0;
    }

    private void z0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (this.c3()) {
            float f8 = this.p0 + this.o0 + this.a0 + this.n0 + this.m0;
            if (ax.U.a.f(this) == 0) {
                rectF.right = (float)rect.right - f8;
                return;
            }
            rectF.left = (float)rect.left + f8;
        }
    }

    private static boolean z1(int[] nArray, int n8) {
        if (nArray == null) {
            return false;
        }
        int n9 = nArray.length;
        for (int i8 = 0; i8 < n9; ++i8) {
            if (nArray[i8] != n8) continue;
            return true;
        }
        return false;
    }

    public boolean A1() {
        return this.c0;
    }

    public void A2(int n8) {
        this.z2(ax.o.a.a(this.q0, n8));
    }

    public boolean B1() {
        return a.E1(this.X);
    }

    public void B2(boolean bl) {
        if (this.W != bl) {
            boolean bl2 = this.c3();
            this.W = bl;
            bl = this.c3();
            if (bl2 != bl) {
                if (bl) {
                    this.w0(this.X);
                } else {
                    this.d3(this.X);
                }
                this.invalidateSelf();
                this.H1();
            }
        }
    }

    float C0() {
        if (this.c3()) {
            return this.n0 + this.a0 + this.o0;
        }
        return 0.0f;
    }

    public boolean C1() {
        return this.W;
    }

    public void C2(a a8) {
        this.O0 = new WeakReference<a>(a8);
    }

    public void D2(TextUtils.TruncateAt truncateAt) {
        this.P0 = truncateAt;
    }

    public void E2(h h8) {
        this.h0 = h8;
    }

    Paint.Align F0(Rect rect, PointF pointF) {
        Paint.Align align;
        pointF.set(0.0f, 0.0f);
        Paint.Align align2 = align = Paint.Align.LEFT;
        if (this.Q != null) {
            float f8 = this.i0 + this.y0() + this.l0;
            if (ax.U.a.f(this) == 0) {
                pointF.x = (float)rect.left + f8;
            } else {
                pointF.x = (float)rect.right - f8;
                align = Paint.Align.RIGHT;
            }
            pointF.y = (float)rect.centerY() - this.E0();
            align2 = align;
        }
        return align2;
    }

    public void F2(int n8) {
        this.E2(h.c(this.q0, n8));
    }

    public void G2(float f8) {
        if (this.k0 != f8) {
            float f9 = this.y0();
            this.k0 = f8;
            f8 = this.y0();
            this.invalidateSelf();
            if (f9 != f8) {
                this.H1();
            }
        }
    }

    protected void H1() {
        a a8 = (a)this.O0.get();
        if (a8 != null) {
            a8.a();
        }
    }

    public void H2(int n8) {
        this.G2(this.q0.getResources().getDimension(n8));
    }

    public void I2(float f8) {
        if (this.j0 != f8) {
            float f9 = this.y0();
            this.j0 = f8;
            f8 = this.y0();
            this.invalidateSelf();
            if (f9 != f8) {
                this.H1();
            }
        }
    }

    boolean J1(boolean bl) {
        if (this.X != null) {
            int[] nArray = bl ? new int[]{16842919, 16842910} : T0;
            return this.y2(nArray);
        }
        return false;
    }

    public void J2(int n8) {
        this.I2(this.q0.getResources().getDimension(n8));
    }

    public void K1(boolean bl) {
        if (this.c0 != bl) {
            this.c0 = bl;
            float f8 = this.y0();
            if (!bl && this.E0) {
                this.E0 = false;
            }
            float f9 = this.y0();
            this.invalidateSelf();
            if (f8 != f9) {
                this.H1();
            }
        }
    }

    public void K2(int n8) {
        this.R0 = n8;
    }

    public void L1(int n8) {
        this.K1(this.q0.getResources().getBoolean(n8));
    }

    public void L2(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            this.e3();
            this.onStateChange(this.getState());
        }
    }

    public void M1(Drawable drawable) {
        if (this.e0 != drawable) {
            float f8 = this.y0();
            this.e0 = drawable;
            float f9 = this.y0();
            this.d3(this.e0);
            this.w0(this.e0);
            this.invalidateSelf();
            if (f8 != f9) {
                this.H1();
            }
        }
    }

    public void M2(int n8) {
        this.L2(ax.o.a.a(this.q0, n8));
    }

    public void N1(int n8) {
        this.M1(ax.o.a.b(this.q0, n8));
    }

    void N2(boolean bl) {
        this.Q0 = bl;
    }

    public void O1(ColorStateList colorStateList) {
        if (this.f0 != colorStateList) {
            this.f0 = colorStateList;
            if (this.G0()) {
                this.e0.setTintList(colorStateList);
            }
            this.onStateChange(this.getState());
        }
    }

    public void O2(h h8) {
        this.g0 = h8;
    }

    public void P1(int n8) {
        this.O1(ax.o.a.a(this.q0, n8));
    }

    public void P2(int n8) {
        this.O2(h.c(this.q0, n8));
    }

    public void Q1(int n8) {
        this.R1(this.q0.getResources().getBoolean(n8));
    }

    public void Q2(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            charSequence2 = "";
        }
        if (!TextUtils.equals((CharSequence)this.Q, (CharSequence)charSequence2)) {
            this.Q = charSequence2;
            this.x0.m(true);
            this.invalidateSelf();
            this.H1();
        }
    }

    public Drawable R0() {
        return this.e0;
    }

    public void R1(boolean bl) {
        if (this.d0 != bl) {
            boolean bl2 = this.a3();
            this.d0 = bl;
            bl = this.a3();
            if (bl2 != bl) {
                if (bl) {
                    this.w0(this.e0);
                } else {
                    this.d3(this.e0);
                }
                this.invalidateSelf();
                this.H1();
            }
        }
    }

    public void R2(e e8) {
        this.x0.k(e8, this.q0);
    }

    public ColorStateList S0() {
        return this.f0;
    }

    public void S1(ColorStateList colorStateList) {
        if (this.K != colorStateList) {
            this.K = colorStateList;
            this.onStateChange(this.getState());
        }
    }

    public void S2(int n8) {
        this.R2(new e(this.q0, n8));
    }

    public ColorStateList T0() {
        return this.K;
    }

    public void T1(int n8) {
        this.S1(ax.o.a.a(this.q0, n8));
    }

    public void T2(float f8) {
        if (this.m0 != f8) {
            this.m0 = f8;
            this.invalidateSelf();
            this.H1();
        }
    }

    public float U0() {
        if (this.S0) {
            return this.N();
        }
        return this.M;
    }

    @Deprecated
    public void U1(float f8) {
        if (this.M != f8) {
            this.M = f8;
            this.setShapeAppearanceModel(this.I().x(f8));
        }
    }

    public void U2(int n8) {
        this.T2(this.q0.getResources().getDimension(n8));
    }

    public float V0() {
        return this.p0;
    }

    @Deprecated
    public void V1(int n8) {
        this.U1(this.q0.getResources().getDimension(n8));
    }

    public void V2(float f8) {
        e e8 = this.u1();
        if (e8 != null) {
            e8.o(f8);
            this.x0.g().setTextSize(f8);
            this.a();
        }
    }

    public Drawable W0() {
        Drawable drawable = this.S;
        if (drawable != null) {
            return ax.U.a.q(drawable);
        }
        return null;
    }

    public void W1(float f8) {
        if (this.p0 != f8) {
            this.p0 = f8;
            this.invalidateSelf();
            this.H1();
        }
    }

    public void W2(float f8) {
        if (this.l0 != f8) {
            this.l0 = f8;
            this.invalidateSelf();
            this.H1();
        }
    }

    public float X0() {
        return this.U;
    }

    public void X1(int n8) {
        this.W1(this.q0.getResources().getDimension(n8));
    }

    public void X2(int n8) {
        this.W2(this.q0.getResources().getDimension(n8));
    }

    public ColorStateList Y0() {
        return this.T;
    }

    public void Y1(Drawable object) {
        Drawable drawable = this.W0();
        if (drawable != object) {
            float f8 = this.y0();
            object = object != null ? ax.U.a.r(object).mutate() : null;
            this.S = object;
            float f9 = this.y0();
            this.d3(drawable);
            if (this.b3()) {
                this.w0(this.S);
            }
            this.invalidateSelf();
            if (f8 != f9) {
                this.H1();
            }
        }
    }

    public void Y2(boolean bl) {
        if (this.M0 != bl) {
            this.M0 = bl;
            this.e3();
            this.onStateChange(this.getState());
        }
    }

    public float Z0() {
        return this.L;
    }

    public void Z1(int n8) {
        this.Y1(ax.o.a.b(this.q0, n8));
    }

    boolean Z2() {
        return this.Q0;
    }

    @Override
    public void a() {
        this.H1();
        this.invalidateSelf();
    }

    public float a1() {
        return this.i0;
    }

    public void a2(float f8) {
        if (this.U != f8) {
            float f9 = this.y0();
            this.U = f8;
            f8 = this.y0();
            this.invalidateSelf();
            if (f9 != f8) {
                this.H1();
            }
        }
    }

    public ColorStateList b1() {
        return this.N;
    }

    public void b2(int n8) {
        this.a2(this.q0.getResources().getDimension(n8));
    }

    public float c1() {
        return this.O;
    }

    public void c2(ColorStateList colorStateList) {
        this.V = true;
        if (this.T != colorStateList) {
            this.T = colorStateList;
            if (this.b3()) {
                this.S.setTintList(colorStateList);
            }
            this.onStateChange(this.getState());
        }
    }

    public Drawable d1() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return ax.U.a.q(drawable);
        }
        return null;
    }

    public void d2(int n8) {
        this.c2(ax.o.a.a(this.q0, n8));
    }

    @Override
    public void draw(Canvas canvas) {
        Rect rect = this.getBounds();
        if (!rect.isEmpty() && this.getAlpha() != 0) {
            int n8 = this.G0;
            n8 = n8 < 255 ? ax.s6.a.a(canvas, rect.left, rect.top, rect.right, rect.bottom, n8) : 0;
            this.M0(canvas, rect);
            this.J0(canvas, rect);
            if (this.S0) {
                super.draw(canvas);
            }
            this.L0(canvas, rect);
            this.O0(canvas, rect);
            this.K0(canvas, rect);
            this.I0(canvas, rect);
            if (this.Q0) {
                this.Q0(canvas, rect);
            }
            this.N0(canvas, rect);
            this.P0(canvas, rect);
            if (this.G0 < 255) {
                canvas.restoreToCount(n8);
            }
        }
    }

    public CharSequence e1() {
        return this.b0;
    }

    public void e2(int n8) {
        this.f2(this.q0.getResources().getBoolean(n8));
    }

    public float f1() {
        return this.o0;
    }

    public void f2(boolean bl) {
        if (this.R != bl) {
            boolean bl2 = this.b3();
            this.R = bl;
            bl = this.b3();
            if (bl2 != bl) {
                if (bl) {
                    this.w0(this.S);
                } else {
                    this.d3(this.S);
                }
                this.invalidateSelf();
                this.H1();
            }
        }
    }

    public float g1() {
        return this.a0;
    }

    public void g2(float f8) {
        if (this.L != f8) {
            this.L = f8;
            this.invalidateSelf();
            this.H1();
        }
    }

    @Override
    public int getAlpha() {
        return this.G0;
    }

    public ColorFilter getColorFilter() {
        return this.H0;
    }

    public int getIntrinsicHeight() {
        return (int)this.L;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.i0 + this.y0() + this.l0 + this.x0.h(this.t1().toString()) + this.m0 + this.C0() + this.p0), this.R0);
    }

    @Override
    public int getOpacity() {
        return -3;
    }

    @Override
    public void getOutline(Outline outline) {
        if (this.S0) {
            super.getOutline(outline);
            return;
        }
        Rect rect = this.getBounds();
        if (!rect.isEmpty()) {
            outline.setRoundRect(rect, this.M);
        } else {
            outline.setRoundRect(0, 0, this.getIntrinsicWidth(), this.getIntrinsicHeight(), this.M);
        }
        outline.setAlpha((float)this.getAlpha() / 255.0f);
    }

    public float h1() {
        return this.n0;
    }

    public void h2(int n8) {
        this.g2(this.q0.getResources().getDimension(n8));
    }

    public int[] i1() {
        return this.L0;
    }

    public void i2(float f8) {
        if (this.i0 != f8) {
            this.i0 = f8;
            this.invalidateSelf();
            this.H1();
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        drawable = this.getCallback();
        if (drawable != null) {
            drawable.invalidateDrawable((Drawable)this);
        }
    }

    @Override
    public boolean isStateful() {
        return a.D1(this.J) || a.D1(this.K) || a.D1(this.N) || this.M0 && a.D1(this.N0) || a.F1(this.x0.e()) || this.G0() || a.E1(this.S) || a.E1(this.e0) || a.D1(this.J0);
        {
        }
    }

    public ColorStateList j1() {
        return this.Z;
    }

    public void j2(int n8) {
        this.i2(this.q0.getResources().getDimension(n8));
    }

    public void k1(RectF rectF) {
        this.B0(this.getBounds(), rectF);
    }

    public void k2(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            if (this.S0) {
                this.o0(colorStateList);
            }
            this.onStateChange(this.getState());
        }
    }

    public void l2(int n8) {
        this.k2(ax.o.a.a(this.q0, n8));
    }

    public void m2(float f8) {
        if (this.O != f8) {
            this.O = f8;
            this.r0.setStrokeWidth(f8);
            if (this.S0) {
                super.p0(f8);
            }
            this.invalidateSelf();
        }
    }

    public TextUtils.TruncateAt n1() {
        return this.P0;
    }

    public void n2(int n8) {
        this.m2(this.q0.getResources().getDimension(n8));
    }

    public h o1() {
        return this.h0;
    }

    public boolean onLayoutDirectionChanged(int n8) {
        boolean bl;
        boolean bl2 = bl = super.onLayoutDirectionChanged(n8);
        if (this.b3()) {
            bl2 = bl | ax.U.a.m(this.S, n8);
        }
        bl = bl2;
        if (this.a3()) {
            bl = bl2 | ax.U.a.m(this.e0, n8);
        }
        bl2 = bl;
        if (this.c3()) {
            bl2 = bl | ax.U.a.m(this.X, n8);
        }
        if (bl2) {
            this.invalidateSelf();
        }
        return true;
    }

    protected boolean onLevelChange(int n8) {
        boolean bl;
        boolean bl2 = bl = super.onLevelChange(n8);
        if (this.b3()) {
            bl2 = bl | this.S.setLevel(n8);
        }
        bl = bl2;
        if (this.a3()) {
            bl = bl2 | this.e0.setLevel(n8);
        }
        bl2 = bl;
        if (this.c3()) {
            bl2 = bl | this.X.setLevel(n8);
        }
        if (bl2) {
            this.invalidateSelf();
        }
        return bl2;
    }

    @Override
    public boolean onStateChange(int[] nArray) {
        if (this.S0) {
            super.onStateChange(nArray);
        }
        return this.I1(nArray, this.i1());
    }

    public float p1() {
        return this.k0;
    }

    public void p2(Drawable object) {
        Drawable drawable = this.d1();
        if (drawable != object) {
            float f8 = this.C0();
            object = object != null ? ax.U.a.r(object).mutate() : null;
            this.X = object;
            this.f3();
            float f9 = this.C0();
            this.d3(drawable);
            if (this.c3()) {
                this.w0(this.X);
            }
            this.invalidateSelf();
            if (f8 != f9) {
                this.H1();
            }
        }
    }

    public float q1() {
        return this.j0;
    }

    public void q2(CharSequence charSequence) {
        if (this.b0 != charSequence) {
            this.b0 = ax.a0.a.c().h(charSequence);
            this.invalidateSelf();
        }
    }

    public ColorStateList r1() {
        return this.P;
    }

    public void r2(float f8) {
        if (this.o0 != f8) {
            this.o0 = f8;
            this.invalidateSelf();
            if (this.c3()) {
                this.H1();
            }
        }
    }

    public h s1() {
        return this.g0;
    }

    public void s2(int n8) {
        this.r2(this.q0.getResources().getDimension(n8));
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable2, long l8) {
        drawable = this.getCallback();
        if (drawable != null) {
            drawable.scheduleDrawable((Drawable)this, runnable2, l8);
        }
    }

    @Override
    public void setAlpha(int n8) {
        if (this.G0 != n8) {
            this.G0 = n8;
            this.invalidateSelf();
        }
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.H0 != colorFilter) {
            this.H0 = colorFilter;
            this.invalidateSelf();
        }
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        if (this.J0 != colorStateList) {
            this.J0 = colorStateList;
            this.onStateChange(this.getState());
        }
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.K0 != mode) {
            this.K0 = mode;
            this.I0 = f.l(this, this.J0, mode);
            this.invalidateSelf();
        }
    }

    public boolean setVisible(boolean bl, boolean bl2) {
        boolean bl3;
        boolean bl4 = bl3 = super.setVisible(bl, bl2);
        if (this.b3()) {
            bl4 = bl3 | this.S.setVisible(bl, bl2);
        }
        bl3 = bl4;
        if (this.a3()) {
            bl3 = bl4 | this.e0.setVisible(bl, bl2);
        }
        bl4 = bl3;
        if (this.c3()) {
            bl4 = bl3 | this.X.setVisible(bl, bl2);
        }
        if (bl4) {
            this.invalidateSelf();
        }
        return bl4;
    }

    public CharSequence t1() {
        return this.Q;
    }

    public void t2(int n8) {
        this.p2(ax.o.a.b(this.q0, n8));
    }

    public e u1() {
        return this.x0.e();
    }

    public void u2(float f8) {
        if (this.a0 != f8) {
            this.a0 = f8;
            this.invalidateSelf();
            if (this.c3()) {
                this.H1();
            }
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable2) {
        drawable = this.getCallback();
        if (drawable != null) {
            drawable.unscheduleDrawable((Drawable)this, runnable2);
        }
    }

    public float v1() {
        return this.m0;
    }

    public void v2(int n8) {
        this.u2(this.q0.getResources().getDimension(n8));
    }

    public float w1() {
        return this.l0;
    }

    public void w2(float f8) {
        if (this.n0 != f8) {
            this.n0 = f8;
            this.invalidateSelf();
            if (this.c3()) {
                this.H1();
            }
        }
    }

    public void x2(int n8) {
        this.w2(this.q0.getResources().getDimension(n8));
    }

    float y0() {
        if (!this.b3() && !this.a3()) {
            return 0.0f;
        }
        return this.j0 + this.m1() + this.k0;
    }

    public boolean y1() {
        return this.M0;
    }

    public boolean y2(int[] nArray) {
        if (!Arrays.equals(this.L0, nArray)) {
            this.L0 = nArray;
            if (this.c3()) {
                return this.I1(this.getState(), nArray);
            }
        }
        return false;
    }

    public void z2(ColorStateList colorStateList) {
        if (this.Z != colorStateList) {
            this.Z = colorStateList;
            if (this.c3()) {
                this.X.setTintList(colorStateList);
            }
            this.onStateChange(this.getState());
        }
    }

    public static interface a {
        public void a();
    }
}

