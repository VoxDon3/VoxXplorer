/*
 * Decompiled with CFR 0.152.
 */
package ax.q0;

import ax.Gb.g;
import ax.Gb.l;
import ax.q0.d;
import ax.tb.o;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a
extends d {
    private final Map<d.a<?>, Object> a;
    private final AtomicBoolean b;

    public a() {
        this(null, false, 3, null);
    }

    public a(Map<d.a<?>, Object> map, boolean bl) {
        l.f(map, "preferencesMap");
        this.a = map;
        this.b = new AtomicBoolean(bl);
    }

    public /* synthetic */ a(Map linkedHashMap, boolean bl, int n8, g g8) {
        if ((n8 & 1) != 0) {
            linkedHashMap = new LinkedHashMap();
        }
        if ((n8 & 2) != 0) {
            bl = true;
        }
        this(linkedHashMap, bl);
    }

    @Override
    public Map<d.a<?>, Object> a() {
        Map map = java.util.DesugarCollections.unmodifiableMap(this.a);
        l.e(map, "unmodifiableMap(preferencesMap)");
        return map;
    }

    @Override
    public <T> T b(d.a<T> a8) {
        l.f(a8, "key");
        return (T)this.a.get(a8);
    }

    public final void e() {
        if (!this.b.get()) {
            return;
        }
        throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
    }

    public boolean equals(Object object) {
        if (object instanceof a) {
            return l.a(this.a, ((a)object).a);
        }
        return false;
    }

    public final void f() {
        this.b.set(true);
    }

    public final void g(d.b<?> ... bArray) {
        l.f(bArray, "pairs");
        this.e();
        for (d.b<?> b8 : bArray) {
            this.j(b8.a(), b8.b());
        }
    }

    public final <T> T h(d.a<T> a8) {
        l.f(a8, "key");
        this.e();
        return (T)this.a.remove(a8);
    }

    public int hashCode() {
        return ((Object)this.a).hashCode();
    }

    public final <T> void i(d.a<T> a8, T t8) {
        l.f(a8, "key");
        this.j(a8, t8);
    }

    public final void j(d.a<?> a8, Object object) {
        l.f(a8, "key");
        this.e();
        if (object == null) {
            this.h(a8);
            return;
        }
        if (object instanceof Set) {
            Map<d.a<?>, Object> map = this.a;
            object = java.util.DesugarCollections.unmodifiableSet(o.Y((Iterable)object));
            l.e(object, "unmodifiableSet(value.toSet())");
            map.put(a8, object);
            return;
        }
        this.a.put(a8, object);
    }

    public String toString() {
        return o.L(this.a.entrySet(), ",\n", "{\n", "\n}", 0, null, ax.q0.a$a.q, 24, null);
    }
}

