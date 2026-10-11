/*
 * Decompiled with CFR 0.152.
 */
package ax.r9;

import ax.s9.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class d {
    private ReentrantReadWriteLock a = new ReentrantReadWriteLock();
    private Map<Long, m> b = new HashMap<Long, m>();
    private Map<String, m> c = new HashMap<String, m>();

    d() {
    }

    void a(long l8) {
        Throwable throwable2;
        block4: {
            block3: {
                m m8;
                this.a.writeLock().lock();
                try {
                    m8 = this.b.remove(l8);
                    if (m8 == null) break block3;
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                this.c.remove(m8.g().e());
            }
            this.a.writeLock().unlock();
            return;
        }
        this.a.writeLock().unlock();
        throw throwable2;
    }

    Collection<m> b() {
        this.a.readLock().lock();
        try {
            ArrayList<m> arrayList = new ArrayList<m>(this.b.values());
            return arrayList;
        }
        finally {
            this.a.readLock().unlock();
        }
    }

    m c(String object) {
        this.a.readLock().lock();
        try {
            object = this.c.get(object);
            return object;
        }
        finally {
            this.a.readLock().unlock();
        }
    }

    void d(m m8) {
        this.a.writeLock().lock();
        try {
            this.b.put(m8.g().f(), m8);
            this.c.put(m8.g().e(), m8);
            return;
        }
        finally {
            this.a.writeLock().unlock();
        }
    }
}

