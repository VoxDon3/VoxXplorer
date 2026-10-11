/*
 * Decompiled with CFR 0.152.
 */
package ax.da;

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

public class b<E>
extends AbstractQueue<E>
implements BlockingQueue,
Queue,
Serializable {
    transient d<E> c0;
    private transient int d0;
    private final int e0;
    final ReentrantLock f0;
    private final Condition g0;
    private final Condition h0;
    transient d<E> q;

    public b() {
        this(Integer.MAX_VALUE);
    }

    public b(int n8) {
        ReentrantLock reentrantLock;
        this.f0 = reentrantLock = new ReentrantLock();
        this.g0 = reentrantLock.newCondition();
        this.h0 = reentrantLock.newCondition();
        if (n8 > 0) {
            this.e0 = n8;
            return;
        }
        throw new IllegalArgumentException();
    }

    private boolean e(d<E> d8) {
        int n8 = this.d0;
        if (n8 >= this.e0) {
            return false;
        }
        d<E> d9 = this.q;
        d8.c = d9;
        this.q = d8;
        if (this.c0 == null) {
            this.c0 = d8;
        } else {
            d9.b = d8;
        }
        this.d0 = n8 + 1;
        this.g0.signal();
        return true;
    }

    private boolean g(d<E> d8) {
        int n8 = this.d0;
        if (n8 >= this.e0) {
            return false;
        }
        d<E> d9 = this.c0;
        d8.b = d9;
        this.c0 = d8;
        if (this.q == null) {
            this.q = d8;
        } else {
            d9.c = d8;
        }
        this.d0 = n8 + 1;
        this.g0.signal();
        return true;
    }

    private E t() {
        d<E> d8 = this.q;
        if (d8 == null) {
            return null;
        }
        d d9 = d8.c;
        Object e8 = d8.a;
        d8.a = null;
        d8.c = d8;
        this.q = d9;
        if (d9 == null) {
            this.c0 = null;
        } else {
            d9.b = null;
        }
        --this.d0;
        this.h0.signal();
        return e8;
    }

    private E u() {
        d<E> d8 = this.c0;
        if (d8 == null) {
            return null;
        }
        d d9 = d8.b;
        Object e8 = d8.a;
        d8.a = null;
        d8.b = d8;
        this.c0 = d9;
        if (d9 == null) {
            this.q = null;
        } else {
            d9.c = null;
        }
        --this.d0;
        this.h0.signal();
        return e8;
    }

    @Override
    public boolean add(E e8) {
        this.addLast(e8);
        return true;
    }

    public void addLast(E e8) {
        if (this.i(e8)) {
            return;
        }
        throw new IllegalStateException("Deque full");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void clear() {
        ReentrantLock reentrantLock = this.f0;
        reentrantLock.lock();
        try {
            d<E> d8 = this.q;
            while (true) {
                if (d8 == null) {
                    this.c0 = null;
                    this.q = null;
                    this.d0 = 0;
                    this.h0.signalAll();
                    reentrantLock.unlock();
                    return;
                }
                d8.a = null;
                d d9 = d8.c;
                d8.b = null;
                d8.c = null;
                d8 = d9;
            }
        }
        catch (Throwable throwable) {}
        reentrantLock.unlock();
        throw throwable;
    }

    @Override
    public boolean contains(Object object) {
        Throwable throwable2;
        ReentrantLock reentrantLock;
        block7: {
            if (object == null) {
                return false;
            }
            reentrantLock = this.f0;
            reentrantLock.lock();
            d<E> d8 = this.q;
            while (d8 != null) {
                block6: {
                    try {
                        boolean bl = object.equals(d8.a);
                        if (!bl) break block6;
                        reentrantLock.unlock();
                        return true;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                d8 = d8.c;
            }
            reentrantLock.unlock();
            return false;
        }
        reentrantLock.unlock();
        throw throwable2;
    }

    @Override
    public int drainTo(Collection<? super E> collection) {
        return this.drainTo(collection, Integer.MAX_VALUE);
    }

    @Override
    public int drainTo(Collection<? super E> collection, int n8) {
        collection.getClass();
        if (collection != this) {
            Throwable throwable2;
            ReentrantLock reentrantLock;
            block5: {
                reentrantLock = this.f0;
                reentrantLock.lock();
                int n9 = Math.min(n8, this.d0);
                for (n8 = 0; n8 < n9; ++n8) {
                    try {
                        collection.add(this.q.a);
                        this.t();
                        continue;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                reentrantLock.unlock();
                return n9;
            }
            reentrantLock.unlock();
            throw throwable2;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public E element() {
        return this.getFirst();
    }

    public E getFirst() {
        E e8 = this.l();
        if (e8 != null) {
            return e8;
        }
        throw new NoSuchElementException();
    }

    public boolean h(E object) {
        object.getClass();
        d<E> d8 = new d<E>(object);
        object = this.f0;
        ((ReentrantLock)object).lock();
        try {
            boolean bl = this.e(d8);
            return bl;
        }
        finally {
            ((ReentrantLock)object).unlock();
        }
    }

    public boolean i(E object) {
        object.getClass();
        d<E> d8 = new d<E>(object);
        object = this.f0;
        ((ReentrantLock)object).lock();
        try {
            boolean bl = this.g(d8);
            return bl;
        }
        finally {
            ((ReentrantLock)object).unlock();
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new c(this);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean k(E object, long l8, TimeUnit object2) throws InterruptedException {
        Throwable throwable2;
        ReentrantLock reentrantLock;
        block5: {
            long l9;
            object.getClass();
            d<Object> d8 = new d<Object>(object);
            l9 = ((TimeUnit)((Object)reentrantLock)).toNanos(l9);
            reentrantLock = this.f0;
            reentrantLock.lockInterruptibly();
            while (true) {
                try {
                    boolean bl = this.g(d8);
                    if (bl) break;
                    if (l9 <= 0L) {
                        reentrantLock.unlock();
                        return false;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                {
                    l9 = this.h0.awaitNanos(l9);
                    continue;
                }
                break;
            }
            reentrantLock.unlock();
            return true;
        }
        reentrantLock.unlock();
        throw throwable2;
    }

    public E l() {
        d<E> d8;
        ReentrantLock reentrantLock;
        block4: {
            reentrantLock = this.f0;
            reentrantLock.lock();
            d8 = this.q;
            if (d8 != null) break block4;
            d8 = null;
        }
        d8 = d8.a;
        return (E)d8;
        finally {
            reentrantLock.unlock();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public E n(long l8, TimeUnit object) throws InterruptedException {
        Throwable throwable2222;
        block5: {
            E e8;
            l8 = ((TimeUnit)((Object)object)).toNanos(l8);
            object = this.f0;
            ((ReentrantLock)object).lockInterruptibly();
            while (true) {
                try {
                    e8 = this.t();
                    if (e8 != null) break;
                    if (l8 <= 0L) {
                        ((ReentrantLock)object).unlock();
                        return null;
                    }
                }
                catch (Throwable throwable2222) {
                    break block5;
                }
                {
                    l8 = this.g0.awaitNanos(l8);
                    continue;
                }
                break;
            }
            ((ReentrantLock)object).unlock();
            return e8;
        }
        ((ReentrantLock)object).unlock();
        throw throwable2222;
    }

    @Override
    public boolean offer(E e8, long l8, TimeUnit timeUnit) throws InterruptedException {
        return this.k(e8, l8, timeUnit);
    }

    public void p(E object) throws InterruptedException {
        Throwable throwable2;
        block3: {
            object.getClass();
            d<E> d8 = new d<E>(object);
            object = this.f0;
            ((ReentrantLock)object).lock();
            try {
                while (!this.g(d8)) {
                    this.h0.await();
                }
            }
            catch (Throwable throwable2) {
                break block3;
            }
            ((ReentrantLock)object).unlock();
            return;
        }
        ((ReentrantLock)object).unlock();
        throw throwable2;
    }

    @Override
    public E peek() {
        return this.l();
    }

    @Override
    public E poll() {
        return this.pollFirst();
    }

    @Override
    public E poll(long l8, TimeUnit timeUnit) throws InterruptedException {
        return this.n(l8, timeUnit);
    }

    public E pollFirst() {
        ReentrantLock reentrantLock = this.f0;
        reentrantLock.lock();
        try {
            E e8 = this.t();
            return e8;
        }
        finally {
            reentrantLock.unlock();
        }
    }

    @Override
    public void put(E e8) throws InterruptedException {
        this.p(e8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean q(Object object) {
        Throwable throwable2;
        ReentrantLock reentrantLock;
        block6: {
            if (object == null) {
                return false;
            }
            reentrantLock = this.f0;
            reentrantLock.lock();
            try {
                d<E> d8 = this.q;
                while (d8 != null) {
                    if (object.equals(d8.a)) {
                        this.s(d8);
                        reentrantLock.unlock();
                        return true;
                    }
                    d8 = d8.c;
                }
            }
            catch (Throwable throwable2) {
                break block6;
            }
            reentrantLock.unlock();
            return false;
        }
        reentrantLock.unlock();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public E r() throws InterruptedException {
        Throwable throwable2222;
        ReentrantLock reentrantLock;
        block3: {
            E e8;
            reentrantLock = this.f0;
            reentrantLock.lock();
            try {
                while ((e8 = this.t()) == null) {
                    this.g0.await();
                }
            }
            catch (Throwable throwable2222) {
                break block3;
            }
            reentrantLock.unlock();
            return e8;
        }
        reentrantLock.unlock();
        throw throwable2222;
    }

    @Override
    public int remainingCapacity() {
        ReentrantLock reentrantLock = this.f0;
        reentrantLock.lock();
        try {
            int n8 = this.e0;
            int n9 = this.d0;
            return n8 - n9;
        }
        finally {
            reentrantLock.unlock();
        }
    }

    @Override
    public boolean remove(Object object) {
        return this.q(object);
    }

    public E removeFirst() {
        E e8 = this.pollFirst();
        if (e8 != null) {
            return e8;
        }
        throw new NoSuchElementException();
    }

    void s(d<E> d8) {
        d d9 = d8.b;
        d d10 = d8.c;
        if (d9 == null) {
            this.t();
            return;
        }
        if (d10 == null) {
            this.u();
            return;
        }
        d9.c = d10;
        d10.b = d9;
        d8.a = null;
        --this.d0;
        this.h0.signal();
    }

    @Override
    public int size() {
        ReentrantLock reentrantLock = this.f0;
        reentrantLock.lock();
        try {
            int n8 = this.d0;
            return n8;
        }
        finally {
            reentrantLock.unlock();
        }
    }

    @Override
    public E take() throws InterruptedException {
        return this.r();
    }

    @Override
    public Object[] toArray() {
        Throwable throwable2;
        ReentrantLock reentrantLock = this.f0;
        reentrantLock.lock();
        Object[] objectArray = new Object[this.d0];
        d<E> d8 = this.q;
        int n8 = 0;
        while (d8 != null) {
            try {
                objectArray[n8] = d8.a;
                d8 = d8.c;
                ++n8;
            }
            catch (Throwable throwable2) {
            }
        }
        reentrantLock.unlock();
        return objectArray;
        reentrantLock.unlock();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public <T> T[] toArray(T[] object) {
        Throwable throwable2;
        ReentrantLock reentrantLock;
        block6: {
            Object[] objectArray;
            block5: {
                reentrantLock = this.f0;
                reentrantLock.lock();
                objectArray = object;
                try {
                    if (((T[])object).length >= this.d0) break block5;
                    objectArray = (Object[])Array.newInstance(object.getClass().getComponentType(), this.d0);
                }
                catch (Throwable throwable2) {
                    break block6;
                }
            }
            object = this.q;
            int n8 = 0;
            while (object != null) {
                objectArray[n8] = object.a;
                object = object.c;
                ++n8;
            }
            if (objectArray.length > n8) {
                objectArray[n8] = null;
            }
            reentrantLock.unlock();
            return objectArray;
        }
        reentrantLock.unlock();
        throw throwable2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public String toString() {
        block7: {
            var4_1 = this.f0;
            var4_1.lock();
            try {
                var1_2 = this.q;
                if (var1_2 == null) {
                    var4_1.unlock();
                    return "[]";
                }
                var5_4 = new StringBuilder();
                var5_4.append('[');
                break block7;
            }
            catch (Throwable var1_3) {}
            var4_1.unlock();
            throw var1_3;
        }
        while (true) {
            var2_5 /* !! */  = var3_6 = var1_2.a;
            if (var3_6 != this) ** GOTO lbl-1000
            var2_5 /* !! */  = "(this Collection)";
lbl-1000:
            // 2 sources

            {
                var5_4.append(var2_5 /* !! */ );
                var1_2 = var1_2.c;
                if (var1_2 != null) ** GOTO lbl-1000
                var5_4.append(']');
                var1_2 = var5_4.toString();
                var4_1.unlock();
                return var1_2;
            }
lbl-1000:
            // 1 sources

            {
                var5_4.append(',');
                var5_4.append(' ');
                continue;
            }
            break;
        }
    }

    private abstract class b
    implements Iterator<E> {
        E c0;
        private d<E> d0;
        final b e0;
        d<E> q;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        b(b d8) {
            this.e0 = d8;
            ReentrantLock reentrantLock = ((b)((Object)d8)).f0;
            reentrantLock.lock();
            try {
                d8 = this.c();
                this.q = d8;
                d8 = d8 == null ? null : d8.a;
                this.c0 = d8;
                return;
            }
            finally {
                reentrantLock.unlock();
            }
        }

        private d<E> f(d<E> d8) {
            d d9;
            while ((d9 = this.e(d8)) != null) {
                if (d9.a != null) {
                    return d9;
                }
                if (d9 == d8) {
                    return this.c();
                }
                d8 = d9;
            }
            return null;
        }

        /*
         * WARNING - void declaration
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        void b() {
            ReentrantLock reentrantLock = this.e0.f0;
            reentrantLock.lock();
            try {
                Object var1_5;
                d d8 = this.f(this.q);
                this.q = d8;
                if (d8 == null) {
                    Object var1_3 = null;
                } else {
                    Object e8 = d8.a;
                }
                this.c0 = var1_5;
                return;
            }
            finally {
                reentrantLock.unlock();
            }
        }

        abstract d<E> c();

        abstract d<E> e(d<E> var1);

        @Override
        public boolean hasNext() {
            return this.q != null;
        }

        @Override
        public E next() {
            d d8 = this.q;
            if (d8 != null) {
                this.d0 = d8;
                d8 = this.c0;
                this.b();
                return d8;
            }
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            d d8 = this.d0;
            if (d8 != null) {
                Throwable throwable2;
                ReentrantLock reentrantLock;
                block4: {
                    block3: {
                        this.d0 = null;
                        reentrantLock = this.e0.f0;
                        reentrantLock.lock();
                        try {
                            if (d8.a == null) break block3;
                            this.e0.s(d8);
                        }
                        catch (Throwable throwable2) {
                            break block4;
                        }
                    }
                    reentrantLock.unlock();
                    return;
                }
                reentrantLock.unlock();
                throw throwable2;
            }
            throw new IllegalStateException();
        }
    }

    private class c
    extends b {
        final b f0;

        private c(b b8) {
            this.f0 = b8;
            super(b8);
        }

        @Override
        d<E> c() {
            return this.f0.q;
        }

        @Override
        d<E> e(d<E> d8) {
            return d8.c;
        }
    }

    static final class d<E> {
        E a;
        d<E> b;
        d<E> c;

        d(E e8) {
            this.a = e8;
        }
    }
}

