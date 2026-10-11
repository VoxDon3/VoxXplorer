package ax.L7;

import ax.L7.G;

/* loaded from: classes3.dex */
final class B extends G {
    private final G.a a;
    private final G.c b;
    private final G.b c;

    B(G.a aVar, G.c cVar, G.b bVar) {
        if (aVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.a = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null osData");
        }
        this.b = cVar;
        if (bVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.c = bVar;
    }

    @Override // ax.L7.G
    public G.a a() {
        return this.a;
    }

    @Override // ax.L7.G
    public G.b c() {
        return this.c;
    }

    @Override // ax.L7.G
    public G.c d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G) {
            G g = (G) obj;
            if (this.a.equals(g.a()) && this.b.equals(g.d()) && this.c.equals(g.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
