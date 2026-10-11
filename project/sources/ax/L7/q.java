package ax.L7;

import ax.L7.F;

/* loaded from: classes3.dex */
final class q extends F.e.d.a.b.AbstractC0130d {
    private final String a;
    private final String b;
    private final long c;

    static final class b extends F.e.d.a.b.AbstractC0130d.AbstractC0131a {
        private String a;
        private String b;
        private long c;
        private byte d;

        b() {
        }

        @Override // ax.L7.F.e.d.a.b.AbstractC0130d.AbstractC0131a
        public F.e.d.a.b.AbstractC0130d a() {
            String str;
            String str2;
            if (this.d == 1 && (str = this.a) != null && (str2 = this.b) != null) {
                return new q(str, str2, this.c);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" name");
            }
            if (this.b == null) {
                sb.append(" code");
            }
            if ((1 & this.d) == 0) {
                sb.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // ax.L7.F.e.d.a.b.AbstractC0130d.AbstractC0131a
        public F.e.d.a.b.AbstractC0130d.AbstractC0131a b(long j) {
            this.c = j;
            this.d = (byte) (this.d | 1);
            return this;
        }

        @Override // ax.L7.F.e.d.a.b.AbstractC0130d.AbstractC0131a
        public F.e.d.a.b.AbstractC0130d.AbstractC0131a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.b = str;
            return this;
        }

        @Override // ax.L7.F.e.d.a.b.AbstractC0130d.AbstractC0131a
        public F.e.d.a.b.AbstractC0130d.AbstractC0131a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.a = str;
            return this;
        }
    }

    @Override // ax.L7.F.e.d.a.b.AbstractC0130d
    public long b() {
        return this.c;
    }

    @Override // ax.L7.F.e.d.a.b.AbstractC0130d
    public String c() {
        return this.b;
    }

    @Override // ax.L7.F.e.d.a.b.AbstractC0130d
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.b.AbstractC0130d) {
            F.e.d.a.b.AbstractC0130d abstractC0130d = (F.e.d.a.b.AbstractC0130d) obj;
            if (this.a.equals(abstractC0130d.d()) && this.b.equals(abstractC0130d.c()) && this.c == abstractC0130d.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.a + ", code=" + this.b + ", address=" + this.c + "}";
    }

    private q(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }
}
