/*
 * Decompiled with CFR 0.152.
 */
package ax.ma;

import ax.Hb.a;
import ax.Lb.b;
import ax.Lb.e;
import ax.ma.d;
import ax.tb.o;
import java.util.Iterator;
import java.util.List;

public final class c
implements b<Integer>,
Iterable<Integer>,
a {
    public static final c d0 = new c();
    private static final List<Integer> e0 = o.l(4, 5);
    private final e c0;
    private final e q = d.a();

    private c() {
        this.c0 = d.a();
    }

    @Override
    public boolean isEmpty() {
        return this.q.isEmpty();
    }

    @Override
    public Iterator<Integer> iterator() {
        return this.c0.p();
    }

    public boolean k(int n8) {
        return this.q.r(n8);
    }

    public final List<Integer> l() {
        return e0;
    }

    public Integer n() {
        return this.q.s();
    }

    public Integer p() {
        return this.q.t();
    }

    public String toString() {
        return d.a().toString();
    }
}

