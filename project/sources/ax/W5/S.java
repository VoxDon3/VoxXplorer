package ax.W5;

/* loaded from: classes3.dex */
final class S extends U {
    static final S q = new S();

    private S() {
    }

    @Override // ax.W5.U
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // ax.W5.U
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
