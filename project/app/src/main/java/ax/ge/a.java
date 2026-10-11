/*
 * Decompiled with CFR 0.152.
 */
package ax.ge;

import ax.be.c;
import ax.ge.d;
import ax.ge.f;
import ax.ge.g;

final class a
extends f {
    private final d l;
    private final int[] m;
    private final g n;
    private final int o;
    private final int p;
    private int q = -1;
    private int r;

    a(int n8, int n9, int n10, int n11, int n12, int n13, c c8) {
        super(n8, n9, n10, n11, n12, c8);
        this.p = n9 = n8 + 1;
        this.r = n9;
        this.l = new d(n8, c8);
        this.m = c8.c(n9 * 2, false);
        this.n = new g(n11 - 1);
        if (n13 <= 0) {
            n13 = n11 / 2 + 16;
        }
        this.o = n13;
    }

    private int w() {
        int n8 = this.n(this.d, 4);
        if (n8 != 0) {
            int n9;
            this.r = n9 = this.r + 1;
            if (n9 == Integer.MAX_VALUE) {
                n9 = Integer.MAX_VALUE - this.p;
                this.l.f(n9);
                ax.ge.f.p(this.m, this.p * 2, n9);
                this.r -= n9;
            }
            this.q = n9 = this.q + 1;
            if (n9 == this.p) {
                this.q = 0;
            }
        }
        return n8;
    }

    private void x(int n8, int n9) {
        Object[] objectArray;
        int n10 = this.o;
        int n11 = this.q;
        int n12 = (n11 << 1) + 1;
        int n13 = n11 << 1;
        n11 = 0;
        int n14 = 0;
        int n15 = n9;
        while (true) {
            int n16 = this.r - n15;
            if (n10 == 0 || n16 >= (n9 = this.p)) break;
            int n17 = this.q;
            if (n16 <= n17) {
                n9 = 0;
            }
            int n18 = n17 - n16 + n9 << 1;
            n17 = Math.min(n11, n14);
            objectArray = this.e;
            int n19 = this.g;
            n9 = n17;
            if (objectArray[n19 + n17 - n16] == objectArray[n19 + n17]) {
                do {
                    if ((n9 = n17 + 1) == n8) {
                        objectArray = this.m;
                        objectArray[n13] = objectArray[n18];
                        objectArray[n12] = objectArray[n18 + 1];
                        return;
                    }
                    objectArray = this.e;
                    n19 = this.g;
                    n17 = n9;
                } while (objectArray[n19 + n9 - n16] == objectArray[n19 + n9]);
            }
            if (((objectArray = (Object[])this.e)[(n17 = this.g) + n9 - n16] & 0xFF) < (objectArray[n17 + n9] & 0xFF)) {
                objectArray = this.m;
                objectArray[n13] = n15;
                n13 = n18 + 1;
                n15 = objectArray[n13];
                n14 = n9;
                n9 = n15;
            } else {
                objectArray = this.m;
                objectArray[n12] = n15;
                n15 = objectArray[n18];
                n12 = n18;
                n11 = n9;
                n9 = n15;
            }
            --n10;
            n15 = n9;
        }
        objectArray = this.m;
        objectArray[n12] = 0;
        objectArray[n13] = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public g j() {
        int[] nArray;
        byte[] byArray;
        this.n.c = 0;
        int n8 = this.c;
        int n9 = this.d;
        int n10 = this.w();
        int n11 = n8;
        int n12 = n9;
        if (n10 < n8) {
            if (n10 == 0) {
                return this.n;
            }
            n11 = n8 = n10;
            n12 = n9;
            if (n9 > n10) {
                n12 = n8;
                n11 = n8;
            }
        }
        this.l.a(this.e, this.g);
        int n13 = this.r - this.l.b();
        int n14 = this.r - this.l.c();
        int n15 = this.l.d();
        this.l.h(this.r);
        int n16 = this.p;
        if (n13 < n16 && (byArray = this.e)[(n8 = this.g) - n13] == byArray[n8]) {
            g g8 = this.n;
            nArray = g8.a;
            n10 = 2;
            nArray[0] = 2;
            g8.b[0] = n13 - 1;
            g8.c = 1;
        } else {
            n10 = 0;
        }
        int n17 = 3;
        n9 = n13;
        n8 = n10;
        if (n13 != n14) {
            n9 = n13;
            n8 = n10;
            if (n14 < n16) {
                byte[] byArray2 = this.e;
                n16 = this.g;
                n9 = n13;
                n8 = n10;
                if (byArray2[n16 - n14] == byArray2[n16]) {
                    g g9 = this.n;
                    nArray = g9.b;
                    n8 = g9.c;
                    g9.c = n8 + 1;
                    nArray[n8] = n14 - 1;
                    n9 = n14;
                    n8 = 3;
                }
            }
        }
        n10 = n8;
        if (this.n.c > 0) {
            byte[] byArray3;
            while (n8 < n11 && (byArray3 = this.e)[(n10 = this.g) + n8 - n9] == byArray3[n10 + n8]) {
                ++n8;
            }
            g g10 = this.n;
            g10.a[g10.c - 1] = n8;
            n10 = n8;
            if (n8 >= n12) {
                this.x(n12, n15);
                return this.n;
            }
        }
        n8 = n10 < 3 ? n17 : n10;
        n17 = this.o;
        n10 = this.q;
        n13 = (n10 << 1) + 1;
        n16 = n10 << 1;
        n14 = 0;
        n9 = 0;
        int n18 = n8;
        while (true) {
            byte[] byArray4;
            int n19 = this.r - n15;
            if (n17 == 0 || n19 >= (n8 = this.p)) break;
            n10 = this.q;
            if (n19 <= n10) {
                n8 = 0;
            }
            int n20 = n10 - n19 + n8 << 1;
            n10 = Math.min(n14, n9);
            byte[] byArray5 = this.e;
            int n21 = this.g;
            int n22 = n18;
            n8 = n10;
            if (byArray5[n21 + n10 - n19] == byArray5[n21 + n10]) {
                n8 = n10;
                while ((n10 = n8 + 1) < n11) {
                    byte[] byArray6 = this.e;
                    n22 = this.g;
                    n8 = n10;
                    if (byArray6[n22 + n10 - n19] == byArray6[n22 + n10]) continue;
                }
                n22 = n18;
                n8 = n10;
                if (n10 > n18) {
                    g g11 = this.n;
                    nArray = g11.a;
                    n8 = g11.c;
                    nArray[n8] = n10;
                    g11.b[n8] = n19 - 1;
                    g11.c = n8 + 1;
                    if (n10 >= n12) {
                        nArray = this.m;
                        nArray[n16] = nArray[n20];
                        nArray[n13] = nArray[n20 + 1];
                        return g11;
                    }
                    n22 = n10;
                    n8 = n10;
                }
            }
            if (((byArray4 = this.e)[(n10 = this.g) + n8 - n19] & 0xFF) < (byArray4[n10 + n8] & 0xFF)) {
                int[] nArray2 = this.m;
                nArray2[n16] = n15;
                n16 = n20 + 1;
                n10 = nArray2[n16];
                n9 = n8;
                n8 = n10;
            } else {
                int[] nArray3 = this.m;
                nArray3[n13] = n15;
                n10 = nArray3[n20];
                n13 = n20;
                n14 = n8;
                n8 = n10;
            }
            --n17;
            n15 = n8;
            n18 = n22;
        }
        int[] nArray4 = this.m;
        nArray4[n13] = 0;
        nArray4[n16] = 0;
        return this.n;
    }

    @Override
    public void r(c c8) {
        c8.e(this.m);
        this.l.g(c8);
        super.r(c8);
    }

    @Override
    public void v(int n8) {
        while (n8 > 0) {
            block4: {
                int n9;
                int n10;
                block3: {
                    int n11 = this.d;
                    n10 = this.w();
                    n9 = n11;
                    if (n10 >= n11) break block3;
                    if (n10 == 0) break block4;
                    n9 = n10;
                }
                this.l.a(this.e, this.g);
                n10 = this.l.d();
                this.l.h(this.r);
                this.x(n9, n10);
            }
            --n8;
        }
    }
}

