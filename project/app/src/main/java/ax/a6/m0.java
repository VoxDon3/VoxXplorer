/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import ax.a6.i0;
import ax.a6.o0;

final class m0
extends i0 {
    private final o0 d0;

    m0(o0 o02, int n8) {
        super(o02.size(), n8);
        this.d0 = o02;
    }

    @Override
    protected final Object b(int n8) {
        return this.d0.get(n8);
    }
}

