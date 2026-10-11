package ax.I9;

/* loaded from: classes3.dex */
public class c extends t implements w {
    public ax.H9.k j;
    public ax.H9.k k;
    public ax.H9.k l;
    public ax.H9.k m;
    public ax.H9.k n;
    public ax.H9.k o;
    public ax.H9.k p;
    private double r;
    private double t;
    private double u;
    private b q = b.IDLE;
    private double s = 1.0d;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.DELAYING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.ATTACKING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.HOLDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.DECAYING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.SUSTAINING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[b.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    enum b {
        IDLE,
        DELAYING,
        ATTACKING,
        HOLDING,
        DECAYING,
        SUSTAINING,
        RELEASING
    }

    public c() {
        ax.H9.k kVar = new ax.H9.k("Delay", 0.0d);
        this.j = kVar;
        f(kVar);
        this.j.C(0.0d, 0.0d, 2.0d);
        ax.H9.k kVar2 = new ax.H9.k("Attack", 0.1d);
        this.k = kVar2;
        f(kVar2);
        this.k.C(0.01d, 0.1d, 8.0d);
        ax.H9.k kVar3 = new ax.H9.k("Hold", 0.0d);
        this.l = kVar3;
        f(kVar3);
        this.l.C(0.0d, 0.0d, 2.0d);
        ax.H9.k kVar4 = new ax.H9.k("Decay", 0.2d);
        this.m = kVar4;
        f(kVar4);
        this.m.C(0.01d, 0.2d, 8.0d);
        ax.H9.k kVar5 = new ax.H9.k("Sustain", 0.5d);
        this.n = kVar5;
        f(kVar5);
        this.n.C(0.0d, 0.5d, 1.0d);
        ax.H9.k kVar6 = new ax.H9.k("Release", 0.3d);
        this.o = kVar6;
        f(kVar6);
        this.o.C(0.01d, 0.3d, 8.0d);
        ax.H9.k kVar7 = new ax.H9.k("Amplitude", 1.0d);
        this.p = kVar7;
        f(kVar7);
    }

    private void B(int i) {
        double d = this.k.l()[i];
        if (d < 1.0E-5d) {
            this.t = 1.0d;
            E(i);
        } else {
            this.u = m() / d;
            this.q = b.ATTACKING;
        }
    }

    private void C(int i) {
        double d = this.m.l()[i];
        if (d < 1.0E-5d) {
            H(i);
        } else {
            this.s = p().p(d);
            this.q = b.DECAYING;
        }
    }

    private void D(int i) {
        if (this.j.l()[i] <= 0.0d) {
            B(i);
        } else {
            this.r = (int) (r1 * n());
            this.q = b.DELAYING;
        }
    }

    private void E(int i) {
        if (this.l.l()[i] <= 0.0d) {
            C(i);
        } else {
            this.r = (int) (r1 * n());
            this.q = b.HOLDING;
        }
    }

    private void F() {
        this.q = b.IDLE;
        this.t = 0.0d;
    }

    private void G(int i) {
        double d = this.o.l()[i];
        if (d < 1.0E-5d) {
            d = 1.0E-5d;
        }
        this.s = p().p(d);
        this.q = b.RELEASING;
    }

    private void H(int i) {
        this.q = b.SUSTAINING;
    }

    public void A(C0739b c0739b, String str) {
        c0739b.g(this.k, str + this.k.b());
        c0739b.g(this.m, str + this.m.b());
        c0739b.g(this.n, str + this.n.b());
        c0739b.g(this.o, str + this.o.b());
    }

    @Override // ax.I9.u
    public void k(int i, int i2) {
        double[] l = this.n.l();
        double[] l2 = this.p.l();
        double[] l3 = this.i.l();
        while (i < i2) {
            boolean G = this.h.G(i);
            switch (a.a[this.q.ordinal()]) {
                case 1:
                    while (true) {
                        if (i < i2) {
                            l3[i] = this.t * l2[i];
                            if (G) {
                                D(i);
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        if (i < i2) {
                            l3[i] = this.t * l2[i];
                            if (this.h.I()) {
                                G(i);
                                break;
                            } else {
                                double d = this.r - 1.0d;
                                this.r = d;
                                if (d <= 0.0d) {
                                    B(i);
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    while (true) {
                        if (i < i2) {
                            double d2 = this.t + this.u;
                            this.t = d2;
                            if (d2 >= 1.0d) {
                                this.t = 1.0d;
                                l3[i] = 1.0d * l2[i];
                                E(i);
                                break;
                            } else {
                                l3[i] = d2 * l2[i];
                                if (this.h.I()) {
                                    G(i);
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                    break;
                case 4:
                    while (true) {
                        if (i < i2) {
                            l3[i] = l2[i];
                            double d3 = this.r - 1.0d;
                            this.r = d3;
                            if (d3 <= 0.0d) {
                                C(i);
                                break;
                            } else if (this.h.I()) {
                                G(i);
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    break;
                case 5:
                    while (true) {
                        if (i < i2) {
                            double d4 = this.t;
                            l3[i] = l2[i] * d4;
                            double d5 = d4 * this.s;
                            this.t = d5;
                            if (G) {
                                D(i);
                                break;
                            } else {
                                double d6 = l[i];
                                if (d5 < d6) {
                                    this.t = d6;
                                    H(i);
                                    break;
                                } else if (d5 < 1.5848931924611107E-5d) {
                                    this.h.F();
                                    F();
                                    break;
                                } else if (this.h.I()) {
                                    G(i);
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                    break;
                case 6:
                    while (true) {
                        if (i < i2) {
                            double d7 = l[i];
                            this.t = d7;
                            l3[i] = d7 * l2[i];
                            if (G) {
                                D(i);
                                break;
                            } else if (this.h.I()) {
                                G(i);
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    break;
                case 7:
                    while (true) {
                        if (i < i2) {
                            double d8 = this.t;
                            l3[i] = l2[i] * d8;
                            double d9 = d8 * this.s;
                            this.t = d9;
                            if (G) {
                                D(i);
                                break;
                            } else if (d9 < 1.5848931924611107E-5d) {
                                this.h.F();
                                F();
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    break;
            }
        }
    }
}
