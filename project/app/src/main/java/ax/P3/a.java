/*
 * Decompiled with CFR 0.152.
 */
package ax.P3;

import ax.M3.h;
import ax.N3.b;
import ax.P3.b;
import ax.P3.d;
import ax.P3.e;
import ax.U3.m;
import java.io.File;
import java.util.List;

class a
implements d,
b.a<Object> {
    private final e<?> c0;
    private final d.a d0;
    private int e0 = -1;
    private h f0;
    private List<m<File, ?>> g0;
    private int h0;
    private volatile m.a<?> i0;
    private File j0;
    private List<h> q;

    a(e<?> e8, d.a a8) {
        this(e8.b(), e8, a8);
    }

    a(List<h> list, e<?> e8, d.a a8) {
        this.q = list;
        this.c0 = e8;
        this.d0 = a8;
    }

    private boolean b() {
        return this.h0 < this.g0.size();
    }

    @Override
    public boolean a() {
        while (true) {
            int n8;
            Object object = this.g0;
            boolean bl = false;
            if (object != null && this.b()) {
                this.i0 = null;
                while (!bl && this.b()) {
                    object = this.g0;
                    n8 = this.h0;
                    this.h0 = n8 + 1;
                    this.i0 = ((m)object.get(n8)).a(this.j0, this.c0.p(), this.c0.e(), this.c0.i());
                    if (this.i0 == null || !this.c0.q(this.i0.c.a())) continue;
                    this.i0.c.e(this.c0.j(), this);
                    bl = true;
                }
                return bl;
            }
            this.e0 = n8 = this.e0 + 1;
            if (n8 >= this.q.size()) {
                return false;
            }
            object = this.q.get(this.e0);
            Object object2 = new b((h)object, this.c0.m());
            this.j0 = object2 = this.c0.c().b((h)object2);
            if (object2 == null) continue;
            this.f0 = object;
            this.g0 = this.c0.h((File)object2);
            this.h0 = 0;
        }
    }

    @Override
    public void c(Exception exception) {
        this.d0.j(this.f0, exception, this.i0.c, ax.M3.a.d0);
    }

    @Override
    public void cancel() {
        m.a<?> a8 = this.i0;
        if (a8 != null) {
            a8.c.cancel();
        }
    }

    @Override
    public void f(Object object) {
        this.d0.d(this.f0, object, this.i0.c, ax.M3.a.d0, this.f0);
    }
}

