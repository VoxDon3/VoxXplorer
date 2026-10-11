/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.Z2;
import ax.b6.s;
import ax.b6.u;
import java.util.Iterator;
import java.util.List;

public final class h
implements s {
    private final boolean q;

    public h(Boolean bl) {
        if (bl == null) {
            this.q = false;
            return;
        }
        this.q = bl;
    }

    @Override
    public final s c() {
        return new h(this.q);
    }

    @Override
    public final Boolean e() {
        return this.q;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof h)) {
            return false;
        }
        object = (h)object;
        return this.q == ((h)object).q;
    }

    @Override
    public final Double f() {
        double d8 = this.q ? 1.0 : 0.0;
        return d8;
    }

    @Override
    public final String g() {
        return Boolean.toString(this.q);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.q).hashCode();
    }

    @Override
    public final Iterator<s> i() {
        return null;
    }

    @Override
    public final s k(String string, Z2 z22, List<s> list) {
        if ("toString".equals(string)) {
            return new u(Boolean.toString(this.q));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.q), string));
    }

    public final String toString() {
        return String.valueOf(this.q);
    }
}

