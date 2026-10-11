/*
 * Decompiled with CFR 0.152.
 */
package ax.Y8;

import ax.Xd.d;
import ax.Xd.f;

public class e {
    private static final d a = f.k(e.class);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(AutoCloseable ... autoCloseableArray) {
        int n8 = autoCloseableArray.length;
        int n9 = 0;
        while (n9 < n8) {
            AutoCloseable autoCloseable = autoCloseableArray[n9];
            if (autoCloseable != null) {
                try {
                    ax.Z.f.a(autoCloseable);
                }
                catch (Exception exception) {}
            }
            ++n9;
        }
        return;
    }
}

