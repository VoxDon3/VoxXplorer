package ax.K6;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import ax.k6.C2402c;
import ax.k6.C2404e;

/* loaded from: classes3.dex */
public class b {
    public static TypedValue a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Context context, int i, boolean z) {
        TypedValue a = a(context, i);
        return (a == null || a.type != 18) ? z : a.data != 0;
    }

    public static int c(Context context, int i, int i2) {
        TypedValue a = a(context, i);
        return (int) ((a == null || a.type != 5) ? context.getResources().getDimension(i2) : a.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static int d(Context context, int i, int i2) {
        TypedValue a = a(context, i);
        return (a == null || a.type != 16) ? i2 : a.data;
    }

    public static int e(Context context) {
        return c(context, C2402c.C, C2404e.o0);
    }

    public static int f(Context context, int i, String str) {
        return g(context, i, str).data;
    }

    public static TypedValue g(Context context, int i, String str) {
        TypedValue a = a(context, i);
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static TypedValue h(View view, int i) {
        return g(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
