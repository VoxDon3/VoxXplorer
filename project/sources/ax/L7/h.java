package ax.L7;

import ax.L7.F;
import java.util.List;

/* loaded from: classes3.dex */
final class h extends F.e {
    private final String a;
    private final String b;
    private final String c;
    private final long d;
    private final Long e;
    private final boolean f;
    private final F.e.a g;
    private final F.e.f h;
    private final F.e.AbstractC0139e i;
    private final F.e.c j;
    private final List<F.e.d> k;
    private final int l;

    static final class b extends F.e.b {
        private String a;
        private String b;
        private String c;
        private long d;
        private Long e;
        private boolean f;
        private F.e.a g;
        private F.e.f h;
        private F.e.AbstractC0139e i;
        private F.e.c j;
        private List<F.e.d> k;
        private int l;
        private byte m;

        @Override // ax.L7.F.e.b
        public F.e a() {
            String str;
            String str2;
            F.e.a aVar;
            if (this.m == 7 && (str = this.a) != null && (str2 = this.b) != null && (aVar = this.g) != null) {
                return new h(str, str2, this.c, this.d, this.e, this.f, aVar, this.h, this.i, this.j, this.k, this.l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" generator");
            }
            if (this.b == null) {
                sb.append(" identifier");
            }
            if ((this.m & 1) == 0) {
                sb.append(" startedAt");
            }
            if ((this.m & 2) == 0) {
                sb.append(" crashed");
            }
            if (this.g == null) {
                sb.append(" app");
            }
            if ((this.m & 4) == 0) {
                sb.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // ax.L7.F.e.b
        public F.e.b b(F.e.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.g = aVar;
            return this;
        }

        @Override // ax.L7.F.e.b
        public F.e.b c(String str) {
            this.c = str;
            return this;
        }

        @Override // ax.L7.F.e.b
        public F.e.b d(boolean z) {
            this.f = z;
            this.m = (byte) (this.m | 2);
            return this;
        }

        @Override // ax.L7.F.e.b
        public F.e.b e(F.e.c cVar) {
            this.j = cVar;
            return this;
        }

        @Override // ax.L7.F.e.b
        public F.e.b f(Long l) {
            this.e = l;
            return this;
        }

        @Override // ax.L7.F.e.b
        public F.e.b g(List<F.e.d> list) {
            this.k = list;
            return this;
        }

        @Override // ax.L7.F.e.b
        public F.e.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.a = str;
            return this;
        }

        @Override // ax.L7.F.e.b
        public F.e.b i(int i) {
            this.l = i;
            this.m = (byte) (this.m | 4);
            return this;
        }

        @Override // ax.L7.F.e.b
        public F.e.b j(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.b = str;
            return this;
        }

        @Override // ax.L7.F.e.b
        public F.e.b l(F.e.AbstractC0139e abstractC0139e) {
            this.i = abstractC0139e;
            return this;
        }

        @Override // ax.L7.F.e.b
        public F.e.b m(long j) {
            this.d = j;
            this.m = (byte) (this.m | 1);
            return this;
        }

        @Override // ax.L7.F.e.b
        public F.e.b n(F.e.f fVar) {
            this.h = fVar;
            return this;
        }

        b() {
        }

        private b(F.e eVar) {
            this.a = eVar.g();
            this.b = eVar.i();
            this.c = eVar.c();
            this.d = eVar.l();
            this.e = eVar.e();
            this.f = eVar.n();
            this.g = eVar.b();
            this.h = eVar.m();
            this.i = eVar.k();
            this.j = eVar.d();
            this.k = eVar.f();
            this.l = eVar.h();
            this.m = (byte) 7;
        }
    }

    @Override // ax.L7.F.e
    public F.e.a b() {
        return this.g;
    }

    @Override // ax.L7.F.e
    public String c() {
        return this.c;
    }

    @Override // ax.L7.F.e
    public F.e.c d() {
        return this.j;
    }

    @Override // ax.L7.F.e
    public Long e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l;
        F.e.f fVar;
        F.e.AbstractC0139e abstractC0139e;
        F.e.c cVar;
        List<F.e.d> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e) {
            F.e eVar = (F.e) obj;
            if (this.a.equals(eVar.g()) && this.b.equals(eVar.i()) && ((str = this.c) != null ? str.equals(eVar.c()) : eVar.c() == null) && this.d == eVar.l() && ((l = this.e) != null ? l.equals(eVar.e()) : eVar.e() == null) && this.f == eVar.n() && this.g.equals(eVar.b()) && ((fVar = this.h) != null ? fVar.equals(eVar.m()) : eVar.m() == null) && ((abstractC0139e = this.i) != null ? abstractC0139e.equals(eVar.k()) : eVar.k() == null) && ((cVar = this.j) != null ? cVar.equals(eVar.d()) : eVar.d() == null) && ((list = this.k) != null ? list.equals(eVar.f()) : eVar.f() == null) && this.l == eVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.L7.F.e
    public List<F.e.d> f() {
        return this.k;
    }

    @Override // ax.L7.F.e
    public String g() {
        return this.a;
    }

    @Override // ax.L7.F.e
    public int h() {
        return this.l;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j = this.d;
        int i = (((hashCode ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.e;
        int hashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        F.e.f fVar = this.h;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        F.e.AbstractC0139e abstractC0139e = this.i;
        int hashCode5 = (hashCode4 ^ (abstractC0139e == null ? 0 : abstractC0139e.hashCode())) * 1000003;
        F.e.c cVar = this.j;
        int hashCode6 = (hashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<F.e.d> list = this.k;
        return ((hashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.l;
    }

    @Override // ax.L7.F.e
    public String i() {
        return this.b;
    }

    @Override // ax.L7.F.e
    public F.e.AbstractC0139e k() {
        return this.i;
    }

    @Override // ax.L7.F.e
    public long l() {
        return this.d;
    }

    @Override // ax.L7.F.e
    public F.e.f m() {
        return this.h;
    }

    @Override // ax.L7.F.e
    public boolean n() {
        return this.f;
    }

    @Override // ax.L7.F.e
    public F.e.b o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.a + ", identifier=" + this.b + ", appQualitySessionId=" + this.c + ", startedAt=" + this.d + ", endedAt=" + this.e + ", crashed=" + this.f + ", app=" + this.g + ", user=" + this.h + ", os=" + this.i + ", device=" + this.j + ", events=" + this.k + ", generatorType=" + this.l + "}";
    }

    private h(String str, String str2, String str3, long j, Long l, boolean z, F.e.a aVar, F.e.f fVar, F.e.AbstractC0139e abstractC0139e, F.e.c cVar, List<F.e.d> list, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = aVar;
        this.h = fVar;
        this.i = abstractC0139e;
        this.j = cVar;
        this.k = list;
        this.l = i;
    }
}
