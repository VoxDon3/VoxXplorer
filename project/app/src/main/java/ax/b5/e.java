/*
 * Decompiled with CFR 0.152.
 */
package ax.b5;

import ax.T4.g;
import ax.T4.o;
import ax.T4.p;
import ax.W4.l;
import ax.b5.d;
import ax.b5.k;
import java.io.IOException;
import java.io.Serializable;

public class e
implements o,
Serializable {
    public static final l i0 = new l(" ");
    protected b c0;
    protected final p d0;
    protected boolean e0 = true;
    protected transient int f0;
    protected k g0;
    protected String h0;
    protected b q = a.c0;

    public e() {
        this(i0);
    }

    public e(p p8) {
        this.c0 = d.g0;
        this.d0 = p8;
        this.k(o.d);
    }

    @Override
    public void a(g g8) throws IOException {
        this.c0.b(g8, this.f0);
    }

    @Override
    public void b(g g8, int n8) throws IOException {
        if (!this.q.a()) {
            --this.f0;
        }
        if (n8 > 0) {
            this.q.b(g8, this.f0);
        } else {
            g8.A(' ');
        }
        g8.A(']');
    }

    @Override
    public void c(g g8, int n8) throws IOException {
        if (!this.c0.a()) {
            --this.f0;
        }
        if (n8 > 0) {
            this.c0.b(g8, this.f0);
        } else {
            g8.A(' ');
        }
        g8.A('}');
    }

    @Override
    public void d(g g8) throws IOException {
        if (this.e0) {
            g8.H(this.h0);
            return;
        }
        g8.A(this.g0.d());
    }

    @Override
    public void e(g g8) throws IOException {
        this.q.b(g8, this.f0);
    }

    @Override
    public void f(g g8) throws IOException {
        if (!this.q.a()) {
            ++this.f0;
        }
        g8.A('[');
    }

    @Override
    public void g(g g8) throws IOException {
        g8.A('{');
        if (!this.c0.a()) {
            ++this.f0;
        }
    }

    @Override
    public void h(g g8) throws IOException {
        g8.A(this.g0.c());
        this.c0.b(g8, this.f0);
    }

    @Override
    public void i(g g8) throws IOException {
        p p8 = this.d0;
        if (p8 != null) {
            g8.F(p8);
        }
    }

    @Override
    public void j(g g8) throws IOException {
        g8.A(this.g0.b());
        this.q.b(g8, this.f0);
    }

    public e k(k k8) {
        this.g0 = k8;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" ");
        stringBuilder.append(k8.d());
        stringBuilder.append(" ");
        this.h0 = stringBuilder.toString();
        return this;
    }

    public static class a
    extends c {
        public static final a c0 = new a();

        @Override
        public boolean a() {
            return true;
        }

        @Override
        public void b(g g8, int n8) throws IOException {
            g8.A(' ');
        }
    }

    public static interface b {
        public boolean a();

        public void b(g var1, int var2) throws IOException;
    }

    public static class c
    implements b,
    Serializable {
        public static final c q = new c();

        @Override
        public boolean a() {
            return true;
        }

        @Override
        public void b(g g8, int n8) throws IOException {
        }
    }
}

