/*
 * Decompiled with CFR 0.152.
 */
package ax.k4;

import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class e<T, Y> {
    private final LinkedHashMap<T, Y> a = new LinkedHashMap(100, 0.75f, true);
    private final int b;
    private int c;
    private int d = 0;

    public e(int n8) {
        this.b = n8;
        this.c = n8;
    }

    private void f() {
        this.m(this.c);
    }

    public void b() {
        this.m(0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Y g(T object) {
        synchronized (this) {
            object = this.a.get(object);
            return (Y)object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int h() {
        synchronized (this) {
            return this.d;
        }
    }

    protected int i(Y y8) {
        return 1;
    }

    protected void j(T t8, Y y8) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Y k(T object, Y y8) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                try {
                    if (this.i(y8) >= this.c) {
                        this.j(object, y8);
                        return null;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                object = ((AbstractMap)this.a).put(object, y8);
                if (y8 != null) {
                    this.d += this.i(y8);
                }
                if (object != null) {
                    this.d -= this.i(object);
                }
                this.f();
                return (Y)object;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Y l(T object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        object = ((AbstractMap)this.a).remove(object);
                        if (object == null) break block4;
                        this.d -= this.i(object);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return (Y)object;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void m(int n8) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    while (this.d > n8) {
                        Map.Entry<Object, Object> entry = this.a.entrySet().iterator().next();
                        Y y8 = entry.getValue();
                        this.d -= this.i(y8);
                        entry = entry.getKey();
                        ((AbstractMap)this.a).remove(entry);
                        this.j(entry, y8);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }
}

