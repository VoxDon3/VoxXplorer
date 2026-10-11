/*
 * Decompiled with CFR 0.152.
 */
package ax.v2;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import ax.v2.B;
import ax.v2.C;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class D {
    private static boolean a = true;
    private static Method b;
    private static boolean c;
    private static Field d;
    private static boolean e;

    D() {
    }

    @SuppressLint(value={"PrivateApi", "SoonBlockedPrivateApi"})
    private void b() {
        if (!c) {
            try {
                GenericDeclaration genericDeclaration = Integer.TYPE;
                genericDeclaration = View.class.getDeclaredMethod("setFrame", new Class[]{genericDeclaration, genericDeclaration, genericDeclaration, genericDeclaration});
                b = genericDeclaration;
                ((AccessibleObject)((Object)genericDeclaration)).setAccessible(true);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                Log.i((String)"ViewUtilsApi19", (String)"Failed to retrieve setFrame method", (Throwable)noSuchMethodException);
            }
            c = true;
        }
    }

    public void a(View view) {
    }

    @SuppressLint(value={"NewApi"})
    public float c(View view) {
        if (a) {
            try {
                float f8 = ax.v2.D$a.a(view);
                return f8;
            }
            catch (NoSuchMethodError noSuchMethodError) {
                a = false;
            }
        }
        return view.getAlpha();
    }

    public void d(View view) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SuppressLint(value={"BanUncheckedReflection"})
    public void e(View view, int n8, int n9, int n10, int n11) {
        this.b();
        Method method = b;
        if (method == null) return;
        try {
            method.invoke(view, n8, n9, n10, n11);
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new RuntimeException(invocationTargetException.getCause());
        }
        catch (IllegalAccessException illegalAccessException) {
            return;
        }
    }

    @SuppressLint(value={"NewApi"})
    public void f(View view, float f8) {
        if (a) {
            try {
                ax.v2.D$a.b(view, f8);
                return;
            }
            catch (NoSuchMethodError noSuchMethodError) {
                a = false;
            }
        }
        view.setAlpha(f8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SuppressLint(value={"SoonBlockedPrivateApi"})
    public void g(View view, int n8) {
        Field field;
        if (!e) {
            try {
                d = field = View.class.getDeclaredField("mViewFlags");
                ((AccessibleObject)field).setAccessible(true);
            }
            catch (NoSuchFieldException noSuchFieldException) {
                Log.i((String)"ViewUtilsApi19", (String)"fetchViewFlagsField: ");
            }
            e = true;
        }
        if ((field = d) == null) return;
        try {
            int n9 = field.getInt(view);
            d.setInt(view, n8 | n9 & 0xFFFFFFF3);
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            return;
        }
    }

    public void h(View view, Matrix matrix) {
        throw null;
    }

    public void i(View view, Matrix matrix) {
        throw null;
    }

    static class a {
        static float a(View view) {
            return C.a(view);
        }

        static void b(View view, float f8) {
            B.a(view, f8);
        }
    }
}

