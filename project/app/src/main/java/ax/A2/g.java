/*
 * Decompiled with CFR 0.152.
 */
package ax.A2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.Log;
import ax.A2.c;
import ax.A2.f;
import ax.Gb.l;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

final class g
implements c {
    public static final g b = new g();

    private g() {
    }

    @Override
    @SuppressLint(value={"BanUncheckedReflection", "BlockedPrivateApi"})
    public Rect a(Activity activity) {
        l.f(activity, "activity");
        Object object = activity.getResources().getConfiguration();
        boolean bl = true;
        try {
            Field field = Configuration.class.getDeclaredField("windowConfiguration");
            ((AccessibleObject)field).setAccessible(true);
            object = field.get(object);
            object = object.getClass().getDeclaredMethod("getBounds", null).invoke(object, null);
            l.d(object, "null cannot be cast to non-null type android.graphics.Rect");
            object = new Rect((Rect)object);
            return object;
        }
        catch (Exception exception) {
            boolean bl2 = exception instanceof NoSuchFieldException ? true : exception instanceof NoSuchMethodException;
            bl2 = bl2 ? true : exception instanceof IllegalAccessException;
            bl2 = bl2 ? bl : exception instanceof InvocationTargetException;
            if (bl2) {
                Log.w((String)c.a.b(), (Throwable)exception);
                return f.b.a(activity);
            }
            throw exception;
        }
    }
}

