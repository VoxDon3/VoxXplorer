/*
 * Decompiled with CFR 0.152.
 */
package ax.F6;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.L;
import ax.K6.b;
import ax.k6.c;
import ax.k6.m;
import ax.m.a;

public final class w {
    private static final int[] a = new int[]{ax.m.a.z};
    private static final int[] b = new int[]{c.h};

    public static void a(Context context) {
        w.e(context, a, "Theme.AppCompat");
    }

    private static void b(Context context, AttributeSet attributeSet, int n8, int n9) {
        attributeSet = context.obtainStyledAttributes(attributeSet, m.m7, n8, n9);
        boolean bl = attributeSet.getBoolean(m.o7, false);
        attributeSet.recycle();
        if (bl) {
            attributeSet = new TypedValue();
            if (!context.getTheme().resolveAttribute(c.p, (TypedValue)attributeSet, true) || attributeSet.type == 18 && attributeSet.data == 0) {
                w.c(context);
            }
        }
        w.a(context);
    }

    public static void c(Context context) {
        w.e(context, b, "Theme.MaterialComponents");
    }

    private static void d(Context context, AttributeSet attributeSet, int[] nArray, int n8, int n9, int ... nArray2) {
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, m.m7, n8, n9);
        int n10 = m.p7;
        boolean bl = false;
        if (!typedArray.getBoolean(n10, false)) {
            typedArray.recycle();
            return;
        }
        if (nArray2 != null && nArray2.length != 0) {
            bl = w.f(context, attributeSet, nArray, n8, n9, nArray2);
        } else if (typedArray.getResourceId(m.n7, -1) != -1) {
            bl = true;
        }
        typedArray.recycle();
        if (bl) {
            return;
        }
        throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    private static void e(Context object, int[] nArray, String string) {
        if (w.h((Context)object, nArray)) {
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("The style on this component requires your app theme to be ");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(" (or a descendant).");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    private static boolean f(Context context, AttributeSet attributeSet, int[] nArray, int n8, int n9, int ... nArray2) {
        context = context.obtainStyledAttributes(attributeSet, nArray, n8, n9);
        n9 = nArray2.length;
        for (n8 = 0; n8 < n9; ++n8) {
            if (context.getResourceId(nArray2[n8], -1) != -1) continue;
            context.recycle();
            return false;
        }
        context.recycle();
        return true;
    }

    public static boolean g(Context context) {
        return ax.K6.b.b(context, c.o, false);
    }

    private static boolean h(Context context, int[] nArray) {
        context = context.obtainStyledAttributes(nArray);
        for (int i8 = 0; i8 < nArray.length; ++i8) {
            if (context.hasValue(i8)) continue;
            context.recycle();
            return false;
        }
        context.recycle();
        return true;
    }

    public static TypedArray i(Context context, AttributeSet attributeSet, int[] nArray, int n8, int n9, int ... nArray2) {
        w.b(context, attributeSet, n8, n9);
        w.d(context, attributeSet, nArray, n8, n9, nArray2);
        return context.obtainStyledAttributes(attributeSet, nArray, n8, n9);
    }

    public static L j(Context context, AttributeSet attributeSet, int[] nArray, int n8, int n9, int ... nArray2) {
        w.b(context, attributeSet, n8, n9);
        w.d(context, attributeSet, nArray, n8, n9, nArray2);
        return L.v(context, attributeSet, nArray, n8, n9);
    }
}

