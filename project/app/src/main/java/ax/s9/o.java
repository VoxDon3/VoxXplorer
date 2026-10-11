/*
 * Decompiled with CFR 0.152.
 */
package ax.s9;

import ax.K8.a;
import ax.Q8.F;
import ax.Q8.q;
import ax.Q8.t;
import ax.Q8.v;
import ax.Q8.w;
import ax.R8.y;
import ax.c9.e;
import ax.h9.d;
import ax.l9.b;
import ax.l9.c;
import ax.n9.f;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class o {
    private long a;
    private ax.k9.e b;
    private ax.r9.b c;
    private final Set<v> d;
    private final c e;
    private ax.i9.d f;
    private final ax.n9.c g;
    private final Set<ax.J8.a> h;
    private final boolean i;

    public o(long l8, ax.k9.e object, ax.r9.b b8, Set<v> set, ax.i9.d d8, b b9, ax.n9.c c8, Set<ax.J8.a> set2, Set<w> set3) {
        this.a = l8;
        this.b = object;
        this.c = b8;
        this.d = set;
        this.e = object = b9.f();
        this.f = d8;
        this.g = c8;
        this.h = set2;
        boolean bl = set3.contains(w.p0) && ((c)object).a().j() && b9.r();
        this.i = bl;
    }

    void a() throws e {
        Object object;
        Object object2;
        block3: {
            try {
                object2 = new y(this.e.a(), this.c.p(), this.a);
                object = (q)ax.a9.d.a(this.c.H((q)object2), this.f.D(), TimeUnit.MILLISECONDS, ax.c9.e.q);
                boolean bl = ax.K8.a.j(((t)((d)object).c()).m());
                if (!bl) break block3;
                this.g.b(new f(this.c.p(), this.a));
                return;
            }
            catch (Throwable throwable) {
                this.g.b(new f(this.c.p(), this.a));
                throw throwable;
            }
        }
        t t8 = (t)((d)object).c();
        object = new StringBuilder();
        ((StringBuilder)object).append("Error closing connection to ");
        ((StringBuilder)object).append(this.b);
        object2 = new F(t8, ((StringBuilder)object).toString());
        throw object2;
    }

    public ax.i9.d b() {
        return this.f;
    }

    public c c() {
        return this.e;
    }

    public ax.r9.b d() {
        return this.c;
    }

    public String e() {
        return this.b.c();
    }

    public long f() {
        return this.a;
    }

    public String toString() {
        return String.format("TreeConnect[%s](%s)", this.a, this.b);
    }
}

