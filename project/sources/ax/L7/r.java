package ax.L7;

import ax.L7.F;
import java.util.List;

/* loaded from: classes3.dex */
final class r extends F.e.d.a.b.AbstractC0132e {
    private final String a;
    private final int b;
    private final List<F.e.d.a.b.AbstractC0132e.AbstractC0134b> c;

    static final class b extends F.e.d.a.b.AbstractC0132e.AbstractC0133a {
        private String a;
        private int b;
        private List<F.e.d.a.b.AbstractC0132e.AbstractC0134b> c;
        private byte d;

        b() {
        }

        @Override // ax.L7.F.e.d.a.b.AbstractC0132e.AbstractC0133a
        public F.e.d.a.b.AbstractC0132e a() {
            String str;
            List<F.e.d.a.b.AbstractC0132e.AbstractC0134b> list;
            if (this.d == 1 && (str = this.a) != null && (list = this.c) != null) {
                return new r(str, this.b, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" name");
            }
            if ((1 & this.d) == 0) {
                sb.append(" importance");
            }
            if (this.c == null) {
                sb.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // ax.L7.F.e.d.a.b.AbstractC0132e.AbstractC0133a
        public F.e.d.a.b.AbstractC0132e.AbstractC0133a b(List<F.e.d.a.b.AbstractC0132e.AbstractC0134b> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.c = list;
            return this;
        }

        @Override // ax.L7.F.e.d.a.b.AbstractC0132e.AbstractC0133a
        public F.e.d.a.b.AbstractC0132e.AbstractC0133a c(int i) {
            this.b = i;
            this.d = (byte) (this.d | 1);
            return this;
        }

        @Override // ax.L7.F.e.d.a.b.AbstractC0132e.AbstractC0133a
        public F.e.d.a.b.AbstractC0132e.AbstractC0133a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.a = str;
            return this;
        }
    }

    @Override // ax.L7.F.e.d.a.b.AbstractC0132e
    public List<F.e.d.a.b.AbstractC0132e.AbstractC0134b> b() {
        return this.c;
    }

    @Override // ax.L7.F.e.d.a.b.AbstractC0132e
    public int c() {
        return this.b;
    }

    @Override // ax.L7.F.e.d.a.b.AbstractC0132e
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.b.AbstractC0132e) {
            F.e.d.a.b.AbstractC0132e abstractC0132e = (F.e.d.a.b.AbstractC0132e) obj;
            if (this.a.equals(abstractC0132e.d()) && this.b == abstractC0132e.c() && this.c.equals(abstractC0132e.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.b + ", frames=" + this.c + "}";
    }

    private r(String str, int i, List<F.e.d.a.b.AbstractC0132e.AbstractC0134b> list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }
}
