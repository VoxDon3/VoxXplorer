package ax.H8;

import ax.I8.a;
import ax.I8.f;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public class d {
    private b a = new b("<root>");

    public static class a {
        private final String a;
        private final a.b b;
        private final boolean c;
        private final int d;
        private final long e;
        private final boolean f;
        private int g = 0;
        private final List<c> h;

        public a(f fVar, ax.H8.c cVar) {
            List<ax.I8.a> a = fVar.a();
            Iterator<ax.I8.a> it = a.iterator();
            while (it.hasNext()) {
                if (it.next().d() == null) {
                    throw new IllegalStateException("Path cannot be null for a ReferralCacheEntry?");
                }
            }
            ax.I8.a aVar = a.get(0);
            this.a = aVar.b();
            this.b = aVar.f();
            boolean z = fVar.b().contains(f.a.ReferralServers) && !fVar.b().contains(f.a.StorageServers);
            if (!z && a.size() == 1) {
                z = cVar.a(new ax.H8.b(aVar.d()).a().get(0)) != null;
            }
            this.c = z;
            int h = aVar.h();
            this.d = h;
            this.e = System.currentTimeMillis() + (h * 1000);
            this.f = fVar.b().contains(f.a.TargetFailback);
            ArrayList arrayList = new ArrayList(a.size());
            Iterator<ax.I8.a> it2 = a.iterator();
            while (it2.hasNext()) {
                arrayList.add(new c(it2.next().d(), false));
            }
            this.h = DesugarCollections.unmodifiableList(arrayList);
        }

        public String b() {
            return this.a;
        }

        public c c() {
            return this.h.get(this.g);
        }

        public boolean d() {
            return System.currentTimeMillis() > this.e;
        }

        public boolean e() {
            return f() && this.c;
        }

        public boolean f() {
            return this.b == a.b.LINK;
        }

        public boolean g() {
            return this.b == a.b.ROOT;
        }

        public synchronized c h() {
            if (this.g >= this.h.size() - 1) {
                return null;
            }
            this.g++;
            return c();
        }

        public String toString() {
            return this.a + "->" + c().a + "(" + this.b + "), " + this.h;
        }
    }

    static class b {
        static final AtomicReferenceFieldUpdater<b, a> d = AtomicReferenceFieldUpdater.newUpdater(b.class, a.class, "c");
        private final String a;
        private final Map<String, b> b = new ConcurrentHashMap();
        private volatile a c;

        b(String str) {
            this.a = str;
        }

        void a(Iterator<String> it, a aVar) {
            if (!it.hasNext()) {
                d.set(this, aVar);
                return;
            }
            String lowerCase = it.next().toLowerCase();
            b bVar = this.b.get(lowerCase);
            if (bVar == null) {
                Map<String, b> map = this.b;
                b bVar2 = new b(lowerCase);
                map.put(lowerCase, bVar2);
                bVar = bVar2;
            }
            bVar.a(it, aVar);
        }

        void b() {
            this.b.clear();
            d.set(this, null);
        }

        void c(List<String> list) {
            if (this.c != null && this.c.d() && !this.c.g()) {
                b();
                return;
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            b bVar = this.b.get(list.get(0).toLowerCase());
            if (bVar != null) {
                bVar.c(list.subList(1, list.size()));
            }
        }

        a d(Iterator<String> it) {
            if (it.hasNext()) {
                b bVar = this.b.get(it.next().toLowerCase());
                if (bVar != null) {
                    return bVar.d(it);
                }
            }
            return d.get(this);
        }
    }

    public static class c {
        final ax.H8.b a;
        final boolean b;

        public c(String str, boolean z) {
            this.a = new ax.H8.b(str);
            this.b = z;
        }

        public ax.H8.b a() {
            return this.a;
        }

        public String toString() {
            return "TargetSetEntry[" + this.a + ",targetSetBoundary=" + this.b + "]";
        }
    }

    public void a(ax.H8.b bVar) {
        this.a.c(bVar.a());
    }

    public a b(ax.H8.b bVar) {
        return this.a.d(bVar.a().iterator());
    }

    public void c(a aVar) {
        this.a.a(new ax.H8.b(aVar.a).a().iterator(), aVar);
    }
}
