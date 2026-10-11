/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.Vb.a;
import ax.Vb.y;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class b<T>
extends y {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = ax.Vb.a.a;

    private final Object c(Object object) {
        Object object2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object v8 = atomicReferenceFieldUpdater.get(this);
        if (v8 != (object2 = ax.Vb.a.a)) {
            return v8;
        }
        if (ax.D.b.a(atomicReferenceFieldUpdater, this, object2, object)) {
            return object;
        }
        return atomicReferenceFieldUpdater.get(this);
    }

    @Override
    public final Object a(Object object) {
        Object v8;
        Object object2 = v8 = a.get(this);
        if (v8 == ax.Vb.a.a) {
            object2 = this.c(this.d(object));
        }
        this.b(object, object2);
        return object2;
    }

    public abstract void b(T var1, Object var2);

    public abstract Object d(T var1);
}

