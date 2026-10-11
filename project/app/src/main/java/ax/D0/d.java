/*
 * Decompiled with CFR 0.152.
 */
package ax.D0;

import android.view.animation.Interpolator;

abstract class d
implements Interpolator {
    private final float[] a;
    private final float b;

    protected d(float[] fArray) {
        this.a = fArray;
        this.b = 1.0f / (float)(fArray.length - 1);
    }

    public float getInterpolation(float f8) {
        if (f8 >= 1.0f) {
            return 1.0f;
        }
        if (f8 <= 0.0f) {
            return 0.0f;
        }
        float[] fArray = this.a;
        int n8 = Math.min((int)((float)(fArray.length - 1) * f8), fArray.length - 2);
        float f9 = n8;
        float f10 = this.b;
        f10 = (f8 - f9 * f10) / f10;
        fArray = this.a;
        f8 = fArray[n8];
        return f8 + f10 * (fArray[n8 + 1] - f8);
    }
}

