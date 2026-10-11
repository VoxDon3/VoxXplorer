/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import ax.a6.u0;
import java.util.NoSuchElementException;

final class q0
extends u0 {
    private boolean c0;
    private final Object q;

    q0(Object object) {
        this.q = object;
    }

    @Override
    public final boolean hasNext() {
        return !this.c0;
    }

    public final Object next() {
        if (!this.c0) {
            this.c0 = true;
            return this.q;
        }
        throw new NoSuchElementException();
    }
}

