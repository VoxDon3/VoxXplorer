package ax.db;

import ax.db.o;
import okhttp3.HttpUrl;

/* renamed from: ax.db.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1959e extends o {
    private final o.b a;
    private final long b;
    private final long c;
    private final long d;

    /* renamed from: ax.db.e$b */
    static final class b extends o.a {
        private o.b a;
        private Long b;
        private Long c;
        private Long d;

        b() {
        }

        @Override // ax.db.o.a
        public o a() {
            o.b bVar = this.a;
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
                return new C1959e(this.a, this.b.longValue(), this.c.longValue(), this.d.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ax.db.o.a
        public o.a b(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // ax.db.o.a
        o.a c(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        @Override // ax.db.o.a
        public o.a d(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        o.a e(o.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null type");
            }
            this.a = bVar;
            return this;
        }
    }

    @Override // ax.db.o
    public long b() {
        return this.d;
    }

    @Override // ax.db.o
    public long c() {
        return this.b;
    }

    @Override // ax.db.o
    public o.b d() {
        return this.a;
    }

    @Override // ax.db.o
    public long e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.a.equals(oVar.d()) && this.b == oVar.c() && this.c == oVar.e() && this.d == oVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        long j2 = ((int) (hashCode ^ (j ^ (j >>> 32)))) * 1000003;
        long j3 = this.c;
        long j4 = ((int) (j2 ^ (j3 ^ (j3 >>> 32)))) * 1000003;
        long j5 = this.d;
        return (int) (j4 ^ (j5 ^ (j5 >>> 32)));
    }

    public String toString() {
        return "MessageEvent{type=" + this.a + ", messageId=" + this.b + ", uncompressedMessageSize=" + this.c + ", compressedMessageSize=" + this.d + "}";
    }

    private C1959e(o.b bVar, long j, long j2, long j3) {
        this.a = bVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }
}
