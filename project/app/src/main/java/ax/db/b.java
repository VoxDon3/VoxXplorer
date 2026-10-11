/*
 * Decompiled with CFR 0.152.
 */
package ax.db;

import ax.db.a;

final class b
extends a.a {
    private final Long a;

    b(Long l8) {
        if (l8 != null) {
            this.a = l8;
            return;
        }
        throw new NullPointerException("Null longValue");
    }

    @Override
    Long d() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof a.a) {
            object = (a.a)object;
            return this.a.equals(((a.a)object).d());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AttributeValueLong{longValue=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

