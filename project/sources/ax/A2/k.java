package ax.A2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class k {
    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"BanUncheckedReflection"})
    public static final DisplayCutout d(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, newInstance);
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (i.a(obj)) {
                return j.a(obj);
            }
        } catch (Exception e) {
            if (!(e instanceof ClassNotFoundException ? true : e instanceof NoSuchMethodException ? true : e instanceof NoSuchFieldException ? true : e instanceof IllegalAccessException ? true : e instanceof InvocationTargetException ? true : e instanceof InstantiationException)) {
                throw e;
            }
            Log.w(c.a.b(), e);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }
}
