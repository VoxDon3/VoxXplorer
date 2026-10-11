/*
 * Decompiled with CFR 0.152.
 */
package ax.F6;

final class f {
    static void a(float f8, float[] fArray) {
        if (f8 <= 0.5f) {
            fArray[0] = 1.0f - f8 * 2.0f;
            fArray[1] = 0.0f;
            return;
        }
        fArray[0] = 0.0f;
        fArray[1] = f8 * 2.0f - 1.0f;
    }
}

