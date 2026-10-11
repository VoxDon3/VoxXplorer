package ax.db;

import java.util.List;

/* loaded from: classes3.dex */
final class g extends z {
    private final List<Object> a;

    g(List<Object> list) {
        if (list == null) {
            throw new NullPointerException("Null entries");
        }
        this.a = list;
    }

    @Override // ax.db.z
    public List<Object> d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            return this.a.equals(((z) obj).d());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Tracestate{entries=" + this.a + "}";
    }
}
