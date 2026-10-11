package ax.f4;

import ax.P3.q;
import ax.k4.g;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class c {
    private final ax.B.a<g, q<?, ?, ?>> a = new ax.B.a<>();
    private final AtomicReference<g> b = new AtomicReference<>();

    private g c(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        g andSet = this.b.getAndSet(null);
        if (andSet == null) {
            andSet = new g();
        }
        andSet.b(cls, cls2, cls3);
        return andSet;
    }

    public boolean a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        boolean containsKey;
        g c = c(cls, cls2, cls3);
        synchronized (this.a) {
            containsKey = this.a.containsKey(c);
        }
        this.b.set(c);
        return containsKey;
    }

    public <Data, TResource, Transcode> q<Data, TResource, Transcode> b(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        q<Data, TResource, Transcode> qVar;
        g c = c(cls, cls2, cls3);
        synchronized (this.a) {
            qVar = (q) this.a.get(c);
        }
        this.b.set(c);
        return qVar;
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, q<?, ?, ?> qVar) {
        synchronized (this.a) {
            this.a.put(new g(cls, cls2, cls3), qVar);
        }
    }
}
