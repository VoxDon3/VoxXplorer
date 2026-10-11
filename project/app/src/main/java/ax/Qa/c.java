/*
 * Decompiled with CFR 0.152.
 */
package ax.Qa;

public class c
implements Comparable<c> {
    private final double q;

    public c(double d8) {
        this.q = d8;
    }

    public int d(c c8) {
        double d8 = this.q;
        double d9 = c8.q;
        if (d8 < d9) {
            return -1;
        }
        if (d8 == d9) {
            return 0;
        }
        return 1;
    }

    public double h() {
        return this.q;
    }
}

