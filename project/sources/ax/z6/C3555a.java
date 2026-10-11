package ax.z6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import ax.K6.b;

/* renamed from: ax.z6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3555a {
    public static int a(int i, int i2) {
        return ax.T.a.k(i, (Color.alpha(i) * i2) / 255);
    }

    public static int b(Context context, int i, int i2) {
        Integer f = f(context, i);
        return f != null ? f.intValue() : i2;
    }

    public static int c(Context context, int i, String str) {
        return m(context, b.g(context, i, str));
    }

    public static int d(View view, int i) {
        return m(view.getContext(), b.h(view, i));
    }

    public static int e(View view, int i, int i2) {
        return b(view.getContext(), i, i2);
    }

    public static Integer f(Context context, int i) {
        TypedValue a = b.a(context, i);
        if (a != null) {
            return Integer.valueOf(m(context, a));
        }
        return null;
    }

    public static ColorStateList g(Context context, int i, ColorStateList colorStateList) {
        TypedValue a = b.a(context, i);
        ColorStateList n = a != null ? n(context, a) : null;
        return n == null ? colorStateList : n;
    }

    public static ColorStateList h(Context context, int i) {
        TypedValue a = b.a(context, i);
        if (a == null) {
            return null;
        }
        int i2 = a.resourceId;
        if (i2 != 0) {
            return ax.Q.b.d(context, i2);
        }
        int i3 = a.data;
        if (i3 != 0) {
            return ColorStateList.valueOf(i3);
        }
        return null;
    }

    public static boolean i(int i) {
        return i != 0 && ax.T.a.d(i) > 0.5d;
    }

    public static int j(int i, int i2) {
        return ax.T.a.g(i2, i);
    }

    public static int k(int i, int i2, float f) {
        return j(i, ax.T.a.k(i2, Math.round(Color.alpha(i2) * f)));
    }

    public static int l(View view, int i, int i2, float f) {
        return k(d(view, i), d(view, i2), f);
    }

    private static int m(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? ax.Q.b.c(context, i) : typedValue.data;
    }

    private static ColorStateList n(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? ax.Q.b.d(context, i) : ColorStateList.valueOf(typedValue.data);
    }
}
