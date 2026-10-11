/*
 * Decompiled with CFR 0.152.
 */
package ax.v2;

import android.annotation.SuppressLint;
import android.view.View;
import ax.v2.H;
import ax.v2.I;

class J
extends H {
    private static boolean h = true;

    J() {
    }

    @Override
    @SuppressLint(value={"NewApi"})
    public void e(View view, int n8, int n9, int n10, int n11) {
        if (h) {
            try {
                a.a(view, n8, n9, n10, n11);
                return;
            }
            catch (NoSuchMethodError noSuchMethodError) {
                h = false;
            }
        }
    }

    static class a {
        static void a(View view, int n8, int n9, int n10, int n11) {
            I.a(view, n8, n9, n10, n11);
        }
    }
}

