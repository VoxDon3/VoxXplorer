package ax.L7;

import ax.L7.F;

/* loaded from: classes3.dex */
final class l extends F.e.d {
    private final long a;
    private final String b;
    private final F.e.d.a c;
    private final F.e.d.c d;
    private final F.e.d.AbstractC0137d e;
    private final F.e.d.f f;

    static final class b extends F.e.d.b {
        private long a;
        private String b;
        private F.e.d.a c;
        private F.e.d.c d;
        private F.e.d.AbstractC0137d e;
        private F.e.d.f f;
        private byte g;

        @Override // ax.L7.F.e.d.b
        public F.e.d a() {
            String str;
            F.e.d.a aVar;
            F.e.d.c cVar;
            if (this.g == 1 && (str = this.b) != null && (aVar = this.c) != null && (cVar = this.d) != null) {
                return new l(this.a, str, aVar, cVar, this.e, this.f);
            }
            StringBuilder sb = new StringBuilder();
            if ((1 & this.g) == 0) {
                sb.append(" timestamp");
            }
            if (this.b == null) {
                sb.append(" type");
            }
            if (this.c == null) {
                sb.append(" app");
            }
            if (this.d == null) {
                sb.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // ax.L7.F.e.d.b
        public F.e.d.b b(F.e.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.c = aVar;
            return this;
        }

        @Override // ax.L7.F.e.d.b
        public F.e.d.b c(F.e.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.d = cVar;
            return this;
        }

        @Override // ax.L7.F.e.d.b
        public F.e.d.b d(F.e.d.AbstractC0137d abstractC0137d) {
            this.e = abstractC0137d;
            return this;
        }

        @Override // ax.L7.F.e.d.b
        public F.e.d.b e(F.e.d.f fVar) {
            this.f = fVar;
            return this;
        }

        @Override // ax.L7.F.e.d.b
        public F.e.d.b f(long j) {
            this.a = j;
            this.g = (byte) (this.g | 1);
            return this;
        }

        @Override // ax.L7.F.e.d.b
        public F.e.d.b g(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.b = str;
            return this;
        }

        b() {
        }

        private b(F.e.d dVar) {
            this.a = dVar.f();
            this.b = dVar.g();
            this.c = dVar.b();
            this.d = dVar.c();
            this.e = dVar.d();
            this.f = dVar.e();
            this.g = (byte) 1;
        }
    }

    @Override // ax.L7.F.e.d
    public F.e.d.a b() {
        return this.c;
    }

    @Override // ax.L7.F.e.d
    public F.e.d.c c() {
        return this.d;
    }

    @Override // ax.L7.F.e.d
    public F.e.d.AbstractC0137d d() {
        return this.e;
    }

    @Override // ax.L7.F.e.d
    public F.e.d.f e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        F.e.d.AbstractC0137d abstractC0137d;
        F.e.d.f fVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d) {
            F.e.d dVar = (F.e.d) obj;
            if (this.a == dVar.f() && this.b.equals(dVar.g()) && this.c.equals(dVar.b()) && this.d.equals(dVar.c()) && ((abstractC0137d = this.e) != null ? abstractC0137d.equals(dVar.d()) : dVar.d() == null) && ((fVar = this.f) != null ? fVar.equals(dVar.e()) : dVar.e() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.L7.F.e.d
    public long f() {
        return this.a;
    }

    @Override // ax.L7.F.e.d
    public String g() {
        return this.b;
    }

    @Override // ax.L7.F.e.d
    public F.e.d.b h() {
        return new b(this);
    }

    public int hashCode() {
        long j = this.a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        F.e.d.AbstractC0137d abstractC0137d = this.e;
        int hashCode2 = (hashCode ^ (abstractC0137d == null ? 0 : abstractC0137d.hashCode())) * 1000003;
        F.e.d.f fVar = this.f;
        return hashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }

    private l(long j, String str, F.e.d.a aVar, F.e.d.c cVar, F.e.d.AbstractC0137d abstractC0137d, F.e.d.f fVar) {
        this.a = j;
        this.b = str;
        this.c = aVar;
        this.d = cVar;
        this.e = abstractC0137d;
        this.f = fVar;
    }
}
