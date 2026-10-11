/*
 * Decompiled with CFR 0.152.
 */
package ax.Dd;

import ax.Dd.k;

public class d
extends k {
    private static byte[] b = new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 31, 31, 31, 31, 14, 14, 14, 14, -32, -32, -32, -32, -15, -15, -15, -15, -2, -2, -2, -2, -2, -2, -2, -2, 1, -2, 1, -2, 1, -2, 1, -2, 31, -32, 31, -32, 14, -15, 14, -15, 1, -32, 1, -32, 1, -15, 1, -15, 31, -2, 31, -2, 14, -2, 14, -2, 1, 31, 1, 31, 1, 14, 1, 14, -32, -2, -32, -2, -15, -2, -15, -2, -2, 1, -2, 1, -2, 1, -2, 1, -32, 31, -32, 31, -15, 14, -15, 14, -32, 1, -32, 1, -15, 1, -15, 1, -2, 31, -2, 31, -2, 14, -2, 14, 31, 1, 31, 1, 14, 1, 14, 1, -2, -32, -2, -32, -2, -15, -2, -15};

    public d(byte[] byArray) {
        super(byArray);
        if (!d.b(byArray, 0)) {
            return;
        }
        throw new IllegalArgumentException("attempt to create weak DES key");
    }

    public static boolean b(byte[] byArray, int n8) {
        if (byArray.length - n8 >= 8) {
            block0: for (int i8 = 0; i8 < 16; ++i8) {
                for (int i9 = 0; i9 < 8; ++i9) {
                    if (byArray[i9 + n8] == b[i8 * 8 + i9]) continue;
                    continue block0;
                }
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("key material too short.");
    }
}

