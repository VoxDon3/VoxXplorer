/*
 * Decompiled with CFR 0.152.
 */
package ax.o4;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.Xfermode;
import android.util.Base64;
import android.util.Log;
import ax.o4.b;
import ax.o4.e;
import ax.o4.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

class h {
    private static HashSet<String> i;
    private Canvas a;
    private float b;
    private ax.o4.g c;
    private h d;
    private Stack<h> e;
    private Stack<g.J> f;
    private Stack<Matrix> g;
    private b.q h = null;

    h(Canvas canvas, float f8) {
        this.a = canvas;
        this.b = f8;
    }

    private boolean A() {
        Boolean bl = this.d.a.B0;
        if (bl != null) {
            return bl;
        }
        return true;
    }

    private void A0(g.N n8) {
        if (n8 instanceof g.t) {
            return;
        }
        this.S0();
        this.u(n8);
        if (n8 instanceof g.F) {
            this.x0((g.F)n8);
        } else if (n8 instanceof g.e0) {
            this.E0((g.e0)n8);
        } else if (n8 instanceof g.S) {
            this.B0((g.S)n8);
        } else if (n8 instanceof g.m) {
            this.q0((g.m)n8);
        } else if (n8 instanceof g.o) {
            this.r0((g.o)n8);
        } else if (n8 instanceof g.v) {
            this.t0((g.v)n8);
        } else if (n8 instanceof g.B) {
            this.w0((g.B)n8);
        } else if (n8 instanceof g.d) {
            this.o0((g.d)n8);
        } else if (n8 instanceof g.i) {
            this.p0((g.i)n8);
        } else if (n8 instanceof g.q) {
            this.s0((g.q)n8);
        } else if (n8 instanceof g.A) {
            this.v0((g.A)n8);
        } else if (n8 instanceof g.z) {
            this.u0((g.z)n8);
        } else if (n8 instanceof g.W) {
            this.D0((g.W)n8);
        }
        this.R0();
    }

    private void B(g.K k8, Path path) {
        Object object = this.d.a.c0;
        if (object instanceof g.u && (object = this.c.r(((g.u)object).q)) instanceof g.y) {
            this.L(k8, path, (g.y)object);
            return;
        }
        this.a.drawPath(path, this.d.d);
    }

    private void B0(g.S s8) {
        ax.o4.h.y("Switch render", new Object[0]);
        this.W0(this.d, s8);
        if (!this.A()) {
            return;
        }
        Matrix matrix = s8.o;
        if (matrix != null) {
            this.a.concat(matrix);
        }
        this.p(s8);
        boolean bl = this.m0();
        this.K0(s8);
        if (bl) {
            this.j0(s8);
        }
        this.U0(s8);
    }

    private void C(Path path) {
        h h8 = this.d;
        if (h8.a.M0 == g.E.i.c0) {
            h8 = this.a.getMatrix();
            Path path2 = new Path();
            path.transform((Matrix)h8, path2);
            this.a.setMatrix(new Matrix());
            path = this.d.e.getShader();
            Matrix matrix = new Matrix();
            if (path != null) {
                path.getLocalMatrix(matrix);
                Matrix matrix2 = new Matrix(matrix);
                matrix2.postConcat((Matrix)h8);
                path.setLocalMatrix(matrix2);
            }
            this.a.drawPath(path2, this.d.e);
            this.a.setMatrix((Matrix)h8);
            if (path != null) {
                path.setLocalMatrix(matrix);
            }
            return;
        }
        this.a.drawPath(path, h8.e);
    }

    private void C0(g.T t8, g.b b8) {
        ax.o4.h.y("Symbol render", new Object[0]);
        if (b8.c != 0.0f && b8.d != 0.0f) {
            ax.o4.e e8 = t8.o;
            if (e8 == null) {
                e8 = ax.o4.e.e;
            }
            this.W0(this.d, t8);
            h h8 = this.d;
            h8.f = b8;
            if (!h8.a.w0.booleanValue()) {
                b8 = this.d.f;
                this.O0(b8.a, b8.b, b8.c, b8.d);
            }
            if ((b8 = t8.p) != null) {
                this.a.concat(this.o(this.d.f, b8, e8));
                this.d.g = t8.p;
            } else {
                e8 = this.a;
                b8 = this.d.f;
                e8.translate(b8.a, b8.b);
            }
            boolean bl = this.m0();
            this.F0(t8, true);
            if (bl) {
                this.j0(t8);
            }
            this.U0(t8);
        }
    }

    private float D(float f8, float f9, float f10, float f11) {
        return f8 * f10 + f9 * f11;
    }

    private void D0(g.W w8) {
        ax.o4.h.y("Text render", new Object[0]);
        this.W0(this.d, w8);
        if (this.A()) {
            Object object = w8.s;
            if (object != null) {
                this.a.concat(object);
            }
            object = w8.o;
            float f8 = 0.0f;
            float f9 = object != null && object.size() != 0 ? w8.o.get(0).h(this) : 0.0f;
            object = w8.p;
            float f10 = object != null && object.size() != 0 ? w8.p.get(0).i(this) : 0.0f;
            object = w8.q;
            float f11 = object != null && object.size() != 0 ? w8.q.get(0).h(this) : 0.0f;
            object = w8.r;
            float f12 = f8;
            if (object != null) {
                f12 = object.size() == 0 ? f8 : w8.r.get(0).i(this);
            }
            object = this.O();
            f8 = f9;
            if (object != g.E.f.q) {
                float f13;
                f8 = f13 = this.n(w8);
                if (object == g.E.f.c0) {
                    f8 = f13 / 2.0f;
                }
                f8 = f9 - f8;
            }
            if (w8.h == null) {
                i i8 = new i(this, f8, f10);
                this.E(w8, i8);
                object = i8.d;
                w8.h = new g.b(object.left, object.top, object.width(), i8.d.height());
            }
            this.U0(w8);
            this.r(w8);
            this.p(w8);
            boolean bl = this.m0();
            this.E(w8, new f(this, f8 + f11, f10 + f12));
            if (bl) {
                this.j0(w8);
            }
        }
    }

    private void E(g.Y object, j j8) {
        if (this.A()) {
            object = ((g.H)object).i.iterator();
            boolean bl = true;
            while (object.hasNext()) {
                g.N n8 = (g.N)object.next();
                if (n8 instanceof g.c0) {
                    j8.b(this.T0(((g.c0)n8).c, bl, object.hasNext() ^ true));
                } else {
                    this.l0(n8, j8);
                }
                bl = false;
            }
        }
    }

    private void E0(g.e0 e02) {
        Object object;
        block14: {
            block13: {
                ax.o4.h.y("Use render", new Object[0]);
                object = e02.s;
                if (object != null && ((g.p)object).k() || (object = e02.t) != null && ((g.p)object).k()) break block13;
                this.W0(this.d, e02);
                if (this.A()) break block14;
            }
            return;
        }
        g.N n8 = e02.a.r(e02.p);
        if (n8 == null) {
            ax.o4.h.F("Use reference '%s' not found", e02.p);
            return;
        }
        object = e02.o;
        if (object != null) {
            this.a.concat((Matrix)object);
        }
        object = e02.q;
        float f8 = 0.0f;
        float f9 = object != null ? ((g.p)object).h(this) : 0.0f;
        object = e02.r;
        if (object != null) {
            f8 = ((g.p)object).i(this);
        }
        this.a.translate(f9, f8);
        this.p(e02);
        boolean bl = this.m0();
        this.i0(e02);
        if (n8 instanceof g.F) {
            object = (g.F)n8;
            g.b b8 = this.f0(null, null, e02.s, e02.t);
            this.S0();
            this.y0((g.F)object, b8);
            this.R0();
        } else if (n8 instanceof g.T) {
            object = e02.s;
            if (object == null) {
                object = new g.p(100.0f, g.d0.j0);
            }
            g.p p8 = e02.t;
            if (p8 == null) {
                p8 = new g.p(100.0f, g.d0.j0);
            }
            object = this.f0(null, null, (g.p)object, p8);
            this.S0();
            this.C0((g.T)n8, (g.b)object);
            this.R0();
        } else {
            this.A0(n8);
        }
        this.h0();
        if (bl) {
            this.j0(e02);
        }
        this.U0(e02);
    }

    private static void F(String string, Object ... objectArray) {
        Log.e((String)"SVGAndroidRenderer", (String)String.format(string, objectArray));
    }

    private void F0(g.J object, boolean bl) {
        if (bl) {
            this.i0((g.J)object);
        }
        object = object.b().iterator();
        while (object.hasNext()) {
            this.A0((g.N)object.next());
        }
        if (bl) {
            this.h0();
        }
    }

