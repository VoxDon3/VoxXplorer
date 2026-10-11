/*
 * Decompiled with CFR 0.152.
 */
package ax.tb;

import ax.Gb.l;
import ax.Hb.a;
import ax.tb.A;
import ax.tb.C;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

final class B
implements Map,
Serializable,
a {
    public static final B q = new B();

    private B() {
    }

    public boolean a(Void void_) {
        l.f(void_, "value");
        return false;
    }

    public Void b(Object object) {
        return null;
    }

    public Set<Map.Entry> c() {
        return C.q;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean containsKey(Object object) {
        return false;
    }

    public Set<Object> d() {
        return C.q;
    }

    public int e() {
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Map && ((Map)object).isEmpty();
    }

    public Collection f() {
        return A.q;
    }

    public Void g(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        return "{}";
    }
}

