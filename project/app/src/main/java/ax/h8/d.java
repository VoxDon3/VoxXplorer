/*
 * Decompiled with CFR 0.152.
 */
package ax.h8;

import ax.h8.f;
import java.util.HashSet;
import java.util.Set;

public class d {
    private static volatile d b;
    private final Set<f> a = new HashSet<f>();

    d() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static d a() {
        d d8 = b;
        if (d8 != null) {
            return d8;
        }
        synchronized (d.class) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        d d9;
                        d8 = d9 = b;
                        if (d9 != null) break block4;
                        b = d8 = new d();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return d8;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    Set<f> b() {
        Set<f> set = this.a;
        synchronized (set) {
            return java.util.DesugarCollections.unmodifiableSet(this.a);
        }
    }
}

