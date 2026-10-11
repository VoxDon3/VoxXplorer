/*
 * Decompiled with CFR 0.152.
 */
package ax.L7;

import ax.L7.F;

final class j
extends F.e.a.b {
    private final String a;

    @Override
    public String a() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof F.e.a.b) {
            object = (F.e.a.b)object;
            return this.a.equals(((F.e.a.b)object).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Organization{clsId=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

