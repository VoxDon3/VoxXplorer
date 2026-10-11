package ax.L7;

import ax.L7.F;

/* loaded from: classes3.dex */
final class j extends F.e.a.b {
    private final String a;

    @Override // ax.L7.F.e.a.b
    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.a.b) {
            return this.a.equals(((F.e.a.b) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.a + "}";
    }
}
