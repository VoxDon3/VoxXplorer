package ax.I;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class c extends p {
    ArrayList<p> k;
    private int l;

    public c(ax.H.e eVar, int i) {
        super(eVar);
        this.k = new ArrayList<>();
        this.f = i;
        q();
    }

    private void q() {
        ax.H.e eVar;
        ax.H.e eVar2 = this.b;
        ax.H.e L = eVar2.L(this.f);
        while (true) {
            ax.H.e eVar3 = L;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            } else {
                L = eVar2.L(this.f);
            }
        }
        this.b = eVar;
        this.k.add(eVar.N(this.f));
        ax.H.e J = eVar.J(this.f);
        while (J != null) {
            this.k.add(J.N(this.f));
            J = J.J(this.f);
        }
        ArrayList<p> arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            p pVar = arrayList.get(i);
            i++;
            p pVar2 = pVar;
            int i2 = this.f;
            if (i2 == 0) {
                pVar2.b.c = this;
            } else if (i2 == 1) {
                pVar2.b.d = this;
            }
        }
        if (this.f == 0 && ((ax.H.f) this.b.K()).P1() && this.k.size() > 1) {
            ArrayList<p> arrayList2 = this.k;
            this.b = arrayList2.get(arrayList2.size() - 1).b;
        }
        this.l = this.f == 0 ? this.b.z() : this.b.S();
    }

    private ax.H.e r() {
        for (int i = 0; i < this.k.size(); i++) {
            p pVar = this.k.get(i);
            if (pVar.b.V() != 8) {
                return pVar.b;
            }
        }
        return null;
    }

    private ax.H.e s() {
        for (int size = this.k.size() - 1; size >= 0; size--) {
            p pVar = this.k.get(size);
            if (pVar.b.V() != 8) {
                return pVar.b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:290:0x03f8, code lost:
    
        r1 = r1 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d4, code lost:
    
        if (r3.j != false) goto L56;
     */
    @Override // ax.I.p, ax.I.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(ax.I.d r27) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.I.c.a(ax.I.d):void");
    }

    @Override // ax.I.p
    void d() {
        ArrayList<p> arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            p pVar = arrayList.get(i);
            i++;
            pVar.d();
        }
        int size2 = this.k.size();
        if (size2 < 1) {
            return;
        }
        ax.H.e eVar = this.k.get(0).b;
        ax.H.e eVar2 = this.k.get(size2 - 1).b;
        if (this.f == 0) {
            ax.H.d dVar = eVar.O;
            ax.H.d dVar2 = eVar2.Q;
            f i2 = i(dVar, 0);
            int f = dVar.f();
            ax.H.e r = r();
            if (r != null) {
                f = r.O.f();
            }
            if (i2 != null) {
                b(this.h, i2, f);
            }
            f i3 = i(dVar2, 0);
            int f2 = dVar2.f();
            ax.H.e s = s();
            if (s != null) {
                f2 = s.Q.f();
            }
            if (i3 != null) {
                b(this.i, i3, -f2);
            }
        } else {
            ax.H.d dVar3 = eVar.P;
            ax.H.d dVar4 = eVar2.R;
            f i4 = i(dVar3, 1);
            int f3 = dVar3.f();
            ax.H.e r2 = r();
            if (r2 != null) {
                f3 = r2.P.f();
            }
            if (i4 != null) {
                b(this.h, i4, f3);
            }
            f i5 = i(dVar4, 1);
            int f4 = dVar4.f();
            ax.H.e s2 = s();
            if (s2 != null) {
                f4 = s2.R.f();
            }
            if (i5 != null) {
                b(this.i, i5, -f4);
            }
        }
        this.h.a = this;
        this.i.a = this;
    }

    @Override // ax.I.p
    public void e() {
        for (int i = 0; i < this.k.size(); i++) {
            this.k.get(i).e();
        }
    }

    @Override // ax.I.p
    void f() {
        this.c = null;
        ArrayList<p> arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            p pVar = arrayList.get(i);
            i++;
            pVar.f();
        }
    }

    @Override // ax.I.p
    public long j() {
        int size = this.k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = j + r4.h.f + this.k.get(i).j() + r4.i.f;
        }
        return j;
    }

    @Override // ax.I.p
    boolean m() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            if (!this.k.get(i).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        ArrayList<p> arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            p pVar = arrayList.get(i);
            i++;
            sb.append("<");
            sb.append(pVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
