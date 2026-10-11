package ax.x7;

/* renamed from: ax.x7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3466a extends o {
    private final long a;
    private final long b;
    private final long c;

    C3466a(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // ax.x7.o
    public long b() {
        return this.b;
    }

    @Override // ax.x7.o
    public long c() {
        return this.a;
    }

    @Override // ax.x7.o
    public long d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.a == oVar.c() && this.b == oVar.b() && this.c == oVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.c;
        return ((int) (j3 ^ (j3 >>> 32))) ^ i;
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.a + ", elapsedRealtime=" + this.b + ", uptimeMillis=" + this.c + "}";
    }
}
