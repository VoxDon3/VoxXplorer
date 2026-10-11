/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

import ax.Q8.g;
import ax.Q8.h;
import ax.Q8.m;
import ax.Q8.r;
import ax.Q8.t;
import ax.Z8.a;
import ax.h9.b;
import ax.h9.d;

public class q
extends d<r, t> {
    protected int c;
    private h d;

    public q() {
        super(new t());
    }

    protected q(int n8, g g8, m m8) {
        this(n8, g8, m8, 0L, 0L);
    }

    protected q(int n8, g g8, m m8, long l8) {
        this(n8, g8, m8, l8, 0L);
    }

    protected q(int n8, g g8, m m8, long l8, long l9) {
        super(new t());
        this.c = n8;
        ((t)this.a).t(g8);
        ((t)this.a).x(m8);
        ((t)this.a).y(l8);
        ((t)this.a).z(l9);
    }

    @Override
    public b b() {
        return this.b;
    }

    public int d() {
        return ((t)this.c()).e();
    }

    public h e() {
        return this.d;
    }

    public int f() {
        return 65536;
    }

    public q g() {
        return this;
    }

    protected final void h(r r8) throws a.b {
        this.b = r8.a();
        this.a = r8.b();
        this.j(this.b);
        this.b.T(((t)this.a).c());
    }

    final void i(r r8) throws a.b {
        this.b = r8.a();
        this.a = r8.b();
        this.d = new h().b((t)this.a, this.b);
        this.b.T(((t)this.a).c());
    }

    protected void j(b b8) throws a.b {
        throw new UnsupportedOperationException("Should be implemented by specific message type");
    }

    public void k(int n8) {
        ((t)this.c()).r(n8);
    }

    public void l(b b8) {
        this.b = b8;
        ((t)this.a).D(b8);
        this.m(b8);
        ((t)this.a).v(b8.V());
    }

    protected void m(b b8) {
        throw new UnsupportedOperationException("Should be implemented by specific message type");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)((t)this.a).h());
        stringBuilder.append(" with message id << ");
        stringBuilder.append(((t)this.a).i());
        stringBuilder.append(" >>");
        return stringBuilder.toString();
    }
}

