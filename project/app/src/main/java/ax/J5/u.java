/*
 * Decompiled with CFR 0.152.
 */
package ax.J5;

public final class u {
    static int a(int n8) {
        for (int i8 = 0; i8 < 3; ++i8) {
            int n9 = (new int[]{1, 2, 3})[i8];
            if (n9 != 0) {
                if (n9 - 1 != n8) continue;
                return n9;
            }
            throw null;
        }
        return 1;
    }
}

