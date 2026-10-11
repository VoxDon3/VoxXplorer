package ax.L7;

import ax.L7.F;
import java.util.List;

/* renamed from: ax.L7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0804f extends F.d {
    private final List<F.d.b> a;
    private final String b;

    /* renamed from: ax.L7.f$b */
    static final class b extends F.d.a {
        private List<F.d.b> a;
        private String b;

        b() {
        }

        @Override // ax.L7.F.d.a
        public F.d a() {
            List<F.d.b> list = this.a;
            if (list != null) {
                return new C0804f(list, this.b);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // ax.L7.F.d.a
        public F.d.a b(List<F.d.b> list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.a = list;
            return this;
        }

        @Override // ax.L7.F.d.a
        public F.d.a c(String str) {
            this.b = str;
            return this;
        }
    }

    @Override // ax.L7.F.d
    public List<F.d.b> b() {
        return this.a;
    }

    @Override // ax.L7.F.d
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.d) {
            F.d dVar = (F.d) obj;
            if (this.a.equals(dVar.b()) && ((str = this.b) != null ? str.equals(dVar.c()) : dVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.a + ", orgId=" + this.b + "}";
    }

    private C0804f(List<F.d.b> list, String str) {
        this.a = list;
        this.b = str;
    }
}
