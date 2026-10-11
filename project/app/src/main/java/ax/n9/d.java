/*
 * Decompiled with CFR 0.152.
 */
package ax.n9;

import ax.n9.b;

abstract class d
implements b {
    private long a;

    public d(long l8) {
        this.a = l8;
    }

    public long a() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (d)object;
            if (this.a == ((d)object).a) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long l8 = this.a;
        return (int)(l8 ^ l8 >>> 32);
    }
}

