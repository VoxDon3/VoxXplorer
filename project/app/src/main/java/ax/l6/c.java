/*
 * Decompiled with CFR 0.152.
 */
package ax.l6;

import android.animation.TypeEvaluator;

public class c
implements TypeEvaluator<Integer> {
    private static final c a = new c();

    public static c b() {
        return a;
    }

    public Integer a(float f8, Integer n8, Integer n9) {
        int n10 = n8;
        float f9 = (float)(n10 >> 24 & 0xFF) / 255.0f;
        float f10 = (float)(n10 >> 16 & 0xFF) / 255.0f;
        float f11 = (float)(n10 >> 8 & 0xFF) / 255.0f;
        float f12 = (float)(n10 & 0xFF) / 255.0f;
        n10 = n9;
        float f13 = (float)(n10 >> 24 & 0xFF) / 255.0f;
        float f14 = (float)(n10 >> 16 & 0xFF) / 255.0f;
        float f15 = (float)(n10 >> 8 & 0xFF) / 255.0f;
        float f16 = (float)(n10 & 0xFF) / 255.0f;
        f10 = (float)Math.pow(f10, 2.2);
        f11 = (float)Math.pow(f11, 2.2);
        f12 = (float)Math.pow(f12, 2.2);
        f14 = (float)Math.pow(f14, 2.2);
        f15 = (float)Math.pow(f15, 2.2);
        f16 = (float)Math.pow(f16, 2.2);
        f10 = (float)Math.pow(f10 + (f14 - f10) * f8, 0.45454545454545453);
        f11 = (float)Math.pow(f11 + (f15 - f11) * f8, 0.45454545454545453);
        f12 = (float)Math.pow(f12 + f8 * (f16 - f12), 0.45454545454545453);
        n10 = Math.round((f9 + (f13 - f9) * f8) * 255.0f);
        return Math.round(f10 * 255.0f) << 16 | n10 << 24 | Math.round(f11 * 255.0f) << 8 | Math.round(f12 * 255.0f);
    }
}

