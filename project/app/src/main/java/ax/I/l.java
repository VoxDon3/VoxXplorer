/*
 * Decompiled with CFR 0.152.
 */
package ax.I;

import ax.H.d;
import ax.H.e;
import ax.H.i;
import ax.I.d;
import ax.I.f;
import ax.I.g;
import ax.I.n;
import ax.I.p;

public class l
extends p {
    private static int[] k = new int[2];

    public l(e e8) {
        super(e8);
        this.h.e = f.a.e0;
        this.i.e = f.a.f0;
        this.f = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void q(int[] nArray, int n8, int n9, int n10, int n11, float f8, int n12) {
        n8 = n9 - n8;
        n9 = n11 - n10;
        if (n12 != -1) {
            if (n12 != 0) {
                if (n12 != 1) return;
                n9 = (int)((float)n8 * f8 + 0.5f);
                nArray[0] = n8;
                nArray[1] = n9;
                return;
            }
            nArray[0] = (int)((float)n9 * f8 + 0.5f);
            nArray[1] = n9;
            return;
        }
        n10 = (int)((float)n9 * f8 + 0.5f);
        n11 = (int)((float)n8 / f8 + 0.5f);
        if (n10 <= n8) {
            nArray[0] = n10;
            nArray[1] = n9;
            return;
        }
        if (n11 > n9) return;
        nArray[0] = n8;
        nArray[1] = n11;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(d object) {
        int n8;
        int n9;
        d d8;
        float f8;
        int n10;
        block31: {
            Object object2;
            block32: {
                block42: {
                    block43: {
                        int n11;
                        int n12;
                        block41: {
                            block40: {
                                int n13;
                                int n14;
                                int n15;
                                int n16;
                                block33: {
                                    block37: {
                                        block39: {
                                            float f9;
                                            block38: {
                                                block34: {
                                                    block35: {
                                                        block36: {
                                                            n10 = ax.I.l$a.a[this.j.ordinal()];
                                                            if (n10 != 1) {
                                                                if (n10 != 2) {
                                                                    if (n10 == 3) {
                                                                        e e8 = this.b;
                                                                        this.n((d)object, e8.O, e8.Q, 0);
                                                                        return;
                                                                    }
                                                                } else {
                                                                    this.o((d)object);
                                                                }
                                                            } else {
                                                                this.p((d)object);
                                                            }
                                                            if (this.e.j || this.d != e.b.d0) break block31;
                                                            object2 = this.b;
                                                            n10 = ((e)object2).w;
                                                            if (n10 == 2) break block32;
                                                            if (n10 != 3) break block31;
                                                            n10 = ((e)object2).x;
                                                            if (n10 == 0 || n10 == 3) break block33;
                                                            n10 = ((e)object2).w();
                                                            if (n10 == -1) break block34;
                                                            if (n10 == 0) break block35;
                                                            if (n10 == 1) break block36;
                                                            n10 = 0;
                                                            break block37;
                                                        }
                                                        object = this.b;
                                                        f8 = ((e)object).f.e.g;
                                                        f9 = ((e)object).v();
                                                        break block38;
                                                    }
                                                    object = this.b;
                                                    f8 = (float)((e)object).f.e.g / ((e)object).v();
                                                    break block39;
                                                }
                                                object = this.b;
                                                f8 = ((e)object).f.e.g;
                                                f9 = ((e)object).v();
                                            }
                                            f8 *= f9;
                                        }
                                        n10 = (int)(f8 + 0.5f);
                                    }
                                    this.e.d(n10);
                                    break block31;
                                }
                                d8 = ((e)object2).f;
                                object = ((p)d8).h;
                                d8 = ((p)d8).i;
                                n10 = ((e)object2).O.f != null ? 1 : 0;
                                n9 = ((e)object2).P.f != null ? 1 : 0;
                                n8 = ((e)object2).Q.f != null ? 1 : 0;
                                n12 = ((e)object2).R.f != null ? 1 : 0;
                                n11 = ((e)object2).w();
                                if (n10 == 0 || n9 == 0 || n8 == 0 || n12 == 0) break block40;
                                f8 = this.b.v();
                                if (((f)object).j && ((f)d8).j) {
                                    object2 = this.h;
                                    if (!((f)object2).c) return;
                                    if (!this.i.c) {
                                        return;
                                    }
                                    int n17 = ((f)object2).l.get((int)0).g;
                                    int n18 = this.h.f;
                                    n8 = this.i.l.get((int)0).g;
                                    int n19 = this.i.f;
                                    n12 = ((f)object).g;
                                    n9 = ((f)object).f;
                                    int n20 = ((f)d8).g;
                                    n10 = ((f)d8).f;
                                    this.q(k, n18 + n17, n8 - n19, n9 + n12, n20 - n10, f8, n11);
                                    this.e.d(k[0]);
                                    this.b.f.e.d(k[1]);
                                    return;
                                }
                                object2 = this.h;
                                if (((f)object2).j) {
                                    f f10 = this.i;
                                    if (f10.j) {
                                        if (!((f)object).c) return;
                                        if (!((f)d8).c) {
                                            return;
                                        }
                                        n16 = ((f)object2).g;
                                        n8 = ((f)object2).f;
                                        n15 = f10.g;
                                        n14 = f10.f;
                                        n13 = ((f)object).l.get((int)0).g;
                                        n10 = ((f)object).f;
                                        n12 = ((f)d8).l.get((int)0).g;
                                        n9 = ((f)d8).f;
                                        this.q(k, n16 + n8, n15 - n14, n10 + n13, n12 - n9, f8, n11);
                                        this.e.d(k[0]);
                                        this.b.f.e.d(k[1]);
                                    }
                                }
                                object2 = this.h;
                                if (!((f)object2).c) return;
                                if (!this.i.c) return;
                                if (!((f)object).c) return;
                                if (!((f)d8).c) {
                                    return;
                                }
                                n9 = ((f)object2).l.get((int)0).g;
                                n14 = this.h.f;
                                n15 = this.i.l.get((int)0).g;
                                n8 = this.i.f;
                                n16 = ((f)object).l.get((int)0).g;
                                n13 = ((f)object).f;
                                n12 = ((f)d8).l.get((int)0).g;
                                n10 = ((f)d8).f;
                                this.q(k, n14 + n9, n15 - n8, n13 + n16, n12 - n10, f8, n11);
                                this.e.d(k[0]);
                                this.b.f.e.d(k[1]);
                                break block31;
                            }
                            if (n10 == 0 || n8 == 0) break block41;
                            if (!this.h.c) return;
                            if (!this.i.c) {
                                return;
                            }
                            f8 = this.b.v();
                            n10 = this.h.l.get((int)0).g + this.h.f;
                            n9 = this.i.l.get((int)0).g - this.i.f;
                            if (n11 != -1 && n11 != 0) {
                                if (n11 == 1) {
                                    n8 = (int)((float)(n10 = this.g(n9 - n10, 0)) / f8 + 0.5f);
                                    if (n8 != (n9 = this.g(n8, 1))) {
                                        n10 = (int)((float)n9 * f8 + 0.5f);
                                    }
                                    this.e.d(n10);
                                    this.b.f.e.d(n9);
                                }
                                break block31;
                            } else {
                                n8 = (int)((float)(n10 = this.g(n9 - n10, 0)) * f8 + 0.5f);
                                if (n8 != (n9 = this.g(n8, 1))) {
                                    n10 = (int)((float)n9 / f8 + 0.5f);
                                }
                                this.e.d(n10);
                                this.b.f.e.d(n9);
                            }
                            break block31;
                        }
                        if (n9 == 0 || n12 == 0) break block31;
                        if (!((f)object).c) return;
                        if (!((f)d8).c) {
                            return;
                        }
                        f8 = this.b.v();
                        n10 = ((f)object).l.get((int)0).g + ((f)object).f;
                        n9 = ((f)d8).l.get((int)0).g - ((f)d8).f;
                        if (n11 == -1) break block42;
                        if (n11 == 0) break block43;
                        if (n11 == 1) break block42;
                        break block31;
                    }
                    n8 = (int)((float)(n10 = this.g(n9 - n10, 1)) * f8 + 0.5f);
                    if (n8 != (n9 = this.g(n8, 0))) {
                        n10 = (int)((float)n9 / f8 + 0.5f);
                    }
                    this.e.d(n9);
                    this.b.f.e.d(n10);
                    break block31;
                }
                if ((n8 = (int)((float)(n10 = this.g(n9 - n10, 1)) / f8 + 0.5f)) != (n9 = this.g(n8, 0))) {
                    n10 = (int)((float)n9 * f8 + 0.5f);
                }
                this.e.d(n9);
                this.b.f.e.d(n10);
                break block31;
            }
            object = ((e)object2).K();
            if (object != null) {
                object = ((e)object).e.e;
                if (((f)object).j) {
                    f8 = this.b.B;
                    n10 = (int)((float)((f)object).g * f8 + 0.5f);
                    this.e.d(n10);
                }
            }
        }
        object = this.h;
        if (!((f)object).c) return;
        d8 = this.i;
        if (!((f)d8).c) {
            return;
        }
        if (((f)object).j && ((f)d8).j && this.e.j) {
            return;
        }
        if (!this.e.j && this.d == e.b.d0) {
            object = this.b;
            if (((e)object).w == 0 && !((e)object).i0()) {
                d8 = this.h.l.get(0);
                object = this.i.l.get(0);
                n10 = ((f)d8).g;
                d8 = this.h;
                n9 = ((f)object).g + this.i.f;
                ((f)d8).d(n10 += ((f)d8).f);
                this.i.d(n9);
                this.e.d(n9 - n10);
                return;
            }
        }
        if (!this.e.j && this.d == e.b.d0 && this.a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
            d8 = this.h.l.get(0);
            object = this.i.l.get(0);
            n10 = ((f)d8).g;
            n9 = this.h.f;
            n10 = Math.min(((f)object).g + this.i.f - (n10 + n9), this.e.m);
            object = this.b;
            n8 = ((e)object).A;
            n10 = n9 = Math.max(((e)object).z, n10);
            if (n8 > 0) {
                n10 = Math.min(n8, n9);
            }
            this.e.d(n10);
        }
        if (!this.e.j) {
            return;
        }
        object = this.h.l.get(0);
        d8 = this.i.l.get(0);
        n9 = ((f)object).g + this.h.f;
        n10 = ((f)d8).g + this.i.f;
        f8 = this.b.y();
        if (object == d8) {
            n9 = ((f)object).g;
            n10 = ((f)d8).g;
            f8 = 0.5f;
        }
        n8 = this.e.g;
        this.h.d((int)((float)n9 + 0.5f + (float)(n10 - n9 - n8) * f8));
        this.i.d(this.h.g + this.e.g);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    void d() {
        Object object;
        e e8 = this.b;
        if (e8.a) {
            this.e.d(e8.W());
        }
        if (!this.e.j) {
            e.b b8;
            this.d = b8 = this.b.A();
            if (b8 != e.b.d0) {
                e e9;
                e.b b9 = e.b.e0;
                if (b8 == b9 && (e9 = this.b.K()) != null && (e9.A() == e.b.q || e9.A() == b9)) {
                    int n8 = e9.W();
                    int n9 = this.b.O.f();
                    int n10 = this.b.Q.f();
                    this.b(this.h, e9.e.h, this.b.O.f());
                    this.b(this.i, e9.e.i, -this.b.Q.f());
                    this.e.d(n8 - n9 - n10);
                    return;
                }
                if (this.d == e.b.q) {
                    this.e.d(this.b.W());
                }
            }
        } else {
            e e10;
            e.b b10 = this.d;
            e.b b11 = e.b.e0;
            if (b10 == b11 && (e10 = this.b.K()) != null && (e10.A() == e.b.q || e10.A() == b11)) {
                this.b(this.h, e10.e.h, this.b.O.f());
                this.b(this.i, e10.e.i, -this.b.Q.f());
                return;
            }
        }
        g g8 = this.e;
        if (g8.j) {
            e e11 = this.b;
            if (e11.a) {
                ax.H.d[] dArray = e11.W;
                ax.H.d d8 = dArray[0];
                ax.H.d d9 = d8.f;
                if (d9 != null && dArray[1].f != null) {
                    f f8;
                    if (e11.i0()) {
                        this.h.f = this.b.W[0].f();
                        this.i.f = -this.b.W[1].f();
                        return;
                    }
                    f f9 = this.h(this.b.W[0]);
                    if (f9 != null) {
                        this.b(this.h, f9, this.b.W[0].f());
                    }
                    if ((f8 = this.h(this.b.W[1])) != null) {
                        this.b(this.i, f8, -this.b.W[1].f());
                    }
                    this.h.b = true;
                    this.i.b = true;
                    return;
                }
                if (d9 != null) {
                    f f10 = this.h(d8);
                    if (f10 == null) return;
                    this.b(this.h, f10, this.b.W[0].f());
                    this.b(this.i, this.h, this.e.g);
                    return;
                }
                ax.H.d d10 = dArray[1];
                if (d10.f != null) {
                    f f11 = this.h(d10);
                    if (f11 == null) return;
                    this.b(this.i, f11, -this.b.W[1].f());
                    this.b(this.h, this.i, -this.e.g);
                    return;
                }
                if (e11 instanceof i || e11.K() == null || this.b.o((d.b)d.b.h0).f != null) return;
                f f12 = this.b.K().e.h;
                this.b(this.h, f12, this.b.X());
                this.b(this.i, this.h, this.e.g);
                return;
            }
        }
        if (this.d == e.b.d0) {
            e e12 = this.b;
            int n11 = e12.w;
            if (n11 != 2) {
                if (n11 == 3) {
                    if (e12.x == 3) {
                        this.h.a = this;
                        this.i.a = this;
                        object = e12.f;
                        ((p)object).h.a = this;
                        ((p)object).i.a = this;
                        g8.a = this;
                        if (e12.k0()) {
                            this.e.l.add(this.b.f.e);
                            this.b.f.e.k.add(this.e);
                            n n12 = this.b.f;
                            n12.e.a = this;
                            this.e.l.add(n12.h);
                            this.e.l.add(this.b.f.i);
                            this.b.f.h.k.add(this.e);
                            this.b.f.i.k.add(this.e);
                        } else if (this.b.i0()) {
                            this.b.f.e.l.add(this.e);
                            this.e.k.add(this.b.f.e);
                        } else {
                            this.b.f.e.l.add(this.e);
                        }
                    } else {
                        g g9 = e12.f.e;
                        g8.l.add(g9);
                        g9.k.add(this.e);
                        this.b.f.h.k.add(this.e);
                        this.b.f.i.k.add(this.e);
                        g g10 = this.e;
                        g10.b = true;
                        g10.k.add(this.h);
                        this.e.k.add(this.i);
                        this.h.l.add(this.e);
                        this.i.l.add(this.e);
                    }
                }
            } else {
                e e13 = e12.K();
                if (e13 != null) {
                    g g11 = e13.f.e;
                    this.e.l.add(g11);
                    g11.k.add(this.e);
                    g g12 = this.e;
                    g12.b = true;
                    g12.k.add(this.h);
                    this.e.k.add(this.i);
                }
            }
        }
        e e14 = this.b;
        ax.H.d[] dArray = e14.W;
        ax.H.d d11 = dArray[0];
        object = d11.f;
        if (object != null && dArray[1].f != null) {
            if (e14.i0()) {
                this.h.f = this.b.W[0].f();
                this.i.f = -this.b.W[1].f();
                return;
            }
            f f13 = this.h(this.b.W[0]);
            f f14 = this.h(this.b.W[1]);
            if (f13 != null) {
                f13.b(this);
            }
            if (f14 != null) {
                f14.b(this);
            }
            this.j = p.b.e0;
            return;
        }
        if (object != null) {
            f f15 = this.h(d11);
            if (f15 == null) return;
            this.b(this.h, f15, this.b.W[0].f());
            this.c(this.i, this.h, 1, this.e);
            return;
        }
        ax.H.d d12 = dArray[1];
        if (d12.f != null) {
            f f16 = this.h(d12);
            if (f16 == null) return;
            this.b(this.i, f16, -this.b.W[1].f());
            this.c(this.h, this.i, -1, this.e);
            return;
        }
        if (e14 instanceof i || e14.K() == null) return;
        f f17 = this.b.K().e.h;
        this.b(this.h, f17, this.b.X());
        this.c(this.i, this.h, 1, this.e);
    }

    @Override
    public void e() {
        f f8 = this.h;
        if (f8.j) {
            this.b.m1(f8.g);
        }
    }

    @Override
    void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override
    boolean m() {
        if (this.d == e.b.d0) {
            return this.b.w == 0;
        }
        return true;
    }

    void r() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.e.j = false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HorizontalRun ");
        stringBuilder.append(this.b.t());
        return stringBuilder.toString();
    }
}

