/*
 * Decompiled with CFR 0.152.
 */
package ax.D7;

import ax.D7.F;
import ax.D7.r;
import ax.D7.s;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class q {
    static void a(List<ax.D7.c<?>> list) {
        b b8;
        Object object = q.c(list);
        Set<b> set = q.b(object);
        int n8 = 0;
        block0: while (!set.isEmpty()) {
            b b9 = set.iterator().next();
            set.remove(b9);
            int n9 = n8 + 1;
            Iterator<b> iterator = b9.d().iterator();
            while (true) {
                n8 = n9;
                if (!iterator.hasNext()) continue block0;
                b8 = iterator.next();
                b8.g(b9);
                if (!b8.f()) continue;
                set.add(b8);
            }
        }
        if (n8 == list.size()) {
            return;
        }
        list = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            b8 = (b)object.next();
            if (b8.f() || b8.e()) continue;
            list.add(b8.c());
        }
        throw new s(list);
    }

    private static Set<b> b(Set<b> object) {
        HashSet<b> hashSet = new HashSet<b>();
        Iterator<b> iterator = object.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            if (!((b)object).f()) continue;
            hashSet.add((b)object);
        }
        return hashSet;
    }

    private static Set<b> c(List<ax.D7.c<?>> iterator) {
        Object object3;
        Object object2 = new HashMap(iterator.size());
        Iterator object32 = iterator.iterator();
        while (object32.hasNext()) {
            ax.D7.c c8 = (ax.D7.c)object32.next();
            b b8 = new b(c8);
            for (Object object3 : c8.j()) {
                Object object4;
                Object object5 = new c((F)object3, c8.p() ^ true);
                if (!object2.containsKey(object5)) {
                    object2.put(object5, new HashSet());
                }
                if (!(object4 = (Set)object2.get(object5)).isEmpty() && !((c)object5).b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", object3));
                }
                object4.add(b8);
            }
        }
        object3 = object2.values().iterator();
        while (object3.hasNext()) {
            for (Object object5 : (Set)object3.next()) {
                for (r r8 : ((b)object5).c().g()) {
                    Set set;
                    if (!r8.e() || (set = (Set)object2.get(new c(r8.c(), r8.g()))) == null) continue;
                    for (Object object4 : set) {
                        ((b)object5).a((b)object4);
                        ((b)object4).b((b)object5);
                    }
                }
            }
        }
        iterator = new HashSet();
        object2 = object2.values().iterator();
        while (object2.hasNext()) {
            ((AbstractCollection)((Object)iterator)).addAll((Set)object2.next());
        }
        return iterator;
    }

    private static class b {
        private final ax.D7.c<?> a;
        private final Set<b> b = new HashSet<b>();
        private final Set<b> c = new HashSet<b>();

        b(ax.D7.c<?> c8) {
            this.a = c8;
        }

        void a(b b8) {
            this.b.add(b8);
        }

        void b(b b8) {
            this.c.add(b8);
        }

        ax.D7.c<?> c() {
            return this.a;
        }

        Set<b> d() {
            return this.b;
        }

        boolean e() {
            return this.b.isEmpty();
        }

        boolean f() {
            return this.c.isEmpty();
        }

        void g(b b8) {
            this.c.remove(b8);
        }
    }

    private static class c {
        private final F<?> a;
        private final boolean b;

        private c(F<?> f8, boolean bl) {
            this.a = f8;
            this.b = bl;
        }

        public boolean equals(Object object) {
            if (object instanceof c) {
                object = (c)object;
                if (((c)object).a.equals(this.a) && ((c)object).b == this.b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ Boolean.valueOf(this.b).hashCode();
        }
    }
}

