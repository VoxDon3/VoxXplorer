/*
 * Decompiled with CFR 0.152.
 */
package ax.s6;

import android.graphics.Canvas;
import android.os.Build;

public class a {
    public static int a(Canvas canvas, float f8, float f9, float f10, float f11, int n8) {
        if (Build.VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(f8, f9, f10, f11, n8);
        }
        return canvas.saveLayerAlpha(f8, f9, f10, f11, n8, 31);
    }
}

