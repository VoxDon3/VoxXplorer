package ax.H;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class m extends e {
    public ArrayList<e> L0 = new ArrayList<>();

    public void c(e eVar) {
        this.L0.add(eVar);
        if (eVar.K() != null) {
            ((m) eVar.K()).t1(eVar);
        }
        eVar.c1(this);
    }

    public ArrayList<e> r1() {
        return this.L0;
    }

    public void s1() {
        ArrayList<e> arrayList = this.L0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            e eVar = this.L0.get(i);
            if (eVar instanceof m) {
                ((m) eVar).s1();
            }
        }
    }

    @Override // ax.H.e
    public void t0() {
        this.L0.clear();
        super.t0();
    }

    public void t1(e eVar) {
        this.L0.remove(eVar);
        eVar.t0();
    }

    public void u1() {
        this.L0.clear();
    }

    @Override // ax.H.e
    public void w0(ax.E.c cVar) {
        super.w0(cVar);
        int size = this.L0.size();
        for (int i = 0; i < size; i++) {
            this.L0.get(i).w0(cVar);
        }
    }
}