    private void G(g.Y object, StringBuilder stringBuilder) {
        object = ((g.H)object).i.iterator();
        boolean bl = true;
        while (object.hasNext()) {
            g.N n8 = (g.N)object.next();
            if (n8 instanceof g.Y) {
                this.G((g.Y)n8, stringBuilder);
            } else if (n8 instanceof g.c0) {
                stringBuilder.append(this.T0(((g.c0)n8).c, bl, object.hasNext() ^ true));
            }
            bl = false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void H(g.j j8, String object) {
        block11: {
            g.N n8 = j8.a.r((String)object);
            if (n8 == null) {
                ax.o4.h.Z0("Gradient reference '%s' not found", object);
                return;
            }
            if (!(n8 instanceof g.j)) {
                ax.o4.h.F("Gradient href attributes must point to other gradient elements", new Object[0]);
                return;
            }
            if (n8 == j8) {
                ax.o4.h.F("Circular reference in gradient href attribute '%s'", object);
                return;
            }
            object = (g.j)n8;
            if (j8.i == null) {
                j8.i = ((g.j)object).i;
            }
            if (j8.j == null) {
                j8.j = ((g.j)object).j;
            }
            if (j8.k == null) {
                j8.k = ((g.j)object).k;
            }
            if (j8.h.isEmpty()) {
                j8.h = ((g.j)object).h;
            }
            try {
                if (j8 instanceof g.M) {
                    this.I((g.M)j8, (g.M)n8);
                }
            }
            catch (ClassCastException classCastException) {}
            break block11;
            this.J((g.Q)j8, (g.Q)n8);
        }
        object = ((g.j)object).l;
        if (object != null) {
            this.H(j8, (String)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void H0(g.r r8, c object) {
        block19: {
            float f8;
            float f9;
            float f10;
            float f11;
            Float f12;
            block13: {
                float f13;
                float f14;
                block17: {
                    block18: {
                        block15: {
                            block16: {
                                Object object2;
                                float f15;
                                block14: {
                                    block12: {
                                        block10: {
                                            block11: {
                                                this.S0();
                                                f12 = r8.v;
                                                f15 = 0.0f;
                                                if (f12 == null) break block10;
                                                if (!Float.isNaN(f12.floatValue())) break block11;
                                                f14 = ((c)object).c;
                                                if (f14 == 0.0f && ((c)object).d == 0.0f) break block10;
                                                f14 = (float)Math.toDegrees(Math.atan2(((c)object).d, f14));
                                                break block12;
                                            }
                                            f14 = r8.v.floatValue();
                                            break block12;
                                        }
                                        f14 = 0.0f;
                                    }
                                    f11 = r8.q ? 1.0f : this.d.a.h0.c(this.b);
                                    this.d = this.M(r8);
                                    f12 = new Matrix();
                                    f12.preTranslate(((c)object).a, ((c)object).b);
                                    f12.preRotate(f14);
                                    f12.preScale(f11, f11);
                                    object = r8.r;
                                    f10 = object != null ? ((g.p)object).h(this) : 0.0f;
                                    object = r8.s;
                                    f9 = object != null ? ((g.p)object).i(this) : 0.0f;
                                    object = r8.t;
                                    f8 = 3.0f;
                                    f11 = object != null ? ((g.p)object).h(this) : 3.0f;
                                    object = r8.u;
                                    if (object != null) {
                                        f8 = ((g.p)object).i(this);
                                    }
                                    if ((object = r8.p) == null) break block13;
                                    float f16 = f11 / ((g.b)object).c;
                                    float f17 = f8 / ((g.b)object).d;
                                    object = r8.o;
                                    if (object == null) {
                                        object = ax.o4.e.e;
                                    }
                                    f13 = f17;
                                    f14 = f16;
                                    if (!((ax.o4.e)object).equals(ax.o4.e.d)) {
                                        f14 = ((ax.o4.e)object).b() == e.b.c0 ? Math.max(f16, f17) : Math.min(f16, f17);
                                        f13 = f14;
                                    }
                                    f12.preTranslate(-f10 * f14, -f9 * f13);
                                    this.a.concat((Matrix)f12);
                                    object2 = r8.p;
                                    f10 = ((g.b)object2).c * f14;
                                    f9 = ((g.b)object2).d * f13;
                                    object2 = ax.o4.h$a.a;
                                    switch (object2[((ax.o4.e)object).a().ordinal()]) {
                                        default: {
                                            f10 = 0.0f;
                                            break block14;
                                        }
                                        case 4: 
                                        case 5: 
                                        case 6: {
                                            f10 = f11 - f10;
                                            break;
                                        }
                                        case 1: 
                                        case 2: 
                                        case 3: {
                                            f10 = (f11 - f10) / 2.0f;
                                        }
                                    }
                                    f10 = 0.0f - f10;
                                }
                                Object object3 = object2[((ax.o4.e)object).a().ordinal()];
                                if (object3 == 2) break block15;
                                if (object3 == 3) break block16;
                                if (object3 == 5) break block15;
                                if (object3 == 6) break block16;
                                if (object3 == 7) break block15;
                                if (object3 == 8) break block16;
                                f9 = f15;
                                break block17;
                            }
                            f9 = f8 - f9;
                            break block18;
                        }
                        f9 = (f8 - f9) / 2.0f;
                    }
                    f9 = 0.0f - f9;
                }
                if (!this.d.a.w0.booleanValue()) {
                    this.O0(f10, f9, f11, f8);
                }
                f12.reset();
                f12.preScale(f14, f13);
                this.a.concat((Matrix)f12);
                break block19;
            }
            f12.preTranslate(-f10, -f9);
            this.a.concat((Matrix)f12);
            if (!this.d.a.w0.booleanValue()) {
                this.O0(0.0f, 0.0f, f11, f8);
            }
        }
        boolean bl = this.m0();
        this.F0(r8, false);
        if (bl) {
            this.j0(r8);
        }
        this.R0();
    }

    private void I(g.M m8, g.M m9) {
        if (m8.m == null) {
            m8.m = m9.m;
        }
        if (m8.n == null) {
            m8.n = m9.n;
        }
        if (m8.o == null) {
            m8.o = m9.o;
        }
        if (m8.p == null) {
            m8.p = m9.p;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void I0(g.l var1_1) {
        block12: {
            var4_2 = this.d.a;
            var5_3 = var4_2.y0;
            if (var5_3 == null && var4_2.z0 == null && var4_2.A0 == null) break block12;
            if (var5_3 == null) ** GOTO lbl10
            var4_2 = var1_1.a.r((String)var5_3);
            if (var4_2 != null) {
                var4_2 = (g.r)var4_2;
            } else {
                ax.o4.h.F("Marker reference '%s' not found", new Object[]{this.d.a.y0});
lbl10:
                // 2 sources

                var4_2 = null;
            }
            var5_3 = this.d.a.z0;
            if (var5_3 == null) ** GOTO lbl17
            if ((var5_3 = var1_1.a.r((String)var5_3)) != null) {
                var5_3 = (g.r)var5_3;
            } else {
                ax.o4.h.F("Marker reference '%s' not found", new Object[]{this.d.a.z0});
lbl17:
                // 2 sources

                var5_3 = null;
            }
            var6_4 = this.d.a.A0;
            if (var6_4 == null) ** GOTO lbl24
            if ((var6_4 = var1_1.a.r((String)var6_4)) != null) {
                var6_4 = (g.r)var6_4;
            } else {
                ax.o4.h.F("Marker reference '%s' not found", new Object[]{this.d.a.A0});
lbl24:
                // 2 sources

                var6_4 = null;
            }
            var1_1 = var1_1 instanceof g.v != false ? new b(this, ((g.v)var1_1).o).f() : (var1_1 instanceof g.q != false ? this.k((g.q)var1_1) : this.l((g.z)var1_1));
            if (var1_1 != null && (var3_5 = var1_1.size()) != 0) {
                var7_6 = this.d.a;
                var7_6.A0 = null;
                var7_6.z0 = null;
                var7_6.y0 = null;
                if (var4_2 != null) {
                    this.H0((g.r)var4_2, var1_1.get(0));
                }
                if (var5_3 != null && var1_1.size() > 2) {
                    var7_6 = var1_1.get(0);
                    var4_2 = var1_1.get(1);
                    var2_7 = 1;
                    while (var2_7 < var3_5 - 1) {
                        var8_8 = var1_1.get(++var2_7);
                        if (var4_2.e) {
                            var4_2 = this.n0((c)var7_6, (c)var4_2, var8_8);
                        }
                        this.H0((g.r)var5_3, (c)var4_2);
                        var7_6 = var4_2;
                        var4_2 = var8_8;
                    }
                }
                if (var6_4 != null) {
                    this.H0((g.r)var6_4, var1_1.get(var3_5 - 1));
                }
            }
        }
    }

    private void J(g.Q q8, g.Q q9) {
        if (q8.m == null) {
            q8.m = q9.m;
        }
        if (q8.n == null) {
            q8.n = q9.n;
        }
        if (q8.o == null) {
            q8.o = q9.o;
        }
        if (q8.p == null) {
            q8.p = q9.p;
        }
        if (q8.q == null) {
            q8.q = q9.q;
        }
    }

    private void J0(g.s s8, g.K k8, g.b b8) {
        float f8;
        float f9;
        ax.o4.h.y("Mask render", new Object[0]);
        Object object = s8.o;
        if (object != null && ((Boolean)object).booleanValue()) {
            object = s8.s;
            f9 = object != null ? ((g.p)object).h(this) : b8.c;
            object = s8.t;
            if (object != null) {
                float f10 = ((g.p)object).i(this);
                f8 = f9;
                f9 = f10;
            } else {
                float f11 = b8.d;
                f8 = f9;
                f9 = f11;
            }
        } else {
            object = s8.s;
            f8 = 1.2f;
            f9 = object != null ? ((g.p)object).f(this, 1.0f) : 1.2f;
            object = s8.t;
            if (object != null) {
                f8 = ((g.p)object).f(this, 1.0f);
            }
            float f12 = f9 * b8.c;
            f9 = f8 * b8.d;
            f8 = f12;
        }
        if (f8 != 0.0f && f9 != 0.0f) {
            this.S0();
            this.d = object = this.M(s8);
            ((h)object).a.n0 = Float.valueOf(1.0f);
            boolean bl = this.m0();
            this.a.save();
            object = s8.p;
            if (object != null && !((Boolean)object).booleanValue()) {
                this.a.translate(b8.a, b8.b);
                this.a.scale(b8.c, b8.d);
            }
            this.F0(s8, false);
            this.a.restore();
            if (bl) {
                this.k0(k8, b8);
            }
            this.R0();
        }
    }

    private void K(g.y y8, String object) {
        g.N n8 = y8.a.r((String)object);
        if (n8 == null) {
            ax.o4.h.Z0("Pattern reference '%s' not found", object);
            return;
        }
        if (!(n8 instanceof g.y)) {
            ax.o4.h.F("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (n8 == y8) {
            ax.o4.h.F("Circular reference in pattern href attribute '%s'", object);
            return;
        }
        object = (g.y)n8;
        if (y8.q == null) {
            y8.q = ((g.y)object).q;
        }
        if (y8.r == null) {
            y8.r = ((g.y)object).r;
        }
        if (y8.s == null) {
            y8.s = ((g.y)object).s;
        }
        if (y8.t == null) {
            y8.t = ((g.y)object).t;
        }
        if (y8.u == null) {
            y8.u = ((g.y)object).u;
        }
        if (y8.v == null) {
            y8.v = ((g.y)object).v;
        }
        if (y8.w == null) {
            y8.w = ((g.y)object).w;
        }
        if (y8.i.isEmpty()) {
            y8.i = ((g.H)object).i;
        }
        if (y8.p == null) {
            y8.p = ((g.R)object).p;
        }
        if (y8.o == null) {
            y8.o = ((g.P)object).o;
        }
        if ((object = ((g.y)object).x) != null) {
            this.K(y8, (String)object);
        }
    }

    private void K0(g.S object) {
        String string = Locale.getDefault().getLanguage();
        ax.o4.g.k();
        for (g.N n8 : ((g.H)object).b()) {
            Set<String> set;
            Object object2;
            if (!(n8 instanceof g.G) || (object2 = (g.G)((Object)n8)).d() != null || (set = object2.a()) != null && (set.isEmpty() || !set.contains(string))) continue;
            set = object2.h();
            if (set != null) {
                if (i == null) {
                    ax.o4.h.V();
                }
                if (set.isEmpty() || !i.containsAll(set)) continue;
            }
            if ((set = object2.l()) != null) {
                set.isEmpty();
                continue;
            }
            if ((object2 = object2.n()) != null) {
                object2.isEmpty();
                continue;
            }
            this.A0(n8);
            break;
        }
    }

    private void L(g.K k8, Path object, g.y y8) {
        float f8;
        float f9;
        float f10;
        float f11;
        Object object2;
        float f12;
        float f13;
        float f14;
        Object object3 = y8.q;
        int n8 = object3 != null && ((Boolean)object3).booleanValue() ? 1 : 0;
        object3 = y8.x;
        if (object3 != null) {
            this.K(y8, (String)object3);
        }
        if (n8 != 0) {
            object3 = y8.t;
            f14 = object3 != null ? ((g.p)object3).h(this) : 0.0f;
            object3 = y8.u;
            f13 = object3 != null ? ((g.p)object3).i(this) : 0.0f;
            object3 = y8.v;
            f12 = object3 != null ? ((g.p)object3).h(this) : 0.0f;
            object3 = y8.w;
            if (object3 != null) {
                object2 = ((g.p)object3).i(this);
                f11 = f14;
                f14 = object2;
            } else {
                object2 = 0.0f;
                f11 = f14;
                f14 = object2;
            }
        } else {
            object3 = y8.t;
            f12 = object3 != null ? ((g.p)object3).f(this, 1.0f) : 0.0f;
            object3 = y8.u;
            f14 = object3 != null ? ((g.p)object3).f(this, 1.0f) : 0.0f;
            object3 = y8.v;
            f13 = object3 != null ? ((g.p)object3).f(this, 1.0f) : 0.0f;
            object3 = y8.w;
            f11 = object3 != null ? ((g.p)object3).f(this, 1.0f) : 0.0f;
            object3 = k8.h;
            object2 = ((g.b)object3).a;
            f10 = ((g.b)object3).c;
            object2 = f12 * f10 + object2;
            f9 = ((g.b)object3).b;
            f8 = ((g.b)object3).d;
            f12 = f11 * f8;
            f11 = f14 * f8 + f9;
            f14 = f12;
            f12 = f13 *= f10;
            f13 = f11;
            f11 = object2;
        }
        if (f12 != 0.0f && f14 != 0.0f) {
            object3 = y8.o;
            if (object3 == null) {
                object3 = ax.o4.e.e;
            }
            this.S0();
            this.a.clipPath(object);
            object = new h(this);
            this.V0((h)object, g.E.b());
            object.a.w0 = Boolean.FALSE;
            this.d = this.N(y8, (h)object);
            object = k8.h;
            Object object4 = y8.s;
            if (object4 != null) {
                this.a.concat((Matrix)object4);
                object4 = new Matrix();
                if (y8.s.invert((Matrix)object4)) {
                    object = k8.h;
                    float f15 = object.a;
                    float f16 = object.b;
                    float f17 = object.b();
                    object = k8.h;
                    object2 = object.b;
                    float f18 = object.b();
                    f8 = k8.h.c();
                    object = k8.h;
                    f9 = object.a;
                    f10 = object.c();
                    object = new float[8];
                    object[0] = (Path)f15;
                    object[1] = (Path)f16;
                    object[2] = (Path)f17;
                    object[3] = (Path)object2;
                    object[4] = (Path)f18;
                    object[5] = (Path)f8;
                    object[6] = (Path)f9;
                    object[7] = (Path)f10;
                    object4.mapPoints((float[])object);
                    f10 = (float)object[0];
                    object2 = object[1];
                    object4 = new RectF(f10, object2, f10, object2);
                    for (n8 = 2; n8 <= 6; n8 += 2) {
                        object2 = object[n8];
                        if (object2 < ((RectF)object4).left) {
                            ((RectF)object4).left = object2;
                        }
                        if (object2 > ((RectF)object4).right) {
                            ((RectF)object4).right = object2;
                        }
                        if ((object2 = (Object)object[n8 + 1]) < ((RectF)object4).top) {
                            ((RectF)object4).top = object2;
                        }
                        if (!(object2 > ((RectF)object4).bottom)) continue;
                        ((RectF)object4).bottom = object2;
                    }
                    f10 = ((RectF)object4).left;
                    object2 = ((RectF)object4).top;
                    object = new g.b(f10, (float)object2, ((RectF)object4).right - f10, ((RectF)object4).bottom - object2);
                }
            }
            f9 = (float)Math.floor((object.a - f11) / f12);
            f13 += (float)Math.floor((object.b - f13) / f14) * f14;
            object2 = object.b();
            f8 = object.c();
            object = new g.b(0.0f, 0.0f, f12, f14);
            boolean bl = this.m0();
            while (f13 < f8) {
                for (f10 = f11 + f9 * f12; f10 < object2; f10 += f12) {
                    object.a = f10;
                    object.b = f13;
                    this.S0();
                    if (!this.d.a.w0.booleanValue()) {
                        this.O0(object.a, object.b, object.c, object.d);
                    }
                    if ((object4 = y8.p) != null) {
                        this.a.concat(this.o((g.b)object, (g.b)object4, (ax.o4.e)object3));
                    } else {
                        object4 = y8.r;
                        n8 = object4 != null && !((Boolean)object4).booleanValue() ? 0 : 1;
                        this.a.translate(f10, f13);
                        if (n8 == 0) {
                            object4 = this.a;
                            g.b b8 = k8.h;
                            object4.scale(b8.c, b8.d);
                        }
                    }
                    object4 = y8.i.iterator();
                    while (object4.hasNext()) {
                        this.A0((g.N)object4.next());
                    }
                    this.R0();
                }
                f13 += f14;
            }
            if (bl) {
                this.j0(y8);
            }
            this.R0();
        }
    }

    private void L0(g.Z z8) {
        ax.o4.h.y("TextPath render", new Object[0]);
        this.W0(this.d, z8);
        if (this.A() && this.Y0()) {
            g.N n8 = z8.a.r(z8.o);
            if (n8 == null) {
                ax.o4.h.F("TextPath reference '%s' not found", z8.o);
                return;
            }
            Object object = (g.v)n8;
            n8 = new d(this, ((g.v)object).o).f();
            object = ((g.l)object).n;
            if (object != null) {
                n8.transform((Matrix)object);
            }
            PathMeasure pathMeasure = new PathMeasure((Path)n8, false);
            object = z8.p;
            float f8 = object != null ? ((g.p)object).f(this, pathMeasure.getLength()) : 0.0f;
            object = this.O();
            float f9 = f8;
            if (object != g.E.f.q) {
                float f10;
                f9 = f10 = this.n(z8);
                if (object == g.E.f.c0) {
                    f9 = f10 / 2.0f;
                }
                f9 = f8 - f9;
            }
            this.r((g.K)((Object)z8.f()));
            boolean bl = this.m0();
            this.E(z8, new e(this, (Path)n8, f9, 0.0f));
            if (bl) {
                this.j0(z8);
            }
        }
    }

    private h M(g.N n8) {
        h h8 = new h(this);
        this.V0(h8, g.E.b());
        return this.N(n8, h8);
    }

    private boolean M0() {
        return this.d.a.n0.floatValue() < 1.0f || this.d.a.H0 != null;
        {
        }
    }

    private h N(g.N object, h h8) {
        ArrayList<g.L> arrayList = new ArrayList<g.L>();
        while (true) {
            boolean bl = object instanceof g.L;
            int n8 = 0;
            if (bl) {
                arrayList.add(0, (g.L)object);
            }
            if ((object = ((g.N)object).b) == null) {
                int n9 = arrayList.size();
                while (n8 < n9) {
                    object = arrayList.get(n8);
                    ++n8;
                    this.W0(h8, (g.L)object);
                }
                object = this.d;
                h8.g = ((h)object).g;
                h8.f = ((h)object).f;
                return h8;
            }
            object = (g.N)object;
        }
    }

    private void N0() {
        this.d = new h(this);
        this.e = new Stack();
        this.V0(this.d, g.E.b());
        h h8 = this.d;
        h8.f = null;
        h8.h = false;
        this.e.push(new h(this, h8));
        this.g = new Stack();
        this.f = new Stack();
    }

    private g.E.f O() {
        g.E.f f8;
        Object object = this.d.a;
        if (object.u0 != g.E.h.q && (f8 = object.v0) != g.E.f.c0) {
            g.E.f f9 = g.E.f.q;
            object = f9;
            if (f8 == f9) {
                object = g.E.f.d0;
            }
            return object;
        }
        return object.v0;
    }

    private void O0(float f8, float f9, float f10, float f11) {
        float f12 = f10 + f8;
        float f13 = f11 + f9;
        g.c c8 = this.d.a.x0;
        float f14 = f8;
        float f15 = f9;
        f11 = f12;
        f10 = f13;
        if (c8 != null) {
            f14 = f8 + c8.d.h(this);
            f15 = f9 + this.d.a.x0.a.i(this);
            f11 = f12 - this.d.a.x0.b.h(this);
            f10 = f13 - this.d.a.x0.c.i(this);
        }
        this.a.clipRect(f14, f15, f11, f10);
    }

    private Path.FillType P() {
        g.E.a a8 = this.d.a.G0;
        if (a8 != null && a8 == g.E.a.c0) {
            return Path.FillType.EVEN_ODD;
        }
        return Path.FillType.WINDING;
    }

    private void P0(h h8, boolean bl, g.O o8) {
        block6: {
            int n8;
            float f8;
            block5: {
                block4: {
                    Object object = h8.a;
                    object = bl ? ((g.E)object).e0 : ((g.E)object).g0;
                    f8 = ((Float)object).floatValue();
                    if (!(o8 instanceof g.f)) break block4;
                    n8 = ((g.f)o8).q;
                    break block5;
                }
                if (!(o8 instanceof g.g)) break block6;
                n8 = h8.a.o0.q;
            }
            n8 = ax.o4.h.x(n8, f8);
            if (bl) {
                h8.d.setColor(n8);
                return;
            }
            h8.e.setColor(n8);
        }
    }

    private void Q0(boolean bl, g.C object) {
        boolean bl2 = false;
        boolean bl3 = false;
        if (bl) {
            if (this.W(((g.L)object).e, 0x80000000L)) {
                g.O o8;
                h h8 = this.d;
                g.E e8 = h8.a;
                e8.c0 = o8 = ((g.L)object).e.I0;
                bl2 = bl3;
                if (o8 != null) {
                    bl2 = true;
                }
                h8.b = bl2;
            }
            if (this.W(((g.L)object).e, 0x100000000L)) {
                this.d.a.e0 = ((g.L)object).e.J0;
            }
            if (this.W(((g.L)object).e, 0x180000000L)) {
                object = this.d;
                this.P0((h)object, bl, ((h)object).a.c0);
                return;
            }
        } else {
            if (this.W(((g.L)object).e, 0x80000000L)) {
                g.O o9;
                h h9 = this.d;
                g.E e9 = h9.a;
                e9.f0 = o9 = ((g.L)object).e.I0;
                if (o9 != null) {
                    bl2 = true;
                }
                h9.c = bl2;
            }
            if (this.W(((g.L)object).e, 0x100000000L)) {
                this.d.a.g0 = ((g.L)object).e.J0;
            }
            if (this.W(((g.L)object).e, 0x180000000L)) {
                object = this.d;
                this.P0((h)object, bl, ((h)object).a.f0);
            }
        }
    }

    private void R0() {
        this.a.restore();
        this.d = this.e.pop();
    }

    private void S0() {
        this.a.save();
        this.e.push(this.d);
        this.d = new h(this, this.d);
    }

    private String T0(String string, boolean bl, boolean bl2) {
        String string2;
        if (this.d.h) {
            return string.replaceAll("[\\n\\t]", " ");
        }
        string = string2 = string.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (bl) {
            string = string2.replaceAll("^\\s+", "");
        }
        string2 = string;
        if (bl2) {
            string2 = string.replaceAll("\\s+$", "");
        }
        return string2.replaceAll("\\s{2,}", " ");
    }

    private Path.FillType U() {
        g.E.a a8 = this.d.a.d0;
        if (a8 != null && a8 == g.E.a.c0) {
            return Path.FillType.EVEN_ODD;
        }
        return Path.FillType.WINDING;
    }

    private void U0(g.K object) {
        if (((g.N)object).b != null && ((g.K)object).h != null) {
            Object object2 = new Matrix();
            if (this.g.peek().invert(object2)) {
                Object object3 = ((g.K)object).h;
                float f8 = ((g.b)object3).a;
                float f9 = ((g.b)object3).b;
                float f10 = ((g.b)object3).b();
                object3 = ((g.K)object).h;
                float f11 = ((g.b)object3).b;
                float f12 = ((g.b)object3).b();
                Object object4 = ((g.K)object).h.c();
                object = ((g.K)object).h;
                float f13 = ((g.b)object).a;
                Object object5 = ((g.b)object).c();
                object3 = new float[8];
                object3[0] = f8;
                object3[1] = f9;
                object3[2] = f10;
                object3[3] = f11;
                object3[4] = f12;
                object3[5] = object4;
                object3[6] = f13;
                object3[7] = object5;
                object2.preConcat(this.a.getMatrix());
                object2.mapPoints((float[])object3);
                object4 = object3[0];
                object5 = object3[1];
                object = new RectF(object4, object5, object4, object5);
                for (int i8 = 2; i8 <= 6; i8 += 2) {
                    object5 = object3[i8];
                    if (object5 < ((RectF)object).left) {
                        ((RectF)object).left = object5;
                    }
                    if (object5 > ((RectF)object).right) {
                        ((RectF)object).right = object5;
                    }
                    if ((object5 = (Object)object3[i8 + 1]) < ((RectF)object).top) {
                        ((RectF)object).top = object5;
                    }
                    if (!(object5 > ((RectF)object).bottom)) continue;
                    ((RectF)object).bottom = object5;
                }
                object2 = (g.K)((Object)this.f.peek());
                object3 = object2.h;
                if (object3 == null) {
                    object2.h = g.b.a(((RectF)object).left, ((RectF)object).top, ((RectF)object).right, ((RectF)object).bottom);
                    return;
                }
                ((g.b)object3).e(g.b.a(((RectF)object).left, ((RectF)object).top, ((RectF)object).right, ((RectF)object).bottom));
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void V() {
        synchronized (h.class) {
            HashSet<String> hashSet = new HashSet<String>();
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
            return;
        }
    }

    private void V0(h h8, g.E e8) {
        float f8;
        int n8;
        Object object;
        Object object2;
        if (this.W(e8, 4096L)) {
            h8.a.o0 = e8.o0;
        }
        if (this.W(e8, 2048L)) {
            h8.a.n0 = e8.n0;
        }
        boolean bl = this.W(e8, 1L);
        boolean bl2 = false;
        if (bl) {
            h8.a.c0 = e8.c0;
            object2 = e8.c0;
            bl = object2 != null && object2 != g.f.d0;
            h8.b = bl;
        }
        if (this.W(e8, 4L)) {
            h8.a.e0 = e8.e0;
        }
        if (this.W(e8, 6149L)) {
            this.P0(h8, true, h8.a.c0);
        }
        if (this.W(e8, 2L)) {
            h8.a.d0 = e8.d0;
        }
        if (this.W(e8, 8L)) {
            h8.a.f0 = e8.f0;
            object2 = e8.f0;
            bl = object2 != null && object2 != g.f.d0;
            h8.c = bl;
        }
        if (this.W(e8, 16L)) {
            h8.a.g0 = e8.g0;
        }
        if (this.W(e8, 6168L)) {
            this.P0(h8, false, h8.a.f0);
        }
        if (this.W(e8, 0x800000000L)) {
            h8.a.M0 = e8.M0;
        }
        if (this.W(e8, 32L)) {
            object = h8.a;
            object2 = e8.h0;
            ((g.E)object).h0 = object2;
            h8.e.setStrokeWidth(((g.p)object2).d(this));
        }
        if (this.W(e8, 64L)) {
            h8.a.i0 = e8.i0;
            n8 = ax.o4.h$a.b[e8.i0.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 == 3) {
                        h8.e.setStrokeCap(Paint.Cap.SQUARE);
                    }
                } else {
                    h8.e.setStrokeCap(Paint.Cap.ROUND);
                }
            } else {
                h8.e.setStrokeCap(Paint.Cap.BUTT);
            }
        }
        if (this.W(e8, 128L)) {
            h8.a.j0 = e8.j0;
            n8 = ax.o4.h$a.c[e8.j0.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 == 3) {
                        h8.e.setStrokeJoin(Paint.Join.BEVEL);
                    }
                } else {
                    h8.e.setStrokeJoin(Paint.Join.ROUND);
                }
            } else {
                h8.e.setStrokeJoin(Paint.Join.MITER);
            }
        }
        if (this.W(e8, 256L)) {
            h8.a.k0 = e8.k0;
            h8.e.setStrokeMiter(e8.k0.floatValue());
        }
        if (this.W(e8, 512L)) {
            h8.a.l0 = e8.l0;
        }
        if (this.W(e8, 1024L)) {
            h8.a.m0 = e8.m0;
        }
        bl = this.W(e8, 1536L);
        Object object3 = null;
        object = null;
        if (bl) {
            object2 = h8.a.l0;
            if (object2 == null) {
                h8.e.setPathEffect(null);
            } else {
                float f9;
                int n9 = ((Cloneable)object2).length;
                n8 = n9 % 2 == 0 ? n9 : n9 * 2;
                object2 = new float[n8];
                f8 = 0.0f;
                for (int i8 = 0; i8 < n8; ++i8) {
                    f9 = h8.a.l0[i8 % n9].d(this);
                    object2[i8] = f9;
                    f8 += f9;
                }
                if (f8 == 0.0f) {
                    h8.e.setPathEffect(null);
                } else {
                    float f10;
                    f9 = f10 = h8.a.m0.d(this);
                    if (f10 < 0.0f) {
                        f9 = f10 % f8 + f8;
                    }
                    h8.e.setPathEffect((PathEffect)new DashPathEffect((float[])object2, f9));
                }
            }
        }
        if (this.W(e8, 16384L)) {
            f8 = this.Q();
            h8.a.q0 = e8.q0;
            h8.d.setTextSize(e8.q0.f(this, f8));
            h8.e.setTextSize(e8.q0.f(this, f8));
        }
        if (this.W(e8, 8192L)) {
            h8.a.p0 = e8.p0;
        }
        if (this.W(e8, 32768L)) {
            if (e8.r0 == -1 && h8.a.r0 > 100) {
                object2 = h8.a;
                ((g.E)object2).r0 = ((g.E)object2).r0 - 100;
            } else if (e8.r0 == 1 && h8.a.r0 < 900) {
                object2 = h8.a;
                ((g.E)object2).r0 = ((g.E)object2).r0 + 100;
            } else {
                h8.a.r0 = e8.r0;
            }
        }
        if (this.W(e8, 65536L)) {
            h8.a.s0 = e8.s0;
        }
        if (this.W(e8, 106496L)) {
            object2 = object3;
            if (h8.a.p0 != null) {
                object2 = object3;
                if (this.c != null) {
                    ax.o4.g.k();
                    object3 = h8.a.p0.iterator();
                    object2 = object;
                    while (object3.hasNext()) {
                        object = (String)object3.next();
                        object2 = h8.a;
                        object2 = object = this.t((String)object, ((g.E)object2).r0, ((g.E)object2).s0);
                        if (object == null) continue;
                        object2 = object;
                        break;
                    }
                }
            }
            object = object2;
            if (object2 == null) {
                object2 = h8.a;
                object = this.t("serif", ((g.E)object2).r0, ((g.E)object2).s0);
            }
            h8.d.setTypeface((Typeface)object);
            h8.e.setTypeface((Typeface)object);
        }
        if (this.W(e8, 131072L)) {
            h8.a.t0 = e8.t0;
            object3 = h8.d;
            object = e8.t0;
            object2 = g.E.g.e0;
            bl = object == object2;
            object3.setStrikeThruText(bl);
            Paint paint = h8.d;
            object3 = e8.t0;
            object = g.E.g.c0;
            bl = object3 == object;
            paint.setUnderlineText(bl);
            object3 = h8.e;
            bl = e8.t0 == object2;
            object3.setStrikeThruText(bl);
            object2 = h8.e;
            bl = bl2;
            if (e8.t0 == object) {
                bl = true;
            }
            object2.setUnderlineText(bl);
        }
        if (this.W(e8, 0x1000000000L)) {
            h8.a.u0 = e8.u0;
        }
        if (this.W(e8, 262144L)) {
            h8.a.v0 = e8.v0;
        }
        if (this.W(e8, 524288L)) {
            h8.a.w0 = e8.w0;
        }
        if (this.W(e8, 0x200000L)) {
            h8.a.y0 = e8.y0;
        }
        if (this.W(e8, 0x400000L)) {
            h8.a.z0 = e8.z0;
        }
        if (this.W(e8, 0x800000L)) {
            h8.a.A0 = e8.A0;
        }
        if (this.W(e8, 0x1000000L)) {
            h8.a.B0 = e8.B0;
        }
        if (this.W(e8, 0x2000000L)) {
            h8.a.C0 = e8.C0;
        }
        if (this.W(e8, 0x100000L)) {
            h8.a.x0 = e8.x0;
        }
        if (this.W(e8, 0x10000000L)) {
            h8.a.F0 = e8.F0;
        }
        if (this.W(e8, 0x20000000L)) {
            h8.a.G0 = e8.G0;
        }
        if (this.W(e8, 0x40000000L)) {
            h8.a.H0 = e8.H0;
        }
        if (this.W(e8, 0x4000000L)) {
            h8.a.D0 = e8.D0;
        }
        if (this.W(e8, 0x8000000L)) {
            h8.a.E0 = e8.E0;
        }
        if (this.W(e8, 0x200000000L)) {
            h8.a.K0 = e8.K0;
        }
        if (this.W(e8, 0x400000000L)) {
            h8.a.L0 = e8.L0;
        }
        if (this.W(e8, 0x2000000000L)) {
            h8.a.N0 = e8.N0;
        }
    }

    private boolean W(g.E e8, long l8) {
        return (l8 & e8.q) != 0L;
    }

    private void W0(h h8, g.L object) {
        boolean bl = ((g.N)object).b == null;
        h8.a.c(bl);
        g.E object22 = ((g.L)object).e;
        if (object22 != null) {
            this.V0(h8, object22);
        }
        if (this.c.n()) {
            for (b.p p8 : this.c.d()) {
                if (!ax.o4.b.l(this.h, p8.a, (g.L)object)) continue;
                this.V0(h8, p8.b);
            }
        }
        if ((object = ((g.L)object).f) != null) {
            this.V0(h8, (g.E)object);
        }
    }

    private void X(boolean bl, g.b object, g.M object2) {
        int n8;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        g.p p8;
        Object object3;
        Object object4 = object2.l;
        if (object4 != null) {
            this.H((g.j)object2, (String)object4);
        }
        object4 = object2.i;
        int n9 = 0;
        int n10 = object4 != null && ((Boolean)object4).booleanValue() ? 1 : 0;
        object4 = this.d;
        object4 = bl ? ((h)object4).d : ((h)object4).e;
        if (n10 != 0) {
            object3 = this.S();
            p8 = object2.m;
            f13 = p8 != null ? p8.h(this) : 0.0f;
            p8 = object2.n;
            f12 = p8 != null ? p8.i(this) : 0.0f;
            p8 = object2.o;
            f11 = p8 != null ? p8.h(this) : ((g.b)object3).c;
            object3 = object2.p;
            f10 = object3 != null ? ((g.p)object3).i(this) : 0.0f;
            f9 = f11;
            f8 = f13;
            f11 = f10;
            f13 = f9;
            f9 = f8;
            f10 = f12;
        } else {
            object3 = object2.m;
            f13 = object3 != null ? ((g.p)object3).f(this, 1.0f) : 0.0f;
            object3 = object2.n;
            f12 = object3 != null ? ((g.p)object3).f(this, 1.0f) : 0.0f;
            object3 = object2.o;
            f10 = object3 != null ? ((g.p)object3).f(this, 1.0f) : 1.0f;
            object3 = object2.p;
            f11 = object3 != null ? ((g.p)object3).f(this, 1.0f) : 0.0f;
            f8 = f10;
            f10 = f12;
            f9 = f13;
            f13 = f8;
        }
        this.S0();
        this.d = this.M((g.N)object2);
        p8 = new Matrix();
        if (n10 == 0) {
            p8.preTranslate(((g.b)object).a, ((g.b)object).b);
            p8.preScale(((g.b)object).c, ((g.b)object).d);
        }
        if ((object = object2.j) != null) {
            p8.preConcat((Matrix)object);
        }
        if ((n8 = object2.h.size()) == 0) {
            this.R0();
            if (bl) {
                this.d.b = false;
                return;
            }
            this.d.c = false;
            return;
        }
        int[] nArray = new int[n8];
        float[] fArray = new float[n8];
        Iterator<g.N> iterator = object2.h.iterator();
        f8 = -1.0f;
        n10 = n9;
        while (iterator.hasNext()) {
            object3 = (g.D)iterator.next();
            object = ((g.D)object3).h;
            f12 = object != null ? ((Float)object).floatValue() : 0.0f;
            if (n10 != 0 && !(f12 >= f8)) {
                fArray[n10] = f8;
            } else {
                fArray[n10] = f12;
                f8 = f12;
            }
            this.S0();
            this.W0(this.d, (g.L)object3);
            g.E e8 = this.d.a;
            object = object3 = (g.f)e8.D0;
            if (object3 == null) {
                object = g.f.c0;
            }
            nArray[n10] = ax.o4.h.x(((g.f)object).q, e8.E0.floatValue());
            ++n10;
            this.R0();
        }
        if (f9 == f13 && f10 == f11 || n8 == 1) {
            this.R0();
            object4.setColor(nArray[n8 - 1]);
            return;
        }
        object3 = Shader.TileMode.CLAMP;
        object2 = object2.k;
        object = object3;
        if (object2 != null) {
            if (object2 == g.k.c0) {
                object = Shader.TileMode.MIRROR;
            } else {
                object = object3;
                if (object2 == g.k.d0) {
                    object = Shader.TileMode.REPEAT;
                }
            }
        }
        this.R0();
        object = new LinearGradient(f9, f10, f13, f11, nArray, fArray, (Shader.TileMode)object);
        object.setLocalMatrix((Matrix)p8);
        object4.setShader((Shader)object);
        object4.setAlpha(ax.o4.h.w(this.d.a.e0.floatValue()));
    }

    private void X0() {
        block6: {
            int n8;
            Object object;
            g.E e8;
            block5: {
                block4: {
                    e8 = this.d.a;
                    object = e8.K0;
                    if (!(object instanceof g.f)) break block4;
                    n8 = ((g.f)object).q;
                    break block5;
                }
                if (!(object instanceof g.g)) break block6;
                n8 = e8.o0.q;
            }
            object = e8.L0;
            int n9 = n8;
            if (object != null) {
                n9 = ax.o4.h.x(n8, ((Float)object).floatValue());
            }
            this.a.drawColor(n9);
        }
    }

    private Path Y(g.d d8) {
        float f8;
        g.p p8 = d8.o;
        float f9 = p8 != null ? p8.h(this) : 0.0f;
        p8 = d8.p;
        float f10 = p8 != null ? p8.i(this) : 0.0f;
        float f11 = d8.q.d(this);
        float f12 = f9 - f11;
        float f13 = f10 - f11;
        float f14 = f9 + f11;
        float f15 = f10 + f11;
        if (d8.h == null) {
            f8 = 2.0f * f11;
            d8.h = new g.b(f12, f13, f8, f8);
        }
        float f16 = f11 * 0.5522848f;
        d8 = new Path();
        d8.moveTo(f9, f13);
        float f17 = f9 + f16;
        f8 = f10 - f16;
        d8.cubicTo(f17, f13, f14, f8, f14, f10);
        f11 = f10 + f16;
        d8.cubicTo(f14, f11, f17, f15, f9, f15);
        f14 = f9 - f16;
        d8.cubicTo(f14, f15, f12, f11, f12, f10);
        d8.cubicTo(f12, f8, f14, f13, f9, f13);
        d8.close();
        return d8;
    }

    private boolean Y0() {
        Boolean bl = this.d.a.C0;
        if (bl != null) {
            return bl;
        }
        return true;
    }

    private Path Z(g.i i8) {
        g.p p8 = i8.o;
        float f8 = p8 != null ? p8.h(this) : 0.0f;
        p8 = i8.p;
        float f9 = p8 != null ? p8.i(this) : 0.0f;
        float f10 = i8.q.h(this);
        float f11 = i8.r.i(this);
        float f12 = f8 - f10;
        float f13 = f9 - f11;
        float f14 = f8 + f10;
        float f15 = f9 + f11;
        if (i8.h == null) {
            i8.h = new g.b(f12, f13, f10 * 2.0f, 2.0f * f11);
        }
        float f16 = f11 * 0.5522848f;
        i8 = new Path();
        i8.moveTo(f8, f13);
        float f17 = f8 + (f10 *= 0.5522848f);
        f11 = f9 - f16;
        i8.cubicTo(f17, f13, f14, f11, f14, f9);
        f16 = f9 + f16;
        i8.cubicTo(f14, f16, f17, f15, f8, f15);
        f14 = f8 - f10;
        i8.cubicTo(f14, f15, f12, f16, f12, f9);
        i8.cubicTo(f12, f11, f14, f13, f8, f13);
        i8.close();
        return i8;
    }

    private static void Z0(String string, Object ... objectArray) {
        Log.w((String)"SVGAndroidRenderer", (String)String.format(string, objectArray));
    }

    private Path a0(g.q q8) {
        g.p p8 = q8.o;
        float f8 = 0.0f;
        float f9 = p8 == null ? 0.0f : p8.h(this);
        p8 = q8.p;
        float f10 = p8 == null ? 0.0f : p8.i(this);
        p8 = q8.q;
        float f11 = p8 == null ? 0.0f : p8.h(this);
        p8 = q8.r;
        if (p8 != null) {
            f8 = p8.i(this);
        }
        if (q8.h == null) {
            q8.h = new g.b(Math.min(f9, f11), Math.min(f10, f8), Math.abs(f11 - f9), Math.abs(f8 - f10));
        }
        q8 = new Path();
        q8.moveTo(f9, f10);
        q8.lineTo(f11, f8);
        return q8;
    }

    private Path b0(g.z z8) {
        Path path = new Path();
        float[] fArray = z8.o;
        path.moveTo(fArray[0], fArray[1]);
        for (int i8 = 2; i8 < (fArray = z8.o).length; i8 += 2) {
            path.lineTo(fArray[i8], fArray[i8 + 1]);
        }
        if (z8 instanceof g.A) {
            path.close();
        }
        if (z8.h == null) {
            z8.h = this.m(path);
        }
        return path;
    }

    /*
     * Unable to fully structure code
     */
    private Path c0(g.B var1_1) {
        var14_2 = var1_1.s;
        if (var14_2 == null && var1_1.t == null) {
            var3_3 = 0.0f;
            var2_4 = 0.0f;
        } else if (var14_2 == null) {
            var2_4 = var1_1.t.i(this);
lbl8:
            // 2 sources

            while (true) {
                var4_5 = var2_4;
                var3_3 = var2_4;
                var2_4 = var4_5;
                break;
            }
        } else {
            if (var1_1.t == null) {
                var2_4 = var14_2.h(this);
                ** continue;
            }
            var3_3 = var14_2.h(this);
            var2_4 = var1_1.t.i(this);
        }
        var5_6 = Math.min(var3_3, var1_1.q.h(this) / 2.0f);
        var4_5 = Math.min(var2_4, var1_1.r.i(this) / 2.0f);
        var14_2 = var1_1.o;
        var2_4 = var14_2 != null ? var14_2.h(this) : 0.0f;
        var14_2 = var1_1.p;
        var3_3 = var14_2 != null ? var14_2.i(this) : 0.0f;
        var6_7 = var1_1.q.h(this);
        var7_8 = var1_1.r.i(this);
        if (var1_1.h == null) {
            var1_1.h = new g.b(var2_4, var3_3, var6_7, var7_8);
        }
        var6_7 += var2_4;
        var7_8 = var3_3 + var7_8;
        var1_1 = new Path();
        if (var5_6 != 0.0f && var4_5 != 0.0f) {
            var12_9 = var5_6 * 0.5522848f;
            var11_10 = 0.5522848f * var4_5;
            var8_11 = var3_3 + var4_5;
            var1_1.moveTo(var2_4, var8_11);
            var13_12 = var8_11 - var11_10;
            var10_13 = var2_4 + var5_6;
            var9_14 = var10_13 - var12_9;
            var1_1.cubicTo(var2_4, var13_12, var9_14, var3_3, var10_13, var3_3);
            var5_6 = var6_7 - var5_6;
            var1_1.lineTo(var5_6, var3_3);
            var12_9 = var5_6 + var12_9;
            var1_1.cubicTo(var12_9, var3_3, var6_7, var13_12, var6_7, var8_11);
            var3_3 = var7_8 - var4_5;
            var1_1.lineTo(var6_7, var3_3);
            var4_5 = var3_3 + var11_10;
            var1_1.cubicTo(var6_7, var4_5, var12_9, var7_8, var5_6, var7_8);
            var1_1.lineTo(var10_13, var7_8);
            var1_1.cubicTo(var9_14, var7_8, var2_4, var4_5, var2_4, var3_3);
            var1_1.lineTo(var2_4, var8_11);
        } else {
            var1_1.moveTo(var2_4, var3_3);
            var1_1.lineTo(var6_7, var3_3);
            var1_1.lineTo(var6_7, var7_8);
            var1_1.lineTo(var2_4, var7_8);
            var1_1.lineTo(var2_4, var3_3);
        }
        var1_1.close();
        return var1_1;
    }

    private Path d0(g.W w8) {
        Path path = w8.o;
        float f8 = 0.0f;
        float f9 = path != null && path.size() != 0 ? w8.o.get(0).h(this) : 0.0f;
        path = w8.p;
        float f10 = path != null && path.size() != 0 ? w8.p.get(0).i(this) : 0.0f;
        path = w8.q;
        float f11 = path != null && path.size() != 0 ? w8.q.get(0).h(this) : 0.0f;
        path = w8.r;
        float f12 = f8;
        if (path != null) {
            f12 = path.size() == 0 ? f8 : w8.r.get(0).i(this);
        }
        f8 = f9;
        if (this.d.a.v0 != g.E.f.q) {
            float f13;
            f8 = f13 = this.n(w8);
            if (this.d.a.v0 == g.E.f.c0) {
                f8 = f13 / 2.0f;
            }
            f8 = f9 - f8;
        }
        if (w8.h == null) {
            i i8 = new i(this, f8, f10);
            this.E(w8, i8);
            path = i8.d;
            w8.h = new g.b(path.left, path.top, path.width(), i8.d.height());
        }
        path = new Path();
        this.E(w8, new g(this, f8 + f11, f10 + f12, path));
        return path;
    }

    private void e0(boolean bl, g.b object, g.Q object2) {
        int n8;
        float f8;
        float f9;
        float f10;
        float f11;
        g.p p8;
        Object object3;
        Object object4 = object2.l;
        if (object4 != null) {
            this.H((g.j)object2, (String)object4);
        }
        object4 = object2.i;
        int n9 = 0;
        int n10 = object4 != null && ((Boolean)object4).booleanValue() ? 1 : 0;
        object4 = this.d;
        object4 = bl ? ((h)object4).d : ((h)object4).e;
        if (n10 != 0) {
            object3 = new g.p(50.0f, g.d0.j0);
            p8 = object2.m;
            f11 = p8 != null ? p8.h(this) : ((g.p)object3).h(this);
            p8 = object2.n;
            f10 = p8 != null ? p8.i(this) : ((g.p)object3).i(this);
            p8 = object2.o;
            f9 = p8 != null ? p8.d(this) : ((g.p)object3).d(this);
            f8 = f11;
        } else {
            object3 = object2.m;
            f9 = 0.5f;
            f10 = object3 != null ? ((g.p)object3).f(this, 1.0f) : 0.5f;
            object3 = object2.n;
            f11 = object3 != null ? ((g.p)object3).f(this, 1.0f) : 0.5f;
            object3 = object2.o;
            if (object3 != null) {
                f9 = ((g.p)object3).f(this, 1.0f);
            }
            f8 = f10;
            f10 = f11;
        }
        this.S0();
        this.d = this.M((g.N)object2);
        p8 = new Matrix();
        if (n10 == 0) {
            p8.preTranslate(((g.b)object).a, ((g.b)object).b);
            p8.preScale(((g.b)object).c, ((g.b)object).d);
        }
        if ((object = object2.j) != null) {
            p8.preConcat((Matrix)object);
        }
        if ((n8 = object2.h.size()) == 0) {
            this.R0();
            if (bl) {
                this.d.b = false;
                return;
            }
            this.d.c = false;
            return;
        }
        int[] nArray = new int[n8];
        float[] fArray = new float[n8];
        Iterator<g.N> iterator = object2.h.iterator();
        float f12 = -1.0f;
        n10 = n9;
        while (iterator.hasNext()) {
            object3 = (g.D)iterator.next();
            object = ((g.D)object3).h;
            f11 = object != null ? ((Float)object).floatValue() : 0.0f;
            if (n10 != 0 && !(f11 >= f12)) {
                fArray[n10] = f12;
            } else {
                fArray[n10] = f11;
                f12 = f11;
            }
            this.S0();
            this.W0(this.d, (g.L)object3);
            g.E e8 = this.d.a;
            object = object3 = (g.f)e8.D0;
            if (object3 == null) {
                object = g.f.c0;
            }
            nArray[n10] = ax.o4.h.x(((g.f)object).q, e8.E0.floatValue());
            ++n10;
            this.R0();
        }
        if (f9 != 0.0f && n8 != 1) {
            object3 = Shader.TileMode.CLAMP;
            object2 = object2.k;
            object = object3;
            if (object2 != null) {
                if (object2 == g.k.c0) {
                    object = Shader.TileMode.MIRROR;
                } else {
                    object = object3;
                    if (object2 == g.k.d0) {
                        object = Shader.TileMode.REPEAT;
                    }
                }
            }
            this.R0();
            object = new RadialGradient(f8, f10, f9, nArray, fArray, (Shader.TileMode)object);
            object.setLocalMatrix((Matrix)p8);
            object4.setShader((Shader)object);
            object4.setAlpha(ax.o4.h.w(this.d.a.e0.floatValue()));
            return;
        }
        this.R0();
        object4.setColor(nArray[n8 - 1]);
    }

    private g.b f0(g.p object, g.p p8, g.p p9, g.p p10) {
        float f8 = 0.0f;
        float f9 = object != null ? ((g.p)object).h(this) : 0.0f;
        if (p8 != null) {
            f8 = p8.i(this);
        }
        object = this.S();
        float f10 = p9 != null ? p9.h(this) : ((g.b)object).c;
        float f11 = p10 != null ? p10.i(this) : ((g.b)object).d;
        return new g.b(f9, f8, f10, f11);
    }

    @TargetApi(value=19)
    private Path g0(g.K k8, boolean bl) {
        block19: {
            block23: {
                Object object;
                block21: {
                    block22: {
                        Path path;
                        block20: {
                            this.e.push(this.d);
                            object = new h(this, this.d);
                            this.d = object;
                            this.W0((h)object, k8);
                            if (!this.A() || !this.Y0()) break block19;
                            if (!(k8 instanceof g.e0)) break block20;
                            if (!bl) {
                                ax.o4.h.F("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                            }
                            object = (g.e0)k8;
                            g.N n8 = k8.a.r(((g.e0)object).p);
                            if (n8 == null) {
                                ax.o4.h.F("Use reference '%s' not found", ((g.e0)object).p);
                                this.d = this.e.pop();
                                return null;
                            }
                            if (!(n8 instanceof g.K)) {
                                this.d = this.e.pop();
                                return null;
                            }
                            if ((n8 = this.g0((g.K)n8, false)) == null) {
                                return null;
                            }
                            if (((g.K)object).h == null) {
                                ((g.K)object).h = this.m((Path)n8);
                            }
                            Matrix matrix = ((g.m)object).o;
                            object = n8;
                            if (matrix != null) {
                                n8.transform(matrix);
                                object = n8;
                            }
                            break block21;
                        }
                        if (!(k8 instanceof g.l)) break block22;
                        g.l l8 = (g.l)k8;
                        if (k8 instanceof g.v) {
                            path = new d(this, ((g.v)k8).o).f();
                            object = path;
                            if (k8.h == null) {
                                k8.h = this.m(path);
                                object = path;
                            }
                        } else {
                            object = k8 instanceof g.B ? this.c0((g.B)k8) : (k8 instanceof g.d ? this.Y((g.d)k8) : (k8 instanceof g.i ? this.Z((g.i)k8) : (k8 instanceof g.z ? this.b0((g.z)k8) : null)));
                        }
                        if (object == null) {
                            return null;
                        }
                        if (l8.h == null) {
                            l8.h = this.m((Path)object);
                        }
                        if ((path = l8.n) != null) {
                            object.transform((Matrix)path);
                        }
                        object.setFillType(this.P());
                        break block21;
                    }
                    if (!(k8 instanceof g.W)) break block23;
                    g.W w8 = (g.W)k8;
                    object = this.d0(w8);
                    if (object == null) {
                        return null;
                    }
                    w8 = w8.s;
                    if (w8 != null) {
                        object.transform((Matrix)w8);
                    }
                    object.setFillType(this.P());
                }
                if (this.d.a.F0 != null && (k8 = this.j(k8, k8.h)) != null) {
                    object.op((Path)k8, Path.Op.INTERSECT);
                }
                this.d = this.e.pop();
                return object;
            }
            ax.o4.h.F("Invalid %s element found in clipPath definition", k8.o());
            return null;
        }
        this.d = this.e.pop();
        return null;
    }

    private static void h(float f8, float f9, float f10, float f11, float f12, boolean bl, boolean bl2, float f13, float f14, g.x x8) {
        if (f8 != f13 || f9 != f14) {
            if (f10 != 0.0f && f11 != 0.0f) {
                float f15 = Math.abs(f10);
                float f16 = Math.abs(f11);
                double d8 = Math.toRadians((double)f12 % 360.0);
                double d9 = Math.cos(d8);
                double d10 = Math.sin(d8);
                d8 = (double)(f8 - f13) / 2.0;
                double d11 = (double)(f9 - f14) / 2.0;
                double d12 = d9 * d8 + d10 * d11;
                double d13 = -d10 * d8 + d9 * d11;
                d8 = f15 * f15;
                d11 = f16 * f16;
                double d14 = d12 * d12;
                double d15 = d13 * d13;
                double d16 = d14 / d8 + d15 / d11;
                f11 = f15;
                f10 = f16;
                if (d16 > 0.99999) {
                    d8 = Math.sqrt(d16) * 1.00001;
                    f11 = (float)((double)f15 * d8);
                    f10 = (float)(d8 * (double)f16);
                    d8 = f11 * f11;
                    d11 = f10 * f10;
                }
                double d17 = 1.0;
                d16 = bl == bl2 ? -1.0 : 1.0;
                d15 = d8 * d15;
                d14 = d11 * d14;
                d8 = d11 = (d8 * d11 - d15 - d14) / (d15 + d14);
                if (d11 < 0.0) {
                    d8 = 0.0;
                }
                d16 *= Math.sqrt(d8);
                d11 = f11;
                d8 = f10;
                d14 = d11 * d13 / d8 * d16;
                d15 = -(d8 * d12 / d11) * d16;
                double d18 = (double)(f8 + f13) / 2.0;
                double d19 = (double)(f9 + f14) / 2.0;
                d16 = (d12 - d14) / d11;
                double d20 = (d13 - d15) / d8;
                d12 = (-d12 - d14) / d11;
                double d21 = (-d13 - d15) / d8;
                d8 = d16 * d16 + d20 * d20;
                d13 = Math.sqrt(d8);
                d11 = d20 < 0.0 ? -1.0 : 1.0;
                d13 = Math.acos(d16 / d13);
                double d22 = Math.sqrt(d8 * (d12 * d12 + d21 * d21));
                d8 = d17;
                if (d16 * d21 - d20 * d12 < 0.0) {
                    d8 = -1.0;
                }
                d16 = d8 * ax.o4.h.v((d16 * d12 + d20 * d21) / d22);
                if (!bl2 && d16 > 0.0) {
                    d8 = d16 - Math.PI * 2;
                } else {
                    d8 = d16;
                    if (bl2) {
                        d8 = d16;
                        if (d16 < 0.0) {
                            d8 = d16 + Math.PI * 2;
                        }
                    }
                }
                float[] fArray = ax.o4.h.i(d11 * d13 % (Math.PI * 2), d8 % (Math.PI * 2));
                Matrix matrix = new Matrix();
                matrix.postScale(f11, f10);
                matrix.postRotate(f12);
                matrix.postTranslate((float)(d18 + (d9 * d14 - d10 * d15)), (float)(d19 + (d10 * d14 + d9 * d15)));
                matrix.mapPoints(fArray);
                fArray[fArray.length - 2] = f13;
                fArray[fArray.length - 1] = f14;
                for (int i8 = 0; i8 < fArray.length; i8 += 6) {
                    x8.c(fArray[i8], fArray[i8 + 1], fArray[i8 + 2], fArray[i8 + 3], fArray[i8 + 4], fArray[i8 + 5]);
                }
            }
        } else {
            return;
        }
        x8.e(f13, f14);
    }

    private void h0() {
        this.f.pop();
        this.g.pop();
    }

    private static float[] i(double d8, double d9) {
        int n8 = (int)Math.ceil(Math.abs(d9) * 2.0 / Math.PI);
        double d10 = (d9 /= (double)n8) / 2.0;
        d10 = Math.sin(d10) * 1.3333333333333333 / (Math.cos(d10) + 1.0);
        float[] fArray = new float[n8 * 6];
        int n9 = 0;
        int n10 = 0;
        while (true) {
            int n11 = n10;
            if (n9 >= n8) break;
            double d11 = d8 + (double)n9 * d9;
            double d12 = Math.cos(d11);
            double d13 = Math.sin(d11);
            fArray[n11] = (float)(d12 - d10 * d13);
            fArray[n11 + 1] = (float)(d13 + d12 * d10);
            d13 = Math.cos(d11 += d9);
            d11 = Math.sin(d11);
            fArray[n11 + 2] = (float)(d10 * d11 + d13);
            fArray[n11 + 3] = (float)(d11 - d10 * d13);
            fArray[n11 + 4] = (float)d13;
            n10 = n11 + 6;
            fArray[n11 + 5] = (float)d11;
            ++n9;
        }
        return fArray;
    }

    private void i0(g.J j8) {
        this.f.push(j8);
        this.g.push(this.a.getMatrix());
    }

    @TargetApi(value=19)
    private Path j(g.K n8, g.b b8) {
        boolean bl = false;
        n8 = n8.a.r(this.d.a.F0);
        if (n8 == null) {
            ax.o4.h.F("ClipPath reference '%s' not found", this.d.a.F0);
            return null;
        }
        n8 = (g.e)n8;
        this.e.push(this.d);
        this.d = this.M(n8);
        Boolean bl2 = ((g.e)n8).p;
        if (bl2 == null || bl2.booleanValue()) {
            bl = true;
        }
        bl2 = new Matrix();
        if (!bl) {
            bl2.preTranslate(b8.a, b8.b);
            bl2.preScale(b8.c, b8.d);
        }
        if ((b8 = ((g.m)n8).o) != null) {
            bl2.preConcat((Matrix)b8);
        }
        b8 = new Path();
        for (g.N n9 : ((g.H)n8).i) {
            if (!(n9 instanceof g.K) || (n9 = this.g0((g.K)n9, true)) == null) continue;
            b8.op((Path)n9, Path.Op.UNION);
        }
        if (this.d.a.F0 != null) {
            if (n8.h == null) {
                n8.h = this.m((Path)b8);
            }
            if ((n8 = this.j((g.K)n8, n8.h)) != null) {
                b8.op((Path)n8, Path.Op.INTERSECT);
            }
        }
        b8.transform((Matrix)bl2);
        this.d = this.e.pop();
        return b8;
    }

    private void j0(g.K k8) {
        this.k0(k8, k8.h);
    }

    private List<c> k(g.q arrayList) {
        g.p p8 = ((g.q)((Object)arrayList)).o;
        float f8 = p8 != null ? p8.h(this) : 0.0f;
        p8 = ((g.q)((Object)arrayList)).p;
        float f9 = p8 != null ? p8.i(this) : 0.0f;
        p8 = ((g.q)((Object)arrayList)).q;
        float f10 = p8 != null ? p8.h(this) : 0.0f;
        arrayList = ((g.q)((Object)arrayList)).r;
        float f11 = arrayList != null ? ((g.p)((Object)arrayList)).i(this) : 0.0f;
        arrayList = new ArrayList<c>(2);
        float f12 = f10 - f8;
        float f13 = f11 - f9;
        arrayList.add(new c(this, f8, f9, f12, f13));
        arrayList.add(new c(this, f10, f11, f12, f13));
        return arrayList;
    }

    private void k0(g.K k8, g.b b8) {
        if (this.d.a.H0 != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode((Xfermode)new PorterDuffXfermode(mode));
            this.a.saveLayer(null, paint, 31);
            paint = new Paint();
            paint.setColorFilter((ColorFilter)new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.a.saveLayer(null, paint, 31);
            g.s s8 = (g.s)this.c.r(this.d.a.H0);
            this.J0(s8, k8, b8);
            this.a.restore();
            paint = new Paint();
            paint.setXfermode((Xfermode)new PorterDuffXfermode(mode));
            this.a.saveLayer(null, paint, 31);
            this.J0(s8, k8, b8);
            this.a.restore();
            this.a.restore();
        }
        this.R0();
    }

    private List<c> l(g.z object) {
        int n8 = ((g.z)object).o.length;
        if (n8 < 2) {
            return null;
        }
        ArrayList<c> arrayList = new ArrayList<c>();
        Object object2 = ((g.z)object).o;
        object2 = new c(this, object2[0], object2[1], 0.0f, 0.0f);
        Object object3 = 0.0f;
        float f8 = 0.0f;
        for (int i8 = 2; i8 < n8; i8 += 2) {
            float[] fArray = ((g.z)object).o;
            object3 = fArray[i8];
            f8 = fArray[i8 + 1];
            ((c)object2).a((float)object3, f8);
            arrayList.add((c)object2);
            object2 = new c(this, (float)object3, f8, object3 - ((c)object2).a, f8 - ((c)object2).b);
        }
        if (object instanceof g.A) {
            object = ((g.z)object).o;
            Object object4 = object[0];
            if (object3 != object4 && f8 != (object3 = (Object)object[1])) {
                ((c)object2).a((float)object4, (float)object3);
                arrayList.add((c)object2);
                object = new c(this, (float)object4, (float)object3, (float)(object4 - ((c)object2).a), object3 - ((c)object2).b);
                ((c)object).b((c)arrayList.get(0));
                arrayList.add((c)object);
                arrayList.set(0, (c)object);
            }
            return arrayList;
        }
        arrayList.add((c)object2);
        return arrayList;
    }

    private void l0(g.N n8, j j8) {
        boolean bl = true;
        if (j8.a((g.Y)n8)) {
            if (n8 instanceof g.Z) {
                this.S0();
                this.L0((g.Z)n8);
                this.R0();
                return;
            }
            if (n8 instanceof g.V) {
                ax.o4.h.y("TSpan render", new Object[0]);
                this.S0();
                n8 = (g.V)n8;
                this.W0(this.d, (g.L)n8);
                if (this.A()) {
                    float f8;
                    float f9;
                    float f10;
                    Object object = ((g.a0)n8).o;
                    if (object == null || object.size() <= 0) {
                        bl = false;
                    }
                    boolean bl2 = j8 instanceof f;
                    float f11 = 0.0f;
                    float f12 = 0.0f;
                    if (bl2) {
                        f11 = !bl ? ((f)j8).b : ((g.a0)n8).o.get(0).h(this);
                        object = ((g.a0)n8).p;
                        f10 = object != null && object.size() != 0 ? ((g.a0)n8).p.get(0).i(this) : ((f)j8).c;
                        object = ((g.a0)n8).q;
                        f9 = object != null && object.size() != 0 ? ((g.a0)n8).q.get(0).h(this) : 0.0f;
                        object = ((g.a0)n8).r;
                        f8 = f12;
                        if (object != null) {
                            f8 = object.size() == 0 ? f12 : ((g.a0)n8).r.get(0).i(this);
                        }
                    } else {
                        f8 = 0.0f;
                        f10 = 0.0f;
                        f9 = 0.0f;
                    }
                    f12 = f11;
                    if (bl) {
                        object = this.O();
                        f12 = f11;
                        if (object != g.E.f.q) {
                            float f13;
                            f12 = f13 = this.n((g.Y)n8);
                            if (object == g.E.f.c0) {
                                f12 = f13 / 2.0f;
                            }
                            f12 = f11 - f12;
                        }
                    }
                    this.r((g.K)((Object)((g.V)n8).f()));
                    if (bl2) {
                        object = (f)j8;
                        ((f)object).b = f12 + f9;
                        ((f)object).c = f10 + f8;
                    }
                    bl2 = this.m0();
                    this.E((g.Y)n8, j8);
                    if (bl2) {
                        this.j0((g.K)n8);
                    }
                }
                this.R0();
                return;
            }
            if (n8 instanceof g.U) {
                this.S0();
                Object object = (g.U)n8;
                this.W0(this.d, (g.L)object);
                if (this.A()) {
                    this.r((g.K)((Object)((g.U)object).f()));
                    n8 = n8.a.r(((g.U)object).o);
                    if (n8 != null && n8 instanceof g.Y) {
                        object = new StringBuilder();
                        this.G((g.Y)n8, (StringBuilder)object);
                        if (((StringBuilder)object).length() > 0) {
                            j8.b(((StringBuilder)object).toString());
                        }
                    } else {
                        ax.o4.h.F("Tref reference '%s' not found", ((g.U)object).o);
                    }
                }
                this.R0();
            }
        }
    }

    private g.b m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new g.b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private boolean m0() {
        if (!this.M0()) {
            return false;
        }
        this.a.saveLayerAlpha(null, ax.o4.h.w(this.d.a.n0.floatValue()), 31);
        this.e.push(this.d);
        Object object = new h(this, this.d);
        this.d = object;
        object = ((h)object).a.H0;
        if (!(object == null || (object = this.c.r((String)object)) != null && object instanceof g.s)) {
            ax.o4.h.F("Mask reference '%s' not found", this.d.a.H0);
            this.d.a.H0 = null;
        }
        return true;
    }

    private float n(g.Y y8) {
        k k8 = new k(this);
        this.E(y8, k8);
        return k8.b;
    }

    private c n0(c c8, c c9, c c10) {
        float f8;
        float f9;
        float f10;
        float f11 = f10 = this.D(c9.c, c9.d, c9.a - c8.a, c9.b - c8.b);
        if (f10 == 0.0f) {
            f11 = this.D(c9.c, c9.d, c10.a - c9.a, c10.b - c9.b);
        }
        if ((f9 = (f8 = f11 - 0.0f) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) > 0 || f9 == false && (c9.c > 0.0f || c9.d >= 0.0f)) {
            return c9;
        }
        c9.c = -c9.c;
        c9.d = -c9.d;
        return c9;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Matrix o(g.b b8, g.b b9, ax.o4.e e8) {
        float f8;
        float f9;
        float f10;
        Matrix matrix;
        block9: {
            float f11;
            block10: {
                float f12;
                block7: {
                    block8: {
                        int[] nArray;
                        block6: {
                            matrix = new Matrix();
                            if (e8 == null) return matrix;
                            if (e8.a() == null) {
                                return matrix;
                            }
                            f10 = b8.c / b9.c;
                            f9 = b8.d / b9.d;
                            f8 = -b9.a;
                            f11 = -b9.b;
                            if (e8.equals(ax.o4.e.d)) {
                                matrix.preTranslate(b8.a, b8.b);
                                matrix.preScale(f10, f9);
                                matrix.preTranslate(f8, f11);
                                return matrix;
                            }
                            f10 = e8.b() == e.b.c0 ? Math.max(f10, f9) : Math.min(f10, f9);
                            f9 = b8.c / f10;
                            f12 = b8.d / f10;
                            nArray = ax.o4.h$a.a;
                            switch (nArray[e8.a().ordinal()]) {
                                default: {
                                    f9 = f8;
                                    break block6;
                                }
                                case 4: 
                                case 5: 
                                case 6: {
                                    f9 = b9.c - f9;
                                    break;
                                }
                                case 1: 
                                case 2: 
                                case 3: {
                                    f9 = (b9.c - f9) / 2.0f;
                                }
                            }
                            f9 = f8 - f9;
                        }
                        int n8 = nArray[e8.a().ordinal()];
                        if (n8 == 2) break block7;
                        if (n8 == 3) break block8;
                        if (n8 == 5) break block7;
                        if (n8 == 6) break block8;
                        if (n8 == 7) break block7;
                        if (n8 == 8) break block8;
                        f8 = f11;
                        break block9;
                    }
                    f8 = b9.d - f12;
                    break block10;
                }
                f8 = (b9.d - f12) / 2.0f;
            }
            f8 = f11 - f8;
        }
        matrix.preTranslate(b8.a, b8.b);
        matrix.preScale(f10, f10);
        matrix.preTranslate(f9, f8);
        return matrix;
    }

    private void o0(g.d d8) {
        ax.o4.h.y("Circle render", new Object[0]);
        g.p p8 = d8.q;
        if (p8 != null && !p8.k()) {
            this.W0(this.d, d8);
            if (this.A() && this.Y0()) {
                p8 = d8.n;
                if (p8 != null) {
                    this.a.concat((Matrix)p8);
                }
                p8 = this.Y(d8);
                this.U0(d8);
                this.r(d8);
                this.p(d8);
                boolean bl = this.m0();
                if (this.d.b) {
                    this.B(d8, (Path)p8);
                }
                if (this.d.c) {
                    this.C((Path)p8);
                }
                if (bl) {
                    this.j0(d8);
                }
            }
        }
    }

    private void p(g.K k8) {
        this.q(k8, k8.h);
    }

    private void p0(g.i i8) {
        ax.o4.h.y("Ellipse render", new Object[0]);
        g.p p8 = i8.q;
        if (p8 != null && i8.r != null && !p8.k() && !i8.r.k()) {
            this.W0(this.d, i8);
            if (this.A() && this.Y0()) {
                p8 = i8.n;
                if (p8 != null) {
                    this.a.concat((Matrix)p8);
                }
                p8 = this.Z(i8);
                this.U0(i8);
                this.r(i8);
                this.p(i8);
                boolean bl = this.m0();
                if (this.d.b) {
                    this.B(i8, (Path)p8);
                }
                if (this.d.c) {
                    this.C((Path)p8);
                }
                if (bl) {
                    this.j0(i8);
                }
            }
        }
    }

    private void q(g.K k8, g.b b8) {
        if (this.d.a.F0 != null && (k8 = this.j(k8, b8)) != null) {
            this.a.clipPath((Path)k8);
        }
    }

    private void q0(g.m m8) {
        ax.o4.h.y("Group render", new Object[0]);
        this.W0(this.d, m8);
        if (!this.A()) {
            return;
        }
        Matrix matrix = m8.o;
        if (matrix != null) {
            this.a.concat(matrix);
        }
        this.p(m8);
        boolean bl = this.m0();
        this.F0(m8, true);
        if (bl) {
            this.j0(m8);
        }
        this.U0(m8);
    }

    private void r(g.K k8) {
        g.O o8 = this.d.a.c0;
        if (o8 instanceof g.u) {
            this.z(true, k8.h, (g.u)o8);
        }
        if ((o8 = this.d.a.f0) instanceof g.u) {
            this.z(false, k8.h, (g.u)o8);
        }
    }

    private void r0(g.o o8) {
        String string;
        int n8 = 0;
        ax.o4.h.y("Image render", new Object[0]);
        Object object = o8.s;
        if (object != null && !((g.p)object).k() && (object = o8.t) != null && !((g.p)object).k() && (string = o8.p) != null) {
            object = o8.o;
            if (object == null) {
                object = ax.o4.e.e;
            }
            string = this.s(string);
            if (string == null) {
                ax.o4.g.k();
                return;
            }
            g.b b8 = new g.b(0.0f, 0.0f, string.getWidth(), string.getHeight());
            this.W0(this.d, o8);
            if (this.A() && this.Y0()) {
                Object object2 = o8.u;
                if (object2 != null) {
                    this.a.concat((Matrix)object2);
                }
                float f8 = (object2 = o8.q) != null ? ((g.p)object2).h(this) : 0.0f;
                object2 = o8.r;
                float f9 = object2 != null ? ((g.p)object2).i(this) : 0.0f;
                float f10 = o8.s.h(this);
                float f11 = o8.t.h(this);
                this.d.f = new g.b(f8, f9, f10, f11);
                if (!this.d.a.w0.booleanValue()) {
                    object2 = this.d.f;
                    this.O0(((g.b)object2).a, ((g.b)object2).b, ((g.b)object2).c, ((g.b)object2).d);
                }
                o8.h = this.d.f;
                this.U0(o8);
                this.p(o8);
                boolean bl = this.m0();
                this.X0();
                this.a.save();
                this.a.concat(this.o(this.d.f, b8, (ax.o4.e)object));
                if (this.d.a.N0 != g.E.e.d0) {
                    n8 = 2;
                }
                object = new Paint(n8);
                this.a.drawBitmap((Bitmap)string, 0.0f, 0.0f, (Paint)object);
                this.a.restore();
                if (bl) {
                    this.j0(o8);
                }
            }
        }
    }

    private Bitmap s(String object) {
        if (!((String)object).startsWith("data:")) {
            return null;
        }
        if (((String)object).length() < 14) {
            return null;
        }
        int n8 = ((String)object).indexOf(44);
        if (n8 < 12) {
            return null;
        }
        if (!";base64".equals(((String)object).substring(n8 - 7, n8))) {
            return null;
        }
        try {
            object = Base64.decode((String)((String)object).substring(n8 + 1), (int)0);
            object = BitmapFactory.decodeByteArray((byte[])object, (int)0, (int)((Object)object).length);
            return object;
        }
        catch (Exception exception) {
            Log.e((String)"SVGAndroidRenderer", (String)"Could not decode bad Data URL", (Throwable)exception);
            return null;
        }
    }

    private void s0(g.q q8) {
        ax.o4.h.y("Line render", new Object[0]);
        this.W0(this.d, q8);
        if (this.A() && this.Y0() && this.d.c) {
            Matrix matrix = q8.n;
            if (matrix != null) {
                this.a.concat(matrix);
            }
            matrix = this.a0(q8);
            this.U0(q8);
            this.r(q8);
            this.p(q8);
            boolean bl = this.m0();
            this.C((Path)matrix);
            this.I0(q8);
            if (bl) {
                this.j0(q8);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private Typeface t(String string, Integer n8, g.E.b b8) {
        int n9;
        int n10;
        block15: {
            block16: {
                int n11 = 2;
                n10 = b8 == g.E.b.c0 ? 1 : 0;
                n9 = n8 > 500 ? (n10 != 0 ? 3 : 1) : (n10 != 0 ? 2 : 0);
                string.getClass();
                switch (string.hashCode()) {
                    case 1126973893: {
                        if (!string.equals("cursive")) break;
                        n10 = 4;
                        break block15;
                    }
                    case 109326717: {
                        if (!string.equals("serif")) break;
                        n10 = 3;
                        break block15;
                    }
                    case -1081737434: {
                        n10 = n11;
                        if (!string.equals("fantasy")) {
                            break;
                        }
                        break block15;
                    }
                    case -1431958525: {
                        if (!string.equals("monospace")) break;
                        n10 = 1;
                        break block15;
                    }
                    case -1536685117: {
                        if (string.equals("sans-serif")) break block16;
                    }
                }
                n10 = -1;
                break block15;
            }
            n10 = 0;
        }
        switch (n10) {
            default: {
                return null;
            }
            case 4: {
                return Typeface.create((Typeface)Typeface.SANS_SERIF, (int)n9);
            }
            case 3: {
                return Typeface.create((Typeface)Typeface.SERIF, (int)n9);
            }
            case 2: {
                return Typeface.create((Typeface)Typeface.SANS_SERIF, (int)n9);
            }
            case 1: {
                return Typeface.create((Typeface)Typeface.MONOSPACE, (int)n9);
            }
            case 0: 
        }
        return Typeface.create((Typeface)Typeface.SANS_SERIF, (int)n9);
    }

    private void t0(g.v v8) {
        ax.o4.h.y("Path render", new Object[0]);
        if (v8.o != null) {
            this.W0(this.d, v8);
            if (this.A() && this.Y0()) {
                h h8 = this.d;
                if (h8.c || h8.b) {
                    h8 = v8.n;
                    if (h8 != null) {
                        this.a.concat((Matrix)h8);
                    }
                    h8 = new d(this, v8.o).f();
                    if (v8.h == null) {
                        v8.h = this.m((Path)h8);
                    }
                    this.U0(v8);
                    this.r(v8);
                    this.p(v8);
                    boolean bl = this.m0();
                    if (this.d.b) {
                        h8.setFillType(this.U());
                        this.B(v8, (Path)h8);
                    }
                    if (this.d.c) {
                        this.C((Path)h8);
                    }
                    this.I0(v8);
                    if (bl) {
                        this.j0(v8);
                    }
                }
            }
        }
    }

    private void u(g.N object) {
        if (object instanceof g.L && (object = ((g.L)object).d) != null) {
            this.d.h = (Boolean)object;
        }
    }

    private void u0(g.z z8) {
        ax.o4.h.y("PolyLine render", new Object[0]);
        this.W0(this.d, z8);
        if (this.A() && this.Y0()) {
            h h8 = this.d;
            if (h8.c || h8.b) {
                h8 = z8.n;
                if (h8 != null) {
                    this.a.concat((Matrix)h8);
                }
                if (z8.o.length >= 2) {
                    h8 = this.b0(z8);
                    this.U0(z8);
                    h8.setFillType(this.U());
                    this.r(z8);
                    this.p(z8);
                    boolean bl = this.m0();
                    if (this.d.b) {
                        this.B(z8, (Path)h8);
                    }
                    if (this.d.c) {
                        this.C((Path)h8);
                    }
                    this.I0(z8);
                    if (bl) {
                        this.j0(z8);
                    }
                }
            }
        }
    }

    private static double v(double d8) {
        if (d8 < -1.0) {
            return Math.PI;
        }
        if (d8 > 1.0) {
            return 0.0;
        }
        return Math.acos(d8);
    }

    private void v0(g.A a8) {
        ax.o4.h.y("Polygon render", new Object[0]);
        this.W0(this.d, a8);
        if (this.A() && this.Y0()) {
            h h8 = this.d;
            if (h8.c || h8.b) {
                h8 = a8.n;
                if (h8 != null) {
                    this.a.concat((Matrix)h8);
                }
                if (a8.o.length >= 2) {
                    h8 = this.b0(a8);
                    this.U0(a8);
                    this.r(a8);
                    this.p(a8);
                    boolean bl = this.m0();
                    if (this.d.b) {
                        this.B(a8, (Path)h8);
                    }
                    if (this.d.c) {
                        this.C((Path)h8);
                    }
                    this.I0(a8);
                    if (bl) {
                        this.j0(a8);
                    }
                }
            }
        }
    }

    private static int w(float f8) {
        int n8 = (int)(f8 * 256.0f);
        if (n8 < 0) {
            return 0;
        }
        if (n8 > 255) {
            return 255;
        }
        return n8;
    }

    private void w0(g.B b8) {
        ax.o4.h.y("Rect render", new Object[0]);
        g.p p8 = b8.q;
        if (p8 != null && b8.r != null && !p8.k() && !b8.r.k()) {
            this.W0(this.d, b8);
            if (this.A() && this.Y0()) {
                p8 = b8.n;
                if (p8 != null) {
                    this.a.concat((Matrix)p8);
                }
                p8 = this.c0(b8);
                this.U0(b8);
                this.r(b8);
                this.p(b8);
                boolean bl = this.m0();
                if (this.d.b) {
                    this.B(b8, (Path)p8);
                }
                if (this.d.c) {
                    this.C((Path)p8);
                }
                if (bl) {
                    this.j0(b8);
                }
            }
        }
    }

    private static int x(int n8, float f8) {
        int n9 = 255;
        int n10 = Math.round((float)(n8 >> 24 & 0xFF) * f8);
        if (n10 < 0) {
            n9 = 0;
        } else if (n10 <= 255) {
            n9 = n10;
        }
        return n8 & 0xFFFFFF | n9 << 24;
    }

    private void x0(g.F f8) {
        this.z0(f8, this.f0(f8.q, f8.r, f8.s, f8.t), f8.p, f8.o);
    }

    private static void y(String string, Object ... objectArray) {
    }

    private void y0(g.F f8, g.b b8) {
        this.z0(f8, b8, f8.p, f8.o);
    }

    private void z(boolean bl, g.b object, g.u u8) {
        g.N n8 = this.c.r(u8.q);
        if (n8 == null) {
            object = bl ? "Fill" : "Stroke";
            ax.o4.h.F("%s reference '%s' not found", object, u8.q);
            object = u8.c0;
            if (object != null) {
                this.P0(this.d, bl, (g.O)object);
                return;
            }
            if (bl) {
                this.d.b = false;
                return;
            }
            this.d.c = false;
            return;
        }
        if (n8 instanceof g.M) {
            this.X(bl, (g.b)object, (g.M)n8);
            return;
        }
        if (n8 instanceof g.Q) {
            this.e0(bl, (g.b)object, (g.Q)n8);
            return;
        }
        if (n8 instanceof g.C) {
            this.Q0(bl, (g.C)n8);
        }
    }

    private void z0(g.F f8, g.b b8, g.b b9, ax.o4.e object) {
        ax.o4.h.y("Svg render", new Object[0]);
        if (b8.c != 0.0f && b8.d != 0.0f) {
            ax.o4.e e8 = object;
            if (object == null && (e8 = f8.o) == null) {
                e8 = ax.o4.e.e;
            }
            this.W0(this.d, f8);
            if (this.A()) {
                object = this.d;
                ((h)object).f = b8;
                if (!((h)object).a.w0.booleanValue()) {
                    b8 = this.d.f;
                    this.O0(b8.a, b8.b, b8.c, b8.d);
                }
                this.q(f8, this.d.f);
                if (b9 != null) {
                    this.a.concat(this.o(this.d.f, b9, e8));
                    this.d.g = f8.p;
                } else {
                    b9 = this.a;
                    b8 = this.d.f;
                    b9.translate(b8.a, b8.b);
                }
                boolean bl = this.m0();
                this.X0();
                this.F0(f8, true);
                if (bl) {
                    this.j0(f8);
                }
                this.U0(f8);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    void G0(ax.o4.g g8, ax.o4.f f8) {
        Object object;
        Object object2;
        Object object3;
        g.F f9;
        block11: {
            if (f8 == null) {
                throw new NullPointerException("renderOptions shouldn't be null");
            }
            this.c = g8;
            f9 = g8.m();
            if (f9 == null) {
                ax.o4.h.Z0("Nothing to render. Document is empty.", new Object[0]);
                return;
            }
            if (f8.d()) {
                object3 = this.c.j(f8.e);
                if (object3 != null && object3 instanceof g.f0) {
                    object3 = (g.f0)object3;
                    object2 = ((g.R)object3).p;
                    if (object2 == null) {
                        Log.w((String)"SVGAndroidRenderer", (String)String.format("View element with id \"%s\" is missing a viewBox attribute.", f8.e));
                        return;
                    }
                    object3 = ((g.P)object3).o;
                    break block11;
                } else {
                    Log.w((String)"SVGAndroidRenderer", (String)String.format("View element with id \"%s\" not found.", f8.e));
                    return;
                }
            }
            object3 = f8.e() ? f8.d : f9.p;
            object2 = object3;
            object3 = f8.b() ? f8.b : f9.o;
        }
        if (f8.a()) {
            g8.a(f8.a);
        }
        if (f8.c()) {
            object = new b.q();
            this.h = object;
            ((b.q)object).a = g8.j(f8.c);
        }
        this.N0();
        this.u(f9);
        this.S0();
        object = new g.b(f8.f);
        g.p p8 = f9.s;
        if (p8 != null) {
            ((g.b)object).c = p8.f(this, ((g.b)object).c);
        }
        if ((p8 = f9.t) != null) {
            ((g.b)object).d = p8.f(this, ((g.b)object).d);
        }
        this.z0(f9, (g.b)object, (g.b)object2, (ax.o4.e)object3);
        this.R0();
        if (f8.a()) {
            g8.b();
        }
    }

    float Q() {
        return this.d.d.getTextSize();
    }

    float R() {
        return this.d.d.getTextSize() / 2.0f;
    }

    g.b S() {
        h h8 = this.d;
        g.b b8 = h8.g;
        if (b8 != null) {
            return b8;
        }
        return h8.f;
    }

    float T() {
        return this.b;
    }

    private class b
    implements g.x {
        private List<c> a;
        private float b;
        private float c;
        private c d;
        private boolean e;
        private boolean f;
        private int g;
        private boolean h;
        final h i;

        b(h object, g.w w8) {
            this.i = object;
            this.a = new ArrayList<c>();
            this.d = null;
            this.e = false;
            this.f = true;
            this.g = -1;
            if (w8 != null) {
                w8.h(this);
                if (this.h) {
                    this.d.b(this.a.get(this.g));
                    this.a.set(this.g, this.d);
                    this.h = false;
                }
                if ((object = this.d) != null) {
                    this.a.add((c)object);
                }
            }
        }

        @Override
        public void a(float f8, float f9, float f10, float f11) {
            this.d.a(f8, f9);
            this.a.add(this.d);
            this.d = new c(this.i, f10, f11, f10 - f8, f11 - f9);
            this.h = false;
        }

        @Override
        public void b(float f8, float f9) {
            c c8;
            if (this.h) {
                this.d.b(this.a.get(this.g));
                this.a.set(this.g, this.d);
                this.h = false;
            }
            if ((c8 = this.d) != null) {
                this.a.add(c8);
            }
            this.b = f8;
            this.c = f9;
            this.d = new c(this.i, f8, f9, 0.0f, 0.0f);
            this.g = this.a.size();
        }

        @Override
        public void c(float f8, float f9, float f10, float f11, float f12, float f13) {
            if (this.f || this.e) {
                this.d.a(f8, f9);
                this.a.add(this.d);
                this.e = false;
            }
            this.d = new c(this.i, f12, f13, f12 - f10, f13 - f11);
            this.h = false;
        }

        @Override
        public void close() {
            this.a.add(this.d);
            this.e(this.b, this.c);
            this.h = true;
        }

        @Override
        public void d(float f8, float f9, float f10, boolean bl, boolean bl2, float f11, float f12) {
            this.e = true;
            this.f = false;
            c c8 = this.d;
            ax.o4.h.h(c8.a, c8.b, f8, f9, f10, bl, bl2, f11, f12, this);
            this.f = true;
            this.h = false;
        }

        @Override
        public void e(float f8, float f9) {
            this.d.a(f8, f9);
            this.a.add(this.d);
            h h8 = this.i;
            c c8 = this.d;
            this.d = new c(h8, f8, f9, f8 - c8.a, f9 - c8.b);
            this.h = false;
        }

        List<c> f() {
            return this.a;
        }
    }

    private class c {
        float a;
        float b;
        float c;
        float d;
        boolean e;
        final h f;

        c(h h8, float f8, float f9, float f10, float f11) {
            this.f = h8;
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = false;
            this.a = f8;
            this.b = f9;
            double d8 = Math.sqrt(f10 * f10 + f11 * f11);
            if (d8 != 0.0) {
                this.c = (float)((double)f10 / d8);
                this.d = (float)((double)f11 / d8);
            }
        }

        void a(float f8, float f9) {
            float f10 = f8 - this.a;
            float f11 = f9 - this.b;
            double d8 = Math.sqrt(f10 * f10 + f11 * f11);
            f9 = f10;
            f8 = f11;
            if (d8 != 0.0) {
                f9 = (float)((double)f10 / d8);
                f8 = (float)((double)f11 / d8);
            }
            if (f9 == -(f10 = this.c) && f8 == -this.d) {
                this.e = true;
                this.c = -f8;
                this.d = f9;
                return;
            }
            this.c = f10 + f9;
            this.d += f8;
        }

        void b(c c8) {
            float f8;
            float f9 = c8.c;
            float f10 = this.c;
            if (f9 == -f10 && (f8 = c8.d) == -this.d) {
                this.e = true;
                this.c = -f8;
                this.d = c8.c;
                return;
            }
            this.c = f10 + f9;
            this.d += c8.d;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("(");
            stringBuilder.append(this.a);
            stringBuilder.append(",");
            stringBuilder.append(this.b);
            stringBuilder.append(" ");
            stringBuilder.append(this.c);
            stringBuilder.append(",");
            stringBuilder.append(this.d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    private class d
    implements g.x {
        Path a;
        float b;
        float c;
        final h d;

        d(h h8, g.w w8) {
            this.d = h8;
            this.a = new Path();
            if (w8 == null) {
                return;
            }
            w8.h(this);
        }

        @Override
        public void a(float f8, float f9, float f10, float f11) {
            this.a.quadTo(f8, f9, f10, f11);
            this.b = f10;
            this.c = f11;
        }

        @Override
        public void b(float f8, float f9) {
            this.a.moveTo(f8, f9);
            this.b = f8;
            this.c = f9;
        }

        @Override
        public void c(float f8, float f9, float f10, float f11, float f12, float f13) {
            this.a.cubicTo(f8, f9, f10, f11, f12, f13);
            this.b = f12;
            this.c = f13;
        }

        @Override
        public void close() {
            this.a.close();
        }

        @Override
        public void d(float f8, float f9, float f10, boolean bl, boolean bl2, float f11, float f12) {
            ax.o4.h.h(this.b, this.c, f8, f9, f10, bl, bl2, f11, f12, this);
            this.b = f11;
            this.c = f12;
        }

        @Override
        public void e(float f8, float f9) {
            this.a.lineTo(f8, f9);
            this.b = f8;
            this.c = f9;
        }

        Path f() {
            return this.a;
        }
    }

    private class e
    extends f {
        private Path e;
        final h f;

        e(h h8, Path path, float f8, float f9) {
            this.f = h8;
            super(h8, f8, f9);
            this.e = path;
        }

        @Override
        public void b(String string) {
            if (this.f.Y0()) {
                if (((h)this.f).d.b) {
                    this.f.a.drawTextOnPath(string, this.e, this.b, this.c, ((h)this.f).d.d);
                }
                if (((h)this.f).d.c) {
                    this.f.a.drawTextOnPath(string, this.e, this.b, this.c, ((h)this.f).d.e);
                }
            }
            this.b += ((h)this.f).d.d.measureText(string);
        }
    }

    private class f
    extends j {
        float b;
        float c;
        final h d;

        f(h h8, float f8, float f9) {
            this.d = h8;
            super(h8);
            this.b = f8;
            this.c = f9;
        }

        @Override
        public void b(String string) {
            ax.o4.h.y("TextSequence render", new Object[0]);
            if (this.d.Y0()) {
                if (((h)this.d).d.b) {
                    this.d.a.drawText(string, this.b, this.c, ((h)this.d).d.d);
                }
                if (((h)this.d).d.c) {
                    this.d.a.drawText(string, this.b, this.c, ((h)this.d).d.e);
                }
            }
            this.b += ((h)this.d).d.d.measureText(string);
        }
    }

    private class g
    extends j {
        float b;
        float c;
        Path d;
        final h e;

        g(h h8, float f8, float f9, Path path) {
            this.e = h8;
            super(h8);
            this.b = f8;
            this.c = f9;
            this.d = path;
        }

        @Override
        public boolean a(g.Y y8) {
            if (y8 instanceof g.Z) {
                ax.o4.h.Z0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
                return false;
            }
            return true;
        }

        @Override
        public void b(String string) {
            if (this.e.Y0()) {
                Path path = new Path();
                ((h)this.e).d.d.getTextPath(string, 0, string.length(), this.b, this.c, path);
                this.d.addPath(path);
            }
            this.b += ((h)this.e).d.d.measureText(string);
        }
    }

    private class h {
        g.E a;
        boolean b;
        boolean c;
        Paint d;
        Paint e;
        g.b f;
        g.b g;
        boolean h;
        final h i;

        h(h h8) {
            this.i = h8;
            h8 = new Paint();
            this.d = h8;
            h8.setFlags(193);
            this.d.setHinting(0);
            this.d.setStyle(Paint.Style.FILL);
            Paint paint = this.d;
            h8 = Typeface.DEFAULT;
            paint.setTypeface((Typeface)h8);
            this.e = paint = new Paint();
            paint.setFlags(193);
            this.e.setHinting(0);
            this.e.setStyle(Paint.Style.STROKE);
            this.e.setTypeface((Typeface)h8);
            this.a = g.E.b();
        }

        h(h object, h h8) {
            this.i = object;
            this.b = h8.b;
            this.c = h8.c;
            this.d = new Paint(h8.d);
            this.e = new Paint(h8.e);
            object = h8.f;
            if (object != null) {
                this.f = new g.b((g.b)object);
            }
            if ((object = h8.g) != null) {
                this.g = new g.b((g.b)object);
            }
            this.h = h8.h;
            try {
                this.a = (g.E)h8.a.clone();
                return;
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                Log.e((String)"SVGAndroidRenderer", (String)"Unexpected clone error", (Throwable)cloneNotSupportedException);
                this.a = g.E.b();
                return;
            }
        }
    }

    private class i
    extends j {
        float b;
        float c;
        RectF d;
        final h e;

        i(h h8, float f8, float f9) {
            this.e = h8;
            super(h8);
            this.d = new RectF();
            this.b = f8;
            this.c = f9;
        }

        @Override
        public boolean a(g.Y n8) {
            if (n8 instanceof g.Z) {
                g.K k8 = (g.Z)n8;
                n8 = n8.a.r(k8.o);
                if (n8 == null) {
                    ax.o4.h.F("TextPath path reference '%s' not found", new Object[]{k8.o});
                    return false;
                }
                k8 = (g.v)n8;
                n8 = new d(this.e, ((g.v)k8).o).f();
                k8 = ((g.l)k8).n;
                if (k8 != null) {
                    n8.transform((Matrix)k8);
                }
                k8 = new RectF();
                n8.computeBounds((RectF)k8, true);
                this.d.union((RectF)k8);
                return false;
            }
            return true;
        }

        @Override
        public void b(String string) {
            if (this.e.Y0()) {
                Rect rect = new Rect();
                ((h)this.e).d.d.getTextBounds(string, 0, string.length(), rect);
                rect = new RectF(rect);
                rect.offset(this.b, this.c);
                this.d.union((RectF)rect);
            }
            this.b += ((h)this.e).d.d.measureText(string);
        }
    }

    private abstract class j {
        final h a;

        private j(h h8) {
            this.a = h8;
        }

        public boolean a(g.Y y8) {
            return true;
        }

        public abstract void b(String var1);
    }

    private class k
    extends j {
        float b;
        final h c;

        private k(h h8) {
            this.c = h8;
            super(h8);
            this.b = 0.0f;
        }

        @Override
        public void b(String string) {
            this.b += ((h)this.c).d.d.measureText(string);
        }
    }
}

