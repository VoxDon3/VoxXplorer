package ax.q5;

import ax.q5.g;

/* renamed from: ax.q5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2870b extends g {
    private final g.a a;
    private final long b;

    C2870b(g.a aVar, long j) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.a = aVar;
        this.b = j;
    }

    @Override // ax.q5.g
    public long b() {
        return this.b;
    }

    @Override // ax.q5.g
    public g.a c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.a.equals(gVar.c()) && this.b == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.a + ", nextRequestWaitMillis=" + this.b + "}";
    }
}
