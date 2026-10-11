package ax.o5;

import ax.o5.t;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
final class j extends t {
    private final long a;
    private final Integer b;
    private final p c;
    private final long d;
    private final byte[] e;
    private final String f;
    private final long g;
    private final w h;
    private final q i;

    static final class b extends t.a {
        private Long a;
        private Integer b;
        private p c;
        private Long d;
        private byte[] e;
        private String f;
        private Long g;
        private w h;
        private q i;

        b() {
        }

        @Override // ax.o5.t.a
        public t a() {
            Long l = this.a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (l == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " eventTimeMs";
            }
            if (this.d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new j(this.a.longValue(), this.b, this.c, this.d.longValue(), this.e, this.f, this.g.longValue(), this.h, this.i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ax.o5.t.a
        public t.a b(p pVar) {
            this.c = pVar;
            return this;
        }

        @Override // ax.o5.t.a
        public t.a c(Integer num) {
            this.b = num;
            return this;
        }

        @Override // ax.o5.t.a
        public t.a d(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // ax.o5.t.a
        public t.a e(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // ax.o5.t.a
        public t.a f(q qVar) {
            this.i = qVar;
            return this;
        }

        @Override // ax.o5.t.a
        public t.a g(w wVar) {
            this.h = wVar;
            return this;
        }

        @Override // ax.o5.t.a
        t.a h(byte[] bArr) {
            this.e = bArr;
            return this;
        }

        @Override // ax.o5.t.a
        t.a i(String str) {
            this.f = str;
            return this;
        }

        @Override // ax.o5.t.a
        public t.a j(long j) {
            this.g = Long.valueOf(j);
            return this;
        }
    }

    @Override // ax.o5.t
    public p b() {
        return this.c;
    }

    @Override // ax.o5.t
    public Integer c() {
        return this.b;
    }

    @Override // ax.o5.t
    public long d() {
        return this.a;
    }

    @Override // ax.o5.t
    public long e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        Integer num;
        p pVar;
        String str;
        w wVar;
        q qVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.a == tVar.d() && ((num = this.b) != null ? num.equals(tVar.c()) : tVar.c() == null) && ((pVar = this.c) != null ? pVar.equals(tVar.b()) : tVar.b() == null) && this.d == tVar.e()) {
                if (Arrays.equals(this.e, tVar instanceof j ? ((j) tVar).e : tVar.h()) && ((str = this.f) != null ? str.equals(tVar.i()) : tVar.i() == null) && this.g == tVar.j() && ((wVar = this.h) != null ? wVar.equals(tVar.g()) : tVar.g() == null) && ((qVar = this.i) != null ? qVar.equals(tVar.f()) : tVar.f() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ax.o5.t
    public q f() {
        return this.i;
    }

    @Override // ax.o5.t
    public w g() {
        return this.h;
    }

    @Override // ax.o5.t
    public byte[] h() {
        return this.e;
    }

    public int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        p pVar = this.c;
        int hashCode2 = pVar == null ? 0 : pVar.hashCode();
        long j2 = this.d;
        int hashCode3 = (((((hashCode ^ hashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int hashCode4 = str == null ? 0 : str.hashCode();
        long j3 = this.g;
        int i2 = (((hashCode3 ^ hashCode4) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        w wVar = this.h;
        int hashCode5 = (i2 ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        q qVar = this.i;
        return hashCode5 ^ (qVar != null ? qVar.hashCode() : 0);
    }

    @Override // ax.o5.t
    public String i() {
        return this.f;
    }

    @Override // ax.o5.t
    public long j() {
        return this.g;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }

    private j(long j, Integer num, p pVar, long j2, byte[] bArr, String str, long j3, w wVar, q qVar) {
        this.a = j;
        this.b = num;
        this.c = pVar;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = wVar;
        this.i = qVar;
    }
}
