package ax.K7;

import ax.L7.F;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class j {
    private final List<i> a = new ArrayList();
    private final int b;

    public j(int i) {
        this.b = i;
    }

    public List<F.e.d.AbstractC0138e> a() {
        List<i> b = b();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b.size(); i++) {
            arrayList.add(b.get(i).h());
        }
        return arrayList;
    }

    public synchronized List<i> b() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.a));
    }

    public synchronized boolean c(List<i> list) {
        this.a.clear();
        if (list.size() <= this.b) {
            return this.a.addAll(list);
        }
        ax.G7.g.f().k("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.b);
        return this.a.addAll(list.subList(0, this.b));
    }
}
