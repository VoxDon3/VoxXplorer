/*
 * Decompiled with CFR 0.152.
 */
package ax.gc;

import ax.gc.c;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class a<T>
implements Set<T> {
    private static final AtomicLong f0 = new AtomicLong();
    protected final ReentrantReadWriteLock c0;
    private final Map<T, c<T>> d0;
    protected a<T> e0;
    private final long q = f0.getAndIncrement();

    protected a(Map<T, c<T>> map) {
        this.c0 = new ReentrantReadWriteLock();
        this.d0 = map;
    }

    private boolean g(T t8) {
        if (!this.d0.containsKey(t8)) {
            a<T> a8 = this.e(t8, this.e0);
            this.e0 = a8;
            this.d0.put(t8, a8);
            return true;
        }
        return false;
    }

    @Override
    public boolean add(T t8) {
        if (t8 == null) {
            return false;
        }
        ReentrantReadWriteLock.WriteLock writeLock = this.c0.writeLock();
        try {
            writeLock.lock();
            boolean bl = this.g(t8);
            return bl;
        }
        finally {
            writeLock.unlock();
        }
    }

    @Override
    public boolean addAll(Collection<? extends T> object) {
        Throwable throwable2;
        ReentrantReadWriteLock.WriteLock writeLock;
        block6: {
            boolean bl;
            block5: {
                Object e8;
                writeLock = this.c0.writeLock();
                try {
                    writeLock.lock();
                    object = object.iterator();
                    bl = false;
                }
                catch (Throwable throwable2) {}
                while (true) {
                    if (!object.hasNext()) break block5;
                    e8 = object.next();
                    if (e8 == null) continue;
                    break;
                }
                {
                    boolean bl2 = this.g(e8);
                    bl |= bl2;
                    continue;
                }
                break block6;
            }
            writeLock.unlock();
            return bl;
        }
        writeLock.unlock();
        throw throwable2;
    }

    @Override
    public void clear() {
        ReentrantReadWriteLock.WriteLock writeLock = this.c0.writeLock();
        try {
            writeLock.lock();
            this.e0 = null;
            this.d0.clear();
            return;
        }
        finally {
            writeLock.unlock();
        }
    }

    @Override
    public boolean contains(Object c8) {
        ReentrantReadWriteLock.ReadLock readLock = this.c0.readLock();
        try {
            readLock.lock();
            c8 = this.d0.get(c8);
            return c8 != null && c8.getValue() != null;
        }
        finally {
            readLock.unlock();
        }
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Not implemented");
    }

    protected abstract a<T> e(T var1, a<T> var2);

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        object = (a)object;
        return this.q == ((a)object).q;
    }

    @Override
    public int hashCode() {
        long l8 = this.q;
        return 31 + (int)(l8 ^ l8 >>> 32);
    }

    @Override
    public boolean isEmpty() {
        return this.e0 == null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean remove(Object object) {
        Throwable throwable2;
        ReentrantReadWriteLock.WriteLock writeLock;
        block6: {
            block8: {
                a<T> a8;
                block7: {
                    c<T> c8;
                    if (!this.contains(object)) {
                        return false;
                    }
                    writeLock = this.c0.writeLock();
                    try {
                        writeLock.lock();
                        c8 = this.d0.get(object);
                        if (c8 == null) {
                            writeLock.unlock();
                            return false;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    {
                        a8 = this.e0;
                        if (c8 == a8) break block7;
                    }
                    c8.remove();
                    break block8;
                }
                this.e0 = a8.a();
            }
            this.d0.remove(object);
            writeLock.unlock();
            return true;
        }
        writeLock.unlock();
        throw throwable2;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public int size() {
        return this.d0.size();
    }

    @Override
    public Object[] toArray() {
        return this.d0.entrySet().toArray();
    }

    @Override
    public <T> T[] toArray(T[] TArray) {
        return this.d0.entrySet().toArray(TArray);
    }

    public static abstract class a<T>
    implements c<T> {
        private a<T> a;
        private a<T> b;

        protected a() {
        }

        protected a(a<T> a8) {
            this.a = a8;
            a8.b = this;
        }

        public a<T> a() {
            return this.a;
        }

        @Override
        public void remove() {
            a<T> a8 = this.b;
            if (a8 != null) {
                a8.a = this.a;
                a<T> a9 = this.a;
                if (a9 != null) {
                    a9.b = a8;
                    return;
                }
            } else {
                a8 = this.a;
                if (a8 != null) {
                    a8.b = null;
                }
            }
        }
    }
}

