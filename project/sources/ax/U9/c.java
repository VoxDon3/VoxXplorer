package ax.U9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
class c {
    private final List<s> a = new ArrayList();

    public void a(s sVar) {
        this.a.add(sVar);
    }

    public void b(f fVar) {
        Iterator<s> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().d(fVar);
        }
    }

    public void c(t tVar) {
        Iterator<s> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().c(tVar);
        }
    }
}
