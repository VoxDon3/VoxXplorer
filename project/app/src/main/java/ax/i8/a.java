/*
 * Decompiled with CFR 0.152.
 */
package ax.i8;

import ax.i8.b;
import java.util.Set;

final class a
extends b {
    private final Set<String> a;

    a(Set<String> set) {
        if (set != null) {
            this.a = set;
            return;
        }
        throw new NullPointerException("Null updatedKeys");
    }

    @Override
    public Set<String> b() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof b) {
            object = (b)object;
            return this.a.equals(((b)object).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ConfigUpdate{updatedKeys=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

