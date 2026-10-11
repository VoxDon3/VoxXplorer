package ax.D7;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
class y<T> implements ax.a8.b<Set<T>> {
    private volatile Set<T> b = null;
    private volatile Set<ax.a8.b<T>> a = Collections.newSetFromMap(new ConcurrentHashMap());

    y(Collection<ax.a8.b<T>> collection) {
        this.a.addAll(collection);
    }

    static y<?> b(Collection<ax.a8.b<?>> collection) {
        return new y<>((Set) collection);
    }

    private synchronized void d() {
        try {
            Iterator<ax.a8.b<T>> it = this.a.iterator();
            while (it.hasNext()) {
                this.b.add(it.next().get());
            }
            this.a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void a(ax.a8.b<T> bVar) {
        try {
            if (this.b == null) {
                this.a.add(bVar);
            } else {
                this.b.add(bVar.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // ax.a8.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.b);
    }
}
