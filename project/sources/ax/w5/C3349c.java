package ax.w5;

import ax.w5.AbstractC3352f;
import java.util.Set;
import okhttp3.HttpUrl;

/* renamed from: ax.w5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3349c extends AbstractC3352f.b {
    private final long a;
    private final long b;
    private final Set<AbstractC3352f.c> c;

    /* renamed from: ax.w5.c$b */
    static final class b extends AbstractC3352f.b.a {
        private Long a;
        private Long b;
        private Set<AbstractC3352f.c> c;

        b() {
        }

        @Override // ax.w5.AbstractC3352f.b.a
        public AbstractC3352f.b a() {
            Long l = this.a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (l == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " delta";
            }
            if (this.b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C3349c(this.a.longValue(), this.b.longValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ax.w5.AbstractC3352f.b.a
        public AbstractC3352f.b.a b(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // ax.w5.AbstractC3352f.b.a
        public AbstractC3352f.b.a c(Set<AbstractC3352f.c> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.c = set;
            return this;
        }

        @Override // ax.w5.AbstractC3352f.b.a
        public AbstractC3352f.b.a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    @Override // ax.w5.AbstractC3352f.b
    long b() {
        return this.a;
    }

    @Override // ax.w5.AbstractC3352f.b
    Set<AbstractC3352f.c> c() {
        return this.c;
    }

    @Override // ax.w5.AbstractC3352f.b
    long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3352f.b) {
            AbstractC3352f.b bVar = (AbstractC3352f.b) obj;
            if (this.a == bVar.b() && this.b == bVar.d() && this.c.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return this.c.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }

    private C3349c(long j, long j2, Set<AbstractC3352f.c> set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }
}
