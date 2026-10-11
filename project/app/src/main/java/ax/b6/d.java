/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class d {
    private e a;
    private e b;
    private List<e> c;

    public d() {
        this.a = new e("", 0L, null);
        this.b = new e("", 0L, null);
        this.c = new ArrayList<e>();
    }

    private d(e e8) {
        this.a = e8;
        this.b = (e)e8.clone();
        this.c = new ArrayList<e>();
    }

    public final e a() {
        return this.a;
    }

    public final void b(e e8) {
        this.a = e8;
        this.b = (e)e8.clone();
        this.c.clear();
    }

    public final void c(String string, long l8, Map<String, Object> map) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        for (String string2 : map.keySet()) {
            hashMap.put(string2, e.c(string2, this.a.b(string2), map.get(string2)));
        }
        this.c.add(new e(string, l8, hashMap));
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        d d8 = new d((e)this.a.clone());
        for (e e8 : this.c) {
            d8.c.add((e)e8.clone());
        }
        return d8;
    }

    public final e d() {
        return this.b;
    }

    public final void e(e e8) {
        this.b = e8;
    }

    public final List<e> f() {
        return this.c;
    }
}

