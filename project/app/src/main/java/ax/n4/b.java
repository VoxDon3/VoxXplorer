/*
 * Decompiled with CFR 0.152.
 */
package ax.n4;

import ax.n4.h;
import ax.n4.j;
import ax.n4.k;

public class b
implements h,
Cloneable {
    private final String c0;
    private final k[] d0;
    private final String q;

    public b(String string, String string2, k[] kArray) {
        if (string != null) {
            this.q = string;
            this.c0 = string2;
            if (kArray != null) {
                this.d0 = kArray;
                return;
            }
            this.d0 = new k[0];
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!(object instanceof h)) {
            return false;
        }
        object = (b)object;
        return this.q.equals(((b)object).q) && j.a(this.c0, ((b)object).c0) && j.b(this.d0, ((b)object).d0);
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
        k[] kArray;
        int n8 = j.d(j.d(17, this.q), this.c0);
        for (int i8 = 0; i8 < (kArray = this.d0).length; ++i8) {
            n8 = j.d(n8, kArray[i8]);
        }
        return n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append(this.q);
        if (this.c0 != null) {
            stringBuilder.append("=");
            stringBuilder.append(this.c0);
        }
        for (int i8 = 0; i8 < this.d0.length; ++i8) {
            stringBuilder.append("; ");
            stringBuilder.append(this.d0[i8]);
        }
        return stringBuilder.toString();
    }
}

