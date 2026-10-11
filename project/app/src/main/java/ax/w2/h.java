/*
 * Decompiled with CFR 0.152.
 */
package ax.w2;

import android.animation.TypeEvaluator;

public class h
implements TypeEvaluator {
    private static final h a = new h();

    public static h a() {
        return a;
    }

    public Object evaluate(float f8, Object object, Object object2) {
        int n8 = (Integer)object;
        float f9 = (float)(n8 >> 24 & 0xFF) / 255.0f;
        float f10 = (float)(n8 >> 16 & 0xFF) / 255.0f;
        float f11 = (float)(n8 >> 8 & 0xFF) / 255.0f;
        float f12 = (float)(n8 & 0xFF) / 255.0f;
        n8 = (Integer)object2;
        float f13 = (float)(n8 >> 24 & 0xFF) / 255.0f;
        float f14 = (float)(n8 >> 16 & 0xFF) / 255.0f;
        float f15 = (float)(n8 >> 8 & 0xFF) / 255.0f;
        float f16 = (float)(n8 & 0xFF) / 255.0f;
        f10 = (float)Math.pow(f10, 2.2);
        f11 = (float)Math.pow(f11, 2.2);
        f12 = (float)Math.pow(f12, 2.2);
        f14 = (float)Math.pow(f14, 2.2);
        f15 = (float)Math.pow(f15, 2.2);
        f16 = (float)Math.pow(f16, 2.2);
        f10 = (float)Math.pow(f10 + (f14 - f10) * f8, 0.45454545454545453);
        f11 = (float)Math.pow(f11 + (f15 - f11) * f8, 0.45454545454545453);
        f12 = (float)Math.pow(f12 + f8 * (f16 - f12), 0.45454545454545453);
        n8 = Math.round((f9 + (f13 - f9) * f8) * 255.0f);
        return Math.round(f10 * 255.0f) << 16 | n8 << 24 | Math.round(f11 * 255.0f) << 8 | Math.round(f12 * 255.0f);
    }
}

