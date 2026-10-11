package ax.m8;

import java.util.Set;

/* loaded from: classes3.dex */
final class c extends e {
    private final Set<d> a;

    c(Set<d> set) {
        if (set == null) {
            throw new NullPointerException("Null rolloutAssignments");
        }
        this.a = set;
    }

    @Override // ax.m8.e
    public Set<d> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.a.equals(((e) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.a + "}";
    }
}
