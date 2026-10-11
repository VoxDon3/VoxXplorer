package ax.D7;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
class v implements ax.Y7.d, ax.Y7.c {
    private final Map<Class<?>, ConcurrentHashMap<ax.Y7.b<Object>, Executor>> a = new HashMap();
    private Queue<ax.Y7.a<?>> b = new ArrayDeque();
    private final Executor c;

    v(Executor executor) {
        this.c = executor;
    }

    private synchronized Set<Map.Entry<ax.Y7.b<Object>, Executor>> d(ax.Y7.a<?> aVar) {
        ConcurrentHashMap<ax.Y7.b<Object>, Executor> concurrentHashMap;
        try {
            concurrentHashMap = this.a.get(aVar.b());
        } catch (Throwable th) {
            throw th;
        }
        return concurrentHashMap == null ? Collections.EMPTY_SET : concurrentHashMap.entrySet();
    }

    @Override // ax.Y7.d
    public synchronized <T> void a(Class<T> cls, Executor executor, ax.Y7.b<? super T> bVar) {
        try {
            E.b(cls);
            E.b(bVar);
            E.b(executor);
            if (!this.a.containsKey(cls)) {
                this.a.put(cls, new ConcurrentHashMap<>());
            }
            this.a.get(cls).put(bVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    void c() {
        Queue<ax.Y7.a<?>> queue;
        synchronized (this) {
            try {
                queue = this.b;
                if (queue != null) {
                    this.b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator<ax.Y7.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                e(it.next());
            }
        }
    }

    public void e(final ax.Y7.a<?> aVar) {
        E.b(aVar);
        synchronized (this) {
            try {
                Queue<ax.Y7.a<?>> queue = this.b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (final Map.Entry<ax.Y7.b<Object>, Executor> entry : d(aVar)) {
                    entry.getValue().execute(new Runnable() { // from class: ax.D7.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((ax.Y7.b) entry.getKey()).a(aVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
