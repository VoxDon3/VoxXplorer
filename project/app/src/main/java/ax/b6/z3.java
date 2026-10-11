/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.B3;
import ax.b6.C3;
import java.util.NoSuchElementException;

final class z3
extends C3 {
    private final int c0;
    private final B3 d0;
    private int q;

    z3(B3 b32) {
        this.d0 = b32;
        this.q = 0;
        this.c0 = b32.s();
    }

    @Override
    public final byte a() {
        int n8 = this.q;
        if (n8 < this.c0) {
            this.q = n8 + 1;
            return this.d0.r(n8);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        return this.q < this.c0;
    }
}

