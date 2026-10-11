/*
 * Decompiled with CFR 0.152.
 */
package ax.I;

import ax.H.a;
import ax.H.d;
import ax.H.e;
import ax.H.f;
import ax.H.m;
import ax.I.b;
import java.util.ArrayList;
import java.util.Iterator;

public class h {
    private static b.a a = new b.a();
    private static int b = 0;
    private static int c = 0;

    private static boolean a(int n8, e e8) {
        e.b b8;
        e.b b9 = e8.A();
        e.b b10 = e8.T();
        Object object = e8.K() != null ? (f)e8.K() : null;
        if (object != null) {
            object.A();
            b8 = e.b.q;
        }
        if (object != null) {
            object.T();
            object = e.b.q;
        }
        n8 = !(b9 == (object = e.b.q) || e8.n0() || b9 == e.b.c0 || b9 == (b8 = e.b.d0) && e8.w == 0 && e8.d0 == 0.0f && e8.a0(0) || b9 == b8 && e8.w == 1 && e8.d0(0, e8.W())) ? 0 : 1;
        boolean bl = b10 == object || e8.o0() || b10 == e.b.c0 || b10 == (object = e.b.d0) && e8.x == 0 && e8.d0 == 0.0f && e8.a0(1) || b10 == object && e8.x == 1 && e8.d0(1, e8.x());
        if (e8.d0 > 0.0f && (n8 != 0 || bl)) {
            return true;
        }
        return n8 != 0 && bl;
    }

    private static void b(int n8, e e8, b.b b8, boolean bl) {
        Object object;
        boolean bl2;
        Object object2;
        int n9;
        if (e8.g0()) {
            return;
        }
        ++b;
        if (!(e8 instanceof f) && e8.m0() && h.a(n9 = n8 + 1, e8)) {
            f.S1(n9, e8, b8, new b.a(), b.a.k);
        }
        d object32 = e8.o(d.b.c0);
        d d8 = e8.o(d.b.e0);
        int n10 = object32.e();
        int n11 = d8.e();
        if (object32.d() != null && object32.n()) {
            for (d d9 : object32.d()) {
                object2 = d9.d;
                int n12 = n8 + 1;
                bl2 = h.a(n12, (e)object2);
                if (((e)object2).m0() && bl2) {
                    f.S1(n12, (e)object2, b8, new b.a(), b.a.k);
                }
                n9 = d9 == ((e)object2).O && (object = ((e)object2).Q.f) != null && object.n() || d9 == ((e)object2).Q && (object = ((e)object2).O.f) != null && object.n() ? 1 : 0;
                Object object3 = ((e)object2).A();
                if (object3 == (object = e.b.d0) && !bl2) {
                    if (((e)object2).A() != object || ((e)object2).A < 0 || ((e)object2).z < 0 || ((e)object2).V() != 8 && (((e)object2).w != 0 || ((e)object2).v() != 0.0f) || ((e)object2).i0() || ((e)object2).l0() || n9 == 0 || ((e)object2).i0()) continue;
                    h.e(n12, e8, b8, (e)object2, bl);
                    continue;
                }
                if (((e)object2).m0()) continue;
                object = ((e)object2).O;
                if (d9 == object && ((e)object2).Q.f == null) {
                    n9 = object.f() + n10;
                    ((e)object2).F0(n9, ((e)object2).W() + n9);
                    h.b(n12, (e)object2, b8, bl);
                    continue;
                }
                object3 = ((e)object2).Q;
                if (d9 == object3 && object.f == null) {
                    n9 = n10 - ((d)object3).f();
                    ((e)object2).F0(n9 - ((e)object2).W(), n9);
                    h.b(n12, (e)object2, b8, bl);
                    continue;
                }
                if (n9 == 0 || ((e)object2).i0()) continue;
                h.d(n12, b8, (e)object2, bl);
            }
        }
        if (e8 instanceof ax.H.h) {
            return;
        }
        if (d8.d() != null && d8.n()) {
            for (d d10 : d8.d()) {
                e e9 = d10.d;
                n10 = n8 + 1;
                bl2 = h.a(n10, e9);
                if (e9.m0() && bl2) {
                    f.S1(n10, e9, b8, new b.a(), b.a.k);
                }
                n9 = d10 == e9.O && (object2 = e9.Q.f) != null && ((d)object2).n() || d10 == e9.Q && (object2 = e9.O.f) != null && ((d)object2).n() ? 1 : 0;
                object = e9.A();
                if (object == (object2 = e.b.d0) && !bl2) {
                    if (e9.A() != object2 || e9.A < 0 || e9.z < 0 || e9.V() != 8 && (e9.w != 0 || e9.v() != 0.0f) || e9.i0() || e9.l0() || n9 == 0 || e9.i0()) continue;
                    h.e(n10, e8, b8, e9, bl);
                    continue;
                }
                if (e9.m0()) continue;
                object = e9.O;
                if (d10 == object && e9.Q.f == null) {
                    n9 = object.f() + n11;
                    e9.F0(n9, e9.W() + n9);
                    h.b(n10, e9, b8, bl);
                    continue;
                }
                object2 = e9.Q;
                if (d10 == object2 && object.f == null) {
                    n9 = n11 - ((d)object2).f();
                    e9.F0(n9 - e9.W(), n9);
                    h.b(n10, e9, b8, bl);
                    continue;
                }
                if (n9 == 0 || e9.i0()) continue;
                h.d(n10, b8, e9, bl);
            }
        }
        e8.q0();
    }

