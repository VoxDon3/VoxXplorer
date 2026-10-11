package ax.o5;

import ax.o5.p;

/* loaded from: classes.dex */
final class f extends p {
    private final s a;
    private final p.b b;

    static final class b extends p.a {
        private s a;
        private p.b b;

        b() {
        }

        @Override // ax.o5.p.a
        public p a() {
            return new f(this.a, this.b);
        }

        @Override // ax.o5.p.a
        public p.a b(s sVar) {
            this.a = sVar;
            return this;
        }

        @Override // ax.o5.p.a
        public p.a c(p.b bVar) {
            this.b = bVar;
            return this;
        }
    }

    @Override // ax.o5.p
    public s b() {
        return this.a;
    }

    @Override // ax.o5.p
    public p.b c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            s sVar = this.a;
            if (sVar != null ? sVar.equals(pVar.b()) : pVar.b() == null) {
                p.b bVar = this.b;
                if (bVar != null ? bVar.equals(pVar.c()) : pVar.c() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        s sVar = this.a;
        int hashCode = ((sVar == null ? 0 : sVar.hashCode()) ^ 1000003) * 1000003;
        p.b bVar = this.b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + this.b + "}";
    }

    private f(s sVar, p.b bVar) {
        this.a = sVar;
        this.b = bVar;
    }
}
