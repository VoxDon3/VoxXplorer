/*
 * Decompiled with CFR 0.152.
 */
package ax.A2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import ax.A2.b;
import ax.A2.c;
import ax.A2.k;
import ax.A2.t;
import ax.Gb.l;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

final class f
implements c {
    public static final f b = new f();

    private f() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @SuppressLint(value={"BanUncheckedReflection", "BlockedPrivateApi"})
    public Rect a(Activity object) {
        int n8;
        Object object2;
        Object object3;
        Rect rect;
        block16: {
            Exception exception2;
            boolean bl;
            block17: {
                block15: {
                    l.f(object, "activity");
                    rect = new Rect();
                    object3 = object.getResources().getConfiguration();
                    bl = true;
                    try {
                        object2 = Configuration.class.getDeclaredField("windowConfiguration");
                        ((AccessibleObject)object2).setAccessible(true);
                        object3 = ((Field)object2).get(object3);
                        boolean bl2 = ax.A2.b.a.a((Activity)object);
                        if (!bl2) break block15;
                        object3 = object3.getClass().getDeclaredMethod("getBounds", null).invoke(object3, null);
                        l.d(object3, "null cannot be cast to non-null type android.graphics.Rect");
                        rect.set((Rect)object3);
                        break block16;
                    }
                    catch (Exception exception2) {
                        break block17;
                    }
                }
                object3 = object3.getClass().getDeclaredMethod("getAppBounds", null).invoke(object3, null);
                l.d(object3, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect)object3);
                break block16;
            }
            boolean bl3 = exception2 instanceof NoSuchFieldException ? true : exception2 instanceof NoSuchMethodException;
            bl3 = bl3 ? true : exception2 instanceof IllegalAccessException;
            bl3 = bl3 ? bl : exception2 instanceof InvocationTargetException;
            if (!bl3) {
                throw exception2;
            }
            Log.w((String)c.a.b(), (Throwable)exception2);
            k.c((Activity)object, rect);
        }
        Display display = object.getWindowManager().getDefaultDisplay();
        object3 = new Point();
        display.getRealSize((Point)object3);
        object2 = ax.A2.b.a;
        if (!((b)object2).a((Activity)object)) {
            int n9 = rect.bottom;
            n8 = k.b((Context)object);
            if (n9 + n8 == ((Point)object3).y) {
                rect.bottom = n9 + n8;
            } else {
                n9 = rect.right;
                if (n9 + n8 == ((Point)object3).x) {
                    rect.right = n9 + n8;
                } else if (rect.left == n8) {
                    rect.left = 0;
                }
            }
        }
        if (!(rect.width() >= ((Point)object3).x && rect.height() >= ((Point)object3).y || ((b)object2).a((Activity)object))) {
            l.c(display);
            object2 = k.a(display);
            if (object2 != null) {
                n8 = rect.left;
                object = t.a;
                if (n8 == ((t)object).b((DisplayCutout)object2)) {
                    rect.left = 0;
                }
                if (((Point)object3).x - rect.right == ((t)object).c((DisplayCutout)object2)) {
                    rect.right += ((t)object).c((DisplayCutout)object2);
                }
                if (rect.top == ((t)object).d((DisplayCutout)object2)) {
                    rect.top = 0;
                }
                if (((Point)object3).y - rect.bottom == ((t)object).a((DisplayCutout)object2)) {
                    rect.bottom += ((t)object).a((DisplayCutout)object2);
                }
            }
        }
        return rect;
    }
}

