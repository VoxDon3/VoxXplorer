package ax.H;

import ax.H.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class g extends l {
    private e[] x1;
    private int a1 = -1;
    private int b1 = -1;
    private int c1 = -1;
    private int d1 = -1;
    private int e1 = -1;
    private int f1 = -1;
    private float g1 = 0.5f;
    private float h1 = 0.5f;
    private float i1 = 0.5f;
    private float j1 = 0.5f;
    private float k1 = 0.5f;
    private float l1 = 0.5f;
    private int m1 = 0;
    private int n1 = 0;
    private int o1 = 2;
    private int p1 = 2;
    private int q1 = 0;
    private int r1 = -1;
    private int s1 = 0;
    private ArrayList<a> t1 = new ArrayList<>();
    private e[] u1 = null;
    private e[] v1 = null;
    private int[] w1 = null;
    private int y1 = 0;

    private class a {
        private int a;
        private d d;
        private d e;
        private d f;
        private d g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int q;
        private e b = null;
        int c = 0;
        private int l = 0;
        private int m = 0;
        private int n = 0;
        private int o = 0;
        private int p = 0;

        public a(int i, d dVar, d dVar2, d dVar3, d dVar4, int i2) {
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.q = 0;
            this.a = i;
            this.d = dVar;
            this.e = dVar2;
            this.f = dVar3;
            this.g = dVar4;
            this.h = g.this.z1();
            this.i = g.this.B1();
            this.j = g.this.A1();
            this.k = g.this.y1();
            this.q = i2;
        }

        private void h() {
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            int i = this.o;
            for (int i2 = 0; i2 < i && this.n + i2 < g.this.y1; i2++) {
                e eVar = g.this.x1[this.n + i2];
                if (this.a == 0) {
                    int W = eVar.W();
                    int i3 = g.this.m1;
                    if (eVar.V() == 8) {
                        i3 = 0;
                    }
                    this.l += W + i3;
                    int k2 = g.this.k2(eVar, this.q);
                    if (this.b == null || this.c < k2) {
                        this.b = eVar;
                        this.c = k2;
                        this.m = k2;
                    }
                } else {
                    int l2 = g.this.l2(eVar, this.q);
                    int k22 = g.this.k2(eVar, this.q);
                    int i4 = g.this.n1;
                    if (eVar.V() == 8) {
                        i4 = 0;
                    }
                    this.m += k22 + i4;
                    if (this.b == null || this.c < l2) {
                        this.b = eVar;
                        this.c = l2;
                        this.l = l2;
                    }
                }
            }
        }

        public void b(e eVar) {
            if (this.a == 0) {
                int l2 = g.this.l2(eVar, this.q);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    this.p++;
                    l2 = 0;
                }
                this.l += l2 + (eVar.V() != 8 ? g.this.m1 : 0);
                int k2 = g.this.k2(eVar, this.q);
                if (this.b == null || this.c < k2) {
                    this.b = eVar;
                    this.c = k2;
                    this.m = k2;
                }
            } else {
                int l22 = g.this.l2(eVar, this.q);
                int k22 = g.this.k2(eVar, this.q);
                if (eVar.T() == e.b.MATCH_CONSTRAINT) {
                    this.p++;
                    k22 = 0;
                }
                this.m += k22 + (eVar.V() != 8 ? g.this.n1 : 0);
                if (this.b == null || this.c < l22) {
                    this.b = eVar;
                    this.c = l22;
                    this.l = l22;
                }
            }
            this.o++;
        }

        public void c() {
            this.c = 0;
            this.b = null;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            this.o = 0;
            this.p = 0;
        }

        public void d(boolean z, int i, boolean z2) {
            e eVar;
            float f;
            float f2;
            int i2 = this.o;
            for (int i3 = 0; i3 < i2 && this.n + i3 < g.this.y1; i3++) {
                e eVar2 = g.this.x1[this.n + i3];
                if (eVar2 != null) {
                    eVar2.u0();
                }
            }
            if (i2 == 0 || this.b == null) {
                return;
            }
            boolean z3 = z2 && i == 0;
            int i4 = -1;
            int i5 = -1;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = z ? (i2 - 1) - i6 : i6;
                if (this.n + i7 >= g.this.y1) {
                    break;
                }
                e eVar3 = g.this.x1[this.n + i7];
                if (eVar3 != null && eVar3.V() == 0) {
                    if (i4 == -1) {
                        i4 = i6;
                    }
                    i5 = i6;
                }
            }
            e eVar4 = null;
            if (this.a != 0) {
                e eVar5 = this.b;
                eVar5.N0(g.this.a1);
                int i8 = this.h;
                if (i > 0) {
                    i8 += g.this.m1;
                }
                if (z) {
                    eVar5.Q.a(this.f, i8);
                    if (z2) {
                        eVar5.O.a(this.d, this.j);
                    }
                    if (i > 0) {
                        this.f.d.O.a(eVar5.Q, 0);
                    }
                } else {
                    eVar5.O.a(this.d, i8);
                    if (z2) {
                        eVar5.Q.a(this.f, this.j);
                    }
                    if (i > 0) {
                        this.d.d.Q.a(eVar5.O, 0);
                    }
                }
                for (int i9 = 0; i9 < i2 && this.n + i9 < g.this.y1; i9++) {
                    e eVar6 = g.this.x1[this.n + i9];
                    if (eVar6 != null) {
                        if (i9 == 0) {
                            eVar6.k(eVar6.P, this.e, this.i);
                            int i10 = g.this.b1;
                            float f3 = g.this.h1;
                            if (this.n == 0 && g.this.d1 != -1) {
                                i10 = g.this.d1;
                                f3 = g.this.j1;
                            } else if (z2 && g.this.f1 != -1) {
                                i10 = g.this.f1;
                                f3 = g.this.l1;
                            }
                            eVar6.e1(i10);
                            eVar6.d1(f3);
                        }
                        if (i9 == i2 - 1) {
                            eVar6.k(eVar6.R, this.g, this.k);
                        }
                        if (eVar4 != null) {
                            eVar6.P.a(eVar4.R, g.this.n1);
                            if (i9 == i4) {
                                eVar6.P.u(this.i);
                            }
                            eVar4.R.a(eVar6.P, 0);
                            if (i9 == i5 + 1) {
                                eVar4.R.u(this.k);
                            }
                        }
                        if (eVar6 != eVar5) {
                            if (z) {
                                int i11 = g.this.o1;
                                if (i11 == 0) {
                                    eVar6.Q.a(eVar5.Q, 0);
                                } else if (i11 == 1) {
                                    eVar6.O.a(eVar5.O, 0);
                                } else if (i11 == 2) {
                                    eVar6.O.a(eVar5.O, 0);
                                    eVar6.Q.a(eVar5.Q, 0);
                                }
                            } else {
                                int i12 = g.this.o1;
                                if (i12 == 0) {
                                    eVar6.O.a(eVar5.O, 0);
                                } else if (i12 == 1) {
                                    eVar6.Q.a(eVar5.Q, 0);
                                } else if (i12 == 2) {
                                    if (z3) {
                                        eVar6.O.a(this.d, this.h);
                                        eVar6.Q.a(this.f, this.j);
                                    } else {
                                        eVar6.O.a(eVar5.O, 0);
                                        eVar6.Q.a(eVar5.Q, 0);
                                    }
                                }
                                eVar4 = eVar6;
                            }
                        }
                        eVar4 = eVar6;
                    }
                }
                return;
            }
            e eVar7 = this.b;
            eVar7.e1(g.this.b1);
            int i13 = this.i;
            if (i > 0) {
                i13 += g.this.n1;
            }
            eVar7.P.a(this.e, i13);
            if (z2) {
                eVar7.R.a(this.g, this.k);
            }
            if (i > 0) {
                this.e.d.R.a(eVar7.P, 0);
            }
            if (g.this.p1 == 3 && !eVar7.Z()) {
                for (int i14 = 0; i14 < i2; i14++) {
                    int i15 = z ? (i2 - 1) - i14 : i14;
                    if (this.n + i15 >= g.this.y1) {
                        break;
                    }
                    eVar = g.this.x1[this.n + i15];
                    if (eVar.Z()) {
                        break;
                    }
                }
            }
            eVar = eVar7;
            int i16 = 0;
            while (i16 < i2) {
                int i17 = z ? (i2 - 1) - i16 : i16;
                if (this.n + i17 >= g.this.y1) {
                    return;
                }
                e eVar8 = g.this.x1[this.n + i17];
                if (eVar8 == null) {
                    eVar8 = eVar4;
                } else {
                    if (i16 == 0) {
                        eVar8.k(eVar8.O, this.d, this.h);
                    }
                    if (i17 == 0) {
                        int i18 = g.this.a1;
                        float f4 = g.this.g1;
                        if (z) {
                            f4 = 1.0f - f4;
                        }
                        if (this.n == 0 && g.this.c1 != -1) {
                            i18 = g.this.c1;
                            if (z) {
                                f2 = g.this.i1;
                                f = 1.0f - f2;
                                f4 = f;
                            } else {
                                f = g.this.i1;
                                f4 = f;
                            }
                        } else if (z2 && g.this.e1 != -1) {
                            i18 = g.this.e1;
                            if (z) {
                                f2 = g.this.k1;
                                f = 1.0f - f2;
                                f4 = f;
                            } else {
                                f = g.this.k1;
                                f4 = f;
                            }
                        }
                        eVar8.N0(i18);
                        eVar8.M0(f4);
                    }
                    if (i16 == i2 - 1) {
                        eVar8.k(eVar8.Q, this.f, this.j);
                    }
                    if (eVar4 != null) {
                        eVar8.O.a(eVar4.Q, g.this.m1);
                        if (i16 == i4) {
                            eVar8.O.u(this.h);
                        }
                        eVar4.Q.a(eVar8.O, 0);
                        if (i16 == i5 + 1) {
                            eVar4.Q.u(this.j);
                        }
                    }
                    if (eVar8 != eVar7) {
                        if (g.this.p1 == 3 && eVar.Z() && eVar8 != eVar && eVar8.Z()) {
                            eVar8.S.a(eVar.S, 0);
                        } else {
                            int i19 = g.this.p1;
                            if (i19 == 0) {
                                eVar8.P.a(eVar7.P, 0);
                            } else if (i19 == 1) {
                                eVar8.R.a(eVar7.R, 0);
                            } else if (z3) {
                                eVar8.P.a(this.e, this.i);
                                eVar8.R.a(this.g, this.k);
                            } else {
                                eVar8.P.a(eVar7.P, 0);
                                eVar8.R.a(eVar7.R, 0);
                            }
                        }
                        i16++;
                        eVar4 = eVar8;
                    }
                }
                i16++;
                eVar4 = eVar8;
            }
        }

        public int e() {
            return this.a == 1 ? this.m - g.this.n1 : this.m;
        }

        public int f() {
            return this.a == 0 ? this.l - g.this.m1 : this.l;
        }

        public void g(int i) {
            int i2 = this.p;
            if (i2 == 0) {
                return;
            }
            int i3 = this.o;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3 && this.n + i5 < g.this.y1; i5++) {
                e eVar = g.this.x1[this.n + i5];
                if (this.a == 0) {
                    if (eVar != null && eVar.A() == e.b.MATCH_CONSTRAINT && eVar.w == 0) {
                        g.this.D1(eVar, e.b.FIXED, i4, eVar.T(), eVar.x());
                    }
                } else if (eVar != null && eVar.T() == e.b.MATCH_CONSTRAINT && eVar.x == 0) {
                    int i6 = i4;
                    g.this.D1(eVar, eVar.A(), eVar.W(), e.b.FIXED, i6);
                    i4 = i6;
                }
            }
            h();
        }

        public void i(int i) {
            this.n = i;
        }

        public void j(int i, d dVar, d dVar2, d dVar3, d dVar4, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.d = dVar;
            this.e = dVar2;
            this.f = dVar3;
            this.g = dVar4;
            this.h = i2;
            this.i = i3;
            this.j = i4;
            this.k = i5;
            this.q = i6;
        }
    }

    private void j2(boolean z) {
        e eVar;
        float f;
        int i;
        if (this.w1 == null || this.v1 == null || this.u1 == null) {
            return;
        }
        for (int i2 = 0; i2 < this.y1; i2++) {
            this.x1[i2].u0();
        }
        int[] iArr = this.w1;
        int i3 = iArr[0];
        int i4 = iArr[1];
        float f2 = this.g1;
        e eVar2 = null;
        int i5 = 0;
        while (i5 < i3) {
            if (z) {
                i = (i3 - i5) - 1;
                f = 1.0f - this.g1;
            } else {
                f = f2;
                i = i5;
            }
            e eVar3 = this.v1[i];
            if (eVar3 != null && eVar3.V() != 8) {
                if (i5 == 0) {
                    eVar3.k(eVar3.O, this.O, z1());
                    eVar3.N0(this.a1);
                    eVar3.M0(f);
                }
                if (i5 == i3 - 1) {
                    eVar3.k(eVar3.Q, this.Q, A1());
                }
                if (i5 > 0 && eVar2 != null) {
                    eVar3.k(eVar3.O, eVar2.Q, this.m1);
                    eVar2.k(eVar2.Q, eVar3.O, 0);
                }
                eVar2 = eVar3;
            }
            i5++;
            f2 = f;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            e eVar4 = this.u1[i6];
            if (eVar4 != null && eVar4.V() != 8) {
                if (i6 == 0) {
                    eVar4.k(eVar4.P, this.P, B1());
                    eVar4.e1(this.b1);
                    eVar4.d1(this.h1);
                }
                if (i6 == i4 - 1) {
                    eVar4.k(eVar4.R, this.R, y1());
                }
                if (i6 > 0 && eVar2 != null) {
                    eVar4.k(eVar4.P, eVar2.R, this.n1);
                    eVar2.k(eVar2.R, eVar4.P, 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i7 = 0; i7 < i3; i7++) {
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = (i8 * i3) + i7;
                if (this.s1 == 1) {
                    i9 = (i7 * i4) + i8;
                }
                e[] eVarArr = this.x1;
                if (i9 < eVarArr.length && (eVar = eVarArr[i9]) != null && eVar.V() != 8) {
                    e eVar5 = this.v1[i7];
                    e eVar6 = this.u1[i8];
                    if (eVar != eVar5) {
                        eVar.k(eVar.O, eVar5.O, 0);
                        eVar.k(eVar.Q, eVar5.Q, 0);
                    }
                    if (eVar != eVar6) {
                        eVar.k(eVar.P, eVar6.P, 0);
                        eVar.k(eVar.R, eVar6.R, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int k2(e eVar, int i) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.T() == e.b.MATCH_CONSTRAINT) {
            int i2 = eVar.x;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (eVar.E * i);
                if (i3 != eVar.x()) {
                    eVar.Y0(true);
                    D1(eVar, eVar.A(), eVar.W(), e.b.FIXED, i3);
                }
                return i3;
            }
            eVar2 = eVar;
            if (i2 == 1) {
                return eVar2.x();
            }
            if (i2 == 3) {
                return (int) ((eVar2.W() * eVar2.d0) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int l2(e eVar, int i) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.A() == e.b.MATCH_CONSTRAINT) {
            int i2 = eVar.w;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (eVar.B * i);
                if (i3 != eVar.W()) {
                    eVar.Y0(true);
                    D1(eVar, e.b.FIXED, i3, eVar.T(), eVar.x());
                }
                return i3;
            }
            eVar2 = eVar;
            if (i2 == 1) {
                return eVar2.W();
            }
            if (i2 == 3) {
                return (int) ((eVar2.x() * eVar2.d0) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.W();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x010d -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x010f -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0115 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0117 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m2(ax.H.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.H.g.m2(ax.H.e[], int, int, int, int[]):void");
    }

    private void n2(e[] eVarArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        g gVar;
        int i5;
        d dVar;
        int i6;
        g gVar2 = this;
        if (i == 0) {
            return;
        }
        gVar2.t1.clear();
        int i7 = i3;
        a aVar = gVar2.new a(i2, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i7);
        gVar2.t1.add(aVar);
        if (i2 == 0) {
            i4 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i9 < i) {
                e eVar = eVarArr[i9];
                int l2 = gVar2.l2(eVar, i7);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i10 = i4;
                boolean z = (i8 == i7 || (gVar2.m1 + i8) + l2 > i7) && aVar.b != null;
                if (!z && i9 > 0 && (i6 = gVar2.r1) > 0 && i9 % i6 == 0) {
                    z = true;
                }
                if (z) {
                    aVar = gVar2.new a(i2, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i7);
                    aVar.i(i9);
                    gVar2.t1.add(aVar);
                } else if (i9 > 0) {
                    i8 += gVar2.m1 + l2;
                    aVar.b(eVar);
                    i9++;
                    i4 = i10;
                }
                i8 = l2;
                aVar.b(eVar);
                i9++;
                i4 = i10;
            }
        } else {
            i4 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i12 < i) {
                e eVar2 = eVarArr[i12];
                int k2 = gVar2.k2(eVar2, i7);
                if (eVar2.T() == e.b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i13 = i4;
                boolean z2 = (i11 == i7 || (gVar2.n1 + i11) + k2 > i7) && aVar.b != null;
                if (!z2 && i12 > 0 && (i5 = gVar2.r1) > 0 && i12 % i5 == 0) {
                    z2 = true;
                }
                if (z2) {
                    aVar = gVar2.new a(i2, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i7);
                    gVar = gVar2;
                    aVar.i(i12);
                    gVar.t1.add(aVar);
                } else {
                    gVar = gVar2;
                    if (i12 > 0) {
                        i11 += gVar.n1 + k2;
                        aVar.b(eVar2);
                        i12++;
                        i7 = i3;
                        i4 = i13;
                        gVar2 = gVar;
                    }
                }
                i11 = k2;
                aVar.b(eVar2);
                i12++;
                i7 = i3;
                i4 = i13;
                gVar2 = gVar;
            }
        }
        g gVar3 = gVar2;
        int size = gVar3.t1.size();
        d dVar2 = gVar3.O;
        d dVar3 = gVar3.P;
        d dVar4 = gVar3.Q;
        d dVar5 = gVar3.R;
        int z1 = gVar3.z1();
        int B1 = gVar3.B1();
        int A1 = gVar3.A1();
        int y1 = gVar3.y1();
        e.b A = gVar3.A();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z3 = A == bVar || gVar3.T() == bVar;
        if (i4 > 0 && z3) {
            for (int i14 = 0; i14 < size; i14++) {
                a aVar2 = gVar3.t1.get(i14);
                if (i2 == 0) {
                    aVar2.g(i3 - aVar2.f());
                } else {
                    aVar2.g(i3 - aVar2.e());
                }
            }
        }
        d dVar6 = dVar2;
        int i15 = y1;
        int i16 = 0;
        int i17 = A1;
        int i18 = B1;
        int i19 = z1;
        d dVar7 = dVar5;
        d dVar8 = dVar4;
        d dVar9 = dVar3;
        int i20 = 0;
        for (int i21 = 0; i21 < size; i21++) {
            a aVar3 = gVar3.t1.get(i21);
            if (i2 == 0) {
                if (i21 < size - 1) {
                    dVar7 = gVar3.t1.get(i21 + 1).b.P;
                    i15 = 0;
                } else {
                    dVar7 = gVar3.R;
                    i15 = gVar3.y1();
                }
                d dVar10 = aVar3.b.R;
                int i22 = i20;
                aVar3.j(i2, dVar6, dVar9, dVar8, dVar7, i19, i18, i17, i15, i3);
                int max = Math.max(i16, aVar3.f());
                int e = aVar3.e() + i22;
                if (i21 > 0) {
                    e += gVar3.n1;
                }
                i20 = e;
                i16 = max;
                dVar9 = dVar10;
                i18 = 0;
            } else {
                int i23 = i16;
                int i24 = i20;
                if (i21 < size - 1) {
                    dVar = gVar3.t1.get(i21 + 1).b.O;
                    i17 = 0;
                } else {
                    dVar = gVar3.Q;
                    i17 = gVar3.A1();
                }
                dVar8 = dVar;
                d dVar11 = aVar3.b.Q;
                aVar3.j(i2, dVar6, dVar9, dVar8, dVar7, i19, i18, i17, i15, i3);
                int f = aVar3.f() + i23;
                int max2 = Math.max(i24, aVar3.e());
                if (i21 > 0) {
                    f += gVar3.m1;
                }
                int i25 = f;
                i20 = max2;
                i16 = i25;
                dVar6 = dVar11;
                i19 = 0;
            }
        }
        iArr[0] = i16;
        iArr[1] = i20;
    }

    private void o2(e[] eVarArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        g gVar;
        int i5;
        d dVar;
        int i6;
        g gVar2 = this;
        if (i == 0) {
            return;
        }
        gVar2.t1.clear();
        int i7 = i3;
        a aVar = gVar2.new a(i2, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i7);
        gVar2.t1.add(aVar);
        if (i2 == 0) {
            int i8 = 0;
            i4 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i10 < i) {
                int i11 = i8 + 1;
                e eVar = eVarArr[i10];
                int l2 = gVar2.l2(eVar, i7);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i12 = i4;
                boolean z = (i9 == i7 || (gVar2.m1 + i9) + l2 > i7) && aVar.b != null;
                if (!z && i10 > 0 && (i6 = gVar2.r1) > 0 && i11 > i6) {
                    z = true;
                }
                if (z) {
                    aVar = gVar2.new a(i2, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i7);
                    aVar.i(i10);
                    gVar2.t1.add(aVar);
                    i8 = i11;
                    i9 = l2;
                } else {
                    i9 = i10 > 0 ? i9 + gVar2.m1 + l2 : l2;
                    i8 = 0;
                }
                aVar.b(eVar);
                i10++;
                i4 = i12;
            }
        } else {
            int i13 = 0;
            i4 = 0;
            int i14 = 0;
            while (i14 < i) {
                e eVar2 = eVarArr[i14];
                int k2 = gVar2.k2(eVar2, i7);
                if (eVar2.T() == e.b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i15 = i4;
                boolean z2 = (i13 == i7 || (gVar2.n1 + i13) + k2 > i7) && aVar.b != null;
                if (!z2 && i14 > 0 && (i5 = gVar2.r1) > 0 && i5 < 0) {
                    z2 = true;
                }
                if (z2) {
                    aVar = gVar2.new a(i2, gVar2.O, gVar2.P, gVar2.Q, gVar2.R, i7);
                    gVar = gVar2;
                    aVar.i(i14);
                    gVar.t1.add(aVar);
                } else {
                    gVar = gVar2;
                    if (i14 > 0) {
                        i13 += gVar.n1 + k2;
                        aVar.b(eVar2);
                        i14++;
                        i7 = i3;
                        i4 = i15;
                        gVar2 = gVar;
                    }
                }
                i13 = k2;
                aVar.b(eVar2);
                i14++;
                i7 = i3;
                i4 = i15;
                gVar2 = gVar;
            }
        }
        g gVar3 = gVar2;
        int size = gVar3.t1.size();
        d dVar2 = gVar3.O;
        d dVar3 = gVar3.P;
        d dVar4 = gVar3.Q;
        d dVar5 = gVar3.R;
        int z1 = gVar3.z1();
        int B1 = gVar3.B1();
        int A1 = gVar3.A1();
        int y1 = gVar3.y1();
        e.b A = gVar3.A();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z3 = A == bVar || gVar3.T() == bVar;
        if (i4 > 0 && z3) {
            for (int i16 = 0; i16 < size; i16++) {
                a aVar2 = gVar3.t1.get(i16);
                if (i2 == 0) {
                    aVar2.g(i3 - aVar2.f());
                } else {
                    aVar2.g(i3 - aVar2.e());
                }
            }
        }
        d dVar6 = dVar3;
        int i17 = y1;
        int i18 = 0;
        int i19 = A1;
        int i20 = B1;
        int i21 = z1;
        d dVar7 = dVar5;
        d dVar8 = dVar4;
        d dVar9 = dVar2;
        int i22 = 0;
        for (int i23 = 0; i23 < size; i23++) {
            a aVar3 = gVar3.t1.get(i23);
            if (i2 == 0) {
                if (i23 < size - 1) {
                    dVar7 = gVar3.t1.get(i23 + 1).b.P;
                    i17 = 0;
                } else {
                    dVar7 = gVar3.R;
                    i17 = gVar3.y1();
                }
                d dVar10 = aVar3.b.R;
                int i24 = i18;
                aVar3.j(i2, dVar9, dVar6, dVar8, dVar7, i21, i20, i19, i17, i3);
                int max = Math.max(i22, aVar3.f());
                int e = aVar3.e() + i24;
                if (i23 > 0) {
                    e += gVar3.n1;
                }
                i18 = e;
                i22 = max;
                dVar6 = dVar10;
                i20 = 0;
            } else {
                int i25 = i22;
                int i26 = i18;
                if (i23 < size - 1) {
                    dVar = gVar3.t1.get(i23 + 1).b.O;
                    i19 = 0;
                } else {
                    dVar = gVar3.Q;
                    i19 = gVar3.A1();
                }
                dVar8 = dVar;
                d dVar11 = aVar3.b.Q;
                aVar3.j(i2, dVar9, dVar6, dVar8, dVar7, i21, i20, i19, i17, i3);
                int f = aVar3.f() + i25;
                int max2 = Math.max(i26, aVar3.e());
                if (i23 > 0) {
                    f += gVar3.m1;
                }
                int i27 = f;
                i18 = max2;
                i22 = i27;
                dVar9 = dVar11;
                i21 = 0;
            }
        }
        iArr[0] = i22;
        iArr[1] = i18;
    }

    private void p2(e[] eVarArr, int i, int i2, int i3, int[] iArr) {
        a aVar;
        if (i == 0) {
            return;
        }
        if (this.t1.size() == 0) {
            aVar = new a(i2, this.O, this.P, this.Q, this.R, i3);
            this.t1.add(aVar);
        } else {
            a aVar2 = this.t1.get(0);
            aVar2.c();
            aVar2.j(i2, this.O, this.P, this.Q, this.R, z1(), B1(), A1(), y1(), i3);
            aVar = aVar2;
        }
        for (int i4 = 0; i4 < i; i4++) {
            aVar.b(eVarArr[i4]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void A2(float f) {
        this.l1 = f;
    }

    public void B2(int i) {
        this.f1 = i;
    }

    @Override // ax.H.l
    public void C1(int i, int i2, int i3, int i4) {
        int i5;
        e[] eVarArr;
        if (this.M0 > 0 && !E1()) {
            H1(0, 0);
            G1(false);
            return;
        }
        int z1 = z1();
        int A1 = A1();
        int B1 = B1();
        int y1 = y1();
        int[] iArr = new int[2];
        int i6 = (i2 - z1) - A1;
        int i7 = this.s1;
        if (i7 == 1) {
            i6 = (i4 - B1) - y1;
        }
        int i8 = i6;
        if (i7 == 0) {
            if (this.a1 == -1) {
                this.a1 = 0;
            }
            if (this.b1 == -1) {
                this.b1 = 0;
            }
        } else {
            if (this.a1 == -1) {
                this.a1 = 0;
            }
            if (this.b1 == -1) {
                this.b1 = 0;
            }
        }
        e[] eVarArr2 = this.L0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i5 = this.M0;
            if (i9 >= i5) {
                break;
            }
            if (this.L0[i9].V() == 8) {
                i10++;
            }
            i9++;
        }
        if (i10 > 0) {
            e[] eVarArr3 = new e[i5 - i10];
            int i11 = 0;
            i5 = 0;
            while (i11 < this.M0) {
                e eVar = this.L0[i11];
                e[] eVarArr4 = eVarArr3;
                if (eVar.V() != 8) {
                    eVarArr4[i5] = eVar;
                    i5++;
                }
                i11++;
                eVarArr3 = eVarArr4;
            }
            eVarArr = eVarArr3;
        } else {
            eVarArr = eVarArr2;
        }
        int i12 = i5;
        this.x1 = eVarArr;
        this.y1 = i12;
        int i13 = this.q1;
        if (i13 == 0) {
            p2(eVarArr, i12, this.s1, i8, iArr);
        } else if (i13 == 1) {
            n2(eVarArr, i12, this.s1, i8, iArr);
        } else if (i13 == 2) {
            m2(eVarArr, i12, this.s1, i8, iArr);
        } else if (i13 == 3) {
            o2(eVarArr, i12, this.s1, i8, iArr);
        }
        int i14 = iArr[0] + z1 + A1;
        int i15 = iArr[1] + B1 + y1;
        if (i == 1073741824) {
            i14 = i2;
        } else if (i == Integer.MIN_VALUE) {
            i14 = Math.min(i14, i2);
        } else if (i != 0) {
            i14 = 0;
        }
        if (i3 == 1073741824) {
            i15 = i4;
        } else if (i3 == Integer.MIN_VALUE) {
            i15 = Math.min(i15, i4);
        } else if (i3 != 0) {
            i15 = 0;
        }
        H1(i14, i15);
        k1(i14);
        L0(i15);
        G1(this.M0 > 0);
    }

    public void C2(int i) {
        this.r1 = i;
    }

    public void D2(int i) {
        this.s1 = i;
    }

    public void E2(int i) {
        this.p1 = i;
    }

    public void F2(float f) {
        this.h1 = f;
    }

    public void G2(int i) {
        this.n1 = i;
    }

    public void H2(int i) {
        this.b1 = i;
    }

    public void I2(int i) {
        this.q1 = i;
    }

    @Override // ax.H.e
    public void g(ax.E.d dVar, boolean z) {
        super.g(dVar, z);
        boolean z2 = K() != null && ((f) K()).P1();
        int i = this.q1;
        if (i != 0) {
            if (i == 1) {
                int size = this.t1.size();
                int i2 = 0;
                while (i2 < size) {
                    this.t1.get(i2).d(z2, i2, i2 == size + (-1));
                    i2++;
                }
            } else if (i == 2) {
                j2(z2);
            } else if (i == 3) {
                int size2 = this.t1.size();
                int i3 = 0;
                while (i3 < size2) {
                    this.t1.get(i3).d(z2, i3, i3 == size2 + (-1));
                    i3++;
                }
            }
        } else if (this.t1.size() > 0) {
            this.t1.get(0).d(z2, 0, true);
        }
        G1(false);
    }

    public void q2(float f) {
        this.i1 = f;
    }

    public void r2(int i) {
        this.c1 = i;
    }

    public void s2(float f) {
        this.j1 = f;
    }

    public void t2(int i) {
        this.d1 = i;
    }

    public void u2(int i) {
        this.o1 = i;
    }

    public void v2(float f) {
        this.g1 = f;
    }

    public void w2(int i) {
        this.m1 = i;
    }

    public void x2(int i) {
        this.a1 = i;
    }

    public void y2(float f) {
        this.k1 = f;
    }

    public void z2(int i) {
        this.e1 = i;
    }
}
