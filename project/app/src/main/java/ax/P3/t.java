/*
 * Decompiled with CFR 0.152.
 */
package ax.P3;

import ax.M3.a;
import ax.M3.h;
import ax.N3.b;
import ax.P3.d;
import ax.P3.e;
import ax.P3.u;
import ax.U3.m;
import java.io.File;
import java.io.Serializable;
import java.util.List;

class t
implements d,
b.a<Object> {
    private final e<?> c0;
    private int d0 = 0;
    private int e0 = -1;
    private h f0;
    private List<m<File, ?>> g0;
    private int h0;
    private volatile m.a<?> i0;
    private File j0;
    private u k0;
    private final d.a q;

    public t(e<?> e8, d.a a8) {
        this.c0 = e8;
        this.q = a8;
    }

    private boolean b() {
        return this.h0 < this.g0.size();
    }

    @Override
    public boolean a() {
        List<h> list = this.c0.b();
        boolean bl = list.isEmpty();
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        List<Class<?>> list2 = this.c0.k();
        while (true) {
            int n8;
            Object object;
            if (this.g0 != null && this.b()) {
                this.i0 = null;
                while (!bl2 && this.b()) {
                    object = this.g0;
                    n8 = this.h0;
                    this.h0 = n8 + 1;
                    this.i0 = ((m)object.get(n8)).a(this.j0, this.c0.p(), this.c0.e(), this.c0.i());
                    if (this.i0 == null || !this.c0.q(this.i0.c.a())) continue;
                    this.i0.c.e(this.c0.j(), this);
                    bl2 = true;
                }
                return bl2;
            }
            this.e0 = n8 = this.e0 + 1;
            if (n8 >= list2.size()) {
                this.d0 = n8 = this.d0 + 1;
                if (n8 >= list.size()) {
                    return false;
                }
                this.e0 = 0;
            }
            object = list.get(this.d0);
            Serializable serializable = list2.get(this.e0);
            ax.M3.m<?> m8 = this.c0.o(serializable);
            this.k0 = new u((h)object, this.c0.m(), this.c0.p(), this.c0.e(), m8, (Class<?>)serializable, this.c0.i());
            serializable = this.c0.c().b(this.k0);
            this.j0 = serializable;
            if (serializable == null) continue;
            this.f0 = object;
            this.g0 = this.c0.h((File)serializable);
            this.h0 = 0;
        }
    }

    @Override
    public void c(Exception exception) {
        this.q.j(this.k0, exception, this.i0.c, a.e0);
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
        this.q.d(this.f0, object, this.i0.c, a.e0, this.k0);
    }
}

