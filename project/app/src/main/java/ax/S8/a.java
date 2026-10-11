/*
 * Decompiled with CFR 0.152.
 */
package ax.S8;

import ax.Q8.A;
import ax.S8.c;
import ax.S8.d;
import ax.Y8.c;
import ax.Z8.a;
import ax.h9.b;
import java.util.ArrayList;
import java.util.List;

public class a
extends c {
    private List<A> b = new ArrayList<A>();

    a() {
        super(d.e0);
    }

    @Override
    protected void d(b b8, int n8) throws a.b {
        int n9 = b8.J();
        b8.U(2);
        b8.U(4);
        for (n8 = 0; n8 < n9; ++n8) {
            int n10 = b8.J();
            A a8 = c.a.f(n10, A.class, null);
            if (a8 != null) {
                this.b.add(a8);
                continue;
            }
            throw new IllegalStateException(String.format("Unknown SMB3CompressionAlgorithm with value '%d'", n10));
        }
    }

    @Override
    protected int g(b b8) {
        List<A> list = this.b;
        if (list != null) {
            b8.s(list.size());
            b8.X();
            b8.Y();
            list = this.b.iterator();
            while (list.hasNext()) {
                b8.s((int)((A)list.next()).getValue());
            }
            return this.b.size() * 2 + 8;
        }
        throw new IllegalStateException("Cannot write a null compressionAlgorithms array");
    }

    public List<A> i() {
        return this.b;
    }
}

