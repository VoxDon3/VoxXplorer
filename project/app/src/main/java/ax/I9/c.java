/*
 * Decompiled with CFR 0.152.
 */
package ax.I9;

import ax.H9.k;
import ax.H9.m;
import ax.I9.t;
import ax.I9.w;

public class c
extends t
implements w {
    public k j;
    public k k;
    public k l;
    public k m;
    public k n;
    public k o;
    public k p;
    private b q = b.q;
    private double r;
    private double s = 1.0;
    private double t;
    private double u;

    public c() {
        k k8;
        this.j = k8 = new k("Delay", 0.0);
        this.f(k8);
        this.j.C(0.0, 0.0, 2.0);
        this.k = k8 = new k("Attack", 0.1);
        this.f(k8);
        this.k.C(0.01, 0.1, 8.0);
        this.l = k8 = new k("Hold", 0.0);
        this.f(k8);
        this.l.C(0.0, 0.0, 2.0);
        this.m = k8 = new k("Decay", 0.2);
        this.f(k8);
        this.m.C(0.01, 0.2, 8.0);
        this.n = k8 = new k("Sustain", 0.5);
        this.f(k8);
        this.n.C(0.0, 0.5, 1.0);
        this.o = k8 = new k("Release", 0.3);
        this.f(k8);
        this.o.C(0.01, 0.3, 8.0);
        this.p = k8 = new k("Amplitude", 1.0);
        this.f(k8);
    }

    private void B(int n8) {
        double d8 = this.k.l()[n8];
        if (d8 < 1.0E-5) {
            this.t = 1.0;
            this.E(n8);
            return;
        }
        this.u = this.m() / d8;
        this.q = b.d0;
    }

    private void C(int n8) {
        double d8 = this.m.l()[n8];
        if (d8 < 1.0E-5) {
            this.H(n8);
            return;
        }
        this.s = this.p().p(d8);
        this.q = b.f0;
    }

    private void D(int n8) {
        double d8 = this.j.l()[n8];
        if (d8 <= 0.0) {
            this.B(n8);
            return;
        }
        this.r = (int)(d8 * (double)this.n());
        this.q = b.c0;
    }

    private void E(int n8) {
        double d8 = this.l.l()[n8];
        if (d8 <= 0.0) {
            this.C(n8);
            return;
        }
        this.r = (int)(d8 * (double)this.n());
        this.q = b.e0;
    }

    private void F() {
        this.q = b.q;
        this.t = 0.0;
    }

    private void G(int n8) {
        double d8;
        double d9 = d8 = this.o.l()[n8];
        if (d8 < 1.0E-5) {
            d9 = 1.0E-5;
        }
        this.s = this.p().p(d9);
        this.q = b.h0;
    }

    private void H(int n8) {
        this.q = b.g0;
    }

    public void A(ax.I9.b b8, String string) {
        Object object = this.k;
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append(string);
        ((StringBuilder)object2).append(this.k.b());
        b8.g((m)object, ((StringBuilder)object2).toString());
        object = this.m;
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(string);
        ((StringBuilder)object2).append(this.m.b());
        b8.g((m)object, ((StringBuilder)object2).toString());
        object = this.n;
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(string);
        ((StringBuilder)object2).append(this.n.b());
        b8.g((m)object, ((StringBuilder)object2).toString());
        object2 = this.o;
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(this.o.b());
        b8.g((m)object2, ((StringBuilder)object).toString());
    }

    @Override
    public void k(int n8, int n9) {
        double[] dArray = this.n.l();
        double[] dArray2 = this.p.l();
        double[] dArray3 = this.i.l();
        block9: while (n8 < n9) {
            boolean bl = this.h.G(n8);
            int n10 = n8;
            int n11 = n8;
            int n12 = n8;
            int n13 = n8;
            int n14 = n8;
            int n15 = n8;
            int n16 = n8;
            switch (ax.I9.c$a.a[this.q.ordinal()]) {
                default: {
                    continue block9;
                }
                case 7: {
                    double d8;
                    while (true) {
                        n8 = ++n10;
                        if (n10 >= n9) continue block9;
                        d8 = this.t;
                        dArray3[n10] = dArray2[n10] * d8;
                        this.t = d8 *= this.s;
                        if (bl) {
                            this.D(n10);
                            n8 = n10;
                            continue block9;
                        }
                        if (!(d8 < 1.5848931924611107E-5)) continue;
                        this.h.F();
                        this.F();
                        n8 = n10;
                        continue block9;
                    }
                }
                case 6: {
                    double d8;
                    while (true) {
                        n8 = ++n11;
                        if (n11 >= n9) continue block9;
                        this.t = d8 = dArray[n11];
                        dArray3[n11] = d8 * dArray2[n11];
                        if (bl) {
                            this.D(n11);
                            n8 = n11;
                            continue block9;
                        }
                        if (!this.h.I()) continue;
                        this.G(n11);
                        n8 = n11;
                        continue block9;
                    }
                }
                case 5: {
                    double d8;
                    while (true) {
                        double d9;
                        n8 = ++n12;
                        if (n12 >= n9) continue block9;
                        d8 = this.t;
                        dArray3[n12] = dArray2[n12] * d8;
                        this.t = d9 = d8 * this.s;
                        if (bl) {
                            this.D(n12);
                            n8 = n12;
                            continue block9;
                        }
                        d8 = dArray[n12];
                        if (d9 < d8) {
                            this.t = d8;
                            this.H(n12);
                            n8 = n12;
                            continue block9;
                        }
                        if (d9 < 1.5848931924611107E-5) {
                            this.h.F();
                            this.F();
                            n8 = n12;
                            continue block9;
                        }
                        if (!this.h.I()) continue;
                        this.G(n12);
                        n8 = n12;
                        continue block9;
                    }
                }
                case 4: {
                    double d8;
                    while (true) {
                        n8 = ++n13;
                        if (n13 >= n9) continue block9;
                        dArray3[n13] = dArray2[n13];
                        this.r = d8 = this.r - 1.0;
                        if (d8 <= 0.0) {
                            this.C(n13);
                            n8 = n13;
                            continue block9;
                        }
                        if (!this.h.I()) continue;
                        this.G(n13);
                        n8 = n13;
                        continue block9;
                    }
                }
                case 3: {
                    double d8;
                    while (true) {
                        n8 = ++n14;
                        if (n14 >= n9) continue block9;
                        this.t = d8 = this.t + this.u;
                        if (d8 >= 1.0) {
                            this.t = 1.0;
                            dArray3[n14] = 1.0 * dArray2[n14];
                            this.E(n14);
                            n8 = n14;
                            continue block9;
                        }
                        dArray3[n14] = d8 * dArray2[n14];
                        if (!this.h.I()) continue;
                        this.G(n14);
                        n8 = n14;
                        continue block9;
                    }
                }
                case 2: {
                    double d8;
                    while (true) {
                        n8 = ++n15;
                        if (n15 >= n9) continue block9;
                        dArray3[n15] = this.t * dArray2[n15];
                        if (this.h.I()) {
                            this.G(n15);
                            n8 = n15;
                            continue block9;
                        }
                        this.r = d8 = this.r - 1.0;
                        if (!(d8 <= 0.0)) continue;
                        this.B(n15);
                        n8 = n15;
                        continue block9;
                    }
                }
                case 1: 
            }
            while (true) {
                n8 = ++n16;
                if (n16 >= n9) continue block9;
                dArray3[n16] = this.t * dArray2[n16];
                if (!bl) continue;
                this.D(n16);
                n8 = n16;
                continue block9;
            }
        }
    }

    static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        public static final /* enum */ b d0;
        public static final /* enum */ b e0;
        public static final /* enum */ b f0;
        public static final /* enum */ b g0;
        public static final /* enum */ b h0;
        private static final b[] i0;
        public static final /* enum */ b q;

        static {
            b b8;
            b b9;
            b b10;
            b b11;
            b b12;
            b b13;
            b b14;
            q = b14 = new b();
            c0 = b13 = new b();
            d0 = b12 = new b();
            e0 = b11 = new b();
            f0 = b10 = new b();
            g0 = b9 = new b();
            h0 = b8 = new b();
            i0 = new b[]{b14, b13, b12, b11, b10, b9, b8};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])i0.clone();
        }
    }
}

