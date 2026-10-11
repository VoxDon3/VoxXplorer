package ax.n8;

/* renamed from: ax.n8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2599b {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final EnumC2618u e;
    private final C2598a f;

    public C2599b(String str, String str2, String str3, String str4, EnumC2618u enumC2618u, C2598a c2598a) {
        ax.Gb.l.f(str, "appId");
        ax.Gb.l.f(str2, "deviceModel");
        ax.Gb.l.f(str3, "sessionSdkVersion");
        ax.Gb.l.f(str4, "osVersion");
        ax.Gb.l.f(enumC2618u, "logEnvironment");
        ax.Gb.l.f(c2598a, "androidAppInfo");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = enumC2618u;
        this.f = c2598a;
    }

    public final C2598a a() {
        return this.f;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final EnumC2618u d() {
        return this.e;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2599b)) {
            return false;
        }
        C2599b c2599b = (C2599b) obj;
        return ax.Gb.l.a(this.a, c2599b.a) && ax.Gb.l.a(this.b, c2599b.b) && ax.Gb.l.a(this.c, c2599b.c) && ax.Gb.l.a(this.d, c2599b.d) && this.e == c2599b.e && ax.Gb.l.a(this.f, c2599b.f);
    }

    public final String f() {
        return this.c;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + this.b + ", sessionSdkVersion=" + this.c + ", osVersion=" + this.d + ", logEnvironment=" + this.e + ", androidAppInfo=" + this.f + ')';
    }
}
