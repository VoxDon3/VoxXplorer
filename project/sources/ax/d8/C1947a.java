package ax.d8;

import ax.d8.C1949c;
import ax.d8.d;
import okhttp3.HttpUrl;

/* renamed from: ax.d8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1947a extends d {
    private final String b;
    private final C1949c.a c;
    private final String d;
    private final String e;
    private final long f;
    private final long g;
    private final String h;

    /* renamed from: ax.d8.a$b */
    static final class b extends d.a {
        private String a;
        private C1949c.a b;
        private String c;
        private String d;
        private Long e;
        private Long f;
        private String g;

        @Override // ax.d8.d.a
        public d a() {
            C1949c.a aVar = this.b;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (aVar == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " registrationStatus";
            }
            if (this.e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C1947a(this.a, this.b, this.c, this.d, this.e.longValue(), this.f.longValue(), this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ax.d8.d.a
        public d.a b(String str) {
            this.c = str;
            return this;
        }

        @Override // ax.d8.d.a
        public d.a c(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        @Override // ax.d8.d.a
        public d.a d(String str) {
            this.a = str;
            return this;
        }

        @Override // ax.d8.d.a
        public d.a e(String str) {
            this.g = str;
            return this;
        }

        @Override // ax.d8.d.a
        public d.a f(String str) {
            this.d = str;
            return this;
        }

        @Override // ax.d8.d.a
        public d.a g(C1949c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.b = aVar;
            return this;
        }

        @Override // ax.d8.d.a
        public d.a h(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        b() {
        }

        private b(d dVar) {
            this.a = dVar.d();
            this.b = dVar.g();
            this.c = dVar.b();
            this.d = dVar.f();
            this.e = Long.valueOf(dVar.c());
            this.f = Long.valueOf(dVar.h());
            this.g = dVar.e();
        }
    }

    @Override // ax.d8.d
    public String b() {
        return this.d;
    }

    @Override // ax.d8.d
    public long c() {
        return this.f;
    }

    @Override // ax.d8.d
    public String d() {
        return this.b;
    }

    @Override // ax.d8.d
    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str4 = this.b;
            if (str4 != null ? str4.equals(dVar.d()) : dVar.d() == null) {
                if (this.c.equals(dVar.g()) && ((str = this.d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f == dVar.c() && this.g == dVar.h() && ((str3 = this.h) != null ? str3.equals(dVar.e()) : dVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ax.d8.d
    public String f() {
        return this.e;
    }

    @Override // ax.d8.d
    public C1949c.a g() {
        return this.c;
    }

    @Override // ax.d8.d
    public long h() {
        return this.g;
    }

    public int hashCode() {
        String str = this.b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str2 = this.d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f;
        int i = (hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.g;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.h;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // ax.d8.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.b + ", registrationStatus=" + this.c + ", authToken=" + this.d + ", refreshToken=" + this.e + ", expiresInSecs=" + this.f + ", tokenCreationEpochInSecs=" + this.g + ", fisError=" + this.h + "}";
    }

    private C1947a(String str, C1949c.a aVar, String str2, String str3, long j, long j2, String str4) {
        this.b = str;
        this.c = aVar;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = j2;
        this.h = str4;
    }
}
