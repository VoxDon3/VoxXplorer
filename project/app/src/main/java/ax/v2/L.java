/*
 * Decompiled with CFR 0.152.
 */
package ax.v2;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import ax.v2.J;
import ax.v2.K;

class L
extends J {
    private static boolean i = true;

    L() {
    }

    @Override
    @SuppressLint(value={"NewApi"})
    public void g(View view, int n8) {
        if (Build.VERSION.SDK_INT == 28) {
            super.g(view, n8);
            return;
        }
        if (i) {
            try {
                a.a(view, n8);
                return;
            }
            catch (NoSuchMethodError noSuchMethodError) {
                i = false;
            }
        }
    }

    static class a {
        static void a(View view, int n8) {
            K.a(view, n8);
        }
    }
}

