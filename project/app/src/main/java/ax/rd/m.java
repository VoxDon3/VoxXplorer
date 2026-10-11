/*
 * Decompiled with CFR 0.152.
 */
package ax.rd;

import ax.Nd.i;
import ax.Wc.A;
import ax.Wc.A0;
import ax.Wc.D;
import ax.Wc.J;
import ax.Wc.g;
import ax.Wc.h;
import ax.Wc.k0;
import ax.Wc.q;
import ax.Wc.t;
import ax.Wc.x0;
import ax.pd.c;
import ax.rd.a;
import ax.rd.f;
import ax.rd.l;
import ax.rd.n;

public class m
extends t {
    q c0;
    q d0;
    a e0;
    c f0;
    n g0;
    n h0;
    c i0;
    l j0;
    ax.Wc.c k0;
    ax.Wc.c l0;
    f m0;
    D q;

    /*
     * Unable to fully structure code
     */
    private m(D var1_1) {
        block13: {
            block11: {
                block12: {
                    super();
                    this.q = var1_1;
                    if (var1_1.I(0) instanceof J) {
                        this.c0 = ax.Wc.q.D((J)var1_1.I(0), true);
                        var3_2 = 0;
                    } else {
                        this.c0 = new q(0L);
                        var3_2 = -1;
                    }
                    if (this.c0.I(0)) {
                        var2_3 = 1;
lbl11:
                        // 2 sources

                        while (true) {
                            var5_4 = 0;
                            var4_5 = var2_3;
                            var2_3 = var5_4;
                            break block11;
                            break;
                        }
                    }
                    if (!this.c0.I(1)) break block12;
                    var4_5 = 0;
                    var2_3 = 1;
                    break block11;
                }
                if (this.c0.I(2)) {
                    var2_3 = 0;
                    ** continue;
                }
                break block13;
            }
            this.d0 = ax.Wc.q.E(var1_1.I(var3_2 + 1));
            this.e0 = a.t(var1_1.I(var3_2 + 2));
            this.f0 = c.r(var1_1.I(var3_2 + 3));
            var7_6 = (D)var1_1.I(var3_2 + 4);
            this.g0 = n.r(var7_6.I(0));
            this.h0 = n.r(var7_6.I(1));
            this.i0 = c.r(var1_1.I(var3_2 + 5));
            var6_7 = var3_2 + 6;
            this.j0 = l.r(var1_1.I(var6_7));
            var3_2 = var5_4 = var1_1.size() - var6_7 - 1;
            if (var5_4 != 0) {
                if (var4_5 == 0) {
                    var3_2 = var5_4;
                } else {
                    throw new IllegalArgumentException("version 1 certificate contains extra data");
                }
            }
            while (var3_2 > 0) {
                block15: {
                    block14: {
                        var7_6 = (J)var1_1.I(var6_7 + var3_2);
                        var4_5 = var7_6.M();
                        if (var4_5 == 1) break block14;
                        if (var4_5 == 2) ** GOTO lbl57
                        if (var4_5 != 3) ** GOTO lbl51
                        if (var2_3 == 0) {
                            this.m0 = f.s(D.E((J)var7_6, true));
                        } else {
                            throw new IllegalArgumentException("version 2 certificate cannot contain extensions");
lbl51:
                            // 1 sources

                            var1_1 = new StringBuilder();
                            var1_1.append("Unknown tag encountered in structure: ");
                            var1_1.append(var7_6.M());
                            throw new IllegalArgumentException(var1_1.toString());
lbl57:
                            // 1 sources

                            this.l0 = ax.Wc.k0.N((J)var7_6, false);
                        }
                        break block15;
                    }
                    this.k0 = ax.Wc.k0.N((J)var7_6, false);
                }
                --var3_2;
            }
            return;
        }
        throw new IllegalArgumentException("version number not recognised");
    }

    public static m s(Object object) {
        if (object instanceof m) {
            return (m)object;
        }
        if (object != null) {
            return new m(D.G(object));
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public A g() {
        if (i.a("org.bouncycastle.x509.allow_non-der_tbscert") == null) {
            return this.q;
        }
        if (i.b("org.bouncycastle.x509.allow_non-der_tbscert")) {
            return this.q;
        }
        h h8 = new h();
        if (!this.c0.I(0)) {
            h8.a(new A0(true, 0, this.c0));
        }
        h8.a(this.d0);
        h8.a(this.e0);
        h8.a(this.f0);
        Object object = new h(2);
        ((h)object).a(this.g0);
        ((h)object).a(this.h0);
        h8.a(new x0((h)object));
        object = this.i0;
        if (object == null) {
            object = new x0();
        }
        h8.a((g)object);
        h8.a(this.j0);
        object = this.k0;
        if (object != null) {
            h8.a(new A0(false, 1, (g)object));
        }
        if ((object = this.l0) != null) {
            h8.a(new A0(false, 2, (g)object));
        }
        if ((object = this.m0) != null) {
            h8.a(new A0(true, 3, (g)object));
        }
        return new x0(h8);
    }

    public f r() {
        return this.m0;
    }
}

