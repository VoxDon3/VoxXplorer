/*
 * Decompiled with CFR 0.152.
 */
package ax.J9;

import ax.A9.b;
import ax.H9.k;
import ax.I9.i;
import ax.I9.o;
import ax.I9.x;

public class a {
    private x a;
    private ax.F9.a b;

    public a(b b8, int n8) {
        block4: {
            ax.F9.a a8;
            block3: {
                block2: {
                    if (n8 != 1) break block2;
                    this.a = new i();
                    break block3;
                }
                if (n8 != 2) break block4;
                this.a = new o();
            }
            b8.e(this.a);
            this.b = a8 = new ax.F9.a();
            a8.j(b8.a() ^ true);
            this.b.i(true);
            this.b.c(32768);
            this.a.z(this.b);
            this.a.y();
            return;
        }
        throw new IllegalArgumentException("Only 1 or 2 samplesPerFrame supported.");
    }

    public int a() {
        return this.b.d();
    }

    public k b() {
        return this.a.i;
    }

    public int c(double[] dArray, int n8, int n9) {
        return this.b.g(dArray, n8, n9);
    }
}

