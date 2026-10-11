/*
 * Decompiled with CFR 0.152.
 */
package ax.I;

import ax.H.e;
import ax.H.h;
import ax.I.b;
import ax.I.c;
import ax.I.d;
import ax.I.f;
import ax.I.g;
import ax.I.j;
import ax.I.k;
import ax.I.l;
import ax.I.m;
import ax.I.n;
import ax.I.p;
import java.util.ArrayList;
import java.util.HashSet;

public class e {
    private ax.H.f a;
    private boolean b = true;
    private boolean c = true;
    private ax.H.f d;
    private ArrayList<p> e = new ArrayList();
    private ArrayList<m> f = new ArrayList();
    private b.b g = null;
    private b.a h = new b.a();
    ArrayList<m> i = new ArrayList();

    public e(ax.H.f f8) {
        this.a = f8;
        this.d = f8;
    }

    private void a(f object, int n8, int n9, f f8, ArrayList<m> arrayList, m object22) {
        p p8 = ((f)object).d;
        if (p8.c == null) {
            object = this.a;
            if (p8 != ((ax.H.e)object).e && p8 != ((ax.H.e)object).f) {
                object = object22;
                if (object22 == null) {
                    object = new m(p8, n9);
                    arrayList.add((m)object);
                }
                p8.c = object;
                ((m)object).a(p8);
                for (d d8 : p8.h.k) {
                    if (!(d8 instanceof f)) continue;
                    this.a((f)d8, n8, 0, f8, arrayList, (m)object);
                }
                for (d d9 : p8.i.k) {
                    if (!(d9 instanceof f)) continue;
                    this.a((f)d9, n8, 1, f8, arrayList, (m)object);
                }
                if (n8 == 1 && p8 instanceof n) {
                    for (d d10 : ((n)p8).k.k) {
                        if (!(d10 instanceof f)) continue;
                        this.a((f)d10, n8, 2, f8, arrayList, (m)object);
                    }
                }
                for (f f9 : p8.h.l) {
                    if (f9 == f8) {
                        ((m)object).b = true;
                    }
                    this.a(f9, n8, 0, f8, arrayList, (m)object);
                }
                for (f f10 : p8.i.l) {
                    if (f10 == f8) {
                        ((m)object).b = true;
                    }
                    this.a(f10, n8, 1, f8, arrayList, (m)object);
                }
                if (n8 == 1 && p8 instanceof n) {
                    for (f f11 : ((n)p8).k.l) {
                        this.a(f11, n8, 2, f8, arrayList, (m)object);
                    }
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private boolean b(ax.H.f f8) {
        ArrayList<ax.H.e> arrayList = f8.L0;
        int n8 = arrayList.size();
        int n9 = 0;
        while (true) {
            int n10;
            block38: {
                e.b var9_40;
                e.b var8_25;
                e.b b8;
                int n11;
                e.b var9_35;
                e.b var10_43;
                ax.H.e e8;
                block35: {
                    float f9;
                    float f10;
                    e.b var8_17;
                    e.b b9;
                    block41: {
                        block45: {
                            e.b b10;
                            block44: {
                                block43: {
                                    block42: {
                                        block36: {
                                            e.b b11;
                                            block40: {
                                                block39: {
                                                    block37: {
                                                        block33: {
                                                            block34: {
                                                                e.b b12;
                                                                block31: {
                                                                    block32: {
                                                                        if (n9 >= n8) {
                                                                            return false;
                                                                        }
                                                                        ax.H.e e9 = arrayList.get(n9);
                                                                        n10 = n9 + 1;
                                                                        e8 = e9;
                                                                        e.b[] bArray = e8.Z;
                                                                        e.b b13 = bArray[0];
                                                                        b12 = bArray[1];
                                                                        if (e8.V() == 8) {
                                                                            e8.a = true;
                                                                            n9 = n10;
                                                                            continue;
                                                                        }
                                                                        if (e8.B < 1.0f && b13 == e.b.d0) {
                                                                            e8.w = 2;
                                                                        }
                                                                        if (e8.E < 1.0f && b12 == e.b.d0) {
                                                                            e8.x = 2;
                                                                        }
                                                                        if (e8.v() > 0.0f) {
                                                                            e.b b14 = e.b.d0;
                                                                            if (b13 == b14 && (b12 == e.b.c0 || b12 == e.b.q)) {
                                                                                e8.w = 3;
                                                                            } else if (b12 == b14 && (b13 == e.b.c0 || b13 == e.b.q)) {
                                                                                e8.x = 3;
                                                                            } else if (b13 == b14 && b12 == b14) {
                                                                                if (e8.w == 0) {
                                                                                    e8.w = 3;
                                                                                }
                                                                                if (e8.x == 0) {
                                                                                    e8.x = 3;
                                                                                }
                                                                            }
                                                                        }
                                                                        b9 = e.b.d0;
                                                                        e.b b15 = b13;
                                                                        if (b13 != b9) break block31;
                                                                        e.b b16 = b13;
                                                                        if (e8.w != 1) break block31;
                                                                        if (e8.O.f == null) break block32;
                                                                        e.b b17 = b13;
                                                                        if (e8.Q.f != null) break block31;
                                                                    }
                                                                    e.b b18 = e.b.c0;
                                                                }
                                                                e.b b19 = b12;
                                                                if (b12 != b9) break block33;
                                                                e.b b20 = b12;
                                                                if (e8.x != 1) break block33;
                                                                if (e8.P.f == null) break block34;
                                                                e.b b21 = b12;
                                                                if (e8.R.f != null) break block33;
                                                            }
                                                            e.b b22 = e.b.c0;
                                                        }
                                                        var10_43 = var8_17;
                                                        l l8 = e8.e;
                                                        l8.d = var9_35;
                                                        l8.a = n11 = e8.w;
                                                        n n12 = e8.f;
                                                        n12.d = var10_43;
                                                        n12.a = n9 = e8.x;
                                                        b8 = e.b.e0;
                                                        if ((var9_35 == b8 || var9_35 == e.b.q || var9_35 == e.b.c0) && (var10_43 == b8 || var10_43 == e.b.q || var10_43 == e.b.c0)) break block35;
                                                        if (var9_35 != b9 || var10_43 != (b11 = e.b.c0) && var10_43 != e.b.q) break block36;
                                                        if (n11 != 3) break block37;
                                                        if (var10_43 == b11) {
                                                            this.l(e8, b11, 0, b11, 0);
                                                        }
                                                        n11 = e8.x();
                                                        n9 = (int)((float)n11 * e8.d0 + 0.5f);
                                                        e.b b23 = e.b.q;
                                                        this.l(e8, b23, n9, b23, n11);
                                                        e8.e.e.d(e8.W());
                                                        e8.f.e.d(e8.x());
                                                        e8.a = true;
                                                        break block38;
                                                    }
                                                    if (n11 != 1) break block39;
                                                    this.l(e8, b11, 0, (e.b)var10_43, 0);
                                                    e8.e.e.m = e8.W();
                                                    break block38;
                                                }
                                                if (n11 != 2) break block40;
                                                e.b b24 = f8.Z[0];
                                                b11 = e.b.q;
                                                if (b24 != b11 && b24 != b8) break block36;
                                                this.l(e8, b11, (int)(e8.B * (float)f8.W() + 0.5f), (e.b)var10_43, e8.x());
                                                e8.e.e.d(e8.W());
                                                e8.f.e.d(e8.x());
                                                e8.a = true;
                                                break block38;
                                            }
                                            ax.H.d[] dArray = e8.W;
                                            if (dArray[0].f != null && dArray[1].f != null) break block36;
                                            this.l(e8, b11, 0, (e.b)var10_43, 0);
                                            e8.e.e.d(e8.W());
                                            e8.f.e.d(e8.x());
                                            e8.a = true;
                                            break block38;
                                        }
                                        if (var10_43 != b9 || var9_35 != (b10 = e.b.c0) && var9_35 != e.b.q) break block41;
                                        if (n9 != 3) break block42;
                                        if (var9_35 == b10) {
                                            this.l(e8, b10, 0, b10, 0);
                                        }
                                        n9 = e8.W();
                                        f9 = f10 = e8.d0;
                                        if (e8.w() == -1) {
                                            f9 = 1.0f / f10;
                                        }
                                        n11 = (int)((float)n9 * f9 + 0.5f);
                                        e.b b25 = e.b.q;
                                        this.l(e8, b25, n9, b25, n11);
                                        e8.e.e.d(e8.W());
                                        e8.f.e.d(e8.x());
                                        e8.a = true;
                                        break block38;
                                    }
                                    if (n9 != 1) break block43;
                                    this.l(e8, (e.b)var9_35, 0, b10, 0);
                                    e8.f.e.m = e8.x();
                                    break block38;
                                }
                                if (n9 != 2) break block44;
                                e.b b26 = f8.Z[1];
                                e.b b27 = e.b.q;
                                if (b26 != b27 && b26 != b8) break block45;
                                f9 = e8.E;
                                this.l(e8, (e.b)var9_35, e8.W(), b27, (int)(f9 * (float)f8.x() + 0.5f));
                                e8.e.e.d(e8.W());
                                e8.f.e.d(e8.x());
                                e8.a = true;
                                break block38;
                            }
                            ax.H.d[] dArray = e8.W;
                            if (dArray[2].f != null && dArray[3].f != null) break block45;
                            this.l(e8, b10, 0, (e.b)var10_43, 0);
                            e8.e.e.d(e8.W());
                            e8.f.e.d(e8.x());
                            e8.a = true;
                            break block38;
                        }
                        void var10_47 = var8_17;
                    }
                    if (var9_35 != b9 || var8_17 != b9) break block38;
                    if (n11 != 1 && n9 != 1) {
                        e.b b28;
                        e.b[] bArray;
                        e.b b29;
                        if (n9 == 2 && n11 == 2 && (b29 = (bArray = f8.Z)[0]) == (b28 = e.b.q) && bArray[1] == b28) {
                            f10 = e8.B;
                            f9 = e8.E;
                            this.l(e8, b28, (int)(f10 * (float)f8.W() + 0.5f), b28, (int)(f9 * (float)f8.x() + 0.5f));
                            e8.e.e.d(e8.W());
                            e8.f.e.d(e8.x());
                            e8.a = true;
                        }
                        break block38;
                    } else {
                        e.b b30 = e.b.c0;
                        this.l(e8, b30, 0, b30, 0);
                        e8.e.e.m = e8.W();
                        e8.f.e.m = e8.x();
                    }
                    break block38;
                }
                n9 = e8.W();
                void var8_23 = var9_35;
                if (var9_35 == b8) {
                    n9 = f8.W() - e8.O.g - e8.Q.g;
                    e.b b31 = e.b.q;
                }
                n11 = e8.x();
                void var9_38 = var10_43;
                if (var10_43 == b8) {
                    n11 = f8.x() - e8.P.g - e8.R.g;
                    e.b b32 = e.b.q;
                }
                this.l(e8, (e.b)var8_25, n9, (e.b)var9_40, n11);
                e8.e.e.d(e8.W());
                e8.f.e.d(e8.x());
                e8.a = true;
            }
            n9 = n10;
        }
    }

    private int e(ax.H.f f8, int n8) {
        int n9 = this.i.size();
        long l8 = 0L;
        for (int i8 = 0; i8 < n9; ++i8) {
            l8 = Math.max(l8, this.i.get(i8).b(f8, n8));
        }
        return (int)l8;
    }

    /*
     * WARNING - void declaration
     */
    private void i(p d82, int n8, ArrayList<m> arrayList) {
        ArrayList<m> var3_5;
        ArrayList<m> var2_4;
        for (d d8 : ((p)d82).h.k) {
            if (d8 instanceof f) {
                this.a((f)d8, (int)var2_4, 0, ((p)d82).i, (ArrayList<m>)var3_5, null);
                continue;
            }
            if (!(d8 instanceof p)) continue;
            this.a(((p)d8).h, (int)var2_4, 0, ((p)d82).i, (ArrayList<m>)var3_5, null);
        }
        for (d d8 : ((p)d82).i.k) {
            if (d8 instanceof f) {
                this.a((f)d8, (int)var2_4, 1, ((p)d82).h, (ArrayList<m>)var3_5, null);
                continue;
            }
            if (!(d8 instanceof p)) continue;
            this.a(((p)d8).i, (int)var2_4, 1, ((p)d82).h, (ArrayList<m>)var3_5, null);
        }
        if (var2_4 == true) {
            for (d d9 : ((n)d82).k.k) {
                if (!(d9 instanceof f)) continue;
                this.a((f)d9, (int)var2_4, 2, null, (ArrayList<m>)var3_5, null);
            }
        }
    }

    private void l(ax.H.e e8, e.b b8, int n8, e.b b9, int n9) {
        b.a a8 = this.h;
        a8.a = b8;
        a8.b = b9;
        a8.c = n8;
        a8.d = n9;
        this.g.a(e8, a8);
        e8.k1(this.h.e);
        e8.L0(this.h.f);
        e8.K0(this.h.h);
        e8.A0(this.h.g);
    }

    public void c() {
        this.d(this.e);
        this.i.clear();
        m.h = 0;
        this.i(this.a.e, 0, this.i);
        this.i(this.a.f, 1, this.i);
        this.b = false;
    }

    public void d(ArrayList<p> arrayList) {
        int n8;
        arrayList.clear();
        this.d.e.f();
        this.d.f.f();
        arrayList.add(this.d.e);
        arrayList.add(this.d.f);
        ArrayList<ax.H.e> arrayList2 = this.d.L0;
        int n9 = arrayList2.size();
        HashSet<c> hashSet = null;
        int n10 = 0;
        int n11 = 0;
        while (n11 < n9) {
            HashSet<c> hashSet2 = arrayList2.get(n11);
            n8 = n11 + 1;
            HashSet<c> hashSet3 = hashSet2;
            if (hashSet3 instanceof h) {
                arrayList.add(new j((ax.H.e)((Object)hashSet3)));
                n11 = n8;
                continue;
            }
            if (((ax.H.e)((Object)hashSet3)).i0()) {
                if (((ax.H.e)((Object)hashSet3)).c == null) {
                    ((ax.H.e)((Object)hashSet3)).c = new c((ax.H.e)((Object)hashSet3), 0);
                }
                hashSet2 = hashSet;
                if (hashSet == null) {
                    hashSet2 = new HashSet<c>();
                }
                hashSet2.add(((ax.H.e)((Object)hashSet3)).c);
                hashSet = hashSet2;
            } else {
                arrayList.add(((ax.H.e)((Object)hashSet3)).e);
            }
            if (((ax.H.e)((Object)hashSet3)).k0()) {
                if (((ax.H.e)((Object)hashSet3)).d == null) {
                    ((ax.H.e)((Object)hashSet3)).d = new c((ax.H.e)((Object)hashSet3), 1);
                }
                hashSet2 = hashSet;
                if (hashSet == null) {
                    hashSet2 = new HashSet<c>();
                }
                hashSet2.add(((ax.H.e)((Object)hashSet3)).d);
            } else {
                arrayList.add(((ax.H.e)((Object)hashSet3)).f);
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            n11 = n8;
            if (!(hashSet3 instanceof ax.H.j)) continue;
            arrayList.add(new k((ax.H.e)((Object)hashSet3)));
            hashSet = hashSet2;
            n11 = n8;
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        n8 = arrayList.size();
        for (n11 = 0; n11 < n8; ++n11) {
            hashSet = arrayList.get(n11);
            ((p)((Object)hashSet)).f();
        }
        n8 = arrayList.size();
        for (n11 = n10; n11 < n8; ++n11) {
            hashSet = arrayList.get(n11);
            if (((p)((Object)hashSet)).b == this.d) continue;
            ((p)((Object)hashSet)).d();
        }
    }

    public boolean f(boolean bl) {
        Object object;
        Object object2;
        block20: {
            int n8;
            Object object3;
            int n9;
            int n10;
            boolean bl2 = this.b;
            boolean bl3 = false;
            if (bl2 || this.c) {
                object2 = this.a.L0;
                n10 = ((ArrayList)object2).size();
                for (n9 = 0; n9 < n10; ++n9) {
                    object = ((ArrayList)object2).get(n9);
                    object.n();
                    object.a = false;
                    object.e.r();
                    object.f.q();
                }
                this.a.n();
                object2 = this.a;
                ((ax.H.e)object2).a = false;
                ((ax.H.e)object2).e.r();
                this.a.f.q();
                this.c = false;
            }
            if (this.b(this.d)) {
                return false;
            }
            this.a.m1(0);
            this.a.n1(0);
            object2 = this.a.u(0);
            object = this.a.u(1);
            if (this.b) {
                this.c();
            }
            int n11 = this.a.X();
            n10 = this.a.Y();
            this.a.e.h.d(n11);
            this.a.f.h.d(n10);
            this.m();
            Object object4 = e.b.c0;
            if (object2 == object4 || object == object4) {
                block19: {
                    bl2 = bl;
                    if (bl) {
                        object3 = this.e;
                        n8 = ((ArrayList)object3).size();
                        n9 = 0;
                        do {
                            bl2 = bl;
                            if (n9 >= n8) break block19;
                            object4 = ((ArrayList)object3).get(n9);
                            ++n9;
                        } while (((p)object4).m());
                        bl2 = false;
                    }
                }
                if (bl2 && object2 == e.b.c0) {
                    this.a.P0(e.b.q);
                    object4 = this.a;
                    ((ax.H.e)object4).k1(this.e((ax.H.f)object4, 0));
                    object4 = this.a;
                    ((ax.H.e)object4).e.e.d(((ax.H.e)object4).W());
                }
                if (bl2 && object == e.b.c0) {
                    this.a.g1(e.b.q);
                    object4 = this.a;
                    ((ax.H.e)object4).L0(this.e((ax.H.f)object4, 1));
                    object4 = this.a;
                    ((ax.H.e)object4).f.e.d(((ax.H.e)object4).x());
                }
            }
            object3 = this.a;
            Object object5 = ((ax.H.e)object3).Z[0];
            object4 = e.b.q;
            if (object5 != object4 && object5 != e.b.e0) {
                n9 = 0;
            } else {
                n9 = ((ax.H.e)object3).W() + n11;
                this.a.e.i.d(n9);
                this.a.e.e.d(n9 - n11);
                this.m();
                object5 = this.a;
                object3 = ((ax.H.e)object5).Z[1];
                if (object3 == object4 || object3 == e.b.e0) {
                    n9 = ((ax.H.e)object5).x() + n10;
                    this.a.f.i.d(n9);
                    this.a.f.e.d(n9 - n10);
                }
                this.m();
                n9 = 1;
            }
            object4 = this.e;
            n11 = ((ArrayList)object4).size();
            for (n10 = 0; n10 < n11; ++n10) {
                object3 = ((ArrayList)object4).get(n10);
                object3 = (p)object3;
                if (((p)object3).b == this.a && !((p)object3).g) continue;
                ((p)object3).e();
            }
            object4 = this.e;
            n8 = ((ArrayList)object4).size();
            n10 = 0;
            while (n10 < n8) {
                object3 = ((ArrayList)object4).get(n10);
                n11 = n10 + 1;
                object3 = (p)object3;
                if (n9 == 0 && ((p)object3).b == this.a) {
                    n10 = n11;
                    continue;
                }
                if (!((p)object3).h.j) {
                    bl = bl3;
                } else if (!((p)object3).i.j && !(object3 instanceof j)) {
                    bl = bl3;
                } else {
                    n10 = n11;
                    if (((p)object3).e.j) continue;
                    n10 = n11;
                    if (object3 instanceof c) continue;
                    n10 = n11;
                    if (object3 instanceof j) continue;
                    bl = bl3;
                }
                break block20;
            }
            bl = true;
        }
        this.a.P0((e.b)((Object)object2));
        this.a.g1((e.b)((Object)object));
        return bl;
    }

    public boolean g(boolean bl) {
        if (this.b) {
            Object object = this.a.L0;
            int n8 = ((ArrayList)object).size();
            for (int i8 = 0; i8 < n8; ++i8) {
                Object object2 = ((ArrayList)object).get(i8);
                ((ax.H.e)object2).n();
                ((ax.H.e)object2).a = false;
                l l8 = ((ax.H.e)object2).e;
                l8.e.j = false;
                l8.g = false;
                l8.r();
                object2 = ((ax.H.e)object2).f;
                ((p)object2).e.j = false;
                ((p)object2).g = false;
                ((n)object2).q();
            }
            this.a.n();
            object = this.a;
            ((ax.H.e)object).a = false;
            object = ((ax.H.e)object).e;
            ((p)object).e.j = false;
            ((p)object).g = false;
            ((l)object).r();
            object = this.a.f;
            ((p)object).e.j = false;
            ((p)object).g = false;
            ((n)object).q();
            this.c();
        }
        if (this.b(this.d)) {
            return false;
        }
        this.a.m1(0);
        this.a.n1(0);
        this.a.e.h.d(0);
        this.a.f.h.d(0);
        return true;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean h(boolean var1_1, int var2_2) {
        block20: {
            block19: {
                block21: {
                    var10_3 /* !! */  = this.a;
                    var9_4 = false;
                    var10_3 /* !! */  = var10_3 /* !! */ .u(0);
                    var11_5 = this.a.u(1);
                    var5_6 = this.a.X();
                    var6_7 = this.a.Y();
                    if (var1_1 && (var10_3 /* !! */  == (var12_8 /* !! */  = e.b.c0) || var11_5 == var12_8 /* !! */ )) {
                        block18: {
                            var12_8 /* !! */  = this.e;
                            var7_9 = var12_8 /* !! */ .size();
                            var3_10 = 0;
                            while (true) {
                                var8_12 = var1_1;
                                if (var3_10 >= var7_9) break block18;
                                var13_13 /* !! */  = var12_8 /* !! */ .get(var3_10);
                                var4_11 = var3_10 + 1;
                                var13_13 /* !! */  = (p)var13_13 /* !! */ ;
                                var3_10 = var4_11;
                                if (var13_13 /* !! */ .f != var2_2) continue;
                                var3_10 = var4_11;
                                if (!var13_13 /* !! */ .m()) break;
                            }
                            var8_12 = false;
                        }
                        if (var2_2 == 0) {
                            if (var8_12 && var10_3 /* !! */  == e.b.c0) {
                                this.a.P0(e.b.q);
                                var12_8 /* !! */  = this.a;
                                var12_8 /* !! */ .k1(this.e((ax.H.f)var12_8 /* !! */ , 0));
                                var12_8 /* !! */  = this.a;
                                var12_8 /* !! */ .e.e.d(var12_8 /* !! */ .W());
                            }
                        } else if (var8_12 && var11_5 == e.b.c0) {
                            this.a.g1(e.b.q);
                            var12_8 /* !! */  = this.a;
                            var12_8 /* !! */ .L0(this.e((ax.H.f)var12_8 /* !! */ , 1));
                            var12_8 /* !! */  = this.a;
                            var12_8 /* !! */ .f.e.d(var12_8 /* !! */ .x());
                        }
                    }
                    if (var2_2 != 0) break block21;
                    var12_8 /* !! */  = this.a;
                    var13_13 /* !! */  = var12_8 /* !! */ .Z[0];
                    if (var13_13 /* !! */  == e.b.q || var13_13 /* !! */  == e.b.e0) {
                        var3_10 = var12_8 /* !! */ .W() + var5_6;
                        this.a.e.i.d(var3_10);
                        this.a.e.e.d(var3_10 - var5_6);
lbl45:
                        // 2 sources

                        while (true) {
                            var3_10 = 1;
                            break block19;
                            break;
                        }
                    }
                    ** GOTO lbl-1000
                }
                var13_13 /* !! */  = this.a;
                var12_8 /* !! */  = var13_13 /* !! */ .Z[1];
                if (var12_8 /* !! */  != e.b.q && var12_8 /* !! */  != e.b.e0) lbl-1000:
                // 2 sources

                {
                    var3_10 = 0;
                } else {
                    var3_10 = var13_13 /* !! */ .x() + var6_7;
                    this.a.f.i.d(var3_10);
                    this.a.f.e.d(var3_10 - var6_7);
                    ** continue;
                }
            }
            this.m();
            var12_8 /* !! */  = this.e;
            var5_6 = var12_8 /* !! */ .size();
            for (var4_11 = 0; var4_11 < var5_6; ++var4_11) {
                var13_13 /* !! */  = var12_8 /* !! */ .get(var4_11);
                var13_13 /* !! */  = (p)var13_13 /* !! */ ;
                if (var13_13 /* !! */ .f != var2_2 || var13_13 /* !! */ .b == this.a && !var13_13 /* !! */ .g) continue;
                var13_13 /* !! */ .e();
            }
            var12_8 /* !! */  = this.e;
            var6_7 = var12_8 /* !! */ .size();
            var4_11 = 0;
            while (var4_11 < var6_7) {
                var13_13 /* !! */  = var12_8 /* !! */ .get(var4_11);
                var5_6 = var4_11 + 1;
                var13_13 /* !! */  = (p)var13_13 /* !! */ ;
                if (var13_13 /* !! */ .f != var2_2) {
                    var4_11 = var5_6;
                    continue;
                }
                if (var3_10 == 0 && var13_13 /* !! */ .b == this.a) {
                    var4_11 = var5_6;
                    continue;
                }
                if (!var13_13 /* !! */ .h.j) {
                    var1_1 = var9_4;
                } else if (!var13_13 /* !! */ .i.j) {
                    var1_1 = var9_4;
                } else {
                    var4_11 = var5_6;
                    if (var13_13 /* !! */  instanceof c) continue;
                    var4_11 = var5_6;
                    if (var13_13 /* !! */ .e.j) continue;
                    var1_1 = var9_4;
                }
                break block20;
            }
            var1_1 = true;
        }
        this.a.P0((e.b)var10_3 /* !! */ );
        this.a.g1(var11_5);
        return var1_1;
    }

    public void j() {
        this.b = true;
    }

    public void k() {
        this.c = true;
    }

    public void m() {
        ArrayList<ax.H.e> arrayList = this.a.L0;
        int n8 = arrayList.size();
        int n9 = 0;
        while (n9 < n8) {
            ax.H.e e8 = arrayList.get(n9);
            int n10 = n9 + 1;
            if (e8.a) {
                n9 = n10;
                continue;
            }
            Object object = e8.Z;
            e.b b8 = object[0];
            e.b b9 = object[1];
            n9 = e8.w;
            int n11 = e8.x;
            e.b b10 = e.b.c0;
            n9 = b8 != b10 && (b8 != e.b.d0 || n9 != 1) ? 0 : 1;
            n11 = b9 != b10 && (b9 != e.b.d0 || n11 != 1) ? 0 : 1;
            g g8 = e8.e.e;
            boolean bl = g8.j;
            object = e8.f.e;
            boolean bl2 = ((f)object).j;
            if (bl && bl2) {
                b8 = e.b.q;
                this.l(e8, b8, g8.g, b8, ((f)object).g);
                e8.a = true;
            } else if (bl && n11 != 0) {
                this.l(e8, e.b.q, g8.g, b10, ((f)object).g);
                if (b9 == e.b.d0) {
                    e8.f.e.m = e8.x();
                } else {
                    e8.f.e.d(e8.x());
                    e8.a = true;
                }
            } else if (bl2 && n9 != 0) {
                this.l(e8, b10, g8.g, e.b.q, ((f)object).g);
                if (b8 == e.b.d0) {
                    e8.e.e.m = e8.W();
                } else {
                    e8.e.e.d(e8.W());
                    e8.a = true;
                }
            }
            n9 = n10;
            if (!e8.a) continue;
            object = e8.f.l;
            n9 = n10;
            if (object == null) continue;
            ((g)object).d(e8.p());
            n9 = n10;
        }
    }

    public void n(b.b b8) {
        this.g = b8;
    }
}

