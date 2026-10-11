/*
 * Decompiled with CFR 0.152.
 */
package ax.Kd;

import ax.Kd.a;

public class b {
    public static void a(long l8, long[] lArray, int n8) {
        l8 = a.b(a.b(a.b(a.b(a.b(l8, 0xFFFF0000L, 16), 0xFF000000FF00L, 8), 0xF000F000F000F0L, 4), 0xC0C0C0C0C0C0C0CL, 2), 0x2222222222222222L, 1);
        lArray[n8] = l8 & 0xAAAAAAAAAAAAAAAAL;
        lArray[n8 + 1] = l8 << 1 & 0xAAAAAAAAAAAAAAAAL;
    }

    public static int b(int n8) {
        return a.a(a.a(a.a(a.a(n8, 0xAA00AA, 7), 52428, 14), 0xF000F0, 4), 65280, 8);
    }
}

