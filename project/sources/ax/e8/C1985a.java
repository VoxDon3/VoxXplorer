package ax.e8;

import ax.e8.AbstractC1988d;

/* renamed from: ax.e8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1985a extends AbstractC1988d {
    private final String a;
    private final String b;
    private final String c;
    private final AbstractC1990f d;
    private final AbstractC1988d.b e;

    /* renamed from: ax.e8.a$b */
    static final class b extends AbstractC1988d.a {
        private String a;
        private String b;
        private String c;
        private AbstractC1990f d;
        private AbstractC1988d.b e;

        b() {
        }

        @Override // ax.e8.AbstractC1988d.a
        public AbstractC1988d a() {
            return new C1985a(this.a, this.b, this.c, this.d, this.e);
        }

        @Override // ax.e8.AbstractC1988d.a
        public AbstractC1988d.a b(AbstractC1990f abstractC1990f) {
            this.d = abstractC1990f;
            return this;
        }

        @Override // ax.e8.AbstractC1988d.a
        public AbstractC1988d.a c(String str) {
            this.b = str;
            return this;
        }

        @Override // ax.e8.AbstractC1988d.a
        public AbstractC1988d.a d(String str) {
            this.c = str;
            return this;
        }

        @Override // ax.e8.AbstractC1988d.a
        public AbstractC1988d.a e(AbstractC1988d.b bVar) {
            this.e = bVar;
            return this;
        }

        @Override // ax.e8.AbstractC1988d.a
        public AbstractC1988d.a f(String str) {
            this.a = str;
            return this;
        }
    }

    @Override // ax.e8.AbstractC1988d
    public AbstractC1990f b() {
        return this.d;
    }

    @Override // ax.e8.AbstractC1988d
    public String c() {
        return this.b;
    }

    @Override // ax.e8.AbstractC1988d
    public String d() {
        return this.c;
    }

    @Override // ax.e8.AbstractC1988d
    public AbstractC1988d.b e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1988d) {
            AbstractC1988d abstractC1988d = (AbstractC1988d) obj;
            String str = this.a;
            if (str != null ? str.equals(abstractC1988d.f()) : abstractC1988d.f() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(abstractC1988d.c()) : abstractC1988d.c() == null) {
                    String str3 = this.c;
                    if (str3 != null ? str3.equals(abstractC1988d.d()) : abstractC1988d.d() == null) {
                        AbstractC1990f abstractC1990f = this.d;
                        if (abstractC1990f != null ? abstractC1990f.equals(abstractC1988d.b()) : abstractC1988d.b() == null) {
                            AbstractC1988d.b bVar = this.e;
                            if (bVar != null ? bVar.equals(abstractC1988d.e()) : abstractC1988d.e() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // ax.e8.AbstractC1988d
    public String f() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        AbstractC1990f abstractC1990f = this.d;
        int hashCode4 = (hashCode3 ^ (abstractC1990f == null ? 0 : abstractC1990f.hashCode())) * 1000003;
        AbstractC1988d.b bVar = this.e;
        return hashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.b + ", refreshToken=" + this.c + ", authToken=" + this.d + ", responseCode=" + this.e + "}";
    }

    private C1985a(String str, String str2, String str3, AbstractC1990f abstractC1990f, AbstractC1988d.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = abstractC1990f;
        this.e = bVar;
    }
}
