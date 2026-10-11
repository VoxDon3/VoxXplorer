/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import ax.P0.E;
import ax.S0.F;
import ax.S0.G;
import ax.S0.M;
import ax.S0.a;
import ax.S0.u;
import ax.X1.L;
import ax.X1.m;
import ax.X1.n;
import ax.q1.t;

public final class y
implements L {
    private final m a;
    private final F b;
    private int c;
    private int d;
    private M e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;
    private long l;

    public y(m m8) {
        this.a = m8;
        this.b = new F(new byte[10]);
        this.c = 0;
    }

    private boolean e(G g8, byte[] byArray, int n8) {
        int n9 = Math.min(g8.a(), n8 - this.d);
        if (n9 <= 0) {
            return true;
        }
        if (byArray == null) {
            g8.c0(n9);
        } else {
            g8.q(byArray, this.d, n9);
        }
        this.d = n9 = this.d + n9;
        return n9 == n8;
    }

    private boolean f() {
        this.b.p(0);
        int n8 = this.b.h(24);
        if (n8 != 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected start code prefix: ");
            stringBuilder.append(n8);
            u.h("PesReader", stringBuilder.toString());
            this.j = -1;
            return false;
        }
        this.b.r(8);
        int n9 = this.b.h(16);
        this.b.r(5);
        this.k = this.b.g();
        this.b.r(2);
        this.f = this.b.g();
        this.g = this.b.g();
        this.b.r(6);
        this.i = n8 = this.b.h(8);
        if (n9 == 0) {
            this.j = -1;
        } else {
            this.j = n8 = n9 - 3 - n8;
            if (n8 < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Found negative packet payload size: ");
                stringBuilder.append(this.j);
                u.h("PesReader", stringBuilder.toString());
                this.j = -1;
            }
        }
        return true;
    }

    private void g() {
        this.b.p(0);
        this.l = -9223372036854775807L;
        if (this.f) {
            this.b.r(4);
            long l8 = this.b.h(3);
            this.b.r(1);
            long l9 = this.b.h(15) << 15;
            this.b.r(1);
            long l10 = this.b.h(15);
            this.b.r(1);
            if (!this.h && this.g) {
                this.b.r(4);
                long l11 = this.b.h(3);
                this.b.r(1);
                long l12 = this.b.h(15) << 15;
                this.b.r(1);
                long l13 = this.b.h(15);
                this.b.r(1);
                this.e.b(l11 << 30 | l12 | l13);
                this.h = true;
            }
            this.l = this.e.b(l8 << 30 | l9 | l10);
        }
    }

    private void h(int n8) {
        this.c = n8;
        this.d = 0;
    }

    @Override
    public void a(M m8, t t8, L.d d8) {
        this.e = m8;
        this.a.d(t8, d8);
    }

    @Override
    public void b() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.b();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void c(G g8, int n8) throws E {
        ax.S0.a.i(this.e);
        int n9 = n8;
        if ((n8 & 1) != 0) {
            n9 = this.c;
            if (n9 != 0 && n9 != 1) {
                if (n9 != 2) {
                    if (n9 != 3) throw new IllegalStateException();
                    if (this.j != -1) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unexpected start indicator: expected ");
                        stringBuilder.append(this.j);
                        stringBuilder.append(" more bytes");
                        u.h("PesReader", stringBuilder.toString());
                    }
                    boolean bl = g8.j() == 0;
                    this.a.e(bl);
                } else {
                    u.h("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.h(1);
            n9 = n8;
        }
        while (g8.a() > 0) {
            n8 = this.c;
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) throw new IllegalStateException();
                        int n10 = g8.a();
                        n8 = this.j;
                        int n11 = n8 == -1 ? 0 : n10 - n8;
                        n8 = n10;
                        if (n11 > 0) {
                            n8 = n10 - n11;
                            g8.a0(g8.g() + n8);
                        }
                        this.a.c(g8);
                        n11 = this.j;
                        if (n11 == -1) continue;
                        this.j = n8 = n11 - n8;
                        if (n8 != 0) continue;
                        this.a.e(false);
                        this.h(1);
                        continue;
                    }
                    n8 = Math.min(10, this.i);
                    if (!this.e(g8, this.b.a, n8) || !this.e(g8, null, this.i)) continue;
                    this.g();
                    n8 = this.k ? 4 : 0;
                    this.a.f(this.l, n9 |= n8);
                    this.h(3);
                    continue;
                }
                if (!this.e(g8, this.b.a, 9)) continue;
                n8 = this.f() ? 2 : 0;
                this.h(n8);
                continue;
            }
            g8.c0(g8.a());
        }
    }

    public boolean d(boolean bl) {
        boolean bl2 = !bl || this.f();
        return this.c == 3 && this.j == -1 && (!bl || !(this.a instanceof n)) && bl2;
    }
}

