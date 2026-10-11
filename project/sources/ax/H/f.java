package ax.H;

import ax.H.e;
import ax.I.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f extends m {
    private int O0;
    int S0;
    int T0;
    int U0;
    int V0;
    ax.I.b M0 = new ax.I.b(this);
    public ax.I.e N0 = new ax.I.e(this);
    protected b.InterfaceC0089b P0 = null;
    private boolean Q0 = false;
    protected ax.E.d R0 = new ax.E.d();
    public int W0 = 0;
    public int X0 = 0;
    c[] Y0 = new c[4];
    c[] Z0 = new c[4];
    public boolean a1 = false;
    public boolean b1 = false;
    public boolean c1 = false;
    public int d1 = 0;
    public int e1 = 0;
    private int f1 = 257;
    public boolean g1 = false;
    private boolean h1 = false;
    private boolean i1 = false;
    int j1 = 0;
    private WeakReference<d> k1 = null;
    private WeakReference<d> l1 = null;
    private WeakReference<d> m1 = null;
    private WeakReference<d> n1 = null;
    HashSet<e> o1 = new HashSet<>();
    public b.a p1 = new b.a();

    private void A1(d dVar, ax.E.i iVar) {
        this.R0.h(iVar, this.R0.q(dVar), 0, 5);
    }

    private void B1(d dVar, ax.E.i iVar) {
        this.R0.h(this.R0.q(dVar), iVar, 0, 5);
    }

    private void C1(e eVar) {
        int i = this.X0 + 1;
        c[] cVarArr = this.Y0;
        if (i >= cVarArr.length) {
            this.Y0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Y0[this.X0] = new c(eVar, 1, P1());
        this.X0++;
    }

    public static boolean S1(int i, e eVar, b.InterfaceC0089b interfaceC0089b, b.a aVar, int i2) {
        int i3;
        int i4;
        if (interfaceC0089b == null) {
            return false;
        }
        if (eVar.V() == 8 || (eVar instanceof h) || (eVar instanceof a)) {
            aVar.e = 0;
            aVar.f = 0;
            return false;
        }
        aVar.a = eVar.A();
        aVar.b = eVar.T();
        aVar.c = eVar.W();
        aVar.d = eVar.x();
        aVar.i = false;
        aVar.j = i2;
        e.b bVar = aVar.a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z = bVar == bVar2;
        boolean z2 = aVar.b == bVar2;
        boolean z3 = z && eVar.d0 > 0.0f;
        boolean z4 = z2 && eVar.d0 > 0.0f;
        if (z && eVar.a0(0) && eVar.w == 0 && !z3) {
            aVar.a = e.b.WRAP_CONTENT;
            if (z2 && eVar.x == 0) {
                aVar.a = e.b.FIXED;
            }
            z = false;
        }
        if (z2 && eVar.a0(1) && eVar.x == 0 && !z4) {
            aVar.b = e.b.WRAP_CONTENT;
            if (z && eVar.w == 0) {
                aVar.b = e.b.FIXED;
            }
            z2 = false;
        }
        if (eVar.n0()) {
            aVar.a = e.b.FIXED;
            z = false;
        }
        if (eVar.o0()) {
            aVar.b = e.b.FIXED;
            z2 = false;
        }
        if (z3) {
            if (eVar.y[0] == 4) {
                aVar.a = e.b.FIXED;
            } else if (!z2) {
                e.b bVar3 = aVar.b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i4 = aVar.d;
                } else {
                    aVar.a = e.b.WRAP_CONTENT;
                    interfaceC0089b.a(eVar, aVar);
                    i4 = aVar.f;
                }
                aVar.a = bVar4;
                aVar.c = (int) (eVar.v() * i4);
            }
        }
        if (z4) {
            if (eVar.y[1] == 4) {
                aVar.b = e.b.FIXED;
            } else if (!z) {
                e.b bVar5 = aVar.a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i3 = aVar.c;
                } else {
                    aVar.b = e.b.WRAP_CONTENT;
                    interfaceC0089b.a(eVar, aVar);
                    i3 = aVar.e;
                }
                aVar.b = bVar6;
                if (eVar.w() == -1) {
                    aVar.d = (int) (i3 / eVar.v());
                } else {
                    aVar.d = (int) (eVar.v() * i3);
                }
            }
        }
        interfaceC0089b.a(eVar, aVar);
        eVar.k1(aVar.e);
        eVar.L0(aVar.f);
        eVar.K0(aVar.h);
        eVar.A0(aVar.g);
        aVar.j = b.a.k;
        return aVar.i;
    }

    private void U1() {
        this.W0 = 0;
        this.X0 = 0;
    }

    private void x1(e eVar) {
        int i = this.W0 + 1;
        c[] cVarArr = this.Z0;
        if (i >= cVarArr.length) {
            this.Z0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Z0[this.W0] = new c(eVar, 0, P1());
        this.W0++;
    }

    void D1(d dVar) {
        WeakReference<d> weakReference = this.m1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.m1.get().e()) {
            this.m1 = new WeakReference<>(dVar);
        }
    }

    void E1(d dVar) {
        WeakReference<d> weakReference = this.k1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.k1.get().e()) {
            this.k1 = new WeakReference<>(dVar);
        }
    }

    public boolean F1(boolean z) {
        return this.N0.f(z);
    }

    public boolean G1(boolean z) {
        return this.N0.g(z);
    }

    public boolean H1(boolean z, int i) {
        return this.N0.h(z, i);
    }

    public b.InterfaceC0089b I1() {
        return this.P0;
    }

    public int J1() {
        return this.f1;
    }

    public ax.E.d K1() {
        return this.R0;
    }

    public boolean L1() {
        return false;
    }

    public void M1() {
        this.N0.j();
    }

    public void N1() {
        this.N0.k();
    }

    @Override // ax.H.e
    public void O(StringBuilder sb) {
        sb.append(this.o + ":{\n");
        sb.append("  actualWidth:" + this.b0);
        sb.append("\n");
        sb.append("  actualHeight:" + this.c0);
        sb.append("\n");
        ArrayList<e> r1 = r1();
        int size = r1.size();
        int i = 0;
        while (i < size) {
            e eVar = r1.get(i);
            i++;
            eVar.O(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    public boolean O1() {
        return this.i1;
    }

    public boolean P1() {
        return this.Q0;
    }

    public boolean Q1() {
        return this.h1;
    }

    public long R1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.S0 = i8;
        this.T0 = i9;
        return this.M0.d(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    public boolean T1(int i) {
        return (this.f1 & i) == i;
    }

    public void V1(b.InterfaceC0089b interfaceC0089b) {
        this.P0 = interfaceC0089b;
        this.N0.n(interfaceC0089b);
    }

    public void W1(int i) {
        this.f1 = i;
        ax.E.d.r = T1(512);
    }

    public void X1(int i) {
        this.O0 = i;
    }

    public void Y1(boolean z) {
        this.Q0 = z;
    }

    public boolean Z1(ax.E.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean T1 = T1(64);
        q1(dVar, T1);
        int size = this.L0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            e eVar = this.L0.get(i);
            eVar.q1(dVar, T1);
            if (eVar.c0()) {
                z = true;
            }
        }
        return z;
    }

    public void a2() {
        this.M0.e(this);
    }

    @Override // ax.H.e
    public void p1(boolean z, boolean z2) {
        super.p1(z, z2);
        int size = this.L0.size();
        for (int i = 0; i < size; i++) {
            this.L0.get(i).p1(z, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0236 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0210  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // ax.H.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s1() {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.H.f.s1():void");
    }

    @Override // ax.H.m, ax.H.e
    public void t0() {
        this.R0.D();
        this.S0 = 0;
        this.U0 = 0;
        this.T0 = 0;
        this.V0 = 0;
        this.g1 = false;
        super.t0();
    }

    void v1(e eVar, int i) {
        if (i == 0) {
            x1(eVar);
        } else if (i == 1) {
            C1(eVar);
        }
    }

    public boolean w1(ax.E.d dVar) {
        f fVar;
        ax.E.d dVar2;
        boolean T1 = T1(64);
        g(dVar, T1);
        int size = this.L0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            e eVar = this.L0.get(i);
            eVar.S0(0, false);
            eVar.S0(1, false);
            if (eVar instanceof a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                e eVar2 = this.L0.get(i2);
                if (eVar2 instanceof a) {
                    ((a) eVar2).y1();
                }
            }
        }
        this.o1.clear();
        for (int i3 = 0; i3 < size; i3++) {
            e eVar3 = this.L0.get(i3);
            if (eVar3.f()) {
                if (eVar3 instanceof l) {
                    this.o1.add(eVar3);
                } else {
                    eVar3.g(dVar, T1);
                }
            }
        }
        while (this.o1.size() > 0) {
            int size2 = this.o1.size();
            Iterator<e> it = this.o1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l lVar = (l) it.next();
                if (lVar.v1(this.o1)) {
                    lVar.g(dVar, T1);
                    this.o1.remove(lVar);
                    break;
                }
            }
            if (size2 == this.o1.size()) {
                Iterator<e> it2 = this.o1.iterator();
                while (it2.hasNext()) {
                    it2.next().g(dVar, T1);
                }
                this.o1.clear();
            }
        }
        if (ax.E.d.r) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i4 = 0; i4 < size; i4++) {
                e eVar4 = this.L0.get(i4);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            fVar = this;
            dVar2 = dVar;
            fVar.e(this, dVar2, hashSet, A() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<e> it3 = hashSet.iterator();
            while (it3.hasNext()) {
                e next = it3.next();
                k.a(this, dVar2, next);
                next.g(dVar2, T1);
            }
        } else {
            fVar = this;
            dVar2 = dVar;
            for (int i5 = 0; i5 < size; i5++) {
                e eVar5 = fVar.L0.get(i5);
                if (eVar5 instanceof f) {
                    e.b[] bVarArr = eVar5.Z;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar5.P0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.g1(e.b.FIXED);
                    }
                    eVar5.g(dVar2, T1);
                    if (bVar == bVar3) {
                        eVar5.P0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.g1(bVar2);
                    }
                } else {
                    k.a(this, dVar2, eVar5);
                    if (!eVar5.f()) {
                        eVar5.g(dVar2, T1);
                    }
                }
            }
        }
        if (fVar.W0 > 0) {
            b.b(this, dVar2, null, 0);
        }
        if (fVar.X0 > 0) {
            b.b(this, dVar2, null, 1);
        }
        return true;
    }

    public void y1(d dVar) {
        WeakReference<d> weakReference = this.n1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.n1.get().e()) {
            this.n1 = new WeakReference<>(dVar);
        }
    }

    public void z1(d dVar) {
        WeakReference<d> weakReference = this.l1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.l1.get().e()) {
            this.l1 = new WeakReference<>(dVar);
        }
    }
}
