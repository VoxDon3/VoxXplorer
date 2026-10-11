/*
 * Decompiled with CFR 0.152.
 */
package ax.K2;

import ax.Gb.l;

public final class i {
    public final String a;
    private final int b;
    public final int c;

    public i(String string, int n8, int n9) {
        l.f(string, "workSpecId");
        this.a = string;
        this.b = n8;
        this.c = n9;
    }

    public final int a() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof i)) {
            return false;
        }
        object = (i)object;
        if (!l.a(this.a, ((i)object).a)) {
            return false;
        }
        if (this.b != ((i)object).b) {
            return false;
        }
        return this.c == ((i)object).c;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31 + this.b) * 31 + this.c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SystemIdInfo(workSpecId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", generation=");
        stringBuilder.append(this.b);
        stringBuilder.append(", systemId=");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

