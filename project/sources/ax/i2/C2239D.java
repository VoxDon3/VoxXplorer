package ax.i2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: ax.i2.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2239D<K> implements Iterable<K> {
    final Set<K> q = new LinkedHashSet();
    final Set<K> c0 = new LinkedHashSet();

    C2239D() {
    }

    private boolean h(C2239D<?> c2239d) {
        return this.q.equals(c2239d.q) && this.c0.equals(c2239d.c0);
    }

    boolean add(K k) {
        return this.q.add(k);
    }

    void clear() {
        this.q.clear();
    }

    public boolean contains(K k) {
        return this.q.contains(k) || this.c0.contains(k);
    }

    void e() {
        this.c0.clear();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C2239D) && h((C2239D) obj);
        }
        return true;
    }

    void g(C2239D<K> c2239d) {
        this.q.clear();
        this.q.addAll(c2239d.q);
        this.c0.clear();
        this.c0.addAll(c2239d.c0);
    }

    public int hashCode() {
        return this.q.hashCode() ^ this.c0.hashCode();
    }

    void i() {
        this.q.addAll(this.c0);
        this.c0.clear();
    }

    public boolean isEmpty() {
        return this.q.isEmpty() && this.c0.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<K> iterator() {
        return this.q.iterator();
    }

    Map<K, Boolean> k(Set<K> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (K k : this.c0) {
            if (!set.contains(k) && !this.q.contains(k)) {
                linkedHashMap.put(k, Boolean.FALSE);
            }
        }
        for (K k2 : this.q) {
            if (!set.contains(k2)) {
                linkedHashMap.put(k2, Boolean.FALSE);
            }
        }
        for (K k3 : set) {
            if (!this.q.contains(k3) && !this.c0.contains(k3)) {
                linkedHashMap.put(k3, Boolean.TRUE);
            }
        }
        for (Map.Entry<K, Boolean> entry : linkedHashMap.entrySet()) {
            K key = entry.getKey();
            if (entry.getValue().booleanValue()) {
                this.c0.add(key);
            } else {
                this.c0.remove(key);
            }
        }
        return linkedHashMap;
    }

    boolean remove(K k) {
        return this.q.remove(k);
    }

    public int size() {
        return this.q.size() + this.c0.size();
    }

    public String toString() {
        if (size() <= 0) {
            return "size=0, items=[]";
        }
        StringBuilder sb = new StringBuilder(size() * 28);
        sb.append("Selection{");
        sb.append("primary{size=" + this.q.size());
        sb.append(", entries=" + this.q);
        sb.append("}, provisional{size=" + this.c0.size());
        sb.append(", entries=" + this.c0);
        sb.append("}}");
        return sb.toString();
    }
}
