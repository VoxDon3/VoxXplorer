package ax.n8;

import java.util.List;

/* renamed from: ax.n8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2598a {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final C2619v e;
    private final List<C2619v> f;

    public C2598a(String str, String str2, String str3, String str4, C2619v c2619v, List<C2619v> list) {
        ax.Gb.l.f(str, "packageName");
        ax.Gb.l.f(str2, "versionName");
        ax.Gb.l.f(str3, "appBuildVersion");
        ax.Gb.l.f(str4, "deviceManufacturer");
        ax.Gb.l.f(c2619v, "currentProcessDetails");
        ax.Gb.l.f(list, "appProcessDetails");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = c2619v;
        this.f = list;
    }

    public final String a() {
        return this.c;
    }

    public final List<C2619v> b() {
        return this.f;
    }

    public final C2619v c() {
        return this.e;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2598a)) {
            return false;
        }
        C2598a c2598a = (C2598a) obj;
        return ax.Gb.l.a(this.a, c2598a.a) && ax.Gb.l.a(this.b, c2598a.b) && ax.Gb.l.a(this.c, c2598a.c) && ax.Gb.l.a(this.d, c2598a.d) && ax.Gb.l.a(this.e, c2598a.e) && ax.Gb.l.a(this.f, c2598a.f);
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + this.d + ", currentProcessDetails=" + this.e + ", appProcessDetails=" + this.f + ')';
    }
}
