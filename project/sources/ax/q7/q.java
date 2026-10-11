package ax.q7;

/* loaded from: classes3.dex */
final class q<T> extends AbstractC2884k<T> {
    private final T q;

    q(T t) {
        this.q = t;
    }

    @Override // ax.q7.AbstractC2884k
    public T b() {
        return this.q;
    }

    @Override // ax.q7.AbstractC2884k
    public boolean c() {
        return true;
    }

    @Override // ax.q7.AbstractC2884k
    public T e(T t) {
        n.o(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.q;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.q.equals(((q) obj).q);
        }
        return false;
    }

    public int hashCode() {
        return this.q.hashCode() + 1502476572;
    }

    public String toString() {
        return "Optional.of(" + this.q + ")";
    }
}
