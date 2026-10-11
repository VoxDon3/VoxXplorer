package ax.W5;

/* loaded from: classes3.dex */
final class V extends U {
    private final Object q;

    V(Object obj) {
        this.q = obj;
    }

    @Override // ax.W5.U
    public final Object a() {
        return this.q;
    }

    @Override // ax.W5.U
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof V) {
            return this.q.equals(((V) obj).q);
        }
        return false;
    }

    public final int hashCode() {
        return this.q.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.q.toString() + ")";
    }
}
