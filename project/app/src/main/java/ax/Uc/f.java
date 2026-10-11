/*
 * Decompiled with CFR 0.152.
 */
package ax.Uc;

import java.io.IOException;
import java.net.Socket;

public final class f {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Socket socket) {
        if (socket == null) return;
        try {
            socket.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }
}

