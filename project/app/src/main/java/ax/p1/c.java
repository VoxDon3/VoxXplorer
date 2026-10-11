/*
 * Decompiled with CFR 0.152.
 */
package ax.p1;

import android.opengl.Matrix;
import ax.S0.L;
import ax.S0.p;

final class c {
    private final float[] a = new float[16];
    private final float[] b = new float[16];
    private final L<float[]> c = new L();
    private boolean d;

    public static void a(float[] fArray, float[] fArray2) {
        p.o(fArray);
        float f8 = fArray2[10];
        float f9 = fArray2[8];
        float f10 = (float)Math.sqrt(f8 * f8 + f9 * f9);
        f9 = fArray2[10];
        fArray[0] = f9 / f10;
        f8 = fArray2[8];
        fArray[2] = f8 / f10;
        fArray[8] = -f8 / f10;
        fArray[10] = f9 / f10;
    }

    private static void b(float[] fArray, float[] fArray2) {
        float f8 = fArray2[0];
        float f9 = -fArray2[1];
        float f10 = -fArray2[2];
        float f11 = Matrix.length((float)f8, (float)f9, (float)f10);
        if (f11 != 0.0f) {
            Matrix.setRotateM((float[])fArray, (int)0, (float)((float)Math.toDegrees(f11)), (float)(f8 / f11), (float)(f9 / f11), (float)(f10 / f11));
            return;
        }
        p.o(fArray);
    }

    public boolean c(float[] fArray, long l8) {
        float[] fArray2 = this.c.j(l8);
        if (fArray2 == null) {
            return false;
        }
        ax.p1.c.b(this.b, fArray2);
        if (!this.d) {
            ax.p1.c.a(this.a, this.b);
            this.d = true;
        }
        Matrix.multiplyMM((float[])fArray, (int)0, (float[])this.a, (int)0, (float[])this.b, (int)0);
        return true;
    }

    public void d() {
        this.c.c();
        this.d = false;
    }

    public void e(long l8, float[] fArray) {
        this.c.a(l8, fArray);
    }
}

