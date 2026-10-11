/*
 * Decompiled with CFR 0.152.
 */
package ax.R8;

import ax.L8.a;
import ax.Q8.g;
import ax.Q8.j;
import ax.Q8.l;
import ax.Q8.m;
import ax.Q8.q;
import ax.Q8.u;
import ax.Y8.c;
import ax.h9.b;
import ax.k9.e;
import java.util.Set;

public class d
extends q {
    private final Set<a> e;
    private final Set<u> f;
    private final ax.Q8.d g;
    private final Set<ax.Q8.e> h;
    private final e i;
    private final Set<ax.J8.a> j;
    private final l k;

    public d(g g8, long l8, long l9, l l10, Set<ax.J8.a> set, Set<a> set2, Set<u> set3, ax.Q8.d d8, Set<ax.Q8.e> set4, e e8) {
        super(57, g8, m.h0, l8, l9);
        this.k = c.a.a(l10, l.d0);
        this.j = set;
        this.e = c.a.b(set2, a.class);
        this.f = c.a.b(set3, u.class);
        this.g = c.a.a(d8, ax.Q8.d.f0);
        this.h = c.a.b(set4, ax.Q8.e.class);
        this.i = e8;
    }

    @Override
    protected void m(b b8) {
        b8.s(this.c);
        b8.j((byte)0);
        b8.j((byte)0);
        b8.u(this.k.getValue());
        b8.W(8);
        b8.W(8);
        b8.u(c.a.e(this.j));
        b8.u(c.a.e(this.e));
        b8.u(c.a.e(this.f));
        b8.u(this.g.getValue());
        b8.u(c.a.e(this.h));
        int n8 = this.c + 63;
        Object object = this.i.b();
        if (object != null && ((String)object).trim().length() != 0) {
            object = ax.Q8.j.a((String)object);
            b8.s(n8);
            b8.s(((Object)object).length);
        } else {
            b8.s(n8);
            b8.s(0);
            object = new byte[1];
        }
        b8.u(0L);
        b8.u(0L);
        b8.o((byte[])object);
    }
}

