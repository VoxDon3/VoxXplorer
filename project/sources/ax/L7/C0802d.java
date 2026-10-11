package ax.L7;

import ax.L7.F;

/* renamed from: ax.L7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0802d extends F.a.AbstractC0122a {
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: ax.L7.d$b */
    static final class b extends F.a.AbstractC0122a.AbstractC0123a {
        private String a;
        private String b;
        private String c;

        b() {
        }

        @Override // ax.L7.F.a.AbstractC0122a.AbstractC0123a
        public F.a.AbstractC0122a a() {
            String str;
            String str2;
            String str3 = this.a;
            if (str3 != null && (str = this.b) != null && (str2 = this.c) != null) {
                return new C0802d(str3, str, str2);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" arch");
            }
            if (this.b == null) {
                sb.append(" libraryName");
            }
            if (this.c == null) {
                sb.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // ax.L7.F.a.AbstractC0122a.AbstractC0123a
        public F.a.AbstractC0122a.AbstractC0123a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.a = str;
            return this;
        }

        @Override // ax.L7.F.a.AbstractC0122a.AbstractC0123a
        public F.a.AbstractC0122a.AbstractC0123a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.c = str;
            return this;
        }

        @Override // ax.L7.F.a.AbstractC0122a.AbstractC0123a
        public F.a.AbstractC0122a.AbstractC0123a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.b = str;
            return this;
        }
    }

    @Override // ax.L7.F.a.AbstractC0122a
    public String b() {
        return this.a;
    }

    @Override // ax.L7.F.a.AbstractC0122a
    public String c() {
        return this.c;
    }

    @Override // ax.L7.F.a.AbstractC0122a
    public String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.a.AbstractC0122a) {
            F.a.AbstractC0122a abstractC0122a = (F.a.AbstractC0122a) obj;
            if (this.a.equals(abstractC0122a.b()) && this.b.equals(abstractC0122a.d()) && this.c.equals(abstractC0122a.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.a + ", libraryName=" + this.b + ", buildId=" + this.c + "}";
    }

    private C0802d(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
