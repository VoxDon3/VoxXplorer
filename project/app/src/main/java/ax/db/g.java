/*
 * Decompiled with CFR 0.152.
 */
package ax.db;

import ax.db.z;
import java.util.List;

final class g
extends z {
    private final List<Object> a;

    g(List<Object> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null entries");
    }

    @Override
    public List<Object> d() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof z) {
            object = (z)object;
            return this.a.equals(((z)object).d());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Tracestate{entries=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

