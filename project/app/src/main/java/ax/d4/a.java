/*
 * Decompiled with CFR 0.152.
 */
package ax.d4;

import ax.d4.h;
import ax.d4.i;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

class a
implements h {
    private final Set<i> a = Collections.newSetFromMap(new WeakHashMap());
    private boolean b;
    private boolean c;

    a() {
    }

    @Override
    public void a(i i8) {
        this.a.remove(i8);
    }

    @Override
    public void b(i i8) {
        this.a.add(i8);
        if (this.c) {
            i8.f();
            return;
        }
        if (this.b) {
            i8.b();
            return;
        }
        i8.a();
    }

    void c() {
        this.c = true;
        Iterator<i> iterator = ax.k4.i.i(this.a).iterator();
        while (iterator.hasNext()) {
            iterator.next().f();
        }
    }

    void d() {
        this.b = true;
        Iterator<i> iterator = ax.k4.i.i(this.a).iterator();
        while (iterator.hasNext()) {
            iterator.next().b();
        }
    }

    void e() {
        this.b = false;
        Iterator<i> iterator = ax.k4.i.i(this.a).iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
    }
}

