/*
 * Decompiled with CFR 0.152.
 */
package ax.I;

import ax.E.d;
import ax.H.d;
import ax.H.e;
import ax.H.f;
import ax.H.h;
import ax.H.i;
import ax.H.k;
import ax.H.l;
import java.util.ArrayList;

public class b {
    private final ArrayList<e> a = new ArrayList();
    private a b = new a();
    private f c;

    public b(f f8) {
        this.c = f8;
    }

    private boolean a(b object, e e8, int n8) {
        this.b.a = e8.A();
        this.b.b = e8.T();
        this.b.c = e8.W();
        this.b.d = e8.x();
        a a8 = this.b;
        a8.i = false;
        a8.j = n8;
        e.b b8 = a8.a;
        e.b b9 = e.b.d0;
        boolean bl = b8 == b9;
        n8 = a8.b == b9 ? 1 : 0;
        bl = bl && e8.d0 > 0.0f;
        n8 = n8 != 0 && e8.d0 > 0.0f ? 1 : 0;
        if (bl && e8.y[0] == 4) {
            a8.a = e.b.q;
        }
        if (n8 != 0 && e8.y[1] == 4) {
            a8.b = e.b.q;
        }
        object.a(e8, a8);
        e8.k1(this.b.e);
        e8.L0(this.b.f);
        e8.K0(this.b.h);
        e8.A0(this.b.g);
        object = this.b;
        ((a)object).j = ax.I.b$a.k;
        return ((a)object).i;
    }

    private void b(f f8) {
        int n8 = f8.L0.size();
        boolean bl = f8.T1(64);
        b b8 = f8.I1();
        for (int i8 = 0; i8 < n8; ++i8) {
            boolean bl2;
            e e8;
            block13: {
                boolean bl3;
                boolean bl4;
                block14: {
                    Object object;
                    Object object2;
                    e8 = f8.L0.get(i8);
                    if (e8 instanceof h || e8 instanceof ax.H.a || e8.l0() || bl && (object2 = e8.e) != null && (object = e8.f) != null && object2.e.j && object.e.j) continue;
                    object2 = e8.u(0);
                    bl4 = true;
                    e.b b9 = e8.u(1);
                    object = e.b.d0;
                    bl3 = object2 == object && e8.w != 1 && b9 == object && e8.x != 1;
                    bl2 = bl3;
                    if (bl3) break block13;
                    bl2 = bl3;
                    if (!f8.T1(1)) break block13;
                    bl2 = bl3;
                    if (e8 instanceof l) break block13;
                    bl2 = bl3;
                    if (object2 == object) {
                        bl2 = bl3;
                        if (e8.w == 0) {
                            bl2 = bl3;
                            if (b9 != object) {
                                bl2 = bl3;
                                if (!e8.i0()) {
                                    bl2 = true;
                                }
                            }
                        }
                    }
                    bl3 = bl2;
                    if (b9 == object) {
                        bl3 = bl2;
                        if (e8.x == 0) {
                            bl3 = bl2;
                            if (object2 != object) {
                                bl3 = bl2;
                                if (!e8.i0()) {
                                    bl3 = true;
                                }
                            }
                        }
                    }
                    if (object2 == object) break block14;
                    bl2 = bl3;
                    if (b9 != object) break block13;
                }
                bl2 = bl3;
                if (e8.d0 > 0.0f) {
                    bl2 = bl4;
                }
            }
            if (bl2) continue;
            this.a(b8, e8, ax.I.b$a.k);
        }
        b8.b();
    }

