package ax.Vb;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: ax.Vb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0995b<T> extends y {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(AbstractC0995b.class, Object.class, "_consensus");
    private volatile Object _consensus = C0994a.a;

    private final Object c(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = C0994a.a;
        return obj2 != obj3 ? obj2 : ax.D.b.a(atomicReferenceFieldUpdater, this, obj3, obj) ? obj : atomicReferenceFieldUpdater.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.Vb.y
    public final Object a(Object obj) {
        Object obj2 = a.get(this);
        if (obj2 == C0994a.a) {
            obj2 = c(d(obj));
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t, Object obj);

    public abstract Object d(T t);
}
