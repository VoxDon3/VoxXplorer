package ax.p1;

import android.opengl.Matrix;
import ax.S0.C0983p;
import ax.S0.L;

/* loaded from: classes.dex */
final class c {
    private final float[] a = new float[16];
    private final float[] b = new float[16];
    private final L<float[]> c = new L<>();
    private boolean d;

    public static void a(float[] fArr, float[] fArr2) {
        C0983p.o(fArr);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        float f3 = fArr2[10];
        fArr[0] = f3 / sqrt;
        float f4 = fArr2[8];
        fArr[2] = f4 / sqrt;
        fArr[8] = (-f4) / sqrt;
        fArr[10] = f3 / sqrt;
    }

    private static void b(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = -fArr2[1];
        float f3 = -fArr2[2];
        float length = Matrix.length(f, f2, f3);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
        } else {
            C0983p.o(fArr);
        }
    }

    public boolean c(float[] fArr, long j) {
        float[] j2 = this.c.j(j);
        if (j2 == null) {
            return false;
        }
        b(this.b, j2);
        if (!this.d) {
            a(this.a, this.b);
            this.d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.a, 0, this.b, 0);
        return true;
    }

    public void d() {
        this.c.c();
        this.d = false;
    }

    public void e(long j, float[] fArr) {
        this.c.a(j, fArr);
    }
}
