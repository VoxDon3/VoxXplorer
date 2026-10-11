package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class r {
    private final Map<String, p> a = new LinkedHashMap();

    public final void a() {
        Iterator<p> it = this.a.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.a.clear();
    }

    public final p b(String str) {
        ax.Gb.l.f(str, "key");
        return this.a.get(str);
    }

    public final Set<String> c() {
        return new HashSet(this.a.keySet());
    }

    public final void d(String str, p pVar) {
        ax.Gb.l.f(str, "key");
        ax.Gb.l.f(pVar, "viewModel");
        p put = this.a.put(str, pVar);
        if (put != null) {
            put.d();
        }
    }
}
