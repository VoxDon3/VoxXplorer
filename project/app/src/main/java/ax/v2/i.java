/*
 * Decompiled with CFR 0.152.
 */
package ax.v2;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

class i
implements TypeEvaluator<Rect> {
    private Rect a;

    i() {
    }

    public Rect a(float f8, Rect rect, Rect rect2) {
        int n8 = rect.left;
        n8 += (int)((float)(rect2.left - n8) * f8);
        int n9 = rect.top;
        n9 += (int)((float)(rect2.top - n9) * f8);
        int n10 = rect.right;
        n10 += (int)((float)(rect2.right - n10) * f8);
        int n11 = rect.bottom;
        n11 += (int)((float)(rect2.bottom - n11) * f8);
        rect = this.a;
        if (rect == null) {
            return new Rect(n8, n9, n10, n11);
        }
        rect.set(n8, n9, n10, n11);
        return this.a;
    }
}

