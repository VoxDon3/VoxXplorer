/*
 * Decompiled with CFR 0.152.
 */
package ax.D7;

import ax.a8.b;

public class x<T>
implements b<T> {
    private static final Object c = new Object();
    private volatile Object a = c;
    private volatile b<T> b;

    public x(b<T> b8) {
        this.b = b8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public T get() {
        Object object = this.a;
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
                        object = object3 = this.a;
                        if (object3 != object2) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    this.a = object = this.b.get();
                    this.b = null;
                }
                return (T)object;
            }
            throw throwable2;
        }
    }
}

