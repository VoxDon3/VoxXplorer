/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class O {
    private static boolean a;
    private static Method b;
    static final boolean c;

    static {
        boolean bl = Build.VERSION.SDK_INT >= 27;
        c = bl;
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method;
        if (Build.VERSION.SDK_INT >= 29) {
            androidx.appcompat.widget.O$a.a(view, rect, rect2);
            return;
        }
        if (!a) {
            a = true;
            try {
                b = method = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                if (!method.isAccessible()) {
                    ((AccessibleObject)b).setAccessible(true);
                }
            }
            catch (NoSuchMethodException noSuchMethodException) {
                Log.d((String)"ViewUtils", (String)"Could not find method computeFitSystemWindows. Oh well.");
            }
        }
        if ((method = b) != null) {
            try {
                method.invoke(view, rect, rect2);
            }
            catch (Exception exception) {
                Log.d((String)"ViewUtils", (String)"Could not invoke computeFitSystemWindows", (Throwable)exception);
            }
        }
    }

    public static boolean b(View view) {
        return view.getLayoutDirection() == 1;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SuppressLint(value={"BanUncheckedReflection"})
    public static void c(View view) {
        InvocationTargetException invocationTargetException22222;
        block5: {
            IllegalAccessException illegalAccessException22222;
            Method method;
            block4: {
                try {
                    method = view.getClass().getMethod("makeOptionalFitsSystemWindows", null);
                    if (method.isAccessible()) break block4;
                    ((AccessibleObject)method).setAccessible(true);
                }
                catch (IllegalAccessException illegalAccessException22222) {
                }
                catch (InvocationTargetException invocationTargetException22222) {
                    break block5;
                }
            }
            method.invoke(view, null);
            return;
            catch (NoSuchMethodException noSuchMethodException) {
                Log.d((String)"ViewUtils", (String)"Could not find method makeOptionalFitsSystemWindows. Oh well...");
                return;
            }
            Log.d((String)"ViewUtils", (String)"Could not invoke makeOptionalFitsSystemWindows", (Throwable)illegalAccessException22222);
            return;
        }
        Log.d((String)"ViewUtils", (String)"Could not invoke makeOptionalFitsSystemWindows", (Throwable)invocationTargetException22222);
    }

    static class a {
        static void a(View view, Rect rect, Rect rect2) {
            view = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of((Rect)rect)).build(), rect2).getSystemWindowInsets();
            rect.set(view.left, view.top, view.right, view.bottom);
        }
    }
}

