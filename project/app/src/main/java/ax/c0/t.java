/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.graphics.Rect;
import android.view.Gravity;

public final class t {
    public static void a(int n8, int n9, int n10, Rect rect, Rect rect2, int n11) {
        Gravity.apply((int)n8, (int)n9, (int)n10, (Rect)rect, (Rect)rect2, (int)n11);
    }

    public static int b(int n8, int n9) {
        return Gravity.getAbsoluteGravity((int)n8, (int)n9);
    }
}

