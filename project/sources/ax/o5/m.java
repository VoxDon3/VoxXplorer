package ax.o5;

import ax.o5.w;

/* loaded from: classes.dex */
final class m extends w {
    private final w.c a;
    private final w.b b;

    static final class b extends w.a {
        private w.c a;
        private w.b b;

        b() {
        }

        @Override // ax.o5.w.a
        public w a() {
            return new m(this.a, this.b);
        }

        @Override // ax.o5.w.a
        public w.a b(w.b bVar) {
            this.b = bVar;
            return this;
        }

        @Override // ax.o5.w.a
        public w.a c(w.c cVar) {
            this.a = cVar;
            return this;
        }
    }

    @Override // ax.o5.w
    public w.b b() {
        return this.b;
    }

    @Override // ax.o5.w
    public w.c c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            w.c cVar = this.a;
            if (cVar != null ? cVar.equals(wVar.c()) : wVar.c() == null) {
                w.b bVar = this.b;
                if (bVar != null ? bVar.equals(wVar.b()) : wVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        w.c cVar = this.a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        w.b bVar = this.b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }

    private m(w.c cVar, w.b bVar) {
        this.a = cVar;
        this.b = bVar;
    }
}
