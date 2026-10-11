package ax.R8;

import ax.Z8.a;
import ax.h9.C2171b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class b extends ax.Q8.q {
    List<ax.M8.a> e = new ArrayList();

    private List<ax.M8.a> n(C2171b c2171b, int i) throws a.b {
        ArrayList arrayList = new ArrayList();
        c2171b.T(((ax.Q8.t) this.a).a() + i);
        while (true) {
            int S = c2171b.S();
            ax.M8.a aVar = new ax.M8.a();
            aVar.b(c2171b);
            arrayList.add(aVar);
            if (aVar.a() == 0) {
                return arrayList;
            }
            c2171b.T(S + aVar.a());
        }
    }

    @Override // ax.Q8.q
    protected void j(C2171b c2171b) throws a.b {
        c2171b.U(2);
        int J = c2171b.J();
        int P = c2171b.P();
        if (J > 0 && P > 0) {
            this.e = n(c2171b, J);
        }
        c2171b.T(((ax.Q8.t) this.a).a() + J + P);
    }
}
