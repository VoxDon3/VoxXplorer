/*
 * Decompiled with CFR 0.152.
 */
package ax.tb;

import ax.Hb.a;
import java.util.Iterator;

public abstract class D
implements Iterator<Integer>,
a {
    public abstract int b();

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

