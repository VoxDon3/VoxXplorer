package ax.Db;

import ax.sb.C3069a;
import java.io.Closeable;

/* loaded from: classes3.dex */
public final class a {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C3069a.a(th, th2);
            }
        }
    }
}
