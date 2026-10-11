/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.Z2;
import ax.b6.m;
import ax.b6.p;
import ax.b6.s;
import ax.b6.u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class n
implements m,
s {
    protected final Map<String, s> c0 = new HashMap<String, s>();
    protected final String q;

    public n(String string) {
        this.q = string;
    }

    public abstract s a(Z2 var1, List<s> var2);

    public final String b() {
        return this.q;
    }

    @Override
    public s c() {
        return this;
    }

    @Override
    public final Boolean e() {
        return Boolean.TRUE;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof n)) {
            return false;
        }
        object = (n)object;
        String string = this.q;
        if (string != null) {
            return string.equals(((n)object).q);
        }
        return false;
    }

    @Override
    public final Double f() {
        return Double.NaN;
    }

    @Override
    public final String g() {
        return this.q;
    }

    @Override
    public final s h(String string) {
        if (this.c0.containsKey(string)) {
            return this.c0.get(string);
        }
        return s.f;
    }

    public int hashCode() {
        String string = this.q;
        if (string != null) {
            return string.hashCode();
        }
        return 0;
    }

    @Override
    public final Iterator<s> i() {
        return p.b(this.c0);
    }

    @Override
    public final s k(String string, Z2 z22, List<s> list) {
        if ("toString".equals(string)) {
            return new u(this.q);
        }
        return p.a(this, new u(string), z22, list);
    }

    @Override
    public final boolean l(String string) {
        return this.c0.containsKey(string);
    }

    @Override
    public final void n(String string, s s8) {
        if (s8 == null) {
            this.c0.remove(string);
            return;
        }
        this.c0.put(string, s8);
    }
}

