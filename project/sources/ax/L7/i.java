package ax.L7;

import ax.L7.F;

/* loaded from: classes3.dex */
final class i extends F.e.a {
    private final String a;
    private final String b;
    private final String c;
    private final F.e.a.b d;
    private final String e;
    private final String f;
    private final String g;

    static final class b extends F.e.a.AbstractC0124a {
        private String a;
        private String b;
        private String c;
        private F.e.a.b d;
        private String e;
        private String f;
        private String g;

        b() {
        }

        @Override // ax.L7.F.e.a.AbstractC0124a
        public F.e.a a() {
            String str;
            String str2 = this.a;
            if (str2 != null && (str = this.b) != null) {
                return new i(str2, str, this.c, this.d, this.e, this.f, this.g);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" identifier");
            }
            if (this.b == null) {
                sb.append(" version");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // ax.L7.F.e.a.AbstractC0124a
        public F.e.a.AbstractC0124a b(String str) {
            this.f = str;
            return this;
        }

        @Override // ax.L7.F.e.a.AbstractC0124a
        public F.e.a.AbstractC0124a c(String str) {
            this.g = str;
            return this;
        }

        @Override // ax.L7.F.e.a.AbstractC0124a
        public F.e.a.AbstractC0124a d(String str) {
            this.c = str;
            return this;
        }

        @Override // ax.L7.F.e.a.AbstractC0124a
        public F.e.a.AbstractC0124a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.a = str;
            return this;
        }

        @Override // ax.L7.F.e.a.AbstractC0124a
        public F.e.a.AbstractC0124a f(String str) {
            this.e = str;
            return this;
        }

        @Override // ax.L7.F.e.a.AbstractC0124a
        public F.e.a.AbstractC0124a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.b = str;
            return this;
        }
    }

    @Override // ax.L7.F.e.a
    public String b() {
        return this.f;
    }

    @Override // ax.L7.F.e.a
    public String c() {
        return this.g;
    }

    @Override // ax.L7.F.e.a
    public String d() {
        return this.c;
    }

    @Override // ax.L7.F.e.a
    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        F.e.a.b bVar;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.a) {
            F.e.a aVar = (F.e.a) obj;
            if (this.a.equals(aVar.e()) && this.b.equals(aVar.h()) && ((str = this.c) != null ? str.equals(aVar.d()) : aVar.d() == null) && ((bVar = this.d) != null ? bVar.equals(aVar.g()) : aVar.g() == null) && ((str2 = this.e) != null ? str2.equals(aVar.f()) : aVar.f() == null) && ((str3 = this.f) != null ? str3.equals(aVar.b()) : aVar.b() == null) && ((str4 = this.g) != null ? str4.equals(aVar.c()) : aVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.L7.F.e.a
    public String f() {
        return this.e;
    }

    @Override // ax.L7.F.e.a
    public F.e.a.b g() {
        return this.d;
    }

    @Override // ax.L7.F.e.a
    public String h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        F.e.a.b bVar = this.d;
        int hashCode3 = (hashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.g;
        return hashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.a + ", version=" + this.b + ", displayVersion=" + this.c + ", organization=" + this.d + ", installationUuid=" + this.e + ", developmentPlatform=" + this.f + ", developmentPlatformVersion=" + this.g + "}";
    }

    private i(String str, String str2, String str3, F.e.a.b bVar, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bVar;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }
}
