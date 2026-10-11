package ax.b6;

import java.util.Map;

/* renamed from: ax.b6.s5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1664s5 implements Comparable, Map.Entry {
    private Object c0;
    private final /* synthetic */ C1617m5 d0;
    private final Comparable q;

    C1664s5(C1617m5 c1617m5, Map.Entry entry) {
        this(c1617m5, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C1664s5) obj).getKey());
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
        return d(this.q, entry.getKey()) && d(this.c0, entry.getValue());
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
        this.d0.q();
        Object obj2 = this.c0;
        this.c0 = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.q) + "=" + String.valueOf(this.c0);
    }

    C1664s5(C1617m5 c1617m5, Comparable comparable, Object obj) {
        this.d0 = c1617m5;
        this.q = comparable;
        this.c0 = obj;
    }
}
