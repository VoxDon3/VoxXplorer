package ax.f4;

import ax.k4.g;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class d {
    private final AtomicReference<g> a = new AtomicReference<>();
    private final ax.B.a<g, List<Class<?>>> b = new ax.B.a<>();

    public List<Class<?>> a(Class<?> cls, Class<?> cls2) {
        List<Class<?>> list;
        g andSet = this.a.getAndSet(null);
        if (andSet == null) {
            andSet = new g(cls, cls2);
        } else {
            andSet.a(cls, cls2);
        }
        synchronized (this.b) {
            list = this.b.get(andSet);
        }
        this.a.set(andSet);
        return list;
    }

    public void b(Class<?> cls, Class<?> cls2, List<Class<?>> list) {
        synchronized (this.b) {
            this.b.put(new g(cls, cls2), list);
        }
    }
}
