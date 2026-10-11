package ax.gc;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: ax.gc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2135a<T> implements Set<T> {
    private static final AtomicLong f0 = new AtomicLong();
    private final Map<T, InterfaceC2137c<T>> d0;
    protected AbstractC0319a<T> e0;
    private final long q = f0.getAndIncrement();
    protected final ReentrantReadWriteLock c0 = new ReentrantReadWriteLock();

    protected AbstractC2135a(Map<T, InterfaceC2137c<T>> map) {
        this.d0 = map;
    }

    private boolean g(T t) {
        if (this.d0.containsKey(t)) {
            return false;
        }
        AbstractC0319a<T> e = e(t, this.e0);
        this.e0 = e;
        this.d0.put(t, e);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(T t) {
        if (t == null) {
            return false;
        }
        ReentrantReadWriteLock.WriteLock writeLock = this.c0.writeLock();
        try {
            writeLock.lock();
            return g(t);
        } finally {
            writeLock.unlock();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        ReentrantReadWriteLock.WriteLock writeLock = this.c0.writeLock();
        try {
            writeLock.lock();
            boolean z = false;
            for (T t : collection) {
                if (t != null) {
                    z |= g(t);
                }
            }
            return z;
        } finally {
            writeLock.unlock();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        ReentrantReadWriteLock.WriteLock writeLock = this.c0.writeLock();
        try {
            writeLock.lock();
            this.e0 = null;
            this.d0.clear();
        } finally {
            writeLock.unlock();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        ReentrantReadWriteLock.ReadLock readLock = this.c0.readLock();
        try {
            readLock.lock();
            InterfaceC2137c<T> interfaceC2137c = this.d0.get(obj);
            return (interfaceC2137c == null || interfaceC2137c.getValue() == null) ? false : true;
        } finally {
            readLock.unlock();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Not implemented");
    }

    protected abstract AbstractC0319a<T> e(T t, AbstractC0319a<T> abstractC0319a);

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.q == ((AbstractC2135a) obj).q;
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        long j = this.q;
        return 31 + ((int) (j ^ (j >>> 32)));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.e0 == null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        ReentrantReadWriteLock.WriteLock writeLock = this.c0.writeLock();
        try {
            writeLock.lock();
            InterfaceC2137c<T> interfaceC2137c = this.d0.get(obj);
            if (interfaceC2137c == null) {
                writeLock.unlock();
                return false;
            }
            AbstractC0319a<T> abstractC0319a = this.e0;
            if (interfaceC2137c != abstractC0319a) {
                interfaceC2137c.remove();
            } else {
                this.e0 = abstractC0319a.next();
            }
            this.d0.remove(obj);
            writeLock.unlock();
            return true;
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.d0.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.d0.entrySet().toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.d0.entrySet().toArray(tArr);
    }

    /* renamed from: ax.gc.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0319a<T> implements InterfaceC2137c<T> {
        private AbstractC0319a<T> a;
        private AbstractC0319a<T> b;

        protected AbstractC0319a(AbstractC0319a<T> abstractC0319a) {
            this.a = abstractC0319a;
            abstractC0319a.b = this;
        }

        @Override // ax.gc.InterfaceC2137c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC0319a<T> next() {
            return this.a;
        }

        @Override // ax.gc.InterfaceC2137c
        public void remove() {
            AbstractC0319a<T> abstractC0319a = this.b;
            if (abstractC0319a == null) {
                AbstractC0319a<T> abstractC0319a2 = this.a;
                if (abstractC0319a2 != null) {
                    abstractC0319a2.b = null;
                    return;
                }
                return;
            }
            abstractC0319a.a = this.a;
            AbstractC0319a<T> abstractC0319a3 = this.a;
            if (abstractC0319a3 != null) {
                abstractC0319a3.b = abstractC0319a;
            }
        }

        protected AbstractC0319a() {
        }
    }
}
