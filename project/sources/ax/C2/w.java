package ax.C2;

import ax.tb.C3139o;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class w {
    private final Object a = new Object();
    private final Map<ax.K2.m, v> b = new LinkedHashMap();

    public final boolean a(ax.K2.m mVar) {
        boolean containsKey;
        ax.Gb.l.f(mVar, "id");
        synchronized (this.a) {
            containsKey = this.b.containsKey(mVar);
        }
        return containsKey;
    }

    public final v b(ax.K2.m mVar) {
        v remove;
        ax.Gb.l.f(mVar, "id");
        synchronized (this.a) {
            remove = this.b.remove(mVar);
        }
        return remove;
    }

    public final List<v> c(String str) {
        List<v> V;
        ax.Gb.l.f(str, "workSpecId");
        synchronized (this.a) {
            try {
                Map<ax.K2.m, v> map = this.b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<ax.K2.m, v> entry : map.entrySet()) {
                    if (ax.Gb.l.a(entry.getKey().b(), str)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap.keySet().iterator();
                while (it.hasNext()) {
                    this.b.remove((ax.K2.m) it.next());
                }
                V = C3139o.V(linkedHashMap.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return V;
    }

    public final v d(ax.K2.m mVar) {
        v vVar;
        ax.Gb.l.f(mVar, "id");
        synchronized (this.a) {
            try {
                Map<ax.K2.m, v> map = this.b;
                v vVar2 = map.get(mVar);
                if (vVar2 == null) {
                    vVar2 = new v(mVar);
                    map.put(mVar, vVar2);
                }
                vVar = vVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    public final v e(ax.K2.v vVar) {
        ax.Gb.l.f(vVar, "spec");
        return d(ax.K2.y.a(vVar));
    }
}
