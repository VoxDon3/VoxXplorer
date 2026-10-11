package ax.v2;

import android.annotation.SuppressLint;
import android.view.View;

/* loaded from: classes.dex */
class J extends H {
    private static boolean h = true;

    static class a {
        static void a(View view, int i, int i2, int i3, int i4) {
            view.setLeftTopRightBottom(i, i2, i3, i4);
        }
    }

    J() {
    }

    @Override // ax.v2.C3255D
    @SuppressLint({"NewApi"})
    public void e(View view, int i, int i2, int i3, int i4) {
        if (h) {
            try {
                a.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }
}
