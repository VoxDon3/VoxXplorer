/*
 * Decompiled with CFR 0.152.
 */
package ax.sb;

import ax.Gb.l;
import java.io.Serializable;

public final class m<A, B>
implements Serializable {
    private final B c0;
    private final A q;

    public m(A a8, B b8) {
        this.q = a8;
        this.c0 = b8;
    }

    public final A a() {
        return this.q;
    }

    public final B b() {
        return this.c0;
    }

    public final A c() {
        return this.q;
    }

    public final B d() {
        return this.c0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof m)) {
            return false;
        }
        object = (m)object;
        if (!l.a(this.q, ((m)object).q)) {
            return false;
        }
        return l.a(this.c0, ((m)object).c0);
    }

    public int hashCode() {
        Object object = this.q;
        int n8 = 0;
        int n9 = object == null ? 0 : object.hashCode();
        object = this.c0;
        if (object != null) {
            n8 = object.hashCode();
        }
        return n9 * 31 + n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        stringBuilder.append(this.q);
        stringBuilder.append(", ");
        stringBuilder.append(this.c0);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

