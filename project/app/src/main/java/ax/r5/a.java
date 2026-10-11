/*
 * Decompiled with CFR 0.152.
 */
package ax.r5;

import ax.r5.d;

public final class a<T>
implements ax.ib.a<T> {
    private static final Object c = new Object();
    private volatile ax.ib.a<T> a;
    private volatile Object b = c;

    private a(ax.ib.a<T> a8) {
        this.a = a8;
    }

    public static <P extends ax.ib.a<T>, T> ax.ib.a<T> a(P p8) {
        d.b(p8);
        if (p8 instanceof a) {
            return p8;
        }
        return new a<T>(p8);
    }

    private static Object b(Object object, Object object2) {
        if (object != c) {
            if (object == object2) {
                return object2;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Scoped provider was invoked recursively returning different results: ");
            stringBuilder.append(object);
            stringBuilder.append(" & ");
            stringBuilder.append(object2);
            stringBuilder.append(". This is likely due to a circular dependency.");
            throw new IllegalStateException(stringBuilder.toString());
        }
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public T get() {
        Object object = this.b;
        Object object2 = c;
        if (object != object2) {
            return (T)object;
        }
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        Object object3;
                        object = object3 = this.b;
                        if (object3 != object2) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    object = this.a.get();
                    this.b = ax.r5.a.b(this.b, object);
                    this.a = null;
                }
                return (T)object;
            }
            throw throwable2;
        }
    }
}

