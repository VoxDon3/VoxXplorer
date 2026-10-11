/*
 * Decompiled with CFR 0.152.
 */
package ax.m7;

import ax.m7.C;
import ax.m7.j;
import ax.m7.v;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;

public final class b {
    private final Map<String, a> a = ax.m7.a.c();
    private final Map<Field, a> b = ax.m7.a.c();
    private final Object c;

    public b(Object object) {
        this.c = object;
    }

    public void a(Field field, Class<?> clazz, Object object) {
        a a8;
        a a9 = a8 = this.b.get(field);
        if (a8 == null) {
            a9 = new a(clazz);
            this.b.put(field, a9);
        }
        a9.a(clazz, object);
    }

    public void b() {
        for (Map.Entry<String, a> entry : this.a.entrySet()) {
            ((Map)this.c).put(entry.getKey(), entry.getValue().b());
        }
        for (Map.Entry<Object, a> entry : this.b.entrySet()) {
            j.l((Field)entry.getKey(), this.c, entry.getValue().b());
        }
    }

    static class a {
        final Class<?> a;
        final ArrayList<Object> b = new ArrayList();

        a(Class<?> clazz) {
            this.a = clazz;
        }

        void a(Class<?> clazz, Object object) {
            boolean bl = clazz == this.a;
            v.a(bl);
            this.b.add(object);
        }

        Object b() {
            return C.o(this.b, this.a);
        }
    }
}

