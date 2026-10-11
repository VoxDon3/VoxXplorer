package ax.e8;

import ax.e8.AbstractC1990f;
import okhttp3.HttpUrl;

/* renamed from: ax.e8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1986b extends AbstractC1990f {
    private final String a;
    private final long b;
    private final AbstractC1990f.b c;

    /* renamed from: ax.e8.b$b, reason: collision with other inner class name */
    static final class C0299b extends AbstractC1990f.a {
        private String a;
        private Long b;
        private AbstractC1990f.b c;

        C0299b() {
        }

        @Override // ax.e8.AbstractC1990f.a
        public AbstractC1990f a() {
            Long l = this.b;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (l == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C1986b(this.a, this.b.longValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ax.e8.AbstractC1990f.a
        public AbstractC1990f.a b(AbstractC1990f.b bVar) {
            this.c = bVar;
            return this;
        }

        @Override // ax.e8.AbstractC1990f.a
        public AbstractC1990f.a c(String str) {
            this.a = str;
            return this;
        }

        @Override // ax.e8.AbstractC1990f.a
        public AbstractC1990f.a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    @Override // ax.e8.AbstractC1990f
    public AbstractC1990f.b b() {
        return this.c;
    }

    @Override // ax.e8.AbstractC1990f
    public String c() {
        return this.a;
    }

    @Override // ax.e8.AbstractC1990f
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        AbstractC1990f.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1990f) {
            AbstractC1990f abstractC1990f = (AbstractC1990f) obj;
            String str = this.a;
            if (str != null ? str.equals(abstractC1990f.c()) : abstractC1990f.c() == null) {
                if (this.b == abstractC1990f.d() && ((bVar = this.c) != null ? bVar.equals(abstractC1990f.b()) : abstractC1990f.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        AbstractC1990f.b bVar = this.c;
        return i ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.c + "}";
    }

    private C1986b(String str, long j, AbstractC1990f.b bVar) {
        this.a = str;
        this.b = j;
        this.c = bVar;
    }
}
