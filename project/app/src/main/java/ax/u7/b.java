/*
 * Decompiled with CFR 0.152.
 */
package ax.u7;

import ax.q7.n;

public final class b {
    public static char a(long l8) {
        char c8 = (char)l8;
        boolean bl = (long)c8 == l8;
        n.i(bl, "Out of range: %s", l8);
        return c8;
    }

    public static boolean b(char[] cArray, char c8) {
        int n8 = cArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (cArray[i8] != c8) continue;
            return true;
        }
        return false;
    }

    public static char c(byte by, byte by2) {
        return (char)(by << 8 | by2 & 0xFF);
    }
}

