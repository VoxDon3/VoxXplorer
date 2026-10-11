package ax.L7;

import ax.L7.G;

/* loaded from: classes3.dex */
final class C extends G.a {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final ax.G7.f f;

    C(String str, String str2, String str3, String str4, int i, ax.G7.f fVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.d = str4;
        this.e = i;
        if (fVar == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f = fVar;
    }

    @Override // ax.L7.G.a
    public String a() {
        return this.a;
    }

    @Override // ax.L7.G.a
    public int c() {
        return this.e;
    }

    @Override // ax.L7.G.a
    public ax.G7.f d() {
        return this.f;
    }

    @Override // ax.L7.G.a
    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G.a) {
            G.a aVar = (G.a) obj;
            if (this.a.equals(aVar.a()) && this.b.equals(aVar.f()) && this.c.equals(aVar.g()) && this.d.equals(aVar.e()) && this.e == aVar.c() && this.f.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.L7.G.a
    public String f() {
        return this.b;
    }

    @Override // ax.L7.G.a
    public String g() {
        return this.c;
    }

    public int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
