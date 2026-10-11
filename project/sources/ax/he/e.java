package ax.he;

import ax.be.C1735c;

/* loaded from: classes3.dex */
final class e extends c {
    private final f[] B;
    private int C;
    private int D;
    private ax.ge.g E;
    private final int[] F;
    private final g G;

    e(ax.ie.e eVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, C1735c c1735c) {
        super(eVar, ax.ge.f.g(i4, Math.max(i5, 4096), 4096, i6, 273, i7, i8, c1735c), i, i2, i3, i4, i6);
        this.B = new f[4096];
        this.C = 0;
        this.D = 0;
        this.F = new int[4];
        this.G = new g();
        for (int i9 = 0; i9 < 4096; i9++) {
            this.B[i9] = new f();
        }
    }

    private void D(int i, int i2, int i3, int i4) {
        boolean z;
        int e = this.n.e(0);
        int e2 = this.n.e(this.B[this.C].b[0] + 1);
        int d = this.B[this.C].c + this.o.d(e, e2, this.n.e(1), i, this.B[this.C].a);
        f[] fVarArr = this.B;
        int i5 = this.C;
        if (d < fVarArr[i5 + 1].c) {
            fVarArr[i5 + 1].b(d, i5, -1);
            z = true;
        } else {
            z = false;
        }
        if (e2 == e) {
            f[] fVarArr2 = this.B;
            int i6 = this.C;
            if (fVarArr2[i6 + 1].d == i6 || fVarArr2[i6 + 1].e != 0) {
                int v = v(i4, fVarArr2[i6].a, i2);
                f[] fVarArr3 = this.B;
                int i7 = this.C;
                if (v <= fVarArr3[i7 + 1].c) {
                    fVarArr3[i7 + 1].b(v, i7, 0);
                    z = true;
                }
            }
        }
        if (z || e2 == e || i3 <= 2) {
            return;
        }
        int i8 = this.n.i(1, this.B[this.C].b[0], Math.min(this.r, i3 - 1));
        if (i8 >= 2) {
            this.G.d(this.B[this.C].a);
            this.G.e();
            int p = d + p(0, i8, this.G, (i + 1) & this.a);
            int i9 = this.C + 1 + i8;
            while (true) {
                int i10 = this.D;
                if (i10 >= i9) {
                    break;
                }
                f[] fVarArr4 = this.B;
                int i11 = i10 + 1;
                this.D = i11;
                fVarArr4[i11].a();
            }
            f fVar = this.B[i9];
            if (p < fVar.c) {
                fVar.c(p, this.C, 0);
            }
        }
    }

    private int E(int i, int i2, int i3, int i4) {
        int i5;
        int min = Math.min(i3, this.r);
        int i6 = 2;
        for (int i7 = 0; i7 < 4; i7++) {
            int h = this.n.h(this.B[this.C].b[i7], min);
            if (h >= 2) {
                while (true) {
                    int i8 = this.D;
                    i5 = this.C;
                    if (i8 >= i5 + h) {
                        break;
                    }
                    f[] fVarArr = this.B;
                    int i9 = i8 + 1;
                    this.D = i9;
                    fVarArr[i9].a();
                }
                int q = q(i4, i7, this.B[i5].a, i2);
                for (int i10 = h; i10 >= 2; i10--) {
                    int c = this.q.c(i10, i2) + q;
                    f[] fVarArr2 = this.B;
                    int i11 = this.C;
                    if (c < fVarArr2[i11 + i10].c) {
                        fVarArr2[i11 + i10].b(c, i11, i7);
                    }
                }
                if (i7 == 0) {
                    i6 = h + 1;
                }
                int i12 = i6;
                int i13 = this.n.i(h + 1, this.B[this.C].b[i7], Math.min(this.r, (i3 - h) - 1));
                if (i13 >= 2) {
                    int c2 = q + this.q.c(h, i2);
                    this.G.d(this.B[this.C].a);
                    this.G.f();
                    int i14 = i + h;
                    int d = c2 + this.o.d(this.n.f(h, 0), this.n.e(0), this.n.f(h, 1), i14, this.G);
                    this.G.e();
                    int p = d + p(0, i13, this.G, (i14 + 1) & this.a);
                    int i15 = this.C + h + 1 + i13;
                    while (true) {
                        int i16 = this.D;
                        if (i16 >= i15) {
                            break;
                        }
                        f[] fVarArr3 = this.B;
                        int i17 = i16 + 1;
                        this.D = i17;
                        fVarArr3[i17].a();
                    }
                    f fVar = this.B[i15];
                    if (p < fVar.c) {
                        fVar.d(p, this.C, i7, h, 0);
                    }
                }
                i6 = i12;
            }
        }
        return i6;
    }

