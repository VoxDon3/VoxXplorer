package ax.d4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class p implements i {
    private final Set<ax.h4.e<?>> q = Collections.newSetFromMap(new WeakHashMap());

    @Override // ax.d4.i
    public void a() {
        Iterator it = ax.k4.i.i(this.q).iterator();
        while (it.hasNext()) {
            ((ax.h4.e) it.next()).a();
        }
    }

    @Override // ax.d4.i
    public void b() {
        Iterator it = ax.k4.i.i(this.q).iterator();
        while (it.hasNext()) {
            ((ax.h4.e) it.next()).b();
        }
    }

    @Override // ax.d4.i
    public void f() {
        Iterator it = ax.k4.i.i(this.q).iterator();
        while (it.hasNext()) {
            ((ax.h4.e) it.next()).f();
        }
    }

    public void h() {
        this.q.clear();
    }

    public List<ax.h4.e<?>> m() {
        return new ArrayList(this.q);
    }

    public void n(ax.h4.e<?> eVar) {
        this.q.add(eVar);
    }

    public void o(ax.h4.e<?> eVar) {
        this.q.remove(eVar);
    }
}
