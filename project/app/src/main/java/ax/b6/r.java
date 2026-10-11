/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.Z2;
import ax.b6.m;
import ax.b6.p;
import ax.b6.s;
import ax.b6.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class r
implements m,
s {
    private final Map<String, s> q = new HashMap<String, s>();

    public final List<String> a() {
        return new ArrayList<String>(this.q.keySet());
    }

    @Override
    public final s c() {
        r r8 = new r();
        for (Map.Entry<String, s> entry : this.q.entrySet()) {
            if (entry.getValue() instanceof m) {
                r8.q.put(entry.getKey(), entry.getValue());
                continue;
            }
            r8.q.put(entry.getKey(), entry.getValue().c());
        }
        return r8;
    }

    @Override
    public final Boolean e() {
        return Boolean.TRUE;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof r)) {
            return false;
        }
        object = (r)object;
        return ((Object)this.q).equals(((r)object).q);
    }

    @Override
    public final Double f() {
        return Double.NaN;
    }

    @Override
    public final String g() {
        return "[object Object]";
    }

    @Override
    public final s h(String string) {
        if (this.q.containsKey(string)) {
            return this.q.get(string);
        }
        return s.f;
    }

    public int hashCode() {
        return ((Object)this.q).hashCode();
    }

    @Override
    public final Iterator<s> i() {
        return p.b(this.q);
    }

    @Override
    public s k(String string, Z2 z22, List<s> list) {
        if ("toString".equals(string)) {
            return new u(this.toString());
        }
        return p.a(this, new u(string), z22, list);
    }

    @Override
    public final boolean l(String string) {
        return this.q.containsKey(string);
    }

    @Override
    public final void n(String string, s s8) {
        if (s8 == null) {
            this.q.remove(string);
            return;
        }
        this.q.put(string, s8);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        if (!this.q.isEmpty()) {
            for (String string : this.q.keySet()) {
                stringBuilder.append(String.format("%s: %s,", string, this.q.get(string)));
            }
            stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

