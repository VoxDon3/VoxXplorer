/*
 * Decompiled with CFR 0.152.
 */
package ax.Ab;

public final class c {
    private static final int a(int n8, int n9, int n10) {
        return c.c(c.c(n8, n10) - c.c(n9, n10), n10);
    }

    public static final int b(int n8, int n9, int n10) {
        block7: {
            block8: {
                block6: {
                    block5: {
                        if (n10 <= 0) break block5;
                        if (n8 < n9) {
                            return n9 - c.a(n9, n8, n10);
                        }
                        break block6;
                    }
                    if (n10 >= 0) break block7;
                    if (n8 > n9) break block8;
                }
                return n9;
            }
            return n9 + c.a(n8, n9, -n10);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    private static final int c(int n8, int n9) {
        if ((n8 %= n9) >= 0) {
            return n8;
        }
        return n8 + n9;
    }
}

