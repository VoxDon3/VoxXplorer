/*
 * Decompiled with CFR 0.152.
 */
package ax.R5;

import java.io.Closeable;
import java.io.IOException;

@Deprecated
public final class k {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }
}

