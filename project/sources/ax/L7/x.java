package ax.L7;

import ax.L7.F;

/* loaded from: classes3.dex */
final class x extends F.e.d.AbstractC0138e.b {
    private final String a;
    private final String b;

    static final class b extends F.e.d.AbstractC0138e.b.a {
        private String a;
        private String b;

        b() {
        }

        @Override // ax.L7.F.e.d.AbstractC0138e.b.a
        public F.e.d.AbstractC0138e.b a() {
            String str;
            String str2 = this.a;
            if (str2 != null && (str = this.b) != null) {
                return new x(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" rolloutId");
            }
            if (this.b == null) {
                sb.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // ax.L7.F.e.d.AbstractC0138e.b.a
        public F.e.d.AbstractC0138e.b.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.a = str;
            return this;
        }

        @Override // ax.L7.F.e.d.AbstractC0138e.b.a
        public F.e.d.AbstractC0138e.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.b = str;
            return this;
        }
    }

    @Override // ax.L7.F.e.d.AbstractC0138e.b
    public String b() {
        return this.a;
    }

    @Override // ax.L7.F.e.d.AbstractC0138e.b
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.AbstractC0138e.b) {
            F.e.d.AbstractC0138e.b bVar = (F.e.d.AbstractC0138e.b) obj;
            if (this.a.equals(bVar.b()) && this.b.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.a + ", variantId=" + this.b + "}";
    }

    private x(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
