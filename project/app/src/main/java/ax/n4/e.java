/*
 * Decompiled with CFR 0.152.
 */
package ax.n4;

import ax.n4.j;
import ax.n4.k;
import java.io.Serializable;

public class e
implements k,
Cloneable,
Serializable {
    private final String c0;
    private final String q;

    public e(String string, String string2) {
        if (string != null) {
            this.q = string;
            this.c0 = string2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object object) {
        String string;
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!(object instanceof k)) {
            return false;
        }
        object = (e)object;
        return this.q.equals(((e)object).q) && this.c0 == ((e)object).c0 || (string = this.c0) != null && string.equals(((e)object).c0);
    }

    @Override
    public String getName() {
        return this.q;
    }

    @Override
    public String getValue() {
        return this.c0;
    }

    public int hashCode() {
        return j.d(j.d(17, this.q), this.c0);
    }

    public String toString() {
        if (this.c0 == null) {
            return this.q;
        }
        StringBuilder stringBuilder = new StringBuilder(this.q.length() + 1 + this.c0.length());
        stringBuilder.append(this.q);
        stringBuilder.append("=");
        stringBuilder.append(this.c0);
        return stringBuilder.toString();
    }
}

