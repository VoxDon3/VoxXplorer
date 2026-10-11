/*
 * Decompiled with CFR 0.152.
 */
package ax.d4;

import ax.d4.i;
import ax.h4.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class p
implements i {
    private final Set<e<?>> q = Collections.newSetFromMap(new WeakHashMap());

    @Override
    public void a() {
        Iterator<e<?>> iterator = ax.k4.i.i(this.q).iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
    }

    @Override
    public void b() {
        Iterator<e<?>> iterator = ax.k4.i.i(this.q).iterator();
        while (iterator.hasNext()) {
            iterator.next().b();
        }
    }

    @Override
    public void f() {
        Iterator<e<?>> iterator = ax.k4.i.i(this.q).iterator();
        while (iterator.hasNext()) {
            iterator.next().f();
        }
    }

    public void h() {
        this.q.clear();
    }

    public List<e<?>> m() {
        return new ArrayList(this.q);
    }

    public void n(e<?> e8) {
        this.q.add(e8);
    }

    public void o(e<?> e8) {
        this.q.remove(e8);
    }
}

