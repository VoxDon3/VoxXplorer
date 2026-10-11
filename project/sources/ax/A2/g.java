package ax.A2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
final class g implements c {
    public static final g b = new g();

    private g() {
    }

    @Override // ax.A2.c
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public Rect a(Activity activity) {
        ax.Gb.l.f(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            ax.Gb.l.d(invoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) invoke);
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException ? true : e instanceof NoSuchMethodException ? true : e instanceof IllegalAccessException ? true : e instanceof InvocationTargetException)) {
                throw e;
            }
            Log.w(c.a.b(), e);
            return f.b.a(activity);
        }
    }
}
