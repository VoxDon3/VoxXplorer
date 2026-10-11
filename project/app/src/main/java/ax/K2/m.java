/*
 * Decompiled with CFR 0.152.
 */
package ax.K2;

import ax.Gb.l;

public final class m {
    private final String a;
    private final int b;

    public m(String string, int n8) {
        l.f(string, "workSpecId");
        this.a = string;
        this.b = n8;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof m)) {
            return false;
        }
        object = (m)object;
        if (!l.a(this.a, ((m)object).a)) {
            return false;
        }
        return this.b == ((m)object).b;
    }

    public int hashCode() {
        return this.a.hashCode() * 31 + this.b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WorkGenerationalId(workSpecId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", generation=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

