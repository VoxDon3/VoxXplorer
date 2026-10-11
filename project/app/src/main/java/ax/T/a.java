/*
 * Decompiled with CFR 0.152.
 */
package ax.T;

import android.graphics.Color;

public final class a {
    private static final ThreadLocal<double[]> a = new ThreadLocal();

    public static void a(int n8, int n9, int n10, double[] dArray) {
        if (dArray.length == 3) {
            double d8 = (double)n8 / 255.0;
            d8 = d8 < 0.04045 ? (d8 /= 12.92) : Math.pow((d8 + 0.055) / 1.055, 2.4);
            double d9 = (double)n9 / 255.0;
            d9 = d9 < 0.04045 ? (d9 /= 12.92) : Math.pow((d9 + 0.055) / 1.055, 2.4);
            double d10 = (double)n10 / 255.0;
            d10 = d10 < 0.04045 ? (d10 /= 12.92) : Math.pow((d10 + 0.055) / 1.055, 2.4);
            dArray[0] = (0.4124 * d8 + 0.3576 * d9 + 0.1805 * d10) * 100.0;
            dArray[1] = (0.2126 * d8 + 0.7152 * d9 + 0.0722 * d10) * 100.0;
            dArray[2] = (d8 * 0.0193 + d9 * 0.1192 + d10 * 0.9505) * 100.0;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static int b(double d8, double d9, double d10) {
        double d11 = (3.2406 * d8 + -1.5372 * d9 + -0.4986 * d10) / 100.0;
        double d12 = (-0.9689 * d8 + 1.8758 * d9 + 0.0415 * d10) / 100.0;
        d10 = (0.0557 * d8 + -0.204 * d9 + 1.057 * d10) / 100.0;
        d8 = d11 > 0.0031308 ? Math.pow(d11, 0.4166666666666667) * 1.055 - 0.055 : d11 * 12.92;
        d9 = d12 > 0.0031308 ? Math.pow(d12, 0.4166666666666667) * 1.055 - 0.055 : d12 * 12.92;
        d10 = d10 > 0.0031308 ? Math.pow(d10, 0.4166666666666667) * 1.055 - 0.055 : 12.92 * d10;
        return Color.rgb((int)ax.T.a.i((int)Math.round(d8 * 255.0), 0, 255), (int)ax.T.a.i((int)Math.round(d9 * 255.0), 0, 255), (int)ax.T.a.i((int)Math.round(d10 * 255.0), 0, 255));
    }

    public static int c(int n8, int n9, float f8) {
        float f9 = 1.0f - f8;
        float f10 = Color.alpha((int)n8);
        float f11 = Color.alpha((int)n9);
        float f12 = Color.red((int)n8);
        float f13 = Color.red((int)n9);
        float f14 = Color.green((int)n8);
        float f15 = Color.green((int)n9);
        float f16 = Color.blue((int)n8);
        float f17 = Color.blue((int)n9);
        return Color.argb((int)((int)(f10 * f9 + f11 * f8)), (int)((int)(f12 * f9 + f13 * f8)), (int)((int)(f14 * f9 + f15 * f8)), (int)((int)(f16 * f9 + f17 * f8)));
    }

    public static double d(int n8) {
        double[] dArray = ax.T.a.j();
        ax.T.a.e(n8, dArray);
        return dArray[1] / 100.0;
    }

    public static void e(int n8, double[] dArray) {
        ax.T.a.a(Color.red((int)n8), Color.green((int)n8), Color.blue((int)n8), dArray);
    }

    private static int f(int n8, int n9) {
        return 255 - (255 - n9) * (255 - n8) / 255;
    }

    public static int g(int n8, int n9) {
        int n10 = Color.alpha((int)n9);
        int n11 = Color.alpha((int)n8);
        int n12 = ax.T.a.f(n11, n10);
        return Color.argb((int)n12, (int)ax.T.a.h(Color.red((int)n8), n11, Color.red((int)n9), n10, n12), (int)ax.T.a.h(Color.green((int)n8), n11, Color.green((int)n9), n10, n12), (int)ax.T.a.h(Color.blue((int)n8), n11, Color.blue((int)n9), n10, n12));
    }

    private static int h(int n8, int n9, int n10, int n11, int n12) {
        if (n12 == 0) {
            return 0;
        }
        return (n8 * 255 * n9 + n10 * n11 * (255 - n9)) / (n12 * 255);
    }

    private static int i(int n8, int n9, int n10) {
        if (n8 < n9) {
            return n9;
        }
        return Math.min(n8, n10);
    }

    private static double[] j() {
        double[] dArray;
        ThreadLocal<double[]> threadLocal = a;
        double[] dArray2 = dArray = threadLocal.get();
        if (dArray == null) {
            dArray2 = new double[3];
            threadLocal.set(dArray2);
        }
        return dArray2;
    }

    public static int k(int n8, int n9) {
        if (n9 >= 0 && n9 <= 255) {
            return n8 & 0xFFFFFF | n9 << 24;
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}

