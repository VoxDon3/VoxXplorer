/*
 * Decompiled with CFR 0.152.
 */
package ax.n8;

import ax.Gb.l;
import ax.K2.t;

public final class z {
    private final String a;
    private final String b;
    private final int c;
    private final long d;

    public z(String string, String string2, int n8, long l8) {
        l.f(string, "sessionId");
        l.f(string2, "firstSessionId");
        this.a = string;
        this.b = string2;
        this.c = n8;
        this.d = l8;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof z)) {
            return false;
        }
        object = (z)object;
        if (!l.a(this.a, ((z)object).a)) {
            return false;
        }
        if (!l.a(this.b, ((z)object).b)) {
            return false;
        }
        if (this.c != ((z)object).c) {
            return false;
        }
        return this.d == ((z)object).d;
    }

    public int hashCode() {
        return ((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c) * 31 + t.a(this.d);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SessionDetails(sessionId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", firstSessionId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", sessionIndex=");
        stringBuilder.append(this.c);
        stringBuilder.append(", sessionStartTimestampUs=");
        stringBuilder.append(this.d);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

