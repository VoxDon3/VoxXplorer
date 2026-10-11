/*
 * Decompiled with CFR 0.152.
 */
package ax.v2;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import ax.v2.D;
import ax.v2.H;
import ax.v2.J;
import ax.v2.L;
import ax.v2.M;

class A {
    private static final D a;
    static final Property<View, Float> b;
    static final Property<View, Rect> c;

    static {
        int n8 = Build.VERSION.SDK_INT;
        a = n8 >= 29 ? new M() : (n8 >= 23 ? new L() : (n8 >= 22 ? new J() : new H()));
        b = new Property<View, Float>(Float.class, "translationAlpha"){

            public Float a(View view) {
                return Float.valueOf(A.b(view));
            }

            public void b(View view, Float f8) {
                A.e(view, f8.floatValue());
            }
        };
        c = new Property<View, Rect>(Rect.class, "clipBounds"){

            public Rect a(View view) {
                return view.getClipBounds();
            }

            public void b(View view, Rect rect) {
                view.setClipBounds(rect);
            }
        };
    }

    static void a(View view) {
        a.a(view);
    }

    static float b(View view) {
        return a.c(view);
    }

    static void c(View view) {
        a.d(view);
    }

    static void d(View view, int n8, int n9, int n10, int n11) {
        a.e(view, n8, n9, n10, n11);
    }

    static void e(View view, float f8) {
        a.f(view, f8);
    }

    static void f(View view, int n8) {
        a.g(view, n8);
    }

    static void g(View view, Matrix matrix) {
        a.h(view, matrix);
    }

    static void h(View view, Matrix matrix) {
        a.i(view, matrix);
    }
}

