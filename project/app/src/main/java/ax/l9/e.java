/*
 * Decompiled with CFR 0.152.
 */
package ax.l9;

import ax.k9.d;
import ax.l9.h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class e {
    private ReentrantReadWriteLock a = new ReentrantReadWriteLock();
    private Map<Long, h> b = new HashMap<Long, h>();
    private Map<UUID, h> c = new HashMap<UUID, h>();

    public h a(Long object) {
        this.a.readLock().lock();
        try {
            object = this.b.get(object);
            return object;
        }
        finally {
            this.a.readLock().unlock();
        }
    }

    void b(Throwable throwable) {
        Throwable throwable22;
        block3: {
            this.a.writeLock().lock();
            try {
                Object object = new HashSet(this.b.keySet());
                object = ((HashSet)object).iterator();
                while (object.hasNext()) {
                    Object object2 = (Long)object.next();
                    object2 = this.b.remove(object2);
                    this.c.remove(((h)object2).b());
                    ((h)object2).f().b(throwable);
                }
            }
            catch (Throwable throwable22) {
                break block3;
            }
            this.a.writeLock().unlock();
            return;
        }
        this.a.writeLock().unlock();
        throw throwable22;
    }

    public boolean c(Long l8) {
        this.a.readLock().lock();
        try {
            boolean bl = this.b.containsKey(l8);
            return bl;
        }
        finally {
            this.a.readLock().unlock();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public h d(Long l8) {
        Throwable throwable2;
        block4: {
            Object object;
            this.a.writeLock().lock();
            try {
                object = this.b.remove(l8);
                if (object != null) {
                    this.c.remove(((h)object).b());
                    this.a.writeLock().unlock();
                    return object;
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to find outstanding request for messageId ");
                stringBuilder.append(l8);
                object = new d(stringBuilder.toString());
                throw object;
            }
        }
        this.a.writeLock().unlock();
        throw throwable2;
    }

    void e(h h8) {
        this.a.writeLock().lock();
        try {
            this.b.put(h8.d(), h8);
            this.c.put(h8.b(), h8);
            return;
        }
        finally {
            this.a.writeLock().unlock();
        }
    }
}

