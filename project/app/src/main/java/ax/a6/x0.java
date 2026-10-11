/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import ax.a6.B0;

public final class x0
implements B0 {
    private static final Object c = new Object();
    private volatile B0 a;
    private volatile Object b = c;

    private x0(B0 b02) {
        this.a = b02;
    }

    public static B0 b(B0 b02) {
        if (b02 instanceof x0) {
            return b02;
        }
        return new x0(b02);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Object c() {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                Object object;
                block6: {
                    block7: {
                        Object object2;
                        Object object3;
                        try {
                            object = this.b;
                            object3 = c;
                            if (object != object3) break block6;
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                        {
                            object = this.a.a();
                            object2 = this.b;
                            if (object2 == object3 || object2 == object) break block7;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Scoped provider was invoked recursively returning different results: ");
                        stringBuilder.append(object2);
                        stringBuilder.append(" & ");
                        stringBuilder.append(object);
                        stringBuilder.append(". This is likely due to a circular dependency.");
                        object3 = new IllegalStateException(stringBuilder.toString());
                        throw object3;
                    }
                    this.b = object;
                    this.a = null;
                    return object;
                }
                return object;
            }
            throw throwable2;
        }
    }

    @Override
    public final Object a() {
        Object object;
        Object object2 = object = this.b;
        if (object == c) {
            object2 = this.c();
        }
        return object2;
    }
}

