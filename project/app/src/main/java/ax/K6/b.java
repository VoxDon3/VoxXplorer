/*
 * Decompiled with CFR 0.152.
 */
package ax.K6;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import ax.k6.c;
import ax.k6.e;

public class b {
    public static TypedValue a(Context context, int n8) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(n8, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Context context, int n8, boolean bl) {
        if ((context = b.a(context, n8)) != null && context.type == 18) {
            return context.data != 0;
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int c(Context context, int n8, int n9) {
        float f8;
        TypedValue typedValue = b.a(context, n8);
        if (typedValue != null && typedValue.type == 5) {
            f8 = typedValue.getDimension(context.getResources().getDisplayMetrics());
            return (int)f8;
        }
        f8 = context.getResources().getDimension(n9);
        return (int)f8;
    }

    public static int d(Context context, int n8, int n9) {
        if ((context = b.a(context, n8)) != null && context.type == 16) {
            return context.data;
        }
        return n9;
    }

    public static int e(Context context) {
        return b.c(context, c.C, e.o0);
    }

    public static int f(Context context, int n8, String string) {
        return b.g((Context)context, (int)n8, (String)string).data;
    }

    public static TypedValue g(Context context, int n8, String string) {
        TypedValue typedValue = b.a(context, n8);
        if (typedValue != null) {
            return typedValue;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", string, context.getResources().getResourceName(n8)));
    }

    public static TypedValue h(View view, int n8) {
        return b.g(view.getContext(), n8, view.getClass().getCanonicalName());
    }
}

