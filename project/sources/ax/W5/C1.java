package ax.W5;

import java.util.Map;

/* loaded from: classes3.dex */
final class C1 implements Map.Entry, Comparable {
    private Object c0;
    final /* synthetic */ I1 d0;
    private final Comparable q;

    C1(I1 i1, Comparable comparable, Object obj) {
        this.d0 = i1;
        this.q = comparable;
        this.c0 = obj;
    }

    private static final boolean h(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.q.compareTo(((C1) obj).q);
    }

    public final Comparable d() {
        return this.q;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return h(this.q, entry.getKey()) && h(this.c0, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.q;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c0;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.q;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.c0;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.d0.o();
        Object obj2 = this.c0;
        this.c0 = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.q) + "=" + String.valueOf(this.c0);
    }
}
