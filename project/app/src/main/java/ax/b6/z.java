/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.Z2;
import ax.b6.s;
import java.util.Iterator;
import java.util.List;

public final class z
implements s {
    @Override
    public final s c() {
        return s.f;
    }

    @Override
    public final Boolean e() {
        return Boolean.FALSE;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof z;
    }

    @Override
    public final Double f() {
        return Double.NaN;
    }

    @Override
    public final String g() {
        return "undefined";
    }

    @Override
    public final Iterator<s> i() {
        return null;
    }

    @Override
    public final s k(String string, Z2 z22, List<s> list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", string));
    }
}

