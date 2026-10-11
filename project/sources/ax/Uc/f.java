package ax.Uc;

import java.io.IOException;
import java.net.Socket;

/* loaded from: classes3.dex */
public final class f {
    public static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
    }
}
