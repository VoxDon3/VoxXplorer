package ax.J7;

import ax.J7.D;

/* renamed from: ax.J7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0758c extends D.a {
    private final String a;
    private final String b;
    private final String c;

    C0758c(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // ax.J7.D.a
    public String c() {
        return this.a;
    }

    @Override // ax.J7.D.a
    public String d() {
        return this.c;
    }

    @Override // ax.J7.D.a
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof D.a) {
            D.a aVar = (D.a) obj;
            if (this.a.equals(aVar.c()) && ((str = this.b) != null ? str.equals(aVar.e()) : aVar.e() == null) && ((str2 = this.c) != null ? str2.equals(aVar.d()) : aVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        return hashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.a + ", firebaseInstallationId=" + this.b + ", firebaseAuthenticationToken=" + this.c + "}";
    }
}
