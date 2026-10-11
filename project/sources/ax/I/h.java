package ax.I;

import ax.H.d;
import ax.H.e;
import ax.I.b;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {
    private static b.a a = new b.a();
    private static int b = 0;
    private static int c = 0;

    private static boolean a(int i, ax.H.e eVar) {
        e.b bVar;
        e.b bVar2;
        e.b A = eVar.A();
        e.b T = eVar.T();
        ax.H.f fVar = eVar.K() != null ? (ax.H.f) eVar.K() : null;
        if (fVar != null) {
            fVar.A();
            e.b bVar3 = e.b.FIXED;
        }
        if (fVar != null) {
            fVar.T();
            e.b bVar4 = e.b.FIXED;
        }
        e.b bVar5 = e.b.FIXED;
        boolean z = A == bVar5 || eVar.n0() || A == e.b.WRAP_CONTENT || (A == (bVar2 = e.b.MATCH_CONSTRAINT) && eVar.w == 0 && eVar.d0 == 0.0f && eVar.a0(0)) || (A == bVar2 && eVar.w == 1 && eVar.d0(0, eVar.W()));
        boolean z2 = T == bVar5 || eVar.o0() || T == e.b.WRAP_CONTENT || (T == (bVar = e.b.MATCH_CONSTRAINT) && eVar.x == 0 && eVar.d0 == 0.0f && eVar.a0(1)) || (T == bVar && eVar.x == 1 && eVar.d0(1, eVar.x()));
        if (eVar.d0 <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    private static void b(int i, ax.H.e eVar, b.InterfaceC0089b interfaceC0089b, boolean z) {
        ax.H.d dVar;
        ax.H.d dVar2;
        ax.H.d dVar3;
        ax.H.d dVar4;
        if (eVar.g0()) {
            return;
        }
        b++;
        if (!(eVar instanceof ax.H.f) && eVar.m0()) {
            int i2 = i + 1;
            if (a(i2, eVar)) {
                ax.H.f.S1(i2, eVar, interfaceC0089b, new b.a(), b.a.k);
            }
        }
        ax.H.d o = eVar.o(d.b.LEFT);
        ax.H.d o2 = eVar.o(d.b.RIGHT);
        int e = o.e();
        int e2 = o2.e();
        if (o.d() != null && o.n()) {
            Iterator<ax.H.d> it = o.d().iterator();
            while (it.hasNext()) {
                ax.H.d next = it.next();
                ax.H.e eVar2 = next.d;
                int i3 = i + 1;
                boolean a2 = a(i3, eVar2);
                if (eVar2.m0() && a2) {
                    ax.H.f.S1(i3, eVar2, interfaceC0089b, new b.a(), b.a.k);
                }
                boolean z2 = (next == eVar2.O && (dVar4 = eVar2.Q.f) != null && dVar4.n()) || (next == eVar2.Q && (dVar3 = eVar2.O.f) != null && dVar3.n());
                e.b A = eVar2.A();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (A != bVar || a2) {
                    if (!eVar2.m0()) {
                        ax.H.d dVar5 = eVar2.O;
                        if (next == dVar5 && eVar2.Q.f == null) {
                            int f = dVar5.f() + e;
                            eVar2.F0(f, eVar2.W() + f);
                            b(i3, eVar2, interfaceC0089b, z);
                        } else {
                            ax.H.d dVar6 = eVar2.Q;
                            if (next == dVar6 && dVar5.f == null) {
                                int f2 = e - dVar6.f();
                                eVar2.F0(f2 - eVar2.W(), f2);
                                b(i3, eVar2, interfaceC0089b, z);
                            } else if (z2 && !eVar2.i0()) {
                                d(i3, interfaceC0089b, eVar2, z);
                            }
                        }
                    }
                } else if (eVar2.A() == bVar && eVar2.A >= 0 && eVar2.z >= 0 && ((eVar2.V() == 8 || (eVar2.w == 0 && eVar2.v() == 0.0f)) && !eVar2.i0() && !eVar2.l0() && z2 && !eVar2.i0())) {
                    e(i3, eVar, interfaceC0089b, eVar2, z);
                }
            }
        }
        if (eVar instanceof ax.H.h) {
            return;
        }
        if (o2.d() != null && o2.n()) {
            Iterator<ax.H.d> it2 = o2.d().iterator();
            while (it2.hasNext()) {
                ax.H.d next2 = it2.next();
                ax.H.e eVar3 = next2.d;
                int i4 = i + 1;
                boolean a3 = a(i4, eVar3);
                if (eVar3.m0() && a3) {
                    ax.H.f.S1(i4, eVar3, interfaceC0089b, new b.a(), b.a.k);
                }
                boolean z3 = (next2 == eVar3.O && (dVar2 = eVar3.Q.f) != null && dVar2.n()) || (next2 == eVar3.Q && (dVar = eVar3.O.f) != null && dVar.n());
                e.b A2 = eVar3.A();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (A2 != bVar2 || a3) {
                    if (!eVar3.m0()) {
                        ax.H.d dVar7 = eVar3.O;
                        if (next2 == dVar7 && eVar3.Q.f == null) {
                            int f3 = dVar7.f() + e2;
                            eVar3.F0(f3, eVar3.W() + f3);
                            b(i4, eVar3, interfaceC0089b, z);
                        } else {
                            ax.H.d dVar8 = eVar3.Q;
                            if (next2 == dVar8 && dVar7.f == null) {
                                int f4 = e2 - dVar8.f();
                                eVar3.F0(f4 - eVar3.W(), f4);
                                b(i4, eVar3, interfaceC0089b, z);
                            } else if (z3 && !eVar3.i0()) {
                                d(i4, interfaceC0089b, eVar3, z);
                            }
                        }
                    }
                } else if (eVar3.A() == bVar2 && eVar3.A >= 0 && eVar3.z >= 0 && (eVar3.V() == 8 || (eVar3.w == 0 && eVar3.v() == 0.0f))) {
                    if (!eVar3.i0() && !eVar3.l0() && z3 && !eVar3.i0()) {
                        e(i4, eVar, interfaceC0089b, eVar3, z);
                    }
                }
            }
        }
        eVar.q0();
    }

    private static void c(int i, ax.H.a aVar, b.InterfaceC0089b interfaceC0089b, int i2, boolean z) {
        if (aVar.t1()) {
            if (i2 == 0) {
                b(i + 1, aVar, interfaceC0089b, z);
            } else {
                i(i + 1, aVar, interfaceC0089b);
            }
        }
    }

    private static void d(int i, b.InterfaceC0089b interfaceC0089b, ax.H.e eVar, boolean z) {
        float y = eVar.y();
        int e = eVar.O.f.e();
        int e2 = eVar.Q.f.e();
        int f = eVar.O.f() + e;
        int f2 = e2 - eVar.Q.f();
        if (e == e2) {
            y = 0.5f;
        } else {
            e = f;
            e2 = f2;
        }
        int W = eVar.W();
        int i2 = (e2 - e) - W;
        if (e > e2) {
            i2 = (e - e2) - W;
        }
        int i3 = ((int) (i2 > 0 ? (y * i2) + 0.5f : y * i2)) + e;
        int i4 = i3 + W;
        if (e > e2) {
            i4 = i3 - W;
        }
        eVar.F0(i3, i4);
        b(i + 1, eVar, interfaceC0089b, z);
    }

    private static void e(int i, ax.H.e eVar, b.InterfaceC0089b interfaceC0089b, ax.H.e eVar2, boolean z) {
        float y = eVar2.y();
        int e = eVar2.O.f.e() + eVar2.O.f();
        int e2 = eVar2.Q.f.e() - eVar2.Q.f();
        if (e2 >= e) {
            int W = eVar2.W();
            if (eVar2.V() != 8) {
                int i2 = eVar2.w;
                if (i2 == 2) {
                    W = (int) (eVar2.y() * 0.5f * (eVar instanceof ax.H.f ? eVar.W() : eVar.K().W()));
                } else if (i2 == 0) {
                    W = e2 - e;
                }
                W = Math.max(eVar2.z, W);
                int i3 = eVar2.A;
                if (i3 > 0) {
                    W = Math.min(i3, W);
                }
            }
            int i4 = e + ((int) ((y * ((e2 - e) - W)) + 0.5f));
            eVar2.F0(i4, W + i4);
            b(i + 1, eVar2, interfaceC0089b, z);
        }
    }

    private static void f(int i, b.InterfaceC0089b interfaceC0089b, ax.H.e eVar) {
        float R = eVar.R();
        int e = eVar.P.f.e();
        int e2 = eVar.R.f.e();
        int f = eVar.P.f() + e;
        int f2 = e2 - eVar.R.f();
        if (e == e2) {
            R = 0.5f;
        } else {
            e = f;
            e2 = f2;
        }
        int x = eVar.x();
        int i2 = (e2 - e) - x;
        if (e > e2) {
            i2 = (e - e2) - x;
        }
        int i3 = (int) (i2 > 0 ? (R * i2) + 0.5f : R * i2);
        int i4 = e + i3;
        int i5 = i4 + x;
        if (e > e2) {
            i4 = e - i3;
            i5 = i4 - x;
        }
        eVar.I0(i4, i5);
        i(i + 1, eVar, interfaceC0089b);
    }

    private static void g(int i, ax.H.e eVar, b.InterfaceC0089b interfaceC0089b, ax.H.e eVar2) {
        float R = eVar2.R();
        int e = eVar2.P.f.e() + eVar2.P.f();
        int e2 = eVar2.R.f.e() - eVar2.R.f();
        if (e2 >= e) {
            int x = eVar2.x();
            if (eVar2.V() != 8) {
                int i2 = eVar2.x;
                if (i2 == 2) {
                    x = (int) (R * 0.5f * (eVar instanceof ax.H.f ? eVar.x() : eVar.K().x()));
                } else if (i2 == 0) {
                    x = e2 - e;
                }
                x = Math.max(eVar2.C, x);
                int i3 = eVar2.D;
                if (i3 > 0) {
                    x = Math.min(i3, x);
                }
            }
            int i4 = e + ((int) ((R * ((e2 - e) - x)) + 0.5f));
            eVar2.I0(i4, x + i4);
            i(i + 1, eVar2, interfaceC0089b);
        }
    }

    public static void h(ax.H.f fVar, b.InterfaceC0089b interfaceC0089b) {
        e.b A = fVar.A();
        e.b T = fVar.T();
        b = 0;
        c = 0;
        fVar.v0();
        ArrayList<ax.H.e> r1 = fVar.r1();
        int size = r1.size();
        for (int i = 0; i < size; i++) {
            r1.get(i).v0();
        }
        boolean P1 = fVar.P1();
        if (A == e.b.FIXED) {
            fVar.F0(0, fVar.W());
        } else {
            fVar.G0(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ax.H.e eVar = r1.get(i2);
            if (eVar instanceof ax.H.h) {
                ax.H.h hVar = (ax.H.h) eVar;
                if (hVar.s1() == 1) {
                    if (hVar.t1() != -1) {
                        hVar.w1(hVar.t1());
                    } else if (hVar.u1() != -1 && fVar.n0()) {
                        hVar.w1(fVar.W() - hVar.u1());
                    } else if (fVar.n0()) {
                        hVar.w1((int) ((hVar.v1() * fVar.W()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((eVar instanceof ax.H.a) && ((ax.H.a) eVar).x1() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                ax.H.e eVar2 = r1.get(i3);
                if (eVar2 instanceof ax.H.h) {
                    ax.H.h hVar2 = (ax.H.h) eVar2;
                    if (hVar2.s1() == 1) {
                        b(0, hVar2, interfaceC0089b, P1);
                    }
                }
            }
        }
        b(0, fVar, interfaceC0089b, P1);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                ax.H.e eVar3 = r1.get(i4);
                if (eVar3 instanceof ax.H.a) {
                    ax.H.a aVar = (ax.H.a) eVar3;
                    if (aVar.x1() == 0) {
                        c(0, aVar, interfaceC0089b, 0, P1);
                    }
                }
            }
        }
        if (T == e.b.FIXED) {
            fVar.I0(0, fVar.x());
        } else {
            fVar.H0(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            ax.H.e eVar4 = r1.get(i5);
            if (eVar4 instanceof ax.H.h) {
                ax.H.h hVar3 = (ax.H.h) eVar4;
                if (hVar3.s1() == 0) {
                    if (hVar3.t1() != -1) {
                        hVar3.w1(hVar3.t1());
                    } else if (hVar3.u1() != -1 && fVar.o0()) {
                        hVar3.w1(fVar.x() - hVar3.u1());
                    } else if (fVar.o0()) {
                        hVar3.w1((int) ((hVar3.v1() * fVar.x()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((eVar4 instanceof ax.H.a) && ((ax.H.a) eVar4).x1() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                ax.H.e eVar5 = r1.get(i6);
                if (eVar5 instanceof ax.H.h) {
                    ax.H.h hVar4 = (ax.H.h) eVar5;
                    if (hVar4.s1() == 0) {
                        i(1, hVar4, interfaceC0089b);
                    }
                }
            }
        }
        i(0, fVar, interfaceC0089b);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                ax.H.e eVar6 = r1.get(i7);
                if (eVar6 instanceof ax.H.a) {
                    ax.H.a aVar2 = (ax.H.a) eVar6;
                    if (aVar2.x1() == 1) {
                        c(0, aVar2, interfaceC0089b, 1, P1);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            ax.H.e eVar7 = r1.get(i8);
            if (eVar7.m0() && a(0, eVar7)) {
                ax.H.f.S1(0, eVar7, interfaceC0089b, a, b.a.k);
                if (!(eVar7 instanceof ax.H.h)) {
                    b(0, eVar7, interfaceC0089b, P1);
                    i(0, eVar7, interfaceC0089b);
                } else if (((ax.H.h) eVar7).s1() == 0) {
                    i(0, eVar7, interfaceC0089b);
                } else {
                    b(0, eVar7, interfaceC0089b, P1);
                }
            }
        }
    }

    private static void i(int i, ax.H.e eVar, b.InterfaceC0089b interfaceC0089b) {
        ax.H.d dVar;
        ax.H.d dVar2;
        ax.H.d dVar3;
        ax.H.d dVar4;
        if (eVar.p0()) {
            return;
        }
        c++;
        if (!(eVar instanceof ax.H.f) && eVar.m0()) {
            int i2 = i + 1;
            if (a(i2, eVar)) {
                ax.H.f.S1(i2, eVar, interfaceC0089b, new b.a(), b.a.k);
            }
        }
        ax.H.d o = eVar.o(d.b.TOP);
        ax.H.d o2 = eVar.o(d.b.BOTTOM);
        int e = o.e();
        int e2 = o2.e();
        if (o.d() != null && o.n()) {
            Iterator<ax.H.d> it = o.d().iterator();
            while (it.hasNext()) {
                ax.H.d next = it.next();
                ax.H.e eVar2 = next.d;
                int i3 = i + 1;
                boolean a2 = a(i3, eVar2);
                if (eVar2.m0() && a2) {
                    ax.H.f.S1(i3, eVar2, interfaceC0089b, new b.a(), b.a.k);
                }
                boolean z = (next == eVar2.P && (dVar4 = eVar2.R.f) != null && dVar4.n()) || (next == eVar2.R && (dVar3 = eVar2.P.f) != null && dVar3.n());
                e.b T = eVar2.T();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (T != bVar || a2) {
                    if (!eVar2.m0()) {
                        ax.H.d dVar5 = eVar2.P;
                        if (next == dVar5 && eVar2.R.f == null) {
                            int f = dVar5.f() + e;
                            eVar2.I0(f, eVar2.x() + f);
                            i(i3, eVar2, interfaceC0089b);
                        } else {
                            ax.H.d dVar6 = eVar2.R;
                            if (next == dVar6 && dVar5.f == null) {
                                int f2 = e - dVar6.f();
                                eVar2.I0(f2 - eVar2.x(), f2);
                                i(i3, eVar2, interfaceC0089b);
                            } else if (z && !eVar2.k0()) {
                                f(i3, interfaceC0089b, eVar2);
                            }
                        }
                    }
                } else if (eVar2.T() == bVar && eVar2.D >= 0 && eVar2.C >= 0 && ((eVar2.V() == 8 || (eVar2.x == 0 && eVar2.v() == 0.0f)) && !eVar2.k0() && !eVar2.l0() && z && !eVar2.k0())) {
                    g(i3, eVar, interfaceC0089b, eVar2);
                }
            }
        }
        if (eVar instanceof ax.H.h) {
            return;
        }
        if (o2.d() != null && o2.n()) {
            Iterator<ax.H.d> it2 = o2.d().iterator();
            while (it2.hasNext()) {
                ax.H.d next2 = it2.next();
                ax.H.e eVar3 = next2.d;
                int i4 = i + 1;
                boolean a3 = a(i4, eVar3);
                if (eVar3.m0() && a3) {
                    ax.H.f.S1(i4, eVar3, interfaceC0089b, new b.a(), b.a.k);
                }
                boolean z2 = (next2 == eVar3.P && (dVar2 = eVar3.R.f) != null && dVar2.n()) || (next2 == eVar3.R && (dVar = eVar3.P.f) != null && dVar.n());
                e.b T2 = eVar3.T();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (T2 != bVar2 || a3) {
                    if (!eVar3.m0()) {
                        ax.H.d dVar7 = eVar3.P;
                        if (next2 == dVar7 && eVar3.R.f == null) {
                            int f3 = dVar7.f() + e2;
                            eVar3.I0(f3, eVar3.x() + f3);
                            i(i4, eVar3, interfaceC0089b);
                        } else {
                            ax.H.d dVar8 = eVar3.R;
                            if (next2 == dVar8 && dVar7.f == null) {
                                int f4 = e2 - dVar8.f();
                                eVar3.I0(f4 - eVar3.x(), f4);
                                i(i4, eVar3, interfaceC0089b);
                            } else if (z2 && !eVar3.k0()) {
                                f(i4, interfaceC0089b, eVar3);
                            }
                        }
                    }
                } else if (eVar3.T() == bVar2 && eVar3.D >= 0 && eVar3.C >= 0 && (eVar3.V() == 8 || (eVar3.x == 0 && eVar3.v() == 0.0f))) {
                    if (!eVar3.k0() && !eVar3.l0() && z2 && !eVar3.k0()) {
                        g(i4, eVar, interfaceC0089b, eVar3);
                    }
                }
            }
        }
        ax.H.d o3 = eVar.o(d.b.BASELINE);
        if (o3.d() != null && o3.n()) {
            int e3 = o3.e();
            Iterator<ax.H.d> it3 = o3.d().iterator();
            while (it3.hasNext()) {
                ax.H.d next3 = it3.next();
                ax.H.e eVar4 = next3.d;
                int i5 = i + 1;
                boolean a4 = a(i5, eVar4);
                if (eVar4.m0() && a4) {
                    ax.H.f.S1(i5, eVar4, interfaceC0089b, new b.a(), b.a.k);
                }
                if (eVar4.T() != e.b.MATCH_CONSTRAINT || a4) {
                    if (!eVar4.m0() && next3 == eVar4.S) {
                        eVar4.E0(next3.f() + e3);
                        i(i5, eVar4, interfaceC0089b);
                    }
                }
            }
        }
        eVar.r0();
    }
}
