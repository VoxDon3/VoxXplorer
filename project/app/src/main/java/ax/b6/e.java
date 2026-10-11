/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.r7.C;
import java.util.HashMap;
import java.util.Map;

public final class e {
    private static final C<String> d = C.B("_syn", "_err", "_el");
    private String a;
    private long b;
    private Map<String, Object> c;

    public e(String object, long l8, Map<String, Object> map) {
        this.a = object;
        this.b = l8;
        this.c = object = new HashMap();
        if (map != null) {
            object.putAll(map);
        }
    }

    public static Object c(String string, Object object, Object object2) {
        if (d.contains(string) && object2 instanceof Double) {
            return Math.round((Double)object2);
        }
        if (string.startsWith("_")) {
            if (object instanceof String) {
                return object2;
            }
            if (object != null) {
                return object;
            }
        } else {
            if (object instanceof Double) {
                return object2;
            }
            if (object instanceof Long) {
                return Math.round((Double)object2);
            }
            if (object instanceof String) {
                return object2.toString();
            }
        }
        return object2;
    }

    public final long a() {
        return this.b;
    }

    public final Object b(String string) {
        if (this.c.containsKey(string)) {
            return this.c.get(string);
        }
        return null;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new e(this.a, this.b, new HashMap<String, Object>(this.c));
    }

    public final void d(String string, Object object) {
        if (object == null) {
            this.c.remove(string);
            return;
        }
        object = e.c(string, this.c.get(string), object);
        this.c.put(string, object);
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof e)) {
            return false;
        }
        object = (e)object;
        if (this.b != ((e)object).b) {
            return false;
        }
        if (!this.a.equals(((e)object).a)) {
            return false;
        }
        return ((Object)this.c).equals(((e)object).c);
    }

    public final void f(String string) {
        this.a = string;
    }

    public final Map<String, Object> g() {
        return this.c;
    }

    public final int hashCode() {
        int n8 = this.a.hashCode();
        long l8 = this.b;
        return (n8 * 31 + (int)(l8 ^ l8 >>> 32)) * 31 + ((Object)this.c).hashCode();
    }

    public final String toString() {
        String string = this.a;
        long l8 = this.b;
        String string2 = String.valueOf(this.c);
        StringBuilder stringBuilder = new StringBuilder("Event{name='");
        stringBuilder.append(string);
        stringBuilder.append("', timestamp=");
        stringBuilder.append(l8);
        stringBuilder.append(", params=");
        stringBuilder.append(string2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

