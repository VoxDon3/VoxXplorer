/*
 * Decompiled with CFR 0.152.
 */
package ax.n8;

import ax.Gb.l;
import ax.K2.t;
import ax.n8.f;

public final class D {
    private final String a;
    private final String b;
    private final int c;
    private final long d;
    private final f e;
    private final String f;
    private final String g;

    public D(String string, String string2, int n8, long l8, f f8, String string3, String string4) {
        l.f(string, "sessionId");
        l.f(string2, "firstSessionId");
        l.f(f8, "dataCollectionStatus");
        l.f(string3, "firebaseInstallationId");
        l.f(string4, "firebaseAuthenticationToken");
        this.a = string;
        this.b = string2;
        this.c = n8;
        this.d = l8;
        this.e = f8;
        this.f = string3;
        this.g = string4;
    }

    public final f a() {
        return this.e;
    }

    public final long b() {
        return this.d;
    }

    public final String c() {
        return this.g;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof D)) {
            return false;
        }
        object = (D)object;
        if (!l.a(this.a, ((D)object).a)) {
            return false;
        }
        if (!l.a(this.b, ((D)object).b)) {
            return false;
        }
        if (this.c != ((D)object).c) {
            return false;
        }
        if (this.d != ((D)object).d) {
            return false;
        }
        if (!l.a(this.e, ((D)object).e)) {
            return false;
        }
        if (!l.a(this.f, ((D)object).f)) {
            return false;
        }
        return l.a(this.g, ((D)object).g);
    }

    public final String f() {
        return this.a;
    }

    public final int g() {
        return this.c;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c) * 31 + t.a(this.d)) * 31 + this.e.hashCode()) * 31 + this.f.hashCode()) * 31 + this.g.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SessionInfo(sessionId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", firstSessionId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", sessionIndex=");
        stringBuilder.append(this.c);
        stringBuilder.append(", eventTimestampUs=");
        stringBuilder.append(this.d);
        stringBuilder.append(", dataCollectionStatus=");
        stringBuilder.append(this.e);
        stringBuilder.append(", firebaseInstallationId=");
        stringBuilder.append(this.f);
        stringBuilder.append(", firebaseAuthenticationToken=");
        stringBuilder.append(this.g);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

