package ax.jc;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public class h<T> {
    private ArrayList<g> a = new ArrayList<>();
    private Class<T> b;
    private f c;

    public h(Class<T> cls) {
        this.b = cls;
        this.c = (f) ax.gc.d.c(cls, f.class);
    }

    public boolean a(g gVar) {
        return this.a.add(gVar);
    }

    public g[] b() {
        return (g[]) this.a.toArray(new g[this.a.size()]);
    }

    public boolean c() {
        f fVar = this.c;
        return fVar != null && fVar.references().equals(j.Strong);
    }
}
