/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.m5;
import ax.b6.o5;
import ax.b6.t5;
import ax.b6.x5;
import java.util.Iterator;

final class q5
extends x5 {
    private final m5 c0;

    private q5(m5 m52) {
        this.c0 = m52;
        super(m52, null);
    }

    /* synthetic */ q5(m5 m52, t5 t52) {
        this(m52);
    }

    @Override
    public final Iterator iterator() {
        return new o5(this.c0, null);
    }
}

