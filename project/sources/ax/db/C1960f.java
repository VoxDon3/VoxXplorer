package ax.db;

import ax.ab.AbstractC1435b;
import ax.db.p;
import okhttp3.HttpUrl;

@Deprecated
/* renamed from: ax.db.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1960f extends p {
    private final p.b a;
    private final long b;
    private final long c;
    private final long d;

    /* renamed from: ax.db.f$b */
    static final class b extends p.a {
        private p.b a;
        private Long b;
        private Long c;
        private Long d;

        b() {
        }

        @Override // ax.db.p.a
        public p a() {
            p.b bVar = this.a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (bVar == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " type";
            }
            if (this.b == null) {
                str = str + " messageId";
            }
            if (this.c == null) {
                str = str + " uncompressedMessageSize";
            }
            if (this.d == null) {
                str = str + " compressedMessageSize";
            }
            if (str.isEmpty()) {
                return new C1960f(null, this.a, this.b.longValue(), this.c.longValue(), this.d.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ax.db.p.a
        public p.a b(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // ax.db.p.a
        p.a c(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        @Override // ax.db.p.a
        public p.a d(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        p.a e(p.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null type");
            }
            this.a = bVar;
            return this;
        }
    }

    @Override // ax.db.p
    public long b() {
        return this.d;
    }

    @Override // ax.db.p
    public AbstractC1435b c() {
        return null;
    }

    @Override // ax.db.p
    public long d() {
        return this.b;
    }

    @Override // ax.db.p
    public p.b e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            pVar.c();
            if (this.a.equals(pVar.e()) && this.b == pVar.d() && this.c == pVar.f() && this.d == pVar.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.db.p
    public long f() {
        return this.c;
    }

    public int hashCode() {
        long hashCode = ((1000003 * 1000003) ^ this.a.hashCode()) * 1000003;
        long j = this.b;
        long j2 = ((int) (hashCode ^ (j ^ (j >>> 32)))) * 1000003;
        long j3 = this.c;
        long j4 = ((int) (j2 ^ (j3 ^ (j3 >>> 32)))) * 1000003;
        long j5 = this.d;
        return (int) (j4 ^ (j5 ^ (j5 >>> 32)));
    }

    public String toString() {
        return "NetworkEvent{kernelTimestamp=" + ((Object) null) + ", type=" + this.a + ", messageId=" + this.b + ", uncompressedMessageSize=" + this.c + ", compressedMessageSize=" + this.d + "}";
    }

    private C1960f(AbstractC1435b abstractC1435b, p.b bVar, long j, long j2, long j3) {
        this.a = bVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }
}
