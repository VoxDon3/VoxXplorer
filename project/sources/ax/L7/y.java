package ax.L7;

import ax.L7.F;
import java.util.List;

/* loaded from: classes3.dex */
final class y extends F.e.d.f {
    private final List<F.e.d.AbstractC0138e> a;

    static final class b extends F.e.d.f.a {
        private List<F.e.d.AbstractC0138e> a;

        b() {
        }

        @Override // ax.L7.F.e.d.f.a
        public F.e.d.f a() {
            List<F.e.d.AbstractC0138e> list = this.a;
            if (list != null) {
                return new y(list);
            }
            throw new IllegalStateException("Missing required properties: rolloutAssignments");
        }

        @Override // ax.L7.F.e.d.f.a
        public F.e.d.f.a b(List<F.e.d.AbstractC0138e> list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.a = list;
            return this;
        }
    }

    @Override // ax.L7.F.e.d.f
    public List<F.e.d.AbstractC0138e> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.f) {
            return this.a.equals(((F.e.d.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.a + "}";
    }

    private y(List<F.e.d.AbstractC0138e> list) {
        this.a = list;
    }
}
