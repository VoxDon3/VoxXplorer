package ax.o4;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import ax.o4.C2690b;
import ax.o4.C2693e;
import ax.o4.C2695g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.ws.RealWebSocket;

/* renamed from: ax.o4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2721h {
    private static HashSet<String> i;
    private Canvas a;
    private float b;
    private C2695g c;
    private C0399h d;
    private Stack<C0399h> e;
    private Stack<C2695g.J> f;
    private Stack<Matrix> g;
    private C2690b.q h = null;

    /* renamed from: ax.o4.h$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[C2695g.E.d.values().length];
            c = iArr;
            try {
                iArr[C2695g.E.d.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[C2695g.E.d.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[C2695g.E.d.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[C2695g.E.c.values().length];
            b = iArr2;
            try {
                iArr2[C2695g.E.c.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[C2695g.E.c.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[C2695g.E.c.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[C2693e.a.values().length];
            a = iArr3;
            try {
                iArr3[C2693e.a.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[C2693e.a.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[C2693e.a.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[C2693e.a.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[C2693e.a.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[C2693e.a.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[C2693e.a.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[C2693e.a.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* renamed from: ax.o4.h$b */
    private class b implements C2695g.InterfaceC2718x {
        private float b;
        private float c;
        private boolean h;
        private List<c> a = new ArrayList();
        private c d = null;
        private boolean e = false;
        private boolean f = true;
        private int g = -1;

        b(C2695g.C2717w c2717w) {
            if (c2717w == null) {
                return;
            }
            c2717w.h(this);
            if (this.h) {
                this.d.b(this.a.get(this.g));
                this.a.set(this.g, this.d);
                this.h = false;
            }
            c cVar = this.d;
            if (cVar != null) {
                this.a.add(cVar);
            }
        }

        @Override // ax.o4.C2695g.InterfaceC2718x
        public void a(float f, float f2, float f3, float f4) {
            this.d.a(f, f2);
            this.a.add(this.d);
            this.d = C2721h.this.new c(f3, f4, f3 - f, f4 - f2);
            this.h = false;
        }

        @Override // ax.o4.C2695g.InterfaceC2718x
        public void b(float f, float f2) {
            if (this.h) {
                this.d.b(this.a.get(this.g));
                this.a.set(this.g, this.d);
                this.h = false;
            }
            c cVar = this.d;
            if (cVar != null) {
                this.a.add(cVar);
            }
            this.b = f;
            this.c = f2;
            this.d = C2721h.this.new c(f, f2, 0.0f, 0.0f);
            this.g = this.a.size();
        }

        @Override // ax.o4.C2695g.InterfaceC2718x
        public void c(float f, float f2, float f3, float f4, float f5, float f6) {
            if (this.f || this.e) {
                this.d.a(f, f2);
                this.a.add(this.d);
                this.e = false;
            }
            this.d = C2721h.this.new c(f5, f6, f5 - f3, f6 - f4);
            this.h = false;
        }

        @Override // ax.o4.C2695g.InterfaceC2718x
        public void close() {
            this.a.add(this.d);
            e(this.b, this.c);
            this.h = true;
        }

        @Override // ax.o4.C2695g.InterfaceC2718x
        public void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            this.e = true;
            this.f = false;
            c cVar = this.d;
            C2721h.h(cVar.a, cVar.b, f, f2, f3, z, z2, f4, f5, this);
            this.f = true;
            this.h = false;
        }

        @Override // ax.o4.C2695g.InterfaceC2718x
        public void e(float f, float f2) {
            this.d.a(f, f2);
            this.a.add(this.d);
            C2721h c2721h = C2721h.this;
            c cVar = this.d;
            this.d = c2721h.new c(f, f2, f - cVar.a, f2 - cVar.b);
            this.h = false;
        }

        List<c> f() {
            return this.a;
        }
    }

    /* renamed from: ax.o4.h$c */
    private class c {
        float a;
        float b;
        float c;
        float d;
        boolean e = false;

        c(float f, float f2, float f3, float f4) {
            this.c = 0.0f;
            this.d = 0.0f;
            this.a = f;
            this.b = f2;
            double sqrt = Math.sqrt((f3 * f3) + (f4 * f4));
            if (sqrt != 0.0d) {
                this.c = (float) (f3 / sqrt);
                this.d = (float) (f4 / sqrt);
            }
        }

        void a(float f, float f2) {
            float f3 = f - this.a;
            float f4 = f2 - this.b;
            double sqrt = Math.sqrt((f3 * f3) + (f4 * f4));
            if (sqrt != 0.0d) {
                f3 = (float) (f3 / sqrt);
                f4 = (float) (f4 / sqrt);
            }
            float f5 = this.c;
            if (f3 != (-f5) || f4 != (-this.d)) {
                this.c = f5 + f3;
                this.d += f4;
            } else {
                this.e = true;
                this.c = -f4;
                this.d = f3;
            }
        }

        void b(c cVar) {
            float f = cVar.c;
            float f2 = this.c;
            if (f == (-f2)) {
                float f3 = cVar.d;
                if (f3 == (-this.d)) {
                    this.e = true;
                    this.c = -f3;
                    this.d = cVar.c;
                    return;
                }
            }
            this.c = f2 + f;
            this.d += cVar.d;
        }

        public String toString() {
            return "(" + this.a + "," + this.b + " " + this.c + "," + this.d + ")";
        }
    }

    /* renamed from: ax.o4.h$d */
    private class d implements C2695g.InterfaceC2718x {
        Path a = new Path();
        float b;
        float c;

        d(C2695g.C2717w c2717w) {
            if (c2717w == null) {
                return;
            }
            c2717w.h(this);
        }

        @Override // ax.o4.C2695g.InterfaceC2718x
        public void a(float f, float f2, float f3, float f4) {
            this.a.quadTo(f, f2, f3, f4);
            this.b = f3;
            this.c = f4;
        }

        @Override // ax.o4.C2695g.InterfaceC2718x
        public void b(float f, float f2) {
            this.a.moveTo(f, f2);
            this.b = f;
            this.c = f2;
        }

        @Override // ax.o4.C2695g.InterfaceC2718x
        public void c(float f, float f2, float f3, float f4, float f5, float f6) {
            this.a.cubicTo(f, f2, f3, f4, f5, f6);
            this.b = f5;
            this.c = f6;
        }

        @Override // ax.o4.C2695g.InterfaceC2718x
        public void close() {
            this.a.close();
        }

        @Override // ax.o4.C2695g.InterfaceC2718x
        public void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            C2721h.h(this.b, this.c, f, f2, f3, z, z2, f4, f5, this);
            this.b = f4;
            this.c = f5;
        }

        @Override // ax.o4.C2695g.InterfaceC2718x
        public void e(float f, float f2) {
            this.a.lineTo(f, f2);
            this.b = f;
            this.c = f2;
        }

        Path f() {
            return this.a;
        }
    }

    /* renamed from: ax.o4.h$e */
    private class e extends f {
        private Path e;

        e(Path path, float f, float f2) {
            super(f, f2);
            this.e = path;
        }

        @Override // ax.o4.C2721h.f, ax.o4.C2721h.j
        public void b(String str) {
            String str2;
            if (C2721h.this.Y0()) {
                if (C2721h.this.d.b) {
                    str2 = str;
                    C2721h.this.a.drawTextOnPath(str2, this.e, this.b, this.c, C2721h.this.d.d);
                } else {
                    str2 = str;
                }
                if (C2721h.this.d.c) {
                    C2721h.this.a.drawTextOnPath(str2, this.e, this.b, this.c, C2721h.this.d.e);
                }
            } else {
                str2 = str;
            }
            this.b += C2721h.this.d.d.measureText(str2);
        }
    }

    /* renamed from: ax.o4.h$f */
    private class f extends j {
        float b;
        float c;

        f(float f, float f2) {
            super(C2721h.this, null);
            this.b = f;
            this.c = f2;
        }

        @Override // ax.o4.C2721h.j
        public void b(String str) {
            C2721h.y("TextSequence render", new Object[0]);
            if (C2721h.this.Y0()) {
                if (C2721h.this.d.b) {
                    C2721h.this.a.drawText(str, this.b, this.c, C2721h.this.d.d);
                }
                if (C2721h.this.d.c) {
                    C2721h.this.a.drawText(str, this.b, this.c, C2721h.this.d.e);
                }
            }
            this.b += C2721h.this.d.d.measureText(str);
        }
    }

    /* renamed from: ax.o4.h$g */
    private class g extends j {
        float b;
        float c;
        Path d;

        g(float f, float f2, Path path) {
            super(C2721h.this, null);
            this.b = f;
            this.c = f2;
            this.d = path;
        }

        @Override // ax.o4.C2721h.j
        public boolean a(C2695g.Y y) {
            if (!(y instanceof C2695g.Z)) {
                return true;
            }
            C2721h.Z0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // ax.o4.C2721h.j
        public void b(String str) {
            String str2;
            if (C2721h.this.Y0()) {
                Path path = new Path();
                str2 = str;
                C2721h.this.d.d.getTextPath(str2, 0, str.length(), this.b, this.c, path);
                this.d.addPath(path);
            } else {
                str2 = str;
            }
            this.b += C2721h.this.d.d.measureText(str2);
        }
    }

    /* renamed from: ax.o4.h$i */
    private class i extends j {
        float b;
        float c;
        RectF d;

        i(float f, float f2) {
            super(C2721h.this, null);
            this.d = new RectF();
            this.b = f;
            this.c = f2;
        }

        @Override // ax.o4.C2721h.j
        public boolean a(C2695g.Y y) {
            if (!(y instanceof C2695g.Z)) {
                return true;
            }
            C2695g.Z z = (C2695g.Z) y;
            C2695g.N r = y.a.r(z.o);
            if (r == null) {
                C2721h.F("TextPath path reference '%s' not found", z.o);
                return false;
            }
            C2695g.C2716v c2716v = (C2695g.C2716v) r;
            Path f = C2721h.this.new d(c2716v.o).f();
            Matrix matrix = c2716v.n;
            if (matrix != null) {
                f.transform(matrix);
            }
            RectF rectF = new RectF();
            f.computeBounds(rectF, true);
            this.d.union(rectF);
            return false;
        }

        @Override // ax.o4.C2721h.j
        public void b(String str) {
            if (C2721h.this.Y0()) {
                Rect rect = new Rect();
                C2721h.this.d.d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.b, this.c);
                this.d.union(rectF);
            }
            this.b += C2721h.this.d.d.measureText(str);
        }
    }

    /* renamed from: ax.o4.h$j */
    private abstract class j {
        private j() {
        }

        public boolean a(C2695g.Y y) {
            return true;
        }

        public abstract void b(String str);

        /* synthetic */ j(C2721h c2721h, a aVar) {
            this();
        }
    }

    C2721h(Canvas canvas, float f2) {
        this.a = canvas;
        this.b = f2;
    }

    private boolean A() {
        Boolean bool = this.d.a.B0;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private void A0(C2695g.N n) {
        if (n instanceof C2695g.InterfaceC2714t) {
            return;
        }
        S0();
        u(n);
        if (n instanceof C2695g.F) {
            x0((C2695g.F) n);
        } else if (n instanceof C2695g.e0) {
            E0((C2695g.e0) n);
        } else if (n instanceof C2695g.S) {
            B0((C2695g.S) n);
        } else if (n instanceof C2695g.C2707m) {
            q0((C2695g.C2707m) n);
        } else if (n instanceof C2695g.C2709o) {
            r0((C2695g.C2709o) n);
        } else if (n instanceof C2695g.C2716v) {
            t0((C2695g.C2716v) n);
        } else if (n instanceof C2695g.B) {
            w0((C2695g.B) n);
        } else if (n instanceof C2695g.C2699d) {
            o0((C2695g.C2699d) n);
        } else if (n instanceof C2695g.C2703i) {
            p0((C2695g.C2703i) n);
        } else if (n instanceof C2695g.C2711q) {
            s0((C2695g.C2711q) n);
        } else if (n instanceof C2695g.A) {
            v0((C2695g.A) n);
        } else if (n instanceof C2695g.C2720z) {
            u0((C2695g.C2720z) n);
        } else if (n instanceof C2695g.W) {
            D0((C2695g.W) n);
        }
        R0();
    }

    private void B(C2695g.K k2, Path path) {
        C2695g.O o = this.d.a.c0;
        if (o instanceof C2695g.C2715u) {
            C2695g.N r = this.c.r(((C2695g.C2715u) o).q);
            if (r instanceof C2695g.C2719y) {
                L(k2, path, (C2695g.C2719y) r);
                return;
            }
        }
        this.a.drawPath(path, this.d.d);
    }

    private void B0(C2695g.S s) {
        y("Switch render", new Object[0]);
        W0(this.d, s);
        if (A()) {
            Matrix matrix = s.o;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            p(s);
            boolean m0 = m0();
            K0(s);
            if (m0) {
                j0(s);
            }
            U0(s);
        }
    }

    private void C(Path path) {
        C0399h c0399h = this.d;
        if (c0399h.a.M0 != C2695g.E.i.NonScalingStroke) {
            this.a.drawPath(path, c0399h.e);
            return;
        }
        Matrix matrix = this.a.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.a.setMatrix(new Matrix());
        Shader shader = this.d.e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.a.drawPath(path2, this.d.e);
        this.a.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    private void C0(C2695g.T t, C2695g.C2697b c2697b) {
        y("Symbol render", new Object[0]);
        if (c2697b.c == 0.0f || c2697b.d == 0.0f) {
            return;
        }
        C2693e c2693e = t.o;
        if (c2693e == null) {
            c2693e = C2693e.e;
        }
        W0(this.d, t);
        C0399h c0399h = this.d;
        c0399h.f = c2697b;
        if (!c0399h.a.w0.booleanValue()) {
            C2695g.C2697b c2697b2 = this.d.f;
            O0(c2697b2.a, c2697b2.b, c2697b2.c, c2697b2.d);
        }
        C2695g.C2697b c2697b3 = t.p;
        if (c2697b3 != null) {
            this.a.concat(o(this.d.f, c2697b3, c2693e));
            this.d.g = t.p;
        } else {
            Canvas canvas = this.a;
            C2695g.C2697b c2697b4 = this.d.f;
            canvas.translate(c2697b4.a, c2697b4.b);
        }
        boolean m0 = m0();
        F0(t, true);
        if (m0) {
            j0(t);
        }
        U0(t);
    }

    private float D(float f2, float f3, float f4, float f5) {
        return (f2 * f4) + (f3 * f5);
    }

    private void D0(C2695g.W w) {
        y("Text render", new Object[0]);
        W0(this.d, w);
        if (A()) {
            Matrix matrix = w.s;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            List<C2695g.C2710p> list = w.o;
            float f2 = 0.0f;
            float h = (list == null || list.size() == 0) ? 0.0f : w.o.get(0).h(this);
            List<C2695g.C2710p> list2 = w.p;
            float i2 = (list2 == null || list2.size() == 0) ? 0.0f : w.p.get(0).i(this);
            List<C2695g.C2710p> list3 = w.q;
            float h2 = (list3 == null || list3.size() == 0) ? 0.0f : w.q.get(0).h(this);
            List<C2695g.C2710p> list4 = w.r;
            if (list4 != null && list4.size() != 0) {
                f2 = w.r.get(0).i(this);
            }
            C2695g.E.f O = O();
            if (O != C2695g.E.f.Start) {
                float n = n(w);
                if (O == C2695g.E.f.Middle) {
                    n /= 2.0f;
                }
                h -= n;
            }
            if (w.h == null) {
                i iVar = new i(h, i2);
                E(w, iVar);
                RectF rectF = iVar.d;
                w.h = new C2695g.C2697b(rectF.left, rectF.top, rectF.width(), iVar.d.height());
            }
            U0(w);
            r(w);
            p(w);
            boolean m0 = m0();
            E(w, new f(h + h2, i2 + f2));
            if (m0) {
                j0(w);
            }
        }
    }

    private void E(C2695g.Y y, j jVar) {
        if (A()) {
            Iterator<C2695g.N> it = y.i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                C2695g.N next = it.next();
                if (next instanceof C2695g.c0) {
                    jVar.b(T0(((C2695g.c0) next).c, z, !it.hasNext()));
                } else {
                    l0(next, jVar);
                }
                z = false;
            }
        }
    }

    private void E0(C2695g.e0 e0Var) {
        y("Use render", new Object[0]);
        C2695g.C2710p c2710p = e0Var.s;
        if (c2710p == null || !c2710p.k()) {
            C2695g.C2710p c2710p2 = e0Var.t;
            if (c2710p2 == null || !c2710p2.k()) {
                W0(this.d, e0Var);
                if (A()) {
                    C2695g.N r = e0Var.a.r(e0Var.p);
                    if (r == null) {
                        F("Use reference '%s' not found", e0Var.p);
                        return;
                    }
                    Matrix matrix = e0Var.o;
                    if (matrix != null) {
                        this.a.concat(matrix);
                    }
                    C2695g.C2710p c2710p3 = e0Var.q;
                    float h = c2710p3 != null ? c2710p3.h(this) : 0.0f;
                    C2695g.C2710p c2710p4 = e0Var.r;
                    this.a.translate(h, c2710p4 != null ? c2710p4.i(this) : 0.0f);
                    p(e0Var);
                    boolean m0 = m0();
                    i0(e0Var);
                    if (r instanceof C2695g.F) {
                        C2695g.C2697b f0 = f0(null, null, e0Var.s, e0Var.t);
                        S0();
                        y0((C2695g.F) r, f0);
                        R0();
                    } else if (r instanceof C2695g.T) {
                        C2695g.C2710p c2710p5 = e0Var.s;
                        if (c2710p5 == null) {
                            c2710p5 = new C2695g.C2710p(100.0f, C2695g.d0.percent);
                        }
                        C2695g.C2710p c2710p6 = e0Var.t;
                        if (c2710p6 == null) {
                            c2710p6 = new C2695g.C2710p(100.0f, C2695g.d0.percent);
                        }
                        C2695g.C2697b f02 = f0(null, null, c2710p5, c2710p6);
                        S0();
                        C0((C2695g.T) r, f02);
                        R0();
                    } else {
                        A0(r);
                    }
                    h0();
                    if (m0) {
                        j0(e0Var);
                    }
                    U0(e0Var);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    private void F0(C2695g.J j2, boolean z) {
        if (z) {
            i0(j2);
        }
        Iterator<C2695g.N> it = j2.b().iterator();
        while (it.hasNext()) {
            A0(it.next());
        }
        if (z) {
            h0();
        }
    }

    private void G(C2695g.Y y, StringBuilder sb) {
        Iterator<C2695g.N> it = y.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            C2695g.N next = it.next();
            if (next instanceof C2695g.Y) {
                G((C2695g.Y) next, sb);
            } else if (next instanceof C2695g.c0) {
                sb.append(T0(((C2695g.c0) next).c, z, !it.hasNext()));
            }
            z = false;
        }
    }

    private void H(C2695g.AbstractC2704j abstractC2704j, String str) {
        C2695g.N r = abstractC2704j.a.r(str);
        if (r == null) {
            Z0("Gradient reference '%s' not found", str);
            return;
        }
        if (!(r instanceof C2695g.AbstractC2704j)) {
            F("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (r == abstractC2704j) {
            F("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        C2695g.AbstractC2704j abstractC2704j2 = (C2695g.AbstractC2704j) r;
        if (abstractC2704j.i == null) {
            abstractC2704j.i = abstractC2704j2.i;
        }
        if (abstractC2704j.j == null) {
            abstractC2704j.j = abstractC2704j2.j;
        }
        if (abstractC2704j.k == null) {
            abstractC2704j.k = abstractC2704j2.k;
        }
        if (abstractC2704j.h.isEmpty()) {
            abstractC2704j.h = abstractC2704j2.h;
        }
        try {
            if (abstractC2704j instanceof C2695g.M) {
                I((C2695g.M) abstractC2704j, (C2695g.M) r);
            } else {
                J((C2695g.Q) abstractC2704j, (C2695g.Q) r);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = abstractC2704j2.l;
        if (str2 != null) {
            H(abstractC2704j, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0106, code lost:
    
        if (r7 != 8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void H0(ax.o4.C2695g.C2712r r12, ax.o4.C2721h.c r13) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.o4.C2721h.H0(ax.o4.g$r, ax.o4.h$c):void");
    }

    private void I(C2695g.M m, C2695g.M m2) {
        if (m.m == null) {
            m.m = m2.m;
        }
        if (m.n == null) {
            m.n = m2.n;
        }
        if (m.o == null) {
            m.o = m2.o;
        }
        if (m.p == null) {
            m.p = m2.p;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void I0(ax.o4.C2695g.AbstractC2706l r10) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.o4.C2721h.I0(ax.o4.g$l):void");
    }

    private void J(C2695g.Q q, C2695g.Q q2) {
        if (q.m == null) {
            q.m = q2.m;
        }
        if (q.n == null) {
            q.n = q2.n;
        }
        if (q.o == null) {
            q.o = q2.o;
        }
        if (q.p == null) {
            q.p = q2.p;
        }
        if (q.q == null) {
            q.q = q2.q;
        }
    }

    private void J0(C2695g.C2713s c2713s, C2695g.K k2, C2695g.C2697b c2697b) {
        float f2;
        float f3;
        y("Mask render", new Object[0]);
        Boolean bool = c2713s.o;
        if (bool == null || !bool.booleanValue()) {
            C2695g.C2710p c2710p = c2713s.s;
            float f4 = c2710p != null ? c2710p.f(this, 1.0f) : 1.2f;
            C2695g.C2710p c2710p2 = c2713s.t;
            float f5 = c2710p2 != null ? c2710p2.f(this, 1.0f) : 1.2f;
            f2 = f4 * c2697b.c;
            f3 = f5 * c2697b.d;
        } else {
            C2695g.C2710p c2710p3 = c2713s.s;
            f2 = c2710p3 != null ? c2710p3.h(this) : c2697b.c;
            C2695g.C2710p c2710p4 = c2713s.t;
            f3 = c2710p4 != null ? c2710p4.i(this) : c2697b.d;
        }
        if (f2 == 0.0f || f3 == 0.0f) {
            return;
        }
        S0();
        C0399h M = M(c2713s);
        this.d = M;
        M.a.n0 = Float.valueOf(1.0f);
        boolean m0 = m0();
        this.a.save();
        Boolean bool2 = c2713s.p;
        if (bool2 != null && !bool2.booleanValue()) {
            this.a.translate(c2697b.a, c2697b.b);
            this.a.scale(c2697b.c, c2697b.d);
        }
        F0(c2713s, false);
        this.a.restore();
        if (m0) {
            k0(k2, c2697b);
        }
        R0();
    }

    private void K(C2695g.C2719y c2719y, String str) {
        C2695g.N r = c2719y.a.r(str);
        if (r == null) {
            Z0("Pattern reference '%s' not found", str);
            return;
        }
        if (!(r instanceof C2695g.C2719y)) {
            F("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (r == c2719y) {
            F("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        C2695g.C2719y c2719y2 = (C2695g.C2719y) r;
        if (c2719y.q == null) {
            c2719y.q = c2719y2.q;
        }
        if (c2719y.r == null) {
            c2719y.r = c2719y2.r;
        }
        if (c2719y.s == null) {
            c2719y.s = c2719y2.s;
        }
        if (c2719y.t == null) {
            c2719y.t = c2719y2.t;
        }
        if (c2719y.u == null) {
            c2719y.u = c2719y2.u;
        }
        if (c2719y.v == null) {
            c2719y.v = c2719y2.v;
        }
        if (c2719y.w == null) {
            c2719y.w = c2719y2.w;
        }
        if (c2719y.i.isEmpty()) {
            c2719y.i = c2719y2.i;
        }
        if (c2719y.p == null) {
            c2719y.p = c2719y2.p;
        }
        if (c2719y.o == null) {
            c2719y.o = c2719y2.o;
        }
        String str2 = c2719y2.x;
        if (str2 != null) {
            K(c2719y, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void K0(C2695g.S s) {
        Set<String> a2;
        String language = Locale.getDefault().getLanguage();
        C2695g.k();
        for (C2695g.N n : s.b()) {
            if (n instanceof C2695g.G) {
                C2695g.G g2 = (C2695g.G) n;
                if (g2.d() == null && ((a2 = g2.a()) == null || (!a2.isEmpty() && a2.contains(language)))) {
                    Set<String> h = g2.h();
                    if (h != null) {
                        if (i == null) {
                            V();
                        }
                        if (!h.isEmpty() && i.containsAll(h)) {
                        }
                    }
                    Set<String> l = g2.l();
                    if (l != null) {
                        l.isEmpty();
                    } else {
                        Set<String> n2 = g2.n();
                        if (n2 == null) {
                            A0(n);
                            return;
                        }
                        n2.isEmpty();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void L(ax.o4.C2695g.K r23, android.graphics.Path r24, ax.o4.C2695g.C2719y r25) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.o4.C2721h.L(ax.o4.g$K, android.graphics.Path, ax.o4.g$y):void");
    }

    private void L0(C2695g.Z z) {
        y("TextPath render", new Object[0]);
        W0(this.d, z);
        if (A() && Y0()) {
            C2695g.N r = z.a.r(z.o);
            if (r == null) {
                F("TextPath reference '%s' not found", z.o);
                return;
            }
            C2695g.C2716v c2716v = (C2695g.C2716v) r;
            Path f2 = new d(c2716v.o).f();
            Matrix matrix = c2716v.n;
            if (matrix != null) {
                f2.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(f2, false);
            C2695g.C2710p c2710p = z.p;
            float f3 = c2710p != null ? c2710p.f(this, pathMeasure.getLength()) : 0.0f;
            C2695g.E.f O = O();
            if (O != C2695g.E.f.Start) {
                float n = n(z);
                if (O == C2695g.E.f.Middle) {
                    n /= 2.0f;
                }
                f3 -= n;
            }
            r((C2695g.K) z.f());
            boolean m0 = m0();
            E(z, new e(f2, f3, 0.0f));
            if (m0) {
                j0(z);
            }
        }
    }

    private C0399h M(C2695g.N n) {
        C0399h c0399h = new C0399h();
        V0(c0399h, C2695g.E.b());
        return N(n, c0399h);
    }

    private boolean M0() {
        return this.d.a.n0.floatValue() < 1.0f || this.d.a.H0 != null;
    }

    private C0399h N(C2695g.N n, C0399h c0399h) {
        int i2;
        ArrayList arrayList = new ArrayList();
        while (true) {
            i2 = 0;
            if (n instanceof C2695g.L) {
                arrayList.add(0, (C2695g.L) n);
            }
            Object obj = n.b;
            if (obj == null) {
                break;
            }
            n = (C2695g.N) obj;
        }
        int size = arrayList.size();
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            W0(c0399h, (C2695g.L) obj2);
        }
        C0399h c0399h2 = this.d;
        c0399h.g = c0399h2.g;
        c0399h.f = c0399h2.f;
        return c0399h;
    }

    private void N0() {
        this.d = new C0399h();
        this.e = new Stack<>();
        V0(this.d, C2695g.E.b());
        C0399h c0399h = this.d;
        c0399h.f = null;
        c0399h.h = false;
        this.e.push(new C0399h(c0399h));
        this.g = new Stack<>();
        this.f = new Stack<>();
    }

    private C2695g.E.f O() {
        C2695g.E.f fVar;
        C2695g.E e2 = this.d.a;
        if (e2.u0 == C2695g.E.h.LTR || (fVar = e2.v0) == C2695g.E.f.Middle) {
            return e2.v0;
        }
        C2695g.E.f fVar2 = C2695g.E.f.Start;
        return fVar == fVar2 ? C2695g.E.f.End : fVar2;
    }

    private void O0(float f2, float f3, float f4, float f5) {
        float f6 = f4 + f2;
        float f7 = f5 + f3;
        C2695g.C2698c c2698c = this.d.a.x0;
        if (c2698c != null) {
            f2 += c2698c.d.h(this);
            f3 += this.d.a.x0.a.i(this);
            f6 -= this.d.a.x0.b.h(this);
            f7 -= this.d.a.x0.c.i(this);
        }
        this.a.clipRect(f2, f3, f6, f7);
    }

    private Path.FillType P() {
        C2695g.E.a aVar = this.d.a.G0;
        return (aVar == null || aVar != C2695g.E.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private void P0(C0399h c0399h, boolean z, C2695g.O o) {
        int i2;
        C2695g.E e2 = c0399h.a;
        float floatValue = (z ? e2.e0 : e2.g0).floatValue();
        if (o instanceof C2695g.C2701f) {
            i2 = ((C2695g.C2701f) o).q;
        } else if (!(o instanceof C2695g.C0398g)) {
            return;
        } else {
            i2 = c0399h.a.o0.q;
        }
        int x = x(i2, floatValue);
        if (z) {
            c0399h.d.setColor(x);
        } else {
            c0399h.e.setColor(x);
        }
    }

    private void Q0(boolean z, C2695g.C c2) {
        if (z) {
            if (W(c2.e, 2147483648L)) {
                C0399h c0399h = this.d;
                C2695g.E e2 = c0399h.a;
                C2695g.O o = c2.e.I0;
                e2.c0 = o;
                c0399h.b = o != null;
            }
            if (W(c2.e, 4294967296L)) {
                this.d.a.e0 = c2.e.J0;
            }
            if (W(c2.e, 6442450944L)) {
                C0399h c0399h2 = this.d;
                P0(c0399h2, z, c0399h2.a.c0);
                return;
            }
            return;
        }
        if (W(c2.e, 2147483648L)) {
            C0399h c0399h3 = this.d;
            C2695g.E e3 = c0399h3.a;
            C2695g.O o2 = c2.e.I0;
            e3.f0 = o2;
            c0399h3.c = o2 != null;
        }
        if (W(c2.e, 4294967296L)) {
            this.d.a.g0 = c2.e.J0;
        }
        if (W(c2.e, 6442450944L)) {
            C0399h c0399h4 = this.d;
            P0(c0399h4, z, c0399h4.a.f0);
        }
    }

    private void R0() {
        this.a.restore();
        this.d = this.e.pop();
    }

    private void S0() {
        this.a.save();
        this.e.push(this.d);
        this.d = new C0399h(this.d);
    }

    private String T0(String str, boolean z, boolean z2) {
        if (this.d.h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", HttpUrl.FRAGMENT_ENCODE_SET).replaceAll("\\t", " ");
        if (z) {
            replaceAll = replaceAll.replaceAll("^\\s+", HttpUrl.FRAGMENT_ENCODE_SET);
        }
        if (z2) {
            replaceAll = replaceAll.replaceAll("\\s+$", HttpUrl.FRAGMENT_ENCODE_SET);
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    private Path.FillType U() {
        C2695g.E.a aVar = this.d.a.d0;
        return (aVar == null || aVar != C2695g.E.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private void U0(C2695g.K k2) {
        if (k2.b == null || k2.h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.g.peek().invert(matrix)) {
            C2695g.C2697b c2697b = k2.h;
            float f2 = c2697b.a;
            float f3 = c2697b.b;
            float b2 = c2697b.b();
            C2695g.C2697b c2697b2 = k2.h;
            float f4 = c2697b2.b;
            float b3 = c2697b2.b();
            float c2 = k2.h.c();
            C2695g.C2697b c2697b3 = k2.h;
            float[] fArr = {f2, f3, b2, f4, b3, c2, c2697b3.a, c2697b3.c()};
            matrix.preConcat(this.a.getMatrix());
            matrix.mapPoints(fArr);
            float f5 = fArr[0];
            float f6 = fArr[1];
            RectF rectF = new RectF(f5, f6, f5, f6);
            for (int i2 = 2; i2 <= 6; i2 += 2) {
                float f7 = fArr[i2];
                if (f7 < rectF.left) {
                    rectF.left = f7;
                }
                if (f7 > rectF.right) {
                    rectF.right = f7;
                }
                float f8 = fArr[i2 + 1];
                if (f8 < rectF.top) {
                    rectF.top = f8;
                }
                if (f8 > rectF.bottom) {
                    rectF.bottom = f8;
                }
            }
            C2695g.K k3 = (C2695g.K) this.f.peek();
            C2695g.C2697b c2697b4 = k3.h;
            if (c2697b4 == null) {
                k3.h = C2695g.C2697b.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                c2697b4.e(C2695g.C2697b.a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    private static synchronized void V() {
        synchronized (C2721h.class) {
            HashSet<String> hashSet = new HashSet<>();
            i = hashSet;
            hashSet.add("Structure");
            i.add("BasicStructure");
            i.add("ConditionalProcessing");
            i.add("Image");
            i.add("Style");
            i.add("ViewportAttribute");
            i.add("Shape");
            i.add("BasicText");
            i.add("PaintAttribute");
            i.add("BasicPaintAttribute");
            i.add("OpacityAttribute");
            i.add("BasicGraphicsAttribute");
            i.add("Marker");
            i.add("Gradient");
            i.add("Pattern");
            i.add("Clip");
            i.add("BasicClip");
            i.add("Mask");
            i.add("View");
        }
    }

    private void V0(C0399h c0399h, C2695g.E e2) {
        if (W(e2, 4096L)) {
            c0399h.a.o0 = e2.o0;
        }
        if (W(e2, 2048L)) {
            c0399h.a.n0 = e2.n0;
        }
        if (W(e2, 1L)) {
            c0399h.a.c0 = e2.c0;
            C2695g.O o = e2.c0;
            c0399h.b = (o == null || o == C2695g.C2701f.d0) ? false : true;
        }
        if (W(e2, 4L)) {
            c0399h.a.e0 = e2.e0;
        }
        if (W(e2, 6149L)) {
            P0(c0399h, true, c0399h.a.c0);
        }
        if (W(e2, 2L)) {
            c0399h.a.d0 = e2.d0;
        }
        if (W(e2, 8L)) {
            c0399h.a.f0 = e2.f0;
            C2695g.O o2 = e2.f0;
            c0399h.c = (o2 == null || o2 == C2695g.C2701f.d0) ? false : true;
        }
        if (W(e2, 16L)) {
            c0399h.a.g0 = e2.g0;
        }
        if (W(e2, 6168L)) {
            P0(c0399h, false, c0399h.a.f0);
        }
        if (W(e2, 34359738368L)) {
            c0399h.a.M0 = e2.M0;
        }
        if (W(e2, 32L)) {
            C2695g.E e3 = c0399h.a;
            C2695g.C2710p c2710p = e2.h0;
            e3.h0 = c2710p;
            c0399h.e.setStrokeWidth(c2710p.d(this));
        }
        if (W(e2, 64L)) {
            c0399h.a.i0 = e2.i0;
            int i2 = a.b[e2.i0.ordinal()];
            if (i2 == 1) {
                c0399h.e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i2 == 2) {
                c0399h.e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i2 == 3) {
                c0399h.e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (W(e2, 128L)) {
            c0399h.a.j0 = e2.j0;
            int i3 = a.c[e2.j0.ordinal()];
            if (i3 == 1) {
                c0399h.e.setStrokeJoin(Paint.Join.MITER);
            } else if (i3 == 2) {
                c0399h.e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i3 == 3) {
                c0399h.e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (W(e2, 256L)) {
            c0399h.a.k0 = e2.k0;
            c0399h.e.setStrokeMiter(e2.k0.floatValue());
        }
        if (W(e2, 512L)) {
            c0399h.a.l0 = e2.l0;
        }
        if (W(e2, RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE)) {
            c0399h.a.m0 = e2.m0;
        }
        Typeface typeface = null;
        if (W(e2, 1536L)) {
            C2695g.C2710p[] c2710pArr = c0399h.a.l0;
            if (c2710pArr == null) {
                c0399h.e.setPathEffect(null);
            } else {
                int length = c2710pArr.length;
                int i4 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i4];
                float f2 = 0.0f;
                for (int i5 = 0; i5 < i4; i5++) {
                    float d2 = c0399h.a.l0[i5 % length].d(this);
                    fArr[i5] = d2;
                    f2 += d2;
                }
                if (f2 == 0.0f) {
                    c0399h.e.setPathEffect(null);
                } else {
                    float d3 = c0399h.a.m0.d(this);
                    if (d3 < 0.0f) {
                        d3 = (d3 % f2) + f2;
                    }
                    c0399h.e.setPathEffect(new DashPathEffect(fArr, d3));
                }
            }
        }
        if (W(e2, Http2Stream.EMIT_BUFFER_SIZE)) {
            float Q = Q();
            c0399h.a.q0 = e2.q0;
            c0399h.d.setTextSize(e2.q0.f(this, Q));
            c0399h.e.setTextSize(e2.q0.f(this, Q));
        }
        if (W(e2, 8192L)) {
            c0399h.a.p0 = e2.p0;
        }
        if (W(e2, 32768L)) {
            if (e2.r0.intValue() == -1 && c0399h.a.r0.intValue() > 100) {
                C2695g.E e4 = c0399h.a;
                e4.r0 = Integer.valueOf(e4.r0.intValue() - 100);
            } else if (e2.r0.intValue() != 1 || c0399h.a.r0.intValue() >= 900) {
                c0399h.a.r0 = e2.r0;
            } else {
                C2695g.E e5 = c0399h.a;
                e5.r0 = Integer.valueOf(e5.r0.intValue() + 100);
            }
        }
        if (W(e2, 65536L)) {
            c0399h.a.s0 = e2.s0;
        }
        if (W(e2, 106496L)) {
            if (c0399h.a.p0 != null && this.c != null) {
                C2695g.k();
                for (String str : c0399h.a.p0) {
                    C2695g.E e6 = c0399h.a;
                    typeface = t(str, e6.r0, e6.s0);
                    if (typeface != null) {
                        break;
                    }
                }
            }
            if (typeface == null) {
                C2695g.E e7 = c0399h.a;
                typeface = t("serif", e7.r0, e7.s0);
            }
            c0399h.d.setTypeface(typeface);
            c0399h.e.setTypeface(typeface);
        }
        if (W(e2, 131072L)) {
            c0399h.a.t0 = e2.t0;
            Paint paint = c0399h.d;
            C2695g.E.EnumC0397g enumC0397g = e2.t0;
            C2695g.E.EnumC0397g enumC0397g2 = C2695g.E.EnumC0397g.LineThrough;
            paint.setStrikeThruText(enumC0397g == enumC0397g2);
            Paint paint2 = c0399h.d;
            C2695g.E.EnumC0397g enumC0397g3 = e2.t0;
            C2695g.E.EnumC0397g enumC0397g4 = C2695g.E.EnumC0397g.Underline;
            paint2.setUnderlineText(enumC0397g3 == enumC0397g4);
            c0399h.e.setStrikeThruText(e2.t0 == enumC0397g2);
            c0399h.e.setUnderlineText(e2.t0 == enumC0397g4);
        }
        if (W(e2, 68719476736L)) {
            c0399h.a.u0 = e2.u0;
        }
        if (W(e2, 262144L)) {
            c0399h.a.v0 = e2.v0;
        }
        if (W(e2, 524288L)) {
            c0399h.a.w0 = e2.w0;
        }
        if (W(e2, 2097152L)) {
            c0399h.a.y0 = e2.y0;
        }
        if (W(e2, 4194304L)) {
            c0399h.a.z0 = e2.z0;
        }
        if (W(e2, 8388608L)) {
            c0399h.a.A0 = e2.A0;
        }
        if (W(e2, 16777216L)) {
            c0399h.a.B0 = e2.B0;
        }
        if (W(e2, 33554432L)) {
            c0399h.a.C0 = e2.C0;
        }
        if (W(e2, 1048576L)) {
            c0399h.a.x0 = e2.x0;
        }
        if (W(e2, 268435456L)) {
            c0399h.a.F0 = e2.F0;
        }
        if (W(e2, 536870912L)) {
            c0399h.a.G0 = e2.G0;
        }
        if (W(e2, 1073741824L)) {
            c0399h.a.H0 = e2.H0;
        }
        if (W(e2, 67108864L)) {
            c0399h.a.D0 = e2.D0;
        }
        if (W(e2, 134217728L)) {
            c0399h.a.E0 = e2.E0;
        }
        if (W(e2, 8589934592L)) {
            c0399h.a.K0 = e2.K0;
        }
        if (W(e2, 17179869184L)) {
            c0399h.a.L0 = e2.L0;
        }
        if (W(e2, 137438953472L)) {
            c0399h.a.N0 = e2.N0;
        }
    }

    private boolean W(C2695g.E e2, long j2) {
        return (j2 & e2.q) != 0;
    }

    private void W0(C0399h c0399h, C2695g.L l) {
        c0399h.a.c(l.b == null);
        C2695g.E e2 = l.e;
        if (e2 != null) {
            V0(c0399h, e2);
        }
        if (this.c.n()) {
            for (C2690b.p pVar : this.c.d()) {
                if (C2690b.l(this.h, pVar.a, l)) {
                    V0(c0399h, pVar.b);
                }
            }
        }
        C2695g.E e3 = l.f;
        if (e3 != null) {
            V0(c0399h, e3);
        }
    }

    private void X(boolean z, C2695g.C2697b c2697b, C2695g.M m) {
        float f2;
        float f3;
        float f4;
        float f5;
        String str = m.l;
        if (str != null) {
            H(m, str);
        }
        Boolean bool = m.i;
        int i2 = 0;
        boolean z2 = bool != null && bool.booleanValue();
        C0399h c0399h = this.d;
        Paint paint = z ? c0399h.d : c0399h.e;
        if (z2) {
            C2695g.C2697b S = S();
            C2695g.C2710p c2710p = m.m;
            float h = c2710p != null ? c2710p.h(this) : 0.0f;
            C2695g.C2710p c2710p2 = m.n;
            f2 = c2710p2 != null ? c2710p2.i(this) : 0.0f;
            C2695g.C2710p c2710p3 = m.o;
            float h2 = c2710p3 != null ? c2710p3.h(this) : S.c;
            C2695g.C2710p c2710p4 = m.p;
            f5 = h2;
            f3 = h;
            f4 = c2710p4 != null ? c2710p4.i(this) : 0.0f;
        } else {
            C2695g.C2710p c2710p5 = m.m;
            float f6 = c2710p5 != null ? c2710p5.f(this, 1.0f) : 0.0f;
            C2695g.C2710p c2710p6 = m.n;
            f2 = c2710p6 != null ? c2710p6.f(this, 1.0f) : 0.0f;
            C2695g.C2710p c2710p7 = m.o;
            float f7 = c2710p7 != null ? c2710p7.f(this, 1.0f) : 1.0f;
            C2695g.C2710p c2710p8 = m.p;
            f3 = f6;
            f4 = c2710p8 != null ? c2710p8.f(this, 1.0f) : 0.0f;
            f5 = f7;
        }
        float f8 = f2;
        S0();
        this.d = M(m);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(c2697b.a, c2697b.b);
            matrix.preScale(c2697b.c, c2697b.d);
        }
        Matrix matrix2 = m.j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = m.h.size();
        if (size == 0) {
            R0();
            if (z) {
                this.d.b = false;
                return;
            } else {
                this.d.c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator<C2695g.N> it = m.h.iterator();
        float f9 = -1.0f;
        while (it.hasNext()) {
            C2695g.D d2 = (C2695g.D) it.next();
            Float f10 = d2.h;
            float floatValue = f10 != null ? f10.floatValue() : 0.0f;
            if (i2 == 0 || floatValue >= f9) {
                fArr[i2] = floatValue;
                f9 = floatValue;
            } else {
                fArr[i2] = f9;
            }
            S0();
            W0(this.d, d2);
            C2695g.E e2 = this.d.a;
            C2695g.C2701f c2701f = (C2695g.C2701f) e2.D0;
            if (c2701f == null) {
                c2701f = C2695g.C2701f.c0;
            }
            iArr[i2] = x(c2701f.q, e2.E0.floatValue());
            i2++;
            R0();
        }
        if ((f3 == f5 && f8 == f4) || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        C2695g.EnumC2705k enumC2705k = m.k;
        if (enumC2705k != null) {
            if (enumC2705k == C2695g.EnumC2705k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (enumC2705k == C2695g.EnumC2705k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        LinearGradient linearGradient = new LinearGradient(f3, f8, f5, f4, iArr, fArr, tileMode2);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(w(this.d.a.e0.floatValue()));
    }

    private void X0() {
        int i2;
        C2695g.E e2 = this.d.a;
        C2695g.O o = e2.K0;
        if (o instanceof C2695g.C2701f) {
            i2 = ((C2695g.C2701f) o).q;
        } else if (!(o instanceof C2695g.C0398g)) {
            return;
        } else {
            i2 = e2.o0.q;
        }
        Float f2 = e2.L0;
        if (f2 != null) {
            i2 = x(i2, f2.floatValue());
        }
        this.a.drawColor(i2);
    }

    private Path Y(C2695g.C2699d c2699d) {
        C2695g.C2710p c2710p = c2699d.o;
        float h = c2710p != null ? c2710p.h(this) : 0.0f;
        C2695g.C2710p c2710p2 = c2699d.p;
        float i2 = c2710p2 != null ? c2710p2.i(this) : 0.0f;
        float d2 = c2699d.q.d(this);
        float f2 = h - d2;
        float f3 = i2 - d2;
        float f4 = h + d2;
        float f5 = i2 + d2;
        if (c2699d.h == null) {
            float f6 = 2.0f * d2;
            c2699d.h = new C2695g.C2697b(f2, f3, f6, f6);
        }
        float f7 = d2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(h, f3);
        float f8 = h + f7;
        float f9 = i2 - f7;
        path.cubicTo(f8, f3, f4, f9, f4, i2);
        float f10 = i2 + f7;
        path.cubicTo(f4, f10, f8, f5, h, f5);
        float f11 = h - f7;
        path.cubicTo(f11, f5, f2, f10, f2, i2);
        path.cubicTo(f2, f9, f11, f3, h, f3);
        path.close();
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Y0() {
        Boolean bool = this.d.a.C0;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private Path Z(C2695g.C2703i c2703i) {
        C2695g.C2710p c2710p = c2703i.o;
        float h = c2710p != null ? c2710p.h(this) : 0.0f;
        C2695g.C2710p c2710p2 = c2703i.p;
        float i2 = c2710p2 != null ? c2710p2.i(this) : 0.0f;
        float h2 = c2703i.q.h(this);
        float i3 = c2703i.r.i(this);
        float f2 = h - h2;
        float f3 = i2 - i3;
        float f4 = h + h2;
        float f5 = i2 + i3;
        if (c2703i.h == null) {
            c2703i.h = new C2695g.C2697b(f2, f3, h2 * 2.0f, 2.0f * i3);
        }
        float f6 = h2 * 0.5522848f;
        float f7 = i3 * 0.5522848f;
        Path path = new Path();
        path.moveTo(h, f3);
        float f8 = h + f6;
        float f9 = i2 - f7;
        path.cubicTo(f8, f3, f4, f9, f4, i2);
        float f10 = i2 + f7;
        path.cubicTo(f4, f10, f8, f5, h, f5);
        float f11 = h - f6;
        path.cubicTo(f11, f5, f2, f10, f2, i2);
        path.cubicTo(f2, f9, f11, f3, h, f3);
        path.close();
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Z0(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    private Path a0(C2695g.C2711q c2711q) {
        C2695g.C2710p c2710p = c2711q.o;
        float h = c2710p == null ? 0.0f : c2710p.h(this);
        C2695g.C2710p c2710p2 = c2711q.p;
        float i2 = c2710p2 == null ? 0.0f : c2710p2.i(this);
        C2695g.C2710p c2710p3 = c2711q.q;
        float h2 = c2710p3 == null ? 0.0f : c2710p3.h(this);
        C2695g.C2710p c2710p4 = c2711q.r;
        float i3 = c2710p4 != null ? c2710p4.i(this) : 0.0f;
        if (c2711q.h == null) {
            c2711q.h = new C2695g.C2697b(Math.min(h, h2), Math.min(i2, i3), Math.abs(h2 - h), Math.abs(i3 - i2));
        }
        Path path = new Path();
        path.moveTo(h, i2);
        path.lineTo(h2, i3);
        return path;
    }

    private Path b0(C2695g.C2720z c2720z) {
        Path path = new Path();
        float[] fArr = c2720z.o;
        path.moveTo(fArr[0], fArr[1]);
        int i2 = 2;
        while (true) {
            float[] fArr2 = c2720z.o;
            if (i2 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i2], fArr2[i2 + 1]);
            i2 += 2;
        }
        if (c2720z instanceof C2695g.A) {
            path.close();
        }
        if (c2720z.h == null) {
            c2720z.h = m(path);
        }
        return path;
    }

    private Path c0(C2695g.B b2) {
        float h;
        float i2;
        C2695g.C2710p c2710p = b2.s;
        if (c2710p == null && b2.t == null) {
            h = 0.0f;
            i2 = 0.0f;
        } else {
            if (c2710p == null) {
                h = b2.t.i(this);
            } else if (b2.t == null) {
                h = c2710p.h(this);
            } else {
                h = c2710p.h(this);
                i2 = b2.t.i(this);
            }
            i2 = h;
        }
        float min = Math.min(h, b2.q.h(this) / 2.0f);
        float min2 = Math.min(i2, b2.r.i(this) / 2.0f);
        C2695g.C2710p c2710p2 = b2.o;
        float h2 = c2710p2 != null ? c2710p2.h(this) : 0.0f;
        C2695g.C2710p c2710p3 = b2.p;
        float i3 = c2710p3 != null ? c2710p3.i(this) : 0.0f;
        float h3 = b2.q.h(this);
        float i4 = b2.r.i(this);
        if (b2.h == null) {
            b2.h = new C2695g.C2697b(h2, i3, h3, i4);
        }
        float f2 = h3 + h2;
        float f3 = i3 + i4;
        Path path = new Path();
        if (min == 0.0f || min2 == 0.0f) {
            path.moveTo(h2, i3);
            path.lineTo(f2, i3);
            path.lineTo(f2, f3);
            path.lineTo(h2, f3);
            path.lineTo(h2, i3);
        } else {
            float f4 = min * 0.5522848f;
            float f5 = 0.5522848f * min2;
            float f6 = i3 + min2;
            path.moveTo(h2, f6);
            float f7 = f6 - f5;
            float f8 = h2 + min;
            float f9 = f8 - f4;
            path.cubicTo(h2, f7, f9, i3, f8, i3);
            float f10 = f2 - min;
            path.lineTo(f10, i3);
            float f11 = f10 + f4;
            path.cubicTo(f11, i3, f2, f7, f2, f6);
            float f12 = f3 - min2;
            path.lineTo(f2, f12);
            float f13 = f12 + f5;
            path.cubicTo(f2, f13, f11, f3, f10, f3);
            path.lineTo(f8, f3);
            float f14 = h2;
            path.cubicTo(f9, f3, f14, f13, h2, f12);
            path.lineTo(f14, f6);
        }
        path.close();
        return path;
    }

    private Path d0(C2695g.W w) {
        List<C2695g.C2710p> list = w.o;
        float f2 = 0.0f;
        float h = (list == null || list.size() == 0) ? 0.0f : w.o.get(0).h(this);
        List<C2695g.C2710p> list2 = w.p;
        float i2 = (list2 == null || list2.size() == 0) ? 0.0f : w.p.get(0).i(this);
        List<C2695g.C2710p> list3 = w.q;
        float h2 = (list3 == null || list3.size() == 0) ? 0.0f : w.q.get(0).h(this);
        List<C2695g.C2710p> list4 = w.r;
        if (list4 != null && list4.size() != 0) {
            f2 = w.r.get(0).i(this);
        }
        if (this.d.a.v0 != C2695g.E.f.Start) {
            float n = n(w);
            if (this.d.a.v0 == C2695g.E.f.Middle) {
                n /= 2.0f;
            }
            h -= n;
        }
        if (w.h == null) {
            i iVar = new i(h, i2);
            E(w, iVar);
            RectF rectF = iVar.d;
            w.h = new C2695g.C2697b(rectF.left, rectF.top, rectF.width(), iVar.d.height());
        }
        Path path = new Path();
        E(w, new g(h + h2, i2 + f2, path));
        return path;
    }

    private void e0(boolean z, C2695g.C2697b c2697b, C2695g.Q q) {
        float f2;
        float f3;
        float f4;
        String str = q.l;
        if (str != null) {
            H(q, str);
        }
        Boolean bool = q.i;
        int i2 = 0;
        boolean z2 = bool != null && bool.booleanValue();
        C0399h c0399h = this.d;
        Paint paint = z ? c0399h.d : c0399h.e;
        if (z2) {
            C2695g.C2710p c2710p = new C2695g.C2710p(50.0f, C2695g.d0.percent);
            C2695g.C2710p c2710p2 = q.m;
            float h = c2710p2 != null ? c2710p2.h(this) : c2710p.h(this);
            C2695g.C2710p c2710p3 = q.n;
            float i3 = c2710p3 != null ? c2710p3.i(this) : c2710p.i(this);
            C2695g.C2710p c2710p4 = q.o;
            f3 = c2710p4 != null ? c2710p4.d(this) : c2710p.d(this);
            f2 = h;
            f4 = i3;
        } else {
            C2695g.C2710p c2710p5 = q.m;
            float f5 = c2710p5 != null ? c2710p5.f(this, 1.0f) : 0.5f;
            C2695g.C2710p c2710p6 = q.n;
            float f6 = c2710p6 != null ? c2710p6.f(this, 1.0f) : 0.5f;
            C2695g.C2710p c2710p7 = q.o;
            f2 = f5;
            f3 = c2710p7 != null ? c2710p7.f(this, 1.0f) : 0.5f;
            f4 = f6;
        }
        S0();
        this.d = M(q);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(c2697b.a, c2697b.b);
            matrix.preScale(c2697b.c, c2697b.d);
        }
        Matrix matrix2 = q.j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = q.h.size();
        if (size == 0) {
            R0();
            if (z) {
                this.d.b = false;
                return;
            } else {
                this.d.c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator<C2695g.N> it = q.h.iterator();
        float f7 = -1.0f;
        while (it.hasNext()) {
            C2695g.D d2 = (C2695g.D) it.next();
            Float f8 = d2.h;
            float floatValue = f8 != null ? f8.floatValue() : 0.0f;
            if (i2 == 0 || floatValue >= f7) {
                fArr[i2] = floatValue;
                f7 = floatValue;
            } else {
                fArr[i2] = f7;
            }
            S0();
            W0(this.d, d2);
            C2695g.E e2 = this.d.a;
            C2695g.C2701f c2701f = (C2695g.C2701f) e2.D0;
            if (c2701f == null) {
                c2701f = C2695g.C2701f.c0;
            }
            iArr[i2] = x(c2701f.q, e2.E0.floatValue());
            i2++;
            R0();
        }
        if (f3 == 0.0f || size == 1) {
            R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        C2695g.EnumC2705k enumC2705k = q.k;
        if (enumC2705k != null) {
            if (enumC2705k == C2695g.EnumC2705k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (enumC2705k == C2695g.EnumC2705k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        R0();
        RadialGradient radialGradient = new RadialGradient(f2, f4, f3, iArr, fArr, tileMode2);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(w(this.d.a.e0.floatValue()));
    }

    private C2695g.C2697b f0(C2695g.C2710p c2710p, C2695g.C2710p c2710p2, C2695g.C2710p c2710p3, C2695g.C2710p c2710p4) {
        float h = c2710p != null ? c2710p.h(this) : 0.0f;
        float i2 = c2710p2 != null ? c2710p2.i(this) : 0.0f;
        C2695g.C2697b S = S();
        return new C2695g.C2697b(h, i2, c2710p3 != null ? c2710p3.h(this) : S.c, c2710p4 != null ? c2710p4.i(this) : S.d);
    }

    @TargetApi(19)
    private Path g0(C2695g.K k2, boolean z) {
        Path d0;
        Path j2;
        this.e.push(this.d);
        C0399h c0399h = new C0399h(this.d);
        this.d = c0399h;
        W0(c0399h, k2);
        if (!A() || !Y0()) {
            this.d = this.e.pop();
            return null;
        }
        if (k2 instanceof C2695g.e0) {
            if (!z) {
                F("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            C2695g.e0 e0Var = (C2695g.e0) k2;
            C2695g.N r = k2.a.r(e0Var.p);
            if (r == null) {
                F("Use reference '%s' not found", e0Var.p);
                this.d = this.e.pop();
                return null;
            }
            if (!(r instanceof C2695g.K)) {
                this.d = this.e.pop();
                return null;
            }
            d0 = g0((C2695g.K) r, false);
            if (d0 == null) {
                return null;
            }
            if (e0Var.h == null) {
                e0Var.h = m(d0);
            }
            Matrix matrix = e0Var.o;
            if (matrix != null) {
                d0.transform(matrix);
            }
        } else if (k2 instanceof C2695g.AbstractC2706l) {
            C2695g.AbstractC2706l abstractC2706l = (C2695g.AbstractC2706l) k2;
            if (k2 instanceof C2695g.C2716v) {
                d0 = new d(((C2695g.C2716v) k2).o).f();
                if (k2.h == null) {
                    k2.h = m(d0);
                }
            } else {
                d0 = k2 instanceof C2695g.B ? c0((C2695g.B) k2) : k2 instanceof C2695g.C2699d ? Y((C2695g.C2699d) k2) : k2 instanceof C2695g.C2703i ? Z((C2695g.C2703i) k2) : k2 instanceof C2695g.C2720z ? b0((C2695g.C2720z) k2) : null;
            }
            if (d0 == null) {
                return null;
            }
            if (abstractC2706l.h == null) {
                abstractC2706l.h = m(d0);
            }
            Matrix matrix2 = abstractC2706l.n;
            if (matrix2 != null) {
                d0.transform(matrix2);
            }
            d0.setFillType(P());
        } else {
            if (!(k2 instanceof C2695g.W)) {
                F("Invalid %s element found in clipPath definition", k2.o());
                return null;
            }
            C2695g.W w = (C2695g.W) k2;
            d0 = d0(w);
            if (d0 == null) {
                return null;
            }
            Matrix matrix3 = w.s;
            if (matrix3 != null) {
                d0.transform(matrix3);
            }
            d0.setFillType(P());
        }
        if (this.d.a.F0 != null && (j2 = j(k2, k2.h)) != null) {
            d0.op(j2, Path.Op.INTERSECT);
        }
        this.d = this.e.pop();
        return d0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(float f2, float f3, float f4, float f5, float f6, boolean z, boolean z2, float f7, float f8, C2695g.InterfaceC2718x interfaceC2718x) {
        if (f2 == f7 && f3 == f8) {
            return;
        }
        if (f4 == 0.0f || f5 == 0.0f) {
            interfaceC2718x.e(f7, f8);
            return;
        }
        float abs = Math.abs(f4);
        float abs2 = Math.abs(f5);
        double radians = Math.toRadians(f6 % 360.0d);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d2 = (f2 - f7) / 2.0d;
        double d3 = (f3 - f8) / 2.0d;
        double d4 = (cos * d2) + (sin * d3);
        double d5 = ((-sin) * d2) + (cos * d3);
        double d6 = abs * abs;
        double d7 = abs2 * abs2;
        double d8 = d4 * d4;
        double d9 = d5 * d5;
        double d10 = (d8 / d6) + (d9 / d7);
        if (d10 > 0.99999d) {
            double sqrt = Math.sqrt(d10) * 1.00001d;
            abs = (float) (abs * sqrt);
            abs2 = (float) (sqrt * abs2);
            d6 = abs * abs;
            d7 = abs2 * abs2;
        }
        double d11 = z == z2 ? -1.0d : 1.0d;
        double d12 = d6 * d7;
        double d13 = d6 * d9;
        double d14 = d7 * d8;
        double d15 = ((d12 - d13) - d14) / (d13 + d14);
        if (d15 < 0.0d) {
            d15 = 0.0d;
        }
        double sqrt2 = d11 * Math.sqrt(d15);
        double d16 = abs;
        double d17 = abs2;
        double d18 = ((d16 * d5) / d17) * sqrt2;
        double d19 = (-((d17 * d4) / d16)) * sqrt2;
        double d20 = ((f2 + f7) / 2.0d) + ((cos * d18) - (sin * d19));
        double d21 = ((f3 + f8) / 2.0d) + (sin * d18) + (cos * d19);
        double d22 = (d4 - d18) / d16;
        double d23 = (d5 - d19) / d17;
        double d24 = ((-d4) - d18) / d16;
        double d25 = ((-d5) - d19) / d17;
        double d26 = (d22 * d22) + (d23 * d23);
        double acos = (d23 < 0.0d ? -1.0d : 1.0d) * Math.acos(d22 / Math.sqrt(d26));
        double v = ((d22 * d25) - (d23 * d24) < 0.0d ? -1.0d : 1.0d) * v(((d22 * d24) + (d23 * d25)) / Math.sqrt(d26 * ((d24 * d24) + (d25 * d25))));
        if (!z2 && v > 0.0d) {
            v -= 6.283185307179586d;
        } else if (z2 && v < 0.0d) {
            v += 6.283185307179586d;
        }
        float[] i2 = i(acos % 6.283185307179586d, v % 6.283185307179586d);
        Matrix matrix = new Matrix();
        matrix.postScale(abs, abs2);
        matrix.postRotate(f6);
        matrix.postTranslate((float) d20, (float) d21);
        matrix.mapPoints(i2);
        i2[i2.length - 2] = f7;
        i2[i2.length - 1] = f8;
        for (int i3 = 0; i3 < i2.length; i3 += 6) {
            interfaceC2718x.c(i2[i3], i2[i3 + 1], i2[i3 + 2], i2[i3 + 3], i2[i3 + 4], i2[i3 + 5]);
        }
    }

    private void h0() {
        this.f.pop();
        this.g.pop();
    }

    private static float[] i(double d2, double d3) {
        int ceil = (int) Math.ceil((Math.abs(d3) * 2.0d) / 3.141592653589793d);
        double d4 = d3 / ceil;
        double d5 = d4 / 2.0d;
        double sin = (Math.sin(d5) * 1.3333333333333333d) / (Math.cos(d5) + 1.0d);
        float[] fArr = new float[ceil * 6];
        int i2 = 0;
        int i3 = 0;
        while (i2 < ceil) {
            double d6 = d2 + (i2 * d4);
            double cos = Math.cos(d6);
            double sin2 = Math.sin(d6);
            float[] fArr2 = fArr;
            fArr2[i3] = (float) (cos - (sin * sin2));
            fArr2[i3 + 1] = (float) (sin2 + (cos * sin));
            double d7 = d6 + d4;
            double cos2 = Math.cos(d7);
            double sin3 = Math.sin(d7);
            fArr2[i3 + 2] = (float) ((sin * sin3) + cos2);
            fArr2[i3 + 3] = (float) (sin3 - (sin * cos2));
            int i4 = i3 + 5;
            fArr2[i3 + 4] = (float) cos2;
            i3 += 6;
            fArr2[i4] = (float) sin3;
            i2++;
            fArr = fArr2;
            ceil = ceil;
        }
        return fArr;
    }

    private void i0(C2695g.J j2) {
        this.f.push(j2);
        this.g.push(this.a.getMatrix());
    }

    @TargetApi(19)
    private Path j(C2695g.K k2, C2695g.C2697b c2697b) {
        Path g0;
        C2695g.N r = k2.a.r(this.d.a.F0);
        if (r == null) {
            F("ClipPath reference '%s' not found", this.d.a.F0);
            return null;
        }
        C2695g.C2700e c2700e = (C2695g.C2700e) r;
        this.e.push(this.d);
        this.d = M(c2700e);
        Boolean bool = c2700e.p;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(c2697b.a, c2697b.b);
            matrix.preScale(c2697b.c, c2697b.d);
        }
        Matrix matrix2 = c2700e.o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (C2695g.N n : c2700e.i) {
            if ((n instanceof C2695g.K) && (g0 = g0((C2695g.K) n, true)) != null) {
                path.op(g0, Path.Op.UNION);
            }
        }
        if (this.d.a.F0 != null) {
            if (c2700e.h == null) {
                c2700e.h = m(path);
            }
            Path j2 = j(c2700e, c2700e.h);
            if (j2 != null) {
                path.op(j2, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.d = this.e.pop();
        return path;
    }

    private void j0(C2695g.K k2) {
        k0(k2, k2.h);
    }

    private List<c> k(C2695g.C2711q c2711q) {
        C2695g.C2710p c2710p = c2711q.o;
        float h = c2710p != null ? c2710p.h(this) : 0.0f;
        C2695g.C2710p c2710p2 = c2711q.p;
        float i2 = c2710p2 != null ? c2710p2.i(this) : 0.0f;
        C2695g.C2710p c2710p3 = c2711q.q;
        float h2 = c2710p3 != null ? c2710p3.h(this) : 0.0f;
        C2695g.C2710p c2710p4 = c2711q.r;
        float i3 = c2710p4 != null ? c2710p4.i(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f2 = h2 - h;
        float f3 = i3 - i2;
        arrayList.add(new c(h, i2, f2, f3));
        arrayList.add(new c(h2, i3, f2, f3));
        return arrayList;
    }

    private void k0(C2695g.K k2, C2695g.C2697b c2697b) {
        if (this.d.a.H0 != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.a.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.a.saveLayer(null, paint2, 31);
            C2695g.C2713s c2713s = (C2695g.C2713s) this.c.r(this.d.a.H0);
            J0(c2713s, k2, c2697b);
            this.a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.a.saveLayer(null, paint3, 31);
            J0(c2713s, k2, c2697b);
            this.a.restore();
            this.a.restore();
        }
        R0();
    }

    private List<c> l(C2695g.C2720z c2720z) {
        int length = c2720z.o.length;
        int i2 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = c2720z.o;
        c cVar = new c(fArr[0], fArr[1], 0.0f, 0.0f);
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (i2 < length) {
            float[] fArr2 = c2720z.o;
            float f4 = fArr2[i2];
            float f5 = fArr2[i2 + 1];
            cVar.a(f4, f5);
            arrayList.add(cVar);
            i2 += 2;
            cVar = new c(f4, f5, f4 - cVar.a, f5 - cVar.b);
            f2 = f4;
            f3 = f5;
        }
        if (!(c2720z instanceof C2695g.A)) {
            arrayList.add(cVar);
            return arrayList;
        }
        float[] fArr3 = c2720z.o;
        float f6 = fArr3[0];
        if (f2 != f6) {
            float f7 = fArr3[1];
            if (f3 != f7) {
                cVar.a(f6, f7);
                arrayList.add(cVar);
                c cVar2 = new c(f6, f7, f6 - cVar.a, f7 - cVar.b);
                cVar2.b((c) arrayList.get(0));
                arrayList.add(cVar2);
                arrayList.set(0, cVar2);
            }
        }
        return arrayList;
    }

    private void l0(C2695g.N n, j jVar) {
        float f2;
        float f3;
        float f4;
        C2695g.E.f O;
        if (jVar.a((C2695g.Y) n)) {
            if (n instanceof C2695g.Z) {
                S0();
                L0((C2695g.Z) n);
                R0();
                return;
            }
            if (!(n instanceof C2695g.V)) {
                if (n instanceof C2695g.U) {
                    S0();
                    C2695g.U u = (C2695g.U) n;
                    W0(this.d, u);
                    if (A()) {
                        r((C2695g.K) u.f());
                        C2695g.N r = n.a.r(u.o);
                        if (r == null || !(r instanceof C2695g.Y)) {
                            F("Tref reference '%s' not found", u.o);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            G((C2695g.Y) r, sb);
                            if (sb.length() > 0) {
                                jVar.b(sb.toString());
                            }
                        }
                    }
                    R0();
                    return;
                }
                return;
            }
            y("TSpan render", new Object[0]);
            S0();
            C2695g.V v = (C2695g.V) n;
            W0(this.d, v);
            if (A()) {
                List<C2695g.C2710p> list = v.o;
                boolean z = list != null && list.size() > 0;
                boolean z2 = jVar instanceof f;
                float f5 = 0.0f;
                if (z2) {
                    float h = !z ? ((f) jVar).b : v.o.get(0).h(this);
                    List<C2695g.C2710p> list2 = v.p;
                    f3 = (list2 == null || list2.size() == 0) ? ((f) jVar).c : v.p.get(0).i(this);
                    List<C2695g.C2710p> list3 = v.q;
                    f4 = (list3 == null || list3.size() == 0) ? 0.0f : v.q.get(0).h(this);
                    List<C2695g.C2710p> list4 = v.r;
                    if (list4 != null && list4.size() != 0) {
                        f5 = v.r.get(0).i(this);
                    }
                    f2 = f5;
                    f5 = h;
                } else {
                    f2 = 0.0f;
                    f3 = 0.0f;
                    f4 = 0.0f;
                }
                if (z && (O = O()) != C2695g.E.f.Start) {
                    float n2 = n(v);
                    if (O == C2695g.E.f.Middle) {
                        n2 /= 2.0f;
                    }
                    f5 -= n2;
                }
                r((C2695g.K) v.f());
                if (z2) {
                    f fVar = (f) jVar;
                    fVar.b = f5 + f4;
                    fVar.c = f3 + f2;
                }
                boolean m0 = m0();
                E(v, jVar);
                if (m0) {
                    j0(v);
                }
            }
            R0();
        }
    }

    private C2695g.C2697b m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new C2695g.C2697b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private boolean m0() {
        C2695g.N r;
        if (!M0()) {
            return false;
        }
        this.a.saveLayerAlpha(null, w(this.d.a.n0.floatValue()), 31);
        this.e.push(this.d);
        C0399h c0399h = new C0399h(this.d);
        this.d = c0399h;
        String str = c0399h.a.H0;
        if (str != null && ((r = this.c.r(str)) == null || !(r instanceof C2695g.C2713s))) {
            F("Mask reference '%s' not found", this.d.a.H0);
            this.d.a.H0 = null;
        }
        return true;
    }

    private float n(C2695g.Y y) {
        k kVar = new k(this, null);
        E(y, kVar);
        return kVar.b;
    }

    private c n0(c cVar, c cVar2, c cVar3) {
        float D = D(cVar2.c, cVar2.d, cVar2.a - cVar.a, cVar2.b - cVar.b);
        if (D == 0.0f) {
            D = D(cVar2.c, cVar2.d, cVar3.a - cVar2.a, cVar3.b - cVar2.b);
        }
        if (D > 0.0f || (D == 0.0f && (cVar2.c > 0.0f || cVar2.d >= 0.0f))) {
            return cVar2;
        }
        cVar2.c = -cVar2.c;
        cVar2.d = -cVar2.d;
        return cVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        if (r12 != 8) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Matrix o(ax.o4.C2695g.C2697b r10, ax.o4.C2695g.C2697b r11, ax.o4.C2693e r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L9d
            ax.o4.e$a r1 = r12.a()
            if (r1 != 0) goto Lf
            goto L9d
        Lf:
            float r1 = r10.c
            float r2 = r11.c
            float r1 = r1 / r2
            float r2 = r10.d
            float r3 = r11.d
            float r2 = r2 / r3
            float r3 = r11.a
            float r3 = -r3
            float r4 = r11.b
            float r4 = -r4
            ax.o4.e r5 = ax.o4.C2693e.d
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L35
            float r11 = r10.a
            float r10 = r10.b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L35:
            ax.o4.e$b r5 = r12.b()
            ax.o4.e$b r6 = ax.o4.C2693e.b.slice
            if (r5 != r6) goto L42
            float r1 = java.lang.Math.max(r1, r2)
            goto L46
        L42:
            float r1 = java.lang.Math.min(r1, r2)
        L46:
            float r2 = r10.c
            float r2 = r2 / r1
            float r5 = r10.d
            float r5 = r5 / r1
            int[] r6 = ax.o4.C2721h.a.a
            ax.o4.e$a r7 = r12.a()
            int r7 = r7.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L63;
                case 2: goto L63;
                case 3: goto L63;
                case 4: goto L5e;
                case 5: goto L5e;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L68
        L5e:
            float r7 = r11.c
            float r7 = r7 - r2
        L61:
            float r3 = r3 - r7
            goto L68
        L63:
            float r7 = r11.c
            float r7 = r7 - r2
            float r7 = r7 / r8
            goto L61
        L68:
            ax.o4.e$a r12 = r12.a()
            int r12 = r12.ordinal()
            r12 = r6[r12]
            r2 = 2
            if (r12 == r2) goto L8b
            r2 = 3
            if (r12 == r2) goto L86
            r2 = 5
            if (r12 == r2) goto L8b
            r2 = 6
            if (r12 == r2) goto L86
            r2 = 7
            if (r12 == r2) goto L8b
            r2 = 8
            if (r12 == r2) goto L86
            goto L90
        L86:
            float r11 = r11.d
            float r11 = r11 - r5
        L89:
            float r4 = r4 - r11
            goto L90
        L8b:
            float r11 = r11.d
            float r11 = r11 - r5
            float r11 = r11 / r8
            goto L89
        L90:
            float r11 = r10.a
            float r10 = r10.b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.o4.C2721h.o(ax.o4.g$b, ax.o4.g$b, ax.o4.e):android.graphics.Matrix");
    }

    private void o0(C2695g.C2699d c2699d) {
        y("Circle render", new Object[0]);
        C2695g.C2710p c2710p = c2699d.q;
        if (c2710p == null || c2710p.k()) {
            return;
        }
        W0(this.d, c2699d);
        if (A() && Y0()) {
            Matrix matrix = c2699d.n;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            Path Y = Y(c2699d);
            U0(c2699d);
            r(c2699d);
            p(c2699d);
            boolean m0 = m0();
            if (this.d.b) {
                B(c2699d, Y);
            }
            if (this.d.c) {
                C(Y);
            }
            if (m0) {
                j0(c2699d);
            }
        }
    }

    private void p(C2695g.K k2) {
        q(k2, k2.h);
    }

    private void p0(C2695g.C2703i c2703i) {
        y("Ellipse render", new Object[0]);
        C2695g.C2710p c2710p = c2703i.q;
        if (c2710p == null || c2703i.r == null || c2710p.k() || c2703i.r.k()) {
            return;
        }
        W0(this.d, c2703i);
        if (A() && Y0()) {
            Matrix matrix = c2703i.n;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            Path Z = Z(c2703i);
            U0(c2703i);
            r(c2703i);
            p(c2703i);
            boolean m0 = m0();
            if (this.d.b) {
                B(c2703i, Z);
            }
            if (this.d.c) {
                C(Z);
            }
            if (m0) {
                j0(c2703i);
            }
        }
    }

    private void q(C2695g.K k2, C2695g.C2697b c2697b) {
        Path j2;
        if (this.d.a.F0 == null || (j2 = j(k2, c2697b)) == null) {
            return;
        }
        this.a.clipPath(j2);
    }

    private void q0(C2695g.C2707m c2707m) {
        y("Group render", new Object[0]);
        W0(this.d, c2707m);
        if (A()) {
            Matrix matrix = c2707m.o;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            p(c2707m);
            boolean m0 = m0();
            F0(c2707m, true);
            if (m0) {
                j0(c2707m);
            }
            U0(c2707m);
        }
    }

    private void r(C2695g.K k2) {
        C2695g.O o = this.d.a.c0;
        if (o instanceof C2695g.C2715u) {
            z(true, k2.h, (C2695g.C2715u) o);
        }
        C2695g.O o2 = this.d.a.f0;
        if (o2 instanceof C2695g.C2715u) {
            z(false, k2.h, (C2695g.C2715u) o2);
        }
    }

    private void r0(C2695g.C2709o c2709o) {
        C2695g.C2710p c2710p;
        String str;
        y("Image render", new Object[0]);
        C2695g.C2710p c2710p2 = c2709o.s;
        if (c2710p2 == null || c2710p2.k() || (c2710p = c2709o.t) == null || c2710p.k() || (str = c2709o.p) == null) {
            return;
        }
        C2693e c2693e = c2709o.o;
        if (c2693e == null) {
            c2693e = C2693e.e;
        }
        Bitmap s = s(str);
        if (s == null) {
            C2695g.k();
            return;
        }
        C2695g.C2697b c2697b = new C2695g.C2697b(0.0f, 0.0f, s.getWidth(), s.getHeight());
        W0(this.d, c2709o);
        if (A() && Y0()) {
            Matrix matrix = c2709o.u;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            C2695g.C2710p c2710p3 = c2709o.q;
            float h = c2710p3 != null ? c2710p3.h(this) : 0.0f;
            C2695g.C2710p c2710p4 = c2709o.r;
            this.d.f = new C2695g.C2697b(h, c2710p4 != null ? c2710p4.i(this) : 0.0f, c2709o.s.h(this), c2709o.t.h(this));
            if (!this.d.a.w0.booleanValue()) {
                C2695g.C2697b c2697b2 = this.d.f;
                O0(c2697b2.a, c2697b2.b, c2697b2.c, c2697b2.d);
            }
            c2709o.h = this.d.f;
            U0(c2709o);
            p(c2709o);
            boolean m0 = m0();
            X0();
            this.a.save();
            this.a.concat(o(this.d.f, c2697b, c2693e));
            this.a.drawBitmap(s, 0.0f, 0.0f, new Paint(this.d.a.N0 != C2695g.E.e.optimizeSpeed ? 2 : 0));
            this.a.restore();
            if (m0) {
                j0(c2709o);
            }
        }
    }

    private Bitmap s(String str) {
        int indexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (indexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(indexOf - 7, indexOf))) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e2) {
            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e2);
            return null;
        }
    }

    private void s0(C2695g.C2711q c2711q) {
        y("Line render", new Object[0]);
        W0(this.d, c2711q);
        if (A() && Y0() && this.d.c) {
            Matrix matrix = c2711q.n;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            Path a0 = a0(c2711q);
            U0(c2711q);
            r(c2711q);
            p(c2711q);
            boolean m0 = m0();
            C(a0);
            I0(c2711q);
            if (m0) {
                j0(c2711q);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        if (r6.equals("fantasy") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Typeface t(java.lang.String r6, java.lang.Integer r7, ax.o4.C2695g.E.b r8) {
        /*
            r5 = this;
            r0 = 2
            r1 = 3
            ax.o4.g$E$b r2 = ax.o4.C2695g.E.b.Italic
            r3 = 0
            r4 = 1
            if (r8 != r2) goto La
            r8 = 1
            goto Lb
        La:
            r8 = 0
        Lb:
            int r7 = r7.intValue()
            r2 = 500(0x1f4, float:7.0E-43)
            if (r7 <= r2) goto L19
            if (r8 == 0) goto L17
            r7 = 3
            goto L1e
        L17:
            r7 = 1
            goto L1e
        L19:
            if (r8 == 0) goto L1d
            r7 = 2
            goto L1e
        L1d:
            r7 = 0
        L1e:
            r6.getClass()
            r8 = -1
            int r2 = r6.hashCode()
            switch(r2) {
                case -1536685117: goto L55;
                case -1431958525: goto L4a;
                case -1081737434: goto L41;
                case 109326717: goto L36;
                case 1126973893: goto L2b;
                default: goto L29;
            }
        L29:
            r0 = -1
            goto L5f
        L2b:
            java.lang.String r0 = "cursive"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L34
            goto L29
        L34:
            r0 = 4
            goto L5f
        L36:
            java.lang.String r0 = "serif"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L3f
            goto L29
        L3f:
            r0 = 3
            goto L5f
        L41:
            java.lang.String r1 = "fantasy"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L5f
            goto L29
        L4a:
            java.lang.String r0 = "monospace"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L53
            goto L29
        L53:
            r0 = 1
            goto L5f
        L55:
            java.lang.String r0 = "sans-serif"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L5e
            goto L29
        L5e:
            r0 = 0
        L5f:
            switch(r0) {
                case 0: goto L80;
                case 1: goto L79;
                case 2: goto L72;
                case 3: goto L6b;
                case 4: goto L64;
                default: goto L62;
            }
        L62:
            r6 = 0
            return r6
        L64:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            return r6
        L6b:
            android.graphics.Typeface r6 = android.graphics.Typeface.SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            return r6
        L72:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            return r6
        L79:
            android.graphics.Typeface r6 = android.graphics.Typeface.MONOSPACE
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            return r6
        L80:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.o4.C2721h.t(java.lang.String, java.lang.Integer, ax.o4.g$E$b):android.graphics.Typeface");
    }

    private void t0(C2695g.C2716v c2716v) {
        y("Path render", new Object[0]);
        if (c2716v.o == null) {
            return;
        }
        W0(this.d, c2716v);
        if (A() && Y0()) {
            C0399h c0399h = this.d;
            if (c0399h.c || c0399h.b) {
                Matrix matrix = c2716v.n;
                if (matrix != null) {
                    this.a.concat(matrix);
                }
                Path f2 = new d(c2716v.o).f();
                if (c2716v.h == null) {
                    c2716v.h = m(f2);
                }
                U0(c2716v);
                r(c2716v);
                p(c2716v);
                boolean m0 = m0();
                if (this.d.b) {
                    f2.setFillType(U());
                    B(c2716v, f2);
                }
                if (this.d.c) {
                    C(f2);
                }
                I0(c2716v);
                if (m0) {
                    j0(c2716v);
                }
            }
        }
    }

    private void u(C2695g.N n) {
        Boolean bool;
        if ((n instanceof C2695g.L) && (bool = ((C2695g.L) n).d) != null) {
            this.d.h = bool.booleanValue();
        }
    }

    private void u0(C2695g.C2720z c2720z) {
        y("PolyLine render", new Object[0]);
        W0(this.d, c2720z);
        if (A() && Y0()) {
            C0399h c0399h = this.d;
            if (c0399h.c || c0399h.b) {
                Matrix matrix = c2720z.n;
                if (matrix != null) {
                    this.a.concat(matrix);
                }
                if (c2720z.o.length < 2) {
                    return;
                }
                Path b0 = b0(c2720z);
                U0(c2720z);
                b0.setFillType(U());
                r(c2720z);
                p(c2720z);
                boolean m0 = m0();
                if (this.d.b) {
                    B(c2720z, b0);
                }
                if (this.d.c) {
                    C(b0);
                }
                I0(c2720z);
                if (m0) {
                    j0(c2720z);
                }
            }
        }
    }

    private static double v(double d2) {
        if (d2 < -1.0d) {
            return 3.141592653589793d;
        }
        if (d2 > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d2);
    }

    private void v0(C2695g.A a2) {
        y("Polygon render", new Object[0]);
        W0(this.d, a2);
        if (A() && Y0()) {
            C0399h c0399h = this.d;
            if (c0399h.c || c0399h.b) {
                Matrix matrix = a2.n;
                if (matrix != null) {
                    this.a.concat(matrix);
                }
                if (a2.o.length < 2) {
                    return;
                }
                Path b0 = b0(a2);
                U0(a2);
                r(a2);
                p(a2);
                boolean m0 = m0();
                if (this.d.b) {
                    B(a2, b0);
                }
                if (this.d.c) {
                    C(b0);
                }
                I0(a2);
                if (m0) {
                    j0(a2);
                }
            }
        }
    }

    private static int w(float f2) {
        int i2 = (int) (f2 * 256.0f);
        if (i2 < 0) {
            return 0;
        }
        if (i2 > 255) {
            return 255;
        }
        return i2;
    }

    private void w0(C2695g.B b2) {
        y("Rect render", new Object[0]);
        C2695g.C2710p c2710p = b2.q;
        if (c2710p == null || b2.r == null || c2710p.k() || b2.r.k()) {
            return;
        }
        W0(this.d, b2);
        if (A() && Y0()) {
            Matrix matrix = b2.n;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            Path c0 = c0(b2);
            U0(b2);
            r(b2);
            p(b2);
            boolean m0 = m0();
            if (this.d.b) {
                B(b2, c0);
            }
            if (this.d.c) {
                C(c0);
            }
            if (m0) {
                j0(b2);
            }
        }
    }

    private static int x(int i2, float f2) {
        int i3 = 255;
        int round = Math.round(((i2 >> 24) & 255) * f2);
        if (round < 0) {
            i3 = 0;
        } else if (round <= 255) {
            i3 = round;
        }
        return (i2 & 16777215) | (i3 << 24);
    }

    private void x0(C2695g.F f2) {
        z0(f2, f0(f2.q, f2.r, f2.s, f2.t), f2.p, f2.o);
    }

    private void y0(C2695g.F f2, C2695g.C2697b c2697b) {
        z0(f2, c2697b, f2.p, f2.o);
    }

    private void z(boolean z, C2695g.C2697b c2697b, C2695g.C2715u c2715u) {
        C2695g.N r = this.c.r(c2715u.q);
        if (r == null) {
            F("%s reference '%s' not found", z ? "Fill" : "Stroke", c2715u.q);
            C2695g.O o = c2715u.c0;
            if (o != null) {
                P0(this.d, z, o);
                return;
            } else if (z) {
                this.d.b = false;
                return;
            } else {
                this.d.c = false;
                return;
            }
        }
        if (r instanceof C2695g.M) {
            X(z, c2697b, (C2695g.M) r);
        } else if (r instanceof C2695g.Q) {
            e0(z, c2697b, (C2695g.Q) r);
        } else if (r instanceof C2695g.C) {
            Q0(z, (C2695g.C) r);
        }
    }

    private void z0(C2695g.F f2, C2695g.C2697b c2697b, C2695g.C2697b c2697b2, C2693e c2693e) {
        y("Svg render", new Object[0]);
        if (c2697b.c == 0.0f || c2697b.d == 0.0f) {
            return;
        }
        if (c2693e == null && (c2693e = f2.o) == null) {
            c2693e = C2693e.e;
        }
        W0(this.d, f2);
        if (A()) {
            C0399h c0399h = this.d;
            c0399h.f = c2697b;
            if (!c0399h.a.w0.booleanValue()) {
                C2695g.C2697b c2697b3 = this.d.f;
                O0(c2697b3.a, c2697b3.b, c2697b3.c, c2697b3.d);
            }
            q(f2, this.d.f);
            if (c2697b2 != null) {
                this.a.concat(o(this.d.f, c2697b2, c2693e));
                this.d.g = f2.p;
            } else {
                Canvas canvas = this.a;
                C2695g.C2697b c2697b4 = this.d.f;
                canvas.translate(c2697b4.a, c2697b4.b);
            }
            boolean m0 = m0();
            X0();
            F0(f2, true);
            if (m0) {
                j0(f2);
            }
            U0(f2);
        }
    }

    void G0(C2695g c2695g, C2694f c2694f) {
        C2695g.C2697b c2697b;
        C2693e c2693e;
        if (c2694f == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.c = c2695g;
        C2695g.F m = c2695g.m();
        if (m == null) {
            Z0("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (c2694f.d()) {
            C2695g.L j2 = this.c.j(c2694f.e);
            if (j2 == null || !(j2 instanceof C2695g.f0)) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", c2694f.e));
                return;
            }
            C2695g.f0 f0Var = (C2695g.f0) j2;
            c2697b = f0Var.p;
            if (c2697b == null) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", c2694f.e));
                return;
            }
            c2693e = f0Var.o;
        } else {
            c2697b = c2694f.e() ? c2694f.d : m.p;
            c2693e = c2694f.b() ? c2694f.b : m.o;
        }
        if (c2694f.a()) {
            c2695g.a(c2694f.a);
        }
        if (c2694f.c()) {
            C2690b.q qVar = new C2690b.q();
            this.h = qVar;
            qVar.a = c2695g.j(c2694f.c);
        }
        N0();
        u(m);
        S0();
        C2695g.C2697b c2697b2 = new C2695g.C2697b(c2694f.f);
        C2695g.C2710p c2710p = m.s;
        if (c2710p != null) {
            c2697b2.c = c2710p.f(this, c2697b2.c);
        }
        C2695g.C2710p c2710p2 = m.t;
        if (c2710p2 != null) {
            c2697b2.d = c2710p2.f(this, c2697b2.d);
        }
        z0(m, c2697b2, c2697b, c2693e);
        R0();
        if (c2694f.a()) {
            c2695g.b();
        }
    }

    float Q() {
        return this.d.d.getTextSize();
    }

    float R() {
        return this.d.d.getTextSize() / 2.0f;
    }

    C2695g.C2697b S() {
        C0399h c0399h = this.d;
        C2695g.C2697b c2697b = c0399h.g;
        return c2697b != null ? c2697b : c0399h.f;
    }

    float T() {
        return this.b;
    }

    /* renamed from: ax.o4.h$k */
    private class k extends j {
        float b;

        private k() {
            super(C2721h.this, null);
            this.b = 0.0f;
        }

        @Override // ax.o4.C2721h.j
        public void b(String str) {
            this.b += C2721h.this.d.d.measureText(str);
        }

        /* synthetic */ k(C2721h c2721h, a aVar) {
            this();
        }
    }

    /* renamed from: ax.o4.h$h, reason: collision with other inner class name */
    private class C0399h {
        C2695g.E a;
        boolean b;
        boolean c;
        Paint d;
        Paint e;
        C2695g.C2697b f;
        C2695g.C2697b g;
        boolean h;

        C0399h() {
            Paint paint = new Paint();
            this.d = paint;
            paint.setFlags(193);
            this.d.setHinting(0);
            this.d.setStyle(Paint.Style.FILL);
            Paint paint2 = this.d;
            Typeface typeface = Typeface.DEFAULT;
            paint2.setTypeface(typeface);
            Paint paint3 = new Paint();
            this.e = paint3;
            paint3.setFlags(193);
            this.e.setHinting(0);
            this.e.setStyle(Paint.Style.STROKE);
            this.e.setTypeface(typeface);
            this.a = C2695g.E.b();
        }

        C0399h(C0399h c0399h) {
            this.b = c0399h.b;
            this.c = c0399h.c;
            this.d = new Paint(c0399h.d);
            this.e = new Paint(c0399h.e);
            C2695g.C2697b c2697b = c0399h.f;
            if (c2697b != null) {
                this.f = new C2695g.C2697b(c2697b);
            }
            C2695g.C2697b c2697b2 = c0399h.g;
            if (c2697b2 != null) {
                this.g = new C2695g.C2697b(c2697b2);
            }
            this.h = c0399h.h;
            try {
                this.a = (C2695g.E) c0399h.a.clone();
            } catch (CloneNotSupportedException e) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
                this.a = C2695g.E.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(String str, Object... objArr) {
    }
}
