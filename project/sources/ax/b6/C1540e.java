package ax.b6;

import ax.r7.AbstractC2964C;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ax.b6.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1540e {
    private static final AbstractC2964C<String> d = AbstractC2964C.B("_syn", "_err", "_el");
    private String a;
    private long b;
    private Map<String, Object> c;

    public C1540e(String str, long j, Map<String, Object> map) {
        this.a = str;
        this.b = j;
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public static Object c(String str, Object obj, Object obj2) {
        if (d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (obj instanceof String) {
                return obj2;
            }
            if (obj != null) {
                return obj;
            }
        } else {
            if (obj instanceof Double) {
                return obj2;
            }
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    public final long a() {
        return this.b;
    }

    public final Object b(String str) {
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        return null;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new C1540e(this.a, this.b, new HashMap(this.c));
    }

    public final void d(String str, Object obj) {
        if (obj == null) {
            this.c.remove(str);
        } else {
            this.c.put(str, c(str, this.c.get(str), obj));
        }
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1540e)) {
            return false;
        }
        C1540e c1540e = (C1540e) obj;
        if (this.b == c1540e.b && this.a.equals(c1540e.a)) {
            return this.c.equals(c1540e.c);
        }
        return false;
    }

    public final void f(String str) {
        this.a = str;
    }

    public final Map<String, Object> g() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        return ((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.a + "', timestamp=" + this.b + ", params=" + String.valueOf(this.c) + "}";
    }
}
