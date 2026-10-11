package ax.A2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
final class f implements c {
    public static final f b = new f();

    private f() {
    }

    @Override // ax.A2.c
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public Rect a(Activity activity) {
        DisplayCutout d;
        int e;
        ax.Gb.l.f(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (b.a.a(activity)) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                ax.Gb.l.d(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                ax.Gb.l.d(invoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke2);
            }
        } catch (Exception e2) {
            if (!(e2 instanceof NoSuchFieldException ? true : e2 instanceof NoSuchMethodException ? true : e2 instanceof IllegalAccessException ? true : e2 instanceof InvocationTargetException)) {
                throw e2;
            }
            Log.w(c.a.b(), e2);
            k.f(activity, rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        b bVar = b.a;
        if (!bVar.a(activity)) {
            e = k.e(activity);
            int i = rect.bottom;
            if (i + e == point.y) {
                rect.bottom = i + e;
            } else {
                int i2 = rect.right;
                if (i2 + e == point.x) {
                    rect.right = i2 + e;
                } else if (rect.left == e) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !bVar.a(activity)) {
            ax.Gb.l.c(defaultDisplay);
            d = k.d(defaultDisplay);
            if (d != null) {
                int i3 = rect.left;
                t tVar = t.a;
                if (i3 == tVar.b(d)) {
                    rect.left = 0;
                }
                if (point.x - rect.right == tVar.c(d)) {
                    rect.right += tVar.c(d);
                }
                if (rect.top == tVar.d(d)) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == tVar.a(d)) {
                    rect.bottom += tVar.a(d);
                }
            }
        }
        return rect;
    }
}
