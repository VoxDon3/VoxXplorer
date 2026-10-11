package ax.L7;

import ax.L7.F;

/* loaded from: classes3.dex */
final class A extends F.e.f {
    private final String a;

    static final class b extends F.e.f.a {
        private String a;

        b() {
        }

        @Override // ax.L7.F.e.f.a
        public F.e.f a() {
            String str = this.a;
            if (str != null) {
                return new A(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // ax.L7.F.e.f.a
        public F.e.f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.a = str;
            return this;
        }
    }

    @Override // ax.L7.F.e.f
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.f) {
            return this.a.equals(((F.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.a + "}";
    }

    private A(String str) {
        this.a = str;
    }
}
