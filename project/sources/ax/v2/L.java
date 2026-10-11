package ax.v2;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
class L extends J {
    private static boolean i = true;

    static class a {
        static void a(View view, int i) {
            view.setTransitionVisibility(i);
        }
    }

    L() {
    }

    @Override // ax.v2.C3255D
    @SuppressLint({"NewApi"})
    public void g(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.g(view, i2);
        } else if (i) {
            try {
                a.a(view, i2);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }
}
