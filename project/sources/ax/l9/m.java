package ax.l9;

import ax.r9.C3016b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public class m {
    private ReentrantLock a = new ReentrantLock();
    private Map<Long, C3016b> b = new HashMap();

    public Collection<C3016b> a() {
        this.a.lock();
        try {
            return new ArrayList(this.b.values());
        } finally {
            this.a.unlock();
        }
    }

    public C3016b b(Long l) {
        this.a.lock();
        try {
            return this.b.get(l);
        } finally {
            this.a.unlock();
        }
    }

    void c(Long l, C3016b c3016b) {
        this.a.lock();
        try {
            this.b.put(l, c3016b);
        } finally {
            this.a.unlock();
        }
    }

    public C3016b d(Long l) {
        this.a.lock();
        try {
            return this.b.remove(l);
        } finally {
            this.a.unlock();
        }
    }
}
