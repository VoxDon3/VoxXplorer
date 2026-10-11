package ax.b5;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;

/* loaded from: classes.dex */
class m {
    private final Object a = new Object();
    private final Map<SoftReference<C1500a>, Boolean> b = new ConcurrentHashMap();
    private final ReferenceQueue<C1500a> c = new ReferenceQueue<>();

    private static final class a {
        static final m a = new m();
    }

    m() {
    }

    public static m a() {
        return a.a;
    }

    private void b() {
        while (true) {
            SoftReference softReference = (SoftReference) this.c.poll();
            if (softReference == null) {
                return;
            } else {
                this.b.remove(softReference);
            }
        }
    }

    public SoftReference<C1500a> c(C1500a c1500a) {
        SoftReference<C1500a> softReference = new SoftReference<>(c1500a, this.c);
        this.b.put(softReference, Boolean.TRUE);
        b();
        return softReference;
    }
}
