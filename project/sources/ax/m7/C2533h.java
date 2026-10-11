package ax.m7;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: ax.m7.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2533h extends AbstractMap<String, Object> {
    final C2531f c0;
    final Object q;

    /* renamed from: ax.m7.h$a */
    final class a implements Map.Entry<String, Object> {
        private final C2535j c0;
        private Object q;

        a(C2535j c2535j, Object obj) {
            this.c0 = c2535j;
            this.q = v.d(obj);
        }

        @Override // java.util.Map.Entry
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String getKey() {
            String e = this.c0.e();
            return C2533h.this.c0.d() ? e.toLowerCase(Locale.US) : e;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return getKey().equals(entry.getKey()) && getValue().equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.q;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return getKey().hashCode() ^ getValue().hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.q;
            this.q = v.d(obj);
            this.c0.m(C2533h.this.q, obj);
            return obj2;
        }
    }

    /* renamed from: ax.m7.h$b */
    final class b implements Iterator<Map.Entry<String, Object>> {
        private C2535j c0;
        private Object d0;
        private boolean e0;
        private boolean f0;
        private C2535j g0;
        private int q = -1;

        b() {
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<String, Object> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            C2535j c2535j = this.c0;
            this.g0 = c2535j;
            Object obj = this.d0;
            this.f0 = false;
            this.e0 = false;
            this.c0 = null;
            this.d0 = null;
            return C2533h.this.new a(c2535j, obj);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f0) {
                this.f0 = true;
                this.d0 = null;
                while (this.d0 == null) {
                    int i = this.q + 1;
                    this.q = i;
                    if (i >= C2533h.this.c0.d.size()) {
                        break;
                    }
                    C2531f c2531f = C2533h.this.c0;
                    C2535j b = c2531f.b(c2531f.d.get(this.q));
                    this.c0 = b;
                    this.d0 = b.g(C2533h.this.q);
                }
            }
            return this.d0 != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            v.g((this.g0 == null || this.e0) ? false : true);
            this.e0 = true;
            this.g0.m(C2533h.this.q, null);
        }
    }

    /* renamed from: ax.m7.h$c */
    final class c extends AbstractSet<Map.Entry<String, Object>> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Iterator<String> it = C2533h.this.c0.d.iterator();
            while (it.hasNext()) {
                C2533h.this.c0.b(it.next()).m(C2533h.this.q, null);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public b iterator() {
            return C2533h.this.new b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            Iterator<String> it = C2533h.this.c0.d.iterator();
            while (it.hasNext()) {
                if (C2533h.this.c0.b(it.next()).g(C2533h.this.q) != null) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<String> it = C2533h.this.c0.d.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (C2533h.this.c0.b(it.next()).g(C2533h.this.q) != null) {
                    i++;
                }
            }
            return i;
        }
    }

    C2533h(Object obj, boolean z) {
        this.q = obj;
        this.c0 = C2531f.f(obj.getClass(), z);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c entrySet() {
        return new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object put(String str, Object obj) {
        C2535j b2 = this.c0.b(str);
        v.e(b2, "no field of key " + str);
        Object g = b2.g(this.q);
        b2.m(this.q, v.d(obj));
        return g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        C2535j b2;
        if ((obj instanceof String) && (b2 = this.c0.b((String) obj)) != null) {
            return b2.g(this.q);
        }
        return null;
    }
}
