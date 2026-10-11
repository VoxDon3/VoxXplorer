package ax.O6;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: classes3.dex */
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

    private static class a {
        static final m a = new m();
    }

    public interface b {
        void a(n nVar, Matrix matrix, int i);

        void b(n nVar, Matrix matrix, int i);
    }

    static final class c {
        public final l a;
        public final Path b;
        public final RectF c;
        public final b d;
        public final float e;

        c(l lVar, float f, RectF rectF, b bVar, Path path) {
            this.d = bVar;
            this.a = lVar;
            this.e = f;
            this.c = rectF;
            this.b = path;
        }
    }

    public m() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new n();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    private float a(int i) {
        return ((i + 1) % 4) * 90;
    }

    private void b(c cVar, int i) {
        this.h[0] = this.a[i].k();
        this.h[1] = this.a[i].l();
        this.b[i].mapPoints(this.h);
        if (i == 0) {
            Path path = cVar.b;
            float[] fArr = this.h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.b;
            float[] fArr2 = this.h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.a[i].d(this.b[i], cVar.b);
        b bVar = cVar.d;
        if (bVar != null) {
            bVar.b(this.a[i], this.b[i], i);
        }
    }

    private void c(c cVar, int i) {
        int i2 = (i + 1) % 4;
        this.h[0] = this.a[i].i();
        this.h[1] = this.a[i].j();
        this.b[i].mapPoints(this.h);
        this.i[0] = this.a[i2].k();
        this.i[1] = this.a[i2].l();
        this.b[i2].mapPoints(this.i);
        float f = this.h[0];
        float[] fArr = this.i;
        float max = Math.max(((float) Math.hypot(f - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float h = h(cVar.c, i);
        this.g.n(0.0f, 0.0f);
        g i3 = i(i, cVar.a);
        i3.c(max, h, cVar.e, this.g);
        this.j.reset();
        this.g.d(this.c[i], this.j);
        if (this.l && (i3.b() || k(this.j, i) || k(this.j, i2))) {
            Path path = this.j;
            path.op(path, this.f, Path.Op.DIFFERENCE);
            this.h[0] = this.g.k();
            this.h[1] = this.g.l();
            this.c[i].mapPoints(this.h);
            Path path2 = this.e;
            float[] fArr2 = this.h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.g.d(this.c[i], this.e);
        } else {
            this.g.d(this.c[i], cVar.b);
        }
        b bVar = cVar.d;
        if (bVar != null) {
            bVar.a(this.g, this.c[i], i);
        }
    }

    private void e(int i, RectF rectF, PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private e g(int i, l lVar) {
        return i != 1 ? i != 2 ? i != 3 ? lVar.s() : lVar.q() : lVar.i() : lVar.k();
    }

    private float h(RectF rectF, int i) {
        float[] fArr = this.h;
        n nVar = this.a[i];
        fArr[0] = nVar.c;
        fArr[1] = nVar.d;
        this.b[i].mapPoints(fArr);
        return (i == 1 || i == 3) ? Math.abs(rectF.centerX() - this.h[0]) : Math.abs(rectF.centerY() - this.h[1]);
    }

    private g i(int i, l lVar) {
        return i != 1 ? i != 2 ? i != 3 ? lVar.o() : lVar.p() : lVar.n() : lVar.h();
    }

    public static m j() {
        return a.a;
    }

    private boolean k(Path path, int i) {
        this.k.reset();
        this.a[i].d(this.b[i], this.k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.k.computeBounds(rectF, true);
        path.op(this.k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    private void l(c cVar, int i, float[] fArr) {
        g(i, cVar.a).b(this.a[i], 90.0f, cVar.e, cVar.c, fArr == null ? f(i, cVar.a) : new ax.O6.c(fArr[i]));
        float a2 = a(i);
        this.b[i].reset();
        e(i, cVar.c, this.d);
        Matrix matrix = this.b[i];
        PointF pointF = this.d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.b[i].preRotate(a2);
    }

    private void m(int i) {
        this.h[0] = this.a[i].i();
        this.h[1] = this.a[i].j();
        this.b[i].mapPoints(this.h);
        float a2 = a(i);
        this.c[i].reset();
        Matrix matrix = this.c[i];
        float[] fArr = this.h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.c[i].preRotate(a2);
    }

    public void d(l lVar, float[] fArr, float f, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(lVar, f, rectF, bVar, path);
        for (int i = 0; i < 4; i++) {
            l(cVar, i, fArr);
            m(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            b(cVar, i2);
            c(cVar, i2);
        }
        path.close();
        this.e.close();
        if (this.e.isEmpty()) {
            return;
        }
        path.op(this.e, Path.Op.UNION);
    }

    d f(int i, l lVar) {
        return i != 1 ? i != 2 ? i != 3 ? lVar.t() : lVar.r() : lVar.j() : lVar.l();
    }
}
