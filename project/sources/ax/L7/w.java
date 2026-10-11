package ax.L7;

import ax.L7.F;

/* loaded from: classes3.dex */
final class w extends F.e.d.AbstractC0138e {
    private final F.e.d.AbstractC0138e.b a;
    private final String b;
    private final String c;
    private final long d;

    static final class b extends F.e.d.AbstractC0138e.a {
        private F.e.d.AbstractC0138e.b a;
        private String b;
        private String c;
        private long d;
        private byte e;

        b() {
        }

        @Override // ax.L7.F.e.d.AbstractC0138e.a
        public F.e.d.AbstractC0138e a() {
            F.e.d.AbstractC0138e.b bVar;
            String str;
            String str2;
            if (this.e == 1 && (bVar = this.a) != null && (str = this.b) != null && (str2 = this.c) != null) {
                return new w(bVar, str, str2, this.d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" rolloutVariant");
            }
            if (this.b == null) {
                sb.append(" parameterKey");
            }
            if (this.c == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.e) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // ax.L7.F.e.d.AbstractC0138e.a
        public F.e.d.AbstractC0138e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.b = str;
            return this;
        }

        @Override // ax.L7.F.e.d.AbstractC0138e.a
        public F.e.d.AbstractC0138e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.c = str;
            return this;
        }

        @Override // ax.L7.F.e.d.AbstractC0138e.a
        public F.e.d.AbstractC0138e.a d(F.e.d.AbstractC0138e.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.a = bVar;
            return this;
        }

        @Override // ax.L7.F.e.d.AbstractC0138e.a
        public F.e.d.AbstractC0138e.a e(long j) {
            this.d = j;
            this.e = (byte) (this.e | 1);
            return this;
        }
    }

    @Override // ax.L7.F.e.d.AbstractC0138e
    public String b() {
        return this.b;
    }

    @Override // ax.L7.F.e.d.AbstractC0138e
    public String c() {
        return this.c;
    }

    @Override // ax.L7.F.e.d.AbstractC0138e
    public F.e.d.AbstractC0138e.b d() {
        return this.a;
    }

    @Override // ax.L7.F.e.d.AbstractC0138e
    public long e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.AbstractC0138e) {
            F.e.d.AbstractC0138e abstractC0138e = (F.e.d.AbstractC0138e) obj;
            if (this.a.equals(abstractC0138e.d()) && this.b.equals(abstractC0138e.b()) && this.c.equals(abstractC0138e.c()) && this.d == abstractC0138e.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.a + ", parameterKey=" + this.b + ", parameterValue=" + this.c + ", templateVersion=" + this.d + "}";
    }

    private w(F.e.d.AbstractC0138e.b bVar, String str, String str2, long j) {
        this.a = bVar;
        this.b = str;
        this.c = str2;
        this.d = j;
    }
}
