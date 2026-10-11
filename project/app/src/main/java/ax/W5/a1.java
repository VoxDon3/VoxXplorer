/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.g1;
import ax.W5.h1;

final class a1
implements h1 {
    private final h1[] a;

    a1(h1 ... h1Array) {
        this.a = h1Array;
    }

    @Override
    public final g1 b(Class clazz) {
        h1[] h1Array = this.a;
        for (int i8 = 0; i8 < 2; ++i8) {
            h1 h12 = h1Array[i8];
            if (!h12.c(clazz)) continue;
            return h12.b(clazz);
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(clazz.getName()));
    }

    @Override
    public final boolean c(Class clazz) {
        h1[] h1Array = this.a;
        for (int i8 = 0; i8 < 2; ++i8) {
            if (!h1Array[i8].c(clazz)) continue;
            return true;
        }
        return false;
    }
}

