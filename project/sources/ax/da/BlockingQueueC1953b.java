package ax.da;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.HttpUrl;

/* renamed from: ax.da.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class BlockingQueueC1953b<E> extends AbstractQueue<E> implements BlockingQueue, Queue, Serializable {
    transient d<E> c0;
    private transient int d0;
    private final int e0;
    final ReentrantLock f0;
    private final Condition g0;
    private final Condition h0;
    transient d<E> q;

    /* renamed from: ax.da.b$b, reason: collision with other inner class name */
    private abstract class AbstractC0289b implements Iterator<E> {
        E c0;
        private d<E> d0;
        d<E> q;

        AbstractC0289b() {
            ReentrantLock reentrantLock = BlockingQueueC1953b.this.f0;
            reentrantLock.lock();
            try {
                d<E> c = c();
                this.q = c;
                this.c0 = c == null ? null : c.a;
            } finally {
                reentrantLock.unlock();
            }
        }

        private d<E> f(d<E> dVar) {
            while (true) {
                d<E> e = e(dVar);
                if (e == null) {
                    return null;
                }
                if (e.a != null) {
                    return e;
                }
                if (e == dVar) {
                    return c();
                }
                dVar = e;
            }
        }

        void b() {
            ReentrantLock reentrantLock = BlockingQueueC1953b.this.f0;
            reentrantLock.lock();
            try {
                d<E> f = f(this.q);
                this.q = f;
                this.c0 = f == null ? null : f.a;
            } finally {
                reentrantLock.unlock();
            }
        }

        abstract d<E> c();

        abstract d<E> e(d<E> dVar);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.q != null;
        }

        @Override // java.util.Iterator
        public E next() {
            d<E> dVar = this.q;
            if (dVar == null) {
                throw new NoSuchElementException();
            }
            this.d0 = dVar;
            E e = this.c0;
            b();
            return e;
        }

        @Override // java.util.Iterator
        public void remove() {
            d<E> dVar = this.d0;
            if (dVar == null) {
                throw new IllegalStateException();
            }
            this.d0 = null;
            ReentrantLock reentrantLock = BlockingQueueC1953b.this.f0;
            reentrantLock.lock();
            try {
                if (dVar.a != null) {
                    BlockingQueueC1953b.this.s(dVar);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: ax.da.b$c */
    private class c extends BlockingQueueC1953b<E>.AbstractC0289b {
        private c() {
            super();
        }

        @Override // ax.da.BlockingQueueC1953b.AbstractC0289b
        d<E> c() {
            return BlockingQueueC1953b.this.q;
        }

        @Override // ax.da.BlockingQueueC1953b.AbstractC0289b
        d<E> e(d<E> dVar) {
            return dVar.c;
        }
    }

    /* renamed from: ax.da.b$d */
    static final class d<E> {
        E a;
        d<E> b;
        d<E> c;

        d(E e) {
            this.a = e;
        }
    }

    public BlockingQueueC1953b() {
        this(SubsamplingScaleImageView.TILE_SIZE_AUTO);
    }

    private boolean e(d<E> dVar) {
        int i = this.d0;
        if (i >= this.e0) {
            return false;
        }
        d<E> dVar2 = this.q;
        dVar.c = dVar2;
        this.q = dVar;
        if (this.c0 == null) {
            this.c0 = dVar;
        } else {
            dVar2.b = dVar;
        }
        this.d0 = i + 1;
        this.g0.signal();
        return true;
    }

    private boolean g(d<E> dVar) {
        int i = this.d0;
        if (i >= this.e0) {
            return false;
        }
        d<E> dVar2 = this.c0;
        dVar.b = dVar2;
        this.c0 = dVar;
        if (this.q == null) {
            this.q = dVar;
        } else {
            dVar2.c = dVar;
        }
        this.d0 = i + 1;
        this.g0.signal();
        return true;
    }

    private E t() {
        d<E> dVar = this.q;
        if (dVar == null) {
            return null;
        }
        d<E> dVar2 = dVar.c;
        E e = dVar.a;
        dVar.a = null;
        dVar.c = dVar;
        this.q = dVar2;
        if (dVar2 == null) {
            this.c0 = null;
        } else {
            dVar2.b = null;
        }
        this.d0--;
        this.h0.signal();
        return e;
    }

    private E u() {
        d<E> dVar = this.c0;
        if (dVar == null) {
            return null;
        }
        d<E> dVar2 = dVar.b;
        E e = dVar.a;
        dVar.a = null;
        dVar.b = dVar;
        this.c0 = dVar2;
        if (dVar2 == null) {
            this.q = null;
        } else {
            dVar2.c = null;
        }
        this.d0--;
        this.h0.signal();
        return e;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public void addLast(E e) {
        if (!i(e)) {
            throw new IllegalStateException("Deque full");
        }
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        ReentrantLock reentrantLock = this.f0;
        reentrantLock.lock();
        try {
            d<E> dVar = this.q;
            while (dVar != null) {
                dVar.a = null;
                d<E> dVar2 = dVar.c;
                dVar.b = null;
                dVar.c = null;
                dVar = dVar2;
            }
            this.c0 = null;
            this.q = null;
            this.d0 = 0;
            this.h0.signalAll();
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.f0;
        reentrantLock.lock();
        try {
            for (d<E> dVar = this.q; dVar != null; dVar = dVar.c) {
                if (obj.equals(dVar.a)) {
                    reentrantLock.unlock();
                    return true;
                }
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        return drainTo(collection, SubsamplingScaleImageView.TILE_SIZE_AUTO);
    }

    @Override // java.util.AbstractQueue, java.util.Queue
    public E element() {
        return getFirst();
    }

    public E getFirst() {
        E l = l();
        if (l != null) {
            return l;
        }
        throw new NoSuchElementException();
    }

    public boolean h(E e) {
        e.getClass();
        d<E> dVar = new d<>(e);
        ReentrantLock reentrantLock = this.f0;
        reentrantLock.lock();
        try {
            return e(dVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean i(E e) {
        e.getClass();
        d<E> dVar = new d<>(e);
        ReentrantLock reentrantLock = this.f0;
        reentrantLock.lock();
        try {
            return g(dVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new c();
    }

    public boolean k(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        e.getClass();
        d<E> dVar = new d<>(e);
        long nanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.f0;
        reentrantLock.lockInterruptibly();
        while (!g(dVar)) {
            try {
                if (nanos <= 0) {
                    reentrantLock.unlock();
                    return false;
                }
                nanos = this.h0.awaitNanos(nanos);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        reentrantLock.unlock();
        return true;
    }

    public E l() {
        ReentrantLock reentrantLock = this.f0;
        reentrantLock.lock();
        try {
            d<E> dVar = this.q;
            return dVar == null ? null : dVar.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public E n(long j, TimeUnit timeUnit) throws InterruptedException {
        long nanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.f0;
        reentrantLock.lockInterruptibly();
        while (true) {
            try {
                E t = t();
                if (t != null) {
                    return t;
                }
                if (nanos <= 0) {
                    reentrantLock.unlock();
                    return null;
                }
                nanos = this.g0.awaitNanos(nanos);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        return k(e, j, timeUnit);
    }

    public void p(E e) throws InterruptedException {
        e.getClass();
        d<E> dVar = new d<>(e);
        ReentrantLock reentrantLock = this.f0;
        reentrantLock.lock();
        while (!g(dVar)) {
            try {
                this.h0.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // java.util.Queue
    public E peek() {
        return l();
    }

    @Override // java.util.Queue
    public E poll() {
        return pollFirst();
    }

    public E pollFirst() {
        ReentrantLock reentrantLock = this.f0;
        reentrantLock.lock();
        try {
            return t();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e) throws InterruptedException {
        p(e);
    }

    public boolean q(Object obj) {
        if (obj == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.f0;
        reentrantLock.lock();
        try {
            for (d<E> dVar = this.q; dVar != null; dVar = dVar.c) {
                if (obj.equals(dVar.a)) {
                    s(dVar);
                    reentrantLock.unlock();
                    return true;
                }
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public E r() throws InterruptedException {
        ReentrantLock reentrantLock = this.f0;
        reentrantLock.lock();
        while (true) {
            try {
                E t = t();
                if (t != null) {
                    return t;
                }
                this.g0.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        ReentrantLock reentrantLock = this.f0;
        reentrantLock.lock();
        try {
            return this.e0 - this.d0;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean remove(Object obj) {
        return q(obj);
    }

    public E removeFirst() {
        E pollFirst = pollFirst();
        if (pollFirst != null) {
            return pollFirst;
        }
        throw new NoSuchElementException();
    }

    void s(d<E> dVar) {
        d<E> dVar2 = dVar.b;
        d<E> dVar3 = dVar.c;
        if (dVar2 == null) {
            t();
            return;
        }
        if (dVar3 == null) {
            u();
            return;
        }
        dVar2.c = dVar3;
        dVar3.b = dVar2;
        dVar.a = null;
        this.d0--;
        this.h0.signal();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        ReentrantLock reentrantLock = this.f0;
        reentrantLock.lock();
        try {
            return this.d0;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        return r();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        ReentrantLock reentrantLock = this.f0;
        reentrantLock.lock();
        try {
            Object[] objArr = new Object[this.d0];
            d<E> dVar = this.q;
            int i = 0;
            while (dVar != null) {
                int i2 = i + 1;
                objArr[i] = dVar.a;
                dVar = dVar.c;
                i = i2;
            }
            return objArr;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        ReentrantLock reentrantLock = this.f0;
        reentrantLock.lock();
        try {
            d<E> dVar = this.q;
            if (dVar == null) {
                return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            while (true) {
                Object obj = dVar.a;
                if (obj == this) {
                    obj = "(this Collection)";
                }
                sb.append(obj);
                dVar = dVar.c;
                if (dVar == null) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(',');
                sb.append(' ');
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public BlockingQueueC1953b(int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f0 = reentrantLock;
        this.g0 = reentrantLock.newCondition();
        this.h0 = reentrantLock.newCondition();
        if (i <= 0) {
            throw new IllegalArgumentException();
        }
        this.e0 = i;
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i) {
        collection.getClass();
        if (collection == this) {
            throw new IllegalArgumentException();
        }
        ReentrantLock reentrantLock = this.f0;
        reentrantLock.lock();
        try {
            int min = Math.min(i, this.d0);
            for (int i2 = 0; i2 < min; i2++) {
                collection.add(this.q.a);
                t();
            }
            return min;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public E poll(long j, TimeUnit timeUnit) throws InterruptedException {
        return n(j, timeUnit);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        ReentrantLock reentrantLock = this.f0;
        reentrantLock.lock();
        try {
            if (tArr.length < this.d0) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.d0));
            }
            d<E> dVar = this.q;
            int i = 0;
            while (dVar != null) {
                tArr[i] = dVar.a;
                dVar = dVar.c;
                i++;
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            reentrantLock.unlock();
            return tArr;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
