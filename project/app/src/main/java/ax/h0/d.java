/*
 * Decompiled with CFR 0.152.
 */
package ax.h0;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

public final class d {
    public static EdgeEffect a(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.a(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    public static float b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static void c(EdgeEffect edgeEffect, float f8, float f9) {
        a.a(edgeEffect, f8, f9);
    }

    public static float d(EdgeEffect edgeEffect, float f8, float f9) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.c(edgeEffect, f8, f9);
        }
        d.c(edgeEffect, f8, f9);
        return f8;
    }

    static class a {
        static void a(EdgeEffect edgeEffect, float f8, float f9) {
            edgeEffect.onPull(f8, f9);
        }
    }

    private static class b {
        public static EdgeEffect a(Context context, AttributeSet attributeSet) {
            try {
                attributeSet = new EdgeEffect(context, attributeSet);
                return attributeSet;
            }
            catch (Throwable throwable) {
                return new EdgeEffect(context);
            }
        }

        public static float b(EdgeEffect edgeEffect) {
            try {
                float f8 = edgeEffect.getDistance();
                return f8;
            }
            catch (Throwable throwable) {
                return 0.0f;
            }
        }

        public static float c(EdgeEffect edgeEffect, float f8, float f9) {
            try {
                float f10 = edgeEffect.onPullDistance(f8, f9);
                return f10;
            }
            catch (Throwable throwable) {
                edgeEffect.onPull(f8, f9);
                return 0.0f;
            }
        }
    }
}

