/*
 * Decompiled with CFR 0.152.
 */
package ax.H8;

import ax.I8.a;
import ax.I8.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class d {
    private b a = new b("<root>");

    public void a(ax.H8.b object) {
        object = ((ax.H8.b)object).a();
        this.a.c((List<String>)object);
    }

    public a b(ax.H8.b object) {
        object = ((ax.H8.b)object).a();
        return this.a.d(object.iterator());
    }

    public void c(a a8) {
        List<String> list = new ax.H8.b(a8.a).a();
        this.a.a(list.iterator(), a8);
    }

    public static class a {
        private final String a;
        private final a.b b;
        private final boolean c;
        private final int d;
        private final long e;
        private final boolean f;
        private int g = 0;
        private final List<c> h;

        public a(f object, ax.H8.c object2) {
            int n8;
            List<ax.I8.a> list = ((f)object).a();
            Object object3 = list.iterator();
            while (object3.hasNext()) {
                if (object3.next().d() != null) continue;
                throw new IllegalStateException("Path cannot be null for a ReferralCacheEntry?");
            }
            object3 = list.get(0);
            this.a = ((ax.I8.a)object3).b();
            this.b = ((ax.I8.a)object3).f();
            boolean bl = ((f)object).b().contains(f.a.c0);
            boolean bl2 = true;
            bl = bl && !((f)object).b().contains(f.a.d0);
            boolean bl3 = bl;
            if (!bl) {
                bl3 = bl;
                if (list.size() == 1) {
                    bl = ((ax.H8.c)object2).a(new ax.H8.b(((ax.I8.a)object3).d()).a().get(0)) != null ? bl2 : false;
                    bl3 = bl;
                }
            }
            this.c = bl3;
            this.d = n8 = ((ax.I8.a)object3).h();
            this.e = System.currentTimeMillis() + (long)n8 * 1000L;
            this.f = ((f)object).b().contains(f.a.e0);
            object = new ArrayList(list.size());
            object2 = list.iterator();
            while (object2.hasNext()) {
                object.add(new c(((ax.I8.a)object2.next()).d(), false));
            }
            this.h = java.util.DesugarCollections.unmodifiableList((List)object);
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
            return this.f() && this.c;
        }

        public boolean f() {
            return this.b == a.b.c0;
        }

        public boolean g() {
            return this.b == a.b.d0;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public c h() {
            synchronized (this) {
                try {
                    if (this.g >= this.h.size() - 1) return null;
                    ++this.g;
                    return this.c();
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("->");
            stringBuilder.append(this.c().a);
            stringBuilder.append("(");
            stringBuilder.append(this.b);
            stringBuilder.append("), ");
            stringBuilder.append(this.h);
            return stringBuilder.toString();
        }
    }

    static class b {
        static final AtomicReferenceFieldUpdater<b, a> d = AtomicReferenceFieldUpdater.newUpdater(b.class, a.class, "c");
        private final String a;
        private final Map<String, b> b = new j.ConcurrentHashMap();
        private volatile a c;

        b(String string) {
            this.a = string;
        }

        void a(Iterator<String> iterator, a a8) {
            if (iterator.hasNext()) {
                String string = iterator.next().toLowerCase();
                Object object = this.b.get(string);
                b b8 = object;
                if (object == null) {
                    object = this.b;
                    b8 = new b(string);
                    object.put(string, b8);
                }
                b8.a(iterator, a8);
                return;
            }
            d.set(this, a8);
        }

        void b() {
            this.b.clear();
            d.set(this, null);
        }

        void c(List<String> list) {
            if (this.c != null && this.c.d() && !this.c.g()) {
                this.b();
                return;
            }
            if (list != null && !list.isEmpty()) {
                Object object = list.get(0).toLowerCase();
                if ((object = this.b.get(object)) != null) {
                    ((b)object).c(list.subList(1, list.size()));
                }
            }
        }

        a d(Iterator<String> iterator) {
            if (iterator.hasNext()) {
                Object object = iterator.next().toLowerCase();
                if ((object = this.b.get(object)) != null) {
                    return ((b)object).d(iterator);
                }
            }
            return d.get(this);
        }
    }

    public static class c {
        final ax.H8.b a;
        final boolean b;

        public c(String string, boolean bl) {
            this.a = new ax.H8.b(string);
            this.b = bl;
        }

        public ax.H8.b a() {
            return this.a;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TargetSetEntry[");
            stringBuilder.append(this.a);
            stringBuilder.append(",targetSetBoundary=");
            stringBuilder.append(this.b);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }
}

