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
import ax.I.l;
import ax.I.p;

public class n
extends p {
    public f k;
    g l;

    public n(e object) {
        super((e)object);
        this.k = object = new f(this);
        this.l = null;
        this.h.e = f.a.g0;
        this.i.e = f.a.h0;
        ((f)object).e = f.a.i0;
        this.f = 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(d object) {
        int n8;
        float f8;
        int n9;
        block17: {
            block18: {
                block22: {
                    block24: {
                        float f9;
                        block23: {
                            block19: {
                                block20: {
                                    block21: {
                                        n9 = ax.I.n$a.a[this.j.ordinal()];
                                        if (n9 != 1) {
                                            if (n9 != 2) {
                                                if (n9 == 3) {
                                                    e e8 = this.b;
                                                    this.n((d)object, e8.P, e8.R, 1);
                                                    return;
                                                }
                                            } else {
                                                this.o((d)object);
                                            }
                                        } else {
                                            this.p((d)object);
                                        }
                                        object = this.e;
                                        if (!((f)object).c || ((f)object).j || this.d != e.b.d0) break block17;
                                        object = this.b;
                                        n9 = ((e)object).x;
                                        if (n9 == 2) break block18;
                                        if (n9 != 3 || !((e)object).e.e.j) break block17;
                                        n9 = ((e)object).w();
                                        if (n9 == -1) break block19;
                                        if (n9 == 0) break block20;
                                        if (n9 == 1) break block21;
                                        n9 = 0;
                                        break block22;
                                    }
                                    object = this.b;
                                    f9 = ((e)object).e.e.g;
                                    f8 = ((e)object).v();
                                    break block23;
                                }
                                object = this.b;
                                f8 = (float)((e)object).e.e.g * ((e)object).v();
                                break block24;
                            }
                            object = this.b;
                            f9 = ((e)object).e.e.g;
                            f8 = ((e)object).v();
                        }
                        f8 = f9 / f8;
                    }
                    n9 = (int)(f8 + 0.5f);
                }
                this.e.d(n9);
                break block17;
            }
            if ((object = ((e)object).K()) != null) {
                object = ((e)object).f.e;
                if (((f)object).j) {
                    f8 = this.b.E;
                    n9 = (int)((float)((f)object).g * f8 + 0.5f);
                    this.e.d(n9);
                }
            }
        }
        f f10 = this.h;
        if (!f10.c) return;
        object = this.i;
        if (!((f)object).c) {
            return;
        }
        if (f10.j && ((f)object).j && this.e.j) {
            return;
        }
        if (!this.e.j && this.d == e.b.d0) {
            object = this.b;
            if (((e)object).w == 0 && !((e)object).k0()) {
                f10 = this.h.l.get(0);
                object = this.i.l.get(0);
                n9 = f10.g;
                f10 = this.h;
                int n10 = n9 + f10.f;
                n9 = ((f)object).g + this.i.f;
                f10.d(n10);
                this.i.d(n9);
                this.e.d(n9 - n10);
                return;
            }
        }
        if (!this.e.j && this.d == e.b.d0 && this.a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
            f10 = this.h.l.get(0);
            object = this.i.l.get(0);
            n8 = f10.g;
            n9 = this.h.f;
            n8 = ((f)object).g + this.i.f - (n8 + n9);
            object = this.e;
            n9 = ((g)object).m;
            if (n8 < n9) {
                ((g)object).d(n8);
            } else {
                ((g)object).d(n9);
            }
        }
        if (!this.e.j) {
            return;
        }
        if (this.h.l.size() <= 0) return;
        if (this.i.l.size() <= 0) return;
        f10 = this.h.l.get(0);
        object = this.i.l.get(0);
        n9 = f10.g + this.h.f;
        n8 = ((f)object).g + this.i.f;
        f8 = this.b.R();
        if (f10 == object) {
            n9 = f10.g;
            n8 = ((f)object).g;
            f8 = 0.5f;
        }
        int n11 = this.e.g;
        this.h.d((int)((float)n9 + 0.5f + (float)(n8 - n9 - n11) * f8));
        this.i.d(this.h.g + this.e.g);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    void d() {
        e e8;
        e e9 = this.b;
        if (e9.a) {
            this.e.d(e9.x());
        }
        if (!this.e.j) {
            e.b b8;
            this.d = this.b.T();
            if (this.b.Z()) {
                this.l = new ax.I.a(this);
            }
            if ((b8 = this.d) != e.b.d0) {
                e e10;
                if (b8 == e.b.e0 && (e10 = this.b.K()) != null && e10.T() == e.b.q) {
                    int n8 = e10.x();
                    int n9 = this.b.P.f();
                    int n10 = this.b.R.f();
                    this.b(this.h, e10.f.h, this.b.P.f());
                    this.b(this.i, e10.f.i, -this.b.R.f());
                    this.e.d(n8 - n9 - n10);
                    return;
                }
                if (this.d == e.b.q) {
                    this.e.d(this.b.x());
                }
            }
        } else if (this.d == e.b.e0 && (e8 = this.b.K()) != null && e8.T() == e.b.q) {
            this.b(this.h, e8.f.h, this.b.P.f());
            this.b(this.i, e8.f.i, -this.b.R.f());
            return;
        }
        g g8 = this.e;
        boolean bl = g8.j;
        if (bl) {
            e e11 = this.b;
            if (e11.a) {
                ax.H.d[] dArray = e11.W;
                ax.H.d d8 = dArray[2];
                ax.H.d d9 = d8.f;
                if (d9 != null && dArray[3].f != null) {
                    if (e11.k0()) {
                        this.h.f = this.b.W[2].f();
                        this.i.f = -this.b.W[3].f();
                    } else {
                        f f8;
                        f f9 = this.h(this.b.W[2]);
                        if (f9 != null) {
                            this.b(this.h, f9, this.b.W[2].f());
                        }
                        if ((f8 = this.h(this.b.W[3])) != null) {
                            this.b(this.i, f8, -this.b.W[3].f());
                        }
                        this.h.b = true;
                        this.i.b = true;
                    }
                    if (!this.b.Z()) return;
                    this.b(this.k, this.h, this.b.p());
                    return;
                }
                if (d9 != null) {
                    f f10 = this.h(d8);
                    if (f10 == null) return;
                    this.b(this.h, f10, this.b.W[2].f());
                    this.b(this.i, this.h, this.e.g);
                    if (!this.b.Z()) return;
                    this.b(this.k, this.h, this.b.p());
                    return;
                }
                d8 = dArray[3];
                if (d8.f != null) {
                    f f11 = this.h(d8);
                    if (f11 != null) {
                        this.b(this.i, f11, -this.b.W[3].f());
                        this.b(this.h, this.i, -this.e.g);
                    }
                    if (!this.b.Z()) return;
                    this.b(this.k, this.h, this.b.p());
                    return;
                }
                ax.H.d d10 = dArray[4];
                if (d10.f != null) {
                    f f12 = this.h(d10);
                    if (f12 == null) return;
                    this.b(this.k, f12, 0);
                    this.b(this.h, this.k, -this.b.p());
                    this.b(this.i, this.h, this.e.g);
                    return;
                }
                if (e11 instanceof i || e11.K() == null || this.b.o((d.b)d.b.h0).f != null) return;
                f f13 = this.b.K().f.h;
                this.b(this.h, f13, this.b.Y());
                this.b(this.i, this.h, this.e.g);
                if (!this.b.Z()) return;
                this.b(this.k, this.h, this.b.p());
                return;
            }
        }
        if (!bl && this.d == e.b.d0) {
            e e12 = this.b;
            int n11 = e12.x;
            if (n11 != 2) {
                if (n11 == 3 && !e12.k0()) {
                    e e13 = this.b;
                    if (e13.w != 3) {
                        g g9 = e13.e.e;
                        this.e.l.add(g9);
                        g9.k.add(this.e);
                        g g10 = this.e;
                        g10.b = true;
                        g10.k.add(this.h);
                        this.e.k.add(this.i);
                    }
                }
            } else {
                e e14 = e12.K();
                if (e14 != null) {
                    g g11 = e14.f.e;
                    this.e.l.add(g11);
                    g11.k.add(this.e);
                    g g12 = this.e;
                    g12.b = true;
                    g12.k.add(this.h);
                    this.e.k.add(this.i);
                }
            }
        } else {
            g8.b(this);
        }
        e e15 = this.b;
        ax.H.d[] dArray = e15.W;
        ax.H.d d11 = dArray[2];
        ax.H.d d12 = d11.f;
        if (d12 != null && dArray[3].f != null) {
            if (e15.k0()) {
                this.h.f = this.b.W[2].f();
                this.i.f = -this.b.W[3].f();
            } else {
                f f14 = this.h(this.b.W[2]);
                f f15 = this.h(this.b.W[3]);
                if (f14 != null) {
                    f14.b(this);
                }
                if (f15 != null) {
                    f15.b(this);
                }
                this.j = p.b.e0;
            }
            if (this.b.Z()) {
                this.c(this.k, this.h, 1, this.l);
            }
        } else if (d12 != null) {
            f f16 = this.h(d11);
            if (f16 != null) {
                e.b b9;
                e.b b10;
                this.b(this.h, f16, this.b.W[2].f());
                this.c(this.i, this.h, 1, this.e);
                if (this.b.Z()) {
                    this.c(this.k, this.h, 1, this.l);
                }
                if ((b10 = this.d) == (b9 = e.b.d0) && this.b.v() > 0.0f) {
                    l l8 = this.b.e;
                    if (l8.d == b9) {
                        l8.e.k.add(this.e);
                        this.e.l.add(this.b.e.e);
                        this.e.a = this;
                    }
                }
            }
        } else {
            d11 = dArray[3];
            if (d11.f != null) {
                f f17 = this.h(d11);
                if (f17 != null) {
                    this.b(this.i, f17, -this.b.W[3].f());
                    this.c(this.h, this.i, -1, this.e);
                    if (this.b.Z()) {
                        this.c(this.k, this.h, 1, this.l);
                    }
                }
            } else {
                ax.H.d d13 = dArray[4];
                if (d13.f != null) {
                    f f18 = this.h(d13);
                    if (f18 != null) {
                        this.b(this.k, f18, 0);
                        this.c(this.h, this.k, -1, this.l);
                        this.c(this.i, this.h, 1, this.e);
                    }
                } else if (!(e15 instanceof i) && e15.K() != null) {
                    e.b b11;
                    e.b b12;
                    f f19 = this.b.K().f.h;
                    this.b(this.h, f19, this.b.Y());
                    this.c(this.i, this.h, 1, this.e);
                    if (this.b.Z()) {
                        this.c(this.k, this.h, 1, this.l);
                    }
                    if ((b12 = this.d) == (b11 = e.b.d0) && this.b.v() > 0.0f) {
                        l l9 = this.b.e;
                        if (l9.d == b11) {
                            l9.e.k.add(this.e);
                            this.e.l.add(this.b.e.e);
                            this.e.a = this;
                        }
                    }
                }
            }
        }
        if (this.e.l.size() != 0) return;
        this.e.c = true;
    }

    @Override
    public void e() {
        f f8 = this.h;
        if (f8.j) {
            this.b.n1(f8.g);
        }
    }

    @Override
    void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override
    boolean m() {
        if (this.d == e.b.d0) {
            return this.b.x == 0;
        }
        return true;
    }

    void q() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.k.c();
        this.k.j = false;
        this.e.j = false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VerticalRun ");
        stringBuilder.append(this.b.t());
        return stringBuilder.toString();
    }
}

