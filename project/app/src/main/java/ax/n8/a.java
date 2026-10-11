/*
 * Decompiled with CFR 0.152.
 */
package ax.n8;

import ax.Gb.l;
import ax.n8.v;
import java.util.List;

public final class a {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final v e;
    private final List<v> f;

    public a(String string, String string2, String string3, String string4, v v8, List<v> list) {
        l.f(string, "packageName");
        l.f(string2, "versionName");
        l.f(string3, "appBuildVersion");
        l.f(string4, "deviceManufacturer");
        l.f(v8, "currentProcessDetails");
        l.f(list, "appProcessDetails");
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = v8;
        this.f = list;
    }

    public final String a() {
        return this.c;
    }

    public final List<v> b() {
        return this.f;
    }

    public final v c() {
        return this.e;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        object = (a)object;
        if (!l.a(this.a, ((a)object).a)) {
            return false;
        }
        if (!l.a(this.b, ((a)object).b)) {
            return false;
        }
        if (!l.a(this.c, ((a)object).c)) {
            return false;
        }
        if (!l.a(this.d, ((a)object).d)) {
            return false;
        }
        if (!l.a(this.e, ((a)object).e)) {
            return false;
        }
        return l.a(this.f, ((a)object).f);
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        return ((((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.e.hashCode()) * 31 + ((Object)this.f).hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AndroidApplicationInfo(packageName=");
        stringBuilder.append(this.a);
        stringBuilder.append(", versionName=");
        stringBuilder.append(this.b);
        stringBuilder.append(", appBuildVersion=");
        stringBuilder.append(this.c);
        stringBuilder.append(", deviceManufacturer=");
        stringBuilder.append(this.d);
        stringBuilder.append(", currentProcessDetails=");
        stringBuilder.append(this.e);
        stringBuilder.append(", appProcessDetails=");
        stringBuilder.append(this.f);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

