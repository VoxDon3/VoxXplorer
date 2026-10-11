package ax.q7;

/* renamed from: ax.q7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2874a<T> extends AbstractC2884k<T> {
    static final C2874a<Object> q = new C2874a<>();

    private C2874a() {
    }

    static <T> AbstractC2884k<T> f() {
        return q;
    }

    @Override // ax.q7.AbstractC2884k
    public T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // ax.q7.AbstractC2884k
    public boolean c() {
        return false;
    }

    @Override // ax.q7.AbstractC2884k
    public T e(T t) {
        return (T) n.o(t, "use Optional.orNull() instead of Optional.or(null)");
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
