/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.Z2;
import ax.b6.s;
import java.util.Iterator;
import java.util.List;

public final class q
implements s {
    @Override
    public final s c() {
        return s.g;
    }

    @Override
    public final Boolean e() {
        return Boolean.FALSE;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof q;
    }

    @Override
    public final Double f() {
        return 0.0;
    }

    @Override
    public final String g() {
        return "null";
    }

    public final int hashCode() {
        return 1;
    }

    @Override
    public final Iterator<s> i() {
        return null;
    }

    @Override
    public final s k(String string, Z2 z22, List<s> list) {
        throw new IllegalStateException(String.format("null has no function %s", string));
    }
}

