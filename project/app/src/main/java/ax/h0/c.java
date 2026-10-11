/*
 * Decompiled with CFR 0.152.
 */
package ax.h0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public final class c {
    private static Field a;
    private static boolean b;

    public static Drawable a(CompoundButton compoundButton) {
        Field field;
        if (Build.VERSION.SDK_INT >= 23) {
            return ax.h0.c$b.a(compoundButton);
        }
        if (!b) {
            try {
                a = field = CompoundButton.class.getDeclaredField("mButtonDrawable");
                ((AccessibleObject)field).setAccessible(true);
            }
            catch (NoSuchFieldException noSuchFieldException) {
                Log.i((String)"CompoundButtonCompat", (String)"Failed to retrieve mButtonDrawable field", (Throwable)noSuchFieldException);
            }
            b = true;
        }
        if ((field = a) != null) {
            try {
                compoundButton = (Drawable)field.get(compoundButton);
                return compoundButton;
            }
            catch (IllegalAccessException illegalAccessException) {
                Log.i((String)"CompoundButtonCompat", (String)"Failed to get button drawable via reflection", (Throwable)illegalAccessException);
                a = null;
            }
        }
        return null;
    }

    public static ColorStateList b(CompoundButton compoundButton) {
        return ax.h0.c$a.a(compoundButton);
    }

    public static PorterDuff.Mode c(CompoundButton compoundButton) {
        return ax.h0.c$a.b(compoundButton);
    }

    public static void d(CompoundButton compoundButton, ColorStateList colorStateList) {
        ax.h0.c$a.c(compoundButton, colorStateList);
    }

    public static void e(CompoundButton compoundButton, PorterDuff.Mode mode) {
        ax.h0.c$a.d(compoundButton, mode);
    }

    static class a {
        static ColorStateList a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        static PorterDuff.Mode b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        static void c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        static void d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    static class b {
        static Drawable a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }
}

