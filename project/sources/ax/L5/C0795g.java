package ax.L5;

/* renamed from: ax.L5.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0795g<L> {
    private final Object a;
    private final String b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0795g)) {
            return false;
        }
        C0795g c0795g = (C0795g) obj;
        return this.a == c0795g.a && this.b.equals(c0795g.b);
    }

    public int hashCode() {
        return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
    }
}
