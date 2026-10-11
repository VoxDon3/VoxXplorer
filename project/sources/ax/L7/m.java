package ax.L7;

import ax.L7.F;
import java.util.List;

/* loaded from: classes3.dex */
final class m extends F.e.d.a {
    private final F.e.d.a.b a;
    private final List<F.c> b;
    private final List<F.c> c;
    private final Boolean d;
    private final F.e.d.a.c e;
    private final List<F.e.d.a.c> f;
    private final int g;

    static final class b extends F.e.d.a.AbstractC0125a {
        private F.e.d.a.b a;
        private List<F.c> b;
        private List<F.c> c;
        private Boolean d;
        private F.e.d.a.c e;
        private List<F.e.d.a.c> f;
        private int g;
        private byte h;

        @Override // ax.L7.F.e.d.a.AbstractC0125a
        public F.e.d.a a() {
            F.e.d.a.b bVar;
            if (this.h == 1 && (bVar = this.a) != null) {
                return new m(bVar, this.b, this.c, this.d, this.e, this.f, this.g);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" execution");
            }
            if ((1 & this.h) == 0) {
                sb.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // ax.L7.F.e.d.a.AbstractC0125a
        public F.e.d.a.AbstractC0125a b(List<F.e.d.a.c> list) {
            this.f = list;
            return this;
        }

        @Override // ax.L7.F.e.d.a.AbstractC0125a
        public F.e.d.a.AbstractC0125a c(Boolean bool) {
            this.d = bool;
            return this;
        }

        @Override // ax.L7.F.e.d.a.AbstractC0125a
        public F.e.d.a.AbstractC0125a d(F.e.d.a.c cVar) {
            this.e = cVar;
            return this;
        }

        @Override // ax.L7.F.e.d.a.AbstractC0125a
        public F.e.d.a.AbstractC0125a e(List<F.c> list) {
            this.b = list;
            return this;
        }

        @Override // ax.L7.F.e.d.a.AbstractC0125a
        public F.e.d.a.AbstractC0125a f(F.e.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.a = bVar;
            return this;
        }

        @Override // ax.L7.F.e.d.a.AbstractC0125a
        public F.e.d.a.AbstractC0125a g(List<F.c> list) {
            this.c = list;
            return this;
        }

        @Override // ax.L7.F.e.d.a.AbstractC0125a
        public F.e.d.a.AbstractC0125a h(int i) {
            this.g = i;
            this.h = (byte) (this.h | 1);
            return this;
        }

        b() {
        }

        private b(F.e.d.a aVar) {
            this.a = aVar.f();
            this.b = aVar.e();
            this.c = aVar.g();
            this.d = aVar.c();
            this.e = aVar.d();
            this.f = aVar.b();
            this.g = aVar.h();
            this.h = (byte) 1;
        }
    }

    @Override // ax.L7.F.e.d.a
    public List<F.e.d.a.c> b() {
        return this.f;
    }

    @Override // ax.L7.F.e.d.a
    public Boolean c() {
        return this.d;
    }

    @Override // ax.L7.F.e.d.a
    public F.e.d.a.c d() {
        return this.e;
    }

    @Override // ax.L7.F.e.d.a
    public List<F.c> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        List<F.c> list;
        List<F.c> list2;
        Boolean bool;
        F.e.d.a.c cVar;
        List<F.e.d.a.c> list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a) {
            F.e.d.a aVar = (F.e.d.a) obj;
            if (this.a.equals(aVar.f()) && ((list = this.b) != null ? list.equals(aVar.e()) : aVar.e() == null) && ((list2 = this.c) != null ? list2.equals(aVar.g()) : aVar.g() == null) && ((bool = this.d) != null ? bool.equals(aVar.c()) : aVar.c() == null) && ((cVar = this.e) != null ? cVar.equals(aVar.d()) : aVar.d() == null) && ((list3 = this.f) != null ? list3.equals(aVar.b()) : aVar.b() == null) && this.g == aVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.L7.F.e.d.a
    public F.e.d.a.b f() {
        return this.a;
    }

    @Override // ax.L7.F.e.d.a
    public List<F.c> g() {
        return this.c;
    }

    @Override // ax.L7.F.e.d.a
    public int h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        List<F.c> list = this.b;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<F.c> list2 = this.c;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        F.e.d.a.c cVar = this.e;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<F.e.d.a.c> list3 = this.f;
        return ((hashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.g;
    }

    @Override // ax.L7.F.e.d.a
    public F.e.d.a.AbstractC0125a i() {
        return new b(this);
    }

    public String toString() {
        return "Application{execution=" + this.a + ", customAttributes=" + this.b + ", internalKeys=" + this.c + ", background=" + this.d + ", currentProcessDetails=" + this.e + ", appProcessDetails=" + this.f + ", uiOrientation=" + this.g + "}";
    }

    private m(F.e.d.a.b bVar, List<F.c> list, List<F.c> list2, Boolean bool, F.e.d.a.c cVar, List<F.e.d.a.c> list3, int i) {
        this.a = bVar;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = cVar;
        this.f = list3;
        this.g = i;
    }
}
