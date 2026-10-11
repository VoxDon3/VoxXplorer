/*
 * Decompiled with CFR 0.152.
 */
package ax.m7;

import ax.m7.j;
import ax.m7.u;
import ax.m7.v;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentMap;

public final class f {
    private static final ConcurrentMap<Class<?>, f> e = new j.ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, f> f = new j.ConcurrentHashMap();
    private final Class<?> a;
    private final boolean b;
    private final IdentityHashMap<String, j> c = new IdentityHashMap();
    final List<String> d;

    /*
     * WARNING - void declaration
     */
    private f(Class<?> object4, boolean bl) {
        Object var1_9;
        String string;
        boolean var2_10;
        this.a = object4;
        this.b = var2_10;
        boolean bl2 = var2_10 == false || !((Class)object4).isEnum();
        Object object = new StringBuilder();
        ((StringBuilder)object).append("cannot ignore case on an enum: ");
        ((StringBuilder)object).append(object4);
        v.b(bl2, ((StringBuilder)object).toString());
        TreeSet<String> treeSet = new TreeSet<String>(new Comparator<String>(this){
            final f q;
            {
                this.q = f8;
            }

            public int a(String string, String string2) {
                if (u.a(string, string2)) {
                    return 0;
                }
                if (string == null) {
                    return -1;
                }
                if (string2 == null) {
                    return 1;
                }
                return string.compareTo(string2);
            }
        });
        for (Field field : ((Class)object4).getDeclaredFields()) {
            Object object2;
            j j8 = j.k(field);
            if (j8 == null) continue;
            string = j8.e();
            object = string;
            if (var2_10 != false) {
                object = string.toLowerCase(Locale.US).intern();
            }
            bl2 = (object2 = this.c.get(object)) == null;
            string = var2_10 != false ? "case-insensitive " : "";
            object2 = object2 == null ? null : ((j)object2).b();
            v.c(bl2, "two fields have the same %sname <%s>: %s and %s", string, object, field, object2);
            this.c.put((String)object, j8);
            treeSet.add((String)object);
        }
        Class clazz = ((Class)object4).getSuperclass();
        if (clazz != null) {
            f f8 = ax.m7.f.f(clazz, (boolean)var2_10);
            treeSet.addAll(f8.d);
            for (Map.Entry entry : f8.c.entrySet()) {
                string = (String)entry.getKey();
                if (this.c.containsKey(string)) continue;
                this.c.put(string, (j)entry.getValue());
            }
        }
        if (treeSet.isEmpty()) {
            List list = Collections.EMPTY_LIST;
        } else {
            List list = java.util.DesugarCollections.unmodifiableList(new ArrayList<String>(treeSet));
        }
        this.d = var1_9;
    }

    public static f e(Class<?> clazz) {
        return ax.m7.f.f(clazz, false);
    }

    public static f f(Class<?> object, boolean bl) {
        if (object == null) {
            return null;
        }
        ConcurrentMap<Class<?>, f> concurrentMap = bl ? f : e;
        f f8 = (f)concurrentMap.get(object);
        if (f8 == null) {
            f8 = new f((Class<?>)object, bl);
            if ((object = concurrentMap.putIfAbsent((Class<?>)object, f8)) == null) {
                return f8;
            }
            return object;
        }
        return f8;
    }

    public Field a(String object) {
        if ((object = this.b((String)object)) == null) {
            return null;
        }
        return ((j)object).b();
    }

    public j b(String string) {
        String string2 = string;
        if (string != null) {
            string2 = string;
            if (this.b) {
                string2 = string.toLowerCase(Locale.US);
            }
            string2 = string2.intern();
        }
        return this.c.get(string2);
    }

    public Collection<j> c() {
        return java.util.DesugarCollections.unmodifiableCollection(this.c.values());
    }

    public final boolean d() {
        return this.b;
    }
}

