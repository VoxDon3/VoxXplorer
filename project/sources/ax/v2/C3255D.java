package ax.v2;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ax.v2.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3255D {
    private static boolean a = true;
    private static Method b;
    private static boolean c;
    private static Field d;
    private static boolean e;

    /* renamed from: ax.v2.D$a */
    static class a {
        static float a(View view) {
            float transitionAlpha;
            transitionAlpha = view.getTransitionAlpha();
            return transitionAlpha;
        }

        static void b(View view, float f) {
            view.setTransitionAlpha(f);
        }
    }

    C3255D() {
    }

    @SuppressLint({"PrivateApi", "SoonBlockedPrivateApi"})
    private void b() {
        if (c) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            b = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e2) {
            Log.i("ViewUtilsApi19", "Failed to retrieve setFrame method", e2);
        }
        c = true;
    }

    @SuppressLint({"NewApi"})
    public float c(View view) {
        if (a) {
            try {
                return a.a(view);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"BanUncheckedReflection"})
    public void e(View view, int i, int i2, int i3, int i4) {
        b();
        Method method = b;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void f(View view, float f) {
        if (a) {
            try {
                a.b(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        view.setAlpha(f);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public void g(View view, int i) {
        if (!e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            e = true;
        }
        Field field = d;
        if (field != null) {
            try {
                d.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void h(View view, Matrix matrix) {
        throw null;
    }

    public void i(View view, Matrix matrix) {
        throw null;
    }

    public void a(View view) {
    }

    public void d(View view) {
    }
}
