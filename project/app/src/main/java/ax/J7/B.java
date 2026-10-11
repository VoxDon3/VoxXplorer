/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import ax.Gb.l;

public final class B {
    private final String a;
    private final String b;

    public B(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof B)) {
            return false;
        }
        object = (B)object;
        if (!l.a(this.a, ((B)object).a)) {
            return false;
        }
        return l.a(this.b, ((B)object).b);
    }

    public int hashCode() {
        String string = this.a;
        int n8 = 0;
        int n9 = string == null ? 0 : string.hashCode();
        string = this.b;
        if (string != null) {
            n8 = string.hashCode();
        }
        return n9 * 31 + n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FirebaseInstallationId(fid=");
        stringBuilder.append(this.a);
        stringBuilder.append(", authToken=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

