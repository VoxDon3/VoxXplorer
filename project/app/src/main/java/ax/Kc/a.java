/*
 * Decompiled with CFR 0.152.
 */
package ax.Kc;

import java.nio.charset.StandardCharsets;

public class a {
    public static boolean a(byte[] byArray, int n8) {
        for (int i8 = 0; i8 < n8; ++i8) {
            if (byArray[i8] == 0) continue;
            return false;
        }
        return true;
    }

    public static boolean b(byte[] byArray, int n8, int n9, byte[] byArray2, int n10, int n11, boolean bl) {
        int n12 = n9 < n11 ? n9 : n11;
        for (int i8 = 0; i8 < n12; ++i8) {
            if (byArray[n8 + i8] == byArray2[n10 + i8]) continue;
            return false;
        }
        if (n9 == n11) {
            return true;
        }
        if (bl) {
            if (n9 > n11) {
                while (n11 < n9) {
                    if (byArray[n8 + n11] != 0) {
                        return false;
                    }
                    ++n11;
                }
            } else {
                for (n12 = n9; n12 < n11; ++n12) {
                    if (byArray2[n10 + n12] == 0) continue;
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean c(String object, byte[] byArray, int n8, int n9) {
        object = ((String)object).getBytes(StandardCharsets.US_ASCII);
        return a.b((byte[])object, 0, ((Object)object).length, byArray, n8, n9, false);
    }
}

