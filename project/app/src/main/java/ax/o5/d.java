/*
 * Decompiled with CFR 0.152.
 */
package ax.o5;

import ax.o5.n;
import ax.o5.u;
import java.util.List;

final class d
extends n {
    private final List<u> a;

    d(List<u> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    @Override
    public List<u> c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof n) {
            object = (n)object;
            return this.a.equals(((n)object).c());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BatchedLogRequest{logRequests=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