    private void c(f f8, String string, int n8, int n9, int n10) {
        int n11 = f8.I();
        int n12 = f8.H();
        f8.a1(0);
        f8.Z0(0);
        f8.k1(n9);
        f8.L0(n10);
        f8.a1(n11);
        f8.Z0(n12);
        this.c.X1(n8);
        this.c.s1();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public long d(f f8, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16) {
        int n17;
        long l8;
        block52: {
            int n18;
            int n19;
            int n20;
            e.b b8;
            int n21;
            int n22;
            int n23;
            b b9;
            block51: {
                Object var20_22;
                b9 = f8.I1();
                n23 = f8.L0.size();
                n22 = f8.W();
                n21 = f8.x();
                boolean bl = k.b(n8, 128);
                n8 = !bl && !k.b(n8, 64) ? 0 : 1;
                if (n8 != 0) {
                    for (n9 = 0; n9 < n23; ++n9) {
                        e.b b10;
                        e e8 = f8.L0.get(n9);
                        b8 = e8.A();
                        n10 = b8 == (b10 = e.b.d0) ? 1 : 0;
                        n15 = e8.T() == b10 ? 1 : 0;
                        n10 = n10 != 0 && n15 != 0 && e8.v() > 0.0f ? 1 : 0;
                        if (!(e8.i0() && n10 != 0 || e8.k0() && n10 != 0 || e8 instanceof l || e8.i0()) && !e8.k0()) continue;
                        n8 = 0;
                        break;
                    }
                }
                if (n8 != 0) {
                    boolean bl2 = d.r;
                }
                if ((n16 = n8 & (n9 = n11 == 0x40000000 && n13 == 0x40000000 || bl ? 1 : 0)) != 0) {
                    Object var19_36;
                    n8 = Math.min(f8.G(), n12);
                    n9 = Math.min(f8.F(), n14);
                    if (n11 == 0x40000000 && f8.W() != n8) {
                        f8.k1(n8);
                        f8.M1();
                    }
                    if (n13 == 0x40000000 && f8.x() != n9) {
                        f8.L0(n9);
                        f8.M1();
                    }
                    if (n11 == 0x40000000 && n13 == 0x40000000) {
                        boolean bl3 = f8.F1(bl);
                        n8 = 2;
                    } else {
                        boolean bl4;
                        boolean bl5 = f8.G1(bl);
                        if (n11 == 0x40000000) {
                            bl4 = bl5 & f8.H1(bl, 0);
                            n8 = 1;
                        } else {
                            n8 = 0;
                        }
                        if (n13 == 0x40000000) {
                            boolean bl6 = f8.H1(bl, 1) & bl4;
                            ++n8;
                        }
                    }
                    void var20_16 = var19_36;
                    n9 = n8;
                    if (var19_36 != false) {
                        boolean var20_19;
                        if (n11 == 0x40000000) {
                            boolean bl7 = true;
                        } else {
                            boolean bl8 = false;
                        }
                        boolean bl9 = n13 == 0x40000000;
                        f8.p1((boolean)var20_19, bl9);
                        void var20_20 = var19_36;
                        n9 = n8;
                    }
                } else {
                    boolean bl10 = false;
                    n9 = 0;
                }
                l8 = 0L;
                if (var20_22 != false && n9 == 2) {
                    return 0L;
                }
                n17 = f8.J1();
                if (n23 > 0) {
                    this.b(f8);
                }
                this.e(f8);
                n20 = this.a.size();
                if (n23 > 0) {
                    this.c(f8, "First pass", 0, n22, n21);
                }
                if (n20 > 0) break block51;
                l8 = 0L;
                break block52;
            }
            e.b b11 = f8.A();
            n14 = b11 == (b8 = e.b.c0) ? 1 : 0;
            n15 = f8.T() == b8 ? 1 : 0;
            n9 = Math.max(f8.W(), this.c.I());
            n8 = Math.max(f8.x(), this.c.H());
            n10 = 0;
            for (n12 = 0; n12 < n20; ++n12) {
                e e9 = this.a.get(n12);
                if (!(e9 instanceof l)) {
                    n11 = n9;
                } else {
                    n19 = e9.W();
                    n13 = e9.x();
                    n11 = n10 | this.a(b9, e9, ax.I.b$a.l);
                    n18 = e9.W();
                    n23 = e9.x();
                    n10 = n9;
                    if (n18 != n19) {
                        e9.k1(n18);
                        n10 = n9;
                        if (n14 != 0) {
                            n10 = n9;
                            if (e9.M() > n9) {
                                n10 = Math.max(n9, e9.M() + e9.o(d.b.e0).f());
                            }
                        }
                        n11 = 1;
                    }
                    n9 = n8;
                    if (n23 != n13) {
                        e9.L0(n23);
                        n9 = n8;
                        if (n15 != 0) {
                            n9 = n8;
                            if (e9.r() > n8) {
                                n9 = Math.max(n8, e9.r() + e9.o(d.b.f0).f());
                            }
                        }
                        n11 = 1;
                    }
                    n13 = n11 | ((l)e9).F1();
                    n11 = n10;
                    n8 = n9;
                    n10 = n13;
                }
                n9 = n11;
            }
            n23 = 0;
            while (n23 < 2) {
                for (n19 = 0; n19 < n20; ++n19) {
                    block54: {
                        e e10;
                        block53: {
                            e10 = this.a.get(n19);
                            if (!(e10 instanceof i)) break block53;
                            n13 = n9;
                            n11 = n8;
                            n12 = n10;
                            if (!(e10 instanceof l)) break block54;
                        }
                        if (e10 instanceof h) {
                            n13 = n9;
                            n11 = n8;
                            n12 = n10;
                        } else if (e10.V() == 8) {
                            n13 = n9;
                            n11 = n8;
                            n12 = n10;
                        } else if (n16 != 0 && e10.e.e.j && e10.f.e.j) {
                            n13 = n9;
                            n11 = n8;
                            n12 = n10;
                        } else if (e10 instanceof l) {
                            n12 = n10;
                            n11 = n8;
                            n13 = n9;
                        } else {
                            int n24 = e10.W();
                            n13 = e10.x();
                            n12 = e10.p();
                            n11 = ax.I.b$a.l;
                            if (n23 == 1) {
                                n11 = ax.I.b$a.m;
                            }
                            int n25 = this.a(b9, e10, n11);
                            n11 = e10.W();
                            n18 = e10.x();
                            if (n11 != n24) {
                                e10.k1(n11);
                                n10 = n9;
                                if (n14 != 0) {
                                    n10 = n9;
                                    if (e10.M() > n9) {
                                        n10 = Math.max(n9, e10.M() + e10.o(d.b.e0).f());
                                    }
                                }
                                n11 = 1;
                                n9 = n10;
                            } else {
                                n11 = n10 | n25;
                            }
                            n10 = n8;
                            if (n18 != n13) {
                                e10.L0(n18);
                                n10 = n8;
                                if (n15 != 0) {
                                    n10 = n8;
                                    if (e10.r() > n8) {
                                        n10 = Math.max(n8, e10.r() + e10.o(d.b.f0).f());
                                    }
                                }
                                n11 = 1;
                            }
                            if (e10.Z() && n12 != e10.p()) {
                                n11 = 1;
                                n8 = n10;
                                n10 = n11;
                                continue;
                            }
                            n12 = n11;
                            n13 = n9;
                            n11 = n10;
                        }
                    }
                    n9 = n13;
                    n8 = n11;
                    n10 = n12;
                }
                if (n10 == 0) break;
                this.c(f8, "intermediate pass", ++n23, n22, n21);
                n10 = 0;
            }
        }
        f8.W1(n17);
        return l8;
    }

    public void e(f f8) {
        this.a.clear();
        int n8 = f8.L0.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            e.b b8;
            e e8 = f8.L0.get(i8);
            e.b b9 = e8.A();
            if (b9 != (b8 = e.b.d0) && e8.T() != b8) continue;
            this.a.add(e8);
        }
        f8.M1();
    }

    public static class a {
        public static int k = 0;
        public static int l = 1;
        public static int m = 2;
        public e.b a;
        public e.b b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public int j;
    }

    public static interface b {
        public void a(e var1, a var2);

        public void b();
    }
}

