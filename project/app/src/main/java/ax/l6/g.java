/*
 * Decompiled with CFR 0.152.
 */
package ax.l6;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

public class g
implements TypeEvaluator<Matrix> {
    private final float[] a = new float[9];
    private final float[] b = new float[9];
    private final Matrix c = new Matrix();

    public Matrix a(float f8, Matrix object, Matrix matrix) {
        object.getValues(this.a);
        matrix.getValues(this.b);
        for (int i8 = 0; i8 < 9; ++i8) {
            object = this.b;
            Matrix matrix2 = object[i8];
            float f9 = this.a[i8];
            object[i8] = (Matrix)(f9 + (matrix2 - f9) * f8);
        }
        this.c.setValues(this.b);
        return this.c;
    }
}

