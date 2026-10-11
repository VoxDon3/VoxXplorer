package ax.L7;

import ax.L7.F;

/* loaded from: classes3.dex */
final class s extends F.e.d.a.b.AbstractC0132e.AbstractC0134b {
    private final long a;
    private final String b;
    private final String c;
    private final long d;
    private final int e;

    static final class b extends F.e.d.a.b.AbstractC0132e.AbstractC0134b.AbstractC0135a {
        private long a;
        private String b;
        private String c;
        private long d;
        private int e;
        private byte f;

        b() {
        }

        @Override // ax.L7.F.e.d.a.b.AbstractC0132e.AbstractC0134b.AbstractC0135a
        public F.e.d.a.b.AbstractC0132e.AbstractC0134b a() {
            String str;
            if (this.f == 7 && (str = this.b) != null) {
                return new s(this.a, str, this.c, this.d, this.e);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f & 1) == 0) {
                sb.append(" pc");
            }
            if (this.b == null) {
                sb.append(" symbol");
            }
            if ((this.f & 2) == 0) {
                sb.append(" offset");
            }
            if ((this.f & 4) == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // ax.L7.F.e.d.a.b.AbstractC0132e.AbstractC0134b.AbstractC0135a
        public F.e.d.a.b.AbstractC0132e.AbstractC0134b.AbstractC0135a b(String str) {
            this.c = str;
            return this;
        }

        @Override // ax.L7.F.e.d.a.b.AbstractC0132e.AbstractC0134b.AbstractC0135a
        public F.e.d.a.b.AbstractC0132e.AbstractC0134b.AbstractC0135a c(int i) {
            this.e = i;
            this.f = (byte) (this.f | 4);
            return this;
        }

        @Override // ax.L7.F.e.d.a.b.AbstractC0132e.AbstractC0134b.AbstractC0135a
        public F.e.d.a.b.AbstractC0132e.AbstractC0134b.AbstractC0135a d(long j) {
            this.d = j;
            this.f = (byte) (this.f | 2);
            return this;
        }

        @Override // ax.L7.F.e.d.a.b.AbstractC0132e.AbstractC0134b.AbstractC0135a
        public F.e.d.a.b.AbstractC0132e.AbstractC0134b.AbstractC0135a e(long j) {
            this.a = j;
            this.f = (byte) (this.f | 1);
            return this;
        }

        @Override // ax.L7.F.e.d.a.b.AbstractC0132e.AbstractC0134b.AbstractC0135a
        public F.e.d.a.b.AbstractC0132e.AbstractC0134b.AbstractC0135a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.b = str;
            return this;
        }
    }

    @Override // ax.L7.F.e.d.a.b.AbstractC0132e.AbstractC0134b
    public String b() {
        return this.c;
    }

    @Override // ax.L7.F.e.d.a.b.AbstractC0132e.AbstractC0134b
    public int c() {
        return this.e;
    }

    @Override // ax.L7.F.e.d.a.b.AbstractC0132e.AbstractC0134b
    public long d() {
        return this.d;
    }

    @Override // ax.L7.F.e.d.a.b.AbstractC0132e.AbstractC0134b
    public long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.b.AbstractC0132e.AbstractC0134b) {
            F.e.d.a.b.AbstractC0132e.AbstractC0134b abstractC0134b = (F.e.d.a.b.AbstractC0132e.AbstractC0134b) obj;
            if (this.a == abstractC0134b.e() && this.b.equals(abstractC0134b.f()) && ((str = this.c) != null ? str.equals(abstractC0134b.b()) : abstractC0134b.b() == null) && this.d == abstractC0134b.d() && this.e == abstractC0134b.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.L7.F.e.d.a.b.AbstractC0132e.AbstractC0134b
    public String f() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.d;
        return this.e ^ ((hashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.a + ", symbol=" + this.b + ", file=" + this.c + ", offset=" + this.d + ", importance=" + this.e + "}";
    }

    private s(long j, String str, String str2, long j2, int i) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
    }
}