    private void F(int i, int i2, int i3, int i4, int i5) {
        int i6;
        ax.ge.g gVar;
        int[] iArr;
        int i7;
        ax.ge.g gVar2 = this.E;
        if (gVar2.a[gVar2.c - 1] > i3) {
            gVar2.c = 0;
            while (true) {
                gVar = this.E;
                iArr = gVar.a;
                i7 = gVar.c;
                if (iArr[i7] >= i3) {
                    break;
                } else {
                    gVar.c = i7 + 1;
                }
            }
            gVar.c = i7 + 1;
            iArr[i7] = i3;
        }
        ax.ge.g gVar3 = this.E;
        if (gVar3.a[gVar3.c - 1] < i5) {
            return;
        }
        while (true) {
            int i8 = this.D;
            i6 = this.C;
            ax.ge.g gVar4 = this.E;
            if (i8 >= gVar4.a[gVar4.c - 1] + i6) {
                break;
            }
            f[] fVarArr = this.B;
            int i9 = i8 + 1;
            this.D = i9;
            fVarArr[i9].a();
        }
        int u = u(i4, this.B[i6].a);
        int i10 = 0;
        while (i5 > this.E.a[i10]) {
            i10++;
        }
        int i11 = i5;
        while (true) {
            int i12 = this.E.b[i10];
            int r = r(u, i12, i11, i2);
            f[] fVarArr2 = this.B;
            int i13 = this.C;
            if (r < fVarArr2[i13 + i11].c) {
                fVarArr2[i13 + i11].b(r, i13, i12 + 4);
            }
            if (i11 == this.E.a[i10]) {
                int i14 = this.n.i(i11 + 1, i12, Math.min(this.r, (i3 - i11) - 1));
                if (i14 >= 2) {
                    this.G.d(this.B[this.C].a);
                    this.G.g();
                    int i15 = i + i11;
                    int d = r + this.o.d(this.n.f(i11, 0), this.n.e(0), this.n.f(i11, 1), i15, this.G);
                    this.G.e();
                    int p = d + p(0, i14, this.G, (i15 + 1) & this.a);
                    int i16 = this.C + i11 + 1 + i14;
                    while (true) {
                        int i17 = this.D;
                        if (i17 >= i16) {
                            break;
                        }
                        f[] fVarArr3 = this.B;
                        int i18 = i17 + 1;
                        this.D = i18;
                        fVarArr3[i18].a();
                    }
                    f fVar = this.B[i16];
                    if (p < fVar.c) {
                        fVar.d(p, this.C, i12 + 4, i11, 0);
                    }
                }
                i10++;
                if (i10 == this.E.c) {
                    return;
                }
            }
            i11++;
        }
    }

