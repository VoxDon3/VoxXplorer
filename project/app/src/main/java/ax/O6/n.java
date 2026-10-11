/*
 * Decompiled with CFR 0.152.
 */
package ax.O6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import ax.N6.a;
import java.util.ArrayList;
import java.util.List;

public class n {
    @Deprecated
    public float a;
    @Deprecated
    public float b;
    @Deprecated
    public float c;
    @Deprecated
    public float d;
    @Deprecated
    public float e;
    @Deprecated
    public float f;
    private final List<f> g = new ArrayList<f>();
    private final List<g> h = new ArrayList<g>();
    private boolean i;

    public n() {
        this.n(0.0f, 0.0f);
    }

    private void b(float f8) {
        float f9;
        if (this.g() == f8 || (f9 = (f8 - this.g() + 360.0f) % 360.0f) > 180.0f) {
            return;
        }
        d d8 = new d(this.i(), this.j(), this.i(), this.j());
        d8.s(this.g());
        d8.t(f9);
        this.h.add(new b(d8));
        this.p(f8);
    }

    private void c(g g8, float f8, float f9) {
        this.b(f8);
        this.h.add(g8);
        this.p(f9);
    }

    private float g() {
        return this.e;
    }

    private float h() {
        return this.f;
    }

    private void p(float f8) {
        this.e = f8;
    }

    private void q(float f8) {
        this.f = f8;
    }

    private void r(float f8) {
        this.c = f8;
    }

    private void s(float f8) {
        this.d = f8;
    }

    private void t(float f8) {
        this.a = f8;
    }

    private void u(float f8) {
        this.b = f8;
    }

    public void a(float f8, float f9, float f10, float f11, float f12, float f13) {
        Object object = new d(f8, f9, f10, f11);
        ((d)object).s(f12);
        ((d)object).t(f13);
        this.g.add((f)object);
        object = new b((d)object);
        float f14 = f12 + f13;
        boolean bl = f13 < 0.0f;
        f13 = f12;
        if (bl) {
            f13 = (f12 + 180.0f) % 360.0f;
        }
        f12 = bl ? (180.0f + f14) % 360.0f : f14;
        this.c((g)object, f13, f12);
        f12 = (f10 - f8) / 2.0f;
        double d8 = f14;
        this.r((f8 + f10) * 0.5f + f12 * (float)Math.cos(Math.toRadians(d8)));
        this.s((f9 + f11) * 0.5f + (f11 - f9) / 2.0f * (float)Math.sin(Math.toRadians(d8)));
    }

    public void d(Matrix matrix, Path path) {
        int n8 = this.g.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            this.g.get(i8).a(matrix, path);
        }
    }

    boolean e() {
        return this.i;
    }

    g f(Matrix matrix) {
        this.b(this.h());
        matrix = new Matrix(matrix);
        return new g(this, new ArrayList<g>(this.h), matrix){
            final List c;
            final Matrix d;
            final n e;
            {
                this.e = n8;
                this.c = list;
                this.d = matrix;
            }

            @Override
            public void a(Matrix object, a a8, int n8, Canvas canvas) {
                object = this.c.iterator();
                while (object.hasNext()) {
                    ((g)object.next()).a(this.d, a8, n8, canvas);
                }
            }
        };
    }

    float i() {
        return this.c;
    }

    float j() {
        return this.d;
    }

    float k() {
        return this.a;
    }

    float l() {
        return this.b;
    }

    public void m(float f8, float f9) {
        Object object = new e();
        ax.O6.n$e.c((e)object, f8);
        ax.O6.n$e.e((e)object, f9);
        this.g.add((f)object);
        object = new c((e)object, this.i(), this.j());
        this.c((g)object, ((c)object).c() + 270.0f, ((c)object).c() + 270.0f);
        this.r(f8);
        this.s(f9);
    }

    public void n(float f8, float f9) {
        this.o(f8, f9, 270.0f, 0.0f);
    }

    public void o(float f8, float f9, float f10, float f11) {
        this.t(f8);
        this.u(f9);
        this.r(f8);
        this.s(f9);
        this.p(f10);
        this.q((f10 + f11) % 360.0f);
        this.g.clear();
        this.h.clear();
        this.i = false;
    }

    static class b
    extends g {
        private final d c;

        public b(d d8) {
            this.c = d8;
        }

        @Override
        public void a(Matrix matrix, a a8, int n8, Canvas canvas) {
            float f8 = this.c.m();
            float f9 = this.c.n();
            a8.a(canvas, matrix, new RectF(this.c.k(), this.c.o(), this.c.l(), this.c.j()), n8, f8, f9);
        }
    }

    static class c
    extends g {
        private final e c;
        private final float d;
        private final float e;

        public c(e e8, float f8, float f9) {
            this.c = e8;
            this.d = f8;
            this.e = f9;
        }

        @Override
        public void a(Matrix matrix, a a8, int n8, Canvas canvas) {
            float f8 = this.c.c;
            float f9 = this.e;
            float f10 = this.c.b;
            float f11 = this.d;
            RectF rectF = new RectF(0.0f, 0.0f, (float)Math.hypot(f8 - f9, f10 - f11), 0.0f);
            this.a.set(matrix);
            this.a.preTranslate(this.d, this.e);
            this.a.preRotate(this.c());
            a8.b(canvas, this.a, rectF, n8);
        }

        float c() {
            return (float)Math.toDegrees(Math.atan((this.c.c - this.e) / (this.c.b - this.d)));
        }
    }

    public static class d
    extends f {
        private static final RectF h = new RectF();
        @Deprecated
        public float b;
        @Deprecated
        public float c;
        @Deprecated
        public float d;
        @Deprecated
        public float e;
        @Deprecated
        public float f;
        @Deprecated
        public float g;

        public d(float f8, float f9, float f10, float f11) {
            this.q(f8);
            this.u(f9);
            this.r(f10);
            this.p(f11);
        }

        private float j() {
            return this.e;
        }

        private float k() {
            return this.b;
        }

        private float l() {
            return this.d;
        }

        private float m() {
            return this.f;
        }

        private float n() {
            return this.g;
        }

        private float o() {
            return this.c;
        }

        private void p(float f8) {
            this.e = f8;
        }

        private void q(float f8) {
            this.b = f8;
        }

        private void r(float f8) {
            this.d = f8;
        }

        private void s(float f8) {
            this.f = f8;
        }

        private void t(float f8) {
            this.g = f8;
        }

        private void u(float f8) {
            this.c = f8;
        }

        @Override
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            matrix2 = h;
            matrix2.set(this.k(), this.o(), this.l(), this.j());
            path.arcTo((RectF)matrix2, this.m(), this.n(), false);
            path.transform(matrix);
        }
    }

    public static class e
    extends f {
        private float b;
        private float c;

        static /* synthetic */ float c(e e8, float f8) {
            e8.b = f8;
            return f8;
        }

        static /* synthetic */ float e(e e8, float f8) {
            e8.c = f8;
            return f8;
        }

        @Override
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.c);
            path.transform(matrix);
        }
    }

    public static abstract class f {
        protected final Matrix a = new Matrix();

        public abstract void a(Matrix var1, Path var2);
    }

    static abstract class g {
        static final Matrix b = new Matrix();
        final Matrix a = new Matrix();

        g() {
        }

        public abstract void a(Matrix var1, a var2, int var3, Canvas var4);

        public final void b(a a8, int n8, Canvas canvas) {
            this.a(b, a8, n8, canvas);
        }
    }
}

