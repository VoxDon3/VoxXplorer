package ax.n0;

/* renamed from: ax.n0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2569c<T> extends n<T> {
    private final T a;
    private final int b;

    public C2569c(T t, int i) {
        super(null);
        this.a = t;
        this.b = i;
    }

    public final void a() {
        T t = this.a;
        if (!((t != null ? t.hashCode() : 0) == this.b)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final T b() {
        return this.a;
    }
}
