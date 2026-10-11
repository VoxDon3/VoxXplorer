/*
 * Decompiled with CFR 0.152.
 */
package ax.S8;

import ax.Q8.D;
import ax.S8.c;
import ax.S8.d;
import ax.Y8.c;
import ax.Z8.a;
import java.util.ArrayList;
import java.util.List;

public class b
extends c {
    private List<D> b;

    public b() {
        super(d.d0);
        this.b = new ArrayList<D>();
    }

    public b(List<D> list) {
        super(d.d0);
        this.b = list;
    }

    @Override
    protected void d(ax.h9.b b8, int n8) throws a.b {
        int n9 = b8.J();
        for (n8 = 0; n8 < n9; ++n8) {
            this.b.add(c.a.f(b8.J(), D.class, null));
        }
    }

    @Override
    protected int g(ax.h9.b b8) {
        List<D> list = this.b;
        if (list != null && !list.isEmpty()) {
            b8.s(this.b.size());
            list = this.b.iterator();
            while (list.hasNext()) {
                b8.s((int)((D)list.next()).getValue());
            }
            return this.b.size() * 2 + 2;
        }
        throw new IllegalStateException("Cannot serialize an empty or null cipherList");
    }

    public List<D> i() {
        return this.b;
    }
}

