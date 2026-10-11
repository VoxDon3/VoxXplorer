/*
 * Decompiled with CFR 0.152.
 */
package ax.O6;

import ax.O6.e;
import ax.O6.n;

public class f
extends e {
    float a = -1.0f;

    @Override
    public void a(n n8, float f8, float f9, float f10) {
        f9 = f10 * f9;
        n8.o(0.0f, f9, 180.0f, 180.0f - f8);
        double d8 = Math.sin(Math.toRadians(f8));
        double d9 = f9;
        n8.m((float)(d8 * d9), (float)(Math.sin(Math.toRadians(90.0f - f8)) * d9));
    }
}

