package ax.R5;

import java.io.Closeable;
import java.io.IOException;

@Deprecated
/* loaded from: classes3.dex */
public final class k {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
