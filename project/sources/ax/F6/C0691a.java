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
import ax.K6.a;
import ax.b0.C1446g;
import ax.l6.C2472a;
import ax.z6.C3555a;

/* renamed from: ax.F6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0691a {
    private Typeface A;
    private Typeface B;
    private Typeface C;
    private Typeface D;
    private ax.K6.a E;
    private ax.K6.a F;
    private CharSequence H;
    private CharSequence I;
    private boolean J;
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
    private float k0;
    private float l0;
    private float m0;
    private CharSequence n0;
    private ColorStateList o;
    private ColorStateList p;
    private int q;
    private float r;
    private float s;
    private float t;
    private t t0;
    private float u;
    private float v;
    private float w;
    private boolean w0;
    private Typeface x;
    private Typeface y;
    private Typeface z;
    private int k = 16;
    private int l = 16;
    private float m = 15.0f;
    private float n = 15.0f;
    private TextUtils.TruncateAt G = TextUtils.TruncateAt.END;
    private boolean K = true;
    private int o0 = 1;
    private int p0 = 1;
    private float q0 = 0.0f;
    private float r0 = 1.0f;
    private int s0 = s.o;
    private int u0 = -1;
    private int v0 = -1;

    /* renamed from: ax.F6.a$a, reason: collision with other inner class name */
    class C0080a implements a.InterfaceC0110a {
        C0080a() {
        }

        @Override // ax.K6.a.InterfaceC0110a
        public void a(Typeface typeface) {
            C0691a.this.Y(typeface);
        }
    }

    public C0691a(View view) {
        this.a = view;
        TextPaint textPaint = new TextPaint(129);
        this.U = textPaint;
        this.V = new TextPaint(textPaint);
        this.h = new Rect();
        this.g = new Rect();
        this.j = new RectF();
        this.e = e();
        L(view.getContext().getResources().getConfiguration());
    }

    private Layout.Alignment C() {
        int absoluteGravity = Gravity.getAbsoluteGravity(this.k, this.J ? 1 : 0) & 7;
        return absoluteGravity != 1 ? absoluteGravity != 5 ? this.J ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.J ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
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

    private void F(float f) {
        if (this.c) {
            this.j.set(f < this.e ? this.g : this.h);
            return;
        }
        this.j.left = K(this.g.left, this.h.left, f, this.W);
        this.j.top = K(this.r, this.s, f, this.W);
        this.j.right = K(this.g.right, this.h.right, f, this.W);
        this.j.bottom = K(this.g.bottom, this.h.bottom, f, this.W);
    }

    private static boolean G(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-5f;
    }

    private boolean H() {
        return this.a.getLayoutDirection() == 1;
    }

    private boolean J(CharSequence charSequence, boolean z) {
        return (z ? ax.a0.u.d : ax.a0.u.c).a(charSequence, 0, charSequence.length());
    }

    private static float K(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C2472a.a(f, f2, f3);
    }

    private float M(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean P(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private void V(float f) {
        this.l0 = f;
        this.a.postInvalidateOnAnimation();
    }

    private boolean Z(Typeface typeface) {
        ax.K6.a aVar = this.F;
        if (aVar != null) {
            aVar.c();
        }
        if (this.z == typeface) {
            return false;
        }
        this.z = typeface;
        Typeface b = ax.K6.k.b(this.a.getContext().getResources().getConfiguration(), typeface);
        this.y = b;
        if (b == null) {
            b = this.z;
        }
        this.x = b;
        return true;
    }

    private static int a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    private void b(boolean z) {
        float M;
        i(1.0f, z);
        if (this.I != null && this.j0 != null) {
            this.n0 = r0() ? TextUtils.ellipsize(this.I, this.U, this.j0.getWidth(), this.G) : this.I;
        }
        CharSequence charSequence = this.n0;
        if (charSequence != null) {
            this.k0 = M(this.U, charSequence);
        } else {
            this.k0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.l, this.J ? 1 : 0);
        Rect rect = this.i;
        if (rect == null) {
            rect = this.h;
        }
        int i = absoluteGravity & 112;
        if (i == 48) {
            this.s = rect.top;
        } else if (i != 80) {
            this.s = rect.centerY() - ((this.U.descent() - this.U.ascent()) / 2.0f);
        } else {
            this.s = rect.bottom + this.U.ascent();
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.u = rect.centerX() - (this.k0 / 2.0f);
        } else if (i2 != 5) {
            this.u = rect.left;
        } else {
            this.u = rect.right - this.k0;
        }
        if (this.k0 <= this.h.width()) {
            float f = this.u;
            float max = f + Math.max(0.0f, this.h.left - f);
            this.u = max;
            this.u = max + Math.min(0.0f, this.h.right - (this.k0 + max));
        }
        if (m() <= this.h.height()) {
            float f2 = this.s;
            float max2 = f2 + Math.max(0.0f, this.h.top - f2);
            this.s = max2;
            this.s = max2 + Math.min(0.0f, this.h.bottom - (q() + max2));
        }
        i(0.0f, z);
        float height = this.j0 != null ? r11.getHeight() : 0.0f;
        StaticLayout staticLayout = this.j0;
        if (staticLayout == null || this.o0 <= 1) {
            CharSequence charSequence2 = this.I;
            M = charSequence2 != null ? M(this.U, charSequence2) : 0.0f;
        } else {
            M = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.j0;
        this.q = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.k, this.J ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        if (i3 == 48) {
            this.r = this.g.top;
        } else if (i3 != 80) {
            this.r = this.g.centerY() - (height / 2.0f);
        } else {
            this.r = (this.g.bottom - height) + (this.w0 ? this.U.descent() : 0.0f);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.t = this.g.centerX() - (M / 2.0f);
        } else if (i4 != 5) {
            this.t = this.g.left;
        } else {
            this.t = this.g.right - M;
        }
        k0(this.b);
    }

    private void c() {
        g(this.b);
    }

    private float d(float f) {
        float f2 = this.e;
        return f <= f2 ? C2472a.b(1.0f, 0.0f, this.d, f2, f) : C2472a.b(0.0f, 1.0f, f2, 1.0f, f);
    }

    private float e() {
        float f = this.d;
        return f + ((1.0f - f) * 0.5f);
    }

    private boolean f(CharSequence charSequence) {
        boolean H = H();
        return this.K ? J(charSequence, H) : H;
    }

    private void f0(float f) {
        this.m0 = f;
        this.a.postInvalidateOnAnimation();
    }

    private void g(float f) {
        float f2;
        F(f);
        if (!this.c) {
            this.v = K(this.t, this.u, f, this.W);
            this.w = K(this.r, this.s, f, this.W);
            k0(f);
            f2 = f;
        } else if (f < this.e) {
            this.v = this.t;
            this.w = this.r;
            k0(0.0f);
            f2 = 0.0f;
        } else {
            this.v = this.u;
            this.w = this.s - Math.max(0, this.f);
            k0(1.0f);
            f2 = 1.0f;
        }
        TimeInterpolator timeInterpolator = C2472a.b;
        V(1.0f - K(0.0f, 1.0f, 1.0f - f, timeInterpolator));
        f0(K(1.0f, 0.0f, f, timeInterpolator));
        if (this.p != this.o) {
            this.U.setColor(a(v(), t(), f2));
        } else {
            this.U.setColor(t());
        }
        float f3 = this.g0;
        float f4 = this.h0;
        if (f3 != f4) {
            this.U.setLetterSpacing(K(f4, f3, f, timeInterpolator));
        } else {
            this.U.setLetterSpacing(f3);
        }
        this.N = K(this.c0, this.Y, f, null);
        this.O = K(this.d0, this.Z, f, null);
        this.P = K(this.e0, this.a0, f, null);
        int a = a(u(this.f0), u(this.b0), f);
        this.Q = a;
        this.U.setShadowLayer(this.N, this.O, this.P, a);
        if (this.c) {
            this.U.setAlpha((int) (d(f) * this.U.getAlpha()));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.U;
                textPaint.setShadowLayer(this.N, this.O, this.P, C3555a.a(this.Q, textPaint.getAlpha()));
            }
        }
        this.a.postInvalidateOnAnimation();
    }

    private void h(float f) {
        i(f, false);
    }

    private void i(float f, boolean z) {
        Typeface typeface;
        float f2;
        float f3;
        if (this.H == null) {
            return;
        }
        float width = this.h.width();
        float width2 = this.g.width();
        if (G(f, 1.0f)) {
            f2 = r0() ? this.n : this.m;
            f3 = r0() ? this.g0 : this.h0;
            this.L = r0() ? 1.0f : K(this.m, this.n, f, this.X) / this.m;
            if (!r0()) {
                width = width2;
            }
            typeface = this.x;
            width2 = width;
        } else {
            float f4 = this.m;
            float f5 = this.h0;
            typeface = this.A;
            if (G(f, 0.0f)) {
                this.L = 1.0f;
            } else {
                this.L = K(this.m, this.n, f, this.X) / this.m;
            }
            float f6 = this.n / this.m;
            float f7 = width2 * f6;
            if (!z && !this.c && f7 > width && r0()) {
                width2 = Math.min(width / f6, width2);
            }
            f2 = f4;
            f3 = f5;
        }
        int i = f < 0.5f ? this.o0 : this.p0;
        if (width2 > 0.0f) {
            boolean z2 = this.M != f2;
            boolean z3 = this.i0 != f3;
            boolean z4 = this.D != typeface;
            StaticLayout staticLayout = this.j0;
            boolean z5 = z2 || z3 || (staticLayout != null && (width2 > ((float) staticLayout.getWidth()) ? 1 : (width2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z4 || (this.R != i) || this.T;
            this.M = f2;
            this.i0 = f3;
            this.D = typeface;
            this.T = false;
            this.R = i;
            this.U.setLinearText(this.L != 1.0f);
            r5 = z5;
        }
        if (this.I == null || r5) {
            this.U.setTextSize(this.M);
            this.U.setTypeface(this.D);
            this.U.setLetterSpacing(this.i0);
            this.J = f(this.H);
            StaticLayout j = j(q0() ? i : 1, this.U, this.H, width2 * (r0() ? 1.0f : this.L), this.J);
            this.j0 = j;
            this.I = j.getText();
        }
    }

    private boolean i0(Typeface typeface) {
        ax.K6.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.C == typeface) {
            return false;
        }
        this.C = typeface;
        Typeface b = ax.K6.k.b(this.a.getContext().getResources().getConfiguration(), typeface);
        this.B = b;
        if (b == null) {
            b = this.C;
        }
        this.A = b;
        return true;
    }

    private StaticLayout j(int i, TextPaint textPaint, CharSequence charSequence, float f, boolean z) {
        StaticLayout staticLayout;
        try {
            staticLayout = s.c(charSequence, textPaint, (int) f).e(this.G).h(z).d(i == 1 ? Layout.Alignment.ALIGN_NORMAL : C()).g(false).j(i).i(this.q0, this.r0).f(this.s0).k(this.t0).a();
        } catch (s.a e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
            staticLayout = null;
        }
        return (StaticLayout) C1446g.g(staticLayout);
    }

    private void k0(float f) {
        h(f);
        this.a.postInvalidateOnAnimation();
    }

    private void l(Canvas canvas, float f, float f2) {
        int alpha = this.U.getAlpha();
        canvas.translate(f, f2);
        if (!this.c) {
            this.U.setAlpha((int) (this.m0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.U;
                textPaint.setShadowLayer(this.N, this.O, this.P, C3555a.a(this.Q, textPaint.getAlpha()));
            }
            this.j0.draw(canvas);
        }
        if (!this.c) {
            this.U.setAlpha((int) (this.l0 * alpha));
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            TextPaint textPaint2 = this.U;
            textPaint2.setShadowLayer(this.N, this.O, this.P, C3555a.a(this.Q, textPaint2.getAlpha()));
        }
        int lineBaseline = this.j0.getLineBaseline(0);
        CharSequence charSequence = this.n0;
        float f3 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f3, this.U);
        if (i >= 31) {
            this.U.setShadowLayer(this.N, this.O, this.P, this.Q);
        }
        if (this.c) {
            return;
        }
        String trim = this.n0.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.U.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.j0.getLineEnd(0), str.length()), 0.0f, f3, (Paint) this.U);
    }

    private boolean q0() {
        if (this.o0 > 1 || this.p0 > 1) {
            return !this.J || this.c;
        }
        return false;
    }

    private float r(int i, int i2) {
        return (i2 == 17 || (i2 & 7) == 1) ? (i / 2.0f) - (this.k0 / 2.0f) : ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.J ? this.h.left : this.h.right - this.k0 : this.J ? this.h.right - this.k0 : this.h.left;
    }

    private boolean r0() {
        return this.p0 == 1;
    }

    private float s(RectF rectF, int i, int i2) {
        return (i2 == 17 || (i2 & 7) == 1) ? (i / 2.0f) + (this.k0 / 2.0f) : ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.J ? rectF.left + this.k0 : this.h.right : this.J ? this.h.right : rectF.left + this.k0;
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.S;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int v() {
        return u(this.o);
    }

    public float A() {
        E(this.V);
        return -this.V.ascent();
    }

    public float B() {
        return this.b;
    }

    public final boolean I() {
        ColorStateList colorStateList = this.p;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.o;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public void L(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.z;
            if (typeface != null) {
                this.y = ax.K6.k.b(configuration, typeface);
            }
            Typeface typeface2 = this.C;
            if (typeface2 != null) {
                this.B = ax.K6.k.b(configuration, typeface2);
            }
            Typeface typeface3 = this.y;
            if (typeface3 == null) {
                typeface3 = this.z;
            }
            this.x = typeface3;
            Typeface typeface4 = this.B;
            if (typeface4 == null) {
                typeface4 = this.C;
            }
            this.A = typeface4;
            O(true);
        }
    }

    public void N() {
        O(false);
    }

    public void O(boolean z) {
        if ((this.a.getHeight() <= 0 || this.a.getWidth() <= 0) && !z) {
            return;
        }
        b(z);
        c();
    }

    public void Q(ColorStateList colorStateList) {
        if (this.p == colorStateList && this.o == colorStateList) {
            return;
        }
        this.p = colorStateList;
        this.o = colorStateList;
        N();
    }

    public void R(int i, int i2, int i3, int i4) {
        if (P(this.h, i, i2, i3, i4)) {
            return;
        }
        this.h.set(i, i2, i3, i4);
        this.T = true;
    }

    public void S(Rect rect) {
        R(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void T(int i) {
        if (i != this.p0) {
            this.p0 = i;
            N();
        }
    }

    public void U(int i) {
        ax.K6.e eVar = new ax.K6.e(this.a.getContext(), i);
        if (eVar.j() != null) {
            this.p = eVar.j();
        }
        if (eVar.k() != 0.0f) {
            this.n = eVar.k();
        }
        ColorStateList colorStateList = eVar.c;
        if (colorStateList != null) {
            this.b0 = colorStateList;
        }
        this.Z = eVar.i;
        this.a0 = eVar.j;
        this.Y = eVar.k;
        this.g0 = eVar.m;
        ax.K6.a aVar = this.F;
        if (aVar != null) {
            aVar.c();
        }
        this.F = new ax.K6.a(new C0080a(), eVar.e());
        eVar.h(this.a.getContext(), this.F);
        N();
    }

    public void W(ColorStateList colorStateList) {
        if (this.p != colorStateList) {
            this.p = colorStateList;
            N();
        }
    }

    public void X(int i) {
        if (this.l != i) {
            this.l = i;
            N();
        }
    }

    public void Y(Typeface typeface) {
        if (Z(typeface)) {
            N();
        }
    }

    public void a0(int i, int i2, int i3, int i4) {
        b0(i, i2, i3, i4, true);
    }

    public void b0(int i, int i2, int i3, int i4, boolean z) {
        if (P(this.g, i, i2, i3, i4) && z == this.w0) {
            return;
        }
        this.g.set(i, i2, i3, i4);
        this.T = true;
        this.w0 = z;
    }

    public void c0(Rect rect) {
        a0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void d0(float f) {
        if (this.h0 != f) {
            this.h0 = f;
            N();
        }
    }

    public void e0(int i) {
        if (i != this.o0) {
            this.o0 = i;
            N();
        }
    }

    public void g0(int i) {
        if (this.k != i) {
            this.k = i;
            N();
        }
    }

    public void h0(float f) {
        if (this.m != f) {
            this.m = f;
            N();
        }
    }

    public void j0(float f) {
        float a = ax.W.a.a(f, 0.0f, 1.0f);
        if (a != this.b) {
            this.b = a;
            c();
        }
    }

    public void k(Canvas canvas) {
        int save = canvas.save();
        if (this.I == null || this.j.width() <= 0.0f || this.j.height() <= 0.0f) {
            return;
        }
        this.U.setTextSize(this.M);
        float f = this.v;
        float f2 = this.w;
        float f3 = this.L;
        if (f3 != 1.0f && !this.c) {
            canvas.scale(f3, f3, f, f2);
        }
        if (q0() && r0() && (!this.c || this.b > this.e)) {
            l(canvas, this.v - this.j0.getLineStart(0), f2);
        } else {
            canvas.translate(f, f2);
            this.j0.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    public void l0(TimeInterpolator timeInterpolator) {
        this.W = timeInterpolator;
        N();
    }

    public float m() {
        D(this.V);
        return (-this.V.ascent()) + this.V.descent();
    }

    public final boolean m0(int[] iArr) {
        this.S = iArr;
        if (!I()) {
            return false;
        }
        N();
        return true;
    }

    public float n() {
        D(this.V);
        return -this.V.ascent();
    }

    public void n0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.H, charSequence)) {
            this.H = charSequence;
            this.I = null;
            N();
        }
    }

    public void o(RectF rectF, int i, int i2) {
        this.J = f(this.H);
        rectF.left = Math.max(r(i, i2), this.h.left);
        rectF.top = this.h.top;
        rectF.right = Math.min(s(rectF, i, i2), this.h.right);
        rectF.bottom = this.h.top + q();
        if (this.j0 == null || r0()) {
            return;
        }
        float lineWidth = this.j0.getLineWidth(r4.getLineCount() - 1) * (this.n / this.m);
        if (this.J) {
            rectF.left = rectF.right - lineWidth;
        } else {
            rectF.right = rectF.left + lineWidth;
        }
    }

    public void o0(TimeInterpolator timeInterpolator) {
        this.X = timeInterpolator;
        N();
    }

    public ColorStateList p() {
        return this.p;
    }

    public void p0(Typeface typeface) {
        boolean Z = Z(typeface);
        boolean i0 = i0(typeface);
        if (Z || i0) {
            N();
        }
    }

    public float q() {
        int i = this.u0;
        return i != -1 ? i : n();
    }

    public void s0(int i) {
        D(this.V);
        float f = i;
        this.u0 = j(this.p0, this.V, this.H, f * (this.n / this.m), this.J).getHeight();
        E(this.V);
        this.v0 = j(this.o0, this.V, this.H, f, this.J).getHeight();
    }

    public int t() {
        return u(this.p);
    }

    public int w() {
        return this.q;
    }

    public int x() {
        return this.o0;
    }

    public float y() {
        E(this.V);
        return (-this.V.ascent()) + this.V.descent();
    }

    public float z() {
        int i = this.v0;
        return i != -1 ? i : A();
    }
}