    private static void c(int n8, a a8, b.b b8, int n9, boolean bl) {
        if (a8.t1()) {
            if (n9 == 0) {
                h.b(n8 + 1, a8, b8, bl);
                return;
            }
            h.i(n8 + 1, a8, b8);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void d(int n8, b.b b8, e e8, boolean bl) {
        float f8 = e8.y();
        int n9 = e8.O.f.e();
        int n10 = e8.Q.f.e();
        int n11 = e8.O.f();
        int n12 = e8.Q.f();
        if (n9 == n10) {
            f8 = 0.5f;
        } else {
            n9 = n11 + n9;
            n10 -= n12;
        }
        n11 = e8.W();
        n12 = n10 - n9 - n11;
        if (n9 > n10) {
            n12 = n9 - n10 - n11;
        }
        f8 = n12 > 0 ? f8 * (float)n12 + 0.5f : (f8 *= (float)n12);
        n12 = (int)f8;
        int n13 = n12 + n9;
        n12 = n13 + n11;
        if (n9 > n10) {
            n12 = n13 - n11;
        }
        e8.F0(n13, n12);
        h.b(n8 + 1, e8, b8, bl);
    }

    private static void e(int n8, e e8, b.b b8, e e9, boolean bl) {
        float f8 = e9.y();
        int n9 = e9.O.f.e() + e9.O.f();
        int n10 = e9.Q.f.e() - e9.Q.f();
        if (n10 >= n9) {
            int n11;
            int n12 = n11 = e9.W();
            if (e9.V() != 8) {
                int n13 = e9.w;
                if (n13 == 2) {
                    n12 = e8 instanceof f ? e8.W() : e8.K().W();
                    n12 = (int)(e9.y() * 0.5f * (float)n12);
                } else {
                    n12 = n11;
                    if (n13 == 0) {
                        n12 = n10 - n9;
                    }
                }
                n11 = Math.max(e9.z, n12);
                n13 = e9.A;
                n12 = n11;
                if (n13 > 0) {
                    n12 = Math.min(n13, n11);
                }
            }
            n11 = n9 + (int)(f8 * (float)(n10 - n9 - n12) + 0.5f);
            e9.F0(n11, n12 + n11);
            h.b(n8 + 1, e9, b8, bl);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void f(int n8, b.b b8, e e8) {
        float f8 = e8.R();
        int n9 = e8.P.f.e();
        int n10 = e8.R.f.e();
        int n11 = e8.P.f();
        int n12 = e8.R.f();
        if (n9 == n10) {
            f8 = 0.5f;
        } else {
            n9 = n11 + n9;
            n10 -= n12;
        }
        int n13 = e8.x();
        n12 = n10 - n9 - n13;
        if (n9 > n10) {
            n12 = n9 - n10 - n13;
        }
        f8 = n12 > 0 ? f8 * (float)n12 + 0.5f : (f8 *= (float)n12);
        int n14 = (int)f8;
        n11 = n9 + n14;
        n12 = n11 + n13;
        if (n9 > n10) {
            n11 = n9 - n14;
            n12 = n11 - n13;
        }
        e8.I0(n11, n12);
        h.i(n8 + 1, e8, b8);
    }

    private static void g(int n8, e e8, b.b b8, e e9) {
        float f8 = e9.R();
        int n9 = e9.P.f.e() + e9.P.f();
        int n10 = e9.R.f.e() - e9.R.f();
        if (n10 >= n9) {
            int n11;
            int n12 = n11 = e9.x();
            if (e9.V() != 8) {
                int n13 = e9.x;
                if (n13 == 2) {
                    n12 = e8 instanceof f ? e8.x() : e8.K().x();
                    n12 = (int)(f8 * 0.5f * (float)n12);
                } else {
                    n12 = n11;
                    if (n13 == 0) {
                        n12 = n10 - n9;
                    }
                }
                n11 = Math.max(e9.C, n12);
                n13 = e9.D;
                n12 = n11;
                if (n13 > 0) {
                    n12 = Math.min(n13, n11);
                }
            }
            n11 = n9 + (int)(f8 * (float)(n10 - n9 - n12) + 0.5f);
            e9.I0(n11, n12 + n11);
            h.i(n8 + 1, e9, b8);
        }
    }

    public static void h(f e8, b.b b8) {
        int n8;
        int n9;
        int n10;
        int n11;
        Object object = e8.A();
        Object object2 = e8.T();
        b = 0;
        c = 0;
        e8.v0();
        ArrayList<e> arrayList = ((m)e8).r1();
        int n12 = arrayList.size();
        for (n11 = 0; n11 < n12; ++n11) {
            arrayList.get(n11).v0();
        }
        boolean bl = ((f)e8).P1();
        if (object == e.b.q) {
            e8.F0(0, e8.W());
        } else {
            e8.G0(0);
        }
        int n13 = 0;
        n11 = 0;
        for (n10 = 0; n10 < n12; ++n10) {
            object = arrayList.get(n10);
            if (object instanceof ax.H.h) {
                object = (ax.H.h)object;
                n9 = n13;
                n8 = n11;
                if (((ax.H.h)object).s1() == 1) {
                    if (((ax.H.h)object).t1() != -1) {
                        ((ax.H.h)object).w1(((ax.H.h)object).t1());
                    } else if (((ax.H.h)object).u1() != -1 && e8.n0()) {
                        ((ax.H.h)object).w1(e8.W() - ((ax.H.h)object).u1());
                    } else if (e8.n0()) {
                        ((ax.H.h)object).w1((int)(((ax.H.h)object).v1() * (float)e8.W() + 0.5f));
                    }
                    n9 = 1;
                    n8 = n11;
                }
            } else {
                n9 = n13;
                n8 = n11;
                if (object instanceof a) {
                    n9 = n13;
                    n8 = n11;
                    if (((a)object).x1() == 0) {
                        n8 = 1;
                        n9 = n13;
                    }
                }
            }
            n13 = n9;
            n11 = n8;
        }
        if (n13 != 0) {
            for (n10 = 0; n10 < n12; ++n10) {
                object = arrayList.get(n10);
                if (!(object instanceof ax.H.h) || ((ax.H.h)(object = (ax.H.h)object)).s1() != 1) continue;
                h.b(0, (e)object, b8, bl);
            }
        }
        h.b(0, e8, b8, bl);
        if (n11 != 0) {
            for (n11 = 0; n11 < n12; ++n11) {
                object = arrayList.get(n11);
                if (!(object instanceof a) || ((a)(object = (a)object)).x1() != 0) continue;
                h.c(0, (a)object, b8, 0, bl);
            }
        }
        if (object2 == e.b.q) {
            e8.I0(0, e8.x());
        } else {
            e8.H0(0);
        }
        n13 = 0;
        n11 = 0;
        for (n10 = 0; n10 < n12; ++n10) {
            object2 = arrayList.get(n10);
            if (object2 instanceof ax.H.h) {
                object2 = (ax.H.h)object2;
                n8 = n13;
                n9 = n11;
                if (((ax.H.h)object2).s1() == 0) {
                    if (((ax.H.h)object2).t1() != -1) {
                        ((ax.H.h)object2).w1(((ax.H.h)object2).t1());
                    } else if (((ax.H.h)object2).u1() != -1 && e8.o0()) {
                        ((ax.H.h)object2).w1(e8.x() - ((ax.H.h)object2).u1());
                    } else if (e8.o0()) {
                        ((ax.H.h)object2).w1((int)(((ax.H.h)object2).v1() * (float)e8.x() + 0.5f));
                    }
                    n8 = 1;
                    n9 = n11;
                }
            } else {
                n8 = n13;
                n9 = n11;
                if (object2 instanceof a) {
                    n8 = n13;
                    n9 = n11;
                    if (((a)object2).x1() == 1) {
                        n9 = 1;
                        n8 = n13;
                    }
                }
            }
            n13 = n8;
            n11 = n9;
        }
        if (n13 != 0) {
            for (n10 = 0; n10 < n12; ++n10) {
                object2 = arrayList.get(n10);
                if (!(object2 instanceof ax.H.h) || ((ax.H.h)(object2 = (ax.H.h)object2)).s1() != 0) continue;
                h.i(1, (e)object2, b8);
            }
        }
        h.i(0, e8, b8);
        if (n11 != 0) {
            for (n11 = 0; n11 < n12; ++n11) {
                e8 = arrayList.get(n11);
                if (!(e8 instanceof a) || ((a)(e8 = (a)e8)).x1() != 1) continue;
                h.c(0, (a)e8, b8, 1, bl);
            }
        }
        for (n11 = 0; n11 < n12; ++n11) {
            e8 = arrayList.get(n11);
            if (!e8.m0() || !h.a(0, e8)) continue;
            f.S1(0, e8, b8, a, b.a.k);
            if (e8 instanceof ax.H.h) {
                if (((ax.H.h)e8).s1() == 0) {
                    h.i(0, e8, b8);
                    continue;
                }
                h.b(0, e8, b8, bl);
                continue;
            }
            h.b(0, e8, b8, bl);
            h.i(0, e8, b8);
        }
    }

    private static void i(int n8, e e8, b.b b8) {
        d d8;
        Object object;
        boolean bl;
        Iterator<d> iterator;
        Object object2;
        int n9;
        if (e8.p0()) {
            return;
        }
        ++c;
        if (!(e8 instanceof f) && e8.m0() && h.a(n9 = n8 + 1, e8)) {
            f.S1(n9, e8, b8, new b.a(), b.a.k);
        }
        Object object32 = e8.o(d.b.d0);
        d object42 = e8.o(d.b.f0);
        int n10 = ((d)object32).e();
        int n11 = object42.e();
        if (((d)object32).d() != null && ((d)object32).n()) {
            object2 = ((d)object32).d().iterator();
            while (object2.hasNext()) {
                Object object4;
                iterator = object2.next();
                object32 = ((d)((Object)iterator)).d;
                int n12 = n8 + 1;
                bl = h.a(n12, (e)object32);
                if (((e)object32).m0() && bl) {
                    f.S1(n12, (e)object32, b8, new b.a(), b.a.k);
                }
                n9 = iterator == ((e)object32).P && (object = ((e)object32).R.f) != null && object.n() || iterator == ((e)object32).R && (object = ((e)object32).P.f) != null && object.n() ? 1 : 0;
                object = ((e)object32).T();
                if (object == (object4 = e.b.d0) && !bl) {
                    if (((e)object32).T() != object4 || ((e)object32).D < 0 || ((e)object32).C < 0 || ((e)object32).V() != 8 && (((e)object32).x != 0 || ((e)object32).v() != 0.0f) || ((e)object32).k0() || ((e)object32).l0() || n9 == 0 || ((e)object32).k0()) continue;
                    h.g(n12, e8, b8, (e)object32);
                    continue;
                }
                if (((e)object32).m0()) continue;
                object4 = ((e)object32).P;
                if (iterator == object4 && ((e)object32).R.f == null) {
                    n9 = ((d)object4).f() + n10;
                    ((e)object32).I0(n9, ((e)object32).x() + n9);
                    h.i(n12, (e)object32, b8);
                    continue;
                }
                object = ((e)object32).R;
                if (iterator == object && ((d)object4).f == null) {
                    n9 = n10 - object.f();
                    ((e)object32).I0(n9 - ((e)object32).x(), n9);
                    h.i(n12, (e)object32, b8);
                    continue;
                }
                if (n9 == 0 || ((e)object32).k0()) continue;
                h.f(n12, b8, (e)object32);
            }
        }
        if (e8 instanceof ax.H.h) {
            return;
        }
        if (object42.d() != null && object42.n()) {
            for (Object object32 : object42.d()) {
                iterator = ((d)object32).d;
                n10 = n8 + 1;
                bl = h.a(n10, iterator);
                if (((e)((Object)iterator)).m0() && bl) {
                    f.S1(n10, iterator, b8, new b.a(), b.a.k);
                }
                n9 = object32 == ((e)((Object)iterator)).P && (object2 = ((e)((Object)iterator)).R.f) != null && ((d)object2).n() || object32 == ((e)((Object)iterator)).R && (object2 = ((e)((Object)iterator)).P.f) != null && ((d)object2).n() ? 1 : 0;
                object2 = ((e)((Object)iterator)).T();
                if (object2 == (object = e.b.d0) && !bl) {
                    if (((e)((Object)iterator)).T() != object || ((e)((Object)iterator)).D < 0 || ((e)((Object)iterator)).C < 0 || ((e)((Object)iterator)).V() != 8 && (((e)((Object)iterator)).x != 0 || ((e)((Object)iterator)).v() != 0.0f) || ((e)((Object)iterator)).k0() || ((e)((Object)iterator)).l0() || n9 == 0 || ((e)((Object)iterator)).k0()) continue;
                    h.g(n10, e8, b8, iterator);
                    continue;
                }
                if (((e)((Object)iterator)).m0()) continue;
                object2 = ((e)((Object)iterator)).P;
                if (object32 == object2 && ((e)((Object)iterator)).R.f == null) {
                    n9 = ((d)object2).f() + n11;
                    ((e)((Object)iterator)).I0(n9, ((e)((Object)iterator)).x() + n9);
                    h.i(n10, iterator, b8);
                    continue;
                }
                object = ((e)((Object)iterator)).R;
                if (object32 == object && ((d)object2).f == null) {
                    n9 = n11 - object.f();
                    ((e)((Object)iterator)).I0(n9 - ((e)((Object)iterator)).x(), n9);
                    h.i(n10, iterator, b8);
                    continue;
                }
                if (n9 == 0 || ((e)((Object)iterator)).k0()) continue;
                h.f(n10, b8, iterator);
            }
        }
        if ((d8 = e8.o(d.b.g0)).d() != null && d8.n()) {
            n9 = d8.e();
            for (d d9 : d8.d()) {
                object32 = d9.d;
                n11 = n8 + 1;
                bl = h.a(n11, (e)object32);
                if (((e)object32).m0() && bl) {
                    f.S1(n11, (e)object32, b8, new b.a(), b.a.k);
                }
                if (((e)object32).T() == e.b.d0 && !bl || ((e)object32).m0() || d9 != ((e)object32).S) continue;
                ((e)object32).E0(d9.f() + n9);
                h.i(n11, (e)object32, b8);
            }
        }
        e8.r0();
    }
}

