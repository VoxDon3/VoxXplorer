/*
 * Decompiled with CFR 0.152.
 */
package ax.H;

import ax.H.e;
import java.util.ArrayList;

public class c {
    protected e a;
    protected e b;
    protected e c;
    protected e d;
    protected e e;
    protected e f;
    protected e g;
    protected ArrayList<e> h;
    protected int i;
    protected int j;
    protected float k = 0.0f;
    int l;
    int m;
    int n;
    boolean o;
    private int p;
    private boolean q;
    protected boolean r;
    protected boolean s;
    protected boolean t;
    protected boolean u;
    private boolean v;

    public c(e e8, int n8, boolean bl) {
        this.a = e8;
        this.p = n8;
        this.q = bl;
    }

    private void b() {
        int n8 = this.p * 2;
        Object object = this.a;
        boolean bl = true;
        this.o = true;
        Object object2 = object;
        boolean bl2 = false;
        while (!bl2) {
            Object object3;
            ++this.i;
            Object object4 = ((e)object).F0;
            int n9 = this.p;
            Object object5 = null;
            object4[n9] = null;
            ((e)object).E0[n9] = null;
            if (((e)object).V() != 8) {
                int n10;
                ++this.l;
                object3 = ((e)object).u(this.p);
                if (object3 != (object4 = e.b.d0)) {
                    this.m += ((e)object).E(this.p);
                }
                this.m = n10 = this.m + ((e)object).W[n8].f();
                object3 = ((e)object).W;
                n9 = n8 + 1;
                this.m = n10 + object3[n9].f();
                this.n = n10 = this.n + ((e)object).W[n8].f();
                this.n = n10 + ((e)object).W[n9].f();
                if (this.b == null) {
                    this.b = object;
                }
                this.d = object;
                object3 = ((e)object).Z;
                n9 = this.p;
                if (object3[n9] == object4) {
                    n10 = ((e)object).y[n9];
                    if (n10 == 0 || n10 == 3 || n10 == 2) {
                        ++this.j;
                        float f8 = ((e)object).D0[n9];
                        if (f8 > 0.0f) {
                            this.k += f8;
                        }
                        if (ax.H.c.c((e)object, n9)) {
                            if (f8 < 0.0f) {
                                this.r = true;
                            } else {
                                this.s = true;
                            }
                            if (this.h == null) {
                                this.h = new ArrayList();
                            }
                            this.h.add((e)object);
                        }
                        if (this.f == null) {
                            this.f = object;
                        }
                        if ((object4 = this.g) != null) {
                            object4.E0[this.p] = object;
                        }
                        this.g = object;
                    }
                    if (this.p == 0) {
                        if (((e)object).w != 0) {
                            this.o = false;
                        } else if (((e)object).z != 0 || ((e)object).A != 0) {
                            this.o = false;
                        }
                    } else if (((e)object).x != 0) {
                        this.o = false;
                    } else if (((e)object).C != 0 || ((e)object).D != 0) {
                        this.o = false;
                    }
                    if (((e)object).d0 != 0.0f) {
                        this.o = false;
                        this.u = true;
                    }
                }
            }
            if (object2 != object) {
                ((e)object2).F0[this.p] = object;
            }
            object4 = ((e)object).W[n8 + 1].f;
            object2 = object5;
            if (object4 != null) {
                object4 = object4.d;
                object3 = object4.W[n8].f;
                object2 = object5;
                if (object3 != null) {
                    object2 = object3.d != object ? object5 : object4;
                }
            }
            if (object2 == null) {
                object2 = object;
                bl2 = true;
            }
            object5 = object;
            object = object2;
            object2 = object5;
        }
        object2 = this.b;
        if (object2 != null) {
            this.m -= ((e)object2).W[n8].f();
        }
        if ((object2 = this.d) != null) {
            this.m -= ((e)object2).W[n8 + 1].f();
        }
        this.c = object;
        this.e = this.p == 0 && this.q ? object : this.a;
        if (!this.s || !this.r) {
            bl = false;
        }
        this.t = bl;
    }

    private static boolean c(e e8, int n8) {
        return e8.V() != 8 && e8.Z[n8] == e.b.d0 && ((n8 = e8.y[n8]) == 0 || n8 == 3);
    }

    public void a() {
        if (!this.v) {
            this.b();
        }
        this.v = true;
    }
}

