/*
 * Decompiled with CFR 0.152.
 */
package ax.A2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import ax.A2.c;
import ax.A2.i;
import ax.A2.j;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class k {
    public static final /* synthetic */ DisplayCutout a(Display display) {
        return k.d(display);
    }

    public static final /* synthetic */ int b(Context context) {
        return k.e(context);
    }

    public static final /* synthetic */ void c(Activity activity, Rect rect) {
        k.f(activity, rect);
    }

    @SuppressLint(value={"BanUncheckedReflection"})
    private static final DisplayCutout d(Display object) {
        Exception exception2;
        block3: {
            boolean bl = true;
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                ((AccessibleObject)constructor).setAccessible(true);
                constructor = constructor.newInstance(null);
                Method method = object.getClass().getDeclaredMethod("getDisplayInfo", constructor.getClass());
                ((AccessibleObject)method).setAccessible(true);
                method.invoke(object, constructor);
                object = constructor.getClass().getDeclaredField("displayCutout");
                ((AccessibleObject)object).setAccessible(true);
                object = ((Field)object).get(constructor);
                if (i.a(object)) {
                    object = j.a(object);
                    return object;
                }
            }
            catch (Exception exception2) {
                boolean bl2 = exception2 instanceof ClassNotFoundException ? true : exception2 instanceof NoSuchMethodException;
                bl2 = bl2 ? true : exception2 instanceof NoSuchFieldException;
                bl2 = bl2 ? true : exception2 instanceof IllegalAccessException;
                bl2 = bl2 ? true : exception2 instanceof InvocationTargetException;
                bl2 = bl2 ? bl : exception2 instanceof InstantiationException;
                if (!bl2) break block3;
                Log.w((String)c.a.b(), (Throwable)exception2);
            }
            return null;
        }
        throw exception2;
    }

    private static final int e(Context context) {
        int n8 = (context = context.getResources()).getIdentifier("navigation_bar_height", "dimen", "android");
        if (n8 > 0) {
            return context.getDimensionPixelSize(n8);
        }
        return 0;
    }

    private static final void f(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }
}

