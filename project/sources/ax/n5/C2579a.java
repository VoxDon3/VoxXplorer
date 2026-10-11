package ax.n5;

/* renamed from: ax.n5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2579a<T> extends AbstractC2581c<T> {
    private final Integer a;
    private final T b;
    private final e c;

    C2579a(Integer num, T t, e eVar, f fVar, d dVar) {
        this.a = num;
        if (t == null) {
            throw new NullPointerException("Null payload");
        }
        this.b = t;
        if (eVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.c = eVar;
    }

    @Override // ax.n5.AbstractC2581c
    public Integer a() {
        return this.a;
    }

    @Override // ax.n5.AbstractC2581c
    public d b() {
        return null;
    }

    @Override // ax.n5.AbstractC2581c
    public T c() {
        return this.b;
    }

    @Override // ax.n5.AbstractC2581c
    public e d() {
        return this.c;
    }

    @Override // ax.n5.AbstractC2581c
    public f e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2581c) {
            AbstractC2581c abstractC2581c = (AbstractC2581c) obj;
            Integer num = this.a;
            if (num != null ? num.equals(abstractC2581c.a()) : abstractC2581c.a() == null) {
                if (this.b.equals(abstractC2581c.c()) && this.c.equals(abstractC2581c.d())) {
                    abstractC2581c.e();
                    abstractC2581c.b();
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.a;
        return ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * (-721379959);
    }

    public String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + ", productData=" + ((Object) null) + ", eventContext=" + ((Object) null) + "}";
    }
}
