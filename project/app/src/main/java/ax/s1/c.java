/*
 * Decompiled with CFR 0.152.
 */
package ax.s1;

import ax.S0.G;
import ax.s1.a;

final class c
implements a {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    private c(int n8, int n9, int n10, int n11) {
        this.a = n8;
        this.b = n9;
        this.c = n10;
        this.d = n11;
    }

    public static c c(G g8) {
        int n8 = g8.z();
        g8.c0(8);
        int n9 = g8.z();
        int n10 = g8.z();
        g8.c0(4);
        int n11 = g8.z();
        g8.c0(12);
        return new c(n8, n9, n10, n11);
    }

    @Override
    public int a() {
        return 1751742049;
    }

    public boolean b() {
        return (this.b & 0x10) == 16;
    }
}

