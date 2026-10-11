package ax.p5;

import ax.p5.i;
import java.util.Arrays;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
final class b extends i {
    private final String a;
    private final Integer b;
    private final h c;
    private final long d;
    private final long e;
    private final Map<String, String> f;
    private final Integer g;
    private final String h;
    private final byte[] i;
    private final byte[] j;

    /* renamed from: ax.p5.b$b, reason: collision with other inner class name */
    static final class C0417b extends i.a {
        private String a;
        private Integer b;
        private h c;
        private Long d;
        private Long e;
        private Map<String, String> f;
        private Integer g;
        private String h;
        private byte[] i;
        private byte[] j;

        C0417b() {
        }

        @Override // ax.p5.i.a
        public i d() {
            String str = this.a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET + " transportName";
            }
            if (this.c == null) {
                str2 = str2 + " encodedPayload";
            }
            if (this.d == null) {
                str2 = str2 + " eventMillis";
            }
            if (this.e == null) {
                str2 = str2 + " uptimeMillis";
            }
            if (this.f == null) {
                str2 = str2 + " autoMetadata";
            }
            if (str2.isEmpty()) {
                return new b(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f, this.g, this.h, this.i, this.j);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // ax.p5.i.a
        protected Map<String, String> e() {
            Map<String, String> map = this.f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // ax.p5.i.a
        protected i.a f(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f = map;
            return this;
        }

        @Override // ax.p5.i.a
        public i.a g(Integer num) {
            this.b = num;
            return this;
        }

        @Override // ax.p5.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.c = hVar;
            return this;
        }

        @Override // ax.p5.i.a
        public i.a i(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // ax.p5.i.a
        public i.a j(byte[] bArr) {
            this.i = bArr;
            return this;
        }

        @Override // ax.p5.i.a
        public i.a k(byte[] bArr) {
            this.j = bArr;
            return this;
        }

        @Override // ax.p5.i.a
        public i.a l(Integer num) {
            this.g = num;
            return this;
        }

        @Override // ax.p5.i.a
        public i.a m(String str) {
            this.h = str;
            return this;
        }

        @Override // ax.p5.i.a
        public i.a n(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.a = str;
            return this;
        }

        @Override // ax.p5.i.a
        public i.a o(long j) {
            this.e = Long.valueOf(j);
            return this;
        }
    }

    @Override // ax.p5.i
    protected Map<String, String> c() {
        return this.f;
    }

    @Override // ax.p5.i
    public Integer d() {
        return this.b;
    }

    @Override // ax.p5.i
    public h e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.a.equals(iVar.n()) && ((num = this.b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.c.equals(iVar.e()) && this.d == iVar.f() && this.e == iVar.o() && this.f.equals(iVar.c()) && ((num2 = this.g) != null ? num2.equals(iVar.l()) : iVar.l() == null) && ((str = this.h) != null ? str.equals(iVar.m()) : iVar.m() == null)) {
                boolean z = iVar instanceof b;
                if (Arrays.equals(this.i, z ? ((b) iVar).i : iVar.g())) {
                    if (Arrays.equals(this.j, z ? ((b) iVar).j : iVar.h())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // ax.p5.i
    public long f() {
        return this.d;
    }

    @Override // ax.p5.i
    public byte[] g() {
        return this.i;
    }

    @Override // ax.p5.i
    public byte[] h() {
        return this.j;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        int hashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.g;
        int hashCode4 = (hashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.h;
        return ((((hashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003) ^ Arrays.hashCode(this.j);
    }

    @Override // ax.p5.i
    public Integer l() {
        return this.g;
    }

    @Override // ax.p5.i
    public String m() {
        return this.h;
    }

    @Override // ax.p5.i
    public String n() {
        return this.a;
    }

    @Override // ax.p5.i
    public long o() {
        return this.e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + ", productId=" + this.g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }

    private b(String str, Integer num, h hVar, long j, long j2, Map<String, String> map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.a = str;
        this.b = num;
        this.c = hVar;
        this.d = j;
        this.e = j2;
        this.f = map;
        this.g = num2;
        this.h = str2;
        this.i = bArr;
        this.j = bArr2;
    }
}
