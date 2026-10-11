package ax.G6;

/* loaded from: classes3.dex */
public final class a {
    public static boolean a(float[] fArr) {
        if (fArr.length <= 1) {
            return true;
        }
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            if (fArr[i] != f) {
                return false;
            }
        }
        return true;
    }

    public static float b(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    public static float c(float f, float f2, float f3, float f4, float f5, float f6) {
        return e(b(f, f2, f3, f4), b(f, f2, f5, f4), b(f, f2, f5, f6), b(f, f2, f3, f6));
    }

    public static float d(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    private static float e(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }
}
