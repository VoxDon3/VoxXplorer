/*
 * Decompiled with CFR 0.152.
 */
package ax.h0;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class h {
    private static Method a;
    private static boolean b;
    private static Field c;
    private static boolean d;

    public static void a(PopupWindow popupWindow, boolean bl) {
        Field field;
        if (Build.VERSION.SDK_INT >= 23) {
            ax.h0.h$a.c(popupWindow, bl);
            return;
        }
        if (!d) {
            try {
                c = field = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                ((AccessibleObject)field).setAccessible(true);
            }
            catch (NoSuchFieldException noSuchFieldException) {
                Log.i((String)"PopupWindowCompatApi21", (String)"Could not fetch mOverlapAnchor field from PopupWindow", (Throwable)noSuchFieldException);
            }
            d = true;
        }
        if ((field = c) != null) {
            try {
                field.set(popupWindow, bl);
            }
            catch (IllegalAccessException illegalAccessException) {
                Log.i((String)"PopupWindowCompatApi21", (String)"Could not set overlap anchor field in PopupWindow", (Throwable)illegalAccessException);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(PopupWindow popupWindow, int n8) {
        Method method;
        if (Build.VERSION.SDK_INT >= 23) {
            ax.h0.h$a.d(popupWindow, n8);
            return;
        }
        if (!b) {
            try {
                a = method = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                ((AccessibleObject)method).setAccessible(true);
            }
            catch (Exception exception) {}
            b = true;
        }
        if ((method = a) == null) return;
        try {
            method.invoke(popupWindow, n8);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void c(PopupWindow popupWindow, View view, int n8, int n9, int n10) {
        popupWindow.showAsDropDown(view, n8, n9, n10);
    }

    static class a {
        static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        static void c(PopupWindow popupWindow, boolean bl) {
            popupWindow.setOverlapAnchor(bl);
        }

        static void d(PopupWindow popupWindow, int n8) {
            popupWindow.setWindowLayoutType(n8);
        }
    }
}

