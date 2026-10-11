/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.p;
import ax.Gb.l;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class r {
    private final Map<String, p> a = new LinkedHashMap<String, p>();

    public final void a() {
        Iterator<p> iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
        this.a.clear();
    }

    public final p b(String string) {
        l.f(string, "key");
        return this.a.get(string);
    }

    public final Set<String> c() {
        return new HashSet<String>(this.a.keySet());
    }

    public final void d(String object, p p8) {
        l.f(object, "key");
        l.f(p8, "viewModel");
        object = this.a.put((String)object, p8);
        if (object != null) {
            ((p)object).d();
        }
    }
}

