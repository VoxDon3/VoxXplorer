/*
 * Decompiled with CFR 0.152.
 */
package ax.jc;

import ax.gc.d;
import ax.jc.f;
import ax.jc.g;
import ax.jc.j;
import java.util.ArrayList;

public class h<T> {
    private ArrayList<g> a = new ArrayList();
    private Class<T> b;
    private f c;

    public h(Class<T> clazz) {
        this.b = clazz;
        this.c = d.c(clazz, f.class);
    }

    public boolean a(g g8) {
        return this.a.add(g8);
    }

    public g[] b() {
        g[] gArray = new g[this.a.size()];
        return this.a.toArray(gArray);
    }

    public boolean c() {
        f f8 = this.c;
        return f8 != null && ((Object)((Object)f8.references())).equals((Object)j.q);
    }
}

