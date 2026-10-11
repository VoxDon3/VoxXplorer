/*
 * Decompiled with CFR 0.152.
 */
package ax.l6;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import ax.D0.b;
import ax.D0.c;

public class a {
    public static final TimeInterpolator a = new LinearInterpolator();
    public static final TimeInterpolator b = new b();
    public static final TimeInterpolator c = new ax.D0.a();
    public static final TimeInterpolator d = new c();
    public static final TimeInterpolator e = new DecelerateInterpolator();

    public static float a(float f8, float f9, float f10) {
        return f8 + f10 * (f9 - f8);
    }

    public static float b(float f8, float f9, float f10, float f11, float f12) {
        if (f12 <= f10) {
            return f8;
        }
        if (f12 >= f11) {
            return f9;
        }
        return ax.l6.a.a(f8, f9, (f12 - f10) / (f11 - f10));
    }

    public static int c(int n8, int n9, float f8) {
        return n8 + Math.round(f8 * (float)(n9 - n8));
    }
}

