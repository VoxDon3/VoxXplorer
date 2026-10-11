/*
 * Decompiled with CFR 0.152.
 */
package ax.l6;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

public class f
extends Property<ImageView, Matrix> {
    private final Matrix a = new Matrix();

    public f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    public Matrix a(ImageView imageView) {
        this.a.set(imageView.getImageMatrix());
        return this.a;
    }

    public void b(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}

