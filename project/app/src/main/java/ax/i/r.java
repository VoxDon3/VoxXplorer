/*
 * Decompiled with CFR 0.152.
 */
package ax.i;

import ax.Fb.a;
import ax.Gb.l;
import ax.i.b;
import ax.i.c;
import ax.sb.t;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class r {
    private boolean a;
    private final CopyOnWriteArrayList<c> b;
    private a<t> c;

    public r(boolean bl) {
        this.a = bl;
        this.b = new CopyOnWriteArrayList();
    }

    public final void a(c c8) {
        l.f(c8, "cancellable");
        this.b.add(c8);
    }

    public final a<t> b() {
        return this.c;
    }

    public void c() {
    }

    public abstract void d();

    public void e(b b8) {
        l.f(b8, "backEvent");
    }

    public void f(b b8) {
        l.f(b8, "backEvent");
    }

    public final boolean g() {
        return this.a;
    }

    public final void h() {
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((c)iterator.next()).cancel();
        }
    }

    public final void i(c c8) {
        l.f(c8, "cancellable");
        this.b.remove(c8);
    }

    public final void j(boolean bl) {
        this.a = bl;
        a<t> a8 = this.c;
        if (a8 != null) {
            a8.invoke();
        }
    }

    public final void k(a<t> a8) {
        this.c = a8;
    }
}

