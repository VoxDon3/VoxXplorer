package ax.R3;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
final class c {
    private final Map<ax.M3.h, a> a = new HashMap();
    private final b b = new b();

    private static class a {
        final Lock a = new ReentrantLock();
        int b;

        a() {
        }
    }

    private static class b {
        private final Queue<a> a = new ArrayDeque();

        b() {
        }

        a a() {
            a poll;
            synchronized (this.a) {
                poll = this.a.poll();
            }
            return poll == null ? new a() : poll;
        }

        void b(a aVar) {
            synchronized (this.a) {
                try {
                    if (this.a.size() < 10) {
                        this.a.offer(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    c() {
    }

    void a(ax.M3.h hVar) {
        a aVar;
        synchronized (this) {
            try {
                aVar = this.a.get(hVar);
                if (aVar == null) {
                    aVar = this.b.a();
                    this.a.put(hVar, aVar);
                }
                aVar.b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.a.lock();
    }

    void b(ax.M3.h hVar) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) ax.k4.h.d(this.a.get(hVar));
                int i = aVar.b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, key: " + hVar + ", interestedThreads: " + aVar.b);
                }
                int i2 = i - 1;
                aVar.b = i2;
                if (i2 == 0) {
                    a remove = this.a.remove(hVar);
                    if (!remove.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", key: " + hVar);
                    }
                    this.b.b(remove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.a.unlock();
    }
}
