package ax.r0;

import java.util.Iterator;
import java.util.Map;

/* renamed from: ax.r0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2907D extends C2908E {
    private final S f;

    /* renamed from: ax.r0.D$b */
    static class b<K> implements Map.Entry<K, Object> {
        private Map.Entry<K, C2907D> q;

        public C2907D a() {
            return this.q.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.q.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            C2907D value = this.q.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof S) {
                return this.q.getValue().d((S) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, C2907D> entry) {
            this.q = entry;
        }
    }

    /* renamed from: ax.r0.D$c */
    static class c<K> implements Iterator<Map.Entry<K, Object>> {
        private Iterator<Map.Entry<K, Object>> q;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.q = it;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.q.next();
            return next.getValue() instanceof C2907D ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.q.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.q.remove();
        }
    }

    @Override // ax.r0.C2908E
    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public S f() {
        return c(this.f);
    }

    @Override // ax.r0.C2908E
    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
