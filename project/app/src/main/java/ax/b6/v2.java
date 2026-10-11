/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.x2;
import ax.b6.z2;

public final class v2 {
    private static z2 a;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static z2 a() {
        synchronized (v2.class) {
            try {
                if (a != null) return a;
                z2 z22 = new x2();
                v2.b(z22);
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void b(z2 object) {
        synchronized (v2.class) {
            Throwable throwable2;
            block4: {
                try {
                    if (a != null) break block4;
                    a = object;
                }
                catch (Throwable throwable2) {}
                return;
            }
            object = new IllegalStateException("init() already called");
            throw object;
            throw throwable2;
        }
    }
}

