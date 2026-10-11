/*
 * Decompiled with CFR 0.152.
 */
package ax.P3;

import android.util.Log;
import ax.N3.b;
import ax.P3.a;
import ax.P3.b;
import ax.P3.c;
import ax.P3.d;
import ax.P3.e;
import ax.P3.h;
import ax.R3.a;
import ax.U3.m;
import java.util.Collections;
import java.util.List;

class w
implements d,
b.a<Object>,
d.a {
    private final d.a c0;
    private int d0;
    private a e0;
    private Object f0;
    private volatile m.a<?> g0;
    private b h0;
    private final e<?> q;

    public w(e<?> e8, d.a a8) {
        this.q = e8;
        this.c0 = a8;
    }

    private void b(Object object) {
        Throwable throwable2;
        block3: {
            block2: {
                long l8 = ax.k4.d.b();
                try {
                    b b8;
                    ax.M3.d<Object> d8 = this.q.n(object);
                    Object object2 = new c(d8, object, this.q.i());
                    this.h0 = b8 = new b(this.g0.a, this.q.m());
                    this.q.c().a(this.h0, (a.b)object2);
                    if (!Log.isLoggable((String)"SourceGenerator", (int)2)) break block2;
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Finished encoding source to cache, key: ");
                    ((StringBuilder)object2).append(this.h0);
                    ((StringBuilder)object2).append(", data: ");
                    ((StringBuilder)object2).append(object);
                    ((StringBuilder)object2).append(", encoder: ");
                    ((StringBuilder)object2).append(d8);
                    ((StringBuilder)object2).append(", duration: ");
                    ((StringBuilder)object2).append(ax.k4.d.a(l8));
                    Log.v((String)"SourceGenerator", (String)((StringBuilder)object2).toString());
                }
                catch (Throwable throwable2) {
                    break block3;
                }
            }
            this.g0.c.b();
            this.e0 = new a(Collections.singletonList(this.g0.a), this.q, this);
            return;
        }
        this.g0.c.b();
        throw throwable2;
    }

    private boolean e() {
        return this.d0 < this.q.f().size();
    }

    @Override
    public boolean a() {
        List<m.a<?>> list = this.f0;
        if (list != null) {
            this.f0 = null;
            this.b(list);
        }
        if ((list = this.e0) != null && ((a)((Object)list)).a()) {
            return true;
        }
        this.e0 = null;
        this.g0 = null;
        boolean bl = false;
        while (!bl && this.e()) {
            list = this.q.f();
            int n8 = this.d0;
            this.d0 = n8 + 1;
            this.g0 = list.get(n8);
            if (this.g0 == null || !this.q.d().c(this.g0.c.d()) && !this.q.q(this.g0.c.a())) continue;
            this.g0.c.e(this.q.j(), this);
            bl = true;
        }
        return bl;
    }

    @Override
    public void c(Exception exception) {
        this.c0.j(this.h0, exception, this.g0.c, this.g0.c.d());
    }

    @Override
    public void cancel() {
        m.a<?> a8 = this.g0;
        if (a8 != null) {
            a8.c.cancel();
        }
    }

    @Override
    public void d(ax.M3.h h8, Object object, ax.N3.b<?> b8, ax.M3.a a8, ax.M3.h h9) {
        this.c0.d(h8, object, b8, this.g0.c.d(), h8);
    }

    @Override
    public void f(Object object) {
        h h8 = this.q.d();
        if (object != null && h8.c(this.g0.c.d())) {
            this.f0 = object;
            this.c0.h();
            return;
        }
        this.c0.d(this.g0.a, object, this.g0.c, this.g0.c.d(), this.h0);
    }

    @Override
    public void h() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void j(ax.M3.h h8, Exception exception, ax.N3.b<?> b8, ax.M3.a a8) {
        this.c0.j(h8, exception, b8, this.g0.c.d());
    }
}

