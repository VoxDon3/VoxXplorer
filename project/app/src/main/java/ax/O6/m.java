/*
 * Decompiled with CFR 0.152.
 */
package ax.O6;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import ax.O6.d;
import ax.O6.e;
import ax.O6.g;
import ax.O6.l;
import ax.O6.n;

public class m {
    private final n[] a = new n[4];
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] c = new Matrix[4];
    private final PointF d = new PointF();
    private final Path e = new Path();
    private final Path f = new Path();
    private final n g = new n();
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private final Path j = new Path();
    private final Path k = new Path();
    private boolean l = true;

    public m() {
        for (int i8 = 0; i8 < 4; ++i8) {
            this.a[i8] = new n();
            this.b[i8] = new Matrix();
            this.c[i8] = new Matrix();
        }
    }

    private float a(int n8) {
        return (n8 + 1) % 4 * 90;
    }

    private void b(c object, int n8) {
        this.h[0] = this.a[n8].k();
        this.h[1] = this.a[n8].l();
        this.b[n8].mapPoints(this.h);
        if (n8 == 0) {
            Path path = ((c)object).b;
            float[] fArray = this.h;
            path.moveTo(fArray[0], fArray[1]);
        } else {
            Path path = ((c)object).b;
            float[] fArray = this.h;
            path.lineTo(fArray[0], fArray[1]);
        }
        this.a[n8].d(this.b[n8], ((c)object).b);
        object = ((c)object).d;
        if (object != null) {
            object.b(this.a[n8], this.b[n8], n8);
        }
    }

    private void c(c object, int n8) {
        int n9 = (n8 + 1) % 4;
        this.h[0] = this.a[n8].i();
        this.h[1] = this.a[n8].j();
        this.b[n8].mapPoints(this.h);
        this.i[0] = this.a[n9].k();
        this.i[1] = this.a[n9].l();
        this.b[n9].mapPoints(this.i);
        float[] fArray = this.h;
        float f8 = fArray[0];
        Object object2 = this.i;
        float f9 = Math.max((float)Math.hypot(f8 - object2[0], fArray[1] - object2[1]) - 0.001f, 0.0f);
        f8 = this.h(((c)object).c, n8);
        this.g.n(0.0f, 0.0f);
        object2 = this.i(n8, ((c)object).a);
        ((g)object2).c(f9, f8, ((c)object).e, this.g);
        this.j.reset();
        this.g.d(this.c[n8], this.j);
        if (this.l && (((g)object2).b() || this.k(this.j, n8) || this.k(this.j, n9))) {
            object2 = this.j;
            object2.op((Path)object2, this.f, Path.Op.DIFFERENCE);
            this.h[0] = this.g.k();
            this.h[1] = this.g.l();
            this.c[n8].mapPoints(this.h);
            object2 = this.e;
            fArray = this.h;
            object2.moveTo(fArray[0], fArray[1]);
            this.g.d(this.c[n8], this.e);
        } else {
            this.g.d(this.c[n8], ((c)object).b);
        }
        object = ((c)object).d;
        if (object != null) {
            object.a(this.g, this.c[n8], n8);
        }
    }

    private void e(int n8, RectF rectF, PointF pointF) {
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    pointF.set(rectF.right, rectF.top);
                    return;
                }
                pointF.set(rectF.left, rectF.top);
                return;
            }
            pointF.set(rectF.left, rectF.bottom);
            return;
        }
        pointF.set(rectF.right, rectF.bottom);
    }

    private e g(int n8, l l8) {
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return l8.s();
                }
                return l8.q();
            }
            return l8.i();
        }
        return l8.k();
    }

    private float h(RectF rectF, int n8) {
        float[] fArray = this.h;
        n n9 = this.a[n8];
        fArray[0] = n9.c;
        fArray[1] = n9.d;
        this.b[n8].mapPoints(fArray);
        if (n8 != 1 && n8 != 3) {
            return Math.abs(rectF.centerY() - this.h[1]);
        }
        return Math.abs(rectF.centerX() - this.h[0]);
    }

    private g i(int n8, l l8) {
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return l8.o();
                }
                return l8.p();
            }
            return l8.n();
        }
        return l8.h();
    }

    public static m j() {
        return ax.O6.m$a.a;
    }

    private boolean k(Path path, int n8) {
        this.k.reset();
        this.a[n8].d(this.b[n8], this.k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.k.computeBounds(rectF, true);
        path.op(this.k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || rectF.width() > 1.0f && rectF.height() > 1.0f;
        {
        }
    }

    private void l(c c8, int n8, float[] object) {
        object = object == null ? (Object)this.f(n8, c8.a) : (Object)new ax.O6.c(object[n8]);
        this.g(n8, c8.a).b(this.a[n8], 90.0f, c8.e, c8.c, (d)object);
        float f8 = this.a(n8);
        this.b[n8].reset();
        this.e(n8, c8.c, this.d);
        c8 = this.b[n8];
        object = this.d;
        c8.setTranslate(((PointF)object).x, ((PointF)object).y);
        this.b[n8].preRotate(f8);
    }

    private void m(int n8) {
        this.h[0] = this.a[n8].i();
        this.h[1] = this.a[n8].j();
        this.b[n8].mapPoints(this.h);
        float f8 = this.a(n8);
        this.c[n8].reset();
        Matrix matrix = this.c[n8];
        float[] fArray = this.h;
        matrix.setTranslate(fArray[0], fArray[1]);
        this.c[n8].preRotate(f8);
    }

    public void d(l object, float[] fArray, float f8, RectF rectF, b b8, Path path) {
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path.Direction.CW);
        object = new c((l)object, f8, rectF, b8, path);
        int n8 = 0;
        int n9 = 0;
        while (true) {
            if (n9 >= 4) break;
            this.l((c)object, n9, fArray);
            this.m(n9);
            ++n9;
        }
        for (int i8 = n8; i8 < 4; ++i8) {
            this.b((c)object, i8);
            this.c((c)object, i8);
        }
        path.close();
        this.e.close();
        if (!this.e.isEmpty()) {
            path.op(this.e, Path.Op.UNION);
        }
    }

    d f(int n8, l l8) {
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return l8.t();
                }
                return l8.r();
            }
            return l8.j();
        }
        return l8.l();
    }

    private static class a {
        static final m a = new m();
    }

    public static interface b {
        public void a(n var1, Matrix var2, int var3);

        public void b(n var1, Matrix var2, int var3);
    }

    static final class c {
        public final l a;
        public final Path b;
        public final RectF c;
        public final b d;
        public final float e;

        c(l l8, float f8, RectF rectF, b b8, Path path) {
            this.d = b8;
            this.a = l8;
            this.e = f8;
            this.c = rectF;
            this.b = path;
        }
    }
}

