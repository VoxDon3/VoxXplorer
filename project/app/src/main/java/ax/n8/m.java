/*
 * Decompiled with CFR 0.152.
 */
package ax.n8;

import ax.Gb.l;

public final class m {
    private final String a;

    public m(String string) {
        this.a = string;
    }

    public final String a() {
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
        return l.a(this.a, ((m)object).a);
    }

    public int hashCode() {
        String string = this.a;
        if (string == null) {
            return 0;
        }
        return string.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FirebaseSessionsData(sessionId=");
        stringBuilder.append(this.a);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

