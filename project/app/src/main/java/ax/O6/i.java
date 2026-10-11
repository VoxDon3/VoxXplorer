/*
 * Decompiled with CFR 0.152.
 */
package ax.O6;

import android.graphics.drawable.Drawable;
import android.view.View;
import ax.F6.z;
import ax.O6.e;
import ax.O6.f;
import ax.O6.g;
import ax.O6.h;
import ax.O6.k;

public class i {
    static e a(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                return i.b();
            }
            return new f();
        }
        return new k();
    }

    static e b() {
        return new k();
    }

    static g c() {
        return new g();
    }

    public static void d(View view, float f8) {
        if ((view = view.getBackground()) instanceof h) {
            ((h)view).f0(f8);
        }
    }

    public static void e(View view) {
        Drawable drawable = view.getBackground();
        if (drawable instanceof h) {
            i.f(view, (h)drawable);
        }
    }

    public static void f(View view, h h8) {
        if (h8.W()) {
            h8.k0(z.f(view));
        }
    }
}

