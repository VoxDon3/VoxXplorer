/*
 * Decompiled with CFR 0.152.
 */
package ax.s9;

import ax.N8.v;
import ax.N8.w;
import ax.N8.x;
import ax.Q8.F;
import ax.Q8.i;
import ax.Xd.d;
import ax.Xd.f;
import ax.k9.e;
import ax.s9.c;
import ax.s9.g;

public abstract class b
extends g<c> {
    protected final d g0 = f.k(this.getClass());

    b(i i8, c c8, e e8) {
        super(i8, e8, c8);
    }

    public void A(String string, boolean bl) throws F {
        this.W(string, bl, 0L);
    }

    public void W(String string, boolean bl, long l8) throws F {
        this.o0(new w(bl, l8, string));
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        object = (b)object;
        e e8 = this.e0;
        if (e8 == null ? ((g)object).e0 != null : !e8.equals(((g)object).e0)) {
            return false;
        }
        e8 = this.c0;
        return !(e8 == null ? ((g)object).c0 != null : !((c)((Object)e8)).equals(((g)object).c0));
    }

    public void g() {
        ((c)this.c0).F0(this.d0);
    }

    public int hashCode() {
        e e8 = this.e0;
        int n8 = 0;
        int n9 = e8 == null ? 0 : e8.hashCode();
        e8 = this.c0;
        if (e8 != null) {
            n8 = ((c)((Object)e8)).hashCode();
        }
        return (n9 + 31) * 31 + n8;
    }

    public <F extends x> void o0(F f8) {
        ((c)this.c0).j1(this.d0, f8);
    }

    public c p() {
        return (c)this.c0;
    }

    public ax.N8.c q() throws F {
        return this.u(ax.N8.c.class);
    }

    public <F extends v> F u(Class<F> clazz) throws F {
        return ((c)this.c0).M0(this.d0, clazz);
    }
}

