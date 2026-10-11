package ax.F6;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import ax.c0.C1787r0;
import ax.z6.C3555a;

/* loaded from: classes3.dex */
public class d {
    public static void a(Window window, boolean z, Integer num, Integer num2) {
        boolean z2 = num == null || num.intValue() == 0;
        boolean z3 = num2 == null || num2.intValue() == 0;
        if (z2 || z3) {
            int b = C3555a.b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z2) {
                num = Integer.valueOf(b);
            }
            if (z3) {
                num2 = Integer.valueOf(b);
            }
        }
        C1787r0.b(window, !z);
        int c = c(window.getContext(), z);
        int b2 = b(window.getContext(), z);
        window.setStatusBarColor(c);
        window.setNavigationBarColor(b2);
        f(window, d(c, C3555a.i(num.intValue())));
        e(window, d(b2, C3555a.i(num2.intValue())));
    }

    private static int b(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 27) {
            return ax.T.a.k(C3555a.b(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return C3555a.b(context, R.attr.navigationBarColor, -16777216);
    }

    private static int c(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 23) {
            return ax.T.a.k(C3555a.b(context, R.attr.statusBarColor, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return C3555a.b(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean d(int i, boolean z) {
        if (C3555a.i(i)) {
            return true;
        }
        return i == 0 && z;
    }

    public static void e(Window window, boolean z) {
        C1787r0.a(window, window.getDecorView()).c(z);
    }

    public static void f(Window window, boolean z) {
        C1787r0.a(window, window.getDecorView()).d(z);
    }
}
