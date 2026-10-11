/*
 * Decompiled with CFR 0.152.
 */
package ax.Z1;

import ax.S0.G;
import ax.q1.M;
import ax.q1.P;
import ax.q1.q;
import ax.q1.r;
import ax.q1.s;
import ax.q1.t;
import java.io.IOException;
import java.util.List;

public final class a
implements r {
    private final G a = new G(4);
    private final P b = new P(-1, -1, "image/webp");

    @Override
    public void a(t t8) {
        this.b.a(t8);
    }

    @Override
    public void b(long l8, long l9) {
        this.b.b(l8, l9);
    }

    @Override
    public boolean c(s s8) throws IOException {
        this.a.X(4);
        s8.p(this.a.f(), 0, 4);
        if (this.a.O() != 1380533830L) {
            return false;
        }
        s8.j(4);
        this.a.X(4);
        s8.p(this.a.f(), 0, 4);
        return this.a.O() == 1464156752L;
    }

    @Override
    public void d() {
    }

    @Override
    public /* synthetic */ r e() {
        return q.b(this);
    }

    @Override
    public int f(s s8, M m8) throws IOException {
        return this.b.f(s8, m8);
    }

    public /* synthetic */ List k() {
        return q.a(this);
    }
}

