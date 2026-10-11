/*
 * Decompiled with CFR 0.152.
 */
package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

class e
extends Drawable {
    private static final double a = Math.cos(Math.toRadians(45.0));

    static float a(float f8, float f9, boolean bl) {
        float f10 = f8;
        if (bl) {
            f10 = (float)((double)f8 + (1.0 - a) * (double)f9);
        }
        return f10;
    }

    static float b(float f8, float f9, boolean bl) {
        if (bl) {
            return (float)((double)(f8 * 1.5f) + (1.0 - a) * (double)f9);
        }
        return f8 * 1.5f;
    }
}

