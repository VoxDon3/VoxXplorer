/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.widget.L;
import ax.T.a;
import ax.m.j;

public class H {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal();
    static final int[] b = new int[]{-16842910};
    static final int[] c = new int[]{16842908};
    static final int[] d = new int[]{16843518};
    static final int[] e = new int[]{16842919};
    static final int[] f = new int[]{0x10100A0};
    static final int[] g = new int[]{0x10100A1};
    static final int[] h = new int[]{-16842919, -16842908};
    static final int[] i = new int[0];
    private static final int[] j = new int[1];

    public static void a(View view, Context context) {
        Throwable throwable2;
        block3: {
            block2: {
                context = context.obtainStyledAttributes(ax.m.j.y0);
                try {
                    if (context.hasValue(ax.m.j.D0)) break block2;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("View ");
                    stringBuilder.append(view.getClass());
                    stringBuilder.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
                    Log.e((String)"ThemeUtils", (String)stringBuilder.toString());
                }
                catch (Throwable throwable2) {
                    break block3;
                }
            }
            context.recycle();
            return;
        }
        context.recycle();
        throw throwable2;
    }

    public static int b(Context context, int n8) {
        ColorStateList colorStateList = H.e(context, n8);
        if (colorStateList != null && colorStateList.isStateful()) {
            return colorStateList.getColorForState(b, colorStateList.getDefaultColor());
        }
        colorStateList = H.f();
        context.getTheme().resolveAttribute(0x1010033, (TypedValue)colorStateList, true);
        return H.d(context, n8, colorStateList.getFloat());
    }

    public static int c(Context context, int n8) {
        Object object = j;
        object[0] = n8;
        object = L.u(context, null, (int[])object);
        try {
            n8 = ((L)object).b(0, 0);
            return n8;
        }
        finally {
            ((L)object).x();
        }
    }

    static int d(Context context, int n8, float f8) {
        n8 = H.c(context, n8);
        return ax.T.a.k(n8, Math.round((float)Color.alpha((int)n8) * f8));
    }

    public static ColorStateList e(Context object, int n8) {
        Object object2 = j;
        object2[0] = n8;
        object = L.u((Context)object, null, object2);
        try {
            object2 = ((L)object).c(0);
            return object2;
        }
        finally {
            ((L)object).x();
        }
    }

    private static TypedValue f() {
        TypedValue typedValue;
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue2 = typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
        }
        return typedValue2;
    }
}

