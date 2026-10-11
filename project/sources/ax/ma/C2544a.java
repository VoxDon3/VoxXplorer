package ax.ma;

import java.io.Closeable;

/* renamed from: ax.ma.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2544a {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
