package ax.L7;

import ax.L7.F;
import java.util.List;

/* loaded from: classes3.dex */
final class p extends F.e.d.a.b.c {
    private final String a;
    private final String b;
    private final List<F.e.d.a.b.AbstractC0132e.AbstractC0134b> c;
    private final F.e.d.a.b.c d;
    private final int e;

    static final class b extends F.e.d.a.b.c.AbstractC0129a {
        private String a;
        private String b;
        private List<F.e.d.a.b.AbstractC0132e.AbstractC0134b> c;
        private F.e.d.a.b.c d;
        private int e;
        private byte f;

        b() {
        }

        @Override // ax.L7.F.e.d.a.b.c.AbstractC0129a
        public F.e.d.a.b.c a() {
            String str;
            List<F.e.d.a.b.AbstractC0132e.AbstractC0134b> list;
            if (this.f == 1 && (str = this.a) != null && (list = this.c) != null) {
                return new p(str, this.b, list, this.d, this.e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" type");
            }
            if (this.c == null) {
                sb.append(" frames");
            }
            if ((1 & this.f) == 0) {
                sb.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // ax.L7.F.e.d.a.b.c.AbstractC0129a
        public F.e.d.a.b.c.AbstractC0129a b(F.e.d.a.b.c cVar) {
            this.d = cVar;
            return this;
        }

        @Override // ax.L7.F.e.d.a.b.c.AbstractC0129a
        public F.e.d.a.b.c.AbstractC0129a c(List<F.e.d.a.b.AbstractC0132e.AbstractC0134b> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.c = list;
            return this;
        }

        @Override // ax.L7.F.e.d.a.b.c.AbstractC0129a
        public F.e.d.a.b.c.AbstractC0129a d(int i) {
            this.e = i;
            this.f = (byte) (this.f | 1);
            return this;
        }

        @Override // ax.L7.F.e.d.a.b.c.AbstractC0129a
        public F.e.d.a.b.c.AbstractC0129a e(String str) {
            this.b = str;
            return this;
        }

        @Override // ax.L7.F.e.d.a.b.c.AbstractC0129a
        public F.e.d.a.b.c.AbstractC0129a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.a = str;
            return this;
        }
    }

    @Override // ax.L7.F.e.d.a.b.c
    public F.e.d.a.b.c b() {
        return this.d;
    }

    @Override // ax.L7.F.e.d.a.b.c
    public List<F.e.d.a.b.AbstractC0132e.AbstractC0134b> c() {
        return this.c;
    }

    @Override // ax.L7.F.e.d.a.b.c
    public int d() {
        return this.e;
    }

    @Override // ax.L7.F.e.d.a.b.c
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        F.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.b.c) {
            F.e.d.a.b.c cVar2 = (F.e.d.a.b.c) obj;
            if (this.a.equals(cVar2.f()) && ((str = this.b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.c.equals(cVar2.c()) && ((cVar = this.d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.e == cVar2.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.L7.F.e.d.a.b.c
    public String f() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        F.e.d.a.b.c cVar = this.d;
        return ((hashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.e;
    }

    public String toString() {
        return "Exception{type=" + this.a + ", reason=" + this.b + ", frames=" + this.c + ", causedBy=" + this.d + ", overflowCount=" + this.e + "}";
    }

    private p(String str, String str2, List<F.e.d.a.b.AbstractC0132e.AbstractC0134b> list, F.e.d.a.b.c cVar, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = cVar;
        this.e = i;
    }
}
