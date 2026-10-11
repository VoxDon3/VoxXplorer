/*
 * Decompiled with CFR 0.152.
 */
package ax.v2;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import ax.v2.D;
import ax.v2.E;
import ax.v2.F;
import ax.v2.G;

class H
extends D {
    private static boolean f = true;
    private static boolean g = true;

    H() {
    }

    @Override
    @SuppressLint(value={"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f) {
            try {
                a.b(view, matrix);
                return;
            }
            catch (NoSuchMethodError noSuchMethodError) {
                f = false;
            }
        }
    }

    @Override
    @SuppressLint(value={"NewApi"})
    public void i(View view, Matrix matrix) {
        if (g) {
            try {
                a.c(view, matrix);
                return;
            }
            catch (NoSuchMethodError noSuchMethodError) {
                g = false;
            }
        }
    }

    static class a {
        static void a(View view, Matrix matrix) {
            E.a(view, matrix);
        }

        static void b(View view, Matrix matrix) {
            F.a(view, matrix);
        }

        static void c(View view, Matrix matrix) {
            G.a(view, matrix);
        }
    }
}

