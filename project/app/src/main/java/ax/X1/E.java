/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import ax.S0.G;
import ax.S0.M;
import ax.S0.d0;
import ax.X1.D;
import ax.X1.L;
import ax.q1.t;

public final class E
implements L {
    private final D a;
    private final G b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public E(D d8) {
        this.a = d8;
        this.b = new G(32);
    }

    @Override
    public void a(M m8, t t8, L.d d8) {
        this.a.a(m8, t8, d8);
        this.f = true;
    }

    @Override
    public void b() {
        this.f = true;
    }

    @Override
    public void c(G g8, int n8) {
        block13: {
            int n9;
            block12: {
                if ((n8 = (n8 & 1) != 0 ? 1 : 0) != 0) {
                    n9 = g8.M();
                    n9 = g8.g() + n9;
                } else {
                    n9 = -1;
                }
                if (!this.f) break block12;
                if (n8 == 0) break block13;
                this.f = false;
                g8.b0(n9);
                this.d = 0;
            }
            while (g8.a() > 0) {
                n8 = this.d;
                if (n8 < 3) {
                    if (n8 == 0) {
                        n8 = g8.M();
                        g8.b0(g8.g() - 1);
                        if (n8 == 255) {
                            this.f = true;
                            return;
                        }
                    }
                    n8 = Math.min(g8.a(), 3 - this.d);
                    g8.q(this.b.f(), this.d, n8);
                    this.d = n8 = this.d + n8;
                    if (n8 != 3) continue;
                    this.b.b0(0);
                    this.b.a0(3);
                    this.b.c0(1);
                    n8 = this.b.M();
                    n9 = this.b.M();
                    boolean bl = (n8 & 0x80) != 0;
                    this.e = bl;
                    this.c = ((n8 & 0xF) << 8 | n9) + 3;
                    n8 = this.b.b();
                    if (n8 >= (n9 = this.c)) continue;
                    n8 = Math.min(4098, Math.max(n9, this.b.b() * 2));
                    this.b.d(n8);
                    continue;
                }
                n8 = Math.min(g8.a(), this.c - this.d);
                g8.q(this.b.f(), this.d, n8);
                this.d = n9 = this.d + n8;
                n8 = this.c;
                if (n9 != n8) continue;
                if (this.e) {
                    if (d0.x(this.b.f(), 0, this.c, -1) != 0) {
                        this.f = true;
                        return;
                    }
                    this.b.a0(this.c - 4);
                } else {
                    this.b.a0(n8);
                }
                this.b.b0(0);
                this.a.c(this.b);
                this.d = 0;
            }
        }
    }
}

