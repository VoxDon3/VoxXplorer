/*
 * Decompiled with CFR 0.152.
 */
package ax.I;

import ax.H.e;
import ax.I.d;
import ax.I.f;
import ax.I.g;
import ax.I.p;
import java.util.ArrayList;

public class c
extends p {
    ArrayList<p> k = new ArrayList();
    private int l;

    public c(e e8, int n8) {
        super(e8);
        this.f = n8;
        this.q();
    }

    private void q() {
        Object object = this.b;
        ArrayList<p> arrayList = ((e)object).L(this.f);
        while (arrayList != null) {
            e e8 = ((e)((Object)arrayList)).L(this.f);
            object = arrayList;
            arrayList = e8;
        }
        this.b = object;
        this.k.add(((e)object).N(this.f));
        for (arrayList = ((e)object).J(this.f); arrayList != null; arrayList = ((e)((Object)arrayList)).J(this.f)) {
            this.k.add(((e)((Object)arrayList)).N(this.f));
        }
        arrayList = this.k;
        int n8 = arrayList.size();
        int n9 = 0;
        while (n9 < n8) {
            object = arrayList.get(n9);
            int n10 = n9 + 1;
            object = (p)object;
            int n11 = this.f;
            if (n11 == 0) {
                ((p)object).b.c = this;
                n9 = n10;
                continue;
            }
            n9 = n10;
            if (n11 != 1) continue;
            ((p)object).b.d = this;
            n9 = n10;
        }
        if (this.f == 0 && ((ax.H.f)this.b.K()).P1() && this.k.size() > 1) {
            arrayList = this.k;
            this.b = arrayList.get((int)(arrayList.size() - 1)).b;
        }
        n9 = this.f == 0 ? this.b.z() : this.b.S();
        this.l = n9;
    }

    private e r() {
        for (int i8 = 0; i8 < this.k.size(); ++i8) {
            p p8 = this.k.get(i8);
            if (p8.b.V() == 8) continue;
            return p8.b;
        }
        return null;
    }

    private e s() {
        for (int i8 = this.k.size() - 1; i8 >= 0; --i8) {
            p p8 = this.k.get(i8);
            if (p8.b.V() == 8) continue;
            return p8.b;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(d object) {
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        boolean bl;
        block89: {
            int n15;
            int n16;
            int n17;
            block99: {
                block97: {
                    float f8;
                    int n18;
                    float f9;
                    int n19;
                    block98: {
                        int n20;
                        block96: {
                            int n21;
                            block88: {
                                block87: {
                                    block86: {
                                        if (!this.h.j) return;
                                        if (!this.i.j) {
                                            return;
                                        }
                                        object = this.b.K();
                                        bl = object instanceof ax.H.f ? ((ax.H.f)object).P1() : false;
                                        n19 = this.i.g - this.h.g;
                                        n14 = this.k.size();
                                        n13 = 0;
                                        while (true) {
                                            n12 = -1;
                                            if (n13 >= n14) break;
                                            n11 = n13;
                                            if (this.k.get((int)n13).b.V() == 8) {
                                                ++n13;
                                                continue;
                                            }
                                            break block86;
                                            break;
                                        }
                                        n11 = -1;
                                    }
                                    n13 = n10 = n14 - 1;
                                    while (true) {
                                        n9 = n12;
                                        if (n13 < 0) break block87;
                                        if (this.k.get((int)n13).b.V() != 8) break;
                                        --n13;
                                    }
                                    n9 = n13;
                                }
                                n17 = 0;
                                while (true) {
                                    if (n17 >= 2) {
                                        n20 = 0;
                                        n8 = 0;
                                        n12 = 0;
                                        f9 = 0.0f;
                                        break block88;
                                    }
                                    n8 = 0;
                                    n13 = 0;
                                    n12 = 0;
                                    f9 = 0.0f;
                                    for (n16 = 0; n16 < n14; ++n16) {
                                        block91: {
                                            p p8;
                                            block93: {
                                                block95: {
                                                    block94: {
                                                        block92: {
                                                            block90: {
                                                                p8 = this.k.get(n16);
                                                                if (p8.b.V() != 8) break block90;
                                                                n18 = n13;
                                                                break block91;
                                                            }
                                                            n21 = n12 + 1;
                                                            n12 = n8;
                                                            if (n16 > 0) {
                                                                n12 = n8;
                                                                if (n16 >= n11) {
                                                                    n12 = n8 + p8.h.f;
                                                                }
                                                            }
                                                            object = p8.e;
                                                            n15 = ((f)object).g;
                                                            n8 = p8.d != e.b.d0 ? 1 : 0;
                                                            if (n8 == 0) break block92;
                                                            n18 = this.f;
                                                            if (n18 == 0 && !p8.b.e.e.j) {
                                                                return;
                                                            }
                                                            if (n18 == 1 && !p8.b.f.e.j) {
                                                                return;
                                                            }
                                                            n18 = n8;
                                                            n20 = n15;
                                                            n8 = n13;
                                                            break block93;
                                                        }
                                                        if (p8.a != 1 || n17 != 0) break block94;
                                                        n8 = ((g)object).m;
                                                        ++n13;
                                                        break block95;
                                                    }
                                                    n18 = n8;
                                                    n20 = n15;
                                                    n8 = n13;
                                                    if (!((f)object).j) break block93;
                                                    n8 = n15;
                                                }
                                                n18 = 1;
                                                n20 = n8;
                                                n8 = n13;
                                            }
                                            if (n18 == 0) {
                                                float f10 = p8.b.D0[this.f];
                                                n15 = n12;
                                                n13 = ++n8;
                                                f8 = f9;
                                                if (f10 >= 0.0f) {
                                                    f8 = f9 + f10;
                                                    n15 = n12;
                                                    n13 = n8;
                                                }
                                            } else {
                                                n15 = n12 + n20;
                                                f8 = f9;
                                                n13 = n8;
                                            }
                                            n8 = n15;
                                            n18 = n13;
                                            n12 = n21;
                                            f9 = f8;
                                            if (n16 < n10) {
                                                n8 = n15;
                                                n18 = n13;
                                                n12 = n21;
                                                f9 = f8;
                                                if (n16 < n9) {
                                                    n8 = n15 + -p8.i.f;
                                                    f9 = f8;
                                                    n12 = n21;
                                                    n18 = n13;
                                                }
                                            }
                                        }
                                        n13 = n18;
                                    }
                                    if (n8 < n19 || n13 == 0) break;
                                    ++n17;
                                }
                                n20 = n12;
                                n12 = n13;
                            }
                            n15 = this.h.g;
                            if (bl) {
                                n15 = this.i.g;
                            }
                            n13 = n15;
                            if (n8 > n19) {
                                n13 = bl ? n15 + (int)((float)(n8 - n19) / 2.0f + 0.5f) : n15 - (int)((float)(n8 - n19) / 2.0f + 0.5f);
                            }
                            if (n12 <= 0) {
                                n17 = n12;
                                n12 = n8;
                            } else {
                                f8 = n19 - n8;
                                n17 = (int)(f8 / (float)n12 + 0.5f);
                                n15 = 0;
                                n16 = n13;
                                for (n21 = 0; n21 < n14; ++n21) {
                                    int n22;
                                    e e8;
                                    p p9 = this.k.get(n21);
                                    if (p9.b.V() == 8 || p9.d != e.b.d0) continue;
                                    object = p9.e;
                                    if (((f)object).j) continue;
                                    n13 = f9 > 0.0f ? (int)(p9.b.D0[this.f] * f8 / f9 + 0.5f) : n17;
                                    if (this.f == 0) {
                                        e8 = p9.b;
                                        n22 = e8.A;
                                        n18 = e8.z;
                                    } else {
                                        e8 = p9.b;
                                        n22 = e8.D;
                                        n18 = e8.C;
                                    }
                                    int n23 = p9.a == 1 ? Math.min(n13, ((g)object).m) : n13;
                                    n18 = n23 = Math.max(n18, n23);
                                    if (n22 > 0) {
                                        n18 = Math.min(n22, n23);
                                    }
                                    if (n18 != n13) {
                                        ++n15;
                                        n13 = n18;
                                    }
                                    p9.e.d(n13);
                                }
                                n17 = n8;
                                n8 = n12;
                                if (n15 > 0) {
                                    n18 = n12 - n15;
                                    n12 = 0;
                                    n13 = 0;
                                    while (true) {
                                        n17 = n13;
                                        n8 = n18;
                                        if (n12 >= n14) break;
                                        object = this.k.get(n12);
                                        if (((p)object).b.V() != 8) {
                                            n8 = n13;
                                            if (n12 > 0) {
                                                n8 = n13;
                                                if (n12 >= n11) {
                                                    n8 = n13 + ((p)object).h.f;
                                                }
                                            }
                                            n13 = n8 += ((p)object).e.g;
                                            if (n12 < n10) {
                                                n13 = n8;
                                                if (n12 < n9) {
                                                    n13 = n8 + -((p)object).i.f;
                                                }
                                            }
                                        }
                                        ++n12;
                                    }
                                }
                                if (this.l == 2 && n15 == 0) {
                                    this.l = 0;
                                    n12 = n17;
                                    n17 = n8;
                                    n13 = n16;
                                } else {
                                    n12 = n17;
                                    n17 = n8;
                                    n13 = n16;
                                }
                            }
                            n16 = 0;
                            n15 = 0;
                            n8 = 0;
                            if (n12 > n19) {
                                this.l = 2;
                            }
                            if (n20 > 0 && n17 == 0 && n11 == n9) {
                                this.l = 2;
                            }
                            if ((n18 = this.l) != 1) break block96;
                            n12 = n20 > 1 ? (n19 - n12) / (n20 - 1) : (n20 == 1 ? (n19 - n12) / 2 : 0);
                            n15 = n12;
                            if (n17 > 0) {
                                n15 = 0;
                            }
                            break block97;
                        }
                        if (n18 != 0) break block98;
                        n15 = (n19 - n12) / (n20 + 1);
                        if (n17 > 0) {
                            n15 = 0;
                        }
                        break block99;
                    }
                    if (n18 != 2) return;
                    f9 = this.f == 0 ? this.b.y() : this.b.R();
                    f8 = f9;
                    if (bl) {
                        f8 = 1.0f - f9;
                    }
                    if ((n12 = (int)((float)(n19 - n12) * f8 + 0.5f)) < 0 || n17 > 0) {
                        n12 = 0;
                    }
                    if (bl) {
                        n13 -= n12;
                        n12 = n15;
                        break block89;
                    } else {
                        n13 += n12;
                        n12 = n15;
                    }
                    break block89;
                }
                n12 = n8;
                n8 = n13;
                while (n12 < n14) {
                    n13 = bl ? n14 - (n12 + 1) : n12;
                    p p10 = this.k.get(n13);
                    if (p10.b.V() == 8) {
                        p10.h.d(n8);
                        p10.i.d(n8);
                        n13 = n8;
                    } else {
                        n13 = n8;
                        if (n12 > 0) {
                            n13 = bl ? n8 - n15 : n8 + n15;
                        }
                        n8 = n13;
                        if (n12 > 0) {
                            n8 = n13;
                            if (n12 >= n11) {
                                n8 = bl ? n13 - p10.h.f : n13 + p10.h.f;
                            }
                        }
                        if (bl) {
                            p10.i.d(n8);
                        } else {
                            p10.h.d(n8);
                        }
                        object = p10.e;
                        n13 = n17 = ((f)object).g;
                        if (p10.d == e.b.d0) {
                            n13 = n17;
                            if (p10.a == 1) {
                                n13 = ((g)object).m;
                            }
                        }
                        n8 = bl ? (n8 -= n13) : (n8 += n13);
                        if (bl) {
                            p10.h.d(n8);
                        } else {
                            p10.i.d(n8);
                        }
                        p10.g = true;
                        n13 = n8;
                        if (n12 < n10) {
                            n13 = n8;
                            if (n12 < n9) {
                                n13 = bl ? n8 - -p10.i.f : n8 + -p10.i.f;
                            }
                        }
                    }
                    ++n12;
                    n8 = n13;
                }
                return;
            }
            n12 = n16;
            while (n12 < n14) {
                n8 = bl ? n14 - (n12 + 1) : n12;
                object = this.k.get(n8);
                if (((p)object).b.V() == 8) {
                    ((p)object).h.d(n13);
                    ((p)object).i.d(n13);
                } else {
                    n8 = bl ? n13 - n15 : n13 + n15;
                    n13 = n8;
                    if (n12 > 0) {
                        n13 = n8;
                        if (n12 >= n11) {
                            n13 = bl ? n8 - ((p)object).h.f : n8 + ((p)object).h.f;
                        }
                    }
                    if (bl) {
                        ((p)object).i.d(n13);
                    } else {
                        ((p)object).h.d(n13);
                    }
                    g g8 = ((p)object).e;
                    n8 = n17 = g8.g;
                    if (((p)object).d == e.b.d0) {
                        n8 = n17;
                        if (((p)object).a == 1) {
                            n8 = Math.min(n17, g8.m);
                        }
                    }
                    n8 = bl ? n13 - n8 : n13 + n8;
                    if (bl) {
                        ((p)object).h.d(n8);
                    } else {
                        ((p)object).i.d(n8);
                    }
                    n13 = n8;
                    if (n12 < n10) {
                        n13 = n8;
                        if (n12 < n9) {
                            n13 = bl ? n8 - -((p)object).i.f : n8 + -((p)object).i.f;
                        }
                    }
                }
                ++n12;
            }
            return;
        }
        while (n12 < n14) {
            n8 = bl ? n14 - (n12 + 1) : n12;
            p p11 = this.k.get(n8);
            if (p11.b.V() == 8) {
                p11.h.d(n13);
                p11.i.d(n13);
            } else {
                n8 = n13;
                if (n12 > 0) {
                    n8 = n13;
                    if (n12 >= n11) {
                        n8 = bl ? n13 - p11.h.f : n13 + p11.h.f;
                    }
                }
                if (bl) {
                    p11.i.d(n8);
                } else {
                    p11.h.d(n8);
                }
                object = p11.e;
                n13 = ((f)object).g;
                if (p11.d == e.b.d0 && p11.a == 1) {
                    n13 = ((g)object).m;
                }
                n8 = bl ? (n8 -= n13) : (n8 += n13);
                if (bl) {
                    p11.h.d(n8);
                } else {
                    p11.i.d(n8);
                }
                n13 = n8;
                if (n12 < n10) {
                    n13 = n8;
                    if (n12 < n9) {
                        n13 = bl ? n8 - -p11.i.f : n8 + -p11.i.f;
                    }
                }
            }
            ++n12;
        }
    }

    @Override
    void d() {
        Object object;
        int n8;
        Object object2 = this.k;
        int n9 = ((ArrayList)object2).size();
        for (n8 = 0; n8 < n9; ++n8) {
            object = ((ArrayList)object2).get(n8);
            ((p)object).d();
        }
        n8 = this.k.size();
        if (n8 < 1) {
            return;
        }
        object = this.k.get((int)0).b;
        object2 = this.k.get((int)(n8 - 1)).b;
        if (this.f == 0) {
            Object object3 = ((e)object).O;
            object2 = ((e)object2).Q;
            object = this.i((ax.H.d)object3, 0);
            n8 = ((ax.H.d)object3).f();
            object3 = this.r();
            if (object3 != null) {
                n8 = ((e)object3).O.f();
            }
            if (object != null) {
                this.b(this.h, (f)object, n8);
            }
            object = this.i((ax.H.d)object2, 0);
            n8 = ((ax.H.d)object2).f();
            object2 = this.s();
            if (object2 != null) {
                n8 = ((e)object2).Q.f();
            }
            if (object != null) {
                this.b(this.i, (f)object, -n8);
            }
        } else {
            object = ((e)object).P;
            object2 = ((e)object2).R;
            f f8 = this.i((ax.H.d)object, 1);
            n8 = ((ax.H.d)object).f();
            object = this.r();
            if (object != null) {
                n8 = ((e)object).P.f();
            }
            if (f8 != null) {
                this.b(this.h, f8, n8);
            }
            object = this.i((ax.H.d)object2, 1);
            n8 = ((ax.H.d)object2).f();
            object2 = this.s();
            if (object2 != null) {
                n8 = ((e)object2).R.f();
            }
            if (object != null) {
                this.b(this.i, (f)object, -n8);
            }
        }
        this.h.a = this;
        this.i.a = this;
    }

    @Override
    public void e() {
        for (int i8 = 0; i8 < this.k.size(); ++i8) {
            this.k.get(i8).e();
        }
    }

    @Override
    void f() {
        this.c = null;
        ArrayList<p> arrayList = this.k;
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            p p8 = arrayList.get(i8);
            p8.f();
        }
    }

    @Override
    public long j() {
        int n8 = this.k.size();
        long l8 = 0L;
        for (int i8 = 0; i8 < n8; ++i8) {
            p p8 = this.k.get(i8);
            l8 = l8 + (long)p8.h.f + p8.j() + (long)p8.i.f;
        }
        return l8;
    }

    @Override
    boolean m() {
        int n8 = this.k.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (this.k.get(i8).m()) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ChainRun ");
        Object object = this.f == 0 ? "horizontal : " : "vertical : ";
        stringBuilder.append((String)object);
        object = this.k;
        int n8 = ((ArrayList)object).size();
        for (int i8 = 0; i8 < n8; ++i8) {
            Object object2 = ((ArrayList)object).get(i8);
            object2 = (p)object2;
            stringBuilder.append("<");
            stringBuilder.append(object2);
            stringBuilder.append("> ");
        }
        return stringBuilder.toString();
    }
}

