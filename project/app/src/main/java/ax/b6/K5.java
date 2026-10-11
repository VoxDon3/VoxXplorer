/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.s4;

final class K5 {
    static /* synthetic */ void a(byte by, byte by2, byte by3, byte by4, char[] cArray, int n8) {
        if (!(K5.e(by2) || (by << 28) + (by2 + 112) >> 30 != 0 || K5.e(by3) || K5.e(by4))) {
            by = (byte)((by & 7) << 18 | (by2 & 0x3F) << 12 | (by3 & 0x3F) << 6 | by4 & 0x3F);
            cArray[n8] = (char)((by >>> 10) + 55232);
            cArray[n8 + 1] = (char)((by & 0x3FF) + 56320);
            return;
        }
        throw s4.c();
    }

    static /* synthetic */ void b(byte by, byte by2, byte by3, char[] cArray, int n8) {
        if (!(K5.e(by2) || by == -32 && by2 < -96 || by == -19 && by2 >= -96 || K5.e(by3))) {
            cArray[n8] = (char)((by & 0xF) << 12 | (by2 & 0x3F) << 6 | by3 & 0x3F);
            return;
        }
        throw s4.c();
    }

    static /* synthetic */ void c(byte by, byte by2, char[] cArray, int n8) {
        if (by >= -62 && !K5.e(by2)) {
            cArray[n8] = (char)((by & 0x1F) << 6 | by2 & 0x3F);
            return;
        }
        throw s4.c();
    }

    static /* synthetic */ void d(byte by, char[] cArray, int n8) {
        cArray[n8] = (char)by;
    }

    private static boolean e(byte by) {
        return by > -65;
    }
}

