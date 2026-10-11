package ax.L6;

import android.R;
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
import ax.m.C2506a;
import ax.z6.C3555a;

/* loaded from: classes3.dex */
public class a {
    private static final int[] a = {R.attr.state_pressed};
    private static final int[] b = {R.attr.state_focused};
    private static final int[] c = {R.attr.state_selected, R.attr.state_pressed};
    private static final int[] d = {R.attr.state_selected};
    private static final int[] e = {R.attr.state_enabled, R.attr.state_pressed};
    static final String f = a.class.getSimpleName();

    /* renamed from: ax.L6.a$a, reason: collision with other inner class name */
    private static class C0121a {
        /* JADX INFO: Access modifiers changed from: private */
        public static Drawable b(Context context, int i) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            return new RippleDrawable(C3555a.g(context, C2506a.w, ColorStateList.valueOf(0)), null, new InsetDrawable((Drawable) gradientDrawable, i, i, i, i));
        }
    }

    private a() {
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        int[] iArr = b;
        return new ColorStateList(new int[][]{d, iArr, StateSet.NOTHING}, new int[]{d(colorStateList, c), d(colorStateList, iArr), d(colorStateList, a)});
    }

    public static Drawable b(Context context, int i) {
        return C0121a.b(context, i);
    }

    private static int c(int i) {
        return ax.T.a.k(i, Math.min(Color.alpha(i) * 2, 255));
    }

    private static int d(ColorStateList colorStateList, int[] iArr) {
        return c(colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0);
    }

    public static ColorStateList e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(e, 0)) != 0) {
            Log.w(f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean f(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
