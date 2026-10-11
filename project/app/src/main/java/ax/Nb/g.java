/*
 * Decompiled with CFR 0.152.
 */
package ax.Nb;

import ax.Nb.e;
import ax.sb.t;
import ax.xb.b;
import java.util.Iterator;

public abstract class g<T> {
    public abstract Object c(T var1, ax.wb.e<? super t> var2);

    public final Object e(e<? extends T> object, ax.wb.e<? super t> e8) {
        if ((object = this.g(object.iterator(), e8)) == b.c()) {
            return object;
        }
        return t.a;
    }

    public abstract Object g(Iterator<? extends T> var1, ax.wb.e<? super t> var2);
}

