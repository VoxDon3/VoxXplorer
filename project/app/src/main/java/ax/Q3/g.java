/*
 * Decompiled with CFR 0.152.
 */
package ax.Q3;

import ax.Q3.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class g<K extends m, V> {
    private final a<K, V> a = new a();
    private final Map<K, a<K, V>> b = new HashMap<K, a<K, V>>();

    g() {
    }

    private void b(a<K, V> a8) {
        g.e(a8);
        a<K, V> a9 = this.a;
        a8.d = a9;
        a8.c = a9.c;
        g.g(a8);
    }

    private void c(a<K, V> a8) {
        g.e(a8);
        a<K, V> a9 = this.a;
        a8.d = a9.d;
        a8.c = a9;
        g.g(a8);
    }

    private static <K, V> void e(a<K, V> a8) {
        a a9 = a8.d;
        a9.c = a8.c;
        a8.c.d = a9;
    }

    private static <K, V> void g(a<K, V> a8) {
        a8.c.d = a8;
        a8.d.c = a8;
    }

    public V a(K object) {
        a<K, V> a8 = this.b.get(object);
        if (a8 == null) {
            a8 = new a(object);
            this.b.put(object, a8);
            object = a8;
        } else {
            object.a();
            object = a8;
        }
        this.b((a<K, V>)object);
        return ((a)object).b();
    }

    public void d(K object, V v8) {
        a<K, V> a8 = this.b.get(object);
        if (a8 == null) {
            a8 = new a(object);
            this.c(a8);
            this.b.put(object, a8);
            object = a8;
        } else {
            object.a();
            object = a8;
        }
        ((a)object).a(v8);
    }

    public V f() {
        a a8 = this.a.d;
        while (!a8.equals(this.a)) {
            Object v8 = a8.b();
            if (v8 != null) {
                return v8;
            }
            g.e(a8);
            this.b.remove(a8.a);
            ((m)a8.a).a();
            a8 = a8.d;
        }
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("GroupedLinkedMap( ");
        a a8 = this.a.c;
        boolean bl = false;
        while (!a8.equals(this.a)) {
            stringBuilder.append('{');
            stringBuilder.append(a8.a);
            stringBuilder.append(':');
            stringBuilder.append(a8.c());
            stringBuilder.append("}, ");
            a8 = a8.c;
            bl = true;
        }
        if (bl) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        stringBuilder.append(" )");
        return stringBuilder.toString();
    }

    private static class a<K, V> {
        final K a;
        private List<V> b;
        a<K, V> c;
        a<K, V> d = this;

        public a() {
            this(null);
        }

        public a(K k8) {
            this.c = this;
            this.a = k8;
        }

        public void a(V v8) {
            if (this.b == null) {
                this.b = new ArrayList<V>();
            }
            this.b.add(v8);
        }

        public V b() {
            int n8 = this.c();
            if (n8 > 0) {
                return this.b.remove(n8 - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
    }
}

