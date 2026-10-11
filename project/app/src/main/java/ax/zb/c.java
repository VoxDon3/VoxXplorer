/*
 * Decompiled with CFR 0.152.
 */
package ax.zb;

import ax.Gb.l;
import ax.tb.i;
import ax.zb.a;
import java.io.Serializable;

final class c<T extends Enum<T>>
extends ax.tb.c<T>
implements a<T>,
Serializable {
    private final T[] c0;

    public c(T[] TArray) {
        l.f(TArray, "entries");
        this.c0 = TArray;
    }

    @Override
    public int g() {
        return this.c0.length;
    }

    public boolean k(T t8) {
        l.f(t8, "element");
        return (Enum)i.w(this.c0, ((Enum)t8).ordinal()) == t8;
    }

    public T l(int n8) {
        ax.tb.c.q.b(n8, this.c0.length);
        return this.c0[n8];
    }

    public int n(T t8) {
        l.f(t8, "element");
        int n8 = ((Enum)t8).ordinal();
        if ((Enum)i.w(this.c0, n8) == t8) {
            return n8;
        }
        return -1;
    }

    public int p(T t8) {
        l.f(t8, "element");
        return this.indexOf(t8);
    }
}

