package ax.I;

import ax.H.d;
import ax.H.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {
    private final ArrayList<ax.H.e> a = new ArrayList<>();
    private a b = new a();
    private ax.H.f c;

    public static class a {
        public static int k = 0;
        public static int l = 1;
        public static int m = 2;
        public e.b a;
        public e.b b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public int j;
    }

    /* renamed from: ax.I.b$b, reason: collision with other inner class name */
    public interface InterfaceC0089b {
        void a(ax.H.e eVar, a aVar);

        void b();
    }

    public b(ax.H.f fVar) {
        this.c = fVar;
    }

    private boolean a(InterfaceC0089b interfaceC0089b, ax.H.e eVar, int i) {
        this.b.a = eVar.A();
        this.b.b = eVar.T();
        this.b.c = eVar.W();
        this.b.d = eVar.x();
        a aVar = this.b;
        aVar.i = false;
        aVar.j = i;
        e.b bVar = aVar.a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z = bVar == bVar2;
        boolean z2 = aVar.b == bVar2;
        boolean z3 = z && eVar.d0 > 0.0f;
        boolean z4 = z2 && eVar.d0 > 0.0f;
        if (z3 && eVar.y[0] == 4) {
            aVar.a = e.b.FIXED;
        }
        if (z4 && eVar.y[1] == 4) {
            aVar.b = e.b.FIXED;
        }
        interfaceC0089b.a(eVar, aVar);
        eVar.k1(this.b.e);
        eVar.L0(this.b.f);
        eVar.K0(this.b.h);
        eVar.A0(this.b.g);
        a aVar2 = this.b;
        aVar2.j = a.k;
        return aVar2.i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008d, code lost:
    
        if (r8 != r9) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0094, code lost:
    
        if (r5.d0 <= 0.0f) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(ax.H.f r13) {
        /*
            r12 = this;
            java.util.ArrayList<ax.H.e> r0 = r13.L0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.T1(r1)
            ax.I.b$b r2 = r13.I1()
            r3 = 0
            r4 = 0
        L12:
            if (r4 >= r0) goto La4
            java.util.ArrayList<ax.H.e> r5 = r13.L0
            java.lang.Object r5 = r5.get(r4)
            ax.H.e r5 = (ax.H.e) r5
            boolean r6 = r5 instanceof ax.H.h
            if (r6 == 0) goto L22
            goto La0
        L22:
            boolean r6 = r5 instanceof ax.H.a
            if (r6 == 0) goto L28
            goto La0
        L28:
            boolean r6 = r5.l0()
            if (r6 == 0) goto L30
            goto La0
        L30:
            if (r1 == 0) goto L47
            ax.I.l r6 = r5.e
            if (r6 == 0) goto L47
            ax.I.n r7 = r5.f
            if (r7 == 0) goto L47
            ax.I.g r6 = r6.e
            boolean r6 = r6.j
            if (r6 == 0) goto L47
            ax.I.g r6 = r7.e
            boolean r6 = r6.j
            if (r6 == 0) goto L47
            goto La0
        L47:
            ax.H.e$b r6 = r5.u(r3)
            r7 = 1
            ax.H.e$b r8 = r5.u(r7)
            ax.H.e$b r9 = ax.H.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.w
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.x
            if (r10 == r7) goto L60
            r10 = 1
            goto L61
        L60:
            r10 = 0
        L61:
            if (r10 != 0) goto L97
            boolean r11 = r13.T1(r7)
            if (r11 == 0) goto L97
            boolean r11 = r5 instanceof ax.H.l
            if (r11 != 0) goto L97
            if (r6 != r9) goto L7c
            int r11 = r5.w
            if (r11 != 0) goto L7c
            if (r8 == r9) goto L7c
            boolean r11 = r5.i0()
            if (r11 != 0) goto L7c
            r10 = 1
        L7c:
            if (r8 != r9) goto L8b
            int r11 = r5.x
            if (r11 != 0) goto L8b
            if (r6 == r9) goto L8b
            boolean r11 = r5.i0()
            if (r11 != 0) goto L8b
            r10 = 1
        L8b:
            if (r6 == r9) goto L8f
            if (r8 != r9) goto L97
        L8f:
            float r6 = r5.d0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L97
            goto L98
        L97:
            r7 = r10
        L98:
            if (r7 == 0) goto L9b
            goto La0
        L9b:
            int r6 = ax.I.b.a.k
            r12.a(r2, r5, r6)
        La0:
            int r4 = r4 + 1
            goto L12
        La4:
            r2.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.I.b.b(ax.H.f):void");
    }

    private void c(ax.H.f fVar, String str, int i, int i2, int i3) {
        int I = fVar.I();
        int H = fVar.H();
        fVar.a1(0);
        fVar.Z0(0);
        fVar.k1(i2);
        fVar.L0(i3);
        fVar.a1(I);
        fVar.Z0(H);
        this.c.X1(i);
        this.c.s1();
    }

    public long d(ax.H.f fVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z;
        int i10;
        int i11;
        int i12;
        ax.H.f fVar2;
        long j;
        boolean z2;
        int i13;
        int i14;
        boolean z3;
        boolean z4;
        b bVar = this;
        InterfaceC0089b I1 = fVar.I1();
        int size = fVar.L0.size();
        int W = fVar.W();
        int x = fVar.x();
        boolean b = ax.H.k.b(i, 128);
        boolean z5 = b || ax.H.k.b(i, 64);
        if (z5) {
            for (int i15 = 0; i15 < size; i15++) {
                ax.H.e eVar = fVar.L0.get(i15);
                e.b A = eVar.A();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                boolean z6 = (A == bVar2) && (eVar.T() == bVar2) && eVar.v() > 0.0f;
                if ((eVar.i0() && z6) || ((eVar.k0() && z6) || (eVar instanceof ax.H.l) || eVar.i0() || eVar.k0())) {
                    z5 = false;
                    break;
                }
            }
        }
        if (z5) {
            boolean z7 = ax.E.d.r;
        }
        boolean z8 = z5 & ((i4 == 1073741824 && i6 == 1073741824) || b);
        if (z8) {
            int min = Math.min(fVar.G(), i5);
            int min2 = Math.min(fVar.F(), i7);
            if (i4 == 1073741824 && fVar.W() != min) {
                fVar.k1(min);
                fVar.M1();
            }
            if (i6 == 1073741824 && fVar.x() != min2) {
                fVar.L0(min2);
                fVar.M1();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                z = fVar.F1(b);
                i10 = 2;
            } else {
                boolean G1 = fVar.G1(b);
                if (i4 == 1073741824) {
                    z4 = G1 & fVar.H1(b, 0);
                    i10 = 1;
                } else {
                    z4 = G1;
                    i10 = 0;
                }
                if (i6 == 1073741824) {
                    z = fVar.H1(b, 1) & z4;
                    i10++;
                } else {
                    z = z4;
                }
            }
            if (z) {
                fVar.p1(i4 == 1073741824, i6 == 1073741824);
            }
        } else {
            z = false;
            i10 = 0;
        }
        long j2 = 0;
        if (z && i10 == 2) {
            return 0L;
        }
        int J1 = fVar.J1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = bVar.a.size();
        if (size > 0) {
            bVar.c(fVar, "First pass", 0, W, x);
            i11 = W;
            i12 = x;
        } else {
            i11 = W;
            i12 = x;
        }
        if (size2 > 0) {
            e.b A2 = fVar.A();
            e.b bVar3 = e.b.WRAP_CONTENT;
            boolean z9 = A2 == bVar3;
            boolean z10 = fVar.T() == bVar3;
            int max = Math.max(fVar.W(), bVar.c.I());
            int max2 = Math.max(fVar.x(), bVar.c.H());
            int i16 = 0;
            boolean z11 = false;
            while (i16 < size2) {
                long j3 = j2;
                ax.H.e eVar2 = bVar.a.get(i16);
                if (eVar2 instanceof ax.H.l) {
                    int W2 = eVar2.W();
                    int x2 = eVar2.x();
                    boolean a2 = z11 | bVar.a(I1, eVar2, a.l);
                    i14 = i11;
                    int W3 = eVar2.W();
                    z3 = z8;
                    int x3 = eVar2.x();
                    if (W3 != W2) {
                        eVar2.k1(W3);
                        if (z9 && eVar2.M() > max) {
                            max = Math.max(max, eVar2.M() + eVar2.o(d.b.RIGHT).f());
                        }
                        a2 = true;
                    }
                    if (x3 != x2) {
                        eVar2.L0(x3);
                        if (z10 && eVar2.r() > max2) {
                            max2 = Math.max(max2, eVar2.r() + eVar2.o(d.b.BOTTOM).f());
                        }
                        a2 = true;
                    }
                    z11 = a2 | ((ax.H.l) eVar2).F1();
                } else {
                    i14 = i11;
                    z3 = z8;
                }
                i16++;
                i11 = i14;
                j2 = j3;
                z8 = z3;
            }
            int i17 = i11;
            boolean z12 = z8;
            j = j2;
            int i18 = 0;
            while (i18 < 2) {
                int i19 = 0;
                while (i19 < size2) {
                    ax.H.e eVar3 = bVar.a.get(i19);
                    if ((!(eVar3 instanceof ax.H.i) || (eVar3 instanceof ax.H.l)) && !(eVar3 instanceof ax.H.h) && eVar3.V() != 8 && ((!z12 || !eVar3.e.e.j || !eVar3.f.e.j) && !(eVar3 instanceof ax.H.l))) {
                        int W4 = eVar3.W();
                        int x4 = eVar3.x();
                        int p = eVar3.p();
                        int i20 = a.l;
                        if (i18 == 1) {
                            i20 = a.m;
                        }
                        boolean a3 = z11 | bVar.a(I1, eVar3, i20);
                        int W5 = eVar3.W();
                        int x5 = eVar3.x();
                        if (W5 != W4) {
                            eVar3.k1(W5);
                            if (z9 && eVar3.M() > max) {
                                max = Math.max(max, eVar3.M() + eVar3.o(d.b.RIGHT).f());
                            }
                            z2 = true;
                        } else {
                            z2 = a3;
                        }
                        if (x5 != x4) {
                            eVar3.L0(x5);
                            if (z10 && eVar3.r() > max2) {
                                max2 = Math.max(max2, eVar3.r() + eVar3.o(d.b.BOTTOM).f());
                            }
                            z2 = true;
                        }
                        if (!eVar3.Z() || p == eVar3.p()) {
                            z11 = z2;
                        } else {
                            i13 = 1;
                            z11 = true;
                            i19 += i13;
                            bVar = this;
                        }
                    }
                    i13 = 1;
                    i19 += i13;
                    bVar = this;
                }
                if (!z11) {
                    break;
                }
                i18++;
                c(fVar, "intermediate pass", i18, i17, i12);
                z11 = false;
                bVar = this;
            }
            fVar2 = fVar;
        } else {
            fVar2 = fVar;
            j = 0;
        }
        fVar2.W1(J1);
        return j;
    }

    public void e(ax.H.f fVar) {
        this.a.clear();
        int size = fVar.L0.size();
        for (int i = 0; i < size; i++) {
            ax.H.e eVar = fVar.L0.get(i);
            e.b A = eVar.A();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (A == bVar || eVar.T() == bVar) {
                this.a.add(eVar);
            }
        }
        fVar.M1();
    }
}
