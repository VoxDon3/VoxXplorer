/*
 * Decompiled with CFR 0.152.
 */
package ax.I9;

import ax.H9.a;
import ax.H9.l;
import ax.H9.m;
import ax.I9.b;
import java.util.AbstractMap;
import java.util.LinkedHashMap;

public abstract class u {
    private static int g;
    protected ax.D9.b a;
    private final LinkedHashMap<String, m> b = new LinkedHashMap();
    private b c;
    private long d;
    private boolean e = true;
    private final int f;

    public u() {
        int n8 = g;
        g = n8 + 1;
        this.f = n8;
    }

    public u d() {
        return this;
    }

    public void f(m m8) {
        m8.h(this);
        ((AbstractMap)this.b).put(m8.b().toLowerCase(), m8);
    }

    public void g(m m8, String string) {
        m8.g(string);
        this.f(m8);
    }

    protected void h() {
        this.a.m(this.r());
    }

    protected double i(double d8) {
        if (d8 < this.a.v()) {
            return 1.0;
        }
        return this.m() / d8;
    }

    public void j() {
        for (m m8 : this.b.values()) {
            if (!(m8 instanceof l)) continue;
            ((l)m8).s();
        }
    }

    public abstract void k(int var1, int var2);

    public b l() {
        return this.c;
    }

    public double m() {
        return this.a.t();
    }

    public int n() {
        return this.a.u();
    }

    public m o(String string) {
        return this.b.get(string.toLowerCase());
    }

    public ax.D9.b p() {
        return this.a;
    }

    public ax.A9.b q() {
        return this.a;
    }

    public u r() {
        b b8;
        u u8 = this;
        while ((b8 = u8.c) != null) {
            u8 = b8;
        }
        return u8;
    }

    protected double s(double d8, double d9) {
        if ((d9 = d8 + d9) >= 1.0) {
            return d9 - 2.0;
        }
        d8 = d9;
        if (d9 < -1.0) {
            d8 = d9 + 2.0;
        }
        return d8;
    }

    public boolean t() {
        return this.e;
    }

    public void u(long l8, int n8, int n9) {
        if (this.e && l8 > this.d) {
            this.d = l8;
            for (m m8 : this.b.values()) {
                if (!(m8 instanceof a)) continue;
                ((a)((Object)m8)).a(l8, n8, n9);
            }
            this.k(n8, n9);
        }
    }

    public void v(b b8) {
        if (this.c != null && b8 != null) {
            throw new RuntimeException("Unit is already in a circuit.");
        }
        this.c = b8;
    }

    public void w(boolean bl) {
        this.e = bl;
        if (!bl) {
            this.j();
        }
    }

    public void x(ax.D9.b b8) {
        ax.D9.b b9 = this.a;
        if (b9 != null && b9 != b8) {
            throw new RuntimeException("Unit synthesisEngine already set.");
        }
        this.a = b8;
    }

    public void y() {
        if (this.p() != null) {
            this.p().C(this);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("This ");
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append(" was not add()ed to a Synthesizer.");
        throw new RuntimeException(stringBuilder.toString());
    }
}

