/*
 * Decompiled with CFR 0.152.
 */
package ax.G6;

public final class a {
    public static boolean a(float[] fArray) {
        if (fArray.length <= 1) {
            return true;
        }
        float f8 = fArray[0];
        for (int i8 = 1; i8 < fArray.length; ++i8) {
            if (fArray[i8] == f8) continue;
            return false;
        }
        return true;
    }

    public static float b(float f8, float f9, float f10, float f11) {
        return (float)Math.hypot(f10 - f8, f11 - f9);
    }

    public static float c(float f8, float f9, float f10, float f11, float f12, float f13) {
        return a.e(a.b(f8, f9, f10, f11), a.b(f8, f9, f12, f11), a.b(f8, f9, f12, f13), a.b(f8, f9, f10, f13));
    }

    public static float d(float f8, float f9, float f10) {
        return (1.0f - f10) * f8 + f10 * f9;
    }

    private static float e(float f8, float f9, float f10, float f11) {
        if (f8 > f9 && f8 > f10 && f8 > f11) {
            return f8;
        }
        if (f9 > f10 && f9 > f11) {
            return f9;
        }
        if (f10 > f11) {
            return f10;
        }
        return f11;
    }
}

