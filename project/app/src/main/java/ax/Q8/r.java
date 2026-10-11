/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

import ax.K8.a;
import ax.Q8.m;
import ax.Q8.o;
import ax.Q8.t;
import ax.Y8.c;
import ax.Z8.a;
import ax.h9.b;
import ax.h9.e;

public class r
extends e<t> {
    r(b b8) throws a.b {
        super(new t(), b8);
    }

    public r(byte[] byArray) throws a.b {
        super(new t(), byArray);
    }

    public long d() {
        return ((t)this.b()).i();
    }

    public boolean e() {
        return ((t)this.b()).j() != 0;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return c.a.c(((t)this.b()).g(), o.d0) && ((t)this.b()).m() == a.f0.getValue();
    }

    public boolean h() {
        return ((t)this.b()).i() == -1L && ((t)this.b()).h() == m.u0;
    }

    protected boolean i() {
        long l8 = ((t)this.b()).m();
        return a.j(l8) && l8 != a.f0.getValue();
    }

    public r j() throws a.b {
        if (this.e()) {
            return new r(this.b);
        }
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)((t)this.b()).h());
        stringBuilder.append(" with message id << ");
        stringBuilder.append(((t)this.b()).i());
        stringBuilder.append(" >>");
        return stringBuilder.toString();
    }
}

