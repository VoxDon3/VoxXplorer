package ax.D7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
class q {

    private static class b {
        private final C0661c<?> a;
        private final Set<b> b = new HashSet();
        private final Set<b> c = new HashSet();

        b(C0661c<?> c0661c) {
            this.a = c0661c;
        }

        void a(b bVar) {
            this.b.add(bVar);
        }

        void b(b bVar) {
            this.c.add(bVar);
        }

        C0661c<?> c() {
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

        void g(b bVar) {
            this.c.remove(bVar);
        }
    }

    private static class c {
        private final F<?> a;
        private final boolean b;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.a.equals(this.a) && cVar.b == this.b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
        }

        private c(F<?> f, boolean z) {
            this.a = f;
            this.b = z;
        }
    }

    static void a(List<C0661c<?>> list) {
        Set<b> c2 = c(list);
        Set<b> b2 = b(c2);
        int i = 0;
        while (!b2.isEmpty()) {
            b next = b2.iterator().next();
            b2.remove(next);
            i++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    b2.add(bVar);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : c2) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new s(arrayList);
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<C0661c<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator<C0661c<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (r rVar : bVar.c().g()) {
                            if (rVar.e() && (set = (Set) hashMap.get(new c(rVar.c(), rVar.g()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            C0661c<?> next = it.next();
            b bVar3 = new b(next);
            for (F<? super Object> f : next.j()) {
                c cVar = new c(f, !next.p());
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar);
                if (!set2.isEmpty() && !cVar.b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", f));
                }
                set2.add(bVar3);
            }
        }
    }
}
