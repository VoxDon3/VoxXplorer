/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class D<K>
implements Iterable<K> {
    final Set<K> c0;
    final Set<K> q = new LinkedHashSet<K>();

    D() {
        this.c0 = new LinkedHashSet<K>();
    }

    private boolean h(D<?> d8) {
        return this.q.equals(d8.q) && this.c0.equals(d8.c0);
    }

    boolean add(K k8) {
        return this.q.add(k8);
    }

    void clear() {
        this.q.clear();
    }

    public boolean contains(K k8) {
        return this.q.contains(k8) || this.c0.contains(k8);
        {
        }
    }

    void e() {
        this.c0.clear();
    }

    public boolean equals(Object object) {
        return this == object || object instanceof D && this.h((D)object);
        {
        }
    }

    void g(D<K> d8) {
        this.q.clear();
        this.q.addAll(d8.q);
        this.c0.clear();
        this.c0.addAll(d8.c0);
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

    @Override
    public Iterator<K> iterator() {
        return this.q.iterator();
    }

    Map<K, Boolean> k(Set<K> object3) {
        LinkedHashMap<Object, Boolean> linkedHashMap = new LinkedHashMap<Object, Boolean>();
        for (Object object : this.c0) {
            if (object3.contains(object) || this.q.contains(object)) continue;
            linkedHashMap.put(object, Boolean.FALSE);
        }
        for (Iterator<Object> iterator2 : this.q) {
            if (object3.contains(iterator2)) continue;
            linkedHashMap.put(iterator2, Boolean.FALSE);
        }
        Iterator iterator = object3.iterator();
        while (iterator.hasNext()) {
            Iterator<Object> iterator2;
            iterator2 = iterator.next();
            if (this.q.contains(iterator2) || this.c0.contains(iterator2)) continue;
            linkedHashMap.put(iterator2, Boolean.TRUE);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object object;
            object = entry.getKey();
            if (((Boolean)entry.getValue()).booleanValue()) {
                this.c0.add(object);
                continue;
            }
            this.c0.remove(object);
        }
        return linkedHashMap;
    }

    boolean remove(K k8) {
        return this.q.remove(k8);
    }

    public int size() {
        return this.q.size() + this.c0.size();
    }

    public String toString() {
        if (this.size() <= 0) {
            return "size=0, items=[]";
        }
        StringBuilder stringBuilder = new StringBuilder(this.size() * 28);
        stringBuilder.append("Selection{");
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("primary{size=");
        stringBuilder2.append(this.q.size());
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(", entries=");
        stringBuilder2.append(this.q);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("}, provisional{size=");
        stringBuilder2.append(this.c0.size());
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(", entries=");
        stringBuilder2.append(this.c0);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}

