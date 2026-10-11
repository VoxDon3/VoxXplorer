package ax.i8;

import java.util.Set;

/* renamed from: ax.i8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2283a extends AbstractC2284b {
    private final Set<String> a;

    C2283a(Set<String> set) {
        if (set == null) {
            throw new NullPointerException("Null updatedKeys");
        }
        this.a = set;
    }

    @Override // ax.i8.AbstractC2284b
    public Set<String> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2284b) {
            return this.a.equals(((AbstractC2284b) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.a + "}";
    }
}
