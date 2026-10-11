/*
 * Decompiled with CFR 0.152.
 */
package ax.pd;

import ax.Wc.A;
import ax.Wc.D;
import ax.Wc.f;
import ax.Wc.g;
import ax.Wc.t;
import ax.Wc.x0;
import ax.pd.b;
import ax.pd.e;
import java.util.Enumeration;

public class c
extends t
implements f {
    private static e g0 = ax.qd.b.Q;
    private int c0;
    private e d0;
    private b[] e0;
    private x0 f0;
    private boolean q;

    private c(D d8) {
        this(g0, d8);
    }

    /*
     * Enabled aggressive block sorting
     */
    private c(e object, D d8) {
        this.d0 = object;
        this.e0 = new b[d8.size()];
        Enumeration enumeration = d8.J();
        boolean bl = true;
        int n8 = 0;
        while (enumeration.hasMoreElements()) {
            object = enumeration.nextElement();
            b b8 = b.s(object);
            boolean bl2 = b8 == object;
            bl &= bl2;
            this.e0[n8] = b8;
            ++n8;
        }
        object = bl ? x0.Q(d8) : new x0(this.e0);
        this.f0 = object;
    }

    public c(e e8, String string) {
        this(e8.c(string));
        this.d0 = e8;
    }

    public c(e e8, b[] bArray) {
        this.d0 = e8;
        this.e0 = (b[])bArray.clone();
        this.f0 = new x0(this.e0);
    }

    public c(String string) {
        this(g0, string);
    }

    public c(b[] bArray) {
        this(g0, bArray);
    }

    public static c r(Object object) {
        if (object instanceof c) {
            return (c)object;
        }
        if (object != null) {
            return new c(D.G(object));
        }
        return null;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof c) && !(object instanceof D)) {
            return false;
        }
        Object object2 = ((g)object).g();
        if (this.g().y((A)object2)) {
            return true;
        }
        try {
            object2 = this.d0;
            c c8 = new c(D.G(((g)object).g()));
            boolean bl = object2.e(this, c8);
            return bl;
        }
        catch (Exception exception) {
            return false;
        }
    }

    @Override
    public A g() {
        return this.f0;
    }

    @Override
    public int hashCode() {
        int n8;
        if (this.q) {
            return this.c0;
        }
        this.q = true;
        this.c0 = n8 = this.d0.b(this);
        return n8;
    }

    public b[] s() {
        return (b[])this.e0.clone();
    }

    public String toString() {
        return this.d0.f(this);
    }
}

