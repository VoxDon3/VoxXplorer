package ax.L7;

import ax.L7.G;

/* loaded from: classes3.dex */
final class E extends G.c {
    private final String a;
    private final String b;
    private final boolean c;

    E(String str, String str2, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.b = str2;
        this.c = z;
    }

    @Override // ax.L7.G.c
    public boolean b() {
        return this.c;
    }

    @Override // ax.L7.G.c
    public String c() {
        return this.b;
    }

    @Override // ax.L7.G.c
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G.c) {
            G.c cVar = (G.c) obj;
            if (this.a.equals(cVar.d()) && this.b.equals(cVar.c()) && this.c == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.a + ", osCodeName=" + this.b + ", isRooted=" + this.c + "}";
    }
}
