package ax.db;

import ax.db.n;
import okhttp3.HttpUrl;

/* renamed from: ax.db.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1958d extends n {
    private final boolean b;
    private final u c;

    /* renamed from: ax.db.d$b */
    static final class b extends n.a {
        private Boolean a;
        private u b;

        b() {
        }

        @Override // ax.db.n.a
        public n a() {
            Boolean bool = this.a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (bool == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " sampleToLocalSpanStore";
            }
            if (str.isEmpty()) {
                return new C1958d(this.a.booleanValue(), this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ax.db.n.a
        public n.a b(u uVar) {
            this.b = uVar;
            return this;
        }

        public n.a c(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    @Override // ax.db.n
    public boolean b() {
        return this.b;
    }

    @Override // ax.db.n
    public u c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        u uVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.b == nVar.b() && ((uVar = this.c) != null ? uVar.equals(nVar.c()) : nVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = ((this.b ? 1231 : 1237) ^ 1000003) * 1000003;
        u uVar = this.c;
        return i ^ (uVar == null ? 0 : uVar.hashCode());
    }

    public String toString() {
        return "EndSpanOptions{sampleToLocalSpanStore=" + this.b + ", status=" + this.c + "}";
    }

    private C1958d(boolean z, u uVar) {
        this.b = z;
        this.c = uVar;
    }
}
