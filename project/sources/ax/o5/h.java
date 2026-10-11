package ax.o5;

import ax.o5.r;

/* loaded from: classes.dex */
final class h extends r {
    private final Integer a;

    static final class b extends r.a {
        private Integer a;

        b() {
        }

        @Override // ax.o5.r.a
        public r a() {
            return new h(this.a);
        }

        @Override // ax.o5.r.a
        public r.a b(Integer num) {
            this.a = num;
            return this;
        }
    }

    @Override // ax.o5.r
    public Integer b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        Integer num = this.a;
        Integer b2 = ((r) obj).b();
        return num == null ? b2 == null : num.equals(b2);
    }

    public int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.a + "}";
    }

    private h(Integer num) {
        this.a = num;
    }
}
