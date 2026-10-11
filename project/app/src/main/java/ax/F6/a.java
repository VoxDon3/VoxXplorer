/*
 * Decompiled with CFR 0.152.
 */
package ax.F6;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import ax.F6.s;
import ax.F6.t;
import ax.K6.a;
import ax.K6.e;
import ax.K6.k;
import ax.a0.u;
import ax.b0.g;

public final class a {
    private Typeface A;
    private Typeface B;
    private Typeface C;
    private Typeface D;
    private ax.K6.a E;
    private ax.K6.a F;
    private TextUtils.TruncateAt G = TextUtils.TruncateAt.END;
    private CharSequence H;
    private CharSequence I;
    private boolean J;
    private boolean K = true;
    private float L;
    private float M;
    private float N;
    private float O;
    private float P;
    private int Q;
    private int R;
    private int[] S;
    private boolean T;
    private final TextPaint U;
    private final TextPaint V;
    private TimeInterpolator W;
    private TimeInterpolator X;
    private float Y;
    private float Z;
    private final View a;
    private float a0;
    private float b;
    private ColorStateList b0;
    private boolean c;
    private float c0;
    private float d;
    private float d0;
    private float e;
    private float e0;
    private int f;
    private ColorStateList f0;
    private final Rect g;
    private float g0;
    private final Rect h;
    private float h0;
    private Rect i;
    private float i0;
    private final RectF j;
    private StaticLayout j0;
    private int k = 16;
    private float k0;
    private int l = 16;
    private float l0;
    private float m = 15.0f;
    private float m0;
    private float n = 15.0f;
    private CharSequence n0;
    private ColorStateList o;
    private int o0 = 1;
    private ColorStateList p;
    private int p0 = 1;
    private int q;
    private float q0 = 0.0f;
    private float r;
    private float r0 = 1.0f;
    private float s;
    private int s0 = ax.F6.s.o;
    private float t;
    private t t0;
    private float u;
    private int u0 = -1;
    private float v;
    private int v0 = -1;
    private float w;
    private boolean w0;
    private Typeface x;
    private Typeface y;
    private Typeface z;

    public a(View view) {
        TextPaint textPaint;
        this.a = view;
        this.U = textPaint = new TextPaint(129);
        this.V = new TextPaint((Paint)textPaint);
        this.h = new Rect();
        this.g = new Rect();
        this.j = new RectF();
        this.e = this.e();
        this.L(view.getContext().getResources().getConfiguration());
    }

