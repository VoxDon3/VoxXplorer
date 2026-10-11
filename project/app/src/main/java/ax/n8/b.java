/*
 * Decompiled with CFR 0.152.
 */
package ax.n8;

import ax.Gb.l;
import ax.n8.a;
import ax.n8.u;

public final class b {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final u e;
    private final a f;

    public b(String string, String string2, String string3, String string4, u u8, a a8) {
        l.f(string, "appId");
        l.f(string2, "deviceModel");
        l.f(string3, "sessionSdkVersion");
        l.f(string4, "osVersion");
        l.f(u8, "logEnvironment");
        l.f(a8, "androidAppInfo");
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = u8;
        this.f = a8;
    }

    public final a a() {
        return this.f;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final u d() {
        return this.e;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        object = (b)object;
        if (!l.a(this.a, ((b)object).a)) {
            return false;
        }
        if (!l.a(this.b, ((b)object).b)) {
            return false;
        }
        if (!l.a(this.c, ((b)object).c)) {
            return false;
        }
        if (!l.a(this.d, ((b)object).d)) {
            return false;
        }
        if (this.e != ((b)object).e) {
            return false;
        }
        return l.a(this.f, ((b)object).f);
    }

    public final String f() {
        return this.c;
    }

    public int hashCode() {
        return ((((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.e.hashCode()) * 31 + this.f.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApplicationInfo(appId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", deviceModel=");
        stringBuilder.append(this.b);
        stringBuilder.append(", sessionSdkVersion=");
        stringBuilder.append(this.c);
        stringBuilder.append(", osVersion=");
        stringBuilder.append(this.d);
        stringBuilder.append(", logEnvironment=");
        stringBuilder.append(this.e);
        stringBuilder.append(", androidAppInfo=");
        stringBuilder.append(this.f);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

