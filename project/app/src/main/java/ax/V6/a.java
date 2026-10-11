/*
 * Decompiled with CFR 0.152.
 */
package ax.V6;

import android.content.Context;
import android.util.AttributeSet;
import ax.s.c;

public class a {
    private static final int[] a = new int[]{0x1010000, ax.m.a.P};
    private static final int[] b = new int[]{ax.k6.c.B};

    private static int a(Context context, AttributeSet attributeSet) {
        context = context.obtainStyledAttributes(attributeSet, a);
        int n8 = context.getResourceId(0, 0);
        int n9 = context.getResourceId(1, 0);
        context.recycle();
        if (n8 != 0) {
            return n8;
        }
        return n9;
    }

    private static int[] b(Context context, AttributeSet attributeSet, int[] nArray, int n8, int n9) {
        int[] nArray2 = new int[nArray.length];
        if (nArray.length > 0) {
            context = context.obtainStyledAttributes(attributeSet, nArray, n8, n9);
            for (n8 = 0; n8 < nArray.length; ++n8) {
                nArray2[n8] = context.getResourceId(n8, 0);
            }
            context.recycle();
        }
        return nArray2;
    }

    private static int c(Context context, AttributeSet attributeSet, int n8, int n9) {
        return ax.V6.a.b(context, attributeSet, b, n8, n9)[0];
    }

    public static Context d(Context context, AttributeSet attributeSet, int n8, int n9) {
        return ax.V6.a.e(context, attributeSet, n8, n9, new int[0]);
    }

    public static Context e(Context context, AttributeSet attributeSet, int n8, int n9, int[] nArray) {
        int n10 = ax.V6.a.c(context, attributeSet, n8, n9);
        boolean bl = context instanceof c;
        int n11 = 0;
        int n12 = bl && ((c)context).c() == n10 ? 1 : 0;
        if (n10 != 0 && n12 == 0) {
            c c8 = new c(context, n10);
            nArray = ax.V6.a.b(context, attributeSet, nArray, n8, n9);
            n9 = nArray.length;
            for (n8 = n11; n8 < n9; ++n8) {
                n12 = nArray[n8];
                if (n12 == 0) continue;
                c8.getTheme().applyStyle(n12, true);
            }
            n8 = ax.V6.a.a(context, attributeSet);
            if (n8 != 0) {
                c8.getTheme().applyStyle(n8, true);
            }
            return c8;
        }
        return context;
    }
}

