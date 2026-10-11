/*
 * Decompiled with CFR 0.152.
 */
package ax.K7;

import ax.G7.g;
import ax.K7.i;
import ax.L7.F;
import java.util.ArrayList;
import java.util.List;

public class j {
    private final List<i> a = new ArrayList<i>();
    private final int b;

    public j(int n8) {
        this.b = n8;
    }

    public List<F.e.d.e> a() {
        List<i> list = this.b();
        ArrayList<F.e.d.e> arrayList = new ArrayList<F.e.d.e>();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            arrayList.add(list.get(i8).h());
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<i> b() {
        synchronized (this) {
            List<i> list = new List<i>(this.a);
            return java.util.DesugarCollections.unmodifiableList(list);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean c(List<i> list) {
        synchronized (this) {
            try {
                this.a.clear();
                if (list.size() <= this.b) return this.a.addAll(list);
                g g8 = g.f();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Ignored ");
                stringBuilder.append(0);
                stringBuilder.append(" entries when adding rollout assignments. Maximum allowable: ");
                stringBuilder.append(this.b);
                g8.k(stringBuilder.toString());
                list = list.subList(0, this.b);
                return this.a.addAll(list);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

