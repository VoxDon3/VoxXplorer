/*
 * Decompiled with CFR 0.152.
 */
package ax.hb;

import ax.Za.b;
import ax.db.k;
import ax.db.l;
import ax.db.q;
import ax.hb.a;
import ax.hb.d;

public class c
implements l {
    protected c() {
    }

    private static b d(k k8) {
        return ((a)k8).c();
    }

    private static k e(b b8) {
        return new a(b8);
    }

    @Override
    public q a(k k8) {
        return d.a(c.d(k8));
    }

    @Override
    public k b(k k8, q q8) {
        return c.e(d.b(c.d(k8), q8));
    }

    @Override
    public k c() {
        return c.e(b.f());
    }
}

