/*
 * Decompiled with CFR 0.152.
 */
package ax.Yd;

import ax.Xd.g;
import ax.Yd.b;
import ax.Yd.d;
import ax.Zd.m;
import java.util.Queue;

public class a
extends ax.Zd.d {
    m c0;
    Queue<d> d0;
    String q;

    public a(m m8, Queue<d> queue) {
        this.c0 = m8;
        this.q = m8.getName();
        this.d0 = queue;
    }

    @Override
    protected void F(b b8, g g8, String string, Object[] objectArray, Throwable throwable) {
        d d8 = new d();
        d8.k(System.currentTimeMillis());
        d8.e(b8);
        d8.f(this.c0);
        d8.g(this.q);
        if (g8 != null) {
            d8.a(g8);
        }
        d8.h(string);
        d8.i(Thread.currentThread().getName());
        d8.d(objectArray);
        d8.j(throwable);
        this.d0.add(d8);
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public String getName() {
        return this.q;
    }

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public boolean l() {
        return true;
    }

    @Override
    public boolean o() {
        return true;
    }
}

