/*
 * Decompiled with CFR 0.152.
 */
package ax.m8;

import ax.m8.d;
import ax.m8.e;
import java.util.Set;

final class c
extends e {
    private final Set<d> a;

    c(Set<d> set) {
        if (set != null) {
            this.a = set;
            return;
        }
        throw new NullPointerException("Null rolloutAssignments");
    }

    @Override
    public Set<d> b() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof e) {
            object = (e)object;
            return this.a.equals(((e)object).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RolloutsState{rolloutAssignments=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

