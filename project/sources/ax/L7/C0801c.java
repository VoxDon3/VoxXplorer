package ax.L7;

import ax.L7.F;
import java.util.List;

/* renamed from: ax.L7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0801c extends F.a {
    private final int a;
    private final String b;
    private final int c;
    private final int d;
    private final long e;
    private final long f;
    private final long g;
    private final String h;
    private final List<F.a.AbstractC0122a> i;

    /* renamed from: ax.L7.c$b */
    static final class b extends F.a.b {
        private int a;
        private String b;
        private int c;
        private int d;
        private long e;
        private long f;
        private long g;
        private String h;
        private List<F.a.AbstractC0122a> i;
        private byte j;

        b() {
        }

        @Override // ax.L7.F.a.b
        public F.a a() {
            String str;
            if (this.j == 63 && (str = this.b) != null) {
                return new C0801c(this.a, str, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.j & 1) == 0) {
                sb.append(" pid");
            }
            if (this.b == null) {
                sb.append(" processName");
            }
            if ((this.j & 2) == 0) {
                sb.append(" reasonCode");
            }
            if ((this.j & 4) == 0) {
                sb.append(" importance");
            }
            if ((this.j & 8) == 0) {
                sb.append(" pss");
            }
            if ((this.j & 16) == 0) {
                sb.append(" rss");
            }
            if ((this.j & 32) == 0) {
                sb.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // ax.L7.F.a.b
        public F.a.b b(List<F.a.AbstractC0122a> list) {
            this.i = list;
            return this;
        }

        @Override // ax.L7.F.a.b
        public F.a.b c(int i) {
            this.d = i;
            this.j = (byte) (this.j | 4);
            return this;
        }

        @Override // ax.L7.F.a.b
        public F.a.b d(int i) {
            this.a = i;
            this.j = (byte) (this.j | 1);
            return this;
        }

        @Override // ax.L7.F.a.b
        public F.a.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.b = str;
            return this;
        }

        @Override // ax.L7.F.a.b
        public F.a.b f(long j) {
            this.e = j;
            this.j = (byte) (this.j | 8);
            return this;
        }

        @Override // ax.L7.F.a.b
        public F.a.b g(int i) {
            this.c = i;
            this.j = (byte) (this.j | 2);
            return this;
        }

        @Override // ax.L7.F.a.b
        public F.a.b h(long j) {
            this.f = j;
            this.j = (byte) (this.j | 16);
            return this;
        }

        @Override // ax.L7.F.a.b
        public F.a.b i(long j) {
            this.g = j;
            this.j = (byte) (this.j | 32);
            return this;
        }

        @Override // ax.L7.F.a.b
        public F.a.b j(String str) {
            this.h = str;
            return this;
        }
    }

    @Override // ax.L7.F.a
    public List<F.a.AbstractC0122a> b() {
        return this.i;
    }

    @Override // ax.L7.F.a
    public int c() {
        return this.d;
    }

    @Override // ax.L7.F.a
    public int d() {
        return this.a;
    }

    @Override // ax.L7.F.a
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        List<F.a.AbstractC0122a> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.a) {
            F.a aVar = (F.a) obj;
            if (this.a == aVar.d() && this.b.equals(aVar.e()) && this.c == aVar.g() && this.d == aVar.c() && this.e == aVar.f() && this.f == aVar.h() && this.g == aVar.i() && ((str = this.h) != null ? str.equals(aVar.j()) : aVar.j() == null) && ((list = this.i) != null ? list.equals(aVar.b()) : aVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.L7.F.a
    public long f() {
        return this.e;
    }

    @Override // ax.L7.F.a
    public int g() {
        return this.c;
    }

    @Override // ax.L7.F.a
    public long h() {
        return this.f;
    }

    public int hashCode() {
        int hashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        long j = this.e;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.g;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.h;
        int hashCode2 = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<F.a.AbstractC0122a> list = this.i;
        return hashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // ax.L7.F.a
    public long i() {
        return this.g;
    }

    @Override // ax.L7.F.a
    public String j() {
        return this.h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.a + ", processName=" + this.b + ", reasonCode=" + this.c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f + ", timestamp=" + this.g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.i + "}";
    }

    private C0801c(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, List<F.a.AbstractC0122a> list) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = str2;
        this.i = list;
    }
}
