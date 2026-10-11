package ax.I;

import ax.H.e;
import ax.I.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e {
    private ax.H.f a;
    private ax.H.f d;
    private boolean b = true;
    private boolean c = true;
    private ArrayList<p> e = new ArrayList<>();
    private ArrayList<m> f = new ArrayList<>();
    private b.InterfaceC0089b g = null;
    private b.a h = new b.a();
    ArrayList<m> i = new ArrayList<>();

    public e(ax.H.f fVar) {
        this.a = fVar;
        this.d = fVar;
    }

    private void a(f fVar, int i, int i2, f fVar2, ArrayList<m> arrayList, m mVar) {
        int i3;
        f fVar3;
        ArrayList<m> arrayList2;
        p pVar = fVar.d;
        if (pVar.c == null) {
            ax.H.f fVar4 = this.a;
            if (pVar == fVar4.e || pVar == fVar4.f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i2);
                arrayList.add(mVar);
            }
            m mVar2 = mVar;
            pVar.c = mVar2;
            mVar2.a(pVar);
            for (d dVar : pVar.h.k) {
                if (dVar instanceof f) {
                    i3 = i;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                    a((f) dVar, i3, 0, fVar3, arrayList2, mVar2);
                } else {
                    i3 = i;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                }
                i = i3;
                fVar2 = fVar3;
                arrayList = arrayList2;
            }
            int i4 = i;
            f fVar5 = fVar2;
            ArrayList<m> arrayList3 = arrayList;
            for (d dVar2 : pVar.i.k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i4, 1, fVar5, arrayList3, mVar2);
                }
            }
            if (i4 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).k.k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i4, 2, fVar5, arrayList3, mVar2);
                    }
                }
            }
            for (f fVar6 : pVar.h.l) {
                if (fVar6 == fVar5) {
                    mVar2.b = true;
                }
                a(fVar6, i4, 0, fVar5, arrayList3, mVar2);
            }
            for (f fVar7 : pVar.i.l) {
                if (fVar7 == fVar5) {
                    mVar2.b = true;
                }
                a(fVar7, i4, 1, fVar5, arrayList3, mVar2);
            }
            if (i4 == 1 && (pVar instanceof n)) {
                Iterator<f> it = ((n) pVar).k.l.iterator();
                while (it.hasNext()) {
                    a(it.next(), i4, 2, fVar5, arrayList3, mVar2);
                }
            }
        }
    }

    private boolean b(ax.H.f fVar) {
        float f;
        e.b bVar;
        e.b bVar2;
        e.b bVar3;
        ArrayList<ax.H.e> arrayList = fVar.L0;
        int size = arrayList.size();
        char c = 0;
        int i = 0;
        while (i < size) {
            ax.H.e eVar = arrayList.get(i);
            i++;
            ax.H.e eVar2 = eVar;
            e.b[] bVarArr = eVar2.Z;
            e.b bVar4 = bVarArr[c];
            e.b bVar5 = bVarArr[1];
            if (eVar2.V() == 8) {
                eVar2.a = true;
            } else {
                if (eVar2.B < 1.0f && bVar4 == e.b.MATCH_CONSTRAINT) {
                    eVar2.w = 2;
                }
                if (eVar2.E < 1.0f && bVar5 == e.b.MATCH_CONSTRAINT) {
                    eVar2.x = 2;
                }
                if (eVar2.v() > 0.0f) {
                    e.b bVar6 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar6 && (bVar5 == e.b.WRAP_CONTENT || bVar5 == e.b.FIXED)) {
                        eVar2.w = 3;
                    } else if (bVar5 == bVar6 && (bVar4 == e.b.WRAP_CONTENT || bVar4 == e.b.FIXED)) {
                        eVar2.x = 3;
                    } else if (bVar4 == bVar6 && bVar5 == bVar6) {
                        if (eVar2.w == 0) {
                            eVar2.w = 3;
                        }
                        if (eVar2.x == 0) {
                            eVar2.x = 3;
                        }
                    }
                }
                e.b bVar7 = e.b.MATCH_CONSTRAINT;
                if (bVar4 == bVar7 && eVar2.w == 1 && (eVar2.O.f == null || eVar2.Q.f == null)) {
                    bVar4 = e.b.WRAP_CONTENT;
                }
                if (bVar5 == bVar7 && eVar2.x == 1 && (eVar2.P.f == null || eVar2.R.f == null)) {
                    bVar5 = e.b.WRAP_CONTENT;
                }
                e.b bVar8 = bVar5;
                l lVar = eVar2.e;
                lVar.d = bVar4;
                int i2 = eVar2.w;
                lVar.a = i2;
                n nVar = eVar2.f;
                nVar.d = bVar8;
                int i3 = eVar2.x;
                nVar.a = i3;
                e.b bVar9 = e.b.MATCH_PARENT;
                if ((bVar4 == bVar9 || bVar4 == e.b.FIXED || bVar4 == e.b.WRAP_CONTENT) && (bVar8 == bVar9 || bVar8 == e.b.FIXED || bVar8 == e.b.WRAP_CONTENT)) {
                    e.b bVar10 = bVar4;
                    int W = eVar2.W();
                    if (bVar10 == bVar9) {
                        W = (fVar.W() - eVar2.O.g) - eVar2.Q.g;
                        bVar10 = e.b.FIXED;
                    }
                    int i4 = W;
                    int x = eVar2.x();
                    if (bVar8 == bVar9) {
                        x = (fVar.x() - eVar2.P.g) - eVar2.R.g;
                        bVar8 = e.b.FIXED;
                    }
                    l(eVar2, bVar10, i4, bVar8, x);
                    eVar2.e.e.d(eVar2.W());
                    eVar2.f.e.d(eVar2.x());
                    eVar2.a = true;
                } else {
                    if (bVar4 == bVar7) {
                        e.b bVar11 = e.b.WRAP_CONTENT;
                        f = 1.0f;
                        if (bVar8 == bVar11 || bVar8 == e.b.FIXED) {
                            if (i2 == 3) {
                                if (bVar8 == bVar11) {
                                    l(eVar2, bVar11, 0, bVar11, 0);
                                }
                                int x2 = eVar2.x();
                                int i5 = (int) ((x2 * eVar2.d0) + 0.5f);
                                e.b bVar12 = e.b.FIXED;
                                l(eVar2, bVar12, i5, bVar12, x2);
                                eVar2.e.e.d(eVar2.W());
                                eVar2.f.e.d(eVar2.x());
                                eVar2.a = true;
                            } else if (i2 == 1) {
                                l(eVar2, bVar11, 0, bVar8, 0);
                                eVar2.e.e.m = eVar2.W();
                            } else if (i2 == 2) {
                                e.b bVar13 = fVar.Z[0];
                                e.b bVar14 = e.b.FIXED;
                                if (bVar13 == bVar14 || bVar13 == bVar9) {
                                    l(eVar2, bVar14, (int) ((eVar2.B * fVar.W()) + 0.5f), bVar8, eVar2.x());
                                    eVar2.e.e.d(eVar2.W());
                                    eVar2.f.e.d(eVar2.x());
                                    eVar2.a = true;
                                }
                            } else {
                                ax.H.d[] dVarArr = eVar2.W;
                                if (dVarArr[0].f == null || dVarArr[1].f == null) {
                                    l(eVar2, bVar11, 0, bVar8, 0);
                                    eVar2.e.e.d(eVar2.W());
                                    eVar2.f.e.d(eVar2.x());
                                    eVar2.a = true;
                                }
                            }
                        }
                    } else {
                        f = 1.0f;
                    }
                    if (bVar8 != bVar7 || (bVar4 != (bVar2 = e.b.WRAP_CONTENT) && bVar4 != e.b.FIXED)) {
                        bVar = bVar4;
                    } else if (i3 == 3) {
                        if (bVar4 == bVar2) {
                            l(eVar2, bVar2, 0, bVar2, 0);
                        }
                        int W2 = eVar2.W();
                        float f2 = eVar2.d0;
                        if (eVar2.w() == -1) {
                            f2 = f / f2;
                        }
                        e.b bVar15 = e.b.FIXED;
                        l(eVar2, bVar15, W2, bVar15, (int) ((W2 * f2) + 0.5f));
                        eVar2.e.e.d(eVar2.W());
                        eVar2.f.e.d(eVar2.x());
                        eVar2.a = true;
                    } else if (i3 == 1) {
                        l(eVar2, bVar4, 0, bVar2, 0);
                        eVar2.f.e.m = eVar2.x();
                    } else {
                        bVar = bVar4;
                        if (i3 == 2) {
                            e.b bVar16 = fVar.Z[1];
                            bVar3 = bVar8;
                            e.b bVar17 = e.b.FIXED;
                            if (bVar16 == bVar17 || bVar16 == bVar9) {
                                l(eVar2, bVar, eVar2.W(), bVar17, (int) ((eVar2.E * fVar.x()) + 0.5f));
                                eVar2.e.e.d(eVar2.W());
                                eVar2.f.e.d(eVar2.x());
                                eVar2.a = true;
                            }
                            bVar8 = bVar3;
                        } else {
                            bVar3 = bVar8;
                            ax.H.d[] dVarArr2 = eVar2.W;
                            if (dVarArr2[2].f == null || dVarArr2[3].f == null) {
                                l(eVar2, bVar2, 0, bVar3, 0);
                                eVar2.e.e.d(eVar2.W());
                                eVar2.f.e.d(eVar2.x());
                                eVar2.a = true;
                            }
                            bVar8 = bVar3;
                        }
                    }
                    if (bVar == bVar7 && bVar8 == bVar7) {
                        if (i2 == 1 || i3 == 1) {
                            e.b bVar18 = e.b.WRAP_CONTENT;
                            l(eVar2, bVar18, 0, bVar18, 0);
                            eVar2.e.e.m = eVar2.W();
                            eVar2.f.e.m = eVar2.x();
                        } else if (i3 == 2 && i2 == 2) {
                            e.b[] bVarArr2 = fVar.Z;
                            e.b bVar19 = bVarArr2[0];
                            e.b bVar20 = e.b.FIXED;
                            if (bVar19 == bVar20 && bVarArr2[1] == bVar20) {
                                l(eVar2, bVar20, (int) ((eVar2.B * fVar.W()) + 0.5f), bVar20, (int) ((eVar2.E * fVar.x()) + 0.5f));
                                eVar2.e.e.d(eVar2.W());
                                eVar2.f.e.d(eVar2.x());
                                eVar2.a = true;
                            }
                        }
                    }
                }
                c = 0;
            }
        }
        return false;
    }

    private int e(ax.H.f fVar, int i) {
        int size = this.i.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.i.get(i2).b(fVar, i));
        }
        return (int) j;
    }

    private void i(p pVar, int i, ArrayList<m> arrayList) {
        for (d dVar : pVar.h.k) {
            if (dVar instanceof f) {
                a((f) dVar, i, 0, pVar.i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).h, i, 0, pVar.i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.i.k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i, 1, pVar.h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).i, i, 1, pVar.h, arrayList, null);
            }
        }
        int i2 = i;
        if (i2 == 1) {
            for (d dVar3 : ((n) pVar).k.k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i2, 2, null, arrayList, null);
                }
                i2 = i;
            }
        }
    }

    private void l(ax.H.e eVar, e.b bVar, int i, e.b bVar2, int i2) {
        b.a aVar = this.h;
        aVar.a = bVar;
        aVar.b = bVar2;
        aVar.c = i;
        aVar.d = i2;
        this.g.a(eVar, aVar);
        eVar.k1(this.h.e);
        eVar.L0(this.h.f);
        eVar.K0(this.h.h);
        eVar.A0(this.h.g);
    }

    public void c() {
        d(this.e);
        this.i.clear();
        m.h = 0;
        i(this.a.e, 0, this.i);
        i(this.a.f, 1, this.i);
        this.b = false;
    }

    public void d(ArrayList<p> arrayList) {
        arrayList.clear();
        this.d.e.f();
        this.d.f.f();
        arrayList.add(this.d.e);
        arrayList.add(this.d.f);
        ArrayList<ax.H.e> arrayList2 = this.d.L0;
        int size = arrayList2.size();
        HashSet hashSet = null;
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            ax.H.e eVar = arrayList2.get(i2);
            i2++;
            ax.H.e eVar2 = eVar;
            if (eVar2 instanceof ax.H.h) {
                arrayList.add(new j(eVar2));
            } else {
                if (eVar2.i0()) {
                    if (eVar2.c == null) {
                        eVar2.c = new c(eVar2, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar2.c);
                } else {
                    arrayList.add(eVar2.e);
                }
                if (eVar2.k0()) {
                    if (eVar2.d == null) {
                        eVar2.d = new c(eVar2, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar2.d);
                } else {
                    arrayList.add(eVar2.f);
                }
                if (eVar2 instanceof ax.H.j) {
                    arrayList.add(new k(eVar2));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            p pVar = arrayList.get(i3);
            i3++;
            pVar.f();
        }
        int size3 = arrayList.size();
        while (i < size3) {
            p pVar2 = arrayList.get(i);
            i++;
            p pVar3 = pVar2;
            if (pVar3.b != this.d) {
                pVar3.d();
            }
        }
    }

    public boolean f(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (this.b || this.c) {
            ArrayList<ax.H.e> arrayList = this.a.L0;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                ax.H.e eVar = arrayList.get(i);
                i++;
                ax.H.e eVar2 = eVar;
                eVar2.n();
                eVar2.a = false;
                eVar2.e.r();
                eVar2.f.q();
            }
            this.a.n();
            ax.H.f fVar = this.a;
            fVar.a = false;
            fVar.e.r();
            this.a.f.q();
            this.c = false;
        }
        if (b(this.d)) {
            return false;
        }
        this.a.m1(0);
        this.a.n1(0);
        e.b u = this.a.u(0);
        e.b u2 = this.a.u(1);
        if (this.b) {
            c();
        }
        int X = this.a.X();
        int Y = this.a.Y();
        this.a.e.h.d(X);
        this.a.f.h.d(Y);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (u == bVar || u2 == bVar) {
            if (z) {
                ArrayList<p> arrayList2 = this.e;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    p pVar = arrayList2.get(i2);
                    i2++;
                    if (!pVar.m()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z && u == e.b.WRAP_CONTENT) {
                this.a.P0(e.b.FIXED);
                ax.H.f fVar2 = this.a;
                fVar2.k1(e(fVar2, 0));
                ax.H.f fVar3 = this.a;
                fVar3.e.e.d(fVar3.W());
            }
            if (z && u2 == e.b.WRAP_CONTENT) {
                this.a.g1(e.b.FIXED);
                ax.H.f fVar4 = this.a;
                fVar4.L0(e(fVar4, 1));
                ax.H.f fVar5 = this.a;
                fVar5.f.e.d(fVar5.x());
            }
        }
        ax.H.f fVar6 = this.a;
        e.b bVar2 = fVar6.Z[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int W = fVar6.W() + X;
            this.a.e.i.d(W);
            this.a.e.e.d(W - X);
            m();
            ax.H.f fVar7 = this.a;
            e.b bVar4 = fVar7.Z[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int x = fVar7.x() + Y;
                this.a.f.i.d(x);
                this.a.f.e.d(x - Y);
            }
            m();
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList<p> arrayList3 = this.e;
        int size3 = arrayList3.size();
        int i3 = 0;
        while (i3 < size3) {
            p pVar2 = arrayList3.get(i3);
            i3++;
            p pVar3 = pVar2;
            if (pVar3.b != this.a || pVar3.g) {
                pVar3.e();
            }
        }
        ArrayList<p> arrayList4 = this.e;
        int size4 = arrayList4.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size4) {
                z3 = true;
                break;
            }
            p pVar4 = arrayList4.get(i4);
            i4++;
            p pVar5 = pVar4;
            if (z2 || pVar5.b != this.a) {
                if (!pVar5.h.j) {
                    break;
                }
                if (!pVar5.i.j) {
                    if (!(pVar5 instanceof j)) {
                        break;
                    }
                }
                if (!pVar5.e.j && !(pVar5 instanceof c) && !(pVar5 instanceof j)) {
                    break;
                }
            }
        }
        this.a.P0(u);
        this.a.g1(u2);
        return z3;
    }

    public boolean g(boolean z) {
        if (this.b) {
            ArrayList<ax.H.e> arrayList = this.a.L0;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                ax.H.e eVar = arrayList.get(i);
                i++;
                ax.H.e eVar2 = eVar;
                eVar2.n();
                eVar2.a = false;
                l lVar = eVar2.e;
                lVar.e.j = false;
                lVar.g = false;
                lVar.r();
                n nVar = eVar2.f;
                nVar.e.j = false;
                nVar.g = false;
                nVar.q();
            }
            this.a.n();
            ax.H.f fVar = this.a;
            fVar.a = false;
            l lVar2 = fVar.e;
            lVar2.e.j = false;
            lVar2.g = false;
            lVar2.r();
            n nVar2 = this.a.f;
            nVar2.e.j = false;
            nVar2.g = false;
            nVar2.q();
            c();
        }
        if (b(this.d)) {
            return false;
        }
        this.a.m1(0);
        this.a.n1(0);
        this.a.e.h.d(0);
        this.a.f.h.d(0);
        return true;
    }

    public boolean h(boolean z, int i) {
        boolean z2;
        e.b bVar;
        boolean z3 = false;
        e.b u = this.a.u(0);
        e.b u2 = this.a.u(1);
        int X = this.a.X();
        int Y = this.a.Y();
        if (z && (u == (bVar = e.b.WRAP_CONTENT) || u2 == bVar)) {
            ArrayList<p> arrayList = this.e;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                p pVar = arrayList.get(i2);
                i2++;
                p pVar2 = pVar;
                if (pVar2.f == i && !pVar2.m()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && u == e.b.WRAP_CONTENT) {
                    this.a.P0(e.b.FIXED);
                    ax.H.f fVar = this.a;
                    fVar.k1(e(fVar, 0));
                    ax.H.f fVar2 = this.a;
                    fVar2.e.e.d(fVar2.W());
                }
            } else if (z && u2 == e.b.WRAP_CONTENT) {
                this.a.g1(e.b.FIXED);
                ax.H.f fVar3 = this.a;
                fVar3.L0(e(fVar3, 1));
                ax.H.f fVar4 = this.a;
                fVar4.f.e.d(fVar4.x());
            }
        }
        if (i == 0) {
            ax.H.f fVar5 = this.a;
            e.b bVar2 = fVar5.Z[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int W = fVar5.W() + X;
                this.a.e.i.d(W);
                this.a.e.e.d(W - X);
                z2 = true;
            }
            z2 = false;
        } else {
            ax.H.f fVar6 = this.a;
            e.b bVar3 = fVar6.Z[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int x = fVar6.x() + Y;
                this.a.f.i.d(x);
                this.a.f.e.d(x - Y);
                z2 = true;
            }
            z2 = false;
        }
        m();
        ArrayList<p> arrayList2 = this.e;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            p pVar3 = arrayList2.get(i3);
            i3++;
            p pVar4 = pVar3;
            if (pVar4.f == i && (pVar4.b != this.a || pVar4.g)) {
                pVar4.e();
            }
        }
        ArrayList<p> arrayList3 = this.e;
        int size3 = arrayList3.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                z3 = true;
                break;
            }
            p pVar5 = arrayList3.get(i4);
            i4++;
            p pVar6 = pVar5;
            if (pVar6.f == i && (z2 || pVar6.b != this.a)) {
                if (!pVar6.h.j) {
                    break;
                }
                if (!pVar6.i.j) {
                    break;
                }
                if (!(pVar6 instanceof c) && !pVar6.e.j) {
                    break;
                }
            }
        }
        this.a.P0(u);
        this.a.g1(u2);
        return z3;
    }

    public void j() {
        this.b = true;
    }

    public void k() {
        this.c = true;
    }

    public void m() {
        g gVar;
        ArrayList<ax.H.e> arrayList = this.a.L0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            ax.H.e eVar = arrayList.get(i);
            i++;
            ax.H.e eVar2 = eVar;
            if (!eVar2.a) {
                e.b[] bVarArr = eVar2.Z;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i2 = eVar2.w;
                int i3 = eVar2.x;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i2 == 1);
                boolean z2 = bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i3 == 1);
                g gVar2 = eVar2.e.e;
                boolean z3 = gVar2.j;
                g gVar3 = eVar2.f.e;
                boolean z4 = gVar3.j;
                if (z3 && z4) {
                    e.b bVar4 = e.b.FIXED;
                    l(eVar2, bVar4, gVar2.g, bVar4, gVar3.g);
                    eVar2.a = true;
                } else if (z3 && z2) {
                    l(eVar2, e.b.FIXED, gVar2.g, bVar3, gVar3.g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        eVar2.f.e.m = eVar2.x();
                    } else {
                        eVar2.f.e.d(eVar2.x());
                        eVar2.a = true;
                    }
                } else if (z4 && z) {
                    l(eVar2, bVar3, gVar2.g, e.b.FIXED, gVar3.g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        eVar2.e.e.m = eVar2.W();
                    } else {
                        eVar2.e.e.d(eVar2.W());
                        eVar2.a = true;
                    }
                }
                if (eVar2.a && (gVar = eVar2.f.l) != null) {
                    gVar.d(eVar2.p());
                }
            }
        }
    }

    public void n(b.InterfaceC0089b interfaceC0089b) {
        this.g = interfaceC0089b;
    }
}
