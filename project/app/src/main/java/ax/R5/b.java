/*
 * Decompiled with CFR 0.152.
 */
package ax.R5;

import ax.M5.n;

public final class b {
    public static boolean a(int[] nArray, int n8) {
        if (nArray != null) {
            for (int i8 = 0; i8 < nArray.length; ++i8) {
                if (nArray[i8] != n8) continue;
                return true;
            }
        }
        return false;
    }

    public static <T> boolean b(T[] TArray, T t8) {
        int n8 = TArray != null ? TArray.length : 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!n.b(TArray[i8], t8)) continue;
            if (i8 < 0) break;
            return true;
        }
        return false;
    }
}

