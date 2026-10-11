package ax.o5;

import java.util.List;

/* renamed from: ax.o5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2726d extends n {
    private final List<u> a;

    C2726d(List<u> list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.a = list;
    }

    @Override // ax.o5.n
    public List<u> c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.a.equals(((n) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}
