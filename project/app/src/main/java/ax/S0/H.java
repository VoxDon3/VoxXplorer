/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

public final class H {
    public static int a(int n8, int n9) {
        for (int i8 = 1; i8 <= 2; ++i8) {
            int n10 = (n8 + i8) % 3;
            if (!H.b(n10, n9)) continue;
            return n10;
        }
        return n8;
    }

    public static boolean b(int n8, int n9) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    return false;
                }
                return (n9 & 2) != 0;
            }
            return (n9 & 1) != 0;
        }
        return true;
    }
}

