package ax.q9;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ax.q9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2890b {
    private ReentrantLock a = new ReentrantLock();
    private Map<String, C2889a> b = new HashMap();

    public C2889a a(String str) {
        this.a.lock();
        try {
            return this.b.get(str);
        } finally {
            this.a.unlock();
        }
    }

    public void b(C2889a c2889a) {
        this.a.lock();
        try {
            this.b.put(c2889a.f(), c2889a);
        } finally {
            this.a.unlock();
        }
    }

    public void c(String str) {
        this.a.lock();
        try {
            this.b.remove(str);
        } finally {
            this.a.unlock();
        }
    }
}
