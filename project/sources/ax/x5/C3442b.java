package ax.x5;

/* renamed from: ax.x5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3442b extends AbstractC3451k {
    private final long a;
    private final ax.p5.p b;
    private final ax.p5.i c;

    C3442b(long j, ax.p5.p pVar, ax.p5.i iVar) {
        this.a = j;
        if (pVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.b = pVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.c = iVar;
    }

    @Override // ax.x5.AbstractC3451k
    public ax.p5.i b() {
        return this.c;
    }

    @Override // ax.x5.AbstractC3451k
    public long c() {
        return this.a;
    }

    @Override // ax.x5.AbstractC3451k
    public ax.p5.p d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3451k) {
            AbstractC3451k abstractC3451k = (AbstractC3451k) obj;
            if (this.a == abstractC3451k.c() && this.b.equals(abstractC3451k.d()) && this.c.equals(abstractC3451k.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
