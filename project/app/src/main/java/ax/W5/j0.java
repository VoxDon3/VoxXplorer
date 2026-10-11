/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.l0;
import ax.W5.t0;
import java.util.NoSuchElementException;

final class j0
extends l0 {
    private final int c0;
    final t0 d0;
    private int q;

    j0(t0 t02) {
        this.d0 = t02;
        this.q = 0;
        this.c0 = t02.h();
    }

    @Override
    public final byte a() {
        int n8 = this.q;
        if (n8 < this.c0) {
            this.q = n8 + 1;
            return this.d0.g(n8);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        return this.q < this.c0;
    }
}

