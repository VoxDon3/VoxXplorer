/*
 * Decompiled with CFR 0.152.
 */
package ax.z6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import ax.K6.b;

public class a {
    public static int a(int n8, int n9) {
        return ax.T.a.k(n8, Color.alpha((int)n8) * n9 / 255);
    }

    public static int b(Context object, int n8, int n9) {
        if ((object = a.f((Context)object, n8)) != null) {
            return (Integer)object;
        }
        return n9;
    }

    public static int c(Context context, int n8, String string) {
        return a.m(context, b.g(context, n8, string));
    }

    public static int d(View view, int n8) {
        return a.m(view.getContext(), b.h(view, n8));
    }

    public static int e(View view, int n8, int n9) {
        return a.b(view.getContext(), n8, n9);
    }

    public static Integer f(Context context, int n8) {
        TypedValue typedValue = b.a(context, n8);
        if (typedValue != null) {
            return a.m(context, typedValue);
        }
        return null;
    }

    public static ColorStateList g(Context object, int n8, ColorStateList colorStateList) {
        TypedValue typedValue = b.a(object, n8);
        if ((object = typedValue != null ? a.n(object, typedValue) : null) == null) {
            return colorStateList;
        }
        return object;
    }

    public static ColorStateList h(Context context, int n8) {
        TypedValue typedValue = b.a(context, n8);
        if (typedValue == null) {
            return null;
        }
        n8 = typedValue.resourceId;
        if (n8 != 0) {
            return ax.Q.b.d(context, n8);
        }
        n8 = typedValue.data;
        if (n8 != 0) {
            return ColorStateList.valueOf((int)n8);
        }
        return null;
    }

    public static boolean i(int n8) {
        return n8 != 0 && ax.T.a.d(n8) > 0.5;
    }

    public static int j(int n8, int n9) {
        return ax.T.a.g(n9, n8);
    }

    public static int k(int n8, int n9, float f8) {
        return a.j(n8, ax.T.a.k(n9, Math.round((float)Color.alpha((int)n9) * f8)));
    }

    public static int l(View view, int n8, int n9, float f8) {
        return a.k(a.d(view, n8), a.d(view, n9), f8);
    }

    private static int m(Context context, TypedValue typedValue) {
        int n8 = typedValue.resourceId;
        if (n8 != 0) {
            return ax.Q.b.c(context, n8);
        }
        return typedValue.data;
    }

    private static ColorStateList n(Context context, TypedValue typedValue) {
        int n8 = typedValue.resourceId;
        if (n8 != 0) {
            return ax.Q.b.d(context, n8);
        }
        return ColorStateList.valueOf((int)typedValue.data);
    }
}

