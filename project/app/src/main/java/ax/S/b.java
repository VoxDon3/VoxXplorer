/*
 * Decompiled with CFR 0.152.
 */
package ax.S;

import android.graphics.Color;
import ax.T.a;

final class b {
    static final float[][] a = new float[][]{{0.401288f, 0.650173f, -0.051461f}, {-0.250268f, 1.204414f, 0.045854f}, {-0.002079f, 0.048952f, 0.953127f}};
    static final float[][] b;
    static final float[] c;
    static final float[][] d;

    static {
        float[] fArray = new float[]{-0.0158415f, -0.03412294f, 1.0499644f};
        b = new float[][]{{1.8620678f, -1.0112547f, 0.14918678f}, {0.38752654f, 0.62144744f, -0.00897398f}, fArray};
        c = new float[]{95.047f, 100.0f, 108.883f};
        float[] fArray2 = new float[]{0.2126f, 0.7152f, 0.0722f};
        fArray = new float[]{0.01932141f, 0.11916382f, 0.9503448f};
        d = new float[][]{{0.41233894f, 0.35762063f, 0.18051042f}, fArray2, fArray};
    }

    static int a(float f8) {
        if (f8 < 1.0f) {
            return -16777216;
        }
        if (f8 > 99.0f) {
            return -1;
        }
        float f9 = (f8 + 16.0f) / 116.0f;
        f8 = f8 > 8.0f ? f9 * f9 * f9 : (f8 /= 903.2963f);
        float f10 = f9 * f9 * f9;
        boolean bl = f10 > 0.008856452f;
        float f11 = bl ? f10 : (f9 * 116.0f - 16.0f) / 903.2963f;
        if (!bl) {
            f10 = (f9 * 116.0f - 16.0f) / 903.2963f;
        }
        float[] fArray = c;
        return ax.T.a.b(f11 * fArray[0], f8 * fArray[1], f10 * fArray[2]);
    }

    static float b(int n8) {
        return ax.S.b.c(ax.S.b.g(n8));
    }

    static float c(float f8) {
        if ((f8 /= 100.0f) <= 0.008856452f) {
            return f8 * 903.2963f;
        }
        return (float)Math.cbrt(f8) * 116.0f - 16.0f;
    }

    static float d(float f8, float f9, float f10) {
        return f8 + (f9 - f8) * f10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static float e(int n8) {
        float f8 = (float)n8 / 255.0f;
        if (f8 <= 0.04045f) {
            f8 /= 12.92f;
            return f8 * 100.0f;
        }
        f8 = (float)Math.pow((f8 + 0.055f) / 1.055f, 2.4f);
        return f8 * 100.0f;
    }

    static void f(int n8, float[] fArray) {
        float f8 = ax.S.b.e(Color.red((int)n8));
        float f9 = ax.S.b.e(Color.green((int)n8));
        float f10 = ax.S.b.e(Color.blue((int)n8));
        Object object = d;
        float[] fArray2 = object[0];
        fArray[0] = fArray2[0] * f8 + fArray2[1] * f9 + fArray2[2] * f10;
        fArray2 = object[1];
        fArray[1] = fArray2[0] * f8 + fArray2[1] * f9 + fArray2[2] * f10;
        object = object[2];
        fArray[2] = f8 * object[0] + f9 * object[1] + f10 * object[2];
    }

    static float g(int n8) {
        float f8 = ax.S.b.e(Color.red((int)n8));
        float f9 = ax.S.b.e(Color.green((int)n8));
        float f10 = ax.S.b.e(Color.blue((int)n8));
        float[] fArray = d[1];
        return f8 * fArray[0] + f9 * fArray[1] + f10 * fArray[2];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static float h(float f8) {
        if (f8 > 8.0f) {
            f8 = (float)Math.pow(((double)f8 + 16.0) / 116.0, 3.0);
            return f8 * 100.0f;
        }
        f8 /= 903.2963f;
        return f8 * 100.0f;
    }
}

