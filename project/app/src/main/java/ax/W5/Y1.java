/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.P0;

final class Y1 {
    static /* bridge */ /* synthetic */ void a(byte by, byte by2, byte by3, byte by4, char[] cArray, int n8) {
        if (!(Y1.e(by2) || (by << 28) + (by2 + 112) >> 30 != 0 || Y1.e(by3) || Y1.e(by4))) {
            by = (byte)((by & 7) << 18 | (by2 & 0x3F) << 12 | (by3 & 0x3F) << 6 | by4 & 0x3F);
            cArray[n8] = (char)((by >>> 10) + 55232);
            cArray[n8 + 1] = (char)((by & 0x3FF) + 56320);
            return;
        }
        throw P0.b();
    }

    static /* bridge */ /* synthetic */ void b(byte n8, byte by, byte by2, char[] cArray, int n9) {
        block4: {
            block6: {
                int n10;
                block5: {
                    if (Y1.e(by)) break block4;
                    n10 = n8;
                    if (n8 != -32) break block5;
                    if (by < -96) break block4;
                    n10 = -32;
                }
                n8 = n10;
                if (n10 != -19) break block6;
                if (by >= -96) break block4;
                n8 = -19;
            }
            if (!Y1.e(by2)) {
                cArray[n9] = (char)((n8 & 0xF) << 12 | (by & 0x3F) << 6 | by2 & 0x3F);
                return;
            }
        }
        throw P0.b();
    }

    static /* bridge */ /* synthetic */ void c(byte by, byte by2, char[] cArray, int n8) {
        if (by >= -62 && !Y1.e(by2)) {
            cArray[n8] = (char)((by & 0x1F) << 6 | by2 & 0x3F);
            return;
        }
        throw P0.b();
    }

    static /* bridge */ /* synthetic */ boolean d(byte by) {
        return by >= 0;
    }

    private static boolean e(byte by) {
        return by > -65;
    }
}

