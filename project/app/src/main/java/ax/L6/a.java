/*
 * Decompiled with CFR 0.152.
 */
package ax.L6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

public class a {
    private static final int[] a = new int[]{16842919};
    private static final int[] b = new int[]{16842908};
    private static final int[] c = new int[]{0x10100A1, 16842919};
    private static final int[] d = new int[]{0x10100A1};
    private static final int[] e = new int[]{16842910, 16842919};
    static final String f = a.class.getSimpleName();

    private a() {
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        int[] nArray = d;
        int n8 = ax.L6.a.d(colorStateList, c);
        int[] nArray2 = b;
        int n9 = ax.L6.a.d(colorStateList, nArray2);
        int[] nArray3 = StateSet.NOTHING;
        int n10 = ax.L6.a.d(colorStateList, a);
        return new ColorStateList((int[][])new int[][]{nArray, nArray2, nArray3}, new int[]{n8, n9, n10});
    }

    public static Drawable b(Context context, int n8) {
        return ax.L6.a$a.b(context, n8);
    }

    private static int c(int n8) {
        return ax.T.a.k(n8, Math.min(Color.alpha((int)n8) * 2, 255));
    }

    private static int d(ColorStateList colorStateList, int[] nArray) {
        int n8 = colorStateList != null ? colorStateList.getColorForState(nArray, colorStateList.getDefaultColor()) : 0;
        return ax.L6.a.c(n8);
    }

    public static ColorStateList e(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int n8 = Build.VERSION.SDK_INT;
            if (n8 >= 22 && n8 <= 27 && Color.alpha((int)colorStateList.getDefaultColor()) == 0 && Color.alpha((int)colorStateList.getColorForState(e, 0)) != 0) {
                Log.w((String)f, (String)"Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf((int)0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean f(int[] nArray) {
        int n8 = nArray.length;
        boolean bl = false;
        boolean bl2 = false;
        for (int i8 = 0; i8 < n8; ++i8) {
            boolean bl3;
            block4: {
                block5: {
                    int n9;
                    block3: {
                        n9 = nArray[i8];
                        if (n9 != 16842910) break block3;
                        bl3 = true;
                        break block4;
                    }
                    if (n9 == 16842908 || n9 == 16842919) break block5;
                    bl3 = bl;
                    if (n9 != 16843623) break block4;
                }
                bl2 = true;
                bl3 = bl;
            }
            bl = bl3;
        }
        return bl && bl2;
    }

    private static class a {
        private static Drawable b(Context context, int n8) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            gradientDrawable = new InsetDrawable((Drawable)gradientDrawable, n8, n8, n8, n8);
            return new RippleDrawable(ax.z6.a.g(context, ax.m.a.w, ColorStateList.valueOf((int)0)), null, (Drawable)gradientDrawable);
        }
    }
}

