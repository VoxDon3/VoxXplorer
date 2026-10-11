package ax.L7;

import ax.L7.F;

/* loaded from: classes3.dex */
final class v extends F.e.d.AbstractC0137d {
    private final String a;

    static final class b extends F.e.d.AbstractC0137d.a {
        private String a;

        b() {
        }

        @Override // ax.L7.F.e.d.AbstractC0137d.a
        public F.e.d.AbstractC0137d a() {
            String str = this.a;
            if (str != null) {
                return new v(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // ax.L7.F.e.d.AbstractC0137d.a
        public F.e.d.AbstractC0137d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.a = str;
            return this;
        }
    }

    @Override // ax.L7.F.e.d.AbstractC0137d
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.AbstractC0137d) {
            return this.a.equals(((F.e.d.AbstractC0137d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.a + "}";
    }

    private v(String str) {
        this.a = str;
    }
}
