/*
 * Decompiled with CFR 0.152.
 */
package ax.l9;

import ax.r9.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class m {
    private ReentrantLock a = new ReentrantLock();
    private Map<Long, b> b = new HashMap<Long, b>();

    public Collection<b> a() {
        this.a.lock();
        try {
            ArrayList<b> arrayList = new ArrayList<b>(this.b.values());
            return arrayList;
        }
        finally {
            this.a.unlock();
        }
    }

    public b b(Long object) {
        this.a.lock();
        try {
            object = this.b.get(object);
            return object;
        }
        finally {
            this.a.unlock();
        }
    }

    void c(Long l8, b b8) {
        this.a.lock();
        try {
            this.b.put(l8, b8);
            return;
        }
        finally {
            this.a.unlock();
        }
    }

    public b d(Long object) {
        this.a.lock();
        try {
            object = this.b.remove(object);
            return object;
        }
        finally {
            this.a.unlock();
        }
    }
}