    private Layout.Alignment C() {
        int n8 = Gravity.getAbsoluteGravity((int)this.k, (int)(this.J ? 1 : 0)) & 7;
        if (n8 != 1) {
            if (n8 != 5) {
                if (this.J) {
                    return Layout.Alignment.ALIGN_OPPOSITE;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            }
            if (this.J) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private void D(TextPaint textPaint) {
        textPaint.setTextSize(this.n);
        textPaint.setTypeface(this.x);
        textPaint.setLetterSpacing(this.g0);
    }

    private void E(TextPaint textPaint) {
        textPaint.setTextSize(this.m);
        textPaint.setTypeface(this.A);
        textPaint.setLetterSpacing(this.h0);
    }

    private void F(float f8) {
        if (this.c) {
            RectF rectF = this.j;
            Rect rect = f8 < this.e ? this.g : this.h;
            rectF.set(rect);
            return;
        }
        this.j.left = ax.F6.a.K(this.g.left, this.h.left, f8, this.W);
        this.j.top = ax.F6.a.K(this.r, this.s, f8, this.W);
        this.j.right = ax.F6.a.K(this.g.right, this.h.right, f8, this.W);
        this.j.bottom = ax.F6.a.K(this.g.bottom, this.h.bottom, f8, this.W);
    }

    private static boolean G(float f8, float f9) {
        return Math.abs(f8 - f9) < 1.0E-5f;
    }

    private boolean H() {
        return this.a.getLayoutDirection() == 1;
    }

    private boolean J(CharSequence charSequence, boolean bl) {
        ax.a0.t t8 = bl ? ax.a0.u.d : ax.a0.u.c;
        return t8.a(charSequence, 0, charSequence.length());
    }

    private static float K(float f8, float f9, float f10, TimeInterpolator timeInterpolator) {
        float f11 = f10;
        if (timeInterpolator != null) {
            f11 = timeInterpolator.getInterpolation(f10);
        }
        return ax.l6.a.a(f8, f9, f11);
    }

    private float M(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean P(Rect rect, int n8, int n9, int n10, int n11) {
        return rect.left == n8 && rect.top == n9 && rect.right == n10 && rect.bottom == n11;
    }

    private void V(float f8) {
        this.l0 = f8;
        this.a.postInvalidateOnAnimation();
    }

    private boolean Z(Typeface object) {
        ax.K6.a a8 = this.F;
        if (a8 != null) {
            a8.c();
        }
        if (this.z != object) {
            this.z = object;
            a8 = ax.K6.k.b(this.a.getContext().getResources().getConfiguration(), object);
            this.y = a8;
            object = a8;
            if (a8 == null) {
                object = this.z;
            }
            this.x = object;
            return true;
        }
        return false;
    }

    private static int a(int n8, int n9, float f8) {
        float f9 = 1.0f - f8;
        float f10 = Color.alpha((int)n8);
        float f11 = Color.alpha((int)n9);
        float f12 = Color.red((int)n8);
        float f13 = Color.red((int)n9);
        float f14 = Color.green((int)n8);
        float f15 = Color.green((int)n9);
        float f16 = Color.blue((int)n8);
        float f17 = Color.blue((int)n9);
        return Color.argb((int)Math.round(f10 * f9 + f11 * f8), (int)Math.round(f12 * f9 + f13 * f8), (int)Math.round(f14 * f9 + f15 * f8), (int)Math.round(f16 * f9 + f17 * f8));
    }

    private void b(boolean bl) {
        float f8;
        CharSequence charSequence;
        this.i(1.0f, bl);
        if (this.I != null && this.j0 != null) {
            charSequence = this.r0() ? TextUtils.ellipsize((CharSequence)this.I, (TextPaint)this.U, (float)this.j0.getWidth(), (TextUtils.TruncateAt)this.G) : this.I;
            this.n0 = charSequence;
        }
        charSequence = this.n0;
        float f9 = 0.0f;
        this.k0 = charSequence != null ? this.M(this.U, charSequence) : 0.0f;
        int n8 = Gravity.getAbsoluteGravity((int)this.l, (int)(this.J ? 1 : 0));
        charSequence = this.i;
        if (charSequence == null) {
            charSequence = this.h;
        }
        int n9 = n8 & 0x70;
        if (n9 != 48) {
            if (n9 != 80) {
                f8 = (this.U.descent() - this.U.ascent()) / 2.0f;
                this.s = (float)charSequence.centerY() - f8;
            } else {
                this.s = (float)((Rect)charSequence).bottom + this.U.ascent();
            }
        } else {
            this.s = ((Rect)charSequence).top;
        }
        this.u = (n8 &= 0x800007) != 1 ? (n8 != 5 ? (float)((Rect)charSequence).left : (float)((Rect)charSequence).right - this.k0) : (float)charSequence.centerX() - this.k0 / 2.0f;
        if (this.k0 <= (float)this.h.width()) {
            f8 = this.u;
            f8 += Math.max(0.0f, (float)this.h.left - f8);
            this.u = f8;
            this.u = f8 + Math.min(0.0f, (float)this.h.right - (this.k0 + f8));
        }
        if (this.m() <= (float)this.h.height()) {
            f8 = this.s;
            f8 += Math.max(0.0f, (float)this.h.top - f8);
            this.s = f8;
            this.s = f8 + Math.min(0.0f, (float)this.h.bottom - (this.q() + f8));
        }
        this.i(0.0f, bl);
        charSequence = this.j0;
        float f10 = charSequence != null ? (float)charSequence.getHeight() : 0.0f;
        charSequence = this.j0;
        f8 = charSequence != null && this.o0 > 1 ? (float)charSequence.getWidth() : ((charSequence = this.I) != null ? this.M(this.U, charSequence) : 0.0f);
        charSequence = this.j0;
        n8 = charSequence != null ? charSequence.getLineCount() : 0;
        this.q = n8;
        n9 = Gravity.getAbsoluteGravity((int)this.k, (int)(this.J ? 1 : 0));
        n8 = n9 & 0x70;
        if (n8 != 48) {
            if (n8 != 80) {
                this.r = (float)this.g.centerY() - (f10 /= 2.0f);
            } else {
                float f11 = this.g.bottom;
                if (this.w0) {
                    f9 = this.U.descent();
                }
                this.r = f11 - f10 + f9;
            }
        } else {
            this.r = this.g.top;
        }
        n8 = n9 & 0x800007;
        this.t = n8 != 1 ? (n8 != 5 ? (float)this.g.left : (float)this.g.right - f8) : (float)this.g.centerX() - f8 / 2.0f;
        this.k0(this.b);
    }

    private void c() {
        this.g(this.b);
    }

    private float d(float f8) {
        float f9 = this.e;
        if (f8 <= f9) {
            return ax.l6.a.b(1.0f, 0.0f, this.d, f9, f8);
        }
        return ax.l6.a.b(0.0f, 1.0f, f9, 1.0f, f8);
    }

    private float e() {
        float f8 = this.d;
        return f8 + (1.0f - f8) * 0.5f;
    }

    private boolean f(CharSequence charSequence) {
        boolean bl = this.H();
        if (this.K) {
            return this.J(charSequence, bl);
        }
        return bl;
    }

    private void f0(float f8) {
        this.m0 = f8;
        this.a.postInvalidateOnAnimation();
    }

    private void g(float f8) {
        int n8;
        float f9;
        this.F(f8);
        if (this.c) {
            if (f8 < this.e) {
                this.v = this.t;
                this.w = this.r;
                this.k0(0.0f);
                f9 = 0.0f;
            } else {
                this.v = this.u;
                this.w = this.s - (float)Math.max(0, this.f);
                this.k0(1.0f);
                f9 = 1.0f;
            }
        } else {
            this.v = ax.F6.a.K(this.t, this.u, f8, this.W);
            this.w = ax.F6.a.K(this.r, this.s, f8, this.W);
            this.k0(f8);
            f9 = f8;
        }
        TimeInterpolator timeInterpolator = ax.l6.a.b;
        this.V(1.0f - ax.F6.a.K(0.0f, 1.0f, 1.0f - f8, timeInterpolator));
        this.f0(ax.F6.a.K(1.0f, 0.0f, f8, timeInterpolator));
        if (this.p != this.o) {
            this.U.setColor(ax.F6.a.a(this.v(), this.t(), f9));
        } else {
            this.U.setColor(this.t());
        }
        f9 = this.g0;
        float f10 = this.h0;
        if (f9 != f10) {
            this.U.setLetterSpacing(ax.F6.a.K(f10, f9, f8, timeInterpolator));
        } else {
            this.U.setLetterSpacing(f9);
        }
        this.N = ax.F6.a.K(this.c0, this.Y, f8, null);
        this.O = ax.F6.a.K(this.d0, this.Z, f8, null);
        this.P = ax.F6.a.K(this.e0, this.a0, f8, null);
        this.Q = n8 = ax.F6.a.a(this.u(this.f0), this.u(this.b0), f8);
        this.U.setShadowLayer(this.N, this.O, this.P, n8);
        if (this.c) {
            n8 = this.U.getAlpha();
            n8 = (int)(this.d(f8) * (float)n8);
            this.U.setAlpha(n8);
            if (Build.VERSION.SDK_INT >= 31) {
                timeInterpolator = this.U;
                timeInterpolator.setShadowLayer(this.N, this.O, this.P, ax.z6.a.a(this.Q, timeInterpolator.getAlpha()));
            }
        }
        this.a.postInvalidateOnAnimation();
    }

    private void h(float f8) {
        this.i(f8, false);
    }

    private void i(float f8, boolean bl) {
        Object object;
        int n8;
        Typeface typeface;
        float f9;
        float f10;
        block15: {
            block14: {
                float f11;
                float f12;
                if (this.H == null) break block14;
                float f13 = this.h.width();
                f10 = this.g.width();
                f9 = 1.0f;
                if (ax.F6.a.G(f8, 1.0f)) {
                    float f14 = this.r0() ? this.n : this.m;
                    f12 = this.r0() ? this.g0 : this.h0;
                    f11 = this.r0() ? 1.0f : ax.F6.a.K(this.m, this.n, f8, this.X) / this.m;
                    this.L = f11;
                    if (this.r0()) {
                        f10 = f13;
                    }
                    typeface = this.x;
                    f11 = f14;
                } else {
                    f11 = this.m;
                    f12 = this.h0;
                    typeface = this.A;
                    this.L = ax.F6.a.G(f8, 0.0f) ? 1.0f : ax.F6.a.K(this.m, this.n, f8, this.X) / this.m;
                    float f15 = this.n / this.m;
                    float f16 = f10;
                    if (!bl) {
                        if (this.c) {
                            f16 = f10;
                        } else {
                            f16 = f10;
                            if (f10 * f15 > f13) {
                                f16 = f10;
                                if (this.r0()) {
                                    f16 = Math.min(f13 / f15, f10);
                                }
                            }
                        }
                    }
                    f10 = f16;
                }
                n8 = f8 < 0.5f ? this.o0 : this.p0;
                boolean bl2 = false;
                bl = false;
                if (f10 > 0.0f) {
                    bl2 = this.M != f11;
                    boolean bl3 = this.i0 != f12;
                    boolean bl4 = this.D != typeface;
                    object = this.j0;
                    boolean bl5 = object != null && f10 != (float)object.getWidth();
                    boolean bl6 = this.R != n8;
                    bl2 = bl2 || bl3 || bl5 || bl4 || bl6 || this.T;
                    this.M = f11;
                    this.i0 = f12;
                    this.D = typeface;
                    this.T = false;
                    this.R = n8;
                    typeface = this.U;
                    if (this.L != 1.0f) {
                        bl = true;
                    }
                    typeface.setLinearText(bl);
                }
                if (this.I == null || bl2) break block15;
            }
            return;
        }
        this.U.setTextSize(this.M);
        this.U.setTypeface(this.D);
        this.U.setLetterSpacing(this.i0);
        this.J = this.f(this.H);
        if (!this.q0()) {
            n8 = 1;
        }
        typeface = this.U;
        object = this.H;
        f8 = this.r0() ? f9 : this.L;
        typeface = this.j(n8, (TextPaint)typeface, (CharSequence)object, f10 * f8, this.J);
        this.j0 = typeface;
        this.I = typeface.getText();
    }

    private boolean i0(Typeface object) {
        ax.K6.a a8 = this.E;
        if (a8 != null) {
            a8.c();
        }
        if (this.C != object) {
            this.C = object;
            a8 = ax.K6.k.b(this.a.getContext().getResources().getConfiguration(), object);
            this.B = a8;
            object = a8;
            if (a8 == null) {
                object = this.C;
            }
            this.A = object;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private StaticLayout j(int n8, TextPaint textPaint, CharSequence charSequence, float f8, boolean bl) {
        s.a a82;
        block4: {
            Layout.Alignment alignment;
            block3: {
                if (n8 == 1) {
                    try {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        break block3;
                    }
                    catch (s.a a82) {
                        break block4;
                    }
                }
                alignment = this.C();
            }
            textPaint = ax.F6.s.c(charSequence, textPaint, (int)f8).e(this.G).h(bl).d(alignment).g(false).j(n8).i(this.q0, this.r0).f(this.s0).k(this.t0).a();
            return (StaticLayout)ax.b0.g.g(textPaint);
        }
        Log.e((String)"CollapsingTextHelper", (String)a82.getCause().getMessage(), (Throwable)a82);
        textPaint = null;
        return (StaticLayout)ax.b0.g.g(textPaint);
    }

    private void k0(float f8) {
        this.h(f8);
        this.a.postInvalidateOnAnimation();
    }

    private void l(Canvas canvas, float f8, float f9) {
        int n8;
        Object object;
        int n9 = this.U.getAlpha();
        canvas.translate(f8, f9);
        if (!this.c) {
            this.U.setAlpha((int)(this.m0 * (float)n9));
            if (Build.VERSION.SDK_INT >= 31) {
                object = this.U;
                object.setShadowLayer(this.N, this.O, this.P, ax.z6.a.a(this.Q, object.getAlpha()));
            }
            this.j0.draw(canvas);
        }
        if (!this.c) {
            this.U.setAlpha((int)(this.l0 * (float)n9));
        }
        if ((n8 = Build.VERSION.SDK_INT) >= 31) {
            object = this.U;
            object.setShadowLayer(this.N, this.O, this.P, ax.z6.a.a(this.Q, object.getAlpha()));
        }
        int n10 = this.j0.getLineBaseline(0);
        object = this.n0;
        int n11 = object.length();
        f8 = n10;
        canvas.drawText((CharSequence)object, 0, n11, 0.0f, f8, (Paint)this.U);
        if (n8 >= 31) {
            this.U.setShadowLayer(this.N, this.O, this.P, this.Q);
        }
        if (!this.c) {
            String string = this.n0.toString().trim();
            object = string;
            if (string.endsWith("\u2026")) {
                object = string.substring(0, string.length() - 1);
            }
            this.U.setAlpha(n9);
            canvas.drawText((String)object, 0, Math.min(this.j0.getLineEnd(0), ((String)object).length()), 0.0f, f8, (Paint)this.U);
        }
    }

    private boolean q0() {
        return !(this.o0 <= 1 && this.p0 <= 1 || this.J && !this.c);
        {
        }
    }

    private float r(int n8, int n9) {
        if (n9 != 17 && (n9 & 7) != 1) {
            if ((n9 & 0x800005) != 0x800005 && (n9 & 5) != 5) {
                if (this.J) {
                    return (float)this.h.right - this.k0;
                }
                return this.h.left;
            }
            if (this.J) {
                return this.h.left;
            }
            return (float)this.h.right - this.k0;
        }
        return (float)n8 / 2.0f - this.k0 / 2.0f;
    }

    private boolean r0() {
        return this.p0 == 1;
    }

    private float s(RectF rectF, int n8, int n9) {
        if (n9 != 17 && (n9 & 7) != 1) {
            if ((n9 & 0x800005) != 0x800005 && (n9 & 5) != 5) {
                if (this.J) {
                    return this.h.right;
                }
                return rectF.left + this.k0;
            }
            if (this.J) {
                return rectF.left + this.k0;
            }
            return this.h.right;
        }
        return (float)n8 / 2.0f + this.k0 / 2.0f;
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] nArray = this.S;
        if (nArray != null) {
            return colorStateList.getColorForState(nArray, 0);
        }
        return colorStateList.getDefaultColor();
    }

    private int v() {
        return this.u(this.o);
    }

    public float A() {
        this.E(this.V);
        return -this.V.ascent();
    }

    public float B() {
        return this.b;
    }

    public final boolean I() {
        ColorStateList colorStateList = this.p;
        return colorStateList != null && colorStateList.isStateful() || (colorStateList = this.o) != null && colorStateList.isStateful();
    }

    public void L(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.z;
            if (typeface != null) {
                this.y = ax.K6.k.b(configuration, typeface);
            }
            if ((typeface = this.C) != null) {
                this.B = ax.K6.k.b(configuration, typeface);
            }
            if ((configuration = this.y) == null) {
                configuration = this.z;
            }
            this.x = configuration;
            configuration = this.B;
            if (configuration == null) {
                configuration = this.C;
            }
            this.A = configuration;
            this.O(true);
        }
    }

    public void N() {
        this.O(false);
    }

    public void O(boolean bl) {
        if (this.a.getHeight() > 0 && this.a.getWidth() > 0 || bl) {
            this.b(bl);
            this.c();
        }
    }

    public void Q(ColorStateList colorStateList) {
        if (this.p == colorStateList && this.o == colorStateList) {
            return;
        }
        this.p = colorStateList;
        this.o = colorStateList;
        this.N();
    }

    public void R(int n8, int n9, int n10, int n11) {
        if (!ax.F6.a.P(this.h, n8, n9, n10, n11)) {
            this.h.set(n8, n9, n10, n11);
            this.T = true;
        }
    }

    public void S(Rect rect) {
        this.R(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void T(int n8) {
        if (n8 != this.p0) {
            this.p0 = n8;
            this.N();
        }
    }

    public void U(int n8) {
        Object object;
        e e8 = new e(this.a.getContext(), n8);
        if (e8.j() != null) {
            this.p = e8.j();
        }
        if (e8.k() != 0.0f) {
            this.n = e8.k();
        }
        if ((object = e8.c) != null) {
            this.b0 = object;
        }
        this.Z = e8.i;
        this.a0 = e8.j;
        this.Y = e8.k;
        this.g0 = e8.m;
        object = this.F;
        if (object != null) {
            ((ax.K6.a)object).c();
        }
        this.F = new ax.K6.a(new a.a(this){
            final a a;
            {
                this.a = a8;
            }

            @Override
            public void a(Typeface typeface) {
                this.a.Y(typeface);
            }
        }, e8.e());
        e8.h(this.a.getContext(), this.F);
        this.N();
    }

    public void W(ColorStateList colorStateList) {
        if (this.p != colorStateList) {
            this.p = colorStateList;
            this.N();
        }
    }

    public void X(int n8) {
        if (this.l != n8) {
            this.l = n8;
            this.N();
        }
    }

    public void Y(Typeface typeface) {
        if (this.Z(typeface)) {
            this.N();
        }
    }

    public void a0(int n8, int n9, int n10, int n11) {
        this.b0(n8, n9, n10, n11, true);
    }

    public void b0(int n8, int n9, int n10, int n11, boolean bl) {
        if (ax.F6.a.P(this.g, n8, n9, n10, n11) && bl == this.w0) {
            return;
        }
        this.g.set(n8, n9, n10, n11);
        this.T = true;
        this.w0 = bl;
    }

    public void c0(Rect rect) {
        this.a0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void d0(float f8) {
        if (this.h0 != f8) {
            this.h0 = f8;
            this.N();
        }
    }

    public void e0(int n8) {
        if (n8 != this.o0) {
            this.o0 = n8;
            this.N();
        }
    }

    public void g0(int n8) {
        if (this.k != n8) {
            this.k = n8;
            this.N();
        }
    }

    public void h0(float f8) {
        if (this.m != f8) {
            this.m = f8;
            this.N();
        }
    }

    public void j0(float f8) {
        if ((f8 = ax.W.a.a(f8, 0.0f, 1.0f)) != this.b) {
            this.b = f8;
            this.c();
        }
    }

    public void k(Canvas canvas) {
        int n8 = canvas.save();
        if (this.I != null && this.j.width() > 0.0f && this.j.height() > 0.0f) {
            this.U.setTextSize(this.M);
            float f8 = this.v;
            float f9 = this.w;
            float f10 = this.L;
            if (f10 != 1.0f && !this.c) {
                canvas.scale(f10, f10, f8, f9);
            }
            if (this.q0() && this.r0() && (!this.c || this.b > this.e)) {
                this.l(canvas, this.v - (float)this.j0.getLineStart(0), f9);
            } else {
                canvas.translate(f8, f9);
                this.j0.draw(canvas);
            }
            canvas.restoreToCount(n8);
        }
    }

    public void l0(TimeInterpolator timeInterpolator) {
        this.W = timeInterpolator;
        this.N();
    }

    public float m() {
        this.D(this.V);
        return -this.V.ascent() + this.V.descent();
    }

    public final boolean m0(int[] nArray) {
        this.S = nArray;
        if (this.I()) {
            this.N();
            return true;
        }
        return false;
    }

    public float n() {
        this.D(this.V);
        return -this.V.ascent();
    }

    public void n0(CharSequence charSequence) {
        if (charSequence != null && TextUtils.equals((CharSequence)this.H, (CharSequence)charSequence)) {
            return;
        }
        this.H = charSequence;
        this.I = null;
        this.N();
    }

    public void o(RectF rectF, int n8, int n9) {
        this.J = this.f(this.H);
        rectF.left = Math.max(this.r(n8, n9), (float)this.h.left);
        rectF.top = this.h.top;
        rectF.right = Math.min(this.s(rectF, n8, n9), (float)this.h.right);
        rectF.bottom = (float)this.h.top + this.q();
        if (this.j0 != null && !this.r0()) {
            StaticLayout staticLayout = this.j0;
            float f8 = staticLayout.getLineWidth(staticLayout.getLineCount() - 1) * (this.n / this.m);
            if (this.J) {
                rectF.left = rectF.right - f8;
                return;
            }
            rectF.right = rectF.left + f8;
        }
    }

    public void o0(TimeInterpolator timeInterpolator) {
        this.X = timeInterpolator;
        this.N();
    }

    public ColorStateList p() {
        return this.p;
    }

    public void p0(Typeface typeface) {
        boolean bl = this.Z(typeface);
        boolean bl2 = this.i0(typeface);
        if (!bl && !bl2) {
            return;
        }
        this.N();
    }

    public float q() {
        int n8 = this.u0;
        if (n8 != -1) {
            return n8;
        }
        return this.n();
    }

    public void s0(int n8) {
        this.D(this.V);
        int n9 = this.p0;
        TextPaint textPaint = this.V;
        CharSequence charSequence = this.H;
        float f8 = n8;
        this.u0 = this.j(n9, textPaint, charSequence, f8 * (this.n / this.m), this.J).getHeight();
        this.E(this.V);
        this.v0 = this.j(this.o0, this.V, this.H, f8, this.J).getHeight();
    }

    public int t() {
        return this.u(this.p);
    }

    public int w() {
        return this.q;
    }

    public int x() {
        return this.o0;
    }

    public float y() {
        this.E(this.V);
        return -this.V.ascent() + this.V.descent();
    }

    public float z() {
        int n8 = this.v0;
        if (n8 != -1) {
            return n8;
        }
        return this.A();
    }
}

