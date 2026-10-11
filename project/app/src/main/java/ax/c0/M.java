/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;

public final class M {
    private final PointerIcon a;

    private M(PointerIcon pointerIcon) {
        this.a = pointerIcon;
    }

    public static M b(Context context, int n8) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new M(ax.c0.M$a.b(context, n8));
        }
        return new M(null);
    }

    public Object a() {
        return this.a;
    }

    static class a {
        static PointerIcon a(Bitmap bitmap, float f8, float f9) {
            return PointerIcon.create((Bitmap)bitmap, (float)f8, (float)f9);
        }

        static PointerIcon b(Context context, int n8) {
            return PointerIcon.getSystemIcon((Context)context, (int)n8);
        }

        static PointerIcon c(Resources resources, int n8) {
            return PointerIcon.load((Resources)resources, (int)n8);
        }
    }
}

