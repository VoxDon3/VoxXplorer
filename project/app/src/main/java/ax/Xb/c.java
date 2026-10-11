/*
 * Decompiled with CFR 0.152.
 */
package ax.Xb;

import ax.Xb.f;
import ax.Xb.l;

public final class c
extends f {
    public static final c j0 = new c();

    private c() {
        super(l.c, l.d, l.e, l.a);
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override
    public String toString() {
        return "Dispatchers.Default";
    }
}

