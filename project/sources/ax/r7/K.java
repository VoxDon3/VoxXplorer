package ax.r7;

import ax.q7.C2883j;
import ax.q7.InterfaceC2879f;
import ax.r7.d0;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class K {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    class a<K, V> extends h0<Map.Entry<K, V>, V> {
        a(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.r7.h0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public V b(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class b implements InterfaceC2879f<Map.Entry<?, ?>, Object> {
        public static final b q = new a("KEY", 0);
        public static final b c0 = new C0440b("VALUE", 1);
        private static final /* synthetic */ b[] d0 = d();

        enum a extends b {
            a(String str, int i) {
                super(str, i, null);
            }

            @Override // ax.q7.InterfaceC2879f
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* renamed from: ax.r7.K$b$b, reason: collision with other inner class name */
        enum C0440b extends b {
            C0440b(String str, int i) {
                super(str, i, null);
            }

            @Override // ax.q7.InterfaceC2879f
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private b(String str, int i) {
        }

        private static /* synthetic */ b[] d() {
            return new b[]{q, c0};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d0.clone();
        }

        /* synthetic */ b(String str, int i, J j) {
            this(str, i);
        }
    }

    static abstract class c<K, V> extends d0.d<Map.Entry<K, V>> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        abstract Map<K, V> e();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return e().isEmpty();
        }

        @Override // ax.r7.d0.d, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) ax.q7.n.n(collection));
            } catch (UnsupportedOperationException unused) {
                return d0.j(this, collection.iterator());
            }
        }

        @Override // ax.r7.d0.d, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) ax.q7.n.n(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet g = d0.g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        g.add(((Map.Entry) obj).getKey());
                    }
                }
                return e().keySet().retainAll(g);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return e().size();
        }
    }

    static class d<K, V> extends d0.d<K> {
        final Map<K, V> q;

        d(Map<K, V> map) {
            this.q = (Map) ax.q7.n.n(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return e().containsKey(obj);
        }

        Map<K, V> e() {
            return this.q;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return e().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return e().size();
        }
    }

    static class e<K, V> extends AbstractCollection<V> {
        final Map<K, V> q;

        e(Map<K, V> map) {
            this.q = (Map) ax.q7.n.n(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return e().containsValue(obj);
        }

        final Map<K, V> e() {
            return this.q;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return e().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return K.l(e().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : e().entrySet()) {
                    if (C2883j.a(obj, entry.getValue())) {
                        e().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) ax.q7.n.n(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f = d0.f();
                for (Map.Entry<K, V> entry : e().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f.add(entry.getKey());
                    }
                }
                return e().keySet().removeAll(f);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) ax.q7.n.n(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f = d0.f();
                for (Map.Entry<K, V> entry : e().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f.add(entry.getKey());
                    }
                }
                return e().keySet().retainAll(f);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return e().size();
        }
    }

    static abstract class f<K, V> extends AbstractMap<K, V> {
        private transient Collection<V> c0;
        private transient Set<Map.Entry<K, V>> q;

        f() {
        }

        abstract Set<Map.Entry<K, V>> a();

        Collection<V> b() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.q;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> a = a();
            this.q = a;
            return a;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.c0;
            if (collection != null) {
                return collection;
            }
            Collection<V> b = b();
            this.c0 = b;
            return b;
        }
    }

    static int a(int i) {
        if (i >= 3) {
            return i < 1073741824 ? (int) Math.ceil(i / 0.75d) : SubsamplingScaleImageView.TILE_SIZE_AUTO;
        }
        C2975i.b(i, "expectedSize");
        return i + 1;
    }

    static boolean b(Map<?, ?> map, Object obj) {
        return G.e(l(map.entrySet().iterator()), obj);
    }

    static boolean c(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> Map.Entry<K, V> d(K k, V v) {
        return new C2990y(k, v);
    }

    static <K> InterfaceC2879f<Map.Entry<K, ?>, K> e() {
        return b.q;
    }

    public static <K, V> IdentityHashMap<K, V> f() {
        return new IdentityHashMap<>();
    }

    static boolean g(Map<?, ?> map, Object obj) {
        ax.q7.n.n(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static <V> V h(Map<?, V> map, Object obj) {
        ax.q7.n.n(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static <V> V i(Map<?, V> map, Object obj) {
        ax.q7.n.n(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static String j(Map<?, ?> map) {
        StringBuilder b2 = C2976j.b(map.size());
        b2.append('{');
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                b2.append(", ");
            }
            b2.append(entry.getKey());
            b2.append('=');
            b2.append(entry.getValue());
            z = false;
        }
        b2.append('}');
        return b2.toString();
    }

    static <V> InterfaceC2879f<Map.Entry<?, V>, V> k() {
        return b.c0;
    }

    static <K, V> Iterator<V> l(Iterator<Map.Entry<K, V>> it) {
        return new a(it);
    }
}
