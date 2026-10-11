/*
 * Decompiled with CFR 0.152.
 */
package ax.M9;

import ax.K9.a;
import ax.L9.d;
import ax.M9.f;
import ax.P9.n;
import ax.T9.e;

public abstract class b
implements f {
    private a a;
    private d b;
    private n c;
    private ax.Q9.b d;
    private e e;

    @Override
    public ax.Q9.b a() {
        return this.d;
    }

    @Override
    public n b() {
        return this.c;
    }

    @Override
    public a c() {
        return this.a;
    }

    protected void f(a a8) {
        this.a = a8;
    }

    protected void g(d d8) {
        this.b = d8;
    }

    protected void h(n n8) {
        this.c = n8;
    }

    protected void i(ax.Q9.b b8) {
        this.d = b8;
    }

    public void j(e e8) {
        this.e = e8;
    }

    public void k() {
        if (this.a != null) {
            if (this.b != null) {
                if (this.c != null) {
                    if (this.e != null) {
                        return;
                    }
                    throw new NullPointerException("Serializer");
                }
                throw new NullPointerException("HttpProvider");
            }
            throw new NullPointerException("Executors");
        }
        throw new NullPointerException("AuthenticationProvider");
    }
}

