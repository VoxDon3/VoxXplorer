/*
 * Decompiled with CFR 0.152.
 */
package ax.U0;

import ax.U0.g;
import java.io.IOException;

public final class j {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(g g8) {
        if (g8 == null) return;
        try {
            g8.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }
}

