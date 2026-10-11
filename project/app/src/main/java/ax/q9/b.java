/*
 * Decompiled with CFR 0.152.
 */
package ax.q9;

import ax.q9.a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class b {
    private ReentrantLock a = new ReentrantLock();
    private Map<String, a> b = new HashMap<String, a>();

    public a a(String object) {
        this.a.lock();
        try {
            object = this.b.get(object);
            return object;
        }
        finally {
            this.a.unlock();
        }
    }

    public void b(a a8) {
        this.a.lock();
        try {
            this.b.put(a8.f(), a8);
            return;
        }
        finally {
            this.a.unlock();
        }
    }

    public void c(String string) {
        this.a.lock();
        try {
            this.b.remove(string);
            return;
        }
        finally {
            this.a.unlock();
        }
    }
}

