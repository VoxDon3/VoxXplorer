/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import ax.b0.h;
import ax.c0.f0;
import ax.c0.g0;
import java.lang.reflect.Method;

public final class h0 {
    private static Method a;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", null);
            }
            catch (Exception exception) {
                Log.i((String)"ViewConfigCompat", (String)"Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    private static int a(Resources resources, int n8, h<Integer> h8, int n9) {
        if (n8 != -1) {
            if (n8 != 0 && (n8 = resources.getDimensionPixelSize(n8)) >= 0) {
                return n8;
            }
            return n9;
        }
        return h8.get();
    }

    private static float b(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = a) != null) {
            int n8;
            try {
                n8 = (Integer)method.invoke(viewConfiguration, null);
            }
            catch (Exception exception) {
                Log.i((String)"ViewConfigCompat", (String)"Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
            return n8;
        }
        viewConfiguration = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, (TypedValue)viewConfiguration, true)) {
            return viewConfiguration.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    private static int c(Resources resources, String string, String string2) {
        return resources.getIdentifier(string, string2, "android");
    }

    private static int d(Resources resources, int n8, int n9) {
        if (n8 == 0x400000 && n9 == 26) {
            return h0.c(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    private static int e(Resources resources, int n8, int n9) {
        if (n8 == 0x400000 && n9 == 26) {
            return h0.c(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static float f(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return ax.c0.h0$a.a(viewConfiguration);
        }
        return h0.b(viewConfiguration, context);
    }

    public static int g(ViewConfiguration viewConfiguration) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(viewConfiguration);
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static int h(Context context, ViewConfiguration viewConfiguration, int n8, int n9, int n10) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a(viewConfiguration, n8, n9, n10);
        }
        if (!h0.k(n8, n9, n10)) {
            return Integer.MIN_VALUE;
        }
        context = context.getResources();
        n8 = h0.d((Resources)context, n10, n9);
        j.Objects.requireNonNull((Object)viewConfiguration);
        return h0.a((Resources)context, n8, new f0(viewConfiguration), Integer.MIN_VALUE);
    }

    public static int i(Context context, ViewConfiguration viewConfiguration, int n8, int n9, int n10) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.b(viewConfiguration, n8, n9, n10);
        }
        if (!h0.k(n8, n9, n10)) {
            return Integer.MAX_VALUE;
        }
        context = context.getResources();
        n8 = h0.e((Resources)context, n10, n9);
        j.Objects.requireNonNull((Object)viewConfiguration);
        return h0.a((Resources)context, n8, new g0(viewConfiguration), Integer.MAX_VALUE);
    }

    public static float j(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return ax.c0.h0$a.b(viewConfiguration);
        }
        return h0.b(viewConfiguration, context);
    }

    private static boolean k(int n8, int n9, int n10) {
        InputDevice inputDevice = InputDevice.getDevice((int)n8);
        return inputDevice != null && inputDevice.getMotionRange(n9, n10) != null;
    }

    public static boolean l(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.b(viewConfiguration);
        }
        viewConfiguration = context.getResources();
        int n8 = h0.c((Resources)viewConfiguration, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return n8 != 0 && viewConfiguration.getBoolean(n8);
    }

    static class a {
        static float a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        static float b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    static class b {
        static int a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        static boolean b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    static class c {
        static int a(ViewConfiguration viewConfiguration, int n8, int n9, int n10) {
            return viewConfiguration.getScaledMaximumFlingVelocity(n8, n9, n10);
        }

        static int b(ViewConfiguration viewConfiguration, int n8, int n9, int n10) {
            return viewConfiguration.getScaledMinimumFlingVelocity(n8, n9, n10);
        }
    }
}

