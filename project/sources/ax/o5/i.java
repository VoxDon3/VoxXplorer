package ax.o5;

import ax.o5.s;

/* loaded from: classes.dex */
final class i extends s {
    private final r a;

    static final class b extends s.a {
        private r a;

        b() {
        }

        @Override // ax.o5.s.a
        public s a() {
            return new i(this.a);
        }

        @Override // ax.o5.s.a
        public s.a b(r rVar) {
            this.a = rVar;
            return this;
        }
    }

    @Override // ax.o5.s
    public r b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        r rVar = this.a;
        r b2 = ((s) obj).b();
        return rVar == null ? b2 == null : rVar.equals(b2);
    }

    public int hashCode() {
        r rVar = this.a;
        return (rVar == null ? 0 : rVar.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.a + "}";
    }

    private i(r rVar) {
        this.a = rVar;
    }
}
