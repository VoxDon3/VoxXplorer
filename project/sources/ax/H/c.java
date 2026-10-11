package ax.H;

import ax.H.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
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

    public c(e eVar, int i, boolean z) {
        this.a = eVar;
        this.p = i;
        this.q = z;
    }

    private void b() {
        int i = this.p * 2;
        e eVar = this.a;
        this.o = true;
        e eVar2 = eVar;
        boolean z = false;
        while (!z) {
            this.i++;
            e[] eVarArr = eVar.F0;
            int i2 = this.p;
            e eVar3 = null;
            eVarArr[i2] = null;
            eVar.E0[i2] = null;
            if (eVar.V() != 8) {
                this.l++;
                e.b u = eVar.u(this.p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (u != bVar) {
                    this.m += eVar.E(this.p);
                }
                int f = this.m + eVar.W[i].f();
                this.m = f;
                int i3 = i + 1;
                this.m = f + eVar.W[i3].f();
                int f2 = this.n + eVar.W[i].f();
                this.n = f2;
                this.n = f2 + eVar.W[i3].f();
                if (this.b == null) {
                    this.b = eVar;
                }
                this.d = eVar;
                e.b[] bVarArr = eVar.Z;
                int i4 = this.p;
                if (bVarArr[i4] == bVar) {
                    int i5 = eVar.y[i4];
                    if (i5 == 0 || i5 == 3 || i5 == 2) {
                        this.j++;
                        float f3 = eVar.D0[i4];
                        if (f3 > 0.0f) {
                            this.k += f3;
                        }
                        if (c(eVar, i4)) {
                            if (f3 < 0.0f) {
                                this.r = true;
                            } else {
                                this.s = true;
                            }
                            if (this.h == null) {
                                this.h = new ArrayList<>();
                            }
                            this.h.add(eVar);
                        }
                        if (this.f == null) {
                            this.f = eVar;
                        }
                        e eVar4 = this.g;
                        if (eVar4 != null) {
                            eVar4.E0[this.p] = eVar;
                        }
                        this.g = eVar;
                    }
                    if (this.p == 0) {
                        if (eVar.w != 0) {
                            this.o = false;
                        } else if (eVar.z != 0 || eVar.A != 0) {
                            this.o = false;
                        }
                    } else if (eVar.x != 0) {
                        this.o = false;
                    } else if (eVar.C != 0 || eVar.D != 0) {
                        this.o = false;
                    }
                    if (eVar.d0 != 0.0f) {
                        this.o = false;
                        this.u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.F0[this.p] = eVar;
            }
            d dVar = eVar.W[i + 1].f;
            if (dVar != null) {
                e eVar5 = dVar.d;
                d dVar2 = eVar5.W[i].f;
                if (dVar2 != null && dVar2.d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.b;
        if (eVar6 != null) {
            this.m -= eVar6.W[i].f();
        }
        e eVar7 = this.d;
        if (eVar7 != null) {
            this.m -= eVar7.W[i + 1].f();
        }
        this.c = eVar;
        if (this.p == 0 && this.q) {
            this.e = eVar;
        } else {
            this.e = this.a;
        }
        this.t = this.s && this.r;
    }

    private static boolean c(e eVar, int i) {
        if (eVar.V() == 8 || eVar.Z[i] != e.b.MATCH_CONSTRAINT) {
            return false;
        }
        int i2 = eVar.y[i];
        return i2 == 0 || i2 == 3;
    }

    public void a() {
        if (!this.v) {
            b();
        }
        this.v = true;
    }
}
