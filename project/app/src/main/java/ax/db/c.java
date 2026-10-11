/*
 * Decompiled with CFR 0.152.
 */
package ax.db;

import ax.db.a;

final class c
extends a.b {
    private final String a;

    c(String string) {
        if (string != null) {
            this.a = string;
            return;
        }
        throw new NullPointerException("Null stringValue");
    }

    @Override
    String d() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof a.b) {
            object = (a.b)object;
            return this.a.equals(((a.b)object).d());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AttributeValueString{stringValue=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

