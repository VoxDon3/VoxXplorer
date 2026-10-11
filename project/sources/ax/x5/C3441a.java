package ax.x5;

import ax.x5.AbstractC3445e;
import okhttp3.HttpUrl;

/* renamed from: ax.x5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3441a extends AbstractC3445e {
    private final long b;
    private final int c;
    private final int d;
    private final long e;
    private final int f;

    /* renamed from: ax.x5.a$b */
    static final class b extends AbstractC3445e.a {
        private Long a;
        private Integer b;
        private Integer c;
        private Long d;
        private Integer e;

        b() {
        }

        @Override // ax.x5.AbstractC3445e.a
        AbstractC3445e a() {
            Long l = this.a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (l == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " maxStorageSizeInBytes";
            }
            if (this.b == null) {
                str = str + " loadBatchSize";
            }
            if (this.c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C3441a(this.a.longValue(), this.b.intValue(), this.c.intValue(), this.d.longValue(), this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ax.x5.AbstractC3445e.a
        AbstractC3445e.a b(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // ax.x5.AbstractC3445e.a
        AbstractC3445e.a c(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // ax.x5.AbstractC3445e.a
        AbstractC3445e.a d(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // ax.x5.AbstractC3445e.a
        AbstractC3445e.a e(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // ax.x5.AbstractC3445e.a
        AbstractC3445e.a f(long j) {
            this.a = Long.valueOf(j);
            return this;
        }
    }

    @Override // ax.x5.AbstractC3445e
    int b() {
        return this.d;
    }

    @Override // ax.x5.AbstractC3445e
    long c() {
        return this.e;
    }

    @Override // ax.x5.AbstractC3445e
    int d() {
        return this.c;
    }

    @Override // ax.x5.AbstractC3445e
    int e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3445e) {
            AbstractC3445e abstractC3445e = (AbstractC3445e) obj;
            if (this.b == abstractC3445e.f() && this.c == abstractC3445e.d() && this.d == abstractC3445e.b() && this.e == abstractC3445e.c() && this.f == abstractC3445e.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.x5.AbstractC3445e
    long f() {
        return this.b;
    }

    public int hashCode() {
        long j = this.b;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        long j2 = this.e;
        return this.f ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.b + ", loadBatchSize=" + this.c + ", criticalSectionEnterTimeoutMs=" + this.d + ", eventCleanUpAge=" + this.e + ", maxBlobByteSizePerRow=" + this.f + "}";
    }

    private C3441a(long j, int i, int i2, long j2, int i3) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = j2;
        this.f = i3;
    }
}
