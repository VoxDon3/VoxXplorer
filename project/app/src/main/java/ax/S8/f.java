/*
 * Decompiled with CFR 0.152.
 */
package ax.S8;

import ax.Q8.E;
import ax.S8.c;
import ax.S8.d;
import ax.Y8.c;
import ax.Z8.a;
import ax.h9.b;
import java.util.ArrayList;
import java.util.List;

public class f
extends c {
    private List<E> b;
    private byte[] c;

    public f() {
        super(d.c0);
        this.b = new ArrayList<E>();
    }

    public f(List<E> list, byte[] byArray) {
        super(d.c0);
        this.b = list;
        this.c = (byte[])byArray.clone();
    }

    @Override
    protected void d(b b8, int n8) throws a.b {
        int n9 = b8.J();
        int n10 = b8.J();
        for (n8 = 0; n8 < n9; ++n8) {
            int n11 = b8.J();
            E e8 = c.a.f(n11, E.class, null);
            if (e8 != null) {
                this.b.add(e8);
                continue;
            }
            throw new IllegalStateException(String.format("Unknown SMB3HashAlgorithm with value '%d'", n11));
        }
        this.c = b8.G(n10);
    }

    @Override
    protected int g(b b8) {
        List<E> list = this.b;
        if (list != null) {
            if (this.c != null) {
                b8.s(list.size());
                b8.s(this.c.length);
                list = this.b.iterator();
                while (list.hasNext()) {
                    b8.s((int)((E)list.next()).getValue());
                }
                b8.o(this.c);
                return this.b.size() * 2 + 4 + this.c.length;
            }
            throw new IllegalStateException("A salt should be provided");
        }
        throw new IllegalStateException("There should be at least 1 hash algorithm provided");
    }

    public List<E> i() {
        return this.b;
    }
}

