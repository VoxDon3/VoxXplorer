/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.E;
import ax.r0.S;
import java.util.Iterator;
import java.util.Map;

public class D
extends E {
    private final S f;

    @Override
    public boolean equals(Object object) {
        return this.f().equals(object);
    }

    public S f() {
        return this.c(this.f);
    }

    @Override
    public int hashCode() {
        return this.f().hashCode();
    }

    public String toString() {
        return this.f().toString();
    }

    static class b<K>
    implements Map.Entry<K, Object> {
        private Map.Entry<K, D> q;

        private b(Map.Entry<K, D> entry) {
            this.q = entry;
        }

        public D a() {
            return this.q.getValue();
        }

        @Override
        public K getKey() {
            return this.q.getKey();
        }

        @Override
        public Object getValue() {
            D d8 = this.q.getValue();
            if (d8 == null) {
                return null;
            }
            return d8.f();
        }

        @Override
        public Object setValue(Object object) {
            if (object instanceof S) {
                return this.q.getValue().d((S)object);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    static class c<K>
    implements Iterator<Map.Entry<K, Object>> {
        private Iterator<Map.Entry<K, Object>> q;

        public c(Iterator<Map.Entry<K, Object>> iterator) {
            this.q = iterator;
        }

        public Map.Entry<K, Object> b() {
            Map.Entry<K, Object> entry = this.q.next();
            if (entry.getValue() instanceof D) {
                return new b(entry);
            }
            return entry;
        }

        @Override
        public boolean hasNext() {
            return this.q.hasNext();
        }

        @Override
        public void remove() {
            this.q.remove();
        }
    }
}

