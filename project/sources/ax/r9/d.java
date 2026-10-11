package ax.r9;

import ax.s9.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes3.dex */
class d {
    private ReentrantReadWriteLock a = new ReentrantReadWriteLock();
    private Map<Long, m> b = new HashMap();
    private Map<String, m> c = new HashMap();

    d() {
    }

    void a(long j) {
        this.a.writeLock().lock();
        try {
            m remove = this.b.remove(Long.valueOf(j));
            if (remove != null) {
                this.c.remove(remove.g().e());
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    Collection<m> b() {
        this.a.readLock().lock();
        try {
            return new ArrayList(this.b.values());
        } finally {
            this.a.readLock().unlock();
        }
    }

    m c(String str) {
        this.a.readLock().lock();
        try {
            return this.c.get(str);
        } finally {
            this.a.readLock().unlock();
        }
    }

    void d(m mVar) {
        this.a.writeLock().lock();
        try {
            this.b.put(Long.valueOf(mVar.g().f()), mVar);
            this.c.put(mVar.g().e(), mVar);
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
