package ax.O9;

import ax.N9.C0865q;
import ax.N9.V;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class j extends ax.M9.c implements A {
    public j(String str, ax.M9.f fVar, List<ax.S9.c> list, String str2) {
        super(str, fVar, list);
        if (str2 != null) {
            this.e.add(new ax.S9.a("q", str2));
        }
    }

    @Override // ax.O9.A
    public V a() {
        return q(o());
    }

    public V q(List<ax.S9.c> list) {
        C0865q c0865q = new C0865q(d(), i(), list);
        Iterator<ax.S9.a> it = this.e.iterator();
        while (it.hasNext()) {
            c0865q.e(it.next());
        }
        return c0865q;
    }
}
