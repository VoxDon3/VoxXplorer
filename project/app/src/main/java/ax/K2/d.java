/*
 * Decompiled with CFR 0.152.
 */
package ax.K2;

import ax.Gb.l;

public final class d {
    private final String a;
    private final Long b;

    public d(String string, Long l8) {
        l.f(string, "key");
        this.a = string;
        this.b = l8;
    }

    public d(String string, boolean bl) {
        l.f(string, "key");
        long l8 = bl ? 1L : 0L;
        this(string, l8);
    }

    public final String a() {
        return this.a;
    }

    public final Long b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof d)) {
            return false;
        }
        object = (d)object;
        if (!l.a(this.a, ((d)object).a)) {
            return false;
        }
        return l.a(this.b, ((d)object).b);
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        Long l8 = this.b;
        int n9 = l8 == null ? 0 : ((Object)l8).hashCode();
        return n8 * 31 + n9;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Preference(key=");
        stringBuilder.append(this.a);
        stringBuilder.append(", value=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

