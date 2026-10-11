package ax.L7;

import ax.L7.F;

/* loaded from: classes3.dex */
final class o extends F.e.d.a.b.AbstractC0126a {
    private final long a;
    private final long b;
    private final String c;
    private final String d;

    static final class b extends F.e.d.a.b.AbstractC0126a.AbstractC0127a {
        private long a;
        private long b;
        private String c;
        private String d;
        private byte e;

        b() {
        }

        @Override // ax.L7.F.e.d.a.b.AbstractC0126a.AbstractC0127a
        public F.e.d.a.b.AbstractC0126a a() {
            String str;
            if (this.e == 3 && (str = this.c) != null) {
                return new o(this.a, this.b, str, this.d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.e & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((this.e & 2) == 0) {
                sb.append(" size");
            }
            if (this.c == null) {
                sb.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // ax.L7.F.e.d.a.b.AbstractC0126a.AbstractC0127a
        public F.e.d.a.b.AbstractC0126a.AbstractC0127a b(long j) {
            this.a = j;
            this.e = (byte) (this.e | 1);
            return this;
        }

        @Override // ax.L7.F.e.d.a.b.AbstractC0126a.AbstractC0127a
        public F.e.d.a.b.AbstractC0126a.AbstractC0127a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.c = str;
            return this;
        }

        @Override // ax.L7.F.e.d.a.b.AbstractC0126a.AbstractC0127a
        public F.e.d.a.b.AbstractC0126a.AbstractC0127a d(long j) {
            this.b = j;
            this.e = (byte) (this.e | 2);
            return this;
        }

        @Override // ax.L7.F.e.d.a.b.AbstractC0126a.AbstractC0127a
        public F.e.d.a.b.AbstractC0126a.AbstractC0127a e(String str) {
            this.d = str;
            return this;
        }
    }

    @Override // ax.L7.F.e.d.a.b.AbstractC0126a
    public long b() {
        return this.a;
    }

    @Override // ax.L7.F.e.d.a.b.AbstractC0126a
    public String c() {
        return this.c;
    }

    @Override // ax.L7.F.e.d.a.b.AbstractC0126a
    public long d() {
        return this.b;
    }

    @Override // ax.L7.F.e.d.a.b.AbstractC0126a
    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.b.AbstractC0126a) {
            F.e.d.a.b.AbstractC0126a abstractC0126a = (F.e.d.a.b.AbstractC0126a) obj;
            if (this.a == abstractC0126a.b() && this.b == abstractC0126a.d() && this.c.equals(abstractC0126a.c()) && ((str = this.d) != null ? str.equals(abstractC0126a.e()) : abstractC0126a.e() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.a + ", size=" + this.b + ", name=" + this.c + ", uuid=" + this.d + "}";
    }

    private o(long j, long j2, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }
}
