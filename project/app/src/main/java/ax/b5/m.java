/*
 * Decompiled with CFR 0.152.
 */
package ax.b5;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;

class m {
    private final Object a = new Object();
    private final Map<SoftReference<ax.b5.a>, Boolean> b = new j.ConcurrentHashMap();
    private final ReferenceQueue<ax.b5.a> c = new ReferenceQueue();

    m() {
    }

    public static m a() {
        return ax.b5.m$a.a;
    }

    private void b() {
        SoftReference softReference;
        while ((softReference = (SoftReference)this.c.poll()) != null) {
            this.b.remove(softReference);
        }
    }

    public SoftReference<ax.b5.a> c(ax.b5.a object) {
        object = new SoftReference<ax.b5.a>((ax.b5.a)object, this.c);
        this.b.put((SoftReference<ax.b5.a>)object, Boolean.TRUE);
        this.b();
        return object;
    }

    private static final class a {
        static final m a = new m();
    }
}

