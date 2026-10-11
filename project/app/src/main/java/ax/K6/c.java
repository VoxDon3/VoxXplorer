/*
 * Decompiled with CFR 0.152.
 */
package ax.K6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.L;
import ax.K6.e;
import ax.o.a;

public class c {
    public static ColorStateList a(Context context, TypedArray typedArray, int n8) {
        int n9;
        if (typedArray.hasValue(n8) && (n9 = typedArray.getResourceId(n8, 0)) != 0 && (context = a.a(context, n9)) != null) {
            return context;
        }
        return typedArray.getColorStateList(n8);
    }

    public static ColorStateList b(Context context, L l8, int n8) {
        int n9;
        if (l8.s(n8) && (n9 = l8.n(n8, 0)) != 0 && (context = a.a(context, n9)) != null) {
            return context;
        }
        return l8.c(n8);
    }

    public static int c(Context context, TypedArray typedArray, int n8, int n9) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(n8, typedValue) && typedValue.type == 2) {
            context = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            n8 = context.getDimensionPixelSize(0, n9);
            context.recycle();
            return n8;
        }
        return typedArray.getDimensionPixelSize(n8, n9);
    }

    public static Drawable d(Context context, TypedArray typedArray, int n8) {
        int n9;
        if (typedArray.hasValue(n8) && (n9 = typedArray.getResourceId(n8, 0)) != 0 && (context = a.b(context, n9)) != null) {
            return context;
        }
        return typedArray.getDrawable(n8);
    }

    public static float e(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    static int f(TypedArray typedArray, int n8, int n9) {
        if (typedArray.hasValue(n8)) {
            return n8;
        }
        return n9;
    }

    public static e g(Context context, TypedArray typedArray, int n8) {
        if (typedArray.hasValue(n8) && (n8 = typedArray.getResourceId(n8, 0)) != 0) {
            return new e(context, n8);
        }
        return null;
    }

    public static boolean h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean i(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}