    private int G() {
        int i = this.C;
        this.D = i;
        int i2 = this.B[i].d;
        while (true) {
            f[] fVarArr = this.B;
            int i3 = this.C;
            f fVar = fVarArr[i3];
            if (fVar.f) {
                f fVar2 = fVarArr[i2];
                fVar2.d = i3;
                fVar2.e = -1;
                int i4 = i2 - 1;
                this.C = i2;
                if (fVar.g) {
                    f fVar3 = fVarArr[i4];
                    fVar3.d = i2;
                    fVar3.e = fVar.i;
                    this.C = i4;
                    i2 = fVar.h;
                } else {
                    i2 = i4;
                }
            }
            f fVar4 = fVarArr[i2];
            int i5 = fVar4.d;
            fVar4.d = this.C;
            this.C = i2;
            if (i2 <= 0) {
                int i6 = fVarArr[0].d;
                this.C = i6;
                this.y = fVarArr[i6].e;
                return i6;
            }
            i2 = i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void H() {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.he.e.H():void");
    }

    @Override // ax.he.c, ax.he.a
    public void b() {
        this.C = 0;
        this.D = 0;
        super.b();
    }

    @Override // ax.he.c
    int t() {
        int i;
        int i2;
        e eVar = this;
        int i3 = eVar.C;
        if (i3 < eVar.D) {
            f[] fVarArr = eVar.B;
            int i4 = fVarArr[i3].d;
            int i5 = i4 - i3;
            eVar.C = i4;
            eVar.y = fVarArr[i4].e;
            return i5;
        }
        eVar.C = 0;
        eVar.D = 0;
        eVar.y = -1;
        if (eVar.z == -1) {
            eVar.E = eVar.s();
        }
        int min = Math.min(eVar.n.c(), 273);
        if (min < 2) {
            return 1;
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= 4) {
                break;
            }
            eVar.F[i6] = eVar.n.h(eVar.b[i6], min);
            int[] iArr = eVar.F;
            int i8 = iArr[i6];
            if (i8 < 2) {
                iArr[i6] = 0;
            } else if (i8 > iArr[i7]) {
                i7 = i6;
            }
            i6++;
        }
        int i9 = eVar.F[i7];
        int i10 = eVar.r;
        if (i9 >= i10) {
            eVar.y = i7;
            eVar.z(i9 - 1);
            return eVar.F[i7];
        }
        ax.ge.g gVar = eVar.E;
        int i11 = gVar.c;
        if (i11 > 0) {
            i2 = gVar.a[i11 - 1];
            int i12 = gVar.b[i11 - 1];
            if (i2 >= i10) {
                eVar.y = i12 + 4;
                eVar.z(i2 - 1);
                return i2;
            }
        } else {
            i2 = 0;
        }
        int e = eVar.n.e(0);
        int e2 = eVar.n.e(eVar.b[0] + 1);
        if (i2 < 2 && e != e2 && eVar.F[i7] < 2) {
            return 1;
        }
        int k = eVar.n.k();
        int i13 = eVar.a & k;
        eVar.B[1].b(eVar.o.d(e, e2, eVar.n.e(1), k, eVar.c), 0, -1);
        int k2 = eVar.k(eVar.c, i13);
        int l = eVar.l(k2, eVar.c);
        if (e2 == e) {
            int v = eVar.v(l, eVar.c, i13);
            f fVar = eVar.B[1];
            if (v < fVar.c) {
                fVar.b(v, 0, 0);
            }
        }
        int max = Math.max(i2, eVar.F[i7]);
        eVar.D = max;
        if (max < 2) {
            eVar.y = eVar.B[1].e;
            return 1;
        }
        eVar.C();
        eVar.B[0].a.d(eVar.c);
        System.arraycopy(eVar.b, 0, eVar.B[0].b, 0, 4);
        for (int i14 = eVar.D; i14 >= 2; i14--) {
            eVar.B[i14].a();
        }
        int i15 = 0;
        for (i = 4; i15 < i; i = 4) {
            int i16 = eVar.F[i15];
            if (i16 >= 2) {
                int q = eVar.q(l, i15, eVar.c, i13);
                do {
                    int c = eVar.q.c(i16, i13) + q;
                    f fVar2 = eVar.B[i16];
                    if (c < fVar2.c) {
                        fVar2.b(c, 0, i15);
                    }
                    i16--;
                } while (i16 >= 2);
            }
            i15++;
        }
        int max2 = Math.max(eVar.F[0] + 1, 2);
        if (max2 <= i2) {
            int u = eVar.u(k2, eVar.c);
            int i17 = 0;
            while (max2 > eVar.E.a[i17]) {
                i17++;
            }
            while (true) {
                int i18 = eVar.E.b[i17];
                int r = eVar.r(u, i18, max2, i13);
                f fVar3 = eVar.B[max2];
                if (r < fVar3.c) {
                    fVar3.b(r, 0, i18 + 4);
                }
                ax.ge.g gVar2 = eVar.E;
                if (max2 == gVar2.a[i17] && (i17 = i17 + 1) == gVar2.c) {
                    break;
                }
                max2++;
            }
        }
        int min2 = Math.min(eVar.n.c(), 4095);
        while (true) {
            int i19 = eVar.C + 1;
            eVar.C = i19;
            if (i19 >= eVar.D) {
                break;
            }
            ax.ge.g s = eVar.s();
            eVar.E = s;
            int i20 = s.c;
            if (i20 > 0 && s.a[i20 - 1] >= eVar.r) {
                break;
            }
            int i21 = min2 - 1;
            int i22 = k + 1;
            int i23 = eVar.a & i22;
            eVar.H();
            f fVar4 = eVar.B[eVar.C];
            int k3 = eVar.k(fVar4.a, i23) + fVar4.c;
            int l2 = eVar.l(k3, eVar.B[eVar.C].a);
            eVar.D(i22, i23, i21, l2);
            if (i21 >= 2) {
                int E = eVar.E(i22, i23, i21, l2);
                if (eVar.E.c > 0) {
                    eVar.F(i22, i23, i21, k3, E);
                }
            }
            eVar = this;
            k = i22;
            min2 = i21;
        }
        return G();
    }
}
