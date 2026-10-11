package ax.v2;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
class z {
    private static boolean a = true;

    static class a {
        static int a(ViewGroup viewGroup, int i) {
            return viewGroup.getChildDrawingOrder(i);
        }

        static void b(ViewGroup viewGroup, boolean z) {
            viewGroup.suppressLayout(z);
        }
    }

    @SuppressLint({"NewApi"})
    private static void a(ViewGroup viewGroup, boolean z) {
        if (a) {
            try {
                a.b(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }

    static void b(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.b(viewGroup, z);
        } else {
            a(viewGroup, z);
        }
    }
}
