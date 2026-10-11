package ax.o5;

import ax.o5.o;

/* renamed from: ax.o5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2727e extends o {
    private final o.b a;
    private final AbstractC2723a b;

    /* renamed from: ax.o5.e$b */
    static final class b extends o.a {
        private o.b a;
        private AbstractC2723a b;

        b() {
        }

        @Override // ax.o5.o.a
        public o a() {
            return new C2727e(this.a, this.b);
        }

        @Override // ax.o5.o.a
        public o.a b(AbstractC2723a abstractC2723a) {
            this.b = abstractC2723a;
            return this;
        }

        @Override // ax.o5.o.a
        public o.a c(o.b bVar) {
            this.a = bVar;
            return this;
        }
    }

    @Override // ax.o5.o
    public AbstractC2723a b() {
        return this.b;
    }

    @Override // ax.o5.o
    public o.b c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            o.b bVar = this.a;
            if (bVar != null ? bVar.equals(oVar.c()) : oVar.c() == null) {
                AbstractC2723a abstractC2723a = this.b;
                if (abstractC2723a != null ? abstractC2723a.equals(oVar.b()) : oVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        o.b bVar = this.a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC2723a abstractC2723a = this.b;
        return hashCode ^ (abstractC2723a != null ? abstractC2723a.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }

    private C2727e(o.b bVar, AbstractC2723a abstractC2723a) {
        this.a = bVar;
        this.b = abstractC2723a;
    }
}
