package ax.L7;

import ax.L7.F;

/* renamed from: ax.L7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0803e extends F.c {
    private final String a;
    private final String b;

    /* renamed from: ax.L7.e$b */
    static final class b extends F.c.a {
        private String a;
        private String b;

        b() {
        }

        @Override // ax.L7.F.c.a
        public F.c a() {
            String str;
            String str2 = this.a;
            if (str2 != null && (str = this.b) != null) {
                return new C0803e(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" key");
            }
            if (this.b == null) {
                sb.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // ax.L7.F.c.a
        public F.c.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.a = str;
            return this;
        }

        @Override // ax.L7.F.c.a
        public F.c.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.b = str;
            return this;
        }
    }

    @Override // ax.L7.F.c
    public String b() {
        return this.a;
    }

    @Override // ax.L7.F.c
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.c) {
            F.c cVar = (F.c) obj;
            if (this.a.equals(cVar.b()) && this.b.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.a + ", value=" + this.b + "}";
    }

    private C0803e(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
