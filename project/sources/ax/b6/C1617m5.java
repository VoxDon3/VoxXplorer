package ax.b6;

import j$.util.DesugarCollections;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: ax.b6.m5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1617m5<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private Map<K, V> c0;
    private boolean d0;
    private volatile C1704x5 e0;
    private Map<K, V> f0;
    private volatile C1649q5 g0;
    private List<C1664s5> q;

    private final int b(K k) {
        int i;
        int size = this.q.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = k.compareTo((Comparable) this.q.get(i2).getKey());
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = k.compareTo((Comparable) this.q.get(i4).getKey());
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V i(int i) {
        q();
        V v = (V) this.q.remove(i).getValue();
        if (!this.c0.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = p().entrySet().iterator();
            this.q.add(new C1664s5(this, it.next()));
            it.remove();
        }
        return v;
    }

    private final SortedMap<K, V> p() {
        q();
        if (this.c0.isEmpty() && !(this.c0 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c0 = treeMap;
            this.f0 = treeMap.descendingMap();
        }
        return (SortedMap) this.c0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        if (this.d0) {
            throw new UnsupportedOperationException();
        }
    }

    public final int a() {
        return this.q.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        q();
        if (!this.q.isEmpty()) {
            this.q.clear();
        }
        if (this.c0.isEmpty()) {
            return;
        }
        this.c0.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return b(comparable) >= 0 || this.c0.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        q();
        int b = b(k);
        if (b >= 0) {
            return (V) this.q.get(b).setValue(v);
        }
        q();
        if (this.q.isEmpty() && !(this.q instanceof ArrayList)) {
            this.q = new ArrayList(16);
        }
        int i = -(b + 1);
        if (i >= 16) {
            return p().put(k, v);
        }
        if (this.q.size() == 16) {
            C1664s5 remove = this.q.remove(15);
            p().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.q.add(i, new C1664s5(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.e0 == null) {
            this.e0 = new C1704x5(this);
        }
        return this.e0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1617m5)) {
            return super.equals(obj);
        }
        C1617m5 c1617m5 = (C1617m5) obj;
        int size = size();
        if (size != c1617m5.size()) {
            return false;
        }
        int a = a();
        if (a != c1617m5.a()) {
            return entrySet().equals(c1617m5.entrySet());
        }
        for (int i = 0; i < a; i++) {
            if (!f(i).equals(c1617m5.f(i))) {
                return false;
            }
        }
        if (a != size) {
            return this.c0.equals(c1617m5.c0);
        }
        return true;
    }

    public final Map.Entry<K, V> f(int i) {
        return this.q.get(i);
    }

    public final Iterable<Map.Entry<K, V>> g() {
        return this.c0.isEmpty() ? Collections.EMPTY_SET : this.c0.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int b = b(comparable);
        return b >= 0 ? (V) this.q.get(b).getValue() : this.c0.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int a = a();
        int i = 0;
        for (int i2 = 0; i2 < a; i2++) {
            i += this.q.get(i2).hashCode();
        }
        return this.c0.size() > 0 ? i + this.c0.hashCode() : i;
    }

    final Set<Map.Entry<K, V>> l() {
        if (this.g0 == null) {
            this.g0 = new C1649q5(this);
        }
        return this.g0;
    }

    public void m() {
        if (this.d0) {
            return;
        }
        this.c0 = this.c0.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(this.c0);
        this.f0 = this.f0.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(this.f0);
        this.d0 = true;
    }

    public final boolean o() {
        return this.d0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        q();
        Comparable comparable = (Comparable) obj;
        int b = b(comparable);
        if (b >= 0) {
            return (V) i(b);
        }
        if (this.c0.isEmpty()) {
            return null;
        }
        return this.c0.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.q.size() + this.c0.size();
    }

    private C1617m5() {
        this.q = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.c0 = map;
        this.f0 = map;
    }
}
