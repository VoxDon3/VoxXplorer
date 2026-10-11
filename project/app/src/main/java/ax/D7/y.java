/*
 * Decompiled with CFR 0.152.
 */
package ax.D7;

import ax.a8.b;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

class y<T>
implements b<Set<T>> {
    private volatile Set<b<T>> a = Collections.newSetFromMap(new j.ConcurrentHashMap());
    private volatile Set<T> b = null;

    y(Collection<b<T>> collection) {
        this.a.addAll(collection);
    }

    static y<?> b(Collection<b<?>> collection) {
        return new y((Set)collection);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void d() {
        synchronized (this) {
            try {
                Iterator<b<T>> iterator = this.a.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        this.a = null;
                        return;
                    }
                    b<T> b8 = iterator.next();
                    this.b.add(b8.get());
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void a(b<T> b8) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        try {
                            if (this.b != null) break block3;
                            this.a.add(b8);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    this.b.add(b8.get());
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Set<T> c() {
        if (this.b != null) return java.util.DesugarCollections.unmodifiableSet(this.b);
        synchronized (this) {
            try {
                if (this.b != null) return java.util.DesugarCollections.unmodifiableSet(this.b);
                j.ConcurrentHashMap concurrentHashMap = new j.ConcurrentHashMap();
                this.b = Collections.newSetFromMap(concurrentHashMap);
                this.d();
                return java.util.DesugarCollections.unmodifiableSet(this.b);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

