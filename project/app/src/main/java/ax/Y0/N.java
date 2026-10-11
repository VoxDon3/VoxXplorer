/*
 * Decompiled with CFR 0.152.
 */
package ax.Y0;

public final class N
extends RuntimeException {
    public final int q;

    public N(int n8) {
        super(N.a(n8));
        this.q = n8;
    }

    private static String a(int n8) {
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return "Undefined timeout.";
                }
                return "Detaching surface timed out.";
            }
            return "Setting foreground mode timed out.";
        }
        return "Player release timed out.";
    }
}

