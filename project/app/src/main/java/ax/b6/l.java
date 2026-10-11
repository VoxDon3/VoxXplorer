/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.Z2;
import ax.b6.s;
import java.util.Iterator;
import java.util.List;

public final class l
implements s {
    private final String c0;
    private final s q;

    public l() {
        this.q = s.f;
        this.c0 = "return";
    }

    public l(String string) {
        this.q = s.f;
        this.c0 = string;
    }

    public l(String string, s s8) {
        this.q = s8;
        this.c0 = string;
    }

    public final s a() {
        return this.q;
    }

    public final String b() {
        return this.c0;
    }

    @Override
    public final s c() {
        return new l(this.c0, this.q.c());
    }

    @Override
    public final Boolean e() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof l)) {
            return false;
        }
        String string = this.c0;
        object = (l)object;
        return string.equals(((l)object).c0) && this.q.equals(((l)object).q);
    }

    @Override
    public final Double f() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override
    public final String g() {
        throw new IllegalStateException("Control is not a String");
    }

    public final int hashCode() {
        return this.c0.hashCode() * 31 + this.q.hashCode();
    }

    @Override
    public final Iterator<s> i() {
        return null;
    }

    @Override
    public final s k(String string, Z2 z22, List<s> list) {
        throw new IllegalStateException("Control does not have functions");
    }
}

