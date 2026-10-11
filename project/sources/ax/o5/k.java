package ax.o5;

import ax.o5.u;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
final class k extends u {
    private final long a;
    private final long b;
    private final o c;
    private final Integer d;
    private final String e;
    private final List<t> f;
    private final x g;

    static final class b extends u.a {
        private Long a;
        private Long b;
        private o c;
        private Integer d;
        private String e;
        private List<t> f;
        private x g;

        b() {
        }

        @Override // ax.o5.u.a
        public u a() {
            Long l = this.a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (l == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " requestTimeMs";
            }
            if (this.b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new k(this.a.longValue(), this.b.longValue(), this.c, this.d, this.e, this.f, this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ax.o5.u.a
        public u.a b(o oVar) {
            this.c = oVar;
            return this;
        }

        @Override // ax.o5.u.a
        public u.a c(List<t> list) {
            this.f = list;
            return this;
        }

        @Override // ax.o5.u.a
        u.a d(Integer num) {
            this.d = num;
            return this;
        }

        @Override // ax.o5.u.a
        u.a e(String str) {
            this.e = str;
            return this;
        }

        @Override // ax.o5.u.a
        public u.a f(x xVar) {
            this.g = xVar;
            return this;
        }

        @Override // ax.o5.u.a
        public u.a g(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // ax.o5.u.a
        public u.a h(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    @Override // ax.o5.u
    public o b() {
        return this.c;
    }

    @Override // ax.o5.u
    public List<t> c() {
        return this.f;
    }

    @Override // ax.o5.u
    public Integer d() {
        return this.d;
    }

    @Override // ax.o5.u
    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        o oVar;
        Integer num;
        String str;
        List<t> list;
        x xVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.a == uVar.g() && this.b == uVar.h() && ((oVar = this.c) != null ? oVar.equals(uVar.b()) : uVar.b() == null) && ((num = this.d) != null ? num.equals(uVar.d()) : uVar.d() == null) && ((str = this.e) != null ? str.equals(uVar.e()) : uVar.e() == null) && ((list = this.f) != null ? list.equals(uVar.c()) : uVar.c() == null) && ((xVar = this.g) != null ? xVar.equals(uVar.f()) : uVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.o5.u
    public x f() {
        return this.g;
    }

    @Override // ax.o5.u
    public long g() {
        return this.a;
    }

    @Override // ax.o5.u
    public long h() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        o oVar = this.c;
        int hashCode = (i ^ (oVar == null ? 0 : oVar.hashCode())) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<t> list = this.f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        x xVar = this.g;
        return hashCode4 ^ (xVar != null ? xVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }

    private k(long j, long j2, o oVar, Integer num, String str, List<t> list, x xVar) {
        this.a = j;
        this.b = j2;
        this.c = oVar;
        this.d = num;
        this.e = str;
        this.f = list;
        this.g = xVar;
    }
}
