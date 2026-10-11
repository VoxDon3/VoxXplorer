package ax.v2;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
class H extends C3255D {
    private static boolean f = true;
    private static boolean g = true;

    static class a {
        static void a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        static void b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        static void c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    H() {
    }

    @Override // ax.v2.C3255D
    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }

    @Override // ax.v2.C3255D
    @SuppressLint({"NewApi"})
    public void i(View view, Matrix matrix) {
        if (g) {
            try {
                a.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }
}
