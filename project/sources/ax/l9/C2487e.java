package ax.l9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: ax.l9.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2487e {
    private ReentrantReadWriteLock a = new ReentrantReadWriteLock();
    private Map<Long, h> b = new HashMap();
    private Map<UUID, h> c = new HashMap();

    public h a(Long l) {
        this.a.readLock().lock();
        try {
            return this.b.get(l);
        } finally {
            this.a.readLock().unlock();
        }
    }

    void b(Throwable th) {
        this.a.writeLock().lock();
        try {
            Iterator it = new HashSet(this.b.keySet()).iterator();
            while (it.hasNext()) {
                h remove = this.b.remove((Long) it.next());
                this.c.remove(remove.b());
                remove.f().b(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public boolean c(Long l) {
        this.a.readLock().lock();
        try {
            return this.b.containsKey(l);
        } finally {
            this.a.readLock().unlock();
        }
    }

    public h d(Long l) {
        this.a.writeLock().lock();
        try {
            h remove = this.b.remove(l);
            if (remove != null) {
                this.c.remove(remove.b());
                return remove;
            }
            throw new ax.k9.d("Unable to find outstanding request for messageId " + l);
        } finally {
            this.a.writeLock().unlock();
        }
    }

    void e(h hVar) {
        this.a.writeLock().lock();
        try {
            this.b.put(Long.valueOf(hVar.d()), hVar);
            this.c.put(hVar.b(), hVar);
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
