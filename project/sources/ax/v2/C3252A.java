package ax.v2;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* renamed from: ax.v2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3252A {
    private static final C3255D a;
    static final Property<View, Float> b;
    static final Property<View, Rect> c;

    /* renamed from: ax.v2.A$a */
    class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(C3252A.b(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            C3252A.e(view, f.floatValue());
        }
    }

    /* renamed from: ax.v2.A$b */
    class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new M();
        } else if (i >= 23) {
            a = new L();
        } else if (i >= 22) {
            a = new J();
        } else {
            a = new H();
        }
        b = new a(Float.class, "translationAlpha");
        c = new b(Rect.class, "clipBounds");
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

    static void d(View view, int i, int i2, int i3, int i4) {
        a.e(view, i, i2, i3, i4);
    }

    static void e(View view, float f) {
        a.f(view, f);
    }

    static void f(View view, int i) {
        a.g(view, i);
    }

    static void g(View view, Matrix matrix) {
        a.h(view, matrix);
    }

    static void h(View view, Matrix matrix) {
        a.i(view, matrix);
    }
}
