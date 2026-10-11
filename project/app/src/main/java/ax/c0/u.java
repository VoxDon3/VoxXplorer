/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import ax.c0.d0;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class u {
    private static boolean a = false;
    private static Method b;
    private static boolean c = false;
    private static Field d;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean a(ActionBar object, KeyEvent keyEvent) {
        Method method;
        if (!a) {
            try {
                b = object.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            }
            catch (NoSuchMethodException noSuchMethodException) {}
            a = true;
        }
        if ((method = b) == null) return false;
        try {
            object = method.invoke(object, keyEvent);
            if (object != null) return (Boolean)object;
            return false;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            return false;
        }
    }

    private static boolean b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Object object = activity.getWindow();
        if (object.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && u.a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (object.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        if (d0.j((View)(object = object.getDecorView()), keyEvent)) {
            return true;
        }
        object = object != null ? object.getKeyDispatcherState() : null;
        return keyEvent.dispatch((KeyEvent.Callback)activity, (KeyEvent.DispatcherState)object, (Object)activity);
    }

    private static boolean c(Dialog dialog, KeyEvent keyEvent) {
        Object object = u.f(dialog);
        if (object != null && object.onKey((DialogInterface)dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        object = dialog.getWindow();
        if (object.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        if (d0.j((View)(object = object.getDecorView()), keyEvent)) {
            return true;
        }
        object = object != null ? object.getKeyDispatcherState() : null;
        return keyEvent.dispatch((KeyEvent.Callback)dialog, (KeyEvent.DispatcherState)object, (Object)dialog);
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        return d0.k(view, keyEvent);
    }

    @SuppressLint(value={"LambdaLast"})
    public static boolean e(a a8, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (a8 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return a8.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            return u.b((Activity)callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return u.c((Dialog)callback, keyEvent);
        }
        return view != null && d0.j(view, keyEvent) || a8.superDispatchKeyEvent(keyEvent);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static DialogInterface.OnKeyListener f(Dialog dialog) {
        Field field;
        if (!c) {
            try {
                d = field = Dialog.class.getDeclaredField("mOnKeyListener");
                ((AccessibleObject)field).setAccessible(true);
            }
            catch (NoSuchFieldException noSuchFieldException) {}
            c = true;
        }
        if ((field = d) == null) return null;
        try {
            return (DialogInterface.OnKeyListener)field.get(dialog);
        }
        catch (IllegalAccessException illegalAccessException) {
            return null;
        }
    }

    public static interface a {
        public boolean superDispatchKeyEvent(KeyEvent var1);
    }
}

