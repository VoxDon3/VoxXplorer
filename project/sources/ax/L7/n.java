package ax.L7;

import ax.L7.F;
import java.util.List;

/* loaded from: classes3.dex */
final class n extends F.e.d.a.b {
    private final List<F.e.d.a.b.AbstractC0132e> a;
    private final F.e.d.a.b.c b;
    private final F.a c;
    private final F.e.d.a.b.AbstractC0130d d;
    private final List<F.e.d.a.b.AbstractC0126a> e;

    static final class b extends F.e.d.a.b.AbstractC0128b {
        private List<F.e.d.a.b.AbstractC0132e> a;
        private F.e.d.a.b.c b;
        private F.a c;
        private F.e.d.a.b.AbstractC0130d d;
        private List<F.e.d.a.b.AbstractC0126a> e;

        b() {
        }

        @Override // ax.L7.F.e.d.a.b.AbstractC0128b
        public F.e.d.a.b a() {
            List<F.e.d.a.b.AbstractC0126a> list;
            F.e.d.a.b.AbstractC0130d abstractC0130d = this.d;
            if (abstractC0130d != null && (list = this.e) != null) {
                return new n(this.a, this.b, this.c, abstractC0130d, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.d == null) {
                sb.append(" signal");
            }
            if (this.e == null) {
                sb.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // ax.L7.F.e.d.a.b.AbstractC0128b
        public F.e.d.a.b.AbstractC0128b b(F.a aVar) {
            this.c = aVar;
            return this;
        }

        @Override // ax.L7.F.e.d.a.b.AbstractC0128b
        public F.e.d.a.b.AbstractC0128b c(List<F.e.d.a.b.AbstractC0126a> list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.e = list;
            return this;
        }

        @Override // ax.L7.F.e.d.a.b.AbstractC0128b
        public F.e.d.a.b.AbstractC0128b d(F.e.d.a.b.c cVar) {
            this.b = cVar;
            return this;
        }

        @Override // ax.L7.F.e.d.a.b.AbstractC0128b
        public F.e.d.a.b.AbstractC0128b e(F.e.d.a.b.AbstractC0130d abstractC0130d) {
            if (abstractC0130d == null) {
                throw new NullPointerException("Null signal");
            }
            this.d = abstractC0130d;
            return this;
        }

        @Override // ax.L7.F.e.d.a.b.AbstractC0128b
        public F.e.d.a.b.AbstractC0128b f(List<F.e.d.a.b.AbstractC0132e> list) {
            this.a = list;
            return this;
        }
    }

    @Override // ax.L7.F.e.d.a.b
    public F.a b() {
        return this.c;
    }

    @Override // ax.L7.F.e.d.a.b
    public List<F.e.d.a.b.AbstractC0126a> c() {
        return this.e;
    }

    @Override // ax.L7.F.e.d.a.b
    public F.e.d.a.b.c d() {
        return this.b;
    }

    @Override // ax.L7.F.e.d.a.b
    public F.e.d.a.b.AbstractC0130d e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.b) {
            F.e.d.a.b bVar = (F.e.d.a.b) obj;
            List<F.e.d.a.b.AbstractC0132e> list = this.a;
            if (list != null ? list.equals(bVar.f()) : bVar.f() == null) {
                F.e.d.a.b.c cVar = this.b;
                if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                    F.a aVar = this.c;
                    if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                        if (this.d.equals(bVar.e()) && this.e.equals(bVar.c())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // ax.L7.F.e.d.a.b
    public List<F.e.d.a.b.AbstractC0132e> f() {
        return this.a;
    }

    public int hashCode() {
        List<F.e.d.a.b.AbstractC0132e> list = this.a;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        F.e.d.a.b.c cVar = this.b;
        int hashCode2 = (hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        F.a aVar = this.c;
        return ((((hashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", signal=" + this.d + ", binaries=" + this.e + "}";
    }

    private n(List<F.e.d.a.b.AbstractC0132e> list, F.e.d.a.b.c cVar, F.a aVar, F.e.d.a.b.AbstractC0130d abstractC0130d, List<F.e.d.a.b.AbstractC0126a> list2) {
        this.a = list;
        this.b = cVar;
        this.c = aVar;
        this.d = abstractC0130d;
        this.e = list2;
    }
}
