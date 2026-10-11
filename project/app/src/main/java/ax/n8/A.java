/*
 * Decompiled with CFR 0.152.
 */
package ax.n8;

import ax.Gb.l;
import ax.n8.D;
import ax.n8.b;
import ax.n8.j;

public final class A {
    private final j a;
    private final D b;
    private final b c;

    public A(j j8, D d8, b b8) {
        l.f(j8, "eventType");
        l.f(d8, "sessionData");
        l.f(b8, "applicationInfo");
        this.a = j8;
        this.b = d8;
        this.c = b8;
    }

    public final b a() {
        return this.c;
    }

    public final j b() {
        return this.a;
    }

    public final D c() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof A)) {
            return false;
        }
        object = (A)object;
        if (this.a != ((A)object).a) {
            return false;
        }
        if (!l.a(this.b, ((A)object).b)) {
            return false;
        }
        return l.a(this.c, ((A)object).c);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SessionEvent(eventType=");
        stringBuilder.append(this.a);
        stringBuilder.append(", sessionData=");
        stringBuilder.append(this.b);
        stringBuilder.append(", applicationInfo=");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

